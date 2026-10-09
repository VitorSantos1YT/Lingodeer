package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new zaa();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f8516c;

    public GoogleSignInOptionsExtensionParcelable(int i11, int i12, Bundle bundle) {
        this.f8514a = i11;
        this.f8515b = i12;
        this.f8516c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f8514a);
        SafeParcelWriter.p(parcel, 2, 4);
        parcel.writeInt(this.f8515b);
        SafeParcelWriter.b(parcel, 3, this.f8516c);
        SafeParcelWriter.r(parcel, iQ);
    }
}
