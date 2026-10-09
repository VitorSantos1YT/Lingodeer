package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ActionCodeSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActionCodeSettings> CREATOR = new zzb();
    public final String H;
    public final int K;
    public final String L;
    public final String M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f17867f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f17868t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Builder {
        private Builder() {
        }
    }

    public ActionCodeSettings(String str, String str2, String str3, String str4, boolean z11, String str5, boolean z12, String str6, int i11, String str7, String str8) {
        this.f17862a = str;
        this.f17863b = str2;
        this.f17864c = str3;
        this.f17865d = str4;
        this.f17866e = z11;
        this.f17867f = str5;
        this.f17868t = z12;
        this.H = str6;
        this.K = i11;
        this.L = str7;
        this.M = str8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, this.f17862a, false);
        SafeParcelWriter.k(parcel, 2, this.f17863b, false);
        SafeParcelWriter.k(parcel, 3, this.f17864c, false);
        SafeParcelWriter.k(parcel, 4, this.f17865d, false);
        SafeParcelWriter.p(parcel, 5, 4);
        parcel.writeInt(this.f17866e ? 1 : 0);
        SafeParcelWriter.k(parcel, 6, this.f17867f, false);
        SafeParcelWriter.p(parcel, 7, 4);
        parcel.writeInt(this.f17868t ? 1 : 0);
        SafeParcelWriter.k(parcel, 8, this.H, false);
        SafeParcelWriter.p(parcel, 9, 4);
        parcel.writeInt(this.K);
        SafeParcelWriter.k(parcel, 10, this.L, false);
        SafeParcelWriter.k(parcel, 11, this.M, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
