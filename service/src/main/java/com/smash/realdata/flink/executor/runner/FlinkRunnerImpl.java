package com.smash.realdata.flink.executor.runner;

import com.smash.realdata.common.cmd.Runner;
import com.smash.realdata.enums.StrategyEnum;
import com.smash.realdata.flink.executor.strategy.StrategyContext;
import org.apache.flink.api.common.functions.FilterFunction;
import org.apache.flink.api.common.functions.Function;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Created: smash_hq at 2023/3/22 15:36
 * @Description: flink启动
 */

@Service
public class FlinkRunnerImpl implements Runner {

    @Resource
    private StreamExecutionEnvironment streamExecutionEnvironment;

    @Override
    public void run() throws Exception {
        // 1、获取运行环境
        DataStreamSource<String> source = streamExecutionEnvironment.socketTextStream("", 8888);
        StrategyEnum strategyEnum = null;
        Function function = null;
        switch (strategyEnum) {
            case FILTER:
                function = StrategyContext.getFunction(StrategyEnum.FILTER);
                break;
            case FILLING:
                function = StrategyContext.getFunction(StrategyEnum.FILLING);
                break;
            default:
                break;
        }
        source.filter((FilterFunction<String>) function);

//        Function flinkFilter = StrategyContext.getFunction("FlinkFilter");
//        SingleOutputStreamOperator<String> filter = source.filter((FilterFunction<String>) flinkFilter);
//        source.map()
        // 2、组装任务执行详情
        // 3、调用handler执行具体操作
        // 4、执行完成进行持久化数据
    }

    @Override
    public void stop() throws Exception {

    }
}
