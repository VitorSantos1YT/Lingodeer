package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbf extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzbf> CREATOR = new zzbg();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f12701a;

    public zzbf(Bundle bundle) {
        this.f12701a = bundle;
    }

    public final Object D1(String str) {
        return this.f12701a.get(str);
    }

    public final Double E1() {
        return Double.valueOf(this.f12701a.getDouble("value"));
    }

    public final String F1() {
        return this.f12701a.getString("currency");
    }

    public final Bundle G1() {
        return new Bundle(this.f12701a);
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new zzbe(this);
    }

    public final String toString() {
        return this.f12701a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.b(parcel, 2, G1());
        SafeParcelWriter.r(parcel, iQ);
    }
}
