

-- Sequencia usada pelo @GeneratedValue(strategy = GenerationType.AUTO)
-- O Hibernate procura "product_seq" e reserva IDs de 50 em 50
CREATE SEQUENCE product_seq START WITH 1 INCREMENT BY 50;

-- Tabela baseada na entidade Product.java
CREATE TABLE Product (
    ID     INTEGER      NOT NULL PRIMARY KEY,  -- private Integer id
    Name   VARCHAR(255) NOT NULL,              -- private String name
    Price  BIGINT       NOT NULL               -- private long price
);
