package com.universidad.empleos.web.app.empleos.model.service;

import com.universidad.empleos.web.app.empleos.model.dao.UserRepository;
import com.universidad.empleos.web.app.empleos.model.entity.CustomUserDetails;
import com.universidad.empleos.web.app.empleos.model.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<Users> optionalUsers=userRepository.findByEmail(email);
        optionalUsers.orElseThrow(()-> new UsernameNotFoundException("Username not foud"));
        return  optionalUsers
                .map(CustomUserDetails::new).get();

    }
}
