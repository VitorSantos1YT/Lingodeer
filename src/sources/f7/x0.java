package f7;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g7.j f26936a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g0 f26940e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g7.f f26943h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b7.a0 f26944i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f26946k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d7.q f26947l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p7.c1 f26945j = new p7.c1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f26938c = new IdentityHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f26939d = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f26937b = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f26941f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f26942g = new HashSet();

    public x0(g0 g0Var, g7.f fVar, b7.a0 a0Var, g7.j jVar) {
        this.f26936a = jVar;
        this.f26940e = g0Var;
        this.f26943h = fVar;
        this.f26944i = a0Var;
    }

    public final y6.o0 a(int i11, ArrayList arrayList, p7.c1 c1Var) {
        if (!arrayList.isEmpty()) {
            this.f26945j = c1Var;
            for (int i12 = i11; i12 < arrayList.size() + i11; i12++) {
                w0 w0Var = (w0) arrayList.get(i12 - i11);
                ArrayList arrayList2 = this.f26937b;
                if (i12 > 0) {
                    w0 w0Var2 = (w0) arrayList2.get(i12 - 1);
                    w0Var.f26933d = w0Var2.f26930a.f46517o.f46450b.o() + w0Var2.f26933d;
                    w0Var.f26934e = false;
                    w0Var.f26932c.clear();
                } else {
                    w0Var.f26933d = 0;
                    w0Var.f26934e = false;
                    w0Var.f26932c.clear();
                }
                int iO = w0Var.f26930a.f46517o.f46450b.o();
                for (int i13 = i12; i13 < arrayList2.size(); i13++) {
                    ((w0) arrayList2.get(i13)).f26933d += iO;
                }
                arrayList2.add(i12, w0Var);
                this.f26939d.put(w0Var.f26931b, w0Var);
                if (this.f26946k) {
                    e(w0Var);
                    if (this.f26938c.isEmpty()) {
                        this.f26942g.add(w0Var);
                    } else {
                        v0 v0Var = (v0) this.f26941f.get(w0Var);
                        if (v0Var != null) {
                            v0Var.f26926a.b(v0Var.f26927b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final y6.o0 b() {
        ArrayList arrayList = this.f26937b;
        if (arrayList.isEmpty()) {
            return y6.o0.f57278a;
        }
        int iO = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            w0 w0Var = (w0) arrayList.get(i11);
            w0Var.f26933d = iO;
            iO += w0Var.f26930a.f46517o.f46450b.o();
        }
        return new d1(arrayList, this.f26945j);
    }

    public final void c() {
        Iterator it = this.f26942g.iterator();
        while (it.hasNext()) {
            w0 w0Var = (w0) it.next();
            if (w0Var.f26932c.isEmpty()) {
                v0 v0Var = (v0) this.f26941f.get(w0Var);
                if (v0Var != null) {
                    v0Var.f26926a.b(v0Var.f26927b);
                }
                it.remove();
            }
        }
    }

    public final void d(w0 w0Var) {
        if (w0Var.f26934e && w0Var.f26932c.isEmpty()) {
            v0 v0Var = (v0) this.f26941f.remove(w0Var);
            v0Var.getClass();
            u0 u0Var = v0Var.f26928c;
            p7.a aVar = v0Var.f26926a;
            aVar.n(v0Var.f26927b);
            aVar.q(u0Var);
            aVar.p(u0Var);
            this.f26942g.remove(w0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [f7.p0, p7.c0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void e(w0 w0Var) {
        p7.w wVar = w0Var.f26930a;
        ?? r9 = new p7.c0() { // from class: f7.p0
            @Override // p7.c0
            public final void a(p7.a aVar, y6.o0 o0Var) {
                b7.a0 a0Var = this.f26893a.f26940e.H;
                a0Var.d(2);
                a0Var.e(22);
            }
        };
        u0 u0Var = new u0(this, w0Var);
        this.f26941f.put(w0Var, new v0(wVar, r9, u0Var));
        String str = b7.f0.f3975a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(looperMyLooper, null);
        wVar.getClass();
        k7.c cVar = wVar.f46320c;
        cVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = cVar.f37958c;
        p7.g0 g0Var = new p7.g0();
        g0Var.f46385a = handler;
        g0Var.f46386b = u0Var;
        copyOnWriteArrayList.add(g0Var);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        new Handler(looperMyLooper2, null);
        k7.c cVar2 = wVar.f46321d;
        cVar2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = cVar2.f37958c;
        k7.b bVar = new k7.b();
        bVar.f37955a = u0Var;
        copyOnWriteArrayList2.add(bVar);
        wVar.j(r9, this.f26947l, this.f26936a);
    }

    public final void f(p7.z zVar) {
        IdentityHashMap identityHashMap = this.f26938c;
        w0 w0Var = (w0) identityHashMap.remove(zVar);
        w0Var.getClass();
        w0Var.f26930a.m(zVar);
        w0Var.f26932c.remove(((p7.t) zVar).f46488a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(w0Var);
    }

    public final void g(int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            ArrayList arrayList = this.f26937b;
            w0 w0Var = (w0) arrayList.remove(i13);
            this.f26939d.remove(w0Var.f26931b);
            int i14 = -w0Var.f26930a.f46517o.f46450b.o();
            for (int i15 = i13; i15 < arrayList.size(); i15++) {
                ((w0) arrayList.get(i15)).f26933d += i14;
            }
            w0Var.f26934e = true;
            if (this.f26946k) {
                d(w0Var);
            }
        }
    }
}
