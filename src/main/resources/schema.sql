DROP TABLE IF EXISTS TB_PESSOA;

CREATE TABLE IF NOT EXISTS TB_PESSOA(
     ID             INT NOT NULL PRIMARY KEY AUTO_INCREMENT
    ,NOME           VARCHAR(39) NOT NULL
    ,CPF            VARCHAR(14) NOT NULL
    ,RG             VARCHAR(12) NOT NULL
    ,DATA_NASC      VARCHAR(10)  NOT NULL
    ,SEXO           VARCHAR(9) NOT NULL
    ,MAE            VARCHAR(27) NOT NULL
    ,PAI            VARCHAR(40) NOT NULL
    ,EMAIL          VARCHAR(92) NOT NULL
    ,CEP            VARCHAR(9) NOT NULL
    ,ENDERECO       VARCHAR(50) NOT NULL
    ,NUMERO         INTEGER  NOT NULL
    ,BAIRRO         VARCHAR(48) NOT NULL
    ,CIDADE         VARCHAR(23) NOT NULL
    ,ESTADO         VARCHAR(2) NOT NULL
    ,TELEFONE_FIXO  VARCHAR(14) NOT NULL
    ,CELULAR        VARCHAR(15) NOT NULL
    ,ALTURA         NUMERIC(4,2) NOT NULL
    ,PESO           INTEGER  NOT NULL
    ,TIPO_SANGUINEO VARCHAR(3) NOT NULL
);