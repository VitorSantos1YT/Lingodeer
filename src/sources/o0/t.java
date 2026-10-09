package o0;

import b0.i1;
import com.yalantis.ucrop.view.CropImageView;
import d0.l1;
import f0.c2;
import java.util.List;
import l1.b1;
import l1.g1;
import l1.h1;
import l1.k1;
import mt.d1;
import n0.g0;
import n0.i0;
import n0.j0;
import n0.k0;
import n0.l0;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t implements c2 {
    public final i0 A;
    public final b1 B;
    public final b1 C;
    public final k1 D;
    public final k1 E;
    public final k1 F;
    public final k1 G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f44432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f44433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f44434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.android.billingclient.api.h f44435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f44438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f44439h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f44440i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f44441j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f0.n f44442k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f44443l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public k0 f44444n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f44445o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k1 f44446p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public v3.c f44447q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h0.i f44448r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h1 f44449s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h1 f44450t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final l0 f44451u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final f0.a f44452v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final n0.d f44453w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final k1 f44454x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final l0.u f44455y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f44456z;

    public t(int i11, float f5) {
        double d5 = f5;
        if (-0.5d > d5 || d5 > 0.5d) {
            i0.a.a("currentPageOffsetFraction " + f5 + " is not within the range -0.5 to 0.5");
        }
        this.f44434c = l1.t.B(new f2.b(0L));
        com.android.billingclient.api.h hVar = new com.android.billingclient.api.h();
        hVar.f7509b = this;
        hVar.f7510c = new h1(i11);
        hVar.f7511d = new g1(f5);
        hVar.f7513f = new g0(i11, 30, 100);
        this.f44435d = hVar;
        this.f44436e = i11;
        this.f44438g = Long.MAX_VALUE;
        final int i12 = 0;
        this.f44442k = new f0.n(new fz.c(this) { // from class: o0.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f44420b;

            {
                this.f44420b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Long] */
            @Override // fz.c
            public final Object invoke(Object obj) {
                n nVar;
                switch (i12) {
                    case 0:
                        ?? ValueOf = (Float) obj;
                        float fFloatValue = ValueOf.floatValue();
                        t tVar = this.f44420b;
                        long jE = cf.x.e(tVar);
                        float f11 = tVar.f44440i + fFloatValue;
                        long jR = hz.b.R(f11);
                        tVar.f44440i = f11 - jR;
                        if (Math.abs(fFloatValue) >= 1.0E-4f) {
                            long j11 = jE + jR;
                            long jN = hz.b.n(j11, tVar.f44439h, tVar.f44438g);
                            boolean z11 = j11 != jN;
                            long j12 = jN - jE;
                            float f12 = j12;
                            tVar.f44441j = f12;
                            long jAbs = Math.abs(j12);
                            float fO = CropImageView.DEFAULT_ASPECT_RATIO;
                            if (jAbs != 0) {
                                tVar.F.setValue(Boolean.valueOf(f12 > CropImageView.DEFAULT_ASPECT_RATIO));
                                tVar.G.setValue(Boolean.valueOf(f12 < CropImageView.DEFAULT_ASPECT_RATIO));
                            }
                            int i13 = (int) j12;
                            int i14 = -i13;
                            n nVarD = ((n) tVar.f44446p.getValue()).d(i14);
                            if (nVarD != null && (nVar = tVar.f44433b) != null) {
                                n nVarD2 = nVar.d(i14);
                                if (nVarD2 != null) {
                                    tVar.f44433b = nVarD2;
                                } else {
                                    nVarD = null;
                                }
                            }
                            if (nVarD != null) {
                                tVar.h(nVarD, tVar.f44432a, true);
                                tVar.B.setValue(b0.f48488a);
                            } else {
                                com.android.billingclient.api.h hVar2 = tVar.f44435d;
                                t tVar2 = (t) hVar2.f7509b;
                                g1 g1Var = (g1) hVar2.f7511d;
                                if (tVar2.o() != 0) {
                                    fO = i13 / tVar2.o();
                                }
                                g1Var.m(g1Var.l() + fO);
                                y2.i0 i0Var = (y2.i0) tVar.f44454x.getValue();
                                if (i0Var != null) {
                                    i0Var.l();
                                }
                            }
                            if (z11) {
                                ValueOf = Long.valueOf(j12);
                            }
                            fFloatValue = ValueOf.floatValue();
                        }
                        return Float.valueOf(fFloatValue);
                    default:
                        t tVar3 = this.f44420b;
                        j0 j0Var = (j0) obj;
                        x1.f fVarN = re.q.n();
                        fz.c cVarE = fVarN != null ? fVarN.e() : null;
                        x1.f fVarR = re.q.r(fVarN);
                        try {
                            j0Var.a(tVar3.f44436e);
                            return b0.f48488a;
                        } finally {
                            re.q.t(fVarN, fVarR, cVarE);
                        }
                }
            }
        });
        this.f44443l = true;
        this.m = -1;
        this.f44446p = new k1(w.f44458b, l1.g.f39300d);
        this.f44447q = w.f44459c;
        this.f44448r = new h0.i();
        this.f44449s = new h1(-1);
        this.f44450t = new h1(i11);
        l1.g gVar = l1.g.f39303t;
        l1.t.t(new c(this, 2), gVar);
        l1.t.t(new c(this, 3), gVar);
        final int i13 = 1;
        this.f44451u = new l0(new fz.c(this) { // from class: o0.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t f44420b;

            {
                this.f44420b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Long] */
            @Override // fz.c
            public final Object invoke(Object obj) {
                n nVar;
                switch (i13) {
                    case 0:
                        ?? ValueOf = (Float) obj;
                        float fFloatValue = ValueOf.floatValue();
                        t tVar = this.f44420b;
                        long jE = cf.x.e(tVar);
                        float f11 = tVar.f44440i + fFloatValue;
                        long jR = hz.b.R(f11);
                        tVar.f44440i = f11 - jR;
                        if (Math.abs(fFloatValue) >= 1.0E-4f) {
                            long j11 = jE + jR;
                            long jN = hz.b.n(j11, tVar.f44439h, tVar.f44438g);
                            boolean z11 = j11 != jN;
                            long j12 = jN - jE;
                            float f12 = j12;
                            tVar.f44441j = f12;
                            long jAbs = Math.abs(j12);
                            float fO = CropImageView.DEFAULT_ASPECT_RATIO;
                            if (jAbs != 0) {
                                tVar.F.setValue(Boolean.valueOf(f12 > CropImageView.DEFAULT_ASPECT_RATIO));
                                tVar.G.setValue(Boolean.valueOf(f12 < CropImageView.DEFAULT_ASPECT_RATIO));
                            }
                            int i14 = (int) j12;
                            int i15 = -i14;
                            n nVarD = ((n) tVar.f44446p.getValue()).d(i15);
                            if (nVarD != null && (nVar = tVar.f44433b) != null) {
                                n nVarD2 = nVar.d(i15);
                                if (nVarD2 != null) {
                                    tVar.f44433b = nVarD2;
                                } else {
                                    nVarD = null;
                                }
                            }
                            if (nVarD != null) {
                                tVar.h(nVarD, tVar.f44432a, true);
                                tVar.B.setValue(b0.f48488a);
                            } else {
                                com.android.billingclient.api.h hVar2 = tVar.f44435d;
                                t tVar2 = (t) hVar2.f7509b;
                                g1 g1Var = (g1) hVar2.f7511d;
                                if (tVar2.o() != 0) {
                                    fO = i14 / tVar2.o();
                                }
                                g1Var.m(g1Var.l() + fO);
                                y2.i0 i0Var = (y2.i0) tVar.f44454x.getValue();
                                if (i0Var != null) {
                                    i0Var.l();
                                }
                            }
                            if (z11) {
                                ValueOf = Long.valueOf(j12);
                            }
                            fFloatValue = ValueOf.floatValue();
                        }
                        return Float.valueOf(fFloatValue);
                    default:
                        t tVar3 = this.f44420b;
                        j0 j0Var = (j0) obj;
                        x1.f fVarN = re.q.n();
                        fz.c cVarE = fVarN != null ? fVarN.e() : null;
                        x1.f fVarR = re.q.r(fVarN);
                        try {
                            j0Var.a(tVar3.f44436e);
                            return b0.f48488a;
                        } finally {
                            re.q.t(fVarN, fVarR, cVarE);
                        }
                }
            }
        });
        this.f44452v = new f0.a(1);
        this.f44453w = new n0.d();
        this.f44454x = l1.t.B(null);
        this.f44455y = new l0.u(this, 2);
        this.f44456z = v3.b.b(0, 0, 15);
        this.A = new i0();
        this.B = n0.l.h();
        this.C = n0.l.h();
        Boolean bool = Boolean.FALSE;
        this.D = l1.t.B(bool);
        this.E = l1.t.B(bool);
        this.F = l1.t.B(bool);
        this.G = l1.t.B(bool);
    }

    public static int i(boolean z11, n nVar) {
        List list = nVar.f44400a;
        int i11 = nVar.f44407h;
        if (!z11) {
            return (((e) ry.m.q0(list)).f44362a - i11) - 1;
        }
        int i12 = i11 + 1;
        if (i12 < 0) {
            return Integer.MAX_VALUE;
        }
        return ((e) ry.m.z0(list)).f44362a + i12;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        if (r9.a(r7, r8, r0) == r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object s(o0.t r6, d0.l1 r7, fz.e r8, xy.c r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof o0.s
            if (r0 == 0) goto L13
            r0 = r9
            o0.s r0 = (o0.s) r0
            int r1 = r0.f44431f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f44431f = r1
            goto L18
        L13:
            o0.s r0 = new o0.s
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f44429d
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f44431f
            qy.b0 r3 = qy.b0.f48488a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            o0.t r6 = r0.f44426a
            com.bumptech.glide.e.F(r9)
            goto L81
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            xy.i r6 = r0.f44428c
            r8 = r6
            fz.e r8 = (fz.e) r8
            d0.l1 r7 = r0.f44427b
            o0.t r6 = r0.f44426a
            com.bumptech.glide.e.F(r9)
            goto L5e
        L43:
            com.bumptech.glide.e.F(r9)
            r0.f44426a = r6
            r0.f44427b = r7
            r9 = r8
            xy.i r9 = (xy.i) r9
            r0.f44428c = r9
            r0.f44431f = r5
            n0.d r9 = r6.f44453w
            java.lang.Object r9 = r9.f(r0)
            if (r9 != r1) goto L5a
            goto L5b
        L5a:
            r9 = r3
        L5b:
            if (r9 != r1) goto L5e
            goto L80
        L5e:
            f0.n r9 = r6.f44442k
            boolean r9 = r9.b()
            if (r9 != 0) goto L6f
            int r9 = r6.k()
            l1.h1 r2 = r6.f44450t
            r2.m(r9)
        L6f:
            f0.n r9 = r6.f44442k
            r0.f44426a = r6
            r2 = 0
            r0.f44427b = r2
            r0.f44428c = r2
            r0.f44431f = r4
            java.lang.Object r7 = r9.a(r7, r8, r0)
            if (r7 != r1) goto L81
        L80:
            return r1
        L81:
            r7 = -1
            l1.h1 r6 = r6.f44449s
            r6.m(r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.t.s(o0.t, d0.l1, fz.e, xy.c):java.lang.Object");
    }

    public static Object t(t tVar, int i11, xy.i iVar) {
        tVar.getClass();
        Object objA = tVar.a(l1.Default, new d1(tVar, i11, null, 1), iVar);
        return objA == wy.a.COROUTINE_SUSPENDED ? objA : b0.f48488a;
    }

    @Override // f0.c2
    public final Object a(l1 l1Var, fz.e eVar, xy.c cVar) {
        return s(this, l1Var, eVar, cVar);
    }

    @Override // f0.c2
    public final boolean b() {
        return this.f44442k.b();
    }

    @Override // f0.c2
    public final boolean c() {
        return ((Boolean) this.E.getValue()).booleanValue();
    }

    @Override // f0.c2
    public final boolean d() {
        return ((Boolean) this.D.getValue()).booleanValue();
    }

    @Override // f0.c2
    public final float e(float f5) {
        return this.f44442k.e(f5);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(int i11, i1 i1Var, vy.d dVar) throws Throwable {
        r rVar;
        if (dVar instanceof r) {
            rVar = (r) dVar;
            int i12 = rVar.f44425e;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                rVar.f44425e = i12 - Integer.MIN_VALUE;
            } else {
                rVar = new r(this, dVar);
            }
        } else {
            rVar = new r(this, dVar);
        }
        Object obj = rVar.f44423c;
        Object obj2 = wy.a.COROUTINE_SUSPENDED;
        int i13 = rVar.f44425e;
        Object obj3 = b0.f48488a;
        if (i13 == 0) {
            com.bumptech.glide.e.F(obj);
            if ((i11 != k() || ((g1) this.f44435d.f7511d).l() != CropImageView.DEFAULT_ASPECT_RATIO) && m() != 0) {
                rVar.f44422b = i1Var;
                rVar.f44421a = i11;
                rVar.f44425e = 1;
                Object objF = this.f44453w.f(rVar);
                if (objF != obj2) {
                    objF = obj3;
                }
                if (objF == obj2) {
                }
            }
        }
        if (i13 != 1) {
            if (i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            return obj3;
        }
        i11 = rVar.f44421a;
        i1Var = rVar.f44422b;
        com.bumptech.glide.e.F(obj);
        i1 i1Var2 = i1Var;
        double d5 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (-0.5d > d5 || d5 > 0.5d) {
            i0.a.a("pageOffsetFraction " + CropImageView.DEFAULT_ASPECT_RATIO + " is not within the range -0.5 to 0.5");
        }
        fz.e gVar = new fr.g(this, j(i11), CropImageView.DEFAULT_ASPECT_RATIO * o(), i1Var2, null);
        rVar.f44422b = null;
        rVar.f44425e = 2;
        return a(l1.Default, gVar, rVar) == obj2 ? obj2 : obj3;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x011e A[Catch: all -> 0x015c, TryCatch #0 {all -> 0x015c, blocks: (B:53:0x00bd, B:57:0x00cc, B:60:0x00d5, B:63:0x00e2, B:65:0x00ee, B:77:0x0129, B:71:0x011e, B:68:0x0106), top: B:89:0x00bd }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0124  */
    /* JADX WARN: Code duplicated, block: B:74:0x0125  */
    public final void h(n nVar, boolean z11, boolean z12) {
        List list = nVar.f44400a;
        int i11 = nVar.f44411l;
        e eVar = nVar.f44408i;
        e eVar2 = nVar.f44409j;
        float f5 = nVar.f44410k;
        this.f44451u.f42972e = list.size();
        if (!z11 && this.f44432a) {
            this.f44433b = nVar;
            return;
        }
        boolean z13 = true;
        if (z11) {
            this.f44432a = true;
        }
        com.android.billingclient.api.h hVar = this.f44435d;
        if (z12) {
            ((g1) hVar.f7511d).m(f5);
        } else {
            hVar.getClass();
            hVar.f7512e = eVar2 != null ? eVar2.f44365d : null;
            if (hVar.f7508a || !list.isEmpty()) {
                hVar.f7508a = true;
                int i12 = eVar2 != null ? eVar2.f44362a : 0;
                ((h1) hVar.f7510c).m(i12);
                ((g0) hVar.f7513f).b(i12);
                ((g1) hVar.f7511d).m(f5);
            }
            if (this.m != -1 && !list.isEmpty()) {
                if (this.m != i(this.f44445o, nVar)) {
                    this.m = -1;
                    k0 k0Var = this.f44444n;
                    if (k0Var != null) {
                        k0Var.cancel();
                    }
                    this.f44444n = null;
                }
            }
        }
        this.f44446p.setValue(nVar);
        this.D.setValue(Boolean.valueOf(nVar.m));
        this.E.setValue(Boolean.valueOf(((eVar != null ? eVar.f44362a : 0) == 0 && i11 == 0) ? false : true));
        if (eVar != null) {
            this.f44436e = eVar.f44362a;
        }
        this.f44437f = i11;
        x1.f fVarN = re.q.n();
        fz.c cVarE = fVarN != null ? fVarN.e() : null;
        x1.f fVarR = re.q.r(fVarN);
        try {
            if (this.f44443l && nVar.f44407h < m() && Math.abs(this.f44441j) > 0.5f) {
                float f11 = this.f44441j;
                if (l().f44404e == f0.h1.Vertical) {
                    if (Math.signum(f11) != Math.signum(-Float.intBitsToFloat((int) (p() & 4294967295L)))) {
                        if (q()) {
                            z13 = false;
                        }
                    }
                } else if (Math.signum(f11) != Math.signum(-Float.intBitsToFloat((int) (p() >> 32)))) {
                    if (q()) {
                        z13 = false;
                    }
                }
                if (z13) {
                    r(this.f44441j, nVar);
                }
            }
            re.q.t(fVarN, fVarR, cVarE);
            this.f44438g = w.a(nVar, m());
            m();
            int iE = (int) (nVar.f44404e == f0.h1.Horizontal ? nVar.e() >> 32 : nVar.e() & 4294967295L);
            nVar.f44412n.getClass();
            this.f44439h = hz.b.l(0, 0, iE);
        } catch (Throwable th2) {
            re.q.t(fVarN, fVarR, cVarE);
            throw th2;
        }
    }

    public final int j(int i11) {
        if (m() > 0) {
            return hz.b.l(i11, 0, m() - 1);
        }
        return 0;
    }

    public final int k() {
        return ((h1) this.f44435d.f7510c).l();
    }

    public final n l() {
        return (n) this.f44446p.getValue();
    }

    public abstract int m();

    public final int n() {
        return ((n) this.f44446p.getValue()).f44401b;
    }

    public final int o() {
        return ((n) this.f44446p.getValue()).f44402c + n();
    }

    public final long p() {
        return ((f2.b) this.f44434c.getValue()).f26570a;
    }

    public final boolean q() {
        return ((int) Float.intBitsToFloat((int) (p() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (p() & 4294967295L))) == 0;
    }

    public final void r(float f5, n nVar) {
        k0 k0Var;
        k0 k0Var2;
        k0 k0Var3;
        List list = nVar.f44400a;
        if (this.f44443l && !list.isEmpty()) {
            boolean z11 = f5 > CropImageView.DEFAULT_ASPECT_RATIO;
            int i11 = i(z11, nVar);
            if (i11 < 0 || i11 >= m()) {
                return;
            }
            if (i11 != this.m) {
                if (this.f44445o != z11 && (k0Var3 = this.f44444n) != null) {
                    k0Var3.cancel();
                }
                this.f44445o = z11;
                this.m = i11;
                this.f44444n = this.f44451u.a(i11, this.f44456z, true, null);
            }
            if (z11) {
                if ((((e) ry.m.z0(list)).f44371j + (nVar.f44401b + nVar.f44402c)) - nVar.f44406g >= f5 || (k0Var2 = this.f44444n) == null) {
                    return;
                }
                k0Var2.a();
                return;
            }
            if (nVar.f44405f - ((e) ry.m.q0(list)).f44371j >= (-f5) || (k0Var = this.f44444n) == null) {
                return;
            }
            k0Var.a();
        }
    }

    public final void u(float f5, int i11, boolean z11) {
        com.android.billingclient.api.h hVar = this.f44435d;
        ((h1) hVar.f7510c).m(i11);
        ((g0) hVar.f7513f).b(i11);
        ((g1) hVar.f7511d).m(f5);
        hVar.f7512e = null;
        if (!z11) {
            this.C.setValue(b0.f48488a);
            return;
        }
        y2.i0 i0Var = (y2.i0) this.f44454x.getValue();
        if (i0Var != null) {
            i0Var.l();
        }
    }
}
