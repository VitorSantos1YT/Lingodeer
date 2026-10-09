package com.alibaba.sdk.android.oss.model;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class GetBucketLoggingResult extends OSSResult {
    private boolean mLoggingEnabled = false;
    private String mTargetBucketName;
    private String mTargetPrefix;

    public String getTargetBucketName() {
        return this.mTargetBucketName;
    }

    public String getTargetPrefix() {
        return this.mTargetPrefix;
    }

    public boolean loggingEnabled() {
        return this.mLoggingEnabled;
    }

    public void setLoggingEnabled(boolean z11) {
        this.mLoggingEnabled = z11;
    }

    public void setTargetBucketName(String str) {
        this.mTargetBucketName = str;
    }

    public void setTargetPrefix(String str) {
        this.mTargetPrefix = str;
    }
}
