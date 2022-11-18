package com.example.bookapi.service.Impl;

import com.example.bookapi.model.AppUser;
import com.example.bookapi.model.UserRole;
import com.example.bookapi.repository.IAppUserRepository;
import com.example.bookapi.repository.IUserRoleRepository;
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
public class JwtUserDetailService implements UserDetailsService {
    @Autowired
    private IAppUserRepository appUserRepository;

    @Autowired
    private IUserRoleRepository userRoleRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser appUser = appUserRepository.findAppUserByName(username);
        if (appUser == null){
            throw new UsernameNotFoundException("User " + username + " was not found in the database" );
        }
        List<UserRole> userRoles = userRoleRepository.findAllByAppUser(appUser);
        List<GrantedAuthority> grantList = new ArrayList<>();
        if(userRoles != null){
            for(UserRole item : userRoles){
                GrantedAuthority authority = new SimpleGrantedAuthority(item.getAppRole().getName());
                grantList.add(authority);
            }
        }
        return new User(appUser.getUsername(),appUser.getPassword(),grantList);
    }
}
