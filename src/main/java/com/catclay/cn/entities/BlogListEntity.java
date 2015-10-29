package com.catclay.cn.entities;

import java.util.List;

/**
 * Created by clay on 2015/10/27.
 */
public class BlogListEntity extends BaseEntity {

    private List<BlogIntroduce> blogList;

    @Override
    public String toString() {
        return "BlogListEntity{" +
                "blogList=" + blogList +
                '}';
    }

    public List<BlogIntroduce> getBlogList() {
        return blogList;
    }

    public void setBlogList(List<BlogIntroduce> blogList) {
        this.blogList = blogList;
    }

    public static class BlogIntroduce{
        private Integer id;
        private String blogTitle;
        private long publishTime;
        private Tag blogTag;

        @Override
        public String toString() {
            return "BlogIntroduce{" +
                    "id=" + id +
                    ", blogTitle='" + blogTitle + '\'' +
                    ", publishTime=" + publishTime +
                    ", blogTag=" + blogTag +
                    '}';
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getBlogTitle() {
            return blogTitle;
        }

        public void setBlogTitle(String blogTitle) {
            this.blogTitle = blogTitle;
        }

        public long getPublishTime() {
            return publishTime;
        }

        public void setPublishTime(long publishTime) {
            this.publishTime = publishTime;
        }

        public Tag getBlogTag() {
            return blogTag;
        }

        public void setBlogTag(Tag blogTag) {
            this.blogTag = blogTag;
        }
    }
}
