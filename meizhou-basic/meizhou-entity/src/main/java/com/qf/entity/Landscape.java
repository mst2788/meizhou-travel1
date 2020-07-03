package com.qf.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Landscape implements Serializable {
    private Long lid;

    private String lname;

    private String lpdesc;

    private BigDecimal lprice;

    private Date creattime;

    public Long getLid() {
        return lid;
    }

    public void setLid(Long lid) {
        this.lid = lid;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname == null ? null : lname.trim();
    }

    public String getLpdesc() {
        return lpdesc;
    }

    public void setLpdesc(String lpdesc) {
        this.lpdesc = lpdesc == null ? null : lpdesc.trim();
    }

    public BigDecimal getLprice() {
        return lprice;
    }

    public void setLprice(BigDecimal lprice) {
        this.lprice = lprice;
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    @Override
    public String toString() {
        return "Landscape{" +
                "lid=" + lid +
                ", lname='" + lname + '\'' +
                ", lpdesc='" + lpdesc + '\'' +
                ", lprice=" + lprice +
                ", creattime=" + creattime +
                '}';
    }
}