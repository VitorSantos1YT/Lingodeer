package l1;

import androidx.compose.runtime.ComposeRuntimeError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import qp.m4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d2 extends w {
    public static final uz.i1 A = uz.x0.c(r1.b.f48737d);
    public static final AtomicReference B = new AtomicReference(Boolean.FALSE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f39256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f39257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xq.c f39258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f39259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public rz.g1 f39260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Throwable f39261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f39262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f39263h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public y.j0 f39264i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n1.e f39265j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f39266k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f39267l;
    public final y.i0 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b1.p f39268n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final y.i0 f39269o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y.i0 f39270p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f39271q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LinkedHashSet f39272r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public rz.m f39273s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public hd.b f39274t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f39275u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final uz.i1 f39276v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final m4 f39277w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final rz.h1 f39278x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final vy.i f39279y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final g f39280z;

    public d2(vy.i iVar) {
        f fVar = new f(new y1(this, 0));
        this.f39257b = fVar;
        this.f39258c = new xq.c(new y1(this, 1));
        this.f39259d = new Object();
        this.f39262g = new ArrayList();
        this.f39264i = new y.j0();
        this.f39265j = new n1.e(new z[16]);
        this.f39266k = new ArrayList();
        this.f39267l = new ArrayList();
        this.m = new y.i0();
        this.f39268n = new b1.p(19);
        this.f39269o = new y.i0();
        this.f39270p = new y.i0();
        this.f39276v = uz.x0.c(a2.Inactive);
        this.f39277w = new m4(3);
        rz.h1 h1Var = new rz.h1((rz.g1) iVar.get(rz.z.f50978b));
        h1Var.invokeOnCompletion(new kp.j(this, 5));
        this.f39278x = h1Var;
        this.f39279y = iVar.plus(fVar).plus(h1Var);
        this.f39280z = new g(9);
    }

    public static final void G(ArrayList arrayList, d2 d2Var, z zVar) {
        arrayList.clear();
        synchronized (d2Var.f39259d) {
            Iterator it = d2Var.f39267l.iterator();
            if (it.hasNext()) {
                ((z0) it.next()).getClass();
                throw null;
            }
        }
    }

    public static void w(x1.b bVar) {
        try {
            if (bVar.w() instanceof x1.g) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            bVar.c();
        } catch (Throwable th2) {
            bVar.c();
            throw th2;
        }
    }

    public final boolean A() {
        return this.f39265j.f43114c != 0 || z() || B() || this.m.j();
    }

    public final boolean B() {
        return !this.f39275u && (((t1.a) ((a9.i) this.f39258c.f56175c).f519c).get() & 134217727) > 0;
    }

    public final boolean C() {
        boolean z11;
        synchronized (this.f39259d) {
            z11 = this.f39264i.h() || this.f39265j.f43114c != 0 || z() || B();
        }
        return z11;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final List D() {
        ?? r9 = this.f39263h;
        if (r9 != 0) {
            return r9;
        }
        ArrayList arrayList = this.f39262g;
        List arrayList2 = arrayList.isEmpty() ? ry.r.f50854a : new ArrayList(arrayList);
        this.f39263h = arrayList2;
        return arrayList2;
    }

    public final void E() {
        rz.l lVarY;
        synchronized (this.f39259d) {
            lVarY = y();
            if (((a2) this.f39276v.getValue()).compareTo(a2.ShuttingDown) <= 0) {
                throw rz.e0.a("Recomposer shutdown; frame clock awaiter will never resume", this.f39261f);
            }
        }
        if (lVarY != null) {
            ((rz.m) lVarY).resumeWith(qy.b0.f48488a);
        }
    }

    public final void F(z zVar) {
        synchronized (this.f39259d) {
            ArrayList arrayList = this.f39267l;
            if (arrayList.size() > 0) {
                ((z0) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    public final List H(List list, y.j0 j0Var) {
        x1.b bVarC;
        ArrayList arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            ((z0) obj).getClass();
            Object arrayList2 = map.get(null);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(null, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            z zVar = (z) entry.getKey();
            List list2 = (List) entry.getValue();
            if (zVar.X.F) {
                u.a("Check failed");
            }
            kp.j jVar = new kp.j(zVar, 4);
            j9.h hVar = new j9.h(12, zVar, j0Var);
            x1.f fVarJ = x1.l.j();
            x1.b bVar = fVarJ instanceof x1.b ? (x1.b) fVarJ : null;
            if (bVar == null || (bVarC = bVar.C(jVar, hVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                x1.f fVarJ2 = bVarC.j();
                try {
                    synchronized (this.f39259d) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i12 = 0; i12 < size2; i12++) {
                                z0 z0Var = (z0) list2.get(i12);
                                y.i0 i0Var = this.m;
                                z0Var.getClass();
                                Object objA = n1.a.a(i0Var);
                                arrayList.add(new qy.l(z0Var, objA));
                            }
                            int size3 = arrayList.size();
                            for (int i13 = 0; i13 < size3; i13++) {
                                qy.l lVar = (qy.l) arrayList.get(i13);
                                if (lVar.f48496b == null) {
                                    b1.p pVar = this.f39268n;
                                    ((z0) lVar.f48495a).getClass();
                                    if (((y.i0) pVar.f3800b).b(null)) {
                                        ArrayList arrayList3 = new ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i14 = 0; i14 < size4; i14++) {
                                            qy.l lVar2 = (qy.l) arrayList.get(i14);
                                            if (lVar2.f48496b == null) {
                                                b1.p pVar2 = this.f39268n;
                                                ((z0) lVar2.f48495a).getClass();
                                                y.i0 i0Var2 = (y.i0) pVar2.f3800b;
                                                if (i0Var2.i()) {
                                                    ((y.i0) pVar2.f3801c).a();
                                                }
                                            }
                                            arrayList3.add(lVar2);
                                        }
                                        arrayList = arrayList3;
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    int size5 = arrayList.size();
                    for (int i15 = 0; i15 < size5; i15++) {
                        if (((qy.l) arrayList.get(i15)).f48496b != null) {
                            int size6 = arrayList.size();
                            for (int i16 = 0; i16 < size6; i16++) {
                                if (((qy.l) arrayList.get(i16)).f48496b == null) {
                                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                                    int size7 = arrayList.size();
                                    for (int i17 = 0; i17 < size7; i17++) {
                                        qy.l lVar3 = (qy.l) arrayList.get(i17);
                                        if (lVar3.f48496b == null) {
                                        }
                                    }
                                    synchronized (this.f39259d) {
                                        ry.m.d0(this.f39267l, arrayList4);
                                    }
                                    ArrayList arrayList5 = new ArrayList(arrayList.size());
                                    int size8 = arrayList.size();
                                    for (int i18 = 0; i18 < size8; i18++) {
                                        Object obj2 = arrayList.get(i18);
                                        if (((qy.l) obj2).f48496b != null) {
                                            arrayList5.add(obj2);
                                        }
                                    }
                                    arrayList = arrayList5;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    zVar.q(arrayList);
                    x1.f.q(fVarJ2);
                    w(bVarC);
                } catch (Throwable th3) {
                    x1.f.q(fVarJ2);
                    throw th3;
                }
            } catch (Throwable th4) {
                w(bVarC);
                throw th4;
            }
        }
        return ry.m.a1(map.keySet());
    }

    public final z I(z zVar, y.j0 j0Var) {
        x1.b bVarC;
        if (zVar.X.F || zVar.Y == 3) {
            return null;
        }
        LinkedHashSet linkedHashSet = this.f39272r;
        if (linkedHashSet == null || !linkedHashSet.contains(zVar)) {
            kp.j jVar = new kp.j(zVar, 4);
            j9.h hVar = new j9.h(12, zVar, j0Var);
            x1.f fVarJ = x1.l.j();
            x1.b bVar = fVarJ instanceof x1.b ? (x1.b) fVarJ : null;
            if (bVar == null || (bVarC = bVar.C(jVar, hVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                x1.f fVarJ2 = bVarC.j();
                if (j0Var != null) {
                    try {
                        if (j0Var.h()) {
                            z1 z1Var = new z1(0, j0Var, zVar);
                            s sVar = zVar.X;
                            if (sVar.F) {
                                u.a("Preparing a composition while composing is not supported");
                            }
                            sVar.F = true;
                            try {
                                z1Var.invoke();
                                sVar.F = false;
                            } catch (Throwable th2) {
                                sVar.F = false;
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        x1.f.q(fVarJ2);
                        throw th3;
                    }
                }
                boolean zW = zVar.w();
                x1.f.q(fVarJ2);
                w(bVarC);
                if (zW) {
                    return zVar;
                }
            } catch (Throwable th4) {
                w(bVarC);
                throw th4;
            }
        }
        return null;
    }

    public final void J(Throwable th2, z zVar) throws Throwable {
        if (!((Boolean) B.get()).booleanValue() || (th2 instanceof ComposeRuntimeError)) {
            synchronized (this.f39259d) {
                hd.b bVar = this.f39274t;
                if (bVar != null) {
                    throw ((Throwable) bVar.f32184b);
                }
                this.f39274t = new hd.b(th2, 29);
            }
            throw th2;
        }
        synchronized (this.f39259d) {
            try {
                this.f39266k.clear();
                this.f39265j.h();
                this.f39264i = new y.j0();
                this.f39267l.clear();
                this.m.a();
                this.f39269o.a();
                this.f39274t = new hd.b(th2, 29);
                if (zVar != null) {
                    L(zVar);
                }
                y();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean K() {
        boolean zA;
        synchronized (this.f39259d) {
            if (this.f39264i.g()) {
                return A();
            }
            List listD = D();
            n1.h hVar = new n1.h(this.f39264i);
            this.f39264i = new y.j0();
            try {
                int size = listD.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((z) listD.get(i11)).x(hVar);
                    if (((a2) this.f39276v.getValue()).compareTo(a2.ShuttingDown) <= 0) {
                        break;
                    }
                }
                synchronized (this.f39259d) {
                    if (y() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zA = A();
                }
                return zA;
            } catch (Throwable th2) {
                synchronized (this.f39259d) {
                    y.j0 j0Var = this.f39264i;
                    j0Var.getClass();
                    Iterator<E> it = hVar.iterator();
                    while (it.hasNext()) {
                        j0Var.j(it.next());
                    }
                    throw th2;
                }
            }
        }
    }

    public final void L(z zVar) {
        ArrayList arrayList = this.f39271q;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f39271q = arrayList;
        }
        if (!arrayList.contains(zVar)) {
            arrayList.add(zVar);
        }
        if (this.f39262g.remove(zVar)) {
            this.f39263h = null;
        }
    }

    public final Object M(xy.i iVar) {
        Object objM = rz.e0.M(this.f39257b, new b0.x0(this, new c2(this, null), t.x(iVar.getContext()), (vy.d) null), iVar);
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        qy.b0 b0Var = qy.b0.f48488a;
        if (objM != aVar) {
            objM = b0Var;
        }
        return objM == aVar ? objM : b0Var;
    }

    @Override // l1.w
    public final void a(z zVar, fz.e eVar) throws Throwable {
        a2 a2Var;
        boolean zContains;
        x1.b bVarC;
        boolean z11 = zVar.X.F;
        synchronized (this.f39259d) {
            a2 a2Var2 = (a2) this.f39276v.getValue();
            a2Var = a2.ShuttingDown;
            zContains = a2Var2.compareTo(a2Var) > 0 ? true ^ D().contains(zVar) : true;
        }
        try {
            kp.j jVar = new kp.j(zVar, 4);
            j9.h hVar = new j9.h(12, zVar, (Object) null);
            x1.f fVarJ = x1.l.j();
            x1.b bVar = fVarJ instanceof x1.b ? (x1.b) fVarJ : null;
            if (bVar == null || (bVarC = bVar.C(jVar, hVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                x1.f fVarJ2 = bVarC.j();
                try {
                    zVar.j(eVar);
                    x1.f.q(fVarJ2);
                    w(bVarC);
                    synchronized (this.f39259d) {
                        if (((a2) this.f39276v.getValue()).compareTo(a2Var) > 0 && !D().contains(zVar)) {
                            this.f39262g.add(zVar);
                            this.f39263h = null;
                        }
                    }
                    if (!z11) {
                        x1.l.j().m();
                    }
                    try {
                        F(zVar);
                        try {
                            zVar.d();
                            zVar.f();
                            if (z11) {
                                return;
                            }
                            x1.l.j().m();
                        } catch (Throwable th2) {
                            J(th2, null);
                        }
                    } catch (Throwable th3) {
                        J(th3, zVar);
                    }
                } catch (Throwable th4) {
                    x1.f.q(fVarJ2);
                    throw th4;
                }
            } catch (Throwable th5) {
                w(bVarC);
                throw th5;
            }
        } catch (Throwable th6) {
            if (zContains) {
                synchronized (this.f39259d) {
                }
            }
            J(th6, zVar);
        }
    }

    @Override // l1.w
    public final y.j0 b(z zVar, se.n nVar, fz.e eVar) {
        m4 m4Var = this.f39277w;
        try {
            se.n nVar2 = zVar.R;
            zVar.R = nVar;
            try {
                a(zVar, eVar);
                y.j0 j0Var = (y.j0) m4Var.e();
                if (j0Var == null) {
                    j0Var = y.s0.f56760a;
                    kotlin.jvm.internal.m.d(j0Var, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
                }
                zVar.R = nVar2;
                m4Var.m(null);
                return j0Var;
            } catch (Throwable th2) {
                zVar.R = nVar2;
                throw th2;
            }
        } catch (Throwable th3) {
            m4Var.m(null);
            throw th3;
        }
    }

    @Override // l1.w
    public final boolean d() {
        return ((Boolean) B.get()).booleanValue();
    }

    @Override // l1.w
    public final boolean e() {
        return false;
    }

    @Override // l1.w
    public final boolean f() {
        return false;
    }

    @Override // l1.w
    public final long g() {
        return 1000;
    }

    @Override // l1.w
    public final v h() {
        return null;
    }

    @Override // l1.w
    public final vy.i j() {
        return this.f39279y;
    }

    @Override // l1.w
    public final boolean k() {
        return false;
    }

    @Override // l1.w
    public final void l(z zVar) {
        rz.l lVarY;
        synchronized (this.f39259d) {
            if (this.f39265j.i(zVar)) {
                lVarY = null;
            } else {
                this.f39265j.c(zVar);
                lVarY = y();
            }
        }
        if (lVarY != null) {
            ((rz.m) lVarY).resumeWith(qy.b0.f48488a);
        }
    }

    @Override // l1.w
    public final y0 m(z0 z0Var) {
        y0 y0Var;
        synchronized (this.f39259d) {
            y0Var = (y0) this.f39269o.k(z0Var);
        }
        return y0Var;
    }

    @Override // l1.w
    public final y.j0 n(z zVar, se.n nVar, y.j0 j0Var) {
        m4 m4Var = this.f39277w;
        try {
            K();
            zVar.x(new n1.h(j0Var));
            se.n nVar2 = zVar.R;
            zVar.R = nVar;
            try {
                z zVarI = I(zVar, null);
                if (zVarI != null) {
                    F(zVar);
                    zVarI.d();
                    zVarI.f();
                }
                y.j0 j0Var2 = (y.j0) m4Var.e();
                if (j0Var2 == null) {
                    j0Var2 = y.s0.f56760a;
                    kotlin.jvm.internal.m.d(j0Var2, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
                }
                zVar.R = nVar2;
                m4Var.m(null);
                return j0Var2;
            } catch (Throwable th2) {
                zVar.R = nVar2;
                throw th2;
            }
        } catch (Throwable th3) {
            m4Var.m(null);
            throw th3;
        }
    }

    @Override // l1.w
    public final void q(x1 x1Var) {
        m4 m4Var = this.f39277w;
        y.j0 j0Var = (y.j0) m4Var.e();
        if (j0Var == null) {
            y.j0 j0Var2 = y.s0.f56760a;
            j0Var = new y.j0();
            m4Var.m(j0Var);
        }
        j0Var.a(x1Var);
    }

    @Override // l1.w
    public final void r(z zVar) {
        synchronized (this.f39259d) {
            try {
                LinkedHashSet linkedHashSet = this.f39272r;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f39272r = linkedHashSet;
                }
                linkedHashSet.add(zVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // l1.w
    public final h s(w2.l1 l1Var) {
        xq.c cVar = this.f39258c;
        a9.i iVar = (a9.i) cVar.f56175c;
        d1 d1Var = new d1();
        d1Var.f39255a = l1Var;
        return iVar.g(d1Var, (fp.f) cVar.f56176d);
    }

    @Override // l1.w
    public final void v(z zVar) {
        synchronized (this.f39259d) {
            if (this.f39262g.remove(zVar)) {
                this.f39263h = null;
            }
            this.f39265j.k(zVar);
            this.f39266k.remove(zVar);
        }
    }

    public final void x() {
        synchronized (this.f39259d) {
            if (((a2) this.f39276v.getValue()).compareTo(a2.Idle) >= 0) {
                this.f39276v.k(a2.ShuttingDown);
            }
        }
        this.f39278x.cancel(null);
    }

    public final rz.l y() {
        a2 a2Var;
        uz.i1 i1Var = this.f39276v;
        int iCompareTo = ((a2) i1Var.getValue()).compareTo(a2.ShuttingDown);
        ArrayList arrayList = this.f39267l;
        ArrayList arrayList2 = this.f39266k;
        n1.e eVar = this.f39265j;
        if (iCompareTo > 0) {
            if (this.f39274t != null) {
                a2Var = a2.Inactive;
            } else if (this.f39260e == null) {
                this.f39264i = new y.j0();
                eVar.h();
                a2Var = (z() || B()) ? a2.InactivePendingWork : a2.Inactive;
            } else {
                a2Var = (eVar.f43114c != 0 || this.f39264i.h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || z() || B() || this.m.j()) ? a2.PendingWork : a2.Idle;
            }
            i1Var.k(a2Var);
            if (a2Var != a2.PendingWork) {
                return null;
            }
            rz.m mVar = this.f39273s;
            this.f39273s = null;
            return mVar;
        }
        List listD = D();
        int size = listD.size();
        for (int i11 = 0; i11 < size; i11++) {
        }
        this.f39262g.clear();
        this.f39263h = ry.r.f50854a;
        this.f39264i = new y.j0();
        eVar.h();
        arrayList2.clear();
        arrayList.clear();
        this.f39271q = null;
        rz.m mVar2 = this.f39273s;
        if (mVar2 != null) {
            mVar2.k(null);
        }
        this.f39273s = null;
        this.f39274t = null;
        return null;
    }

    public final boolean z() {
        return !this.f39275u && (((t1.a) ((a9.i) this.f39257b.f39290c).f519c).get() & 134217727) > 0;
    }

    @Override // l1.w
    public final void o(Set set) {
    }
}
