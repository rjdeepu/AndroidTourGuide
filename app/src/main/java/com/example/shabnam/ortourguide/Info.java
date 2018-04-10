package com.example.shabnam.ortourguide;

public class Info {

    private String vAttractionName;

    private String vAttractionDetails;

    private int vImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Info(String attractionName, String attractionDetails) {
        vAttractionName = attractionName;
        vAttractionDetails = attractionDetails;
    }

    public Info(String attractionName, String attractionDetails, int imageResourceId) {
        vAttractionName = attractionName;
        vAttractionDetails = attractionDetails;
        vImageResourceId = imageResourceId;
    }

    public String getAttractionName() {

        return vAttractionName;
    }

    public String getAttractionDetails() {

        return vAttractionDetails;
    }

    public int getImageResourceId() {

        return vImageResourceId;
    }

    public boolean hasImage() {

        return vImageResourceId != NO_IMAGE_PROVIDED;
    }
}
