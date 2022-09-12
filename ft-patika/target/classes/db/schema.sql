/*
create table user_account(
    ID BIGINT not null auto_increment,
    email CHARACTER varying(50),
    first_name CHARACTER varying(50),
    last_name CHARACTER varying(50),
    number CHARACTER varying(15),
    primary key (ID)
);
create table product_comment(
    ID BIGINT not null auto_increment,
    comment CHARACTER varying(500),
    comment_date Date,
    product_id BIGINT,
    user_id BIGINT,
    primary key(ID)
);
create table product(
    ID BIGINT not null auto_increment,
    last_use_day Date,
    name CHARACTER varying(50),
    price double precision,
    primary key(ID)
)
 */
/*
 alter table product_comment
    add foreign key (user_id)
    references user(id)
 */