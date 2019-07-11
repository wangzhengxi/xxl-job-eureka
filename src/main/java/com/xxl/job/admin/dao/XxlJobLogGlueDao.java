package com.xxl.job.admin.dao;

import com.xxl.job.admin.core.model.XxlJobLogGlue;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * Class Description
 *
 * @author wangzhengxi
 * @date 2019/5/31 9:56
 * @version 1.0.0
 */
@Mapper
public interface XxlJobLogGlueDao {
	
	int save(XxlJobLogGlue xxlJobLogGlue);
	
	List<XxlJobLogGlue> findByJobId(@Param("jobId") int jobId);

	int removeOld(@Param("jobId") int jobId, @Param("limit") int limit);

	int deleteByJobId(@Param("jobId") int jobId);
	
}
