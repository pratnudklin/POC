package th.co.integrationworks.poc.filter;


import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.proc.ConfigurableJWTProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Enumeration;

@WebFilter("/")
@Component
public class CustomFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

       String token =  servletRequest.getParameter("access_token");
       if(StringUtils.isEmpty(token)){
           servletResponse.getWriter().println("no authorized");
       }else{
           try {
               JWTClaimsSet claimsSet =  configurableJWTProcessor.process(token,null);
               filterChain.doFilter(servletRequest, servletResponse);
           } catch (Exception e) {
               throw new ServletException("JWT Exception");
           }
       }

        //        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
//        Enumeration<String> headerNames = httpRequest.getHeaderNames();
//
//        if (headerNames != null) {
//            while (headerNames.hasMoreElements()) {
//                String key = headerNames.nextElement();
//
//                if("authorization".equalsIgnoreCase(key)){
//
//                    final String token = httpRequest.getHeader(key).replace("Bearer ","").replace("bearer ","");
//                    try {
//
//                        JWTClaimsSet claimsSet =  configurableJWTProcessor.process(token,null);
//                        filterChain.doFilter(servletRequest, servletResponse);
//                        return;
//                    } catch (Exception e) {
//                        throw new ServletException("JWT Exception");
//                    }
//                }
//
//            }
//        }
        //

    }


    @Autowired
    private ConfigurableJWTProcessor configurableJWTProcessor;



//
//
//
//    private boolean isIssuedCorrectly(JWTClaimsSet claimsSet) {
//        return claimsSet.getIssuer().equals("");
//    }
//
//    private boolean isIdToken(JWTClaimsSet claimsSet) {
//        return claimsSet.getClaim("token_use").equals("id");
//    }
}
