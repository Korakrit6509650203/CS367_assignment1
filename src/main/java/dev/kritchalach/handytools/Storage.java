package dev.kritchalach.handytools;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
    private Boolean borrowed;
    private Boolean returned;
    private String userName;
    private String whereUse;
    private String whenUse;
    private String status;
    
    Storage() {}

    public Storage(String itemsDetail, String ownerName, String storageName, Boolean borrowed, Boolean returned, String userName, String whereUse, String whenUse, String status) {
        this.itemsDetail = itemsDetail;
        this.ownerName = ownerName;
        this.storageName = storageName;
        this.borrowed = borrowed;
        this.returned = returned;
        this.userName = userName;
        this.whereUse = whereUse;
        this.whenUse = whenUse;
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

    public Boolean getBorrowed() {
        return borrowed;
    }
    public void setBorrowed(Boolean borrowed) {
        this.borrowed = borrowed;
    }

    public Boolean getReturned() {
        return returned;
    }
    public void setReturned(Boolean returned) {
        this.returned = returned;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getWhereUse() {
        return whereUse;
    }
    public void setWhereUse(String whereUse) {
        this.whereUse = whereUse;
    }

    public String getWhenUse() {
        return whenUse;
    }
    public void setWhenUse(String whenUse) {
        this.whenUse = whenUse;
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
        result = prime * result + ((borrowed == null) ? 0 : borrowed.hashCode());
        result = prime * result + ((returned == null) ? 0 : returned.hashCode());
        result = prime * result + ((userName == null) ? 0 : userName.hashCode());
        result = prime * result + ((whereUse == null) ? 0 : whereUse.hashCode());
        result = prime * result + ((whenUse == null) ? 0 : whenUse.hashCode());
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
        if (borrowed == null) {
            if (other.borrowed != null)
                return false;
        } else if (!borrowed.equals(other.borrowed))
            return false;

        if (returned == null) {
            if (other.returned != null)
                return false;
        } else if (!returned.equals(other.returned))
            return false;
        
        if (userName == null) {
            if (other.userName != null)
                return false;
        } else if (!userName.equals(other.userName))
            return false;
        if (whereUse == null) {
            if (other.whereUse != null)
                return false;
        } else if (!whereUse.equals(other.whereUse))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        } else if (!status.equals(other.status))
            return false;
        if (whenUse == null) {
            if (other.whenUse != null)
                return false;
        } else if (!whenUse.equals(other.whenUse))
            return false;
        return true;
    }
    
    @Override
    public String toString() {
        return "Storage [id=" + id + ", itemsDetail=" + itemsDetail + ", ownerName=" + ownerName + ", storageName="
                + storageName + ", borrowed=" + borrowed + ", returned=" + returned + ", userName=" + userName + ", whereUse=" + whereUse + ", when=" + whenUse + ", status=" + status + "]";
    }
}