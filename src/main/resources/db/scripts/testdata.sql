-- Credito
INSERT INTO credito (id, abreviatura, descricao, tipo_cadastro)
VALUES (DEFAULT, 'IPTU', 'Imposto Territorial Urbano', 'IMOVEIS');

INSERT INTO credito (id, abreviatura, descricao, tipo_cadastro)
VALUES (DEFAULT, 'ISS', 'Imposto Sobre Serviços', 'ECONOMICOS');

INSERT INTO credito (id, abreviatura, descricao, tipo_cadastro)
VALUES (DEFAULT, 'ITBI', 'Imposto sobre Transmissão de Bens Imóveis', 'TRANSFERENCIA_IMOVEIS');

INSERT INTO credito (id, abreviatura, descricao, tipo_cadastro)
VALUES (DEFAULT, 'TAXA_LIXO', 'Taxa de Coleta de Lixo', 'CONTRIBUINTE');

INSERT INTO credito (id, abreviatura, descricao, tipo_cadastro)
VALUES (DEFAULT, 'TAXA_ALVARA', 'Taxa de Alvará de Funcionamento', 'ECONOMICOS');

INSERT INTO credito (id, abreviatura, descricao, tipo_cadastro)
VALUES (DEFAULT, 'TAXA_CONSTRUCAO', 'Taxa de Construção', 'IMOVEIS');

INSERT INTO credito (id, abreviatura, descricao, tipo_cadastro)
VALUES (DEFAULT, 'TARIFA_ESGOTO', 'Tarifa de Esgoto', 'CONTRIBUINTE');

INSERT INTO credito (id, abreviatura, descricao, tipo_cadastro)
VALUES (DEFAULT, 'IPVA', 'Imposto sobre Propriedade de Veículos Automotores', 'IMOVEIS');

INSERT INTO credito (id, abreviatura, descricao, tipo_cadastro)
VALUES (DEFAULT, 'TFEP', 'Taxa de Fiscalização de Estabelecimento e Produtos', 'ECONOMICOS');

INSERT INTO credito (id, abreviatura, descricao, tipo_cadastro)
VALUES (DEFAULT, 'TFLF', 'Taxa de Fiscalização de Localização e Funcionamento', 'ECONOMICOS');

-- Pessoa Fisica
INSERT INTO pessoa_fisica (codigo, cpf, email, endereco, nome, rg)
VALUES (1, '123.456.789-00', 'joao@email.com', 'Rua A, 123', 'João Silva', '123456789');

INSERT INTO pessoa_fisica (codigo, cpf, email, endereco, nome, rg)
VALUES (2, '987.654.321-00', 'maria@email.com', 'Avenida B, 456', 'Maria Souza', '987654321');

INSERT INTO pessoa_fisica (codigo, cpf, email, endereco, nome, rg)
VALUES (3, '111.222.333-44', 'carlos@email.com', 'Rua C, 789', 'Carlos Santos', '111222333');

INSERT INTO pessoa_fisica (codigo, cpf, email, endereco, nome, rg)
VALUES (4, '555.666.777-88', 'ana@email.com', 'Avenida D, 012', 'Ana Oliveira', '555666777');

INSERT INTO pessoa_fisica (codigo, cpf, email, endereco, nome, rg)
VALUES (5, '999.888.777-66', 'pedro@email.com', 'Rua E, 345', 'Pedro Lima', '999888777');

INSERT INTO pessoa_fisica (codigo, cpf, email, endereco, nome, rg)
VALUES (6, '444.333.222-11', 'lucia@email.com', 'Avenida F, 678', 'Lucia Martins', '444333222');

INSERT INTO pessoa_fisica (codigo, cpf, email, endereco, nome, rg)
VALUES (7, '777.888.999-00', 'fernanda@email.com', 'Rua G, 901', 'Fernanda Pereira', '777888999');

INSERT INTO pessoa_fisica (codigo, cpf, email, endereco, nome, rg)
VALUES (8, '222.111.000-99', 'roberto@email.com', 'Avenida H, 234', 'Roberto Oliveira', '222111000');

INSERT INTO pessoa_fisica (codigo, cpf, email, endereco, nome, rg)
VALUES (9, '333.444.555-66', 'patricia@email.com', 'Rua I, 567', 'Patricia Silva', '333444555');

INSERT INTO pessoa_fisica (codigo, cpf, email, endereco, nome, rg)
VALUES (10, '000.999.888-77', 'felipe@email.com', 'Avenida J, 890', 'Felipe Costa', '000999888');

-- Pessoa Jurica
INSERT INTO pessoa_juridica (codigo, cnpj, email, endereco, inscricao_estadual, nome)
VALUES (1, '00.000.000/0001-01', 'contato@empresa1.com', 'Rua A, 123', '123456789', 'Empresa 1 LTDA');

INSERT INTO pessoa_juridica (codigo, cnpj, email, endereco, inscricao_estadual, nome)
VALUES (2, '00.000.000/0002-02', 'contato@empresa2.com', 'Avenida B, 456', '987654321', 'Empresa 2 S.A.');

INSERT INTO pessoa_juridica (codigo, cnpj, email, endereco, inscricao_estadual, nome)
VALUES (3, '00.000.000/0003-03', 'contato@empresa3.com', 'Rua C, 789', '111222333', 'Empresa 3 Ltda.');

INSERT INTO pessoa_juridica (codigo, cnpj, email, endereco, inscricao_estadual, nome)
VALUES (4, '00.000.000/0004-04', 'contato@empresa4.com', 'Avenida D, 012', '555666777', 'Empresa 4 S/A');

INSERT INTO pessoa_juridica (codigo, cnpj, email, endereco, inscricao_estadual, nome)
VALUES (5, '00.000.000/0005-05', 'contato@empresa5.com', 'Rua E, 345', '999888777', 'Empresa 5 LTDA');

INSERT INTO pessoa_juridica (codigo, cnpj, email, endereco, inscricao_estadual, nome)
VALUES (6, '00.000.000/0006-06', 'contato@empresa6.com', 'Avenida F, 678', '444333222', 'Empresa 6 S/A');

INSERT INTO pessoa_juridica (codigo, cnpj, email, endereco, inscricao_estadual, nome)
VALUES (7, '00.000.000/0007-07', 'contato@empresa7.com', 'Rua G, 901', '777888999', 'Empresa 7 Ltda.');

INSERT INTO pessoa_juridica (codigo, cnpj, email, endereco, inscricao_estadual, nome)
VALUES (8, '00.000.000/0008-08', 'contato@empresa8.com', 'Avenida H, 234', '222111000', 'Empresa 8 S/A');

INSERT INTO pessoa_juridica (codigo, cnpj, email, endereco, inscricao_estadual, nome)
VALUES (9, '00.000.000/0009-09', 'contato@empresa9.com', 'Rua I, 567', '333444555', 'Empresa 9 LTDA');

INSERT INTO pessoa_juridica (codigo, cnpj, email, endereco, inscricao_estadual, nome)
VALUES (10, '00.000.000/0010-10', 'contato@empresa10.com', 'Avenida J, 890', '000999888', 'Empresa 10 S/A');

-- Contribuinte
INSERT INTO contribuinte (codigo, pessoa_fisica_id, nome, situacao)
VALUES (1, 1, 'João Silva', 'ATIVO');

INSERT INTO contribuinte (codigo, pessoa_fisica_id, nome, situacao)
VALUES (2, 2, 'Maria Souza', 'ATIVO');

INSERT INTO contribuinte (codigo, pessoa_fisica_id, nome, situacao)
VALUES (3, 3, 'Carlos Santos', 'ATIVO');

INSERT INTO contribuinte (codigo, pessoa_fisica_id, nome, situacao)
VALUES (4, 4, 'Ana Oliveira', 'ATIVO');

INSERT INTO contribuinte (codigo, pessoa_fisica_id, nome, situacao)
VALUES (5, 5, 'Pedro Lima', 'ATIVO');

INSERT INTO contribuinte (codigo, pessoa_fisica_id, nome, situacao)
VALUES (6, 6, 'Lucia Martins', 'ATIVO');

INSERT INTO contribuinte (codigo, pessoa_fisica_id, nome, situacao)
VALUES (7, 7, 'Fernanda Pereira', 'ATIVO');

INSERT INTO contribuinte (codigo, pessoa_fisica_id, nome, situacao)
VALUES (8, 8, 'Roberto Oliveira', 'ATIVO');

INSERT INTO contribuinte (codigo, pessoa_fisica_id, nome, situacao)
VALUES (9, 9, 'Patricia Silva', 'ATIVO');

INSERT INTO contribuinte (codigo, pessoa_fisica_id, nome, situacao)
VALUES (10, 10, 'Felipe Costa', 'ATIVO');

INSERT INTO contribuinte (codigo, pessoa_juridica_id, nome, situacao)
VALUES (11, 1, 'Empresa 1 LTDA', 'ATIVO');

INSERT INTO contribuinte (codigo, pessoa_juridica_id, nome, situacao)
VALUES (12, 2, 'Empresa 2 S.A.', 'ATIVO');

INSERT INTO contribuinte (codigo, pessoa_juridica_id, nome, situacao)
VALUES (13, 3, 'Empresa 3 Ltda.', 'ATIVO');

INSERT INTO contribuinte (codigo, pessoa_juridica_id, nome, situacao)
VALUES (14, 4, 'Empresa 4 S/A', 'ATIVO');

INSERT INTO contribuinte (codigo, pessoa_juridica_id, nome, situacao)
VALUES (15, 5, 'Empresa 5 LTDA', 'ATIVO');

INSERT INTO contribuinte (codigo, pessoa_juridica_id, nome, situacao)
VALUES (16, 6, 'Empresa 6 S/A', 'ATIVO');

INSERT INTO contribuinte (codigo, pessoa_juridica_id, nome, situacao)
VALUES (17, 7, 'Empresa 7 Ltda.', 'ATIVO');

INSERT INTO contribuinte (codigo, pessoa_juridica_id, nome, situacao)
VALUES (18, 8, 'Empresa 8 S/A', 'ATIVO');

INSERT INTO contribuinte (codigo, pessoa_juridica_id, nome, situacao)
VALUES (19, 9, 'Empresa 9 LTDA', 'ATIVO');

INSERT INTO contribuinte (codigo, pessoa_juridica_id, nome, situacao)
VALUES (20, 10, 'Empresa 10 S/A', 'ATIVO');

-- Economico
INSERT INTO economico (is_autonomo, codigo, contribuinte_id, dh_inicio_atividade, cpf_cnpj, email, endereco, nome, situacao)
VALUES (true, 1, 1, '2023-01-01 09:00:00', '123.456.789-00', 'joao@email.com', 'Rua A, 123', 'Serviços Autônomos', 'ATIVADO');

INSERT INTO economico (is_autonomo, codigo, contribuinte_id, dh_inicio_atividade, cpf_cnpj, email, endereco, nome, situacao)
VALUES (false, 2, 2, '2022-10-15 08:30:00', '00.000.000/0001-01', 'empresa1@email.com', 'Avenida B, 456', 'Empresa 1 LTDA', 'ATIVADO');

INSERT INTO economico (is_autonomo, codigo, contribuinte_id, dh_inicio_atividade, cpf_cnpj, email, endereco, nome, situacao)
VALUES (false, 3, 3, '2023-03-20 10:00:00', '00.000.000/0002-02', 'empresa2@email.com', 'Rua C, 789', 'Empresa 2 S.A.', 'ATIVADO');

INSERT INTO economico (is_autonomo, codigo, contribuinte_id, dh_inicio_atividade, cpf_cnpj, email, endereco, nome, situacao)
VALUES (true, 4, 4, '2023-05-10 11:30:00', '555.666.777-88', 'ana@email.com', 'Avenida D, 012', 'Serviços Autônomos', 'ATIVADO');

INSERT INTO economico (is_autonomo, codigo, contribuinte_id, dh_inicio_atividade, cpf_cnpj, email, endereco, nome, situacao)
VALUES (true, 5, 5, '2022-12-05 09:00:00', '999.888.777-66', 'pedro@email.com', 'Rua E, 345', 'Serviços Autônomos', 'ATIVADO');

INSERT INTO economico (is_autonomo, codigo, contribuinte_id, dh_inicio_atividade, cpf_cnpj, email, endereco, nome, situacao)
VALUES (false, 6, 6, '2023-02-28 10:30:00', '00.000.000/0003-03', 'empresa3@email.com', 'Avenida F, 678', 'Empresa 3 Ltda.', 'ATIVADO');

INSERT INTO economico (is_autonomo, codigo, contribuinte_id, dh_inicio_atividade, cpf_cnpj, email, endereco, nome, situacao)
VALUES (false, 7, 7, '2023-04-15 08:00:00', '00.000.000/0004-04', 'contato@empresa4.com', 'Rua G, 901', 'Empresa 4 S/A', 'ATIVADO');

INSERT INTO economico (is_autonomo, codigo, contribuinte_id, dh_inicio_atividade, cpf_cnpj, email, endereco, nome, situacao)
VALUES (true, 8, 8, '2023-01-20 09:30:00', '222.111.000-99', 'roberto@email.com', 'Avenida H, 234', 'Serviços Autônomos', 'ATIVADO');

INSERT INTO economico (is_autonomo, codigo, contribuinte_id, dh_inicio_atividade, cpf_cnpj, email, endereco, nome, situacao)
VALUES (false, 9, 9, '2022-11-10 08:45:00', '00.000.000/0005-05', 'contato@empresa5.com', 'Rua I, 567', 'Empresa 5 LTDA', 'ATIVADO');

INSERT INTO economico (is_autonomo, codigo, contribuinte_id, dh_inicio_atividade, cpf_cnpj, email, endereco, nome, situacao)
VALUES (false, 10, 10, '2023-03-05 10:15:00', '00.000.000/0006-06', 'contato@empresa6.com', 'Avenida J, 890', 'Empresa 6 S/A', 'ATIVADO');

-- Imovel
INSERT INTO imovel (codigo, contribuinte_id, endereco, imovel_tipo)
VALUES (1, 1, 'Rua A, 123', 'URBANO');

INSERT INTO imovel (codigo, contribuinte_id, endereco, imovel_tipo)
VALUES (2, 2, 'Avenida B, 456', 'URBANO');

INSERT INTO imovel (codigo, contribuinte_id, endereco, imovel_tipo)
VALUES (3, 3, 'Rua C, 789', 'URBANO');

INSERT INTO imovel (codigo, contribuinte_id, endereco, imovel_tipo)
VALUES (4, 4, 'Avenida D, 012', 'URBANO');

INSERT INTO imovel (codigo, contribuinte_id, endereco, imovel_tipo)
VALUES (5, 5, 'Rua E, 345', 'URBANO');

INSERT INTO imovel (codigo, contribuinte_id, endereco, imovel_tipo)
VALUES (6, 6, 'Avenida F, 678', 'URBANO');

INSERT INTO imovel (codigo, contribuinte_id, endereco, imovel_tipo)
VALUES (7, 7, 'Rua G, 901', 'URBANO');

INSERT INTO imovel (codigo, contribuinte_id, endereco, imovel_tipo)
VALUES (8, 8, 'Avenida H, 234', 'RURAL');

INSERT INTO imovel (codigo, contribuinte_id, endereco, imovel_tipo)
VALUES (9, 9, 'Rua I, 567', 'URBANO');

INSERT INTO imovel (codigo, contribuinte_id, endereco, imovel_tipo)
VALUES (10, 10, 'Avenida J, 890', 'URBANO');

-- Debitos
INSERT INTO debito (vl_beneficio, vl_correção, vl_desconto, vl_juros, vl_lancado, vl_multa, ano, contribuinte_id, credito_id, economico_id, imovel_id, nro_parcela, referente, situacao)
VALUES (0.00, 0.00, 0.00, 0.00, 500.50, 0.00, 2024, NULL, 1, NULL, 1, 1, 'CONTRIBUINTE', 'ABERTO');

INSERT INTO debito (vl_beneficio, vl_correção, vl_desconto, vl_juros, vl_lancado, vl_multa, ano, contribuinte_id, credito_id, economico_id, imovel_id, nro_parcela, referente, situacao)
VALUES (0.00, 0.00, 0.00, 0.00, 700.75, 0.00, 2024, NULL, 2, NULL, 2, 1, 'ECONOMICOS', 'PAGA');

INSERT INTO debito (vl_beneficio, vl_correção, vl_desconto, vl_juros, vl_lancado, vl_multa, ano, contribuinte_id, credito_id, economico_id, imovel_id, nro_parcela, referente, situacao)
VALUES (0.00, 0.00, 0.00, 0.00, 1000.25, 0.00, 2024, NULL, 3, NULL, 3, 1, 'IMOVEIS', 'CANCELADA');

INSERT INTO debito (vl_beneficio, vl_correção, vl_desconto, vl_juros, vl_lancado, vl_multa, ano, contribuinte_id, credito_id, economico_id, imovel_id, nro_parcela, referente, situacao)
VALUES (0.00, 0.00, 0.00, 0.00, 600.80, 0.00, 2024, NULL, 4, NULL, 4, 1, 'CONTRIBUINTE', 'SUSPENSA');

INSERT INTO debito (vl_beneficio, vl_correção, vl_desconto, vl_juros, vl_lancado, vl_multa, ano, contribuinte_id, credito_id, economico_id, imovel_id, nro_parcela, referente, situacao)
VALUES (0.00, 0.00, 0.00, 0.00, 800.95, 0.00, 2024, NULL, 5, NULL, 5, 1, 'ECONOMICOS', 'INSCRITA_ENGLOBADA');

INSERT INTO debito (vl_beneficio, vl_correção, vl_desconto, vl_juros, vl_lancado, vl_multa, ano, contribuinte_id, credito_id, economico_id, imovel_id, nro_parcela, referente, situacao)
VALUES (0.00, 0.00, 0.00, 0.00, 900.60, 0.00, 2024, NULL, 6, NULL, 6, 1, 'IMOVEIS', 'ISENTA');

INSERT INTO debito (vl_beneficio, vl_correção, vl_desconto, vl_juros, vl_lancado, vl_multa, ano, contribuinte_id, credito_id, economico_id, imovel_id, nro_parcela, referente, situacao)
VALUES (0.00, 0.00, 0.00, 0.00, 400.35, 0.00, 2024, NULL, 7, NULL, 7, 1, 'ECONOMICOS', 'ENGLOBADA');

INSERT INTO debito (vl_beneficio, vl_correção, vl_desconto, vl_juros, vl_lancado, vl_multa, ano, contribuinte_id, credito_id, economico_id, imovel_id, nro_parcela, referente, situacao)
VALUES (0.00, 0.00, 0.00, 0.00, 1200.45, 0.00, 2024, NULL, 8, NULL, 8, 1, 'CONTRIBUINTE', 'PAGA_ENGLOBADA');

INSERT INTO debito (vl_beneficio, vl_correção, vl_desconto, vl_juros, vl_lancado, vl_multa, ano, contribuinte_id, credito_id, economico_id, imovel_id, nro_parcela, referente, situacao)
VALUES (0.00, 0.00, 0.00, 0.00, 1500.70, 0.00, 2024, NULL, 9, NULL, 9, 1, 'ECONOMICOS', 'PARCELADA');

INSERT INTO debito (vl_beneficio, vl_correção, vl_desconto, vl_juros, vl_lancado, vl_multa, ano, contribuinte_id, credito_id, economico_id, imovel_id, nro_parcela, referente, situacao)
VALUES (0.00, 0.00, 0.00, 0.00, 1000.10, 0.00, 2024, NULL, 10, NULL, 10, 1, 'IMOVEIS', 'PRESCRITA');

INSERT INTO debito (vl_beneficio, vl_correção, vl_desconto, vl_juros, vl_lancado, vl_multa, ano, contribuinte_id, credito_id, economico_id, imovel_id, nro_parcela, referente, situacao)
VALUES (0.00, 0.00, 0.00, 0.00, 750.25, 0.00, 2024, NULL, 1, NULL, 1, 1, 'CONTRIBUINTE', 'ABERTO');

INSERT INTO debito (vl_beneficio, vl_correção, vl_desconto, vl_juros, vl_lancado, vl_multa, ano, contribuinte_id, credito_id, economico_id, imovel_id, nro_parcela, referente, situacao)
VALUES (0.00, 0.00, 0.00, 0.00, 900.50, 0.00, 2024, NULL, 2, NULL, 2, 1, 'ECONOMICOS', 'PAGA');

INSERT INTO debito (vl_beneficio, vl_correção, vl_desconto, vl_juros, vl_lancado, vl_multa, ano, contribuinte_id, credito_id, economico_id, imovel_id, nro_parcela, referente, situacao)
VALUES (0.00, 0.00, 0.00, 0.00, 1200.80, 0.00, 2024, NULL, 3, NULL, 3, 1, 'IMOVEIS', 'CANCELADA');

INSERT INTO debito (vl_beneficio, vl_correção, vl_desconto, vl_juros, vl_lancado, vl_multa, ano, contribuinte_id, credito_id, economico_id, imovel_id, nro_parcela, referente, situacao)
VALUES (0.00, 0.00, 0.00, 0.00, 850.60, 0.00, 2024, NULL, 4, NULL, 4, 1, 'CONTRIBUINTE', 'SUSPENSA');

INSERT INTO debito (vl_beneficio, vl_correção, vl_desconto, vl_juros, vl_lancado, vl_multa, ano, contribuinte_id, credito_id, economico_id, imovel_id, nro_parcela, referente, situacao)
VALUES (0.00, 0.00, 0.00, 0.00, 1100.95, 0.00, 2024, NULL, 5, NULL, 5, 1, 'ECONOMICOS', 'INSCRITA_ENGLOBADA');

INSERT INTO debito (vl_beneficio, vl_correção, vl_desconto, vl_juros, vl_lancado, vl_multa, ano, contribuinte_id, credito_id, economico_id, imovel_id, nro_parcela, referente, situacao)
VALUES (0.00, 0.00, 0.00, 0.00, 950.40, 0.00, 2024, NULL, 6, NULL, 6, 1, 'IMOVEIS', 'ISENTA');

INSERT INTO debito (vl_beneficio, vl_correção, vl_desconto, vl_juros, vl_lancado, vl_multa, ano, contribuinte_id, credito_id, economico_id, imovel_id, nro_parcela, referente, situacao)
VALUES (0.00, 0.00, 0.00, 0.00, 600.75, 0.00, 2024, NULL, 7, NULL, 7, 1, 'ECONOMICOS', 'ENGLOBADA');

INSERT INTO debito (vl_beneficio, vl_correção, vl_desconto, vl_juros, vl_lancado, vl_multa, ano, contribuinte_id, credito_id, economico_id, imovel_id, nro_parcela, referente, situacao)
VALUES (0.00, 0.00, 0.00, 0.00, 1300.85, 0.00, 2024, NULL, 8, NULL, 8, 1, 'CONTRIBUINTE', 'PAGA_ENGLOBADA');

INSERT INTO debito (vl_beneficio, vl_correção, vl_desconto, vl_juros, vl_lancado, vl_multa, ano, contribuinte_id, credito_id, economico_id, imovel_id, nro_parcela, referente, situacao)
VALUES (0.00, 0.00, 0.00, 0.00, 1700.90, 0.00, 2024, NULL, 9, NULL, 9, 1, 'ECONOMICOS', 'PARCELADA');

INSERT INTO debito (vl_beneficio, vl_correção, vl_desconto, vl_juros, vl_lancado, vl_multa, ano, contribuinte_id, credito_id, economico_id, imovel_id, nro_parcela, referente, situacao)
VALUES (0.00, 0.00, 0.00, 0.00, 1100.20, 0.00, 2024, NULL, 10, NULL, 10, 1, 'IMOVEIS', 'PRESCRITA');

INSERT INTO debito (vl_beneficio, vl_correção, vl_desconto, vl_juros, vl_lancado, vl_multa, ano, contribuinte_id, credito_id, economico_id, imovel_id, nro_parcela, referente, situacao)
VALUES (0.00, 0.00, 0.00, 0.00, 600.35, 0.00, 2024, NULL, 1, NULL, 1, 1, 'CONTRIBUINTE', 'ABERTO');

INSERT INTO debito (vl_beneficio, vl_correção, vl_desconto, vl_juros, vl_lancado, vl_multa, ano, contribuinte_id, credito_id, economico_id, imovel_id, nro_parcela, referente, situacao)
VALUES (0.00, 0.00, 0.00, 0.00, 800.75, 0.00, 2024, NULL, 2, NULL, 2, 1, 'ECONOMICOS', 'PAGA');

INSERT INTO debito (vl_beneficio, vl_correção, vl_desconto, vl_juros, vl_lancado, vl_multa, ano, contribuinte_id, credito_id, economico_id, imovel_id, nro_parcela, referente, situacao)
VALUES (0.00, 0.00, 0.00, 0.00, 950.90, 0.00, 2024, NULL, 3, NULL, 3, 1, 'IMOVEIS', 'CANCELADA');

INSERT INTO debito (vl_beneficio, vl_correção, vl_desconto, vl_juros, vl_lancado, vl_multa, ano, contribuinte_id, credito_id, economico_id, imovel_id, nro_parcela, referente, situacao)
VALUES (0.00, 0.00, 0.00, 0.00, 700.60, 0.00, 2024, NULL, 4, NULL, 4, 1, 'CONTRIBUINTE', 'SUSPENSA');

INSERT INTO debito (vl_beneficio, vl_correção, vl_desconto, vl_juros, vl_lancado, vl_multa, ano, contribuinte_id, credito_id, economico_id, imovel_id, nro_parcela, referente, situacao)
VALUES (0.00, 0.00, 0.00, 0.00, 1050.95, 0.00, 2024, NULL, 5, NULL, 5, 1, 'ECONOMICOS', 'INSCRITA_ENGLOBADA');

INSERT INTO debito (vl_beneficio, vl_correção, vl_desconto, vl_juros, vl_lancado, vl_multa, ano, contribuinte_id, credito_id, economico_id, imovel_id, nro_parcela, referente, situacao)
VALUES (0.00, 0.00, 0.00, 0.00, 850.40, 0.00, 2024, NULL, 6, NULL, 6, 1, 'IMOVEIS', 'ISENTA');

INSERT INTO debito (vl_beneficio, vl_correção, vl_desconto, vl_juros, vl_lancado, vl_multa, ano, contribuinte_id, credito_id, economico_id, imovel_id, nro_parcela, referente, situacao)
VALUES (0.00, 0.00, 0.00, 0.00, 500.75, 0.00, 2024, NULL, 7, NULL, 7, 1, 'ECONOMICOS', 'ENGLOBADA');

INSERT INTO debito (vl_beneficio, vl_correção, vl_desconto, vl_juros, vl_lancado, vl_multa, ano, contribuinte_id, credito_id, economico_id, imovel_id, nro_parcela, referente, situacao)
VALUES (0.00, 0.00, 0.00, 0.00, 1400.85, 0.00, 2024, NULL, 8, NULL, 8, 1, 'CONTRIBUINTE', 'PAGA_ENGLOBADA');

INSERT INTO debito (vl_beneficio, vl_correção, vl_desconto, vl_juros, vl_lancado, vl_multa, ano, contribuinte_id, credito_id, economico_id, imovel_id, nro_parcela, referente, situacao)
VALUES (0.00, 0.00, 0.00, 0.00, 1800.90, 0.00, 2024, NULL, 9, NULL, 9, 1, 'ECONOMICOS', 'PARCELADA');

INSERT INTO debito (vl_beneficio, vl_correção, vl_desconto, vl_juros, vl_lancado, vl_multa, ano, contribuinte_id, credito_id, economico_id, imovel_id, nro_parcela, referente, situacao)
VALUES (0.00, 0.00, 0.00, 0.00, 1200.20, 0.00, 2024, NULL, 10, NULL, 10, 1, 'IMOVEIS', 'PRESCRITA');
