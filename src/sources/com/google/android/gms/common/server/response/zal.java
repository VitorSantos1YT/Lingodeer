package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new zap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f9099c;

    public zal(int i11, String str, ArrayList arrayList) {
        this.f9097a = i11;
        this.f9098b = str;
        this.f9099c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f9097a);
        SafeParcelWriter.k(parcel, 2, this.f9098b, false);
        SafeParcelWriter.o(parcel, 3, this.f9099c, false);
        SafeParcelWriter.r(parcel, iQ);
    }

    public zal(String str, Map map) {
        ArrayList arrayList;
        this.f9097a = 1;
        this.f9098b = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new zam(str2, (FastJsonResponse.Field) map.get(str2)));
            }
        }
        this.f9099c = arrayList;
    }
}
