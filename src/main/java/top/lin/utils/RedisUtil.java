package top.lin.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Created by IntelliJ IDEA.
 * User: Jungle Lin
 * Date: 2019/7/5
 * Time: 19:14
 */
public class RedisUtil {

    @Bean
    RedisTemplate<String, Object> redis() {
        return new RedisTemplate<String, Object>();
    }

}
