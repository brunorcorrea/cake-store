CREATE DATABASE cakestore;

CREATE USER 'cakestore'@'%' IDENTIFIED BY 'cakestore';

GRANT ALL PRIVILEGES ON cakestore.* TO 'cakestore'@'%';