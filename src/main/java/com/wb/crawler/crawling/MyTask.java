package com.wb.crawler.crawling;

import static com.wb.crawler.crawling.Creep.downloadUsingStream;

class MyTask implements Runnable {
    String targetRoute;
    String i;
    String str;

    MyTask(String targetRoute, String i, String str) {
        this.str = str;
        this.i = i;
        this.targetRoute = targetRoute;
    }

    @Override
    public void run() {
        String thisFileRoute = targetRoute + i + ".png";
        try {
            downloadUsingStream(str, thisFileRoute);
            Thread.sleep(500);
            System.out.println("正在下载第" + i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}