package com.sriv.shivam.jwtauthtut.security.services;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class UserDetailsServiceImpl implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //We need to call our repository method to access the database to perform User Auth

        if(username.equals("Shivam")) {
            return new User("Shivam", "Shivam123", new ArrayList<>());
        }
        else {
            throw new UsernameNotFoundException("User not found !!");
        }
    }
}
