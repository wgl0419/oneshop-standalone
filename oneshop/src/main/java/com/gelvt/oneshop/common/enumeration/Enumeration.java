package com.gelvt.oneshop.common.enumeration;

/**
 * 枚举类型公共接口
 * @param <T> 枚举的值的类型
 * @author: Elvin Zeng
 * @date: 17-7-4.
 */
public interface Enumeration<T> {
    /**
     * @return 枚举对应的值
     */
    T getValue();
}