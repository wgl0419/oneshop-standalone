/**
 * 
 */
package com.gelvt.oneshop.model;

import java.io.Serializable;

/**
 * Mapper公共基接口
 * @author: Elvin Zeng
 * @date: 17-7-3
 */
public interface Entity extends Serializable{
	/**
	 * @return the id
	 */
	Integer getId();

	/**
	 * @param id the id to set
	 */
	void setId(Integer id);
}
