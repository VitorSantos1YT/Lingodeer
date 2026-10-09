package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class PhoneAuthCredential extends AuthCredential implements Cloneable {
    public static final Parcelable.Creator<PhoneAuthCredential> CREATOR = new zzap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f17909e;

    public PhoneAuthCredential(String str, String str2, String str3, String str4, boolean z11) {
        Preconditions.a("Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.", ((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))) ? false : true);
        this.f17905a = str;
        this.f17906b = str2;
        this.f17907c = str3;
        this.f17908d = z11;
        this.f17909e = str4;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String D1() {
        return "phone";
    }

    public final Object clone() {
        boolean z11 = this.f17908d;
        return new PhoneAuthCredential(this.f17905a, this.f17906b, this.f17907c, this.f17909e, z11);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, this.f17905a, false);
        SafeParcelWriter.k(parcel, 2, this.f17906b, false);
        SafeParcelWriter.k(parcel, 4, this.f17907c, false);
        boolean z11 = this.f17908d;
        SafeParcelWriter.p(parcel, 5, 4);
        parcel.writeInt(z11 ? 1 : 0);
        SafeParcelWriter.k(parcel, 6, this.f17909e, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
