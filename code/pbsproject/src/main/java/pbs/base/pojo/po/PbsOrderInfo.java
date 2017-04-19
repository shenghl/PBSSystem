package pbs.base.pojo.po;

import java.util.Date;

public class PbsOrderInfo {
    private Integer id;

    private Integer rentStart;

    private Integer nodeStart;

    private Integer rentEnd;

    private Integer nodeEnd;

    private Date timeStart;

    private Date timeEnd;

    private String comment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRentStart() {
        return rentStart;
    }

    public void setRentStart(Integer rentStart) {
        this.rentStart = rentStart;
    }

    public Integer getNodeStart() {
        return nodeStart;
    }

    public void setNodeStart(Integer nodeStart) {
        this.nodeStart = nodeStart;
    }

    public Integer getRentEnd() {
        return rentEnd;
    }

    public void setRentEnd(Integer rentEnd) {
        this.rentEnd = rentEnd;
    }

    public Integer getNodeEnd() {
        return nodeEnd;
    }

    public void setNodeEnd(Integer nodeEnd) {
        this.nodeEnd = nodeEnd;
    }

    public Date getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Date timeStart) {
        this.timeStart = timeStart;
    }

    public Date getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Date timeEnd) {
        this.timeEnd = timeEnd;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}