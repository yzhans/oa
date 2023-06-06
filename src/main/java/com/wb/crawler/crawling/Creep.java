package com.wb.crawler.crawling;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.wb.crawler.config.wbUserConfig;
import com.wb.crawler.pojo.wbData;
import com.wb.crawler.pojo.wbUser;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import static com.wb.crawler.crawling.Creep.downloadUsingStream;

/**
 * @author yzhans
 * @version 1.0
 * @description TODO
 * @date 2023/4/17 3:15
 */
public class Creep {

    List<String> list = new ArrayList<>();

    //图片数量不够只有第一页Since_id也是为0，设值为0 判断 第二次递增
    String initialValue = "0";

    public List<String> getPictureLinkCollection() throws Exception {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        URL url = new URL(wbUserConfig.getUrl());
        URI uri = new URI(url.getProtocol(), url.getHost(), url.getPath(), url.getQuery(), null);
        HttpGet httpGet = new HttpGet(uri);
        httpGet.setHeader("cookie", wbUserConfig.getCookie());
        httpGet.setHeader("User-Agent", wbUserConfig.getUserAgent());
        httpGet.setHeader("has_album", wbUserConfig.isHas_album() ? "true" : "false");
        CloseableHttpResponse response = httpClient.execute(httpGet);
        HttpEntity entity = response.getEntity();
        String htmlString = EntityUtils.toString(entity, StandardCharsets.UTF_8);
        //转对象
        ObjectMapper objectMapper = new ObjectMapper();
        wbData wbData = objectMapper.readValue(htmlString, wbData.class);

        //打印图片json
        //System.out.println(htmlString);

        if (!"0".equals(wbData.getData().getSince_id()) && !wbData.getData().getList().isEmpty() && !wbData.isBottom_tips_visible()) {
            List<com.wb.crawler.pojo.wbData.DataBean.ListBean> beanList = wbData.getData().getList();
            for (com.wb.crawler.pojo.wbData.DataBean.ListBean listBean : beanList) {
                list.add(listBean.getPid());
            }
            wbUserConfig.setSinceid(wbData.getData().getSince_id());
            Thread.sleep(200);
            System.out.print("~~ ");
            this.getPictureLinkCollection();
        }
        httpClient.close();
        httpGet.clone();
        return list;
    }

    private String getUsernameAssemblyPath(String filePath, String uid) throws Exception {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        URL url = new URL(wbUserConfig.getUserUrl());
        HttpGet httpGet = new HttpGet(url.toURI());
        httpGet.setHeader("cookie", wbUserConfig.getCookie());
        httpGet.setHeader("User-Agent", wbUserConfig.getUserAgent());
        CloseableHttpResponse response = httpClient.execute(httpGet);
        HttpEntity entity = response.getEntity();
        String htmlString = EntityUtils.toString(entity, StandardCharsets.UTF_8);
        //转对象
        ObjectMapper objectMapper = new ObjectMapper();
        wbUser wbData = objectMapper.readValue(htmlString, wbUser.class);
        String screenName = wbData.getData().getUser().getScreen_name();
        System.out.println("博主id：" + screenName);
        return filePath + screenName + "_" + uid;
    }

    public void multiThreadedDownload() throws Exception {
        String targetRoute = "D:\\download\\wb\\";

        ////调用轮子，进行下载

        //long start = System.currentTimeMillis();
        //String url001 = "https://wx2.sinaimg.cn/large/006arPKfgy1ha7h9b8b7ij30u0140qca.jpg";
        //String fileName = "MyPic001.png";
        //String fileRoute = targetRoute + fileName;
        //downloadUsingStream(url001, fileRoute);
        //long finish = System.currentTimeMillis();
        //System.out.println("time=" + (finish - start) + "ms");

        ////从已有的列表中下载多个文件
        //待会新建文件夹、考虑下去重的问题

        //创建保存文件夹
        String filePathName = getUsernameAssemblyPath(targetRoute, wbUserConfig.getUid());
        Path path = Paths.get(filePathName);
        if (Files.notExists(path)) {
            Files.createDirectory(path);
        }


        for (int i = 0; i < list.size(); ++i) {
            int num = i + 1;
            String thisFileRoute = filePathName + "\\" + num + ".png";
            downloadUsingStream(list.get(i), thisFileRoute);
            Thread.sleep(200);
            System.out.print(num + " ");
        }

        //long startList = System.currentTimeMillis();
        //ThreadPoolExecutor executor = new ThreadPoolExecutor(20, 500, 500, TimeUnit.MILLISECONDS,
        //        new ArrayBlockingQueue<Runnable>(500));////这个需要调参适配，corePoolSize越大越好；此案例达到20即可达到性能极限
        //
        //for (int i = 0; i < list.size(); ++i) {
        //    MyTask myTask = new MyTask(targetRoute, list.get(i), list.get(i));
        //    executor.execute(myTask);
        //}
        //executor.shutdown();
    }

    //用流来下载文件，是一个底层的轮子；
    public static void downloadUsingStream(String urlStr, String fileRoute) throws IOException {
        URL url = new URL("https://wx2.sinaimg.cn/large/" + urlStr + ".jpg");
        BufferedInputStream bis = new BufferedInputStream(url.openStream());
        FileOutputStream fis = new FileOutputStream(fileRoute);
        byte[] buffer = new byte[1024];
        int count = 0;
        while ((count = bis.read(buffer, 0, 1024)) != -1) {
            fis.write(buffer, 0, count);
        }
        fis.close();
        bis.close();
    }
}

