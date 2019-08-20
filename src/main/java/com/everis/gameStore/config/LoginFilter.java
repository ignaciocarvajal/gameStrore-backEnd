package com.everis.gameStore.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.util.UrlPathHelper;

import com.everis.gameStore.domain.model.Clients;
import com.everis.gameStore.service.impl.UserDetailsServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * The Class LoginFilter.
 */
public class LoginFilter extends AbstractAuthenticationProcessingFilter {

    /** The user details service. */
    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    /** The Constant urlPathHelper. */
    private final static UrlPathHelper urlPathHelper = new UrlPathHelper();

    /**
     * Instantiates a new login filter.
     *
     * @param url the url
     * @param authManager the auth manager
     * @param userDetailsService
     */
    public LoginFilter(String url, AuthenticationManager authManager, UserDetailsServiceImpl userDetailsService) {
        super(new AntPathRequestMatcher(url));
        setAuthenticationManager(authManager);
        this.userDetailsService = userDetailsService;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter#attemptAuthentication(
     * javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    public Authentication attemptAuthentication(HttpServletRequest req, HttpServletResponse res)
            throws AuthenticationException, IOException, ServletException {
        InputStream body = req.getInputStream();

        Clients client = new ObjectMapper().readValue(body, Clients.class);

        UserDetails user = userDetailsService.loadUserByUsername(client.getNickname());

        return getAuthenticationManager().authenticate(
                new UsernamePasswordAuthenticationToken(
                        user.getUsername(),
                        user.getPassword(),
                        Collections.emptyList()));
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter#successfulAuthentication(
     * javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, javax.servlet.FilterChain,
     * org.springframework.security.core.Authentication)
     */
    @Override
    protected void successfulAuthentication(HttpServletRequest req, HttpServletResponse res, FilterChain chain,
            Authentication auth) throws IOException, ServletException {
        JwtUtil.addAuthentication(res, auth.getName());
    }
}
