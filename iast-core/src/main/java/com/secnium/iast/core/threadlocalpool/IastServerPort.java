package com.secnium.iast.core.threadlocalpool;

/**
 * @author dongzhiyong@huoxian.cn
 */
public class IastServerPort extends ThreadLocal<Integer> {
    @Override
    protected Integer initialValue() {
        return null;
    }
}
