package com.example.blog.service;

import com.example.blog.entity.UserRole;
import com.example.blog.entity.Users;
import com.example.blog.repository.UserRepository;
import com.example.blog.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserDetailService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    UserRoleRepository userRoleRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users = userRepository.findByUserName(username);
        if (users == null) {
            throw new UsernameNotFoundException("User" + username + "not found");
        }
        List<UserRole> roles = userRoleRepository.findAllByUsers(users);
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        for (UserRole role : roles) {
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getRole().getRoleName()));
        }
        UserDetails userDetails = new User(username, users.getPassword(), grantedAuthorities);

        return userDetails;
    }
}
