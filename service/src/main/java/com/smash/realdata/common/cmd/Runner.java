package com.smash.realdata.common.cmd;

/**
 * @Created: smash_hq at 2023/3/22 15:34
 * @Description: 任务执行入口
 */
public interface Runner {

    /**
     * 任务启动
     *
     * @throws Exception
     */
    void run() throws Exception;

    /**
     * 任务停止
     *
     * @throws Exception
     */
    void stop() throws Exception;

}
