package pbs.base.pojo.po;

import java.sql.Date;
import java.sql.Timestamp;

public class PbsDispacherInfo {
	//主键
	private int id;
	
	//站点ID
	private int rentId;
	
	//状态---"调入","调出"两种
	private String zt;
	
	//调入/出的数量
	private int num;
	
	//调动时间
	private Date time;

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

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
	
	
	
}
