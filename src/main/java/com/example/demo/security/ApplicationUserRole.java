package com.example.demo.security;

import com.google.common.collect.Sets;

import java.util.Set;

import static com.example.demo.security.ApplicationUserPermisson.*;

public enum ApplicationUserRole {
    ADMIN(Sets.newHashSet(USER_READ, USER_WRITE));

    private final Set<ApplicationUserPermisson> permissions;

    ApplicationUserRole(Set<ApplicationUserPermisson> permissions) {
        this.permissions = permissions;
    }

    public Set<ApplicationUserPermisson> getPermissions() {
        return permissions;
    }
}
