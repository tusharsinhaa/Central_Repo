package com.springrest.springrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImple implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean addUserService(User us) {
        boolean status=false;

        try
        {
            userRepository.save(us);
            status=true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            status=false;
        }

        return status;
    }
}
