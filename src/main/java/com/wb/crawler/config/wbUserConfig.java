package com.wb.crawler.config;

/**
 * @author yzhans
 * @version 1.0
 * @description TODO
 * @date 2023/4/17 3:12
 */
public class wbUserConfig {
    static String uid = "7039939905";
    static String userUrl = "https://weibo.com/ajax/profile/info?uid=" + uid;
    static String url = "https://weibo.com/ajax/profile/getImageWall?uid=" + uid + "&sinceid=0&has_album=true";
    static String sinceid = "0";
    static String cookie = "SINAGLOBAL=4666665317653.056.1676960236338; UOR=,,cn.bing.com; XSRF-TOKEN=OYGesZB-jh8tbnXsEiGcF4vF; SSOLoginState=1683263017; _s_tentry=weibo.com; Apache=1097075330924.9104.1683263798129; ULV=1683263798192:11:4:4:1097075330924.9104.1683263798129:1683138011165; WBPSESS=hzIwKUsg2hzc2RRGFGeYShhTIFqbkAovW7v-sj8LzuEMTxE-BJ1LkrcVM07eBcoFvodKplYNVMdeJA--2iVOjdtN9L_TVHpQTbi2Hme8_a70eOVK44JjHXF93wXEzJa7Jk_8Z7eokJY17WzjtiUviw==; SCF=As8mN0C0bgnrLM_rmjSzDxM-o_txLsAx_aSsn5wuWthB2RU06_Pl3-tQuGcL1pR4BBEBtgRt-fhmRhb8DbB84oA.; SUB=_2A25JbgOtDeRhGeRK6FQT9yjFwjyIHXVqGnJlrDV8PUNbmtAGLRPdkW9NU23LK1OevIRa2wNZxuStFLAuLAgiztAO; SUBP=0033WrSXqPxfM725Ws9jqgMF55529P9D9WWWx9RhlHSRqU0VpUsBndm-5JpX5KzhUgL.FozXe0qES0q41K52dJLoI0qLxKqL1-eL1-zLxK-L1K5L1-zLxK.L1-BL1KzLxKBLB.2L1K2LxKML1-zLBoBLxKBLBonL122t; ALF=1716234107";
    static String UserAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36";
    static boolean has_album = true;

    public static String getUid() {
        return uid;
    }

    public static void setUid(String uid) {
        wbUserConfig.uid = uid;
    }

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        wbUserConfig.url = url;
    }

    public static String getSinceid() {
        return sinceid;
    }

    public static void setSinceid(String sinceid) {
        wbUserConfig.sinceid = sinceid;
        setUrl("https://weibo.com/ajax/profile/getImageWall?uid=" + uid + "&sinceid=" + sinceid + "&has_album=true");
    }

    public static String getUserUrl() {
        return userUrl;
    }

    public static void setUserUrl(String userUrl) {
        wbUserConfig.userUrl = userUrl;
    }

    public static String getCookie() {
        return cookie;
    }

    public static void setCookie(String cookie) {
        wbUserConfig.cookie = cookie;
    }

    public static String getUserAgent() {
        return UserAgent;
    }

    public static void setUserAgent(String userAgent) {
        UserAgent = userAgent;
    }

    public static boolean isHas_album() {
        return has_album;
    }

    public static void setHas_album(boolean has_album) {
        wbUserConfig.has_album = has_album;
    }
}
