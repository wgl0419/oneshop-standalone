package com.gelvt.oneshop.common.enumeration;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

/**
 * 枚举类型处理器
 * @author: Elvin Zeng
 * @date: 17-7-4.
 */
public class EnumHandler<E extends Enum<E> & TypedEnum<T>, T>
        extends BaseTypeHandler<E> {
    private Class<E> type;

    public EnumHandler(Class<E> type) {
        if (type == null) {
            throw new IllegalArgumentException("Type argument cannot be null");
        }
        this.type = type;
    }

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i
            , E parameter, JdbcType jdbcType) throws SQLException {
        if (jdbcType == null) {
            T value = parameter.getValue();
            if(value instanceof Integer || value instanceof Short
                    || value instanceof Character || value instanceof Byte){
                ps.setInt(i, (Integer)value);
            }else if(value instanceof String){
                ps.setString(i, (String)value);
            }else if(value instanceof Boolean){
                ps.setBoolean(i, (Boolean)value);
            }else if(value instanceof Long){
                ps.setLong(i, (Long)value);
            }else if(value instanceof Double){
                ps.setDouble(i, (Double)value);
            }else if(value instanceof Float){
                ps.setFloat(i, (Float)value);
            }else{
                throw new RuntimeException("unsupported [value] type of enum");
            }
        } else {
            ps.setObject(i, parameter.getValue()
                    , jdbcType.TYPE_CODE); // see r3589
        }
    }

    @Override
    public E getNullableResult(ResultSet rs
            , String columnName) throws SQLException {
        String s = rs.getString(columnName);
        return toEnum(s);
    }

    @Override
    public E getNullableResult(ResultSet rs
            , int columnIndex) throws SQLException {
        String s = rs.getString(columnIndex);
        return toEnum(s);
    }

    @Override
    public E getNullableResult(CallableStatement cs
            , int columnIndex) throws SQLException {
        String s = cs.getString(columnIndex);
        return toEnum(s);
    }

    private E toEnum(String value){
        return EnumConverter.ParseEnum(type, value);
    }
}
