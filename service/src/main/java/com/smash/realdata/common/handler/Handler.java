package com.smash.realdata.common.handler;

/**
 * @Created: smash_hq at 2023/3/22 16:08
 * @Description: 执行各项数据操作，采用策略模式
 */
public interface Handler<I, O> {


    /**
     * 执行数据操作，不论是什么操作必须实现该接口，统一作为数据的流转接口
     *
     * @param in 输入
     * @return
     */
    O exec(I in);

}
