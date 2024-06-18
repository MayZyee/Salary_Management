drop table if exists sys_file_info;
create table sys_file_info (
  file_id           int(11)          not null auto_increment       comment '文件id',
  file_name         varchar(50)      default ''                    comment '文件名称',
  file_path         varchar(255)     default ''                    comment '文件路径',
  primary key (file_id)
) engine=innodb auto_increment=1 default charset=utf8 comment = '文件信息表';