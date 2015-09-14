package me.htime.sorm.core;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import me.htime.sorm.bean.Configuration;

/**
 * 根据配置信息, 维护连接对象的管理
 * @author nemowen
 *
 */
public class DBManager {
	private static Configuration conf;
	
	static{
		Properties pros = new Properties();
		try {
			// 加载db.properties配置文件
			pros.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 从db.properties 配置文件中取出数据
		conf = new Configuration();
		conf.setDriver(pros.getProperty("drive"));
		conf.setUrl(pros.getProperty("url"));
		conf.setUser(pros.getProperty("user"));
		conf.setPwd(pros.getProperty("pwd"));
		conf.setUsingDB(pros.getProperty("usingDB"));
		conf.setSrcPath(pros.getProperty("srcPath"));
		conf.setPoPackage(pros.getProperty("poPackage"));
	}
	
	public static Connection getConn(){
		try {
			Class.forName(conf.getDriver());
			return DriverManager.getConnection(conf.getUrl(), conf.getUser(), conf.getPwd());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
