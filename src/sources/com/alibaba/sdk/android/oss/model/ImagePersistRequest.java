package com.alibaba.sdk.android.oss.model;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ImagePersistRequest extends OSSRequest {
    public String mAction;
    public String mFromBucket;
    public String mFromObjectkey;
    public String mToBucketName;
    public String mToObjectKey;

    public ImagePersistRequest(String str, String str2, String str3, String str4, String str5) {
        this.mFromBucket = str;
        this.mFromObjectkey = str2;
        this.mToBucketName = str3;
        this.mToObjectKey = str4;
        this.mAction = str5;
    }
}
