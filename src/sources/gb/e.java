package gb;

import android.content.Context;
import android.content.SharedPreferences;
import fa.EQx.nuRcCS;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends aa.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28928c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f28929d;

    public e(Context context, int i11, int i12) {
        super(i11, i12);
        this.f28929d = context;
    }

    @Override // aa.a
    public final void a(ka.a db2) {
        switch (this.f28928c) {
            case 0:
                kotlin.jvm.internal.m.f(db2, "db");
                if (this.f523b >= 10) {
                    db2.d0(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    this.f28929d.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                kotlin.jvm.internal.m.f(db2, "db");
                db2.k("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                Context context = this.f28929d;
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                boolean zContains = sharedPreferences.contains("reschedule_needed");
                String str = nuRcCS.JAyXbgewcF;
                if (zContains || sharedPreferences.contains(str)) {
                    long j11 = sharedPreferences.getLong(str, 0L);
                    long j12 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    db2.j();
                    try {
                        db2.d0(new Object[]{str, Long.valueOf(j11)});
                        db2.d0(new Object[]{"reschedule_needed", Long.valueOf(j12)});
                        sharedPreferences.edit().clear().apply();
                        db2.o();
                        db2.r();
                    } catch (Throwable th2) {
                        db2.r();
                        throw th2;
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i11 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i12 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    db2.j();
                    try {
                        db2.d0(new Object[]{"next_job_scheduler_id", Integer.valueOf(i11)});
                        db2.d0(new Object[]{"next_alarm_manager_id", Integer.valueOf(i12)});
                        sharedPreferences2.edit().clear().apply();
                        db2.o();
                        return;
                    } finally {
                        db2.r();
                    }
                }
                return;
        }
    }

    public e(Context context) {
        super(9, 10);
        this.f28929d = context;
    }
}
