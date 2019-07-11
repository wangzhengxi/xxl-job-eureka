package com.xxl.job.admin.core.util;

import freemarker.ext.beans.BeansWrapper;
import freemarker.ext.beans.BeansWrapperBuilder;
import freemarker.template.Configuration;
import freemarker.template.TemplateHashModel;
/**
 * ftl util
 *
 * @author wangzhengxi
 * @date 2019/5/31 9:55
 * @version 1.0.0
 */
public class FtlUtil {

    private static BeansWrapper wrapper = new BeansWrapperBuilder(Configuration.DEFAULT_INCOMPATIBLE_IMPROVEMENTS).build();     //BeansWrapper.getDefaultInstance();

    public static TemplateHashModel generateStaticModel(String packageName) {
        try {
            TemplateHashModel staticModels = wrapper.getStaticModels();
            TemplateHashModel fileStatics = (TemplateHashModel) staticModels.get(packageName);
            return fileStatics;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
