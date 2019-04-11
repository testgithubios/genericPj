insert into cus_languages (languages_id,name,short_name) values (1, 'English', 'en');
insert into cus_languages (languages_id,name,short_name) values (2, 'Tiếng Việt', 'vi');

insert into categories (categories_id) values(1);
insert into categories (categories_id) values(2);
insert into categories (categories_id) values(3);

insert into categories_translate (categories_id,languages_id,name) values(1,1,'Category 1');
insert into categories_translate (categories_id,languages_id,name) values(1,2,'Category 1 V');
insert into categories_translate (categories_id,languages_id,name) values(2,1,'Category 2');
insert into categories_translate (categories_id,languages_id,name) values(3,1,'Category 3');