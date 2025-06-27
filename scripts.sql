create database rent_video_app; 
show databases;
use rent_video_app;

SELECT * FROM rent_video_app.videos;

SELECT * FROM rent_video_app.users;

select u1_0.id,u1_0.email,u1_0.first_name,u1_0.last_name,u1_0.password,u1_0.role from users u1_0 where u1_0.email="bj@email.com";