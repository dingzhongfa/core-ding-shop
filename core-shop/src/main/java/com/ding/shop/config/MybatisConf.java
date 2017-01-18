package com.ding.shop.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.io.*;
import java.util.Properties;

/**
 * Created by hzdzf on 2017/1/12.
 */
@Configuration
@ComponentScan("com.ding.shop.service.impl")
@MapperScan("com.ding.shop.dao")
public class MybatisConf {

    @Bean("dataSource")
    public DataSource getDataSource() throws Exception {
        String confile = "application.properties";
        Properties p = new Properties();
        InputStream inputStream = null;
        try {
            confile = MybatisConf.class.getClassLoader().getResource("").getPath()
                    + confile;
            System.out.println(confile);
            File file = new File(confile);
            inputStream = new BufferedInputStream(new FileInputStream(file));
            p.load(inputStream);
            System.out.println(p.getProperty("url"));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        DruidDataSource dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(p);
        dataSource.setDbType("mysql");
        return dataSource;
    }

    @Bean(name="sqlSessionFactory")
    public SqlSessionFactory createMysqlSqlSessionFactory(@Autowired DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
//       System.out.println(dataSource.getConnection().getCatalog());
//        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
        return sqlSessionFactoryBean.getObject();
    }

}
