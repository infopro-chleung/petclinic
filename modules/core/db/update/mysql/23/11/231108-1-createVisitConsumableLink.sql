create table CLINIC_VISIT_CONSUMABLE_LINK (
    VISIT_ID varchar(32),
    CONSUMABLE_ID varchar(32),
    primary key (VISIT_ID, CONSUMABLE_ID)
);
