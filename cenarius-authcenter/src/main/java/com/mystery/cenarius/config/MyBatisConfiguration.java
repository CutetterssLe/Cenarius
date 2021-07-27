package com.mystery.cenarius.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Mystery
 */
@Configuration
@MapperScan({"com.mystery.cenarius.mapper.*"})
@EnableTransactionManagement
public class MyBatisConfiguration {


}
