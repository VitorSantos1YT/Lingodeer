package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaw> CREATOR = new zax();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Account f8991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final GoogleSignInAccount f8993d;

    public zaw(int i11, Account account, int i12, GoogleSignInAccount googleSignInAccount) {
        this.f8990a = i11;
        this.f8991b = account;
        this.f8992c = i12;
        this.f8993d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f8990a);
        SafeParcelWriter.j(parcel, 2, this.f8991b, i11, false);
        SafeParcelWriter.p(parcel, 3, 4);
        parcel.writeInt(this.f8992c);
        SafeParcelWriter.j(parcel, 4, this.f8993d, i11, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
