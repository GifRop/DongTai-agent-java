package com.secnium.iast.agent.monitor;

import com.secnium.iast.agent.IastProperties;
import com.secnium.iast.agent.UpdateUtils;
import com.secnium.iast.agent.manager.EngineManager;

/**
 * @author dongzhiyong@huoxian.cn
 */
public class EngineMonitor implements IMonitor {
    private final IastProperties properties;
    private String currentStatus;
    private final EngineManager engineManager;

    public EngineMonitor(EngineManager engineManager) {
        this.engineManager = engineManager;
        this.properties = IastProperties.getInstance();
        this.currentStatus = this.properties.getEngineStatus();
    }

    @Override
    public void check() {
        String status =  UpdateUtils.checkForStatus();
        if ("notcmd".equals(status)){
            return;
        }
        if (status.equals(this.currentStatus)){
            return;
        }
        if ("start".equals(status)) {
            System.out.println("执行了agent启动 start");
            engineManager.start();
            // 更新状态
        } else if ("stop".equals(status)) {
            System.out.println("执行了agent暂停 stop");
            engineManager.stop();
            // 更新状态
        }
        this.currentStatus = status;
    }
}
