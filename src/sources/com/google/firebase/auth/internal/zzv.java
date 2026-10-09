package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.firebase.auth.AdditionalUserInfo;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzv implements AdditionalUserInfo {
    public static final Parcelable.Creator<zzv> CREATOR = new zzy();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18030c;

    public zzv(boolean z11) {
        this.f18030c = z11;
        this.f18029b = null;
        this.f18028a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, this.f18028a, false);
        SafeParcelWriter.k(parcel, 2, this.f18029b, false);
        SafeParcelWriter.p(parcel, 3, 4);
        parcel.writeInt(this.f18030c ? 1 : 0);
        SafeParcelWriter.r(parcel, iQ);
    }

    public zzv(String str, String str2, boolean z11) {
        Preconditions.d(str);
        Preconditions.d(str2);
        this.f18028a = str;
        this.f18029b = str2;
        zzbj.d(str2);
        this.f18030c = z11;
    }
}
