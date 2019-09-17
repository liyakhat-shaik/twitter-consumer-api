package com.student.learning.twitterconsumerapi.bo;

public class User {
    private Long id;
    private String name;
    private String screenName;
    private String location;
    private String derived; // array of enrichment objects
    private String url;
    private String description;
    private Boolean isProtected;
    private Boolean isVerified;
    private Integer followerCount;
    private Integer friendsCount;
    private Integer listedCount;
    private Integer favoritesCount;
    private Integer statusesCount;
    private String createdAt;
    private String profileBannerUrl;
    private String profileImageUrlHttps;
    private Boolean isDefaultProfile;
    private Boolean isDefaultProfileImage;
    private String[] withheldInCountries;
    private String withheldScope;

}
