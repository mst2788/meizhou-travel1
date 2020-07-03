package com.qf.entity;

import java.io.Serializable;
import java.util.Date;

public class HotelOrder implements Serializable {
    private Long hotelId;

    private Integer hotelType;

    private Date startDate;

    private Date endDate;

    private Integer roomCount;

    private String name;

    private Integer phone;

    private Date startTime;

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public Integer getHotelType() {
        return hotelType;
    }

    public void setHotelType(Integer hotelType) {
        this.hotelType = hotelType;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "HotelOrder{" +
                "hotelId=" + hotelId +
                ", hotelType=" + hotelType +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", roomCount=" + roomCount +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", startTime=" + startTime +
                '}';
    }
}