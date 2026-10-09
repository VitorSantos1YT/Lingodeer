package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzif implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f13123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzjd f13124b;

    public zzif(zzjd zzjdVar, zzr zzrVar) {
        this.f13123a = zzrVar;
        this.f13124b = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        zzjd zzjdVar = this.f13124b;
        zzjdVar.f13199a.W();
        zzpg zzpgVar = zzjdVar.f13199a;
        zzpgVar.e().g();
        zzpgVar.m0();
        zzr zzrVar = this.f13123a;
        Preconditions.g(zzrVar);
        String str = zzrVar.f13655a;
        Preconditions.d(str);
        int i11 = 0;
        if (zzpgVar.f0().r(null, zzfy.f12892y0)) {
            ((DefaultClock) zzpgVar.c()).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            int iP = zzpgVar.f0().p(null, zzfy.f12856h0);
            zzpgVar.f0();
            long jLongValue = jCurrentTimeMillis - ((Long) zzfy.f12848e.a(null)).longValue();
            while (i11 < iP && zzpgVar.I(jLongValue, null)) {
                i11++;
            }
        } else {
            zzpgVar.f0();
            long jIntValue = ((Integer) zzfy.f12866l.a(null)).intValue();
            while (i11 < jIntValue && zzpgVar.I(0L, str)) {
                i11++;
            }
        }
        if (zzpgVar.f0().r(null, zzfy.f12894z0)) {
            zzpgVar.e().g();
            zzpgVar.H();
        }
        zzou zzouVar = zzpgVar.f13604j;
        com.google.android.gms.internal.measurement.zzin zzinVarA = com.google.android.gms.internal.measurement.zzin.a(zzrVar.f13667g0);
        zzouVar.g();
        if (zzinVarA != com.google.android.gms.internal.measurement.zzin.CLIENT_UPLOAD_ELIGIBLE || zzou.j(str)) {
            return;
        }
        zzht zzhtVar = zzouVar.f13552b.f13595a;
        zzpg.U(zzhtVar);
        com.google.android.gms.internal.measurement.zzgl zzglVarS = zzhtVar.s(str);
        if (zzglVarS == null || !zzglVarS.M() || zzglVarS.N().z().isEmpty()) {
            return;
        }
        zzpgVar.b().f12949n.b(str, "[sgtm] Going background, trigger client side upload. appId");
        ((DefaultClock) zzpgVar.c()).getClass();
        zzpgVar.r(System.currentTimeMillis(), str);
    }
}
