CREATE DATABASE InmobiliariaTap;

CREATE TABLE inmuebles (
    idc CHARACTER VARYING (4),
    municipio CHARACTER VARYING (30) NOT NULL,
    colonia CHARACTER VARYING (30) NOT NULL,
    codigoPostal CHARACTER VARYING (5) NOT NULL,
    precio NUMERIC (12,2) NOT NULL,
    imagen CHARACTER VARYING (60) NOT NULL,


    CONSTRAINT pk_inmueble_idc PRIMARY KEY (idc)
);

INSERT INTO 
    inmuebles (idc, municipio, colonia, codigoPostal, precio, imagen) 
VALUES ('C310', 'Tapachula', 'Fraccionamiento Las Vegas', '30798',
         800000, '/img/casa1.jpg');
