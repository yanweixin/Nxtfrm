# 创建用户
CREATE USER 'apps'@'%' IDENTIFIED WITH mysql_native_password BY 'apps';
GRANT ALL PRIVILEGES ON *.* TO 'apps'@'%';

# 创建数据库
CREATE DATABASE app;
