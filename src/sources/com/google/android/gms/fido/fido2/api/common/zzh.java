package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new zzi();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f9308b;

    public zzh(boolean z11, byte[] bArr) {
        this.f9307a = z11;
        this.f9308b = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        return this.f9307a == zzhVar.f9307a && Arrays.equals(this.f9308b, zzhVar.f9308b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f9307a), this.f9308b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f9307a ? 1 : 0);
        SafeParcelWriter.c(parcel, 2, this.f9308b, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
