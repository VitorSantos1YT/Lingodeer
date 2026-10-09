package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzjq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjq> CREATOR = new zzjr();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzjo f11648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11649d;

    public zzjq(String str, String str2, zzjo zzjoVar, boolean z11) {
        this.f11646a = str;
        this.f11647b = str2;
        this.f11648c = zzjoVar;
        this.f11649d = z11;
    }

    public final void D1(StringBuilder sb2) {
        sb2.append("FlagOverride(");
        sb2.append(this.f11646a);
        sb2.append(", ");
        sb2.append(this.f11647b);
        sb2.append(", ");
        this.f11648c.D1(sb2);
        sb2.append(", ");
        sb2.append(this.f11649d);
        sb2.append(")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjq)) {
            return false;
        }
        zzjq zzjqVar = (zzjq) obj;
        return zzkl.a(this.f11646a, zzjqVar.f11646a) && zzkl.a(this.f11647b, zzjqVar.f11647b) && zzkl.a(this.f11648c, zzjqVar.f11648c) && this.f11649d == zzjqVar.f11649d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        D1(sb2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.k(parcel, 2, this.f11646a, false);
        SafeParcelWriter.k(parcel, 3, this.f11647b, false);
        SafeParcelWriter.j(parcel, 4, this.f11648c, i11, false);
        SafeParcelWriter.p(parcel, 5, 4);
        parcel.writeInt(this.f11649d ? 1 : 0);
        SafeParcelWriter.r(parcel, iQ);
    }
}
