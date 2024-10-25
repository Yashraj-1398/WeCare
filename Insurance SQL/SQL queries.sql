-- create database insurance;
use insurance;

----- create and Validation Login Page ----------------
-- CREATE TABLE ValidationLogin(loginas varchar(30), companyname varchar(30), username varchar(30), password varchar(30));
-- insert into ValidationLogin values("salesagency","", "kartik", "dixit");
-- drop table ValidationLogin;
-- select * from ValidationLogin;
-- SELECT  loginas, username, password, companyname FROM ValidationLogin
-- SELECT  loginas, username, password FROM ValidationLogin


-- ----------------  CREATING_TABLES---------

-- create table HealthClaim(
-- custID int,
-- gender varchar(8),
-- DOB varchar(70),
-- tobacco_user varchar(5),
-- pregnant_adopting varchar(5),
-- chronic_condition varchar(150),
-- expected_income int,
-- height float,
-- weight float,
-- premium int,
-- salesbroker_id int
-- );
-- --------------------------
-- drop table PetClaim;
-- create table PetClaim(
-- custID int,
-- petname varchar(30),
-- species varchar(5),
-- sex varchar(6),
-- breed varchar(40),
-- age varchar(20),
-- zip_code int,
-- premium int,
-- salesbroker_id int
-- );
-- --------------------------
-- create table VehicleClaim(
-- custID int,
-- model_year varchar(10),
-- make varchar(20),
-- model varchar(20),
-- original_owner varchar(5),
-- how_drive varchar(25),
-- current_insurance varchar(5),
-- accident_theft varchar(5),
-- VIN varchar(20),
-- license varchar(10),
-- premium int,
-- salesbroker_id int
-- );

-- --------------------------------
-- create table HomeClaim(
-- custID int,
-- address varchar(100),
-- year_built int,
-- living_area int,
-- building_material varchar(20),
-- garage_type varchar(30),
-- on_rent varchar(5),
-- pool varchar(5),
-- fire_hydrant varchar(5),
-- no_mortgages int,
-- storeys varchar(20),
-- SSN long,
-- premium int,
-- salesbroker_id int
-- );

-- -------------   Pricing tables-  --------------------

-- create table VehiclePricing(
-- base_premium int,
-- twentytwo_twentyone int,
-- twenty_nineteen int,
-- fifteen_eighteen int,
-- ten_fourteen int,
-- before_ten int,
-- BMW int,
-- Audi int,
-- Toyota int,
-- Tesla int,
-- X1 int,
-- M3 int,
-- X3 int,
-- X5 int,
-- i8 int,
-- A3 INT,
-- A4 int,
-- A6 int,
-- Q3 INT,
-- corolla int,
-- prius int,
-- highlander_hybrid int,
-- four_Runner int,
-- three int,
-- Y int,
-- S int,
-- X int
-- );

-- drop table PetPricing;
-- -- Pet pricing-
-- create table PetPricing(
-- base_premium int,
-- pet_dog int,
-- pet_cat int,
-- female int,
-- male int,
-- age_0_6_months int,
-- age_6_12_months int,
-- age_1_3_years int,
-- age_3_5_years int,
-- age_5_7_years int,
-- age_7_9_years int,
-- age_9plus_years int,
-- company varchar(30)
-- );  
-- insert into PetPricing values(500,600,500,100,75,90,100,110,120,130,140,150,"Geico");
-- insert into PetPricing values(550,600,500,100,75,90,110,110,120,130,140,150,"AllState");
-- insert into PetPricing values(500,600,550,100,75,90,100,110,120,130,140,150,"Progessive");
-- insert into PetPricing values(550,600,500,100,75,90,100,110,120,130,140,150,"StateFarm");
-- Health pricing-
-- drop table HealthPricing;
-- create table HealthPricing(
-- company varchar(30),
-- base_premium int,
-- tobacco_no int,
-- tobacco_yes int,
-- child_no int,
-- child_yes int,
-- cancer int,
-- heart_patient int,
-- AIDS_HIV int,
-- renal_kidney_failure int,
-- bipolar_disorder int
-- );
-- select * from Financemiddle;
-- insert into HealthPricing values ("Progressive",1300,0,30,0,30,160,550,600,350,350);
-- ---------Registration pages-

-- drop table CustomerRegistration;
-- Customer-
-- create table CustomerRegistration(
-- cust_id varchar(20),
-- fname varchar(30),
-- lname varchar(30),
-- street_address varchar(30),
-- state varchar(30),
-- city varchar(30),
-- zip_code varchar(30),
-- gender varchar(10),
-- dob varchar(30),
-- phone long,
-- username varchar(30),
-- pass varchar(30),
-- email varchar(40)
-- );



-- drop table ManagerRegistration;
-- Manager-
-- create table ManagerRegistration(
-- manager_id varchar(30),
-- emp_role varchar(30),
-- insurance_company varchar(30),
-- fname varchar(30),
-- lname varchar(30),
-- street_address varchar(30),
-- state varchar(30),
-- city varchar(30),
-- zip_code varchar(30),
-- gender varchar(30),
-- dob varchar(30),
-- phone long,
-- username varchar(30),
-- email varchar(40),
-- pass varchar(30)
-- );
-- select * from SalesAgentRegistration;
-- select * from ManagerRegistration
 -- select * from ValidationLogin;
-- create table SalesAgentRegistration(
-- sales_id varchar(30),
-- fname varchar(30),
-- lname varchar(30),
-- street_address varchar(30),
-- state varchar(30),
-- city varchar(30),
-- zip_code varchar(30),
-- gender varchar(30),
-- dob varchar(30),
-- phone long,
-- username varchar(30),
-- email varchar(40),
-- pass varchar(30)
-- );


 -- select * from CustomerRegistration;
--  select * from ValidationLogin;
-- delete  from ValidationLogin where username = "d";

-- select * from HealthPricing;
-- drop table Person
-- select * from CustomerRegistration
-- create table Person(person_id int,FirstName varchar(30),LastName varchar(30));


-- base_premium,tobacco_no ,tobacco_yes ,child_no ,child_yes ,cancer ,heart_patient ,AIDS_HIV ,renal_kidney_failure ,bipolar_disorder ,
-- drop table appointment;
-- create table appointment(company varchar(20), cust_id varchar(30), reason varchar(40),date_of_app varchar(40), time varchar(30))
-- select * from appointment



-- drop table managepolicies;

-- create table managepolicies(company varchar(30),cust_id varchar(30),gender varchar(30),DOB varchar(30),tobacco varchar(30),preg_child varchar(30),chronic varchar(300),annual varchar(30),height varchar(30),weight varchar(30),premium varchar(30),sales_id varchar(30));

-- select * from claimtable
 -- select * from managepolicies;
-- drop table claimtable;
-- create table claimtable (cust_id varchar(20),reason varchar(200),detailed_desc varchar(500),company_name varchar(70));
--  select * from claimtable;
-- create table inform(cust_id varchar(20),reason varchar(200))
-- select * from inform;


-- ------------ How to create safe mode deleting files ---------------
-- SET SQL_SAFE_UPDATES = 0;
-- delete  from inform where cust_id = "C2";
-- update HealthPricing set base_premium = ?,tobacco_no =?,tobacco_yes = ?, child_no = ?, child_yes = ?,cancer = ? ,heart_patient =?,AIDS_HIV =?,renal_kidney_failure = ?,bipolar_disorder =? WHERE company = 'Geico'
 -- select * from HealthPricing
-- select c.cust_id, r.fname, r.lname, c.reason,c.detailed_desc,m.premium as health_premium , m.sales_id from Financemiddle c inner join CustomerRegistration r on c.cust_id = r.cust_id inner join managepolicies m on c.cust_id = m.cust_id  where c.cust_id = "C1";
-- select * from Financemiddle
-- create table SalesCommission (cust_id varchar(30),sales_id varchar(30), premium int);
-- select c.cust_id, r.fname, r.lname, c.reason, c.detailed_desc, m.premium as health_premium , m.sales_id from Financemiddle c inner join CustomerRegistration r on c.cust_id = r.cust_id inner join managepolicies m on c.cust_id = m.cust_id

-- select * from SalesCommission;
-- SELECT sum(premium) as commission from SalesCommission where sales_id = 's11'  group by sales_id;

-- delete  from managepolicies;
-- create table ManagePetPolicies(
-- custID varchar(20),
-- petname varchar(30),
-- species varchar(5),
-- sex varchar(6),
-- breed varchar(40),
-- age varchar(20),
-- zip_code varchar(30),
-- premium varchar(15),
-- salesbroker_id varchar(30),
-- company varchar(30)
-- );



select * from ManagePetPolicies;


-- drop table CarPrice;
-- create table CarPrice(
-- company varchar(30),
-- base_premium int,
-- Y2022_21 int,
-- Y2020_19 int,
-- Y2018_15 int,
-- Y2014_10 int,
-- Y2010_and_Below int,
-- BMW int,
-- Audi int,
-- Toyota int,
-- Tesla int,
--  X1 int,
--  M3 int,
--  X3 int,
--  X5 int,
--  A3 int,
--  A4 int,
--  A6 int,
--  Q3 int,
--  Y3 int,
--  Y int,
-- S int,
-- X int,
--  Corolla int,
--  Prius int,
--  HighlanderHybrid int,
--  Y4_Runner int
-- );

-- select * from managecarpolicies;
-- create table managecarpolicies(
-- company varchar(30),
-- cust_id varchar(30),
-- model_year varchar(30),
-- make varchar(30),
-- model varchar(30),
-- owner varchar(30),
-- purpose varchar(30),
-- current_insurance varchar(30),
-- six_months varchar(30),
-- vin varchar(30),
-- liscense_state varchar(30),
-- sales_id varchar(30),
-- premium varchar(30)
-- );

-- update ManagePetPolicies SET company = 'Progressive' where custID = 'C2';
-- delete from managecarpolicies
-- select * from CarPrice;
 -- insert into CarPrice values("Geico",200,30,40,80,100,120,30,30,60,15,20,20,30,40,50,50,70,40,30,30,30,40,60,60,80,60);
 -- select * from managecarpolicies;
-- select custID , premium as health_premium , salesbroker_id from ManagePetPolicies where custID = "C2" and company = 'Progressive'
 
 
 
