package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
import com.pairip.VMRunner;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzhb extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzpg f12993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12995c;

    public zzhb(zzpg zzpgVar) {
        Preconditions.g(zzpgVar);
        this.f12993a = zzpgVar;
    }

    public final void a() {
        zzpg zzpgVar = this.f12993a;
        zzpgVar.m0();
        zzpgVar.e().g();
        zzpgVar.e().g();
        if (this.f12994b) {
            zzpgVar.b().f12949n.a("Unregistering connectivity change receiver");
            this.f12994b = false;
            this.f12995c = false;
            try {
                zzpgVar.f13606l.f13094a.unregisterReceiver(this);
            } catch (IllegalArgumentException e8) {
                zzpgVar.b().f12942f.b(e8, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("ClB8nWl9pEyPUuGa", new Object[]{this, context, intent});
    }
}
