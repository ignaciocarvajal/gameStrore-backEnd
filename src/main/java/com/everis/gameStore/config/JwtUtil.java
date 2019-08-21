package com.everis.gameStore.config;

import java.util.Date;
import static java.util.Collections.emptyList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

/**
 * The Class JwtUtil.
 */
public class JwtUtil {

    /**
     * Adds the authentication.
     *
     * @param res the res
     * @param username the username
     */
    static void addAuthentication(HttpServletResponse res, String username) {
        String token = Jwts.builder()
                .setSubject(username)
                .setExpiration(new Date(System.currentTimeMillis() + 180000)) // 1 minuto => 60.000 milisec
                .signWith(SignatureAlgorithm.HS512, "P@tit0")
                .compact();
        res.addHeader("Authorization", "Bearer " + token);
    }

    /**
     * Gets the authentication.
     *
     * @param request the request
     * @return the authentication
     */
    static Authentication getAuthentication(HttpServletRequest request) {
        String token = request.getHeader("Authorization");
        if (token != null) {
            String user = Jwts.parser()
                    .setSigningKey("P@tit0")
                    .parseClaimsJws(token.replace("Bearer", ""))
                    .getBody()
                    .getSubject();
            return user != null ? new UsernamePasswordAuthenticationToken(user, null, emptyList()) : null;
        }
        return null;
    }
}
