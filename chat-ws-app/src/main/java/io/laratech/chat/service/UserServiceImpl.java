package io.laratech.chat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.laratech.chat.exception.UsernameAlreadyUsedException;
import io.laratech.chat.model.User;
import io.laratech.chat.repository.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userDao;

    @Override
    public User connect(User user) throws UsernameAlreadyUsedException {
        User dbUser = userDao.findByUsername(user.getUsername());

        if (dbUser != null) {

            if (dbUser.getConnected()) {
                throw new UsernameAlreadyUsedException("This user is already connected: " + dbUser.getUsername());
            }

            dbUser.setConnected(true);
            return userDao.save(dbUser);
        }

        user.setConnected(true);
        return userDao.save(user);
    }

    @Override
    public User disconnect(User user) {
        if (user == null) {
            return null;
        }

        User dbUser = userDao.findByUsername(user.getUsername());
        if (dbUser == null) {
            return user;
        }

        dbUser.setConnected(false);
        return userDao.save(dbUser);
    }

}
