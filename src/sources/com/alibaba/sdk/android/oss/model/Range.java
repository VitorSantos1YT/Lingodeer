package com.alibaba.sdk.android.oss.model;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class Range {
    public static final long INFINITE = -1;
    private long begin;
    private long end;

    public Range(long j11, long j12) {
        setBegin(j11);
        setEnd(j12);
    }

    public boolean checkIsValid() {
        long j11 = this.begin;
        if (j11 >= -1) {
            long j12 = this.end;
            if (j12 >= -1) {
                return j11 < 0 || j12 < 0 || j11 <= j12;
            }
        }
        return false;
    }

    public long getBegin() {
        return this.begin;
    }

    public long getEnd() {
        return this.end;
    }

    public void setBegin(long j11) {
        this.begin = j11;
    }

    public void setEnd(long j11) {
        this.end = j11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("bytes=");
        long j11 = this.begin;
        String strValueOf = BuildConfig.VERSION_NAME;
        sb2.append(j11 == -1 ? BuildConfig.VERSION_NAME : String.valueOf(j11));
        sb2.append("-");
        long j12 = this.end;
        if (j12 != -1) {
            strValueOf = String.valueOf(j12);
        }
        sb2.append(strValueOf);
        return sb2.toString();
    }
}
