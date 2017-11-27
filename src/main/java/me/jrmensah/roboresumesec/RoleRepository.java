package me.jrmensah.roboresumesec;

import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<UserRole, Long> {
    UserRole findByRole(String role);

}
