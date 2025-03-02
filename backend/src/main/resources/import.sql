INSERT INTO Pessoas (id, nome, apelido)  values ('1be6678c-204c-474d-8bad-784d28d7ef54', 'Yan', 'Pedro');
INSERT INTO stack (id, stackname) values (1, 'C');
INSERT INTO stack (id, stackname) values (2, 'Ruby');

INSERT INTO pessoas_stack (people_uuid, stack_id) values ('1be6678c-204c-474d-8bad-784d28d7ef54', 1);
INSERT INTO pessoas_stack (people_uuid, stack_id) values ('1be6678c-204c-474d-8bad-784d28d7ef54', 2);