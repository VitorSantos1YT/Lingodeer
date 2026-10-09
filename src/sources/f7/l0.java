package f7;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.MultimapBuilder;
import com.google.common.collect.UnmodifiableListIterator;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import y6.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f26825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f26826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p7.z0[] f26827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f26828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f26829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f26830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m0 f26831g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f26832h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean[] f26833i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e[] f26834j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s7.v f26835k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x0 f26836l;
    public l0 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p7.g1 f26837n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public s7.w f26838o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f26839p;

    public l0(e[] eVarArr, long j11, s7.v vVar, t7.g gVar, x0 x0Var, m0 m0Var, s7.w wVar) {
        this.f26834j = eVarArr;
        this.f26839p = j11;
        this.f26835k = vVar;
        this.f26836l = x0Var;
        p7.b0 b0Var = m0Var.f26842a;
        this.f26826b = b0Var.f46328a;
        this.f26831g = m0Var;
        this.f26837n = p7.g1.f46387d;
        this.f26838o = wVar;
        this.f26827c = new p7.z0[eVarArr.length];
        this.f26833i = new boolean[eVarArr.length];
        long j12 = m0Var.f26843b;
        long j13 = m0Var.f26845d;
        boolean z11 = m0Var.f26847f;
        x0Var.getClass();
        Object obj = b0Var.f46328a;
        int i11 = d1.f26689k;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        p7.b0 b0VarA = b0Var.a(pair.second);
        w0 w0Var = (w0) x0Var.f26939d.get(obj2);
        w0Var.getClass();
        x0Var.f26942g.add(w0Var);
        v0 v0Var = (v0) x0Var.f26941f.get(w0Var);
        if (v0Var != null) {
            v0Var.f26926a.d(v0Var.f26927b);
        }
        w0Var.f26932c.add(b0VarA);
        p7.z zVarB = w0Var.f26930a.a(b0VarA, gVar, j12);
        x0Var.f26938c.put(zVarB, w0Var);
        x0Var.c();
        this.f26825a = j13 != -9223372036854775807L ? new p7.d(zVarB, !z11, 0L, j13) : zVarB;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, p7.z] */
    public final long a(s7.w wVar, long j11, boolean z11, boolean[] zArr) {
        e[] eVarArr;
        p7.z0[] z0VarArr;
        int i11 = 0;
        while (true) {
            boolean z12 = true;
            if (i11 >= wVar.f51469a) {
                break;
            }
            if (z11 || !wVar.a(this.f26838o, i11)) {
                z12 = false;
            }
            this.f26833i[i11] = z12;
            i11++;
        }
        int i12 = 0;
        while (true) {
            eVarArr = this.f26834j;
            int length = eVarArr.length;
            z0VarArr = this.f26827c;
            if (i12 >= length) {
                break;
            }
            if (eVarArr[i12].f26700b == -2) {
                z0VarArr[i12] = null;
            }
            i12++;
        }
        b();
        this.f26838o = wVar;
        c();
        long jR = this.f26825a.r(wVar.f51471c, this.f26833i, this.f26827c, zArr, j11);
        for (int i13 = 0; i13 < eVarArr.length; i13++) {
            if (eVarArr[i13].f26700b == -2 && this.f26838o.b(i13)) {
                z0VarArr[i13] = new p7.p();
            }
        }
        this.f26830f = false;
        for (int i14 = 0; i14 < z0VarArr.length; i14++) {
            if (z0VarArr[i14] != null) {
                b7.a.j(wVar.b(i14));
                if (eVarArr[i14].f26700b != -2) {
                    this.f26830f = true;
                }
            } else {
                b7.a.j(wVar.f51471c[i14] == null);
            }
        }
        return jR;
    }

    public final void b() {
        if (this.m != null) {
            return;
        }
        int i11 = 0;
        while (true) {
            s7.w wVar = this.f26838o;
            if (i11 >= wVar.f51469a) {
                return;
            }
            boolean zB = wVar.b(i11);
            s7.s sVar = this.f26838o.f51471c[i11];
            if (zB && sVar != null) {
                sVar.k();
            }
            i11++;
        }
    }

    public final void c() {
        if (this.m != null) {
            return;
        }
        int i11 = 0;
        while (true) {
            s7.w wVar = this.f26838o;
            if (i11 >= wVar.f51469a) {
                return;
            }
            boolean zB = wVar.b(i11);
            s7.s sVar = this.f26838o.f51471c[i11];
            if (zB && sVar != null) {
                sVar.g();
            }
            i11++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, p7.b1] */
    public final long d() {
        if (!this.f26829e) {
            return this.f26831g.f26843b;
        }
        long jW = this.f26830f ? this.f26825a.w() : Long.MIN_VALUE;
        return jW == Long.MIN_VALUE ? this.f26831g.f26846e : jW;
    }

    public final long e() {
        return this.f26831g.f26843b + this.f26839p;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, p7.z] */
    public final void f(float f5, y6.o0 o0Var, boolean z11) {
        this.f26829e = true;
        this.f26837n = this.f26825a.t();
        s7.w wVarJ = j(f5, o0Var, z11);
        m0 m0Var = this.f26831g;
        long jMax = m0Var.f26843b;
        long j11 = m0Var.f26846e;
        if (j11 != -9223372036854775807L && jMax >= j11) {
            jMax = Math.max(0L, j11 - 1);
        }
        long jA = a(wVarJ, jMax, false, new boolean[this.f26834j.length]);
        long j12 = this.f26839p;
        m0 m0Var2 = this.f26831g;
        this.f26839p = (m0Var2.f26843b - jA) + j12;
        this.f26831g = m0Var2.b(jA);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, p7.b1] */
    public final boolean g() {
        if (this.f26829e) {
            return !this.f26830f || this.f26825a.w() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean h() {
        if (this.f26829e) {
            return g() || d() - this.f26831g.f26843b >= -9223372036854775807L;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p7.z] */
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
    public final void i() {
        b();
        ?? r9 = this.f26825a;
        try {
            boolean z11 = r9 instanceof p7.d;
            x0 x0Var = this.f26836l;
            if (z11) {
                x0Var.f(((p7.d) r9).f46339a);
            } else {
                x0Var.f(r9);
            }
        } catch (RuntimeException e8) {
            b7.a.p("Period release failed.", e8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:159:0x035b  */
    /* JADX WARN: Multi-variable type inference failed */
    public final s7.w j(float f5, y6.o0 o0Var, boolean z11) {
        final s7.j jVar;
        final boolean z12;
        String str;
        String languageTag;
        long j11;
        boolean z13;
        s7.s bVar;
        int i11;
        int[] iArr;
        Object obj;
        s7.r rVar;
        int i12;
        p7.g1 g1Var;
        y6.p0 p0Var;
        CaptioningManager captioningManager;
        Locale locale;
        Context context;
        int[] iArr2;
        s7.v vVar = this.f26835k;
        e[] eVarArr = this.f26834j;
        p7.g1 g1Var2 = this.f26837n;
        vVar.getClass();
        int i13 = 1;
        int[] iArr3 = new int[eVarArr.length + 1];
        int length = eVarArr.length + 1;
        y6.p0[][] p0VarArr = new y6.p0[length][];
        int[][][] iArr4 = new int[eVarArr.length + 1][][];
        for (int i14 = 0; i14 < length; i14++) {
            int i15 = g1Var2.f46388a;
            p0VarArr[i14] = new y6.p0[i15];
            iArr4[i14] = new int[i15][];
        }
        int length2 = eVarArr.length;
        final int[] iArr5 = new int[length2];
        for (int i16 = 0; i16 < length2; i16++) {
            iArr5[i16] = eVarArr[i16].C();
        }
        int i17 = 0;
        while (i17 < g1Var2.f46388a) {
            y6.p0 p0VarA = g1Var2.a(i17);
            int i18 = p0VarA.f57306c == 5 ? i13 : 0;
            int length3 = eVarArr.length;
            int i19 = i13;
            int i21 = 0;
            int i22 = 0;
            while (i21 < eVarArr.length) {
                e eVar = eVarArr[i21];
                s7.v vVar2 = vVar;
                p7.g1 g1Var3 = g1Var2;
                int i23 = i13;
                int iMax = 0;
                for (int i24 = 0; i24 < p0VarA.f57304a; i24++) {
                    iMax = Math.max(iMax, eVar.B(p0VarA.f57307d[i24]) & 7);
                }
                int i25 = iArr3[i21] == 0 ? i23 : 0;
                if (iMax > i22 || (iMax == i22 && i18 != 0 && i19 == 0 && i25 != 0)) {
                    i22 = iMax;
                    i19 = i25;
                    length3 = i21;
                }
                i21++;
                i13 = i23;
                vVar = vVar2;
                g1Var2 = g1Var3;
            }
            s7.v vVar3 = vVar;
            p7.g1 g1Var4 = g1Var2;
            int i26 = i13;
            if (length3 == eVarArr.length) {
                iArr2 = new int[p0VarA.f57304a];
            } else {
                e eVar2 = eVarArr[length3];
                int[] iArr6 = new int[p0VarA.f57304a];
                for (int i27 = 0; i27 < p0VarA.f57304a; i27++) {
                    iArr6[i27] = eVar2.B(p0VarA.f57307d[i27]);
                }
                iArr2 = iArr6;
            }
            int i28 = iArr3[length3];
            p0VarArr[length3][i28] = p0VarA;
            iArr4[length3][i28] = iArr2;
            iArr3[length3] = i28 + 1;
            i17++;
            i13 = i26;
            vVar = vVar3;
            g1Var2 = g1Var4;
        }
        s7.v vVar4 = vVar;
        int i29 = i13;
        int i30 = 0;
        p7.g1[] g1VarArr = new p7.g1[eVarArr.length];
        String[] strArr = new String[eVarArr.length];
        int[] iArr7 = new int[eVarArr.length];
        for (int i31 = 0; i31 < eVarArr.length; i31++) {
            int i32 = iArr3[i31];
            g1VarArr[i31] = new p7.g1((y6.p0[]) b7.f0.M(i32, p0VarArr[i31]));
            iArr4[i31] = (int[][]) b7.f0.M(i32, iArr4[i31]);
            strArr[i31] = eVarArr[i31].k();
            iArr7[i31] = eVarArr[i31].f26700b;
        }
        s7.u uVar = new s7.u(iArr7, g1VarArr, iArr5, iArr4, new p7.g1((y6.p0[]) b7.f0.M(iArr3[eVarArr.length], p0VarArr[eVarArr.length])));
        final s7.q qVar = (s7.q) vVar4;
        synchronized (qVar.f51451c) {
            qVar.f51455g = Thread.currentThread();
            jVar = qVar.f51454f;
        }
        if (qVar.f51458j == null && (context = qVar.f51452d) != null) {
            qVar.f51458j = Boolean.valueOf(b7.f0.J(context));
        }
        if (jVar.f51433y && Build.VERSION.SDK_INT >= 32 && qVar.f51456h == null) {
            qVar.f51456h = new s7.l(qVar.f51452d, qVar, qVar.f51458j);
        }
        int i33 = uVar.f51461a;
        Context context2 = qVar.f51452d;
        s7.r[] rVarArr = new s7.r[i33];
        int i34 = 0;
        while (true) {
            if (i34 >= uVar.f51461a) {
                z12 = 0;
                break;
            }
            if (2 == iArr7[i34] && g1VarArr[i34].f46388a > 0) {
                z12 = i29;
                break;
            }
            i34++;
        }
        int i35 = 21;
        Pair pairH = s7.q.h(i29, uVar, iArr4, new s7.n() { // from class: s7.d
            @Override // s7.n
            public final List e(int i36, p0 p0Var2, int[] iArr8) {
                q qVar2 = qVar;
                qVar2.getClass();
                j jVar2 = jVar;
                e eVar3 = new e(qVar2, jVar2);
                int i37 = iArr5[i36];
                UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
                ImmutableList.Builder builder = new ImmutableList.Builder();
                for (int i38 = 0; i38 < p0Var2.f57304a; i38++) {
                    builder.h(new f(i36, p0Var2, i38, jVar2, iArr8[i38], z12, eVar3, i37));
                }
                return builder.j();
            }
        }, new bq.h(i35));
        if (pairH != null) {
            rVarArr[((Integer) pairH.second).intValue()] = (s7.r) pairH.first;
        }
        if (pairH == null) {
            str = null;
        } else {
            s7.r rVar2 = (s7.r) pairH.first;
            str = rVar2.f51459a.f57307d[rVar2.f51460b[0]].f57282d;
        }
        jVar.f57352o.getClass();
        Object obj2 = null;
        Pair pairH2 = s7.q.h(2, uVar, iArr4, new jg.a(jVar, str, iArr5, (!jVar.f57345g || context2 == null) ? null : b7.f0.r(context2)), new bq.h(20));
        int i36 = 4;
        Pair pairH3 = pairH2 == null ? s7.q.h(4, uVar, iArr4, new hh.c(jVar, i35), new bq.h(19)) : null;
        if (pairH3 != null) {
            rVarArr[((Integer) pairH3.second).intValue()] = (s7.r) pairH3.first;
        } else if (pairH2 != null) {
            rVarArr[((Integer) pairH2.second).intValue()] = (s7.r) pairH2.first;
        }
        if (!jVar.f57354q || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            languageTag = null;
        } else {
            String str2 = b7.f0.f3975a;
            languageTag = locale.toLanguageTag();
        }
        int i37 = 3;
        Pair pairH4 = s7.q.h(3, uVar, iArr4, new com.google.firebase.crashlytics.internal.concurrency.a(jVar, str, languageTag, 9), new bq.h(22));
        if (pairH4 != null) {
            rVarArr[((Integer) pairH4.second).intValue()] = (s7.r) pairH4.first;
        }
        int i38 = 0;
        while (i38 < i33) {
            int i39 = iArr7[i38];
            if (i39 == 2 || i39 == 1 || i39 == i37 || i39 == i36) {
                i12 = i38;
            } else {
                p7.g1 g1Var5 = g1VarArr[i38];
                int[][] iArr8 = iArr4[i38];
                int i40 = i30;
                int i41 = i40;
                y6.p0 p0Var2 = null;
                s7.h hVar = null;
                while (i40 < g1Var5.f46388a) {
                    y6.p0 p0VarA2 = g1Var5.a(i40);
                    int[] iArr9 = iArr8[i40];
                    int i42 = i38;
                    s7.h hVar2 = hVar;
                    int i43 = i41;
                    y6.p0 p0Var3 = p0Var2;
                    int i44 = i30;
                    while (i44 < p0VarA2.f57304a) {
                        int i45 = i44;
                        if (e.n(iArr9[i44], jVar.f51434z)) {
                            g1Var = g1Var5;
                            s7.h hVar3 = new s7.h(p0VarA2.f57307d[i45], iArr9[i45]);
                            if (hVar2 != null) {
                                p0Var = p0VarA2;
                                if (ComparisonChain.f16669a.d(hVar3.f51422b, hVar2.f51422b).d(hVar3.f51421a, hVar2.f51421a).f() > 0) {
                                }
                            } else {
                                p0Var = p0VarA2;
                            }
                            hVar2 = hVar3;
                            i43 = i45;
                            p0Var3 = p0Var;
                        } else {
                            g1Var = g1Var5;
                            p0Var = p0VarA2;
                        }
                        i44 = i45 + 1;
                        g1Var5 = g1Var;
                        p0VarA2 = p0Var;
                    }
                    i40++;
                    p0Var2 = p0Var3;
                    i41 = i43;
                    i38 = i42;
                    hVar = hVar2;
                }
                i12 = i38;
                rVarArr[i12] = p0Var2 == null ? null : new s7.r(i30, p0Var2, new int[]{i41});
            }
            i38 = i12 + 1;
            i30 = 0;
            i37 = 3;
            i36 = 4;
        }
        int i46 = uVar.f51461a;
        p7.g1[] g1VarArr2 = uVar.f51463c;
        HashMap map = new HashMap();
        for (int i47 = 0; i47 < i46; i47++) {
            s7.q.c(g1VarArr2[i47], jVar, map);
        }
        s7.q.c(uVar.f51466f, jVar, map);
        for (int i48 = 0; i48 < i46; i48++) {
            y6.q0 q0Var = (y6.q0) map.get(Integer.valueOf(uVar.f51462b[i48]));
            if (q0Var != null) {
                y6.p0 p0Var4 = q0Var.f57311a;
                ImmutableList immutableList = q0Var.f57312b;
                if (immutableList.isEmpty()) {
                    rVar = null;
                } else {
                    int iIndexOf = g1VarArr2[i48].f46389b.indexOf(p0Var4);
                    if (iIndexOf < 0) {
                        iIndexOf = -1;
                    }
                    if (iIndexOf != -1) {
                        rVar = new s7.r(0, p0Var4, Ints.f(immutableList));
                    } else {
                        rVar = null;
                    }
                }
                rVarArr[i48] = rVar;
            }
        }
        int i49 = uVar.f51461a;
        for (int i50 = 0; i50 < i49; i50++) {
            p7.g1 g1Var6 = uVar.f51463c[i50];
            Map map2 = (Map) jVar.B.get(i50);
            if (map2 != null && map2.containsKey(g1Var6)) {
                Map map3 = (Map) jVar.B.get(i50);
                if (map3 != null && map3.get(g1Var6) != null) {
                    throw new ClassCastException();
                }
                rVarArr[i50] = null;
            }
        }
        for (int i51 = 0; i51 < i33; i51++) {
            int i52 = uVar.f51462b[i51];
            if (jVar.C.get(i51) || jVar.f57357t.contains(Integer.valueOf(i52))) {
                rVarArr[i51] = null;
            }
        }
        re.q qVar2 = qVar.f51453e;
        t7.e eVar3 = qVar.f51468b;
        b7.a.k(eVar3);
        qVar2.getClass();
        ArrayList arrayList = new ArrayList();
        int i53 = 0;
        while (i53 < rVarArr.length) {
            s7.r rVar3 = rVarArr[i53];
            if (rVar3 == null || rVar3.f51460b.length <= 1) {
                obj = obj2;
                arrayList.add(obj);
            } else {
                UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
                ImmutableList.Builder builder = new ImmutableList.Builder();
                builder.h(new s7.a(0L, 0L));
                arrayList.add(builder);
                obj = obj2;
            }
            i53++;
            obj2 = obj;
        }
        int length4 = rVarArr.length;
        long[][] jArr = new long[length4][];
        int i54 = 0;
        while (true) {
            j11 = -1;
            if (i54 >= rVarArr.length) {
                break;
            }
            s7.r rVar4 = rVarArr[i54];
            if (rVar4 == null) {
                jArr[i54] = new long[0];
            } else {
                int[] iArr10 = rVar4.f51460b;
                jArr[i54] = new long[iArr10.length];
                int i55 = 0;
                while (i55 < iArr10.length) {
                    int i56 = i55;
                    long j12 = rVar4.f51459a.f57307d[iArr10[i55]].f57288j;
                    long[] jArr2 = jArr[i54];
                    if (j12 == -1) {
                        j12 = 0;
                    }
                    jArr2[i56] = j12;
                    i55 = i56 + 1;
                }
                Arrays.sort(jArr[i54]);
            }
            i54++;
        }
        int[] iArr11 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i57 = 0; i57 < length4; i57++) {
            long[] jArr4 = jArr[i57];
            jArr3[i57] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        s7.b.v(arrayList, jArr3);
        ListMultimap listMultimapC = MultimapBuilder.b().a().c();
        int i58 = 0;
        while (i58 < length4) {
            long[] jArr5 = jArr[i58];
            long j13 = j11;
            if (jArr5.length <= 1) {
                i11 = length4;
                iArr = iArr11;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                int i59 = 0;
                while (true) {
                    long[] jArr6 = jArr[i58];
                    i11 = length4;
                    double dLog = 0.0d;
                    if (i59 >= jArr6.length) {
                        break;
                    }
                    int[] iArr12 = iArr11;
                    long j14 = jArr6[i59];
                    if (j14 != j13) {
                        dLog = Math.log(j14);
                    }
                    dArr[i59] = dLog;
                    i59++;
                    length4 = i11;
                    iArr11 = iArr12;
                }
                iArr = iArr11;
                int i60 = length5 - 1;
                double d5 = dArr[i60] - dArr[0];
                int i61 = 0;
                while (i61 < i60) {
                    double d11 = dArr[i61];
                    int i62 = i61 + 1;
                    listMultimapC.put(Double.valueOf(d5 == 0.0d ? 1.0d : (((d11 + dArr[i62]) * 0.5d) - dArr[0]) / d5), Integer.valueOf(i58));
                    i61 = i62;
                }
            }
            i58++;
            length4 = i11;
            j11 = j13;
            iArr11 = iArr;
            eVar3 = eVar3;
        }
        t7.e eVar4 = eVar3;
        int[] iArr13 = iArr11;
        ImmutableList immutableListN = ImmutableList.n(listMultimapC.values());
        for (int i63 = 0; i63 < immutableListN.size(); i63++) {
            int iIntValue = ((Integer) immutableListN.get(i63)).intValue();
            int i64 = iArr13[iIntValue] + 1;
            iArr13[iIntValue] = i64;
            jArr3[iIntValue] = jArr[iIntValue][i64];
            s7.b.v(arrayList, jArr3);
        }
        for (int i65 = 0; i65 < rVarArr.length; i65++) {
            if (arrayList.get(i65) != null) {
                jArr3[i65] = jArr3[i65] * 2;
            }
        }
        s7.b.v(arrayList, jArr3);
        ImmutableList.Builder builder2 = new ImmutableList.Builder();
        for (int i66 = 0; i66 < arrayList.size(); i66++) {
            ImmutableList.Builder builder3 = (ImmutableList.Builder) arrayList.get(i66);
            builder2.h(builder3 == null ? ImmutableList.s() : builder3.j());
        }
        ImmutableList immutableListJ = builder2.j();
        s7.s[] sVarArr = new s7.s[rVarArr.length];
        for (int i67 = 0; i67 < rVarArr.length; i67++) {
            s7.r rVar5 = rVarArr[i67];
            if (rVar5 != null) {
                int[] iArr14 = rVar5.f51460b;
                if (iArr14.length != 0) {
                    if (iArr14.length == 1) {
                        bVar = new s7.t(rVar5.f51459a, new int[]{iArr14[0]});
                    } else {
                        long j15 = 25000;
                        bVar = new s7.b(rVar5.f51459a, iArr14, eVar4, 10000, j15, j15, (ImmutableList) immutableListJ.get(i67));
                    }
                    sVarArr[i67] = bVar;
                }
            }
        }
        e1[] e1VarArr = new e1[i33];
        for (int i68 = 0; i68 < i33; i68++) {
            e1VarArr[i68] = (jVar.C.get(i68) || jVar.f57357t.contains(Integer.valueOf(uVar.f51462b[i68])) || (uVar.f51462b[i68] != -2 && sVarArr[i68] == null)) ? null : e1.f26712c;
        }
        jVar.f57352o.getClass();
        Pair pairCreate = Pair.create(e1VarArr, sVarArr);
        s7.s[] sVarArr2 = (s7.s[]) pairCreate.second;
        List[] listArr = new List[sVarArr2.length];
        for (int i69 = 0; i69 < sVarArr2.length; i69++) {
            s7.s sVar = sVarArr2[i69];
            listArr[i69] = sVar != null ? ImmutableList.u(sVar) : ImmutableList.s();
        }
        ImmutableList.Builder builder4 = new ImmutableList.Builder();
        int i70 = 0;
        while (true) {
            int i71 = uVar.f51461a;
            p7.g1[] g1VarArr3 = uVar.f51463c;
            if (i70 >= i71) {
                break;
            }
            p7.g1 g1Var7 = g1VarArr3[i70];
            List list = listArr[i70];
            int i72 = 0;
            while (i72 < g1Var7.f46388a) {
                y6.p0 p0VarA3 = g1Var7.a(i72);
                int i73 = g1VarArr3[i70].a(i72).f57304a;
                int[] iArr15 = new int[i73];
                int i74 = 0;
                int i75 = 0;
                while (i74 < i73) {
                    List[] listArr2 = listArr;
                    if ((uVar.f51465e[i70][i72][i74] & 7) == 4) {
                        iArr15[i75] = i74;
                        i75++;
                    }
                    i74++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] iArrCopyOf = Arrays.copyOf(iArr15, i75);
                p7.g1 g1Var8 = g1Var7;
                int iMin = 16;
                String str3 = null;
                int i76 = 0;
                boolean z14 = false;
                int i77 = 0;
                while (i76 < iArrCopyOf.length) {
                    String str4 = g1VarArr3[i70].a(i72).f57307d[iArrCopyOf[i76]].f57291n;
                    int i78 = i77 + 1;
                    if (i77 == 0) {
                        str3 = str4;
                    } else {
                        z14 = (!Objects.equals(str3, str4)) | z14;
                    }
                    iMin = Math.min(iMin, uVar.f51465e[i70][i72][i76] & 24);
                    i76++;
                    i77 = i78;
                }
                if (z14) {
                    iMin = Math.min(iMin, uVar.f51464d[i70]);
                }
                boolean z15 = iMin != 0;
                int i79 = p0VarA3.f57304a;
                int[] iArr16 = new int[i79];
                boolean[] zArr = new boolean[i79];
                for (int i80 = 0; i80 < p0VarA3.f57304a; i80++) {
                    iArr16[i80] = uVar.f51465e[i70][i72][i80] & 7;
                    int i81 = 0;
                    while (true) {
                        if (i81 >= list.size()) {
                            z13 = false;
                            break;
                        }
                        s7.s sVar2 = (s7.s) list.get(i81);
                        if (sVar2.b().equals(p0VarA3) && sVar2.u(i80) != -1) {
                            z13 = true;
                            break;
                        }
                        i81++;
                    }
                    zArr[i80] = z13;
                }
                builder4.h(new y6.u0(p0VarA3, z15, iArr16, zArr));
                i72++;
                listArr = listArr3;
                g1Var7 = g1Var8;
            }
            i70++;
        }
        p7.g1 g1Var9 = uVar.f51466f;
        for (int i82 = 0; i82 < g1Var9.f46388a; i82++) {
            y6.p0 p0VarA4 = g1Var9.a(i82);
            int[] iArr17 = new int[p0VarA4.f57304a];
            Arrays.fill(iArr17, 0);
            builder4.h(new y6.u0(p0VarA4, false, iArr17, new boolean[p0VarA4.f57304a]));
        }
        s7.w wVar = new s7.w((e1[]) pairCreate.first, (s7.s[]) pairCreate.second, new y6.v0(builder4.j()), uVar);
        for (int i83 = 0; i83 < wVar.f51469a; i83++) {
            if (wVar.b(i83)) {
                b7.a.j(wVar.f51471c[i83] != null || this.f26834j[i83].f26700b == -2);
            } else {
                b7.a.j(wVar.f51471c[i83] == null);
            }
        }
        for (s7.s sVar3 : wVar.f51471c) {
            if (sVar3 != null) {
                sVar3.p(f5);
                sVar3.e(z11);
            }
        }
        return wVar;
    }

    public final void k() {
        Object obj = this.f26825a;
        if (obj instanceof p7.d) {
            long j11 = this.f26831g.f26845d;
            if (j11 == -9223372036854775807L) {
                j11 = Long.MIN_VALUE;
            }
            p7.d dVar = (p7.d) obj;
            dVar.f46343e = 0L;
            dVar.f46344f = j11;
        }
    }
}
