package com.xxl.job.admin.core.quartz;

import org.quartz.SchedulerConfigException;
import org.quartz.spi.ThreadPool;

/**
 * Class Description
 *
 * @author wangzhengxi
 * @date 2019/5/31 9:50
 * @version 1.0.0
 */
public class XxlJobThreadPool implements ThreadPool {

    @Override
    public boolean runInThread(Runnable runnable) {

        // async run
        runnable.run();
        return true;

        //return false;
    }

    @Override
    public int blockForAvailableThreads() {
        return 1;
    }

    @Override
    public void initialize() throws SchedulerConfigException {

    }

    @Override
    public void shutdown(boolean waitForJobsToComplete) {

    }

    @Override
    public int getPoolSize() {
        return 1;
    }

    @Override
    public void setInstanceId(String schedInstId) {

    }

    @Override
    public void setInstanceName(String schedName) {

    }

    // support
    public void setThreadCount(int count) {
        //
    }

}
