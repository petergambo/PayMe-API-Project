//package com.payme.payme.service;
//
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//import java.util.ArrayList;
//
//public class JwtUserDetailsService implements UserDetailsService {
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        if("petergambo".equals(username))
//        {
//            return new User("petergambo", "", new ArrayList<>());
//        } else {
//            throw new UsernameNotFoundException("No username found");
//        }
//    }
//}
