package me.htime.sorm.bean;

import java.util.Map;

/**
 * 存储表的信息
 * @author nemowen
 *
 */
public class TableInfo {

	/**
	 * 表名
	 */
	private String tname;
	
	/**
	 * 所有字段的信息
	 */
	private Map<String, ColumnInfo> clumns;
	
	/**
	 * 唯一主键(目前我们只能处理单一的主键,暂不能处理复合主键)
	 */
	private ColumnInfo onlyPriKey;

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Map<String, ColumnInfo> getClumns() {
		return clumns;
	}

	public void setClumns(Map<String, ColumnInfo> clumns) {
		this.clumns = clumns;
	}

	public ColumnInfo getOnlyPriKey() {
		return onlyPriKey;
	}

	public void setOnlyPriKey(ColumnInfo onlyPriKey) {
		this.onlyPriKey = onlyPriKey;
	}

	public TableInfo(String tname, Map<String, ColumnInfo> clumns,
			ColumnInfo onlyPriKey) {
		super();
		this.tname = tname;
		this.clumns = clumns;
		this.onlyPriKey = onlyPriKey;
	}

	public TableInfo() {
	}
	
}
