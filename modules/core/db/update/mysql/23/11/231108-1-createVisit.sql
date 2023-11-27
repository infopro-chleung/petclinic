create table CLINIC_VISIT (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    PET_ID varchar(32) not null,
    VETERINARIAN_ID varchar(32) not null,
    DATE_ datetime(3) not null,
    DESCRIPTION longtext,
    HOURS_SPENT integer,
    AMOUNT decimal(19, 2) not null,
    --
    primary key (ID)
);