create table employee(
    employee_id bigint identity(1,1) not null,
    name varchar(25) not null,
    job_id bigint not null,
    salary int not null,
    department_id bigint not null,
    constraint pk_employee primary key(employee_id)
);

--alter table employee add constraint pk_employee primary key(employee_id);