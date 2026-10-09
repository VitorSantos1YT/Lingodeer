package com.google.android.recaptcha.internal;

import defpackage.e;
import nv.p;
import oz.q;
import qx.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbj implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        String strO0 = q.O0(10, String.valueOf(this.zzb / ((long) this.zza)));
        String strO1 = q.O0(10, String.valueOf(this.zzc));
        return p.u(e.s("avgExecutionTime: ", strO0, " us| maxExecutionTime: ", strO1, " us| totalTime: "), q.O0(10, String.valueOf(this.zzb)), " us| #Usages: ", q.O0(5, String.valueOf(this.zza)));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzbj zzbjVar) {
        return b.i(Long.valueOf(this.zzb), Long.valueOf(zzbjVar.zzb));
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j11) {
        this.zzc = j11;
    }

    public final void zzf(long j11) {
        this.zzb = j11;
    }

    public final void zzg(int i11) {
        this.zza = i11;
    }
}
