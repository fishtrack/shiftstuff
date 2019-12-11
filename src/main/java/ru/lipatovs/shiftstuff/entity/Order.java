package ru.lipatovs.shiftstuff.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public int number;
    public String printType;
    public int machineId;
    public String status;
    public Date createdAt;
    public Date startedAt;
    public Date planAt;
    public Date endedAt;

    public Order(int id, int number, String printType, int machineId, String status, Date createdAt, Date startedAt, Date planAt, Date endedAt) {
        this.id = id;
        this.number = number;
        this.printType = printType;
        this.machineId = machineId;
        this.status = status;
        this.createdAt = createdAt;
        this.startedAt = startedAt;
        this.planAt = planAt;
        this.endedAt = endedAt;
    }

    public Order() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPrintType() {
        return printType;
    }

    public void setPrintType(String printType) {
        this.printType = printType;
    }

    public int getMachineId() {
        return machineId;
    }

    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
    }

    public Date getPlanAt() {
        return planAt;
    }

    public void setPlanAt(Date planAt) {
        this.planAt = planAt;
    }

    public Date getEndedAt() {
        return endedAt;
    }

    public void setEndedAt(Date endedAt) {
        this.endedAt = endedAt;
    }
}
