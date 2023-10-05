package com.example.springsecuritydemo;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserDetailsServiceImpl implements UserDetailsService {
    private PasswordEncoder passwordEncoder;

    public UserDetailsServiceImpl(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if ("testuser1".equals(username)) {
            return new UserDetailsImpl("testuser1", passwordEncoder.encode("password"), new String[]{"foo"});
        } else if ("testuser2".equals(username)) {
            return new UserDetailsImpl("testuser2", "password", new String[]{"bar"});
        } else if ("testuser3".equals(username)) {
            return new UserDetailsImpl("testuser3", "password", new String[]{});
        } else {
            throw new UsernameNotFoundException("User not found.");
        }
    }
}
