package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();
    public final boolean H;
    public final boolean K;
    public final long L;
    public final String M;
    public final long N;
    public final int O;
    public final boolean P;
    public final boolean Q;
    public final Boolean R;
    public final long S;
    public final List T;
    public final String U;
    public final String V;
    public final String W;
    public final boolean X;
    public final long Y;
    public final int Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13655a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final String f13656a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13657b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final int f13658b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13659c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final long f13660c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13661d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final String f13662d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f13663e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final String f13664e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f13665f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final long f13666f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final int f13667g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final long f13668h0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f13669t;

    public zzr(String str, String str2, String str3, long j11, String str4, long j12, long j13, String str5, boolean z11, boolean z12, String str6, long j14, int i11, boolean z13, boolean z14, Boolean bool, long j15, List list, String str7, String str8, String str9, boolean z15, long j16, int i12, String str10, int i13, long j17, String str11, String str12, long j18, int i14, long j19) {
        Preconditions.d(str);
        this.f13655a = str;
        this.f13657b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f13659c = str3;
        this.L = j11;
        this.f13661d = str4;
        this.f13663e = j12;
        this.f13665f = j13;
        this.f13669t = str5;
        this.H = z11;
        this.K = z12;
        this.M = str6;
        this.N = j14;
        this.O = i11;
        this.P = z13;
        this.Q = z14;
        this.R = bool;
        this.S = j15;
        this.T = list;
        this.U = str7;
        this.V = str8;
        this.W = str9;
        this.X = z15;
        this.Y = j16;
        this.Z = i12;
        this.f13656a0 = str10;
        this.f13658b0 = i13;
        this.f13660c0 = j17;
        this.f13662d0 = str11;
        this.f13664e0 = str12;
        this.f13666f0 = j18;
        this.f13667g0 = i14;
        this.f13668h0 = j19;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 2, this.f13655a, false);
        SafeParcelWriter.k(parcel, 3, this.f13657b, false);
        SafeParcelWriter.k(parcel, 4, this.f13659c, false);
        SafeParcelWriter.k(parcel, 5, this.f13661d, false);
        SafeParcelWriter.p(parcel, 6, 8);
        parcel.writeLong(this.f13663e);
        SafeParcelWriter.p(parcel, 7, 8);
        parcel.writeLong(this.f13665f);
        SafeParcelWriter.k(parcel, 8, this.f13669t, false);
        SafeParcelWriter.p(parcel, 9, 4);
        parcel.writeInt(this.H ? 1 : 0);
        SafeParcelWriter.p(parcel, 10, 4);
        parcel.writeInt(this.K ? 1 : 0);
        SafeParcelWriter.p(parcel, 11, 8);
        parcel.writeLong(this.L);
        SafeParcelWriter.k(parcel, 12, this.M, false);
        SafeParcelWriter.p(parcel, 14, 8);
        parcel.writeLong(this.N);
        SafeParcelWriter.p(parcel, 15, 4);
        parcel.writeInt(this.O);
        SafeParcelWriter.p(parcel, 16, 4);
        parcel.writeInt(this.P ? 1 : 0);
        SafeParcelWriter.p(parcel, 18, 4);
        parcel.writeInt(this.Q ? 1 : 0);
        SafeParcelWriter.a(parcel, 21, this.R);
        SafeParcelWriter.p(parcel, 22, 8);
        parcel.writeLong(this.S);
        SafeParcelWriter.m(parcel, 23, this.T);
        SafeParcelWriter.k(parcel, 25, this.U, false);
        SafeParcelWriter.k(parcel, 26, this.V, false);
        SafeParcelWriter.k(parcel, 27, this.W, false);
        SafeParcelWriter.p(parcel, 28, 4);
        parcel.writeInt(this.X ? 1 : 0);
        SafeParcelWriter.p(parcel, 29, 8);
        parcel.writeLong(this.Y);
        SafeParcelWriter.p(parcel, 30, 4);
        parcel.writeInt(this.Z);
        SafeParcelWriter.k(parcel, 31, this.f13656a0, false);
        SafeParcelWriter.p(parcel, 32, 4);
        parcel.writeInt(this.f13658b0);
        SafeParcelWriter.p(parcel, 34, 8);
        parcel.writeLong(this.f13660c0);
        SafeParcelWriter.k(parcel, 35, this.f13662d0, false);
        SafeParcelWriter.k(parcel, 36, this.f13664e0, false);
        SafeParcelWriter.p(parcel, 37, 8);
        parcel.writeLong(this.f13666f0);
        SafeParcelWriter.p(parcel, 38, 4);
        parcel.writeInt(this.f13667g0);
        SafeParcelWriter.p(parcel, 39, 8);
        parcel.writeLong(this.f13668h0);
        SafeParcelWriter.r(parcel, iQ);
    }

    public zzr(String str, String str2, String str3, String str4, long j11, long j12, String str5, boolean z11, boolean z12, long j13, String str6, long j14, int i11, boolean z13, boolean z14, Boolean bool, long j15, ArrayList arrayList, String str7, String str8, String str9, boolean z15, long j16, int i12, String str10, int i13, long j17, String str11, String str12, long j18, int i14, long j19) {
        this.f13655a = str;
        this.f13657b = str2;
        this.f13659c = str3;
        this.L = j13;
        this.f13661d = str4;
        this.f13663e = j11;
        this.f13665f = j12;
        this.f13669t = str5;
        this.H = z11;
        this.K = z12;
        this.M = str6;
        this.N = j14;
        this.O = i11;
        this.P = z13;
        this.Q = z14;
        this.R = bool;
        this.S = j15;
        this.T = arrayList;
        this.U = str7;
        this.V = str8;
        this.W = str9;
        this.X = z15;
        this.Y = j16;
        this.Z = i12;
        this.f13656a0 = str10;
        this.f13658b0 = i13;
        this.f13660c0 = j17;
        this.f13662d0 = str11;
        this.f13664e0 = str12;
        this.f13666f0 = j18;
        this.f13667g0 = i14;
        this.f13668h0 = j19;
    }
}
