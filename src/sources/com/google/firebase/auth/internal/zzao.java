package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.MultiFactorSession;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzao extends MultiFactorSession {
    public static final Parcelable.Creator<zzao> CREATOR = new zzan();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f17949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f17950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f17951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f17952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zzad f17953e;

    public static zzao D1(ArrayList arrayList, String str) {
        Preconditions.d(str);
        zzao zzaoVar = new zzao();
        zzaoVar.f17951c = new ArrayList();
        zzaoVar.f17952d = new ArrayList();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            MultiFactorInfo multiFactorInfo = (MultiFactorInfo) obj;
            if (multiFactorInfo instanceof PhoneMultiFactorInfo) {
                zzaoVar.f17951c.add((PhoneMultiFactorInfo) multiFactorInfo);
            } else {
                if (!(multiFactorInfo instanceof TotpMultiFactorInfo)) {
                    throw new IllegalArgumentException("MultiFactorInfo must be either PhoneMultiFactorInfo or TotpMultiFactorInfo. The factorId of this MultiFactorInfo: ".concat(multiFactorInfo.D1()));
                }
                zzaoVar.f17952d.add((TotpMultiFactorInfo) multiFactorInfo);
            }
        }
        zzaoVar.f17950b = str;
        return zzaoVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 1, this.f17949a, false);
        SafeParcelWriter.k(parcel, 2, this.f17950b, false);
        SafeParcelWriter.o(parcel, 3, this.f17951c, false);
        SafeParcelWriter.o(parcel, 4, this.f17952d, false);
        SafeParcelWriter.j(parcel, 5, this.f17953e, i11, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
