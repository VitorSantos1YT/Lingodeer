package com.google.android.gms.internal.measurement;

import com.google.common.collect.ImmutableSortedSet;
import defpackage.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzmw {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzmw f11746b = new zzmw(ImmutableSortedSet.K());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableSortedSet f11747a;

    public zzmw(ImmutableSortedSet immutableSortedSet) {
        this.f11747a = immutableSortedSet;
    }

    public static zzmw a(zzacv zzacvVar) throws zzaeh {
        long j11;
        String strW;
        zzmv zzmvVar;
        int iG = zzacvVar.G();
        if (iG < 0) {
            throw new zzaeh("Negative number of flags");
        }
        ImmutableSortedSet.Builder builderH = ImmutableSortedSet.H();
        long j12 = 0;
        for (int i11 = 0; i11 < iG; i11++) {
            long jH = zzacvVar.H();
            int i12 = (int) jH;
            long j13 = jH >>> 3;
            if (j13 == 0) {
                j11 = 0;
                strW = zzacvVar.w();
            } else {
                long j14 = j13 + j12;
                if (j14 > 2305843009213693951L) {
                    throw new zzaeh("Flag name larger than max size");
                }
                j11 = j14;
                strW = null;
            }
            int i13 = i12 & 7;
            if (i13 == 0 || i13 == 1) {
                zzmvVar = new zzmv(j11, strW, i13, 0L, null);
            } else if (i13 == 2) {
                zzmvVar = new zzmv(j11, strW, i13, zzacvVar.H(), null);
            } else if (i13 == 3) {
                zzmvVar = new zzmv(j11, strW, i13, Double.doubleToRawLongBits(zzacvVar.o()), null);
            } else if (i13 == 4) {
                zzmvVar = new zzmv(j11, strW, i13, 0L, zzacvVar.w());
            } else {
                if (i13 != 5) {
                    throw new zzaeh(e.g(i13, "Unrecognized flag type ", new StringBuilder(String.valueOf(i13).length() + 23)));
                }
                zzmvVar = new zzmv(j11, strW, i13, 0L, zzacvVar.z());
            }
            long j15 = zzmvVar.f11740a;
            if (j15 != 0) {
                j12 = j15;
            }
            builderH.m(zzmvVar);
        }
        return new zzmw(builderH.k());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzmw)) {
            return false;
        }
        return this.f11747a.equals(((zzmw) obj).f11747a);
    }

    public final int hashCode() {
        return this.f11747a.hashCode();
    }
}
