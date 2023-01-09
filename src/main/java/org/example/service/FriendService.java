package org.example.service;

import org.example.dao.FriendDao;
import org.example.entity.Friend;

public class FriendService {
    private FriendDao friendDao = new FriendDao();

    public void save(Friend friend) {
        System.out.println("Friend information for save: " + friend.toString());
        friendDao.save(friend);
    }
}
