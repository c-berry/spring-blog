CREATE DATABASE IF NOT EXISTS spring_blog_db;

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
VALUES ('Music Artists', 'These are some iconic music artists.', 1),
       ('Cars', 'These are highly desired cars from various years.', 2),
       ('Video Games', 'These are main characters from blockbuster video games.', 3),
       ('Animals', 'Behold my cuddly critters!', 1);

INSERT INTO post_images(title, url, post_id)
VALUES ('Cat', 'https://media.wired.co.uk/photos/60c8730fa81eb7f50b44037e/3:2/w_3329,h_2219,c_limit/1521-WIRED-Cat.jpeg', 4),
       ('Dog', 'https://cdn.decrypt.co/resize/1024/height/512/wp-content/uploads/2021/07/baby-doge-dogecoin-shiba-inu-gID_4.jpg', 4),
       ('Bird', 'https://nas-national-prod.s3.amazonaws.com/aud_gbbc-2016_dark-eyed-junco_34384_kk_oh_photo-michele-black.jpg', 4),
       ('Master Chief', 'https://www.looper.com/img/gallery/the-untold-truth-of-halos-master-chief/l-intro-1603465431.jpg', 3),
       ('Bloodhound', 'https://mintspace-media.fra1.digitaloceanspaces.com/wp-content/uploads/2022/01/11061744/bloodhound-apex-legends-videojuego-papel-pintado-3000x2000_42.jpg', 3),
       ('Daedric Warrior', 'https://jkhub.org/uploads/monthly_2019_10/photo-1764.thumb.jpg.5b0ad505d6af5a725a32b7261b6a2a9c.jpg', 3),
       ('El Camino', 'https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/1968_El_Camino.jpg/2560px-1968_El_Camino.jpg', 2),
       ('GTR', 'https://www.cnet.com/a/img/resize/7f7868929bba5005994d175e25d20bd825cd5470/hub/2019/11/07/afad8567-7230-479e-8bce-c93d73b5d967/rs-nissan-gtr-nismo-20-55.jpg?auto=webp&width=768', 2),
       ('Supra', 'https://cdn1.mecum.com/auctions/an1115/an1115-226294/images/an1115-226294_3@2x.jpg?1447437826000', 2),
       ('Jimi Hendrix', 'https://api.time.com/wp-content/uploads/2017/04/jimi-hendrix-08.jpg', 1),
       ('Jim Morrison', 'https://bonjourparis.com/wp-content/uploads/2020/07/31591828846_b36df16120_b-e1551797088469-670x679-1.jpg', 1),
       ('Tyler the Creator', 'https://www.nme.com/wp-content/uploads/2022/03/Tyler-The-Creator.jpg', 1);

INSERT INTO tags(name)
VALUES ('Tech'),
       ('Games'),
       ('Lifestyle'),
       ('Etc.'),
       ('Music'),
       ('Pets');

INSERT INTO post_tag(post_id, tag_id)
VALUES (1, 5),
       (1, 4),
       (2, 3),
       (2, 4),
       (3, 1),
       (3, 2),
       (4, 6),
       (4, 4);