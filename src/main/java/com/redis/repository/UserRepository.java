package com.redis.repository;

import com.redis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class UserRepository {

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
