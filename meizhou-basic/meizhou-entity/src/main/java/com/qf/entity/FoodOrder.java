package com.qf.entity;

import java.io.Serializable;

public class FoodOrder implements Serializable {
    private Long foodOrderId;

    private String foodStore;

    private String foodAddress;

    private String foodDetail;

    private String homeAddress;

    public Long getFoodOrderId() {
        return foodOrderId;
    }

    public void setFoodOrderId(Long foodOrderId) {
        this.foodOrderId = foodOrderId;
    }

    public String getFoodStore() {
        return foodStore;
    }

    public void setFoodStore(String foodStore) {
        this.foodStore = foodStore == null ? null : foodStore.trim();
    }

    public String getFoodAddress() {
        return foodAddress;
    }

    public void setFoodAddress(String foodAddress) {
        this.foodAddress = foodAddress == null ? null : foodAddress.trim();
    }

    public String getFoodDetail() {
        return foodDetail;
    }

    public void setFoodDetail(String foodDetail) {
        this.foodDetail = foodDetail == null ? null : foodDetail.trim();
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress == null ? null : homeAddress.trim();
    }

    @Override
    public String toString() {
        return "FoodOrder{" +
                "foodOrderId=" + foodOrderId +
                ", foodStore='" + foodStore + '\'' +
                ", foodAddress='" + foodAddress + '\'' +
                ", foodDetail='" + foodDetail + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                '}';
    }
}