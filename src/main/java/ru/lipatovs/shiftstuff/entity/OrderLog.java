package ru.lipatovs.shiftstuff.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class OrderLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public int userId;
    public int orderId;
    public Date dateTimeStart;
    public Date dateTimeEnd;

    public OrderLog(int id, int userId, int orderId, Date dateTimeStart, Date dateTimeEnd) {
        this.id = id;
        this.userId = userId;
        this.orderId = orderId;
        this.dateTimeStart;
        this.dateTimeEnd;
    }

    public OrderLog() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Date getDateTimeStart() {
        return dateTimeStart;
    }

    public void setDateTimeStart(Date dateTimeStart) {
        this.dateTimeStart = dateTimeStart;
    }

    public Date getDateTimeEnd() {
        return dateTimeEnd;
    }

    public void setDateTimeEnd(Date dateTimeEnd) {
        this.dateTimeEnd = dateTimeEnd;
    }
}
