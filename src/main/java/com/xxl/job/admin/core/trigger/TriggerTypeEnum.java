package com.xxl.job.admin.core.trigger;

import com.xxl.job.admin.core.util.I18nUtil;
/**
 * trigger type enum
 *
 * @author wangzhengxi
 * @date 2019/5/31 9:53
 * @version 1.0.0
 */
public enum TriggerTypeEnum {

    MANUAL(I18nUtil.getString("jobconf_trigger_type_manual")),
    CRON(I18nUtil.getString("jobconf_trigger_type_cron")),
    RETRY(I18nUtil.getString("jobconf_trigger_type_retry")),
    PARENT(I18nUtil.getString("jobconf_trigger_type_parent")),
    API(I18nUtil.getString("jobconf_trigger_type_api"));

    TriggerTypeEnum(String title){
        this.title = title;
    }
    private String title;
    public String getTitle() {
        return title;
    }

}
