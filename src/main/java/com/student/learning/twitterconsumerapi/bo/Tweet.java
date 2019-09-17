package com.student.learning.twitterconsumerapi.bo;

public class Tweet {

    private Long id;
    private String createdAt;
    private String text;
    private Boolean truncated;
    private Long inReplyToStatusId;
    private Long inReplyToUserId;
    private String inReplyToScreenName;
    private User user;
    private Coordinates coordinates;
    private Place place;
    private Long quoteStatusId;
    private Boolean isQuoteStatus;
    private Tweet quotedStatus;
    private Tweet retweetedStatus;
    private Integer quoteCount;
    private int replyCount;
    private int retweetCount;
    private Integer favoriteCount;
    private Entities entities;
    private ExtendedEntities extendedEntities;
    private Boolean isFavorite;
    private Boolean isRetweeted;
    private Boolean possiblySensitive;
    private String filterLevel;
    private String lang;
    private Rule[] matchingRules;

}
