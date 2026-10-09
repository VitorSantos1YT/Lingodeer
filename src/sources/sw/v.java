package sw;

import com.android.billingclient.api.b0;
import com.google.common.base.Preconditions;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import lw.n0;
import lw.q0;
import lw.q1;
import lw.r1;
import lw.s1;
import lw.t1;
import mw.i5;
import mw.n3;
import pt.ImS.aYZzTH;
import qp.o2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v extends q0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final lw.a f51902n = new lw.a("addressTrackerKey");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d7.k f51903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t1 f51904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f51905h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n3 f51906i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ScheduledExecutorService f51907j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b1.p f51908k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Long f51909l;
    public final lw.f m;

    public static boolean g(List list) {
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((lw.v) it.next()).f40480a.size();
            if (size > 1) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList h(d7.k kVar, int i11) {
        ArrayList arrayList = new ArrayList();
        for (n nVar : kVar.values()) {
            if (nVar.c() >= i11) {
                arrayList.add(nVar);
            }
        }
        return arrayList;
    }

    @Override // lw.q0
    public final q1 a(n0 n0Var) {
        h hVar = this.f51905h;
        d7.k kVar = this.f51903f;
        lw.f fVar = this.m;
        fVar.i(lw.e.DEBUG, "Received resolution result: {0}", n0Var);
        p pVar = (p) n0Var.f40424c;
        ArrayList arrayList = new ArrayList();
        Iterator it = n0Var.f40422a.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((lw.v) it.next()).f40480a);
        }
        kVar.keySet().retainAll(arrayList);
        Iterator it2 = ((HashMap) kVar.f23241b).values().iterator();
        while (it2.hasNext()) {
            ((n) it2.next()).f51874a = pVar;
        }
        HashMap map = (HashMap) kVar.f23241b;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            SocketAddress socketAddress = (SocketAddress) obj;
            if (!map.containsKey(socketAddress)) {
                map.put(socketAddress, new n(pVar));
            }
        }
        i5 i5Var = pVar.f51889g;
        Long l9 = pVar.f51883a;
        hVar.i(i5Var.f42470a);
        if (pVar.f51887e == null && pVar.f51888f == null) {
            b1.p pVar2 = this.f51908k;
            if (pVar2 != null) {
                pVar2.r();
                this.f51909l = null;
                for (n nVar : ((HashMap) kVar.f23241b).values()) {
                    if (nVar.d()) {
                        nVar.e();
                    }
                    nVar.f51878e = 0;
                }
            }
        } else {
            Long lValueOf = this.f51909l == null ? l9 : Long.valueOf(Math.max(0L, l9.longValue() - (this.f51906i.t() - this.f51909l.longValue())));
            b1.p pVar3 = this.f51908k;
            if (pVar3 != null) {
                pVar3.r();
                for (n nVar2 : ((HashMap) kVar.f23241b).values()) {
                    o2 o2Var = nVar2.f51875b;
                    ((AtomicLong) o2Var.f48095b).set(0L);
                    ((AtomicLong) o2Var.f48096c).set(0L);
                    o2 o2Var2 = nVar2.f51876c;
                    ((AtomicLong) o2Var2.f48095b).set(0L);
                    ((AtomicLong) o2Var2.f48096c).set(0L);
                }
            }
            t1 t1Var = this.f51904g;
            b0 b0Var = new b0(10, this, pVar, fVar, false);
            long jLongValue = lValueOf.longValue();
            long jLongValue2 = l9.longValue();
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            ScheduledExecutorService scheduledExecutorService = this.f51907j;
            t1Var.getClass();
            s1 s1Var = new s1(b0Var);
            this.f51908k = new b1.p(s1Var, scheduledExecutorService.scheduleWithFixedDelay(new r1(t1Var, s1Var, b0Var, jLongValue2), jLongValue, jLongValue2, timeUnit));
        }
        lw.b bVar = lw.b.f40342b;
        hVar.d(new n0(n0Var.f40422a, n0Var.f40423b, pVar.f51889g.f42471b));
        return q1.f40434e;
    }

    @Override // lw.q0
    public final void c(q1 q1Var) {
        this.f51905h.c(q1Var);
    }

    @Override // lw.q0
    public final void f() {
        this.f51905h.f();
    }

    public v(lw.f fVar) {
        n3 n3Var = n3.f42585c;
        lw.f fVarC = fVar.c();
        this.m = fVarC;
        this.f51905h = new h(new f(this, fVar));
        this.f51903f = new d7.k();
        t1 t1VarF = fVar.f();
        Preconditions.k(t1VarF, aYZzTH.bYtljaVJ);
        this.f51904g = t1VarF;
        ScheduledExecutorService scheduledExecutorServiceD = fVar.d();
        Preconditions.k(scheduledExecutorServiceD, "timeService");
        this.f51907j = scheduledExecutorServiceD;
        this.f51906i = n3Var;
        fVarC.h(lw.e.DEBUG, "OutlierDetection lb created.");
    }
}
