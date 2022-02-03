package se.lexicon.dao;

import se.lexicon.AppUser;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AppUserDAOImpl implements AppUserDAO {

    private final List<AppUser> appUsers;

    public AppUserDAOImpl(List<AppUser> appUser) {
        this.appUsers = appUser;
    }

    @Override
    public AppUser persist(AppUser appUser) {
        appUsers.add(appUser);
        return appUser;
    }

    @Override
    public AppUser findByUsername(String username) {
        for (AppUser u : appUsers) {
            if (u.getUsername().trim().equalsIgnoreCase(username)) {
                return u;
            }

        }
            return null;

    }
    @Override
    public Collection<AppUser> findAll() {

        return Collections.unmodifiableCollection(appUsers);
    }

    @Override
    public void remove(AppUser username) {
        appUsers.remove(username);
    }
}
