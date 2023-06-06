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
import org.junit.Test;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author yzhans
 * @version 1.0
 * @description TODO
 * @date 2023/4/17 1:10
 */
public class httpTest {


    @Test
    public void test1() throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();

        HttpGet httpGet = new HttpGet("https://weibo.com/ajax/profile/getImageWall?uid=5205636486&sinceid=4839048081703416_4757156647928713%7C1034:4757156482973722_20221219_-1");
        httpGet.setHeader("cookie", "XSRF-TOKEN=qBtNOqgGqsIOA6Ir-nFstnwq; login_sid_t=aacc79ad7667e602aa65428231bce338; cross_origin_proto=SSL; _s_tentry=passport.weibo.com; Apache=4666665317653.056.1676960236338; SINAGLOBAL=4666665317653.056.1676960236338; ULV=1676960236342:1:1:1:4666665317653.056.1676960236338:; SSOLoginState=1677189990; UPSTREAM-V-WEIBO-COM=35846f552801987f8c1e8f7cec0e2230; UOR=,,cn.bing.com; SUBP=0033WrSXqPxfM725Ws9jqgMF55529P9D9WWWx9RhlHSRqU0VpUsBndm-5JpX5KMhUgL.FozXe0qES0q41K52dJLoI0qLxKqL1-eL1-zLxK-L1K5L1-zLxK.L1-BL1KzLxKBLB.2L1K2LxKML1-zLBoBLxKBLBonL122t; ALF=1684242118; SCF=Ao48jg49GupSH6LnrFvhOJYw2690KvJQG7jVtVd3oNedGIo_PsMjQxa2C_rBa2V8P7GFkMrPVYYhGJfsVygYAmc.; SUB=_2A25JP4GYDeRhGeRK6FQT9yjFwjyIHXVqTPRQrDV8PUNbmtAGLXDckW9NU23LK37Q0mvBxVIDlDEcpfzPNBCevHzh; WBPSESS=hzIwKUsg2hzc2RRGFGeYShhTIFqbkAovW7v-sj8LzuEMTxE-BJ1LkrcVM07eBcoFvodKplYNVMdeJA--2iVOjeo0fvdmU8NAWXmDrB9ig8urNlWdDmz4yEXNCQ0Ya5ADh6TBxc_PAfDoQZrGPJ98Lw==");
        httpGet.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36");
        CloseableHttpResponse response = httpClient.execute(httpGet);
        HttpEntity entity = response.getEntity();
        String htmlString = EntityUtils.toString(entity, StandardCharsets.UTF_8);
        ObjectMapper objectMapper = new ObjectMapper();
        wbData wbData = objectMapper.readValue(htmlString, wbData.class);

        System.out.println(htmlString);

        response.close();
    }

    @Test
    public void tpTest() throws Exception {

        //照片URL
        String imageUrl = "https://wx2.sinaimg.cn/large/006arPKfgy1hd1ulq2lktj31zy2nynpe.jpg";
        URL url = new URL(imageUrl);
        //打开网络输入流
        DataInputStream dis = new DataInputStream(url.openStream());
        String newImageName = "D://download/1.jpg";
        //建立一个新的文件
        FileOutputStream fos = new FileOutputStream(new File(newImageName));
        byte[] buffer = new byte[1024];
        int length;
        //开始填充数据
        while ((length = dis.read(buffer)) > 0) {
            fos.write(buffer, 0, length);
        }
        dis.close();
        fos.close();

    }

    @Test
    public void name() throws Exception {
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

        String filePathName = "D:\\download\\wb\\" + wbData.getData().getUser().getScreen_name() + "_" + "6207726030";
        Path path = Paths.get(filePathName);
        if (Files.notExists(path)) {
            Files.createDirectory(path);
        }
    }
}
