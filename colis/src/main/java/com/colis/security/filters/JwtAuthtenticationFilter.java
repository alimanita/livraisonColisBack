/*
package com.colis.security.filters;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class JwtAuthtenticationFilter extends UsernamePasswordAuthenticationFilter {
    @Autowired
    AuthenticationManager authenticationManager;

    public JwtAuthtenticationFilter(AuthenticationManager authenticationManager) {
        super(authenticationManager);
        this.authenticationManager = authenticationManager;
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
 String nom = request.getParameter("nom");
 String mot_de_passe = request.getParameter("mot_de_passe");
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(nom,mot_de_passe);
        return authenticationToken;


    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {

        User user = (User)  authResult.getPrincipal();
        Algorithm algo1 = Algorithm.HMAC256("mysecret");
        String JwtAccsessToken = JWT.create()
                .withSubject(user.getUsername())
                        .withExpiresAt(new Date(System.currentTimeMillis()+5*60*1000))
                                .withIssuer(request.getRequestURL().toString())
                                        .withClaim("roles",user.getAuthorities().stream().map(
                                                grantedAuthority -> grantedAuthority.getAuthority()).collect(Collectors.toList()))
                                                .sign(algo1);

        String JwtRefreshToken = JWT.create()
                .withSubject(user.getUsername())
                .withExpiresAt(new Date(System.currentTimeMillis()+5*30*24*60*1000))
                .withIssuer(request.getRequestURL().toString())

                .sign(algo1);
        Map<String,String> idToken = new HashMap<>();
        idToken.put("access-token",JwtAccsessToken);
        idToken.put("refresh-token",JwtRefreshToken);
        response.setContentType("application/json");

        response.setHeader("Authorization",JwtAccsessToken);
    }
}
*/
