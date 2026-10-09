package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class AuthorizationResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthorizationResult> CREATOR = new zbc();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f8396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final GoogleSignInAccount f8397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PendingIntent f8398f;

    public AuthorizationResult(String str, String str2, String str3, ArrayList arrayList, GoogleSignInAccount googleSignInAccount, PendingIntent pendingIntent) {
        this.f8393a = str;
        this.f8394b = str2;
        this.f8395c = str3;
        Preconditions.g(arrayList);
        this.f8396d = arrayList;
        this.f8398f = pendingIntent;
        this.f8397e = googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationResult)) {
            return false;
        }
        AuthorizationResult authorizationResult = (AuthorizationResult) obj;
        return Objects.a(this.f8393a, authorizationResult.f8393a) && Objects.a(this.f8394b, authorizationResult.f8394b) && Objects.a(this.f8395c, authorizationResult.f8395c) && Objects.a(this.f8396d, authorizationResult.f8396d) && Objects.a(this.f8398f, authorizationResult.f8398f) && Objects.a(this.f8397e, authorizationResult.f8397e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8393a, this.f8394b, this.f8395c, this.f8396d, this.f8398f, this.f8397e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, this.f8393a, false);
        SafeParcelWriter.k(parcel, 2, this.f8394b, false);
        SafeParcelWriter.k(parcel, 3, this.f8395c, false);
        SafeParcelWriter.m(parcel, 4, this.f8396d);
        SafeParcelWriter.j(parcel, 5, this.f8397e, i11, false);
        SafeParcelWriter.j(parcel, 6, this.f8398f, i11, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
