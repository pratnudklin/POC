package th.co.integrationworks.poc;

import com.nimbusds.jose.jwk.source.JWKSource;
import com.nimbusds.jose.jwk.source.RemoteJWKSet;
import com.nimbusds.jose.proc.JWSKeySelector;
import com.nimbusds.jose.proc.JWSVerificationKeySelector;
import com.nimbusds.jose.util.DefaultResourceRetriever;
import com.nimbusds.jose.util.ResourceRetriever;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.proc.ConfigurableJWTProcessor;
import com.nimbusds.jwt.proc.DefaultJWTProcessor;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import th.co.integrationworks.poc.repository.TenantRepository;

import javax.servlet.http.HttpServletRequest;
import java.net.MalformedURLException;
import java.net.URL;

import static com.nimbusds.jose.JWSAlgorithm.RS256;

@ServletComponentScan
@SpringBootApplication
public class PocApplication {

    public static void main(String[] args) {
        SpringApplication.run(PocApplication.class, args);
    }


    @Configuration
    public static class Config {

        @Bean
        public ConfigurableJWTProcessor configurableJWTProcessor() throws MalformedURLException {
            ResourceRetriever resourceRetriever = new DefaultResourceRetriever(2000, 2000);
            URL jwkSetURL = new URL("https://cognito-idp.us-west-2.amazonaws.com/us-west-2_lQpqJkYAq/.well-known/jwks.json");
            JWKSource keySource = new RemoteJWKSet(jwkSetURL, resourceRetriever);
            ConfigurableJWTProcessor jwtProcessor = new DefaultJWTProcessor();
            JWSKeySelector keySelector = new JWSVerificationKeySelector(RS256, keySource);
            jwtProcessor.setJWSKeySelector(keySelector);
            return jwtProcessor;
        }

    }










    }


