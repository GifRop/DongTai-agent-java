package com.secnium.iast.core.threadlocalpool;

/**
 * @author dongzhiyong@huoxian.cn
 */
public class IastServerAddr extends ThreadLocal<String> {
    @Override
    protected String initialValue() {
        return null;
    }
}
