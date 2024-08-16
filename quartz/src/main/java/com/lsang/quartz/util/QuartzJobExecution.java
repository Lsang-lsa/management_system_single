package com.lsang.quartz.util;

import org.quartz.JobExecutionContext;
import com.lsang.quartz.domain.SysJob;

/**
 * 定时任务处理（允许并发执行）
 * 
 * @author lsang
 *
 */
public class QuartzJobExecution extends AbstractQuartzJob
{
    @Override
    protected void doExecute(JobExecutionContext context, SysJob sysJob) throws Exception
    {
        JobInvokeUtil.invokeMethod(sysJob);
    }
}
