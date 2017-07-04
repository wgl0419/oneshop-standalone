/**
 *
 */
package com.gelvt.oneshop.mapper;

import com.gelvt.oneshop.model.Entity;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 通用的带查询列表功能的Mapper
 *
 * @author: Elvin Zeng
 * @date: 17-7-3.
 */
public interface CommonListableMapper<T extends Entity>
        extends BaseMapper<T> {

    /**
     * 根据指定的搜索条件搜索记录
     *
     * @param param 查询参数
     * @return 结果集
     */
    List<T> list(@Param("param") QueryParameter<T> param);
}
