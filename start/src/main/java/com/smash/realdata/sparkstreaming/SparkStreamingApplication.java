package com.smash.realdata.sparkstreaming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Created: smash_hq at 2023/3/22 11:27
 * @Description: spark启动类
 */

@SpringBootApplication(scanBasePackages = "com.smash.realdata.sparkstreaming")
public class SparkStreamingApplication {
    public static void main(String[] args) {
        SpringApplication.run(SparkStreamingApplication.class);
    }
}
