package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;
import y.b;
import y.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzd extends zzf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f12751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f12752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f12753d;

    public zzd(zzic zzicVar) {
        super(zzicVar);
        this.f12752c = new e(0);
        this.f12751b = new e(0);
    }

    public final void h(long j11, String str) {
        zzic zzicVar = this.f13202a;
        if (str == null || str.length() == 0) {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12942f.a("Ad unit id must be a non-empty string");
        } else {
            zzhz zzhzVar = zzicVar.f13100g;
            zzic.m(zzhzVar);
            zzhzVar.p(new zza(this, str, j11));
        }
    }

    public final void i(long j11, String str) {
        zzic zzicVar = this.f13202a;
        if (str == null || str.length() == 0) {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12942f.a("Ad unit id must be a non-empty string");
        } else {
            zzhz zzhzVar = zzicVar.f13100g;
            zzic.m(zzhzVar);
            zzhzVar.p(new zzb(this, str, j11));
        }
    }

    public final void j(long j11) {
        zzmb zzmbVar = this.f13202a.f13105l;
        zzic.l(zzmbVar);
        zzlu zzluVarK = zzmbVar.k(false);
        e eVar = this.f12751b;
        for (String str : (b) eVar.keySet()) {
            l(str, j11 - ((Long) eVar.get(str)).longValue(), zzluVarK);
        }
        if (!eVar.isEmpty()) {
            k(j11 - this.f12753d, zzluVarK);
        }
        m(j11);
    }

    public final void k(long j11, zzlu zzluVar) {
        zzic zzicVar = this.f13202a;
        if (zzluVar == null) {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12949n.a("Not logging ad exposure. No active activity");
        } else if (j11 < 1000) {
            zzgu zzguVar2 = zzicVar.f13099f;
            zzic.m(zzguVar2);
            zzguVar2.f12949n.b(Long.valueOf(j11), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j11);
            zzpp.d0(zzluVar, bundle, true);
            zzlj zzljVar = zzicVar.m;
            zzic.l(zzljVar);
            zzljVar.n("am", "_xa", bundle);
        }
    }

    public final void l(String str, long j11, zzlu zzluVar) {
        zzic zzicVar = this.f13202a;
        if (zzluVar == null) {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12949n.a("Not logging ad unit exposure. No active activity");
        } else {
            if (j11 < 1000) {
                zzgu zzguVar2 = zzicVar.f13099f;
                zzic.m(zzguVar2);
                zzguVar2.f12949n.b(Long.valueOf(j11), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j11);
            zzpp.d0(zzluVar, bundle, true);
            zzlj zzljVar = zzicVar.m;
            zzic.l(zzljVar);
            zzljVar.n("am", "_xu", bundle);
        }
    }

    public final void m(long j11) {
        e eVar = this.f12751b;
        Iterator it = ((b) eVar.keySet()).iterator();
        while (it.hasNext()) {
            eVar.put((String) it.next(), Long.valueOf(j11));
        }
        if (eVar.isEmpty()) {
            return;
        }
        this.f12753d = j11;
    }
}
