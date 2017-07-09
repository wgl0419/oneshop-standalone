/**
 * 
 */
package com.gelvt.oneshop.model;

import java.io.Serializable;

/**
 * 模型的抽象
 * @author: Elvin Zeng
 * @date: 17-7-3
 */
public interface Entity extends Serializable{
	/**
	 * @return the id
	 */
	Long getId();

	/**
	 * @param id the id to set
	 */
	void setId(Long id);
}
