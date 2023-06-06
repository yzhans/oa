package com.wb.crawler.crawling;

import com.wb.crawler.config.wbUserConfig;

import java.io.IOException;
import java.util.List;

/**
 * @author yzhans
 * @version 1.0
 * @description TODO
 * @date 2023/4/17 3:17
 */
public class Start {
    public static void main(String[] args) throws Exception {
        Creep creep = new Creep();
        List<String> list = creep.getPictureLinkCollection();
        System.out.println(list.size());
        creep.multiThreadedDownload();
    }

}
