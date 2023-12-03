INSERT INTO TIPOMOV (nom_tipomov, estado_tipomov) VALUES('Actualización de precios','A');
INSERT INTO TIPOMOV (nom_tipomov, estado_tipomov) VALUES('Ingreso por Compras','A');
INSERT INTO TIPOMOV (nom_tipomov, estado_tipomov) VALUES('Entrada por Ajuste','A');
INSERT INTO TIPOMOV (nom_tipomov, estado_tipomov) VALUES('Salida por Ajuste','A');
INSERT INTO TIPOMOV (nom_tipomov, estado_tipomov) VALUES('Ventas Crédito','A');
INSERT INTO TIPOMOV (nom_tipomov, estado_tipomov) VALUES('Ventas Contado','A');
INSERT INTO TIPOMOV (nom_tipomov, estado_tipomov) VALUES('Ingreso a Bodega','A');
INSERT INTO TIPOMOV (nom_tipomov, estado_tipomov) VALUES('Salida de Bodega','A');

INSERT INTO ROLES (role_name) VALUES ('Gerente');
INSERT INTO ROLES (role_name) VALUES ('Administrativo');
INSERT INTO ROLES (role_name) VALUES ('Director_Comercial'); 
INSERT INTO ROLES (role_name) VALUES ('Comercial');
INSERT INTO ROLES (role_name) VALUES ('Jefe_de_almacen');
INSERT INTO ROLES (role_name) VALUES ('Mozo_de_almacen');
INSERT INTO ROLES (role_name) VALUES ('Mantenimiento');

INSERT INTO OPERACION (operacion_name) VALUES ('Factura');
INSERT INTO OPERACION (operacion_name) VALUES ('Presupuesto');
INSERT INTO OPERACION (operacion_name) VALUES ('Compra');
INSERT INTO OPERACION (operacion_name) VALUES ('Producto');
INSERT INTO OPERACION (operacion_name) VALUES ('Cliente');
INSERT INTO OPERACION (operacion_name) VALUES ('Trabajador');
INSERT INTO OPERACION (operacion_name) VALUES ('Proveedor');
INSERT INTO OPERACION (operacion_name) VALUES ('Nómina');
INSERT INTO OPERACION (operacion_name) VALUES ('Impuestos');
INSERT INTO OPERACION (operacion_name) VALUES ('Ubicación e Incidencias');


INSERT INTO ACCIONES (role_id, operacion_id, create_action, read_action, update_action, delete_action) VALUES
(1, 1, true, true, true, true),
(1, 2, true, true, true, true),
(1, 3, true, true, true, true),
(1, 4, true, true, true, true),
(1, 5, true, true, true, true),
(1, 6, true, true, true, true),
(1, 7, true, true, true, true),
(1, 8, true, true, true, true),
(1, 9, true, true, true, true),
(1, 10, true, true, true, true),

(2, 1, false, true, false, false),
(2, 2, false, true, false, false),
(2, 3, false, true, false, false),
(2, 4, false, true, false, false),
(2, 5, false, true, false, false),
(2, 6, false, true, false, false),
(2, 7, false, true, false, false),
(2, 8, false, true, false, false),
(2, 9, false, true, false, false),
(2, 10, false, true, false, false),

(3, 1, true, true, true, false),
(3, 2, true, true, true, false),
(3, 3, true, true, true, false),
(3, 4, true, true, true, false),
(3, 5, true, true, true, false),
(3, 6, true, true, true, false),
(3, 7, true, true, true, false),
(3, 8, true, true, true, false),
(3, 9, true, true, true, false),
(3, 10, true, true, true, false),

(4, 1, false, true, false, false),
(4, 2, false, true, false, false),
(4, 3, false, true, false, false),
(4, 4, false, true, false, false),
(4, 5, false, true, false, false),
(4, 6, false, true, false, false),
(4, 7, false, true, false, false),
(4, 8, false, true, false, false),
(4, 9, false, true, false, false),
(4, 10, false, true, false, false),

(5, 1, false, true, false, false),
(5, 2, false, true, false, false),
(5, 3, false, true, false, false),
(5, 4, false, true, false, false),
(5, 5, false, true, false, false),
(5, 6, false, true, false, false),
(5, 7, false, true, false, false),
(5, 8, false, true, false, false),
(5, 9, false, true, false, false),
(5, 10, false, true, false, false),

(6, 1, false, true, false, false),
(6, 2, false, true, false, false),
(6, 3, false, true, false, false),
(6, 4, false, true, false, false),
(6, 5, false, true, false, false),
(6, 6, false, true, false, false),
(6, 7, false, true, false, false),
(6, 8, false, true, false, false),
(6, 9, false, true, false, false),
(6, 10, false, true, false, false),

(7, 1, false, true, false, false),
(7, 2, false, true, false, false),
(7, 3, false, true, false, false),
(7, 4, false, true, false, false),
(7, 5, false, true, false, false),
(7, 6, false, true, false, false),
(7, 7, false, true, false, false),
(7, 8, false, true, false, false),
(7, 9, false, true, false, false),
(7, 10, false, true, false, false);

insert into categoria (id_categoria, nom_categoria,estado_categoria) values (1, 'DEPORTES',1);
insert into categoria (id_categoria, nom_categoria,estado_categoria) values (2, 'ELECTRODOMESTICOS',1);
insert into categoria (id_categoria, nom_categoria,estado_categoria) values (3, 'LIMPIEZA',1);
insert into categoria (id_categoria, nom_categoria,estado_categoria) values (4, 'CALZADO',1);
insert into categoria (id_categoria, nom_categoria,estado_categoria) values (5, 'ALIMENTOS',1);
insert into categoria (id_categoria, nom_categoria,estado_categoria) values (6, 'FARMACIA',1);

insert into producto (ID_PRODUCTO,ID_CATEGORIA,COD_PRODUCTO,DES_PRODUCTO,EXIS_PRODUCTO,BODEGA_PRODUCTO,PRECIO_VENTA_ACT,PRECIO_VENTA_ANT,
                      DSCTO_MINIMO,DSCTO_MAXIMO,COSTO_VENTA,MARGEN_UTILIDAD,VALOR_IVA,STOCK_MINIMO,STOCK_MAXIMO,ESTADO_PRODUCTO)values (1,1,00001,'PELOTA DE FUTBOL',10,20,47800,40000,10,20,5000,42800,19,8,50,'A');
insert into producto (ID_PRODUCTO,ID_CATEGORIA,COD_PRODUCTO,DES_PRODUCTO,EXIS_PRODUCTO,BODEGA_PRODUCTO,PRECIO_VENTA_ACT,PRECIO_VENTA_ANT,
                      DSCTO_MINIMO,DSCTO_MAXIMO,COSTO_VENTA,MARGEN_UTILIDAD,VALOR_IVA,STOCK_MINIMO,STOCK_MAXIMO,ESTADO_PRODUCTO)values (2,1,00002,'RAQUETA DE TENIS',7,10,75400,74000,5,10,7000,68400,19,2,15,'A');
insert into producto (ID_PRODUCTO,ID_CATEGORIA,COD_PRODUCTO,DES_PRODUCTO,EXIS_PRODUCTO,BODEGA_PRODUCTO,PRECIO_VENTA_ACT,PRECIO_VENTA_ANT,
                      DSCTO_MINIMO,DSCTO_MAXIMO,COSTO_VENTA,MARGEN_UTILIDAD,VALOR_IVA,STOCK_MINIMO,STOCK_MAXIMO,ESTADO_PRODUCTO)values (3,2,00003,'MONITOR CURVO',20,30,800000,780000,25,30,23000,777000,19,15,40,'A');
insert into producto(ID_PRODUCTO,ID_CATEGORIA,COD_PRODUCTO,DES_PRODUCTO,EXIS_PRODUCTO,BODEGA_PRODUCTO,PRECIO_VENTA_ACT,PRECIO_VENTA_ANT,
                     DSCTO_MINIMO,DSCTO_MAXIMO,COSTO_VENTA,MARGEN_UTILIDAD,VALOR_IVA,STOCK_MINIMO,STOCK_MAXIMO,ESTADO_PRODUCTO) values (4,2,00004,'AUDIFONOS INHALAMBRICOS',40,30,434000,410800,7,38,8000,434000,19,10,40,'A');
insert into producto(ID_PRODUCTO,ID_CATEGORIA,COD_PRODUCTO,DES_PRODUCTO,EXIS_PRODUCTO,BODEGA_PRODUCTO,PRECIO_VENTA_ACT,PRECIO_VENTA_ANT,
                     DSCTO_MINIMO,DSCTO_MAXIMO,COSTO_VENTA,MARGEN_UTILIDAD,VALOR_IVA,STOCK_MINIMO,STOCK_MAXIMO,ESTADO_PRODUCTO) values (5,3,00005,'TRAPERO',30,13,65000,55800,5,30,2000,63000,19,10,30,'A');
insert into producto (ID_PRODUCTO,ID_CATEGORIA,COD_PRODUCTO,DES_PRODUCTO,EXIS_PRODUCTO,BODEGA_PRODUCTO,PRECIO_VENTA_ACT,PRECIO_VENTA_ANT,
                      DSCTO_MINIMO,DSCTO_MAXIMO,COSTO_VENTA,MARGEN_UTILIDAD,VALOR_IVA,STOCK_MINIMO,STOCK_MAXIMO,ESTADO_PRODUCTO)values (6,3,00006,'ESCOBA',40,15,17000,14700,5,20,3000,14000,19,10,50,'A');
insert into producto (ID_PRODUCTO,ID_CATEGORIA,COD_PRODUCTO,DES_PRODUCTO,EXIS_PRODUCTO,BODEGA_PRODUCTO,PRECIO_VENTA_ACT,PRECIO_VENTA_ANT,
                      DSCTO_MINIMO,DSCTO_MAXIMO,COSTO_VENTA,MARGEN_UTILIDAD,VALOR_IVA,STOCK_MINIMO,STOCK_MAXIMO,ESTADO_PRODUCTO)values (7,4,00007,'ZAPATOS ELEGANTES',8,26,80700,76900,5,20,7000,434000,19,3,20,'A');
insert into producto (ID_PRODUCTO,ID_CATEGORIA,COD_PRODUCTO,DES_PRODUCTO,EXIS_PRODUCTO,BODEGA_PRODUCTO,PRECIO_VENTA_ACT,PRECIO_VENTA_ANT,
                      DSCTO_MINIMO,DSCTO_MAXIMO,COSTO_VENTA,MARGEN_UTILIDAD,VALOR_IVA,STOCK_MINIMO,STOCK_MAXIMO,ESTADO_PRODUCTO) values (8,4,00008,'TENIS DEPORTIVOS',10,30,123000,113800,5,30,10000,113000,19,4,30,'A');
insert into producto (ID_PRODUCTO,ID_CATEGORIA,COD_PRODUCTO,DES_PRODUCTO,EXIS_PRODUCTO,BODEGA_PRODUCTO,PRECIO_VENTA_ACT,PRECIO_VENTA_ANT,
                      DSCTO_MINIMO,DSCTO_MAXIMO,COSTO_VENTA,MARGEN_UTILIDAD,VALOR_IVA,STOCK_MINIMO,STOCK_MAXIMO,ESTADO_PRODUCTO)values (9,5,00009,'ATUN EN LATA',15,30,8300,7000,10,50,500,434000,19,10,50,'A');
insert into producto (ID_PRODUCTO,ID_CATEGORIA,COD_PRODUCTO,DES_PRODUCTO,EXIS_PRODUCTO,BODEGA_PRODUCTO,PRECIO_VENTA_ACT,PRECIO_VENTA_ANT,
                      DSCTO_MINIMO,DSCTO_MAXIMO,COSTO_VENTA,MARGEN_UTILIDAD,VALOR_IVA,STOCK_MINIMO,STOCK_MAXIMO,ESTADO_PRODUCTO)values (10,5,00010,'BEBIDA ENERGIZANTE',29,15,7000,6500,10,20,400,6600,19,15,50,'A');
insert into producto (ID_PRODUCTO,ID_CATEGORIA,COD_PRODUCTO,DES_PRODUCTO,EXIS_PRODUCTO,BODEGA_PRODUCTO,PRECIO_VENTA_ACT,PRECIO_VENTA_ANT,
                      DSCTO_MINIMO,DSCTO_MAXIMO,COSTO_VENTA,MARGEN_UTILIDAD,VALOR_IVA,STOCK_MINIMO,STOCK_MAXIMO,ESTADO_PRODUCTO)values (11,6,00011,'CALMANTE MUSCULAR',6,15,8000,7800,4,10,600,6400,19,1,20,'A');
insert into producto (ID_PRODUCTO,ID_CATEGORIA,COD_PRODUCTO,DES_PRODUCTO,EXIS_PRODUCTO,BODEGA_PRODUCTO,PRECIO_VENTA_ACT,PRECIO_VENTA_ANT,
                      DSCTO_MINIMO,DSCTO_MAXIMO,COSTO_VENTA,MARGEN_UTILIDAD,VALOR_IVA,STOCK_MINIMO,STOCK_MAXIMO,ESTADO_PRODUCTO)values (12,6,00001,'CURITAS x10',20,40,4000,3800,5,40,200,3800,19,20,55,'A');



----------------------------------------------------
INSERT INTO PAIS (ID_PAIS, NOMBRE_PAIS)VALUES(1,'COLOMBIA');
INSERT INTO PAIS (ID_PAIS, NOMBRE_PAIS)VALUES(2,'CHILE');
INSERT INTO PAIS (ID_PAIS, NOMBRE_PAIS)VALUES(3,'ECUADOR');
INSERT INTO PAIS (ID_PAIS, NOMBRE_PAIS)VALUES(4,'PANAMÁ');
INSERT INTO PAIS (ID_PAIS, NOMBRE_PAIS)VALUES(5,'BRASIL');
INSERT INTO PAIS (ID_PAIS, NOMBRE_PAIS)VALUES(6,'CUBA');
INSERT INTO PAIS (ID_PAIS, NOMBRE_PAIS)VALUES(7,'MÉXICO');
INSERT INTO PAIS (ID_PAIS, NOMBRE_PAIS)VALUES(8,'PARAGUAY');
INSERT INTO PAIS (ID_PAIS, NOMBRE_PAIS)VALUES(9,'URUGUAY');
INSERT INTO PAIS (ID_PAIS, NOMBRE_PAIS)VALUES(10,'VENEZUELA');
INSERT INTO PAIS (ID_PAIS, NOMBRE_PAIS)VALUES(11,'BOLIVIA');
INSERT INTO PAIS (ID_PAIS, NOMBRE_PAIS)VALUES(12,'ARGENTINA');
INSERT INTO PAIS (ID_PAIS, NOMBRE_PAIS)VALUES(13,'PERÚ');

-------------------------------------------------------------
INSERT INTO DEPARTAMENTO (ID_DPTO,NOMBRE_DPTO,ID_PAIS_DPTO,ESTADO_DPTO) VALUES(1,'AMAZONAS',1,1);
INSERT INTO DEPARTAMENTO (ID_DPTO,NOMBRE_DPTO,ID_PAIS_DPTO,ESTADO_DPTO) VALUES(2,'ANTIOQUIA',1,1);
INSERT INTO DEPARTAMENTO (ID_DPTO,NOMBRE_DPTO,ID_PAIS_DPTO,ESTADO_DPTO) VALUES(3,'ARAUCA',1,1);
INSERT INTO DEPARTAMENTO (ID_DPTO,NOMBRE_DPTO,ID_PAIS_DPTO,ESTADO_DPTO) VALUES(4,'ARCHIPIELAGO DE SAN ANDRES',1,1);
INSERT INTO DEPARTAMENTO (ID_DPTO,NOMBRE_DPTO,ID_PAIS_DPTO,ESTADO_DPTO) VALUES(5,'ATLÁNTICO',1,1);
INSERT INTO DEPARTAMENTO (ID_DPTO,NOMBRE_DPTO,ID_PAIS_DPTO,ESTADO_DPTO) VALUES(6,'BOGOTÁ D.C.',1,1);
INSERT INTO DEPARTAMENTO (ID_DPTO,NOMBRE_DPTO,ID_PAIS_DPTO,ESTADO_DPTO) VALUES(7,'BOLIVAR',1,1);
INSERT INTO DEPARTAMENTO (ID_DPTO,NOMBRE_DPTO,ID_PAIS_DPTO,ESTADO_DPTO) VALUES(8,'BOYACÁ',1,1);
INSERT INTO DEPARTAMENTO (ID_DPTO,NOMBRE_DPTO,ID_PAIS_DPTO,ESTADO_DPTO) VALUES(9,'CALDAS',1,1);
INSERT INTO DEPARTAMENTO (ID_DPTO,NOMBRE_DPTO,ID_PAIS_DPTO,ESTADO_DPTO) VALUES(10,'CAQUETA',1,1);
INSERT INTO DEPARTAMENTO (ID_DPTO,NOMBRE_DPTO,ID_PAIS_DPTO,ESTADO_DPTO) VALUES(11,'CASANARE',1,1);
INSERT INTO DEPARTAMENTO (ID_DPTO,NOMBRE_DPTO,ID_PAIS_DPTO,ESTADO_DPTO) VALUES(12,'CAUCA',1,1);
INSERT INTO DEPARTAMENTO (ID_DPTO,NOMBRE_DPTO,ID_PAIS_DPTO,ESTADO_DPTO) VALUES(13,'CESAR',1,1);
INSERT INTO DEPARTAMENTO (ID_DPTO,NOMBRE_DPTO,ID_PAIS_DPTO,ESTADO_DPTO) VALUES(14,'CHOCO',1,1);
INSERT INTO DEPARTAMENTO (ID_DPTO,NOMBRE_DPTO,ID_PAIS_DPTO,ESTADO_DPTO) VALUES(15,'CORDOBA',1,1);
INSERT INTO DEPARTAMENTO (ID_DPTO,NOMBRE_DPTO,ID_PAIS_DPTO,ESTADO_DPTO) VALUES(16,'CUNDINAMARCA',1,1);
INSERT INTO DEPARTAMENTO (ID_DPTO,NOMBRE_DPTO,ID_PAIS_DPTO,ESTADO_DPTO) VALUES(17,'GUAINIA',1,1);
INSERT INTO DEPARTAMENTO (ID_DPTO,NOMBRE_DPTO,ID_PAIS_DPTO,ESTADO_DPTO) VALUES(18,'GUAVIARE',1,1);
INSERT INTO DEPARTAMENTO (ID_DPTO,NOMBRE_DPTO,ID_PAIS_DPTO,ESTADO_DPTO) VALUES(19,'HUILA',1,1);
INSERT INTO DEPARTAMENTO (ID_DPTO,NOMBRE_DPTO,ID_PAIS_DPTO,ESTADO_DPTO) VALUES(20,'LA GUAJIRA',1,1);
INSERT INTO DEPARTAMENTO (ID_DPTO,NOMBRE_DPTO,ID_PAIS_DPTO,ESTADO_DPTO) VALUES(21,'MAGDALENA',1,1);
INSERT INTO DEPARTAMENTO (ID_DPTO,NOMBRE_DPTO,ID_PAIS_DPTO,ESTADO_DPTO) VALUES(22,'META',1,1);
INSERT INTO DEPARTAMENTO (ID_DPTO,NOMBRE_DPTO,ID_PAIS_DPTO,ESTADO_DPTO) VALUES(23,'NARIÑO',1,1);
INSERT INTO DEPARTAMENTO (ID_DPTO,NOMBRE_DPTO,ID_PAIS_DPTO,ESTADO_DPTO) VALUES(24,'NORTE DE SANTANDER',1,1);
INSERT INTO DEPARTAMENTO (ID_DPTO,NOMBRE_DPTO,ID_PAIS_DPTO,ESTADO_DPTO) VALUES(25,'PUTUMAYO',1,1);
INSERT INTO DEPARTAMENTO (ID_DPTO,NOMBRE_DPTO,ID_PAIS_DPTO,ESTADO_DPTO) VALUES(26,'QUINDIO',1,1);
INSERT INTO DEPARTAMENTO (ID_DPTO,NOMBRE_DPTO,ID_PAIS_DPTO,ESTADO_DPTO) VALUES(27,'RISARALDA',1,1);
INSERT INTO DEPARTAMENTO (ID_DPTO,NOMBRE_DPTO,ID_PAIS_DPTO,ESTADO_DPTO) VALUES(28,'SANTANDER',1,1);
INSERT INTO DEPARTAMENTO (ID_DPTO,NOMBRE_DPTO,ID_PAIS_DPTO,ESTADO_DPTO) VALUES(29,'SUCRE',1,1);
INSERT INTO DEPARTAMENTO (ID_DPTO,NOMBRE_DPTO,ID_PAIS_DPTO,ESTADO_DPTO) VALUES(30,'TOLIMA',1,1);
INSERT INTO DEPARTAMENTO (ID_DPTO,NOMBRE_DPTO,ID_PAIS_DPTO,ESTADO_DPTO) VALUES(31,'VALLE DEL CAUCA',1,1);
INSERT INTO DEPARTAMENTO (ID_DPTO,NOMBRE_DPTO,ID_PAIS_DPTO,ESTADO_DPTO) VALUES(32,'VAUPES',1,1);
INSERT INTO DEPARTAMENTO (ID_DPTO,NOMBRE_DPTO,ID_PAIS_DPTO,ESTADO_DPTO) VALUES(33,'VICHADA',1,1);
-------------------------------------------------------------

INSERT INTO CIUDAD (ID_CIUDAD, COD_CIUDAD, NOMBRE_CIUDAD,ID_DPTO_CIUDAD, ESTADO_CIUDAD) VALUES(1,'001', 'Leticia',1, 'A');
INSERT INTO CIUDAD (ID_CIUDAD, COD_CIUDAD, NOMBRE_CIUDAD,ID_DPTO_CIUDAD, ESTADO_CIUDAD) VALUES(2,'001','Medellín',2, 'A');
INSERT INTO CIUDAD (ID_CIUDAD, COD_CIUDAD, NOMBRE_CIUDAD,ID_DPTO_CIUDAD, ESTADO_CIUDAD) VALUES(3,'001','Arauca',3, 'A');
INSERT INTO CIUDAD (ID_CIUDAD, COD_CIUDAD, NOMBRE_CIUDAD,ID_DPTO_CIUDAD, ESTADO_CIUDAD) VALUES(4,'001','San Andres',4, 'A');
INSERT INTO CIUDAD (ID_CIUDAD, COD_CIUDAD, NOMBRE_CIUDAD,ID_DPTO_CIUDAD, ESTADO_CIUDAD) VALUES(5,'001','Barranquilla',5, 'A');
INSERT INTO CIUDAD (ID_CIUDAD, COD_CIUDAD, NOMBRE_CIUDAD,ID_DPTO_CIUDAD, ESTADO_CIUDAD) VALUES(6,'001','BOGOTÁ D.C.',6, 'A');
INSERT INTO CIUDAD (ID_CIUDAD, COD_CIUDAD, NOMBRE_CIUDAD,ID_DPTO_CIUDAD, ESTADO_CIUDAD) VALUES(7,'001','Cartagena de Indias',7, 'A');
INSERT INTO CIUDAD (ID_CIUDAD, COD_CIUDAD, NOMBRE_CIUDAD,ID_DPTO_CIUDAD, ESTADO_CIUDAD) VALUES(8,'001','Tunja',8, 'A');
INSERT INTO CIUDAD (ID_CIUDAD, COD_CIUDAD, NOMBRE_CIUDAD,ID_DPTO_CIUDAD, ESTADO_CIUDAD) VALUES(9,'001','Manizales',9, 'A');
INSERT INTO CIUDAD (ID_CIUDAD, COD_CIUDAD, NOMBRE_CIUDAD,ID_DPTO_CIUDAD, ESTADO_CIUDAD) VALUES(10,'001','Florencia',10, 'A');
INSERT INTO CIUDAD (ID_CIUDAD, COD_CIUDAD, NOMBRE_CIUDAD,ID_DPTO_CIUDAD, ESTADO_CIUDAD) VALUES(11,'001','Yopal',11, 'A');
INSERT INTO CIUDAD (ID_CIUDAD, COD_CIUDAD, NOMBRE_CIUDAD,ID_DPTO_CIUDAD, ESTADO_CIUDAD) VALUES(12,'001','Popayán',12, 'A');
INSERT INTO CIUDAD (ID_CIUDAD, COD_CIUDAD, NOMBRE_CIUDAD,ID_DPTO_CIUDAD, ESTADO_CIUDAD) VALUES(13,'001','Valledupar',13, 'A');
INSERT INTO CIUDAD (ID_CIUDAD, COD_CIUDAD, NOMBRE_CIUDAD,ID_DPTO_CIUDAD, ESTADO_CIUDAD) VALUES(14,'001','Quibdó',14, 'A');
INSERT INTO CIUDAD (ID_CIUDAD, COD_CIUDAD, NOMBRE_CIUDAD,ID_DPTO_CIUDAD, ESTADO_CIUDAD) VALUES(15,'001','Montería',15, 'A');
INSERT INTO CIUDAD (ID_CIUDAD, COD_CIUDAD, NOMBRE_CIUDAD,ID_DPTO_CIUDAD, ESTADO_CIUDAD) VALUES(16,'001','Bogotá',16, 'A');
INSERT INTO CIUDAD (ID_CIUDAD, COD_CIUDAD, NOMBRE_CIUDAD,ID_DPTO_CIUDAD, ESTADO_CIUDAD) VALUES(17,'001','Inírida',17, 'A');
INSERT INTO CIUDAD (ID_CIUDAD, COD_CIUDAD, NOMBRE_CIUDAD,ID_DPTO_CIUDAD, ESTADO_CIUDAD) VALUES(18,'001','San José del Guaviare',18, 'A');
INSERT INTO CIUDAD (ID_CIUDAD, COD_CIUDAD, NOMBRE_CIUDAD,ID_DPTO_CIUDAD, ESTADO_CIUDAD) VALUES(19,'001','Neiva',19, 'A');
INSERT INTO CIUDAD (ID_CIUDAD, COD_CIUDAD, NOMBRE_CIUDAD,ID_DPTO_CIUDAD, ESTADO_CIUDAD) VALUES(20,'001','Riohacha',20, 'A');
INSERT INTO CIUDAD (ID_CIUDAD, COD_CIUDAD, NOMBRE_CIUDAD,ID_DPTO_CIUDAD, ESTADO_CIUDAD) VALUES(21,'001','Santa Marta',21, 'A');
INSERT INTO CIUDAD (ID_CIUDAD, COD_CIUDAD, NOMBRE_CIUDAD,ID_DPTO_CIUDAD, ESTADO_CIUDAD) VALUES(22,'001','Villavicencio',22, 'A');
INSERT INTO CIUDAD (ID_CIUDAD, COD_CIUDAD, NOMBRE_CIUDAD,ID_DPTO_CIUDAD, ESTADO_CIUDAD) VALUES(23,'001','Pasto',23, 'A');
INSERT INTO CIUDAD (ID_CIUDAD, COD_CIUDAD, NOMBRE_CIUDAD,ID_DPTO_CIUDAD, ESTADO_CIUDAD) VALUES(24,'001','San José de Cúcuta',24, 'A');
INSERT INTO CIUDAD (ID_CIUDAD, COD_CIUDAD, NOMBRE_CIUDAD,ID_DPTO_CIUDAD, ESTADO_CIUDAD) VALUES(25,'001','Mocoa',25, 'A');
INSERT INTO CIUDAD (ID_CIUDAD, COD_CIUDAD, NOMBRE_CIUDAD,ID_DPTO_CIUDAD, ESTADO_CIUDAD) VALUES(26,'001','Armenia',26, 'A');
INSERT INTO CIUDAD (ID_CIUDAD, COD_CIUDAD, NOMBRE_CIUDAD,ID_DPTO_CIUDAD, ESTADO_CIUDAD) VALUES(27,'001','Pereira',27, 'A');
INSERT INTO CIUDAD (ID_CIUDAD, COD_CIUDAD, NOMBRE_CIUDAD,ID_DPTO_CIUDAD, ESTADO_CIUDAD) VALUES(28,'001','Bucaramanga',28, 'A');
INSERT INTO CIUDAD (ID_CIUDAD, COD_CIUDAD, NOMBRE_CIUDAD,ID_DPTO_CIUDAD, ESTADO_CIUDAD) VALUES(29,'001','Sincelejo',29, 'A');
INSERT INTO CIUDAD (ID_CIUDAD, COD_CIUDAD, NOMBRE_CIUDAD,ID_DPTO_CIUDAD, ESTADO_CIUDAD) VALUES(30,'001','Ibagué',30, 'A');
INSERT INTO CIUDAD (ID_CIUDAD, COD_CIUDAD, NOMBRE_CIUDAD,ID_DPTO_CIUDAD, ESTADO_CIUDAD) VALUES(31,'001','Cali',31, 'A');
INSERT INTO CIUDAD (ID_CIUDAD, COD_CIUDAD, NOMBRE_CIUDAD,ID_DPTO_CIUDAD, ESTADO_CIUDAD) VALUES(32,'001','Mitú',32, 'A');
INSERT INTO CIUDAD (ID_CIUDAD, COD_CIUDAD, NOMBRE_CIUDAD,ID_DPTO_CIUDAD, ESTADO_CIUDAD) VALUES(33,'001','Puerto Carreño',33, 'A');

INSERT INTO TIPOFACTURA (ID_TIPOFAC, NOM_TIPOFAC, ESTADO_TIPOFAC) VALUES (1,'FACTURA ELECRONICA','A');
INSERT INTO TIPOFACTURA (ID_TIPOFAC, NOM_TIPOFAC, ESTADO_TIPOFAC) VALUES (2,'FACTURA FISICA','A');

-------------------------------------------------------------------

INSERT INTO TIPO_CLIENTE (ID_TIPO_CLIENTE,DESCRIPCION_TCLIENTE,ESTADO_TCLIENTE) values (1,'PERSONA NATURAL','A');
INSERT INTO TIPO_CLIENTE (ID_TIPO_CLIENTE,DESCRIPCION_TCLIENTE,ESTADO_TCLIENTE) values (2,'PERSONA JURIDICA','A');
INSERT INTO TIPO_CLIENTE (ID_TIPO_CLIENTE,DESCRIPCION_TCLIENTE,ESTADO_TCLIENTE) values (3,'PROVEEDOR','A');

INSERT INTO PARAMETRO_GENERAL (ID_PARAMETRO_GENERAL, NOMBRE_PARAMETRO, DESCRIPCION_PARAMETRO, VALOR_PARAMETRO, TIPO_PARAMETRO)
VALUES (1,'IVA','IMPUESTO AL VALOR AGREGADO','0.19','A');


INSERT INTO permisos (id_permisos,permiso) VALUES
    (1,'Crear factura'),(2,'Modificar factura'),(3,'Eliminar factura'),	(4,'Registrar factura'),
    (5,'Impuestos factura'),(6,'Añadir cliente'),	(7,'Modificar cliente'),(8,'Consultar facturas'),
    (9,'Consultar presupuestos'),(10,'Solicitar compra'),(11,'Autorizar compra'),(12,'Denegar compra'),
    (13,'Modificar compra'),(14,'Eliminar compra'),(15,'Ver histórico compras realizadas'),(16,'Añadir producto'),
    (17,'Modificar producto'),(18,'Eliminar producto'),(19,'Añadir trabajador'),(20,'Modificar datos del trabajador'),
    (21,'Eliminar datos del trabajador'),(22,'Consultar datos trabajador empresa'),(23,'Consultar datos propios'),
    (24,'Ver histórico de nóminas'),(25,'Incremento stock producto'),(26,'Decremento stock producto'),(27,'Consultar stock producto'),
    (28,'Eliminar presupuesto'),(29,'Modificar presupuesto'),(30,'Aceptar presupuesto'),(31,'Solicitar presupuesto'),
    (32,'Crear presupuesto'),(33,'Eliminar cliente'),(34,'Consultar presupuestos'),(35,'Consultar presupuesto'),
    (36,'Consultar Impuestos'),(37,'Ver compras solicitadas por un usuario'),(38,'Ver total compras solicitadas'),
    (39,'Registrar la entrada de una compra'),(40,'Añadir proveedor'),(41,'Modificar proveedor'),(42,'Eliminar proveedor'),
    (43,'Consultar proveedores'),(44,'Consultar productos'),(45,'Consultar compras en proceso'),(46,'Consultar nóminas'),
    (47,'Consultar propia nómina'),(48,'Crear nueva nómina'),(49,'Modificar nómina'),(50,'Eliminar nómina'),
    (51,'Ver histórico de nóminas propias'),(52,'Consultar ubicación producto'),(53,'Registrar incidencia de un producto'),
    (54,'Consultar incidencias');

INSERT INTO ROLES_PERMISOS ( role_id, permisos_id) VALUES
                                                        ( 1, 1),	( 1, 2),	( 1, 3),	( 1, 4),	( 1, 5),	( 1, 6),
                                                        ( 1, 7),	( 1, 10),	( 1, 11),	( 1, 12),	( 1, 13),	( 1, 14),
                                                        ( 1, 15),	( 1, 16),	( 1, 17),	( 1, 18),	( 1, 19),	( 1, 20),
                                                        ( 1, 21),	( 1, 22),	( 1, 24),	( 5, 25),	( 5, 26),	( 1, 28),
                                                        ( 1, 29),	( 1, 30),	( 4, 31),	( 1, 32),	( 1, 33),	( 1, 34),
                                                        ( 1, 37),	( 1, 38),	( 5, 39),	( 1, 40),	( 1, 41),	( 1, 42),
                                                        ( 1, 46),	( 1, 48),	( 1, 49),	( 1, 50),	( 5, 53),	( 5, 54),
                                                        ( 4, 1),	( 4, 2),	( 4, 3),	( 4, 4),	( 4, 5),	( 4, 6),
                                                        ( 4, 7),	( 4, 10),	( 4, 28),	( 4, 29),	( 4, 30),	( 4, 32),
                                                        ( 4, 33),	( 4, 34),	( 4, 37),	( 4, 38),	( 3, 1),	( 3, 2),
                                                        ( 3, 3),	( 3, 4),	( 3, 5),	( 3, 6),	( 3, 7),	( 3, 10),
                                                        ( 3, 32),	( 3, 34);

INSERT INTO ROLES_PERMISOS ( role_id, permisos_id) VALUES
                                                        (1, 8),	(1, 9),	(1, 23),	(1, 27),	(1, 35),	(1, 36),	(1, 43),	(1, 44),	(1, 45),	(1, 47),	(1, 51),	(1, 52),
                                                        (2, 8),	(2, 9),	(2, 23),	(2, 27),	(2, 35),	(2, 36),	(2, 43),	(2, 44),	(2, 45),	(2, 47),	(2, 51),	(2, 52),
                                                        (3, 8),	(3, 9),	(3, 23),	(3, 27),	(3, 35),	(3, 36),	(3, 43),	(3, 44),	(3, 45),	(3, 47),	(3, 51),	(3, 52),
                                                        (4, 8),	(4, 9),	(4, 23),	(4, 27),	(4, 35),	(4, 36),	(4, 43),	(4, 44),	(4, 45),	(4, 47),	(4, 51),	(4, 52),
                                                        (5, 8),	(5, 9),	(5, 23),	(5, 27),	(5, 35),	(5, 36),	(5, 43),	(5, 44),	(5, 45),	(5, 47),	(5, 51),	(5, 52),
                                                        (6, 8),	(6, 9),	(6, 23),	(6, 27),	(6, 35),	(6, 36),	(6, 43),	(6, 44),	(6, 45),	(6, 47),	(6, 51),	(6, 52),
                                                        (7, 8),	(7, 9),	(7, 23),	(7, 27),	(7, 35),	(7, 36),	(7, 43),	(7, 44),	(7, 45),	(7, 47),	(7, 51),	(7, 52);
