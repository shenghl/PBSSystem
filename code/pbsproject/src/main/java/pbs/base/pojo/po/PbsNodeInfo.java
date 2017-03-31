package pbs.base.pojo.po;

public class PbsNodeInfo {
    private Integer id;

    private String zt;

    private String bm;

    private Integer zd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt == null ? null : zt.trim();
    }

    public String getBm() {
        return bm;
    }

    public void setBm(String bm) {
        this.bm = bm == null ? null : bm.trim();
    }

    public Integer getZd() {
        return zd;
    }

    public void setZd(Integer zd) {
        this.zd = zd;
    }
}