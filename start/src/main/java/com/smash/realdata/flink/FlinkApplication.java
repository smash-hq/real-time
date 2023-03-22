package com.smash.realdata.flink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Created: smash_hq at 2023/3/22 11:27
 * @Description: flink启动类
 */
@SpringBootApplication(scanBasePackages = "com.smash.realdata.flink")
public class FlinkApplication {
    public static void main(String[] args) {
        SpringApplication.run(FlinkApplication.class);
    }
}
