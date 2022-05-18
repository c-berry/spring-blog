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

# INSERT INTO post_details(is_awesome, history_of_post, topic_description)
# VALUES (true, '1st', 'Simply a test..'),
#        (true, '2nd', 'Another one.'),
#        (false, '3rd', 'We thought we knew the drill.');

INSERT INTO users(email, password, username)
VALUES ('chris@email.com', 'password', 'crispy'),
       ('oscar@email.com', 'password', 'o-man'),
       ('justin@codeup.com', 'password', 'j-bomb');

INSERT INTO posts(title, body, user_id)
VALUES ('Test', 'This is just a test.', 1),
       ('Another Test', 'Yet another test.', 2),
       ('Third Test', 'You know the drill.', 3),
       ('Animals', 'Behold my cuddly critters!', 1);

INSERT INTO post_images(title, url, post_id)
VALUES ('Cat', 'https://media.wired.co.uk/photos/60c8730fa81eb7f50b44037e/3:2/w_3329,h_2219,c_limit/1521-WIRED-Cat.jpeg', 4),
       ('Dog', 'https://cdn.decrypt.co/resize/1024/height/512/wp-content/uploads/2021/07/baby-doge-dogecoin-shiba-inu-gID_4.jpg', 4),
       ('Bird', 'https://nas-national-prod.s3.amazonaws.com/aud_gbbc-2016_dark-eyed-junco_34384_kk_oh_photo-michele-black.jpg', 4);

