package m0;

import com.yalantis.ucrop.view.CropImageView;
import dt.j4;
import f0.c2;
import f0.h1;
import l1.b1;
import l1.k1;
import n0.k0;
import n0.l0;
import qp.o2;
import y2.i0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements c2 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final o2 f40649w = w1.j.b(new k9.q(12), new lt.d(3));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0.a f40650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f40651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f40652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l0.r f40653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k1 f40654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h0.i f40655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f40656g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f0.n f40657h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f40658i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i0 f40659j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l0.u f40660k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n0.d f40661l;
    public final n0.w m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f0.a f40662n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l0 f40663o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final dm.a f40664p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n0.i0 f40665q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b1 f40666r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b1 f40667s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k1 f40668t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final k1 f40669u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ob.e f40670v;

    public x(int i11, int i12) {
        l0.a aVar = new l0.a();
        aVar.f39089a = -1;
        aVar.f39093e = new n1.e(new k0[16]);
        aVar.f39091c = -1;
        this.f40650a = aVar;
        this.f40653d = new l0.r(i11, i12, 1);
        this.f40654e = new k1(z.f40671a, l1.g.f39300d);
        this.f40655f = new h0.i();
        this.f40657h = new f0.n(new kp.j(this, 14));
        this.f40658i = true;
        this.f40660k = new l0.u(this, 1);
        this.f40661l = new n0.d();
        this.m = new n0.w();
        this.f40662n = new f0.a(1);
        this.f40663o = new l0(new j4(this, i11, 3));
        this.f40664p = new dm.a(this, 25);
        this.f40665q = new n0.i0();
        this.f40666r = n0.l.h();
        this.f40667s = n0.l.h();
        Boolean bool = Boolean.FALSE;
        this.f40668t = l1.t.B(bool);
        this.f40669u = l1.t.B(bool);
        this.f40670v = new ob.e(22);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (r5.f40657h.a(r6, r7, r0) == r1) goto L21;
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
    @Override // f0.c2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(d0.l1 r6, fz.e r7, xy.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof m0.w
            if (r0 == 0) goto L13
            r0 = r8
            m0.w r0 = (m0.w) r0
            int r1 = r0.f40648e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40648e = r1
            goto L18
        L13:
            m0.w r0 = new m0.w
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f40646c
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f40648e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            com.bumptech.glide.e.F(r8)
            goto L62
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            xy.i r6 = r0.f40645b
            r7 = r6
            fz.e r7 = (fz.e) r7
            d0.l1 r6 = r0.f40644a
            com.bumptech.glide.e.F(r8)
            goto L52
        L3d:
            com.bumptech.glide.e.F(r8)
            r0.f40644a = r6
            r8 = r7
            xy.i r8 = (xy.i) r8
            r0.f40645b = r8
            r0.f40648e = r4
            n0.d r8 = r5.f40661l
            java.lang.Object r8 = r8.f(r0)
            if (r8 != r1) goto L52
            goto L61
        L52:
            r8 = 0
            r0.f40644a = r8
            r0.f40645b = r8
            r0.f40648e = r3
            f0.n r8 = r5.f40657h
            java.lang.Object r6 = r8.a(r6, r7, r0)
            if (r6 != r1) goto L62
        L61:
            return r1
        L62:
            qy.b0 r6 = qy.b0.f48488a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.x.a(d0.l1, fz.e, xy.c):java.lang.Object");
    }

    @Override // f0.c2
    public final boolean b() {
        return this.f40657h.b();
    }

    @Override // f0.c2
    public final boolean c() {
        return ((Boolean) this.f40669u.getValue()).booleanValue();
    }

    @Override // f0.c2
    public final boolean d() {
        return ((Boolean) this.f40668t.getValue()).booleanValue();
    }

    @Override // f0.c2
    public final float e(float f5) {
        return this.f40657h.e(f5);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b8  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final void f(p pVar, boolean z11, boolean z12) {
        Object obj;
        int i11;
        ?? r9 = pVar.m;
        int i12 = pVar.f40602p;
        int i13 = pVar.f40589b;
        r rVar = pVar.f40588a;
        this.f40663o.f42972e = r9.size();
        if (!z11 && this.f40651b) {
            this.f40652c = pVar;
            return;
        }
        if (z11) {
            this.f40651b = true;
        }
        this.f40656g -= pVar.f40591d;
        this.f40654e.setValue(pVar);
        this.f40669u.setValue(Boolean.valueOf(((rVar != null ? rVar.f40623a : 0) == 0 && i13 == 0) ? false : true));
        this.f40668t.setValue(Boolean.valueOf(pVar.f40590c));
        l0.r rVar2 = this.f40653d;
        if (z12) {
            rVar2.getClass();
            if (!(((float) i13) >= CropImageView.DEFAULT_ASPECT_RATIO)) {
                i0.a.c("scrollOffset should be non-negative");
            }
            rVar2.f39182c.m(i13);
        } else {
            rVar2.getClass();
            if (rVar != null) {
                q[] qVarArr = rVar.f40624b;
                q qVar = qVarArr.length == 0 ? null : qVarArr[0];
                if (qVar != null) {
                    obj = qVar.f40607b;
                } else {
                    obj = null;
                }
            } else {
                obj = null;
            }
            rVar2.f39184e = obj;
            if (rVar2.f39183d || i12 > 0) {
                rVar2.f39183d = true;
                if (!(((float) i13) >= CropImageView.DEFAULT_ASPECT_RATIO)) {
                    i0.a.c("scrollOffset should be non-negative (" + i13 + ')');
                }
                if (rVar != null) {
                    q[] qVarArr2 = rVar.f40624b;
                    q qVar2 = qVarArr2.length != 0 ? qVarArr2[0] : null;
                    if (qVar2 != null) {
                        i11 = qVar2.f40606a;
                    } else {
                        i11 = 0;
                    }
                } else {
                    i11 = 0;
                }
                rVar2.a(i11, i13);
            }
            if (this.f40658i) {
                l0.a aVar = this.f40650a;
                n1.e eVar = (n1.e) aVar.f39093e;
                int i14 = aVar.f39089a;
                boolean z13 = aVar.f39090b;
                if (i14 != -1 && !r9.isEmpty() && i14 != l0.a.c(pVar, z13)) {
                    aVar.f39089a = -1;
                    Object[] objArr = eVar.f43112a;
                    int i15 = eVar.f43114c;
                    for (int i16 = 0; i16 < i15; i16++) {
                        ((k0) objArr[i16]).cancel();
                    }
                    eVar.h();
                }
                int i17 = aVar.f39091c;
                if (i17 != -1 && aVar.f39092d != CropImageView.DEFAULT_ASPECT_RATIO && i17 != i12 && !r9.isEmpty()) {
                    int iC = l0.a.c(pVar, aVar.f39092d < CropImageView.DEFAULT_ASPECT_RATIO);
                    int iA = l0.a.a(pVar, aVar.f39092d < CropImageView.DEFAULT_ASPECT_RATIO);
                    if (iA >= 0 && iA < i12 && iC != aVar.f39089a && iC >= 0) {
                        aVar.f39089a = iC;
                        eVar.h();
                        eVar.d(eVar.f43114c, this.f40664p.w(iC));
                    }
                }
                aVar.f39091c = i12;
            }
        }
        if (z11) {
            this.f40670v.x(pVar.f40593f, pVar.f40596i, pVar.f40595h);
        }
    }

    public final p g() {
        return (p) this.f40654e.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.List] */
    public final void h(float f5, p pVar) {
        if (this.f40658i) {
            l0.a aVar = this.f40650a;
            n1.e eVar = (n1.e) aVar.f39093e;
            if (!pVar.m.isEmpty()) {
                int i11 = 0;
                boolean z11 = f5 < CropImageView.DEFAULT_ASPECT_RATIO;
                int iC = l0.a.c(pVar, z11);
                int iA = l0.a.a(pVar, z11);
                if (iA >= 0) {
                    h1 h1Var = pVar.f40603q;
                    ?? r9 = pVar.m;
                    if (iA < pVar.f40602p) {
                        if (iC != aVar.f39089a && iC >= 0) {
                            if (aVar.f39090b != z11) {
                                Object[] objArr = eVar.f43112a;
                                int i12 = eVar.f43114c;
                                for (int i13 = 0; i13 < i12; i13++) {
                                    ((k0) objArr[i13]).cancel();
                                }
                            }
                            aVar.f39090b = z11;
                            aVar.f39089a = iC;
                            eVar.h();
                            eVar.d(eVar.f43114c, this.f40664p.w(iC));
                        }
                        if (z11) {
                            q qVar = (q) ry.m.z0(r9);
                            if (((se.p.X(qVar, h1Var) + ((int) (h1Var == h1.Vertical ? qVar.f40618n & 4294967295L : qVar.f40618n >> 32))) + pVar.f40605s) - pVar.f40601o < (-f5)) {
                                Object[] objArr2 = eVar.f43112a;
                                int i14 = eVar.f43114c;
                                while (i11 < i14) {
                                    ((k0) objArr2[i11]).a();
                                    i11++;
                                }
                            }
                        } else if (pVar.f40600n - se.p.X((q) ry.m.q0(r9), h1Var) < f5) {
                            Object[] objArr3 = eVar.f43112a;
                            int i15 = eVar.f43114c;
                            while (i11 < i15) {
                                ((k0) objArr3[i11]).a();
                                i11++;
                            }
                        }
                    }
                }
            }
            aVar.f39092d = f5;
        }
    }
}
