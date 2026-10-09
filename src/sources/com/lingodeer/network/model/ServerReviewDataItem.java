package com.lingodeer.network.model;

import com.google.android.material.datepicker.d;
import defpackage.e;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ServerReviewDataItem {
    private final String data_key;
    private final String data_lan;
    private final String data_type;
    private final String practice_meta_data;
    private final String srs_meta_data;
    private final long update_timestamp;

    public ServerReviewDataItem(String data_key, String data_lan, String data_type, String srs_meta_data, String practice_meta_data, long j11) {
        m.f(data_key, "data_key");
        m.f(data_lan, "data_lan");
        m.f(data_type, "data_type");
        m.f(srs_meta_data, "srs_meta_data");
        m.f(practice_meta_data, "practice_meta_data");
        this.data_key = data_key;
        this.data_lan = data_lan;
        this.data_type = data_type;
        this.srs_meta_data = srs_meta_data;
        this.practice_meta_data = practice_meta_data;
        this.update_timestamp = j11;
    }

    public static /* synthetic */ ServerReviewDataItem copy$default(ServerReviewDataItem serverReviewDataItem, String str, String str2, String str3, String str4, String str5, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = serverReviewDataItem.data_key;
        }
        if ((i11 & 2) != 0) {
            str2 = serverReviewDataItem.data_lan;
        }
        if ((i11 & 4) != 0) {
            str3 = serverReviewDataItem.data_type;
        }
        if ((i11 & 8) != 0) {
            str4 = serverReviewDataItem.srs_meta_data;
        }
        if ((i11 & 16) != 0) {
            str5 = serverReviewDataItem.practice_meta_data;
        }
        if ((i11 & 32) != 0) {
            j11 = serverReviewDataItem.update_timestamp;
        }
        long j12 = j11;
        String str6 = str5;
        String str7 = str3;
        return serverReviewDataItem.copy(str, str2, str7, str4, str6, j12);
    }

    public final String component1() {
        return this.data_key;
    }

    public final String component2() {
        return this.data_lan;
    }

    public final String component3() {
        return this.data_type;
    }

    public final String component4() {
        return this.srs_meta_data;
    }

    public final String component5() {
        return this.practice_meta_data;
    }

    public final long component6() {
        return this.update_timestamp;
    }

    public final ServerReviewDataItem copy(String data_key, String data_lan, String data_type, String srs_meta_data, String practice_meta_data, long j11) {
        m.f(data_key, "data_key");
        m.f(data_lan, "data_lan");
        m.f(data_type, "data_type");
        m.f(srs_meta_data, "srs_meta_data");
        m.f(practice_meta_data, "practice_meta_data");
        return new ServerReviewDataItem(data_key, data_lan, data_type, srs_meta_data, practice_meta_data, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServerReviewDataItem)) {
            return false;
        }
        ServerReviewDataItem serverReviewDataItem = (ServerReviewDataItem) obj;
        return m.a(this.data_key, serverReviewDataItem.data_key) && m.a(this.data_lan, serverReviewDataItem.data_lan) && m.a(this.data_type, serverReviewDataItem.data_type) && m.a(this.srs_meta_data, serverReviewDataItem.srs_meta_data) && m.a(this.practice_meta_data, serverReviewDataItem.practice_meta_data) && this.update_timestamp == serverReviewDataItem.update_timestamp;
    }

    public final String getData_key() {
        return this.data_key;
    }

    public final String getData_lan() {
        return this.data_lan;
    }

    public final String getData_type() {
        return this.data_type;
    }

    public final String getPractice_meta_data() {
        return this.practice_meta_data;
    }

    public final String getSrs_meta_data() {
        return this.srs_meta_data;
    }

    public final long getUpdate_timestamp() {
        return this.update_timestamp;
    }

    public int hashCode() {
        return Long.hashCode(this.update_timestamp) + e.d(e.d(e.d(e.d(this.data_key.hashCode() * 31, 31, this.data_lan), 31, this.data_type), 31, this.srs_meta_data), 31, this.practice_meta_data);
    }

    public String toString() {
        String str = this.data_key;
        String str2 = this.data_lan;
        String str3 = this.data_type;
        String str4 = this.srs_meta_data;
        String str5 = this.practice_meta_data;
        long j11 = this.update_timestamp;
        StringBuilder sbS = e.s("ServerReviewDataItem(data_key=", str, ", data_lan=", str2, ", data_type=");
        d.w(sbS, str3, ", srs_meta_data=", str4, ", practice_meta_data=");
        sbS.append(str5);
        sbS.append(", update_timestamp=");
        sbS.append(j11);
        sbS.append(")");
        return sbS.toString();
    }
}
