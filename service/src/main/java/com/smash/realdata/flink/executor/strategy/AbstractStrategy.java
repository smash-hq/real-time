package com.smash.realdata.flink.executor.strategy;

import com.smash.realdata.enums.StrategyEnum;
import org.apache.flink.api.common.functions.Function;

/**
 * @Created: smash_hq at 2023/3/28 16:17
 * @Description: 抽象策略类
 */
public abstract class AbstractStrategy implements Function {

    private StrategyEnum type;

    private void getType() {
        this.type = setType();
    }

    /**
     * 注册功能函数
     *
     * @Note 必须实现注册
     */
    public void register() {
        // 先获取处理类型，再进行注册
        this.getType();
        StrategyContext.registerFunction(this.type, this);
    }


    /**
     * 数据处理类型
     *
     * @return
     */
    public abstract StrategyEnum setType();

}
