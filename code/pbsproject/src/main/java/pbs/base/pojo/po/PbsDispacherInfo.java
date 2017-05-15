package pbs.base.pojo.po;

import java.sql.Date;
import java.sql.Timestamp;

public class PbsDispacherInfo {
	//主键
	private int id;
	//站点ID
	private int rentId;
	//站点名称
	private String rentName;
	//状态---"调入","调出"，"备车"三种
	private String zt;
	//调入/出的数量
	private int num;
	//任务发布时间
	private Timestamp publishTime;
	//任务完成时间
	private String finishTime;
	//操作员
	private String operator;
	
	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getRentName() {
		return rentName;
	}

	public void setRentName(String rentName) {
		this.rentName = rentName;
	}

	public Timestamp getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(Timestamp publishTime) {
		this.publishTime = publishTime;
	}

	public String getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(String finishTime) {
		this.finishTime = finishTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRentId() {
		return rentId;
	}

	public void setRentId(int rentId) {
		this.rentId = rentId;
	}

	public String getZt() {
		return zt;
	}

	public void setZt(String zt) {
		this.zt = zt;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Timestamp getTime() {
		return publishTime;
	}

	public void setTime(Timestamp publishTime) {
		this.publishTime = publishTime;
	}
	
	
	
}
