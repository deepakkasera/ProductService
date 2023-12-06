CREATE TABLE some_model
(
    id BINARY(16) NOT NULL,
    CONSTRAINT pk_somemodel PRIMARY KEY (id)
);

ALTER TABLE product
    ADD inventory_count INT NULL;

ALTER TABLE product
    MODIFY inventory_count INT NOT NULL;