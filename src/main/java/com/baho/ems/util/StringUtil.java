package com.baho.ems.util;

import com.alibaba.druid.util.StringUtils;

import java.util.UUID;

public class StringUtil {
    public static boolean isNullOrEmpty(String str) {
        return str == null ? true : StringUtils.isEmpty(str.trim());
    }

    public static boolean areNotEmpty(String... values) {
        boolean result = true;
        if (values == null || values.length == 0) {
            result = false;
        } else {
            for (String value : values) {
                result &= !isNullOrEmpty(value);
            }
        }
        return result;
    }

    public static String createUUID() {
        //注意replaceAll前面的是正则表达式
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        return uuid;
    }
}
