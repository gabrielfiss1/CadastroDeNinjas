

CREATE TABLE TB_CADASTRO (
                    id BIGINT AUTO_INCREMENT PRIMARY KEY,
                    nome VARCHAR(40),
                    email VARCHAR(255) UNIQUE,
                    idade INT,
                    missoes_id BIGINT,
                    CONSTRAINT fk_cadastro_missao FOREIGN KEY (missoes_id) REFERENCES tb_missoes(id)
);