INSERT INTO USUARIOS (NOMBRECOMPLETO, NOMBREUSUARIO, CONTRASENIA, ROL) VALUES 
('admin', 'admin', 'ADMIN', 1),
('user', '1234', 'CLIENTE', 2),
('cliente1', 'cliente1', 'CLIENTE', 3),
('cliente2', 'cliente2', 'CLIENTE', 4),
('cliente3', 'cliente3', 'CLIENTE', 5),
('cliente4', 'cliente4', 'CLIENTE', 6);


INSERT INTO CATEGORIA (ID, NOMBRE, IMAGEN) VALUES (NEXTVAL('categoria_seq'),'Ropa',null);
INSERT INTO CATEGORIA (ID, NOMBRE, IMAGEN) VALUES (NEXTVAL('categoria_seq'),'Componentes',null);
INSERT INTO CATEGORIA (ID, NOMBRE, IMAGEN) VALUES (NEXTVAL('categoria_seq'),'Barcos',null);


INSERT INTO PRODUCTO (IDPRODUCTO, NOMBRE, DESCRIPCION, PRECIO, IMAGEN, CATEGORIA_ID) VALUES (NEXTVAL('producto_seq'),'Camiseta térmica','Camiseta termica con tela transpirable',25,null,1);

INSERT INTO PRODUCTO (IDPRODUCTO, NOMBRE, DESCRIPCION, PRECIO, IMAGEN, CATEGORIA_ID) VALUES (NEXTVAL('producto_seq'),'Portantes fibra de carbono','Soporte para los remos de la embarcación',100,null,2);

INSERT INTO PRODUCTO (IDPRODUCTO, NOMBRE, DESCRIPCION, PRECIO, IMAGEN, CATEGORIA_ID) VALUES (NEXTVAL('producto_seq'),'1x','Barco de competición individual',1500,null,3);


-- ALTER SEQUENCE hibernate_sequence RESTART WITH 1000; Esta línea está en el original