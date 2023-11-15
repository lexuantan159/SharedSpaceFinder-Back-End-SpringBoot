
package com.example.sharedspacefinder.services.role;


import com.example.sharedspacefinder.models.Role;

import java.util.Optional;

public interface RoleService {
    Optional<Role> findByRoleCode(String roleCode);
}
