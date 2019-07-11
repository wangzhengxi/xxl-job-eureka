package com.xxl.job.admin.controller;

import com.xxl.job.admin.core.model.XxlJobInfo;
import com.xxl.job.admin.service.XxlJobService;
import com.xxl.job.core.biz.model.ReturnT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Class Description
 *
 * @author wangzhengxi
 * @date 2019/5/31 9:49
 * @version 1.0.0
 */
@RequestMapping(value = "/api")
@RestController
public class JobController {

    @Autowired
    private XxlJobService xxlJobService;

    @PostMapping(value = "/job")
    public ReturnT<String> add(XxlJobInfo jobInfo) {
        return xxlJobService.add(jobInfo);
    }
    @PostMapping(value = "/start")
    public ReturnT<String> start(int id) {
        return xxlJobService.start(id);
    }
    @PostMapping(value = "/stop")
    public ReturnT<String> stop(int id) {
        return xxlJobService.stop(id);
    }

    @DeleteMapping(value = "/job/{id}")
    public ReturnT<String> remove(@PathVariable(value = "id",required = true ) Integer  id) {
        return xxlJobService.remove(id);
    }

}
