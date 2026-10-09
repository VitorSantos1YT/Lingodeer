package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import nv.p;
import y.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzs extends zzbz {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final e f8365t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f8367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f8368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f8369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f8370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f8371f;

    static {
        e eVar = new e(0);
        f8365t = eVar;
        eVar.put("registered", FastJsonResponse.Field.D1(2, "registered"));
        eVar.put("in_progress", FastJsonResponse.Field.D1(3, "in_progress"));
        eVar.put("success", FastJsonResponse.Field.D1(4, "success"));
        eVar.put("failed", FastJsonResponse.Field.D1(5, "failed"));
        eVar.put("escrowed", FastJsonResponse.Field.D1(6, "escrowed"));
    }

    public zzs() {
        this.f8366a = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map a() {
        return f8365t;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object b(FastJsonResponse.Field field) {
        switch (field.f9089t) {
            case 1:
                return Integer.valueOf(this.f8366a);
            case 2:
                return this.f8367b;
            case 3:
                return this.f8368c;
            case 4:
                return this.f8369d;
            case 5:
                return this.f8370e;
            case 6:
                return this.f8371f;
            default:
                throw new IllegalStateException(p.j(field.f9089t, "Unknown SafeParcelable id="));
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean d(FastJsonResponse.Field field) {
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f8366a);
        SafeParcelWriter.m(parcel, 2, this.f8367b);
        SafeParcelWriter.m(parcel, 3, this.f8368c);
        SafeParcelWriter.m(parcel, 4, this.f8369d);
        SafeParcelWriter.m(parcel, 5, this.f8370e);
        SafeParcelWriter.m(parcel, 6, this.f8371f);
        SafeParcelWriter.r(parcel, iQ);
    }

    public zzs(int i11, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        this.f8366a = i11;
        this.f8367b = arrayList;
        this.f8368c = arrayList2;
        this.f8369d = arrayList3;
        this.f8370e = arrayList4;
        this.f8371f = arrayList5;
    }
}
