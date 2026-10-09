package com.alibaba.sdk.android.oss.model;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class PutBucketRefererRequest extends OSSRequest {
    private boolean mAllowEmpty;
    private String mBucketName;
    private ArrayList<String> mReferers;

    public String getBucketName() {
        return this.mBucketName;
    }

    public ArrayList<String> getReferers() {
        return this.mReferers;
    }

    public boolean isAllowEmpty() {
        return this.mAllowEmpty;
    }

    public void setAllowEmpty(boolean z11) {
        this.mAllowEmpty = z11;
    }

    public void setBucketName(String str) {
        this.mBucketName = str;
    }

    public void setReferers(ArrayList<String> arrayList) {
        this.mReferers = arrayList;
    }
}
