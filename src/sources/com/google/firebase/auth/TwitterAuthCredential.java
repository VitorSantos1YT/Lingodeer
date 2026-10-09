package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class TwitterAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<TwitterAuthCredential> CREATOR = new zzav();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17921b;

    public TwitterAuthCredential(String str, String str2) {
        Preconditions.d(str);
        this.f17920a = str;
        Preconditions.d(str2);
        this.f17921b = str2;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String D1() {
        return "twitter.com";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, this.f17920a, false);
        SafeParcelWriter.k(parcel, 2, this.f17921b, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
