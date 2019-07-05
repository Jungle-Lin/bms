package top.lin.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Base64.*;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: Jungle Lin
 * Date: 2019/7/5
 * Time: 16:03
 */
public class JwtUtil {
    private static final long EXPIRE_TIME = 30L * 24L * 60L * 60L * 1000L;
    private static final String pass = "asd235trt75we333rgg";
    private static final String auth0 = "Linjy";


    public static String sign(Integer id, String account) {
        Date date = new Date(System.currentTimeMillis() + EXPIRE_TIME);
        try {
            Algorithm algorithm = Algorithm.HMAC256(pass);
            return JWT.create().withIssuer(auth0).withClaim("id", id).withClaim("account", account).withExpiresAt(date).sign(algorithm);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static DecodedJWT verify(String token) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(pass);
            JWTVerifier jwtVerifier = JWT.require(algorithm).build();
            DecodedJWT jwt = jwtVerifier.verify(token);
            return jwt;
        } catch (Exception e) {
            return null;
        }
    }

    private static Decoder decoder = Base64.getDecoder();
    private static Encoder encoder = Base64.getEncoder();

    public static String encoding(String val) throws UnsupportedEncodingException {
        return encoder.encodeToString(val.getBytes("utf-8"));
    }

    public static String decoding(String val) {
        return String.valueOf(decoder.decode(val));
    }
}
