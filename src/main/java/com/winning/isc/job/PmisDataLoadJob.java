package com.winning.isc.job;

import com.winning.isc.base.utils.DateUtil;
import com.winning.isc.service.Facade;
import com.winning.isc.ws.service.PmisWebServiceClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;

/**
 * @author chensj
 * @title
 * @email chensj@winning.com.cn
 * @package com.winning.isc.job
 * @date: 2018-10-29 15:39
 */
@Configuration
@Component
@EnableScheduling
public class PmisDataLoadJob {

    private static final Logger logger = LoggerFactory.getLogger(PmisDataLoadJob.class);

    @Autowired
    private Facade facade;

    public void loadPmisData() {
        logger.info("数据加载开始时间为：[{}]", DateUtil.format(new Date(),DateUtil.PATTERN_19));
        PmisWebServiceClient.insertData();
        logger.info("数据加载结束时间为：[{}]", DateUtil.format(new Date(),DateUtil.PATTERN_19));
        logger.info("开始生成机构全路径数据，开始时间为[{}]",DateUtil.format(new Date(),DateUtil.PATTERN_19));
        facade.getSysOrgExtService().createSysOrgExtByProc(null);
        logger.info("机构全路径数据导入结束，结束时间为[{}]",DateUtil.format(new Date(),DateUtil.PATTERN_19));
    }

}
