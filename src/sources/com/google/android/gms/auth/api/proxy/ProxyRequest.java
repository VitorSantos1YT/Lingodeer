package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ProxyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyRequest> CREATOR = new zza();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f8476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f8478f;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Builder {
    }

    public ProxyRequest(int i11, String str, int i12, long j11, byte[] bArr, Bundle bundle) {
        this.f8477e = i11;
        this.f8473a = str;
        this.f8474b = i12;
        this.f8475c = j11;
        this.f8476d = bArr;
        this.f8478f = bundle;
    }

    public final String toString() {
        return "ProxyRequest[ url: " + this.f8473a + ", method: " + this.f8474b + " ]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, this.f8473a, false);
        SafeParcelWriter.p(parcel, 2, 4);
        parcel.writeInt(this.f8474b);
        SafeParcelWriter.p(parcel, 3, 8);
        parcel.writeLong(this.f8475c);
        SafeParcelWriter.c(parcel, 4, this.f8476d, false);
        SafeParcelWriter.b(parcel, 5, this.f8478f);
        SafeParcelWriter.p(parcel, 1000, 4);
        parcel.writeInt(this.f8477e);
        SafeParcelWriter.r(parcel, iQ);
    }
}
