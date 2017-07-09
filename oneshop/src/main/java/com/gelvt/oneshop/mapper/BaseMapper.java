/**
 * 
 */
package com.gelvt.oneshop.mapper;

import com.gelvt.oneshop.model.Entity;


/**
 * Mapper公共基接口
 * @author: Elvin Zeng
 * @date: 17-7-3.
 */
public interface BaseMapper<T extends Entity> {
	/** 保存一个实体
	 * @param entity 待保存实体
	 */
	void save(T entity);
	
	/** 删除一个实体
	 * @param id id
	 */
	void remove(Long id);
	/** 更新一个实体
	 * @param entity 待更新实体
	 */
	void update(T entity);
	
	/** 获得一个实体
	 * @param id id
	 * @return 持久化的实体
	 */
	T get(Long id);
}
