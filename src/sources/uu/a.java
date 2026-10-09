package uu;

import android.content.res.Resources;
import at.q;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import e2.v;
import fr.j3;
import h1.ac;
import h1.bc;
import h1.i9;
import h1.k7;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.e2;
import j0.t;
import j0.u;
import j3.e0;
import j3.p0;
import j3.v0;
import j3.y0;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.m;
import l1.b1;
import l1.c3;
import l1.n;
import l1.q1;
import l1.s;
import l1.x1;
import n3.p;
import oz.x;
import pr.z;
import qy.b0;
import rz.w;
import s0.k0;
import s0.o0;
import w2.q0;
import z1.o;
import z1.r;
import z2.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1.d f53131a = new t1.d(new w(15), false, -61427959);

    public static final void a(String userEmail, boolean z11, e2.l focusManager, Resources curLocalizedResource, v vVar, fz.c onValueChange, n nVar, int i11) {
        boolean z12;
        m.f(userEmail, "userEmail");
        m.f(focusManager, "focusManager");
        m.f(curLocalizedResource, "curLocalizedResource");
        m.f(onValueChange, "onValueChange");
        s sVar = (s) nVar;
        sVar.f0(-1246582756);
        int i12 = (sVar.f(userEmail) ? 4 : 2) | i11;
        if ((i11 & 48) == 0) {
            z12 = z11;
            i12 |= sVar.g(z12) ? 32 : 16;
        } else {
            z12 = z11;
        }
        int i13 = i12 | (sVar.h(focusManager) ? 256 : 128);
        if ((i11 & 3072) == 0) {
            i13 |= sVar.h(curLocalizedResource) ? 2048 : 1024;
        }
        int i14 = i13 | (sVar.f(vVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.h(onValueChange) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536);
        if (sVar.T(i14 & 1, (74899 & i14) != 74898)) {
            float f5 = 22;
            k7.k(e2.e(e2.g(j0.c.E(o.f58481a, f5, 27, f5, CropImageView.DEFAULT_ASPECT_RATIO, 8), 72), 1.0f), r0.f.d(12), null, null, d0.n.a(((s1) sVar.j(v1.f31180a)).A, (float) 1.5d), t1.e.d(-1063111280, new jr.h(focusManager, vVar, userEmail, onValueChange, z12, curLocalizedResource), sVar), sVar, 196608, 12);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new jt.b(userEmail, z11, focusManager, curLocalizedResource, vVar, onValueChange, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:108:0x0319  */
    /* JADX WARN: Code duplicated, block: B:109:0x031b  */
    /* JADX WARN: Code duplicated, block: B:115:0x032c  */
    /* JADX WARN: Code duplicated, block: B:118:0x039d  */
    /* JADX WARN: Code duplicated, block: B:121:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x018e  */
    /* JADX WARN: Code duplicated, block: B:72:0x019f  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:83:0x020c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0247  */
    /* JADX WARN: Code duplicated, block: B:89:0x0286  */
    /* JADX WARN: Code duplicated, block: B:90:0x028a  */
    /* JADX WARN: Code duplicated, block: B:95:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:98:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:99:0x02b5  */
    public static final void b(final String userEmail, final String userPassword, final boolean z11, final boolean z12, final boolean z13, final Resources curLocalizedResource, final fz.c updateEmail, final fz.c updatePassword, fz.a onClickFindPassword, fz.a aVar, final fz.a onClickSingUp, final fz.a onBackClick, final fz.a onClickTermsOfUse, final fz.a onClickPrivacyPolicy, n nVar, final int i11) {
        final fz.a aVar2;
        y2.h hVar;
        Object objQ;
        l1.g gVar;
        b1 b1Var;
        Object objQ2;
        b1 b1Var2;
        boolean z14;
        Object objQ3;
        Object objQ4;
        Object objQ5;
        int iHashCode;
        boolean z15;
        Object objQ6;
        boolean z16;
        Object objQ7;
        b1 b1Var3;
        b1 b1Var4;
        Object objQ8;
        Object objQ9;
        fz.a onClickLogin = aVar;
        m.f(userEmail, "userEmail");
        m.f(userPassword, "userPassword");
        m.f(curLocalizedResource, "curLocalizedResource");
        m.f(updateEmail, "updateEmail");
        m.f(updatePassword, "updatePassword");
        m.f(onClickFindPassword, "onClickFindPassword");
        m.f(onClickLogin, "onClickLogin");
        m.f(onClickSingUp, "onClickSingUp");
        m.f(onBackClick, "onBackClick");
        m.f(onClickTermsOfUse, "onClickTermsOfUse");
        m.f(onClickPrivacyPolicy, "onClickPrivacyPolicy");
        s sVar = (s) nVar;
        sVar.f0(-886115684);
        int i12 = i11 | (sVar.f(userEmail) ? 4 : 2) | (sVar.f(userPassword) ? 32 : 16) | (sVar.g(z11) ? 256 : 128) | (sVar.g(z12) ? 2048 : 1024) | (sVar.g(z13) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.h(curLocalizedResource) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar.h(onClickFindPassword) ? 67108864 : 33554432) | (sVar.h(onClickLogin) ? 536870912 : 268435456);
        int i13 = (sVar.h(onClickSingUp) ? 4 : 2) | (sVar.h(onBackClick) ? 32 : 16) | (sVar.h(onClickTermsOfUse) ? 256 : 128) | (sVar.h(onClickPrivacyPolicy) ? 2048 : 1024);
        if (sVar.T(i12 & 1, ((i12 & 306783379) == 306783378 && (i13 & 1171) == 1170) ? false : true)) {
            e2.l lVar = (e2.l) sVar.j(g1.f58548i);
            v vVar = new v();
            o oVar = o.f58481a;
            r rVarD = e2.d(oVar, 1.0f);
            u uVarA = t.a(j0.i.f35305c, z1.c.P, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarD);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar2 = y2.j.f56917f;
            l1.t.J(hVar2, uVarA, sVar);
            y2.h hVar3 = y2.j.f56916e;
            l1.t.J(hVar3, q1VarL, sVar);
            y2.h hVar4 = y2.j.f56918g;
            if (sVar.S) {
                hVar = hVar2;
            } else {
                hVar = hVar2;
                if (!m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                }
                y2.h hVar5 = y2.j.f56915d;
                l1.t.J(hVar5, rVarC, sVar);
                objQ = sVar.Q();
                gVar = l1.m.f39353a;
                if (objQ == gVar) {
                    objQ = l1.t.B(Boolean.TRUE);
                    sVar.o0(objQ);
                }
                b1Var = (b1) objQ;
                objQ2 = sVar.Q();
                if (objQ2 == gVar) {
                    objQ2 = l1.t.B(Boolean.FALSE);
                    sVar.o0(objQ2);
                }
                b1Var2 = (b1) objQ2;
                ac acVarE = bc.e(sVar);
                if ((i13 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objQ3 = sVar.Q();
                if (z14 || objQ3 == gVar) {
                    objQ3 = new okhttp3.b(21, onBackClick);
                    sVar.o0(objQ3);
                }
                iu.k.g((fz.a) objQ3, null, t1.e.d(472057511, new lr.c(curLocalizedResource, 4), sVar), null, t1.e.d(400282449, new tp.u(2, onClickSingUp, curLocalizedResource), sVar), null, acVarE, null, sVar, 24960, 170);
                j0.c.g(sVar, e2.g(oVar, 20));
                objQ4 = sVar.Q();
                if (objQ4 == gVar) {
                    objQ4 = new b(updateEmail, 2);
                    sVar.o0(objQ4);
                }
                int i14 = i12 >> 3;
                int i15 = i12 >> 6;
                int i16 = i15 & 7168;
                int i17 = (i12 & 14) | (i14 & 112) | i16;
                y2.h hVar6 = hVar;
                a(userEmail, z11, lVar, curLocalizedResource, vVar, (fz.c) objQ4, sVar, i17);
                objQ5 = sVar.Q();
                if (objQ5 == gVar) {
                    objQ5 = new b(updatePassword, 3);
                    sVar.o0(objQ5);
                }
                h(userPassword, z12, lVar, curLocalizedResource, (fz.c) objQ5, sVar, (i14 & 14) | (i15 & 112) | i16);
                r rVarE = e2.e(oVar, 1.0f);
                q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL2 = sVar.l();
                r rVarC2 = z1.a.c(sVar, rVarE);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar6, q0VarD, sVar);
                l1.t.J(hVar3, q1VarL2, sVar);
                if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
                }
                l1.t.J(hVar5, rVarC2, sVar);
                if ((i12 & 234881024) == 67108864) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objQ6 = sVar.Q();
                if (!z15 || objQ6 == gVar) {
                    aVar2 = onClickFindPassword;
                    objQ6 = new okhttp3.b(22, aVar2);
                    sVar.o0(objQ6);
                } else {
                    aVar2 = onClickFindPassword;
                }
                k7.m((fz.a) objQ6, j0.r.f35391a.a(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 30, CropImageView.DEFAULT_ASPECT_RATIO, 11), z1.c.f58468f), false, null, null, null, t1.e.d(-1865082859, new c(curLocalizedResource, 2), sVar), sVar, 805306368, 508);
                sVar.p(true);
                if ((i12 & 1879048192) == 536870912) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objQ7 = sVar.Q();
                if (!z16 || objQ7 == gVar) {
                    onClickLogin = aVar;
                    b1Var3 = b1Var;
                    b1Var4 = b1Var2;
                    objQ7 = new kt.d(8, onClickLogin, b1Var3, b1Var4);
                    sVar.o0(objQ7);
                } else {
                    onClickLogin = aVar;
                    b1Var3 = b1Var;
                    b1Var4 = b1Var2;
                }
                float f5 = 38;
                iu.k.e((fz.a) objQ7, j0.c.D(e2.e(oVar, 1.0f), f5, 55, f5, f5), z13, 0L, null, t1.e.d(634320861, new c(curLocalizedResource, 3), sVar), sVar, (i15 & 896) | 196608, 24);
                float f11 = 24;
                j0.c.g(sVar, e2.g(oVar, f11));
                boolean zBooleanValue = ((Boolean) b1Var3.getValue()).booleanValue();
                r rVarB = j0.c.B(oVar, f11, 32);
                boolean zBooleanValue2 = ((Boolean) b1Var4.getValue()).booleanValue();
                objQ8 = sVar.Q();
                if (objQ8 == gVar) {
                    objQ8 = new z(17, b1Var4);
                    sVar.o0(objQ8);
                }
                r rVarJ = j(rVarB, zBooleanValue2, (fz.a) objQ8);
                objQ9 = sVar.Q();
                if (objQ9 == gVar) {
                    objQ9 = new z(15, b1Var3);
                    sVar.o0(objQ9);
                }
                r rVarQ = iu.k.q(24576, 7, (fz.a) objQ9, sVar, rVarJ, false);
                sVar = sVar;
                int i18 = i13 << 3;
                i(curLocalizedResource, rVarQ, zBooleanValue, onClickTermsOfUse, onClickPrivacyPolicy, sVar, ((i12 >> 15) & 14) | (i18 & 7168) | (i18 & 57344));
                sVar.p(true);
            }
            defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar4);
            y2.h hVar7 = y2.j.f56915d;
            l1.t.J(hVar7, rVarC, sVar);
            objQ = sVar.Q();
            gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.B(Boolean.TRUE);
                sVar.o0(objQ);
            }
            b1Var = (b1) objQ;
            objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ2);
            }
            b1Var2 = (b1) objQ2;
            ac acVarE2 = bc.e(sVar);
            if ((i13 & 112) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            objQ3 = sVar.Q();
            if (z14) {
                objQ3 = new okhttp3.b(21, onBackClick);
                sVar.o0(objQ3);
            } else {
                objQ3 = new okhttp3.b(21, onBackClick);
                sVar.o0(objQ3);
            }
            iu.k.g((fz.a) objQ3, null, t1.e.d(472057511, new lr.c(curLocalizedResource, 4), sVar), null, t1.e.d(400282449, new tp.u(2, onClickSingUp, curLocalizedResource), sVar), null, acVarE2, null, sVar, 24960, 170);
            j0.c.g(sVar, e2.g(oVar, 20));
            objQ4 = sVar.Q();
            if (objQ4 == gVar) {
                objQ4 = new b(updateEmail, 2);
                sVar.o0(objQ4);
            }
            int i19 = i12 >> 3;
            int i110 = i12 >> 6;
            int i111 = i110 & 7168;
            int i112 = (i12 & 14) | (i19 & 112) | i111;
            y2.h hVar8 = hVar;
            a(userEmail, z11, lVar, curLocalizedResource, vVar, (fz.c) objQ4, sVar, i112);
            objQ5 = sVar.Q();
            if (objQ5 == gVar) {
                objQ5 = new b(updatePassword, 3);
                sVar.o0(objQ5);
            }
            h(userPassword, z12, lVar, curLocalizedResource, (fz.c) objQ5, sVar, (i19 & 14) | (i110 & 112) | i111);
            r rVarE2 = e2.e(oVar, 1.0f);
            q0 q0VarD2 = j0.o.d(z1.c.f58463a, false);
            iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            r rVarC3 = z1.a.c(sVar, rVarE2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar8, q0VarD2, sVar);
            l1.t.J(hVar3, q1VarL3, sVar);
            if (sVar.S) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
            } else {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
            }
            l1.t.J(hVar7, rVarC3, sVar);
            if ((i12 & 234881024) == 67108864) {
                z15 = true;
            } else {
                z15 = false;
            }
            objQ6 = sVar.Q();
            if (z15) {
                aVar2 = onClickFindPassword;
                objQ6 = new okhttp3.b(22, aVar2);
                sVar.o0(objQ6);
            } else {
                aVar2 = onClickFindPassword;
                objQ6 = new okhttp3.b(22, aVar2);
                sVar.o0(objQ6);
            }
            k7.m((fz.a) objQ6, j0.r.f35391a.a(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 30, CropImageView.DEFAULT_ASPECT_RATIO, 11), z1.c.f58468f), false, null, null, null, t1.e.d(-1865082859, new c(curLocalizedResource, 2), sVar), sVar, 805306368, 508);
            sVar.p(true);
            if ((i12 & 1879048192) == 536870912) {
                z16 = true;
            } else {
                z16 = false;
            }
            objQ7 = sVar.Q();
            if (z16) {
                onClickLogin = aVar;
                b1Var3 = b1Var;
                b1Var4 = b1Var2;
                objQ7 = new kt.d(8, onClickLogin, b1Var3, b1Var4);
                sVar.o0(objQ7);
            } else {
                onClickLogin = aVar;
                b1Var3 = b1Var;
                b1Var4 = b1Var2;
                objQ7 = new kt.d(8, onClickLogin, b1Var3, b1Var4);
                sVar.o0(objQ7);
            }
            float f12 = 38;
            iu.k.e((fz.a) objQ7, j0.c.D(e2.e(oVar, 1.0f), f12, 55, f12, f12), z13, 0L, null, t1.e.d(634320861, new c(curLocalizedResource, 3), sVar), sVar, (i110 & 896) | 196608, 24);
            float f13 = 24;
            j0.c.g(sVar, e2.g(oVar, f13));
            boolean zBooleanValue3 = ((Boolean) b1Var3.getValue()).booleanValue();
            r rVarB2 = j0.c.B(oVar, f13, 32);
            boolean zBooleanValue4 = ((Boolean) b1Var4.getValue()).booleanValue();
            objQ8 = sVar.Q();
            if (objQ8 == gVar) {
                objQ8 = new z(17, b1Var4);
                sVar.o0(objQ8);
            }
            r rVarJ2 = j(rVarB2, zBooleanValue4, (fz.a) objQ8);
            objQ9 = sVar.Q();
            if (objQ9 == gVar) {
                objQ9 = new z(15, b1Var3);
                sVar.o0(objQ9);
            }
            r rVarQ2 = iu.k.q(24576, 7, (fz.a) objQ9, sVar, rVarJ2, false);
            sVar = sVar;
            int i113 = i13 << 3;
            i(curLocalizedResource, rVarQ2, zBooleanValue3, onClickTermsOfUse, onClickPrivacyPolicy, sVar, ((i12 >> 15) & 14) | (i113 & 7168) | (i113 & 57344));
            sVar.p(true);
        } else {
            aVar2 = onClickFindPassword;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            final fz.a aVar3 = onClickLogin;
            x1VarT.f39502d = new fz.e(userEmail, userPassword, z11, z12, z13, curLocalizedResource, updateEmail, updatePassword, aVar2, aVar3, onClickSingUp, onBackClick, onClickTermsOfUse, onClickPrivacyPolicy, i11) { // from class: uu.g
                public final /* synthetic */ fz.c H;
                public final /* synthetic */ fz.a K;
                public final /* synthetic */ fz.a L;
                public final /* synthetic */ fz.a M;
                public final /* synthetic */ fz.a N;
                public final /* synthetic */ fz.a O;
                public final /* synthetic */ fz.a P;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f53146a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f53147b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f53148c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f53149d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f53150e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ Resources f53151f;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ fz.c f53152t;

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(14155777);
                    a.b(this.f53146a, this.f53147b, this.f53148c, this.f53149d, this.f53150e, this.f53151f, this.f53152t, this.H, this.K, this.L, this.M, this.N, this.O, this.P, (n) obj, iM);
                    return b0.f48488a;
                }
            };
        }
    }

    public static final void c(final String userEmail, final String userPassword, final boolean z11, final boolean z12, final boolean z13, final Resources resources, final fz.c updateEmail, final fz.c updatePassword, final fz.a onClickSingUp, final fz.a onBackClick, final fz.a onClickTermsOfUse, final fz.a onClickPrivacyPolicy, n nVar, final int i11) {
        m.f(userEmail, "userEmail");
        m.f(userPassword, "userPassword");
        m.f(updateEmail, "updateEmail");
        m.f(updatePassword, "updatePassword");
        m.f(onClickSingUp, "onClickSingUp");
        m.f(onBackClick, "onBackClick");
        m.f(onClickTermsOfUse, "onClickTermsOfUse");
        m.f(onClickPrivacyPolicy, "onClickPrivacyPolicy");
        s sVar = (s) nVar;
        sVar.f0(479280809);
        int i12 = i11 | (sVar.f(userEmail) ? 4 : 2) | (sVar.f(userPassword) ? 32 : 16) | (sVar.g(z11) ? 256 : 128) | (sVar.g(z12) ? 2048 : 1024) | (sVar.g(z13) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.h(resources) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar.h(onClickSingUp) ? 67108864 : 33554432) | (sVar.h(onBackClick) ? 536870912 : 268435456);
        int i13 = (sVar.h(onClickTermsOfUse) ? 4 : 2) | (sVar.h(onClickPrivacyPolicy) ? 32 : 16);
        if (sVar.T(i12 & 1, ((i12 & 306783379) == 306783378 && (i13 & 19) == 18) ? false : true)) {
            e2.l lVar = (e2.l) sVar.j(g1.f58548i);
            v vVar = new v();
            o oVar = o.f58481a;
            r rVarD = e2.d(oVar, 1.0f);
            u uVarA = t.a(j0.i.f35305c, z1.c.P, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarD);
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
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.B(Boolean.TRUE);
                sVar.o0(objQ);
            }
            b1 b1Var = (b1) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ2);
            }
            b1 b1Var2 = (b1) objQ2;
            ac acVarE = bc.e(sVar);
            boolean z14 = (i12 & 1879048192) == 536870912;
            Object objQ3 = sVar.Q();
            if (z14 || objQ3 == gVar) {
                objQ3 = new okhttp3.b(25, onBackClick);
                sVar.o0(objQ3);
            }
            iu.k.g((fz.a) objQ3, null, t1.e.d(-1060509570, new lr.c(resources, 1), sVar), null, null, null, acVarE, null, sVar, 384, 186);
            j0.c.g(sVar, e2.g(oVar, 20));
            Object objQ4 = sVar.Q();
            if (objQ4 == gVar) {
                objQ4 = new b(updateEmail, 0);
                sVar.o0(objQ4);
            }
            int i14 = i12 >> 3;
            int i15 = i12 >> 6;
            int i16 = i15 & 7168;
            a(userEmail, z11, lVar, resources, vVar, (fz.c) objQ4, sVar, (i12 & 14) | (i14 & 112) | i16);
            sVar = sVar;
            Object objQ5 = sVar.Q();
            if (objQ5 == gVar) {
                objQ5 = new b(updatePassword, 1);
                sVar.o0(objQ5);
            }
            h(userPassword, z12, lVar, resources, (fz.c) objQ5, sVar, (i14 & 14) | (i15 & 112) | i16);
            boolean z15 = (i12 & 234881024) == 67108864;
            Object objQ6 = sVar.Q();
            if (z15 || objQ6 == gVar) {
                objQ6 = new kt.d(6, onClickSingUp, b1Var, b1Var2);
                sVar.o0(objQ6);
            }
            float f5 = 38;
            iu.k.e((fz.a) objQ6, j0.c.D(e2.e(oVar, 1.0f), f5, 55, f5, f5), z13, 0L, null, t1.e.d(1765984008, new c(resources, 0), sVar), sVar, (i15 & 896) | 196608, 24);
            float f11 = 24;
            j0.c.g(sVar, e2.g(oVar, f11));
            boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
            r rVarB = j0.c.B(oVar, f11, 32);
            boolean zBooleanValue2 = ((Boolean) b1Var2.getValue()).booleanValue();
            Object objQ7 = sVar.Q();
            if (objQ7 == gVar) {
                objQ7 = new z(13, b1Var2);
                sVar.o0(objQ7);
            }
            r rVarJ = j(rVarB, zBooleanValue2, (fz.a) objQ7);
            Object objQ8 = sVar.Q();
            if (objQ8 == gVar) {
                objQ8 = new z(14, b1Var);
                sVar.o0(objQ8);
            }
            int i17 = i13 << 9;
            i(resources, iu.k.q(24576, 7, (fz.a) objQ8, sVar, rVarJ, false), zBooleanValue, onClickTermsOfUse, onClickPrivacyPolicy, sVar, ((i12 >> 15) & 14) | (i17 & 7168) | (i17 & 57344));
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(userEmail, userPassword, z11, z12, z13, resources, updateEmail, updatePassword, onClickSingUp, onBackClick, onClickTermsOfUse, onClickPrivacyPolicy, i11) { // from class: uu.d
                public final /* synthetic */ fz.c H;
                public final /* synthetic */ fz.a K;
                public final /* synthetic */ fz.a L;
                public final /* synthetic */ fz.a M;
                public final /* synthetic */ fz.a N;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f53136a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f53137b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f53138c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f53139d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f53140e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ Resources f53141f;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ fz.c f53142t;

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a.c(this.f53136a, this.f53137b, this.f53138c, this.f53139d, this.f53140e, this.f53141f, this.f53142t, this.H, this.K, this.L, this.M, this.N, (n) obj, l1.t.M(14155777));
                    return b0.f48488a;
                }
            };
        }
    }

    public static final void d(Resources resources, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(1708651696);
        int i12 = (sVar.h(resources) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            Object objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                objQ = new ju.d(25);
                sVar.o0(objQ);
            }
            androidx.compose.ui.window.a.a((fz.a) objQ, new z3.r(4), t1.e.d(756126151, new lr.c(resources, 2), sVar), sVar, 438, 0);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new lr.c(i11, 3, resources);
        }
    }

    public static final void e(final Resources curLocalizedResource, final int i11, final int i12, final r rVar, final fz.a onClickedMethod, n nVar, final int i13) {
        int i14;
        s sVar;
        m.f(curLocalizedResource, "curLocalizedResource");
        m.f(onClickedMethod, "onClickedMethod");
        s sVar2 = (s) nVar;
        sVar2.f0(-1178202890);
        if ((i13 & 6) == 0) {
            i14 = i13 | (sVar2.h(curLocalizedResource) ? 4 : 2);
        } else {
            i14 = i13;
        }
        int i15 = i14 | (sVar2.d(i11) ? 32 : 16) | (sVar2.d(i12) ? 256 : 128) | (sVar2.h(onClickedMethod) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        if (sVar2.T(i15 & 1, (i15 & 9363) != 9362)) {
            float f5 = 1000;
            float f11 = 2;
            c3 c3Var = v1.f31180a;
            d0.v vVarA = d0.n.a(((s1) sVar2.j(c3Var)).A, f11);
            long j11 = ((s1) sVar2.j(c3Var)).A;
            boolean z11 = (i15 & 57344) == 16384;
            Object objQ = sVar2.Q();
            if (z11 || objQ == l1.m.f39353a) {
                objQ = new okhttp3.b(24, onClickedMethod);
                sVar2.o0(objQ);
            }
            sVar = sVar2;
            iu.k.l((fz.a) objQ, rVar, false, f11, 0L, 0L, j11, f5, vVarA, t1.e.d(316915640, new k(i11, i12, curLocalizedResource), sVar2), sVar, 817892400, 52);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: uu.l
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a.e(curLocalizedResource, i11, i12, rVar, onClickedMethod, (n) obj, l1.t.M(i13 | 1));
                    return b0.f48488a;
                }
            };
        }
    }

    public static final void f(Resources curLocalizedResource, r rVar, fz.a onClickGoogleLogin, fz.a onClickFacebookLogin, fz.a onClickEmailLogin, fz.a onClickTermsOfUse, fz.a onClickPrivacyPolicy, n nVar, int i11) {
        fz.a aVar;
        r rVar2;
        m.f(curLocalizedResource, "curLocalizedResource");
        m.f(onClickGoogleLogin, "onClickGoogleLogin");
        m.f(onClickFacebookLogin, "onClickFacebookLogin");
        m.f(onClickEmailLogin, "onClickEmailLogin");
        m.f(onClickTermsOfUse, "onClickTermsOfUse");
        m.f(onClickPrivacyPolicy, "onClickPrivacyPolicy");
        s sVar = (s) nVar;
        sVar.f0(-526069924);
        int i12 = i11 | (sVar.h(curLocalizedResource) ? 4 : 2) | 48 | (sVar.h(onClickGoogleLogin) ? 256 : 128) | (sVar.h(onClickFacebookLogin) ? 2048 : 1024) | (sVar.h(onClickEmailLogin) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.h(onClickTermsOfUse) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar.h(onClickPrivacyPolicy) ? 1048576 : 524288);
        if (sVar.T(i12 & 1, (599187 & i12) != 599186)) {
            z1.h hVar = z1.c.P;
            j0.d dVar = j0.i.f35305c;
            u uVarA = t.a(dVar, hVar, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            o oVar = o.f58481a;
            r rVarC = z1.a.c(sVar, oVar);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar2 = y2.j.f56917f;
            l1.t.J(hVar2, uVarA, sVar);
            y2.h hVar3 = y2.j.f56916e;
            l1.t.J(hVar3, q1VarL, sVar);
            y2.h hVar4 = y2.j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
            }
            y2.h hVar5 = y2.j.f56915d;
            l1.t.J(hVar5, rVarC, sVar);
            j0.c.g(sVar, e2.g(oVar, 25));
            boolean z11 = false;
            d0.n.c(se.k.y(R.drawable.login_banner_pic, sVar, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 48, 124);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.B(Boolean.TRUE);
                sVar.o0(objQ);
            }
            b1 b1Var = (b1) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ2);
            }
            b1 b1Var2 = (b1) objQ2;
            r rVarA = j0.v.a(oVar, 1.0f);
            c3 c3Var = v1.f31180a;
            float f5 = 30;
            r rVarY = d0.n.y(j0.c.v(d0.n.h(rVarA, ((s1) sVar.j(c3Var)).f31033p, r0.f.f(f5, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12))), d0.n.u(sVar), true, 12);
            u uVarA2 = t.a(dVar, hVar, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            r rVarC2 = z1.a.c(sVar, rVarY);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar2, uVarA2, sVar);
            l1.t.J(hVar3, q1VarL2, sVar);
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar4);
            }
            l1.t.J(hVar5, rVarC2, sVar);
            String string = curLocalizedResource.getString(R.string.create_an_account_to_save_your_progress);
            m.e(string, "getString(...)");
            y0 y0VarA = y0.a((y0) sVar.j(ua.f31167a), ((s1) sVar.j(c3Var)).f31034q, j3.A(22), n3.s.N, null, null, 0L, null, null, 3, 0, 0L, null, 16744440);
            float f11 = 42;
            sVar = sVar;
            iu.k.c(string, j0.c.D(oVar, f5, f11, f5, f11), y0VarA, 0, false, 2, 0, new s0.g(j3.A(12), j3.A(22), j3.A(1)), sVar, 1572864, 184);
            float f12 = 32;
            r rVarC3 = j0.c.C(oVar, f12, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            boolean z12 = (i12 & 896) == 256;
            Object objQ3 = sVar.Q();
            if (z12 || objQ3 == gVar) {
                objQ3 = new kt.d(5, onClickGoogleLogin, b1Var, b1Var2);
                sVar.o0(objQ3);
            }
            fz.a aVar2 = (fz.a) objQ3;
            int i13 = i12 & 14;
            int i14 = i13 | 3072;
            e(curLocalizedResource, R.drawable.ep_splash_login_google, R.string.continue_with_google, rVarC3, aVar2, sVar, i14);
            r rVarC4 = j0.c.C(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f12, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            boolean z13 = (i12 & 7168) == 2048;
            Object objQ4 = sVar.Q();
            if (z13 || objQ4 == gVar) {
                aVar = onClickFacebookLogin;
                objQ4 = new kt.d(7, aVar, b1Var, b1Var2);
                sVar.o0(objQ4);
            } else {
                aVar = onClickFacebookLogin;
            }
            e(curLocalizedResource, R.drawable.ep_splash_login_facebook, R.string.continue_with_facebook, rVarC4, (fz.a) objQ4, sVar, i14);
            r rVarC5 = j0.c.C(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 36, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f12, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            if ((i12 & 57344) == 16384) {
                z11 = true;
            }
            Object objQ5 = sVar.Q();
            if (z11 || objQ5 == gVar) {
                objQ5 = new okhttp3.b(20, onClickEmailLogin);
                sVar.o0(objQ5);
            }
            e(curLocalizedResource, R.drawable.ep_splash_login_email, R.string.continue_with_email, rVarC5, (fz.a) objQ5, sVar, i14);
            j0.c.g(sVar, j0.v.a(oVar, 1.0f));
            boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
            r rVarB = j0.c.B(oVar, 24, f12);
            boolean zBooleanValue2 = ((Boolean) b1Var2.getValue()).booleanValue();
            Object objQ6 = sVar.Q();
            if (objQ6 == gVar) {
                objQ6 = new z(16, b1Var2);
                sVar.o0(objQ6);
            }
            r rVarJ = j(rVarB, zBooleanValue2, (fz.a) objQ6);
            Object objQ7 = sVar.Q();
            if (objQ7 == gVar) {
                objQ7 = new z(18, b1Var);
                sVar.o0(objQ7);
            }
            int i15 = i12 >> 6;
            i(curLocalizedResource, iu.k.q(24576, 7, (fz.a) objQ7, sVar, rVarJ, false), zBooleanValue, onClickTermsOfUse, onClickPrivacyPolicy, sVar, i13 | (i15 & 7168) | (i15 & 57344));
            sVar.p(true);
            sVar.p(true);
            rVar2 = oVar;
        } else {
            aVar = onClickFacebookLogin;
            sVar.W();
            rVar2 = rVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.b1(curLocalizedResource, rVar2, onClickGoogleLogin, aVar, onClickEmailLogin, onClickTermsOfUse, onClickPrivacyPolicy, i11, 8);
        }
    }

    public static final void g(Resources curLocalizedResource, fz.a onBackClick, fz.a onClickGoogleLogin, fz.a onClickFacebookLogin, fz.a onClickEmailLogin, fz.a onClickTermsOfUse, fz.a onClickPrivacyPolicy, n nVar, int i11) {
        m.f(curLocalizedResource, "curLocalizedResource");
        m.f(onBackClick, "onBackClick");
        m.f(onClickGoogleLogin, "onClickGoogleLogin");
        m.f(onClickFacebookLogin, "onClickFacebookLogin");
        m.f(onClickEmailLogin, "onClickEmailLogin");
        m.f(onClickTermsOfUse, "onClickTermsOfUse");
        m.f(onClickPrivacyPolicy, "onClickPrivacyPolicy");
        s sVar = (s) nVar;
        sVar.f0(-148257590);
        int i12 = i11 | (sVar.h(curLocalizedResource) ? 4 : 2) | (sVar.h(onBackClick) ? 32 : 16) | (sVar.h(onClickGoogleLogin) ? 256 : 128) | (sVar.h(onClickFacebookLogin) ? 2048 : 1024) | (sVar.h(onClickEmailLogin) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.h(onClickTermsOfUse) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar.h(onClickPrivacyPolicy) ? 1048576 : 524288);
        if (sVar.T(i12 & 1, (599187 & i12) != 599186)) {
            i9.a(null, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(1128303503, new h(curLocalizedResource, onClickGoogleLogin, onClickFacebookLogin, onClickEmailLogin, onClickTermsOfUse, onClickPrivacyPolicy, onBackClick), sVar), sVar, 12582912, 127);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new h(curLocalizedResource, onBackClick, onClickGoogleLogin, onClickFacebookLogin, onClickEmailLogin, onClickTermsOfUse, onClickPrivacyPolicy, i11);
        }
    }

    public static final void h(String userPassword, boolean z11, e2.l lVar, Resources curLocalizedResource, fz.c onValueChange, n nVar, int i11) {
        int i12;
        boolean z12;
        e2.l lVar2;
        m.f(userPassword, "userPassword");
        m.f(curLocalizedResource, "curLocalizedResource");
        m.f(onValueChange, "onValueChange");
        s sVar = (s) nVar;
        sVar.f0(1881352139);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(userPassword) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            z12 = z11;
            i12 |= sVar.g(z12) ? 32 : 16;
        } else {
            z12 = z11;
        }
        if ((i11 & 384) == 0) {
            lVar2 = lVar;
            i12 |= sVar.h(lVar2) ? 256 : 128;
        } else {
            lVar2 = lVar;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(curLocalizedResource) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(onValueChange) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if (sVar.T(i12 & 1, (i12 & 9363) != 9362)) {
            Object[] objArr = new Object[0];
            Object objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                objQ = new f(0);
                sVar.o0(objQ);
            }
            b1 b1Var = (b1) w1.j.c(objArr, (fz.a) objQ, sVar, 48);
            float f5 = 22;
            k7.k(e2.e(e2.g(j0.c.E(o.f58481a, f5, 16, f5, CropImageView.DEFAULT_ASPECT_RATIO, 8), 72), 1.0f), r0.f.d(12), null, null, d0.n.a(((s1) sVar.j(v1.f31180a)).A, (float) 1.5d), t1.e.d(-1618721985, new jr.h(lVar2, userPassword, onValueChange, z12, b1Var, curLocalizedResource), sVar), sVar, 196608, 12);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new q(userPassword, z11, lVar, curLocalizedResource, onValueChange, i11);
        }
    }

    public static final void i(Resources curLocalizedResource, r rVar, boolean z11, fz.a onClickTermsOfUse, fz.a onClickPrivacyPolicy, n nVar, int i11) {
        int i12;
        int i13;
        boolean z12;
        m.f(curLocalizedResource, "curLocalizedResource");
        m.f(onClickTermsOfUse, "onClickTermsOfUse");
        m.f(onClickPrivacyPolicy, "onClickPrivacyPolicy");
        s sVar = (s) nVar;
        sVar.f0(794008325);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(curLocalizedResource) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(rVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.g(z11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(onClickTermsOfUse) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(onClickPrivacyPolicy) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if (sVar.T(i12 & 1, (i12 & 9363) != 9362)) {
            String string = curLocalizedResource.getString(R.string.terms_of_use_login);
            m.e(string, "getString(...)");
            String string2 = curLocalizedResource.getString(R.string.privacy_policy_login);
            m.e(string2, "getString(...)");
            String string3 = curLocalizedResource.getString(R.string.by_signing_up_in_i_agree_to_lingodeer_s_term_of_use_and_privacy_policy);
            m.e(string3, "getString(...)");
            String strQ0 = x.q0(x.q0(string3, "t%", string), "p%", string2);
            Locale locale = Locale.ROOT;
            String lowerCase = strQ0.toLowerCase(locale);
            m.e(lowerCase, "toLowerCase(...)");
            String lowerCase2 = string.toLowerCase(locale);
            m.e(lowerCase2, "toLowerCase(...)");
            int iI0 = oz.q.I0(lowerCase, lowerCase2, 0, false, 6);
            String lowerCase3 = strQ0.toLowerCase(locale);
            m.e(lowerCase3, "toLowerCase(...)");
            String lowerCase4 = string2.toLowerCase(locale);
            m.e(lowerCase4, "toLowerCase(...)");
            int iI1 = oz.q.I0(lowerCase3, lowerCase4, 0, false, 6);
            Map mapX = ry.x.X(new qy.l("checkbox", new k0(new e0(j3.A(18), 4, j3.A(18)), t1.e.d(-1202391323, new dt.h(z11, 6), sVar))));
            sVar.d0(-1462127146);
            j3.e eVar = new j3.e();
            o0.o(eVar, "checkbox", "[checkbox]");
            eVar.d(" ");
            if (iI0 == -1 || iI1 == -1) {
                i13 = i12;
                sVar.d0(159034006);
                z12 = false;
                sVar.p(false);
                eVar.d(strQ0);
            } else {
                sVar.d0(157682499);
                int length = string.length() + iI0;
                int length2 = string2.length() + iI1;
                String strSubstring = strQ0.substring(0, iI0);
                m.e(strSubstring, "substring(...)");
                eVar.d(strSubstring);
                c3 c3Var = v1.f31180a;
                long j11 = ((s1) sVar.j(c3Var)).f31017a;
                u3.l lVar = u3.l.f52752c;
                v0 v0Var = new v0(new p0(j11, 0L, (n3.s) null, (n3.o) null, (p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, lVar, (g2.v0) null, 61438), null, 14);
                boolean z13 = (i12 & 7168) == 2048;
                Object objQ = sVar.Q();
                l1.g gVar = l1.m.f39353a;
                if (z13 || objQ == gVar) {
                    objQ = new e(0, onClickTermsOfUse);
                    sVar.o0(objQ);
                }
                i13 = i12;
                int iG = eVar.g(new j3.u("terms", v0Var, (e) objQ));
                try {
                    eVar.d(string);
                    eVar.f(iG);
                    String strSubstring2 = strQ0.substring(length, iI1);
                    m.e(strSubstring2, "substring(...)");
                    eVar.d(strSubstring2);
                    v0 v0Var2 = new v0(new p0(((s1) sVar.j(c3Var)).f31017a, 0L, (n3.s) null, (n3.o) null, (p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, lVar, (g2.v0) null, 61438), null, 14);
                    boolean z14 = (i13 & 57344) == 16384;
                    Object objQ2 = sVar.Q();
                    if (z14 || objQ2 == gVar) {
                        objQ2 = new e(1, onClickPrivacyPolicy);
                        sVar.o0(objQ2);
                    }
                    int iG2 = eVar.g(new j3.u("privacy", v0Var2, (e) objQ2));
                    try {
                        eVar.d(string2);
                        eVar.f(iG2);
                        String strSubstring3 = strQ0.substring(length2, strQ0.length());
                        m.e(strSubstring3, "substring(...)");
                        eVar.d(strSubstring3);
                        z12 = false;
                        sVar.p(false);
                    } catch (Throwable th2) {
                        eVar.f(iG2);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    eVar.f(iG);
                    throw th3;
                }
            }
            j3.h hVarJ = eVar.j();
            sVar.p(z12);
            iu.k.a(hVarJ, rVar, y0.a((y0) sVar.j(ua.f31167a), ((s1) sVar.j(v1.f31180a)).f31036s, j3.A(12), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), 0, false, 0, 0, mapX, sVar, i13 & 112);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new q(curLocalizedResource, rVar, z11, onClickTermsOfUse, onClickPrivacyPolicy, i11);
        }
    }

    public static final r j(r rVar, boolean z11, fz.a onAnimationFinished) {
        m.f(rVar, "<this>");
        m.f(onAnimationFinished, "onAnimationFinished");
        return z1.a.a(rVar, new gs.m(z11, onAnimationFinished, 4));
    }
}
