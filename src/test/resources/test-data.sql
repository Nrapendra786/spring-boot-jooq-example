DELETE FROM bookmark_tag;
DELETE FROM bookmarks;
DELETE FROM tags;
DELETE FROM users;
DELETE FROM user_preferences;

INSERT INTO user_preferences (id, theme, language)
VALUES (1, 'Dark', 'EN'),
       (2, 'Light', 'EN')
;

INSERT INTO users (id, email, password, name, preferences_id)
VALUES (1, 'admin@gmail.com', 'admin', 'Admin', 1),
       (2, 'trivajay259@gmail.com', 'ajay', 'ajay', 2)
;

INSERT INTO tags(id, name)
VALUES (1, 'java-17'),
       (2, 'spring-boot'),
       (3, 'spring-cloud'),
       (4, 'devops'),
       (5, 'security')
;

INSERT INTO bookmarks(id, title, url, created_by, created_at)
VALUES (1, 'Nrapendra', 'https://github.com/nrapendra786', 1, CURRENT_TIMESTAMP),
       (2, 'Spring Initializr', 'https://start.spring.io', 2, CURRENT_TIMESTAMP)
;

insert into bookmark_tag(bookmark_id, tag_id)
VALUES (1, 1),
       (1, 2),
       (1, 3),
       (2, 2)
;