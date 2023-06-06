package com.wb.crawler.pojo;

import java.util.List;

/**
 * @author yzhans
 * @version 1.0
 * @description TODO
 * @date 2023/4/22 3:01
 */
public class wbUser {


    /**
     * ok : 1
     * data : {"user":{"id":6052479595,"idstr":"6052479595","pc_new":0,"screen_name":"脸脸吃多了","profile_image_url":"https://tvax3.sinaimg.cn/crop.0.0.1080.1080.50/006BBAqDly8glc613nsc7j30u00u0q4j.jpg?KID=imgbed,tva&Expires=1682114463&ssig=wFWRTA8wUW","profile_url":"/u/6052479595","verified":true,"verified_type":0,"domain":"","weihao":"","verified_type_ext":0,"avatar_large":"https://tvax3.sinaimg.cn/crop.0.0.1080.1080.180/006BBAqDly8glc613nsc7j30u00u0q4j.jpg?KID=imgbed,tva&Expires=1682114463&ssig=X32X%2FRjbBa","avatar_hd":"https://tvax3.sinaimg.cn/crop.0.0.1080.1080.1024/006BBAqDly8glc613nsc7j30u00u0q4j.jpg?KID=imgbed,tva&Expires=1682114463&ssig=4CBW0dfzWE","follow_me":false,"following":false,"mbrank":6,"mbtype":12,"v_plus":0,"planet_video":false,"verified_reason":"摄影博主","description":"","location":"湖南","gender":"f","followers_count":246776,"followers_count_str":"24.7万","friends_count":3,"statuses_count":246,"url":"","svip":0,"cover_image_phone":"https://wx4.sinaimg.cn/crop.0.0.640.640.640/9c3a9e65ly1gh26ca3mwaj20v90v9aff.jpg","icon_list":[{"type":"vip","data":{"mbrank":6,"mbtype":12,"svip":0}}],"top_user":1,"user_type":0,"is_star":"0","is_muteuser":false,"special_follow":false},"tabList":[{"name":"home","tabName":"精选"},{"name":"feed","tabName":"微博"},{"name":"newVideo","tabName":"视频"},{"name":"album","tabName":"相册"}],"blockText":""}
     */

    private int ok;
    private DataBeanX data;

    public int getOk() {
        return ok;
    }

    public void setOk(int ok) {
        this.ok = ok;
    }

    public DataBeanX getData() {
        return data;
    }

    public void setData(DataBeanX data) {
        this.data = data;
    }

    public static class DataBeanX {
        /**
         * user : {"id":6052479595,"idstr":"6052479595","pc_new":0,"screen_name":"脸脸吃多了","profile_image_url":"https://tvax3.sinaimg.cn/crop.0.0.1080.1080.50/006BBAqDly8glc613nsc7j30u00u0q4j.jpg?KID=imgbed,tva&Expires=1682114463&ssig=wFWRTA8wUW","profile_url":"/u/6052479595","verified":true,"verified_type":0,"domain":"","weihao":"","verified_type_ext":0,"avatar_large":"https://tvax3.sinaimg.cn/crop.0.0.1080.1080.180/006BBAqDly8glc613nsc7j30u00u0q4j.jpg?KID=imgbed,tva&Expires=1682114463&ssig=X32X%2FRjbBa","avatar_hd":"https://tvax3.sinaimg.cn/crop.0.0.1080.1080.1024/006BBAqDly8glc613nsc7j30u00u0q4j.jpg?KID=imgbed,tva&Expires=1682114463&ssig=4CBW0dfzWE","follow_me":false,"following":false,"mbrank":6,"mbtype":12,"v_plus":0,"planet_video":false,"verified_reason":"摄影博主","description":"","location":"湖南","gender":"f","followers_count":246776,"followers_count_str":"24.7万","friends_count":3,"statuses_count":246,"url":"","svip":0,"cover_image_phone":"https://wx4.sinaimg.cn/crop.0.0.640.640.640/9c3a9e65ly1gh26ca3mwaj20v90v9aff.jpg","icon_list":[{"type":"vip","data":{"mbrank":6,"mbtype":12,"svip":0}}],"top_user":1,"user_type":0,"is_star":"0","is_muteuser":false,"special_follow":false}
         * tabList : [{"name":"home","tabName":"精选"},{"name":"feed","tabName":"微博"},{"name":"newVideo","tabName":"视频"},{"name":"album","tabName":"相册"}]
         * blockText :
         */

        private UserBean user;
        private String blockText;
        private List<TabListBean> tabList;

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public String getBlockText() {
            return blockText;
        }

        public void setBlockText(String blockText) {
            this.blockText = blockText;
        }

        public List<TabListBean> getTabList() {
            return tabList;
        }

        public void setTabList(List<TabListBean> tabList) {
            this.tabList = tabList;
        }

        public static class UserBean {
            /**
             * id : 6052479595
             * idstr : 6052479595
             * pc_new : 0
             * screen_name : 脸脸吃多了
             * profile_image_url : https://tvax3.sinaimg.cn/crop.0.0.1080.1080.50/006BBAqDly8glc613nsc7j30u00u0q4j.jpg?KID=imgbed,tva&Expires=1682114463&ssig=wFWRTA8wUW
             * profile_url : /u/6052479595
             * verified : true
             * verified_type : 0
             * domain :
             * weihao :
             * verified_type_ext : 0
             * avatar_large : https://tvax3.sinaimg.cn/crop.0.0.1080.1080.180/006BBAqDly8glc613nsc7j30u00u0q4j.jpg?KID=imgbed,tva&Expires=1682114463&ssig=X32X%2FRjbBa
             * avatar_hd : https://tvax3.sinaimg.cn/crop.0.0.1080.1080.1024/006BBAqDly8glc613nsc7j30u00u0q4j.jpg?KID=imgbed,tva&Expires=1682114463&ssig=4CBW0dfzWE
             * follow_me : false
             * following : false
             * mbrank : 6
             * mbtype : 12
             * v_plus : 0
             * planet_video : false
             * verified_reason : 摄影博主
             * description :
             * location : 湖南
             * gender : f
             * followers_count : 246776
             * followers_count_str : 24.7万
             * friends_count : 3
             * statuses_count : 246
             * url :
             * svip : 0
             * cover_image_phone : https://wx4.sinaimg.cn/crop.0.0.640.640.640/9c3a9e65ly1gh26ca3mwaj20v90v9aff.jpg
             * icon_list : [{"type":"vip","data":{"mbrank":6,"mbtype":12,"svip":0}}]
             * top_user : 1
             * user_type : 0
             * is_star : 0
             * is_muteuser : false
             * special_follow : false
             */

            private long id;
            private String idstr;
            private int pc_new;
            private String screen_name;
            private String profile_image_url;
            private String profile_url;
            private boolean verified;
            private int verified_type;
            private String domain;
            private String weihao;
            private int verified_type_ext;
            private String avatar_large;
            private String avatar_hd;
            private boolean follow_me;
            private boolean following;
            private int mbrank;
            private int mbtype;
            private int v_plus;
            private boolean planet_video;
            private String verified_reason;
            private String description;
            private String location;
            private String gender;
            private int followers_count;
            private String followers_count_str;
            private int friends_count;
            private int statuses_count;
            private String url;
            private int svip;
            private String cover_image_phone;
            private int top_user;
            private int user_type;
            private String is_star;
            private boolean is_muteuser;
            private boolean special_follow;
            private List<IconListBean> icon_list;

            public long getId() {
                return id;
            }

            public void setId(long id) {
                this.id = id;
            }

            public String getIdstr() {
                return idstr;
            }

            public void setIdstr(String idstr) {
                this.idstr = idstr;
            }

            public int getPc_new() {
                return pc_new;
            }

            public void setPc_new(int pc_new) {
                this.pc_new = pc_new;
            }

            public String getScreen_name() {
                return screen_name;
            }

            public void setScreen_name(String screen_name) {
                this.screen_name = screen_name;
            }

            public String getProfile_image_url() {
                return profile_image_url;
            }

            public void setProfile_image_url(String profile_image_url) {
                this.profile_image_url = profile_image_url;
            }

            public String getProfile_url() {
                return profile_url;
            }

            public void setProfile_url(String profile_url) {
                this.profile_url = profile_url;
            }

            public boolean isVerified() {
                return verified;
            }

            public void setVerified(boolean verified) {
                this.verified = verified;
            }

            public int getVerified_type() {
                return verified_type;
            }

            public void setVerified_type(int verified_type) {
                this.verified_type = verified_type;
            }

            public String getDomain() {
                return domain;
            }

            public void setDomain(String domain) {
                this.domain = domain;
            }

            public String getWeihao() {
                return weihao;
            }

            public void setWeihao(String weihao) {
                this.weihao = weihao;
            }

            public int getVerified_type_ext() {
                return verified_type_ext;
            }

            public void setVerified_type_ext(int verified_type_ext) {
                this.verified_type_ext = verified_type_ext;
            }

            public String getAvatar_large() {
                return avatar_large;
            }

            public void setAvatar_large(String avatar_large) {
                this.avatar_large = avatar_large;
            }

            public String getAvatar_hd() {
                return avatar_hd;
            }

            public void setAvatar_hd(String avatar_hd) {
                this.avatar_hd = avatar_hd;
            }

            public boolean isFollow_me() {
                return follow_me;
            }

            public void setFollow_me(boolean follow_me) {
                this.follow_me = follow_me;
            }

            public boolean isFollowing() {
                return following;
            }

            public void setFollowing(boolean following) {
                this.following = following;
            }

            public int getMbrank() {
                return mbrank;
            }

            public void setMbrank(int mbrank) {
                this.mbrank = mbrank;
            }

            public int getMbtype() {
                return mbtype;
            }

            public void setMbtype(int mbtype) {
                this.mbtype = mbtype;
            }

            public int getV_plus() {
                return v_plus;
            }

            public void setV_plus(int v_plus) {
                this.v_plus = v_plus;
            }

            public boolean isPlanet_video() {
                return planet_video;
            }

            public void setPlanet_video(boolean planet_video) {
                this.planet_video = planet_video;
            }

            public String getVerified_reason() {
                return verified_reason;
            }

            public void setVerified_reason(String verified_reason) {
                this.verified_reason = verified_reason;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public String getGender() {
                return gender;
            }

            public void setGender(String gender) {
                this.gender = gender;
            }

            public int getFollowers_count() {
                return followers_count;
            }

            public void setFollowers_count(int followers_count) {
                this.followers_count = followers_count;
            }

            public String getFollowers_count_str() {
                return followers_count_str;
            }

            public void setFollowers_count_str(String followers_count_str) {
                this.followers_count_str = followers_count_str;
            }

            public int getFriends_count() {
                return friends_count;
            }

            public void setFriends_count(int friends_count) {
                this.friends_count = friends_count;
            }

            public int getStatuses_count() {
                return statuses_count;
            }

            public void setStatuses_count(int statuses_count) {
                this.statuses_count = statuses_count;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getSvip() {
                return svip;
            }

            public void setSvip(int svip) {
                this.svip = svip;
            }

            public String getCover_image_phone() {
                return cover_image_phone;
            }

            public void setCover_image_phone(String cover_image_phone) {
                this.cover_image_phone = cover_image_phone;
            }

            public int getTop_user() {
                return top_user;
            }

            public void setTop_user(int top_user) {
                this.top_user = top_user;
            }

            public int getUser_type() {
                return user_type;
            }

            public void setUser_type(int user_type) {
                this.user_type = user_type;
            }

            public String getIs_star() {
                return is_star;
            }

            public void setIs_star(String is_star) {
                this.is_star = is_star;
            }

            public boolean isIs_muteuser() {
                return is_muteuser;
            }

            public void setIs_muteuser(boolean is_muteuser) {
                this.is_muteuser = is_muteuser;
            }

            public boolean isSpecial_follow() {
                return special_follow;
            }

            public void setSpecial_follow(boolean special_follow) {
                this.special_follow = special_follow;
            }

            public List<IconListBean> getIcon_list() {
                return icon_list;
            }

            public void setIcon_list(List<IconListBean> icon_list) {
                this.icon_list = icon_list;
            }

            public static class IconListBean {
                /**
                 * type : vip
                 * data : {"mbrank":6,"mbtype":12,"svip":0}
                 */

                private String type;
                private DataBean data;

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public DataBean getData() {
                    return data;
                }

                public void setData(DataBean data) {
                    this.data = data;
                }

                public static class DataBean {
                    /**
                     * mbrank : 6
                     * mbtype : 12
                     * svip : 0
                     */

                    private int mbrank;
                    private int mbtype;
                    private int svip;

                    public int getMbrank() {
                        return mbrank;
                    }

                    public void setMbrank(int mbrank) {
                        this.mbrank = mbrank;
                    }

                    public int getMbtype() {
                        return mbtype;
                    }

                    public void setMbtype(int mbtype) {
                        this.mbtype = mbtype;
                    }

                    public int getSvip() {
                        return svip;
                    }

                    public void setSvip(int svip) {
                        this.svip = svip;
                    }
                }
            }
        }

        public static class TabListBean {
            /**
             * name : home
             * tabName : 精选
             */

            private String name;
            private String tabName;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getTabName() {
                return tabName;
            }

            public void setTabName(String tabName) {
                this.tabName = tabName;
            }
        }
    }
}
