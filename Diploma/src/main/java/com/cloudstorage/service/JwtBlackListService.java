package com.cloudstorage.service;

import com.cloudstorage.entities.JwtBlackListEntity;

public interface JwtBlackListService {

    boolean isBlacklisted(String jwt);

    JwtBlackListEntity saveInBlackList(String jwt);
}
