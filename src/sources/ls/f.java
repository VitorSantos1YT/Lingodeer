package ls;

import a0.f1;
import a0.j0;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bp.i2;
import bt.c2;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionStateKt;
import com.google.accompanist.permissions.PermissionStatus;
import com.google.accompanist.permissions.PermissionsUtilKt;
import com.google.logging.type.LogSeverity;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import d0.d2;
import dt.i0;
import fr.j3;
import g2.f0;
import g2.r0;
import g2.x;
import h1.k7;
import h1.r4;
import h1.s1;
import h1.t0;
import h1.u0;
import h1.ua;
import h1.v1;
import j0.a2;
import j0.e2;
import j0.u;
import j0.v;
import j0.z1;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.m;
import l1.a1;
import l1.b1;
import l1.c3;
import l1.h1;
import l1.n;
import l1.q1;
import l1.s;
import l1.t;
import l1.x1;
import qy.b0;
import w2.a0;
import w2.q0;
import z1.o;
import z1.r;
import z2.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1.d f40269a = new t1.d(new iv.b(28), false, -1557167014);

    /* JADX WARN: Code duplicated, block: B:202:0x03de  */
    /* JADX WARN: Code duplicated, block: B:203:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:206:0x040d  */
    /* JADX WARN: Code duplicated, block: B:207:0x0411  */
    /* JADX WARN: Code duplicated, block: B:212:0x042c  */
    /* JADX WARN: Code duplicated, block: B:215:0x045e  */
    /* JADX WARN: Code duplicated, block: B:216:0x0462  */
    /* JADX WARN: Code duplicated, block: B:221:0x047d  */
    /* JADX WARN: Code duplicated, block: B:224:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:225:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:230:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:234:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:236:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:237:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:242:0x051b  */
    /* JADX WARN: Code duplicated, block: B:245:0x052e  */
    /* JADX WARN: Code duplicated, block: B:255:0x055d  */
    /* JADX WARN: Code duplicated, block: B:258:0x057b  */
    /* JADX WARN: Code duplicated, block: B:259:0x057d  */
    /* JADX WARN: Code duplicated, block: B:262:0x0585  */
    /* JADX WARN: Code duplicated, block: B:264:0x0589  */
    /* JADX WARN: Code duplicated, block: B:265:0x058c  */
    /* JADX WARN: Code duplicated, block: B:266:0x059c A[PHI: r28
      0x059c: PHI (r28v8 l1.g) = (r28v7 l1.g), (r28v13 l1.g) binds: [B:261:0x0583, B:264:0x0589] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:271:0x0698  */
    /* JADX WARN: Code duplicated, block: B:272:0x069c  */
    /* JADX WARN: Code duplicated, block: B:275:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:278:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:282:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:283:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:286:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:288:0x070c  */
    /* JADX WARN: Code duplicated, block: B:291:0x071b  */
    /* JADX WARN: Code duplicated, block: B:294:0x0735  */
    /* JADX WARN: Code duplicated, block: B:297:0x073e  */
    /* JADX WARN: Code duplicated, block: B:300:0x074c  */
    /* JADX WARN: Code duplicated, block: B:301:0x074e  */
    /* JADX WARN: Code duplicated, block: B:304:0x0756  */
    /* JADX WARN: Code duplicated, block: B:307:0x075d  */
    /* JADX WARN: Code duplicated, block: B:308:0x0772  */
    /* JADX WARN: Code duplicated, block: B:313:0x082c  */
    /* JADX WARN: Code duplicated, block: B:314:0x0830  */
    /* JADX WARN: Code duplicated, block: B:317:0x0843  */
    /* JADX WARN: Code duplicated, block: B:320:0x0854  */
    /* JADX WARN: Code duplicated, block: B:324:0x0880  */
    /* JADX WARN: Code duplicated, block: B:325:0x0884  */
    /* JADX WARN: Code duplicated, block: B:328:0x0891  */
    /* JADX WARN: Code duplicated, block: B:330:0x089f  */
    /* JADX WARN: Code duplicated, block: B:333:0x08b0  */
    /* JADX WARN: Code duplicated, block: B:336:0x08ca  */
    /* JADX WARN: Code duplicated, block: B:339:0x08d3  */
    /* JADX WARN: Code duplicated, block: B:342:0x08e1  */
    /* JADX WARN: Code duplicated, block: B:343:0x08e3  */
    /* JADX WARN: Code duplicated, block: B:346:0x08eb  */
    /* JADX WARN: Code duplicated, block: B:349:0x08f2  */
    /* JADX WARN: Code duplicated, block: B:350:0x0905  */
    /* JADX WARN: Code duplicated, block: B:355:0x09a2  */
    /* JADX WARN: Code duplicated, block: B:356:0x09a6  */
    /* JADX WARN: Code duplicated, block: B:359:0x09b9  */
    /* JADX WARN: Code duplicated, block: B:361:0x09c7  */
    /* JADX WARN: Code duplicated, block: B:364:0x09e1  */
    public static final void a(int i11, int i12, final ms.a aVar, final fz.e getItem, fz.c getRowHeader, fz.c getColumnHeader, final fz.a aVar2, final fz.f fVar, final fz.c cVar, final fz.c cVar2, final fz.a aVar3, final Integer num, final Integer num2, final Integer num3, final Integer num4, final r rVar, n nVar, final int i13, final int i14) {
        int i15;
        int i16;
        int i17;
        s sVar;
        fz.c cVar3;
        fz.c cVar4;
        int i18;
        Object eVar;
        int i19;
        Integer num5;
        s sVar2;
        b1 b1Var;
        Integer num6;
        int i21;
        d2 d2Var;
        ms.a aVar4;
        d2 d2Var2;
        b1 b1Var2;
        Object tVar;
        Integer num7;
        Integer num8;
        b1 b1Var3;
        b1 b1Var4;
        b1 b1Var5;
        b1 b1Var6;
        o oVar;
        Object objQ;
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i22;
        ms.a aVar5;
        s sVar3;
        r0 r0Var;
        l1.g gVar;
        ms.b bVar;
        b1 b1Var7;
        o oVar2;
        float f5;
        long j11;
        int iHashCode4;
        y2.i iVar;
        y2.h hVar;
        z1.j jVar;
        ms.b bVar2;
        int iHashCode5;
        final int i23;
        long j12;
        final b1 b1Var8;
        z1.j jVar2;
        l1.g gVar2;
        r0 r0Var2;
        int iHashCode6;
        y2.i iVar2;
        y2.h hVar2;
        z1.j jVar3;
        int iHashCode7;
        final int i24;
        l1.g gVar3;
        int iHashCode8;
        y2.i iVar3;
        y2.h hVar3;
        Object objQ2;
        Integer num9;
        boolean z11;
        boolean z12;
        boolean z13;
        Object objQ3;
        l1.g gVar4;
        l1.g gVar5;
        o oVar3;
        Integer num10;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objQ4;
        l1.g gVar6;
        l1.g gVar7;
        o oVar4;
        b1 b1Var9;
        z1.i iVar4;
        int iHashCode9;
        y2.i iVar5;
        y2.h hVar4;
        int i25;
        int i26;
        ms.c cVar5;
        boolean z17;
        final int i27;
        boolean z18;
        boolean z19;
        Object objQ5;
        l1.g gVar8;
        final ms.c cVar6;
        int i28;
        b1 b1Var10;
        l1.g gVar9;
        z1.i iVar6 = z1.c.L;
        z1.h hVar5 = z1.c.O;
        float f11 = aVar.f41209c;
        float f12 = aVar.f41210d;
        z1.j jVar4 = z1.c.f58463a;
        z1.i iVar7 = iVar6;
        m.f(getItem, "getItem");
        m.f(getRowHeader, "getRowHeader");
        m.f(getColumnHeader, "getColumnHeader");
        s sVar4 = (s) nVar;
        sVar4.f0(-664595757);
        if ((i13 & 6) == 0) {
            i15 = i13 | (sVar4.d(i11) ? 4 : 2);
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= sVar4.d(i12) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= sVar4.f(aVar) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= sVar4.h(getItem) ? 2048 : 1024;
        }
        int i29 = i13 & 24576;
        int i30 = OSSConstants.DEFAULT_BUFFER_SIZE;
        if (i29 == 0) {
            i15 |= sVar4.h(getRowHeader) ? 16384 : 8192;
        }
        if ((i13 & 196608) == 0) {
            i15 |= sVar4.h(getColumnHeader) ? 131072 : 65536;
        }
        if ((i13 & 1572864) == 0) {
            i15 |= sVar4.h(aVar2) ? 1048576 : 524288;
        }
        if ((i13 & 12582912) == 0) {
            i15 |= sVar4.h(fVar) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i15 |= sVar4.h(cVar) ? 67108864 : 33554432;
        }
        if ((i13 & 805306368) == 0) {
            i15 |= sVar4.h(cVar2) ? 536870912 : 268435456;
        }
        int i31 = i15;
        if ((i14 & 48) == 0) {
            i16 = i14 | (sVar4.f(num) ? 32 : 16);
        } else {
            i16 = i14;
        }
        if ((i14 & 384) == 0) {
            i16 |= sVar4.f(num2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= sVar4.f(num3) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            if (sVar4.f(num4)) {
                i30 = 16384;
            }
            i16 |= i30;
        }
        if ((i14 & 196608) == 0) {
            i16 |= sVar4.f(rVar) ? 131072 : 65536;
        }
        int i32 = i16;
        if (sVar4.T(i31 & 1, ((i31 & 306783379) == 306783378 && (74897 & i32) == 74896) ? false : true)) {
            sVar4.Y();
            if ((i13 & 1) != 0 && !sVar4.C()) {
                sVar4.W();
            }
            sVar4.q();
            d2 d2VarU = d0.n.u(sVar4);
            d2 d2VarU2 = d0.n.u(sVar4);
            v3.c cVar7 = (v3.c) sVar4.j(g1.f58547h);
            s1 colorScheme = (s1) sVar4.j(v1.f31180a);
            m.f(colorScheme, "colorScheme");
            long j13 = colorScheme.f31034q;
            long j14 = colorScheme.f31017a;
            long j15 = colorScheme.f31033p;
            ms.b bVar3 = new ms.b(j13, j14, j14, j15, colorScheme.A, colorScheme.f31035r, j15, j14);
            Object objQ6 = sVar4.Q();
            l1.g gVar10 = l1.m.f39353a;
            if (objQ6 == gVar10) {
                objQ6 = ep.a.r(LogSeverity.EMERGENCY_VALUE, sVar4);
            }
            b1 b1Var11 = (b1) objQ6;
            Object objQ7 = sVar4.Q();
            if (objQ7 == gVar10) {
                objQ7 = ep.a.r(600, sVar4);
            }
            b1 b1Var12 = (b1) objQ7;
            boolean zF = ((i32 & 7168) == 2048) | ((57344 & i32) == 16384) | ((i31 & 14) == 4) | sVar4.f(cVar7) | ((((i31 & 896) ^ 384) > 256 && sVar4.f(aVar)) || (i31 & 384) == 256) | sVar4.f(d2VarU2) | ((i31 & 112) == 32) | sVar4.f(d2VarU);
            Object objQ8 = sVar4.Q();
            if (zF || objQ8 == gVar10) {
                i19 = i32;
                num5 = num4;
                sVar2 = sVar4;
                b1Var = b1Var12;
                num6 = num3;
                i21 = i31;
                eVar = new e(num6, num5, b1Var11, b1Var, i11, cVar7, d2VarU2, aVar, i12, d2VarU, (vy.d) null);
                d2Var = d2VarU;
                aVar4 = aVar;
                sVar2.o0(eVar);
            } else {
                d2Var = d2VarU;
                eVar = objQ8;
                num5 = num4;
                sVar2 = sVar4;
                i19 = i32;
                b1Var = b1Var12;
                num6 = num3;
                aVar4 = aVar;
                i21 = i31;
            }
            t.g(num6, num5, (fz.e) eVar, sVar2);
            Object objQ9 = sVar2.Q();
            if (objQ9 == gVar10) {
                objQ9 = t.B(null);
                sVar2.o0(objQ9);
            }
            b1 b1Var13 = (b1) objQ9;
            Object objQ10 = sVar2.Q();
            if (objQ10 == gVar10) {
                objQ10 = t.B(null);
                sVar2.o0(objQ10);
            }
            b1 b1Var14 = (b1) objQ10;
            Object objQ11 = sVar2.Q();
            if (objQ11 == gVar10) {
                objQ11 = t.B(null);
                sVar2.o0(objQ11);
            }
            b1 b1Var15 = (b1) objQ11;
            Object objQ12 = sVar2.Q();
            if (objQ12 == gVar10) {
                objQ12 = t.B(null);
                sVar2.o0(objQ12);
            }
            b1 b1Var16 = (b1) objQ12;
            boolean z20 = ((i19 & 112) == 32) | ((i19 & 896) == 256);
            Object objQ13 = sVar2.Q();
            if (z20 || objQ13 == gVar10) {
                d2Var2 = d2VarU2;
                b1Var2 = b1Var;
                tVar = new k9.t(num, num2, b1Var13, b1Var14, b1Var15, b1Var16, null, 1);
                num7 = num2;
                num8 = num;
                b1Var3 = b1Var13;
                b1Var4 = b1Var15;
                b1Var14 = b1Var14;
                b1Var5 = b1Var16;
                sVar2.o0(tVar);
            } else {
                num8 = num;
                num7 = num2;
                b1Var2 = b1Var;
                b1Var5 = b1Var16;
                d2Var2 = d2VarU2;
                tVar = objQ13;
                b1Var3 = b1Var13;
                b1Var4 = b1Var15;
            }
            t.g(num8, num7, (fz.e) tVar, sVar2);
            Integer num11 = num8 == null ? (Integer) b1Var3.getValue() : num8;
            Integer num12 = num7 == null ? (Integer) b1Var14.getValue() : num7;
            r rVarD = e2.d(rVar, 1.0f);
            r0 r0Var3 = f0.f28556b;
            final b1 b1Var17 = b1Var4;
            r rVarH = d0.n.h(rVarD, j15, r0Var3);
            z1.j jVar5 = jVar4;
            q0 q0VarD = j0.o.d(jVar5, false);
            b1 b1Var18 = b1Var5;
            b1 b1Var19 = b1Var3;
            int iHashCode10 = Long.hashCode(sVar2.T);
            q1 q1VarL = sVar2.l();
            r rVarC = z1.a.c(sVar2, rVarH);
            y2.k.J.getClass();
            r0 r0Var4 = r0Var3;
            y2.i iVar8 = y2.j.f56913b;
            sVar2.h0();
            final b1 b1Var20 = b1Var14;
            if (sVar2.S) {
                sVar2.k(iVar8);
            } else {
                sVar2.r0();
            }
            y2.h hVar6 = y2.j.f56917f;
            t.J(hVar6, q0VarD, sVar2);
            y2.h hVar7 = y2.j.f56916e;
            t.J(hVar7, q1VarL, sVar2);
            y2.h hVar8 = y2.j.f56918g;
            if (sVar2.S) {
                b1Var6 = b1Var19;
            } else {
                b1Var6 = b1Var19;
                if (!m.a(sVar2.Q(), Integer.valueOf(iHashCode10))) {
                }
                y2.h hVar9 = y2.j.f56915d;
                t.J(hVar9, rVarC, sVar2);
                oVar = o.f58481a;
                r rVarE = j0.c.E(e2.d(oVar, 1.0f), aVar4.f41209c, aVar4.f41210d, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12);
                objQ = sVar2.Q();
                if (objQ == gVar10) {
                    objQ = new i2(b1Var11, b1Var2, 10);
                    sVar2.o0(objQ);
                }
                r rVarM = a0.m(rVarE, (fz.c) objQ);
                q0 q0VarD2 = j0.o.d(jVar5, false);
                iHashCode = Long.hashCode(sVar2.T);
                q1 q1VarL2 = sVar2.l();
                r rVarC2 = z1.a.c(sVar2, rVarM);
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar8);
                } else {
                    sVar2.r0();
                }
                t.J(hVar6, q0VarD2, sVar2);
                t.J(hVar7, q1VarL2, sVar2);
                if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar8);
                }
                t.J(hVar9, rVarC2, sVar2);
                r rVarY = d0.n.y(d0.n.v(e2.d(oVar, 1.0f), d2Var, true, false), d2Var2, false, 14);
                q0 q0VarD3 = j0.o.d(jVar5, false);
                iHashCode2 = Long.hashCode(sVar2.T);
                q1 q1VarL3 = sVar2.l();
                r rVarC3 = z1.a.c(sVar2, rVarY);
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar8);
                } else {
                    sVar2.r0();
                }
                t.J(hVar6, q0VarD3, sVar2);
                t.J(hVar7, q1VarL3, sVar2);
                if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar8);
                }
                t.J(hVar9, rVarC3, sVar2);
                u uVarA = j0.t.a(j0.i.f35305c, hVar5, sVar2, 0);
                iHashCode3 = Long.hashCode(sVar2.T);
                q1 q1VarL4 = sVar2.l();
                r rVarC4 = z1.a.c(sVar2, oVar);
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar8);
                } else {
                    sVar2.r0();
                }
                t.J(hVar6, uVarA, sVar2);
                t.J(hVar7, q1VarL4, sVar2);
                if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                    defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar8);
                }
                t.J(hVar9, rVarC4, sVar2);
                sVar2.d0(-814460216);
                i22 = 1;
                while (i22 < i11) {
                    iVar4 = iVar7;
                    a2 a2VarA = z1.a(j0.i.f35303a, iVar4, sVar2, 0);
                    iHashCode9 = Long.hashCode(sVar2.T);
                    q1 q1VarL5 = sVar2.l();
                    r rVarC5 = z1.a.c(sVar2, oVar);
                    y2.k.J.getClass();
                    iVar5 = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar5);
                    } else {
                        sVar2.r0();
                    }
                    t.J(y2.j.f56917f, a2VarA, sVar2);
                    t.J(y2.j.f56916e, q1VarL5, sVar2);
                    hVar4 = y2.j.f56918g;
                    if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode9))) {
                        defpackage.e.A(iHashCode9, sVar2, iHashCode9, hVar4);
                    }
                    t.J(y2.j.f56915d, rVarC5, sVar2);
                    sVar2.d0(754653011);
                    i25 = i12;
                    i26 = 1;
                    while (i26 < i25) {
                        cVar5 = (ms.c) getItem.invoke(Integer.valueOf(i22), Integer.valueOf(i26));
                        float f13 = aVar.f41207a;
                        float f14 = aVar.f41208b;
                        o oVar5 = oVar;
                        if (num11 == null && num11.intValue() == i22 && num12 != null && num12.intValue() == i26) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        boolean zH = sVar2.h(cVar5) | sVar2.d(i22) | sVar2.d(i26);
                        i27 = i22;
                        z1.i iVar9 = iVar4;
                        if ((i21 & 29360128) == 8388608) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = z18 | zH;
                        objQ5 = sVar2.Q();
                        if (z19) {
                            final b1 b1Var21 = b1Var18;
                            gVar8 = gVar10;
                            final int i33 = i26;
                            cVar6 = cVar5;
                            final b1 b1Var22 = b1Var6;
                            fz.a aVar6 = new fz.a() { // from class: ls.b
                                @Override // fz.a
                                public final Object invoke() {
                                    ms.c cVar8 = cVar6;
                                    if (!cVar8.isEmpty()) {
                                        int i34 = i27;
                                        b1Var22.setValue(Integer.valueOf(i34));
                                        int i35 = i33;
                                        b1Var20.setValue(Integer.valueOf(i35));
                                        b1Var17.setValue(null);
                                        b1Var21.setValue(null);
                                        fVar.invoke(Integer.valueOf(i34), Integer.valueOf(i35), cVar8);
                                    }
                                    return b0.f48488a;
                                }
                            };
                            i28 = i33;
                            b1Var10 = b1Var21;
                            sVar2.o0(aVar6);
                            objQ5 = aVar6;
                        } else {
                            gVar9 = gVar10;
                            if (objQ5 == gVar9) {
                                gVar10 = gVar9;
                                final b1 b1Var23 = b1Var18;
                                gVar8 = gVar10;
                                final int i34 = i26;
                                cVar6 = cVar5;
                                final b1 b1Var24 = b1Var6;
                                fz.a aVar7 = new fz.a() { // from class: ls.b
                                    @Override // fz.a
                                    public final Object invoke() {
                                        ms.c cVar8 = cVar6;
                                        if (!cVar8.isEmpty()) {
                                            int i35 = i27;
                                            b1Var24.setValue(Integer.valueOf(i35));
                                            int i36 = i34;
                                            b1Var20.setValue(Integer.valueOf(i36));
                                            b1Var17.setValue(null);
                                            b1Var23.setValue(null);
                                            fVar.invoke(Integer.valueOf(i35), Integer.valueOf(i36), cVar8);
                                        }
                                        return b0.f48488a;
                                    }
                                };
                                i28 = i34;
                                b1Var10 = b1Var23;
                                sVar2.o0(aVar7);
                                objQ5 = aVar7;
                            } else {
                                gVar8 = gVar9;
                                i28 = i26;
                                cVar6 = cVar5;
                                b1Var10 = b1Var18;
                            }
                        }
                        s sVar5 = sVar2;
                        ms.b bVar4 = bVar3;
                        d(cVar6, f13, f14, z17, bVar4, aVar, (fz.a) objQ5, false, sVar5, (i21 << 9) & 458752, 128);
                        i26 = i28 + 1;
                        bVar3 = bVar4;
                        iVar4 = iVar9;
                        i25 = i12;
                        b1Var18 = b1Var10;
                        i22 = i27;
                        jVar5 = jVar5;
                        r0Var4 = r0Var4;
                        oVar = oVar5;
                        gVar10 = gVar8;
                        sVar2 = sVar5;
                    }
                    s sVar6 = sVar2;
                    sVar6.p(false);
                    sVar6.p(true);
                    i22++;
                    sVar2 = sVar6;
                    iVar7 = iVar4;
                    r0Var4 = r0Var4;
                    oVar = oVar;
                }
                aVar5 = aVar;
                z1.j jVar6 = jVar5;
                sVar3 = sVar2;
                z1.i iVar10 = iVar7;
                r0Var = r0Var4;
                gVar = gVar10;
                bVar = bVar3;
                i17 = i12;
                b1Var7 = b1Var18;
                sVar3.p(false);
                sVar3.p(true);
                sVar3.p(true);
                sVar3.p(true);
                oVar2 = oVar;
                r rVarE2 = j0.c.E(e2.g(e2.e(oVar2, 1.0f), f12), aVar5.f41209c, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                long j16 = bVar.f41217d;
                r rVarD2 = z1.a.d(d0.n.h(rVarE2, j16, r0Var), 1.0f);
                f5 = f12;
                q0 q0VarD4 = j0.o.d(jVar6, false);
                j11 = j16;
                iHashCode4 = Long.hashCode(sVar3.T);
                q1 q1VarL6 = sVar3.l();
                r rVarC6 = z1.a.c(sVar3, rVarD2);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar3.h0();
                if (sVar3.S) {
                    sVar3.k(iVar);
                } else {
                    sVar3.r0();
                }
                y2.h hVar10 = y2.j.f56917f;
                t.J(hVar10, q0VarD4, sVar3);
                y2.h hVar11 = y2.j.f56916e;
                t.J(hVar11, q1VarL6, sVar3);
                hVar = y2.j.f56918g;
                jVar = jVar6;
                if (sVar3.S) {
                    bVar2 = bVar;
                } else {
                    bVar2 = bVar;
                    if (!m.a(sVar3.Q(), Integer.valueOf(iHashCode4))) {
                    }
                    y2.h hVar12 = y2.j.f56915d;
                    t.J(hVar12, rVarC6, sVar3);
                    r rVarV = d0.n.v(oVar2, d2Var, true, false);
                    a2 a2VarA2 = z1.a(j0.i.f35303a, iVar10, sVar3, 0);
                    iHashCode5 = Long.hashCode(sVar3.T);
                    q1 q1VarL7 = sVar3.l();
                    r rVarC7 = z1.a.c(sVar3, rVarV);
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar);
                    } else {
                        sVar3.r0();
                    }
                    t.J(hVar10, a2VarA2, sVar3);
                    t.J(hVar11, q1VarL7, sVar3);
                    if (sVar3.S || !m.a(sVar3.Q(), Integer.valueOf(iHashCode5))) {
                        defpackage.e.A(iHashCode5, sVar3, iHashCode5, hVar);
                    }
                    t.J(hVar12, rVarC7, sVar3);
                    sVar3.d0(-322558712);
                    i23 = 1;
                    while (i23 < i17) {
                        ms.c cVar8 = (ms.c) getColumnHeader.invoke(Integer.valueOf(i23));
                        float f15 = aVar5.f41207a;
                        float f16 = aVar5.f41210d;
                        num10 = (Integer) b1Var7.getValue();
                        if (num10 == null && num10.intValue() == i23) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean zD = sVar3.d(i23);
                        if ((i21 & 1879048192) == 536870912) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zD | z15;
                        objQ4 = sVar3.Q();
                        if (z16) {
                            gVar6 = gVar;
                        } else {
                            gVar6 = gVar;
                            if (objQ4 == gVar6) {
                                oVar4 = oVar2;
                                gVar7 = gVar6;
                                b1Var9 = b1Var7;
                            }
                            ms.a aVar8 = aVar5;
                            s sVar7 = sVar3;
                            d(cVar8, f15, f16, z14, bVar2, aVar8, (fz.a) objQ4, true, sVar7, ((i21 << 9) & 458752) | 12582912, 0);
                            sVar3 = sVar7;
                            aVar5 = aVar8;
                            i23++;
                            b1Var7 = b1Var9;
                            f5 = f5;
                            jVar = jVar;
                            r0Var = r0Var;
                            oVar2 = oVar4;
                            gVar = gVar7;
                            j11 = j11;
                        }
                        final int i35 = 0;
                        gVar7 = gVar6;
                        final b1 b1Var25 = b1Var7;
                        final b1 b1Var26 = b1Var6;
                        oVar4 = oVar2;
                        fz.a aVar9 = new fz.a() { // from class: ls.c
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i35) {
                                    case 0:
                                        int i36 = i23;
                                        b1Var25.setValue(Integer.valueOf(i36));
                                        b1Var17.setValue(null);
                                        b1Var26.setValue(null);
                                        b1Var20.setValue(null);
                                        cVar2.invoke(Integer.valueOf(i36));
                                        break;
                                    default:
                                        int i37 = i23;
                                        b1Var25.setValue(Integer.valueOf(i37));
                                        b1Var17.setValue(null);
                                        b1Var26.setValue(null);
                                        b1Var20.setValue(null);
                                        cVar2.invoke(Integer.valueOf(i37));
                                        break;
                                }
                                return b0.f48488a;
                            }
                        };
                        b1Var9 = b1Var25;
                        sVar3.o0(aVar9);
                        objQ4 = aVar9;
                        ms.a aVar10 = aVar5;
                        s sVar8 = sVar3;
                        d(cVar8, f15, f16, z14, bVar2, aVar10, (fz.a) objQ4, true, sVar8, ((i21 << 9) & 458752) | 12582912, 0);
                        sVar3 = sVar8;
                        aVar5 = aVar10;
                        i23++;
                        b1Var7 = b1Var9;
                        f5 = f5;
                        jVar = jVar;
                        r0Var = r0Var;
                        oVar2 = oVar4;
                        gVar = gVar7;
                        j11 = j11;
                    }
                    cVar4 = getColumnHeader;
                    float f17 = f5;
                    j12 = j11;
                    b1Var8 = b1Var7;
                    jVar2 = jVar;
                    r0 r0Var5 = r0Var;
                    gVar2 = gVar;
                    com.google.android.material.datepicker.d.B(sVar3, false, true, true);
                    r rVarD3 = z1.a.d(d0.n.h(j0.c.E(e2.c(e2.s(oVar2, f11), 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, aVar5.f41210d, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), j12, r0Var5), 1.0f);
                    q0 q0VarD5 = j0.o.d(jVar2, false);
                    r0Var2 = r0Var5;
                    iHashCode6 = Long.hashCode(sVar3.T);
                    q1 q1VarL8 = sVar3.l();
                    r rVarC8 = z1.a.c(sVar3, rVarD3);
                    y2.k.J.getClass();
                    iVar2 = y2.j.f56913b;
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar2);
                    } else {
                        sVar3.r0();
                    }
                    y2.h hVar13 = y2.j.f56917f;
                    t.J(hVar13, q0VarD5, sVar3);
                    y2.h hVar14 = y2.j.f56916e;
                    t.J(hVar14, q1VarL8, sVar3);
                    hVar2 = y2.j.f56918g;
                    if (sVar3.S) {
                        jVar3 = jVar2;
                    } else {
                        jVar3 = jVar2;
                        if (!m.a(sVar3.Q(), Integer.valueOf(iHashCode6))) {
                        }
                        y2.h hVar15 = y2.j.f56915d;
                        t.J(hVar15, rVarC8, sVar3);
                        r rVarY2 = d0.n.y(oVar2, d2Var2, false, 14);
                        u uVarA2 = j0.t.a(j0.i.f35305c, hVar5, sVar3, 0);
                        iHashCode7 = Long.hashCode(sVar3.T);
                        q1 q1VarL9 = sVar3.l();
                        r rVarC9 = z1.a.c(sVar3, rVarY2);
                        sVar3.h0();
                        if (sVar3.S) {
                            sVar3.k(iVar2);
                        } else {
                            sVar3.r0();
                        }
                        t.J(hVar13, uVarA2, sVar3);
                        t.J(hVar14, q1VarL9, sVar3);
                        if (sVar3.S || !m.a(sVar3.Q(), Integer.valueOf(iHashCode7))) {
                            defpackage.e.A(iHashCode7, sVar3, iHashCode7, hVar2);
                        }
                        t.J(hVar15, rVarC9, sVar3);
                        sVar3.d0(-708246647);
                        i24 = 1;
                        i18 = i11;
                        while (i24 < i18) {
                            ms.c cVar9 = (ms.c) getRowHeader.invoke(Integer.valueOf(i24));
                            float f18 = aVar5.f41209c;
                            float f19 = aVar5.f41208b;
                            num9 = (Integer) b1Var17.getValue();
                            if (num9 == null && num9.intValue() == i24) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            boolean zD2 = sVar3.d(i24);
                            if ((i21 & 234881024) == 67108864) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            z13 = zD2 | z12;
                            objQ3 = sVar3.Q();
                            if (z13) {
                                gVar4 = gVar2;
                            } else {
                                gVar4 = gVar2;
                                if (objQ3 == gVar4) {
                                    oVar3 = oVar2;
                                    gVar5 = gVar4;
                                }
                                ms.a aVar11 = aVar5;
                                s sVar9 = sVar3;
                                d(cVar9, f18, f19, z11, bVar2, aVar11, (fz.a) objQ3, true, sVar9, ((i21 << 9) & 458752) | 12582912, 0);
                                i24++;
                                sVar3 = sVar9;
                                jVar3 = jVar3;
                                r0Var2 = r0Var2;
                                oVar2 = oVar3;
                                gVar2 = gVar5;
                                j12 = j12;
                                aVar5 = aVar11;
                            }
                            final int i36 = 1;
                            gVar5 = gVar4;
                            final b1 b1Var27 = b1Var6;
                            oVar3 = oVar2;
                            fz.a aVar12 = new fz.a() { // from class: ls.c
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i36) {
                                        case 0:
                                            int i37 = i24;
                                            b1Var17.setValue(Integer.valueOf(i37));
                                            b1Var8.setValue(null);
                                            b1Var27.setValue(null);
                                            b1Var20.setValue(null);
                                            cVar.invoke(Integer.valueOf(i37));
                                            break;
                                        default:
                                            int i38 = i24;
                                            b1Var17.setValue(Integer.valueOf(i38));
                                            b1Var8.setValue(null);
                                            b1Var27.setValue(null);
                                            b1Var20.setValue(null);
                                            cVar.invoke(Integer.valueOf(i38));
                                            break;
                                    }
                                    return b0.f48488a;
                                }
                            };
                            sVar3.o0(aVar12);
                            objQ3 = aVar12;
                            ms.a aVar13 = aVar5;
                            s sVar10 = sVar3;
                            d(cVar9, f18, f19, z11, bVar2, aVar13, (fz.a) objQ3, true, sVar10, ((i21 << 9) & 458752) | 12582912, 0);
                            i24++;
                            sVar3 = sVar10;
                            jVar3 = jVar3;
                            r0Var2 = r0Var2;
                            oVar2 = oVar3;
                            gVar2 = gVar5;
                            j12 = j12;
                            aVar5 = aVar13;
                        }
                        cVar3 = getRowHeader;
                        ms.a aVar14 = aVar5;
                        sVar = sVar3;
                        gVar3 = gVar2;
                        com.google.android.material.datepicker.d.B(sVar, false, true, true);
                        r rVarD4 = z1.a.d(d0.n.h(e2.p(oVar2, f11, f17), j12, r0Var2), 2.0f);
                        q0 q0VarD6 = j0.o.d(jVar3, false);
                        iHashCode8 = Long.hashCode(sVar.T);
                        q1 q1VarL10 = sVar.l();
                        r rVarC10 = z1.a.c(sVar, rVarD4);
                        y2.k.J.getClass();
                        iVar3 = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar3);
                        } else {
                            sVar.r0();
                        }
                        t.J(y2.j.f56917f, q0VarD6, sVar);
                        t.J(y2.j.f56916e, q1VarL10, sVar);
                        hVar3 = y2.j.f56918g;
                        if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode8))) {
                            defpackage.e.A(iHashCode8, sVar, iHashCode8, hVar3);
                        }
                        t.J(y2.j.f56915d, rVarC10, sVar);
                        ms.c cVar10 = (ms.c) aVar2.invoke();
                        float f21 = aVar14.f41209c;
                        float f22 = aVar14.f41210d;
                        objQ2 = sVar.Q();
                        if (objQ2 == gVar3) {
                            objQ2 = new ju.d(25);
                            sVar.o0(objQ2);
                        }
                        d(cVar10, f21, f22, false, bVar2, aVar14, (fz.a) objQ2, true, sVar, ((i21 << 9) & 458752) | 14158848, 0);
                        sVar.p(true);
                        sVar.p(true);
                    }
                    defpackage.e.A(iHashCode6, sVar3, iHashCode6, hVar2);
                    y2.h hVar16 = y2.j.f56915d;
                    t.J(hVar16, rVarC8, sVar3);
                    r rVarY3 = d0.n.y(oVar2, d2Var2, false, 14);
                    u uVarA3 = j0.t.a(j0.i.f35305c, hVar5, sVar3, 0);
                    iHashCode7 = Long.hashCode(sVar3.T);
                    q1 q1VarL11 = sVar3.l();
                    r rVarC11 = z1.a.c(sVar3, rVarY3);
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar2);
                    } else {
                        sVar3.r0();
                    }
                    t.J(hVar13, uVarA3, sVar3);
                    t.J(hVar14, q1VarL11, sVar3);
                    if (sVar3.S) {
                        defpackage.e.A(iHashCode7, sVar3, iHashCode7, hVar2);
                    } else {
                        defpackage.e.A(iHashCode7, sVar3, iHashCode7, hVar2);
                    }
                    t.J(hVar16, rVarC11, sVar3);
                    sVar3.d0(-708246647);
                    i24 = 1;
                    i18 = i11;
                    while (i24 < i18) {
                        ms.c cVar11 = (ms.c) getRowHeader.invoke(Integer.valueOf(i24));
                        float f110 = aVar5.f41209c;
                        float f111 = aVar5.f41208b;
                        num9 = (Integer) b1Var17.getValue();
                        if (num9 == null) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        boolean zD3 = sVar3.d(i24);
                        if ((i21 & 234881024) == 67108864) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z13 = zD3 | z12;
                        objQ3 = sVar3.Q();
                        if (z13) {
                            gVar4 = gVar2;
                            if (objQ3 == gVar4) {
                                oVar3 = oVar2;
                                gVar5 = gVar4;
                            }
                            ms.a aVar15 = aVar5;
                            s sVar11 = sVar3;
                            d(cVar11, f110, f111, z11, bVar2, aVar15, (fz.a) objQ3, true, sVar11, ((i21 << 9) & 458752) | 12582912, 0);
                            i24++;
                            sVar3 = sVar11;
                            jVar3 = jVar3;
                            r0Var2 = r0Var2;
                            oVar2 = oVar3;
                            gVar2 = gVar5;
                            j12 = j12;
                            aVar5 = aVar15;
                        } else {
                            gVar4 = gVar2;
                        }
                        final int i37 = 1;
                        gVar5 = gVar4;
                        final b1 b1Var28 = b1Var6;
                        oVar3 = oVar2;
                        fz.a aVar16 = new fz.a() { // from class: ls.c
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i37) {
                                    case 0:
                                        int i38 = i24;
                                        b1Var17.setValue(Integer.valueOf(i38));
                                        b1Var8.setValue(null);
                                        b1Var28.setValue(null);
                                        b1Var20.setValue(null);
                                        cVar.invoke(Integer.valueOf(i38));
                                        break;
                                    default:
                                        int i39 = i24;
                                        b1Var17.setValue(Integer.valueOf(i39));
                                        b1Var8.setValue(null);
                                        b1Var28.setValue(null);
                                        b1Var20.setValue(null);
                                        cVar.invoke(Integer.valueOf(i39));
                                        break;
                                }
                                return b0.f48488a;
                            }
                        };
                        sVar3.o0(aVar16);
                        objQ3 = aVar16;
                        ms.a aVar17 = aVar5;
                        s sVar12 = sVar3;
                        d(cVar11, f110, f111, z11, bVar2, aVar17, (fz.a) objQ3, true, sVar12, ((i21 << 9) & 458752) | 12582912, 0);
                        i24++;
                        sVar3 = sVar12;
                        jVar3 = jVar3;
                        r0Var2 = r0Var2;
                        oVar2 = oVar3;
                        gVar2 = gVar5;
                        j12 = j12;
                        aVar5 = aVar17;
                    }
                    cVar3 = getRowHeader;
                    ms.a aVar18 = aVar5;
                    sVar = sVar3;
                    gVar3 = gVar2;
                    com.google.android.material.datepicker.d.B(sVar, false, true, true);
                    r rVarD5 = z1.a.d(d0.n.h(e2.p(oVar2, f11, f17), j12, r0Var2), 2.0f);
                    q0 q0VarD7 = j0.o.d(jVar3, false);
                    iHashCode8 = Long.hashCode(sVar.T);
                    q1 q1VarL12 = sVar.l();
                    r rVarC12 = z1.a.c(sVar, rVarD5);
                    y2.k.J.getClass();
                    iVar3 = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar3);
                    } else {
                        sVar.r0();
                    }
                    t.J(y2.j.f56917f, q0VarD7, sVar);
                    t.J(y2.j.f56916e, q1VarL12, sVar);
                    hVar3 = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode8, sVar, iHashCode8, hVar3);
                    } else {
                        defpackage.e.A(iHashCode8, sVar, iHashCode8, hVar3);
                    }
                    t.J(y2.j.f56915d, rVarC12, sVar);
                    ms.c cVar12 = (ms.c) aVar2.invoke();
                    float f23 = aVar18.f41209c;
                    float f24 = aVar18.f41210d;
                    objQ2 = sVar.Q();
                    if (objQ2 == gVar3) {
                        objQ2 = new ju.d(25);
                        sVar.o0(objQ2);
                    }
                    d(cVar12, f23, f24, false, bVar2, aVar18, (fz.a) objQ2, true, sVar, ((i21 << 9) & 458752) | 14158848, 0);
                    sVar.p(true);
                    sVar.p(true);
                }
                defpackage.e.A(iHashCode4, sVar3, iHashCode4, hVar);
                y2.h hVar17 = y2.j.f56915d;
                t.J(hVar17, rVarC6, sVar3);
                r rVarV2 = d0.n.v(oVar2, d2Var, true, false);
                a2 a2VarA3 = z1.a(j0.i.f35303a, iVar10, sVar3, 0);
                iHashCode5 = Long.hashCode(sVar3.T);
                q1 q1VarL13 = sVar3.l();
                r rVarC13 = z1.a.c(sVar3, rVarV2);
                sVar3.h0();
                if (sVar3.S) {
                    sVar3.k(iVar);
                } else {
                    sVar3.r0();
                }
                t.J(hVar10, a2VarA3, sVar3);
                t.J(hVar11, q1VarL13, sVar3);
                if (sVar3.S) {
                    defpackage.e.A(iHashCode5, sVar3, iHashCode5, hVar);
                } else {
                    defpackage.e.A(iHashCode5, sVar3, iHashCode5, hVar);
                }
                t.J(hVar17, rVarC13, sVar3);
                sVar3.d0(-322558712);
                i23 = 1;
                while (i23 < i17) {
                    ms.c cVar13 = (ms.c) getColumnHeader.invoke(Integer.valueOf(i23));
                    float f112 = aVar5.f41207a;
                    float f113 = aVar5.f41210d;
                    num10 = (Integer) b1Var7.getValue();
                    if (num10 == null) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    boolean zD4 = sVar3.d(i23);
                    if ((i21 & 1879048192) == 536870912) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zD4 | z15;
                    objQ4 = sVar3.Q();
                    if (z16) {
                        gVar6 = gVar;
                        if (objQ4 == gVar6) {
                            oVar4 = oVar2;
                            gVar7 = gVar6;
                            b1Var9 = b1Var7;
                        }
                        ms.a aVar19 = aVar5;
                        s sVar13 = sVar3;
                        d(cVar13, f112, f113, z14, bVar2, aVar19, (fz.a) objQ4, true, sVar13, ((i21 << 9) & 458752) | 12582912, 0);
                        sVar3 = sVar13;
                        aVar5 = aVar19;
                        i23++;
                        b1Var7 = b1Var9;
                        f5 = f5;
                        jVar = jVar;
                        r0Var = r0Var;
                        oVar2 = oVar4;
                        gVar = gVar7;
                        j11 = j11;
                    } else {
                        gVar6 = gVar;
                    }
                    final int i38 = 0;
                    gVar7 = gVar6;
                    final b1 b1Var29 = b1Var7;
                    final b1 b1Var210 = b1Var6;
                    oVar4 = oVar2;
                    fz.a aVar20 = new fz.a() { // from class: ls.c
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i38) {
                                case 0:
                                    int i39 = i23;
                                    b1Var29.setValue(Integer.valueOf(i39));
                                    b1Var17.setValue(null);
                                    b1Var210.setValue(null);
                                    b1Var20.setValue(null);
                                    cVar2.invoke(Integer.valueOf(i39));
                                    break;
                                default:
                                    int i310 = i23;
                                    b1Var29.setValue(Integer.valueOf(i310));
                                    b1Var17.setValue(null);
                                    b1Var210.setValue(null);
                                    b1Var20.setValue(null);
                                    cVar2.invoke(Integer.valueOf(i310));
                                    break;
                            }
                            return b0.f48488a;
                        }
                    };
                    b1Var9 = b1Var29;
                    sVar3.o0(aVar20);
                    objQ4 = aVar20;
                    ms.a aVar110 = aVar5;
                    s sVar14 = sVar3;
                    d(cVar13, f112, f113, z14, bVar2, aVar110, (fz.a) objQ4, true, sVar14, ((i21 << 9) & 458752) | 12582912, 0);
                    sVar3 = sVar14;
                    aVar5 = aVar110;
                    i23++;
                    b1Var7 = b1Var9;
                    f5 = f5;
                    jVar = jVar;
                    r0Var = r0Var;
                    oVar2 = oVar4;
                    gVar = gVar7;
                    j11 = j11;
                }
                cVar4 = getColumnHeader;
                float f114 = f5;
                j12 = j11;
                b1Var8 = b1Var7;
                jVar2 = jVar;
                r0 r0Var6 = r0Var;
                gVar2 = gVar;
                com.google.android.material.datepicker.d.B(sVar3, false, true, true);
                r rVarD6 = z1.a.d(d0.n.h(j0.c.E(e2.c(e2.s(oVar2, f11), 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, aVar5.f41210d, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), j12, r0Var6), 1.0f);
                q0 q0VarD8 = j0.o.d(jVar2, false);
                r0Var2 = r0Var6;
                iHashCode6 = Long.hashCode(sVar3.T);
                q1 q1VarL14 = sVar3.l();
                r rVarC14 = z1.a.c(sVar3, rVarD6);
                y2.k.J.getClass();
                iVar2 = y2.j.f56913b;
                sVar3.h0();
                if (sVar3.S) {
                    sVar3.k(iVar2);
                } else {
                    sVar3.r0();
                }
                y2.h hVar18 = y2.j.f56917f;
                t.J(hVar18, q0VarD8, sVar3);
                y2.h hVar19 = y2.j.f56916e;
                t.J(hVar19, q1VarL14, sVar3);
                hVar2 = y2.j.f56918g;
                if (sVar3.S) {
                    jVar3 = jVar2;
                    if (!m.a(sVar3.Q(), Integer.valueOf(iHashCode6))) {
                    }
                    y2.h hVar110 = y2.j.f56915d;
                    t.J(hVar110, rVarC14, sVar3);
                    r rVarY4 = d0.n.y(oVar2, d2Var2, false, 14);
                    u uVarA4 = j0.t.a(j0.i.f35305c, hVar5, sVar3, 0);
                    iHashCode7 = Long.hashCode(sVar3.T);
                    q1 q1VarL15 = sVar3.l();
                    r rVarC15 = z1.a.c(sVar3, rVarY4);
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar2);
                    } else {
                        sVar3.r0();
                    }
                    t.J(hVar18, uVarA4, sVar3);
                    t.J(hVar19, q1VarL15, sVar3);
                    if (sVar3.S) {
                        defpackage.e.A(iHashCode7, sVar3, iHashCode7, hVar2);
                    } else {
                        defpackage.e.A(iHashCode7, sVar3, iHashCode7, hVar2);
                    }
                    t.J(hVar110, rVarC15, sVar3);
                    sVar3.d0(-708246647);
                    i24 = 1;
                    i18 = i11;
                    while (i24 < i18) {
                        ms.c cVar14 = (ms.c) getRowHeader.invoke(Integer.valueOf(i24));
                        float f115 = aVar5.f41209c;
                        float f116 = aVar5.f41208b;
                        num9 = (Integer) b1Var17.getValue();
                        if (num9 == null) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        boolean zD5 = sVar3.d(i24);
                        if ((i21 & 234881024) == 67108864) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z13 = zD5 | z12;
                        objQ3 = sVar3.Q();
                        if (z13) {
                            gVar4 = gVar2;
                            if (objQ3 == gVar4) {
                                oVar3 = oVar2;
                                gVar5 = gVar4;
                            }
                            ms.a aVar111 = aVar5;
                            s sVar15 = sVar3;
                            d(cVar14, f115, f116, z11, bVar2, aVar111, (fz.a) objQ3, true, sVar15, ((i21 << 9) & 458752) | 12582912, 0);
                            i24++;
                            sVar3 = sVar15;
                            jVar3 = jVar3;
                            r0Var2 = r0Var2;
                            oVar2 = oVar3;
                            gVar2 = gVar5;
                            j12 = j12;
                            aVar5 = aVar111;
                        } else {
                            gVar4 = gVar2;
                        }
                        final int i39 = 1;
                        gVar5 = gVar4;
                        final b1 b1Var211 = b1Var6;
                        oVar3 = oVar2;
                        fz.a aVar112 = new fz.a() { // from class: ls.c
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i39) {
                                    case 0:
                                        int i310 = i24;
                                        b1Var17.setValue(Integer.valueOf(i310));
                                        b1Var8.setValue(null);
                                        b1Var211.setValue(null);
                                        b1Var20.setValue(null);
                                        cVar.invoke(Integer.valueOf(i310));
                                        break;
                                    default:
                                        int i311 = i24;
                                        b1Var17.setValue(Integer.valueOf(i311));
                                        b1Var8.setValue(null);
                                        b1Var211.setValue(null);
                                        b1Var20.setValue(null);
                                        cVar.invoke(Integer.valueOf(i311));
                                        break;
                                }
                                return b0.f48488a;
                            }
                        };
                        sVar3.o0(aVar112);
                        objQ3 = aVar112;
                        ms.a aVar113 = aVar5;
                        s sVar16 = sVar3;
                        d(cVar14, f115, f116, z11, bVar2, aVar113, (fz.a) objQ3, true, sVar16, ((i21 << 9) & 458752) | 12582912, 0);
                        i24++;
                        sVar3 = sVar16;
                        jVar3 = jVar3;
                        r0Var2 = r0Var2;
                        oVar2 = oVar3;
                        gVar2 = gVar5;
                        j12 = j12;
                        aVar5 = aVar113;
                    }
                    cVar3 = getRowHeader;
                    ms.a aVar114 = aVar5;
                    sVar = sVar3;
                    gVar3 = gVar2;
                    com.google.android.material.datepicker.d.B(sVar, false, true, true);
                    r rVarD7 = z1.a.d(d0.n.h(e2.p(oVar2, f11, f114), j12, r0Var2), 2.0f);
                    q0 q0VarD9 = j0.o.d(jVar3, false);
                    iHashCode8 = Long.hashCode(sVar.T);
                    q1 q1VarL16 = sVar.l();
                    r rVarC16 = z1.a.c(sVar, rVarD7);
                    y2.k.J.getClass();
                    iVar3 = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar3);
                    } else {
                        sVar.r0();
                    }
                    t.J(y2.j.f56917f, q0VarD9, sVar);
                    t.J(y2.j.f56916e, q1VarL16, sVar);
                    hVar3 = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode8, sVar, iHashCode8, hVar3);
                    } else {
                        defpackage.e.A(iHashCode8, sVar, iHashCode8, hVar3);
                    }
                    t.J(y2.j.f56915d, rVarC16, sVar);
                    ms.c cVar15 = (ms.c) aVar2.invoke();
                    float f25 = aVar114.f41209c;
                    float f26 = aVar114.f41210d;
                    objQ2 = sVar.Q();
                    if (objQ2 == gVar3) {
                        objQ2 = new ju.d(25);
                        sVar.o0(objQ2);
                    }
                    d(cVar15, f25, f26, false, bVar2, aVar114, (fz.a) objQ2, true, sVar, ((i21 << 9) & 458752) | 14158848, 0);
                    sVar.p(true);
                    sVar.p(true);
                } else {
                    jVar3 = jVar2;
                }
                defpackage.e.A(iHashCode6, sVar3, iHashCode6, hVar2);
                y2.h hVar111 = y2.j.f56915d;
                t.J(hVar111, rVarC14, sVar3);
                r rVarY5 = d0.n.y(oVar2, d2Var2, false, 14);
                u uVarA5 = j0.t.a(j0.i.f35305c, hVar5, sVar3, 0);
                iHashCode7 = Long.hashCode(sVar3.T);
                q1 q1VarL17 = sVar3.l();
                r rVarC17 = z1.a.c(sVar3, rVarY5);
                sVar3.h0();
                if (sVar3.S) {
                    sVar3.k(iVar2);
                } else {
                    sVar3.r0();
                }
                t.J(hVar18, uVarA5, sVar3);
                t.J(hVar19, q1VarL17, sVar3);
                if (sVar3.S) {
                    defpackage.e.A(iHashCode7, sVar3, iHashCode7, hVar2);
                } else {
                    defpackage.e.A(iHashCode7, sVar3, iHashCode7, hVar2);
                }
                t.J(hVar111, rVarC17, sVar3);
                sVar3.d0(-708246647);
                i24 = 1;
                i18 = i11;
                while (i24 < i18) {
                    ms.c cVar16 = (ms.c) getRowHeader.invoke(Integer.valueOf(i24));
                    float f117 = aVar5.f41209c;
                    float f118 = aVar5.f41208b;
                    num9 = (Integer) b1Var17.getValue();
                    if (num9 == null) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    boolean zD6 = sVar3.d(i24);
                    if ((i21 & 234881024) == 67108864) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = zD6 | z12;
                    objQ3 = sVar3.Q();
                    if (z13) {
                        gVar4 = gVar2;
                        if (objQ3 == gVar4) {
                            oVar3 = oVar2;
                            gVar5 = gVar4;
                        }
                        ms.a aVar115 = aVar5;
                        s sVar17 = sVar3;
                        d(cVar16, f117, f118, z11, bVar2, aVar115, (fz.a) objQ3, true, sVar17, ((i21 << 9) & 458752) | 12582912, 0);
                        i24++;
                        sVar3 = sVar17;
                        jVar3 = jVar3;
                        r0Var2 = r0Var2;
                        oVar2 = oVar3;
                        gVar2 = gVar5;
                        j12 = j12;
                        aVar5 = aVar115;
                    } else {
                        gVar4 = gVar2;
                    }
                    final int i310 = 1;
                    gVar5 = gVar4;
                    final b1 b1Var212 = b1Var6;
                    oVar3 = oVar2;
                    fz.a aVar116 = new fz.a() { // from class: ls.c
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i310) {
                                case 0:
                                    int i311 = i24;
                                    b1Var17.setValue(Integer.valueOf(i311));
                                    b1Var8.setValue(null);
                                    b1Var212.setValue(null);
                                    b1Var20.setValue(null);
                                    cVar.invoke(Integer.valueOf(i311));
                                    break;
                                default:
                                    int i312 = i24;
                                    b1Var17.setValue(Integer.valueOf(i312));
                                    b1Var8.setValue(null);
                                    b1Var212.setValue(null);
                                    b1Var20.setValue(null);
                                    cVar.invoke(Integer.valueOf(i312));
                                    break;
                            }
                            return b0.f48488a;
                        }
                    };
                    sVar3.o0(aVar116);
                    objQ3 = aVar116;
                    ms.a aVar117 = aVar5;
                    s sVar18 = sVar3;
                    d(cVar16, f117, f118, z11, bVar2, aVar117, (fz.a) objQ3, true, sVar18, ((i21 << 9) & 458752) | 12582912, 0);
                    i24++;
                    sVar3 = sVar18;
                    jVar3 = jVar3;
                    r0Var2 = r0Var2;
                    oVar2 = oVar3;
                    gVar2 = gVar5;
                    j12 = j12;
                    aVar5 = aVar117;
                }
                cVar3 = getRowHeader;
                ms.a aVar118 = aVar5;
                sVar = sVar3;
                gVar3 = gVar2;
                com.google.android.material.datepicker.d.B(sVar, false, true, true);
                r rVarD8 = z1.a.d(d0.n.h(e2.p(oVar2, f11, f114), j12, r0Var2), 2.0f);
                q0 q0VarD10 = j0.o.d(jVar3, false);
                iHashCode8 = Long.hashCode(sVar.T);
                q1 q1VarL18 = sVar.l();
                r rVarC18 = z1.a.c(sVar, rVarD8);
                y2.k.J.getClass();
                iVar3 = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar3);
                } else {
                    sVar.r0();
                }
                t.J(y2.j.f56917f, q0VarD10, sVar);
                t.J(y2.j.f56916e, q1VarL18, sVar);
                hVar3 = y2.j.f56918g;
                if (sVar.S) {
                    defpackage.e.A(iHashCode8, sVar, iHashCode8, hVar3);
                } else {
                    defpackage.e.A(iHashCode8, sVar, iHashCode8, hVar3);
                }
                t.J(y2.j.f56915d, rVarC18, sVar);
                ms.c cVar17 = (ms.c) aVar2.invoke();
                float f27 = aVar118.f41209c;
                float f28 = aVar118.f41210d;
                objQ2 = sVar.Q();
                if (objQ2 == gVar3) {
                    objQ2 = new ju.d(25);
                    sVar.o0(objQ2);
                }
                d(cVar17, f27, f28, false, bVar2, aVar118, (fz.a) objQ2, true, sVar, ((i21 << 9) & 458752) | 14158848, 0);
                sVar.p(true);
                sVar.p(true);
            }
            defpackage.e.A(iHashCode10, sVar2, iHashCode10, hVar8);
            y2.h hVar20 = y2.j.f56915d;
            t.J(hVar20, rVarC, sVar2);
            oVar = o.f58481a;
            r rVarE3 = j0.c.E(e2.d(oVar, 1.0f), aVar4.f41209c, aVar4.f41210d, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12);
            objQ = sVar2.Q();
            if (objQ == gVar10) {
                objQ = new i2(b1Var11, b1Var2, 10);
                sVar2.o0(objQ);
            }
            r rVarM2 = a0.m(rVarE3, (fz.c) objQ);
            q0 q0VarD11 = j0.o.d(jVar5, false);
            iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL19 = sVar2.l();
            r rVarC19 = z1.a.c(sVar2, rVarM2);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar8);
            } else {
                sVar2.r0();
            }
            t.J(hVar6, q0VarD11, sVar2);
            t.J(hVar7, q1VarL19, sVar2);
            if (sVar2.S) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar8);
            } else {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar8);
            }
            t.J(hVar20, rVarC19, sVar2);
            r rVarY6 = d0.n.y(d0.n.v(e2.d(oVar, 1.0f), d2Var, true, false), d2Var2, false, 14);
            q0 q0VarD12 = j0.o.d(jVar5, false);
            iHashCode2 = Long.hashCode(sVar2.T);
            q1 q1VarL20 = sVar2.l();
            r rVarC20 = z1.a.c(sVar2, rVarY6);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar8);
            } else {
                sVar2.r0();
            }
            t.J(hVar6, q0VarD12, sVar2);
            t.J(hVar7, q1VarL20, sVar2);
            if (sVar2.S) {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar8);
            } else {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar8);
            }
            t.J(hVar20, rVarC20, sVar2);
            u uVarA6 = j0.t.a(j0.i.f35305c, hVar5, sVar2, 0);
            iHashCode3 = Long.hashCode(sVar2.T);
            q1 q1VarL21 = sVar2.l();
            r rVarC21 = z1.a.c(sVar2, oVar);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar8);
            } else {
                sVar2.r0();
            }
            t.J(hVar6, uVarA6, sVar2);
            t.J(hVar7, q1VarL21, sVar2);
            if (sVar2.S) {
                defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar8);
            } else {
                defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar8);
            }
            t.J(hVar20, rVarC21, sVar2);
            sVar2.d0(-814460216);
            i22 = 1;
            while (i22 < i11) {
                iVar4 = iVar7;
                a2 a2VarA4 = z1.a(j0.i.f35303a, iVar4, sVar2, 0);
                iHashCode9 = Long.hashCode(sVar2.T);
                q1 q1VarL22 = sVar2.l();
                r rVarC22 = z1.a.c(sVar2, oVar);
                y2.k.J.getClass();
                iVar5 = y2.j.f56913b;
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar5);
                } else {
                    sVar2.r0();
                }
                t.J(y2.j.f56917f, a2VarA4, sVar2);
                t.J(y2.j.f56916e, q1VarL22, sVar2);
                hVar4 = y2.j.f56918g;
                if (sVar2.S) {
                    defpackage.e.A(iHashCode9, sVar2, iHashCode9, hVar4);
                } else {
                    defpackage.e.A(iHashCode9, sVar2, iHashCode9, hVar4);
                }
                t.J(y2.j.f56915d, rVarC22, sVar2);
                sVar2.d0(754653011);
                i25 = i12;
                i26 = 1;
                while (i26 < i25) {
                    cVar5 = (ms.c) getItem.invoke(Integer.valueOf(i22), Integer.valueOf(i26));
                    float f119 = aVar.f41207a;
                    float f120 = aVar.f41208b;
                    o oVar6 = oVar;
                    if (num11 == null) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    boolean zH2 = sVar2.h(cVar5) | sVar2.d(i22) | sVar2.d(i26);
                    i27 = i22;
                    z1.i iVar11 = iVar4;
                    if ((i21 & 29360128) == 8388608) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | zH2;
                    objQ5 = sVar2.Q();
                    if (z19) {
                        final b1 b1Var213 = b1Var18;
                        gVar8 = gVar10;
                        final int i311 = i26;
                        cVar6 = cVar5;
                        final b1 b1Var214 = b1Var6;
                        fz.a aVar21 = new fz.a() { // from class: ls.b
                            @Override // fz.a
                            public final Object invoke() {
                                ms.c cVar18 = cVar6;
                                if (!cVar18.isEmpty()) {
                                    int i312 = i27;
                                    b1Var214.setValue(Integer.valueOf(i312));
                                    int i313 = i311;
                                    b1Var20.setValue(Integer.valueOf(i313));
                                    b1Var17.setValue(null);
                                    b1Var213.setValue(null);
                                    fVar.invoke(Integer.valueOf(i312), Integer.valueOf(i313), cVar18);
                                }
                                return b0.f48488a;
                            }
                        };
                        i28 = i311;
                        b1Var10 = b1Var213;
                        sVar2.o0(aVar21);
                        objQ5 = aVar21;
                    } else {
                        gVar9 = gVar10;
                        if (objQ5 == gVar9) {
                            gVar10 = gVar9;
                            final b1 b1Var215 = b1Var18;
                            gVar8 = gVar10;
                            final int i312 = i26;
                            cVar6 = cVar5;
                            final b1 b1Var216 = b1Var6;
                            fz.a aVar22 = new fz.a() { // from class: ls.b
                                @Override // fz.a
                                public final Object invoke() {
                                    ms.c cVar18 = cVar6;
                                    if (!cVar18.isEmpty()) {
                                        int i313 = i27;
                                        b1Var216.setValue(Integer.valueOf(i313));
                                        int i314 = i312;
                                        b1Var20.setValue(Integer.valueOf(i314));
                                        b1Var17.setValue(null);
                                        b1Var215.setValue(null);
                                        fVar.invoke(Integer.valueOf(i313), Integer.valueOf(i314), cVar18);
                                    }
                                    return b0.f48488a;
                                }
                            };
                            i28 = i312;
                            b1Var10 = b1Var215;
                            sVar2.o0(aVar22);
                            objQ5 = aVar22;
                        } else {
                            gVar8 = gVar9;
                            i28 = i26;
                            cVar6 = cVar5;
                            b1Var10 = b1Var18;
                        }
                    }
                    s sVar19 = sVar2;
                    ms.b bVar5 = bVar3;
                    d(cVar6, f119, f120, z17, bVar5, aVar, (fz.a) objQ5, false, sVar19, (i21 << 9) & 458752, 128);
                    i26 = i28 + 1;
                    bVar3 = bVar5;
                    iVar4 = iVar11;
                    i25 = i12;
                    b1Var18 = b1Var10;
                    i22 = i27;
                    jVar5 = jVar5;
                    r0Var4 = r0Var4;
                    oVar = oVar6;
                    gVar10 = gVar8;
                    sVar2 = sVar19;
                }
                s sVar20 = sVar2;
                sVar20.p(false);
                sVar20.p(true);
                i22++;
                sVar2 = sVar20;
                iVar7 = iVar4;
                r0Var4 = r0Var4;
                oVar = oVar;
            }
            aVar5 = aVar;
            z1.j jVar7 = jVar5;
            sVar3 = sVar2;
            z1.i iVar12 = iVar7;
            r0Var = r0Var4;
            gVar = gVar10;
            bVar = bVar3;
            i17 = i12;
            b1Var7 = b1Var18;
            sVar3.p(false);
            sVar3.p(true);
            sVar3.p(true);
            sVar3.p(true);
            oVar2 = oVar;
            r rVarE4 = j0.c.E(e2.g(e2.e(oVar2, 1.0f), f12), aVar5.f41209c, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            long j17 = bVar.f41217d;
            r rVarD9 = z1.a.d(d0.n.h(rVarE4, j17, r0Var), 1.0f);
            f5 = f12;
            q0 q0VarD13 = j0.o.d(jVar7, false);
            j11 = j17;
            iHashCode4 = Long.hashCode(sVar3.T);
            q1 q1VarL23 = sVar3.l();
            r rVarC23 = z1.a.c(sVar3, rVarD9);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(iVar);
            } else {
                sVar3.r0();
            }
            y2.h hVar112 = y2.j.f56917f;
            t.J(hVar112, q0VarD13, sVar3);
            y2.h hVar113 = y2.j.f56916e;
            t.J(hVar113, q1VarL23, sVar3);
            hVar = y2.j.f56918g;
            jVar = jVar7;
            if (sVar3.S) {
                bVar2 = bVar;
                if (!m.a(sVar3.Q(), Integer.valueOf(iHashCode4))) {
                }
                y2.h hVar114 = y2.j.f56915d;
                t.J(hVar114, rVarC23, sVar3);
                r rVarV3 = d0.n.v(oVar2, d2Var, true, false);
                a2 a2VarA5 = z1.a(j0.i.f35303a, iVar12, sVar3, 0);
                iHashCode5 = Long.hashCode(sVar3.T);
                q1 q1VarL110 = sVar3.l();
                r rVarC110 = z1.a.c(sVar3, rVarV3);
                sVar3.h0();
                if (sVar3.S) {
                    sVar3.k(iVar);
                } else {
                    sVar3.r0();
                }
                t.J(hVar112, a2VarA5, sVar3);
                t.J(hVar113, q1VarL110, sVar3);
                if (sVar3.S) {
                    defpackage.e.A(iHashCode5, sVar3, iHashCode5, hVar);
                } else {
                    defpackage.e.A(iHashCode5, sVar3, iHashCode5, hVar);
                }
                t.J(hVar114, rVarC110, sVar3);
                sVar3.d0(-322558712);
                i23 = 1;
                while (i23 < i17) {
                    ms.c cVar18 = (ms.c) getColumnHeader.invoke(Integer.valueOf(i23));
                    float f1110 = aVar5.f41207a;
                    float f1111 = aVar5.f41210d;
                    num10 = (Integer) b1Var7.getValue();
                    if (num10 == null) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    boolean zD7 = sVar3.d(i23);
                    if ((i21 & 1879048192) == 536870912) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zD7 | z15;
                    objQ4 = sVar3.Q();
                    if (z16) {
                        gVar6 = gVar;
                        if (objQ4 == gVar6) {
                            oVar4 = oVar2;
                            gVar7 = gVar6;
                            b1Var9 = b1Var7;
                        }
                        ms.a aVar119 = aVar5;
                        s sVar110 = sVar3;
                        d(cVar18, f1110, f1111, z14, bVar2, aVar119, (fz.a) objQ4, true, sVar110, ((i21 << 9) & 458752) | 12582912, 0);
                        sVar3 = sVar110;
                        aVar5 = aVar119;
                        i23++;
                        b1Var7 = b1Var9;
                        f5 = f5;
                        jVar = jVar;
                        r0Var = r0Var;
                        oVar2 = oVar4;
                        gVar = gVar7;
                        j11 = j11;
                    } else {
                        gVar6 = gVar;
                    }
                    final int i313 = 0;
                    gVar7 = gVar6;
                    final b1 b1Var217 = b1Var7;
                    final b1 b1Var218 = b1Var6;
                    oVar4 = oVar2;
                    fz.a aVar23 = new fz.a() { // from class: ls.c
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i313) {
                                case 0:
                                    int i314 = i23;
                                    b1Var217.setValue(Integer.valueOf(i314));
                                    b1Var17.setValue(null);
                                    b1Var218.setValue(null);
                                    b1Var20.setValue(null);
                                    cVar2.invoke(Integer.valueOf(i314));
                                    break;
                                default:
                                    int i315 = i23;
                                    b1Var217.setValue(Integer.valueOf(i315));
                                    b1Var17.setValue(null);
                                    b1Var218.setValue(null);
                                    b1Var20.setValue(null);
                                    cVar2.invoke(Integer.valueOf(i315));
                                    break;
                            }
                            return b0.f48488a;
                        }
                    };
                    b1Var9 = b1Var217;
                    sVar3.o0(aVar23);
                    objQ4 = aVar23;
                    ms.a aVar1110 = aVar5;
                    s sVar111 = sVar3;
                    d(cVar18, f1110, f1111, z14, bVar2, aVar1110, (fz.a) objQ4, true, sVar111, ((i21 << 9) & 458752) | 12582912, 0);
                    sVar3 = sVar111;
                    aVar5 = aVar1110;
                    i23++;
                    b1Var7 = b1Var9;
                    f5 = f5;
                    jVar = jVar;
                    r0Var = r0Var;
                    oVar2 = oVar4;
                    gVar = gVar7;
                    j11 = j11;
                }
                cVar4 = getColumnHeader;
                float f1112 = f5;
                j12 = j11;
                b1Var8 = b1Var7;
                jVar2 = jVar;
                r0 r0Var7 = r0Var;
                gVar2 = gVar;
                com.google.android.material.datepicker.d.B(sVar3, false, true, true);
                r rVarD10 = z1.a.d(d0.n.h(j0.c.E(e2.c(e2.s(oVar2, f11), 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, aVar5.f41210d, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), j12, r0Var7), 1.0f);
                q0 q0VarD14 = j0.o.d(jVar2, false);
                r0Var2 = r0Var7;
                iHashCode6 = Long.hashCode(sVar3.T);
                q1 q1VarL111 = sVar3.l();
                r rVarC111 = z1.a.c(sVar3, rVarD10);
                y2.k.J.getClass();
                iVar2 = y2.j.f56913b;
                sVar3.h0();
                if (sVar3.S) {
                    sVar3.k(iVar2);
                } else {
                    sVar3.r0();
                }
                y2.h hVar115 = y2.j.f56917f;
                t.J(hVar115, q0VarD14, sVar3);
                y2.h hVar116 = y2.j.f56916e;
                t.J(hVar116, q1VarL111, sVar3);
                hVar2 = y2.j.f56918g;
                if (sVar3.S) {
                    jVar3 = jVar2;
                    if (!m.a(sVar3.Q(), Integer.valueOf(iHashCode6))) {
                    }
                    y2.h hVar117 = y2.j.f56915d;
                    t.J(hVar117, rVarC111, sVar3);
                    r rVarY7 = d0.n.y(oVar2, d2Var2, false, 14);
                    u uVarA7 = j0.t.a(j0.i.f35305c, hVar5, sVar3, 0);
                    iHashCode7 = Long.hashCode(sVar3.T);
                    q1 q1VarL112 = sVar3.l();
                    r rVarC112 = z1.a.c(sVar3, rVarY7);
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar2);
                    } else {
                        sVar3.r0();
                    }
                    t.J(hVar115, uVarA7, sVar3);
                    t.J(hVar116, q1VarL112, sVar3);
                    if (sVar3.S) {
                        defpackage.e.A(iHashCode7, sVar3, iHashCode7, hVar2);
                    } else {
                        defpackage.e.A(iHashCode7, sVar3, iHashCode7, hVar2);
                    }
                    t.J(hVar117, rVarC112, sVar3);
                    sVar3.d0(-708246647);
                    i24 = 1;
                    i18 = i11;
                    while (i24 < i18) {
                        ms.c cVar19 = (ms.c) getRowHeader.invoke(Integer.valueOf(i24));
                        float f1113 = aVar5.f41209c;
                        float f1114 = aVar5.f41208b;
                        num9 = (Integer) b1Var17.getValue();
                        if (num9 == null) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        boolean zD8 = sVar3.d(i24);
                        if ((i21 & 234881024) == 67108864) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z13 = zD8 | z12;
                        objQ3 = sVar3.Q();
                        if (z13) {
                            gVar4 = gVar2;
                            if (objQ3 == gVar4) {
                                oVar3 = oVar2;
                                gVar5 = gVar4;
                            }
                            ms.a aVar1111 = aVar5;
                            s sVar112 = sVar3;
                            d(cVar19, f1113, f1114, z11, bVar2, aVar1111, (fz.a) objQ3, true, sVar112, ((i21 << 9) & 458752) | 12582912, 0);
                            i24++;
                            sVar3 = sVar112;
                            jVar3 = jVar3;
                            r0Var2 = r0Var2;
                            oVar2 = oVar3;
                            gVar2 = gVar5;
                            j12 = j12;
                            aVar5 = aVar1111;
                        } else {
                            gVar4 = gVar2;
                        }
                        final int i314 = 1;
                        gVar5 = gVar4;
                        final b1 b1Var219 = b1Var6;
                        oVar3 = oVar2;
                        fz.a aVar1112 = new fz.a() { // from class: ls.c
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i314) {
                                    case 0:
                                        int i315 = i24;
                                        b1Var17.setValue(Integer.valueOf(i315));
                                        b1Var8.setValue(null);
                                        b1Var219.setValue(null);
                                        b1Var20.setValue(null);
                                        cVar.invoke(Integer.valueOf(i315));
                                        break;
                                    default:
                                        int i316 = i24;
                                        b1Var17.setValue(Integer.valueOf(i316));
                                        b1Var8.setValue(null);
                                        b1Var219.setValue(null);
                                        b1Var20.setValue(null);
                                        cVar.invoke(Integer.valueOf(i316));
                                        break;
                                }
                                return b0.f48488a;
                            }
                        };
                        sVar3.o0(aVar1112);
                        objQ3 = aVar1112;
                        ms.a aVar1113 = aVar5;
                        s sVar113 = sVar3;
                        d(cVar19, f1113, f1114, z11, bVar2, aVar1113, (fz.a) objQ3, true, sVar113, ((i21 << 9) & 458752) | 12582912, 0);
                        i24++;
                        sVar3 = sVar113;
                        jVar3 = jVar3;
                        r0Var2 = r0Var2;
                        oVar2 = oVar3;
                        gVar2 = gVar5;
                        j12 = j12;
                        aVar5 = aVar1113;
                    }
                    cVar3 = getRowHeader;
                    ms.a aVar1114 = aVar5;
                    sVar = sVar3;
                    gVar3 = gVar2;
                    com.google.android.material.datepicker.d.B(sVar, false, true, true);
                    r rVarD11 = z1.a.d(d0.n.h(e2.p(oVar2, f11, f1112), j12, r0Var2), 2.0f);
                    q0 q0VarD15 = j0.o.d(jVar3, false);
                    iHashCode8 = Long.hashCode(sVar.T);
                    q1 q1VarL113 = sVar.l();
                    r rVarC113 = z1.a.c(sVar, rVarD11);
                    y2.k.J.getClass();
                    iVar3 = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar3);
                    } else {
                        sVar.r0();
                    }
                    t.J(y2.j.f56917f, q0VarD15, sVar);
                    t.J(y2.j.f56916e, q1VarL113, sVar);
                    hVar3 = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode8, sVar, iHashCode8, hVar3);
                    } else {
                        defpackage.e.A(iHashCode8, sVar, iHashCode8, hVar3);
                    }
                    t.J(y2.j.f56915d, rVarC113, sVar);
                    ms.c cVar110 = (ms.c) aVar2.invoke();
                    float f29 = aVar1114.f41209c;
                    float f210 = aVar1114.f41210d;
                    objQ2 = sVar.Q();
                    if (objQ2 == gVar3) {
                        objQ2 = new ju.d(25);
                        sVar.o0(objQ2);
                    }
                    d(cVar110, f29, f210, false, bVar2, aVar1114, (fz.a) objQ2, true, sVar, ((i21 << 9) & 458752) | 14158848, 0);
                    sVar.p(true);
                    sVar.p(true);
                } else {
                    jVar3 = jVar2;
                }
                defpackage.e.A(iHashCode6, sVar3, iHashCode6, hVar2);
                y2.h hVar118 = y2.j.f56915d;
                t.J(hVar118, rVarC111, sVar3);
                r rVarY8 = d0.n.y(oVar2, d2Var2, false, 14);
                u uVarA8 = j0.t.a(j0.i.f35305c, hVar5, sVar3, 0);
                iHashCode7 = Long.hashCode(sVar3.T);
                q1 q1VarL114 = sVar3.l();
                r rVarC114 = z1.a.c(sVar3, rVarY8);
                sVar3.h0();
                if (sVar3.S) {
                    sVar3.k(iVar2);
                } else {
                    sVar3.r0();
                }
                t.J(hVar115, uVarA8, sVar3);
                t.J(hVar116, q1VarL114, sVar3);
                if (sVar3.S) {
                    defpackage.e.A(iHashCode7, sVar3, iHashCode7, hVar2);
                } else {
                    defpackage.e.A(iHashCode7, sVar3, iHashCode7, hVar2);
                }
                t.J(hVar118, rVarC114, sVar3);
                sVar3.d0(-708246647);
                i24 = 1;
                i18 = i11;
                while (i24 < i18) {
                    ms.c cVar111 = (ms.c) getRowHeader.invoke(Integer.valueOf(i24));
                    float f1115 = aVar5.f41209c;
                    float f1116 = aVar5.f41208b;
                    num9 = (Integer) b1Var17.getValue();
                    if (num9 == null) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    boolean zD9 = sVar3.d(i24);
                    if ((i21 & 234881024) == 67108864) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = zD9 | z12;
                    objQ3 = sVar3.Q();
                    if (z13) {
                        gVar4 = gVar2;
                        if (objQ3 == gVar4) {
                            oVar3 = oVar2;
                            gVar5 = gVar4;
                        }
                        ms.a aVar1115 = aVar5;
                        s sVar114 = sVar3;
                        d(cVar111, f1115, f1116, z11, bVar2, aVar1115, (fz.a) objQ3, true, sVar114, ((i21 << 9) & 458752) | 12582912, 0);
                        i24++;
                        sVar3 = sVar114;
                        jVar3 = jVar3;
                        r0Var2 = r0Var2;
                        oVar2 = oVar3;
                        gVar2 = gVar5;
                        j12 = j12;
                        aVar5 = aVar1115;
                    } else {
                        gVar4 = gVar2;
                    }
                    final int i315 = 1;
                    gVar5 = gVar4;
                    final b1 b1Var2110 = b1Var6;
                    oVar3 = oVar2;
                    fz.a aVar1116 = new fz.a() { // from class: ls.c
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i315) {
                                case 0:
                                    int i316 = i24;
                                    b1Var17.setValue(Integer.valueOf(i316));
                                    b1Var8.setValue(null);
                                    b1Var2110.setValue(null);
                                    b1Var20.setValue(null);
                                    cVar.invoke(Integer.valueOf(i316));
                                    break;
                                default:
                                    int i317 = i24;
                                    b1Var17.setValue(Integer.valueOf(i317));
                                    b1Var8.setValue(null);
                                    b1Var2110.setValue(null);
                                    b1Var20.setValue(null);
                                    cVar.invoke(Integer.valueOf(i317));
                                    break;
                            }
                            return b0.f48488a;
                        }
                    };
                    sVar3.o0(aVar1116);
                    objQ3 = aVar1116;
                    ms.a aVar1117 = aVar5;
                    s sVar115 = sVar3;
                    d(cVar111, f1115, f1116, z11, bVar2, aVar1117, (fz.a) objQ3, true, sVar115, ((i21 << 9) & 458752) | 12582912, 0);
                    i24++;
                    sVar3 = sVar115;
                    jVar3 = jVar3;
                    r0Var2 = r0Var2;
                    oVar2 = oVar3;
                    gVar2 = gVar5;
                    j12 = j12;
                    aVar5 = aVar1117;
                }
                cVar3 = getRowHeader;
                ms.a aVar1118 = aVar5;
                sVar = sVar3;
                gVar3 = gVar2;
                com.google.android.material.datepicker.d.B(sVar, false, true, true);
                r rVarD12 = z1.a.d(d0.n.h(e2.p(oVar2, f11, f1112), j12, r0Var2), 2.0f);
                q0 q0VarD16 = j0.o.d(jVar3, false);
                iHashCode8 = Long.hashCode(sVar.T);
                q1 q1VarL115 = sVar.l();
                r rVarC115 = z1.a.c(sVar, rVarD12);
                y2.k.J.getClass();
                iVar3 = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar3);
                } else {
                    sVar.r0();
                }
                t.J(y2.j.f56917f, q0VarD16, sVar);
                t.J(y2.j.f56916e, q1VarL115, sVar);
                hVar3 = y2.j.f56918g;
                if (sVar.S) {
                    defpackage.e.A(iHashCode8, sVar, iHashCode8, hVar3);
                } else {
                    defpackage.e.A(iHashCode8, sVar, iHashCode8, hVar3);
                }
                t.J(y2.j.f56915d, rVarC115, sVar);
                ms.c cVar112 = (ms.c) aVar2.invoke();
                float f211 = aVar1118.f41209c;
                float f212 = aVar1118.f41210d;
                objQ2 = sVar.Q();
                if (objQ2 == gVar3) {
                    objQ2 = new ju.d(25);
                    sVar.o0(objQ2);
                }
                d(cVar112, f211, f212, false, bVar2, aVar1118, (fz.a) objQ2, true, sVar, ((i21 << 9) & 458752) | 14158848, 0);
                sVar.p(true);
                sVar.p(true);
            } else {
                bVar2 = bVar;
            }
            defpackage.e.A(iHashCode4, sVar3, iHashCode4, hVar);
            y2.h hVar119 = y2.j.f56915d;
            t.J(hVar119, rVarC23, sVar3);
            r rVarV4 = d0.n.v(oVar2, d2Var, true, false);
            a2 a2VarA6 = z1.a(j0.i.f35303a, iVar12, sVar3, 0);
            iHashCode5 = Long.hashCode(sVar3.T);
            q1 q1VarL116 = sVar3.l();
            r rVarC116 = z1.a.c(sVar3, rVarV4);
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(iVar);
            } else {
                sVar3.r0();
            }
            t.J(hVar112, a2VarA6, sVar3);
            t.J(hVar113, q1VarL116, sVar3);
            if (sVar3.S) {
                defpackage.e.A(iHashCode5, sVar3, iHashCode5, hVar);
            } else {
                defpackage.e.A(iHashCode5, sVar3, iHashCode5, hVar);
            }
            t.J(hVar119, rVarC116, sVar3);
            sVar3.d0(-322558712);
            i23 = 1;
            while (i23 < i17) {
                ms.c cVar113 = (ms.c) getColumnHeader.invoke(Integer.valueOf(i23));
                float f1117 = aVar5.f41207a;
                float f1118 = aVar5.f41210d;
                num10 = (Integer) b1Var7.getValue();
                if (num10 == null) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                boolean zD10 = sVar3.d(i23);
                if ((i21 & 1879048192) == 536870912) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zD10 | z15;
                objQ4 = sVar3.Q();
                if (z16) {
                    gVar6 = gVar;
                    if (objQ4 == gVar6) {
                        oVar4 = oVar2;
                        gVar7 = gVar6;
                        b1Var9 = b1Var7;
                    }
                    ms.a aVar1119 = aVar5;
                    s sVar116 = sVar3;
                    d(cVar113, f1117, f1118, z14, bVar2, aVar1119, (fz.a) objQ4, true, sVar116, ((i21 << 9) & 458752) | 12582912, 0);
                    sVar3 = sVar116;
                    aVar5 = aVar1119;
                    i23++;
                    b1Var7 = b1Var9;
                    f5 = f5;
                    jVar = jVar;
                    r0Var = r0Var;
                    oVar2 = oVar4;
                    gVar = gVar7;
                    j11 = j11;
                } else {
                    gVar6 = gVar;
                }
                final int i316 = 0;
                gVar7 = gVar6;
                final b1 b1Var2111 = b1Var7;
                final b1 b1Var2112 = b1Var6;
                oVar4 = oVar2;
                fz.a aVar24 = new fz.a() { // from class: ls.c
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i316) {
                            case 0:
                                int i317 = i23;
                                b1Var2111.setValue(Integer.valueOf(i317));
                                b1Var17.setValue(null);
                                b1Var2112.setValue(null);
                                b1Var20.setValue(null);
                                cVar2.invoke(Integer.valueOf(i317));
                                break;
                            default:
                                int i318 = i23;
                                b1Var2111.setValue(Integer.valueOf(i318));
                                b1Var17.setValue(null);
                                b1Var2112.setValue(null);
                                b1Var20.setValue(null);
                                cVar2.invoke(Integer.valueOf(i318));
                                break;
                        }
                        return b0.f48488a;
                    }
                };
                b1Var9 = b1Var2111;
                sVar3.o0(aVar24);
                objQ4 = aVar24;
                ms.a aVar11110 = aVar5;
                s sVar117 = sVar3;
                d(cVar113, f1117, f1118, z14, bVar2, aVar11110, (fz.a) objQ4, true, sVar117, ((i21 << 9) & 458752) | 12582912, 0);
                sVar3 = sVar117;
                aVar5 = aVar11110;
                i23++;
                b1Var7 = b1Var9;
                f5 = f5;
                jVar = jVar;
                r0Var = r0Var;
                oVar2 = oVar4;
                gVar = gVar7;
                j11 = j11;
            }
            cVar4 = getColumnHeader;
            float f1119 = f5;
            j12 = j11;
            b1Var8 = b1Var7;
            jVar2 = jVar;
            r0 r0Var8 = r0Var;
            gVar2 = gVar;
            com.google.android.material.datepicker.d.B(sVar3, false, true, true);
            r rVarD13 = z1.a.d(d0.n.h(j0.c.E(e2.c(e2.s(oVar2, f11), 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, aVar5.f41210d, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), j12, r0Var8), 1.0f);
            q0 q0VarD17 = j0.o.d(jVar2, false);
            r0Var2 = r0Var8;
            iHashCode6 = Long.hashCode(sVar3.T);
            q1 q1VarL117 = sVar3.l();
            r rVarC117 = z1.a.c(sVar3, rVarD13);
            y2.k.J.getClass();
            iVar2 = y2.j.f56913b;
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(iVar2);
            } else {
                sVar3.r0();
            }
            y2.h hVar1110 = y2.j.f56917f;
            t.J(hVar1110, q0VarD17, sVar3);
            y2.h hVar1111 = y2.j.f56916e;
            t.J(hVar1111, q1VarL117, sVar3);
            hVar2 = y2.j.f56918g;
            if (sVar3.S) {
                jVar3 = jVar2;
                if (!m.a(sVar3.Q(), Integer.valueOf(iHashCode6))) {
                }
                y2.h hVar1112 = y2.j.f56915d;
                t.J(hVar1112, rVarC117, sVar3);
                r rVarY9 = d0.n.y(oVar2, d2Var2, false, 14);
                u uVarA9 = j0.t.a(j0.i.f35305c, hVar5, sVar3, 0);
                iHashCode7 = Long.hashCode(sVar3.T);
                q1 q1VarL118 = sVar3.l();
                r rVarC118 = z1.a.c(sVar3, rVarY9);
                sVar3.h0();
                if (sVar3.S) {
                    sVar3.k(iVar2);
                } else {
                    sVar3.r0();
                }
                t.J(hVar1110, uVarA9, sVar3);
                t.J(hVar1111, q1VarL118, sVar3);
                if (sVar3.S) {
                    defpackage.e.A(iHashCode7, sVar3, iHashCode7, hVar2);
                } else {
                    defpackage.e.A(iHashCode7, sVar3, iHashCode7, hVar2);
                }
                t.J(hVar1112, rVarC118, sVar3);
                sVar3.d0(-708246647);
                i24 = 1;
                i18 = i11;
                while (i24 < i18) {
                    ms.c cVar114 = (ms.c) getRowHeader.invoke(Integer.valueOf(i24));
                    float f11110 = aVar5.f41209c;
                    float f11111 = aVar5.f41208b;
                    num9 = (Integer) b1Var17.getValue();
                    if (num9 == null) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    boolean zD11 = sVar3.d(i24);
                    if ((i21 & 234881024) == 67108864) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = zD11 | z12;
                    objQ3 = sVar3.Q();
                    if (z13) {
                        gVar4 = gVar2;
                        if (objQ3 == gVar4) {
                            oVar3 = oVar2;
                            gVar5 = gVar4;
                        }
                        ms.a aVar11111 = aVar5;
                        s sVar118 = sVar3;
                        d(cVar114, f11110, f11111, z11, bVar2, aVar11111, (fz.a) objQ3, true, sVar118, ((i21 << 9) & 458752) | 12582912, 0);
                        i24++;
                        sVar3 = sVar118;
                        jVar3 = jVar3;
                        r0Var2 = r0Var2;
                        oVar2 = oVar3;
                        gVar2 = gVar5;
                        j12 = j12;
                        aVar5 = aVar11111;
                    } else {
                        gVar4 = gVar2;
                    }
                    final int i317 = 1;
                    gVar5 = gVar4;
                    final b1 b1Var2113 = b1Var6;
                    oVar3 = oVar2;
                    fz.a aVar11112 = new fz.a() { // from class: ls.c
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i317) {
                                case 0:
                                    int i318 = i24;
                                    b1Var17.setValue(Integer.valueOf(i318));
                                    b1Var8.setValue(null);
                                    b1Var2113.setValue(null);
                                    b1Var20.setValue(null);
                                    cVar.invoke(Integer.valueOf(i318));
                                    break;
                                default:
                                    int i319 = i24;
                                    b1Var17.setValue(Integer.valueOf(i319));
                                    b1Var8.setValue(null);
                                    b1Var2113.setValue(null);
                                    b1Var20.setValue(null);
                                    cVar.invoke(Integer.valueOf(i319));
                                    break;
                            }
                            return b0.f48488a;
                        }
                    };
                    sVar3.o0(aVar11112);
                    objQ3 = aVar11112;
                    ms.a aVar11113 = aVar5;
                    s sVar119 = sVar3;
                    d(cVar114, f11110, f11111, z11, bVar2, aVar11113, (fz.a) objQ3, true, sVar119, ((i21 << 9) & 458752) | 12582912, 0);
                    i24++;
                    sVar3 = sVar119;
                    jVar3 = jVar3;
                    r0Var2 = r0Var2;
                    oVar2 = oVar3;
                    gVar2 = gVar5;
                    j12 = j12;
                    aVar5 = aVar11113;
                }
                cVar3 = getRowHeader;
                ms.a aVar11114 = aVar5;
                sVar = sVar3;
                gVar3 = gVar2;
                com.google.android.material.datepicker.d.B(sVar, false, true, true);
                r rVarD14 = z1.a.d(d0.n.h(e2.p(oVar2, f11, f1119), j12, r0Var2), 2.0f);
                q0 q0VarD18 = j0.o.d(jVar3, false);
                iHashCode8 = Long.hashCode(sVar.T);
                q1 q1VarL119 = sVar.l();
                r rVarC119 = z1.a.c(sVar, rVarD14);
                y2.k.J.getClass();
                iVar3 = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar3);
                } else {
                    sVar.r0();
                }
                t.J(y2.j.f56917f, q0VarD18, sVar);
                t.J(y2.j.f56916e, q1VarL119, sVar);
                hVar3 = y2.j.f56918g;
                if (sVar.S) {
                    defpackage.e.A(iHashCode8, sVar, iHashCode8, hVar3);
                } else {
                    defpackage.e.A(iHashCode8, sVar, iHashCode8, hVar3);
                }
                t.J(y2.j.f56915d, rVarC119, sVar);
                ms.c cVar115 = (ms.c) aVar2.invoke();
                float f213 = aVar11114.f41209c;
                float f214 = aVar11114.f41210d;
                objQ2 = sVar.Q();
                if (objQ2 == gVar3) {
                    objQ2 = new ju.d(25);
                    sVar.o0(objQ2);
                }
                d(cVar115, f213, f214, false, bVar2, aVar11114, (fz.a) objQ2, true, sVar, ((i21 << 9) & 458752) | 14158848, 0);
                sVar.p(true);
                sVar.p(true);
            } else {
                jVar3 = jVar2;
            }
            defpackage.e.A(iHashCode6, sVar3, iHashCode6, hVar2);
            y2.h hVar1113 = y2.j.f56915d;
            t.J(hVar1113, rVarC117, sVar3);
            r rVarY10 = d0.n.y(oVar2, d2Var2, false, 14);
            u uVarA10 = j0.t.a(j0.i.f35305c, hVar5, sVar3, 0);
            iHashCode7 = Long.hashCode(sVar3.T);
            q1 q1VarL1110 = sVar3.l();
            r rVarC1110 = z1.a.c(sVar3, rVarY10);
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(iVar2);
            } else {
                sVar3.r0();
            }
            t.J(hVar1110, uVarA10, sVar3);
            t.J(hVar1111, q1VarL1110, sVar3);
            if (sVar3.S) {
                defpackage.e.A(iHashCode7, sVar3, iHashCode7, hVar2);
            } else {
                defpackage.e.A(iHashCode7, sVar3, iHashCode7, hVar2);
            }
            t.J(hVar1113, rVarC1110, sVar3);
            sVar3.d0(-708246647);
            i24 = 1;
            i18 = i11;
            while (i24 < i18) {
                ms.c cVar116 = (ms.c) getRowHeader.invoke(Integer.valueOf(i24));
                float f11112 = aVar5.f41209c;
                float f11113 = aVar5.f41208b;
                num9 = (Integer) b1Var17.getValue();
                if (num9 == null) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                boolean zD12 = sVar3.d(i24);
                if ((i21 & 234881024) == 67108864) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = zD12 | z12;
                objQ3 = sVar3.Q();
                if (z13) {
                    gVar4 = gVar2;
                    if (objQ3 == gVar4) {
                        oVar3 = oVar2;
                        gVar5 = gVar4;
                    }
                    ms.a aVar11115 = aVar5;
                    s sVar1110 = sVar3;
                    d(cVar116, f11112, f11113, z11, bVar2, aVar11115, (fz.a) objQ3, true, sVar1110, ((i21 << 9) & 458752) | 12582912, 0);
                    i24++;
                    sVar3 = sVar1110;
                    jVar3 = jVar3;
                    r0Var2 = r0Var2;
                    oVar2 = oVar3;
                    gVar2 = gVar5;
                    j12 = j12;
                    aVar5 = aVar11115;
                } else {
                    gVar4 = gVar2;
                }
                final int i318 = 1;
                gVar5 = gVar4;
                final b1 b1Var2114 = b1Var6;
                oVar3 = oVar2;
                fz.a aVar11116 = new fz.a() { // from class: ls.c
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i318) {
                            case 0:
                                int i319 = i24;
                                b1Var17.setValue(Integer.valueOf(i319));
                                b1Var8.setValue(null);
                                b1Var2114.setValue(null);
                                b1Var20.setValue(null);
                                cVar.invoke(Integer.valueOf(i319));
                                break;
                            default:
                                int i3110 = i24;
                                b1Var17.setValue(Integer.valueOf(i3110));
                                b1Var8.setValue(null);
                                b1Var2114.setValue(null);
                                b1Var20.setValue(null);
                                cVar.invoke(Integer.valueOf(i3110));
                                break;
                        }
                        return b0.f48488a;
                    }
                };
                sVar3.o0(aVar11116);
                objQ3 = aVar11116;
                ms.a aVar11117 = aVar5;
                s sVar1111 = sVar3;
                d(cVar116, f11112, f11113, z11, bVar2, aVar11117, (fz.a) objQ3, true, sVar1111, ((i21 << 9) & 458752) | 12582912, 0);
                i24++;
                sVar3 = sVar1111;
                jVar3 = jVar3;
                r0Var2 = r0Var2;
                oVar2 = oVar3;
                gVar2 = gVar5;
                j12 = j12;
                aVar5 = aVar11117;
            }
            cVar3 = getRowHeader;
            ms.a aVar11118 = aVar5;
            sVar = sVar3;
            gVar3 = gVar2;
            com.google.android.material.datepicker.d.B(sVar, false, true, true);
            r rVarD15 = z1.a.d(d0.n.h(e2.p(oVar2, f11, f1119), j12, r0Var2), 2.0f);
            q0 q0VarD19 = j0.o.d(jVar3, false);
            iHashCode8 = Long.hashCode(sVar.T);
            q1 q1VarL1111 = sVar.l();
            r rVarC1111 = z1.a.c(sVar, rVarD15);
            y2.k.J.getClass();
            iVar3 = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar3);
            } else {
                sVar.r0();
            }
            t.J(y2.j.f56917f, q0VarD19, sVar);
            t.J(y2.j.f56916e, q1VarL1111, sVar);
            hVar3 = y2.j.f56918g;
            if (sVar.S) {
                defpackage.e.A(iHashCode8, sVar, iHashCode8, hVar3);
            } else {
                defpackage.e.A(iHashCode8, sVar, iHashCode8, hVar3);
            }
            t.J(y2.j.f56915d, rVarC1111, sVar);
            ms.c cVar117 = (ms.c) aVar2.invoke();
            float f215 = aVar11118.f41209c;
            float f216 = aVar11118.f41210d;
            objQ2 = sVar.Q();
            if (objQ2 == gVar3) {
                objQ2 = new ju.d(25);
                sVar.o0(objQ2);
            }
            d(cVar117, f215, f216, false, bVar2, aVar11118, (fz.a) objQ2, true, sVar, ((i21 << 9) & 458752) | 14158848, 0);
            sVar.p(true);
            sVar.p(true);
        } else {
            i17 = i12;
            sVar = sVar4;
            cVar3 = getRowHeader;
            cVar4 = getColumnHeader;
            i18 = i11;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            final fz.c cVar20 = cVar4;
            final int i40 = i17;
            final int i41 = i18;
            final fz.c cVar21 = cVar3;
            x1VarT.f39502d = new fz.e() { // from class: ls.a
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = t.M(i13 | 1);
                    int iM2 = t.M(i14);
                    f.a(i41, i40, aVar, getItem, cVar21, cVar20, aVar2, fVar, cVar, cVar2, aVar3, num, num2, num3, num4, rVar, (n) obj, iM, iM2);
                    return b0.f48488a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x02d7  */
    public static final void b(final boolean z11, final List items, final Object obj, final fz.c getCharacter, final fz.c getRomanization, final fz.c getZhuyin, final fz.c onPlayAudio, final fz.c cVar, final List list, long j11, long j12, long j13, final fz.a aVar, n nVar, final int i11) {
        int i12;
        s sVar;
        final long j14;
        final long j15;
        final long j16;
        long j17;
        long j18;
        int i13;
        final long j19;
        final b1 b1Var;
        final PermissionState permissionState;
        Context context;
        boolean z12;
        List list2;
        final long j21;
        final long j22;
        m.f(items, "items");
        m.f(getCharacter, "getCharacter");
        m.f(getRomanization, "getRomanization");
        m.f(getZhuyin, "getZhuyin");
        m.f(onPlayAudio, "onPlayAudio");
        s sVar2 = (s) nVar;
        sVar2.f0(950989410);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar2.g(z11) ? 4 : 2);
        } else {
            i12 = i11;
        }
        int i14 = i12 | (sVar2.h(items) ? 32 : 16) | (sVar2.f(obj) ? 256 : 128) | (sVar2.h(onPlayAudio) ? 1048576 : 524288) | (sVar2.h(cVar) ? 8388608 : 4194304) | (sVar2.h(list) ? 67108864 : 33554432) | (sVar2.d(R.drawable.ic_pinyin_arrow) ? 536870912 : 268435456);
        int i15 = (sVar2.d(R.drawable.recorder_animate_01) ? 4 : 2) | (sVar2.d(R.drawable.recorder_animate_15) ? 32 : 16) | 25728 | (sVar2.h(aVar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536);
        if (sVar2.T(i14 & 1, ((306783379 & i14) == 306783378 && (74899 & i15) == 74898) ? false : true)) {
            sVar2.Y();
            if ((i11 & 1) == 0 || sVar2.C()) {
                c3 c3Var = v1.f31180a;
                j17 = ((s1) sVar2.j(c3Var)).f31034q;
                j18 = ((s1) sVar2.j(c3Var)).f31017a;
                i13 = i15 & (-8065);
                j19 = x.f28616c;
            } else {
                sVar2.W();
                i13 = i15 & (-8065);
                j17 = j11;
                j18 = j12;
                j19 = j13;
            }
            int i16 = i13;
            sVar2.q();
            Context context2 = (Context) sVar2.j(AndroidCompositionLocals_androidKt.f1200b);
            boolean z13 = (i14 & 896) == 256;
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (z13 || objQ == gVar) {
                int iIndexOf = items.indexOf(obj);
                Integer numValueOf = Integer.valueOf(iIndexOf);
                if (iIndexOf < 0) {
                    numValueOf = null;
                }
                objQ = defpackage.e.v(numValueOf != null ? numValueOf.intValue() : 0, sVar2);
            }
            final a1 a1Var = (a1) objQ;
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = t.B(Boolean.FALSE);
                sVar2.o0(objQ2);
            }
            final b1 b1Var2 = (b1) objQ2;
            Object objQ3 = sVar2.Q();
            if (objQ3 == gVar) {
                objQ3 = t.B(Boolean.FALSE);
                sVar2.o0(objQ3);
            }
            b1 b1Var3 = (b1) objQ3;
            PermissionState permissionStateA = PermissionStateKt.a(sVar2);
            long j23 = j18;
            boolean zF = sVar2.f(permissionStateA.getStatus());
            Object objQ4 = sVar2.Q();
            if (zF || objQ4 == gVar) {
                objQ4 = t.B(Boolean.valueOf(PermissionsUtilKt.b(permissionStateA.getStatus())));
                sVar2.o0(objQ4);
            }
            final b1 b1Var4 = (b1) objQ4;
            Object objQ5 = sVar2.Q();
            if (objQ5 == gVar) {
                objQ5 = t.B(null);
                sVar2.o0(objQ5);
            }
            b1 b1Var5 = (b1) objQ5;
            Object objQ6 = sVar2.Q();
            if (objQ6 == gVar) {
                objQ6 = t.B(null);
                sVar2.o0(objQ6);
            }
            final b1 b1Var6 = (b1) objQ6;
            boolean zH = sVar2.h(context2);
            Object objQ7 = sVar2.Q();
            if (zH || objQ7 == gVar) {
                b1Var = b1Var3;
                objQ7 = new b1.a(context2, b1Var2, b1Var5, b1Var, b1Var6, 14);
                sVar2.o0(objQ7);
            } else {
                b1Var = b1Var3;
            }
            t.c(context2, (fz.c) objQ7, sVar2);
            PermissionStatus status = permissionStateA.getStatus();
            boolean zF2 = sVar2.f(permissionStateA) | sVar2.f(b1Var4) | sVar2.h(context2);
            Object objQ8 = sVar2.Q();
            if (zF2 || objQ8 == gVar) {
                objQ8 = new k9.t(permissionStateA, b1Var4, context2, b1Var5, b1Var6, b1Var, null, 2);
                permissionState = permissionStateA;
                context = context2;
                b1Var5 = b1Var5;
                z12 = false;
                sVar2.o0(objQ8);
            } else {
                context = context2;
                permissionState = permissionStateA;
                z12 = false;
            }
            t.f((fz.e) objQ8, status, sVar2);
            boolean zH2 = sVar2.h(list) | sVar2.h(items) | sVar2.f(a1Var) | ((29360128 & i14) != 8388608 ? z12 : true);
            Object objQ9 = sVar2.Q();
            if (zH2 || objQ9 == gVar) {
                list2 = items;
                k kVar = new k(list, list2, cVar, getZhuyin, a1Var, b1Var2, b1Var5, null);
                sVar2.o0(kVar);
                objQ9 = kVar;
            } else {
                list2 = items;
            }
            t.f((fz.e) objQ9, list, sVar2);
            if (z11) {
                int size = list2.size();
                h1 h1Var = (h1) a1Var;
                int iL = h1Var.l();
                if (iL < 0 || iL >= size) {
                    sVar = sVar2;
                    j21 = j17;
                    j22 = j23;
                    sVar.d0(1318814368);
                } else {
                    sVar2.d0(1326130399);
                    final Object obj2 = list2.get(h1Var.l());
                    j21 = j17;
                    final Context context3 = context;
                    final b1 b1Var7 = b1Var5;
                    final List list3 = list2;
                    sVar = sVar2;
                    j22 = j23;
                    androidx.compose.ui.window.a.a(aVar, null, t1.e.d(596607764, new fz.e() { // from class: ls.g
                        @Override // fz.e
                        public final Object invoke(Object obj3, Object obj4) {
                            n nVar2 = (n) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            s sVar3 = (s) nVar2;
                            if (sVar3.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                                r rVarG = e2.g(e2.s(o.f58481a, LogSeverity.NOTICE_VALUE), 230);
                                fz.c cVar2 = onPlayAudio;
                                boolean zF3 = sVar3.f(cVar2);
                                final Object obj5 = obj2;
                                boolean zH3 = zF3 | sVar3.h(obj5);
                                Object objQ10 = sVar3.Q();
                                if (zH3 || objQ10 == l1.m.f39353a) {
                                    objQ10 = new l1.z1(2, cVar2, obj5);
                                    sVar3.o0(objQ10);
                                }
                                r rVarO = d0.n.o(rVarG, false, null, (fz.a) objQ10, 15);
                                float f5 = 8;
                                r0.e eVarD = r0.f.d(f5);
                                t0 t0VarP = k7.p(x.f28618e, sVar3, 6);
                                u0 u0VarQ = k7.q(62, f5);
                                final fz.c cVar3 = getCharacter;
                                final long j24 = j21;
                                final fz.c cVar4 = getRomanization;
                                final b1 b1Var8 = b1Var2;
                                final a1 a1Var2 = a1Var;
                                final List list4 = list3;
                                final fz.c cVar5 = cVar;
                                final long j25 = j22;
                                final b1 b1Var9 = b1Var4;
                                final Context context4 = context3;
                                final PermissionState permissionState2 = permissionState;
                                final b1 b1Var10 = b1Var7;
                                final b1 b1Var11 = b1Var6;
                                final long j26 = j19;
                                final b1 b1Var12 = b1Var;
                                k7.d(rVarO, eVarD, t0VarP, u0VarQ, null, t1.e.d(-162575738, new fz.f() { // from class: ls.i
                                    @Override // fz.f
                                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                        y2.h hVar;
                                        Object obj9;
                                        final a1 a1Var3;
                                        b1 b1Var13;
                                        b1 b1Var14;
                                        b1 b1Var15;
                                        final a1 a1Var4;
                                        v Card = (v) obj6;
                                        n nVar3 = (n) obj7;
                                        int iIntValue2 = ((Integer) obj8).intValue();
                                        m.f(Card, "$this$Card");
                                        s sVar4 = (s) nVar3;
                                        if (sVar4.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            o oVar = o.f58481a;
                                            r rVarG2 = e2.g(e2.e(oVar, 1.0f), 230);
                                            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                                            int iHashCode = Long.hashCode(sVar4.T);
                                            q1 q1VarL = sVar4.l();
                                            r rVarC = z1.a.c(sVar4, rVarG2);
                                            y2.k.J.getClass();
                                            y2.i iVar = y2.j.f56913b;
                                            sVar4.h0();
                                            if (sVar4.S) {
                                                sVar4.k(iVar);
                                            } else {
                                                sVar4.r0();
                                            }
                                            y2.h hVar2 = y2.j.f56917f;
                                            t.J(hVar2, q0VarD, sVar4);
                                            y2.h hVar3 = y2.j.f56916e;
                                            t.J(hVar3, q1VarL, sVar4);
                                            y2.h hVar4 = y2.j.f56918g;
                                            if (sVar4.S || !m.a(sVar4.Q(), Integer.valueOf(iHashCode))) {
                                                defpackage.e.A(iHashCode, sVar4, iHashCode, hVar4);
                                            }
                                            y2.h hVar5 = y2.j.f56915d;
                                            t.J(hVar5, rVarC, sVar4);
                                            r rVarE = j0.c.E(e2.e(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 20, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                                            u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar4, 48);
                                            int iHashCode2 = Long.hashCode(sVar4.T);
                                            q1 q1VarL2 = sVar4.l();
                                            r rVarC2 = z1.a.c(sVar4, rVarE);
                                            sVar4.h0();
                                            if (sVar4.S) {
                                                sVar4.k(iVar);
                                            } else {
                                                sVar4.r0();
                                            }
                                            t.J(hVar2, uVarA, sVar4);
                                            t.J(hVar3, q1VarL2, sVar4);
                                            if (sVar4.S || !m.a(sVar4.Q(), Integer.valueOf(iHashCode2))) {
                                                defpackage.e.A(iHashCode2, sVar4, iHashCode2, hVar4);
                                            }
                                            t.J(hVar5, rVarC2, sVar4);
                                            fz.c cVar6 = cVar3;
                                            Object obj10 = obj5;
                                            String str = (String) cVar6.invoke(obj10);
                                            long jA = j3.A(35);
                                            n3.s sVar5 = n3.s.f43178t;
                                            r rVarE2 = e2.e(oVar, 1.0f);
                                            u3.k kVar2 = new u3.k(3);
                                            long j27 = j24;
                                            ua.b(str, rVarE2, j27, jA, null, sVar5, null, 0L, kVar2, 0L, 0, false, 0, 0, null, sVar4, 199728, 0, 130512);
                                            s sVar6 = sVar4;
                                            String str2 = (String) cVar4.invoke(obj10);
                                            if (str2 == null) {
                                                sVar6.d0(895773360);
                                            } else {
                                                sVar6.d0(895773361);
                                                ua.b(str2, j0.c.E(e2.e(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 4, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), j27, j3.A(18), null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar6, 3120, 0, 130544);
                                                sVar6 = sVar6;
                                            }
                                            sVar6.p(false);
                                            s sVar7 = sVar6;
                                            j0.c(((Boolean) b1Var8.getValue()).booleanValue(), null, f1.e(null, 3), f1.f(null, 3), null, f.f40269a, sVar7, 1600518, 18);
                                            sVar7.p(true);
                                            r rVarE3 = j0.c.E(j0.r.f35391a.a(e2.e(oVar, 1.0f), z1.c.H), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 50, 7);
                                            a2 a2VarA = z1.a(j0.i.f35308f, z1.c.M, sVar7, 54);
                                            int iHashCode3 = Long.hashCode(sVar7.T);
                                            q1 q1VarL3 = sVar7.l();
                                            r rVarC3 = z1.a.c(sVar7, rVarE3);
                                            sVar7.h0();
                                            if (sVar7.S) {
                                                sVar7.k(iVar);
                                            } else {
                                                sVar7.r0();
                                            }
                                            t.J(hVar2, a2VarA, sVar7);
                                            t.J(hVar3, q1VarL3, sVar7);
                                            if (sVar7.S || !m.a(sVar7.Q(), Integer.valueOf(iHashCode3))) {
                                                hVar = hVar4;
                                                defpackage.e.A(iHashCode3, sVar7, iHashCode3, hVar);
                                            } else {
                                                hVar = hVar4;
                                            }
                                            t.J(hVar5, rVarC3, sVar7);
                                            a1 a1Var5 = a1Var2;
                                            h1 h1Var2 = (h1) a1Var5;
                                            boolean z14 = h1Var2.l() > 0;
                                            float f11 = 10;
                                            float f12 = 48;
                                            r rVarN = e2.n(j0.c.E(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), f12);
                                            boolean zF4 = sVar7.f(a1Var5);
                                            final List list5 = list4;
                                            boolean zH4 = zF4 | sVar7.h(list5);
                                            final fz.c cVar7 = cVar5;
                                            boolean zF5 = zH4 | sVar7.f(cVar7);
                                            Object objQ11 = sVar7.Q();
                                            final b1 b1Var16 = b1Var10;
                                            final b1 b1Var17 = b1Var11;
                                            l1.g gVar2 = l1.m.f39353a;
                                            if (zF5 || objQ11 == gVar2) {
                                                final int i17 = 0;
                                                a1Var3 = a1Var5;
                                                obj9 = new fz.a() { // from class: ls.j
                                                    @Override // fz.a
                                                    public final Object invoke() {
                                                        fz.c cVar8;
                                                        av.b bVar;
                                                        fz.c cVar9;
                                                        av.b bVar2;
                                                        switch (i17) {
                                                            case 0:
                                                                h1 h1Var3 = (h1) a1Var3;
                                                                if (h1Var3.l() > 0) {
                                                                    av.n nVar4 = (av.n) b1Var16.getValue();
                                                                    if (nVar4 != null) {
                                                                        nVar4.n();
                                                                    }
                                                                    b1 b1Var18 = b1Var17;
                                                                    av.b bVar3 = (av.b) b1Var18.getValue();
                                                                    if (bVar3 != null && bVar3.f3111d && (bVar = (av.b) b1Var18.getValue()) != null) {
                                                                        bVar.b();
                                                                    }
                                                                    h1Var3.m(h1Var3.l() - 1);
                                                                    List list6 = list5;
                                                                    int size2 = list6.size();
                                                                    int iL2 = h1Var3.l();
                                                                    if (iL2 >= 0 && iL2 < size2 && (cVar8 = cVar7) != null) {
                                                                        cVar8.invoke(list6.get(h1Var3.l()));
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                h1 h1Var4 = (h1) a1Var3;
                                                                int iL3 = h1Var4.l();
                                                                List list7 = list5;
                                                                if (iL3 < list7.size() - 1) {
                                                                    av.n nVar5 = (av.n) b1Var16.getValue();
                                                                    if (nVar5 != null) {
                                                                        nVar5.n();
                                                                    }
                                                                    b1 b1Var19 = b1Var17;
                                                                    av.b bVar4 = (av.b) b1Var19.getValue();
                                                                    if (bVar4 != null && bVar4.f3111d && (bVar2 = (av.b) b1Var19.getValue()) != null) {
                                                                        bVar2.b();
                                                                    }
                                                                    h1Var4.m(h1Var4.l() + 1);
                                                                    int size3 = list7.size();
                                                                    int iL4 = h1Var4.l();
                                                                    if (iL4 >= 0 && iL4 < size3 && (cVar9 = cVar7) != null) {
                                                                        cVar9.invoke(list7.get(h1Var4.l()));
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                        return b0.f48488a;
                                                    }
                                                };
                                                b1Var13 = b1Var16;
                                                b1Var14 = b1Var17;
                                                sVar7.o0(obj9);
                                            } else {
                                                b1Var14 = b1Var17;
                                                obj9 = objQ11;
                                                b1Var13 = b1Var16;
                                                a1Var3 = a1Var5;
                                            }
                                            long j28 = j25;
                                            y2.h hVar6 = hVar;
                                            long j29 = j26;
                                            a1 a1Var6 = a1Var3;
                                            k7.h((fz.a) obj9, rVarN, z14, null, t1.e.d(-254334195, new i0(j28, j29, a1Var6), sVar7), sVar7, 196656, 24);
                                            float f13 = 70;
                                            r rVarH = d0.n.h(d2.h.b(e2.n(oVar, f13), r0.f.f48733a), j28, f0.f28556b);
                                            b1 b1Var18 = b1Var9;
                                            boolean zF6 = sVar7.f(b1Var18);
                                            Context context5 = context4;
                                            boolean zH5 = zF6 | sVar7.h(context5);
                                            PermissionState permissionState3 = permissionState2;
                                            boolean zF7 = zH5 | sVar7.f(permissionState3);
                                            Object objQ12 = sVar7.Q();
                                            b1 b1Var19 = b1Var12;
                                            if (zF7 || objQ12 == gVar2) {
                                                b1Var15 = b1Var19;
                                                objQ12 = new c2(permissionState3, b1Var13, b1Var14, b1Var18, context5, b1Var15, 3);
                                                sVar7.o0(objQ12);
                                            } else {
                                                b1Var15 = b1Var19;
                                            }
                                            r rVarO2 = d0.n.o(rVarH, false, null, (fz.a) objQ12, 15);
                                            q0 q0VarD2 = j0.o.d(z1.c.f58467e, false);
                                            int iHashCode4 = Long.hashCode(sVar7.T);
                                            q1 q1VarL4 = sVar7.l();
                                            r rVarC4 = z1.a.c(sVar7, rVarO2);
                                            sVar7.h0();
                                            if (sVar7.S) {
                                                sVar7.k(iVar);
                                            } else {
                                                sVar7.r0();
                                            }
                                            t.J(hVar2, q0VarD2, sVar7);
                                            t.J(hVar3, q1VarL4, sVar7);
                                            if (sVar7.S || !m.a(sVar7.Q(), Integer.valueOf(iHashCode4))) {
                                                defpackage.e.A(iHashCode4, sVar7, iHashCode4, hVar6);
                                            }
                                            t.J(hVar5, rVarC4, sVar7);
                                            r4.b(se.k.y(((Boolean) b1Var15.getValue()).booleanValue() ? R.drawable.recorder_animate_15 : R.drawable.recorder_animate_01, sVar7, 0), "Record", e2.n(oVar, f13), x.f28622i, sVar7, 3504, 0);
                                            sVar7.p(true);
                                            boolean z15 = h1Var2.l() < list5.size() - 1;
                                            r rVarN2 = e2.n(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, 11), f12);
                                            boolean zF8 = sVar7.f(a1Var6) | sVar7.h(list5) | sVar7.f(cVar7);
                                            Object objQ13 = sVar7.Q();
                                            if (zF8 || objQ13 == gVar2) {
                                                final int i18 = 1;
                                                a1Var4 = a1Var6;
                                                final b1 b1Var20 = b1Var13;
                                                final b1 b1Var21 = b1Var14;
                                                fz.a aVar2 = new fz.a() { // from class: ls.j
                                                    @Override // fz.a
                                                    public final Object invoke() {
                                                        fz.c cVar8;
                                                        av.b bVar;
                                                        fz.c cVar9;
                                                        av.b bVar2;
                                                        switch (i18) {
                                                            case 0:
                                                                h1 h1Var3 = (h1) a1Var4;
                                                                if (h1Var3.l() > 0) {
                                                                    av.n nVar4 = (av.n) b1Var20.getValue();
                                                                    if (nVar4 != null) {
                                                                        nVar4.n();
                                                                    }
                                                                    b1 b1Var110 = b1Var21;
                                                                    av.b bVar3 = (av.b) b1Var110.getValue();
                                                                    if (bVar3 != null && bVar3.f3111d && (bVar = (av.b) b1Var110.getValue()) != null) {
                                                                        bVar.b();
                                                                    }
                                                                    h1Var3.m(h1Var3.l() - 1);
                                                                    List list6 = list5;
                                                                    int size2 = list6.size();
                                                                    int iL2 = h1Var3.l();
                                                                    if (iL2 >= 0 && iL2 < size2 && (cVar8 = cVar7) != null) {
                                                                        cVar8.invoke(list6.get(h1Var3.l()));
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                h1 h1Var4 = (h1) a1Var4;
                                                                int iL3 = h1Var4.l();
                                                                List list7 = list5;
                                                                if (iL3 < list7.size() - 1) {
                                                                    av.n nVar5 = (av.n) b1Var20.getValue();
                                                                    if (nVar5 != null) {
                                                                        nVar5.n();
                                                                    }
                                                                    b1 b1Var111 = b1Var21;
                                                                    av.b bVar4 = (av.b) b1Var111.getValue();
                                                                    if (bVar4 != null && bVar4.f3111d && (bVar2 = (av.b) b1Var111.getValue()) != null) {
                                                                        bVar2.b();
                                                                    }
                                                                    h1Var4.m(h1Var4.l() + 1);
                                                                    int size3 = list7.size();
                                                                    int iL4 = h1Var4.l();
                                                                    if (iL4 >= 0 && iL4 < size3 && (cVar9 = cVar7) != null) {
                                                                        cVar9.invoke(list7.get(h1Var4.l()));
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                        return b0.f48488a;
                                                    }
                                                };
                                                sVar7.o0(aVar2);
                                                objQ13 = aVar2;
                                            } else {
                                                a1Var4 = a1Var6;
                                            }
                                            k7.h((fz.a) objQ13, rVarN2, z15, null, t1.e.d(-493899196, new gr.e(list5, j28, j29, a1Var4), sVar7), sVar7, 196656, 24);
                                            sVar7.p(true);
                                            sVar7.p(true);
                                        } else {
                                            sVar4.W();
                                        }
                                        return b0.f48488a;
                                    }
                                }, sVar3), sVar3, 196608, 16);
                            } else {
                                sVar3.W();
                            }
                            return b0.f48488a;
                        }
                    }, sVar), sVar, ((i16 >> 15) & 14) | 384, 2);
                }
            } else {
                sVar = sVar2;
                j21 = j17;
                j22 = j23;
                sVar.d0(1318814368);
            }
            sVar.p(z12);
            j14 = j21;
            j15 = j22;
            j16 = j19;
        } else {
            sVar = sVar2;
            sVar.W();
            j14 = j11;
            j15 = j12;
            j16 = j13;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: ls.h
                @Override // fz.e
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iM = t.M(i11 | 1);
                    f.b(z11, items, obj, getCharacter, getRomanization, getZhuyin, onPlayAudio, cVar, list, j14, j15, j16, aVar, (n) obj3, iM);
                    return b0.f48488a;
                }
            };
        }
    }

    public static final void c(Context context, b1 b1Var, b1 b1Var2, b1 b1Var3) {
        av.n nVar = (av.n) b1Var.getValue();
        if (nVar != null) {
            nVar.n();
        }
        av.b bVar = (av.b) b1Var2.getValue();
        if (bVar != null && bVar.f3111d) {
            av.b bVar2 = (av.b) b1Var2.getValue();
            if (bVar2 != null) {
                bVar2.b();
            }
            b1Var3.setValue(Boolean.FALSE);
            return;
        }
        try {
            File file = new File(context.getCacheDir(), "recordings");
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, "recording_" + System.currentTimeMillis() + ".m4a");
            av.b bVar3 = (av.b) b1Var2.getValue();
            if (bVar3 != null) {
                bVar3.a(file2.getAbsolutePath());
            }
            b1Var3.setValue(Boolean.TRUE);
        } catch (Exception e8) {
            e8.printStackTrace();
            Toast.makeText(context, "录音启动失败：" + e8.getMessage(), 0).show();
            b1Var3.setValue(Boolean.FALSE);
        }
    }

    public static final void d(final ms.c cVar, final float f5, final float f11, final boolean z11, final ms.b bVar, ms.a aVar, final fz.a aVar2, boolean z12, n nVar, final int i11, final int i12) {
        int i13;
        long j11;
        long j12;
        long j13;
        boolean z13;
        boolean z14;
        int i14;
        n3.s sVar;
        final ms.a aVar3 = aVar;
        long j14 = bVar.f41215b;
        long j15 = bVar.f41216c;
        long j16 = bVar.f41217d;
        s sVar2 = (s) nVar;
        sVar2.f0(629721945);
        if ((i11 & 6) == 0) {
            i13 = ((i11 & 8) == 0 ? sVar2.f(cVar) : sVar2.h(cVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar2.c(f5) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= sVar2.c(f11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= sVar2.g(z11) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= sVar2.f(bVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i13 |= sVar2.f(aVar3) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i11) == 0) {
            i13 |= sVar2.h(aVar2) ? 1048576 : 524288;
        }
        int i15 = i12 & 128;
        if (i15 != 0) {
            i13 |= 12582912;
        } else if ((i11 & 12582912) == 0) {
            i13 |= sVar2.g(z12) ? 8388608 : 4194304;
        }
        int i16 = i13;
        if (sVar2.T(i16 & 1, (i13 & 4793491) != 4793490)) {
            boolean z15 = i15 != 0 ? false : z12;
            o oVar = o.f58481a;
            r rVarP = e2.p(oVar, f5, f11);
            if (z11) {
                z12 = z15;
                j11 = j15;
            } else if (z15) {
                z12 = z15;
                j11 = bVar.f41220g;
            } else {
                z12 = z15;
                j11 = cVar.isEmpty() ? bVar.f41219f : j16;
            }
            r0 r0Var = f0.f28556b;
            r rVarH = d0.n.h(rVarP, j11, r0Var);
            float f12 = (!z11 || cVar.isEmpty()) ? aVar3.f41211e : 1;
            if (!z11 || cVar.isEmpty()) {
                j12 = j14;
                j13 = bVar.f41218e;
            } else {
                j12 = j14;
                j13 = j12;
            }
            r rVarJ = d0.n.j(rVarH, f12, j13, r0Var);
            boolean z16 = !cVar.isEmpty();
            boolean z17 = (i16 & 3670016) == 1048576;
            Object objQ = sVar2.Q();
            if (z17 || objQ == l1.m.f39353a) {
                objQ = new jr.m(17, aVar2);
                sVar2.o0(objQ);
            }
            r rVarO = d0.n.o(rVarJ, z16, null, (fz.a) objQ, 14);
            q0 q0VarD = j0.o.d(z1.c.f58467e, false);
            int iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL = sVar2.l();
            r rVarC = z1.a.c(sVar2, rVarO);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            y2.h hVar = y2.j.f56917f;
            t.J(hVar, q0VarD, sVar2);
            y2.h hVar2 = y2.j.f56916e;
            t.J(hVar2, q1VarL, sVar2);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            t.J(hVar4, rVarC, sVar2);
            if (cVar.isEmpty()) {
                z13 = true;
                z14 = false;
                sVar2.d0(1233572003);
            } else {
                sVar2.d0(1245852095);
                u uVarA = j0.t.a(j0.i.f35307e, z1.c.P, sVar2, 54);
                int iHashCode2 = Long.hashCode(sVar2.T);
                q1 q1VarL2 = sVar2.l();
                r rVarC2 = z1.a.c(sVar2, oVar);
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                t.J(hVar, uVarA, sVar2);
                t.J(hVar2, q1VarL2, sVar2);
                if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
                }
                t.J(hVar4, rVarC2, sVar2);
                String strA = cVar.a();
                if (z11 && !x.d(j15, j16)) {
                    j12 = j16;
                } else if (!z11) {
                    j12 = z12 ? bVar.f41221h : bVar.f41214a;
                }
                if (z11) {
                    aVar3 = aVar;
                    i14 = aVar3.f41213g;
                } else {
                    aVar3 = aVar;
                    i14 = aVar3.f41212f;
                }
                long jA = j3.A(i14);
                if (z11) {
                    sVar = n3.s.L;
                } else {
                    sVar = z12 ? n3.s.K : n3.s.f43178t;
                }
                ua.b(strA, null, j12, jA, null, sVar, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar2, 0, 0, 130514);
                if (cVar.b().length() > 0) {
                    sVar2.d0(1532884640);
                    ua.b(cVar.b(), null, (!z11 || x.d(j15, j16)) ? x.f28616c : x.c(j16, 0.8f), j3.A(11), null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar2, 0, 0, 130546);
                    z14 = false;
                } else {
                    z14 = false;
                    sVar2.d0(1519626994);
                }
                sVar2.p(z14);
                z13 = true;
                sVar2.p(true);
            }
            sVar2.p(z14);
            sVar2.p(z13);
        } else {
            sVar2.W();
        }
        final boolean z18 = z12;
        x1 x1VarT = sVar2.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: ls.d
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f.d(cVar, f5, f11, z11, bVar, aVar3, aVar2, z18, (n) obj, t.M(i11 | 1), i12);
                    return b0.f48488a;
                }
            };
        }
    }
}
