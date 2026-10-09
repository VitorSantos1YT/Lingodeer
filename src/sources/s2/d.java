package s2;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w2.x f51289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f51290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f51291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f51292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f51293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y.e0 f51294f = new y.e0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f51295g = new k();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y.a0 f51296h = new y.a0(10);

    public d(w2.x xVar) {
        this.f51289a = xVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00fb A[LOOP:2: B:38:0x00a2->B:52:0x00fb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x0100 A[EDGE_INSN: B:61:0x0100->B:53:0x0100 BREAK  A[LOOP:2: B:38:0x00a2->B:52:0x00fb], SYNTHETIC] */
    public final void a(long j11, List list, boolean z11) {
        y.a0 a0Var;
        j jVar;
        Object objD;
        Object obj;
        int size = list.size();
        k kVar = this.f51295g;
        k kVar2 = kVar;
        boolean z12 = true;
        int i11 = 0;
        while (true) {
            a0Var = this.f51296h;
            if (i11 >= size) {
                break;
            }
            z1.q qVar = (z1.q) list.get(i11);
            if (qVar.P) {
                qVar.O = new d2.c(12, this, qVar);
                if (z12) {
                    n1.e eVar = kVar2.f51320a;
                    Object[] objArr = eVar.f43112a;
                    int i12 = eVar.f43114c;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= i12) {
                            obj = null;
                            break;
                        }
                        obj = objArr[i13];
                        if (kotlin.jvm.internal.m.a(((j) obj).f51309c, qVar)) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                    jVar = (j) obj;
                    if (jVar != null) {
                        jVar.f51315i = true;
                        jVar.f51310d.a(j11);
                        if (z11) {
                            Object objD2 = a0Var.d(j11);
                            if (objD2 == null) {
                                objD2 = new y.e0();
                                a0Var.g(j11, objD2);
                            }
                            ((y.e0) objD2).a(jVar);
                        }
                    } else {
                        z12 = false;
                        jVar = new j(qVar);
                        jVar.f51310d.a(j11);
                        if (z11) {
                            objD = a0Var.d(j11);
                            if (objD == null) {
                                objD = new y.e0();
                                a0Var.g(j11, objD);
                            }
                            ((y.e0) objD).a(jVar);
                        }
                        kVar2.f51320a.c(jVar);
                    }
                } else {
                    jVar = new j(qVar);
                    jVar.f51310d.a(j11);
                    if (z11) {
                        objD = a0Var.d(j11);
                        if (objD == null) {
                            objD = new y.e0();
                            a0Var.g(j11, objD);
                        }
                        ((y.e0) objD).a(jVar);
                    }
                    kVar2.f51320a.c(jVar);
                }
                kVar2 = jVar;
            }
            i11++;
        }
        if (z11) {
            long[] jArr = a0Var.f56655b;
            Object[] objArr2 = a0Var.f56656c;
            long[] jArr2 = a0Var.f56654a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i14 = 0;
                while (true) {
                    long j12 = jArr2[i14];
                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i14 != length) {
                            break;
                            break;
                        }
                        i14++;
                    } else {
                        int i15 = 8;
                        int i16 = 8 - ((~(i14 - length)) >>> 31);
                        int i17 = 0;
                        while (i17 < i16) {
                            if ((255 & j12) < 128) {
                                int i18 = (i14 << 3) + i17;
                                long j13 = jArr[i18];
                                y.e0 e0Var = (y.e0) objArr2[i18];
                                n1.e eVar2 = kVar.f51320a;
                                Object[] objArr3 = eVar2.f43112a;
                                int i19 = eVar2.f43114c;
                                for (int i21 = 0; i21 < i19; i21++) {
                                    ((j) objArr3[i21]).f(j13, e0Var);
                                }
                            }
                            j12 >>= i15;
                            i17++;
                            i15 = i15;
                        }
                        if (i16 != i15) {
                            break;
                        } else if (i14 != length) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                }
            }
        }
        a0Var.a();
    }

    public final boolean b(ie.o oVar, boolean z11) {
        y.r rVar = (y.r) oVar.f34406c;
        w2.x xVar = this.f51289a;
        k kVar = this.f51295g;
        boolean zA = kVar.a(rVar, xVar, oVar, z11);
        n1.e eVar = kVar.f51320a;
        if (!zA) {
            return false;
        }
        boolean z12 = true;
        this.f51290b = true;
        Object[] objArr = eVar.f43112a;
        int i11 = eVar.f43114c;
        boolean z13 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            z13 = ((j) objArr[i12]).e(oVar, z11) || z13;
        }
        Object[] objArr2 = eVar.f43112a;
        int i13 = eVar.f43114c;
        boolean z14 = false;
        for (int i14 = 0; i14 < i13; i14++) {
            z14 = ((j) objArr2[i14]).d(oVar) || z14;
        }
        kVar.b(oVar);
        if (!z14 && !z13) {
            z12 = false;
        }
        this.f51290b = false;
        if (this.f51293e) {
            this.f51293e = false;
            y.e0 e0Var = this.f51294f;
            int i15 = e0Var.f56687b;
            for (int i16 = 0; i16 < i15; i16++) {
                d((z1.q) e0Var.f(i16));
            }
            e0Var.d();
        }
        if (this.f51291c) {
            this.f51291c = false;
            c();
        }
        if (this.f51292d) {
            this.f51292d = false;
            kVar.f51320a.h();
        }
        return z12;
    }

    public final void c() {
        if (this.f51290b) {
            this.f51291c = true;
            return;
        }
        k kVar = this.f51295g;
        n1.e eVar = kVar.f51320a;
        Object[] objArr = eVar.f43112a;
        int i11 = eVar.f43114c;
        for (int i12 = 0; i12 < i11; i12++) {
            ((j) objArr[i12]).c();
        }
        if (this.f51292d) {
            this.f51292d = true;
        } else {
            kVar.f51320a.h();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void d(z1.q qVar) {
        if (this.f51290b) {
            this.f51293e = true;
            this.f51294f.a(qVar);
            return;
        }
        k kVar = this.f51295g;
        y.e0 e0Var = kVar.f51321b;
        e0Var.d();
        e0Var.a(kVar);
        while (e0Var.i()) {
            k kVar2 = (k) e0Var.k(e0Var.f56687b - 1);
            int i11 = 0;
            while (true) {
                n1.e eVar = kVar2.f51320a;
                if (i11 < eVar.f43114c) {
                    j jVar = (j) eVar.f43112a[i11];
                    if (kotlin.jvm.internal.m.a(jVar.f51309c, qVar)) {
                        kVar2.f51320a.k(jVar);
                        jVar.c();
                    } else {
                        e0Var.a(jVar);
                        i11++;
                    }
                }
            }
        }
    }
}
