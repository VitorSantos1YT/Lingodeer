package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class SignInCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInCredential> CREATOR = new zbw();
    public final String H;
    public final PublicKeyCredential K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Uri f8468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f8469f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f8470t;

    public SignInCredential(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, PublicKeyCredential publicKeyCredential) {
        Preconditions.g(str);
        this.f8464a = str;
        this.f8465b = str2;
        this.f8466c = str3;
        this.f8467d = str4;
        this.f8468e = uri;
        this.f8469f = str5;
        this.f8470t = str6;
        this.H = str7;
        this.K = publicKeyCredential;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        return Objects.a(this.f8464a, signInCredential.f8464a) && Objects.a(this.f8465b, signInCredential.f8465b) && Objects.a(this.f8466c, signInCredential.f8466c) && Objects.a(this.f8467d, signInCredential.f8467d) && Objects.a(this.f8468e, signInCredential.f8468e) && Objects.a(this.f8469f, signInCredential.f8469f) && Objects.a(this.f8470t, signInCredential.f8470t) && Objects.a(this.H, signInCredential.H) && Objects.a(this.K, signInCredential.K);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8464a, this.f8465b, this.f8466c, this.f8467d, this.f8468e, this.f8469f, this.f8470t, this.H, this.K});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, this.f8464a, false);
        SafeParcelWriter.k(parcel, 2, this.f8465b, false);
        SafeParcelWriter.k(parcel, 3, this.f8466c, false);
        SafeParcelWriter.k(parcel, 4, this.f8467d, false);
        SafeParcelWriter.j(parcel, 5, this.f8468e, i11, false);
        SafeParcelWriter.k(parcel, 6, this.f8469f, false);
        SafeParcelWriter.k(parcel, 7, this.f8470t, false);
        SafeParcelWriter.k(parcel, 8, this.H, false);
        SafeParcelWriter.j(parcel, 9, this.K, i11, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
