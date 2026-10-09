package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import nv.p;
import y.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzw extends zzbz {
    public static final Parcelable.Creator<zzw> CREATOR = new zzx();
    public static final HashMap H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f8379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f8383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PendingIntent f8384f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final DeviceMetaData f8385t;

    static {
        HashMap map = new HashMap();
        H = map;
        map.put("accountType", new FastJsonResponse.Field(7, false, 7, false, "accountType", 2, null));
        map.put("status", new FastJsonResponse.Field(0, false, 0, false, "status", 3, null));
        map.put("transferBytes", new FastJsonResponse.Field(8, false, 8, false, "transferBytes", 4, null));
    }

    public zzw() {
        this.f8379a = new f(3);
        this.f8380b = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map a() {
        return H;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object b(FastJsonResponse.Field field) {
        int i11 = field.f9089t;
        if (i11 == 1) {
            return Integer.valueOf(this.f8380b);
        }
        if (i11 == 2) {
            return this.f8381c;
        }
        if (i11 == 3) {
            return Integer.valueOf(this.f8382d);
        }
        if (i11 == 4) {
            return this.f8383e;
        }
        throw new IllegalStateException(p.j(field.f9089t, "Unknown SafeParcelable id="));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean d(FastJsonResponse.Field field) {
        return this.f8379a.contains(Integer.valueOf(field.f9089t));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        Set set = this.f8379a;
        if (set.contains(1)) {
            SafeParcelWriter.p(parcel, 1, 4);
            parcel.writeInt(this.f8380b);
        }
        if (set.contains(2)) {
            SafeParcelWriter.k(parcel, 2, this.f8381c, true);
        }
        if (set.contains(3)) {
            SafeParcelWriter.p(parcel, 3, 4);
            parcel.writeInt(this.f8382d);
        }
        if (set.contains(4)) {
            SafeParcelWriter.c(parcel, 4, this.f8383e, true);
        }
        if (set.contains(5)) {
            SafeParcelWriter.j(parcel, 5, this.f8384f, i11, true);
        }
        if (set.contains(6)) {
            SafeParcelWriter.j(parcel, 6, this.f8385t, i11, true);
        }
        SafeParcelWriter.r(parcel, iQ);
    }

    public zzw(HashSet hashSet, int i11, String str, int i12, byte[] bArr, PendingIntent pendingIntent, DeviceMetaData deviceMetaData) {
        this.f8379a = hashSet;
        this.f8380b = i11;
        this.f8381c = str;
        this.f8382d = i12;
        this.f8383e = bArr;
        this.f8384f = pendingIntent;
        this.f8385t = deviceMetaData;
    }
}
