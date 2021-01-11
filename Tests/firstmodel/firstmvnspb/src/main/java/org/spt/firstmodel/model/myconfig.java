package org.spt.firstmodel.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

class SingleRedisConfig{
    private String host;
    private String port;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}

@Component
@ConfigurationProperties(prefix = "my")
public class myconfig {
    private List<String> servers = new ArrayList<String>();

    private List<SingleRedisConfig> redisConfigs = new ArrayList<SingleRedisConfig>();

    public List<SingleRedisConfig> getRedisConfigs() {
        return redisConfigs;
    }

    public void setRedisConfigs(List<SingleRedisConfig> redisConfigs) {
        this.redisConfigs = redisConfigs;
    }

    public List<String> getServers() {
        return servers;
    }

    public void setServers(List<String> servers) {
        this.servers = servers;
    }


}
