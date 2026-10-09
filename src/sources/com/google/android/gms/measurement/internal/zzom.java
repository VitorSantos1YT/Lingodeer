package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzom extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzom> CREATOR = new zzon();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f13554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f13556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f13558f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f13559t;

    public zzom(long j11, byte[] bArr, String str, Bundle bundle, int i11, long j12, String str2) {
        this.f13553a = j11;
        this.f13554b = bArr;
        this.f13555c = str;
        this.f13556d = bundle;
        this.f13557e = i11;
        this.f13558f = j12;
        this.f13559t = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 8);
        parcel.writeLong(this.f13553a);
        SafeParcelWriter.c(parcel, 2, this.f13554b, false);
        SafeParcelWriter.k(parcel, 3, this.f13555c, false);
        SafeParcelWriter.b(parcel, 4, this.f13556d);
        SafeParcelWriter.p(parcel, 5, 4);
        parcel.writeInt(this.f13557e);
        SafeParcelWriter.p(parcel, 6, 8);
        parcel.writeLong(this.f13558f);
        SafeParcelWriter.k(parcel, 7, this.f13559t, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
