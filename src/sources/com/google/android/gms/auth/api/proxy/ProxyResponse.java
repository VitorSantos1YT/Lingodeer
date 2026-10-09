package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ProxyResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyResponse> CREATOR = new zzb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PendingIntent f8480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f8482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f8484f;

    public ProxyResponse(int i11, int i12, PendingIntent pendingIntent, int i13, Bundle bundle, byte[] bArr) {
        this.f8483e = i11;
        this.f8479a = i12;
        this.f8481c = i13;
        this.f8484f = bundle;
        this.f8482d = bArr;
        this.f8480b = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f8479a);
        SafeParcelWriter.j(parcel, 2, this.f8480b, i11, false);
        SafeParcelWriter.p(parcel, 3, 4);
        parcel.writeInt(this.f8481c);
        SafeParcelWriter.b(parcel, 4, this.f8484f);
        SafeParcelWriter.c(parcel, 5, this.f8482d, false);
        SafeParcelWriter.p(parcel, 1000, 4);
        parcel.writeInt(this.f8483e);
        SafeParcelWriter.r(parcel, iQ);
    }
}
