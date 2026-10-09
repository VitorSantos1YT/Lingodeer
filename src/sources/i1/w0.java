package i1;

import b0.y1;
import com.yalantis.ucrop.view.CropImageView;
import kotlin.NoWhenBranchMatchedException;
import l1.b3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j3.y0 f34088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j3.y0 f34089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f34090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b3 f34091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.e f34092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f34093f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b3 f34094t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(j3.y0 y0Var, j3.y0 y0Var2, float f5, y1 y1Var, fz.e eVar, boolean z11, y1 y1Var2) {
        super(2);
        this.f34088a = y0Var;
        this.f34089b = y0Var2;
        this.f34090c = f5;
        this.f34091d = y1Var;
        this.f34092e = eVar;
        this.f34093f = z11;
        this.f34094t = y1Var2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x009e  */
    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:41:0x010d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0110  */
    /* JADX WARN: Code duplicated, block: B:45:0x0115  */
    /* JADX WARN: Code duplicated, block: B:48:0x0121  */
    /* JADX WARN: Code duplicated, block: B:52:0x0127  */
    /* JADX WARN: Code duplicated, block: B:55:0x0165  */
    /* JADX WARN: Code duplicated, block: B:58:0x016e  */
    /* JADX WARN: Code duplicated, block: B:63:0x01d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x01da  */
    /* JADX WARN: Code duplicated, block: B:68:0x0238  */
    /* JADX WARN: Code duplicated, block: B:71:0x023e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0260  */
    /* JADX WARN: Code duplicated, block: B:78:0x0264  */
    /* JADX WARN: Code duplicated, block: B:79:0x0266  */
    /* JADX WARN: Code duplicated, block: B:82:0x026b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0270  */
    /* JADX WARN: Code duplicated, block: B:86:0x0273  */
    /* JADX WARN: Code duplicated, block: B:89:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        j3.y0 y0Var;
        u3.o oVar;
        u3.o oVar2;
        boolean z11;
        u3.o bVar;
        float f5;
        n3.s sVar;
        n3.s sVar2;
        u3.a aVar;
        float f11;
        float f12;
        u3.a aVar2;
        u3.p pVar;
        u3.p pVar2;
        u3.p pVar3;
        g2.v0 v0Var;
        g2.v0 v0Var2;
        j3.g0 g0Var;
        j3.g0 g0Var2;
        u3.q qVar;
        u3.q qVar2;
        j3.f0 f0Var;
        j3.f0 f0Var2;
        j3.f0 f0Var3;
        j3.f0 f0Var4;
        boolean z12;
        boolean z13;
        j3.f0 f0Var5;
        l1.n nVar = (l1.n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            l1.s sVar3 = (l1.s) nVar;
            if (sVar3.F()) {
                sVar3.W();
            } else {
                j3.y0 y0Var2 = this.f34088a;
                j3.p0 p0Var = y0Var2.f35827a;
                j3.y0 y0Var3 = this.f34089b;
                j3.p0 p0Var2 = y0Var3.f35827a;
                u3.o oVar3 = j3.q0.f35773d;
                oVar = p0Var.f35754a;
                oVar2 = p0Var2.f35754a;
                z11 = oVar instanceof u3.b;
                bVar = u3.n.f52756a;
                f5 = this.f34090c;
                if (z11 && !(oVar2 instanceof u3.b)) {
                    long jU = g2.f0.u(f5, oVar.b(), oVar2.b());
                    if (jU != 16) {
                        bVar = new u3.c(jU);
                    }
                } else if (z11 || !(oVar2 instanceof u3.b)) {
                    bVar = (u3.o) j3.q0.b(f5, oVar, oVar2);
                } else {
                    u3.b bVar2 = (u3.b) oVar;
                    u3.b bVar3 = (u3.b) oVar2;
                    g2.t tVar = (g2.t) j3.q0.b(f5, bVar2.f52734a, bVar3.f52734a);
                    float fA = android.support.v4.media.session.a.A(bVar2.f52735b, bVar3.f52735b, f5);
                    if (tVar != null) {
                        if (tVar instanceof g2.y0) {
                            long jU2 = se.p.U(((g2.y0) tVar).f28628a, fA);
                            if (jU2 != 16) {
                                bVar = new u3.c(jU2);
                            }
                        } else {
                            if (!(tVar instanceof g2.u0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar = new u3.b((g2.u0) tVar, fA);
                        }
                    }
                }
                u3.o oVar4 = bVar;
                n3.i iVar = (n3.i) j3.q0.b(f5, p0Var.f35759f, p0Var2.f35759f);
                long jC = j3.q0.c(f5, p0Var.f35755b, p0Var2.f35755b);
                sVar = p0Var.f35756c;
                if (sVar == null) {
                    sVar = n3.s.f43178t;
                }
                sVar2 = p0Var2.f35756c;
                if (sVar2 == null) {
                    sVar2 = n3.s.f43178t;
                }
                n3.s sVar4 = new n3.s(hz.b.l(android.support.v4.media.session.a.B(sVar.f43179a, f5, sVar2.f43179a), 1, 1000));
                n3.o oVar5 = (n3.o) j3.q0.b(f5, p0Var.f35757d, p0Var2.f35757d);
                n3.p pVar4 = (n3.p) j3.q0.b(f5, p0Var.f35758e, p0Var2.f35758e);
                String str = (String) j3.q0.b(f5, p0Var.f35760g, p0Var2.f35760g);
                long jC2 = j3.q0.c(f5, p0Var.f35761h, p0Var2.f35761h);
                aVar = p0Var.f35762i;
                f11 = CropImageView.DEFAULT_ASPECT_RATIO;
                if (aVar != null) {
                    f12 = aVar.f52733a;
                } else {
                    f12 = 0.0f;
                }
                aVar2 = p0Var2.f35762i;
                if (aVar2 != null) {
                    f11 = aVar2.f52733a;
                }
                float fA2 = android.support.v4.media.session.a.A(f12, f11, f5);
                pVar = p0Var.f35763j;
                pVar2 = u3.p.f52757c;
                if (pVar == null) {
                    pVar = pVar2;
                }
                pVar3 = p0Var2.f35763j;
                if (pVar3 != null) {
                    pVar2 = pVar3;
                }
                u3.p pVar5 = new u3.p(android.support.v4.media.session.a.A(pVar.f52758a, pVar2.f52758a, f5), android.support.v4.media.session.a.A(pVar.f52759b, pVar2.f52759b, f5));
                q3.b bVar4 = (q3.b) j3.q0.b(f5, p0Var.f35764k, p0Var2.f35764k);
                long jU3 = g2.f0.u(f5, p0Var.f35765l, p0Var2.f35765l);
                u3.l lVar = (u3.l) j3.q0.b(f5, p0Var.m, p0Var2.m);
                v0Var = p0Var.f35766n;
                if (v0Var == null) {
                    v0Var = new g2.v0();
                }
                v0Var2 = p0Var2.f35766n;
                if (v0Var2 == null) {
                    v0Var2 = new g2.v0();
                }
                long jU4 = g2.f0.u(f5, v0Var.f28611a, v0Var2.f28611a);
                long j11 = v0Var.f28612b;
                long j12 = v0Var2.f28612b;
                g2.v0 v0Var3 = new g2.v0(jU4, (((long) Float.floatToRawIntBits(android.support.v4.media.session.a.A(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j12 >> 32)), f5))) << 32) | (((long) Float.floatToRawIntBits(android.support.v4.media.session.a.A(Float.intBitsToFloat((int) (j11 & 4294967295L)), Float.intBitsToFloat((int) (j12 & 4294967295L)), f5))) & 4294967295L), android.support.v4.media.session.a.A(v0Var.f28613c, v0Var2.f28613c, f5));
                g0Var = p0Var.f35767o;
                j3.g0 g0Var3 = p0Var2.f35767o;
                if (g0Var == null || g0Var3 != null) {
                    if (g0Var == null) {
                        g0Var = j3.g0.f35697a;
                    }
                    g0Var2 = g0Var;
                } else {
                    g0Var2 = null;
                }
                j3.p0 p0Var3 = new j3.p0(oVar4, jC, sVar4, oVar5, pVar4, iVar, str, jC2, new u3.a(fA2), pVar5, bVar4, jU3, lVar, v0Var3, g0Var2, (i2.e) j3.q0.b(f5, p0Var.f35768p, p0Var2.f35768p));
                j3.c0 c0Var = y0Var2.f35828b;
                j3.c0 c0Var2 = y0Var3.f35828b;
                int i11 = j3.d0.f35682b;
                int i12 = ((u3.k) j3.q0.b(f5, new u3.k(c0Var.f35668a), new u3.k(c0Var2.f35668a))).f52750a;
                int i13 = ((u3.m) j3.q0.b(f5, new u3.m(c0Var.f35669b), new u3.m(c0Var2.f35669b))).f52755a;
                long jC3 = j3.q0.c(f5, c0Var.f35670c, c0Var2.f35670c);
                qVar = c0Var.f35671d;
                if (qVar == null) {
                    qVar = u3.q.f52760c;
                }
                qVar2 = c0Var2.f35671d;
                if (qVar2 == null) {
                    qVar2 = u3.q.f52760c;
                }
                u3.q qVar3 = new u3.q(j3.q0.c(f5, qVar.f52761a, qVar2.f52761a), j3.q0.c(f5, qVar.f52762b, qVar2.f52762b));
                f0Var = c0Var.f35672e;
                f0Var2 = c0Var2.f35672e;
                if (f0Var == null || f0Var2 != null) {
                    f0Var3 = j3.f0.f35693c;
                    if (f0Var == null) {
                        f0Var4 = f0Var3;
                    } else {
                        f0Var4 = f0Var;
                    }
                    z12 = f0Var4.f35694a;
                    if (f0Var2 == null) {
                        f0Var2 = f0Var3;
                    }
                    z13 = f0Var2.f35694a;
                    if (z12 == z13) {
                        f0Var5 = f0Var4;
                    } else {
                        f0Var5 = new j3.f0(((j3.q) j3.q0.b(f5, new j3.q(f0Var4.f35695b), new j3.q(f0Var2.f35695b))).f35769a, ((Boolean) j3.q0.b(f5, Boolean.valueOf(z12), Boolean.valueOf(z13))).booleanValue());
                    }
                } else {
                    f0Var5 = null;
                }
                y0Var = new j3.y0(p0Var3, new j3.c0(i12, i13, jC3, qVar3, f0Var5, (u3.i) j3.q0.b(f5, c0Var.f35673f, c0Var2.f35673f), ((u3.e) j3.q0.b(f5, new u3.e(c0Var.f35674g), new u3.e(c0Var2.f35674g))).f52739a, ((u3.d) j3.q0.b(f5, new u3.d(c0Var.f35675h), new u3.d(c0Var2.f35675h))).f52737a, (u3.s) j3.q0.b(f5, c0Var.f35676i, c0Var2.f35676i)));
                if (this.f34093f) {
                    y0Var = j3.y0.a(y0Var, ((g2.x) this.f34094t.getValue()).f28624a, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214);
                }
                d1.b(((g2.x) this.f34091d.getValue()).f28624a, y0Var, this.f34092e, nVar, 0);
            }
        } else {
            j3.y0 y0Var4 = this.f34088a;
            j3.p0 p0Var4 = y0Var4.f35827a;
            j3.y0 y0Var5 = this.f34089b;
            j3.p0 p0Var5 = y0Var5.f35827a;
            u3.o oVar6 = j3.q0.f35773d;
            oVar = p0Var4.f35754a;
            oVar2 = p0Var5.f35754a;
            z11 = oVar instanceof u3.b;
            bVar = u3.n.f52756a;
            f5 = this.f34090c;
            if (z11) {
                if (z11) {
                    bVar = (u3.o) j3.q0.b(f5, oVar, oVar2);
                } else {
                    bVar = (u3.o) j3.q0.b(f5, oVar, oVar2);
                }
            } else if (z11) {
                bVar = (u3.o) j3.q0.b(f5, oVar, oVar2);
            } else {
                bVar = (u3.o) j3.q0.b(f5, oVar, oVar2);
            }
            u3.o oVar7 = bVar;
            n3.i iVar2 = (n3.i) j3.q0.b(f5, p0Var4.f35759f, p0Var5.f35759f);
            long jC4 = j3.q0.c(f5, p0Var4.f35755b, p0Var5.f35755b);
            sVar = p0Var4.f35756c;
            if (sVar == null) {
                sVar = n3.s.f43178t;
            }
            sVar2 = p0Var5.f35756c;
            if (sVar2 == null) {
                sVar2 = n3.s.f43178t;
            }
            n3.s sVar5 = new n3.s(hz.b.l(android.support.v4.media.session.a.B(sVar.f43179a, f5, sVar2.f43179a), 1, 1000));
            n3.o oVar8 = (n3.o) j3.q0.b(f5, p0Var4.f35757d, p0Var5.f35757d);
            n3.p pVar6 = (n3.p) j3.q0.b(f5, p0Var4.f35758e, p0Var5.f35758e);
            String str2 = (String) j3.q0.b(f5, p0Var4.f35760g, p0Var5.f35760g);
            long jC5 = j3.q0.c(f5, p0Var4.f35761h, p0Var5.f35761h);
            aVar = p0Var4.f35762i;
            f11 = CropImageView.DEFAULT_ASPECT_RATIO;
            if (aVar != null) {
                f12 = aVar.f52733a;
            } else {
                f12 = 0.0f;
            }
            aVar2 = p0Var5.f35762i;
            if (aVar2 != null) {
                f11 = aVar2.f52733a;
            }
            float fA3 = android.support.v4.media.session.a.A(f12, f11, f5);
            pVar = p0Var4.f35763j;
            pVar2 = u3.p.f52757c;
            if (pVar == null) {
                pVar = pVar2;
            }
            pVar3 = p0Var5.f35763j;
            if (pVar3 != null) {
                pVar2 = pVar3;
            }
            u3.p pVar7 = new u3.p(android.support.v4.media.session.a.A(pVar.f52758a, pVar2.f52758a, f5), android.support.v4.media.session.a.A(pVar.f52759b, pVar2.f52759b, f5));
            q3.b bVar5 = (q3.b) j3.q0.b(f5, p0Var4.f35764k, p0Var5.f35764k);
            long jU5 = g2.f0.u(f5, p0Var4.f35765l, p0Var5.f35765l);
            u3.l lVar2 = (u3.l) j3.q0.b(f5, p0Var4.m, p0Var5.m);
            v0Var = p0Var4.f35766n;
            if (v0Var == null) {
                v0Var = new g2.v0();
            }
            v0Var2 = p0Var5.f35766n;
            if (v0Var2 == null) {
                v0Var2 = new g2.v0();
            }
            long jU6 = g2.f0.u(f5, v0Var.f28611a, v0Var2.f28611a);
            long j13 = v0Var.f28612b;
            long j14 = v0Var2.f28612b;
            g2.v0 v0Var4 = new g2.v0(jU6, (((long) Float.floatToRawIntBits(android.support.v4.media.session.a.A(Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j14 >> 32)), f5))) << 32) | (((long) Float.floatToRawIntBits(android.support.v4.media.session.a.A(Float.intBitsToFloat((int) (j13 & 4294967295L)), Float.intBitsToFloat((int) (j14 & 4294967295L)), f5))) & 4294967295L), android.support.v4.media.session.a.A(v0Var.f28613c, v0Var2.f28613c, f5));
            g0Var = p0Var4.f35767o;
            j3.g0 g0Var4 = p0Var5.f35767o;
            if (g0Var == null) {
                if (g0Var == null) {
                    g0Var = j3.g0.f35697a;
                }
                g0Var2 = g0Var;
            } else {
                if (g0Var == null) {
                    g0Var = j3.g0.f35697a;
                }
                g0Var2 = g0Var;
            }
            j3.p0 p0Var6 = new j3.p0(oVar7, jC4, sVar5, oVar8, pVar6, iVar2, str2, jC5, new u3.a(fA3), pVar7, bVar5, jU5, lVar2, v0Var4, g0Var2, (i2.e) j3.q0.b(f5, p0Var4.f35768p, p0Var5.f35768p));
            j3.c0 c0Var3 = y0Var4.f35828b;
            j3.c0 c0Var4 = y0Var5.f35828b;
            int i14 = j3.d0.f35682b;
            int i15 = ((u3.k) j3.q0.b(f5, new u3.k(c0Var3.f35668a), new u3.k(c0Var4.f35668a))).f52750a;
            int i16 = ((u3.m) j3.q0.b(f5, new u3.m(c0Var3.f35669b), new u3.m(c0Var4.f35669b))).f52755a;
            long jC6 = j3.q0.c(f5, c0Var3.f35670c, c0Var4.f35670c);
            qVar = c0Var3.f35671d;
            if (qVar == null) {
                qVar = u3.q.f52760c;
            }
            qVar2 = c0Var4.f35671d;
            if (qVar2 == null) {
                qVar2 = u3.q.f52760c;
            }
            u3.q qVar4 = new u3.q(j3.q0.c(f5, qVar.f52761a, qVar2.f52761a), j3.q0.c(f5, qVar.f52762b, qVar2.f52762b));
            f0Var = c0Var3.f35672e;
            f0Var2 = c0Var4.f35672e;
            if (f0Var == null) {
                f0Var3 = j3.f0.f35693c;
                if (f0Var == null) {
                    f0Var4 = f0Var3;
                } else {
                    f0Var4 = f0Var;
                }
                z12 = f0Var4.f35694a;
                if (f0Var2 == null) {
                    f0Var2 = f0Var3;
                }
                z13 = f0Var2.f35694a;
                if (z12 == z13) {
                    f0Var5 = f0Var4;
                } else {
                    f0Var5 = new j3.f0(((j3.q) j3.q0.b(f5, new j3.q(f0Var4.f35695b), new j3.q(f0Var2.f35695b))).f35769a, ((Boolean) j3.q0.b(f5, Boolean.valueOf(z12), Boolean.valueOf(z13))).booleanValue());
                }
            } else {
                f0Var3 = j3.f0.f35693c;
                if (f0Var == null) {
                    f0Var4 = f0Var3;
                } else {
                    f0Var4 = f0Var;
                }
                z12 = f0Var4.f35694a;
                if (f0Var2 == null) {
                    f0Var2 = f0Var3;
                }
                z13 = f0Var2.f35694a;
                if (z12 == z13) {
                    f0Var5 = f0Var4;
                } else {
                    f0Var5 = new j3.f0(((j3.q) j3.q0.b(f5, new j3.q(f0Var4.f35695b), new j3.q(f0Var2.f35695b))).f35769a, ((Boolean) j3.q0.b(f5, Boolean.valueOf(z12), Boolean.valueOf(z13))).booleanValue());
                }
            }
            y0Var = new j3.y0(p0Var6, new j3.c0(i15, i16, jC6, qVar4, f0Var5, (u3.i) j3.q0.b(f5, c0Var3.f35673f, c0Var4.f35673f), ((u3.e) j3.q0.b(f5, new u3.e(c0Var3.f35674g), new u3.e(c0Var4.f35674g))).f52739a, ((u3.d) j3.q0.b(f5, new u3.d(c0Var3.f35675h), new u3.d(c0Var4.f35675h))).f52737a, (u3.s) j3.q0.b(f5, c0Var3.f35676i, c0Var4.f35676i)));
            if (this.f34093f) {
                y0Var = j3.y0.a(y0Var, ((g2.x) this.f34094t.getValue()).f28624a, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214);
            }
            d1.b(((g2.x) this.f34091d.getValue()).f28624a, y0Var, this.f34092e, nVar, 0);
        }
        return qy.b0.f48488a;
    }
}
