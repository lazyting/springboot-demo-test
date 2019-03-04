/**
 * 获取配置文件的方式
 * Spring Boot可以通过@PropertySource,@Value,@Environment,@ConfigurationProperties来绑定变量。
 *
 * 对javabean的配置后，然后使用@Autowide注入，就能使用了，但是不能通过new 对象() 来产生对象
 * Created by lzt on 2019/3/4.
 */
package com.lzt.entity.getConfig;