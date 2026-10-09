package com.google.android.gms.internal.measurement;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzzy extends zzaaa {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzzj f12232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzzj f12233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f12234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12235e;

    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    public zzzy(zzzj zzzjVar, zzzj zzzjVar2) {
        this.f12232b = zzzjVar;
        this.f12233c = zzzjVar2;
        int iA = zzzjVar2.a();
        if (!(iA <= 28)) {
            throw new IllegalArgumentException("metadata size too large");
        }
        int[] iArr = new int[iA];
        this.f12234d = iArr;
        long j11 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < iA) {
            zzyl zzylVarD = d(i11);
            long j12 = zzylVarD.f12183e | j11;
            if (j12 == j11) {
                int i13 = 0;
                while (true) {
                    if (i13 >= i12) {
                        i13 = -1;
                        break;
                    } else if (zzylVarD.equals(d(iArr[i13] & 31))) {
                        break;
                    } else {
                        i13++;
                    }
                }
                if (i13 != -1) {
                    iArr[i13] = zzylVarD.f12181c ? iArr[i13] | (1 << (i11 + 4)) : i11;
                } else {
                    iArr[i12] = i11;
                    i12++;
                }
            } else {
                iArr[i12] = i11;
                i12++;
            }
            i11++;
            j11 = j12;
        }
        this.f12235e = i12;
    }

    @Override // com.google.android.gms.internal.measurement.zzaaa
    public final void a(zzzq zzzqVar, zzzc zzzcVar) {
        for (int i11 = 0; i11 < this.f12235e; i11++) {
            int i12 = this.f12234d[i11];
            zzyl zzylVarD = d(i12 & 31);
            if (zzylVarD.f12181c) {
                zzzqVar.b(zzylVarD, new zzzx(this, zzylVarD, i12), zzzcVar);
            } else {
                zzzj zzzjVar = this.f12232b;
                int iA = zzzjVar.a();
                if (i12 >= iA) {
                    zzzjVar = this.f12233c;
                    i12 -= iA;
                }
                zzzqVar.a(zzylVarD, zzylVarD.f12180b.cast(zzzjVar.c(i12)), zzzcVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaaa
    public final int b() {
        return this.f12235e;
    }

    @Override // com.google.android.gms.internal.measurement.zzaaa
    public final Set c() {
        return new zzzw(this);
    }

    public final zzyl d(int i11) {
        zzzj zzzjVar = this.f12232b;
        int iA = zzzjVar.a();
        return i11 >= iA ? this.f12233c.b(i11 - iA) : zzzjVar.b(i11);
    }
}
