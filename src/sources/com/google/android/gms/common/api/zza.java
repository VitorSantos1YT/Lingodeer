package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zza implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zza f8865a;

    static {
        new zzb();
        f8865a = new zza();
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        if (parcel.readInt() == -204102970) {
            return zzb.a(parcel);
        }
        parcel.setDataPosition(iDataPosition - 4);
        return ApiMetadata.f8665d;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i11) {
        return new ApiMetadata[i11];
    }
}
