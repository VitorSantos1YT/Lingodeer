package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9181e;

    public zzr(int i11, int i12, long j11, String str, boolean z11) {
        this.f9177a = z11;
        this.f9178b = str;
        this.f9179c = zzz.a(i11) - 1;
        this.f9180d = zzc.a(i12) - 1;
        this.f9181e = j11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f9177a ? 1 : 0);
        SafeParcelWriter.k(parcel, 2, this.f9178b, false);
        SafeParcelWriter.p(parcel, 3, 4);
        parcel.writeInt(this.f9179c);
        SafeParcelWriter.p(parcel, 4, 4);
        parcel.writeInt(this.f9180d);
        SafeParcelWriter.p(parcel, 5, 8);
        parcel.writeLong(this.f9181e);
        SafeParcelWriter.r(parcel, iQ);
    }
}
