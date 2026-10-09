package m6;

import android.content.Context;
import androidx.glance.session.SessionWorker;
import androidx.work.impl.WorkDatabase;
import fb.a0;
import fb.e0;
import fb.f0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f40907a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f40908b;

    public l(m mVar) {
        this.f40908b = mVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Context context, String name, xy.c cVar) throws Throwable {
        j jVar;
        l lVar;
        boolean z11;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i11 = jVar.f40901e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                jVar.f40901e = i11 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objG = jVar.f40899c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = jVar.f40901e;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objG);
            kotlin.jvm.internal.m.f(context, "context");
            gb.p pVarE = gb.p.E(context);
            kotlin.jvm.internal.m.e(pVarE, "getInstance(context)");
            WorkDatabase workDatabase = pVarE.f28955c;
            qb.a executor = pVarE.f28956d;
            kotlin.jvm.internal.m.f(workDatabase, "<this>");
            kotlin.jvm.internal.m.f(executor, "executor");
            kotlin.jvm.internal.m.f(name, "name");
            c6.o oVar = new c6.o(name, 12);
            pb.j jVar2 = executor.f47694a;
            kotlin.jvm.internal.m.e(jVar2, "executor.serialTaskExecutor");
            a4.l lVarN = com.bumptech.glide.g.n(new com.google.firebase.crashlytics.internal.concurrency.a(jVar2, "loadStatusFuture", new d2.c(10, oVar, workDatabase), 3));
            jVar.f40897a = this;
            jVar.f40898b = name;
            jVar.f40901e = 1;
            objG = ef.e.g(lVarN, jVar);
            if (objG == aVar) {
                return aVar;
            }
            lVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            name = jVar.f40898b;
            lVar = jVar.f40897a;
            com.bumptech.glide.e.F(objG);
        }
        Iterable iterable = (Iterable) objG;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z11 = false;
                    break;
                }
                if (ns.o.L(e0.RUNNING, e0.ENQUEUED).contains(((f0) it.next()).f27075b)) {
                    z11 = true;
                    break;
                }
            }
        } else {
            z11 = false;
            break;
        }
        e6.l lVar2 = (e6.l) lVar.f40907a.get(name);
        return Boolean.valueOf((lVar2 != null ? lVar2.f24958b.get() : false) && z11);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object b(Context context, e6.l lVar, xy.c cVar) {
        k kVar;
        l lVar2;
        Context context2 = context;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i11 = kVar.f40906e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar.f40906e = i11 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object obj = kVar.f40904c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = kVar.f40906e;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            String str = lVar.f24957a;
            e6.l lVar3 = (e6.l) this.f40907a.put(str, lVar);
            if (lVar3 != null) {
                lVar3.f24959c.k(null);
                lVar3.f24958b.set(false);
                lVar3.f24968l.cancel(null);
            }
            ob.m mVar = new ob.m(SessionWorker.class);
            qy.l[] lVarArr = {new qy.l("KEY", str)};
            a0 a0Var = new a0();
            qy.l lVar4 = lVarArr[0];
            a0Var.b(lVar4.f48496b, (String) lVar4.f48495a);
            ((ob.p) mVar.f44827c).f44852e = a0Var.a();
            fb.x xVarG = mVar.G();
            kotlin.jvm.internal.m.f(context2, "context");
            gb.p pVarE = gb.p.E(context2);
            kotlin.jvm.internal.m.e(pVarE, "getInstance(context)");
            a4.l lVar5 = (a4.l) pVarE.m(str, fb.n.REPLACE, xVarG).f27039a;
            kVar.f40902a = this;
            kVar.f40903b = context2;
            kVar.f40906e = 1;
            if (ef.e.g(lVar5, kVar) == aVar) {
                return aVar;
            }
            lVar2 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context2 = kVar.f40903b;
            lVar2 = kVar.f40902a;
            com.bumptech.glide.e.F(obj);
        }
        m mVar2 = lVar2.f40908b;
        kotlin.jvm.internal.m.f(context2, "context");
        gb.p pVarE2 = gb.p.E(context2);
        kotlin.jvm.internal.m.e(pVarE2, "getInstance(context)");
        fb.n nVar = fb.n.KEEP;
        ob.m mVar3 = new ob.m(SessionWorker.class);
        TimeUnit timeUnit = TimeUnit.DAYS;
        kotlin.jvm.internal.m.f(timeUnit, "timeUnit");
        ((ob.p) mVar3.f44827c).f44854g = timeUnit.toMillis(3650L);
        if (Long.MAX_VALUE - System.currentTimeMillis() <= ((ob.p) mVar3.f44827c).f44854g) {
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
        ((ob.p) mVar3.f44827c).f44857j = new fb.f(new pb.f(null), fb.w.NOT_REQUIRED, true, false, false, false, -1L, -1L, ry.m.f1(new LinkedHashSet()));
        pVarE2.m("sessionWorkerKeepEnabled", nVar, mVar3.G());
        return b0.f48488a;
    }
}
