package l0;

import com.yalantis.ucrop.view.CropImageView;
import d0.l1;
import f0.c2;
import fr.r3;
import jt.t0;
import l1.b1;
import l1.k1;
import n0.k0;
import n0.l0;
import qp.o2;
import qy.b0;
import rz.z1;
import y2.i0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements c2 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final o2 f39201x = w1.j.b(new k9.q(3), new t0(25));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f39202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f39203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f39204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f39205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f39206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k1 f39207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h0.i f39208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f39209h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f0.n f39210i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f39211j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i0 f39212k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u f39213l;
    public final n0.d m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n0.w f39214n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final f0.a f39215o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l0 f39216p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final dm.a f39217q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n0.i0 f39218r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b1 f39219s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k1 f39220t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final k1 f39221u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b1 f39222v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ob.e f39223w;

    public w(int i11, int i12) {
        a aVar = new a();
        aVar.f39089a = -1;
        aVar.f39091c = -1;
        this.f39202a = aVar;
        this.f39206e = new r(i11, i12, 0);
        this.f39207f = new k1(y.f39224a, l1.g.f39300d);
        this.f39208g = new h0.i();
        this.f39210i = new f0.n(new kp.j(this, 3));
        this.f39211j = true;
        this.f39213l = new u(this, 0);
        this.m = new n0.d();
        this.f39214n = new n0.w();
        this.f39215o = new f0.a(1);
        this.f39216p = new l0(new r3(this, i11));
        this.f39217q = new dm.a(this, 22);
        this.f39218r = new n0.i0();
        this.f39219s = n0.l.h();
        Boolean bool = Boolean.FALSE;
        this.f39220t = l1.t.B(bool);
        this.f39221u = l1.t.B(bool);
        this.f39222v = n0.l.h();
        this.f39223w = new ob.e(22);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (r5.f39210i.a(r6, r7, r0) == r1) goto L21;
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
            boolean r0 = r8 instanceof l0.v
            if (r0 == 0) goto L13
            r0 = r8
            l0.v r0 = (l0.v) r0
            int r1 = r0.f39200e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39200e = r1
            goto L18
        L13:
            l0.v r0 = new l0.v
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f39198c
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f39200e
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
            xy.i r6 = r0.f39197b
            r7 = r6
            fz.e r7 = (fz.e) r7
            d0.l1 r6 = r0.f39196a
            com.bumptech.glide.e.F(r8)
            goto L52
        L3d:
            com.bumptech.glide.e.F(r8)
            r0.f39196a = r6
            r8 = r7
            xy.i r8 = (xy.i) r8
            r0.f39197b = r8
            r0.f39200e = r4
            n0.d r8 = r5.m
            java.lang.Object r8 = r8.f(r0)
            if (r8 != r1) goto L52
            goto L61
        L52:
            r8 = 0
            r0.f39196a = r8
            r0.f39197b = r8
            r0.f39200e = r3
            f0.n r8 = r5.f39210i
            java.lang.Object r6 = r8.a(r6, r7, r0)
            if (r6 != r1) goto L62
        L61:
            return r1
        L62:
            qy.b0 r6 = qy.b0.f48488a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.w.a(d0.l1, fz.e, xy.c):java.lang.Object");
    }

    @Override // f0.c2
    public final boolean b() {
        return this.f39210i.b();
    }

    @Override // f0.c2
    public final boolean c() {
        return ((Boolean) this.f39221u.getValue()).booleanValue();
    }

    @Override // f0.c2
    public final boolean d() {
        return ((Boolean) this.f39220t.getValue()).booleanValue();
    }

    @Override // f0.c2
    public final float e(float f5) {
        return this.f39210i.e(f5);
    }

    public final Object f(int i11, int i12, xy.i iVar) {
        Object objA = a(l1.Default, new t(this, i11, i12, null), iVar);
        return objA == wy.a.COROUTINE_SUSPENDED ? objA : b0.f48488a;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final void g(o oVar, boolean z11, boolean z12) {
        ?? r9 = oVar.f39156k;
        int i11 = oVar.f39158n;
        int i12 = oVar.f39147b;
        p pVar = oVar.f39146a;
        this.f39216p.f42972e = r9.size();
        ob.e eVar = this.f39223w;
        r rVar = this.f39206e;
        if (!z11 && this.f39203b) {
            this.f39204c = oVar;
            x1.f fVarN = re.q.n();
            fz.c cVarE = fVarN != null ? fVarN.e() : null;
            x1.f fVarR = re.q.r(fVarN);
            try {
                if (((Number) ((b0.n) eVar.f44805c).f3614b.getValue()).floatValue() != CropImageView.DEFAULT_ASPECT_RATIO && pVar != null && pVar.f39162a == rVar.f39181b.l() && i12 == rVar.f39182c.l()) {
                    z1 z1Var = (z1) eVar.f44804b;
                    if (z1Var != null) {
                        z1Var.cancel(null);
                    }
                    eVar.f44805c = new b0.n(b0.e.f3496j, Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO), null, 60);
                }
                return;
            } finally {
                re.q.t(fVarN, fVarR, cVarE);
            }
        }
        if (z11) {
            this.f39203b = true;
        }
        this.f39221u.setValue(Boolean.valueOf(((pVar != null ? pVar.f39162a : 0) == 0 && i12 == 0) ? false : true));
        this.f39220t.setValue(Boolean.valueOf(oVar.f39148c));
        this.f39209h -= oVar.f39149d;
        this.f39207f.setValue(oVar);
        if (z12) {
            rVar.getClass();
            if (!(((float) i12) >= CropImageView.DEFAULT_ASPECT_RATIO)) {
                i0.a.c("scrollOffset should be non-negative");
            }
            rVar.f39182c.m(i12);
        } else {
            p pVar2 = (p) ry.m.s0(r9);
            p pVar3 = (p) ry.m.A0(r9);
            c3.c.r(pVar2 != null ? pVar2.f39162a : -1L, "firstVisibleItem:index");
            c3.c.r(pVar3 != null ? pVar3.f39162a : -1L, "lastVisibleItem:index");
            rVar.getClass();
            rVar.f39184e = pVar != null ? pVar.f39170i : null;
            if (rVar.f39183d || i11 > 0) {
                rVar.f39183d = true;
                if (!(((float) i12) >= CropImageView.DEFAULT_ASPECT_RATIO)) {
                    i0.a.c("scrollOffset should be non-negative");
                }
                rVar.a(pVar != null ? pVar.f39162a : 0, i12);
            }
            if (this.f39211j) {
                a aVar = this.f39202a;
                int i13 = aVar.f39089a;
                boolean z13 = aVar.f39090b;
                if (i13 != -1 && !r9.isEmpty() && i13 != a.b(oVar, z13)) {
                    aVar.f39089a = -1;
                    k0 k0Var = (k0) aVar.f39093e;
                    if (k0Var != null) {
                        k0Var.cancel();
                    }
                    aVar.f39093e = null;
                }
                int i14 = aVar.f39091c;
                if (i14 != -1 && aVar.f39092d != CropImageView.DEFAULT_ASPECT_RATIO && i14 != i11 && !r9.isEmpty()) {
                    int iB = a.b(oVar, aVar.f39092d < CropImageView.DEFAULT_ASPECT_RATIO);
                    if (iB >= 0 && iB < i11) {
                        aVar.f39089a = iB;
                        aVar.f39093e = dm.a.x(this.f39217q, iB);
                    }
                }
                aVar.f39091c = i11;
            }
        }
        if (z11) {
            eVar.x(oVar.f39151f, oVar.f39154i, oVar.f39153h);
        }
    }

    public final o h() {
        return (o) this.f39207f.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final void i(float f5, o oVar) {
        k0 k0Var;
        k0 k0Var2;
        if (this.f39211j) {
            ?? r9 = oVar.f39156k;
            ?? r11 = oVar.f39156k;
            boolean zIsEmpty = r9.isEmpty();
            a aVar = this.f39202a;
            if (!zIsEmpty) {
                boolean z11 = f5 < CropImageView.DEFAULT_ASPECT_RATIO;
                int iB = a.b(oVar, z11);
                if (iB >= 0 && iB < oVar.f39158n) {
                    if (iB != aVar.f39089a) {
                        if (aVar.f39090b != z11) {
                            aVar.f39089a = -1;
                            k0 k0Var3 = (k0) aVar.f39093e;
                            if (k0Var3 != null) {
                                k0Var3.cancel();
                            }
                            aVar.f39093e = null;
                        }
                        aVar.f39090b = z11;
                        aVar.f39089a = iB;
                        aVar.f39093e = dm.a.x(this.f39217q, iB);
                    }
                    if (z11) {
                        p pVar = (p) ry.m.z0(r11);
                        if (((pVar.f39173l + pVar.m) + oVar.f39161q) - oVar.m < (-f5) && (k0Var2 = (k0) aVar.f39093e) != null) {
                            k0Var2.a();
                        }
                    } else if (oVar.f39157l - ((p) ry.m.q0(r11)).f39173l < f5 && (k0Var = (k0) aVar.f39093e) != null) {
                        k0Var.a();
                    }
                }
            }
            aVar.f39092d = f5;
        }
    }

    public final Object j(int i11, int i12, vy.d dVar) {
        Object objA = a(l1.Default, new et.b0(this, i11, i12, (vy.d) null), (xy.c) dVar);
        return objA == wy.a.COROUTINE_SUSPENDED ? objA : b0.f48488a;
    }

    public final void k(int i11, int i12) {
        r rVar = this.f39206e;
        if (rVar.f39181b.l() != i11 || rVar.f39182c.l() != i12) {
            n0.w wVar = this.f39214n;
            wVar.d();
            wVar.f43010b = null;
        }
        rVar.a(i11, i12);
        rVar.f39184e = null;
        i0 i0Var = this.f39212k;
        if (i0Var != null) {
            i0Var.l();
        }
    }
}
