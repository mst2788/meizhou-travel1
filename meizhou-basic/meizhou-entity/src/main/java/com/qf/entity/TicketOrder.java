package com.qf.entity;

import java.io.Serializable;

public class TicketOrder implements Serializable {
    private Long ticketOrderId;

    private Integer seatType;

    private String orderDetial;

    public Long getTicketOrderId() {
        return ticketOrderId;
    }

    public void setTicketOrderId(Long ticketOrderId) {
        this.ticketOrderId = ticketOrderId;
    }

    public Integer getSeatType() {
        return seatType;
    }

    public void setSeatType(Integer seatType) {
        this.seatType = seatType;
    }

    public String getOrderDetial() {
        return orderDetial;
    }

    public void setOrderDetial(String orderDetial) {
        this.orderDetial = orderDetial == null ? null : orderDetial.trim();
    }

    @Override
    public String toString() {
        return "TicketOrder{" +
                "ticketOrderId=" + ticketOrderId +
                ", seatType=" + seatType +
                ", orderDetial='" + orderDetial + '\'' +
                '}';
    }
}