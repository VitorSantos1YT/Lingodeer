package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class EmailAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<EmailAuthCredential> CREATOR = new zzf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f17875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17876e;

    public EmailAuthCredential(String str, String str2, String str3, String str4, boolean z11) {
        Preconditions.d(str);
        this.f17872a = str;
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.f17873b = str2;
        this.f17874c = str3;
        this.f17875d = str4;
        this.f17876e = z11;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String D1() {
        return "password";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, this.f17872a, false);
        SafeParcelWriter.k(parcel, 2, this.f17873b, false);
        SafeParcelWriter.k(parcel, 3, this.f17874c, false);
        SafeParcelWriter.k(parcel, 4, this.f17875d, false);
        boolean z11 = this.f17876e;
        SafeParcelWriter.p(parcel, 5, 4);
        parcel.writeInt(z11 ? 1 : 0);
        SafeParcelWriter.r(parcel, iQ);
    }
}
