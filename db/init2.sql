create database if not exists student_card2 ;
use student_card2;
drop table  if exists login;
drop table if exists stu_info;
create table login (
    id varchar(30) primary key not null ,
    password varchar(64) not null,
    identity smallint not null
);

create table stu_info(
    id varchar(30) primary key not null ,
    name varchar(30) not null ,
    grade smallint,
    signature varchar (64),
    apartment varchar(20)
);

create table picture (
    id bigint primary key auto_increment,
    link text,
    stud_id varchar(30),
    describe varchar(64),
    foreign key (stud_id) references stu_info(id)
);

insert into picture (link) VALUE ('https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1593065531142&di=d52fe4c957e81e98c8111a001c6687ae&imgtype=0&src=http%3A%2F%2Ft8.baidu.com%2Fit%2Fu%3D1484500186%2C1503043093%26fm%3D79%26app%3D86%26f%3DJPEG%3Fw%3D1280%26h%3D853');
insert into stu_info (id, name, grade, signature, apartment)
VALUE ('2017','小白',3,'我就是我，不一样的。。。我','1130');