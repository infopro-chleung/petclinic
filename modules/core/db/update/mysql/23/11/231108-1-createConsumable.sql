create table CLINIC_CONSUMABLE (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    TITLE varchar(255) not null,
    DESCRIPTION longtext,
    PRICE decimal(19, 2) not null,
    --
    primary key (ID)
);