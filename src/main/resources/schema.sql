create table if not exists member (
    seq int auto_increment primary key,
    id varchar(255) unique ,
    name varchar(255) not null,
    password varchar(255) not null,
    role varchar(255) not null,
    address varchar(255),
    telno varchar(255) ,
    email varchar(255) ,
    use_yn char(1) not null default 'Y'
);


create table login_log (
    seq int auto_increment primary key,
    id varchar(255) not null,
    ip varchar(255),
    login_status char(1) not_null,
    login_dttm datetime CURRENT_TIMESTAMP
);