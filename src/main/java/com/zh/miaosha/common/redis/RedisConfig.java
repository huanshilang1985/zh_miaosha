package com.zh.miaosha.common.redis;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Author zhanghe
 * Desc: Redis配置
 * Date 2019/8/11 10:30
 */
@Getter
@Setter
@Component
@ConfigurationProperties(prefix="redis")
public class RedisConfig {


    private String host;        /** IP  */
    private int port;           /** 端口 */
    private int timeout;//秒
    private String password;
    private int poolMaxTotal;
    private int poolMaxIdle;
    private int poolMaxWait;//秒

}
