package com.google.android.gms.measurement.internal;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zznt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Service f13517a;

    public zznt(Service service) {
        this.f13517a = service;
    }

    public final void a(final Intent intent, final int i11) {
        if (intent == null) {
            return;
        }
        Service service = this.f13517a;
        final zzgu zzguVar = zzic.s(service, null, null, null).f13099f;
        zzic.m(zzguVar);
        String action = intent.getAction();
        zzguVar.f12949n.c(Integer.valueOf(i11), action, "Local AppMeasurementService called. startId, action");
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.measurement.internal.zzns
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    Service service2 = this.f13513a.f13517a;
                    zznp zznpVar = (zznp) service2;
                    int i12 = i11;
                    if (zznpVar.zza(i12)) {
                        zzguVar.f12949n.b(Integer.valueOf(i12), "Local AppMeasurementService processed last upload request. StartId");
                        zzgu zzguVar2 = zzic.s(service2, null, null, null).f13099f;
                        zzic.m(zzguVar2);
                        zzguVar2.f12949n.a("Completed wakeful intent.");
                        zznpVar.a(intent);
                    }
                }
            };
            zzpg zzpgVarC = zzpg.C(service);
            zzpgVarC.e().p(new zzno(this, zzpgVarC, runnable));
        }
    }

    public final void b(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("action");
        "onStartJob received action: ".concat(String.valueOf(string));
        boolean zEquals = Objects.equals(string, "com.google.android.gms.measurement.UPLOAD");
        Service service = this.f13517a;
        if (zEquals) {
            Preconditions.g(string);
            zzpg zzpgVarC = zzpg.C(service);
            final zzgu zzguVarB = zzpgVarC.b();
            zzae zzaeVar = zzpgVarC.f13606l.f13096c;
            zzguVarB.f12949n.b(string, "Local AppMeasurementJobService called. action");
            zzpgVarC.e().p(new zzno(this, zzpgVarC, new Runnable() { // from class: com.google.android.gms.measurement.internal.zznq
                @Override // java.lang.Runnable
                public final void run() {
                    zznt zzntVar = this.f13508a;
                    zzntVar.getClass();
                    zzguVarB.f12949n.a("AppMeasurementJobService processed last upload request.");
                    ((zznp) zzntVar.f13517a).b(jobParameters);
                }
            }));
        }
        if (Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            Preconditions.g(string);
            com.google.android.gms.internal.measurement.zzez.i(service, null).t(new Runnable() { // from class: com.google.android.gms.measurement.internal.zznr
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    ((zznp) this.f13511a.f13517a).b(jobParameters);
                }
            });
        }
    }
}
