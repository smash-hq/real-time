package com.smash.realdata.flink.base.obtain;

/**
 * @Created: smash_hq at 2023/3/22 15:03
 * @Description: 获取表数据
 */
public abstract class BaseTableObtain<T> implements Obtainer {

    /**
     * 各自实现数据读取
     *
     * @return
     * @throws Exception
     */
    public abstract T obtain() throws Exception;

}
