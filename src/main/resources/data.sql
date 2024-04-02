insert into livro (id, titulo, autor, anoPublicacao)
values (1, 'Harry Potter e a Pedra Filosofal', 'J.K. Rowling', 1999),
       (2, 'Harry Potter e a Câmara Secreta', 'J.K. Rowling', 2000),
       (3, 'Harry Potter e o Prisioneiro de Azkaban', 'J.K. Rowling', 2001);

insert into membro (id, nome, endereco, telefone)
values (1, 'Maya', 'Rua Jasmim, 23', '41911112222'),
       (2, 'Barto', 'Rua Rosa, 45', '42922223333'),
       (3, 'Noah', 'Rua Violega, 89', '43933334444');

insert into bibliotecario (id, nome, email, senha)
values (1, 'Ana Souza', 'ana@email.com', 'padrao123'),
       (2, 'Pedro de Oliveira', 'pedro@email.com', 'padrao123'),
       (3, 'Julia Alves', 'julia@email.com', 'padrao123');

insert into visitante (id, nome, telefone)
values (1, 'Maria da Silva', '+111222333'),
       (2, 'Antonio dos Santos', '+111222333'),
       (3, 'Joaquim Mattos', '+444555666');

insert into emprestimos (id, livro_id, membro_id, dataEmprestimo, dataDevolucao)
values (1, 1, 1, '2023-10-05', '2023-11-04'),
       (2, 2, 2, '2023-12-01', '2024-01-02')
       (3, 3, 3, '2024-01-10', '2024-02-09');
