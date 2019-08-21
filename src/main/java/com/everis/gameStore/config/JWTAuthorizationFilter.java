package com.everis.gameStore.config;

import static java.util.Collections.emptyList;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import com.everis.gameStore.domain.util.Constants;

import io.jsonwebtoken.Jwts;

/**
 * The Class JWTAuthorizationFilter.
 */
public class JWTAuthorizationFilter extends BasicAuthenticationFilter {

    /**
     * Instantiates a new JWT authorization filter.
     *
     * @param authenticationManager the authentication manager
     */
    public JWTAuthorizationFilter(AuthenticationManager authenticationManager) {
        super(authenticationManager);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.springframework.security.web.authentication.www.BasicAuthenticationFilter#doFilterInternal(javax.servlet.http
     * .HttpServletRequest, javax.servlet.http.HttpServletResponse, javax.servlet.FilterChain)
     */
    @Override
    protected void doFilterInternal(HttpServletRequest req, HttpServletResponse res, FilterChain chain)
            throws IOException, ServletException {
        String header = req.getHeader(Constants.AUTHORIZATION);

        if (header == null || !header.startsWith(Constants.BEARER)) {
            chain.doFilter(req, res);
            return;
        }

        UsernamePasswordAuthenticationToken authentication = getAuthentication(req);
        SecurityContextHolder.getContext().setAuthentication(authentication);
        chain.doFilter(req, res);
    }

    /**
     * Gets the authentication.
     *
     * @param request the request
     * @return the authentication
     */
    static UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest request) {
        String token = request.getHeader(Constants.AUTHORIZATION);
        if (token != null) {
            String user = Jwts.parser()
                    .setSigningKey(Constants.SECRET_KEY)
                    .parseClaimsJws(token.replace(Constants.BEARER, ""))
                    .getBody()
                    .getSubject();

            if (user != null) {
                return new UsernamePasswordAuthenticationToken(user, null, emptyList());
            }
            return null;
        }
        return null;
    }
}
