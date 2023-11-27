package com.company.clinic.service;

import com.company.clinic.entity.Consumable;
import com.company.clinic.entity.Visit;
import com.haulmont.cuba.core.global.Configuration;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.math.BigDecimal;

@Service(VisitService.NAME)
public class VisitServiceBean implements VisitService {

    @Override
    public BigDecimal calculateAmount(Visit visit) {

        BigDecimal amount = BigDecimal.ZERO;

        if (visit.getHoursSpent() != null) {
            amount = amount.add(BigDecimal.valueOf(visit.getHoursSpent())).multiply(visit.getVeterinarian().getHourlyRate());
        }

        if (visit.getConsumables() != null) {
            for (Consumable consumable : visit.getConsumables()) {
                amount = amount.add(consumable.getPrice());
            }
        }

        return amount;
    }

}