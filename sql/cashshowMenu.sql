-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('资金信息', '1', '1', 'cashshow', 'cashflowshow/cashshow/index', 1, 0, 'C', '0', '0', 'cashflowshow:cashshow:list', '#', 'admin', sysdate(), '', null, '资金信息菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('资金信息查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'cashflowshow:cashshow:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('资金信息导出', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'cashflowshow:cashshow:export',       '#', 'admin', sysdate(), '', null, '');