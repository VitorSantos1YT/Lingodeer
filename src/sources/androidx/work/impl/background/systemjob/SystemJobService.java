package androidx.work.impl.background.systemjob;

import a0.b2;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import ep.a;
import fb.l;
import gb.b;
import gb.d;
import gb.i;
import gb.p;
import java.util.Arrays;
import java.util.HashMap;
import ob.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f2804e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f2805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f2806b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b2 f2807c = new b2();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b1.p f2808d;

    static {
        l.c("SystemJobService");
    }

    public static void a(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(a.g("Cannot invoke ", str, " on a background thread"));
        }
    }

    public static j b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // gb.b
    public final void e(j jVar, boolean z11) {
        a("onExecuted");
        l lVarB = l.b();
        String str = jVar.f44817a;
        lVarB.getClass();
        JobParameters jobParameters = (JobParameters) this.f2806b.remove(jVar);
        this.f2807c.k(jVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z11);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            p pVarE = p.E(getApplicationContext());
            this.f2805a = pVarE;
            d dVar = pVarE.f28958f;
            this.f2808d = new b1.p(dVar, pVarE.f28956d);
            dVar.a(this);
        } catch (IllegalStateException e8) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e8);
            }
            l.b().getClass();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        p pVar = this.f2805a;
        if (pVar != null) {
            pVar.f28958f.e(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        a("onStartJob");
        if (this.f2805a == null) {
            l.b().getClass();
            jobFinished(jobParameters, true);
            return false;
        }
        j jVarB = b(jobParameters);
        if (jVarB == null) {
            l.b().getClass();
            return false;
        }
        HashMap map = this.f2806b;
        if (map.containsKey(jVarB)) {
            l lVarB = l.b();
            jVarB.toString();
            lVarB.getClass();
            return false;
        }
        l lVarB2 = l.b();
        jVarB.toString();
        lVarB2.getClass();
        map.put(jVarB, jobParameters);
        int i11 = Build.VERSION.SDK_INT;
        ob.l lVar = new ob.l(8);
        if (jobParameters.getTriggeredContentUris() != null) {
            lVar.f44823c = Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            lVar.f44822b = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        if (i11 >= 28) {
            a2.l.l(jobParameters);
        }
        b1.p pVar = this.f2808d;
        i iVarP = this.f2807c.p(jVarB);
        pVar.getClass();
        ((qb.a) pVar.f3801c).a(new androidx.fragment.app.d(pVar, iVarP, lVar, 10));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        a("onStopJob");
        if (this.f2805a == null) {
            l.b().getClass();
            return true;
        }
        j jVarB = b(jobParameters);
        if (jVarB == null) {
            l.b().getClass();
            return false;
        }
        l lVarB = l.b();
        jVarB.toString();
        lVarB.getClass();
        this.f2806b.remove(jVarB);
        i iVarK = this.f2807c.k(jVarB);
        if (iVarK != null) {
            int iC = Build.VERSION.SDK_INT >= 31 ? b2.d.c(jobParameters) : -512;
            b1.p pVar = this.f2808d;
            pVar.getClass();
            pVar.K(iVarK, iC);
        }
        d dVar = this.f2805a.f28958f;
        String str = jVarB.f44817a;
        synchronized (dVar.f28927k) {
            zContains = dVar.f28925i.contains(str);
        }
        return !zContains;
    }
}
