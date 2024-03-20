# SENAI Fullstack [Education]

## Resolução dos exercícios da Semana 9

### M1S09 | Ex 1 - Entidades do Projeto

O projeto será baseado nas seguintes Entidades:

- Livro: id, titulo, autor, anoPublicacao
- Membros: id, nome, endereco, telefone
- Empréstimos: id, livro(id\_livro), membro(id\_membro), dataEmprestimo, dataDevolucao
- Bibliotecario: id, nome, email, senha
- Visitante: id, nome, telefone

### M1S09 | Ex 2 - MER

Baseado no exercício anterior desenhe as entidades e os relacionamentos entre elas.

Adicione esse desenho como uma imagem na pasta base do projeto (o diretório raiz).

### M1S09 | Ex 3 - Endpoints CREATE

Cria os endpoints POST para cada uma das entidades, lembrando que para empréstimos teremos que receber os ids de um livro e um membro pré-existentes.

Exemplo de caminho das entidades:

- /livro
- /membros
- /bibliotecarios
- /vistantes

### M1S09 | Ex 4 - Endpoints READ

Cria os endpoints GET para cada uma das entidades, esse get deve retornar uma lista completa dos objetos da entidade que ele representa.

Os caminhos devem ser os mesmo do exercicio CREATE, mas devem ter métodos HTTP diferentes.

### M1S09 | Ex 5 - Endpoints DELETE

Cria os endpoints DELETE para cada uma das entidades, se uma tabela tem um relacionamento, ela deve poder ser deletada se o objeto relacionado for deletado primeiro.

Os caminhos devem ser os mesmo do exercício CREATE, mas devem ter métodos HTTP diferentes.

### M1S09 | Ex 6 - Queries UPDATE

Cria queries SQL usando a anotação \@Query para criar um método update para cada entidade. Essas queries devem usar JPQL ou Native Queries.

### M1S09 | Ex 7 - Endpoints UPDATE

Cria os endpoints UPDATE para cada uma das entidades, use o método update criado anteriormente.

Os caminhos devem ser os mesmo do exercício CREATE, mas devem ter métodos HTTP diferentes.

### M1S09 | Ex 8 - Scripts de Criação de Tabelas

Crie Scripts para a criação de um banco de dados chamado biblioteca, e adicione os comando para criar o banco de dados e as tabelas. Coloque os scripts no arquivo 'schema.sql'.

Adicione também scripts para inserir pelo menos uma linha de dados para cada tabela. Coloque os scripts no arquivo 'data.sql'.