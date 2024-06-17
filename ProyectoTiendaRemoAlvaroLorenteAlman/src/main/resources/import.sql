
INSERT INTO USUARIO (ID, NOMBRE_COMPLETO, USERNAME, CONTRASENIA, ES_ADMIN) VALUES  (1,'administrador', 'admin', '{noop}admin', true);
INSERT INTO USUARIO (ID, NOMBRE_COMPLETO, USERNAME, CONTRASENIA, ES_ADMIN) VALUES  (2,'cliente', 'cliente', '{noop}1234', false);
INSERT INTO USUARIO (USERNAME, PASSWORD, ADMIN ) VALUES  ('user2','1234',false );


INSERT INTO CLIENTE (ID, TELEFONO, DIRECCION, NUMERO_TARJETA, EMAIL) VALUES (1,'767676776', 'PLAZA PEDRO', '2345322342', 'ejemplo@gmail.com');

INSERT INTO CATEGORIA (ID, NOMBRE, DESTACADA, IMAGEN) VALUES (1,'Componentes',true,'');
INSERT INTO CATEGORIA (ID, NOMBRE, DESTACADA, IMAGEN) VALUES (2,'Barcos',false,'');
INSERT INTO CATEGORIA (ID, NOMBRE, DESTACADA, IMAGEN) VALUES (3,'Ropa deportiva',false,'');


INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (1,'Orza y timón','Sirve para controlar la direccion del bote',35, 0,'https://www.empacher.com/fileadmin/EN/products/racing-boats/racing-four/Steuer_unter_Deck__steering_device_integrated_inside_canvas.JPG',1);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (2,'Dos sin','Bote de dos remeros con un remo cada uno',2300, 0,'https://www.empacher.com/fileadmin/EN/products/racing-boats/empacher-racing-double-nzl.jpg',2);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (3,'Skiff','Bote individual',1000, 0,'https://www.empacher.com/fileadmin/EN/products/racing-boats/empacher-racing-single.jpg',2);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (4,'Cuatro sin','Bote de cuatro remeros con un remo cada uno',3400, 0.2,'https://www.empacher.com/fileadmin/EN/products/racing-boats/empacher-racing-four-gbr.jpg',2);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (5,'8+','Bote de ocho remeros con un remo cada uno',7000, 0,'https://img.nauticexpo.es/images_ne/photo-g/22344-10176238.jpg',2);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (6,'Camiseta térmica','Camiseta de licra para poder desarrollar un buen entrenamiento',35, 0,'https://media.futbolmania.com/media/catalog/product/cache/1/image/0f330055bc18e2dda592b4a7c3a0ea22/c/w/cw9488_imagen-de-la-camiseta-manga-larga-adidas-alphaskin-azul_1_frontal.jpg',3);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (7,'Remo','Nos proporciona la fuerza para el mvoimiento del bote',150, 0.1,'https://www.empacher.com/fileadmin/EN/products/oars/oar_bags.JPG',1);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (8,'Orza','Es la estructura donde van colocados los remos',230, 0,'https://www.empacher.com/fileadmin/EN/products/racing-boats/racing-four/Carbonflosse.JPG',1);
INSERT INTO PRODUCTO (ID, NOMBRE, DESCRIPCION, PVP, DESCUENTO, IMAGEN, CATEGORIA_ID) VALUES (9,'Platanito','Prenda elástica y transpirable',50, 0,'https://tienda.austral.es/labradoresrc/img/p/1/4/8/1/5/14815-large_default.jpg',3);


ALTER SEQUENCE categoria_seq RESTART WITH 100 INCREMENT BY 1;
ALTER SEQUENCE producto_seq RESTART WITH 100 INCREMENT BY 1;



