package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.p002firebaseauthapi.zzaij;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzc extends OAuthCredential {
    public static final Parcelable.Creator<zzc> CREATOR = new zze();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzaij f18072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f18074f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f18075t;

    public zzc(String str, String str2, String str3, zzaij zzaijVar, String str4, String str5, String str6) {
        this.f18069a = com.google.android.gms.internal.p002firebaseauthapi.zzac.c(str);
        this.f18070b = str2;
        this.f18071c = str3;
        this.f18072d = zzaijVar;
        this.f18073e = str4;
        this.f18074f = str5;
        this.f18075t = str6;
    }

    public static zzc F1(zzaij zzaijVar) {
        Preconditions.h(zzaijVar, "Must specify a non-null webSignInCredential");
        return new zzc(null, null, null, zzaijVar, null, null, null);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String D1() {
        return this.f18069a;
    }

    public final AuthCredential E1() {
        return new zzc(this.f18069a, this.f18070b, this.f18071c, this.f18072d, this.f18073e, this.f18074f, this.f18075t);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, this.f18069a, false);
        SafeParcelWriter.k(parcel, 2, this.f18070b, false);
        SafeParcelWriter.k(parcel, 3, this.f18071c, false);
        SafeParcelWriter.j(parcel, 4, this.f18072d, i11, false);
        SafeParcelWriter.k(parcel, 5, this.f18073e, false);
        SafeParcelWriter.k(parcel, 6, this.f18074f, false);
        SafeParcelWriter.k(parcel, 7, this.f18075t, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
