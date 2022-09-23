CREATE TABLE Users(
                      IDUSERS INT AUTO_INCREMENT,
                      EMAIL VARCHAR(255),
                      PASSWORD VARCHAR(255),
                      ADMINISTRATOR BOOLEAN,
                      PRIMARY KEY(IDUSERS)
);

CREATE TABLE Persons(
                        IDPERSONS INT AUTO_INCREMENT NOT NULL,
                        CPF VARCHAR(14) ,
                        NAME VARCHAR(80),
                        STREET VARCHAR (255),
                        NUMBERHOME INT,
                        DISTRICT VARCHAR(100),
                        COMPLEMENT VARCHAR(80),
                        COUNTY VARCHAR(80),
                        UF VARCHAR(2),
                        RG VARCHAR(255),
                        IDUSERS INT,
                        PRIMARY KEY(IDPERSONS),
                        FOREIGN KEY (IDUSERS) REFERENCES Users(IDUSERS)
);