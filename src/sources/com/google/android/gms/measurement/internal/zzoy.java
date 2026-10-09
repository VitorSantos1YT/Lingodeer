package com.google.android.gms.measurement.internal;

import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.common.util.DefaultClock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzoy extends zzaz {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzpg f13574e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzoy(zzpg zzpgVar, zzjg zzjgVar) {
        super(zzjgVar);
        this.f13574e = zzpgVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzaz
    public final void a() {
        zzpg zzpgVar = this.f13574e;
        zzpgVar.e().g();
        String str = (String) zzpgVar.f13610q.pollFirst();
        if (str != null) {
            ((DefaultClock) zzpgVar.c()).getClass();
            zzpgVar.I = SystemClock.elapsedRealtime();
            zzpgVar.b().f12949n.b(str, "Sending trigger URI notification to app");
            Intent intent = new Intent();
            intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intent.setPackage(str);
            zzpg.S(zzpgVar.f13606l.f13094a, intent);
        }
        zzpgVar.H();
    }
}
