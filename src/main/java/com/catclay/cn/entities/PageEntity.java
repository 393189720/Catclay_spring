package com.catclay.cn.entities;

/**
 * Created by clay on 2015/10/27.
 */
public class PageEntity<T> extends BaseEntity{

    private Integer pageSize;

    private Integer totalPages;

    @Override
    public String toString() {
        return "PageEntity{" +
                "pageSize=" + pageSize +
                ", totalPages=" + totalPages +
                '}';
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }
}
