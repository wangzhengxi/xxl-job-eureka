package com.xxl.job.admin.dao;

import com.xxl.job.admin.core.model.XxlJobRegistry;
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
public interface XxlJobRegistryDao {

    int removeDead(@Param("timeout") int timeout);

    List<XxlJobRegistry> findAll(@Param("timeout") int timeout);

    int registryUpdate(@Param("registryGroup") String registryGroup,
                       @Param("registryKey") String registryKey,
                       @Param("registryValue") String registryValue);

    int registrySave(@Param("registryGroup") String registryGroup,
                     @Param("registryKey") String registryKey,
                     @Param("registryValue") String registryValue);

    int registryDelete(@Param("registryGroup") String registGroup,
                       @Param("registryKey") String registryKey,
                       @Param("registryValue") String registryValue);

}
