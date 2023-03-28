package com.smash.realdata.flink.executor.handler;

import com.smash.realdata.enums.StrategyEnum;
import com.smash.realdata.flink.executor.strategy.AbstractStrategy;
import org.apache.flink.api.common.functions.FilterFunction;
import org.apache.flink.api.common.functions.MapFunction;

/**
 * @Created: smash_hq at 2023/3/22 16:13
 * @Description: 值填充
 */
public class FlinkFilling extends AbstractStrategy implements MapFunction {

    @Override
    public void register() {
        super.register();
    }

    @Override
    public StrategyEnum setType() {
        return StrategyEnum.FILLING;
    }


    @Override
    public Object map(Object value) throws Exception {
        return null;
    }
}
