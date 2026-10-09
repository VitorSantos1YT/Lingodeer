package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import y.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zza implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f12600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzd f12601c;

    public zza(zzd zzdVar, String str, long j11) {
        this.f12599a = str;
        this.f12600b = j11;
        this.f12601c = zzdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzd zzdVar = this.f12601c;
        zzdVar.g();
        String str = this.f12599a;
        Preconditions.d(str);
        e eVar = zzdVar.f12752c;
        boolean zIsEmpty = eVar.isEmpty();
        long j11 = this.f12600b;
        if (zIsEmpty) {
            zzdVar.f12753d = j11;
        }
        Integer num = (Integer) eVar.get(str);
        if (num != null) {
            eVar.put(str, Integer.valueOf(num.intValue() + 1));
            return;
        }
        if (eVar.f56767c < 100) {
            eVar.put(str, 1);
            zzdVar.f12751b.put(str, Long.valueOf(j11));
        } else {
            zzgu zzguVar = zzdVar.f13202a.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12945i.a("Too many ads visible");
        }
    }
}
