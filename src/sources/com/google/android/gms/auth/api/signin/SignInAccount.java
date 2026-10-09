package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new zbb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GoogleSignInAccount f8512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8513c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f8512b = googleSignInAccount;
        Preconditions.e(str, "8.3 and 8.4 SDKs require non-null email");
        this.f8511a = str;
        Preconditions.e(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.f8513c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 4, this.f8511a, false);
        SafeParcelWriter.j(parcel, 7, this.f8512b, i11, false);
        SafeParcelWriter.k(parcel, 8, this.f8513c, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
