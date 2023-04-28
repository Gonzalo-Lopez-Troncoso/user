package com.user.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class UsersResponse implements Serializable {

    private static final long serialVersionUID = 1L;
    private UUID id;
    private String created;
    private String modified;
    private String lastLogin;
    private String token;
    private boolean active;


    public UsersResponse() {}

    public UsersResponse(
            final UUID id,
            final String created,
            final String modified,
            final String lastLogin,
            final boolean active) {
        this.id = id;
        this.created = created;
        this.modified = modified;
        this.lastLogin = lastLogin;
        this.active = active;
    }

    public UUID getId() {
        return id;
    }

    public String getCreated() {
        return created;
    }

    public String getModified() {
        return modified;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final UsersResponse that = (UsersResponse) o;
        return isActive() == that.isActive()
                && Objects.equals(getId(), that.getId())
                && Objects.equals(getCreated(), that.getCreated())
                && Objects.equals(getModified(), that.getModified())
                && Objects.equals(getLastLogin(), that.getLastLogin());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getId(), getCreated(), getModified(), getLastLogin(), isActive());
    }

    @Override
    public String toString() {
        return "UserResponse{"
                + "id="
                + getId()
                + ", created='"
                + getCreated()
                + '\''
                + ", modified='"
                + getModified()
                + '\''
                + ", lastLogin='"
                + getLastLogin()
                + '\''
                + ", active="
                + isActive()
                + '}';
    }
}
