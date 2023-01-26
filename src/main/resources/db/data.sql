insert into user_tb(username, password, email, created_at) values('ssar', '1234', 'ssar@nate.com', now());
insert into user_tb(username, password, email, created_at) values('cos', '1234', 'cos@nate.com', now());
insert into user_tb(username, password, email, created_at) values('love', '1234', 'love@nate.com', now());

insert into board_tb(title, user_id, created_at) values('첫번째 글', 1, now());
insert into board_tb(title, user_id, created_at) values('두번째 글', 1, now());
insert into board_tb(title, user_id, created_at) values('세번째 글', 1, now());
insert into board_tb(title, user_id, created_at) values('네번째 글', 1, now());
insert into board_tb(title, user_id, created_at) values('다섯번째 글', 1, now());
insert into board_tb(title, user_id, created_at) values('첫번째 게시글', 2, now());
insert into board_tb(title, user_id, created_at) values('두번째 게시글', 2, now());
insert into board_tb(title, user_id, created_at) values('세번째 게시글', 2, now());
insert into board_tb(title, user_id, created_at) values('네번째 게시글', 2, now());
insert into board_tb(title, user_id, created_at) values('다섯번째 게시글', 2, now());

commit;