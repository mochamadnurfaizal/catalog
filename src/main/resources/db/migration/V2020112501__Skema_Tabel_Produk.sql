create table product (
    id varchar(36),
    code varchar(100) not null,
    name varchar(255) not null,
    primary key (id),
    unique (code)
);

create table product_picture(
    id varchar(36),
    id_product varchar(36) not null,
    filename varchar(255) not null,
    primary key(id),
    foreign key (id_product) references product
);