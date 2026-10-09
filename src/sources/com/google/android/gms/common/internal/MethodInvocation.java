package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new zaq();
    public final int H;
    public final int K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f8939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f8940f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f8941t;

    public MethodInvocation(int i11, int i12, int i13, long j11, long j12, String str, String str2, int i14, int i15) {
        this.f8935a = i11;
        this.f8936b = i12;
        this.f8937c = i13;
        this.f8938d = j11;
        this.f8939e = j12;
        this.f8940f = str;
        this.f8941t = str2;
        this.H = i14;
        this.K = i15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f8935a);
        SafeParcelWriter.p(parcel, 2, 4);
        parcel.writeInt(this.f8936b);
        SafeParcelWriter.p(parcel, 3, 4);
        parcel.writeInt(this.f8937c);
        SafeParcelWriter.p(parcel, 4, 8);
        parcel.writeLong(this.f8938d);
        SafeParcelWriter.p(parcel, 5, 8);
        parcel.writeLong(this.f8939e);
        SafeParcelWriter.k(parcel, 6, this.f8940f, false);
        SafeParcelWriter.k(parcel, 7, this.f8941t, false);
        SafeParcelWriter.p(parcel, 8, 4);
        parcel.writeInt(this.H);
        SafeParcelWriter.p(parcel, 9, 4);
        parcel.writeInt(this.K);
        SafeParcelWriter.r(parcel, iQ);
    }
}
