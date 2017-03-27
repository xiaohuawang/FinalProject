CREATE TABLE Retailer (
 	retailerId		INTEGER 		REFERENCES XUsers(userId),
 	name 			VARCHAR(30) 	NOT NULL,
 	contactNo1 		VARCHAR(30) 	NOT NULL,
 	contactNo2 		VARCHAR(30)		NULL,
 	addressId 		INTEGER 		REFERENCES Address(addressId),
  	--Set Top Box Limit
 	STBL 			VARCHAR(30) 	NOT NULL,
 	creditLimit 	VARCHAR(30) 	NOT NULL,
 	--Commission percentage on sale of goods
 	CPSG 			VARCHAR(30) 	NOT NULL,
 	serviceCharge 	VARCHAR(30) 	NOT NULL,
 	--Retailer Creation Date
 	creationDate	DATE 			NOT NULL,
 	--Total Cost of Inventory
 	TCI 			DECIMAL 		NOT NULL
);