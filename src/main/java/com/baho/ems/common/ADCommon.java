package com.baho.ems.common;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "ad")
@Component
public class ADCommon {
    public static String host;
    public static String domain;
    public static String port;

    public static String getHost() {
        return host;
    }

    public void setHost(String host) {
        ADCommon.host = host;
    }

    public static String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        ADCommon.domain = domain;
    }

    public static String getPort() {
        return port;
    }

    public void setPort(String port) {
        ADCommon.port = port;
    }
}
