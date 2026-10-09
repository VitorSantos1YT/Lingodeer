package d1;

import android.content.ClipData;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import kotlin.KotlinNothingValueException;
import l1.k1;
import rt.v7;
import rz.z1;
import s0.o1;
import s0.t1;
import s0.u1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {
    public final ie.o A;
    public boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f23037a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s0.s0 f23040d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public fz.a f23043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public z2.c1 f23044h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public rz.b0 f23045i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public m f23046j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public n2.a f23047k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e2.v f23048l;
    public final k1 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k1 f23049n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f23050o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public j3.x0 f23051p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f23052q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k1 f23053r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k1 f23054s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f23055t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public o3.w f23056u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ie.o f23057v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public j3.x0 f23058w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final k1 f23059x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final o20.i f23060y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final v0 f23061z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o3.p f23038b = u1.f51205a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public fz.c f23039c = new v7(16);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k1 f23041e = l1.t.B(new o3.w((String) null, 0, 7));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o3.f0 f23042f = o3.e0.f44674a;

    public z0(t1 t1Var) {
        this.f23037a = t1Var;
        Boolean bool = Boolean.TRUE;
        this.m = l1.t.B(bool);
        this.f23049n = l1.t.B(bool);
        this.f23050o = 0L;
        this.f23052q = 0L;
        this.f23053r = l1.t.B(null);
        this.f23054s = l1.t.B(null);
        this.f23055t = -1;
        this.f23056u = new o3.w((String) null, 0L, 7);
        this.f23059x = l1.t.B(null);
        this.f23060y = new o20.i(29);
        this.f23061z = new v0(this);
        this.A = new ie.o(this);
    }

    public static final void a(z0 z0Var, j3.x0 x0Var) {
        j3.h hVarL;
        String str;
        rz.b0 b0Var;
        if (x0Var == null) {
            return;
        }
        long j11 = x0Var.f35823a;
        m mVar = z0Var.f23046j;
        if (mVar == null || (hVarL = z0Var.l()) == null || (str = hVarL.f35700b) == null) {
            return;
        }
        o3.p pVar = z0Var.f23038b;
        long jB = j3.t.b(pVar.s((int) (j11 >> 32)), pVar.s((int) (j11 & 4294967295L)));
        if (str.length() <= 0 || j3.x0.c(jB) || (b0Var = z0Var.f23045i) == null) {
            return;
        }
        rz.e0.B(b0Var, null, null, new w0(mVar, str, jB, x0Var, z0Var, pVar, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(z0 z0Var, xy.c cVar) {
        x0 x0Var;
        String str;
        j3.x0 x0Var2;
        if (cVar instanceof x0) {
            x0Var = (x0) cVar;
            int i11 = x0Var.f23024c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                x0Var.f23024c = i11 - Integer.MIN_VALUE;
            } else {
                x0Var = new x0(z0Var, cVar);
            }
        } else {
            x0Var = new x0(z0Var, cVar);
        }
        Object obj = x0Var.f23022a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = x0Var.f23024c;
        qy.b0 b0Var = qy.b0.f48488a;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            return b0Var;
        }
        com.bumptech.glide.e.F(obj);
        j3.h hVarL = z0Var.l();
        if (hVarL != null && (str = hVarL.f35700b) != null && (x0Var2 = z0Var.f23058w) != null) {
            long j11 = x0Var2.f35823a;
            m mVar = z0Var.f23046j;
            if (mVar != null) {
                long jB = j3.t.b(z0Var.f23038b.s((int) (j11 >> 32)), z0Var.f23038b.s((int) (j11 & 4294967295L)));
                x0Var.f23024c = 1;
                r rVar = (r) mVar;
                if (((str.length() == 0 || j3.x0.c(jB)) ? b0Var : rz.e0.M(rVar.f22975a, new p(rVar, new o(jB, rVar, str, null), null), x0Var)) == aVar) {
                    return aVar;
                }
            }
        }
        return b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0154  */
    public static final long c(z0 z0Var, o3.w wVar, long j11, boolean z11, boolean z12, com.google.firebase.remoteconfig.a aVar, boolean z13) {
        o1 o1VarD;
        long j12;
        w wVar2;
        w wVar3;
        boolean z14;
        n2.a aVar2;
        v vVarF;
        v vVarF2;
        w wVar4;
        s0.s0 s0Var = z0Var.f23040d;
        if (s0Var == null || (o1VarD = s0Var.d()) == null) {
            return j3.x0.f35821b;
        }
        o3.p pVar = z0Var.f23038b;
        long j13 = wVar.f44705b;
        j3.h hVar = wVar.f44704a;
        int i11 = j3.x0.f35822c;
        long jB = j3.t.b(pVar.s((int) (j13 >> 32)), z0Var.f23038b.s((int) (j13 & 4294967295L)));
        int iB = o1VarD.b(j11, false);
        int i12 = (z12 || z11) ? iB : (int) (jB >> 32);
        int i13 = (!z12 || z11) ? iB : (int) (jB & 4294967295L);
        ie.o oVar = z0Var.f23057v;
        int i14 = -1;
        if (z11 || oVar == null) {
            j12 = 4294967295L;
        } else {
            j12 = 4294967295L;
            int i15 = z0Var.f23055t;
            if (i15 != -1) {
                i14 = i15;
            }
        }
        j3.u0 u0Var = o1VarD.f51124a;
        if (z11) {
            wVar2 = null;
        } else {
            int i16 = (int) (jB >> 32);
            int i17 = (int) (jB & j12);
            wVar2 = new w(new v(ue.f.u(u0Var, i16), i16, 1L), new v(ue.f.u(u0Var, i17), i17, 1L), j3.x0.g(jB));
        }
        ie.o oVar2 = new ie.o(z12, wVar2, new t(i12, i13, i14, u0Var), 1);
        if (wVar2 != null && oVar != null && z12 == oVar.f34405b) {
            t tVar = (t) oVar.f34407d;
            if (i12 == tVar.f22991b && i13 == tVar.f22992c) {
                return j13;
            }
        }
        z0Var.f23057v = oVar2;
        z0Var.f23055t = iB;
        switch (aVar.f20675a) {
            case 17:
                t tVar2 = (t) oVar2.f34407d;
                wVar3 = new w(tVar2.b(tVar2.f22991b), tVar2.b(tVar2.f22992c), oVar2.e() == j.CROSSED);
                break;
            case 18:
                wVar3 = se.k.d(oVar2, x.f23016c);
                break;
            case 19:
                wVar3 = se.k.d(oVar2, x.f23015b);
                break;
            default:
                wVar3 = (w) oVar2.f34406c;
                if (wVar3 != null) {
                    v vVar = wVar3.f23006b;
                    v vVar2 = wVar3.f23005a;
                    t tVar3 = (t) oVar2.f34407d;
                    if (oVar2.f34405b) {
                        vVarF2 = se.k.f(oVar2, tVar3, vVar2);
                        vVarF = vVar;
                        vVar = vVar2;
                        vVar2 = vVarF2;
                    } else {
                        vVarF = se.k.f(oVar2, tVar3, vVar);
                        vVarF2 = vVarF;
                    }
                    if (!kotlin.jvm.internal.m.a(vVarF2, vVar)) {
                        w wVar5 = new w(vVar2, vVarF, oVar2.e() == j.CROSSED || (oVar2.e() == j.COLLAPSED && vVar2.f23000b > vVarF.f23000b));
                        t tVar4 = (t) oVar2.f34407d;
                        v vVar3 = wVar5.f23005a;
                        long j14 = vVar3.f23001c;
                        v vVar4 = wVar5.f23006b;
                        if (j14 != vVar4.f23001c) {
                            boolean z15 = wVar5.f23007c;
                            if ((z15 ? vVar3 : vVar4).f23000b == 0) {
                                if (((j3.u0) tVar4.f22994e).f35797a.f35784a.f35700b.length() == (z15 ? vVar4 : vVar3).f23000b) {
                                    String str = ((j3.u0) tVar4.f22994e).f35797a.f35784a.f35700b;
                                    wVar4 = (w) oVar2.f34406c;
                                    boolean z16 = oVar2.f34405b;
                                    if (wVar4 == null) {
                                    }
                                }
                            }
                        } else if (vVar3.f23000b == vVar4.f23000b) {
                            String str2 = ((j3.u0) tVar4.f22994e).f35797a.f35784a.f35700b;
                            wVar4 = (w) oVar2.f34406c;
                            boolean z17 = oVar2.f34405b;
                            if (wVar4 == null && str2.length() != 0) {
                                String str3 = ((j3.u0) tVar4.f22994e).f35797a.f35784a.f35700b;
                                int i18 = tVar4.f22991b;
                                int length = str3.length();
                                if (i18 == 0) {
                                    int iR = s0.o0.r(0, str3);
                                    wVar3 = !z17 ? w.a(wVar5, null, se.k.k(vVar4, tVar4, iR), false, 1) : w.a(wVar5, se.k.k(vVar3, tVar4, iR), null, true, 2);
                                } else if (i18 != length) {
                                    boolean z18 = wVar4.f23007c;
                                    int iU = z17 ^ z18 ? s0.o0.u(i18, str3) : s0.o0.r(i18, str3);
                                    wVar3 = !z17 ? w.a(wVar5, null, se.k.k(vVar4, tVar4, iU), z18, 1) : w.a(wVar5, se.k.k(vVar3, tVar4, iU), null, z18, 2);
                                } else {
                                    int iU2 = s0.o0.u(length, str3);
                                    wVar3 = !z17 ? w.a(wVar5, null, se.k.k(vVar4, tVar4, iU2), true, 1) : w.a(wVar5, se.k.k(vVar3, tVar4, iU2), null, false, 2);
                                }
                                break;
                            }
                        }
                        wVar3 = wVar5;
                    }
                } else {
                    wVar3 = se.k.d(oVar2, x.f23016c);
                }
                break;
        }
        long jB2 = j3.t.b(z0Var.f23038b.f(wVar3.f23005a.f23000b), z0Var.f23038b.f(wVar3.f23006b.f23000b));
        if (j3.x0.b(jB2, j13)) {
            return j13;
        }
        boolean z19 = j3.x0.g(jB2) != j3.x0.g(j13) && j3.x0.b(j3.t.b((int) (jB2 & j12), (int) (jB2 >> 32)), j13);
        boolean z20 = j3.x0.c(jB2) && j3.x0.c(j13);
        if (z13 && hVar.f35700b.length() > 0 && !z19 && !z20 && (aVar2 = z0Var.f23047k) != null) {
            aVar2.a(9);
        }
        z0Var.f23039c.invoke(e(hVar, jB2));
        z0Var.f23058w = new j3.x0(jB2);
        if (!z13) {
            z0Var.s(!j3.x0.c(jB2));
        }
        s0.s0 s0Var2 = z0Var.f23040d;
        if (s0Var2 != null) {
            s0Var2.f51181q.setValue(Boolean.valueOf(z13));
        }
        s0.s0 s0Var3 = z0Var.f23040d;
        if (s0Var3 != null) {
            s0Var3.m.setValue(Boolean.valueOf(!j3.x0.c(jB2) && ve.i.E(z0Var, true)));
        }
        s0.s0 s0Var4 = z0Var.f23040d;
        if (s0Var4 != null) {
            z14 = false;
            s0Var4.f51178n.setValue(Boolean.valueOf(!j3.x0.c(jB2) && ve.i.E(z0Var, false)));
        } else {
            z14 = false;
        }
        s0.s0 s0Var5 = z0Var.f23040d;
        if (s0Var5 != null) {
            if (j3.x0.c(jB2) && ve.i.E(z0Var, true)) {
                z14 = true;
            }
            s0Var5.f51179o.setValue(Boolean.valueOf(z14));
        }
        return jB2;
    }

    public static o3.w e(j3.h hVar, long j11) {
        return new o3.w(hVar, j11, (j3.x0) null);
    }

    public final z1 d(boolean z11) {
        rz.b0 b0Var = this.f23045i;
        vy.d dVar = null;
        if (b0Var != null) {
            return rz.e0.B(b0Var, null, rz.d0.UNDISPATCHED, new bp.j(2, this, dVar, z11), 1);
        }
        return null;
    }

    public final void f() {
        rz.b0 b0Var = this.f23045i;
        if (b0Var != null) {
            rz.e0.B(b0Var, null, rz.d0.UNDISPATCHED, new u0(this, null, 0), 1);
        }
    }

    public final void g(f2.b bVar) {
        if (!j3.x0.c(m().f44705b)) {
            s0.s0 s0Var = this.f23040d;
            o1 o1VarD = s0Var != null ? s0Var.d() : null;
            int iE = (bVar == null || o1VarD == null) ? j3.x0.e(m().f44705b) : this.f23038b.f(o1VarD.b(bVar.f26570a, true));
            o3.w wVarA = o3.w.a(m(), null, j3.t.b(iE, iE), 5);
            this.f23039c.invoke(wVarA);
            this.f23058w = new j3.x0(wVarA.f44705b);
        }
        p((bVar == null || m().f44704a.f35700b.length() <= 0) ? s0.h0.None : s0.h0.Cursor);
        s(false);
    }

    public final void h(boolean z11) {
        e2.v vVar;
        s0.s0 s0Var = this.f23040d;
        if (s0Var != null && !s0Var.b() && (vVar = this.f23048l) != null) {
            e2.v.b(vVar);
        }
        this.f23056u = m();
        s(z11);
        p(s0.h0.Selection);
    }

    public final f2.b i() {
        return (f2.b) this.f23054s.getValue();
    }

    public final boolean j() {
        return ((Boolean) this.f23049n.getValue()).booleanValue();
    }

    public final long k(boolean z11) {
        o1 o1VarD;
        long j11;
        s0.s0 s0Var = this.f23040d;
        if (s0Var == null || (o1VarD = s0Var.d()) == null) {
            return 9205357640488583168L;
        }
        j3.u0 u0Var = o1VarD.f51124a;
        j3.x xVar = u0Var.f35798b;
        j3.h hVarL = l();
        if (hVarL == null) {
            return 9205357640488583168L;
        }
        if (!kotlin.jvm.internal.m.a(hVarL.f35700b, u0Var.f35797a.f35784a.f35700b)) {
            return 9205357640488583168L;
        }
        o3.w wVarM = m();
        if (z11) {
            long j12 = wVarM.f44705b;
            int i11 = j3.x0.f35822c;
            j11 = j12 >> 32;
        } else {
            long j13 = wVarM.f44705b;
            int i12 = j3.x0.f35822c;
            j11 = j13 & 4294967295L;
        }
        int iS = this.f23038b.s((int) j11);
        boolean zG = j3.x0.g(m().f44705b);
        long j14 = u0Var.f35799c;
        int iD = xVar.d(iS);
        if (iD >= xVar.f35818f) {
            return 9205357640488583168L;
        }
        boolean z12 = u0Var.a(((!z11 || zG) && (z11 || !zG)) ? Math.max(iS + (-1), 0) : iS) == u0Var.h(iS);
        ArrayList arrayList = xVar.f35820h;
        xVar.l(iS);
        j3.z zVar = (j3.z) arrayList.get(iS == ((j3.h) xVar.f35813a.f517a).f35700b.length() ? ns.o.A(arrayList) : j3.t.e(iS, arrayList));
        j3.b bVar = zVar.f35830a;
        int iD2 = zVar.d(iS);
        k3.r rVar = bVar.f35664d;
        return (((long) Float.floatToRawIntBits(hz.b.k(xVar.b(iD), CropImageView.DEFAULT_ASPECT_RATIO, (int) (j14 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(hz.b.k(z12 ? rVar.h(iD2, false) : rVar.i(iD2, false), CropImageView.DEFAULT_ASPECT_RATIO, (int) (j14 >> 32)))) << 32);
    }

    public final j3.h l() {
        s0.z0 z0Var;
        s0.s0 s0Var = this.f23040d;
        if (s0Var == null || (z0Var = s0Var.f51166a) == null) {
            return null;
        }
        return z0Var.f51266a;
    }

    public final o3.w m() {
        return (o3.w) this.f23041e.getValue();
    }

    public final void n() {
        z1 z1Var;
        y0.k kVar = (y0.k) this.f23060y.f44522b;
        if (kVar == null || (z1Var = kVar.W) == null) {
            return;
        }
        z1Var.cancel(null);
        kVar.W = null;
    }

    public final void o() {
        rz.b0 b0Var = this.f23045i;
        if (b0Var != null) {
            rz.e0.B(b0Var, null, rz.d0.UNDISPATCHED, new u0(this, null, 1), 1);
        }
    }

    public final void p(s0.h0 h0Var) {
        s0.s0 s0Var = this.f23040d;
        if (s0Var != null) {
            if (s0Var.a() == h0Var) {
                s0Var = null;
            }
            if (s0Var != null) {
                s0Var.f51176k.setValue(h0Var);
            }
        }
    }

    public final void q() {
        s0.s0 s0Var;
        z0.e eVar;
        x1.f fVarN = re.q.n();
        vy.d dVar = null;
        fz.c cVarE = fVarN != null ? fVarN.e() : null;
        x1.f fVarR = re.q.r(fVarN);
        try {
            if (!j() || ((s0Var = this.f23040d) != null && !((Boolean) s0Var.f51181q.getValue()).booleanValue())) {
                re.q.t(fVarN, fVarR, cVarE);
                return;
            }
            re.q.t(fVarN, fVarR, cVarE);
            y0.k kVar = (y0.k) this.f23060y.f44522b;
            if (kVar == null) {
                i0.a.d("ToolbarRequester is not initialized.");
                throw new KotlinNothingValueException();
            }
            if (kVar.P) {
                z1 z1Var = kVar.W;
                if ((z1Var == null || !z1Var.isActive()) && (eVar = (z0.e) y2.f.i(kVar, z0.f.f58419b)) != null) {
                    kVar.W = rz.e0.B(kVar.H0(), null, rz.d0.UNDISPATCHED, new y0.j(0, kVar, eVar, dVar), 1);
                }
            }
        } catch (Throwable th2) {
            re.q.t(fVarN, fVarR, cVarE);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(xy.c cVar) {
        y0 y0Var;
        z2.b1 b1Var;
        z0 z0Var;
        if (cVar instanceof y0) {
            y0Var = (y0) cVar;
            int i11 = y0Var.f23034d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                y0Var.f23034d = i11 - Integer.MIN_VALUE;
            } else {
                y0Var = new y0(this, cVar);
            }
        } else {
            y0Var = new y0(this, cVar);
        }
        Object b1Var2 = y0Var.f23032b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = y0Var.f23034d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(b1Var2);
            z2.c1 c1Var = this.f23044h;
            b1Var = null;
            if (c1Var != null) {
                y0Var.f23031a = this;
                y0Var.f23034d = 1;
                ClipData primaryClip = ((z2.g) c1Var).f58538a.f58568a.getPrimaryClip();
                b1Var2 = primaryClip != null ? new z2.b1(primaryClip) : null;
                if (b1Var2 == aVar) {
                    return aVar;
                }
                z0Var = this;
            } else {
                z0Var = this;
            }
            z0Var.f23059x.setValue(b1Var);
            return qy.b0.f48488a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z0Var = y0Var.f23031a;
        com.bumptech.glide.e.F(b1Var2);
        b1Var = (z2.b1) b1Var2;
        z0Var.f23059x.setValue(b1Var);
        return qy.b0.f48488a;
    }

    public final void s(boolean z11) {
        s0.s0 s0Var = this.f23040d;
        if (s0Var != null) {
            s0Var.f51177l.setValue(Boolean.valueOf(z11));
        }
        if (z11) {
            q();
        } else {
            n();
        }
    }
}
