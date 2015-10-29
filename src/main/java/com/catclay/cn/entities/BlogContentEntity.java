package com.catclay.cn.entities;

/**
 * Created by clay on 2015/10/27.
 */
public class BlogContentEntity {

    /**
     * blog id
     */
    private Integer id;

    private String blogTitle;
    private BlogTag blogTag;
    private long publishTime;
    private String blogContent;
    /**
     * 转发量
     */
    private long transpondCount;

    /**
     * 点赞数量
     */
    private long supportCount;

    @Override
    public String toString() {
        return "BlogContentEntity{" +
                "id=" + id +
                ", blogTitle='" + blogTitle + '\'' +
                ", blogTag=" + blogTag +
                ", publishTime=" + publishTime +
                ", blogContent='" + blogContent + '\'' +
                ", transpondCount=" + transpondCount +
                ", supportCount=" + supportCount +
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

    public BlogTag getBlogTag() {
        return blogTag;
    }

    public void setBlogTag(BlogTag blogTag) {
        this.blogTag = blogTag;
    }

    public long getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(long publishTime) {
        this.publishTime = publishTime;
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent;
    }

    public long getTranspondCount() {
        return transpondCount;
    }

    public void setTranspondCount(long transpondCount) {
        this.transpondCount = transpondCount;
    }

    public long getSupportCount() {
        return supportCount;
    }

    public void setSupportCount(long supportCount) {
        this.supportCount = supportCount;
    }
}
