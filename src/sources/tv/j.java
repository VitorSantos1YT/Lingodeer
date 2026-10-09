package tv;

import a0.t1;
import bt.h1;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import g2.x;
import h1.a6;
import h1.e8;
import h1.s1;
import h1.ua;
import h1.v1;
import iu.k;
import j0.a2;
import j0.e2;
import j0.i1;
import j0.t;
import j0.u;
import j0.z1;
import j3.y0;
import kotlin.jvm.internal.m;
import l1.b1;
import l1.b3;
import l1.n;
import l1.q1;
import l1.s;
import l1.x1;
import mt.h2;
import pr.y;
import pr.z;
import qy.b0;
import rz.w;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j {
    public static final void a(int i11, int i12, fz.a onClick, String str, n nVar) {
        m.f(onClick, "onClick");
        s sVar = (s) nVar;
        sVar.f0(-1157275889);
        int i13 = (sVar.d(i11) ? 32 : 16) | i12 | (sVar.h(onClick) ? 2048 : 1024);
        if (sVar.T(i13 & 1, (i13 & 1171) != 1170)) {
            z1.h hVar = z1.c.P;
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            i1 i1Var = new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            boolean z11 = (i13 & 7168) == 2048;
            Object objQ = sVar.Q();
            if (z11 || objQ == l1.m.f39353a) {
                objQ = new okhttp3.b(16, onClick);
                sVar.o0(objQ);
            }
            r rVarQ = k.q(0, 7, (fz.a) objQ, sVar, i1Var, false);
            u uVarA = t.a(j0.i.f35305c, hVar, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarQ);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar2 = y2.j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar2);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            k2.b bVarY = se.k.y(i11, sVar, (i13 >> 3) & 14);
            o oVar = o.f58481a;
            d0.n.c(bVarY, null, e2.n(oVar, 43), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 432, 120);
            ua.b(str, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), ((s1) sVar.j(v1.f31180a)).f31034q, j3.A(14), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar, 54, 0, 65532);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new i(i11, str, onClick, i12);
        }
    }

    public static final void b(b1 b1Var, fz.e eVar, fz.a aVar, fz.a aVar2, t1.d dVar, n nVar, int i11) {
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.f0(-1118158828);
        int i12 = i11 | (sVar2.h(eVar) ? 32 : 16) | (sVar2.h(aVar) ? 256 : 128) | (sVar2.h(aVar2) ? 2048 : 1024);
        if (sVar2.T(i12 & 1, (i12 & 9363) != 9362)) {
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = new z(9, b1Var);
                sVar2.o0(objQ);
            }
            se.i.a(false, (fz.a) objQ, sVar2, 0, 1);
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ2);
            }
            b1 b1Var2 = (b1) objQ2;
            Object objQ3 = sVar2.Q();
            if (objQ3 == gVar) {
                objQ3 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ3);
            }
            b1 b1Var3 = (b1) objQ3;
            Object objQ4 = sVar2.Q();
            if (objQ4 == gVar) {
                objQ4 = l1.t.B(new x(x.f28621h));
                sVar2.o0(objQ4);
            }
            b1 b1Var4 = (b1) objQ4;
            b3 b3VarA = t1.a(((x) b1Var4.getValue()).f28624a, null, BuildConfig.VERSION_NAME, sVar2, 384, 10);
            Object objQ5 = sVar2.Q();
            vy.d dVar2 = null;
            if (objQ5 == gVar) {
                h1 h1Var = new h1(b1Var2, b1Var3, b1Var4, dVar2, 1);
                sVar2.o0(h1Var);
                objQ5 = h1Var;
            }
            l1.t.f((fz.e) objQ5, b0.f48488a, sVar2);
            long j11 = x.f28621h;
            r0.e eVarD = r0.f.d(0);
            e8 e8VarF = a6.f(6, 2, 0, sVar2);
            Object objQ6 = sVar2.Q();
            if (objQ6 == gVar) {
                objQ6 = new z(10, b1Var);
                sVar2.o0(objQ6);
            }
            sVar = sVar2;
            a6.a((fz.a) objQ6, null, e8VarF, CropImageView.DEFAULT_ASPECT_RATIO, eVarD, j11, 0L, CropImageView.DEFAULT_ASPECT_RATIO, j11, a.f52636e, new w(13), null, t1.e.d(1693889175, new h2(b3VarA, b1Var, b1Var2, dVar, b1Var3, eVar, aVar2, aVar), sVar2), sVar, 906166272, 384, 2250);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.v1(b1Var, eVar, aVar, aVar2, dVar, i11);
        }
    }

    public static final void c(r rVar, final fz.e share, n nVar, int i11) {
        m.f(share, "share");
        s sVar = (s) nVar;
        sVar.f0(426339191);
        int i12 = (sVar.h(share) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            r rVarC = j0.c.C(j0.c.E(e2.e(rVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 12, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC2 = z1.a.c(sVar, rVarC);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, a2VarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC2, sVar);
            int i13 = i12 & 112;
            boolean z11 = i13 == 32;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                final int i14 = 0;
                objQ = new fz.a() { // from class: tv.h
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                share.invoke("com.instagram.android", "Instagram");
                                break;
                            case 1:
                                share.invoke("com.twitter.android", "Twitter");
                                break;
                            case 2:
                                share.invoke("com.facebook.katana", "Facebook");
                                break;
                            default:
                                share.invoke("com.whatsapp", "WhatsApp");
                                break;
                        }
                        return b0.f48488a;
                    }
                };
                sVar.o0(objQ);
            }
            a(R.drawable.lb_share_instagram, 390, (fz.a) objQ, "Instagram", sVar);
            boolean z12 = i13 == 32;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                final int i15 = 1;
                objQ2 = new fz.a() { // from class: tv.h
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                share.invoke("com.instagram.android", "Instagram");
                                break;
                            case 1:
                                share.invoke("com.twitter.android", "Twitter");
                                break;
                            case 2:
                                share.invoke("com.facebook.katana", "Facebook");
                                break;
                            default:
                                share.invoke("com.whatsapp", "WhatsApp");
                                break;
                        }
                        return b0.f48488a;
                    }
                };
                sVar.o0(objQ2);
            }
            a(R.drawable.lb_share_twitter, 390, (fz.a) objQ2, "Twitter", sVar);
            boolean z13 = i13 == 32;
            Object objQ3 = sVar.Q();
            if (z13 || objQ3 == gVar) {
                final int i16 = 2;
                objQ3 = new fz.a() { // from class: tv.h
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                share.invoke("com.instagram.android", "Instagram");
                                break;
                            case 1:
                                share.invoke("com.twitter.android", "Twitter");
                                break;
                            case 2:
                                share.invoke("com.facebook.katana", "Facebook");
                                break;
                            default:
                                share.invoke("com.whatsapp", "WhatsApp");
                                break;
                        }
                        return b0.f48488a;
                    }
                };
                sVar.o0(objQ3);
            }
            a(R.drawable.lb_share_facebook, 390, (fz.a) objQ3, "Facebook", sVar);
            boolean z14 = i13 == 32;
            Object objQ4 = sVar.Q();
            if (z14 || objQ4 == gVar) {
                final int i17 = 3;
                objQ4 = new fz.a() { // from class: tv.h
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i17) {
                            case 0:
                                share.invoke("com.instagram.android", "Instagram");
                                break;
                            case 1:
                                share.invoke("com.twitter.android", "Twitter");
                                break;
                            case 2:
                                share.invoke("com.facebook.katana", "Facebook");
                                break;
                            default:
                                share.invoke("com.whatsapp", "WhatsApp");
                                break;
                        }
                        return b0.f48488a;
                    }
                };
                sVar.o0(objQ4);
            }
            a(R.drawable.lb_share_whatsapp, 390, (fz.a) objQ4, "WhatsApp", sVar);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new y(rVar, i11, 14, share);
        }
    }

    public static final String d(String str) {
        m.f(str, "<this>");
        switch (str.hashCode()) {
            case -1547699361:
                return !str.equals("com.whatsapp") ? BuildConfig.VERSION_NAME : "whatsapp";
            case -662003450:
                return str.equals("com.instagram.android") ? "instagram" : BuildConfig.VERSION_NAME;
            case 10619783:
                return !str.equals("com.twitter.android") ? BuildConfig.VERSION_NAME : "twitter";
            case 714499313:
                return !str.equals("com.facebook.katana") ? BuildConfig.VERSION_NAME : "facebook";
            default:
                return BuildConfig.VERSION_NAME;
        }
    }
}
