package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new zak();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FastJsonResponse.Field f9102c;

    public zam(int i11, String str, FastJsonResponse.Field field) {
        this.f9100a = i11;
        this.f9101b = str;
        this.f9102c = field;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f9100a);
        SafeParcelWriter.k(parcel, 2, this.f9101b, false);
        SafeParcelWriter.j(parcel, 3, this.f9102c, i11, false);
        SafeParcelWriter.r(parcel, iQ);
    }

    public zam(String str, FastJsonResponse.Field field) {
        this.f9100a = 1;
        this.f9101b = str;
        this.f9102c = field;
    }
}
