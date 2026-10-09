package g3;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Trace;
import com.yalantis.ucrop.view.CropImageView;
import fb.g0;
import java.util.List;
import y2.b2;
import y2.i0;
import y2.k1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f2.c f28709a = new f2.c(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 10.0f, 10.0f);

    /* JADX WARN: Code duplicated, block: B:35:0x0063 A[LOOP:0: B:4:0x000d->B:35:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0066 A[EDGE_INSN: B:43:0x0066->B:36:0x0066 BREAK  A[LOOP:0: B:4:0x000d->B:35:0x0063], SYNTHETIC] */
    public static final t a(i0 i0Var, boolean z11) {
        z1.q qVar = (z1.q) i0Var.f56892i0.f50089g;
        Object obj = null;
        if ((qVar.f58485d & 8) != 0) {
            loop0: while (qVar != null) {
                if ((qVar.f58484c & 8) == 0) {
                    if ((qVar.f58485d & 8) != 0) {
                        break;
                        break;
                    }
                    qVar = qVar.f58487f;
                } else {
                    z1.q qVarF = qVar;
                    n1.e eVar = null;
                    while (qVarF != null) {
                        if (qVarF instanceof b2) {
                            obj = qVarF;
                            break loop0;
                        }
                        if ((qVarF.f58484c & 8) != 0 && (qVarF instanceof y2.n)) {
                            int i11 = 0;
                            for (z1.q qVar2 = ((y2.n) qVarF).R; qVar2 != null; qVar2 = qVar2.f58487f) {
                                if ((qVar2.f58484c & 8) != 0) {
                                    i11++;
                                    if (i11 == 1) {
                                        qVarF = qVar2;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new n1.e(new z1.q[16]);
                                        }
                                        if (qVarF != null) {
                                            eVar.c(qVarF);
                                            qVarF = null;
                                        }
                                        eVar.c(qVar2);
                                    }
                                }
                            }
                            if (i11 == 1) {
                            }
                        }
                        qVarF = y2.f.f(eVar);
                    }
                    if ((qVar.f58485d & 8) != 0) {
                        break;
                    }
                    qVar = qVar.f58487f;
                }
            }
        }
        kotlin.jvm.internal.m.c(obj);
        z1.q qVar3 = ((z1.q) ((b2) obj)).f58482a;
        o oVarY = i0Var.y();
        if (oVarY == null) {
            oVarY = new o();
        }
        return new t(qVar3, z11, i0Var, oVarY);
    }

    public static final y.x b(v vVar, fz.c cVar) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            t tVarA = vVar.a();
            i0 i0Var = tVarA.f28698c;
            if (i0Var.J() && i0Var.I()) {
                y.x xVar = new y.x(48);
                a5.j jVar = new a5.j(14);
                v3.k kVarA = g0.A(tVarA.g());
                ((Region) jVar.f385b).set(kVarA.f53494a, kVarA.f53495b, kVarA.f53496c, kVarA.f53497d);
                c(jVar, tVarA, xVar, cVar, tVarA, new a5.j(14));
                return xVar;
            }
            y.x xVar2 = y.n.f56742a;
            kotlin.jvm.internal.m.d(xVar2, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
            return xVar2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void c(a5.j jVar, t tVar, y.x xVar, fz.c cVar, t tVar2, a5.j jVar2) {
        f2.c cVarX1;
        i0 i0Var;
        t tVar3 = tVar;
        int i11 = tVar3.f28702g;
        a5.j jVar3 = jVar2;
        Region region = (Region) jVar3.f385b;
        i0 i0Var2 = tVar2.f28698c;
        int i12 = tVar2.f28702g;
        boolean z11 = (i0Var2.J() && i0Var2.I()) ? false : true;
        a5.j jVar4 = jVar;
        Region region2 = (Region) jVar4.f385b;
        if (!region2.isEmpty() || i12 == i11) {
            if (!z11 || tVar2.f28700e) {
                Object objF = tVar2.f();
                if (objF == null) {
                    cVarX1 = ((y2.v) i0Var2.f56892i0.f50086d).x1();
                } else {
                    z1.q qVar = ((z1.q) objF).f58482a;
                    Object objG = tVar2.f28699d.f28691a.g(n.f28667b);
                    if (objG == null) {
                        objG = null;
                    }
                    boolean z12 = objG != null;
                    if (!qVar.f58482a.P) {
                        cVarX1 = f2.c.f26571e;
                    } else if (z12) {
                        cVarX1 = y2.f.v(qVar, 8).x1();
                    } else {
                        k1 k1VarV = y2.f.v(qVar, 8);
                        cVarX1 = w2.a0.h(k1VarV).E(k1VarV, true);
                    }
                }
                v3.k kVarA = g0.A(cVarX1);
                region.set(kVarA.f53494a, kVarA.f53495b, kVarA.f53496c, kVarA.f53497d);
                if (i12 == i11) {
                    i12 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (tVar2.f28700e) {
                        t tVarL = tVar2.l();
                        xVar.h(i12, new u(tVar2, g0.A((tVarL == null || (i0Var = tVarL.f28698c) == null || !i0Var.J()) ? f28709a : tVarL.g())));
                        return;
                    } else {
                        if (i12 == -1) {
                            Rect bounds = region.getBounds();
                            xVar.h(i12, new u(tVar2, new v3.k(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                xVar.h(i12, new u(tVar2, new v3.k(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List listJ = t.j(4, tVar2);
                int size = listJ.size() - 1;
                while (-1 < size) {
                    if (!((Boolean) cVar.invoke(listJ.get(size))).booleanValue()) {
                        c(jVar4, tVar3, xVar, cVar, (t) listJ.get(size), jVar3);
                    }
                    size--;
                    jVar4 = jVar;
                    tVar3 = tVar;
                    jVar3 = jVar2;
                }
                if (f(tVar2)) {
                    region2.op(kVarA.f53494a, kVarA.f53495b, kVarA.f53496c, kVarA.f53497d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final Object d(o oVar, a0 a0Var) {
        Object objG = oVar.f28691a.g(a0Var);
        if (objG == null) {
            return null;
        }
        return objG;
    }

    public static final boolean e(t tVar) {
        k1 k1VarD = tVar.d();
        o oVar = tVar.f28699d;
        if (k1VarD != null ? k1VarD.k1() : false) {
            return true;
        }
        a0 a0Var = x.f28710a;
        if (oVar.f28691a.c(x.f28724p)) {
            return true;
        }
        return oVar.f28691a.c(x.f28723o);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[LOOP:0: B:9:0x001b->B:21:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x005b A[SYNTHETIC] */
    public static final boolean f(t tVar) {
        if (!e(tVar)) {
            o oVar = tVar.f28699d;
            if (oVar.f28693c) {
                return true;
            }
            y.i0 i0Var = oVar.f28691a;
            Object[] objArr = i0Var.f56714b;
            Object[] objArr2 = i0Var.f56715c;
            long[] jArr = i0Var.f56713a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j11 = jArr[i11];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((255 & j11) < 128) {
                                int i14 = (i11 << 3) + i13;
                                Object obj = objArr[i14];
                                Object obj2 = objArr2[i14];
                                if (((a0) obj).f28638c) {
                                    return true;
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i12 == 8) {
                            if (i11 != length) {
                                i11++;
                            }
                        }
                    } else if (i11 != length) {
                        i11++;
                    }
                }
            }
        }
        return false;
    }
}
