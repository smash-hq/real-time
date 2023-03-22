package com.smash.realdata.flink.base.obtain;

/**
 * @Created: smash_hq at 2023/3/22 15:04
 * @Description: 获取流数据
 */
public abstract class BaseStreamObtain<T> implements Obtainer {


    /**
     * 流数据获取
     *
     * @return
     * @throws Exception
     */
    public abstract T obtain() throws Exception;

}
