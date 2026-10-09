package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class SignInPassword extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInPassword> CREATOR = new zby();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8472b;

    public SignInPassword(String str, String str2) {
        Preconditions.h(str, "Account identifier cannot be null");
        String strTrim = str.trim();
        Preconditions.e(strTrim, "Account identifier cannot be empty");
        this.f8471a = strTrim;
        Preconditions.d(str2);
        this.f8472b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInPassword)) {
            return false;
        }
        SignInPassword signInPassword = (SignInPassword) obj;
        return Objects.a(this.f8471a, signInPassword.f8471a) && Objects.a(this.f8472b, signInPassword.f8472b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8471a, this.f8472b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, this.f8471a, false);
        SafeParcelWriter.k(parcel, 2, this.f8472b, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
