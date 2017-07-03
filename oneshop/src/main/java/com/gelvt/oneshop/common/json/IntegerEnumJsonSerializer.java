package com.gelvt.oneshop.common.json;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.gelvt.oneshop.common.enumeration.Enumeration;


/**
 * 整型值枚举json序列化工具
 *
 * @param <E>
 * @author links
 */
public class IntegerEnumJsonSerializer<E extends Enum<E> & Enumeration<Integer>> extends JsonSerializer<E> {

    @Override
    public void serialize(E value, JsonGenerator gen, SerializerProvider serializerProvider)
            throws IOException, JsonProcessingException {
        gen.writeNumber(value.getValue());
    }

}
