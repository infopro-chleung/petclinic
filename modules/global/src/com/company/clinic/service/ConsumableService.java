package com.company.clinic.service;

import com.company.clinic.entity.Consumable;

import java.util.List;

public interface ConsumableService {
    String NAME = "clinic_ConsumableService";

    List<Consumable> getUsedConsumables();
}