CREATE DATABASE BDSistemaVenta;

USE BDSistemaVenta;

CREATE TABLE ROL (IdRol INT PRIMARY KEY AUTO_INCREMENT,
				  Descripcion VARCHAR (50),
                  FechaCreacion DATETIME DEFAULT NOW()
				 );
                 
CREATE TABLE PERMISO (IdPermiso INT PRIMARY KEY AUTO_INCREMENT,
					  IdRol INT,
                      CONSTRAINT FK_Pmo_Rl FOREIGN KEY (IdRol) REFERENCES ROL (IdRol),
					  NombreMenu VARCHAR (100),
					  FechaRegistro DATETIME DEFAULT NOW()
				     );
                     
CREATE TABLE PROVEEDOR (IdProveedor INT PRIMARY KEY AUTO_INCREMENT,
						Documento VARCHAR (50),
						RazonSocial VARCHAR (50),
						Correo VARCHAR (50),
						Telefono VARCHAR (50),
						Estado BIT,
						FechaRegistro DATETIME DEFAULT NOW()
					   );
                       
CREATE TABLE CLIENTE (IdCliente INT PRIMARY KEY AUTO_INCREMENT,
					  Documento VARCHAR (50),
					  NombreCompleto VARCHAR (50),
					  Correo VARCHAR (50),
					  Telefono VARCHAR (50),
					  Direccion VARCHAR (100),
					  Estado BIT,
					  FechaRegistro DATETIME DEFAULT NOW()
					 );
                     
CREATE TABLE USUARIO (IdUsuario INT PRIMARY KEY AUTO_INCREMENT,
					  Documento VARCHAR (50),
					  NombreCompleto VARCHAR (50),
					  Correo VARCHAR (50),
					  Clave VARBINARY (100),	
					  IdRol INT,
                      CONSTRAINT FK_Usr_Rl FOREIGN KEY (IdRol) REFERENCES ROL (IdRol),
					  Estado BIT,
					  FechaRegistro DATETIME DEFAULT NOW()
					 );
                     
CREATE TABLE CATEGORIA (IdCategoria INT PRIMARY KEY AUTO_INCREMENT,
						Descripcion VARCHAR (100),
						Estado BIT,
						FechaRegistro DATETIME DEFAULT NOW()
					   );
                     
CREATE TABLE PRODUCTO (IdProducto INT PRIMARY KEY AUTO_INCREMENT,
					   Codigo VARCHAR (50),
					   Nombre VARCHAR (50),
					   Descripcion VARCHAR (50),
					   IdCategoria INT,
                       CONSTRAINT FK_Prod_Categ FOREIGN KEY (IdCategoria) REFERENCES CATEGORIA (IdCategoria),
					   Stock INT NOT NULL DEFAULT 0,
					   PrecioCompra DECIMAL (18,2) DEFAULT 0.00,
					   PrecioVenta DECIMAL (18,2) DEFAULT 0.00,
					   FechaVencimiento DATE DEFAULT NULL,
					   Estado BIT,
					   FechaRegistro DATETIME DEFAULT NOW()
					  );
                     
CREATE TABLE COMPRA (IdCompra INT PRIMARY KEY AUTO_INCREMENT,
					 IdUsuario INT,
                     CONSTRAINT FK_Cmp_Usr FOREIGN KEY (IdUsuario) REFERENCES USUARIO (IdUsuario),
					 IdProveedor INT,
                     CONSTRAINT FK_Cmp_Prov FOREIGN KEY (IdProveedor) REFERENCES PROVEEDOR(IdProveedor),
					 TipoDocumento VARCHAR (50),
					 NumeroDocumento VARCHAR (50),
					 MontoTotal DECIMAL (18,2),
					 FechaRegistro DATETIME DEFAULT NOW()
					);
                    
CREATE TABLE DETALLE_COMPRA (IdDetalleCompra INT PRIMARY KEY AUTO_INCREMENT,
							 IdCompra INT,
                             CONSTRAINT FK_DetCmp_Cmp FOREIGN KEY (IdCompra) REFERENCES COMPRA (IdCompra),
							 IdProducto INT,
                             CONSTRAINT FK_DetCmp_Prod FOREIGN KEY (IdProducto) REFERENCES PRODUCTO (IdProducto),
							 PrecioCompra DECIMAL (18,2) DEFAULT 0.00,
							 PrecioVenta DECIMAL (18,2) DEFAULT 0.00,
							 Cantidad INT,
							 MontoTotal DECIMAL (18,2),
							 FechaRegistro DATETIME DEFAULT NOW()
							);

CREATE TABLE VENTA (IdVenta INT PRIMARY KEY AUTO_INCREMENT,
					IdUsuario INT,
                    CONSTRAINT FK_Vent_Usr FOREIGN KEY (IdUsuario) REFERENCES USUARIO (IdUsuario),
					TipoDocumento VARCHAR (50),
					NumeroDocumento VARCHAR (50),
					DocumentoCliente VARCHAR (50),
					NombreCliente VARCHAR (100),
					MontoPago DECIMAL (18,2),
					MontoCambio DECIMAL (18,2),
					MontoTotal DECIMAL (18,2),
					MetodoPago VARCHAR (100),
					FechaRegistro DATETIME DEFAULT NOW()
				   );
                   
CREATE TABLE DETALLE_VENTA (IdDetalleVenta INT PRIMARY KEY AUTO_INCREMENT,
							IdVenta INT,
                            CONSTRAINT FK_DetVent_Vent FOREIGN KEY (IdVenta) REFERENCES VENTA (IdVenta),
							IdProducto INT,
                            CONSTRAINT FK_DetVent_Prod FOREIGN KEY (IdProducto) REFERENCES PRODUCTO (IdProducto),
							PrecioVenta DECIMAL(18,2),
							Cantidad INT,
							SubTotal DECIMAL(18,2),
							FechaRegistro DATETIME DEFAULT NOW()
						   );
                           

