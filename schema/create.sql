CREATE SEQUENCE hibernate_sequence start 1 increment 1;

CREATE TABLE comment
(
    id       int8 not null,
    text     varchar(255),
    guide_id int8,
    user_id  int8,
    primary key (id)
);

CREATE TABLE guide_entity
(
    id               int8 not null,
    likes            int8,
    author_id        int8 not null,
    city_location_id int8 not null,
    primary key (id)
);

CREATE TABLE location
(
    id  int8 not null,
    lat int8,
    lon int8,
    primary key (id)
);

CREATE TABLE step
(
    id          int8 not null,
    description varchar(255),
    guide_id    int8,
    location_id int8,
    primary key (id)
);

CREATE TABLE users
(
    id                int8 not null,
    registration_date timestamp,
    username          varchar(255),
    primary key (id)
);

ALTER TABLE users
    ADD CONSTRAINT UK_r43af9ap4edm43mmtq01oddj6 unique (username);

ALTER TABLE comment
    ADD CONSTRAINT FKc7kjc13r9l9wat4puluuktxt0 FOREIGN KEY (guide_id) REFERENCES guide_entity;

ALTER TABLE comment
    ADD CONSTRAINT FKqm52p1v3o13hy268he0wcngr5 FOREIGN KEY (user_id) REFERENCES users;

ALTER TABLE guide_entity
    ADD CONSTRAINT FKblnocu6x9sw5mshbgxuvytvi3 FOREIGN KEY (author_id) REFERENCES users;

ALTER TABLE guide_entity
    ADD CONSTRAINT FKl3b52pinvqw0q454r5ncjmb8f FOREIGN KEY (city_location_id) REFERENCES location;

ALTER TABLE step
    ADD CONSTRAINT FKlr1j0qt5us402adw5d70tftq5 FOREIGN KEY (guide_id) REFERENCES guide_entity;

ALTER TABLE step
    ADD CONSTRAINT FK908yex1n3gwdnwkoxokcxywxb FOREIGN KEY (location_id) REFERENCES location;