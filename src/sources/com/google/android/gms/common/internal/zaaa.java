package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zaaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaaa> CREATOR = new zaab();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Scope[] f8969d;

    public zaaa(int i11, int i12, int i13, Scope[] scopeArr) {
        this.f8966a = i11;
        this.f8967b = i12;
        this.f8968c = i13;
        this.f8969d = scopeArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f8966a);
        SafeParcelWriter.p(parcel, 2, 4);
        parcel.writeInt(this.f8967b);
        SafeParcelWriter.p(parcel, 3, 4);
        parcel.writeInt(this.f8968c);
        SafeParcelWriter.n(parcel, 4, this.f8969d, i11);
        SafeParcelWriter.r(parcel, iQ);
    }
}
