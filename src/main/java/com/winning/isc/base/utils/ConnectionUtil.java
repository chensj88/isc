package com.winning.isc.base.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.winning.isc.base.Constants;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.sql.*;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

public class ConnectionUtil {

    @Autowired
    private DruidDataSource druidDataSource;

    private static ConnectionUtil connectionUtil;

    @PostConstruct
    public void init() {
        connectionUtil = this;
        connectionUtil.druidDataSource = this.druidDataSource;
    }


    /**
     * @return Connection
     */
    public static synchronized Connection getConnection(){
        Connection conn = null ;
        try {
            conn =  connectionUtil.druidDataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * @return Connection
     */
    public static synchronized Connection getConnection(String ip, String username, String password, String databaseName) {
        // 读出配置信息
        String driverClassName = Constants.DRIVE_CLASS_NAME;
        String url = "jdbc:sqlserver://" + ip + ";DatabaseName=" + databaseName;
        Connection conn = null;
        try {
            // 加载数据库驱动程序
            Class.forName(driverClassName);
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }

    public static void closeAll(Connection conn, PreparedStatement pstmt, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
                rs = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (pstmt != null) {
            try {
                pstmt.close();
                pstmt = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
                conn = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private ConnectionUtil() {
    }

    /**
     * @param obj
     * @return
     * @throws Exception
     * @description javabean 转化成Map
     */
    public static HashMap<String, Object> objectToMap(Object obj) {
        if (obj == null)
            return null;

        HashMap<String, Object> map = new HashMap<String, Object>();

        BeanInfo beanInfo = null;
        try {
            beanInfo = Introspector.getBeanInfo(obj.getClass());

            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor property : propertyDescriptors) {
                String key = property.getName();
                if (key.compareToIgnoreCase("class") == 0) {
                    continue;
                }
                Method getter = property.getReadMethod();
                Object value = getter != null ? getter.invoke(obj) : null;
                Set<String> set = null;
                HashMap<String, Object> curMap = null;
                if (value != null && "map".equalsIgnoreCase(key)) {
                    //封装map内属性
                    curMap = (HashMap) value;
                    //获取keySet
                    set = curMap.keySet();
                    for (String curSet : set) {
                        map.put(key.toLowerCase() + "." + curSet, curMap.get(curSet).toString());
                    }
                } else {
                    map.put(key, value);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}
