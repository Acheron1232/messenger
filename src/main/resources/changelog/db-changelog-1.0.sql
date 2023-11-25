--liquibase formatted sql

--changeset acheron:1
create table users(
    id serial primary key ,
    username text not null,
    email text not null unique ,
    first_name text,
    last_name text,
    registration_date date
)