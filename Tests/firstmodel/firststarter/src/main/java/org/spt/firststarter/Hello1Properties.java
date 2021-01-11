package org.spt.firststarter;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "hello1")
public class Hello1Properties {
    private static final String DEFAULT_NAME = "DEFAULT_NAME";
    private static final String DEFAULT_MSG = "DEFAULT_MSG";
    private String name = DEFAULT_NAME;
    private String msg = DEFAULT_MSG;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
