package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import y.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f12672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzd f12673c;

    public zzb(zzd zzdVar, String str, long j11) {
        this.f12671a = str;
        this.f12672b = j11;
        this.f12673c = zzdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzd zzdVar = this.f12673c;
        zzic zzicVar = zzdVar.f13202a;
        zzdVar.g();
        String str = this.f12671a;
        Preconditions.d(str);
        e eVar = zzdVar.f12752c;
        Integer num = (Integer) eVar.get(str);
        if (num == null) {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12942f.b(str, "Call to endAdUnitExposure for unknown ad unit id");
            return;
        }
        zzmb zzmbVar = zzicVar.f13105l;
        zzgu zzguVar2 = zzicVar.f13099f;
        zzic.l(zzmbVar);
        zzlu zzluVarK = zzmbVar.k(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            eVar.put(str, Integer.valueOf(iIntValue));
            return;
        }
        eVar.remove(str);
        e eVar2 = zzdVar.f12751b;
        Long l9 = (Long) eVar2.get(str);
        long j11 = this.f12672b;
        if (l9 == null) {
            zzic.m(zzguVar2);
            zzguVar2.f12942f.a("First ad unit exposure time was never set");
        } else {
            long jLongValue = j11 - l9.longValue();
            eVar2.remove(str);
            zzdVar.l(str, jLongValue, zzluVarK);
        }
        if (eVar.isEmpty()) {
            long j12 = zzdVar.f12753d;
            if (j12 == 0) {
                zzic.m(zzguVar2);
                zzguVar2.f12942f.a("First ad exposure time was never set");
            } else {
                zzdVar.k(j11 - j12, zzluVarK);
                zzdVar.f12753d = 0L;
            }
        }
    }
}
