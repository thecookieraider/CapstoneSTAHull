package capstonezz.Database;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * @author Zachary Zoltek
 * @version 1.0
 * @since May 9, 2016
 */

@Entity
@Table(name = "phone_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PhoneType.findAll", query = "SELECT p FROM PhoneType p"),
    @NamedQuery(name = "PhoneType.findByPhoneType", query = "SELECT p FROM PhoneType p WHERE p.phoneType = :phoneType")})
public class PhoneType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Phone_Type")
    private String phoneType;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "phoneType", fetch = FetchType.EAGER)
    private List<Contact> contactList;

    public PhoneType() {
    }

    public PhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    @XmlTransient
    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (phoneType != null ? phoneType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PhoneType)) {
            return false;
        }
        PhoneType other = (PhoneType) object;
        if ((this.phoneType == null && other.phoneType != null) || (this.phoneType != null && !this.phoneType.equals(other.phoneType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "capstonezz.Database.PhoneType[ phoneType=" + phoneType + " ]";
    }

}
