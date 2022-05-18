USE spring_blog_db;

INSERT INTO  pet_details(description, is_sterile, weight_in_ounces)
VALUES ('fun', false, 20),
       ('lame', true, 30),
       ('wow', true, 10);

INSERT INTO pets(age, name, type, pet_details_id)
VALUES (2, 'Spot', 'mutt', 1),
       (5, 'Bucko', 'labrador', 2),
       (10, 'Lucky', 'Dalmatian', 3);