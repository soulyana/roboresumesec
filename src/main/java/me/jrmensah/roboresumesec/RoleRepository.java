package me.jrmensah.roboresumesec;

public interface RoleRepository {
    UserRole findByRole(String role);

}
