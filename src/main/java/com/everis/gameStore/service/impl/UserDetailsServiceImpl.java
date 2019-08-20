package com.everis.gameStore.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.everis.gameStore.domain.model.Roles;
import com.everis.gameStore.repository.ClientsRepository;

/**
 * The Class UserDetailsServiceImpl.
 */
@Service
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {

    /** The clients repository. */
    @Autowired
    private ClientsRepository clientsRepository;

    /*
     * (non-Javadoc)
     * 
     * @see org.springframework.security.core.userdetails.UserDetailsService#loadUserByUsername(java.lang.String)
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        com.everis.gameStore.domain.model.Clients clients = clientsRepository.findByNickname(username);

        Set grantList = new HashSet();

        Roles roles = new Roles();
        roles.setDescription(clients.getClientRoles());

        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(roles.getDescription());
        grantList.add(grantedAuthority);

        UserDetails user = (UserDetails) new User(clients.getNickname(), clients.getPassword(), grantList);
        return user;
    }
}
