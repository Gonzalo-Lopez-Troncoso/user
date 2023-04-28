package com.user.model;
import javax.persistence.*;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "USERS")
public class Users {

    @Column(name = "ID")
    @Id @GeneratedValue(generator="id")
    private UUID id;

    @Column(name = "NAME")
    private String name;

    @Column(unique = true, name = "EMAIL")
    private String email;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "PHONES")
    @ElementCollection
    private List<Phone> phones;

    @Column(name = "CREATED")
    private String created;

    @Column(name = "MODIFIED")
    private String modified;

    @Column(name = "LAST_LOGIN")
    private String lastLogin;

    @Column(name = "ACTIVE")
    private boolean active;

    public Users() {}

    public Users(
            final String name,
            final String email,
            final String password,
            final List<Phone> phones,
            final String created,
            final String modified,
            final String lastLogin) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phones = phones;
        this.created = created;
        this.modified = modified;
        this.lastLogin = lastLogin;
        this.active = true;
    }

    public Users(
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

    public Users(
            final UUID id,
            final String name,
            final String email,
            final String password,
            final List<Phone> phones,
            final String created,
            final String modified,
            final String lastLogin,
            final boolean active) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phones = phones;
        this.created = created;
        this.modified = modified;
        this.lastLogin = lastLogin;
        this.active = active;
    }

    public Users(
            final String name,
            final String email,
            final String password,
            final List<Phone> phones,
            final String created,
            final String modified,
            final String lastLogin,
            final boolean active) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phones = phones;
        this.created = created;
        this.modified = modified;
        this.lastLogin = lastLogin;
        this.active = active;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<Phone> getPhones() {
        return phones;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users user = (Users) o;
        return isActive() == user.isActive()
                && Objects.equals(getId(), user.getId())
                && Objects.equals(getName(), user.getName())
                && Objects.equals(getEmail(), user.getEmail())
                && Objects.equals(getPassword(), user.getPassword())
                && Objects.equals(getPhones(), user.getPhones())
                && Objects.equals(getCreated(), user.getCreated())
                && Objects.equals(getModified(), user.getModified())
                && Objects.equals(getLastLogin(), user.getLastLogin());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getId(),
                getName(),
                getEmail(),
                getPassword(),
                getPhones(),
                getCreated(),
                getModified(),
                getLastLogin(),
                isActive());
    }

    @Override
    public String toString() {
        return "User{"
                + "id="
                + getId()
                + ", name='"
                + getName()
                + '\''
                + ", email='"
                + getEmail()
                + '\''
                + ", password='"
                + getPassword()
                + '\''
                + ", phones='"
                + getPhones()
                + '\''
                + ", created='"
                + getCreated()
                + '\''
                + ", modified='"
                + getModified()
                + '\''
                + ", lastLogin='"
                + getLastLogin()
                + '\''
                + ", isActive="
                + isActive()
                + '}';
    }
}
