package com.qf.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Ticket implements Serializable {
    private Long ticket;

    private String startsite;

    private String endsite;

    private Integer seconedSeat;

    private Integer firstSeat;

    private Integer comSeat;

    private Integer nonSeat;

    private String trainId;

    private BigDecimal tprice;

    private Date startTime;

    private Date endTime;

    public Long getTicket() {
        return ticket;
    }

    public void setTicket(Long ticket) {
        this.ticket = ticket;
    }

    public String getStartsite() {
        return startsite;
    }

    public void setStartsite(String startsite) {
        this.startsite = startsite == null ? null : startsite.trim();
    }

    public String getEndsite() {
        return endsite;
    }

    public void setEndsite(String endsite) {
        this.endsite = endsite == null ? null : endsite.trim();
    }

    public Integer getSeconedSeat() {
        return seconedSeat;
    }

    public void setSeconedSeat(Integer seconedSeat) {
        this.seconedSeat = seconedSeat;
    }

    public Integer getFirstSeat() {
        return firstSeat;
    }

    public void setFirstSeat(Integer firstSeat) {
        this.firstSeat = firstSeat;
    }

    public Integer getComSeat() {
        return comSeat;
    }

    public void setComSeat(Integer comSeat) {
        this.comSeat = comSeat;
    }

    public Integer getNonSeat() {
        return nonSeat;
    }

    public void setNonSeat(Integer nonSeat) {
        this.nonSeat = nonSeat;
    }

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId == null ? null : trainId.trim();
    }

    public BigDecimal getTprice() {
        return tprice;
    }

    public void setTprice(BigDecimal tprice) {
        this.tprice = tprice;
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

    @Override
    public String toString() {
        return "Ticket{" +
                "ticket=" + ticket +
                ", startsite='" + startsite + '\'' +
                ", endsite='" + endsite + '\'' +
                ", seconedSeat=" + seconedSeat +
                ", firstSeat=" + firstSeat +
                ", comSeat=" + comSeat +
                ", nonSeat=" + nonSeat +
                ", trainId='" + trainId + '\'' +
                ", tprice=" + tprice +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}