package com.qf.entity;

import java.io.Serializable;

public class LandscapeOrder implements Serializable {
    private Long landscapeOrderId;

    private String landscapeOrderDetail;

    private String name;

    private Integer childrenMount;

    private Integer tools;

    public Long getLandscapeOrderId() {
        return landscapeOrderId;
    }

    public void setLandscapeOrderId(Long landscapeOrderId) {
        this.landscapeOrderId = landscapeOrderId;
    }

    public String getLandscapeOrderDetail() {
        return landscapeOrderDetail;
    }

    public void setLandscapeOrderDetail(String landscapeOrderDetail) {
        this.landscapeOrderDetail = landscapeOrderDetail == null ? null : landscapeOrderDetail.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getChildrenMount() {
        return childrenMount;
    }

    public void setChildrenMount(Integer childrenMount) {
        this.childrenMount = childrenMount;
    }

    public Integer getTools() {
        return tools;
    }

    public void setTools(Integer tools) {
        this.tools = tools;
    }

    @Override
    public String toString() {
        return "LandscapeOrder{" +
                "landscapeOrderId=" + landscapeOrderId +
                ", landscapeOrderDetail='" + landscapeOrderDetail + '\'' +
                ", name='" + name + '\'' +
                ", childrenMount=" + childrenMount +
                ", tools=" + tools +
                '}';
    }
}