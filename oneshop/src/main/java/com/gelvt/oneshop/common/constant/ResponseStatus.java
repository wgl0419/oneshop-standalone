package com.gelvt.oneshop.common.constant;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;


import com.gelvt.oneshop.common.enumeration.TypedEnum;
import com.gelvt.oneshop.common.json.IntegerEnumJsonSerializer;

/**
 * 响应状态码
 * @author: Elvin Zeng
 * @date: 17-7-6.
 */
@JsonSerialize(using=IntegerEnumJsonSerializer.class)
public enum ResponseStatus implements TypedEnum<Integer> {
    /**
     * 成功。
     */
    SUCCESS(200),
    /**
     * 服务端逻辑执行失败
     */
    ERROR(500),
    /**
     * 请求被拒绝
     */
    FORBIDDEN(403),
    /**
     * 重定向
     */
    REDIRECT(302)
    ;

    private Integer value;

    ResponseStatus(Integer value){
        this.value = value;
    }

    @Override
    public Integer getValue() {
        return value;
    }
}
