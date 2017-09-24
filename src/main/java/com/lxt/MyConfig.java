package com.lxt;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author liuxutao-64
 * @create 2017-09-24 14:50
 */
@Configuration
public class MyConfig {

    @Bean
    public TransportClient client() throws UnknownHostException {
        InetSocketTransportAddress node = new InetSocketTransportAddress(
                InetAddress.getByName("localhost"),
                9200
        );

        Settings settings = Settings.builder().put("cluster.name","lxt-application").build();

        TransportClient client = new PreBuiltTransportClient(Settings.EMPTY);
        client.addTransportAddress(node);

        return client;
    }
}
