package com.gelvt.shoppingmall.util;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 字符串工具类
 * @author zenghui
 */
public class StringUtilTest {
    @Test
    public void isNullOrEmpty() throws Exception {
        assertTrue(StringUtil.isNullOrEmpty(""));
        assertTrue(StringUtil.isNullOrEmpty(null));
        assertFalse(StringUtil.isNullOrEmpty("zenghui"));
    }

    @Test
    public void isNullOrBlank() throws Exception {
        assertTrue(StringUtil.isNullOrBlank(""));
        assertTrue(StringUtil.isNullOrBlank(null));
        assertTrue(StringUtil.isNullOrBlank("  "));
        assertTrue(StringUtil.isNullOrBlank("\t"));
        assertFalse(StringUtil.isNullOrEmpty("zenghui"));
    }

    @Test
    public void getSha256() throws Exception {

    }

    @Test
    public void getSha1() throws Exception {

    }

    @Test
    public void generateUUID() throws Exception {

    }

    @Test
    public void generateRandomString() throws Exception {

    }

}