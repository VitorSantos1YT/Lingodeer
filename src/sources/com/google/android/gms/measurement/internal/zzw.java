package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.zzaif;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzw extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzic f13673a;

    public zzw(zzic zzicVar) {
        this.f13673a = zzicVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final zzic zzicVar = this.f13673a;
        if (intent == null) {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12945i.a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            zzgu zzguVar2 = zzicVar.f13099f;
            zzic.m(zzguVar2);
            zzguVar2.f12945i.a("App receiver called with null action");
            return;
        }
        int iHashCode = action.hashCode();
        if (iHashCode != -1928239649) {
            if (iHashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                zzgu zzguVar3 = zzicVar.f13099f;
                zzic.m(zzguVar3);
                zzguVar3.f12949n.a("[sgtm] App Receiver notified batches are available");
                zzhz zzhzVar = zzicVar.f13100g;
                zzic.m(zzhzVar);
                zzhzVar.p(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzt
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzic zzicVar2 = this.f13670a.f13673a;
                        zzic.j(zzicVar2.f13113u);
                        zzicVar2.f13113u.k(((Long) zzfy.D.a(null)).longValue());
                    }
                });
                return;
            }
        } else if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            zzaif.a();
            if (zzicVar.f13097d.r(null, zzfy.P0)) {
                zzgu zzguVar4 = zzicVar.f13099f;
                zzic.m(zzguVar4);
                zzguVar4.f12949n.a("App receiver notified triggers are available");
                zzhz zzhzVar2 = zzicVar.f13100g;
                zzic.m(zzhzVar2);
                zzhzVar2.p(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzu
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzic zzicVar2 = zzicVar;
                        zzpp zzppVar = zzicVar2.f13102i;
                        final zzlj zzljVar = zzicVar2.m;
                        zzic.k(zzppVar);
                        zzppVar.g();
                        if (zzppVar.E() != 1) {
                            zzgu zzguVar5 = zzicVar2.f13099f;
                            zzic.m(zzguVar5);
                            zzguVar5.f12945i.a("registerTrigger called but app not eligible");
                            return;
                        }
                        zzic.l(zzljVar);
                        zzljVar.g();
                        zzju zzjuVar = zzljVar.f13333l;
                        if (zzjuVar != null) {
                            zzjuVar.c();
                        }
                        zzic.l(zzljVar);
                        new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzv
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzljVar.J();
                            }
                        }).start();
                    }
                });
                return;
            }
            return;
        }
        zzgu zzguVar5 = zzicVar.f13099f;
        zzic.m(zzguVar5);
        zzguVar5.f12945i.a("App receiver called with unknown action");
    }
}
