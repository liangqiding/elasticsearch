package com.example.demo.utils;


import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;
import java.util.List;


/**
 * @author: qiDing
 * date: 2020/6/4 0004 14:56
 * description: TODO
 */
public class GlobalConfigs {


    public static void main(String[] args) {

//        String dbUrl = "jdbc:mysql://192.168.188.104:4000/i2dsp_emg_base?useUnicode=true&characterEncoding=utf8";
        String dbUrl = "jdbc:mysql://192.168.188.104:4000/i2dsp_emg_base?useUnicode=true&useSSL=false&characterEncoding=utf8&useTimezone=true&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true&useServerPrepStmts=true&allowMultiQueries=true";
//        String tableName = "device";
        String[] tableName = {"device_message_record"};
//        String[] tableName={"maintain_company","maintain_file","maintain_handle","maintain_repair","maintain_suggestion","maintain_unusual"}
        boolean fileOverride = false;

        GlobalConfig config = new GlobalConfig();

        config.setActiveRecord(true)
                .setAuthor("lqd")
                .setOutputDir("D:\\project\\git\\test\\Elasticsearch\\src\\main\\java\\")
                // .setEnableCache(false)// XML EnableCache
                // XML ResultMap
                .setBaseResultMap(true)
                // XML columnList
                .setBaseColumnList(true)
                // .setKotlin(true)  kotlin code
                .setFileOverride(fileOverride);
        //****************************** resource ***************************************
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)
                .setUrl(dbUrl)
                .setUsername("qiding")
                .setPassword("6UMhV3YvVlpOZZfSEJRQ")
                .setDriverName("com.mysql.cj.jdbc.Driver")
                .setTypeConvert(new MySqlTypeConvert() {
                    @Override
                    public DbColumnType processTypeConvert(GlobalConfig globalConfig, String fieldType) {
                        System.out.println("转换类型：" + fieldType);
                        //tinyint转换成Boolean
                        if (fieldType.toLowerCase().contains("tinyint")) {
                            return DbColumnType.BOOLEAN;
                        }
                        if (fieldType.toLowerCase().contains("datetime")) {
                            return DbColumnType.DATE;
                        }
                        return (DbColumnType) super.processTypeConvert(globalConfig, fieldType);
                    }
                });

        //****************************** Policy configuration ******************************************************
        List<TableFill> tableFillList = new ArrayList<>();
        tableFillList.add(new TableFill("gmt_modified", FieldFill.INSERT_UPDATE));
        tableFillList.add(new TableFill("modifier_id", FieldFill.INSERT_UPDATE));
        tableFillList.add(new TableFill("creator_id", FieldFill.INSERT));
        tableFillList.add(new TableFill("gmt_create", FieldFill.INSERT));
        tableFillList.add(new TableFill("available_flag", FieldFill.INSERT));
        tableFillList.add(new TableFill("deleted_flag", FieldFill.INSERT));
        tableFillList.add(new TableFill("sync_flag", FieldFill.INSERT));
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig
                .setCapitalMode(true)
                .setEntityLombokModel(true)
                .setNaming(NamingStrategy.underline_to_camel)
                .setTableFillList(tableFillList)
                .setInclude(tableName);
        new AutoGenerator().setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(
                        new PackageConfig()
                                .setParent("com.example.demo")
                                .setController("controller")
                                .setEntity("domain")
                                .setMapper("dao")
                                .setXml("dao")
                )
                .setTemplate(
                        new TemplateConfig()
                                .setServiceImpl("templates/serviceImpl.java")
                )
                .execute();
    }
}

