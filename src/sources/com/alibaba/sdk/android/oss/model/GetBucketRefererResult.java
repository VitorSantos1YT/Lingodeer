package com.alibaba.sdk.android.oss.model;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class GetBucketRefererResult extends OSSResult {
    private String mAllowEmpty;
    private ArrayList<String> mReferers;

    public void addReferer(String str) {
        if (this.mReferers == null) {
            this.mReferers = new ArrayList<>();
        }
        this.mReferers.add(str);
    }

    public String getAllowEmpty() {
        return this.mAllowEmpty;
    }

    public ArrayList<String> getReferers() {
        return this.mReferers;
    }

    public void setAllowEmpty(String str) {
        this.mAllowEmpty = str;
    }

    public void setReferers(ArrayList<String> arrayList) {
        this.mReferers = arrayList;
    }
}
