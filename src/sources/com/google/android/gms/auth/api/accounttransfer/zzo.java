package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzo extends zzbz {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap f8359f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f8360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f8362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzs f8364e;

    static {
        HashMap map = new HashMap();
        f8359f = map;
        map.put("authenticatorData", new FastJsonResponse.Field(11, true, 11, true, "authenticatorData", 2, zzu.class));
        map.put("progress", new FastJsonResponse.Field(11, false, 11, false, "progress", 4, zzs.class));
    }

    public zzo() {
        this.f8360a = new HashSet(1);
        this.f8361b = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map a() {
        return f8359f;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object b(FastJsonResponse.Field field) {
        int i11 = field.f9089t;
        if (i11 == 1) {
            return Integer.valueOf(this.f8361b);
        }
        if (i11 == 2) {
            return this.f8362c;
        }
        if (i11 == 4) {
            return this.f8364e;
        }
        throw new IllegalStateException(p.j(field.f9089t, "Unknown SafeParcelable id="));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean d(FastJsonResponse.Field field) {
        return this.f8360a.contains(Integer.valueOf(field.f9089t));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        HashSet hashSet = this.f8360a;
        if (hashSet.contains(1)) {
            SafeParcelWriter.p(parcel, 1, 4);
            parcel.writeInt(this.f8361b);
        }
        if (hashSet.contains(2)) {
            SafeParcelWriter.o(parcel, 2, this.f8362c, true);
        }
        if (hashSet.contains(3)) {
            SafeParcelWriter.p(parcel, 3, 4);
            parcel.writeInt(this.f8363d);
        }
        if (hashSet.contains(4)) {
            SafeParcelWriter.j(parcel, 4, this.f8364e, i11, true);
        }
        SafeParcelWriter.r(parcel, iQ);
    }

    public zzo(HashSet hashSet, int i11, ArrayList arrayList, int i12, zzs zzsVar) {
        this.f8360a = hashSet;
        this.f8361b = i11;
        this.f8362c = arrayList;
        this.f8363d = i12;
        this.f8364e = zzsVar;
    }
}
