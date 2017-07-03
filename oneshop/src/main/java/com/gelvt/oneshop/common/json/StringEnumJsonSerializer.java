package com.gelvt.oneshop.common.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.gelvt.oneshop.common.enumeration.Enumeration;


import java.io.IOException;

/**
 * 字符串值枚举json序列化工具
 *
 * @author: Elvin Zeng
 * @date: 17-7-4.
 */
public class StringEnumJsonSerializer<E extends Enum<E> & Enumeration<String>> extends JsonSerializer<E> {

    @Override
    public void serialize(E value, JsonGenerator gen, SerializerProvider serializerProvider)
            throws IOException {
        gen.writeString(value.getValue());
    }

}