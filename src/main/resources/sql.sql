create table Person (
    id int GENERATED by default as identity primary key ,
    name varchar(100) not null ,
    age int ,
    email varchar(100)
);
insert into person(name, age, email)  values ('Tom', 25, 'tom@mail.ru');
insert into person(name, age, email)  values ('Bob', 51, 'bob@mail.ru');
insert into person(name, age, email)  values ('Katy', 38, 'katy@mail.ru');
