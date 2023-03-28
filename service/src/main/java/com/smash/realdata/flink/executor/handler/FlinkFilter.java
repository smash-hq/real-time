package com.smash.realdata.flink.executor.handler;

import com.smash.realdata.enums.StrategyEnum;
import com.smash.realdata.flink.executor.strategy.AbstractStrategy;
import org.apache.flink.api.common.functions.FilterFunction;
import org.apache.flink.api.common.functions.MapFunction;
import org.springframework.stereotype.Component;

/**
 * @Created: smash_hq at 2023/3/22 16:11
 * @Description: 数据清洗
 */
@Component
public class FlinkFilter<T> extends AbstractStrategy implements FilterFunction {


    private FlinkFilter() {
        register();
    }

    @Override
    public StrategyEnum setType() {
        return StrategyEnum.FILTER;
    }


    @Override
    public boolean filter(Object value) throws Exception {
        return false;
    }
}
