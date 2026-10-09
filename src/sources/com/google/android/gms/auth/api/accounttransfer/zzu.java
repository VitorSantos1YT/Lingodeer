package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzu extends zzbz {
    public static final Parcelable.Creator<zzu> CREATOR = new zzv();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final HashMap f8372t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f8373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzw f8375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f8377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f8378f;

    static {
        HashMap map = new HashMap();
        f8372t = map;
        map.put("authenticatorInfo", new FastJsonResponse.Field(11, false, 11, false, "authenticatorInfo", 2, zzw.class));
        map.put("signature", new FastJsonResponse.Field(7, false, 7, false, "signature", 3, null));
        map.put("package", new FastJsonResponse.Field(7, false, 7, false, "package", 4, null));
    }

    public zzu() {
        this.f8373a = new HashSet(3);
        this.f8374b = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map a() {
        return f8372t;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object b(FastJsonResponse.Field field) {
        int i11 = field.f9089t;
        if (i11 == 1) {
            return Integer.valueOf(this.f8374b);
        }
        if (i11 == 2) {
            return this.f8375c;
        }
        if (i11 == 3) {
            return this.f8376d;
        }
        if (i11 == 4) {
            return this.f8377e;
        }
        throw new IllegalStateException(p.j(field.f9089t, "Unknown SafeParcelable id="));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean d(FastJsonResponse.Field field) {
        return this.f8373a.contains(Integer.valueOf(field.f9089t));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        HashSet hashSet = this.f8373a;
        if (hashSet.contains(1)) {
            SafeParcelWriter.p(parcel, 1, 4);
            parcel.writeInt(this.f8374b);
        }
        if (hashSet.contains(2)) {
            SafeParcelWriter.j(parcel, 2, this.f8375c, i11, true);
        }
        if (hashSet.contains(3)) {
            SafeParcelWriter.k(parcel, 3, this.f8376d, true);
        }
        if (hashSet.contains(4)) {
            SafeParcelWriter.k(parcel, 4, this.f8377e, true);
        }
        if (hashSet.contains(5)) {
            SafeParcelWriter.k(parcel, 5, this.f8378f, true);
        }
        SafeParcelWriter.r(parcel, iQ);
    }

    public zzu(HashSet hashSet, int i11, zzw zzwVar, String str, String str2, String str3) {
        this.f8373a = hashSet;
        this.f8374b = i11;
        this.f8375c = zzwVar;
        this.f8376d = str;
        this.f8377e = str2;
        this.f8378f = str3;
    }
}
