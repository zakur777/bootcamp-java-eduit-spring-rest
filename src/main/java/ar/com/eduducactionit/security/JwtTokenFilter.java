package ar.com.eduducactionit.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.filter.OncePerRequestFilter;

import ar.com.eduducactionit.security.service.MyUserDetailsService;

public class JwtTokenFilter extends OncePerRequestFilter {
	//logger!
	
	@Autowired
	private JwtProvider jwtProvider;
	
	@Autowired
	private MyUserDetailsService userDetailService; 
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		try {
			String token = getToken(request);
			
			if(token != null && jwtProvider.validateToken(token)) {
				String username = jwtProvider.getNombreUsuarioFromToken(token);//EDUIT/GUESS
				UserDetails userDetails = this.userDetailService.loadUserByUsername(username);
				UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(username, userDetails.getAuthorities());
				SecurityContextHolder.getContext().setAuthentication(auth);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		filterChain.doFilter(request, response);//continuea evaluando los demas filtros 
	}

	private String getToken(HttpServletRequest request) {
		String header = request.getHeader("Authorization");
		if(header != null && header.startsWith("Bearer")) {
			return header.replace("Bearer", "");//
		}			
		return header;
	}
}
