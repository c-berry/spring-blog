USE spring_blog_db;

# INSERT INTO  pet_details(description, is_sterile, weight_in_ounces)
# VALUES ('fun', false, 20),
#        ('lame', true, 30),
#        ('wow', true, 10);
#
# INSERT INTO pets(age, name, type, pet_details_id)
# VALUES (2, 'Spot', 'mutt', 1),
#        (5, 'Bucko', 'labrador', 2),
#        (10, 'Lucky', 'Dalmatian', 3);

INSERT INTO post_details(is_awesome, history_of_post, topic_description)
VALUES (true, 'First test.', 'Number 1'),
       (true, 'Second test.', 'Number 2'),
       (false, 'Third Test', 'Number 3');

INSERT INTO posts(title, body, post_details_id)
VALUES ('Test', 'This is just a test.', 1),
       ('Another Test', 'Yet another test.', 2),
       ('Third Test', 'You know the drill.', 3);
