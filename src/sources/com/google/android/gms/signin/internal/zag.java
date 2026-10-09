package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zag extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zag> CREATOR = new zah();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13703b;

    public zag(ArrayList arrayList, String str) {
        this.f13702a = arrayList;
        this.f13703b = str;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f13703b != null ? Status.f8703e : Status.K;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.m(parcel, 1, this.f13702a);
        SafeParcelWriter.k(parcel, 2, this.f13703b, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
