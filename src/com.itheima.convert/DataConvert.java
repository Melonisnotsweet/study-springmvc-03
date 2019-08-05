
package com.itheima.convert;

import org.springframework.core.convert.converter.Converter;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DataConvert implements Converter<String, Date>
{
 private String datePattern="yyyy-MM-dd HH:mm:ss";
    @Override
    public Date convert(String source) {
        SimpleDateFormat sdf=new SimpleDateFormat(datePattern);
        try{
           return sdf.parse(source);
        } catch (ParseException e) {
            throw new IllegalArgumentException("��Ч�����ڸ�ʽ����ʹ�����ָ�ʽ��"+
                    datePattern);
        }
    }

}