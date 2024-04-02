create database if not exists biblioteca;

create table if not exists bibliotecario (
    id bigserial not null primary key,
    nome varchar(255),
    email varchar(255),
    senha varchar(255)
)

create table if not exists livro (
   id bigserial not null primary key,
   titulo varchar(255),
   autor varchar(255),
   ano_publicacao bigint
)

create table if not exists membro (
    id bigserial not null primary key,
    nome varchar(255),
    endereco varchar(255),
    telefone varchar(255)
)

create table if not exists visitante (
   id bigserial not null primary key,
   nome varchar(255),
   telefone varchar(255)
)


create table if not exists emprestimo (
    id bigserial not null primary key,
    livro_id bigint not null references livro(id),
    membro_id bigint not null references membro(id),
    data_devolucao date,
    data_emprestimo date
)