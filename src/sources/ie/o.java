package ie;

import android.content.Context;
import com.google.common.base.Preconditions;
import d1.t;
import d1.z0;
import hh.p0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.y;
import lf.x0;
import lw.q1;
import mw.a2;
import mw.f3;
import mw.g0;
import mw.i0;
import mw.t1;
import mw.w1;
import mw.y1;
import n9.q;
import o3.w;
import qh.c0;
import qp.o2;
import rz.b0;
import rz.e0;
import rz.z1;
import s0.h0;
import s2.s;
import s2.v;
import y.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements f3, tx.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile o f34403e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f34405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f34406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f34407d;

    public /* synthetic */ o(boolean z11, Object obj, Object obj2, int i11) {
        this.f34404a = i11;
        this.f34405b = z11;
        this.f34406c = obj;
        this.f34407d = obj2;
    }

    public static o d(Context context) {
        if (f34403e == null) {
            synchronized (o.class) {
                try {
                    if (f34403e == null) {
                        f34403e = new o(context.getApplicationContext());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f34403e;
    }

    public boolean a(long j11) {
        Object obj;
        List list = (List) ((o2) this.f34407d).f48095b;
        int size = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i11);
            if (s.d(((v) obj).f51360a, j11)) {
                break;
            }
            i11++;
        }
        v vVar = (v) obj;
        if (vVar != null) {
            return vVar.f51367h;
        }
        return false;
    }

    @Override // tx.c
    public void accept(Object obj) {
        Long it = (Long) obj;
        c0 c0Var = (c0) this.f34406c;
        q qVar = c0Var.f36401t;
        kotlin.jvm.internal.m.f(it, "it");
        if (this.f34405b) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            dy.j jVar = ky.e.f38937b;
            ay.p pVarG = qx.h.m(200L, timeUnit, jVar).g(px.b.a());
            ob.l lVar = new ob.l(28, c0Var, (y) this.f34407d);
            re.q qVar2 = vx.b.f54316e;
            th.j.a(pVarG.h(lVar, qVar2), qVar);
            th.j.a(qx.h.m(800L, timeUnit, jVar).g(px.b.a()).h(new x0(c0Var, 15), qVar2), qVar);
        }
    }

    public void b() {
        ((tz.h) this.f34406c).l(new CancellationException("onBack cancelled"), true);
        ((z1) this.f34407d).cancel(null);
    }

    public boolean c(le.c cVar) {
        boolean z11 = true;
        if (cVar == null) {
            return true;
        }
        boolean zRemove = ((Set) this.f34406c).remove(cVar);
        if (!((HashSet) this.f34407d).remove(cVar) && !zRemove) {
            z11 = false;
        }
        if (z11) {
            cVar.clear();
        }
        return z11;
    }

    public d1.j e() {
        t tVar = (t) this.f34407d;
        int i11 = tVar.f22991b;
        int i12 = tVar.f22992c;
        if (i11 < i12) {
            return d1.j.NOT_CROSSED;
        }
        return i11 > i12 ? d1.j.CROSSED : d1.j.COLLAPSED;
    }

    public void f() {
        if (this.f34405b) {
            z0.a((z0) this.f34407d, (j3.x0) this.f34406c);
        }
    }

    public void g(ScheduledFuture scheduledFuture) {
        synchronized (this.f34406c) {
            try {
                if (!this.f34405b) {
                    this.f34407d = scheduledFuture;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void h(boolean z11) {
        a2 a2Var = (a2) this.f34407d;
        a2Var.f42319k.execute(new t1(a2Var, (w1) this.f34406c, z11));
    }

    public void i(q1 q1Var) {
        a2 a2Var = (a2) this.f34407d;
        a2Var.f42317i.i(lw.e.INFO, "{0} SHUTDOWN with {1}", ((w1) this.f34406c).d(), a2.h(q1Var));
        this.f34405b = true;
        a2Var.f42319k.execute(new i0(16, this, q1Var));
    }

    public void j() {
        Preconditions.p("transportShutdown() must be called before transportTerminated().", this.f34405b);
        a2 a2Var = (a2) this.f34407d;
        lw.f fVar = a2Var.f42317i;
        lw.e eVar = lw.e.INFO;
        w1 w1Var = (w1) this.f34406c;
        fVar.i(eVar, "{0} Terminated", w1Var.d());
        lw.t1 t1Var = a2Var.f42319k;
        t1Var.execute(new t1(a2Var, w1Var, false));
        Iterator it = a2Var.f42318j.iterator();
        if (!it.hasNext()) {
            t1Var.execute(new y1(this, 1));
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            w1Var.getAttributes();
            throw null;
        }
    }

    public long k(w wVar, long j11, boolean z11, com.google.firebase.remoteconfig.a aVar) {
        z0 z0Var = (z0) this.f34407d;
        long jC = z0.c(z0Var, wVar, j11, z11, false, aVar, false);
        if (!j3.x0.a(jC, (j3.x0) this.f34406c)) {
            this.f34405b = false;
        }
        z0Var.p(j3.x0.c(jC) ? h0.Cursor : h0.Selection);
        return jC;
    }

    public String toString() {
        switch (this.f34404a) {
            case 1:
                return "SingleSelectionLayout(isStartHandle=" + this.f34405b + ", crossed=" + e() + ", info=\n\t" + ((t) this.f34407d) + ')';
            case 4:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(super.toString());
                sb2.append("{numRequests=");
                sb2.append(((Set) this.f34406c).size());
                sb2.append(", isPaused=");
                return p0.p(sb2, this.f34405b, "}");
            default:
                return super.toString();
        }
    }

    public o(int i11) {
        this.f34404a = i11;
        switch (i11) {
            case 7:
                this.f34406c = new ReentrantLock();
                this.f34407d = new ArrayList();
                break;
            default:
                this.f34406c = Collections.newSetFromMap(new WeakHashMap());
                this.f34407d = new HashSet();
                break;
        }
    }

    public o(r rVar, o2 o2Var) {
        this.f34404a = 9;
        this.f34406c = rVar;
        this.f34407d = o2Var;
    }

    public o(Context context) {
        this.f34404a = 0;
        this.f34407d = new HashSet();
        g0 g0Var = new g0(new ae.b(context, 1));
        n nVar = new n(this);
        bq.f fVar = new bq.f();
        fVar.f4946d = new fc.g(fVar, 1);
        fVar.f4945c = g0Var;
        fVar.f4944b = nVar;
        this.f34406c = fVar;
    }

    public o(b0 b0Var, boolean z11, fz.e eVar, g.l lVar) {
        this.f34404a = 3;
        this.f34405b = z11;
        this.f34406c = qx.p.b(-2, 4, tz.a.SUSPEND);
        this.f34407d = e0.B(b0Var, null, null, new b0.f(lVar, eVar, this, (vy.d) null, 23), 3);
    }

    public o(z0 z0Var) {
        this.f34404a = 2;
        this.f34407d = z0Var;
        this.f34405b = true;
    }

    public o(a2 a2Var, w1 w1Var) {
        this.f34404a = 5;
        this.f34407d = a2Var;
        this.f34405b = false;
        this.f34406c = w1Var;
    }

    public o(Object obj) {
        this.f34404a = 6;
        this.f34406c = obj;
    }
}
