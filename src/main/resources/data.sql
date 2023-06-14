INSERT INTO "PUBLIC"."MARKETPLACE" VALUES
                                  (1, 'welcome to the marketplace where you can see all type of online businesses');

insert into "PUBLIC"."ECOMMERCE"(
                       ID, ECOMMERCE_NAME, TYPE, PRICE, MONTHLY_PROFIT, FOUNDATION, PRODUCTS_RATINGS,
                       PAYMENT_METHOD, LOCATION, MARKETPLACE_ID)
values (
           1, 'Pikiki', 'FBA', 15000, 500, '2015', 'Good', 'Paypal, CreditCard', 'USA',1);

insert into "PUBLIC"."ECOMMERCE" (
    ID, ECOMMERCE_NAME, TYPE, PRICE, MONTHLY_PROFIT, FOUNDATION, PRODUCTS_RATINGS,
    PAYMENT_METHOD, LOCATION, MARKETPLACE_ID)
values (
           2, 'Bilaa', 'KDP', 25000, 1200, '2013', 'Great', 'CreditCard', 'CANADA', 1);

insert into "PUBLIC"."ECOMMERCE" (
    ID, ECOMMERCE_NAME, TYPE, PRICE, MONTHLY_PROFIT, FOUNDATION, PRODUCTS_RATINGS,
    PAYMENT_METHOD, LOCATION, MARKETPLACE_ID)
values (
           3, 'Bruh', 'MBA', 25700, 1210, '2017', 'Perfect', 'CreditCart', 'BELGIUM', 1);

insert into "PUBLIC"."APPLICATION" (
    ID, APPLICATION_NAME, TYPE, PRICE, MONTHLY_PROFIT, FOUNDATION, TOTAL_DOWNLOADED,
    PAYMENT_METHOD, LOCATION, MARKETPLACE_ID)
values (
           1, 'Awesomeness', 'IOS', 100700, 3010, '2012', 257821, 'CreditCart', 'MOROCCO', 1);

insert into "PUBLIC"."APPLICATION" (
    ID, APPLICATION_NAME, TYPE, PRICE, MONTHLY_PROFIT, FOUNDATION, TOTAL_DOWNLOADED,
    PAYMENT_METHOD, LOCATION, MARKETPLACE_ID)
values (
           2, 'Greatness', 'ANDROID', 500700, 7010, '2017', 350000, 'CreditCart', 'SPAIN', 1);

insert into "PUBLIC"."INDUSTRY"(
    ID, INDUSTRY_NAME, INDUSTRY_IMAGE, DESCRIPTION, MARKET_SIZE, COMPETITION )
values (
           1,'Health & Fitness','img', 'this is a big industry', 1000000, 'HIGH' );

insert into "PUBLIC"."INDUSTRY"(
    ID, INDUSTRY_NAME, INDUSTRY_IMAGE, DESCRIPTION, MARKET_SIZE, COMPETITION )
values (
           2,'Gaming','img', 'this is a huge industry', 10000000, 'MEDIUM' );

insert into "PUBLIC"."INDUSTRY"(
    ID, INDUSTRY_NAME, INDUSTRY_IMAGE, DESCRIPTION, MARKET_SIZE, COMPETITION )
values (
           3,'Automotive','img', 'this is an interesting industry', 570000, 'LOW' );

insert into "PUBLIC"."INDUSTRY"(
    ID, INDUSTRY_NAME, INDUSTRY_IMAGE, DESCRIPTION, MARKET_SIZE, COMPETITION )
values (
           4,'Books','img', 'this is an interesting industry', 459954, 'MEDIUM' );
insert into "PUBLIC"."INDUSTRY"(
    ID, INDUSTRY_NAME, INDUSTRY_IMAGE, DESCRIPTION, MARKET_SIZE, COMPETITION )
values (
           5,'Clothing','img', 'this is an interesting industry', 856796,'HIGH' );
insert into "PUBLIC"."INDUSTRY"(
    ID, INDUSTRY_NAME, INDUSTRY_IMAGE, DESCRIPTION, MARKET_SIZE, COMPETITION )
values (
           6,'Agriculture','img', 'this is an interesting industry', 235874, 'HIGH' );


INSERT INTO INDUSTRY_ECOMMERCES (INDUSTRIES_ID, ECOMMERCES_ID) VALUES (1, 1);
INSERT INTO INDUSTRY_ECOMMERCES (INDUSTRIES_ID, ECOMMERCES_ID) VALUES (4, 2);
INSERT INTO INDUSTRY_ECOMMERCES (INDUSTRIES_ID, ECOMMERCES_ID) VALUES (5, 3);



