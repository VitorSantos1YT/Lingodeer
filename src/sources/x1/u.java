package x1;

import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import l1.r1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fz.c f55724a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f55726c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ui.k f55731h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public t f55732i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f55725b = new AtomicReference(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mt.r f55727d = new mt.r(this, 21);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s0.a f55728e = new s0.a(this, 25);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n1.e f55729f = new n1.e(new t[16]);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f55730g = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f55733j = -1;

    public u(fz.c cVar) {
        this.f55724a = cVar;
    }

    public final void a() {
        synchronized (this.f55730g) {
            n1.e eVar = this.f55729f;
            Object[] objArr = eVar.f43112a;
            int i11 = eVar.f43114c;
            for (int i12 = 0; i12 < i11; i12++) {
                t tVar = (t) objArr[i12];
                tVar.f55716e.a();
                tVar.f55717f.a();
                tVar.f55723l.a();
                tVar.m.clear();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0073 A[Catch: all -> 0x0090, LOOP:1: B:12:0x002e->B:23:0x0073, LOOP_END, TryCatch #0 {all -> 0x0090, blocks: (B:4:0x0007, B:6:0x000f, B:24:0x007a, B:26:0x0082, B:31:0x0092, B:28:0x0087, B:9:0x0022, B:12:0x002e, B:14:0x0043, B:16:0x0051, B:18:0x005b, B:19:0x0066, B:23:0x0073, B:32:0x0098), top: B:37:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x007a A[EDGE_INSN: B:44:0x007a->B:24:0x007a BREAK  A[LOOP:1: B:12:0x002e->B:23:0x0073], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public final void b(Object obj) {
        int i11;
        synchronized (this.f55730g) {
            try {
                n1.e eVar = this.f55729f;
                int i12 = eVar.f43114c;
                int i13 = 0;
                int i14 = 0;
                while (i13 < i12) {
                    t tVar = (t) eVar.f43112a[i13];
                    y.d0 d0Var = (y.d0) tVar.f55717f.k(obj);
                    if (d0Var == null) {
                        i11 = i13;
                    } else {
                        Object[] objArr = d0Var.f56678b;
                        int[] iArr = d0Var.f56679c;
                        long[] jArr = d0Var.f56677a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i15 = 0;
                            while (true) {
                                long j11 = jArr[i15];
                                i11 = i13;
                                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                                    for (int i17 = 0; i17 < i16; i17++) {
                                        if ((j11 & 255) < 128) {
                                            int i18 = (i15 << 3) + i17;
                                            Object obj2 = objArr[i18];
                                            int i19 = iArr[i18];
                                            tVar.c(obj, obj2);
                                        }
                                        j11 >>= 8;
                                    }
                                    if (i16 != 8) {
                                        break;
                                    }
                                    if (i15 != length) {
                                        break;
                                    }
                                    i15++;
                                    i13 = i11;
                                } else if (i15 != length) {
                                    break;
                                    break;
                                } else {
                                    i15++;
                                    i13 = i11;
                                }
                            }
                        } else {
                            i11 = i13;
                        }
                    }
                    if (!tVar.f55717f.j()) {
                        i14++;
                    } else if (i14 > 0) {
                        Object[] objArr2 = eVar.f43112a;
                        objArr2[i11 - i14] = objArr2[i11];
                    }
                    i13 = i11 + 1;
                }
                int i21 = i12 - i14;
                Arrays.fill(eVar.f43112a, i21, i12, (Object) null);
                eVar.f43114c = i21;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c() {
        boolean z11;
        Set set;
        Set set2;
        synchronized (this.f55730g) {
            z11 = this.f55726c;
        }
        if (z11) {
            return false;
        }
        boolean z12 = false;
        while (true) {
            AtomicReference atomicReference = this.f55725b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                Object obj2 = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        l1.u.b("Unexpected notification");
                        throw new KotlinNothingValueException();
                    }
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                    obj2 = objSubList;
                }
                do {
                    if (atomicReference.compareAndSet(obj, obj2)) {
                        set = set2;
                        break;
                    }
                } while (atomicReference.get() == obj);
            }
            if (set == null) {
                return z12;
            }
            synchronized (this.f55730g) {
                n1.e eVar = this.f55729f;
                Object[] objArr = eVar.f43112a;
                int i11 = eVar.f43114c;
                for (int i12 = 0; i12 < i11; i12++) {
                    z12 = ((t) objArr[i12]).a(set) || z12;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    public final void e() {
        mt.r rVar = this.f55727d;
        l.e(l.f55689a);
        synchronized (l.f55691c) {
            l.f55696h = ry.m.G0(rVar, l.f55696h);
        }
        this.f55731h = new ui.k(rVar, 6);
    }

    /* JADX WARN: Code duplicated, block: B:85:0x01cb  */
    public final void d(Object obj, fz.c cVar, fz.a aVar) {
        Object obj2;
        t tVar;
        boolean z11;
        y.d0 d0Var;
        f c0Var;
        Object obj3;
        Object obj4;
        long[] jArr;
        int i11;
        long[] jArr2;
        long j11;
        synchronized (this.f55730g) {
            n1.e eVar = this.f55729f;
            Object[] objArr = eVar.f43112a;
            int i12 = eVar.f43114c;
            int i13 = 0;
            while (true) {
                if (i13 >= i12) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i13];
                if (((t) obj2).f55712a == cVar) {
                    break;
                } else {
                    i13++;
                }
            }
            tVar = (t) obj2;
            z11 = true;
            if (tVar == null) {
                kotlin.jvm.internal.m.d(cVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                kotlin.jvm.internal.c0.d(1, cVar);
                tVar = new t(cVar);
                eVar.c(tVar);
            }
        }
        t tVar2 = this.f55732i;
        long j12 = this.f55733j;
        if (j12 != -1 && j12 != t1.e.c()) {
            StringBuilder sbJ = w4.c.j(j12, "Detected multithreaded access to SnapshotStateObserver: previousThreadId=", "), currentThread={id=");
            sbJ.append(t1.e.c());
            sbJ.append(", name=");
            sbJ.append(Thread.currentThread().getName());
            sbJ.append(gkbGsXmgaxRjJ.XUQBgEUKkFPcsVy);
            r1.a(sbJ.toString());
        }
        try {
            this.f55732i = tVar;
            this.f55733j = t1.e.c();
            s0.a aVar2 = this.f55728e;
            Object obj5 = tVar.f55713b;
            y.d0 d0Var2 = tVar.f55714c;
            int i14 = tVar.f55715d;
            tVar.f55713b = obj;
            tVar.f55714c = (y.d0) tVar.f55717f.g(obj);
            if (tVar.f55715d == -1) {
                tVar.f55715d = Long.hashCode(l.j().g());
            }
            l1.r rVar = tVar.f55720i;
            n1.e eVarR = l1.t.r();
            try {
                eVarR.c(rVar);
                if (aVar2 == null) {
                    aVar.invoke();
                    d0Var = d0Var2;
                } else {
                    f fVar = (f) l.f55690b.e();
                    if (fVar instanceof c0) {
                        d0Var = d0Var2;
                        if (((c0) fVar).f55659t == t1.e.c()) {
                            fz.c cVar2 = ((c0) fVar).f55657r;
                            fz.c cVar3 = ((c0) fVar).f55658s;
                            try {
                                ((c0) fVar).f55657r = l.k(aVar2, cVar2, true);
                                ((c0) fVar).f55658s = cVar3;
                                aVar.invoke();
                                ((c0) fVar).f55657r = cVar2;
                                ((c0) fVar).f55658s = cVar3;
                            } catch (Throwable th2) {
                                ((c0) fVar).f55657r = cVar2;
                                ((c0) fVar).f55658s = cVar3;
                                throw th2;
                            }
                        }
                    } else {
                        d0Var = d0Var2;
                    }
                    if (fVar == null || (fVar instanceof b)) {
                        c0Var = new c0(fVar instanceof b ? (b) fVar : null, aVar2, null, true, false);
                    } else {
                        c0Var = fVar.u(aVar2);
                    }
                    try {
                        f fVarJ = c0Var.j();
                        try {
                            aVar.invoke();
                            f.q(fVarJ);
                            c0Var.c();
                        } catch (Throwable th3) {
                            try {
                                f.q(fVarJ);
                                throw th3;
                            } catch (Throwable th4) {
                                th = th4;
                                try {
                                    c0Var.c();
                                    throw th;
                                } catch (Throwable th5) {
                                    th = th5;
                                    eVarR.l(eVarR.f43114c - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                eVarR.l(eVarR.f43114c - 1);
                Object obj6 = tVar.f55713b;
                kotlin.jvm.internal.m.c(obj6);
                int i15 = tVar.f55715d;
                y.d0 d0Var3 = tVar.f55714c;
                if (d0Var3 != null) {
                    long[] jArr3 = d0Var3.f56677a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i16 = 0;
                        while (true) {
                            long j13 = jArr3[i16];
                            boolean z12 = z11;
                            obj4 = obj5;
                            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i17 = 8 - ((~(i16 - length)) >>> 31);
                                int i18 = 0;
                                while (i18 < i17) {
                                    if ((j13 & 255) < 128) {
                                        i11 = i18;
                                        int i19 = (i16 << 3) + i11;
                                        jArr2 = jArr3;
                                        Object obj7 = d0Var3.f56678b[i19];
                                        j11 = j13;
                                        boolean z13 = d0Var3.f56679c[i19] != i15 ? z12 : false;
                                        if (z13) {
                                            tVar.c(obj6, obj7);
                                        }
                                        if (z13) {
                                            d0Var3.f(i19);
                                        }
                                    } else {
                                        i11 = i18;
                                        jArr2 = jArr3;
                                        j11 = j13;
                                    }
                                    j13 = j11 >> 8;
                                    i18 = i11 + 1;
                                    jArr3 = jArr2;
                                }
                                jArr = jArr3;
                                if (i17 != 8) {
                                    break;
                                }
                            } else {
                                jArr = jArr3;
                            }
                            if (i16 == length) {
                                break;
                            }
                            i16++;
                            z11 = z12;
                            obj5 = obj4;
                            jArr3 = jArr;
                        }
                        obj3 = obj4;
                    } else {
                        obj3 = obj5;
                    }
                } else {
                    obj3 = obj5;
                }
                tVar.f55713b = obj3;
                tVar.f55714c = d0Var;
                tVar.f55715d = i14;
                this.f55732i = tVar2;
                this.f55733j = j12;
            } catch (Throwable th7) {
                th = th7;
                eVarR.l(eVarR.f43114c - 1);
                throw th;
            }
        } catch (Throwable th8) {
            this.f55732i = tVar2;
            this.f55733j = j12;
            throw th8;
        }
    }
}
