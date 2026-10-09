package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new zzg();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f9305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f9306b;

    public zzf(byte[] bArr, byte[] bArr2) {
        this.f9305a = bArr;
        this.f9306b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzf)) {
            return false;
        }
        zzf zzfVar = (zzf) obj;
        return Arrays.equals(this.f9305a, zzfVar.f9305a) && Arrays.equals(this.f9306b, zzfVar.f9306b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9305a, this.f9306b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.c(parcel, 1, this.f9305a, false);
        SafeParcelWriter.c(parcel, 2, this.f9306b, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
