package com.everis.gameStore.config;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.everis.gameStore.domain.model.Clients;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

/**
 * The Class LoginFilter.
 */
public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    /** The authentication manager. */
    private AuthenticationManager authenticationManager;

    /**
     * Instantiates a new login filter.
     *
     * @param authManager the auth manager
     */
    public JWTAuthenticationFilter(AuthenticationManager authManager) {
        this.authenticationManager = authManager;
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
            throws AuthenticationException {
        try {
            Clients client = new ObjectMapper().readValue(req.getInputStream(), Clients.class);

            return authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(client.getEmail(),
                    client.getPassword(), new ArrayList<>()));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
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
        Collection<? extends GrantedAuthority> authorities = auth.getAuthorities();
        Claims claims = Jwts.claims().setSubject(((User) auth.getPrincipal()).getUsername());

        for (GrantedAuthority grantedAuthority : authorities) {
            claims.put("rol", grantedAuthority.getAuthority());
        }

        String token = Jwts.builder()
                .setClaims(claims)
                .setExpiration(new Date(System.currentTimeMillis() + 180000)) // 1 minuto => 60.000 milisec
                .signWith(SignatureAlgorithm.HS512, "G4m3570r3")
                .compact();
        res.addHeader("Authorization", "Bearer " + token);
    }
}
