CREATE DATABASE AIMS;
USE AIMS;

-- Table: Media
CREATE TABLE Media (
	id 						BIGINT 			NOT NULL AUTO_INCREMENT,
    category				VARCHAR(50) 	NOT NULL,
    price 					INTEGER			NOT NULL,
    value 					INTEGER			NOT NULL,
    title 					VARCHAR(50)		NOT NULL,
    description 			TEXT			NOT NULL,
    quantity           		INTEGER      	NOT NULL,
    importDate         		DATE        	NOT NULL,
    rushOrderSupported 		BOOLEAN      	NOT NULL,
    imageUrl           		VARCHAR(200) 	NOT NULL,
    PRIMARY KEY (id)
);

-- Table: Book
CREATE TABLE Book (
	id 						BIGINT 			NOT NULL,
    authors					VARCHAR(50) 	NOT NULL,
    hardCover 				VARCHAR(50) 	NOT NULL,
    publisher 				VARCHAR(50) 	NOT NULL,
    publicationDate			DATE 			NOT NULL,	
    pages					INTEGER,
    language				VARCHAR(50),
    bookCategory			VARCHAR(50),
    PRIMARY KEY (id),
    FOREIGN KEY (id) REFERENCES Media (id)
);

-- Table: Cd and LP
CREATE TABLE CD_and_LP (
	id 						BIGINT 			NOT NULL,
    artists					VARCHAR(50) 	NOT NULL,
    recordLabel 			VARCHAR(50) 	NOT NULL,
    trackList				VARCHAR(200)	NOT NULL,
    releaseDate				DATE,	
    musicType				VARCHAR(50)		NOT NULL,	
    PRIMARY KEY (id),
    FOREIGN KEY (id) REFERENCES Media (id) 		
);

-- Table: DVD
CREATE TABLE DVD (
	id 						BIGINT 			NOT NULL,
    dvdType					VARCHAR(50)		NOT NULL,
    director				VARCHAR(50) 	NOT NULL,
    runtime		 			INTEGER		 	NOT NULL,
    studio					VARCHAR(50)		NOT NULL,
    language				VARCHAR(50) 	NOT NULL,	
    subtitles				VARCHAR(50) 	NOT NULL,
    releasedDate			DATE,
    filmType				VARCHAR(50),
    PRIMARY KEY (id),
    FOREIGN KEY (id) REFERENCES Media (id) 		
);

-- Table: RushOrderInfo
CREATE TABLE RushOrderInfo (
	id 						BIGINT 			NOT NULL AUTO_INCREMENT,
	deliveryTime			DATETIME		NOT NULL,
    instructions			VARCHAR(200)	NOT NULL,
	PRIMARY KEY (id)
);

-- Table: DeliveryInfo
CREATE TABLE DeliveryInfo (
	id 						BIGINT 			NOT NULL AUTO_INCREMENT,
    name 					VARCHAR(50)		NOT NULL, 
    phone					VARCHAR(15)		NOT NULL,
    email					VARCHAR(50)		NOT NULL,
    province				VARCHAR(50)		NOT NULL,
    district				VARCHAR(50)		NOT NULL,
    address					VARCHAR(200)	NOT NULL,
    rushOrderID				BIGINT			NOT NULL,
    message					VARCHAR(200),
    PRIMARY KEY (id),
    FOREIGN KEY (rushOrderID) REFERENCES RushOrderInfo (id)
);

-- Table: OrderInfo
CREATE TABLE Order_Info(
	id 						BIGINT 			NOT NULL AUTO_INCREMENT,
	shippingFees			INTEGER			NOT NULL,
    subtotal				INTEGER			NOT NULL,
    deliveryInfoId			BIGINT			NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (deliveryInfoId) REFERENCES DeliveryInfo (id)
);

-- Table: Order_Media
CREATE TABLE Order_Media(
	orderID				BIGINT 			NOT NULL,
    mediaID				BIGINT			NOT NULL,
    quantity			INTEGER			NOT NULL,
    price				INTEGER			NOT NULL,
    isRushOrder			BOOLEAN			NOT NULL,
	FOREIGN KEY (orderID) REFERENCES Order_Info (id),
    FOREIGN KEY (mediaID) REFERENCES Media (id)
);

-- Table: Invoice
CREATE TABLE Invoice(
	id 						BIGINT 			NOT NULL AUTO_INCREMENT,
    totalAmount				INTEGER			NOT NULL,
    orderId					BIGINT 			NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (orderId) REFERENCES OrderInfo (id)
);

-- Table: VnPay
CREATE TABLE VnPAY(
	id 						BIGINT 			NOT NULL AUTO_INCREMENT,
    imageQRUrl				VARCHAR(50)		NOT NULL,	
    paymentAccountName		VARCHAR(50)		NOT NULL,
    paymentAccountNumber	VARCHAR(50)		NOT NULL,
    bank					VARCHAR(50)		NOT NULL,		
	PRIMARY KEY (id)
);

-- Table: PaymentTransaction
CREATE TABLE PaymentTransaction(
	id 						BIGINT 			NOT NULL AUTO_INCREMENT,
    createAt				DATETIME		NOT NULL,
    paymentTime				DATETIME		NOT NULL,	
    content					VARCHAR(50)		NOT NULL,
    vnPayId					BIGINT			NOT NULL,
    method					VARCHAR(50)		NOT NULL,
    status					VARCHAR(50)		NOT NULL,
    invoiceId				BIGINT			NOT NULL,
    PRIMARY KEY (id),
	FOREIGN KEY (vnPayId) REFERENCES vnPay (id),
	FOREIGN KEY (invoiceId) REFERENCES Invoice (id)
);


-- Index: orderId_index
CREATE INDEX orderId_index ON Invoice (orderId);

-- Index: deliveryInfoId_index
CREATE INDEX deliveryInfoId_index ON OrderInfo (deliveryInfoId);

-- Index: vnPayId_index
CREATE INDEX vnPayId_index ON PaymentTransaction (vnPayId);

-- Index: invoiceId_index
CREATE INDEX invoiceId_index ON PaymentTransaction (invoiceId);