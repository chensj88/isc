package com.winning.isc.controller;

import com.winning.isc.base.Constants;
import com.winning.isc.service.SysOrgExtService;
import com.winning.isc.ws.service.PmisWebServiceClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("admin")
public class SynchronizationController extends BaseController {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    protected final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private PmisWebServiceClient pmisWebServiceClient;
    @Autowired
    private SysOrgExtService sysOrgExtService;
    
    @RequestMapping(value = "/synchronization/synchronization")
    @ResponseBody
    public Map<String, Object> synchronization(Integer type) {
        if (type == 0) {
            //同步所有数据
            logger.info("开始导入PMIS数据>>>>>>>>>>>>>>>>>>");
            pmisWebServiceClient.insertData();
            logger.info("PMIS数据导入结束>>>>>>>>>>>>>>>>>>");
            logger.info("开始生成机构全路径数据>>>>>>>>>>>>");
            sysOrgExtService.createSysOrgExtByProc(null);
            logger.info("机构全路径数据导入结束>>>>>>>>>>>>");
        } else if (type == 8) {
            //组织机构
            PmisWebServiceClient.insertPMISInterfaceData(type.toString());
            logger.info("开始生成机构全路径数据，开始时间为[{}]", sdf.format(new Date()));
            sysOrgExtService.createSysOrgExtByProc(null);
            logger.info("机构全路径数据导入结束，结束时间为[{}]", sdf.format(new Date()));
        } else {
            PmisWebServiceClient.insertPMISInterfaceData(type.toString());
        }
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("status", Constants.SUCCESS);
        return result;
    }

}
