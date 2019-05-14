insert into cus_languages (languages_id,name,short_name) values (1, 'English', 'en');
insert into cus_languages (languages_id,name,short_name) values (2, 'Tiếng Việt', 'vi');

insert into categories (categories_id) values(1);
insert into categories (categories_id) values(2);
insert into categories (categories_id) values(3);

insert into categories_translate (categories_id,languages_id,name) values(1,1,'Category 1');
insert into categories_translate (categories_id,languages_id,name) values(1,2,'Category 1 V');
insert into categories_translate (categories_id,languages_id,name) values(2,1,'Category 2');
insert into categories_translate (categories_id,languages_id,name) values(3,1,'Category 3');

insert into company (company_id, phone1, is_default) values (1,'0984888888', TRUE);
insert into company (company_id, phone1, is_default) values (2,'000000000', FALSE);

insert into company_translate (company_id,languages_id, name, address) values (1,2,'company name', 'address 1');
insert into company_translate (company_id,languages_id, name, address) values (1,1,'company name En', 'address En');
insert into company_translate (company_id,languages_id, name, address) values (2,1,'company name v', 'address v');
