

CREATE SEQUENCE USUARIO_SEQ START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE CLIENTE_SEQ START WITH 1 INCREMENT BY 1;

CREATE SEQUENCE PRODUCTO_SEQ START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE CATEGORIA_SEQ START WITH 1 INCREMENT BY 1;


INSERT INTO USUARIO (ID, USERNAME, PASSWORD, ADMIN) VALUES (NEXTVAL('USUARIO_SEQ'), 'admin', '{noop}admin', true);
INSERT INTO USUARIO (ID, USERNAME, PASSWORD, ADMIN) VALUES (NEXTVAL ('USUARIO_SEQ'), 'user', '{noop}1234', false);
INSERT INTO USUARIO (ID, USERNAME, PASSWORD, ADMIN) VALUES (NEXTVAL ('USUARIO_SEQ'), 'user2', '{noop}1234', false);
INSERT INTO USUARIO (ID, USERNAME, PASSWORD, ADMIN) VALUES (NEXTVAL ('USUARIO_SEQ'), 'user3', '{noop}1234', false);




INSERT INTO CLIENTE (ID, NOMBRE, APELLIDOS, TELEFONO, DIRECCION, NUMERO_TARJETA, EMAIL)  VALUES ((SELECT ID FROM USUARIO WHERE USERNAME='admin'), 'Álvaro', 'Lorente Alman', '767676776', 'Plaza Pedro Santos Gomez', '2345322342', 'alvaro@gmail.com');
INSERT INTO CLIENTE (ID, NOMBRE, APELLIDOS, TELEFONO, DIRECCION, NUMERO_TARJETA, EMAIL)  VALUES ((SELECT ID FROM USUARIO WHERE USERNAME='user'), 'Antonio', 'Muñoz Pedrosa', '767676776', 'Avenida Alvar Nuñez', '2345322342', 'tonino@gmail.com');
INSERT INTO CLIENTE (ID, NOMBRE, APELLIDOS, TELEFONO, DIRECCION, NUMERO_TARJETA, EMAIL)  VALUES ((SELECT ID FROM USUARIO WHERE USERNAME='user2'), 'Gonzalo', 'García Ferrero', '767676776', 'General Martinez', '2345322342', 'gonzalo@gmail.com');
INSERT INTO CLIENTE (ID, NOMBRE, APELLIDOS, TELEFONO, DIRECCION, NUMERO_TARJETA, EMAIL)  VALUES ((SELECT ID FROM USUARIO WHERE USERNAME='user3'), 'Rafael', 'Vizcaino', '767676776', 'Pagés del corro', '2345322342', 'rafa@gmail.com');



INSERT INTO CATEGORIA (ID, NOMBRE, DESTACADA, IMAGEN) VALUES (NEXTVAL('CATEGORIA_SEQ'),'Componentes', true, '');
INSERT INTO CATEGORIA (ID, NOMBRE, DESTACADA, IMAGEN) VALUES (NEXTVAL('CATEGORIA_SEQ'),'Barcos', false, '');
INSERT INTO CATEGORIA (ID, NOMBRE, DESTACADA, IMAGEN) VALUES (NEXTVAL('CATEGORIA_SEQ'),'Ropa deportiva', false, '');


INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (NEXTVAL('PRODUCTO_SEQ'),'Orza y timón','Sirve para controlar la direccion del bote',35, 0,'https://www.empacher.com/fileadmin/EN/products/racing-boats/racing-four/Steuer_unter_Deck__steering_device_integrated_inside_canvas.JPG',1);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (NEXTVAL('PRODUCTO_SEQ'),'Dos sin','Bote de dos remeros con un remo cada uno',2300, 0,'https://www.empacher.com/fileadmin/EN/products/racing-boats/empacher-racing-double-nzl.jpg',2);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (NEXTVAL('PRODUCTO_SEQ'),'Skiff','Bote individual',1000, 0,'https://www.empacher.com/fileadmin/EN/products/racing-boats/empacher-racing-single.jpg',2);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (NEXTVAL('PRODUCTO_SEQ'),'Cuatro sin','Bote de cuatro remeros con un remo cada uno',3400, 0.2,'https://www.empacher.com/fileadmin/EN/products/racing-boats/empacher-racing-four-gbr.jpg',2);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (NEXTVAL('PRODUCTO_SEQ'),'8+','Bote de ocho remeros con un remo cada uno',7000, 0,'https://img.nauticexpo.es/images_ne/photo-g/22344-10176238.jpg',2);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (NEXTVAL('PRODUCTO_SEQ'),'Camiseta térmica','Camiseta de licra para poder desarrollar un buen entrenamiento',35, 0,'https://media.futbolmania.com/media/catalog/product/cache/1/image/0f330055bc18e2dda592b4a7c3a0ea22/c/w/cw9488_imagen-de-la-camiseta-manga-larga-adidas-alphaskin-azul_1_frontal.jpg',3);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (NEXTVAL('PRODUCTO_SEQ'),'Remo','Nos proporciona la fuerza para el mvoimiento del bote',150, 0.1,'https://www.empacher.com/fileadmin/EN/products/oars/oar_bags.JPG',1);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (NEXTVAL('PRODUCTO_SEQ'),'Orza','Es la estructura donde van colocados los remos',230, 0,'https://www.empacher.com/fileadmin/EN/products/racing-boats/racing-four/Carbonflosse.JPG',1);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (NEXTVAL('PRODUCTO_SEQ'),'Platanito','Prenda elástica y transpirable',50, 0,'https://tienda.austral.es/labradoresrc/img/p/1/4/8/1/5/14815-large_default.jpg',3);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (NEXTVAL('PRODUCTO_SEQ'),'Orza y timón', 'Sirve para controlar la direccion del bote', 35, 0, 'https://www.empacher.com/fileadmin/EN/products/racing-boats/racing-four/Steuer_unter_Deck__steering_device_integrated_inside_canvas.JPG', (SELECT ID FROM CATEGORIA WHERE NOMBRE='Componentes'));
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (NEXTVAL('PRODUCTO_SEQ'),'Dos sin', 'Bote de dos remeros con un remo cada uno', 2300, 0, 'https://www.empacher.com/fileadmin/EN/products/racing-boats/empacher-racing-double-nzl.jpg',(SELECT ID FROM CATEGORIA WHERE NOMBRE='Barcos'));

ALTER SEQUENCE USUARIO_SEQ RESTART WITH 1000 INCREMENT BY 1;
ALTER SEQUENCE CLIENTE_SEQ RESTART WITH 1000 INCREMENT BY 1;
ALTER SEQUENCE PRODUCTO_SEQ RESTART WITH 1000 INCREMENT BY 1;
ALTER SEQUENCE CATEGORIA_SEQ RESTART WITH 1000 INCREMENT BY 1;





--INSERT INTO PRODUCTO (NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES ('Skiff', 'Bote individual', 1000, 0, 'https://www.empacher.com/fileadmin/EN/products/racing-boats/empacher-racing-single.jpg',(SELECT ID FROM CATEGORIA WHERE NOMBRE='Barcos'));
--INSERT INTO PRODUCTO (NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES ('Cuatro sin', 'Bote de cuatro remeros con un remo cada uno', 3400, 0.2, 'https://www.empacher.com/fileadmin/EN/products/racing-boats/empacher-racing-four-gbr.jpg', (SELECT ID FROM CATEGORIA WHERE NOMBRE='Barcos'));
--INSERT INTO PRODUCTO (NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES ('8+', 'Bote de ocho remeros con un remo cada uno', 7000, 0, 'https://img.nauticexpo.es/images_ne/photo-g/22344-10176238.jpg', (SELECT ID FROM CATEGORIA WHERE NOMBRE='Barcos'));
--INSERT INTO PRODUCTO (NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES ('Camiseta térmica', 'Camiseta de licra para poder desarrollar un buen entrenamiento', 35, 0, 'https://media.futbolmania.com/media/catalog/product/cache/1/image/0f330055bc18e2dda592b4a7c3a0ea22/c/w/cw9488_imagen-de-la-camiseta-manga-larga-adidas-alphaskin-azul_1_frontal.jpg',(SELECT ID FROM CATEGORIA WHERE NOMBRE='Ropa deportiva'));
--INSERT INTO PRODUCTO (NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES ('Remo', 'Nos proporciona la fuerza para el movimiento del bote', 150, 0.1, 'https://www.empacher.com/fileadmin/EN/products/oars/oar_bags.JPG',(SELECT ID FROM CATEGORIA WHERE NOMBRE='Componentes'));
--INSERT INTO PRODUCTO (NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES ('Orza', 'Es la estructura donde van colocados los remos', 230, 0, 'https://www.empacher.com/fileadmin/EN/products/racing-boats/racing-four/Carbonflosse.JPG',(SELECT ID FROM CATEGORIA WHERE NOMBRE='Componentes'));
--INSERT INTO PRODUCTO (NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES ('Platanito', 'Prenda elástica y transpirable', 50, 0, 'https://tienda.austral.es/labradoresrc/img/p/1/4/8/1/5/14815-large_default.jpg', (SELECT ID FROM CATEGORIA WHERE NOMBRE='Ropa deportiva'));







