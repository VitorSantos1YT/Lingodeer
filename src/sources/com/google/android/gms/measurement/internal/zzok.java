package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzok extends zzos {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AlarmManager f13549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zzoj f13550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f13551f;

    public zzok(zzpg zzpgVar) {
        super(zzpgVar);
        this.f13549d = (AlarmManager) this.f13202a.f13094a.getSystemService("alarm");
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    public final void j() {
        AlarmManager alarmManager = this.f13549d;
        if (alarmManager != null) {
            Context context = this.f13202a.f13094a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.zzce.f11490a));
        }
        m();
    }

    public final zzaz k() {
        if (this.f13550e == null) {
            this.f13550e = new zzoj(this, this.f13552b.f13606l);
        }
        return this.f13550e;
    }

    public final void l() {
        h();
        zzic zzicVar = this.f13202a;
        zzgu zzguVar = zzicVar.f13099f;
        zzic.m(zzguVar);
        zzguVar.f12949n.a("Unscheduling upload");
        AlarmManager alarmManager = this.f13549d;
        if (alarmManager != null) {
            Context context = zzicVar.f13094a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.zzce.f11490a));
        }
        k().c();
        m();
    }

    public final void m() {
        JobScheduler jobScheduler = (JobScheduler) this.f13202a.f13094a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(n());
        }
    }

    public final int n() {
        if (this.f13551f == null) {
            this.f13551f = Integer.valueOf("measurement".concat(String.valueOf(this.f13202a.f13094a.getPackageName())).hashCode());
        }
        return this.f13551f.intValue();
    }
}
