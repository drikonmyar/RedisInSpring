package com.redis.repository;

import com.redis.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class UserRepository {

    private static final Logger log = LoggerFactory.getLogger(UserRepository.class);
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    private static final String KEY = "USER";

    //save user
    public User saveUser(User user){
        redisTemplate.opsForHash().put(KEY, user.getUserId(), user);
        return user;
    }

    //get user by userId
    public User getUser(String userId){
        log.info("fetching user details from db");
        return (User) redisTemplate.opsForHash().get(KEY, userId);
    }

    //get all users
    public List<User> getAllUsers(){
        return redisTemplate.opsForHash().entries(KEY).values().stream().map(o -> (User) o).toList();
    }

    //delete user by userId
    public void deleteUser(String userId){
        redisTemplate.opsForHash().delete(KEY, userId);
    }

}
