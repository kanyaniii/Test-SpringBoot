package dev.danvega.test_springboot.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "sso_user_test")
public class ssoEntity {

    @Id
    @Column(name = "request_date", nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")  // แปลงString ไปเป็น LocalDateTime
    private LocalDateTime requestDate;

    @Column(name = "ssotype", length = 50)
    @JsonProperty("ssotype")
    private String ssoType;

    @Column(name = "systemid", length = 50)
    @JsonProperty("systemid")
    private String systemId;

    @Column(name = "systemname", length = 250)
    @JsonProperty("systemname")
    private String systemName;

    @Column(name = "systemtransactions", length = 250)
    @JsonProperty("systemtransactions")
    private String systemTransactions;

    @Column(name = "systemprivileges", length = 250)
    @JsonProperty("systemprivileges")
    private String systemPrivileges;

    @Column(name = "systemusergroup", length = 50)
    @JsonProperty("systemusergroup")
    private String systemUserGroup;

    @Column(name = "systemlocationgroup", length = 50)
    @JsonProperty("systemlocationgroup")
    private String systemLocationGroup;

    @Column(name = "userid", length = 200)
    @JsonProperty("userid")
    private String userId;

    @Column(name = "userfullname", length = 500)
    @JsonProperty("userfullname")
    private String userFullName;

    @Column(name = "userrdofficecode", length = 250)
    @JsonProperty("userrdofficecode")
    private String userRdOfficeCode;

    @Column(name = "userofficecode", length = 250)
    @JsonProperty("userofficecode")
    private String userOfficeCode;

    @Column(name = "clientlocation", length = 250)
    @JsonProperty("clientlocation")
    private String clientLocation;

    @Column(name = "locationmachinenumber", length = 500)
    @JsonProperty("locationmachinenumber")
    private String locationMachineNumber;

    @Column(name = "tokenid", length = 1000)
    @JsonProperty("tokenid")
    private String tokenId;


    public LocalDateTime getRequestDate() {
        return requestDate;
    }
    public void setRequestDate(LocalDateTime requestDate) {
        this.requestDate = requestDate;
    }

    public String getSsoType() {
        return ssoType;
    }
    public void setSsoType(String ssoType) {
        this.ssoType = ssoType;
    }

    public String getSystemId() {
        return systemId;
    }
    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getSystemName() {
        return systemName;
    }
    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getSystemTransactions() {
        return systemTransactions;
    }
    public void setSystemTransactions(String systemTransactions) {
        this.systemTransactions = systemTransactions;
    }

    public String getSystemPrivileges() {
        return systemPrivileges;
    }
    public void setSystemPrivileges(String systemPrivileges) {
        this.systemPrivileges = systemPrivileges;
    }

    public String getSystemUserGroup() {
        return systemUserGroup;
    }
    public void setSystemUserGroup(String systemUserGroup) {
        this.systemUserGroup = systemUserGroup;
    }

    public String getSystemLocationGroup() {
        return systemLocationGroup;
    }
    public void setSystemLocationGroup(String systemLocationGroup) {
        this.systemLocationGroup = systemLocationGroup;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserFullName() {
        return userFullName;
    }
    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getUserRdOfficeCode() {
        return userRdOfficeCode;
    }
    public void setUserRdOfficeCode(String userRdOfficeCode) {
        this.userRdOfficeCode = userRdOfficeCode;
    }

    public String getUserOfficeCode() {
        return userOfficeCode;
    }
    public void setUserOfficeCode(String userOfficeCode) {
        this.userOfficeCode = userOfficeCode;
    }

    public String getClientLocation() {
        return clientLocation;
    }
    public void setClientLocation(String clientLocation) {
        this.clientLocation = clientLocation;
    }

    public String getLocationMachineNumber() {
        return locationMachineNumber;
    }
    public void setLocationMachineNumber(String locationMachineNumber) {
        this.locationMachineNumber = locationMachineNumber;
    }

    public String getTokenId() {
        return tokenId;
    }
    public void setTokenId(String tokenId) {

        this.tokenId = tokenId;
    }
}
