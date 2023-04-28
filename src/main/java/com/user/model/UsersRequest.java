package com.user.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import static com.user.utils.Constant.CREDENTIALS_EMPTY_ERROR_MESSAGE;
import static com.user.utils.Constant.CREDENTIALS_NULL_ERROR_MESSAGE;
import static com.user.utils.Constant.EMAIL_EMPTY_ERROR_MESSAGE;
import static com.user.utils.Constant.EMAIL_FORMAT_ERROR_MESSAGE;
import static com.user.utils.Constant.EMAIL_NULL_ERROR_MESSAGE;
import static com.user.utils.Constant.NAME_EMPTY_ERROR_MESSAGE;
import static com.user.utils.Constant.NAME_NULL_ERROR_MESSAGE;
import static com.user.utils.Constant.PHONES_EMPTY_ERROR_MESSAGE;
import static com.user.utils.Constant.PHONES_NULL_ERROR_MESSAGE;
import static com.user.utils.Constant.PATTERN_CREDENTIALS;
import static com.user.utils.Constant.CREDENTIALS_FORMAT_ERROR_MESSAGE;


@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class UsersRequest implements Serializable {
    private static final long serialVersionUID = -1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    @NotNull(message = NAME_NULL_ERROR_MESSAGE)
    @NotBlank(message = NAME_EMPTY_ERROR_MESSAGE)
    private String name;
    @NotNull(message = EMAIL_NULL_ERROR_MESSAGE)
    @NotBlank(message = EMAIL_EMPTY_ERROR_MESSAGE)
    @Email(message = EMAIL_FORMAT_ERROR_MESSAGE)
    private String email;
    @NotNull(message = CREDENTIALS_NULL_ERROR_MESSAGE)
    @NotBlank(message = CREDENTIALS_EMPTY_ERROR_MESSAGE)
    @Pattern(regexp = PATTERN_CREDENTIALS, message = CREDENTIALS_FORMAT_ERROR_MESSAGE)
    private String password;
    @Valid
    @NotNull(message = PHONES_NULL_ERROR_MESSAGE)
    @NotEmpty(message = PHONES_EMPTY_ERROR_MESSAGE)
    @Column(name = "PHONES")
    public ArrayList<Phone> phones;

    public UsersRequest() {}

    public UsersRequest(
            final String name, final String email, final String password, final List<Phone> phones) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phones = (ArrayList<Phone>) phones;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
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

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final UsersRequest that = (UsersRequest) o;
        return Objects.equals(getName(), that.getName())
                && Objects.equals(getEmail(), that.getEmail())
                && Objects.equals(getPassword(), that.getPassword())
                && Objects.equals(getPhones(), that.getPhones());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getEmail(), getPassword(), getPhones());
    }

    @Override
    public String toString() {
        return "Request{"
                + "name='"
                + getName()
                + '\''
                + ", email='"
                + getEmail()
                + '\''
                + ", password='"
                + getPassword()
                + '\''
                + ", phones="
                + getPhones()
                + '}';
    }
}