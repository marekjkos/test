/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author marek.kos
 */
@Entity
public class Certificate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private ArrayList idLstStr;

    /**
     * Get the value of idLstStr
     *
     * @return the value of idLstStr
     */
    public ArrayList getIdLstStr() {
        return idLstStr;
    }

    /**
     * Set the value of idLstStr
     *
     * @param idLstStr new value of idLstStr
     */
    public void setIdLstStr(ArrayList idLstStr) {
        this.idLstStr = idLstStr;
    }

    private Boolean certified;

    /**
     * Get the value of certified
     *
     * @return the value of certified
     */
    public Boolean getCertified() {
        return certified;
    }

    /**
     * Set the value of certified
     *
     * @param certified new value of certified
     */
    public void setCertified(Boolean certified) {
        this.certified = certified;
    }

    private int idInfoHash = 0;

    /**
     * Get the value of idInfoHash
     *
     * @return the value of idInfoHash
     */
    public int getIdInfoHash() {
        return idInfoHash;
    }
    
    /**
     * Set the value of idInfoHash
     *
     * @param idInfoHash new value of idInfoHash
     * @return the value of newly calculated  idInfoHash
     */
    public int refreshIdInfoHash() {
        int lstHash = this.idLstStr.hashCode();
        return this.idInfoHash = lstHash;
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
        if (!(object instanceof Certificate)) {
            return false;
        }
        Certificate other = (Certificate) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Certificate[ id=" + id + " ]";
    }
    
}
