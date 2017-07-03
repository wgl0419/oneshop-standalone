/**
 *
 */
package com.gelvt.oneshop.exception;

/**
 * 本应用的通用异常类
 *
 * @author: Elvin Zeng
 * @date: 17-7-4.
 */
public class CommonException extends Exception {

    private static final long serialVersionUID = -54668897909785963L;

    public CommonException(String message) {
        super(message);
    }

    public CommonException(Exception e) {
        super(e);
    }

    public CommonException(String message, Exception e) {
        super(message, e);
    }
}
