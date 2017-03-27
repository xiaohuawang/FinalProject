CREATE TABLE User_Role (
  	userId INTEGER REFERENCES XUsers(userId),
  	roleId INTEGER REFERENCES Role(roleId)
);