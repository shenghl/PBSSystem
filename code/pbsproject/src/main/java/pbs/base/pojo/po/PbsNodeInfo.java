package pbs.base.pojo.po;

public class PbsNodeInfo {
    private Integer id;

    private Integer zh;

    private String zt;

    private String bm;

    private Integer zd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getZh() {
        return zh;
    }

    public void setZh(Integer zh) {
        this.zh = zh;
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