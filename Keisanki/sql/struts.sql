set names utf8;
set foreign_key_checks = 0;
drop database if exists keisankidb;
create database keisankidb;
use keisankidb;

create table user(
varchar(255),
id int
)