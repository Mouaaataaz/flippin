INSERT INTO "PUBLIC"."MARKETPLACE" VALUES
                                  (1, 'welcome to the marketplace where you can see all type of online businesses');

insert into "PUBLIC"."ECOMMERCE"(
                       ID, ECOMMERCE_NAME, TYPE, PRICE, MONTHLY_PROFIT, FOUNDATION, PRODUCTS_RATINGS,
                       PAYMENT_METHOD, LOCATION)
values (
           1, 'Pikiki', 'FBA', 15000, 500, '2015', 'Good', 'Paypal, CreditCard', 'USA');

insert into "PUBLIC"."ECOMMERCE" (
    ID, ECOMMERCE_NAME, TYPE, PRICE, MONTHLY_PROFIT, FOUNDATION, PRODUCTS_RATINGS,
    PAYMENT_METHOD, LOCATION)
values (
           2, 'Bilaa', 'KDP', 25000, 1200, '2013', 'Great', 'CreditCard', 'CANADA');

insert into "PUBLIC"."ECOMMERCE" (
    ID, ECOMMERCE_NAME, TYPE, PRICE, MONTHLY_PROFIT, FOUNDATION, PRODUCTS_RATINGS,
    PAYMENT_METHOD, LOCATION)
values (
           3, 'Bruh', 'MBA', 25700, 1210, '2017', 'Perfect', 'CreditCart', 'BELGIUM');

insert into APPLICATION (
    ID, APPLICATION_NAME, TYPE, PRICE, MONTHLY_PROFIT, FOUNDATION, TOTAL_DOWNLOADED,
    PAYMENT_METHOD, LOCATION)
values (
           1, 'Awesomeness', 'IOS', 100700, 3010, '2012', 257821, 'CreditCart', 'MOROCCO');

insert into INDUSTRY(
    ID, INDUSTRY_NAME, INDUSTRY_IMAGE, DESCRIPTION, MARKET_SIZE )
values (
           1,'Health & Fitness','img', 'this is a big industry', 1000000 );

insert into INDUSTRY(
    ID, INDUSTRY_NAME, INDUSTRY_IMAGE, DESCRIPTION, MARKET_SIZE )
values (
           2,'Gaming','img', 'this is a huge industry', 10000000 );

insert into INDUSTRY(
    ID, INDUSTRY_NAME, INDUSTRY_IMAGE, DESCRIPTION, MARKET_SIZE )
values (
           3,'Automotive','img', 'this is an interesting industry', 570000 );


