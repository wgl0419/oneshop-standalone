package com.gelvt.oneshop.mapper;


import com.gelvt.oneshop.common.misc.PageParameter;
import com.gelvt.oneshop.model.Entity;
import com.gelvt.oneshop.searchkey.SearchKey;

/**
 * 查询参数
 * @author: Elvin Zeng
 * @date: 17-7-3.
 */
public class QueryParameter<T extends Entity> {
    private PageParameter pageParameter;   //  分页参数
    private SearchKey<T> searchKey;        //  搜索关键字

    /**
     * 查询参数构造器
     * @param pageParameter 分页参数
     * @param searchKey 搜索关键字
     */
    public QueryParameter(PageParameter pageParameter
            , SearchKey<T> searchKey) {
        this.pageParameter = pageParameter;
        this.searchKey = searchKey;
    }

    /**
     * @return 分页参数
     */
    public PageParameter getPageParameter() {
        return pageParameter;
    }

    /**
     * @return 搜索条件
     */
    public SearchKey<T> getSearchKey() {
        return searchKey;
    }

}
