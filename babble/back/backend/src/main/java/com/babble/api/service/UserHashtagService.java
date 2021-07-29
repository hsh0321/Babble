package com.babble.api.service;

import com.babble.db.entity.Hashtag;
import com.babble.db.entity.User;
import com.babble.db.entity.UserHashtag;

import java.util.List;

public interface UserHashtagService {
    UserHashtag createUserHashtag(User user, Hashtag hashtag);
    void deleteHashtag(User user, Hashtag hashtag);
    List<String> getUserHashtag(Long userId);
}
