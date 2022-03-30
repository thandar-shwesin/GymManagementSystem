/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnessgym;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TSS
 */
@Entity
@Table(name = "memberdatas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Memberdatas.findAll", query = "SELECT m FROM Memberdatas m"),
    @NamedQuery(name = "Memberdatas.findById", query = "SELECT m FROM Memberdatas m WHERE m.id = :id"),
    @NamedQuery(name = "Memberdatas.findByName", query = "SELECT m FROM Memberdatas m WHERE m.name = :name"),
    @NamedQuery(name = "Memberdatas.findByBirthday", query = "SELECT m FROM Memberdatas m WHERE m.birthday = :birthday"),
    @NamedQuery(name = "Memberdatas.findByPhoneNo", query = "SELECT m FROM Memberdatas m WHERE m.phoneNo = :phoneNo"),
    @NamedQuery(name = "Memberdatas.findByAddress", query = "SELECT m FROM Memberdatas m WHERE m.address = :address"),
    @NamedQuery(name = "Memberdatas.findByGender", query = "SELECT m FROM Memberdatas m WHERE m.gender = :gender"),
    @NamedQuery(name = "Memberdatas.findByFacebookAcc", query = "SELECT m FROM Memberdatas m WHERE m.facebookAcc = :facebookAcc"),
    @NamedQuery(name = "Memberdatas.findBySubscription", query = "SELECT m FROM Memberdatas m WHERE m.subscription = :subscription"),
    @NamedQuery(name = "Memberdatas.findByAmount", query = "SELECT m FROM Memberdatas m WHERE m.amount = :amount"),
    @NamedQuery(name = "Memberdatas.findByAmountStatus", query = "SELECT m FROM Memberdatas m WHERE m.amountStatus = :amountStatus"),
    @NamedQuery(name = "Memberdatas.findByPendingAmount", query = "SELECT m FROM Memberdatas m WHERE m.pendingAmount = :pendingAmount"),
    @NamedQuery(name = "Memberdatas.findByStartDate", query = "SELECT m FROM Memberdatas m WHERE m.startDate = :startDate"),
    @NamedQuery(name = "Memberdatas.findByEndDate", query = "SELECT m FROM Memberdatas m WHERE m.endDate = :endDate"),
    @NamedQuery(name = "Memberdatas.findByFacility", query = "SELECT m FROM Memberdatas m WHERE m.facility = :facility"),
    @NamedQuery(name = "Memberdatas.findByTotalBill", query = "SELECT m FROM Memberdatas m WHERE m.totalBill = :totalBill"),
    @NamedQuery(name = "Memberdatas.findByMemberID", query = "SELECT m FROM Memberdatas m WHERE m.memberID = :memberID"),
    @NamedQuery(name = "Memberdatas.findByTrainer", query = "SELECT m FROM Memberdatas m WHERE m.trainer = :trainer")})
public class Memberdatas implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "id")
    private int id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Birthday")
    private String birthday;
    @Column(name = "PhoneNo")
    private String phoneNo;
    @Column(name = "Address")
    private String address;
    @Basic(optional = false)
    @Column(name = "Gender")
    private String gender;
    @Basic(optional = false)
    @Column(name = "FacebookAcc")
    private String facebookAcc;
    @Basic(optional = false)
    @Column(name = "Subscription")
    private String subscription;
    @Column(name = "Amount")
    private Integer amount;
    @Column(name = "AmountStatus")
    private String amountStatus;
    @Column(name = "PendingAmount")
    private Integer pendingAmount;
    @Column(name = "StartDate")
    private String startDate;
    @Column(name = "EndDate")
    private String endDate;
    @Column(name = "Facility")
    private String facility;
    @Column(name = "TotalBill")
    private Integer totalBill;
    @Id
    @Basic(optional = false)
    @Column(name = "MemberID")
    private String memberID;
    @Column(name = "Trainer")
    private String trainer;

    public Memberdatas() {
    }

    public Memberdatas(String memberID) {
        this.memberID = memberID;
    }

    public Memberdatas(String memberID, int id, String gender, String facebookAcc, String subscription) {
        this.memberID = memberID;
        this.id = id;
        this.gender = gender;
        this.facebookAcc = facebookAcc;
        this.subscription = subscription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        int oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        String oldBirthday = this.birthday;
        this.birthday = birthday;
        changeSupport.firePropertyChange("birthday", oldBirthday, birthday);
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        String oldPhoneNo = this.phoneNo;
        this.phoneNo = phoneNo;
        changeSupport.firePropertyChange("phoneNo", oldPhoneNo, phoneNo);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public String getFacebookAcc() {
        return facebookAcc;
    }

    public void setFacebookAcc(String facebookAcc) {
        String oldFacebookAcc = this.facebookAcc;
        this.facebookAcc = facebookAcc;
        changeSupport.firePropertyChange("facebookAcc", oldFacebookAcc, facebookAcc);
    }

    public String getSubscription() {
        return subscription;
    }

    public void setSubscription(String subscription) {
        String oldSubscription = this.subscription;
        this.subscription = subscription;
        changeSupport.firePropertyChange("subscription", oldSubscription, subscription);
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        Integer oldAmount = this.amount;
        this.amount = amount;
        changeSupport.firePropertyChange("amount", oldAmount, amount);
    }

    public String getAmountStatus() {
        return amountStatus;
    }

    public void setAmountStatus(String amountStatus) {
        String oldAmountStatus = this.amountStatus;
        this.amountStatus = amountStatus;
        changeSupport.firePropertyChange("amountStatus", oldAmountStatus, amountStatus);
    }

    public Integer getPendingAmount() {
        return pendingAmount;
    }

    public void setPendingAmount(Integer pendingAmount) {
        Integer oldPendingAmount = this.pendingAmount;
        this.pendingAmount = pendingAmount;
        changeSupport.firePropertyChange("pendingAmount", oldPendingAmount, pendingAmount);
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        String oldStartDate = this.startDate;
        this.startDate = startDate;
        changeSupport.firePropertyChange("startDate", oldStartDate, startDate);
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        String oldEndDate = this.endDate;
        this.endDate = endDate;
        changeSupport.firePropertyChange("endDate", oldEndDate, endDate);
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        String oldFacility = this.facility;
        this.facility = facility;
        changeSupport.firePropertyChange("facility", oldFacility, facility);
    }

    public Integer getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(Integer totalBill) {
        Integer oldTotalBill = this.totalBill;
        this.totalBill = totalBill;
        changeSupport.firePropertyChange("totalBill", oldTotalBill, totalBill);
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        String oldMemberID = this.memberID;
        this.memberID = memberID;
        changeSupport.firePropertyChange("memberID", oldMemberID, memberID);
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        String oldTrainer = this.trainer;
        this.trainer = trainer;
        changeSupport.firePropertyChange("trainer", oldTrainer, trainer);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (memberID != null ? memberID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Memberdatas)) {
            return false;
        }
        Memberdatas other = (Memberdatas) object;
        if ((this.memberID == null && other.memberID != null) || (this.memberID != null && !this.memberID.equals(other.memberID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fitnessgym.Memberdatas[ memberID=" + memberID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
