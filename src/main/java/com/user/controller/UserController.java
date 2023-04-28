package com.user.controller;

import com.user.model.Users;
import com.user.model.UsersRequest;
import com.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    @PostMapping("/create")
    public ResponseEntity saveUser(@Valid @RequestBody final UsersRequest user){
        return new ResponseEntity(userService.saveUser(user), !user.getEmail().isEmpty()||user.getEmail()!="" ? HttpStatus.CREATED:HttpStatus.CONFLICT);
    }
    @GetMapping("/{id}")
    public ResponseEntity getUser(@PathVariable("id") UUID idUser){
        return new ResponseEntity(userService.getUser(idUser), HttpStatus.OK);

    }
    @PutMapping("/{id}")
    public ResponseEntity updateUser(@PathVariable("id") UUID idUser,@RequestBody Users user){
        return new ResponseEntity(userService.updateUser(idUser,user), HttpStatus.OK);

    }
    @DeleteMapping("/{id}")
    public ResponseEntity deleteUser(@PathVariable("id") UUID idUser){
       boolean res = userService.deleteUser(idUser);
       if (res == true){
           return new ResponseEntity(HttpStatus.OK);
       }else {
           return new ResponseEntity(HttpStatus.NOT_FOUND);
       }
    }
}
