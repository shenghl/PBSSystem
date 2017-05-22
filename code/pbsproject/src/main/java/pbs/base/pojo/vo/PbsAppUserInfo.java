package pbs.base.pojo.vo;

public class PbsAppUserInfo {
	//主键
	private int id;
	//账号
	private String account;
	//密码
	private String password;
	//对应运输车辆
	private String car;
	
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
