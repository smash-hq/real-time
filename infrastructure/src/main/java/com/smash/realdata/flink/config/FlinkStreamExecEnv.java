package com.smash.realdata.flink.config;

import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Created: smash_hq at 2023/3/22 14:33
 * @Description: flink运行环境
 */
@Component
public class FlinkStreamExecEnv {
    @Bean
    public StreamExecutionEnvironment streamExecutionEnvironment() {
        return StreamExecutionEnvironment.getExecutionEnvironment();
    }

}
