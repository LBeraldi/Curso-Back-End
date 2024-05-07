DROP TABLE IF EXISTS minha_tabela;
CREATE TABLE cliente (
      id INT PRIMARY KEY AUTO_INCREMENT,
      nome VARCHAR(100),
      cpf varchar(11)
);

CREATE TABLE produto(
    id INT PRIMARY KEY AUTO_INCREMENT,
    descricao VARCHAR(100),
    preco_unitario NUMERIC(9,2)
);

CREATE TABLE pedido(
    id INT PRIMARY KEY AUTO_INCREMENT,
    cliente_id  INTEGER REFERENCES cliente(id),
    data_pedido TIMESTAMP,
    total NUMERIC(9,2),
    status varchar(20)
);

CREATE TABLE item_pedido(
    id INT PRIMARY KEY AUTO_INCREMENT,
    pedido_id  INTEGER REFERENCES pedido(id),
    produto_id  INTEGER REFERENCES produto(id),
    quantidade INTEGER
);