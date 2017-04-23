package pbs.base.pojo.po;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PbsOrderInfo {
    private Integer id;

    private String orderBm;

    private String openid;

    private String bikeBm;

    private String nodeBmStart;

    private String nodeBmEnd;

    private Integer type;

    private Integer state;

    private Date startTime;

    private Date endTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderBm() {
        return orderBm;
    }

    public void setOrderBm(String orderBm) {
        this.orderBm = orderBm == null ? null : orderBm.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getBikeBm() {
        return bikeBm;
    }

    public void setBikeBm(String bikeBm) {
        this.bikeBm = bikeBm == null ? null : bikeBm.trim();
    }

    public String getNodeBmStart() {
        return nodeBmStart;
    }

    public void setNodeBmStart(String nodeBmStart) {
        this.nodeBmStart = nodeBmStart == null ? null : nodeBmStart.trim();
    }

    public String getNodeBmEnd() {
        return nodeBmEnd;
    }

    public void setNodeBmEnd(String nodeBmEnd) {
        this.nodeBmEnd = nodeBmEnd == null ? null : nodeBmEnd.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getStartTime() {
        return startTime;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getEndTime() {
        return endTime;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

	@Override
	public String toString() {
		return "PbsOrderInfo [id=" + id + ", orderBm=" + orderBm + ", openid="
				+ openid + ", bikeBm=" + bikeBm + ", nodeBmStart="
				+ nodeBmStart + ", nodeBmEnd=" + nodeBmEnd + ", type=" + type
				+ ", state=" + state + ", startTime=" + startTime
				+ ", endTime=" + endTime + "]";
	}
    
    
}