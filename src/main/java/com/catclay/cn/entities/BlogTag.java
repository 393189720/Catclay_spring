package com.catclay.cn.entities;

/**
 * Created by clay on 2015/10/27.
 */
public class BlogTag extends Tag {

    private Integer tagId;

    private String tagTitle;

    @Override
    public String toString() {
        return "BlogTag{" +
                "tagId=" + tagId +
                ", tagTitle='" + tagTitle + '\'' +
                '}';
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getTagTitle() {
        return tagTitle;
    }

    public void setTagTitle(String tagTitle) {
        this.tagTitle = tagTitle;
    }
}
