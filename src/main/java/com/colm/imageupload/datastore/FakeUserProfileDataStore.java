package com.colm.imageupload.datastore;

import com.colm.imageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    // Add fake data
    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("339e2588-8bde-4715-97bb-f55bc347e6be"), "johnjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("3c740d97-d5b3-453a-881f-13aa4645d919"), "ronniedrew", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }

}
