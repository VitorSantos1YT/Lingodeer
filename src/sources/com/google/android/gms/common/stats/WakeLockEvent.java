package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.material.datepicker.d;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new zza();
    public final List H;
    public final String K;
    public final long L;
    public final int M;
    public final String N;
    public final float O;
    public final long P;
    public final boolean Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f9115f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f9116t;

    public WakeLockEvent(int i11, long j11, int i12, String str, int i13, ArrayList arrayList, String str2, long j12, int i14, String str3, String str4, float f5, long j13, String str5, boolean z11) {
        this.f9110a = i11;
        this.f9111b = j11;
        this.f9112c = i12;
        this.f9113d = str;
        this.f9114e = str3;
        this.f9115f = str5;
        this.f9116t = i13;
        this.H = arrayList;
        this.K = str2;
        this.L = j12;
        this.M = i14;
        this.N = str4;
        this.O = f5;
        this.P = j13;
        this.Q = z11;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long D1() {
        return this.f9111b;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int E1() {
        return this.f9112c;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final String F1() {
        String str = BuildConfig.VERSION_NAME;
        List list = this.H;
        String strJoin = list == null ? BuildConfig.VERSION_NAME : TextUtils.join(",", list);
        String str2 = this.f9113d;
        int length = String.valueOf(str2).length();
        int i11 = this.f9116t;
        int length2 = String.valueOf(i11).length() + length + 2;
        int length3 = String.valueOf(strJoin).length();
        int i12 = this.M;
        int length4 = String.valueOf(i12).length() + length2 + 1 + length3 + 1;
        String str3 = this.f9114e;
        if (str3 == null) {
            str3 = BuildConfig.VERSION_NAME;
        }
        int length5 = str3.length() + length4 + 1 + 1;
        String str4 = this.N;
        if (str4 == null) {
            str4 = BuildConfig.VERSION_NAME;
        }
        int length6 = str4.length() + length5 + 1;
        float f5 = this.O;
        int length7 = String.valueOf(f5).length() + length6 + 1;
        String str5 = this.f9115f;
        if (str5 != null) {
            str = str5;
        }
        int length8 = str.length() + length7 + 1;
        boolean z11 = this.Q;
        StringBuilder sb2 = new StringBuilder(length8 + String.valueOf(z11).length());
        sb2.append("\t");
        sb2.append(str2);
        sb2.append("\t");
        sb2.append(i11);
        sb2.append("\t");
        sb2.append(strJoin);
        sb2.append("\t");
        sb2.append(i12);
        d.w(sb2, "\t", str3, "\t", str4);
        sb2.append("\t");
        sb2.append(f5);
        sb2.append("\t");
        sb2.append(str);
        sb2.append("\t");
        sb2.append(z11);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f9110a);
        SafeParcelWriter.p(parcel, 2, 8);
        parcel.writeLong(this.f9111b);
        SafeParcelWriter.k(parcel, 4, this.f9113d, false);
        SafeParcelWriter.p(parcel, 5, 4);
        parcel.writeInt(this.f9116t);
        SafeParcelWriter.m(parcel, 6, this.H);
        SafeParcelWriter.p(parcel, 8, 8);
        parcel.writeLong(this.L);
        SafeParcelWriter.k(parcel, 10, this.f9114e, false);
        SafeParcelWriter.p(parcel, 11, 4);
        parcel.writeInt(this.f9112c);
        SafeParcelWriter.k(parcel, 12, this.K, false);
        SafeParcelWriter.k(parcel, 13, this.N, false);
        SafeParcelWriter.p(parcel, 14, 4);
        parcel.writeInt(this.M);
        SafeParcelWriter.p(parcel, 15, 4);
        parcel.writeFloat(this.O);
        SafeParcelWriter.p(parcel, 16, 8);
        parcel.writeLong(this.P);
        SafeParcelWriter.k(parcel, 17, this.f9115f, false);
        SafeParcelWriter.p(parcel, 18, 4);
        parcel.writeInt(this.Q ? 1 : 0);
        SafeParcelWriter.r(parcel, iQ);
    }
}
