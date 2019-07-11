package com.xxl.job.admin.core.jobbean;

import com.xxl.job.admin.core.thread.JobTriggerPoolHelper;
import com.xxl.job.admin.core.trigger.TriggerTypeEnum;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;
/**
 * Class Description
 *
 * @author wangzhengxi
 * @date 2019/5/31 9:49
 * @version 1.0.0
 */
//@DisallowConcurrentExecution
public class RemoteHttpJobBean extends QuartzJobBean {
	private static Logger logger = LoggerFactory.getLogger(RemoteHttpJobBean.class);

	@Override
	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {

		// load jobId
		JobKey jobKey = context.getTrigger().getJobKey();
		Integer jobId = Integer.valueOf(jobKey.getName());

		// trigger
		JobTriggerPoolHelper.trigger(jobId, TriggerTypeEnum.CRON, -1, null, null);
	}

}