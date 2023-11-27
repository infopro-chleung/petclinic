package com.company.clinic.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Table(name = "CLINIC_VETERINARIAN")
@Entity(name = "clinic_Veterinarian")
@NamePattern("%s|user")
public class Veterinarian extends StandardEntity {
    private static final long serialVersionUID = -1697124390525627693L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_ID")
    private User user;

    @NotNull
    @Column(name = "HOURLY_RATE", nullable = false)
    @DecimalMin("1")
    @DecimalMax("20")
    private BigDecimal hourlyRate;

    public BigDecimal getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(BigDecimal hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}