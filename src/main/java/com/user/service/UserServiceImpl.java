package com.user.service;

import com.user.model.Users;
import com.user.model.UsersRequest;
import com.user.model.UsersResponse;
import com.user.service.ResUsers;
import com.user.service.UserE;
import com.user.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.UUID;
import static com.user.utils.Date.dateNow;


@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
    @Override
    public Object saveUser(UsersRequest usersRequest) {
        return usersResponse(usersRequest);
    }
    public ResUsers usersResponse(final UsersRequest usersRequest) {
        try {

            // EncryptPassword
            final UsersRequest encryptPass =
                    new UsersRequest(
                            usersRequest.getName(),
                            usersRequest.getEmail(),
                            passwordEncoder.encode(usersRequest.getPassword()),
                            usersRequest.getPhones());

            Users user = userRepository.findByEmail(usersRequest.getEmail());
            System.out.printf("Userrrrr" + user);


            if (user != null) {
                usersRequest.setEmail("");
                System.out.printf("vacio"+user);
                return new ResUsers(UserE.EMAIL_FOUND, null);
            }else {
                // Do Register User
                user =
                        userRepository.save(
                                new Users(
                                        usersRequest.getName(),
                                        usersRequest.getEmail(),
                                        encryptPass.getPassword(),
                                        usersRequest.getPhones(),
                                        dateNow(),
                                        dateNow(),
                                        dateNow(),
                                        true));
                final UsersResponse userResponse =
                        new UsersResponse(
                                user.getId(),
                                user.getCreated(),
                                user.getModified(),
                                user.getLastLogin(),
                                user.isActive());
                return new ResUsers(UserE.OK, userResponse);
            }

        } catch (Exception e) {
            LOGGER.error(e.getMessage());
            LOGGER.info(e.getMessage());
            return new ResUsers(UserE.SERVER_ERROR, null);
        }
    }
    @Override
    public Users getUser(UUID idUser) {
        return null;
    }
    @Override
    public Users updateUser(UUID id, Users updateUser) {
        return null;
    }
    @Override
    public boolean deleteUser(UUID id) {
        return false;
    }
    @Override
    public boolean findEmail(String email) {
        return false;
    }
}
