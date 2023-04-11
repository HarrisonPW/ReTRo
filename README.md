# ReTRo

1. You guys need to create a new database called slb
1.1 execute the sql
```sql
CREATE TABLE `slb_user` (
                            `id` int NOT NULL AUTO_INCREMENT,
                            `dept_id` varchar(50) DEFAULT NULL,
                            `name` varchar(50) DEFAULT NULL,
                            `user_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
                            `email` varchar(50) DEFAULT '',
                            `phone_number` varchar(11) DEFAULT '',
                            `sex` char(1) DEFAULT '0',
                            `avatar` varchar(100) DEFAULT '',
                            `password` varchar(100) DEFAULT '',
                            `salt` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
                            `birthday` date DEFAULT NULL,
                            `status` char(1) DEFAULT '0',
                            `del_flag` char(1) DEFAULT '0',
                            `login_ip` varchar(128) DEFAULT '',
                            `login_date` datetime DEFAULT NULL,
                            `create_time` datetime DEFAULT NULL,
                            `update_by` varchar(64) DEFAULT '',
                            `remark` varchar(500) DEFAULT NULL,
                            `version` int DEFAULT NULL ,
                            PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;

INSERT INTO `slb_user` (`id`, `dept_id`, `name`, `user_name`, `email`, `phone_number`, `sex`, `avatar`, `password`, `salt`, `birthday`, `status`, `del_flag`, `login_ip`, `login_date`, `create_time`, `update_by`, `remark`, `version`) VALUES (3, NULL, NULL, NULL, 'yyy@gatech.edu', '', '0', '', '21905FD8B35312DDF2A1E4755DCD368C', '757e8086b3e8464ab601d01a2d30669f', NULL, '0', '0', '', NULL, NULL, '', NULL, NULL);
INSERT INTO `slb_user` (`id`, `dept_id`, `name`, `user_name`, `email`, `phone_number`, `sex`, `avatar`, `password`, `salt`, `birthday`, `status`, `del_flag`, `login_ip`, `login_date`, `create_time`, `update_by`, `remark`, `version`) VALUES (4, NULL, NULL, NULL, 'kk@gatech.edu', '', '0', '', 'B5E06CCC33BD020D5185251D7DFC1192', 'ce185668bf674ccda6e6fbf13790a1ef', NULL, '0', '0', '', NULL, NULL, '', NULL, NULL);
INSERT INTO `slb_user` (`id`, `dept_id`, `name`, `user_name`, `email`, `phone_number`, `sex`, `avatar`, `password`, `salt`, `birthday`, `status`, `del_flag`, `login_ip`, `login_date`, `create_time`, `update_by`, `remark`, `version`) VALUES (5, NULL, NULL, NULL, 'mm@gatech.edu', '', '0', '', '19B987F9AE552CF1DFF3ED80E52043C9', '1dbb5405d83348d896e25c4f52ab70a2', NULL, '0', '0', '', NULL, NULL, '', NULL, NULL);
INSERT INTO `slb_user` (`id`, `dept_id`, `name`, `user_name`, `email`, `phone_number`, `sex`, `avatar`, `password`, `salt`, `birthday`, `status`, `del_flag`, `login_ip`, `login_date`, `create_time`, `update_by`, `remark`, `version`) VALUES (6, NULL, NULL, NULL, 'qq@gatech.edu', '', '0', '', 'FD61FAF65CD676A979E34314C108E4A', '22920b4ba4eb4b5a99a6c44e17298df0', NULL, '0', '0', '', NULL, NULL, '', NULL, NULL);
INSERT INTO `slb_user` (`id`, `dept_id`, `name`, `user_name`, `email`, `phone_number`, `sex`, `avatar`, `password`, `salt`, `birthday`, `status`, `del_flag`, `login_ip`, `login_date`, `create_time`, `update_by`, `remark`, `version`) VALUES (7, NULL, NULL, NULL, 'ww@gatech.edu', '', '0', '', 'FF8462A346526B14691B360D327E8F93', 'bd89d7699dc842c88d1c1903be6aa91c', NULL, '0', '0', '', NULL, NULL, '', NULL, NULL);
INSERT INTO `slb_user` (`id`, `dept_id`, `name`, `user_name`, `email`, `phone_number`, `sex`, `avatar`, `password`, `salt`, `birthday`, `status`, `del_flag`, `login_ip`, `login_date`, `create_time`, `update_by`, `remark`, `version`) VALUES (8, NULL, NULL, NULL, 'ee@gatech.edu', '', '0', '', 'C015B44E0967719996CC135F86097315', '12c63ef62401413caee2f68488257d35', NULL, '0', '0', '', NULL, NULL, '', NULL, NULL);
```
<img width="238" alt="Screenshot 2023-04-11 at 12 24 04 PM" src="https://user-images.githubusercontent.com/32474200/231227210-c7beab82-e7d4-4de1-a2be-90a4016f743a.png">
2. Go to ReTRo-Service/src/main/resources/application.yml and change to your passsword
<img width="667" alt="Screenshot 2023-04-11 at 12 22 44 PM" src="https://user-images.githubusercontent.com/32474200/231226887-a9f95f28-d533-4df0-be1c-e003498393ff.png">

3. Copy and paste http://localhost:8082/ to your URL
