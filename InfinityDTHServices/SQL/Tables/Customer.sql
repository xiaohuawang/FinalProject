CREATE TABLE Customer (
 	customerId		INTEGER 		REFERENCES XUsers(userId),
 	firstName 		VARCHAR(20) 	NOT NULL,
 	lastName 		VARCHAR(20) 	NOT NULL,
 	emailId 		VARCHAR(20) 	NOT NULL,
 	phoneNumber 	varchar(20)		NOT NULL,
 	addressId 		INTEGER 		REFERENCES Address(addressId)
);