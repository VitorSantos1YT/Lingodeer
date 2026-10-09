package com.google.android.gms.internal.fido;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdm extends zzdr {
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        zzdr zzdrVar = (zzdr) obj;
        int iA = zzdr.a((byte) 0);
        if (iA != zzdrVar.zza()) {
            return iA - zzdrVar.zza();
        }
        long jAbs = Math.abs(0L);
        long jAbs2 = Math.abs(0L);
        if (jAbs < jAbs2) {
            return -1;
        }
        return jAbs > jAbs2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzdm.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzdr.a((byte) 0)), 0L});
    }

    public final String toString() {
        return Long.toString(0L);
    }

    @Override // com.google.android.gms.internal.fido.zzdr
    public final int zza() {
        return zzdr.a((byte) 0);
    }
}
