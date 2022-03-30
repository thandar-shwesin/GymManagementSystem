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
@Table(name = "trainerdata")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trainerdata.findAll", query = "SELECT t FROM Trainerdata t"),
    @NamedQuery(name = "Trainerdata.findById", query = "SELECT t FROM Trainerdata t WHERE t.id = :id"),
    @NamedQuery(name = "Trainerdata.findByName", query = "SELECT t FROM Trainerdata t WHERE t.name = :name"),
    @NamedQuery(name = "Trainerdata.findByBirthday", query = "SELECT t FROM Trainerdata t WHERE t.birthday = :birthday"),
    @NamedQuery(name = "Trainerdata.findByAddress", query = "SELECT t FROM Trainerdata t WHERE t.address = :address"),
    @NamedQuery(name = "Trainerdata.findByPhoneNo", query = "SELECT t FROM Trainerdata t WHERE t.phoneNo = :phoneNo"),
    @NamedQuery(name = "Trainerdata.findByGender", query = "SELECT t FROM Trainerdata t WHERE t.gender = :gender"),
    @NamedQuery(name = "Trainerdata.findByStartDate", query = "SELECT t FROM Trainerdata t WHERE t.startDate = :startDate"),
    @NamedQuery(name = "Trainerdata.findByTid", query = "SELECT t FROM Trainerdata t WHERE t.tid = :tid")})
public class Trainerdata implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Birthday")
    private String birthday;
    @Column(name = "Address")
    private String address;
    @Column(name = "PhoneNo")
    private String phoneNo;
    @Column(name = "Gender")
    private String gender;
    @Column(name = "StartDate")
    private String startDate;
    @Column(name = "TID")
    private String tid;

    public Trainerdata() {
    }

    public Trainerdata(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        String oldPhoneNo = this.phoneNo;
        this.phoneNo = phoneNo;
        changeSupport.firePropertyChange("phoneNo", oldPhoneNo, phoneNo);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        String oldStartDate = this.startDate;
        this.startDate = startDate;
        changeSupport.firePropertyChange("startDate", oldStartDate, startDate);
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        String oldTid = this.tid;
        this.tid = tid;
        changeSupport.firePropertyChange("tid", oldTid, tid);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trainerdata)) {
            return false;
        }
        Trainerdata other = (Trainerdata) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        //return "fitnessgym.Trainerdata[ id=" + id + " ]";
        return name;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
