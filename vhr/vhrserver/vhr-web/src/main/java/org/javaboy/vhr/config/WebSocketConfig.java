package org.javaboy.vhr.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws/ep")//配置建立 websocket客服端请求地址,withSockJS前端用它
                .setAllowedOrigins("http://localhost:8080") // 添加允许跨域访问
                .withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        /**
         * 配置消息代理
         * 启动简单Broker，消息的发送的地址符合配置的前缀来的消息才发送到这个broker
         */
        registry.enableSimpleBroker("/queue");
    }
}

//public interface WebSocketMessageBrokerConfigurer {
//
//    // 添加这个Endpoint，这样在网页中就可以通过websocket连接上服务,也就是我们配置websocket的服务地址,并且可以指定是否使用socketjs
//    void registerStompEndpoints(StompEndpointRegistry var1);
//
//    // 配置发送与接收的消息参数，可以指定消息字节大小，缓存大小，发送超时时间
//    void configureWebSocketTransport(WebSocketTransportRegistration var1);
//
//    // 设置输入消息通道的线程数，默认线程为1，可以自己自定义线程数，最大线程数，线程存活时间
//    void configureClientInboundChannel(ChannelRegistration var1);
//
//    // 设置输出消息通道的线程数，默认线程为1，可以自己自定义线程数，最大线程数，线程存活时间
//    void configureClientOutboundChannel(ChannelRegistration var1);
//
//    // 添加自定义的消息转换器，spring 提供多种默认的消息转换器，返回false,不会添加消息转换器，返回true，会添加默认的消息转换器，当然也可以把自己写的消息转换器添加到转换链中
//    boolean configureMessageConverters(List<MessageConverter> var1);
//
//    // 配置消息代理，哪种路径的消息会进行代理处理
//    void configureMessageBroker(MessageBrokerRegistry var1);
//
//    // 自定义控制器方法的参数类型，有兴趣可以百度google HandlerMethodArgumentResolver这个的用法
//    void addArgumentResolvers(List<HandlerMethodArgumentResolver> var1);
//
//    // 自定义控制器方法返回值类型，有兴趣可以百度google HandlerMethodReturnValueHandler这个的用法
//    void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> var1);
//}