package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzju extends AbstractSafeParcelable implements Comparable<zzju> {
    public static final Parcelable.Creator<zzju> CREATOR = new zzjv();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11652b;

    public zzju(int i11, int i12) {
        this.f11651a = i11;
        this.f11652b = i12;
    }

    @Override // java.lang.Comparable
    public final int compareTo(zzju zzjuVar) {
        zzju zzjuVar2 = zzjuVar;
        int i11 = zzjuVar2.f11651a;
        int i12 = this.f11651a;
        if (i12 < i11) {
            return -1;
        }
        if (i12 > i11) {
            return 1;
        }
        int i13 = zzjuVar2.f11652b;
        int i14 = this.f11652b;
        if (i14 < i13) {
            return -1;
        }
        return i14 > i13 ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0004, code lost:
    
        r0 = (r3 = (com.google.android.gms.internal.measurement.zzju) r3).f11651a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0010, code lost:
    
        r3 = r3.f11652b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.zzju
            if (r0 == 0) goto L1c
            com.google.android.gms.internal.measurement.zzju r3 = (com.google.android.gms.internal.measurement.zzju) r3
            int r0 = r3.f11651a
            int r1 = r2.f11651a
            if (r1 >= r0) goto Ld
            goto L1c
        Ld:
            if (r1 <= r0) goto L10
            goto L1c
        L10:
            int r3 = r3.f11652b
            int r0 = r2.f11652b
            if (r0 >= r3) goto L17
            goto L1c
        L17:
            if (r0 <= r3) goto L1a
            goto L1c
        L1a:
            r3 = 1
            return r3
        L1c:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzju.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return (this.f11651a * 31) + this.f11652b;
    }

    public final String toString() {
        int i11 = this.f11651a;
        int length = String.valueOf(i11).length();
        int i12 = this.f11652b;
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(i12).length() + 1);
        c.t(i11, i12, "GenericDimension(", ", ", sb2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iQ = SafeParcelWriter.q(parcel, 20293);
        SafeParcelWriter.p(parcel, 1, 4);
        parcel.writeInt(this.f11651a);
        SafeParcelWriter.p(parcel, 2, 4);
        parcel.writeInt(this.f11652b);
        SafeParcelWriter.r(parcel, iQ);
    }
}
