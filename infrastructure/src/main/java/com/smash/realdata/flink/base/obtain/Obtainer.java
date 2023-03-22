package com.smash.realdata.flink.base.obtain;

/**
 * @Created: smash_hq at 2023/3/22 15:06
 * @Description: 流数据获取
 */
public interface Obtainer<T> {

    /**
     * 底层的获取接口
     * @return
     * @throws Exception
     */
    T obtain() throws Exception;
    
}
