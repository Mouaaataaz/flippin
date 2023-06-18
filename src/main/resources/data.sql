INSERT INTO "PUBLIC"."MARKETPLACE" VALUES
                                  (1, 'This is the marketplace where you can see all type of online businesses');





insert into "PUBLIC"."ECOMMERCE"(
                       ID, ECOMMERCE_NAME, ECOMMERCE_TYPE, ECOMMERCE_PRICE, MONTHLY_PROFIT, FOUNDATION, PRODUCTS_RATINGS,
                       PAYMENT_METHOD, LOCATION,ECOMMERCE_IMAGE, MARKETPLACE_ID)
values (
           1, 'Pikiki', 'FBA', 15000, 500, '2015', 'Good', 'Paypal, CreditCard', 'USA','https://upload.wikimedia.org/wikipedia/commons/b/b6/Gym_wiki.jpg',1);

insert into "PUBLIC"."ECOMMERCE" (
    ID, ECOMMERCE_NAME, ECOMMERCE_TYPE, ECOMMERCE_PRICE, MONTHLY_PROFIT, FOUNDATION, PRODUCTS_RATINGS,
    PAYMENT_METHOD, LOCATION, ECOMMERCE_IMAGE, MARKETPLACE_ID)
values (
           2, 'Bilaa', 'KDP', 25000, 1200, '2013', 'Great', 'CreditCard', 'CANADA','https://upload.wikimedia.org/wikipedia/commons/5/5a/Books_HD_%288314929977%29.jpg', 1);

insert into "PUBLIC"."ECOMMERCE" (
    ID, ECOMMERCE_NAME, ECOMMERCE_TYPE, ECOMMERCE_PRICE, MONTHLY_PROFIT, FOUNDATION, PRODUCTS_RATINGS,
    PAYMENT_METHOD, LOCATION, ECOMMERCE_IMAGE, MARKETPLACE_ID)
values (
           3, 'Bruzz', 'MBA', 25700, 1210, '2017', 'Perfect', 'CreditCart', 'BELGIUM','https://upload.wikimedia.org/wikipedia/commons/5/52/ClothingReadyWear.jpg', 1);
insert into "PUBLIC"."ECOMMERCE" (
    ID, ECOMMERCE_NAME, ECOMMERCE_TYPE, ECOMMERCE_PRICE, MONTHLY_PROFIT, FOUNDATION, PRODUCTS_RATINGS,
    PAYMENT_METHOD, LOCATION, ECOMMERCE_IMAGE, MARKETPLACE_ID)
values (
           4, 'Polas', 'SHOPIFY', 105700, 5047, '2015', 'Good', 'CreditCart, Paypal', 'USA','https://upload.wikimedia.org/wikipedia/commons/e/ea/San_Diego_Automotive_Museum_-_Entrance_%28May_2022%29.jpg', 1);
insert into "PUBLIC"."ECOMMERCE" (
    ID, ECOMMERCE_NAME, ECOMMERCE_TYPE, ECOMMERCE_PRICE, MONTHLY_PROFIT, FOUNDATION, PRODUCTS_RATINGS,
    PAYMENT_METHOD, LOCATION, ECOMMERCE_IMAGE, MARKETPLACE_ID)
values (
           5, 'Mlaos', 'KDP', 157000, 2210, '2012', 'Perfect', 'CreditCart', 'BRAZIL','https://upload.wikimedia.org/wikipedia/commons/5/5a/Books_HD_%288314929977%29.jpg', 1);
insert into "PUBLIC"."ECOMMERCE" (
    ID, ECOMMERCE_NAME, ECOMMERCE_TYPE, ECOMMERCE_PRICE, MONTHLY_PROFIT, FOUNDATION, PRODUCTS_RATINGS,
    PAYMENT_METHOD, LOCATION, ECOMMERCE_IMAGE, MARKETPLACE_ID)
values (
           6, 'Kaoz', 'SHOPIFY', 57000, 510, '2010', 'Good', 'Paypal', 'FRANCE','https://www.tlnt.com/_next/image?url=https%3A%2F%2Fapi.eremedia.com%2Fwp-content%2Fuploads%2F2018%2F11%2FVideo-game.jpg&w=1920&q=75', 1);
insert into "PUBLIC"."ECOMMERCE" (
    ID, ECOMMERCE_NAME, ECOMMERCE_TYPE, ECOMMERCE_PRICE, MONTHLY_PROFIT, FOUNDATION, PRODUCTS_RATINGS,
    PAYMENT_METHOD, LOCATION, ECOMMERCE_IMAGE, MARKETPLACE_ID)
values (
           7, 'Prioc', 'FBA', 37800, 415, '2014', 'Great', 'CreditCart', 'ITALY','https://npr.brightspotcdn.com/dims4/default/b99ae25/2147483647/strip/true/crop/580x380+0+0/resize/1760x1154!/format/webp/quality/90/?url=http%3A%2F%2Fnpr-brightspot.s3.amazonaws.com%2Flegacy%2Fsites%2Fipr%2Ffiles%2F201703%2F012516_Prairie-combine.jpg', 1);








insert into "PUBLIC"."APPLICATION" (
    ID, APPLICATION_NAME, TYPE, PRICE, MONTHLY_PROFIT, FOUNDATION, TOTAL_DOWNLOADED,
    PAYMENT_METHOD, LOCATION, APPLICATION_IMAGE, MARKETPLACE_ID)
values (
           1, 'Awesomeness', 'IOS', 100700, 3010, '2012', 257821, 'CreditCart', 'MOROCCO','https://upload.wikimedia.org/wikipedia/commons/b/b6/Gym_wiki.jpg', 1);

insert into "PUBLIC"."APPLICATION" (
    ID, APPLICATION_NAME, TYPE, PRICE, MONTHLY_PROFIT, FOUNDATION, TOTAL_DOWNLOADED,
    PAYMENT_METHOD, LOCATION, APPLICATION_IMAGE, MARKETPLACE_ID)
values (
           2, 'Greatness', 'ANDROID', 500700, 7010, '2017', 350000, 'CreditCart', 'SPAIN','https://upload.wikimedia.org/wikipedia/commons/5/5a/Books_HD_%288314929977%29.jpg', 1);
insert into "PUBLIC"."APPLICATION" (
    ID, APPLICATION_NAME, TYPE, PRICE, MONTHLY_PROFIT, FOUNDATION, TOTAL_DOWNLOADED,
    PAYMENT_METHOD, LOCATION, APPLICATION_IMAGE, MARKETPLACE_ID)
values (
           3, 'AOAP', 'ANDROID', 650700, 7910, '2016', 420500, 'CreditCart', 'AUSTRALIA','https://www.tlnt.com/_next/image?url=https%3A%2F%2Fapi.eremedia.com%2Fwp-content%2Fuploads%2F2018%2F11%2FVideo-game.jpg&w=1920&q=75', 1);
insert into "PUBLIC"."APPLICATION" (
    ID, APPLICATION_NAME, TYPE, PRICE, MONTHLY_PROFIT, FOUNDATION, TOTAL_DOWNLOADED,
    PAYMENT_METHOD, LOCATION, APPLICATION_IMAGE, MARKETPLACE_ID)
values (
           4, 'ZOOLS', 'IOS', 550700, 5910, '2019', 220500, 'CreditCart', 'INDIA','https://upload.wikimedia.org/wikipedia/commons/5/52/ClothingReadyWear.jpg', 1);








insert into "PUBLIC"."INDUSTRY"(
    ID, INDUSTRY_NAME, INDUSTRY_IMAGE, DESCRIPTION, MARKET_SIZE, COMPETITION )
values (
           1,'Health & Fitness','https://upload.wikimedia.org/wikipedia/commons/b/b6/Gym_wiki.jpg', 'The health and fitness industry encompasses businesses and activities related to improving and maintaining physical well-being.', 1000000, 'HIGH' );

insert into "PUBLIC"."INDUSTRY"(
    ID, INDUSTRY_NAME, INDUSTRY_IMAGE, DESCRIPTION, MARKET_SIZE, COMPETITION )
values (
           2,'Gaming','https://www.tlnt.com/_next/image?url=https%3A%2F%2Fapi.eremedia.com%2Fwp-content%2Fuploads%2F2018%2F11%2FVideo-game.jpg&w=1920&q=75', 'The gaming industry revolves around the creation, development, and distribution of video games and interactive entertainment.', 10000000, 'MEDIUM' );

insert into "PUBLIC"."INDUSTRY"(
    ID, INDUSTRY_NAME, INDUSTRY_IMAGE, DESCRIPTION, MARKET_SIZE, COMPETITION )
values (
           3,'Automotive','https://upload.wikimedia.org/wikipedia/commons/e/ea/San_Diego_Automotive_Museum_-_Entrance_%28May_2022%29.jpg', ' The automotive industry involves the design, manufacturing, sale, and maintenance of vehicles. It includes automobile manufacturers, component suppliers, dealerships, car rental services, auto repair shops, and related businesses. ', 570000, 'LOW' );

insert into "PUBLIC"."INDUSTRY"(
    ID, INDUSTRY_NAME, INDUSTRY_IMAGE, DESCRIPTION, MARKET_SIZE, COMPETITION)
values (
           4,'Books','https://upload.wikimedia.org/wikipedia/commons/5/5a/Books_HD_%288314929977%29.jpg', 'The book industry focuses on the creation, publishing, and distribution of written content in various formats such as print books, e-books, and audiobooks.', 459954, 'MEDIUM');
insert into "PUBLIC"."INDUSTRY"(
    ID, INDUSTRY_NAME, INDUSTRY_IMAGE, DESCRIPTION, MARKET_SIZE, COMPETITION )
values (
           5,'Clothing','https://upload.wikimedia.org/wikipedia/commons/5/52/ClothingReadyWear.jpg', 'The clothing industry involves the production, manufacturing, and retailing of clothing and apparel.', 856796,'HIGH' );
insert into "PUBLIC"."INDUSTRY"(
    ID, INDUSTRY_NAME, INDUSTRY_IMAGE, DESCRIPTION, MARKET_SIZE, COMPETITION )
values (
           6,'Agriculture','https://npr.brightspotcdn.com/dims4/default/b99ae25/2147483647/strip/true/crop/580x380+0+0/resize/1760x1154!/format/webp/quality/90/?url=http%3A%2F%2Fnpr-brightspot.s3.amazonaws.com%2Flegacy%2Fsites%2Fipr%2Ffiles%2F201703%2F012516_Prairie-combine.jpg', 'The agriculture industry encompasses activities related to cultivation, production, and distribution of crops, livestock, and other agricultural products.', 235874, 'HIGH' );






INSERT INTO INDUSTRY_ECOMMERCES (INDUSTRIES_ID, ECOMMERCES_ID) VALUES (1, 1);

INSERT INTO INDUSTRY_ECOMMERCES (INDUSTRIES_ID, ECOMMERCES_ID) VALUES (2, 6);

INSERT INTO INDUSTRY_ECOMMERCES (INDUSTRIES_ID, ECOMMERCES_ID) VALUES (3, 4);

INSERT INTO INDUSTRY_ECOMMERCES (INDUSTRIES_ID, ECOMMERCES_ID) VALUES (4, 2);
INSERT INTO INDUSTRY_ECOMMERCES (INDUSTRIES_ID, ECOMMERCES_ID) VALUES (4, 5);

INSERT INTO INDUSTRY_ECOMMERCES (INDUSTRIES_ID, ECOMMERCES_ID) VALUES (5, 3);

INSERT INTO INDUSTRY_ECOMMERCES (INDUSTRIES_ID, ECOMMERCES_ID) VALUES (6, 7);



