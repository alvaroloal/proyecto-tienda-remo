INSERT INTO USUARIOS (NOMBRECOMPLETO, NOMBREUSUARIO, CONTRASENIA, ROL) VALUES 
('admin', 'admin', 'ADMIN', 1),
('user', '1234', 'CLIENTE', 2),
('cliente1', 'cliente1', 'CLIENTE', 3),
('cliente2', 'cliente2', 'CLIENTE', 4),
('cliente3', 'cliente3', 'CLIENTE', 5),
('cliente4', 'cliente4', 'CLIENTE', 6);



INSERT INTO CATEGORIA (ID, NOMBRE, DESTACADA, IMAGEN) VALUES (1,'Componentes',true,null);
INSERT INTO CATEGORIA (ID, NOMBRE, DESTACADA, IMAGEN) VALUES (2,'Barcos',false,null);
INSERT INTO CATEGORIA (ID, NOMBRE, DESTACADA, IMAGEN) VALUES (3,'Ropa deportiva',false,null);


INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (1,'Orza y cortaolas','RAM SDll 39,6  ',565, 0,'',1);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (2,'pepe Noteb6GB SSD/15.6','RAM SDll 39,6  ',565, 0,'',2);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (3,'HP Noteb6GB SSD/15.6','RAM SDll 39,6  ',565, 0,'',3);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (4,'HP Noteb6GB SSD/15.6','RAM SDll 39,6  ',565, 0,'',1);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (5,'HP Noteb6GB SSD/15.6','RAM SDll 39,6  ',565, 0,'',1);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (6,'HP Noteb6GB SSD/15.6','RAM SDll 39,6  ',565, 0,'',1);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (7,'HP Noteb6GB SSD/15.6','RAM SDll 39,6  ',565, 0,'',1);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (8,'HP Noteb6GB SSD/15.6','RAM SDll 39,6  ',565, 0,'',1);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (9,'HP Noteb6GB SSD/15.6','RAM SDll 39,6  ',565, 0,'',1);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (10,'HP Noteb6GB SSD/15.6','RAM SDll 39,6  ',565, 0,'',1);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (11,'HP Noteb6GB SSD/15.6','RAM SDll 39,6  ',565, 0,'',1);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (12,'HP Noteb6GB SSD/15.6','RAM SDll 39,6  ',565, 0,'',1);

INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (24,'Xiaomi Redmi 5 3/32Gb Negro libre','Característensor Omnivision OV12A10 Pantalla de 5.7" en formato 18:9 y resolución de 1440 x 720px ',159, 0,'https://thumb.pccomponentes.com/w-530-530/articles/14/149265/thumb-114131-default-big1.jpg',4);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (29,'Samsung Galaxy S8 4G 64GB Negro Libre','EspecG: 1700/2100, 1800tootha Dual Edge Dimensiones y  x 8.0 mm Peso 151 gr Bateria 3000 mAh',499, 0.1,'https://thumb.pccomponentes.com/w-530-530/articles/12/123417/s8n3.jpg',4);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (30,'Samsung Galaxy A6 Plus 3/32Gb Dual Sim Dorado Libre','vedades q y brillantes.  Añade un toque de estilo y diversión a es selfies.',369, 0,'https://thumb.pccomponentes.com/w-530-530/articles/16/161879/15075513771-fm-01-2.jpg',4);

ALTER SEQUENCE categoria_seq RESTART WITH 100 INCREMENT BY 1;
ALTER SEQUENCE producto_seq RESTART WITH 100 INCREMENT BY 1;



