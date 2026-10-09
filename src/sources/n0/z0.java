package n0;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import w2.n1;
import w2.p1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ob.m f43043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fz.c f43044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v3.a f43045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n1 f43046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f43047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f43048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f43049h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f43050i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f43051j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public y0 f43052k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f43053l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f43054n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f43055o = pz.j.a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ bq.f f43056p;

    public z0(bq.f fVar, int i11, ob.m mVar, fz.c cVar) {
        this.f43056p = fVar;
        this.f43042a = i11;
        this.f43043b = mVar;
        this.f43044c = cVar;
    }

    @Override // n0.k0
    public final void a() {
        this.f43053l = true;
    }

    public final void b() {
        n1 n1Var = this.f43046e;
        if (n1Var != null) {
            n1Var.dispose();
        }
        this.f43046e = null;
        this.f43052k = null;
    }

    public final boolean c(l.j0 j0Var) {
        boolean zD;
        if (!this.f43056p.f4943a) {
            return false;
        }
        if (this.f43053l) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zD = d(j0Var);
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } else {
            zD = d(j0Var);
        }
        c3.c.r(-1L, "compose:lazy:prefetch:execute:item");
        return zD;
    }

    @Override // n0.k0
    public final void cancel() {
        if (this.f43048g) {
            return;
        }
        this.f43048g = true;
        b();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x020f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0212 A[Catch: all -> 0x01f0, TryCatch #0 {all -> 0x01f0, blocks: (B:77:0x01b1, B:79:0x01b9, B:81:0x01bf, B:86:0x01cb, B:88:0x01d7, B:90:0x01ed, B:89:0x01da, B:93:0x01f2, B:94:0x01f9, B:96:0x0201, B:102:0x0212, B:103:0x0214, B:107:0x0222, B:108:0x0228), top: B:162:0x01b1 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0222 A[Catch: all -> 0x01f0, LOOP:2: B:94:0x01f9->B:107:0x0222, LOOP_END, TRY_ENTER, TryCatch #0 {all -> 0x01f0, blocks: (B:77:0x01b1, B:79:0x01b9, B:81:0x01bf, B:86:0x01cb, B:88:0x01d7, B:90:0x01ed, B:89:0x01da, B:93:0x01f2, B:94:0x01f9, B:96:0x0201, B:102:0x0212, B:103:0x0214, B:107:0x0222, B:108:0x0228), top: B:162:0x01b1 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0244  */
    /* JADX WARN: Code duplicated, block: B:121:0x0252  */
    /* JADX WARN: Code duplicated, block: B:124:0x025b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x0267  */
    /* JADX WARN: Code duplicated, block: B:131:0x0285  */
    /* JADX WARN: Code duplicated, block: B:138:0x0295  */
    /* JADX WARN: Code duplicated, block: B:158:0x02e9 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:174:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x021e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0148  */
    /* JADX WARN: Code duplicated, block: B:53:0x014c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0152  */
    /* JADX WARN: Code duplicated, block: B:61:0x0168  */
    /* JADX WARN: Code duplicated, block: B:63:0x016c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0180  */
    /* JADX WARN: Code duplicated, block: B:68:0x0188  */
    /* JADX WARN: Code duplicated, block: B:72:0x0199 A[Catch: all -> 0x01a6, TRY_LEAVE, TryCatch #2 {all -> 0x01a6, blocks: (B:70:0x0192, B:72:0x0199), top: B:166:0x0192 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01b9 A[Catch: all -> 0x01f0, TryCatch #0 {all -> 0x01f0, blocks: (B:77:0x01b1, B:79:0x01b9, B:81:0x01bf, B:86:0x01cb, B:88:0x01d7, B:90:0x01ed, B:89:0x01da, B:93:0x01f2, B:94:0x01f9, B:96:0x0201, B:102:0x0212, B:103:0x0214, B:107:0x0222, B:108:0x0228), top: B:162:0x01b1 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01bf A[Catch: all -> 0x01f0, TRY_LEAVE, TryCatch #0 {all -> 0x01f0, blocks: (B:77:0x01b1, B:79:0x01b9, B:81:0x01bf, B:86:0x01cb, B:88:0x01d7, B:90:0x01ed, B:89:0x01da, B:93:0x01f2, B:94:0x01f9, B:96:0x0201, B:102:0x0212, B:103:0x0214, B:107:0x0222, B:108:0x0228), top: B:162:0x01b1 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01cb A[Catch: all -> 0x01f0, TRY_ENTER, TryCatch #0 {all -> 0x01f0, blocks: (B:77:0x01b1, B:79:0x01b9, B:81:0x01bf, B:86:0x01cb, B:88:0x01d7, B:90:0x01ed, B:89:0x01da, B:93:0x01f2, B:94:0x01f9, B:96:0x0201, B:102:0x0212, B:103:0x0214, B:107:0x0222, B:108:0x0228), top: B:162:0x01b1 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01d7 A[Catch: all -> 0x01f0, TryCatch #0 {all -> 0x01f0, blocks: (B:77:0x01b1, B:79:0x01b9, B:81:0x01bf, B:86:0x01cb, B:88:0x01d7, B:90:0x01ed, B:89:0x01da, B:93:0x01f2, B:94:0x01f9, B:96:0x0201, B:102:0x0212, B:103:0x0214, B:107:0x0222, B:108:0x0228), top: B:162:0x01b1 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01da A[Catch: all -> 0x01f0, TryCatch #0 {all -> 0x01f0, blocks: (B:77:0x01b1, B:79:0x01b9, B:81:0x01bf, B:86:0x01cb, B:88:0x01d7, B:90:0x01ed, B:89:0x01da, B:93:0x01f2, B:94:0x01f9, B:96:0x0201, B:102:0x0212, B:103:0x0214, B:107:0x0222, B:108:0x0228), top: B:162:0x01b1 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0201 A[Catch: all -> 0x01f0, TryCatch #0 {all -> 0x01f0, blocks: (B:77:0x01b1, B:79:0x01b9, B:81:0x01bf, B:86:0x01cb, B:88:0x01d7, B:90:0x01ed, B:89:0x01da, B:93:0x01f2, B:94:0x01f9, B:96:0x0201, B:102:0x0212, B:103:0x0214, B:107:0x0222, B:108:0x0228), top: B:162:0x01b1 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x020b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x020d  */
    public final boolean d(l.j0 j0Var) {
        y0 y0Var;
        y0 y0Var2;
        v3.a aVar;
        fz.c cVar;
        y0 y0Var3;
        int i11;
        boolean z11;
        List[] listArr;
        int i12;
        List list;
        int size;
        int i13;
        List list2;
        z0 z0Var;
        z0 z0Var2;
        l0 l0Var;
        fz.c cVar2;
        List list3;
        int i14 = this.f43042a;
        long j11 = i14;
        c3.c.r(j11, "compose:lazy:prefetch:execute:item");
        bq.f fVar = this.f43056p;
        a0 a0Var = (a0) ((y) fVar.f4944b).f43030b.invoke();
        if (!this.f43048g) {
            int itemCount = a0Var.getItemCount();
            if (i14 >= 0 && i14 < itemCount) {
                Object objA = a0Var.a(i14);
                Object obj = this.f43050i;
                if (obj != null && !objA.equals(obj)) {
                    b();
                    return false;
                }
                Object objB = a0Var.b(i14);
                ob.m mVar = this.f43043b;
                b bVar = (b) mVar.f44828d;
                if (mVar.f44827c != objB || bVar == null) {
                    y.i0 i0Var = (y.i0) mVar.f44826b;
                    Object objG = i0Var.g(objB);
                    Object obj2 = objG;
                    if (objG == null) {
                        b bVar2 = new b();
                        bVar2.f42920d = -1;
                        i0Var.m(objB, bVar2);
                        obj2 = bVar2;
                    }
                    bVar = (b) obj2;
                    mVar.f44827c = objB;
                    mVar.f44828d = bVar;
                }
                e();
                long jA = j0Var.a();
                this.m = jA;
                this.f43055o = pz.j.a();
                this.f43054n = 0L;
                c3.c.r(jA, "compose:lazy:prefetch:available_time_nanos");
                if (!e()) {
                    if (h(this.m, bVar.f42917a)) {
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            if (this.f43046e != null) {
                                i0.a.a("Request was already composed!");
                            }
                            fz.e eVarA = ((y) fVar.f4944b).a(i14, objA, objB);
                            this.f43050i = objA;
                            w2.m0 m0VarA = ((p1) fVar.f4945c).a();
                            y2.i0 i0Var2 = m0VarA.f54542a;
                            if (i0Var2.I()) {
                                m0VarA.g();
                                if (!m0VarA.f54548t.c(objA)) {
                                    m0VarA.N.k(objA);
                                    y.i0 i0Var3 = m0VarA.L;
                                    Object objG2 = i0Var3.g(objA);
                                    if (objG2 == null) {
                                        objG2 = m0VarA.m(objA);
                                        if (objG2 != null) {
                                            m0VarA.i(((n1.e) ((n1.b) i0Var2.p()).f43104b).j(objG2), ((n1.e) ((n1.b) i0Var2.p()).f43104b).f43114c);
                                            m0VarA.Q++;
                                        } else {
                                            int i15 = ((n1.e) ((n1.b) i0Var2.p()).f43104b).f43114c;
                                            y2.i0 i0Var4 = new y2.i0(2);
                                            i0Var2.T = true;
                                            i0Var2.C(i15, i0Var4);
                                            i0Var2.T = false;
                                            m0VarA.Q++;
                                            objG2 = i0Var4;
                                        }
                                        i0Var3.m(objA, objG2);
                                    }
                                    m0VarA.l((y2.i0) objG2, objA, false, eVarA);
                                }
                            }
                            this.f43046e = m0VarA.e(objA);
                            this.f43049h = true;
                            Trace.endSection();
                            i();
                            bVar.f42917a = b.a(this.f43054n, bVar.f42917a);
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    }
                    if (e()) {
                        if (this.f43051j) {
                            y0Var = this.f43052k;
                            if (y0Var != null) {
                                i11 = bVar.f42920d;
                                z11 = this.f43053l;
                                listArr = (List[]) y0Var.f43036e;
                                i12 = y0Var.f43032a;
                                list = y0Var.f43035d;
                                if (i12 < list.size()) {
                                    if (((z0) y0Var.f43037f).f43048g) {
                                        i0.a.c("Should not execute nested prefetch on canceled request");
                                    }
                                    Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                                    size = list.size();
                                    for (i13 = 0; i13 < size; i13++) {
                                        ((l0) list.get(i13)).f42971d = i11;
                                    }
                                    Trace.endSection();
                                    Trace.beginSection("compose:lazy:prefetch:nested");
                                    while (y0Var.f43032a < list.size()) {
                                        if (listArr[y0Var.f43032a] == null) {
                                            if (j0Var.a() <= 0) {
                                                Trace.endSection();
                                                return true;
                                            }
                                            int i16 = y0Var.f43032a;
                                            l0Var = (l0) list.get(i16);
                                            cVar2 = l0Var.f42968a;
                                            if (cVar2 == null) {
                                                list3 = ry.r.f50854a;
                                            } else {
                                                j0 j0Var2 = new j0(l0Var, l0Var.f42971d);
                                                cVar2.invoke(j0Var2);
                                                ArrayList arrayList = j0Var2.f42962b;
                                                l0Var.f42973f = arrayList.size();
                                                list3 = arrayList;
                                            }
                                            listArr[i16] = list3;
                                        }
                                        list2 = listArr[y0Var.f43032a];
                                        kotlin.jvm.internal.m.c(list2);
                                        while (y0Var.f43033b < list2.size()) {
                                            z0Var = (z0) list2.get(y0Var.f43033b);
                                            if (z11) {
                                                if (z0Var != null) {
                                                    z0Var2 = z0Var;
                                                } else {
                                                    z0Var2 = null;
                                                }
                                                if (z0Var2 != null) {
                                                    z0Var2.f43053l = true;
                                                }
                                            }
                                            y0Var.f43034c = true;
                                            if (z0Var.c(j0Var)) {
                                                Trace.endSection();
                                                return true;
                                            }
                                            y0Var.f43033b++;
                                        }
                                        y0Var.f43033b = 0;
                                        y0Var.f43032a++;
                                    }
                                    Trace.endSection();
                                }
                            }
                            y0Var2 = this.f43052k;
                            if (y0Var2 != null) {
                                i();
                                c3.c.r(j11, "compose:lazy:prefetch:execute:item");
                                y0Var3 = this.f43052k;
                                if (y0Var3 != null) {
                                    y0Var3.f43034c = false;
                                }
                            }
                            aVar = this.f43045d;
                            if (!this.f43047f) {
                                if (h(this.m, bVar.f42919c)) {
                                    Trace.beginSection("compose:lazy:prefetch:measure");
                                    f(aVar.f53483a);
                                    Trace.endSection();
                                    i();
                                    bVar.f42919c = b.a(this.f43054n, bVar.f42919c);
                                    cVar = this.f43044c;
                                    if (cVar != null) {
                                        cVar.invoke(this);
                                    }
                                }
                            }
                            y0 y0Var4 = this.f43052k;
                            if (this.f43047f) {
                                return false;
                            }
                            return false;
                        }
                        if (this.m > 0) {
                            Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                            this.f43052k = g();
                            this.f43051j = true;
                            Trace.endSection();
                            y0Var = this.f43052k;
                            if (y0Var != null) {
                                i11 = bVar.f42920d;
                                z11 = this.f43053l;
                                listArr = (List[]) y0Var.f43036e;
                                i12 = y0Var.f43032a;
                                list = y0Var.f43035d;
                                if (i12 < list.size()) {
                                    if (((z0) y0Var.f43037f).f43048g) {
                                        i0.a.c("Should not execute nested prefetch on canceled request");
                                    }
                                    Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                                    size = list.size();
                                    while (i13 < size) {
                                        ((l0) list.get(i13)).f42971d = i11;
                                    }
                                    Trace.endSection();
                                    Trace.beginSection("compose:lazy:prefetch:nested");
                                    while (y0Var.f43032a < list.size()) {
                                        if (listArr[y0Var.f43032a] == null) {
                                            if (j0Var.a() <= 0) {
                                                Trace.endSection();
                                                return true;
                                            }
                                            int i17 = y0Var.f43032a;
                                            l0Var = (l0) list.get(i17);
                                            cVar2 = l0Var.f42968a;
                                            if (cVar2 == null) {
                                                list3 = ry.r.f50854a;
                                            } else {
                                                j0 j0Var3 = new j0(l0Var, l0Var.f42971d);
                                                cVar2.invoke(j0Var3);
                                                ArrayList arrayList2 = j0Var3.f42962b;
                                                l0Var.f42973f = arrayList2.size();
                                                list3 = arrayList2;
                                            }
                                            listArr[i17] = list3;
                                        }
                                        list2 = listArr[y0Var.f43032a];
                                        kotlin.jvm.internal.m.c(list2);
                                        while (y0Var.f43033b < list2.size()) {
                                            z0Var = (z0) list2.get(y0Var.f43033b);
                                            if (z11) {
                                                if (z0Var != null) {
                                                    z0Var2 = z0Var;
                                                } else {
                                                    z0Var2 = null;
                                                }
                                                if (z0Var2 != null) {
                                                    z0Var2.f43053l = true;
                                                }
                                            }
                                            y0Var.f43034c = true;
                                            if (z0Var.c(j0Var)) {
                                                Trace.endSection();
                                                return true;
                                            }
                                            y0Var.f43033b++;
                                        }
                                        y0Var.f43033b = 0;
                                        y0Var.f43032a++;
                                    }
                                    Trace.endSection();
                                }
                            }
                            y0Var2 = this.f43052k;
                            if (y0Var2 != null) {
                                i();
                                c3.c.r(j11, "compose:lazy:prefetch:execute:item");
                                y0Var3 = this.f43052k;
                                if (y0Var3 != null) {
                                    y0Var3.f43034c = false;
                                }
                            }
                            aVar = this.f43045d;
                            if (!this.f43047f) {
                                if (h(this.m, bVar.f42919c)) {
                                    Trace.beginSection("compose:lazy:prefetch:measure");
                                    f(aVar.f53483a);
                                    Trace.endSection();
                                    i();
                                    bVar.f42919c = b.a(this.f43054n, bVar.f42919c);
                                    cVar = this.f43044c;
                                    if (cVar != null) {
                                        cVar.invoke(this);
                                    }
                                }
                            }
                            y0 y0Var5 = this.f43052k;
                            if (this.f43047f) {
                                return false;
                            }
                            return false;
                        }
                    }
                } else {
                    if (this.f43051j) {
                        y0Var = this.f43052k;
                        if (y0Var != null) {
                            i11 = bVar.f42920d;
                            z11 = this.f43053l;
                            listArr = (List[]) y0Var.f43036e;
                            i12 = y0Var.f43032a;
                            list = y0Var.f43035d;
                            if (i12 < list.size()) {
                                if (((z0) y0Var.f43037f).f43048g) {
                                    i0.a.c("Should not execute nested prefetch on canceled request");
                                }
                                Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                                try {
                                    size = list.size();
                                    while (i13 < size) {
                                        ((l0) list.get(i13)).f42971d = i11;
                                    }
                                    Trace.endSection();
                                    Trace.beginSection("compose:lazy:prefetch:nested");
                                    while (y0Var.f43032a < list.size()) {
                                        try {
                                            if (listArr[y0Var.f43032a] == null) {
                                                if (j0Var.a() <= 0) {
                                                    Trace.endSection();
                                                    return true;
                                                }
                                                int i18 = y0Var.f43032a;
                                                l0Var = (l0) list.get(i18);
                                                cVar2 = l0Var.f42968a;
                                                if (cVar2 == null) {
                                                    list3 = ry.r.f50854a;
                                                } else {
                                                    j0 j0Var4 = new j0(l0Var, l0Var.f42971d);
                                                    cVar2.invoke(j0Var4);
                                                    ArrayList arrayList3 = j0Var4.f42962b;
                                                    l0Var.f42973f = arrayList3.size();
                                                    list3 = arrayList3;
                                                }
                                                listArr[i18] = list3;
                                            }
                                            list2 = listArr[y0Var.f43032a];
                                            kotlin.jvm.internal.m.c(list2);
                                            while (y0Var.f43033b < list2.size()) {
                                                z0Var = (z0) list2.get(y0Var.f43033b);
                                                if (z11) {
                                                    if (z0Var != null) {
                                                        z0Var2 = z0Var;
                                                    } else {
                                                        z0Var2 = null;
                                                    }
                                                    if (z0Var2 != null) {
                                                        z0Var2.f43053l = true;
                                                    }
                                                }
                                                y0Var.f43034c = true;
                                                if (z0Var.c(j0Var)) {
                                                    Trace.endSection();
                                                    return true;
                                                }
                                                y0Var.f43033b++;
                                            }
                                            y0Var.f43033b = 0;
                                            y0Var.f43032a++;
                                        } catch (Throwable th3) {
                                            Trace.endSection();
                                            throw th3;
                                        }
                                    }
                                    Trace.endSection();
                                } catch (Throwable th4) {
                                    Trace.endSection();
                                    throw th4;
                                }
                            }
                        }
                        y0Var2 = this.f43052k;
                        if (y0Var2 != null && y0Var2.f43034c) {
                            i();
                            c3.c.r(j11, "compose:lazy:prefetch:execute:item");
                            y0Var3 = this.f43052k;
                            if (y0Var3 != null) {
                                y0Var3.f43034c = false;
                            }
                        }
                        aVar = this.f43045d;
                        if (!this.f43047f && aVar != null) {
                            if (h(this.m, bVar.f42919c)) {
                                Trace.beginSection("compose:lazy:prefetch:measure");
                                try {
                                    f(aVar.f53483a);
                                    Trace.endSection();
                                    i();
                                    bVar.f42919c = b.a(this.f43054n, bVar.f42919c);
                                    cVar = this.f43044c;
                                    if (cVar != null) {
                                        cVar.invoke(this);
                                    }
                                } catch (Throwable th5) {
                                    Trace.endSection();
                                    throw th5;
                                }
                            }
                        }
                        y0 y0Var6 = this.f43052k;
                        if (this.f43047f || !this.f43051j || y0Var6 == null) {
                            return false;
                        }
                        List list4 = y0Var6.f43035d;
                        int size2 = list4.size();
                        int iMin = Integer.MAX_VALUE;
                        for (int i19 = 0; i19 < size2; i19++) {
                            iMin = Math.min(iMin, ((l0) list4.get(i19)).f42972e);
                        }
                        if (iMin == Integer.MAX_VALUE) {
                            iMin = 0;
                        }
                        int i21 = bVar.f42920d;
                        bVar.f42920d = i21 == -1 ? iMin : ((i21 * 3) + iMin) / 4;
                        int size3 = list4.size();
                        int iMin2 = Integer.MAX_VALUE;
                        for (int i22 = 0; i22 < size3; i22++) {
                            iMin2 = Math.min(iMin2, ((l0) list4.get(i22)).f42973f);
                        }
                        if (iMin2 == Integer.MAX_VALUE) {
                            iMin2 = 0;
                        }
                        if (iMin2 >= iMin) {
                            return false;
                        }
                        bVar.f42919c = 0L;
                        return false;
                    }
                    if (this.m > 0) {
                        Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                        try {
                            this.f43052k = g();
                            this.f43051j = true;
                            Trace.endSection();
                            y0Var = this.f43052k;
                            if (y0Var != null) {
                                i11 = bVar.f42920d;
                                z11 = this.f43053l;
                                listArr = (List[]) y0Var.f43036e;
                                i12 = y0Var.f43032a;
                                list = y0Var.f43035d;
                                if (i12 < list.size()) {
                                    if (((z0) y0Var.f43037f).f43048g) {
                                        i0.a.c("Should not execute nested prefetch on canceled request");
                                    }
                                    Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                                    size = list.size();
                                    while (i13 < size) {
                                        ((l0) list.get(i13)).f42971d = i11;
                                    }
                                    Trace.endSection();
                                    Trace.beginSection("compose:lazy:prefetch:nested");
                                    while (y0Var.f43032a < list.size()) {
                                        if (listArr[y0Var.f43032a] == null) {
                                            if (j0Var.a() <= 0) {
                                                Trace.endSection();
                                                return true;
                                            }
                                            int i110 = y0Var.f43032a;
                                            l0Var = (l0) list.get(i110);
                                            cVar2 = l0Var.f42968a;
                                            if (cVar2 == null) {
                                                list3 = ry.r.f50854a;
                                            } else {
                                                j0 j0Var5 = new j0(l0Var, l0Var.f42971d);
                                                cVar2.invoke(j0Var5);
                                                ArrayList arrayList4 = j0Var5.f42962b;
                                                l0Var.f42973f = arrayList4.size();
                                                list3 = arrayList4;
                                            }
                                            listArr[i110] = list3;
                                        }
                                        list2 = listArr[y0Var.f43032a];
                                        kotlin.jvm.internal.m.c(list2);
                                        while (y0Var.f43033b < list2.size()) {
                                            z0Var = (z0) list2.get(y0Var.f43033b);
                                            if (z11) {
                                                if (z0Var != null) {
                                                    z0Var2 = z0Var;
                                                } else {
                                                    z0Var2 = null;
                                                }
                                                if (z0Var2 != null) {
                                                    z0Var2.f43053l = true;
                                                }
                                            }
                                            y0Var.f43034c = true;
                                            if (z0Var.c(j0Var)) {
                                                Trace.endSection();
                                                return true;
                                            }
                                            y0Var.f43033b++;
                                        }
                                        y0Var.f43033b = 0;
                                        y0Var.f43032a++;
                                    }
                                    Trace.endSection();
                                }
                            }
                            y0Var2 = this.f43052k;
                            if (y0Var2 != null) {
                                i();
                                c3.c.r(j11, "compose:lazy:prefetch:execute:item");
                                y0Var3 = this.f43052k;
                                if (y0Var3 != null) {
                                    y0Var3.f43034c = false;
                                }
                            }
                            aVar = this.f43045d;
                            if (!this.f43047f) {
                                if (h(this.m, bVar.f42919c)) {
                                    Trace.beginSection("compose:lazy:prefetch:measure");
                                    f(aVar.f53483a);
                                    Trace.endSection();
                                    i();
                                    bVar.f42919c = b.a(this.f43054n, bVar.f42919c);
                                    cVar = this.f43044c;
                                    if (cVar != null) {
                                        cVar.invoke(this);
                                    }
                                }
                            }
                            y0 y0Var7 = this.f43052k;
                            if (this.f43047f) {
                                return false;
                            }
                            return false;
                        } catch (Throwable th6) {
                            Trace.endSection();
                            throw th6;
                        }
                    }
                }
                return true;
            }
        }
        b();
        return false;
    }

    public final boolean e() {
        return this.f43049h;
    }

    public final void f(long j11) {
        if (this.f43048g) {
            i0.a.a("Callers should check whether the request is still valid before calling performMeasure()");
        }
        if (this.f43047f) {
            i0.a.a("Request was already measured!");
        }
        this.f43047f = true;
        n1 n1Var = this.f43046e;
        if (n1Var == null) {
            i0.a.b("performComposition() must be called before performMeasure()");
            throw new KotlinNothingValueException();
        }
        int iA = n1Var.a();
        for (int i11 = 0; i11 < iA; i11++) {
            n1Var.c(i11, j11);
        }
    }

    public final y0 g() {
        n1 n1Var = this.f43046e;
        if (n1Var == null) {
            i0.a.b("Should precompose before resolving nested prefetch states");
            throw new KotlinNothingValueException();
        }
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        n1Var.d(new fr.e(yVar, 3));
        List list = (List) yVar.f38361a;
        if (list != null) {
            return new y0(this, list);
        }
        return null;
    }

    public final boolean h(long j11, long j12) {
        if (this.f43053l) {
            j12 = 0;
        }
        return j11 > j12;
    }

    public final void i() {
        long j11;
        long jA = pz.j.a();
        long j12 = this.f43055o;
        pz.c unit = pz.c.NANOSECONDS;
        kotlin.jvm.internal.m.f(unit, "unit");
        long j13 = Long.MAX_VALUE;
        if (((j12 - 1) | 1) != Long.MAX_VALUE) {
            j11 = (1 | (jA - 1)) == Long.MAX_VALUE ? pz.f.j(jA) : pz.f.o(jA, j12, unit);
        } else if (jA == j12) {
            int i11 = pz.a.f47220d;
            j11 = 0;
        } else {
            j11 = pz.a.l(pz.f.j(j12));
        }
        long j14 = j11 >> 1;
        int i12 = pz.a.f47220d;
        if ((((int) j11) & 1) == 0) {
            j13 = j14;
        } else if (j14 <= 9223372036854L) {
            j13 = j14 < -9223372036854L ? Long.MIN_VALUE : j14 * ((long) 1000000);
        }
        this.f43054n = j13;
        long j15 = this.m - j13;
        this.m = j15;
        this.f43055o = jA;
        c3.c.r(j15, "compose:lazy:prefetch:available_time_nanos");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HandleAndRequestImpl { index = ");
        sb2.append(this.f43042a);
        sb2.append(", constraints = ");
        sb2.append(this.f43045d);
        sb2.append(", isComposed = ");
        sb2.append(e());
        sb2.append(", isMeasured = ");
        sb2.append(this.f43047f);
        sb2.append(", isCanceled = ");
        return hh.p0.p(sb2, this.f43048g, " }");
    }
}
