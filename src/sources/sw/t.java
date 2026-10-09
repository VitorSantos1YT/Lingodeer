package sw;

import com.google.common.base.Preconditions;
import java.lang.reflect.Array;
import java.net.SocketAddress;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import lw.k0;
import lw.p0;
import lw.q1;
import qp.o2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw.y f51895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f51896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f51897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public lw.o f51898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p0 f51899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lw.f f51900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v f51901g;

    public t(v vVar, k0 k0Var, k kVar) {
        this.f51901g = vVar;
        p0 p0Var = (p0) k0Var.a();
        if (p0Var != null) {
            this.f51899e = p0Var;
            i iVar = new i(this, p0Var, 1);
            k0Var.getClass();
            ob.m mVarB = k0.b();
            mVarB.Q(k0Var.f40410a);
            lw.b bVar = k0Var.f40411b;
            Preconditions.k(bVar, "attrs");
            mVarB.f44827c = bVar;
            Object[][] objArr = k0Var.f40412c;
            Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length, 2);
            mVarB.f44828d = objArr2;
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            mVarB.F(iVar);
            this.f51895a = kVar.b(mVarB.H());
        } else {
            this.f51895a = kVar.b(k0Var);
        }
        this.f51900f = this.f51895a.d();
    }

    @Override // lw.y
    public final lw.b c() {
        n nVar = this.f51896b;
        lw.y yVar = this.f51895a;
        if (nVar == null) {
            return yVar.c();
        }
        lw.b bVarC = yVar.c();
        bVarC.getClass();
        n nVar2 = this.f51896b;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(v.f51902n, nVar2);
        for (Map.Entry entry : bVarC.f40343a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((lw.a) entry.getKey(), entry.getValue());
            }
        }
        return new lw.b(identityHashMap);
    }

    @Override // sw.d, lw.y
    public final void o() {
        n nVar = this.f51896b;
        if (nVar != null) {
            this.f51896b = null;
            nVar.f51879f.remove(this);
        }
        super.o();
    }

    @Override // lw.y
    public final void p(p0 p0Var) {
        if (this.f51899e != null) {
            r().p(p0Var);
            return;
        }
        this.f51899e = p0Var;
        r().p(new i(this, p0Var, 1));
    }

    @Override // sw.d, lw.y
    public final void q(List list) {
        v vVar = this.f51901g;
        if (v.g(b()) && v.g(list)) {
            if (vVar.f51903f.containsValue(this.f51896b)) {
                n nVar = this.f51896b;
                nVar.getClass();
                this.f51896b = null;
                nVar.f51879f.remove(this);
            }
            SocketAddress socketAddress = (SocketAddress) ((lw.v) list.get(0)).f40480a.get(0);
            if (vVar.f51903f.containsKey(socketAddress)) {
                ((n) vVar.f51903f.get(socketAddress)).a(this);
            }
        } else if (!v.g(b()) || v.g(list)) {
            if (!v.g(b()) && v.g(list)) {
                SocketAddress socketAddress2 = (SocketAddress) ((lw.v) list.get(0)).f40480a.get(0);
                if (vVar.f51903f.containsKey(socketAddress2)) {
                    ((n) vVar.f51903f.get(socketAddress2)).a(this);
                }
            }
        } else if (vVar.f51903f.containsKey(a().f40480a.get(0))) {
            n nVar2 = (n) vVar.f51903f.get(a().f40480a.get(0));
            nVar2.getClass();
            this.f51896b = null;
            nVar2.f51879f.remove(this);
            o2 o2Var = nVar2.f51875b;
            ((AtomicLong) o2Var.f48095b).set(0L);
            ((AtomicLong) o2Var.f48096c).set(0L);
            o2 o2Var2 = nVar2.f51876c;
            ((AtomicLong) o2Var2.f48095b).set(0L);
            ((AtomicLong) o2Var2.f48096c).set(0L);
        }
        this.f51895a.q(list);
    }

    @Override // sw.d
    public final lw.y r() {
        return this.f51895a;
    }

    public final void s() {
        this.f51897c = true;
        p0 p0Var = this.f51899e;
        q1 q1Var = q1.m;
        Preconditions.e("The error status must not be OK", true ^ q1Var.f());
        p0Var.a(new lw.o(lw.n.TRANSIENT_FAILURE, q1Var));
        this.f51900f.i(lw.e.INFO, "Subchannel ejected: {0}", this);
    }

    @Override // sw.d
    public final String toString() {
        return "OutlierDetectionSubchannel{addresses=" + this.f51895a.b() + '}';
    }
}
