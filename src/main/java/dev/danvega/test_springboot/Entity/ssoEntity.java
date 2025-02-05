package dev.danvega.test_springboot.Entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "sso_user_test")
public class ssoEntity {
    @Id
    @Column(name = "request_date", nullable = false)
    private LocalDateTime requestDate;

    @Column(name = "ssotype", length = 50)
    private String ssoType;

    @Column(name = "systemid", length = 50)
    private String systemId;

    @Column(name = "systemname", length = 250)
    private String systemName;

    @Column(name = "systemtransactions", length = 250)
    private String systemTransactions;

    @Column(name = "systemprivileges", length = 250)
    private String systemPrivileges;

    @Column(name = "systemusergroup", length = 50)
    private String systemUserGroup;

    @Column(name = "systemlocationgroup", length = 50)
    private String systemLocationGroup;

    @Column(name = "userid", length = 200)
    private String userId;

    @Column(name = "userfullname", length = 500)
    private String userFullName;

    @Column(name = "userrdofficecode", length = 250)
    private String userRdOfficeCode;

    @Column(name = "userofficecode", length = 250)
    private String userOfficeCode;

    @Column(name = "clientlocation", length = 250)
    private String clientLocation;

    @Column(name = "locationmachinenumber", length = 500)
    private String locationMachineNumber;

    @Column(name = "tokenid", length = 1000)
    private String tokenId;

    public LocalDateTime getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(LocalDateTime requestDate) {
        this.requestDate = requestDate;
    }

}
