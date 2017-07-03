package com.gelvt.oneshop.common.enumeration;

import java.util.EnumSet;

/**
 * 枚举转换器
 * @author: Elvin Zeng
 * @date: 17-7-4.
 */
public class EnumConverter {
    /**
     * 将字符串转换为enum
     * @param type 枚举类型对象
     * @param value 枚举对应的值的字符串表示
     * @param <E> 枚举的类型
     * @param <T> 枚举值的类型
     * @return 枚举。如果转换失败则返回null。
     */
    public static <E extends Enum<E> & Enumeration<T>, T> E ParseEnum(Class<E> type, String value){
        EnumSet<E> set = EnumSet.allOf(type);
        if (set == null || set.size() <= 0) {
            return null;
        }
        for (E e : set) {
            T v = e.getValue();
            if(v != null){
                if(v.toString().equals(value)){
                    return e;
                }
            }
        }
        return null;
    }
}
