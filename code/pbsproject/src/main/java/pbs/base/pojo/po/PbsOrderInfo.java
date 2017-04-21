package pbs.base.pojo.po;

import java.util.Date;

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

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}