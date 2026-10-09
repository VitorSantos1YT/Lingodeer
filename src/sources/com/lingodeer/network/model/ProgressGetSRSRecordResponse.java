package com.lingodeer.network.model;

import ep.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ProgressGetSRSRecordResponse {
    private final String srs_record;

    public ProgressGetSRSRecordResponse(String srs_record) {
        m.f(srs_record, "srs_record");
        this.srs_record = srs_record;
    }

    public static /* synthetic */ ProgressGetSRSRecordResponse copy$default(ProgressGetSRSRecordResponse progressGetSRSRecordResponse, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = progressGetSRSRecordResponse.srs_record;
        }
        return progressGetSRSRecordResponse.copy(str);
    }

    public final String component1() {
        return this.srs_record;
    }

    public final ProgressGetSRSRecordResponse copy(String srs_record) {
        m.f(srs_record, "srs_record");
        return new ProgressGetSRSRecordResponse(srs_record);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProgressGetSRSRecordResponse) && m.a(this.srs_record, ((ProgressGetSRSRecordResponse) obj).srs_record);
    }

    public final String getSrs_record() {
        return this.srs_record;
    }

    public int hashCode() {
        return this.srs_record.hashCode();
    }

    public String toString() {
        return a.g("ProgressGetSRSRecordResponse(srs_record=", this.srs_record, ")");
    }
}
