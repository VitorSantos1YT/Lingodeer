package com.google.android.gms.measurement.internal;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzlq extends zzg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JobScheduler f13354c;

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean j() {
        return true;
    }

    public final void k(long j11) {
        h();
        g();
        JobScheduler jobScheduler = this.f13354c;
        zzic zzicVar = this.f13202a;
        if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(zzicVar.f13094a.getPackageName())).hashCode()) != null) {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12949n.a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        com.google.android.gms.internal.measurement.zzin zzinVarL = l();
        if (zzinVarL != com.google.android.gms.internal.measurement.zzin.CLIENT_UPLOAD_ELIGIBLE) {
            zzgu zzguVar2 = zzicVar.f13099f;
            zzic.m(zzguVar2);
            zzguVar2.f12949n.b(zzinVarL.name(), "[sgtm] Not eligible for Scion upload");
            return;
        }
        zzgu zzguVar3 = zzicVar.f13099f;
        zzic.m(zzguVar3);
        zzguVar3.f12949n.b(Long.valueOf(j11), "[sgtm] Scheduling Scion upload, millis");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo jobInfoBuild = new JobInfo.Builder("measurement-client".concat(String.valueOf(zzicVar.f13094a.getPackageName())).hashCode(), new ComponentName(zzicVar.f13094a, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j11).setOverrideDeadline(j11 + j11).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.f13354c;
        Preconditions.g(jobScheduler2);
        int iSchedule = jobScheduler2.schedule(jobInfoBuild);
        zzgu zzguVar4 = zzicVar.f13099f;
        zzic.m(zzguVar4);
        zzguVar4.f12949n.b(iSchedule == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
    }

    public final com.google.android.gms.internal.measurement.zzin l() {
        h();
        g();
        if (this.f13354c == null) {
            return com.google.android.gms.internal.measurement.zzin.MISSING_JOB_SCHEDULER;
        }
        zzic zzicVar = this.f13202a;
        Boolean boolT = zzicVar.f13097d.t("google_analytics_sgtm_upload_enabled");
        if (!(boolT == null ? false : boolT.booleanValue())) {
            return com.google.android.gms.internal.measurement.zzin.NOT_ENABLED_IN_MANIFEST;
        }
        if (zzicVar.r().f12903j < 119000) {
            return com.google.android.gms.internal.measurement.zzin.SDK_TOO_OLD;
        }
        if (zzpp.B(zzicVar.f13094a)) {
            return !zzicVar.p().n() ? com.google.android.gms.internal.measurement.zzin.NON_PLAY_MODE : com.google.android.gms.internal.measurement.zzin.CLIENT_UPLOAD_ELIGIBLE;
        }
        return com.google.android.gms.internal.measurement.zzin.MEASUREMENT_SERVICE_NOT_ENABLED;
    }
}
