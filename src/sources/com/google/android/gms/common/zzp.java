package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new zzq();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f9173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f9175f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f9176t;

    public zzp(String str, boolean z11, boolean z12, IBinder iBinder, boolean z13, boolean z14, boolean z15) {
        this.f9170a = str;
        this.f9171b = z11;
        this.f9172c = z12;
        this.f9173d = (Context) ObjectWrapper.j(IObjectWrapper.Stub.h(iBinder));
        this.f9174e = z13;
        this.f9175f = z14;
        this.f9176t = z15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, this.f9170a, false);
        SafeParcelWriter.p(parcel, 2, 4);
        parcel.writeInt(this.f9171b ? 1 : 0);
        SafeParcelWriter.p(parcel, 3, 4);
        parcel.writeInt(this.f9172c ? 1 : 0);
        SafeParcelWriter.f(parcel, 4, new ObjectWrapper(this.f9173d));
        SafeParcelWriter.p(parcel, 5, 4);
        parcel.writeInt(this.f9174e ? 1 : 0);
        SafeParcelWriter.p(parcel, 6, 4);
        parcel.writeInt(this.f9175f ? 1 : 0);
        SafeParcelWriter.p(parcel, 8, 4);
        parcel.writeInt(this.f9176t ? 1 : 0);
        SafeParcelWriter.r(parcel, iQ);
    }
}
