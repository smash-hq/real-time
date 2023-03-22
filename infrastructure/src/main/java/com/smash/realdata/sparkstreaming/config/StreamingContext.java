package com.smash.realdata.sparkstreaming.config;

import org.apache.spark.SparkConf;
import org.apache.spark.streaming.Durations;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Created: smash_hq at 2023/3/11 11:43
 * @Description: 数据流功能入口
 */
@Component
public class StreamingContext {

    @Value("${spark.master:local[*]}")
    private String master;
    @Value("${spark.duration:1}")
    private Integer duration;

    @Bean
    public JavaStreamingContext javaStreamingContext() {
        SparkConf conf = new SparkConf().setAppName("spark streaming handler").setMaster(master);
        return new JavaStreamingContext(conf, Durations.seconds(duration));
    }

}
