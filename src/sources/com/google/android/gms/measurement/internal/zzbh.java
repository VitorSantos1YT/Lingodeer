package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.material.datepicker.d;
import ep.a;
import su.Mbl.tcppUUQxZjFdy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbh> CREATOR = new zzbi();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzbf f12703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f12706e;

    public zzbh(zzbh zzbhVar, long j11, long j12) {
        Preconditions.g(zzbhVar);
        this.f12702a = zzbhVar.f12702a;
        this.f12703b = zzbhVar.f12703b;
        this.f12704c = zzbhVar.f12704c;
        this.f12705d = j11;
        this.f12706e = j12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        zzbi.a(this, parcel, i11);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f12703b);
        String str = this.f12704c;
        int length = String.valueOf(str).length();
        String str2 = this.f12702a;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        d.w(sb2, "origin=", str, ",name=", str2);
        return a.k(sb2, tcppUUQxZjFdy.qzcMRWFcMaCCN, strValueOf);
    }

    public zzbh(String str, zzbf zzbfVar, String str2, long j11, long j12) {
        this.f12702a = str;
        this.f12703b = zzbfVar;
        this.f12704c = str2;
        this.f12705d = j11;
        this.f12706e = j12;
    }
}
