package dev.kritchalach.handytools;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Storage {
    private @Id
    @GeneratedValue Long id;
    private String itemsDetail;
    private String ownerName;
    private String storageName;
    private Boolean availability;
    private String userName;
    private Boolean borrowed;
    private String borrowingDate;
    private String period;
    private String whereUse;
    private Boolean returned;
    private Boolean problem;
    private String reason;
    private String returnDate;
    private String status;

    Storage() {}

    public Storage(String itemsDetail, String ownerName, String storageName, Boolean availability,
    String userName, Boolean borrowed, String borrowingDate, String period, String whereUse,
    Boolean returned, Boolean problem, String reason, String returnDate, String status) {
        this.itemsDetail = itemsDetail;
        this.ownerName = ownerName;
        this.storageName = storageName;
        this.availability = availability;
        this.userName = userName;
        this.borrowed = borrowed;
        this.borrowingDate = borrowingDate;
        this.period = period;
        this.whereUse = whereUse;
        this.returned = returned;
        this.problem = problem;
        this.reason = reason;
        this.returnDate = returnDate;
        this.status = status;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getItemsDetail() {
        return itemsDetail;
    }
    public void setItemsDetail(String itemsDetail) {
        this.itemsDetail = itemsDetail;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public String getStorageName() {
        return storageName;
    }
    public void setStorageName(String storageName) {
        this.storageName = storageName;
    }
    public Boolean getAvailability() {
        return availability;
    }
    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public Boolean getBorrowed() {
        return borrowed;
    }
    public void setBorrowed(Boolean borrowed) {
        this.borrowed = borrowed;
    }
    public String getBorrowingDate() {
        return borrowingDate;
    }
    public void setBorrowingDate(String borrowingDate) {
        this.borrowingDate = borrowingDate;
    }
    public String getPeriod() {
        return period;
    }
    public void setPeriod(String period) {
        this.period = period;
    }
    public String getWhereUse() {
        return whereUse;
    }
    public void setWhereUse(String whereUse) {
        this.whereUse = whereUse;
    }
    public Boolean getReturned() {
        return returned;
    }
    public void setReturned(Boolean returned) {
        this.returned = returned;
    }
    public Boolean getProblem() {
        return problem;
    }
    public void setProblem(Boolean problem) {
        this.problem = problem;
    }
    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }
    public String getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((itemsDetail == null) ? 0 : itemsDetail.hashCode());
        result = prime * result + ((ownerName == null) ? 0 : ownerName.hashCode());
        result = prime * result + ((storageName == null) ? 0 : storageName.hashCode());
        result = prime * result + ((availability == null) ? 0 : availability.hashCode());
        result = prime * result + ((userName == null) ? 0 : userName.hashCode());
        result = prime * result + ((borrowed == null) ? 0 : borrowed.hashCode());
        result = prime * result + ((borrowingDate == null) ? 0 : borrowingDate.hashCode());
        result = prime * result + ((period == null) ? 0 : period.hashCode());
        result = prime * result + ((whereUse == null) ? 0 : whereUse.hashCode());
        result = prime * result + ((returned == null) ? 0 : returned.hashCode());
        result = prime * result + ((problem == null) ? 0 : problem.hashCode());
        result = prime * result + ((reason == null) ? 0 : reason.hashCode());
        result = prime * result + ((returnDate == null) ? 0 : returnDate.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Storage other = (Storage) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (itemsDetail == null) {
            if (other.itemsDetail != null)
                return false;
        } else if (!itemsDetail.equals(other.itemsDetail))
            return false;
        if (ownerName == null) {
            if (other.ownerName != null)
                return false;
        } else if (!ownerName.equals(other.ownerName))
            return false;
        if (storageName == null) {
            if (other.storageName != null)
                return false;
        } else if (!storageName.equals(other.storageName))
            return false;
        if (availability == null) {
            if (other.availability != null)
                return false;
        } else if (!availability.equals(other.availability))
            return false;
        if (userName == null) {
            if (other.userName != null)
                return false;
        } else if (!userName.equals(other.userName))
            return false;
        if (borrowed == null) {
            if (other.borrowed != null)
                return false;
        } else if (!borrowed.equals(other.borrowed))
            return false;
        if (borrowingDate == null) {
            if (other.borrowingDate != null)
                return false;
        } else if (!borrowingDate.equals(other.borrowingDate))
            return false;
        if (period == null) {
            if (other.period != null)
                return false;
        } else if (!period.equals(other.period))
            return false;
        if (whereUse == null) {
            if (other.whereUse != null)
                return false;
        } else if (!whereUse.equals(other.whereUse))
            return false;
        if (returned == null) {
            if (other.returned != null)
                return false;
        } else if (!returned.equals(other.returned))
            return false;
        if (problem == null) {
            if (other.problem != null)
                return false;
        } else if (!problem.equals(other.problem))
            return false;
        if (reason == null) {
            if (other.reason != null)
                return false;
        } else if (!reason.equals(other.reason))
            return false;
        if (returnDate == null) {
            if (other.returnDate != null)
                return false;
        } else if (!returnDate.equals(other.returnDate))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        } else if (!status.equals(other.status))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Storage [id=" + id + ", itemsDetail=" + itemsDetail + ", ownerName=" + ownerName
        + ", storageName=" + storageName + ", availability=" + availability + ", userName=" + userName
        + ", borrowed=" + borrowed + ", borrowingDate=" + borrowingDate + ", period=" + period
        + ", whereUse=" + whereUse + ", returned=" + returned + ", problem=" + problem
        + ", reason=" + reason + ", returnDate=" + returnDate + ", status=" + status + "]";
    }
}