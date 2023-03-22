package com.smash.realdata.flink.executor.handler;

import com.smash.realdata.common.handler.Handler;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.spark.api.java.function.FilterFunction;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @Created: smash_hq at 2023/3/22 16:11
 * @Description: 数据清洗
 */
public class FlinkFilter<T> implements Handler<DataStream<T>, DataStream<T>>, FilterFunction<T> {

    private Class<T> tClass;

    FlinkFilter(Class<T> tClass) {
        this.tClass = tClass;
    }

    public Class<T> gettClass() {
        return tClass;
    }

    @Override
    public DataStream<T> exec(DataStream<T> in) {
        return in.filter(it -> call(it));
    }

    @Override
    public boolean call(T value) throws Exception {

        return false;
    }


    public static void main(String[] args) {
        FlinkFilter<String> flinkFilter = new FlinkFilter(String.class){};
        System.out.println(flinkFilter.gettClass());
    }
}
