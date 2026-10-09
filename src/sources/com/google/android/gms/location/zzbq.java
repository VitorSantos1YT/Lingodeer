package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbq> CREATOR = new zzbr();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.location.zzbs f12575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PendingIntent f12576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12577c;

    public zzbq(ArrayList arrayList, PendingIntent pendingIntent, String str) {
        com.google.android.gms.internal.location.zzbs zzbsVarM;
        if (arrayList == null) {
            zzbsVarM = com.google.android.gms.internal.location.zzbs.l();
        } else {
            com.google.android.gms.internal.location.zzbv zzbvVar = com.google.android.gms.internal.location.zzbs.f11105b;
            Object[] array = arrayList.toArray();
            int length = array.length;
            for (int i11 = 0; i11 < length; i11++) {
                if (array[i11] == null) {
                    StringBuilder sb2 = new StringBuilder(20);
                    sb2.append("at index ");
                    sb2.append(i11);
                    throw new NullPointerException(sb2.toString());
                }
            }
            zzbsVarM = com.google.android.gms.internal.location.zzbs.m(length, array);
        }
        this.f12575a = zzbsVarM;
        this.f12576b = pendingIntent;
        this.f12577c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.m(parcel, 1, this.f12575a);
        SafeParcelWriter.j(parcel, 2, this.f12576b, i11, false);
        SafeParcelWriter.k(parcel, 3, this.f12577c, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
