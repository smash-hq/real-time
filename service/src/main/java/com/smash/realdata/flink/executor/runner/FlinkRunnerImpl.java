package com.smash.realdata.flink.executor.runner;

import com.smash.realdata.common.cmd.Runner;

/**
 * @Created: smash_hq at 2023/3/22 15:36
 * @Description: flink启动
 */
public class FlinkRunnerImpl implements Runner {
    @Override
    public void run() throws Exception {
        // 1、获取运行环境
        // 2、组装任务执行详情
        // 3、调用handler执行具体操作
        // 4、执行完成进行持久化数据
    }

    @Override
    public void stop() throws Exception {

    }
}
