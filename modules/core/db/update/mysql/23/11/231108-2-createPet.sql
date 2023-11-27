alter table CLINIC_PET add constraint FK_CLINIC_PET_ON_TYPE foreign key (TYPE_ID) references CLINIC_PET_TYPE(ID);
alter table CLINIC_PET add constraint FK_CLINIC_PET_ON_OWNER foreign key (OWNER_ID) references CLINIC_OWNER(ID);
create index IDX_CLINIC_PET_ON_TYPE on CLINIC_PET (TYPE_ID);
create index IDX_CLINIC_PET_ON_OWNER on CLINIC_PET (OWNER_ID);
