package com.codegnan.dto;





public class CredentialDto {

    private String username;
    private String password;
    private String roleBasedAuthority;

    public CredentialDto() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoleBasedAuthority() {
        return roleBasedAuthority;
    }

    public void setRoleBasedAuthority(String roleBasedAuthority) {
        this.roleBasedAuthority = roleBasedAuthority;
    }
}