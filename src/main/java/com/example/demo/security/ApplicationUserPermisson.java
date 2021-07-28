package com.example.demo.security;

public enum ApplicationUserPermisson {
    USER_READ("user:read"),
    USER_WRITE("user:write");

    private final String permission;

    ApplicationUserPermisson(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
