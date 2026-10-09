package com.alibaba.sdk.android.oss.model;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class GetBucketLifecycleResult extends OSSResult {
    private ArrayList<BucketLifecycleRule> mLifecycleRules;

    public void addLifecycleRule(BucketLifecycleRule bucketLifecycleRule) {
        if (this.mLifecycleRules == null) {
            this.mLifecycleRules = new ArrayList<>();
        }
        this.mLifecycleRules.add(bucketLifecycleRule);
    }

    public ArrayList<BucketLifecycleRule> getlifecycleRules() {
        return this.mLifecycleRules;
    }

    public void setLifecycleRules(ArrayList<BucketLifecycleRule> arrayList) {
        this.mLifecycleRules = arrayList;
    }
}
