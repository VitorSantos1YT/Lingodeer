package gb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.lingo.lingoskill.LingoSkillApplication;
import fb.g0;
import java.util.List;
import n9.n1;
import rz.e0;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends g0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static p f28951k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static p f28952l;
    public static final Object m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f28953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fb.c f28954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WorkDatabase f28955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qb.a f28956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f28957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f28958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lp.b f28959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f28960h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f28961i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final mb.i f28962j;

    static {
        fb.l.c("WorkManagerImpl");
        f28951k = null;
        f28952l = null;
        m = new Object();
    }

    public p(Context context, final fb.c cVar, qb.a aVar, final WorkDatabase workDatabase, final List list, d dVar, mb.i iVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        fb.l lVar = new fb.l();
        synchronized (fb.l.f27099b) {
            try {
                if (fb.l.f27100c == null) {
                    fb.l.f27100c = lVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f28953a = applicationContext;
        this.f28956d = aVar;
        this.f28955c = workDatabase;
        this.f28958f = dVar;
        this.f28962j = iVar;
        this.f28954b = cVar;
        this.f28957e = list;
        rz.y yVar = aVar.f47695b;
        kotlin.jvm.internal.m.e(yVar, "taskExecutor.taskCoroutineDispatcher");
        wz.d dVarC = e0.c(yVar);
        this.f28959g = new lp.b(workDatabase, 12);
        final pb.j jVar = aVar.f47694a;
        int i11 = h.f28934a;
        dVar.a(new b() { // from class: gb.g
            @Override // gb.b
            public final void e(ob.j jVar2, boolean z11) {
                jVar.execute(new cf.i(list, jVar2, cVar, workDatabase, 2));
            }
        });
        aVar.a(new pb.d(applicationContext, this));
        int i12 = k.f28939b;
        if (pb.i.a(applicationContext, cVar)) {
            ob.s sVarE = workDatabase.E();
            sVarE.getClass();
            x0.y(new n1(x0.o(x0.f(new bh.r(qx.p.l((WorkDatabase_Impl) sVarE.f44875a, new String[]{"workspec"}, new s0.a(new ob.r(sVarE, w9.u.b(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1")), 20)), new j(4, null), 28), -1)), new g.m(applicationContext, null), 5), dVarC);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static p E(Context context) {
        p pVarE;
        Object obj = m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    try {
                        pVarE = f28951k;
                        if (pVarE == null) {
                            pVarE = f28952l;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return pVarE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (pVarE == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof fb.b)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            ((LingoSkillApplication) ((fb.b) applicationContext)).getClass();
            F(applicationContext, new fb.c(new fb.l()));
            pVarE = E(applicationContext);
        }
        return pVarE;
    }

    public static void F(Context context, fb.c cVar) {
        synchronized (m) {
            try {
                p pVar = f28951k;
                if (pVar != null && f28952l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (pVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f28952l == null) {
                        f28952l = r.m(applicationContext, cVar);
                    }
                    f28951k = f28952l;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void G() {
        synchronized (m) {
            try {
                this.f28960h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f28961i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f28961i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void H() {
        fb.l lVar = this.f28954b.f27057l;
        cr.n nVar = new cr.n(this, 26);
        kotlin.jvm.internal.m.f(lVar, "<this>");
        boolean zA = v10.c.A();
        if (zA) {
            try {
                Trace.beginSection(v10.c.L("ReschedulingWork"));
            } finally {
                if (zA) {
                    Trace.endSection();
                }
            }
        }
        nVar.invoke();
    }
}
