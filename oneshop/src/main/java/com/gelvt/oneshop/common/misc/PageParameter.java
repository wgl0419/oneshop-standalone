package com.gelvt.oneshop.common.misc;

/**
 * 分页参数
 * @author Elvin Zeng
 * @date: 17-7-3.
 */
public class PageParameter {
    private Integer pageIndex;      //  页号，从1开始编号。
    private Integer pageSize;       //  分页大小，默认为10，0表示不分页。

    /**
     * 分页参数构造器
     * @param pageIndex 页号（从1开始编号）
     * @param pageSize 分页大小，0表示不分页。
     */
    public PageParameter(Integer pageIndex, Integer pageSize) {
        if (pageIndex < 1){
            throw new IllegalArgumentException("页号最小为1");
        }
        if (pageSize < 0){
            throw new IllegalArgumentException("分页大小最小为0，0表示不分页。");
        }
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
    }

    /**
     * 分页参数构造器。分页大小默认为10.
     * @param pageIndex 页号（从1开始编号）
     */
    public PageParameter(Integer pageIndex) {
        if (pageIndex < 1){
            throw new IllegalArgumentException("页号最小为1");
        }
        this.pageSize = 10;
        this.pageIndex = pageIndex;
    }


    /**
     * 计算要提取的数据的第一条记录的索引，从0开始计数。
     * @return 要提取的数据的第一条记录的索引，从0开始计数。
     */
    public Integer getOffset() {
        return pageSize == 0 ? 0 : (pageSize * (pageIndex - 1));
    }

    /**
     * 计算要提取的记录总数。0表示不分页。
     * @return 要提取的记录总数。0表示不分页。
     */
    public Integer getLimit(){
        return this.pageSize;
    }


    /**
     * 页号（从1开始编号）
     * @return 页号（从1开始编号）
     */
    public Integer getPageIndex() {
        return pageIndex;
    }

    /**
     * 页号（从1开始编号）
     * @param pageIndex 页号（从1开始编号）
     */
    public void setPageIndex(Integer pageIndex) {
        if (pageIndex < 1){
            throw new IllegalArgumentException("页号最小为1");
        }
        this.pageIndex = pageIndex;
    }

    /**
     * 分页大小，默认为10，0表示不分页。
     * @return 分页大小，默认为10，0表示不分页。
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * 分页大小，默认为10，0表示不分页。
     * @param pageSize 分页大小，默认为10，0表示不分页。
     */
    public void setPageSize(Integer pageSize) {
        if (pageSize < 0){
            throw new IllegalArgumentException("分页大小最小为0。默认为10，0表示不分页。");
        }
        this.pageSize = pageSize;
    }
}
