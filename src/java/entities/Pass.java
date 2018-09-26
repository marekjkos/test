/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.ZonedDateTime;

/**
 *
 * @author marek.kos
 */
@Entity
public class Pass implements Serializable {

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

    private String category;

    /**
     * Get the value of category
     *
     * @return the value of category
     */
    public String getCategory() {
        return category;
    }

    /**
     * Set the value of category
     *
     * @param category new value of category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    private String name;

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    private String type;

    /**
     * Get the value of type
     *
     * @return the value of type
     */
    public String getType() {
        return type;
    }

    /**
     * Set the value of type
     *
     * @param type new value of type
     */
    public void setType(String type) {
        this.type = type;
    }

    private Long  certificateID;

    /**
     * Get the value of certificateID
     *
     * @return the value of certificateID
     */
    public Long  getCertificateID() {
        return certificateID;
    }

    /**
     * Set the value of certificateID
     *
     * @param certificateID new value of certificateID
     */
    public void setCertificateID(Long  certificateID) {
        this.certificateID = certificateID;
    }
    
    
    private String authorizationKey;

    /**
     * Get the value of authorizationKey
     *
     * @return the value of authorizationKey
     */
    public String getAuthorizationKey() {
        return authorizationKey;
    }

    /**
     * Set the value of authorizationKey
     *
     * @param authorizationKey new value of authorizationKey
     */
    public void setAuthorizationKey(String authorizationKey) {
        this.authorizationKey = authorizationKey;
    }
    
    
    private String authenticationMethod;

    /**
     * Get the value of authenticationMethod
     *
     * @return the value of authenticationMethod
     */
    public String getAuthenticationMethod() {
        return authenticationMethod;
    }

    /**
     * Set the value of authenticationMethod
     *
     * @param authenticationMethod new value of authenticationMethod
     */
    public void setAuthenticationMethod(String authenticationMethod) {
        this.authenticationMethod = authenticationMethod;
    }
    
    
    private Long  poolID;

    /**
     * Get the value of poolID
     *
     * @return the value of poolID
     */
    public Long  getPoolID() {
        return poolID;
    }

    /**
     * Set the value of poolID
     *
     * @param poolID new value of poolID
     */
    public void setPoolID(Long  poolID) {
        this.poolID = poolID;
    }
    
    
    private Integer useageCount;

    /**
     * Get the value of useageCount
     *
     * @return the value of useageCount
     */
    public Integer getUseageCount() {
        return useageCount;
    }

    /**
     * Set the value of useageCount
     *
     * @param useageCount new value of useageCount
     */
    public void setUseageCount(Integer useageCount) {
        this.useageCount = useageCount;
    }
    
    
    private ZonedDateTime creationDate;

    /**
     * Get the value of creationDate
     *
     * @return the value of creationDate
     */
    public ZonedDateTime getCreationDate() {
        return creationDate;
    }

    /**
     * Set the value of creationDate
     *
     * @param creationDate new value of creationDate
     */
    public void setCreationDate(ZonedDateTime creationDate) {
        this.creationDate = creationDate;
    }
    
    
    private ZonedDateTime terminationDate;

    /**
     * Get the value of terminationDate
     *
     * @return the value of terminationDate
     */
    public ZonedDateTime getTerminationDate() {
        return terminationDate;
    }

    /**
     * Set the value of terminationDate
     *
     * @param terminationDate new value of terminationDate
     */
    public void setTerminationDate(ZonedDateTime terminationDate) {
        this.terminationDate = terminationDate;
    }
    
    
    private Integer minutesRemaining;

    /**
     * Get the value of minutesRemaining
     *
     * @return the value of minutesRemaining
     */
    public Integer getMinutesRemaining() {
        return minutesRemaining;
    }

    /**
     * Set the value of minutesRemaining
     *
     * @param minutesRemaining new value of minutesRemaining
     */
    public void setMinutesRemaining(Integer minutesRemaining) {
        this.minutesRemaining = minutesRemaining;
    }
    
    
    private Integer priorityLevel;

    /**
     * Get the value of priorityLevel
     *
     * @return the value of priorityLevel
     */
    public Integer getPriorityLevel() {
        return priorityLevel;
    }

    /**
     * Set the value of priorityLevel
     *
     * @param priorityLevel new value of priorityLevel
     */
    public void setPriorityLevel(Integer priorityLevel) {
        this.priorityLevel = priorityLevel;
    }
    
    
    private Integer securityLevel;

    /**
     * Get the value of securityLevel
     *
     * @return the value of securityLevel
     */
    public Integer getSecurityLevel() {
        return securityLevel;
    }

    /**
     * Set the value of securityLevel
     *
     * @param securityLevel new value of securityLevel
     */
    public void setSecurityLevel(Integer securityLevel) {
        this.securityLevel = securityLevel;
    }
    
    
    private Integer clientVersion;

    /**
     * Get the value of clientVersion
     *
     * @return the value of clientVersion
     */
    public Integer getClientVersion() {
        return clientVersion;
    }

    /**
     * Set the value of clientVersion
     *
     * @param clientVersion new value of clientVersion
     */
    public void setClientVersion(Integer clientVersion) {
        this.clientVersion = clientVersion;
    }
    
    
    private Integer licensorVersion;

    /**
     * Get the value of licensorVersion
     *
     * @return the value of licensorVersion
     */
    public Integer getLicensorVersion() {
        return licensorVersion;
    }

    /**
     * Set the value of licensorVersion
     *
     * @param licensorVersion new value of licensorVersion
     */
    public void setLicensorVersion(Integer licensorVersion) {
        this.licensorVersion = licensorVersion;
    }
    
    
    private Integer passSystemVersion;

    /**
     * Get the value of passSystemVersion
     *
     * @return the value of passSystemVersion
     */
    public Integer getPassSystemVersion() {
        return passSystemVersion;
    }

    /**
     * Set the value of passSystemVersion
     *
     * @param passSystemVersion new value of passSystemVersion
     */
    public void setPassSystemVersion(Integer passSystemVersion) {
        this.passSystemVersion = passSystemVersion;
    }
    
    
    private Integer authKeyVersion;

    /**
     * Get the value of authKeyVersion
     *
     * @return the value of authKeyVersion
     */
    public Integer getAuthKeyVersion() {
        return authKeyVersion;
    }

    /**
     * Set the value of authKeyVersion
     *
     * @param authKeyVersion new value of authKeyVersion
     */
    public void setAuthKeyVersion(Integer authKeyVersion) {
        this.authKeyVersion = authKeyVersion;
    }
    
    
    private boolean enabled;

    /**
     * Get the value of enabled
     *
     * @return the value of enabled
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Set the value of enabled
     *
     * @param enabled new value of enabled
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    
    
    private String strField1;

    /**
     * Get the value of strField1
     *
     * @return the value of strField1
     */
    public String getStrField1() {
        return strField1;
    }

    /**
     * Set the value of strField1
     *
     * @param strField1 new value of strField1
     */
    public void setStrField1(String strField1) {
        this.strField1 = strField1;
    }
    
    
    private String strFieldEnc1;

    /**
     * Get the value of strFieldEnc1
     *
     * @return the value of strFieldEnc1
     */
    public String getStrFieldEnc1() {
        return strFieldEnc1;
    }

    /**
     * Set the value of strFieldEnc1
     *
     * @param strFieldEnc1 new value of strFieldEnc1
     */
    public void setStrFieldEnc1(String strFieldEnc1) {
        this.strFieldEnc1 = strFieldEnc1;
    }    
    
    private Long  clientID;

    /**
     * Get the value of clientID
     *
     * @return the value of clientID
     */
    public Long  getClientID() {
        return clientID;
    }

    /**
     * Set the value of clientID
     *
     * @param clientID new value of clientID
     */
    public void setClientID(Long  clientID) {
        this.clientID = clientID;
    }
    
    
    private Long  userID;

    /**
     * Get the value of userID
     *
     * @return the value of userID
     */
    public Long  getUserID() {
        return userID;
    }

    /**
     * Set the value of userID
     *
     * @param userID new value of userID
     */
    public void setUserID(Long  userID) {
        this.userID = userID;
    }
    
    
    private Long  licensorID;

    /**
     * Get the value of licensorID
     *
     * @return the value of licensorID
     */
    public Long  getLicensorID() {
        return licensorID;
    }

    /**
     * Set the value of licensorID
     *
     * @param licensorID new value of licensorID
     */
    public void setLicensorID(Long  licensorID) {
        this.licensorID = licensorID;
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
        if (!(object instanceof Pass)) {
            return false;
        }
        Pass other = (Pass) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Pass[ id=" + id + " ]";
    }
    
}
