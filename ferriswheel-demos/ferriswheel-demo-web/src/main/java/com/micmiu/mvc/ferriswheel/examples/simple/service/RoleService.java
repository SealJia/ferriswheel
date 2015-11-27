package com.micmiu.mvc.ferriswheel.examples.simple.service;


import com.micmiu.mvc.ferriswheel.core.service.BaseService;
import com.micmiu.mvc.ferriswheel.examples.simple.entity.Permission;
import com.micmiu.mvc.ferriswheel.examples.simple.entity.Role;

import java.util.List;

/**
 * @author <a href="http://www.micmiu.com">Michael Sun</a>
 */
public interface RoleService extends BaseService<Role, Long> {

	Role getRoleByName(String name);

	void updateRole(Role role, List<Permission> permList);
}
