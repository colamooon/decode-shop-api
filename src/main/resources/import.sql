
INSERT INTO category (id, name, sort_position) VALUES (1, '모자', 0);
INSERT INTO category (id, name, sort_position) VALUES (2, '바지', 0);
INSERT INTO category (id, name, sort_position) VALUES (3, '가방', 0);
INSERT INTO category (id, name, sort_position) VALUES (4, '신발', 0);
INSERT INTO category (id, name, sort_position) VALUES (5, '상의', 0);

INSERT INTO product (id, name, description, hash_tags) VALUES (1, '빨간 모자', '모자가 빨개요', '핫템,빨강');
INSERT INTO product (id, name, description, hash_tags) VALUES (2, '파란 바지', '바지가 파래요', '핫템,파랑');
INSERT INTO product (id, name, description, hash_tags) VALUES (3, '노란 가방', '가방이 노래요', '핫템,노랑');
INSERT INTO product (id, name, description, hash_tags) VALUES (4, '초록 신발', '신발이 초록이예요', '핫템,초록');
INSERT INTO product (id, name, description, hash_tags) VALUES (5, '회색 셔츠', '셔츠가 회색이예요', '핫템,회색');

INSERT INTO product_category (id, product_id, category_id) VALUES (1, 1, 1);
INSERT INTO product_category (id, product_id, category_id) VALUES (2, 2, 2);
INSERT INTO product_category (id, product_id, category_id) VALUES (3, 3, 3);
INSERT INTO product_category (id, product_id, category_id) VALUES (4, 4, 4);
INSERT INTO product_category (id, product_id, category_id) VALUES (5, 5, 5);


INSERT INTO item (id, title, original_price, status, stock, product_id) VALUES (1, '빨간모자 빈폴', 1000, 'LISTED', 100, 1);
INSERT INTO item (id, title, original_price, status, stock, product_id) VALUES (2, '빨간모자 아디다스', 1000, 'LISTED', 100, 1);
INSERT INTO item (id, title, original_price, status, stock, product_id) VALUES (3, '파란바지 ', 1000, 'LISTED', 100, 2);
INSERT INTO item (id, title, original_price, status, stock, product_id) VALUES (4, '노란가방 ', 1000, 'LISTED', 100, 3);
INSERT INTO item (id, title, original_price, status, stock, product_id) VALUES (5, '초록신발 ', 1000, 'LISTED', 100, 4);
INSERT INTO item (id, title, original_price, status, stock, product_id) VALUES (6, '회색셔츠 ', 1000, 'LISTED', 100, 5);

INSERT INTO on_sale (id, title, status) VALUES (1, '빨간모자 단품', 'LISTED');
INSERT INTO on_sale (id, title, status) VALUES (2, '티셔츠 1+1', 'LISTED');
INSERT INTO on_sale (id, title, status) VALUES (3, '바지+모자', 'LISTED');
INSERT INTO on_sale (id, title, status) VALUES (4, '가방(추가할인)', 'LISTED');

INSERT INTO on_sale_item (id, on_sale_id, item_id) VALUES (1, 1, 1);
INSERT INTO on_sale_item (id, on_sale_id, item_id) VALUES (2, 2, 6);
INSERT INTO on_sale_item (id, on_sale_id, item_id) VALUES (3, 3, 1);
INSERT INTO on_sale_item (id, on_sale_id, item_id) VALUES (4, 3, 3);
INSERT INTO on_sale_item (id, on_sale_id, item_id) VALUES (5, 4, 4);

INSERT INTO on_event_item (id, title, event_type, discout_rate, is_required, on_sale_id, item_id, sell_price ) VALUES (1, '1+1 행사', 'DISCOUNT_RATE',1.00, true, 2, 6, 0);
INSERT INTO on_event_item (id, title, event_type, discout_rate, is_required, on_sale_id, item_id, sell_price ) VALUES (2, '신발 할인 행사', 'DISCOUNT_RATE',0.15, false, 4, 5, 850);