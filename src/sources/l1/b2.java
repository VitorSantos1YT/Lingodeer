package l1;

import android.os.Trace;
import com.lingo.lingoskill.idnskill.ui.learn.IDNSyllableIntroductionActivity;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import rt.l9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b2 implements fz.c {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39237a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f39238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f39239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f39240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f39241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f39242f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f39243t;

    public /* synthetic */ b2(List list, IDNSyllableIntroductionActivity iDNSyllableIntroductionActivity, wl.a aVar, List list2, List list3, List list4, List list5, List list6, List list7) {
        this.f39243t = list;
        this.f39238b = iDNSyllableIntroductionActivity;
        this.f39239c = aVar;
        this.H = list2;
        this.K = list3;
        this.f39240d = list4;
        this.f39241e = list5;
        this.f39242f = list6;
        this.L = list7;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x02c7 A[LOOP:6: B:88:0x0289->B:104:0x02c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:121:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:124:0x030f A[Catch: all -> 0x0331, TryCatch #13 {all -> 0x0331, blocks: (B:119:0x02f3, B:122:0x02fd, B:124:0x030f, B:126:0x031b, B:128:0x0321), top: B:253:0x02f3, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x031b A[Catch: all -> 0x0331, TryCatch #13 {all -> 0x0331, blocks: (B:119:0x02f3, B:122:0x02fd, B:124:0x030f, B:126:0x031b, B:128:0x0321), top: B:253:0x02f3, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x0321 A[Catch: all -> 0x0331, TRY_LEAVE, TryCatch #13 {all -> 0x0331, blocks: (B:119:0x02f3, B:122:0x02fd, B:124:0x030f, B:126:0x031b, B:128:0x0321), top: B:253:0x02f3, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x033f  */
    /* JADX WARN: Code duplicated, block: B:138:0x0343 A[LOOP:4: B:122:0x02fd->B:138:0x0343, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:233:0x036a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x02f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x0278 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x034a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x034a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x02ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x02ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0288  */
    /* JADX WARN: Code duplicated, block: B:91:0x029b A[Catch: all -> 0x02b7, TryCatch #17 {all -> 0x02b7, blocks: (B:89:0x028b, B:91:0x029b, B:93:0x02a5, B:95:0x02ab), top: B:261:0x028b }] */
    /* JADX WARN: Code duplicated, block: B:93:0x02a5 A[Catch: all -> 0x02b7, TryCatch #17 {all -> 0x02b7, blocks: (B:89:0x028b, B:91:0x029b, B:93:0x02a5, B:95:0x02ab), top: B:261:0x028b }] */
    /* JADX WARN: Code duplicated, block: B:95:0x02ab A[Catch: all -> 0x02b7, TRY_LEAVE, TryCatch #17 {all -> 0x02b7, blocks: (B:89:0x028b, B:91:0x029b, B:93:0x02a5, B:95:0x02ab), top: B:261:0x028b }] */
    @Override // fz.c
    public final Object invoke(Object obj) {
        boolean z11;
        x1.f d0Var;
        int i11;
        Object[] objArr;
        long[] jArr;
        long j11;
        int length;
        int i12;
        long j12;
        Object[] objArr2;
        int i13;
        int i14;
        Object[] objArr3;
        long[] jArr2;
        int length2;
        int i15;
        long j13;
        Object[] objArr4;
        long[] jArr3;
        int i16;
        int i17;
        boolean z12;
        switch (this.f39237a) {
            case 0:
                d2 d2Var = (d2) this.f39238b;
                y.j0 j0Var = (y.j0) this.f39239c;
                y.j0 j0Var2 = (y.j0) this.f39240d;
                List list = (List) this.f39243t;
                List list2 = (List) this.H;
                y.j0 j0Var3 = (y.j0) this.f39241e;
                List list3 = (List) this.K;
                y.j0 j0Var4 = (y.j0) this.f39242f;
                Set set = (Set) this.L;
                long jLongValue = ((Long) obj).longValue();
                synchronized (d2Var.f39259d) {
                    z11 = d2Var.z();
                }
                if (z11) {
                    Trace.beginSection("Recomposer:animation");
                    try {
                        ((a9.i) d2Var.f39257b.f39290c).m(new au.o(jLongValue, 15));
                        synchronized (x1.l.f55691c) {
                            y.j0 j0Var5 = x1.l.f55698j.f55643h;
                            z12 = j0Var5 != null && j0Var5.h();
                        }
                        if (z12) {
                            x1.l.a();
                        }
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                Trace.beginSection("Recomposer:recompose");
                try {
                    d2Var.K();
                    synchronized (d2Var.f39259d) {
                        try {
                            n1.e eVar = d2Var.f39265j;
                            Object[] objArr5 = eVar.f43112a;
                            int i18 = eVar.f43114c;
                            for (int i19 = 0; i19 < i18; i19++) {
                                list.add((z) objArr5[i19]);
                            }
                            d2Var.f39265j.h();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    j0Var.b();
                    j0Var2.b();
                    while (true) {
                        if (list.isEmpty() && list2.isEmpty()) {
                            x1.f fVarJ = x1.l.j();
                            if (fVarJ instanceof x1.b) {
                                d0Var = new x1.c0((x1.b) fVarJ, null, null, true, false);
                                i11 = 0;
                            } else {
                                i11 = 0;
                                d0Var = new x1.d0(fVarJ, null, true, false);
                            }
                            try {
                                x1.f fVarJ2 = d0Var.j();
                                try {
                                    if (list3.isEmpty()) {
                                        if (j0Var3.h()) {
                                            j0Var4.k(j0Var3);
                                            objArr = j0Var3.f56721b;
                                            jArr = j0Var3.f56720a;
                                            j11 = 128;
                                            length = jArr.length - 2;
                                            if (length >= 0) {
                                                i12 = 0;
                                                while (true) {
                                                    j12 = jArr[i12];
                                                    objArr2 = objArr;
                                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        i13 = 8 - ((~(i12 - length)) >>> 31);
                                                        for (i14 = 0; i14 < i13; i14++) {
                                                            if ((j12 & 255) < 128) {
                                                                ((z) objArr2[(i12 << 3) + i14]).f();
                                                            }
                                                            j12 >>= 8;
                                                        }
                                                        if (i13 == 8) {
                                                            if (i12 != length) {
                                                                i12++;
                                                                objArr = objArr2;
                                                            }
                                                        }
                                                    } else if (i12 != length) {
                                                        i12++;
                                                        objArr = objArr2;
                                                    }
                                                }
                                            }
                                            j0Var3.b();
                                            d2Var = d2Var;
                                        } else {
                                            j11 = 128;
                                        }
                                        if (j0Var4.h()) {
                                            objArr3 = j0Var4.f56721b;
                                            jArr2 = j0Var4.f56720a;
                                            length2 = jArr2.length - 2;
                                            if (length2 >= 0) {
                                                i15 = 0;
                                                while (true) {
                                                    j13 = jArr2[i15];
                                                    objArr4 = objArr3;
                                                    jArr3 = jArr2;
                                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        i16 = 8 - ((~(i15 - length2)) >>> 31);
                                                        for (i17 = 0; i17 < i16; i17++) {
                                                            if ((j13 & 255) < j11) {
                                                                ((z) objArr4[(i15 << 3) + i17]).g();
                                                            }
                                                            j13 >>= 8;
                                                            break;
                                                        }
                                                        if (i16 == 8) {
                                                        }
                                                    }
                                                    if (i15 != length2) {
                                                        i15++;
                                                        objArr3 = objArr4;
                                                        jArr2 = jArr3;
                                                    }
                                                }
                                            }
                                            j0Var4.b();
                                        }
                                        x1.f.q(fVarJ2);
                                        d0Var.c();
                                        synchronized (d2Var.f39259d) {
                                            d2Var.y();
                                            x1.l.j().m();
                                            j0Var2.b();
                                            j0Var.b();
                                            d2Var.f39272r = null;
                                        }
                                    } else {
                                        d2Var.f39256a++;
                                        try {
                                            int size = list3.size();
                                            for (int i21 = i11; i21 < size; i21++) {
                                                j0Var4.a((z) list3.get(i21));
                                            }
                                            int size2 = list3.size();
                                            for (int i22 = i11; i22 < size2; i22++) {
                                                ((z) list3.get(i22)).d();
                                            }
                                            list3.clear();
                                            if (j0Var3.h()) {
                                                try {
                                                    j0Var4.k(j0Var3);
                                                    objArr = j0Var3.f56721b;
                                                    jArr = j0Var3.f56720a;
                                                    j11 = 128;
                                                    length = jArr.length - 2;
                                                    if (length >= 0) {
                                                        i12 = 0;
                                                        while (true) {
                                                            try {
                                                                j12 = jArr[i12];
                                                                objArr2 = objArr;
                                                                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    i13 = 8 - ((~(i12 - length)) >>> 31);
                                                                    while (i14 < i13) {
                                                                        if ((j12 & 255) < 128) {
                                                                            ((z) objArr2[(i12 << 3) + i14]).f();
                                                                        }
                                                                        j12 >>= 8;
                                                                    }
                                                                    if (i13 == 8) {
                                                                        if (i12 != length) {
                                                                            i12++;
                                                                            objArr = objArr2;
                                                                        }
                                                                    }
                                                                } else if (i12 != length) {
                                                                    i12++;
                                                                    objArr = objArr2;
                                                                }
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                d2Var = d2Var;
                                                                try {
                                                                    d2Var.J(th, null);
                                                                    c2.e(d2Var, list, list2, list3, j0Var3, j0Var4, j0Var, j0Var2);
                                                                    j0Var3.b();
                                                                    x1.f.q(fVarJ2);
                                                                    d0Var.c();
                                                                    Trace.endSection();
                                                                    return qy.b0.f48488a;
                                                                } catch (Throwable th5) {
                                                                    j0Var3.b();
                                                                    throw th5;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    j0Var3.b();
                                                    d2Var = d2Var;
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                }
                                            } else {
                                                j11 = 128;
                                            }
                                            if (j0Var4.h()) {
                                                try {
                                                    objArr3 = j0Var4.f56721b;
                                                    jArr2 = j0Var4.f56720a;
                                                    length2 = jArr2.length - 2;
                                                    if (length2 >= 0) {
                                                        i15 = 0;
                                                        while (true) {
                                                            j13 = jArr2[i15];
                                                            objArr4 = objArr3;
                                                            jArr3 = jArr2;
                                                            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                i16 = 8 - ((~(i15 - length2)) >>> 31);
                                                                while (i17 < i16) {
                                                                    if ((j13 & 255) < j11) {
                                                                        ((z) objArr4[(i15 << 3) + i17]).g();
                                                                    }
                                                                    j13 >>= 8;
                                                                    break;
                                                                }
                                                                if (i16 == 8) {
                                                                }
                                                            }
                                                            if (i15 != length2) {
                                                                i15++;
                                                                objArr3 = objArr4;
                                                                jArr2 = jArr3;
                                                            }
                                                        }
                                                    }
                                                    j0Var4.b();
                                                } catch (Throwable th7) {
                                                    try {
                                                        d2Var.J(th7, null);
                                                        c2.e(d2Var, list, list2, list3, j0Var3, j0Var4, j0Var, j0Var2);
                                                        j0Var4.b();
                                                        x1.f.q(fVarJ2);
                                                        d0Var.c();
                                                        Trace.endSection();
                                                        return qy.b0.f48488a;
                                                    } catch (Throwable th8) {
                                                        j0Var4.b();
                                                        throw th8;
                                                    }
                                                }
                                            }
                                            x1.f.q(fVarJ2);
                                            d0Var.c();
                                            synchronized (d2Var.f39259d) {
                                                d2Var.y();
                                            }
                                            x1.l.j().m();
                                            j0Var2.b();
                                            j0Var.b();
                                            d2Var.f39272r = null;
                                        } catch (Throwable th9) {
                                            try {
                                                d2Var.J(th9, null);
                                                c2.e(d2Var, list, list2, list3, j0Var3, j0Var4, j0Var, j0Var2);
                                                list3.clear();
                                                x1.f.q(fVarJ2);
                                                d0Var.c();
                                                Trace.endSection();
                                                return qy.b0.f48488a;
                                            } catch (Throwable th10) {
                                                list3.clear();
                                                throw th10;
                                            }
                                        }
                                    }
                                } catch (Throwable th11) {
                                    x1.f.q(fVarJ2);
                                    throw th11;
                                }
                            } catch (Throwable th12) {
                                d0Var.c();
                                throw th12;
                            }
                        } else {
                            try {
                                int size3 = list.size();
                                for (int i23 = 0; i23 < size3; i23++) {
                                    z zVar = (z) list.get(i23);
                                    z zVarI = d2Var.I(zVar, j0Var);
                                    if (zVarI != null) {
                                        list3.add(zVarI);
                                    }
                                    j0Var2.a(zVar);
                                }
                                list.clear();
                                if (j0Var.h() || d2Var.f39265j.f43114c != 0) {
                                    synchronized (d2Var.f39259d) {
                                        try {
                                            List listD = d2Var.D();
                                            int size4 = listD.size();
                                            for (int i24 = 0; i24 < size4; i24++) {
                                                z zVar2 = (z) listD.get(i24);
                                                if (!j0Var2.c(zVar2) && zVar2.v(set)) {
                                                    list.add(zVar2);
                                                }
                                            }
                                            n1.e eVar2 = d2Var.f39265j;
                                            int i25 = eVar2.f43114c;
                                            int i26 = 0;
                                            for (int i27 = 0; i27 < i25; i27++) {
                                                z zVar3 = (z) eVar2.f43112a[i27];
                                                if (!j0Var2.c(zVar3) && !list.contains(zVar3)) {
                                                    list.add(zVar3);
                                                    i26++;
                                                } else if (i26 > 0) {
                                                    Object[] objArr6 = eVar2.f43112a;
                                                    objArr6[i27 - i26] = objArr6[i27];
                                                }
                                            }
                                            int i28 = i25 - i26;
                                            Arrays.fill(eVar2.f43112a, i28, i25, (Object) null);
                                            eVar2.f43114c = i28;
                                        } catch (Throwable th13) {
                                            throw th13;
                                        }
                                    }
                                }
                                if (list.isEmpty()) {
                                    try {
                                        c2.j(list2, d2Var);
                                        while (!list2.isEmpty()) {
                                            List listH = d2Var.H(list2, j0Var);
                                            j0Var3.getClass();
                                            Iterator it = listH.iterator();
                                            while (it.hasNext()) {
                                                j0Var3.j(it.next());
                                            }
                                            c2.j(list2, d2Var);
                                        }
                                    } catch (Throwable th14) {
                                        d2Var.J(th14, null);
                                        c2.e(d2Var, list, list2, list3, j0Var3, j0Var4, j0Var, j0Var2);
                                    }
                                }
                            } catch (Throwable th15) {
                                try {
                                    d2Var.J(th15, null);
                                    c2.e(d2Var, list, list2, list3, j0Var3, j0Var4, j0Var, j0Var2);
                                    list.clear();
                                } catch (Throwable th16) {
                                    list.clear();
                                    throw th16;
                                }
                            }
                        }
                        Trace.endSection();
                        return qy.b0.f48488a;
                    }
                } catch (Throwable th17) {
                    Trace.endSection();
                    throw th17;
                }
            case 1:
                rt.e3 e3Var = (rt.e3) this.f39238b;
                fz.c cVar = (fz.c) this.f39239c;
                l9 l9Var = (l9) this.f39240d;
                fz.a aVar = (fz.a) this.f39241e;
                j9.v vVar = (j9.v) this.f39242f;
                fz.c cVar2 = (fz.c) this.f39243t;
                b1 b1Var = (b1) this.H;
                fz.a aVar2 = (fz.a) this.K;
                a1 a1Var = (a1) this.L;
                j9.t NavHost = (j9.t) obj;
                kotlin.jvm.internal.m.f(NavHost, "$this$NavHost");
                c.a.g(NavHost, "course_test", null, null, new t1.d(new iv.b0(cVar, e3Var, l9Var, aVar, vVar, cVar2), true, 2075107710), 254);
                c.a.g(NavHost, "customize_srs_suggestions", null, null, new t1.d(new bp.b2(e3Var, b1Var, vVar, 9), true, -584944281), 254);
                c.a.g(NavHost, "course_test_finish", null, null, new t1.d(new fu.d(e3Var, aVar2, b1Var, a1Var, cVar2), true, 1898455814), 254);
                break;
            default:
                List list4 = (List) this.f39243t;
                IDNSyllableIntroductionActivity iDNSyllableIntroductionActivity = (IDNSyllableIntroductionActivity) this.f39238b;
                wl.a aVar3 = (wl.a) this.f39239c;
                List list5 = (List) this.H;
                List list6 = (List) this.K;
                List list7 = (List) this.f39240d;
                List list8 = (List) this.f39241e;
                List list9 = (List) this.f39242f;
                List list10 = (List) this.L;
                m0.j LazyVerticalGrid = (m0.j) obj;
                int i29 = IDNSyllableIntroductionActivity.P;
                kotlin.jvm.internal.m.f(LazyVerticalGrid, "$this$LazyVerticalGrid");
                m0.j.p(LazyVerticalGrid, new st.a(16), new t1.d(new qu.s(iDNSyllableIntroductionActivity, 3), true, 783701361), 5);
                LazyVerticalGrid.q(list4.size(), null, null, new qu.m(6, list4), new t1.d(new dl.n(list4, iDNSyllableIntroductionActivity, aVar3, 5), true, -1117249557));
                m0.j.p(LazyVerticalGrid, new st.a(17), new t1.d(new br.j(iDNSyllableIntroductionActivity, list5, list6, aVar3, 16), true, 1853480858), 5);
                m0.j.p(LazyVerticalGrid, new st.a(18), new t1.d(new es.h(iDNSyllableIntroductionActivity, list7, list8, list9, list10, aVar3, 8), true, 1682641401), 5);
                m0.j.p(LazyVerticalGrid, null, tl.a.f52429b, 7);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ b2(d2 d2Var, y.j0 j0Var, y.j0 j0Var2, List list, List list2, y.j0 j0Var3, List list3, y.j0 j0Var4, Set set) {
        this.f39238b = d2Var;
        this.f39239c = j0Var;
        this.f39240d = j0Var2;
        this.f39243t = list;
        this.H = list2;
        this.f39241e = j0Var3;
        this.K = list3;
        this.f39242f = j0Var4;
        this.L = set;
    }

    public /* synthetic */ b2(rt.e3 e3Var, fz.c cVar, l9 l9Var, fz.a aVar, j9.v vVar, fz.c cVar2, b1 b1Var, fz.a aVar2, a1 a1Var) {
        this.f39238b = e3Var;
        this.f39239c = cVar;
        this.f39240d = l9Var;
        this.f39241e = aVar;
        this.f39242f = vVar;
        this.f39243t = cVar2;
        this.H = b1Var;
        this.K = aVar2;
        this.L = a1Var;
    }
}
