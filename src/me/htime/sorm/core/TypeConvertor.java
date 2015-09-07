package me.htime.sorm.core;

public interface TypeConvertor {

	/**
	 * 将数据库类型转化为java数据类型
	 * @param columnType 数据库字段的数据类型
	 * @return java的数据类型
	 */
	public String databaseType2JavaType(String columnType);
	
	/**
	 * 将JAVA数据类型转化为数据库数据类型
	 * @param javaDataType JAVA的数据类型
	 * @return 数据库的数据类型
	 */
	public String javaType2DatabaseType(String javaDataType);
}
