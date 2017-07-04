/**
 * 
 */
package com.gelvt.oneshop.mapper;


import com.gelvt.oneshop.model.Entity;
import com.gelvt.oneshop.searchkey.SearchKey;
import org.apache.ibatis.session.RowBounds;

import java.util.List;


/**
 * 基于MyBatis-PageHelper的带查询列表功能的Mapper
 * @author: Elvin Zeng
 * @date: 17-7-3.
 */
public interface PageHelperBasedListableMapper<T extends Entity>
		extends BaseMapper<T>{

	/**
	 * 根据指定的搜索条件搜索记录。
	 * @param searchKey 搜索关键字
     * @param rowBounds 记录的区间
	 * @return 搜索到的结果
	 */
	List<T> list(SearchKey<T> searchKey, RowBounds rowBounds);
}
