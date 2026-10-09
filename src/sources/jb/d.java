package jb;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import fb.c0;
import fb.e0;
import fb.l;
import fr.j3;
import gb.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.m;
import o20.w;
import ob.g;
import ob.h;
import ob.i;
import ob.j;
import ob.p;
import s0.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f36289f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f36290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JobScheduler f36291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f36292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WorkDatabase f36293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fb.c f36294e;

    static {
        l.c("SystemJobScheduler");
    }

    public d(Context context, WorkDatabase workDatabase, fb.c cVar) {
        JobScheduler jobSchedulerA = a.a(context);
        c cVar2 = new c(context, cVar.f27049d, cVar.f27056k);
        this.f36290a = context;
        this.f36291b = jobSchedulerA;
        this.f36292c = cVar2;
        this.f36293d = workDatabase;
        this.f36294e = cVar;
    }

    public static void a(JobScheduler jobScheduler, int i11) {
        try {
            jobScheduler.cancel(i11);
        } catch (Throwable unused) {
            l lVarB = l.b();
            String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i11));
            lVarB.getClass();
        }
    }

    public static ArrayList e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        int i11 = a.f36284a;
        m.f(jobScheduler, "<this>");
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
            m.e(allPendingJobs, "jobScheduler.allPendingJobs");
        } catch (Throwable unused) {
            l.b().getClass();
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static j f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // gb.f
    public final void b(p... pVarArr) {
        int iIntValue;
        fb.c cVar = this.f36294e;
        WorkDatabase workDatabase = this.f36293d;
        w wVar = new w(workDatabase);
        for (p pVar : pVarArr) {
            workDatabase.c();
            try {
                p pVarN = workDatabase.E().n(pVar.f44848a);
                if (pVarN != null && pVarN.f44849b == e0.ENQUEUED) {
                    j jVarS = j3.s(pVar);
                    g gVarL = workDatabase.B().l(jVarS);
                    if (gVarL != null) {
                        iIntValue = gVarL.f44810c;
                    } else {
                        cVar.getClass();
                        int i11 = cVar.f27053h;
                        WorkDatabase workDatabase2 = (WorkDatabase) wVar.f44617b;
                        mo.a aVar = new mo.a(wVar, i11, 1);
                        workDatabase2.getClass();
                        Object objW = workDatabase2.w(new u(aVar, 22));
                        m.e(objW, "workDatabase.runInTransa…d\n            }\n        )");
                        iIntValue = ((Number) objW).intValue();
                    }
                    if (gVarL == null) {
                        workDatabase.B().p(new g(jVarS.f44817a, jVarS.f44818b, iIntValue));
                    }
                    g(pVar, iIntValue);
                    workDatabase.x();
                } else {
                    l.b().getClass();
                    workDatabase.x();
                }
                workDatabase.s();
            } catch (Throwable th2) {
                workDatabase.s();
                throw th2;
            }
        }
    }

    @Override // gb.f
    public final boolean c() {
        return true;
    }

    @Override // gb.f
    public final void d(String str) {
        ArrayList arrayList;
        Context context = this.f36290a;
        JobScheduler jobScheduler = this.f36291b;
        ArrayList arrayListE = e(context, jobScheduler);
        int i11 = 0;
        if (arrayListE == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            int size = arrayListE.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayListE.get(i12);
                i12++;
                JobInfo jobInfo = (JobInfo) obj;
                j jVarF = f(jobInfo);
                if (jVarF != null && str.equals(jVarF.f44817a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size2 = arrayList.size();
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            a(jobScheduler, ((Integer) obj2).intValue());
        }
        i iVarB = this.f36293d.B();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) iVarB.f44813b;
        workDatabase_Impl.b();
        h hVar = (h) iVarB.f44816e;
        la.j jVarA = hVar.a();
        jVarA.l(1, str);
        try {
            workDatabase_Impl.c();
            try {
                jVarA.a();
                workDatabase_Impl.x();
                workDatabase_Impl.s();
                hVar.i(jVarA);
            } catch (Throwable th2) {
                workDatabase_Impl.s();
                throw th2;
            }
        } catch (Throwable th3) {
            hVar.i(jVarA);
            throw th3;
        }
    }

    public final void g(p pVar, int i11) {
        List<JobInfo> allPendingJobs;
        JobInfo jobInfoA = this.f36292c.a(pVar, i11);
        l.b().getClass();
        try {
            if (this.f36291b.schedule(jobInfoA) == 0) {
                l.b().getClass();
                if (pVar.f44863q && pVar.f44864r == c0.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    pVar.f44863q = false;
                    l.b().getClass();
                    g(pVar, i11);
                }
            }
        } catch (IllegalStateException e8) {
            int i12 = a.f36284a;
            Context context = this.f36290a;
            m.f(context, "context");
            WorkDatabase workDatabase = this.f36293d;
            m.f(workDatabase, "workDatabase");
            fb.c configuration = this.f36294e;
            m.f(configuration, "configuration");
            int i13 = Build.VERSION.SDK_INT;
            int i14 = i13 >= 31 ? 150 : 100;
            int size = workDatabase.E().l().size();
            String strY0 = "<faulty JobScheduler failed to getPendingJobs>";
            if (i13 >= 34) {
                JobScheduler jobSchedulerA = a.a(context);
                try {
                    allPendingJobs = jobSchedulerA.getAllPendingJobs();
                    m.e(allPendingJobs, "jobScheduler.allPendingJobs");
                } catch (Throwable unused) {
                    l.b().getClass();
                    allPendingJobs = null;
                }
                if (allPendingJobs != null) {
                    ArrayList arrayListE = e(context, jobSchedulerA);
                    int size2 = arrayListE != null ? allPendingJobs.size() - arrayListE.size() : 0;
                    String strF = size2 == 0 ? null : w4.c.f(size2, " of which are not owned by WorkManager");
                    Object systemService = context.getSystemService("jobscheduler");
                    m.d(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
                    ArrayList arrayListE2 = e(context, (JobScheduler) systemService);
                    int size3 = arrayListE2 != null ? arrayListE2.size() : 0;
                    strY0 = ry.m.y0(ry.l.T(new String[]{allPendingJobs.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", strF, size3 != 0 ? w4.c.f(size3, " from WorkManager in the default namespace") : null}), ",\n", null, null, null, 62);
                }
            } else {
                ArrayList arrayListE3 = e(context, a.a(context));
                if (arrayListE3 != null) {
                    strY0 = arrayListE3.size() + " jobs from WorkManager";
                }
            }
            StringBuilder sb2 = new StringBuilder("JobScheduler ");
            sb2.append(i14);
            sb2.append(" job limit exceeded.\nIn JobScheduler there are ");
            sb2.append(strY0);
            sb2.append(".\nThere are ");
            sb2.append(size);
            sb2.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
            String strJ = ep.a.j(sb2, configuration.f27055j, '.');
            l.b().getClass();
            throw new IllegalStateException(strJ, e8);
        } catch (Throwable unused2) {
            l lVarB = l.b();
            pVar.toString();
            lVarB.getClass();
        }
    }
}
