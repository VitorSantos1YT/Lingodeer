package mw;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x2 extends lw.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw.k0 f42785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lw.f0 f42786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f42787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f42788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f42789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a2 f42790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f42791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f42792h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b1.p f42793i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y2 f42794j;

    public x2(y2 y2Var, lw.k0 k0Var) {
        this.f42794j = y2Var;
        List list = k0Var.f40410a;
        this.f42789e = list;
        n3 n3Var = y2Var.f42827l;
        this.f42785a = k0Var;
        lw.f0 f0Var = new lw.f0("Subchannel", y2Var.f42834t.e(), lw.f0.f40376d.incrementAndGet());
        this.f42786b = f0Var;
        q qVar = new q(f0Var, n3Var.t(), "Subchannel for " + list);
        this.f42788d = qVar;
        this.f42787c = new n(qVar, n3Var);
    }

    @Override // lw.y
    public final List b() {
        this.f42794j.m.d();
        Preconditions.p("not started", this.f42791g);
        return this.f42789e;
    }

    @Override // lw.y
    public final lw.b c() {
        return this.f42785a.f40411b;
    }

    @Override // lw.y
    public final lw.f d() {
        return this.f42787c;
    }

    @Override // lw.y
    public final Object e() {
        Preconditions.p("Subchannel is not started", this.f42791g);
        return this.f42790f;
    }

    @Override // lw.y
    public final void n() {
        this.f42794j.m.d();
        Preconditions.p("not started", this.f42791g);
        a2 a2Var = this.f42790f;
        if (a2Var.f42329v != null) {
            return;
        }
        a2Var.f42319k.execute(new s1(a2Var, 1));
    }

    @Override // lw.y
    public final void o() {
        b1.p pVar;
        y2 y2Var = this.f42794j;
        y2Var.m.d();
        if (this.f42790f == null) {
            this.f42792h = true;
            return;
        }
        if (!this.f42792h) {
            this.f42792h = true;
        } else {
            if (!y2Var.H || (pVar = this.f42793i) == null) {
                return;
            }
            pVar.r();
            this.f42793i = null;
        }
        if (!y2Var.H) {
            this.f42793i = y2Var.m.c(new j2(new aj.i(this, 17)), 5L, TimeUnit.SECONDS, y2Var.f42821f.f42519a.f44211d);
        } else {
            a2 a2Var = this.f42790f;
            a2Var.f42319k.execute(new i0(15, a2Var, y2.f42809e0));
        }
    }

    @Override // lw.y
    public final void p(lw.p0 p0Var) {
        y2 y2Var = this.f42794j;
        y2Var.m.d();
        Preconditions.p("already started", !this.f42791g);
        Preconditions.p("already shutdown", !this.f42792h);
        Preconditions.p("Channel is being terminated", !y2Var.H);
        this.f42791g = true;
        List list = this.f42785a.f40410a;
        String strE = y2Var.f42834t.e();
        n3 n3Var = y2Var.f42833s;
        l lVar = y2Var.f42821f;
        ScheduledExecutorService scheduledExecutorService = lVar.f42519a.f44211d;
        Supplier supplier = y2Var.f42830p;
        lw.t1 t1Var = y2Var.m;
        r5 r5Var = new r5(this, p0Var);
        lw.c0 c0Var = y2Var.O;
        y2Var.K.getClass();
        a2 a2Var = new a2(list, strE, n3Var, lVar, scheduledExecutorService, supplier, t1Var, r5Var, c0Var, new dm.c(9), this.f42788d, this.f42786b, this.f42787c, y2Var.f42835u);
        q qVar = y2Var.M;
        lw.a0 a0Var = lw.a0.CT_INFO;
        long jT = y2Var.f42827l.t();
        Preconditions.k(a0Var, "severity");
        qVar.b(new lw.b0("Child Subchannel started", a0Var, jT, a2Var));
        this.f42790f = a2Var;
        y2Var.A.add(a2Var);
    }

    @Override // lw.y
    public final void q(List list) {
        this.f42794j.m.d();
        this.f42789e = list;
        a2 a2Var = this.f42790f;
        a2Var.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Preconditions.k(it.next(), "newAddressGroups contains null entry");
        }
        Preconditions.e("newAddressGroups is empty", !list.isEmpty());
        a2Var.f42319k.execute(new i0(14, a2Var, Collections.unmodifiableList(new ArrayList(list))));
    }

    public final String toString() {
        return this.f42786b.toString();
    }
}
