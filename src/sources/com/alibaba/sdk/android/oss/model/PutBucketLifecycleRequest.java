package com.alibaba.sdk.android.oss.model;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class PutBucketLifecycleRequest extends OSSRequest {
    ArrayList<BucketLifecycleRule> lifecycleRules;
    private String mBucketName;

    public String getBucketName() {
        return this.mBucketName;
    }

    public ArrayList<BucketLifecycleRule> getLifecycleRules() {
        return this.lifecycleRules;
    }

    public void setBucketName(String str) {
        this.mBucketName = str;
    }

    public void setLifecycleRules(ArrayList<BucketLifecycleRule> arrayList) {
        this.lifecycleRules = arrayList;
    }
}
