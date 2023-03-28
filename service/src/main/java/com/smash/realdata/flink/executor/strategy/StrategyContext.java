package com.smash.realdata.flink.executor.strategy;

import com.smash.realdata.enums.StrategyEnum;
import org.apache.flink.api.common.functions.Function;

import java.util.HashMap;
import java.util.Map;

/**
 * @Created: smash_hq at 2023/3/28 16:07
 * @Description: 策略上下文，提供注册方法和获取方法能力
 */
public class StrategyContext {

    public static final Map<StrategyEnum, Function> REGISTER_MAP = new HashMap<>();

    public static void registerFunction(StrategyEnum operation, Function function) {
        REGISTER_MAP.putIfAbsent(operation, function);
    }

    public static Function getFunction(StrategyEnum operation) {
        return REGISTER_MAP.get(operation);
    }

}
