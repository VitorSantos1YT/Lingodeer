package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new zzai();
    public long H;
    public zzbh K;
    public final long L;
    public final zzbh M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f12620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f12621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zzpl f12622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f12623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f12625f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final zzbh f12626t;

    public zzah(zzah zzahVar) {
        Preconditions.g(zzahVar);
        this.f12620a = zzahVar.f12620a;
        this.f12621b = zzahVar.f12621b;
        this.f12622c = zzahVar.f12622c;
        this.f12623d = zzahVar.f12623d;
        this.f12624e = zzahVar.f12624e;
        this.f12625f = zzahVar.f12625f;
        this.f12626t = zzahVar.f12626t;
        this.H = zzahVar.H;
        this.K = zzahVar.K;
        this.L = zzahVar.L;
        this.M = zzahVar.M;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 2, this.f12620a, false);
        SafeParcelWriter.k(parcel, 3, this.f12621b, false);
        SafeParcelWriter.j(parcel, 4, this.f12622c, i11, false);
        long j11 = this.f12623d;
        SafeParcelWriter.p(parcel, 5, 8);
        parcel.writeLong(j11);
        boolean z11 = this.f12624e;
        SafeParcelWriter.p(parcel, 6, 4);
        parcel.writeInt(z11 ? 1 : 0);
        SafeParcelWriter.k(parcel, 7, this.f12625f, false);
        SafeParcelWriter.j(parcel, 8, this.f12626t, i11, false);
        long j12 = this.H;
        SafeParcelWriter.p(parcel, 9, 8);
        parcel.writeLong(j12);
        SafeParcelWriter.j(parcel, 10, this.K, i11, false);
        SafeParcelWriter.p(parcel, 11, 8);
        parcel.writeLong(this.L);
        SafeParcelWriter.j(parcel, 12, this.M, i11, false);
        SafeParcelWriter.r(parcel, iQ);
    }

    public zzah(String str, String str2, zzpl zzplVar, long j11, boolean z11, String str3, zzbh zzbhVar, long j12, zzbh zzbhVar2, long j13, zzbh zzbhVar3) {
        this.f12620a = str;
        this.f12621b = str2;
        this.f12622c = zzplVar;
        this.f12623d = j11;
        this.f12624e = z11;
        this.f12625f = str3;
        this.f12626t = zzbhVar;
        this.H = j12;
        this.K = zzbhVar2;
        this.L = j13;
        this.M = zzbhVar3;
    }
}
