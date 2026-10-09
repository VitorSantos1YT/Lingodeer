package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.material.datepicker.d;
import com.google.common.base.Supplier;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzlc extends zzlt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Supplier f11687b;

    public zzlc(Context context, Supplier supplier) {
        this.f11686a = context;
        this.f11687b = supplier;
    }

    @Override // com.google.android.gms.internal.measurement.zzlt
    public final Context a() {
        return this.f11686a;
    }

    @Override // com.google.android.gms.internal.measurement.zzlt
    public final Supplier b() {
        return this.f11687b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzlt)) {
            return false;
        }
        zzlt zzltVar = (zzlt) obj;
        if (!this.f11686a.equals(zzltVar.a())) {
            return false;
        }
        Supplier supplier = this.f11687b;
        if (supplier == null) {
            return zzltVar.b() == null;
        }
        return supplier.equals(zzltVar.b());
    }

    public final int hashCode() {
        int iHashCode = this.f11686a.hashCode() ^ 1000003;
        Supplier supplier = this.f11687b;
        return (iHashCode * 1000003) ^ (supplier == null ? 0 : supplier.hashCode());
    }

    public final String toString() {
        String string = this.f11686a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.f11687b);
        StringBuilder sb2 = new StringBuilder(length + 45 + strValueOf.length() + 1);
        d.w(sb2, "FlagsContext{context=", string, ", hermeticFileOverrides=", strValueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
