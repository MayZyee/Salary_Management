drop table if exists sys_level;
create table sys_level(
  level_id          bigint(20)      default '0'                comment '工资等级',
  cash_num          decimal(10, 2)  default '0.00'             comment '金额',
  primary key (level_id)
)engine=innodb auto_increment=100 comment = '工资分级表';

insert into sys_level values (0,0);
insert into sys_level values (1,1000);
insert into sys_level values (2,3000);
insert into sys_level values (4,4000);

drop table if exists sys_cash_type;
create table sys_cash_type(
  cash_type          bigint(20)      not null                comment '类型',
  type_name          varchar(20)     default ''              comment '名称',
  primary key (cash_type)
)engine=innodb auto_increment=100 comment = '资金类别表';


insert into sys_cash_type values (0,'其他');
insert into sys_cash_type values (1,'工资');
insert into sys_cash_type values (2,'报销');
insert into sys_cash_type values (3,'补贴');
insert into sys_cash_type values (4,'奖金');


drop table if exists sys_cash;
-- 资金信息表

create table sys_cash(
  cash_id           bigint(20)      not null auto_increment    comment '资金ID',
  user_id           bigint(20)      not null 			             comment '用户ID',
  dept_id           bigint(20)      default null               comment '部门ID',
  cash_type         bigint(20)      default '0'                comment '资金类型',
  cash_num          decimal(10, 2)  default '0.00'             comment '金额',
  create_by         varchar(64)     default ''                 comment '创建者',
  create_time       datetime                                   comment '创建时间',
  update_by         varchar(64)     default ''                 comment '更新者',
  update_time       datetime                                   comment '更新时间',
  primary key (cash_id)
)engine=innodb auto_increment=100 comment = '资金信息表';

insert into sys_cash values(1,100,106,'0',5000.00,'admin',sysdate(),'admin',sysdate());
insert into sys_cash values(2,100,106,'0',200.00,'admin',sysdate(),'admin',sysdate());
insert into sys_cash values(3,100,106,'0',100.00,'admin',sysdate(),'admin',sysdate());