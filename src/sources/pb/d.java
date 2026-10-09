package pb;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import cf.x;
import fb.e0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import w9.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f46731e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gb.p f46733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lp.b f46734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46735d = 0;

    static {
        fb.l.c("ForceStopRunnable");
        f46731e = TimeUnit.DAYS.toMillis(3650L);
    }

    public d(Context context, gb.p pVar) {
        this.f46732a = context.getApplicationContext();
        this.f46733b = pVar;
        this.f46734c = pVar.f28959g;
    }

    public static void b(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i11 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i11);
        long jCurrentTimeMillis = System.currentTimeMillis() + f46731e;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x020a  */
    public final void a() {
        boolean z11;
        lp.b bVar = this.f46734c;
        gb.p pVar = this.f46733b;
        WorkDatabase workDatabase = pVar.f28955c;
        fb.c cVar = pVar.f28954b;
        lp.b bVar2 = pVar.f28959g;
        WorkDatabase workDatabase2 = pVar.f28955c;
        int i11 = jb.d.f36289f;
        Context context = this.f46732a;
        JobScheduler jobSchedulerA = jb.a.a(context);
        ArrayList arrayListE = jb.d.e(context, jobSchedulerA);
        ob.i iVarB = workDatabase.B();
        iVarB.getClass();
        u uVarB = u.b(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) iVarB.f44813b;
        workDatabase_Impl.b();
        Cursor cursorF = x.F(workDatabase_Impl, uVarB, false);
        try {
            ArrayList arrayList = new ArrayList(cursorF.getCount());
            while (cursorF.moveToNext()) {
                arrayList.add(cursorF.getString(0));
            }
            cursorF.close();
            uVarB.release();
            HashSet hashSet = new HashSet(arrayListE != null ? arrayListE.size() : 0);
            if (arrayListE != null && !arrayListE.isEmpty()) {
                int size = arrayListE.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayListE.get(i12);
                    i12++;
                    JobInfo jobInfo = (JobInfo) obj;
                    ob.j jVarF = jb.d.f(jobInfo);
                    if (jVarF != null) {
                        hashSet.add(jVarF.f44817a);
                    } else {
                        jb.d.a(jobSchedulerA, jobInfo.getId());
                    }
                }
            }
            int size2 = arrayList.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size2) {
                    z11 = false;
                    break;
                }
                Object obj2 = arrayList.get(i13);
                i13++;
                if (!hashSet.contains((String) obj2)) {
                    fb.l.b().getClass();
                    z11 = true;
                    break;
                }
            }
            if (z11) {
                workDatabase.c();
                try {
                    ob.s sVarE = workDatabase.E();
                    int size3 = arrayList.size();
                    int i14 = 0;
                    while (i14 < size3) {
                        Object obj3 = arrayList.get(i14);
                        i14++;
                        sVarE.p(-1L, (String) obj3);
                    }
                    workDatabase.x();
                    workDatabase.s();
                } catch (Throwable th2) {
                    workDatabase.s();
                    throw th2;
                }
            }
            ob.s sVarE2 = workDatabase2.E();
            ob.m mVarD = workDatabase2.D();
            workDatabase2.c();
            try {
                ArrayList arrayListK = sVarE2.k();
                boolean zIsEmpty = arrayListK.isEmpty();
                if (!zIsEmpty) {
                    int size4 = arrayListK.size();
                    int i15 = 0;
                    while (i15 < size4) {
                        Object obj4 = arrayListK.get(i15);
                        i15++;
                        e0 e0Var = e0.ENQUEUED;
                        String str = ((ob.p) obj4).f44848a;
                        sVarE2.x(e0Var, str);
                        sVarE2.y(-512, str);
                        sVarE2.p(-1L, str);
                        z11 = z11;
                        arrayListK = arrayListK;
                    }
                }
                boolean z12 = z11;
                WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) mVarD.f44826b;
                workDatabase_Impl2.b();
                ob.h hVar = (ob.h) mVarD.f44828d;
                la.j jVarA = hVar.a();
                try {
                    workDatabase_Impl2.c();
                    try {
                        jVarA.a();
                        workDatabase_Impl2.x();
                        workDatabase_Impl2.s();
                        hVar.i(jVarA);
                        workDatabase2.x();
                        workDatabase2.s();
                        boolean z13 = !zIsEmpty || z12;
                        Long lJ = ((WorkDatabase) bVar2.f40184b).A().j("reschedule_needed");
                        if (lJ != null && lJ.longValue() == 1) {
                            fb.l.b().getClass();
                            pVar.H();
                            bVar2.getClass();
                            ((WorkDatabase) bVar2.f40184b).A().k(new ob.d("reschedule_needed", 0L));
                            return;
                        }
                        try {
                            int i16 = Build.VERSION.SDK_INT;
                            int i17 = i16 >= 31 ? 570425344 : 536870912;
                            Intent intent = new Intent();
                            intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                            intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                            PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i17);
                            if (i16 < 30) {
                                if (broadcast == null) {
                                    b(context);
                                    fb.l.b().getClass();
                                    pVar.H();
                                    cVar.f27049d.getClass();
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    bVar.getClass();
                                    ((WorkDatabase) bVar.f40184b).A().k(new ob.d("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis)));
                                    return;
                                }
                                if (z13) {
                                    fb.l.b().getClass();
                                    gb.h.b(cVar, workDatabase2, pVar.f28957e);
                                }
                            }
                            if (broadcast != null) {
                                broadcast.cancel();
                            }
                            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                            if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                                Long lJ2 = ((WorkDatabase) bVar.f40184b).A().j("last_force_stop_ms");
                                long jLongValue = lJ2 != null ? lJ2.longValue() : 0L;
                                for (int i18 = 0; i18 < historicalProcessExitReasons.size(); i18++) {
                                    ApplicationExitInfo applicationExitInfo = historicalProcessExitReasons.get(i18);
                                    if (applicationExitInfo.getReason() == 10 && applicationExitInfo.getTimestamp() >= jLongValue) {
                                        fb.l.b().getClass();
                                        pVar.H();
                                        cVar.f27049d.getClass();
                                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                                        bVar.getClass();
                                        ((WorkDatabase) bVar.f40184b).A().k(new ob.d("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis2)));
                                        return;
                                    }
                                }
                            }
                            if (z13) {
                                fb.l.b().getClass();
                                gb.h.b(cVar, workDatabase2, pVar.f28957e);
                            }
                        } catch (IllegalArgumentException | SecurityException unused) {
                            fb.l.b().getClass();
                        }
                    } catch (Throwable th3) {
                        workDatabase_Impl2.s();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    hVar.i(jVarA);
                    throw th4;
                }
            } catch (Throwable th5) {
                workDatabase2.s();
                throw th5;
            }
        } catch (Throwable th6) {
            cursorF.close();
            uVarB.release();
            throw th6;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zA;
        gb.p pVar = this.f46733b;
        try {
            fb.c cVar = pVar.f28954b;
            cVar.getClass();
            boolean zIsEmpty = TextUtils.isEmpty(null);
            Context context = this.f46732a;
            if (zIsEmpty) {
                fb.l.b().getClass();
                zA = true;
            } else {
                zA = i.a(context, cVar);
                fb.l.b().getClass();
            }
            if (!zA) {
                pVar.G();
                return;
            }
            while (true) {
                try {
                    c.a.B(context);
                    fb.l.b().getClass();
                    try {
                        a();
                        pVar.G();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e8) {
                        int i11 = this.f46735d + 1;
                        this.f46735d = i11;
                        if (i11 >= 3) {
                            String str = ns.o.H(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            fb.l.b().getClass();
                            IllegalStateException illegalStateException = new IllegalStateException(str, e8);
                            pVar.f28954b.getClass();
                            throw illegalStateException;
                        }
                        fb.l.b().getClass();
                        try {
                            Thread.sleep(((long) this.f46735d) * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e10) {
                    fb.l.b().getClass();
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e10);
                    pVar.f28954b.getClass();
                    throw illegalStateException2;
                }
            }
        } catch (Throwable th2) {
            pVar.G();
            throw th2;
        }
    }
}
