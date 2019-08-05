package com.ithieima.po;

public class Orders {
    private Integer ordersId;
    private User user;

    @Override
    public String toString() {
        return "Orders{" +
                "ordersId=" + ordersId +
                ", usr=" + user +
                '}';
    }

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User usr) {
        this.user = usr;
    }
}
