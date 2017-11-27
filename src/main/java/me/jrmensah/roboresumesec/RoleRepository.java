package me.jrmensah.roboresumesec;

import org.springframework.data.repository.CrudRepository;

import javax.management.relation.Role;

public interface RoleRepository extends CrudRepository<Role, Long>  {
    UserRole findByRole(String role);

}