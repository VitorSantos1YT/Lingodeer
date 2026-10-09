package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f9310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f9311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f9312d;

    public zzq(long j11, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f9309a = j11;
        Preconditions.g(bArr);
        this.f9310b = bArr;
        Preconditions.g(bArr2);
        this.f9311c = bArr2;
        Preconditions.g(bArr3);
        this.f9312d = bArr3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq zzqVar = (zzq) obj;
        return this.f9309a == zzqVar.f9309a && Arrays.equals(this.f9310b, zzqVar.f9310b) && Arrays.equals(this.f9311c, zzqVar.f9311c) && Arrays.equals(this.f9312d, zzqVar.f9312d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f9309a), this.f9310b, this.f9311c, this.f9312d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 8);
        parcel.writeLong(this.f9309a);
        SafeParcelWriter.c(parcel, 2, this.f9310b, false);
        SafeParcelWriter.c(parcel, 3, this.f9311c, false);
        SafeParcelWriter.c(parcel, 4, this.f9312d, false);
        SafeParcelWriter.r(parcel, iQ);
    }
}
