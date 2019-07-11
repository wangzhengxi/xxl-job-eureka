package com.xxl.job.admin.dao;

import com.xxl.job.admin.core.model.XxlJobGroup;
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
public interface XxlJobGroupDao {

    List<XxlJobGroup> findAll();

    List<XxlJobGroup> findByAddressType(@Param("addressType") int addressType);

    int save(XxlJobGroup xxlJobGroup);

    int update(XxlJobGroup xxlJobGroup);

    int remove(@Param("id") int id);

    XxlJobGroup load(@Param("id") int id);
}
