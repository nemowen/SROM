package me.htime.sorm.core;

import java.util.List;

/**
 * 负责查询(对外)
 * @author nemowen
 *
 */
@SuppressWarnings("all")
public interface IQuery {
	
	/**
	 * 直接执行DML语句
	 * @param sql sql语句
	 * @param params 参数
	 * @return 执行sql后影响记录的条数
	 */
	public int executeDML(String sql, Object[] params);
	
	/**
	 * 插入一个对象到数据库中
	 * @param obj 要插入的对象
	 */
	public void insert(Object obj);
	
	/**
	 * 删除clazz对象对应表中的记录
	 * @param clazz 对象的clazz
	 * @param id 表id
	 * @return 
	 */
	public void delete(Class clazz,long id);
	
	/**
	 * 删除此对象在数据库中的数据
	 * @param obj
	 */
	public void delete(Object obj);
	
	/**
	 * 更新对象在数据库中的记录, 并只更新指定的字段
	 * @param obj 要更新的对象
	 * @param fieldNames 要更新的字段名
	 * @return
	 */
	public int update(Object obj, String[] fieldNames);
	
	/**
	 * 根据sql查询返回多行记录, 并把每条数据封闭成clazz指定的类对象
	 * @param sql 查询的SQL语句
	 * @param clazz 把每条记录将要封装的对象
	 * @param params 查询需要的参数
	 * @return
	 */
	public List queryRows(String sql, Class clazz, Object[] params);
	
	/**
	 * 根据sql查询一行记录, 并把数据封闭成clazz指定的类对象
	 * @param sql 查询的SQL语句
	 * @param clazz 把记录将要封装的对象
	 * @param params 查询需要的参数
	 * @return
	 */
	public Object queryUniqueRow(String sql, Class clazz, Object[] params);
	
	/**
	 * 根据sql查询一个记录
	 * @param sql 查询的SQL语句
	 * @param params 查询需要的参数
	 * @return
	 */
	public Object queryValue(String sql,Object[] params);
	
	/**
	* 根据sql查询一个数字记录, 
	* @param sql 查询的SQL语句
	* @param params 查询需要的参数
	* @return
			*/
	public Number queryNumber(String sql,Object[] params);
}
