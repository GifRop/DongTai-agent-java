package com.secnium.iast.core.threadlocalpool;

import com.secnium.iast.core.util.http.HttpResponse;

/**
 * @author dongzhiyong@huoxian.cn
 */
public class IastResponseCache extends ThreadLocal<HttpResponse> {
    @Override
    protected HttpResponse initialValue() {
        return null;
    }
}
