package com.colm.imageupload.bucket;

public enum BucketName {

    PROFILE_IMAGE("colm-image-upload-java-1");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
