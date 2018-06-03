package com.ssm.mapper;
 
import java.util.List;

import com.ssm.model.User;
 
public interface UserMapper {
 
      
    public int createUser(User user);  
       
      
    public void deleteUser(int id);  
       
      
    public User  selectUserById(int id);  
     
      
    public int updateUser(User category);   
       
      
    public List<User> selectAllUser();
    
      
    public int countUser();  
    
    
    
}