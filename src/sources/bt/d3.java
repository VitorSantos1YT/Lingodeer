package bt;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.logging.type.LogSeverity;
import com.lingodeer.data.model.AchievementLevelType;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.OptionItemSelectedState;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import h1.ha;
import h1.la;
import h1.qa;
import h1.ua;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f5309a = 220;

    /* JADX WARN: Code duplicated, block: B:100:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:102:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:109:0x0239  */
    /* JADX WARN: Code duplicated, block: B:111:0x024d  */
    /* JADX WARN: Code duplicated, block: B:114:0x025d  */
    /* JADX WARN: Code duplicated, block: B:117:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:121:0x0359  */
    /* JADX WARN: Code duplicated, block: B:124:0x0360 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x0366  */
    /* JADX WARN: Code duplicated, block: B:129:0x0396  */
    /* JADX WARN: Code duplicated, block: B:132:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Code duplicated, block: B:36:0x007e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0081  */
    /* JADX WARN: Code duplicated, block: B:40:0x008a  */
    /* JADX WARN: Code duplicated, block: B:41:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0096  */
    /* JADX WARN: Code duplicated, block: B:45:0x0099  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:78:0x0106  */
    /* JADX WARN: Code duplicated, block: B:80:0x0109  */
    /* JADX WARN: Code duplicated, block: B:81:0x010d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0112  */
    /* JADX WARN: Code duplicated, block: B:86:0x0119  */
    /* JADX WARN: Code duplicated, block: B:87:0x011b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0122 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x0124  */
    /* JADX WARN: Code duplicated, block: B:93:0x0138  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:97:0x01bb  */
    public static final void a(final List stemWords, String str, o3.w wVar, float f5, final boolean z11, fz.a aVar, final fz.c onTextChange, fz.c cVar, l1.n nVar, final int i11, final int i12) {
        int i13;
        String str2;
        int i14;
        o3.w wVar2;
        int i15;
        int i16;
        float f11;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        fz.c cVar2;
        int i23;
        boolean z12;
        l1.s sVar;
        final String str3;
        final o3.w wVar3;
        final float f12;
        final fz.c cVar3;
        l1.x1 x1VarT;
        int i24;
        l1.g gVar;
        String str4;
        o3.w wVar4;
        float f13;
        int i25;
        o3.w wVar5;
        boolean z13;
        Object objQ;
        fz.c cVar4;
        final long jC;
        final j3.y0 y0VarB;
        l1.c3 c3Var;
        final long j11;
        long j12;
        z1.o oVar;
        o3.w wVar6;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        z1.o oVar2;
        boolean z14;
        int i26;
        Object objQ2;
        e2.v vVar;
        Object objQ3;
        Object objQ4;
        o3.w wVar7;
        fz.c cVar5;
        l1.s sVar2;
        boolean z15;
        Object objQ5;
        Object objQ6;
        final fz.a onClickSwitchKeyboard = aVar;
        kotlin.jvm.internal.m.f(stemWords, "stemWords");
        kotlin.jvm.internal.m.f(onClickSwitchKeyboard, "onClickSwitchKeyboard");
        kotlin.jvm.internal.m.f(onTextChange, "onTextChange");
        l1.s sVar3 = (l1.s) nVar;
        sVar3.f0(1345077984);
        if ((i11 & 6) == 0) {
            i13 = i11 | (sVar3.h(stemWords) ? 4 : 2);
        } else {
            i13 = i11;
        }
        int i27 = i12 & 2;
        if (i27 != 0) {
            i14 = i13 | 48;
            str2 = str;
        } else {
            str2 = str;
            i14 = i13 | (sVar3.f(str2) ? 32 : 16);
        }
        if ((i12 & 4) == 0) {
            wVar2 = wVar;
            int i28 = sVar3.f(wVar2) ? 256 : 128;
            i15 = i14 | i28;
            i16 = i12 & 8;
            if (i16 != 0) {
                i18 = i15 | 3072;
                f11 = f5;
            } else {
                f11 = f5;
                if (sVar3.c(f11)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i18 = i15 | i17;
            }
            if (sVar3.g(z11)) {
                i19 = 16384;
            } else {
                i19 = OSSConstants.DEFAULT_BUFFER_SIZE;
            }
            int i29 = i18 | i19;
            if (sVar3.h(onClickSwitchKeyboard)) {
                i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
            } else {
                i21 = 65536;
            }
            int i30 = i29 | i21;
            if (sVar3.h(onTextChange)) {
                i22 = 1048576;
            } else {
                i22 = 524288;
            }
            int i31 = i30 | i22;
            if ((i12 & 128) == 0) {
                cVar2 = cVar;
                int i32 = sVar3.h(cVar2) ? 8388608 : 4194304;
                i23 = i31 | i32;
                if ((i23 & 4793491) != 4793490) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (sVar3.T(i23 & 1, z12)) {
                    sVar3.Y();
                    i24 = i11 & 1;
                    gVar = l1.m.f39353a;
                    if (i24 != 0 || sVar3.C()) {
                        if (i27 != 0) {
                            str4 = BuildConfig.VERSION_NAME;
                        } else {
                            str4 = str2;
                        }
                        if ((i12 & 4) != 0) {
                            wVar4 = new o3.w(str4, 0L, 6);
                            i23 &= -897;
                        } else {
                            wVar4 = wVar2;
                        }
                        if (i16 != 0) {
                            f13 = 0.8f;
                        } else {
                            f13 = f11;
                        }
                        if ((i12 & 128) != 0) {
                            if ((3670016 & i23) == 1048576) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objQ = sVar3.Q();
                            if (z13 || objQ == gVar) {
                                objQ = new b0.o1(onTextChange, 3);
                                sVar3.o0(objQ);
                            }
                            i25 = i23 & (-29360129);
                            wVar5 = wVar4;
                            f12 = f13;
                            cVar4 = (fz.c) objQ;
                        } else {
                            i25 = i23;
                            wVar5 = wVar4;
                            f12 = f13;
                        }
                        sVar3.q();
                        jC = ct.c.c(sVar3);
                        y0VarB = ct.c.b(sVar3);
                        c3Var = h1.v1.f31180a;
                        j11 = ((h1.s1) sVar3.j(c3Var)).f31034q;
                        String str5 = str4;
                        j12 = ((h1.s1) sVar3.j(c3Var)).f31036s;
                        oVar = z1.o.f58481a;
                        wVar6 = wVar5;
                        z1.r rVarH = d0.n.h(a0.m0.a(j0.e2.i(j0.e2.c(j0.e2.e(oVar, 1.0f), f12), 96, CropImageView.DEFAULT_ASPECT_RATIO, 2), b0.e.r(AchievementLevelType.DAY_STREAK_LV_8, 0, null, 6)), ((h1.s1) sVar3.j(c3Var)).f31035r, r0.f.d(10));
                        w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                        iHashCode = Long.hashCode(sVar3.T);
                        l1.q1 q1VarL = sVar3.l();
                        z1.r rVarC = z1.a.c(sVar3, rVarH);
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar3.h0();
                        if (sVar3.S) {
                            sVar3.k(iVar);
                        } else {
                            sVar3.r0();
                        }
                        l1.t.J(y2.j.f56917f, q0VarD, sVar3);
                        l1.t.J(y2.j.f56916e, q1VarL, sVar3);
                        hVar = y2.j.f56918g;
                        if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar3, iHashCode, hVar);
                        }
                        l1.t.J(y2.j.f56915d, rVarC, sVar3);
                        if (stemWords.isEmpty()) {
                            oVar2 = oVar;
                            z14 = true;
                            i26 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                            sVar3.d0(1275221997);
                            objQ2 = sVar3.Q();
                            if (objQ2 == gVar) {
                                objQ2 = new e2.v();
                                sVar3.o0(objQ2);
                            }
                            vVar = (e2.v) objQ2;
                            objQ3 = sVar3.Q();
                            if (objQ3 == gVar) {
                                objQ3 = new u2(vVar, null, 0);
                                sVar3.o0(objQ3);
                            }
                            l1.t.f((fz.e) objQ3, qy.b0.f48488a, sVar3);
                            n3.s sVar4 = n3.s.H;
                            fr.j3.i(jC);
                            j3.y0 y0VarA = j3.y0.a(y0VarB, j11, jC, sVar4, null, null, 0L, null, null, 0, 4, fr.j3.L(jC & 1095216660480L, v3.o.c(jC) * 1.3f), null, 16580600);
                            float f14 = 16;
                            z1.r rVarJ = e2.d.j(j0.c.E(j0.c.E(j0.e2.d(oVar2, 1.0f), f14, f14, f14, CropImageView.DEFAULT_ASPECT_RATIO, 8), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 52, 7), vVar);
                            s0.r0 r0Var = new s0.r0(0, 7, 119);
                            objQ4 = sVar3.Q();
                            if (objQ4 == gVar) {
                                objQ4 = new m2(vVar, 0);
                                sVar3.o0(objQ4);
                            }
                            fz.c cVar6 = cVar4;
                            s0.l.b(wVar6, cVar6, rVarJ, z11, false, y0VarA, r0Var, new s0.q0((fz.c) objQ4, null, 62), false, 0, 0, null, null, null, new g2.y0(((h1.s1) sVar3.j(c3Var)).f31017a), t1.e.d(367388121, new n2(0, j12, wVar6, y0VarB), sVar3), sVar3, ((i25 >> 6) & 14) | 1572864 | ((i25 >> 18) & 112) | ((i25 >> 3) & 7168), 16144);
                            wVar7 = wVar6;
                            cVar5 = cVar6;
                            sVar2 = sVar3;
                            z15 = false;
                            sVar2.p(false);
                        } else {
                            sVar3.d0(1271553891);
                            objQ6 = sVar3.Q();
                            if (objQ6 == gVar) {
                                objQ6 = l1.t.B(stemWords);
                                sVar3.o0(objQ6);
                            }
                            final l1.b1 b1Var = (l1.b1) objQ6;
                            z1.r rVarC2 = j0.c.C(oVar, 16, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            oVar2 = oVar;
                            i26 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                            z14 = true;
                            t1.d dVarD = t1.e.d(-94175974, new fz.f() { // from class: bt.l2
                                @Override // fz.f
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    boolean z16;
                                    l1.s sVar5;
                                    boolean z17;
                                    j0.u0 FlowRow = (j0.u0) obj;
                                    l1.n nVar2 = (l1.n) obj2;
                                    int iIntValue = ((Integer) obj3).intValue();
                                    z1.i iVar2 = z1.c.M;
                                    kotlin.jvm.internal.m.f(FlowRow, "$this$FlowRow");
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= ((l1.s) nVar2).f(FlowRow) ? 4 : 2;
                                    }
                                    l1.s sVar6 = (l1.s) nVar2;
                                    if (sVar6.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                                        l1.b1 b1Var2 = b1Var;
                                        int i33 = 0;
                                        for (Iterator it = ((List) b1Var2.getValue()).iterator(); it.hasNext(); it = it) {
                                            Object next = it.next();
                                            int i34 = i33 + 1;
                                            if (i33 < 0) {
                                                ns.o.V();
                                                throw null;
                                            }
                                            CourseWord courseWord = (CourseWord) next;
                                            int length = courseWord.getRealWord().length();
                                            z1.o oVar3 = z1.o.f58481a;
                                            j3.y0 y0Var = y0VarB;
                                            long j13 = j11;
                                            long j14 = jC;
                                            if (length > 0) {
                                                sVar6.d0(-889452223);
                                                Object objQ7 = sVar6.Q();
                                                l1.g gVar2 = l1.m.f39353a;
                                                if (objQ7 == gVar2) {
                                                    objQ7 = new e2.v();
                                                    sVar6.o0(objQ7);
                                                }
                                                e2.v vVar2 = (e2.v) objQ7;
                                                Integer numValueOf = Integer.valueOf(i33);
                                                boolean zD = sVar6.d(i33);
                                                Object objQ8 = sVar6.Q();
                                                if (zD || objQ8 == gVar2) {
                                                    objQ8 = new b1.c(i33, vVar2, b1Var2, (vy.d) null);
                                                    sVar6.o0(objQ8);
                                                }
                                                l1.t.f((fz.e) objQ8, numValueOf, sVar6);
                                                String strQ0 = oz.x.q0(courseWord.getWord(), "_", BuildConfig.VERSION_NAME);
                                                j3.y0 y0VarA2 = j3.y0.a(y0Var, j13, j14, n3.s.H, null, null, 0L, null, null, 0, 4, 0L, null, 16711672);
                                                z1.r rVarJ2 = e2.d.j(FlowRow.b(j0.e2.s(oVar3, 102), iVar2), vVar2);
                                                la laVar = la.f30616a;
                                                long j15 = g2.x.f28621h;
                                                l1.c3 c3Var2 = h1.v1.f31180a;
                                                l1.s sVar7 = sVar6;
                                                ha haVarC = la.c(j13, j13, j13, j15, j15, j15, j15, ((h1.s1) sVar6.j(c3Var2)).f31017a, ((h1.s1) sVar6.j(c3Var2)).B, ((h1.s1) sVar6.j(c3Var2)).B, sVar7, 2147477000);
                                                s0.r0 r0Var2 = new s0.r0(0, 7, 119);
                                                Object objQ9 = sVar7.Q();
                                                if (objQ9 == gVar2) {
                                                    z17 = true;
                                                    objQ9 = new m2(vVar2, 1);
                                                    sVar7.o0(objQ9);
                                                } else {
                                                    z17 = true;
                                                }
                                                s0.q0 q0Var = new s0.q0((fz.c) objQ9, null, 62);
                                                boolean zH = sVar7.h(courseWord);
                                                fz.c cVar7 = onTextChange;
                                                boolean zF = zH | sVar7.f(cVar7);
                                                Object objQ10 = sVar7.Q();
                                                if (zF || objQ10 == gVar2) {
                                                    objQ10 = new aj.c(cVar7, b1Var2, courseWord, 13);
                                                    sVar7.o0(objQ10);
                                                }
                                                z16 = z17;
                                                qa.a(strQ0, (fz.c) objQ10, rVarJ2, z11, y0VarA2, null, null, false, null, r0Var2, q0Var, true, 0, 0, null, haVarC, sVar7, 0, 12779520, 3964880);
                                                sVar5 = sVar7;
                                                sVar5.p(false);
                                            } else {
                                                l1.s sVar8 = sVar6;
                                                z16 = true;
                                                sVar8.d0(-886579763);
                                                ua.b(courseWord.getWord(), FlowRow.b(oVar3, iVar2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(y0Var, j13, j14, n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar8, 0, 0, 65532);
                                                sVar5 = sVar8;
                                                sVar5.p(false);
                                            }
                                            sVar6 = sVar5;
                                            i33 = i34;
                                        }
                                    } else {
                                        sVar6.W();
                                    }
                                    return qy.b0.f48488a;
                                }
                            }, sVar3);
                            sVar2 = sVar3;
                            j0.c.c(rVarC2, null, null, null, 0, 0, dVarD, sVar2, 1572870, 62);
                            sVar2.p(false);
                            z15 = false;
                            cVar5 = cVar4;
                            wVar7 = wVar6;
                        }
                        z1.r rVarA = j0.r.f35391a.a(oVar2, z1.c.f58469t);
                        if ((i25 & 458752) == i26) {
                            z15 = z14;
                        }
                        objQ5 = sVar2.Q();
                        if (!z15 || objQ5 == gVar) {
                            onClickSwitchKeyboard = aVar;
                            objQ5 = new at.r(21, onClickSwitchKeyboard);
                            sVar2.o0(objQ5);
                        } else {
                            onClickSwitchKeyboard = aVar;
                        }
                        l1.s sVar5 = sVar2;
                        h1.k7.h((fz.a) objQ5, rVarA, z11, null, b.f5183g, sVar5, ((i25 >> 6) & 896) | 196608, 24);
                        sVar = sVar5;
                        sVar.p(z14);
                        cVar3 = cVar5;
                        wVar3 = wVar7;
                        str3 = str5;
                    } else {
                        sVar3.W();
                        if ((i12 & 4) != 0) {
                            i23 &= -897;
                        }
                        if ((i12 & 128) != 0) {
                            i23 &= -29360129;
                        }
                        i25 = i23;
                        str4 = str2;
                        wVar5 = wVar2;
                        f12 = f11;
                    }
                    cVar4 = cVar2;
                    sVar3.q();
                    jC = ct.c.c(sVar3);
                    y0VarB = ct.c.b(sVar3);
                    c3Var = h1.v1.f31180a;
                    j11 = ((h1.s1) sVar3.j(c3Var)).f31034q;
                    String str6 = str4;
                    j12 = ((h1.s1) sVar3.j(c3Var)).f31036s;
                    oVar = z1.o.f58481a;
                    wVar6 = wVar5;
                    z1.r rVarH2 = d0.n.h(a0.m0.a(j0.e2.i(j0.e2.c(j0.e2.e(oVar, 1.0f), f12), 96, CropImageView.DEFAULT_ASPECT_RATIO, 2), b0.e.r(AchievementLevelType.DAY_STREAK_LV_8, 0, null, 6)), ((h1.s1) sVar3.j(c3Var)).f31035r, r0.f.d(10));
                    w2.q0 q0VarD2 = j0.o.d(z1.c.f58463a, false);
                    iHashCode = Long.hashCode(sVar3.T);
                    l1.q1 q1VarL2 = sVar3.l();
                    z1.r rVarC3 = z1.a.c(sVar3, rVarH2);
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar);
                    } else {
                        sVar3.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD2, sVar3);
                    l1.t.J(y2.j.f56916e, q1VarL2, sVar3);
                    hVar = y2.j.f56918g;
                    if (sVar3.S) {
                        defpackage.e.A(iHashCode, sVar3, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar3, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC3, sVar3);
                    if (stemWords.isEmpty()) {
                        sVar3.d0(1271553891);
                        objQ6 = sVar3.Q();
                        if (objQ6 == gVar) {
                            objQ6 = l1.t.B(stemWords);
                            sVar3.o0(objQ6);
                        }
                        final l1.b1 b1Var2 = (l1.b1) objQ6;
                        z1.r rVarC4 = j0.c.C(oVar, 16, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        oVar2 = oVar;
                        i26 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                        z14 = true;
                        t1.d dVarD2 = t1.e.d(-94175974, new fz.f() { // from class: bt.l2
                            @Override // fz.f
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                boolean z16;
                                l1.s sVar6;
                                boolean z17;
                                j0.u0 FlowRow = (j0.u0) obj;
                                l1.n nVar2 = (l1.n) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                z1.i iVar2 = z1.c.M;
                                kotlin.jvm.internal.m.f(FlowRow, "$this$FlowRow");
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= ((l1.s) nVar2).f(FlowRow) ? 4 : 2;
                                }
                                l1.s sVar7 = (l1.s) nVar2;
                                if (sVar7.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    l1.b1 b1Var3 = b1Var2;
                                    int i33 = 0;
                                    for (Iterator it = ((List) b1Var3.getValue()).iterator(); it.hasNext(); it = it) {
                                        Object next = it.next();
                                        int i34 = i33 + 1;
                                        if (i33 < 0) {
                                            ns.o.V();
                                            throw null;
                                        }
                                        CourseWord courseWord = (CourseWord) next;
                                        int length = courseWord.getRealWord().length();
                                        z1.o oVar3 = z1.o.f58481a;
                                        j3.y0 y0Var = y0VarB;
                                        long j13 = j11;
                                        long j14 = jC;
                                        if (length > 0) {
                                            sVar7.d0(-889452223);
                                            Object objQ7 = sVar7.Q();
                                            l1.g gVar2 = l1.m.f39353a;
                                            if (objQ7 == gVar2) {
                                                objQ7 = new e2.v();
                                                sVar7.o0(objQ7);
                                            }
                                            e2.v vVar2 = (e2.v) objQ7;
                                            Integer numValueOf = Integer.valueOf(i33);
                                            boolean zD = sVar7.d(i33);
                                            Object objQ8 = sVar7.Q();
                                            if (zD || objQ8 == gVar2) {
                                                objQ8 = new b1.c(i33, vVar2, b1Var3, (vy.d) null);
                                                sVar7.o0(objQ8);
                                            }
                                            l1.t.f((fz.e) objQ8, numValueOf, sVar7);
                                            String strQ0 = oz.x.q0(courseWord.getWord(), "_", BuildConfig.VERSION_NAME);
                                            j3.y0 y0VarA2 = j3.y0.a(y0Var, j13, j14, n3.s.H, null, null, 0L, null, null, 0, 4, 0L, null, 16711672);
                                            z1.r rVarJ2 = e2.d.j(FlowRow.b(j0.e2.s(oVar3, 102), iVar2), vVar2);
                                            la laVar = la.f30616a;
                                            long j15 = g2.x.f28621h;
                                            l1.c3 c3Var2 = h1.v1.f31180a;
                                            l1.s sVar8 = sVar7;
                                            ha haVarC = la.c(j13, j13, j13, j15, j15, j15, j15, ((h1.s1) sVar7.j(c3Var2)).f31017a, ((h1.s1) sVar7.j(c3Var2)).B, ((h1.s1) sVar7.j(c3Var2)).B, sVar8, 2147477000);
                                            s0.r0 r0Var2 = new s0.r0(0, 7, 119);
                                            Object objQ9 = sVar8.Q();
                                            if (objQ9 == gVar2) {
                                                z17 = true;
                                                objQ9 = new m2(vVar2, 1);
                                                sVar8.o0(objQ9);
                                            } else {
                                                z17 = true;
                                            }
                                            s0.q0 q0Var = new s0.q0((fz.c) objQ9, null, 62);
                                            boolean zH = sVar8.h(courseWord);
                                            fz.c cVar7 = onTextChange;
                                            boolean zF = zH | sVar8.f(cVar7);
                                            Object objQ10 = sVar8.Q();
                                            if (zF || objQ10 == gVar2) {
                                                objQ10 = new aj.c(cVar7, b1Var3, courseWord, 13);
                                                sVar8.o0(objQ10);
                                            }
                                            z16 = z17;
                                            qa.a(strQ0, (fz.c) objQ10, rVarJ2, z11, y0VarA2, null, null, false, null, r0Var2, q0Var, true, 0, 0, null, haVarC, sVar8, 0, 12779520, 3964880);
                                            sVar6 = sVar8;
                                            sVar6.p(false);
                                        } else {
                                            l1.s sVar9 = sVar7;
                                            z16 = true;
                                            sVar9.d0(-886579763);
                                            ua.b(courseWord.getWord(), FlowRow.b(oVar3, iVar2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(y0Var, j13, j14, n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar9, 0, 0, 65532);
                                            sVar6 = sVar9;
                                            sVar6.p(false);
                                        }
                                        sVar7 = sVar6;
                                        i33 = i34;
                                    }
                                } else {
                                    sVar7.W();
                                }
                                return qy.b0.f48488a;
                            }
                        }, sVar3);
                        sVar2 = sVar3;
                        j0.c.c(rVarC4, null, null, null, 0, 0, dVarD2, sVar2, 1572870, 62);
                        sVar2.p(false);
                        z15 = false;
                        cVar5 = cVar4;
                        wVar7 = wVar6;
                    } else {
                        oVar2 = oVar;
                        z14 = true;
                        i26 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                        sVar3.d0(1275221997);
                        objQ2 = sVar3.Q();
                        if (objQ2 == gVar) {
                            objQ2 = new e2.v();
                            sVar3.o0(objQ2);
                        }
                        vVar = (e2.v) objQ2;
                        objQ3 = sVar3.Q();
                        if (objQ3 == gVar) {
                            objQ3 = new u2(vVar, null, 0);
                            sVar3.o0(objQ3);
                        }
                        l1.t.f((fz.e) objQ3, qy.b0.f48488a, sVar3);
                        n3.s sVar6 = n3.s.H;
                        fr.j3.i(jC);
                        j3.y0 y0VarA2 = j3.y0.a(y0VarB, j11, jC, sVar6, null, null, 0L, null, null, 0, 4, fr.j3.L(jC & 1095216660480L, v3.o.c(jC) * 1.3f), null, 16580600);
                        float f15 = 16;
                        z1.r rVarJ2 = e2.d.j(j0.c.E(j0.c.E(j0.e2.d(oVar2, 1.0f), f15, f15, f15, CropImageView.DEFAULT_ASPECT_RATIO, 8), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 52, 7), vVar);
                        s0.r0 r0Var2 = new s0.r0(0, 7, 119);
                        objQ4 = sVar3.Q();
                        if (objQ4 == gVar) {
                            objQ4 = new m2(vVar, 0);
                            sVar3.o0(objQ4);
                        }
                        fz.c cVar7 = cVar4;
                        s0.l.b(wVar6, cVar7, rVarJ2, z11, false, y0VarA2, r0Var2, new s0.q0((fz.c) objQ4, null, 62), false, 0, 0, null, null, null, new g2.y0(((h1.s1) sVar3.j(c3Var)).f31017a), t1.e.d(367388121, new n2(0, j12, wVar6, y0VarB), sVar3), sVar3, ((i25 >> 6) & 14) | 1572864 | ((i25 >> 18) & 112) | ((i25 >> 3) & 7168), 16144);
                        wVar7 = wVar6;
                        cVar5 = cVar7;
                        sVar2 = sVar3;
                        z15 = false;
                        sVar2.p(false);
                    }
                    z1.r rVarA2 = j0.r.f35391a.a(oVar2, z1.c.f58469t);
                    if ((i25 & 458752) == i26) {
                        z15 = z14;
                    }
                    objQ5 = sVar2.Q();
                    if (z15) {
                        onClickSwitchKeyboard = aVar;
                        objQ5 = new at.r(21, onClickSwitchKeyboard);
                        sVar2.o0(objQ5);
                    } else {
                        onClickSwitchKeyboard = aVar;
                        objQ5 = new at.r(21, onClickSwitchKeyboard);
                        sVar2.o0(objQ5);
                    }
                    l1.s sVar7 = sVar2;
                    h1.k7.h((fz.a) objQ5, rVarA2, z11, null, b.f5183g, sVar7, ((i25 >> 6) & 896) | 196608, 24);
                    sVar = sVar7;
                    sVar.p(z14);
                    cVar3 = cVar5;
                    wVar3 = wVar7;
                    str3 = str6;
                } else {
                    sVar = sVar3;
                    sVar.W();
                    str3 = str2;
                    wVar3 = wVar2;
                    f12 = f11;
                    cVar3 = cVar2;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: bt.o2
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            d3.a(stemWords, str3, wVar3, f12, z11, onClickSwitchKeyboard, onTextChange, cVar3, (l1.n) obj, l1.t.M(i11 | 1), i12);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            cVar2 = cVar;
            i23 = i31 | i32;
            if ((i23 & 4793491) != 4793490) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (sVar3.T(i23 & 1, z12)) {
                sVar3.Y();
                i24 = i11 & 1;
                gVar = l1.m.f39353a;
                if (i24 != 0) {
                    if (i27 != 0) {
                        str4 = BuildConfig.VERSION_NAME;
                    } else {
                        str4 = str2;
                    }
                    if ((i12 & 4) != 0) {
                        wVar4 = new o3.w(str4, 0L, 6);
                        i23 &= -897;
                    } else {
                        wVar4 = wVar2;
                    }
                    if (i16 != 0) {
                        f13 = 0.8f;
                    } else {
                        f13 = f11;
                    }
                    if ((i12 & 128) != 0) {
                        if ((3670016 & i23) == 1048576) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objQ = sVar3.Q();
                        if (z13) {
                            objQ = new b0.o1(onTextChange, 3);
                            sVar3.o0(objQ);
                        } else {
                            objQ = new b0.o1(onTextChange, 3);
                            sVar3.o0(objQ);
                        }
                        i25 = i23 & (-29360129);
                        wVar5 = wVar4;
                        f12 = f13;
                        cVar4 = (fz.c) objQ;
                    } else {
                        i25 = i23;
                        wVar5 = wVar4;
                        f12 = f13;
                        cVar4 = cVar2;
                    }
                } else {
                    if (i27 != 0) {
                        str4 = BuildConfig.VERSION_NAME;
                    } else {
                        str4 = str2;
                    }
                    if ((i12 & 4) != 0) {
                        wVar4 = new o3.w(str4, 0L, 6);
                        i23 &= -897;
                    } else {
                        wVar4 = wVar2;
                    }
                    if (i16 != 0) {
                        f13 = 0.8f;
                    } else {
                        f13 = f11;
                    }
                    if ((i12 & 128) != 0) {
                        if ((3670016 & i23) == 1048576) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objQ = sVar3.Q();
                        if (z13) {
                            objQ = new b0.o1(onTextChange, 3);
                            sVar3.o0(objQ);
                        } else {
                            objQ = new b0.o1(onTextChange, 3);
                            sVar3.o0(objQ);
                        }
                        i25 = i23 & (-29360129);
                        wVar5 = wVar4;
                        f12 = f13;
                        cVar4 = (fz.c) objQ;
                    } else {
                        i25 = i23;
                        wVar5 = wVar4;
                        f12 = f13;
                        cVar4 = cVar2;
                    }
                }
                sVar3.q();
                jC = ct.c.c(sVar3);
                y0VarB = ct.c.b(sVar3);
                c3Var = h1.v1.f31180a;
                j11 = ((h1.s1) sVar3.j(c3Var)).f31034q;
                String str7 = str4;
                j12 = ((h1.s1) sVar3.j(c3Var)).f31036s;
                oVar = z1.o.f58481a;
                wVar6 = wVar5;
                z1.r rVarH3 = d0.n.h(a0.m0.a(j0.e2.i(j0.e2.c(j0.e2.e(oVar, 1.0f), f12), 96, CropImageView.DEFAULT_ASPECT_RATIO, 2), b0.e.r(AchievementLevelType.DAY_STREAK_LV_8, 0, null, 6)), ((h1.s1) sVar3.j(c3Var)).f31035r, r0.f.d(10));
                w2.q0 q0VarD3 = j0.o.d(z1.c.f58463a, false);
                iHashCode = Long.hashCode(sVar3.T);
                l1.q1 q1VarL3 = sVar3.l();
                z1.r rVarC5 = z1.a.c(sVar3, rVarH3);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar3.h0();
                if (sVar3.S) {
                    sVar3.k(iVar);
                } else {
                    sVar3.r0();
                }
                l1.t.J(y2.j.f56917f, q0VarD3, sVar3);
                l1.t.J(y2.j.f56916e, q1VarL3, sVar3);
                hVar = y2.j.f56918g;
                if (sVar3.S) {
                    defpackage.e.A(iHashCode, sVar3, iHashCode, hVar);
                } else {
                    defpackage.e.A(iHashCode, sVar3, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC5, sVar3);
                if (stemWords.isEmpty()) {
                    sVar3.d0(1271553891);
                    objQ6 = sVar3.Q();
                    if (objQ6 == gVar) {
                        objQ6 = l1.t.B(stemWords);
                        sVar3.o0(objQ6);
                    }
                    final l1.b1 b1Var3 = (l1.b1) objQ6;
                    z1.r rVarC6 = j0.c.C(oVar, 16, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    oVar2 = oVar;
                    i26 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    z14 = true;
                    t1.d dVarD3 = t1.e.d(-94175974, new fz.f() { // from class: bt.l2
                        @Override // fz.f
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            boolean z16;
                            l1.s sVar8;
                            boolean z17;
                            j0.u0 FlowRow = (j0.u0) obj;
                            l1.n nVar2 = (l1.n) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            z1.i iVar2 = z1.c.M;
                            kotlin.jvm.internal.m.f(FlowRow, "$this$FlowRow");
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= ((l1.s) nVar2).f(FlowRow) ? 4 : 2;
                            }
                            l1.s sVar9 = (l1.s) nVar2;
                            if (sVar9.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                                l1.b1 b1Var4 = b1Var3;
                                int i33 = 0;
                                for (Iterator it = ((List) b1Var4.getValue()).iterator(); it.hasNext(); it = it) {
                                    Object next = it.next();
                                    int i34 = i33 + 1;
                                    if (i33 < 0) {
                                        ns.o.V();
                                        throw null;
                                    }
                                    CourseWord courseWord = (CourseWord) next;
                                    int length = courseWord.getRealWord().length();
                                    z1.o oVar3 = z1.o.f58481a;
                                    j3.y0 y0Var = y0VarB;
                                    long j13 = j11;
                                    long j14 = jC;
                                    if (length > 0) {
                                        sVar9.d0(-889452223);
                                        Object objQ7 = sVar9.Q();
                                        l1.g gVar2 = l1.m.f39353a;
                                        if (objQ7 == gVar2) {
                                            objQ7 = new e2.v();
                                            sVar9.o0(objQ7);
                                        }
                                        e2.v vVar2 = (e2.v) objQ7;
                                        Integer numValueOf = Integer.valueOf(i33);
                                        boolean zD = sVar9.d(i33);
                                        Object objQ8 = sVar9.Q();
                                        if (zD || objQ8 == gVar2) {
                                            objQ8 = new b1.c(i33, vVar2, b1Var4, (vy.d) null);
                                            sVar9.o0(objQ8);
                                        }
                                        l1.t.f((fz.e) objQ8, numValueOf, sVar9);
                                        String strQ0 = oz.x.q0(courseWord.getWord(), "_", BuildConfig.VERSION_NAME);
                                        j3.y0 y0VarA3 = j3.y0.a(y0Var, j13, j14, n3.s.H, null, null, 0L, null, null, 0, 4, 0L, null, 16711672);
                                        z1.r rVarJ3 = e2.d.j(FlowRow.b(j0.e2.s(oVar3, 102), iVar2), vVar2);
                                        la laVar = la.f30616a;
                                        long j15 = g2.x.f28621h;
                                        l1.c3 c3Var2 = h1.v1.f31180a;
                                        l1.s sVar10 = sVar9;
                                        ha haVarC = la.c(j13, j13, j13, j15, j15, j15, j15, ((h1.s1) sVar9.j(c3Var2)).f31017a, ((h1.s1) sVar9.j(c3Var2)).B, ((h1.s1) sVar9.j(c3Var2)).B, sVar10, 2147477000);
                                        s0.r0 r0Var3 = new s0.r0(0, 7, 119);
                                        Object objQ9 = sVar10.Q();
                                        if (objQ9 == gVar2) {
                                            z17 = true;
                                            objQ9 = new m2(vVar2, 1);
                                            sVar10.o0(objQ9);
                                        } else {
                                            z17 = true;
                                        }
                                        s0.q0 q0Var = new s0.q0((fz.c) objQ9, null, 62);
                                        boolean zH = sVar10.h(courseWord);
                                        fz.c cVar8 = onTextChange;
                                        boolean zF = zH | sVar10.f(cVar8);
                                        Object objQ10 = sVar10.Q();
                                        if (zF || objQ10 == gVar2) {
                                            objQ10 = new aj.c(cVar8, b1Var4, courseWord, 13);
                                            sVar10.o0(objQ10);
                                        }
                                        z16 = z17;
                                        qa.a(strQ0, (fz.c) objQ10, rVarJ3, z11, y0VarA3, null, null, false, null, r0Var3, q0Var, true, 0, 0, null, haVarC, sVar10, 0, 12779520, 3964880);
                                        sVar8 = sVar10;
                                        sVar8.p(false);
                                    } else {
                                        l1.s sVar11 = sVar9;
                                        z16 = true;
                                        sVar11.d0(-886579763);
                                        ua.b(courseWord.getWord(), FlowRow.b(oVar3, iVar2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(y0Var, j13, j14, n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar11, 0, 0, 65532);
                                        sVar8 = sVar11;
                                        sVar8.p(false);
                                    }
                                    sVar9 = sVar8;
                                    i33 = i34;
                                }
                            } else {
                                sVar9.W();
                            }
                            return qy.b0.f48488a;
                        }
                    }, sVar3);
                    sVar2 = sVar3;
                    j0.c.c(rVarC6, null, null, null, 0, 0, dVarD3, sVar2, 1572870, 62);
                    sVar2.p(false);
                    z15 = false;
                    cVar5 = cVar4;
                    wVar7 = wVar6;
                } else {
                    oVar2 = oVar;
                    z14 = true;
                    i26 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    sVar3.d0(1275221997);
                    objQ2 = sVar3.Q();
                    if (objQ2 == gVar) {
                        objQ2 = new e2.v();
                        sVar3.o0(objQ2);
                    }
                    vVar = (e2.v) objQ2;
                    objQ3 = sVar3.Q();
                    if (objQ3 == gVar) {
                        objQ3 = new u2(vVar, null, 0);
                        sVar3.o0(objQ3);
                    }
                    l1.t.f((fz.e) objQ3, qy.b0.f48488a, sVar3);
                    n3.s sVar8 = n3.s.H;
                    fr.j3.i(jC);
                    j3.y0 y0VarA3 = j3.y0.a(y0VarB, j11, jC, sVar8, null, null, 0L, null, null, 0, 4, fr.j3.L(jC & 1095216660480L, v3.o.c(jC) * 1.3f), null, 16580600);
                    float f16 = 16;
                    z1.r rVarJ3 = e2.d.j(j0.c.E(j0.c.E(j0.e2.d(oVar2, 1.0f), f16, f16, f16, CropImageView.DEFAULT_ASPECT_RATIO, 8), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 52, 7), vVar);
                    s0.r0 r0Var3 = new s0.r0(0, 7, 119);
                    objQ4 = sVar3.Q();
                    if (objQ4 == gVar) {
                        objQ4 = new m2(vVar, 0);
                        sVar3.o0(objQ4);
                    }
                    fz.c cVar8 = cVar4;
                    s0.l.b(wVar6, cVar8, rVarJ3, z11, false, y0VarA3, r0Var3, new s0.q0((fz.c) objQ4, null, 62), false, 0, 0, null, null, null, new g2.y0(((h1.s1) sVar3.j(c3Var)).f31017a), t1.e.d(367388121, new n2(0, j12, wVar6, y0VarB), sVar3), sVar3, ((i25 >> 6) & 14) | 1572864 | ((i25 >> 18) & 112) | ((i25 >> 3) & 7168), 16144);
                    wVar7 = wVar6;
                    cVar5 = cVar8;
                    sVar2 = sVar3;
                    z15 = false;
                    sVar2.p(false);
                }
                z1.r rVarA3 = j0.r.f35391a.a(oVar2, z1.c.f58469t);
                if ((i25 & 458752) == i26) {
                    z15 = z14;
                }
                objQ5 = sVar2.Q();
                if (z15) {
                    onClickSwitchKeyboard = aVar;
                    objQ5 = new at.r(21, onClickSwitchKeyboard);
                    sVar2.o0(objQ5);
                } else {
                    onClickSwitchKeyboard = aVar;
                    objQ5 = new at.r(21, onClickSwitchKeyboard);
                    sVar2.o0(objQ5);
                }
                l1.s sVar9 = sVar2;
                h1.k7.h((fz.a) objQ5, rVarA3, z11, null, b.f5183g, sVar9, ((i25 >> 6) & 896) | 196608, 24);
                sVar = sVar9;
                sVar.p(z14);
                cVar3 = cVar5;
                wVar3 = wVar7;
                str3 = str7;
            } else {
                sVar = sVar3;
                sVar.W();
                str3 = str2;
                wVar3 = wVar2;
                f12 = f11;
                cVar3 = cVar2;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: bt.o2
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        d3.a(stemWords, str3, wVar3, f12, z11, onClickSwitchKeyboard, onTextChange, cVar3, (l1.n) obj, l1.t.M(i11 | 1), i12);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        wVar2 = wVar;
        i15 = i14 | i28;
        i16 = i12 & 8;
        if (i16 != 0) {
            i18 = i15 | 3072;
            f11 = f5;
        } else {
            f11 = f5;
            if (sVar3.c(f11)) {
                i17 = 2048;
            } else {
                i17 = 1024;
            }
            i18 = i15 | i17;
        }
        if (sVar3.g(z11)) {
            i19 = 16384;
        } else {
            i19 = OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        int i210 = i18 | i19;
        if (sVar3.h(onClickSwitchKeyboard)) {
            i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
        } else {
            i21 = 65536;
        }
        int i33 = i210 | i21;
        if (sVar3.h(onTextChange)) {
            i22 = 1048576;
        } else {
            i22 = 524288;
        }
        int i34 = i33 | i22;
        if ((i12 & 128) == 0) {
            cVar2 = cVar;
            if (sVar3.h(cVar2)) {
            }
            i23 = i34 | i32;
            if ((i23 & 4793491) != 4793490) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (sVar3.T(i23 & 1, z12)) {
                sVar3.Y();
                i24 = i11 & 1;
                gVar = l1.m.f39353a;
                if (i24 != 0) {
                    if (i27 != 0) {
                        str4 = BuildConfig.VERSION_NAME;
                    } else {
                        str4 = str2;
                    }
                    if ((i12 & 4) != 0) {
                        wVar4 = new o3.w(str4, 0L, 6);
                        i23 &= -897;
                    } else {
                        wVar4 = wVar2;
                    }
                    if (i16 != 0) {
                        f13 = 0.8f;
                    } else {
                        f13 = f11;
                    }
                    if ((i12 & 128) != 0) {
                        if ((3670016 & i23) == 1048576) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objQ = sVar3.Q();
                        if (z13) {
                            objQ = new b0.o1(onTextChange, 3);
                            sVar3.o0(objQ);
                        } else {
                            objQ = new b0.o1(onTextChange, 3);
                            sVar3.o0(objQ);
                        }
                        i25 = i23 & (-29360129);
                        wVar5 = wVar4;
                        f12 = f13;
                        cVar4 = (fz.c) objQ;
                    } else {
                        i25 = i23;
                        wVar5 = wVar4;
                        f12 = f13;
                        cVar4 = cVar2;
                    }
                } else {
                    if (i27 != 0) {
                        str4 = BuildConfig.VERSION_NAME;
                    } else {
                        str4 = str2;
                    }
                    if ((i12 & 4) != 0) {
                        wVar4 = new o3.w(str4, 0L, 6);
                        i23 &= -897;
                    } else {
                        wVar4 = wVar2;
                    }
                    if (i16 != 0) {
                        f13 = 0.8f;
                    } else {
                        f13 = f11;
                    }
                    if ((i12 & 128) != 0) {
                        if ((3670016 & i23) == 1048576) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objQ = sVar3.Q();
                        if (z13) {
                            objQ = new b0.o1(onTextChange, 3);
                            sVar3.o0(objQ);
                        } else {
                            objQ = new b0.o1(onTextChange, 3);
                            sVar3.o0(objQ);
                        }
                        i25 = i23 & (-29360129);
                        wVar5 = wVar4;
                        f12 = f13;
                        cVar4 = (fz.c) objQ;
                    } else {
                        i25 = i23;
                        wVar5 = wVar4;
                        f12 = f13;
                        cVar4 = cVar2;
                    }
                }
                sVar3.q();
                jC = ct.c.c(sVar3);
                y0VarB = ct.c.b(sVar3);
                c3Var = h1.v1.f31180a;
                j11 = ((h1.s1) sVar3.j(c3Var)).f31034q;
                String str8 = str4;
                j12 = ((h1.s1) sVar3.j(c3Var)).f31036s;
                oVar = z1.o.f58481a;
                wVar6 = wVar5;
                z1.r rVarH4 = d0.n.h(a0.m0.a(j0.e2.i(j0.e2.c(j0.e2.e(oVar, 1.0f), f12), 96, CropImageView.DEFAULT_ASPECT_RATIO, 2), b0.e.r(AchievementLevelType.DAY_STREAK_LV_8, 0, null, 6)), ((h1.s1) sVar3.j(c3Var)).f31035r, r0.f.d(10));
                w2.q0 q0VarD4 = j0.o.d(z1.c.f58463a, false);
                iHashCode = Long.hashCode(sVar3.T);
                l1.q1 q1VarL4 = sVar3.l();
                z1.r rVarC7 = z1.a.c(sVar3, rVarH4);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar3.h0();
                if (sVar3.S) {
                    sVar3.k(iVar);
                } else {
                    sVar3.r0();
                }
                l1.t.J(y2.j.f56917f, q0VarD4, sVar3);
                l1.t.J(y2.j.f56916e, q1VarL4, sVar3);
                hVar = y2.j.f56918g;
                if (sVar3.S) {
                    defpackage.e.A(iHashCode, sVar3, iHashCode, hVar);
                } else {
                    defpackage.e.A(iHashCode, sVar3, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC7, sVar3);
                if (stemWords.isEmpty()) {
                    sVar3.d0(1271553891);
                    objQ6 = sVar3.Q();
                    if (objQ6 == gVar) {
                        objQ6 = l1.t.B(stemWords);
                        sVar3.o0(objQ6);
                    }
                    final l1.b1 b1Var4 = (l1.b1) objQ6;
                    z1.r rVarC8 = j0.c.C(oVar, 16, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    oVar2 = oVar;
                    i26 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    z14 = true;
                    t1.d dVarD4 = t1.e.d(-94175974, new fz.f() { // from class: bt.l2
                        @Override // fz.f
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            boolean z16;
                            l1.s sVar10;
                            boolean z17;
                            j0.u0 FlowRow = (j0.u0) obj;
                            l1.n nVar2 = (l1.n) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            z1.i iVar2 = z1.c.M;
                            kotlin.jvm.internal.m.f(FlowRow, "$this$FlowRow");
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= ((l1.s) nVar2).f(FlowRow) ? 4 : 2;
                            }
                            l1.s sVar11 = (l1.s) nVar2;
                            if (sVar11.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                                l1.b1 b1Var5 = b1Var4;
                                int i35 = 0;
                                for (Iterator it = ((List) b1Var5.getValue()).iterator(); it.hasNext(); it = it) {
                                    Object next = it.next();
                                    int i36 = i35 + 1;
                                    if (i35 < 0) {
                                        ns.o.V();
                                        throw null;
                                    }
                                    CourseWord courseWord = (CourseWord) next;
                                    int length = courseWord.getRealWord().length();
                                    z1.o oVar3 = z1.o.f58481a;
                                    j3.y0 y0Var = y0VarB;
                                    long j13 = j11;
                                    long j14 = jC;
                                    if (length > 0) {
                                        sVar11.d0(-889452223);
                                        Object objQ7 = sVar11.Q();
                                        l1.g gVar2 = l1.m.f39353a;
                                        if (objQ7 == gVar2) {
                                            objQ7 = new e2.v();
                                            sVar11.o0(objQ7);
                                        }
                                        e2.v vVar2 = (e2.v) objQ7;
                                        Integer numValueOf = Integer.valueOf(i35);
                                        boolean zD = sVar11.d(i35);
                                        Object objQ8 = sVar11.Q();
                                        if (zD || objQ8 == gVar2) {
                                            objQ8 = new b1.c(i35, vVar2, b1Var5, (vy.d) null);
                                            sVar11.o0(objQ8);
                                        }
                                        l1.t.f((fz.e) objQ8, numValueOf, sVar11);
                                        String strQ0 = oz.x.q0(courseWord.getWord(), "_", BuildConfig.VERSION_NAME);
                                        j3.y0 y0VarA4 = j3.y0.a(y0Var, j13, j14, n3.s.H, null, null, 0L, null, null, 0, 4, 0L, null, 16711672);
                                        z1.r rVarJ4 = e2.d.j(FlowRow.b(j0.e2.s(oVar3, 102), iVar2), vVar2);
                                        la laVar = la.f30616a;
                                        long j15 = g2.x.f28621h;
                                        l1.c3 c3Var2 = h1.v1.f31180a;
                                        l1.s sVar12 = sVar11;
                                        ha haVarC = la.c(j13, j13, j13, j15, j15, j15, j15, ((h1.s1) sVar11.j(c3Var2)).f31017a, ((h1.s1) sVar11.j(c3Var2)).B, ((h1.s1) sVar11.j(c3Var2)).B, sVar12, 2147477000);
                                        s0.r0 r0Var4 = new s0.r0(0, 7, 119);
                                        Object objQ9 = sVar12.Q();
                                        if (objQ9 == gVar2) {
                                            z17 = true;
                                            objQ9 = new m2(vVar2, 1);
                                            sVar12.o0(objQ9);
                                        } else {
                                            z17 = true;
                                        }
                                        s0.q0 q0Var = new s0.q0((fz.c) objQ9, null, 62);
                                        boolean zH = sVar12.h(courseWord);
                                        fz.c cVar9 = onTextChange;
                                        boolean zF = zH | sVar12.f(cVar9);
                                        Object objQ10 = sVar12.Q();
                                        if (zF || objQ10 == gVar2) {
                                            objQ10 = new aj.c(cVar9, b1Var5, courseWord, 13);
                                            sVar12.o0(objQ10);
                                        }
                                        z16 = z17;
                                        qa.a(strQ0, (fz.c) objQ10, rVarJ4, z11, y0VarA4, null, null, false, null, r0Var4, q0Var, true, 0, 0, null, haVarC, sVar12, 0, 12779520, 3964880);
                                        sVar10 = sVar12;
                                        sVar10.p(false);
                                    } else {
                                        l1.s sVar13 = sVar11;
                                        z16 = true;
                                        sVar13.d0(-886579763);
                                        ua.b(courseWord.getWord(), FlowRow.b(oVar3, iVar2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(y0Var, j13, j14, n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar13, 0, 0, 65532);
                                        sVar10 = sVar13;
                                        sVar10.p(false);
                                    }
                                    sVar11 = sVar10;
                                    i35 = i36;
                                }
                            } else {
                                sVar11.W();
                            }
                            return qy.b0.f48488a;
                        }
                    }, sVar3);
                    sVar2 = sVar3;
                    j0.c.c(rVarC8, null, null, null, 0, 0, dVarD4, sVar2, 1572870, 62);
                    sVar2.p(false);
                    z15 = false;
                    cVar5 = cVar4;
                    wVar7 = wVar6;
                } else {
                    oVar2 = oVar;
                    z14 = true;
                    i26 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    sVar3.d0(1275221997);
                    objQ2 = sVar3.Q();
                    if (objQ2 == gVar) {
                        objQ2 = new e2.v();
                        sVar3.o0(objQ2);
                    }
                    vVar = (e2.v) objQ2;
                    objQ3 = sVar3.Q();
                    if (objQ3 == gVar) {
                        objQ3 = new u2(vVar, null, 0);
                        sVar3.o0(objQ3);
                    }
                    l1.t.f((fz.e) objQ3, qy.b0.f48488a, sVar3);
                    n3.s sVar10 = n3.s.H;
                    fr.j3.i(jC);
                    j3.y0 y0VarA4 = j3.y0.a(y0VarB, j11, jC, sVar10, null, null, 0L, null, null, 0, 4, fr.j3.L(jC & 1095216660480L, v3.o.c(jC) * 1.3f), null, 16580600);
                    float f17 = 16;
                    z1.r rVarJ4 = e2.d.j(j0.c.E(j0.c.E(j0.e2.d(oVar2, 1.0f), f17, f17, f17, CropImageView.DEFAULT_ASPECT_RATIO, 8), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 52, 7), vVar);
                    s0.r0 r0Var4 = new s0.r0(0, 7, 119);
                    objQ4 = sVar3.Q();
                    if (objQ4 == gVar) {
                        objQ4 = new m2(vVar, 0);
                        sVar3.o0(objQ4);
                    }
                    fz.c cVar9 = cVar4;
                    s0.l.b(wVar6, cVar9, rVarJ4, z11, false, y0VarA4, r0Var4, new s0.q0((fz.c) objQ4, null, 62), false, 0, 0, null, null, null, new g2.y0(((h1.s1) sVar3.j(c3Var)).f31017a), t1.e.d(367388121, new n2(0, j12, wVar6, y0VarB), sVar3), sVar3, ((i25 >> 6) & 14) | 1572864 | ((i25 >> 18) & 112) | ((i25 >> 3) & 7168), 16144);
                    wVar7 = wVar6;
                    cVar5 = cVar9;
                    sVar2 = sVar3;
                    z15 = false;
                    sVar2.p(false);
                }
                z1.r rVarA4 = j0.r.f35391a.a(oVar2, z1.c.f58469t);
                if ((i25 & 458752) == i26) {
                    z15 = z14;
                }
                objQ5 = sVar2.Q();
                if (z15) {
                    onClickSwitchKeyboard = aVar;
                    objQ5 = new at.r(21, onClickSwitchKeyboard);
                    sVar2.o0(objQ5);
                } else {
                    onClickSwitchKeyboard = aVar;
                    objQ5 = new at.r(21, onClickSwitchKeyboard);
                    sVar2.o0(objQ5);
                }
                l1.s sVar11 = sVar2;
                h1.k7.h((fz.a) objQ5, rVarA4, z11, null, b.f5183g, sVar11, ((i25 >> 6) & 896) | 196608, 24);
                sVar = sVar11;
                sVar.p(z14);
                cVar3 = cVar5;
                wVar3 = wVar7;
                str3 = str8;
            } else {
                sVar = sVar3;
                sVar.W();
                str3 = str2;
                wVar3 = wVar2;
                f12 = f11;
                cVar3 = cVar2;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: bt.o2
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        d3.a(stemWords, str3, wVar3, f12, z11, onClickSwitchKeyboard, onTextChange, cVar3, (l1.n) obj, l1.t.M(i11 | 1), i12);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        cVar2 = cVar;
        i23 = i34 | i32;
        if ((i23 & 4793491) != 4793490) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (sVar3.T(i23 & 1, z12)) {
            sVar3.Y();
            i24 = i11 & 1;
            gVar = l1.m.f39353a;
            if (i24 != 0) {
                if (i27 != 0) {
                    str4 = BuildConfig.VERSION_NAME;
                } else {
                    str4 = str2;
                }
                if ((i12 & 4) != 0) {
                    wVar4 = new o3.w(str4, 0L, 6);
                    i23 &= -897;
                } else {
                    wVar4 = wVar2;
                }
                if (i16 != 0) {
                    f13 = 0.8f;
                } else {
                    f13 = f11;
                }
                if ((i12 & 128) != 0) {
                    if ((3670016 & i23) == 1048576) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objQ = sVar3.Q();
                    if (z13) {
                        objQ = new b0.o1(onTextChange, 3);
                        sVar3.o0(objQ);
                    } else {
                        objQ = new b0.o1(onTextChange, 3);
                        sVar3.o0(objQ);
                    }
                    i25 = i23 & (-29360129);
                    wVar5 = wVar4;
                    f12 = f13;
                    cVar4 = (fz.c) objQ;
                } else {
                    i25 = i23;
                    wVar5 = wVar4;
                    f12 = f13;
                    cVar4 = cVar2;
                }
            } else {
                if (i27 != 0) {
                    str4 = BuildConfig.VERSION_NAME;
                } else {
                    str4 = str2;
                }
                if ((i12 & 4) != 0) {
                    wVar4 = new o3.w(str4, 0L, 6);
                    i23 &= -897;
                } else {
                    wVar4 = wVar2;
                }
                if (i16 != 0) {
                    f13 = 0.8f;
                } else {
                    f13 = f11;
                }
                if ((i12 & 128) != 0) {
                    if ((3670016 & i23) == 1048576) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objQ = sVar3.Q();
                    if (z13) {
                        objQ = new b0.o1(onTextChange, 3);
                        sVar3.o0(objQ);
                    } else {
                        objQ = new b0.o1(onTextChange, 3);
                        sVar3.o0(objQ);
                    }
                    i25 = i23 & (-29360129);
                    wVar5 = wVar4;
                    f12 = f13;
                    cVar4 = (fz.c) objQ;
                } else {
                    i25 = i23;
                    wVar5 = wVar4;
                    f12 = f13;
                    cVar4 = cVar2;
                }
            }
            sVar3.q();
            jC = ct.c.c(sVar3);
            y0VarB = ct.c.b(sVar3);
            c3Var = h1.v1.f31180a;
            j11 = ((h1.s1) sVar3.j(c3Var)).f31034q;
            String str9 = str4;
            j12 = ((h1.s1) sVar3.j(c3Var)).f31036s;
            oVar = z1.o.f58481a;
            wVar6 = wVar5;
            z1.r rVarH5 = d0.n.h(a0.m0.a(j0.e2.i(j0.e2.c(j0.e2.e(oVar, 1.0f), f12), 96, CropImageView.DEFAULT_ASPECT_RATIO, 2), b0.e.r(AchievementLevelType.DAY_STREAK_LV_8, 0, null, 6)), ((h1.s1) sVar3.j(c3Var)).f31035r, r0.f.d(10));
            w2.q0 q0VarD5 = j0.o.d(z1.c.f58463a, false);
            iHashCode = Long.hashCode(sVar3.T);
            l1.q1 q1VarL5 = sVar3.l();
            z1.r rVarC9 = z1.a.c(sVar3, rVarH5);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(iVar);
            } else {
                sVar3.r0();
            }
            l1.t.J(y2.j.f56917f, q0VarD5, sVar3);
            l1.t.J(y2.j.f56916e, q1VarL5, sVar3);
            hVar = y2.j.f56918g;
            if (sVar3.S) {
                defpackage.e.A(iHashCode, sVar3, iHashCode, hVar);
            } else {
                defpackage.e.A(iHashCode, sVar3, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC9, sVar3);
            if (stemWords.isEmpty()) {
                sVar3.d0(1271553891);
                objQ6 = sVar3.Q();
                if (objQ6 == gVar) {
                    objQ6 = l1.t.B(stemWords);
                    sVar3.o0(objQ6);
                }
                final l1.b1 b1Var5 = (l1.b1) objQ6;
                z1.r rVarC10 = j0.c.C(oVar, 16, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                oVar2 = oVar;
                i26 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                z14 = true;
                t1.d dVarD5 = t1.e.d(-94175974, new fz.f() { // from class: bt.l2
                    @Override // fz.f
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        boolean z16;
                        l1.s sVar12;
                        boolean z17;
                        j0.u0 FlowRow = (j0.u0) obj;
                        l1.n nVar2 = (l1.n) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        z1.i iVar2 = z1.c.M;
                        kotlin.jvm.internal.m.f(FlowRow, "$this$FlowRow");
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= ((l1.s) nVar2).f(FlowRow) ? 4 : 2;
                        }
                        l1.s sVar13 = (l1.s) nVar2;
                        if (sVar13.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                            l1.b1 b1Var6 = b1Var5;
                            int i35 = 0;
                            for (Iterator it = ((List) b1Var6.getValue()).iterator(); it.hasNext(); it = it) {
                                Object next = it.next();
                                int i36 = i35 + 1;
                                if (i35 < 0) {
                                    ns.o.V();
                                    throw null;
                                }
                                CourseWord courseWord = (CourseWord) next;
                                int length = courseWord.getRealWord().length();
                                z1.o oVar3 = z1.o.f58481a;
                                j3.y0 y0Var = y0VarB;
                                long j13 = j11;
                                long j14 = jC;
                                if (length > 0) {
                                    sVar13.d0(-889452223);
                                    Object objQ7 = sVar13.Q();
                                    l1.g gVar2 = l1.m.f39353a;
                                    if (objQ7 == gVar2) {
                                        objQ7 = new e2.v();
                                        sVar13.o0(objQ7);
                                    }
                                    e2.v vVar2 = (e2.v) objQ7;
                                    Integer numValueOf = Integer.valueOf(i35);
                                    boolean zD = sVar13.d(i35);
                                    Object objQ8 = sVar13.Q();
                                    if (zD || objQ8 == gVar2) {
                                        objQ8 = new b1.c(i35, vVar2, b1Var6, (vy.d) null);
                                        sVar13.o0(objQ8);
                                    }
                                    l1.t.f((fz.e) objQ8, numValueOf, sVar13);
                                    String strQ0 = oz.x.q0(courseWord.getWord(), "_", BuildConfig.VERSION_NAME);
                                    j3.y0 y0VarA5 = j3.y0.a(y0Var, j13, j14, n3.s.H, null, null, 0L, null, null, 0, 4, 0L, null, 16711672);
                                    z1.r rVarJ5 = e2.d.j(FlowRow.b(j0.e2.s(oVar3, 102), iVar2), vVar2);
                                    la laVar = la.f30616a;
                                    long j15 = g2.x.f28621h;
                                    l1.c3 c3Var2 = h1.v1.f31180a;
                                    l1.s sVar14 = sVar13;
                                    ha haVarC = la.c(j13, j13, j13, j15, j15, j15, j15, ((h1.s1) sVar13.j(c3Var2)).f31017a, ((h1.s1) sVar13.j(c3Var2)).B, ((h1.s1) sVar13.j(c3Var2)).B, sVar14, 2147477000);
                                    s0.r0 r0Var5 = new s0.r0(0, 7, 119);
                                    Object objQ9 = sVar14.Q();
                                    if (objQ9 == gVar2) {
                                        z17 = true;
                                        objQ9 = new m2(vVar2, 1);
                                        sVar14.o0(objQ9);
                                    } else {
                                        z17 = true;
                                    }
                                    s0.q0 q0Var = new s0.q0((fz.c) objQ9, null, 62);
                                    boolean zH = sVar14.h(courseWord);
                                    fz.c cVar10 = onTextChange;
                                    boolean zF = zH | sVar14.f(cVar10);
                                    Object objQ10 = sVar14.Q();
                                    if (zF || objQ10 == gVar2) {
                                        objQ10 = new aj.c(cVar10, b1Var6, courseWord, 13);
                                        sVar14.o0(objQ10);
                                    }
                                    z16 = z17;
                                    qa.a(strQ0, (fz.c) objQ10, rVarJ5, z11, y0VarA5, null, null, false, null, r0Var5, q0Var, true, 0, 0, null, haVarC, sVar14, 0, 12779520, 3964880);
                                    sVar12 = sVar14;
                                    sVar12.p(false);
                                } else {
                                    l1.s sVar15 = sVar13;
                                    z16 = true;
                                    sVar15.d0(-886579763);
                                    ua.b(courseWord.getWord(), FlowRow.b(oVar3, iVar2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(y0Var, j13, j14, n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar15, 0, 0, 65532);
                                    sVar12 = sVar15;
                                    sVar12.p(false);
                                }
                                sVar13 = sVar12;
                                i35 = i36;
                            }
                        } else {
                            sVar13.W();
                        }
                        return qy.b0.f48488a;
                    }
                }, sVar3);
                sVar2 = sVar3;
                j0.c.c(rVarC10, null, null, null, 0, 0, dVarD5, sVar2, 1572870, 62);
                sVar2.p(false);
                z15 = false;
                cVar5 = cVar4;
                wVar7 = wVar6;
            } else {
                oVar2 = oVar;
                z14 = true;
                i26 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                sVar3.d0(1275221997);
                objQ2 = sVar3.Q();
                if (objQ2 == gVar) {
                    objQ2 = new e2.v();
                    sVar3.o0(objQ2);
                }
                vVar = (e2.v) objQ2;
                objQ3 = sVar3.Q();
                if (objQ3 == gVar) {
                    objQ3 = new u2(vVar, null, 0);
                    sVar3.o0(objQ3);
                }
                l1.t.f((fz.e) objQ3, qy.b0.f48488a, sVar3);
                n3.s sVar12 = n3.s.H;
                fr.j3.i(jC);
                j3.y0 y0VarA5 = j3.y0.a(y0VarB, j11, jC, sVar12, null, null, 0L, null, null, 0, 4, fr.j3.L(jC & 1095216660480L, v3.o.c(jC) * 1.3f), null, 16580600);
                float f18 = 16;
                z1.r rVarJ5 = e2.d.j(j0.c.E(j0.c.E(j0.e2.d(oVar2, 1.0f), f18, f18, f18, CropImageView.DEFAULT_ASPECT_RATIO, 8), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 52, 7), vVar);
                s0.r0 r0Var5 = new s0.r0(0, 7, 119);
                objQ4 = sVar3.Q();
                if (objQ4 == gVar) {
                    objQ4 = new m2(vVar, 0);
                    sVar3.o0(objQ4);
                }
                fz.c cVar10 = cVar4;
                s0.l.b(wVar6, cVar10, rVarJ5, z11, false, y0VarA5, r0Var5, new s0.q0((fz.c) objQ4, null, 62), false, 0, 0, null, null, null, new g2.y0(((h1.s1) sVar3.j(c3Var)).f31017a), t1.e.d(367388121, new n2(0, j12, wVar6, y0VarB), sVar3), sVar3, ((i25 >> 6) & 14) | 1572864 | ((i25 >> 18) & 112) | ((i25 >> 3) & 7168), 16144);
                wVar7 = wVar6;
                cVar5 = cVar10;
                sVar2 = sVar3;
                z15 = false;
                sVar2.p(false);
            }
            z1.r rVarA5 = j0.r.f35391a.a(oVar2, z1.c.f58469t);
            if ((i25 & 458752) == i26) {
                z15 = z14;
            }
            objQ5 = sVar2.Q();
            if (z15) {
                onClickSwitchKeyboard = aVar;
                objQ5 = new at.r(21, onClickSwitchKeyboard);
                sVar2.o0(objQ5);
            } else {
                onClickSwitchKeyboard = aVar;
                objQ5 = new at.r(21, onClickSwitchKeyboard);
                sVar2.o0(objQ5);
            }
            l1.s sVar13 = sVar2;
            h1.k7.h((fz.a) objQ5, rVarA5, z11, null, b.f5183g, sVar13, ((i25 >> 6) & 896) | 196608, 24);
            sVar = sVar13;
            sVar.p(z14);
            cVar3 = cVar5;
            wVar3 = wVar7;
            str3 = str9;
        } else {
            sVar = sVar3;
            sVar.W();
            str3 = str2;
            wVar3 = wVar2;
            f12 = f11;
            cVar3 = cVar2;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: bt.o2
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d3.a(stemWords, str3, wVar3, f12, z11, onClickSwitchKeyboard, onTextChange, cVar3, (l1.n) obj, l1.t.M(i11 | 1), i12);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0181  */
    /* JADX WARN: Code duplicated, block: B:104:0x018a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x018c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0190  */
    /* JADX WARN: Code duplicated, block: B:109:0x0192  */
    /* JADX WARN: Code duplicated, block: B:111:0x0195  */
    /* JADX WARN: Code duplicated, block: B:112:0x0198  */
    /* JADX WARN: Code duplicated, block: B:114:0x019c  */
    /* JADX WARN: Code duplicated, block: B:115:0x019f  */
    /* JADX WARN: Code duplicated, block: B:117:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:118:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:121:0x01af  */
    /* JADX WARN: Code duplicated, block: B:123:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:125:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:127:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:129:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:131:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:135:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:138:0x0230  */
    /* JADX WARN: Code duplicated, block: B:139:0x0234  */
    /* JADX WARN: Code duplicated, block: B:144:0x0257  */
    /* JADX WARN: Code duplicated, block: B:147:0x0288  */
    /* JADX WARN: Code duplicated, block: B:150:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:151:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:156:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:159:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:160:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:163:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:164:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:167:0x0307  */
    /* JADX WARN: Code duplicated, block: B:168:0x0309  */
    /* JADX WARN: Code duplicated, block: B:171:0x031c  */
    /* JADX WARN: Code duplicated, block: B:172:0x031e  */
    /* JADX WARN: Code duplicated, block: B:176:0x0328  */
    /* JADX WARN: Code duplicated, block: B:181:0x039f  */
    /* JADX WARN: Code duplicated, block: B:182:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:189:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:192:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:194:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:195:0x03de  */
    /* JADX WARN: Code duplicated, block: B:201:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:204:0x0414  */
    /* JADX WARN: Code duplicated, block: B:208:0x0428  */
    /* JADX WARN: Code duplicated, block: B:211:0x0433  */
    /* JADX WARN: Code duplicated, block: B:213:0x0440  */
    /* JADX WARN: Code duplicated, block: B:214:0x0442  */
    /* JADX WARN: Code duplicated, block: B:220:0x044f  */
    /* JADX WARN: Code duplicated, block: B:223:0x047f  */
    /* JADX WARN: Code duplicated, block: B:225:0x0488  */
    /* JADX WARN: Code duplicated, block: B:227:0x0494  */
    /* JADX WARN: Code duplicated, block: B:228:0x0496  */
    /* JADX WARN: Code duplicated, block: B:234:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:237:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:239:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:241:0x0505  */
    /* JADX WARN: Code duplicated, block: B:244:0x0512  */
    /* JADX WARN: Code duplicated, block: B:250:0x051f  */
    /* JADX WARN: Code duplicated, block: B:252:0x0553  */
    /* JADX WARN: Code duplicated, block: B:255:0x056c  */
    /* JADX WARN: Code duplicated, block: B:257:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0101  */
    /* JADX WARN: Code duplicated, block: B:64:0x0104  */
    /* JADX WARN: Code duplicated, block: B:67:0x010e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0111  */
    /* JADX WARN: Code duplicated, block: B:71:0x011d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0120  */
    /* JADX WARN: Code duplicated, block: B:75:0x012a  */
    /* JADX WARN: Code duplicated, block: B:78:0x0134  */
    /* JADX WARN: Code duplicated, block: B:81:0x013f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0144  */
    /* JADX WARN: Code duplicated, block: B:84:0x014c  */
    /* JADX WARN: Code duplicated, block: B:85:0x014f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0157  */
    /* JADX WARN: Code duplicated, block: B:91:0x015e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0166  */
    public static final void b(final List optionWords, final int i11, final boolean z11, final boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, final boolean z18, float f5, final fz.c onClickOption, fz.a aVar, final fz.a onClickHint, fz.a onClickDel, fz.a aVar2, fz.a aVar3, l1.n nVar, final int i12, final int i13) {
        boolean z19;
        int i14;
        boolean z20;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean z21;
        l1.s sVar;
        fz.a aVar4;
        final boolean z22;
        final boolean z23;
        final float f11;
        final fz.a aVar5;
        final fz.a aVar6;
        final boolean z24;
        final boolean z25;
        final boolean z26;
        l1.x1 x1VarT;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z30;
        l1.g gVar;
        fz.a aVar7;
        fz.a aVar8;
        final long jC;
        fz.a aVar9;
        final v3.c cVar;
        Object objQ;
        Object objV;
        final l1.a1 a1Var;
        boolean z31;
        final boolean z32;
        fz.a aVar10;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        Object objQ2;
        int iHashCode2;
        boolean z33;
        boolean z34;
        boolean z35;
        boolean z36;
        boolean z37;
        Object objQ3;
        l1.s sVar2;
        int i30;
        l1.s sVar3;
        int iHashCode3;
        int i31;
        l1.g gVar2;
        boolean z38;
        fz.a aVar11;
        boolean z39;
        fz.a aVar12;
        boolean z40;
        boolean z41;
        boolean z42;
        Object objQ4;
        boolean z43;
        Object objQ5;
        boolean z44;
        Object objQ6;
        boolean z45;
        Object objQ7;
        Object objQ8;
        Object objQ9;
        final fz.a onClickSwitchKeyboard = aVar;
        kotlin.jvm.internal.m.f(optionWords, "optionWords");
        kotlin.jvm.internal.m.f(onClickOption, "onClickOption");
        kotlin.jvm.internal.m.f(onClickSwitchKeyboard, "onClickSwitchKeyboard");
        kotlin.jvm.internal.m.f(onClickHint, "onClickHint");
        kotlin.jvm.internal.m.f(onClickDel, "onClickDel");
        l1.s sVar4 = (l1.s) nVar;
        sVar4.f0(-1945218846);
        int i32 = i12 | (sVar4.h(optionWords) ? 4 : 2) | (sVar4.d(i11) ? 32 : 16) | (sVar4.g(z11) ? 256 : 128) | (sVar4.g(z12) ? 2048 : 1024);
        int i33 = i13 & 16;
        int i34 = OSSConstants.DEFAULT_BUFFER_SIZE;
        if (i33 != 0) {
            i14 = i32 | 24576;
            z19 = z13;
        } else {
            z19 = z13;
            i14 = i32 | (sVar4.g(z19) ? 16384 : 8192);
        }
        int i35 = i13 & 32;
        if (i35 != 0) {
            i15 = i14 | 196608;
            z20 = z14;
        } else {
            z20 = z14;
            i15 = i14 | (sVar4.g(z20) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536);
        }
        int i36 = i13 & 64;
        if (i36 != 0) {
            i16 = i15 | 1572864;
        } else {
            i16 = i15 | (sVar4.g(z15) ? 1048576 : 524288);
        }
        int i37 = i13 & 128;
        if (i37 != 0) {
            i17 = i16 | 12582912;
        } else {
            i17 = i16 | (sVar4.g(z16) ? 8388608 : 4194304);
        }
        int i38 = i13 & 256;
        if (i38 == 0) {
            if ((i12 & 100663296) == 0) {
                i17 |= sVar4.g(z17) ? 67108864 : 33554432;
            }
            if (sVar4.g(z18)) {
                i18 = 536870912;
            } else {
                i18 = 268435456;
            }
            i19 = i17 | i18;
            if (sVar4.h(onClickOption)) {
                i21 = 32;
            } else {
                i21 = 16;
            }
            int i39 = 6 | i21;
            if (sVar4.h(onClickSwitchKeyboard)) {
                i22 = 256;
            } else {
                i22 = 128;
            }
            int i40 = i39 | i22 | (sVar4.h(onClickHint) ? 2048 : 1024);
            if (sVar4.h(onClickDel)) {
                i34 = 16384;
            }
            i23 = i40 | i34;
            i24 = i13 & 32768;
            if (i24 != 0) {
                i26 = i23 | 196608;
            } else {
                if (sVar4.h(aVar2)) {
                    i25 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                } else {
                    i25 = 65536;
                }
                i26 = i23 | i25;
            }
            i27 = i13 & 65536;
            if (i27 != 0) {
                i28 = i26 | 1572864;
            } else {
                i28 = i26 | (sVar4.h(aVar3) ? 1048576 : 524288);
            }
            i29 = i28;
            if ((i19 & 306783379) == 306783378 || (599187 & i29) != 599186) {
                z21 = true;
            } else {
                z21 = false;
            }
            if (sVar4.T(i19 & 1, z21)) {
                if (i33 != 0) {
                    z19 = false;
                }
                if (i35 != 0) {
                    z27 = true;
                } else {
                    z27 = z20;
                }
                if (i36 != 0) {
                    z28 = false;
                } else {
                    z28 = z15;
                }
                if (i37 != 0) {
                    z29 = false;
                } else {
                    z29 = z16;
                }
                if (i38 != 0) {
                    z30 = true;
                } else {
                    z30 = z17;
                }
                float f12 = LogSeverity.NOTICE_VALUE;
                gVar = l1.m.f39353a;
                if (i24 != 0) {
                    objQ9 = sVar4.Q();
                    if (objQ9 == gVar) {
                        objQ9 = new bq.u(5);
                        sVar4.o0(objQ9);
                    }
                    aVar7 = (fz.a) objQ9;
                } else {
                    aVar7 = aVar2;
                }
                if (i27 != 0) {
                    objQ8 = sVar4.Q();
                    if (objQ8 == gVar) {
                        objQ8 = new bq.u(5);
                        sVar4.o0(objQ8);
                    }
                    aVar8 = (fz.a) objQ8;
                } else {
                    aVar8 = aVar3;
                }
                jC = ct.c.c(sVar4);
                aVar9 = aVar8;
                cVar = (v3.c) sVar4.j(z2.g1.f58547h);
                objQ = sVar4.Q();
                if (objQ == gVar) {
                    objV = defpackage.e.v(0, sVar4);
                } else {
                    objV = objQ;
                }
                a1Var = (l1.a1) objV;
                z1.o oVar = z1.o.f58481a;
                z31 = z19;
                z1.r rVarD = j0.e2.d(oVar, 1.0f);
                z32 = z27;
                w2.q0 q0VarD = j0.o.d(z1.c.H, false);
                aVar10 = aVar7;
                iHashCode = Long.hashCode(sVar4.T);
                l1.q1 q1VarL = sVar4.l();
                z1.r rVarC = z1.a.c(sVar4, rVarD);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar4.h0();
                if (sVar4.S) {
                    sVar4.k(iVar);
                } else {
                    sVar4.r0();
                }
                y2.h hVar2 = y2.j.f56917f;
                l1.t.J(hVar2, q0VarD, sVar4);
                y2.h hVar3 = y2.j.f56916e;
                l1.t.J(hVar3, q1VarL, sVar4);
                hVar = y2.j.f56918g;
                if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar4, iHashCode, hVar);
                }
                y2.h hVar4 = y2.j.f56915d;
                l1.t.J(hVar4, rVarC, sVar4);
                z1.r rVarH = d0.n.h(j0.e2.e(j0.e2.i(oVar, f12, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), ((h1.s1) sVar4.j(h1.v1.f31180a)).f31035r, r0.f.d(10));
                objQ2 = sVar4.Q();
                if (objQ2 == gVar) {
                    objQ2 = new a2(a1Var, 1);
                    sVar4.o0(objQ2);
                }
                z1.r rVarN = w2.a0.n(rVarH, (fz.c) objQ2);
                j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar4, 0);
                iHashCode2 = Long.hashCode(sVar4.T);
                l1.q1 q1VarL2 = sVar4.l();
                z1.r rVarC2 = z1.a.c(sVar4, rVarN);
                sVar4.h0();
                if (sVar4.S) {
                    sVar4.k(iVar);
                } else {
                    sVar4.r0();
                }
                l1.t.J(hVar2, uVarA, sVar4);
                l1.t.J(hVar3, q1VarL2, sVar4);
                if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar4, iHashCode2, hVar);
                }
                l1.t.J(hVar4, rVarC2, sVar4);
                z1.r rVarA = j0.v.a(oVar, 1.0f);
                boolean zF = sVar4.f(cVar) | sVar4.h(optionWords);
                if ((i19 & 112) == 32) {
                    z33 = true;
                } else {
                    z33 = false;
                }
                boolean z46 = zF | z33;
                if ((i19 & 7168) == 2048) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                boolean z47 = z46 | z34;
                if ((i29 & 112) == 32) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                boolean zE = z47 | z35 | sVar4.e(jC);
                if ((i19 & 458752) == 131072) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                z37 = zE | z36;
                objQ3 = sVar4.Q();
                if (!z37 || objQ3 == gVar) {
                    sVar2 = sVar4;
                    i30 = i19;
                    fz.c cVar2 = new fz.c() { // from class: bt.k2
                        @Override // fz.c
                        public final Object invoke(Object obj) {
                            l0.h LazyColumn = (l0.h) obj;
                            kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                            l0.h.p(LazyColumn, null, b.f5184h, 3);
                            final List list = optionWords;
                            final v3.c cVar3 = cVar;
                            final l1.a1 a1Var2 = a1Var;
                            final int i41 = i11;
                            final boolean z48 = z12;
                            final fz.c cVar4 = onClickOption;
                            final long j11 = jC;
                            final boolean z49 = z32;
                            l0.h.p(LazyColumn, null, new t1.d(new fz.f() { // from class: bt.r2
                                /* JADX WARN: Code duplicated, block: B:49:0x012c  */
                                @Override // fz.f
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    int iL;
                                    boolean z50;
                                    Object next;
                                    l0.c item = (l0.c) obj2;
                                    l1.n nVar2 = (l1.n) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    kotlin.jvm.internal.m.f(item, "$this$item");
                                    boolean z51 = true;
                                    l1.s sVar5 = (l1.s) nVar2;
                                    if (sVar5.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        l1.h1 h1Var = (l1.h1) a1Var2;
                                        boolean zD = sVar5.d(h1Var.l());
                                        Object objQ10 = sVar5.Q();
                                        v3.c cVar5 = cVar3;
                                        l1.g gVar3 = l1.m.f39353a;
                                        if (zD || objQ10 == gVar3) {
                                            if (h1Var.l() > 0) {
                                                iL = (int) ((h1Var.l() - cVar5.e0(24)) / cVar5.e0(64));
                                                if (iL < 1) {
                                                    iL = 1;
                                                }
                                            } else {
                                                iL = 0;
                                            }
                                            objQ10 = Integer.valueOf(iL);
                                            sVar5.o0(objQ10);
                                        }
                                        int iIntValue2 = ((Number) objQ10).intValue();
                                        if (iIntValue2 > 0) {
                                            List list2 = list;
                                            if (list2.isEmpty()) {
                                                z50 = false;
                                                sVar5.d0(3980360);
                                            } else {
                                                sVar5.d0(42848780);
                                                final float fE0 = cVar5.e0(10);
                                                int i42 = iIntValue2 < 1 ? 1 : iIntValue2;
                                                ArrayList arrayListG1 = ry.m.g1(list2, i42, i42);
                                                int size = arrayListG1.size();
                                                int i43 = 0;
                                                final int i44 = 0;
                                                while (i43 < size) {
                                                    Object obj5 = arrayListG1.get(i43);
                                                    i43++;
                                                    int i45 = i44 + 1;
                                                    if (i44 < 0) {
                                                        ns.o.V();
                                                        throw null;
                                                    }
                                                    final List list3 = (List) obj5;
                                                    boolean zF2 = sVar5.f(list3);
                                                    Object objQ11 = sVar5.Q();
                                                    if (zF2 || objQ11 == gVar3) {
                                                        Iterator it = list3.iterator();
                                                        do {
                                                            if (!it.hasNext()) {
                                                                next = null;
                                                                break;
                                                            }
                                                            next = it.next();
                                                        } while (((CourseWord) next).getSelectedState() != OptionItemSelectedState.DEFAULT);
                                                        objQ11 = Boolean.valueOf(next == null ? z51 : false);
                                                        sVar5.o0(objQ11);
                                                    }
                                                    boolean zBooleanValue = ((Boolean) objQ11).booleanValue() ^ z51;
                                                    a0.l1 l1VarD = a0.f1.d(null, 15);
                                                    a0.m1 m1VarL = a0.f1.l(null, 15);
                                                    final int i46 = i41;
                                                    final boolean z52 = z48;
                                                    final fz.c cVar6 = cVar4;
                                                    final long j12 = j11;
                                                    final int i47 = iIntValue2;
                                                    final boolean z53 = z49;
                                                    a0.j0.c(zBooleanValue, null, l1VarD, m1VarL, null, t1.e.d(-808509330, new fz.f() { // from class: bt.s2
                                                        @Override // fz.f
                                                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                            OptionItemSelectedState optionItemSelectedState;
                                                            int i48;
                                                            long jX;
                                                            l1.b3 b3VarA;
                                                            long jT;
                                                            l1.b3 b3VarA2;
                                                            a0.k0 AnimatedVisibility = (a0.k0) obj6;
                                                            l1.n nVar3 = (l1.n) obj7;
                                                            ((Integer) obj8).getClass();
                                                            kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
                                                            z1.o oVar2 = z1.o.f58481a;
                                                            z1.r rVarX = j0.e2.x(j0.c.B(oVar2, 12, 7), 2);
                                                            j0.a2 a2VarA = j0.z1.a(j0.i.g(8), z1.c.L, nVar3, 6);
                                                            l1.s sVar6 = (l1.s) nVar3;
                                                            int iHashCode4 = Long.hashCode(sVar6.T);
                                                            l1.q1 q1VarL3 = sVar6.l();
                                                            z1.r rVarC3 = z1.a.c(nVar3, rVarX);
                                                            y2.k.J.getClass();
                                                            y2.i iVar2 = y2.j.f56913b;
                                                            sVar6.h0();
                                                            if (sVar6.S) {
                                                                sVar6.k(iVar2);
                                                            } else {
                                                                sVar6.r0();
                                                            }
                                                            l1.t.J(y2.j.f56917f, a2VarA, nVar3);
                                                            l1.t.J(y2.j.f56916e, q1VarL3, nVar3);
                                                            y2.h hVar5 = y2.j.f56918g;
                                                            if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode4))) {
                                                                defpackage.e.A(iHashCode4, sVar6, iHashCode4, hVar5);
                                                            }
                                                            l1.t.J(y2.j.f56915d, rVarC3, nVar3);
                                                            sVar6.d0(2082684172);
                                                            Iterator it2 = list3.iterator();
                                                            boolean z54 = false;
                                                            int i49 = 0;
                                                            while (it2.hasNext()) {
                                                                int i50 = i49 + 1;
                                                                final CourseWord courseWord = (CourseWord) it2.next();
                                                                final int i51 = (i44 * i47) + i49;
                                                                boolean zE2 = sVar6.e(courseWord.getWordId());
                                                                Object objQ12 = sVar6.Q();
                                                                l1.g gVar4 = l1.m.f39353a;
                                                                if (zE2 || objQ12 == gVar4) {
                                                                    objQ12 = new p0.c();
                                                                    sVar6.o0(objQ12);
                                                                }
                                                                final p0.c cVar7 = (p0.c) objQ12;
                                                                boolean zE3 = sVar6.e(courseWord.getWordId());
                                                                Object objQ13 = sVar6.Q();
                                                                if (zE3 || objQ13 == gVar4) {
                                                                    objQ13 = l1.t.B(new v3.l(0L));
                                                                    sVar6.o0(objQ13);
                                                                }
                                                                final l1.b1 b1Var = (l1.b1) objQ13;
                                                                OptionItemSelectedState selectedState = courseWord.getSelectedState();
                                                                OptionItemSelectedState optionItemSelectedState2 = OptionItemSelectedState.DEFAULT;
                                                                int i52 = i46;
                                                                if (selectedState != optionItemSelectedState2) {
                                                                    sVar6.d0(139158446);
                                                                    optionItemSelectedState = optionItemSelectedState2;
                                                                    i48 = i52;
                                                                    b3VarA = a0.t1.a(((h1.s1) ((l1.s) nVar3).j(h1.v1.f31180a)).A, null, BuildConfig.VERSION_NAME, nVar3, 384, 10);
                                                                    sVar6.p(z54);
                                                                } else {
                                                                    optionItemSelectedState = optionItemSelectedState2;
                                                                    i48 = i52;
                                                                    sVar6.d0(139494114);
                                                                    if (i48 == i51) {
                                                                        sVar6.d0(2082715390);
                                                                        jX = ob.f.x((h1.s1) ((l1.s) nVar3).j(h1.v1.f31180a), nVar3);
                                                                    } else {
                                                                        sVar6.d0(2082717041);
                                                                        jX = ((h1.s1) ((l1.s) nVar3).j(h1.v1.f31180a)).f31033p;
                                                                    }
                                                                    sVar6.p(z54);
                                                                    b3VarA = a0.t1.a(jX, null, BuildConfig.VERSION_NAME, nVar3, 384, 10);
                                                                    sVar6.p(z54);
                                                                }
                                                                l1.b3 b3Var = b3VarA;
                                                                l1.n nVar4 = nVar3;
                                                                l1.b3 b3VarB = b0.h.b(i48 == i51 ? 1.1f : 1.0f, null, BuildConfig.VERSION_NAME, nVar4, 3072, 22);
                                                                if (courseWord.getSelectedState() != optionItemSelectedState) {
                                                                    sVar6.d0(140356782);
                                                                    b3VarA2 = a0.t1.a(((h1.s1) ((l1.s) nVar4).j(h1.v1.f31180a)).A, null, BuildConfig.VERSION_NAME, nVar4, 384, 10);
                                                                    sVar6.p(z54);
                                                                } else {
                                                                    sVar6.d0(140692574);
                                                                    if (i48 == i51) {
                                                                        sVar6.d0(2082754048);
                                                                        jT = ob.f.t((h1.s1) ((l1.s) nVar4).j(h1.v1.f31180a), nVar4);
                                                                    } else {
                                                                        sVar6.d0(2082755763);
                                                                        jT = ((h1.s1) ((l1.s) nVar4).j(h1.v1.f31180a)).f31034q;
                                                                    }
                                                                    sVar6.p(z54);
                                                                    b3VarA2 = a0.t1.a(jT, null, BuildConfig.VERSION_NAME, nVar4, 384, 10);
                                                                    sVar6.p(z54);
                                                                }
                                                                final l1.b3 b3Var2 = b3VarA2;
                                                                l1.c3 c3Var = h1.v1.f31180a;
                                                                l1.s sVar7 = (l1.s) nVar4;
                                                                float f13 = 10;
                                                                z1.r rVarH2 = d0.n.h(oVar2, ((h1.s1) sVar7.j(c3Var)).A, r0.f.d(f13));
                                                                w2.q0 q0VarD2 = j0.o.d(z1.c.f58463a, z54);
                                                                int iHashCode5 = Long.hashCode(sVar6.T);
                                                                l1.q1 q1VarL4 = sVar6.l();
                                                                z1.r rVarC4 = z1.a.c(nVar4, rVarH2);
                                                                y2.k.J.getClass();
                                                                y2.i iVar3 = y2.j.f56913b;
                                                                sVar6.h0();
                                                                final int i53 = i48;
                                                                if (sVar6.S) {
                                                                    sVar6.k(iVar3);
                                                                } else {
                                                                    sVar6.r0();
                                                                }
                                                                l1.t.J(y2.j.f56917f, q0VarD2, nVar4);
                                                                l1.t.J(y2.j.f56916e, q1VarL4, nVar4);
                                                                y2.h hVar6 = y2.j.f56918g;
                                                                if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode5))) {
                                                                    defpackage.e.A(iHashCode5, sVar6, iHashCode5, hVar6);
                                                                }
                                                                l1.t.J(y2.j.f56915d, rVarC4, nVar4);
                                                                r0.e eVarD = r0.f.d(f13);
                                                                h1.t0 t0VarP = h1.k7.p(((g2.x) b3Var.getValue()).f28624a, nVar4, 0);
                                                                d0.v vVarA = d0.n.a(((h1.s1) sVar7.j(c3Var)).A, 2);
                                                                float f14 = 56;
                                                                z1.r rVarA2 = p0.d.a(j0.e2.g(j0.e2.s(oVar2, f14), f14), cVar7);
                                                                boolean zF3 = sVar6.f(b1Var);
                                                                Object objQ14 = sVar6.Q();
                                                                if (zF3 || objQ14 == gVar4) {
                                                                    objQ14 = new bp.h0(3, b1Var);
                                                                    sVar6.o0(objQ14);
                                                                }
                                                                z1.r rVarA3 = d2.h.a(g2.f0.s(w2.a0.n(rVarA2, (fz.c) objQ14), ((Number) b3VarB.getValue()).floatValue(), ((Number) b3VarB.getValue()).floatValue(), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 524284), courseWord.getSelectedState() != optionItemSelectedState ? CropImageView.DEFAULT_ASPECT_RATIO : 1.0f);
                                                                final boolean z55 = z52;
                                                                final fz.c cVar8 = cVar6;
                                                                final float f15 = fE0;
                                                                final long j13 = j12;
                                                                final boolean z56 = z53;
                                                                h1.k7.d(rVarA3, eVarD, t0VarP, null, vVarA, t1.e.d(-485259693, new fz.f() { // from class: bt.t2
                                                                    @Override // fz.f
                                                                    public final Object invoke(Object obj9, Object obj10, Object obj11) {
                                                                        j0.v Card = (j0.v) obj9;
                                                                        l1.n nVar5 = (l1.n) obj10;
                                                                        int iIntValue3 = ((Integer) obj11).intValue();
                                                                        kotlin.jvm.internal.m.f(Card, "$this$Card");
                                                                        l1.s sVar8 = (l1.s) nVar5;
                                                                        if (sVar8.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                            z1.o oVar3 = z1.o.f58481a;
                                                                            z1.r rVarD2 = j0.e2.d(oVar3, 1.0f);
                                                                            boolean z57 = z55;
                                                                            CourseWord courseWord2 = courseWord;
                                                                            boolean z58 = z57 && courseWord2.getSelectedState() == OptionItemSelectedState.DEFAULT;
                                                                            fz.c cVar9 = cVar8;
                                                                            boolean zF4 = sVar8.f(cVar9) | sVar8.h(courseWord2);
                                                                            Object objQ15 = sVar8.Q();
                                                                            l1.g gVar5 = l1.m.f39353a;
                                                                            if (zF4 || objQ15 == gVar5) {
                                                                                objQ15 = new s0(cVar9, courseWord2, 3);
                                                                                sVar8.o0(objQ15);
                                                                            }
                                                                            z1.r rVarQ = iu.k.q(6, 6, (fz.a) objQ15, sVar8, rVarD2, z58);
                                                                            w2.q0 q0VarD3 = j0.o.d(z1.c.f58467e, false);
                                                                            int iHashCode6 = Long.hashCode(sVar8.T);
                                                                            l1.q1 q1VarL5 = sVar8.l();
                                                                            z1.r rVarC5 = z1.a.c(sVar8, rVarQ);
                                                                            y2.k.J.getClass();
                                                                            y2.i iVar4 = y2.j.f56913b;
                                                                            sVar8.h0();
                                                                            if (sVar8.S) {
                                                                                sVar8.k(iVar4);
                                                                            } else {
                                                                                sVar8.r0();
                                                                            }
                                                                            l1.t.J(y2.j.f56917f, q0VarD3, sVar8);
                                                                            l1.t.J(y2.j.f56916e, q1VarL5, sVar8);
                                                                            y2.h hVar7 = y2.j.f56918g;
                                                                            if (sVar8.S || !kotlin.jvm.internal.m.a(sVar8.Q(), Integer.valueOf(iHashCode6))) {
                                                                                defpackage.e.A(iHashCode6, sVar8, iHashCode6, hVar7);
                                                                            }
                                                                            l1.t.J(y2.j.f56915d, rVarC5, sVar8);
                                                                            int i54 = i53;
                                                                            Integer numValueOf = Integer.valueOf(i54);
                                                                            l1.b1 b1Var2 = b1Var;
                                                                            v3.l lVar = new v3.l(((v3.l) b1Var2.getValue()).f53498a);
                                                                            boolean zD2 = sVar8.d(i54);
                                                                            int i55 = i51;
                                                                            boolean zD3 = zD2 | sVar8.d(i55) | sVar8.f(b1Var2);
                                                                            float f16 = f15;
                                                                            boolean zC = zD3 | sVar8.c(f16);
                                                                            p0.c cVar10 = cVar7;
                                                                            boolean zH = zC | sVar8.h(cVar10);
                                                                            Object objQ16 = sVar8.Q();
                                                                            if (zH || objQ16 == gVar5) {
                                                                                objQ16 = new v2(i54, i55, f16, cVar10, b1Var2, null);
                                                                                sVar8.o0(objQ16);
                                                                            }
                                                                            l1.t.g(numValueOf, lVar, (fz.e) objQ16, sVar8);
                                                                            sVar8.a0(2043631539, new qy.l(Long.valueOf(courseWord2.getWordId()), courseWord2.getSelectedState()));
                                                                            float f17 = 2;
                                                                            dt.g4.b(CourseWord.copy$default(courseWord2, 0L, courseWord2.getOriginalWord(), courseWord2.getZhuYin(), courseWord2.getLuoMa(), null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -15, 63, null), j3.y0.a(ct.c.b(sVar8), ((g2.x) b3Var2.getValue()).f28624a, j13, n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), j0.c.A(oVar3, f17), false, new v3.f(56 - f17), 57 == ((Number) sVar8.j(ju.f.f37370d)).intValue(), false, !z56, 1, null, sVar8, 100688256, 584);
                                                                            sVar8.p(false);
                                                                            sVar8.p(true);
                                                                        } else {
                                                                            sVar8.W();
                                                                        }
                                                                        return qy.b0.f48488a;
                                                                    }
                                                                }, nVar4), nVar4, 196608, 8);
                                                                nVar3 = nVar4;
                                                                sVar6.p(true);
                                                                it2 = it2;
                                                                i49 = i50;
                                                                z54 = false;
                                                            }
                                                            sVar6.p(z54);
                                                            sVar6.p(true);
                                                            return qy.b0.f48488a;
                                                        }
                                                    }, sVar5), sVar5, 1600512, 18);
                                                    gVar3 = gVar3;
                                                    iIntValue2 = i47;
                                                    i44 = i45;
                                                    z51 = true;
                                                }
                                                z50 = false;
                                            }
                                        } else {
                                            z50 = false;
                                            sVar5.d0(3980360);
                                        }
                                        sVar5.p(z50);
                                    } else {
                                        sVar5.W();
                                    }
                                    return qy.b0.f48488a;
                                }
                            }, true, -1421946918), 3);
                            l0.h.p(LazyColumn, null, b.f5185i, 3);
                            return qy.b0.f48488a;
                        }
                    };
                    sVar2.o0(cVar2);
                    objQ3 = cVar2;
                } else {
                    sVar2 = sVar4;
                    i30 = i19;
                }
                sVar3 = sVar2;
                ue.f.a(rVarA, null, null, null, null, null, false, null, (fz.c) objQ3, sVar3, 0, 510);
                z1.r rVarE = j0.e2.e(oVar, 1.0f);
                j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.L, sVar3, 0);
                iHashCode3 = Long.hashCode(sVar3.T);
                l1.q1 q1VarL3 = sVar3.l();
                z1.r rVarC3 = z1.a.c(sVar3, rVarE);
                sVar3.h0();
                if (sVar3.S) {
                    sVar3.k(iVar);
                } else {
                    sVar3.r0();
                }
                l1.t.J(hVar2, a2VarA, sVar3);
                l1.t.J(hVar3, q1VarL3, sVar3);
                if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode3))) {
                    defpackage.e.A(iHashCode3, sVar3, iHashCode3, hVar);
                }
                l1.t.J(hVar4, rVarC3, sVar3);
                if (z30) {
                    sVar3.d0(-2112655727);
                    i31 = i29;
                    if ((i31 & 896) == 256) {
                        z45 = true;
                    } else {
                        z45 = false;
                    }
                    objQ7 = sVar3.Q();
                    gVar2 = gVar;
                    if (!z45 || objQ7 == gVar2) {
                        onClickSwitchKeyboard = aVar;
                        objQ7 = new at.r(17, onClickSwitchKeyboard);
                        sVar3.o0(objQ7);
                    } else {
                        onClickSwitchKeyboard = aVar;
                    }
                    h1.k7.h((fz.a) objQ7, null, z12, null, b.f5186j, sVar3, ((i30 >> 3) & 896) | 196608, 26);
                    z38 = false;
                } else {
                    onClickSwitchKeyboard = aVar;
                    i31 = i29;
                    gVar2 = gVar;
                    z38 = false;
                    sVar3.d0(2134075104);
                }
                sVar3.p(z38);
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                w4.c.r(1.0f, true, sVar3);
                if (z28) {
                    sVar3.d0(-2112213419);
                    if ((3670016 & i31) == 1048576) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    objQ6 = sVar3.Q();
                    if (!z44 || objQ6 == gVar2) {
                        aVar11 = aVar9;
                        objQ6 = new at.r(18, aVar11);
                        sVar3.o0(objQ6);
                    } else {
                        aVar11 = aVar9;
                    }
                    h1.k7.h((fz.a) objQ6, null, z12, null, t1.e.d(1512715059, new at.m(z32, 1), sVar3), sVar3, ((i30 >> 3) & 896) | 196608, 26);
                    z39 = false;
                } else {
                    aVar11 = aVar9;
                    z39 = false;
                    sVar3.d0(2134075104);
                }
                sVar3.p(z39);
                if (z29) {
                    sVar3.d0(-2111338475);
                    if ((i31 & 458752) == 131072) {
                        z43 = true;
                    } else {
                        z43 = false;
                    }
                    objQ5 = sVar3.Q();
                    if (!z43 || objQ5 == gVar2) {
                        aVar12 = aVar10;
                        objQ5 = new at.r(19, aVar12);
                        sVar3.o0(objQ5);
                    } else {
                        aVar12 = aVar10;
                    }
                    z40 = z31;
                    h1.k7.h((fz.a) objQ5, null, z12, null, t1.e.d(1824821266, new at.m(z40, 2), sVar3), sVar3, ((i30 >> 3) & 896) | 196608, 26);
                    z41 = false;
                } else {
                    aVar12 = aVar10;
                    z40 = z31;
                    z41 = false;
                    sVar3.d0(2134075104);
                }
                sVar3.p(z41);
                if (z18) {
                    sVar3.d0(-2110475807);
                    int i41 = i30 >> 6;
                    f(z11, z12, onClickHint, null, sVar3, (i41 & 112) | (i41 & 14) | 24576 | ((i31 >> 3) & 896));
                    z42 = false;
                } else {
                    z42 = false;
                    sVar3.d0(2134075104);
                }
                sVar3.p(z42);
                if ((57344 & i31) == 16384) {
                    z42 = true;
                }
                objQ4 = sVar3.Q();
                if (!z42 || objQ4 == gVar2) {
                    aVar4 = onClickDel;
                    objQ4 = new at.r(20, aVar4);
                    sVar3.o0(objQ4);
                } else {
                    aVar4 = onClickDel;
                }
                h1.k7.h((fz.a) objQ4, null, z12, null, b.f5188l, sVar3, ((i30 >> 3) & 896) | 196608, 26);
                sVar = sVar3;
                com.google.android.material.datepicker.d.B(sVar, true, true, true);
                z25 = z32;
                aVar6 = aVar11;
                aVar5 = aVar12;
                z24 = z40;
                f11 = f12;
                z26 = z28;
                z22 = z29;
                z23 = z30;
            } else {
                sVar = sVar4;
                aVar4 = onClickDel;
                sVar.W();
                z22 = z16;
                z23 = z17;
                f11 = f5;
                aVar5 = aVar2;
                aVar6 = aVar3;
                z24 = z19;
                z25 = z20;
                z26 = z15;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                final fz.a aVar13 = aVar4;
                x1VarT.f39502d = new fz.e() { // from class: bt.j2
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM = l1.t.M(i12 | 1);
                        d3.b(optionWords, i11, z11, z12, z24, z25, z26, z22, z23, z18, f11, onClickOption, onClickSwitchKeyboard, onClickHint, aVar13, aVar5, aVar6, (l1.n) obj, iM, i13);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i17 |= 100663296;
        if (sVar4.g(z18)) {
            i18 = 536870912;
        } else {
            i18 = 268435456;
        }
        i19 = i17 | i18;
        if (sVar4.h(onClickOption)) {
            i21 = 32;
        } else {
            i21 = 16;
        }
        int i310 = 6 | i21;
        if (sVar4.h(onClickSwitchKeyboard)) {
            i22 = 256;
        } else {
            i22 = 128;
        }
        int i42 = i310 | i22 | (sVar4.h(onClickHint) ? 2048 : 1024);
        if (sVar4.h(onClickDel)) {
            i34 = 16384;
        }
        i23 = i42 | i34;
        i24 = i13 & 32768;
        if (i24 != 0) {
            i26 = i23 | 196608;
        } else {
            if (sVar4.h(aVar2)) {
                i25 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
            } else {
                i25 = 65536;
            }
            i26 = i23 | i25;
        }
        i27 = i13 & 65536;
        if (i27 != 0) {
            i28 = i26 | 1572864;
        } else {
            i28 = i26 | (sVar4.h(aVar3) ? 1048576 : 524288);
        }
        i29 = i28;
        if ((i19 & 306783379) == 306783378) {
            z21 = true;
        } else {
            z21 = true;
        }
        if (sVar4.T(i19 & 1, z21)) {
            if (i33 != 0) {
                z19 = false;
            }
            if (i35 != 0) {
                z27 = true;
            } else {
                z27 = z20;
            }
            if (i36 != 0) {
                z28 = false;
            } else {
                z28 = z15;
            }
            if (i37 != 0) {
                z29 = false;
            } else {
                z29 = z16;
            }
            if (i38 != 0) {
                z30 = true;
            } else {
                z30 = z17;
            }
            float f13 = LogSeverity.NOTICE_VALUE;
            gVar = l1.m.f39353a;
            if (i24 != 0) {
                objQ9 = sVar4.Q();
                if (objQ9 == gVar) {
                    objQ9 = new bq.u(5);
                    sVar4.o0(objQ9);
                }
                aVar7 = (fz.a) objQ9;
            } else {
                aVar7 = aVar2;
            }
            if (i27 != 0) {
                objQ8 = sVar4.Q();
                if (objQ8 == gVar) {
                    objQ8 = new bq.u(5);
                    sVar4.o0(objQ8);
                }
                aVar8 = (fz.a) objQ8;
            } else {
                aVar8 = aVar3;
            }
            jC = ct.c.c(sVar4);
            aVar9 = aVar8;
            cVar = (v3.c) sVar4.j(z2.g1.f58547h);
            objQ = sVar4.Q();
            if (objQ == gVar) {
                objV = defpackage.e.v(0, sVar4);
            } else {
                objV = objQ;
            }
            a1Var = (l1.a1) objV;
            z1.o oVar2 = z1.o.f58481a;
            z31 = z19;
            z1.r rVarD2 = j0.e2.d(oVar2, 1.0f);
            z32 = z27;
            w2.q0 q0VarD2 = j0.o.d(z1.c.H, false);
            aVar10 = aVar7;
            iHashCode = Long.hashCode(sVar4.T);
            l1.q1 q1VarL4 = sVar4.l();
            z1.r rVarC4 = z1.a.c(sVar4, rVarD2);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar4.h0();
            if (sVar4.S) {
                sVar4.k(iVar);
            } else {
                sVar4.r0();
            }
            y2.h hVar5 = y2.j.f56917f;
            l1.t.J(hVar5, q0VarD2, sVar4);
            y2.h hVar6 = y2.j.f56916e;
            l1.t.J(hVar6, q1VarL4, sVar4);
            hVar = y2.j.f56918g;
            if (sVar4.S) {
                defpackage.e.A(iHashCode, sVar4, iHashCode, hVar);
            } else {
                defpackage.e.A(iHashCode, sVar4, iHashCode, hVar);
            }
            y2.h hVar7 = y2.j.f56915d;
            l1.t.J(hVar7, rVarC4, sVar4);
            z1.r rVarH2 = d0.n.h(j0.e2.e(j0.e2.i(oVar2, f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), ((h1.s1) sVar4.j(h1.v1.f31180a)).f31035r, r0.f.d(10));
            objQ2 = sVar4.Q();
            if (objQ2 == gVar) {
                objQ2 = new a2(a1Var, 1);
                sVar4.o0(objQ2);
            }
            z1.r rVarN2 = w2.a0.n(rVarH2, (fz.c) objQ2);
            j0.u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.O, sVar4, 0);
            iHashCode2 = Long.hashCode(sVar4.T);
            l1.q1 q1VarL5 = sVar4.l();
            z1.r rVarC5 = z1.a.c(sVar4, rVarN2);
            sVar4.h0();
            if (sVar4.S) {
                sVar4.k(iVar);
            } else {
                sVar4.r0();
            }
            l1.t.J(hVar5, uVarA2, sVar4);
            l1.t.J(hVar6, q1VarL5, sVar4);
            if (sVar4.S) {
                defpackage.e.A(iHashCode2, sVar4, iHashCode2, hVar);
            } else {
                defpackage.e.A(iHashCode2, sVar4, iHashCode2, hVar);
            }
            l1.t.J(hVar7, rVarC5, sVar4);
            z1.r rVarA2 = j0.v.a(oVar2, 1.0f);
            boolean zF2 = sVar4.f(cVar) | sVar4.h(optionWords);
            if ((i19 & 112) == 32) {
                z33 = true;
            } else {
                z33 = false;
            }
            boolean z48 = zF2 | z33;
            if ((i19 & 7168) == 2048) {
                z34 = true;
            } else {
                z34 = false;
            }
            boolean z49 = z48 | z34;
            if ((i29 & 112) == 32) {
                z35 = true;
            } else {
                z35 = false;
            }
            boolean zE2 = z49 | z35 | sVar4.e(jC);
            if ((i19 & 458752) == 131072) {
                z36 = true;
            } else {
                z36 = false;
            }
            z37 = zE2 | z36;
            objQ3 = sVar4.Q();
            if (z37) {
                sVar2 = sVar4;
                i30 = i19;
                fz.c cVar3 = new fz.c() { // from class: bt.k2
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        l0.h LazyColumn = (l0.h) obj;
                        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                        l0.h.p(LazyColumn, null, b.f5184h, 3);
                        final List list = optionWords;
                        final v3.c cVar4 = cVar;
                        final l1.a1 a1Var2 = a1Var;
                        final int i43 = i11;
                        final boolean z410 = z12;
                        final fz.c cVar5 = onClickOption;
                        final long j11 = jC;
                        final boolean z411 = z32;
                        l0.h.p(LazyColumn, null, new t1.d(new fz.f() { // from class: bt.r2
                            /* JADX WARN: Code duplicated, block: B:49:0x012c  */
                            @Override // fz.f
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                int iL;
                                boolean z50;
                                Object next;
                                l0.c item = (l0.c) obj2;
                                l1.n nVar2 = (l1.n) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                kotlin.jvm.internal.m.f(item, "$this$item");
                                boolean z51 = true;
                                l1.s sVar5 = (l1.s) nVar2;
                                if (sVar5.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    l1.h1 h1Var = (l1.h1) a1Var2;
                                    boolean zD = sVar5.d(h1Var.l());
                                    Object objQ10 = sVar5.Q();
                                    v3.c cVar6 = cVar4;
                                    l1.g gVar3 = l1.m.f39353a;
                                    if (zD || objQ10 == gVar3) {
                                        if (h1Var.l() > 0) {
                                            iL = (int) ((h1Var.l() - cVar6.e0(24)) / cVar6.e0(64));
                                            if (iL < 1) {
                                                iL = 1;
                                            }
                                        } else {
                                            iL = 0;
                                        }
                                        objQ10 = Integer.valueOf(iL);
                                        sVar5.o0(objQ10);
                                    }
                                    int iIntValue2 = ((Number) objQ10).intValue();
                                    if (iIntValue2 > 0) {
                                        List list2 = list;
                                        if (list2.isEmpty()) {
                                            z50 = false;
                                            sVar5.d0(3980360);
                                        } else {
                                            sVar5.d0(42848780);
                                            final float fE0 = cVar6.e0(10);
                                            int i44 = iIntValue2 < 1 ? 1 : iIntValue2;
                                            ArrayList arrayListG1 = ry.m.g1(list2, i44, i44);
                                            int size = arrayListG1.size();
                                            int i45 = 0;
                                            final int i46 = 0;
                                            while (i45 < size) {
                                                Object obj5 = arrayListG1.get(i45);
                                                i45++;
                                                int i47 = i46 + 1;
                                                if (i46 < 0) {
                                                    ns.o.V();
                                                    throw null;
                                                }
                                                final List list3 = (List) obj5;
                                                boolean zF3 = sVar5.f(list3);
                                                Object objQ11 = sVar5.Q();
                                                if (zF3 || objQ11 == gVar3) {
                                                    Iterator it = list3.iterator();
                                                    do {
                                                        if (!it.hasNext()) {
                                                            next = null;
                                                            break;
                                                        }
                                                        next = it.next();
                                                    } while (((CourseWord) next).getSelectedState() != OptionItemSelectedState.DEFAULT);
                                                    objQ11 = Boolean.valueOf(next == null ? z51 : false);
                                                    sVar5.o0(objQ11);
                                                }
                                                boolean zBooleanValue = ((Boolean) objQ11).booleanValue() ^ z51;
                                                a0.l1 l1VarD = a0.f1.d(null, 15);
                                                a0.m1 m1VarL = a0.f1.l(null, 15);
                                                final int i48 = i43;
                                                final boolean z52 = z410;
                                                final fz.c cVar7 = cVar5;
                                                final long j12 = j11;
                                                final int i49 = iIntValue2;
                                                final boolean z53 = z411;
                                                a0.j0.c(zBooleanValue, null, l1VarD, m1VarL, null, t1.e.d(-808509330, new fz.f() { // from class: bt.s2
                                                    @Override // fz.f
                                                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                        OptionItemSelectedState optionItemSelectedState;
                                                        int i410;
                                                        long jX;
                                                        l1.b3 b3VarA;
                                                        long jT;
                                                        l1.b3 b3VarA2;
                                                        a0.k0 AnimatedVisibility = (a0.k0) obj6;
                                                        l1.n nVar3 = (l1.n) obj7;
                                                        ((Integer) obj8).getClass();
                                                        kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
                                                        z1.o oVar3 = z1.o.f58481a;
                                                        z1.r rVarX = j0.e2.x(j0.c.B(oVar3, 12, 7), 2);
                                                        j0.a2 a2VarA2 = j0.z1.a(j0.i.g(8), z1.c.L, nVar3, 6);
                                                        l1.s sVar6 = (l1.s) nVar3;
                                                        int iHashCode4 = Long.hashCode(sVar6.T);
                                                        l1.q1 q1VarL6 = sVar6.l();
                                                        z1.r rVarC6 = z1.a.c(nVar3, rVarX);
                                                        y2.k.J.getClass();
                                                        y2.i iVar2 = y2.j.f56913b;
                                                        sVar6.h0();
                                                        if (sVar6.S) {
                                                            sVar6.k(iVar2);
                                                        } else {
                                                            sVar6.r0();
                                                        }
                                                        l1.t.J(y2.j.f56917f, a2VarA2, nVar3);
                                                        l1.t.J(y2.j.f56916e, q1VarL6, nVar3);
                                                        y2.h hVar8 = y2.j.f56918g;
                                                        if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode4))) {
                                                            defpackage.e.A(iHashCode4, sVar6, iHashCode4, hVar8);
                                                        }
                                                        l1.t.J(y2.j.f56915d, rVarC6, nVar3);
                                                        sVar6.d0(2082684172);
                                                        Iterator it2 = list3.iterator();
                                                        boolean z54 = false;
                                                        int i411 = 0;
                                                        while (it2.hasNext()) {
                                                            int i50 = i411 + 1;
                                                            final CourseWord courseWord = (CourseWord) it2.next();
                                                            final int i51 = (i46 * i49) + i411;
                                                            boolean zE3 = sVar6.e(courseWord.getWordId());
                                                            Object objQ12 = sVar6.Q();
                                                            l1.g gVar4 = l1.m.f39353a;
                                                            if (zE3 || objQ12 == gVar4) {
                                                                objQ12 = new p0.c();
                                                                sVar6.o0(objQ12);
                                                            }
                                                            final p0.c cVar8 = (p0.c) objQ12;
                                                            boolean zE4 = sVar6.e(courseWord.getWordId());
                                                            Object objQ13 = sVar6.Q();
                                                            if (zE4 || objQ13 == gVar4) {
                                                                objQ13 = l1.t.B(new v3.l(0L));
                                                                sVar6.o0(objQ13);
                                                            }
                                                            final l1.b1 b1Var = (l1.b1) objQ13;
                                                            OptionItemSelectedState selectedState = courseWord.getSelectedState();
                                                            OptionItemSelectedState optionItemSelectedState2 = OptionItemSelectedState.DEFAULT;
                                                            int i52 = i48;
                                                            if (selectedState != optionItemSelectedState2) {
                                                                sVar6.d0(139158446);
                                                                optionItemSelectedState = optionItemSelectedState2;
                                                                i410 = i52;
                                                                b3VarA = a0.t1.a(((h1.s1) ((l1.s) nVar3).j(h1.v1.f31180a)).A, null, BuildConfig.VERSION_NAME, nVar3, 384, 10);
                                                                sVar6.p(z54);
                                                            } else {
                                                                optionItemSelectedState = optionItemSelectedState2;
                                                                i410 = i52;
                                                                sVar6.d0(139494114);
                                                                if (i410 == i51) {
                                                                    sVar6.d0(2082715390);
                                                                    jX = ob.f.x((h1.s1) ((l1.s) nVar3).j(h1.v1.f31180a), nVar3);
                                                                } else {
                                                                    sVar6.d0(2082717041);
                                                                    jX = ((h1.s1) ((l1.s) nVar3).j(h1.v1.f31180a)).f31033p;
                                                                }
                                                                sVar6.p(z54);
                                                                b3VarA = a0.t1.a(jX, null, BuildConfig.VERSION_NAME, nVar3, 384, 10);
                                                                sVar6.p(z54);
                                                            }
                                                            l1.b3 b3Var = b3VarA;
                                                            l1.n nVar4 = nVar3;
                                                            l1.b3 b3VarB = b0.h.b(i410 == i51 ? 1.1f : 1.0f, null, BuildConfig.VERSION_NAME, nVar4, 3072, 22);
                                                            if (courseWord.getSelectedState() != optionItemSelectedState) {
                                                                sVar6.d0(140356782);
                                                                b3VarA2 = a0.t1.a(((h1.s1) ((l1.s) nVar4).j(h1.v1.f31180a)).A, null, BuildConfig.VERSION_NAME, nVar4, 384, 10);
                                                                sVar6.p(z54);
                                                            } else {
                                                                sVar6.d0(140692574);
                                                                if (i410 == i51) {
                                                                    sVar6.d0(2082754048);
                                                                    jT = ob.f.t((h1.s1) ((l1.s) nVar4).j(h1.v1.f31180a), nVar4);
                                                                } else {
                                                                    sVar6.d0(2082755763);
                                                                    jT = ((h1.s1) ((l1.s) nVar4).j(h1.v1.f31180a)).f31034q;
                                                                }
                                                                sVar6.p(z54);
                                                                b3VarA2 = a0.t1.a(jT, null, BuildConfig.VERSION_NAME, nVar4, 384, 10);
                                                                sVar6.p(z54);
                                                            }
                                                            final l1.b3 b3Var2 = b3VarA2;
                                                            l1.c3 c3Var = h1.v1.f31180a;
                                                            l1.s sVar7 = (l1.s) nVar4;
                                                            float f14 = 10;
                                                            z1.r rVarH3 = d0.n.h(oVar3, ((h1.s1) sVar7.j(c3Var)).A, r0.f.d(f14));
                                                            w2.q0 q0VarD3 = j0.o.d(z1.c.f58463a, z54);
                                                            int iHashCode5 = Long.hashCode(sVar6.T);
                                                            l1.q1 q1VarL7 = sVar6.l();
                                                            z1.r rVarC7 = z1.a.c(nVar4, rVarH3);
                                                            y2.k.J.getClass();
                                                            y2.i iVar3 = y2.j.f56913b;
                                                            sVar6.h0();
                                                            final int i53 = i410;
                                                            if (sVar6.S) {
                                                                sVar6.k(iVar3);
                                                            } else {
                                                                sVar6.r0();
                                                            }
                                                            l1.t.J(y2.j.f56917f, q0VarD3, nVar4);
                                                            l1.t.J(y2.j.f56916e, q1VarL7, nVar4);
                                                            y2.h hVar9 = y2.j.f56918g;
                                                            if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode5))) {
                                                                defpackage.e.A(iHashCode5, sVar6, iHashCode5, hVar9);
                                                            }
                                                            l1.t.J(y2.j.f56915d, rVarC7, nVar4);
                                                            r0.e eVarD = r0.f.d(f14);
                                                            h1.t0 t0VarP = h1.k7.p(((g2.x) b3Var.getValue()).f28624a, nVar4, 0);
                                                            d0.v vVarA = d0.n.a(((h1.s1) sVar7.j(c3Var)).A, 2);
                                                            float f15 = 56;
                                                            z1.r rVarA3 = p0.d.a(j0.e2.g(j0.e2.s(oVar3, f15), f15), cVar8);
                                                            boolean zF4 = sVar6.f(b1Var);
                                                            Object objQ14 = sVar6.Q();
                                                            if (zF4 || objQ14 == gVar4) {
                                                                objQ14 = new bp.h0(3, b1Var);
                                                                sVar6.o0(objQ14);
                                                            }
                                                            z1.r rVarA4 = d2.h.a(g2.f0.s(w2.a0.n(rVarA3, (fz.c) objQ14), ((Number) b3VarB.getValue()).floatValue(), ((Number) b3VarB.getValue()).floatValue(), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 524284), courseWord.getSelectedState() != optionItemSelectedState ? CropImageView.DEFAULT_ASPECT_RATIO : 1.0f);
                                                            final boolean z55 = z52;
                                                            final fz.c cVar9 = cVar7;
                                                            final float f16 = fE0;
                                                            final long j13 = j12;
                                                            final boolean z56 = z53;
                                                            h1.k7.d(rVarA4, eVarD, t0VarP, null, vVarA, t1.e.d(-485259693, new fz.f() { // from class: bt.t2
                                                                @Override // fz.f
                                                                public final Object invoke(Object obj9, Object obj10, Object obj11) {
                                                                    j0.v Card = (j0.v) obj9;
                                                                    l1.n nVar5 = (l1.n) obj10;
                                                                    int iIntValue3 = ((Integer) obj11).intValue();
                                                                    kotlin.jvm.internal.m.f(Card, "$this$Card");
                                                                    l1.s sVar8 = (l1.s) nVar5;
                                                                    if (sVar8.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                        z1.o oVar4 = z1.o.f58481a;
                                                                        z1.r rVarD3 = j0.e2.d(oVar4, 1.0f);
                                                                        boolean z57 = z55;
                                                                        CourseWord courseWord2 = courseWord;
                                                                        boolean z58 = z57 && courseWord2.getSelectedState() == OptionItemSelectedState.DEFAULT;
                                                                        fz.c cVar10 = cVar9;
                                                                        boolean zF5 = sVar8.f(cVar10) | sVar8.h(courseWord2);
                                                                        Object objQ15 = sVar8.Q();
                                                                        l1.g gVar5 = l1.m.f39353a;
                                                                        if (zF5 || objQ15 == gVar5) {
                                                                            objQ15 = new s0(cVar10, courseWord2, 3);
                                                                            sVar8.o0(objQ15);
                                                                        }
                                                                        z1.r rVarQ = iu.k.q(6, 6, (fz.a) objQ15, sVar8, rVarD3, z58);
                                                                        w2.q0 q0VarD4 = j0.o.d(z1.c.f58467e, false);
                                                                        int iHashCode6 = Long.hashCode(sVar8.T);
                                                                        l1.q1 q1VarL8 = sVar8.l();
                                                                        z1.r rVarC8 = z1.a.c(sVar8, rVarQ);
                                                                        y2.k.J.getClass();
                                                                        y2.i iVar4 = y2.j.f56913b;
                                                                        sVar8.h0();
                                                                        if (sVar8.S) {
                                                                            sVar8.k(iVar4);
                                                                        } else {
                                                                            sVar8.r0();
                                                                        }
                                                                        l1.t.J(y2.j.f56917f, q0VarD4, sVar8);
                                                                        l1.t.J(y2.j.f56916e, q1VarL8, sVar8);
                                                                        y2.h hVar10 = y2.j.f56918g;
                                                                        if (sVar8.S || !kotlin.jvm.internal.m.a(sVar8.Q(), Integer.valueOf(iHashCode6))) {
                                                                            defpackage.e.A(iHashCode6, sVar8, iHashCode6, hVar10);
                                                                        }
                                                                        l1.t.J(y2.j.f56915d, rVarC8, sVar8);
                                                                        int i54 = i53;
                                                                        Integer numValueOf = Integer.valueOf(i54);
                                                                        l1.b1 b1Var2 = b1Var;
                                                                        v3.l lVar = new v3.l(((v3.l) b1Var2.getValue()).f53498a);
                                                                        boolean zD2 = sVar8.d(i54);
                                                                        int i55 = i51;
                                                                        boolean zD3 = zD2 | sVar8.d(i55) | sVar8.f(b1Var2);
                                                                        float f17 = f16;
                                                                        boolean zC = zD3 | sVar8.c(f17);
                                                                        p0.c cVar11 = cVar8;
                                                                        boolean zH = zC | sVar8.h(cVar11);
                                                                        Object objQ16 = sVar8.Q();
                                                                        if (zH || objQ16 == gVar5) {
                                                                            objQ16 = new v2(i54, i55, f17, cVar11, b1Var2, null);
                                                                            sVar8.o0(objQ16);
                                                                        }
                                                                        l1.t.g(numValueOf, lVar, (fz.e) objQ16, sVar8);
                                                                        sVar8.a0(2043631539, new qy.l(Long.valueOf(courseWord2.getWordId()), courseWord2.getSelectedState()));
                                                                        float f18 = 2;
                                                                        dt.g4.b(CourseWord.copy$default(courseWord2, 0L, courseWord2.getOriginalWord(), courseWord2.getZhuYin(), courseWord2.getLuoMa(), null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -15, 63, null), j3.y0.a(ct.c.b(sVar8), ((g2.x) b3Var2.getValue()).f28624a, j13, n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), j0.c.A(oVar4, f18), false, new v3.f(56 - f18), 57 == ((Number) sVar8.j(ju.f.f37370d)).intValue(), false, !z56, 1, null, sVar8, 100688256, 584);
                                                                        sVar8.p(false);
                                                                        sVar8.p(true);
                                                                    } else {
                                                                        sVar8.W();
                                                                    }
                                                                    return qy.b0.f48488a;
                                                                }
                                                            }, nVar4), nVar4, 196608, 8);
                                                            nVar3 = nVar4;
                                                            sVar6.p(true);
                                                            it2 = it2;
                                                            i411 = i50;
                                                            z54 = false;
                                                        }
                                                        sVar6.p(z54);
                                                        sVar6.p(true);
                                                        return qy.b0.f48488a;
                                                    }
                                                }, sVar5), sVar5, 1600512, 18);
                                                gVar3 = gVar3;
                                                iIntValue2 = i49;
                                                i46 = i47;
                                                z51 = true;
                                            }
                                            z50 = false;
                                        }
                                    } else {
                                        z50 = false;
                                        sVar5.d0(3980360);
                                    }
                                    sVar5.p(z50);
                                } else {
                                    sVar5.W();
                                }
                                return qy.b0.f48488a;
                            }
                        }, true, -1421946918), 3);
                        l0.h.p(LazyColumn, null, b.f5185i, 3);
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(cVar3);
                objQ3 = cVar3;
            } else {
                sVar2 = sVar4;
                i30 = i19;
                fz.c cVar4 = new fz.c() { // from class: bt.k2
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        l0.h LazyColumn = (l0.h) obj;
                        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                        l0.h.p(LazyColumn, null, b.f5184h, 3);
                        final List list = optionWords;
                        final v3.c cVar5 = cVar;
                        final l1.a1 a1Var2 = a1Var;
                        final int i43 = i11;
                        final boolean z410 = z12;
                        final fz.c cVar6 = onClickOption;
                        final long j11 = jC;
                        final boolean z411 = z32;
                        l0.h.p(LazyColumn, null, new t1.d(new fz.f() { // from class: bt.r2
                            /* JADX WARN: Code duplicated, block: B:49:0x012c  */
                            @Override // fz.f
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                int iL;
                                boolean z50;
                                Object next;
                                l0.c item = (l0.c) obj2;
                                l1.n nVar2 = (l1.n) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                kotlin.jvm.internal.m.f(item, "$this$item");
                                boolean z51 = true;
                                l1.s sVar5 = (l1.s) nVar2;
                                if (sVar5.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    l1.h1 h1Var = (l1.h1) a1Var2;
                                    boolean zD = sVar5.d(h1Var.l());
                                    Object objQ10 = sVar5.Q();
                                    v3.c cVar7 = cVar5;
                                    l1.g gVar3 = l1.m.f39353a;
                                    if (zD || objQ10 == gVar3) {
                                        if (h1Var.l() > 0) {
                                            iL = (int) ((h1Var.l() - cVar7.e0(24)) / cVar7.e0(64));
                                            if (iL < 1) {
                                                iL = 1;
                                            }
                                        } else {
                                            iL = 0;
                                        }
                                        objQ10 = Integer.valueOf(iL);
                                        sVar5.o0(objQ10);
                                    }
                                    int iIntValue2 = ((Number) objQ10).intValue();
                                    if (iIntValue2 > 0) {
                                        List list2 = list;
                                        if (list2.isEmpty()) {
                                            z50 = false;
                                            sVar5.d0(3980360);
                                        } else {
                                            sVar5.d0(42848780);
                                            final float fE0 = cVar7.e0(10);
                                            int i44 = iIntValue2 < 1 ? 1 : iIntValue2;
                                            ArrayList arrayListG1 = ry.m.g1(list2, i44, i44);
                                            int size = arrayListG1.size();
                                            int i45 = 0;
                                            final int i46 = 0;
                                            while (i45 < size) {
                                                Object obj5 = arrayListG1.get(i45);
                                                i45++;
                                                int i47 = i46 + 1;
                                                if (i46 < 0) {
                                                    ns.o.V();
                                                    throw null;
                                                }
                                                final List list3 = (List) obj5;
                                                boolean zF3 = sVar5.f(list3);
                                                Object objQ11 = sVar5.Q();
                                                if (zF3 || objQ11 == gVar3) {
                                                    Iterator it = list3.iterator();
                                                    do {
                                                        if (!it.hasNext()) {
                                                            next = null;
                                                            break;
                                                        }
                                                        next = it.next();
                                                    } while (((CourseWord) next).getSelectedState() != OptionItemSelectedState.DEFAULT);
                                                    objQ11 = Boolean.valueOf(next == null ? z51 : false);
                                                    sVar5.o0(objQ11);
                                                }
                                                boolean zBooleanValue = ((Boolean) objQ11).booleanValue() ^ z51;
                                                a0.l1 l1VarD = a0.f1.d(null, 15);
                                                a0.m1 m1VarL = a0.f1.l(null, 15);
                                                final int i48 = i43;
                                                final boolean z52 = z410;
                                                final fz.c cVar8 = cVar6;
                                                final long j12 = j11;
                                                final int i49 = iIntValue2;
                                                final boolean z53 = z411;
                                                a0.j0.c(zBooleanValue, null, l1VarD, m1VarL, null, t1.e.d(-808509330, new fz.f() { // from class: bt.s2
                                                    @Override // fz.f
                                                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                        OptionItemSelectedState optionItemSelectedState;
                                                        int i410;
                                                        long jX;
                                                        l1.b3 b3VarA;
                                                        long jT;
                                                        l1.b3 b3VarA2;
                                                        a0.k0 AnimatedVisibility = (a0.k0) obj6;
                                                        l1.n nVar3 = (l1.n) obj7;
                                                        ((Integer) obj8).getClass();
                                                        kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
                                                        z1.o oVar3 = z1.o.f58481a;
                                                        z1.r rVarX = j0.e2.x(j0.c.B(oVar3, 12, 7), 2);
                                                        j0.a2 a2VarA2 = j0.z1.a(j0.i.g(8), z1.c.L, nVar3, 6);
                                                        l1.s sVar6 = (l1.s) nVar3;
                                                        int iHashCode4 = Long.hashCode(sVar6.T);
                                                        l1.q1 q1VarL6 = sVar6.l();
                                                        z1.r rVarC6 = z1.a.c(nVar3, rVarX);
                                                        y2.k.J.getClass();
                                                        y2.i iVar2 = y2.j.f56913b;
                                                        sVar6.h0();
                                                        if (sVar6.S) {
                                                            sVar6.k(iVar2);
                                                        } else {
                                                            sVar6.r0();
                                                        }
                                                        l1.t.J(y2.j.f56917f, a2VarA2, nVar3);
                                                        l1.t.J(y2.j.f56916e, q1VarL6, nVar3);
                                                        y2.h hVar8 = y2.j.f56918g;
                                                        if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode4))) {
                                                            defpackage.e.A(iHashCode4, sVar6, iHashCode4, hVar8);
                                                        }
                                                        l1.t.J(y2.j.f56915d, rVarC6, nVar3);
                                                        sVar6.d0(2082684172);
                                                        Iterator it2 = list3.iterator();
                                                        boolean z54 = false;
                                                        int i411 = 0;
                                                        while (it2.hasNext()) {
                                                            int i50 = i411 + 1;
                                                            final CourseWord courseWord = (CourseWord) it2.next();
                                                            final int i51 = (i46 * i49) + i411;
                                                            boolean zE3 = sVar6.e(courseWord.getWordId());
                                                            Object objQ12 = sVar6.Q();
                                                            l1.g gVar4 = l1.m.f39353a;
                                                            if (zE3 || objQ12 == gVar4) {
                                                                objQ12 = new p0.c();
                                                                sVar6.o0(objQ12);
                                                            }
                                                            final p0.c cVar9 = (p0.c) objQ12;
                                                            boolean zE4 = sVar6.e(courseWord.getWordId());
                                                            Object objQ13 = sVar6.Q();
                                                            if (zE4 || objQ13 == gVar4) {
                                                                objQ13 = l1.t.B(new v3.l(0L));
                                                                sVar6.o0(objQ13);
                                                            }
                                                            final l1.b1 b1Var = (l1.b1) objQ13;
                                                            OptionItemSelectedState selectedState = courseWord.getSelectedState();
                                                            OptionItemSelectedState optionItemSelectedState2 = OptionItemSelectedState.DEFAULT;
                                                            int i52 = i48;
                                                            if (selectedState != optionItemSelectedState2) {
                                                                sVar6.d0(139158446);
                                                                optionItemSelectedState = optionItemSelectedState2;
                                                                i410 = i52;
                                                                b3VarA = a0.t1.a(((h1.s1) ((l1.s) nVar3).j(h1.v1.f31180a)).A, null, BuildConfig.VERSION_NAME, nVar3, 384, 10);
                                                                sVar6.p(z54);
                                                            } else {
                                                                optionItemSelectedState = optionItemSelectedState2;
                                                                i410 = i52;
                                                                sVar6.d0(139494114);
                                                                if (i410 == i51) {
                                                                    sVar6.d0(2082715390);
                                                                    jX = ob.f.x((h1.s1) ((l1.s) nVar3).j(h1.v1.f31180a), nVar3);
                                                                } else {
                                                                    sVar6.d0(2082717041);
                                                                    jX = ((h1.s1) ((l1.s) nVar3).j(h1.v1.f31180a)).f31033p;
                                                                }
                                                                sVar6.p(z54);
                                                                b3VarA = a0.t1.a(jX, null, BuildConfig.VERSION_NAME, nVar3, 384, 10);
                                                                sVar6.p(z54);
                                                            }
                                                            l1.b3 b3Var = b3VarA;
                                                            l1.n nVar4 = nVar3;
                                                            l1.b3 b3VarB = b0.h.b(i410 == i51 ? 1.1f : 1.0f, null, BuildConfig.VERSION_NAME, nVar4, 3072, 22);
                                                            if (courseWord.getSelectedState() != optionItemSelectedState) {
                                                                sVar6.d0(140356782);
                                                                b3VarA2 = a0.t1.a(((h1.s1) ((l1.s) nVar4).j(h1.v1.f31180a)).A, null, BuildConfig.VERSION_NAME, nVar4, 384, 10);
                                                                sVar6.p(z54);
                                                            } else {
                                                                sVar6.d0(140692574);
                                                                if (i410 == i51) {
                                                                    sVar6.d0(2082754048);
                                                                    jT = ob.f.t((h1.s1) ((l1.s) nVar4).j(h1.v1.f31180a), nVar4);
                                                                } else {
                                                                    sVar6.d0(2082755763);
                                                                    jT = ((h1.s1) ((l1.s) nVar4).j(h1.v1.f31180a)).f31034q;
                                                                }
                                                                sVar6.p(z54);
                                                                b3VarA2 = a0.t1.a(jT, null, BuildConfig.VERSION_NAME, nVar4, 384, 10);
                                                                sVar6.p(z54);
                                                            }
                                                            final l1.b3 b3Var2 = b3VarA2;
                                                            l1.c3 c3Var = h1.v1.f31180a;
                                                            l1.s sVar7 = (l1.s) nVar4;
                                                            float f14 = 10;
                                                            z1.r rVarH3 = d0.n.h(oVar3, ((h1.s1) sVar7.j(c3Var)).A, r0.f.d(f14));
                                                            w2.q0 q0VarD3 = j0.o.d(z1.c.f58463a, z54);
                                                            int iHashCode5 = Long.hashCode(sVar6.T);
                                                            l1.q1 q1VarL7 = sVar6.l();
                                                            z1.r rVarC7 = z1.a.c(nVar4, rVarH3);
                                                            y2.k.J.getClass();
                                                            y2.i iVar3 = y2.j.f56913b;
                                                            sVar6.h0();
                                                            final int i53 = i410;
                                                            if (sVar6.S) {
                                                                sVar6.k(iVar3);
                                                            } else {
                                                                sVar6.r0();
                                                            }
                                                            l1.t.J(y2.j.f56917f, q0VarD3, nVar4);
                                                            l1.t.J(y2.j.f56916e, q1VarL7, nVar4);
                                                            y2.h hVar9 = y2.j.f56918g;
                                                            if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode5))) {
                                                                defpackage.e.A(iHashCode5, sVar6, iHashCode5, hVar9);
                                                            }
                                                            l1.t.J(y2.j.f56915d, rVarC7, nVar4);
                                                            r0.e eVarD = r0.f.d(f14);
                                                            h1.t0 t0VarP = h1.k7.p(((g2.x) b3Var.getValue()).f28624a, nVar4, 0);
                                                            d0.v vVarA = d0.n.a(((h1.s1) sVar7.j(c3Var)).A, 2);
                                                            float f15 = 56;
                                                            z1.r rVarA3 = p0.d.a(j0.e2.g(j0.e2.s(oVar3, f15), f15), cVar9);
                                                            boolean zF4 = sVar6.f(b1Var);
                                                            Object objQ14 = sVar6.Q();
                                                            if (zF4 || objQ14 == gVar4) {
                                                                objQ14 = new bp.h0(3, b1Var);
                                                                sVar6.o0(objQ14);
                                                            }
                                                            z1.r rVarA4 = d2.h.a(g2.f0.s(w2.a0.n(rVarA3, (fz.c) objQ14), ((Number) b3VarB.getValue()).floatValue(), ((Number) b3VarB.getValue()).floatValue(), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 524284), courseWord.getSelectedState() != optionItemSelectedState ? CropImageView.DEFAULT_ASPECT_RATIO : 1.0f);
                                                            final boolean z55 = z52;
                                                            final fz.c cVar10 = cVar8;
                                                            final float f16 = fE0;
                                                            final long j13 = j12;
                                                            final boolean z56 = z53;
                                                            h1.k7.d(rVarA4, eVarD, t0VarP, null, vVarA, t1.e.d(-485259693, new fz.f() { // from class: bt.t2
                                                                @Override // fz.f
                                                                public final Object invoke(Object obj9, Object obj10, Object obj11) {
                                                                    j0.v Card = (j0.v) obj9;
                                                                    l1.n nVar5 = (l1.n) obj10;
                                                                    int iIntValue3 = ((Integer) obj11).intValue();
                                                                    kotlin.jvm.internal.m.f(Card, "$this$Card");
                                                                    l1.s sVar8 = (l1.s) nVar5;
                                                                    if (sVar8.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                        z1.o oVar4 = z1.o.f58481a;
                                                                        z1.r rVarD3 = j0.e2.d(oVar4, 1.0f);
                                                                        boolean z57 = z55;
                                                                        CourseWord courseWord2 = courseWord;
                                                                        boolean z58 = z57 && courseWord2.getSelectedState() == OptionItemSelectedState.DEFAULT;
                                                                        fz.c cVar11 = cVar10;
                                                                        boolean zF5 = sVar8.f(cVar11) | sVar8.h(courseWord2);
                                                                        Object objQ15 = sVar8.Q();
                                                                        l1.g gVar5 = l1.m.f39353a;
                                                                        if (zF5 || objQ15 == gVar5) {
                                                                            objQ15 = new s0(cVar11, courseWord2, 3);
                                                                            sVar8.o0(objQ15);
                                                                        }
                                                                        z1.r rVarQ = iu.k.q(6, 6, (fz.a) objQ15, sVar8, rVarD3, z58);
                                                                        w2.q0 q0VarD4 = j0.o.d(z1.c.f58467e, false);
                                                                        int iHashCode6 = Long.hashCode(sVar8.T);
                                                                        l1.q1 q1VarL8 = sVar8.l();
                                                                        z1.r rVarC8 = z1.a.c(sVar8, rVarQ);
                                                                        y2.k.J.getClass();
                                                                        y2.i iVar4 = y2.j.f56913b;
                                                                        sVar8.h0();
                                                                        if (sVar8.S) {
                                                                            sVar8.k(iVar4);
                                                                        } else {
                                                                            sVar8.r0();
                                                                        }
                                                                        l1.t.J(y2.j.f56917f, q0VarD4, sVar8);
                                                                        l1.t.J(y2.j.f56916e, q1VarL8, sVar8);
                                                                        y2.h hVar10 = y2.j.f56918g;
                                                                        if (sVar8.S || !kotlin.jvm.internal.m.a(sVar8.Q(), Integer.valueOf(iHashCode6))) {
                                                                            defpackage.e.A(iHashCode6, sVar8, iHashCode6, hVar10);
                                                                        }
                                                                        l1.t.J(y2.j.f56915d, rVarC8, sVar8);
                                                                        int i54 = i53;
                                                                        Integer numValueOf = Integer.valueOf(i54);
                                                                        l1.b1 b1Var2 = b1Var;
                                                                        v3.l lVar = new v3.l(((v3.l) b1Var2.getValue()).f53498a);
                                                                        boolean zD2 = sVar8.d(i54);
                                                                        int i55 = i51;
                                                                        boolean zD3 = zD2 | sVar8.d(i55) | sVar8.f(b1Var2);
                                                                        float f17 = f16;
                                                                        boolean zC = zD3 | sVar8.c(f17);
                                                                        p0.c cVar12 = cVar9;
                                                                        boolean zH = zC | sVar8.h(cVar12);
                                                                        Object objQ16 = sVar8.Q();
                                                                        if (zH || objQ16 == gVar5) {
                                                                            objQ16 = new v2(i54, i55, f17, cVar12, b1Var2, null);
                                                                            sVar8.o0(objQ16);
                                                                        }
                                                                        l1.t.g(numValueOf, lVar, (fz.e) objQ16, sVar8);
                                                                        sVar8.a0(2043631539, new qy.l(Long.valueOf(courseWord2.getWordId()), courseWord2.getSelectedState()));
                                                                        float f18 = 2;
                                                                        dt.g4.b(CourseWord.copy$default(courseWord2, 0L, courseWord2.getOriginalWord(), courseWord2.getZhuYin(), courseWord2.getLuoMa(), null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -15, 63, null), j3.y0.a(ct.c.b(sVar8), ((g2.x) b3Var2.getValue()).f28624a, j13, n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), j0.c.A(oVar4, f18), false, new v3.f(56 - f18), 57 == ((Number) sVar8.j(ju.f.f37370d)).intValue(), false, !z56, 1, null, sVar8, 100688256, 584);
                                                                        sVar8.p(false);
                                                                        sVar8.p(true);
                                                                    } else {
                                                                        sVar8.W();
                                                                    }
                                                                    return qy.b0.f48488a;
                                                                }
                                                            }, nVar4), nVar4, 196608, 8);
                                                            nVar3 = nVar4;
                                                            sVar6.p(true);
                                                            it2 = it2;
                                                            i411 = i50;
                                                            z54 = false;
                                                        }
                                                        sVar6.p(z54);
                                                        sVar6.p(true);
                                                        return qy.b0.f48488a;
                                                    }
                                                }, sVar5), sVar5, 1600512, 18);
                                                gVar3 = gVar3;
                                                iIntValue2 = i49;
                                                i46 = i47;
                                                z51 = true;
                                            }
                                            z50 = false;
                                        }
                                    } else {
                                        z50 = false;
                                        sVar5.d0(3980360);
                                    }
                                    sVar5.p(z50);
                                } else {
                                    sVar5.W();
                                }
                                return qy.b0.f48488a;
                            }
                        }, true, -1421946918), 3);
                        l0.h.p(LazyColumn, null, b.f5185i, 3);
                        return qy.b0.f48488a;
                    }
                };
                sVar2.o0(cVar4);
                objQ3 = cVar4;
            }
            sVar3 = sVar2;
            ue.f.a(rVarA2, null, null, null, null, null, false, null, (fz.c) objQ3, sVar3, 0, 510);
            z1.r rVarE2 = j0.e2.e(oVar2, 1.0f);
            j0.a2 a2VarA2 = j0.z1.a(j0.i.f35303a, z1.c.L, sVar3, 0);
            iHashCode3 = Long.hashCode(sVar3.T);
            l1.q1 q1VarL6 = sVar3.l();
            z1.r rVarC6 = z1.a.c(sVar3, rVarE2);
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(iVar);
            } else {
                sVar3.r0();
            }
            l1.t.J(hVar5, a2VarA2, sVar3);
            l1.t.J(hVar6, q1VarL6, sVar3);
            if (sVar3.S) {
                defpackage.e.A(iHashCode3, sVar3, iHashCode3, hVar);
            } else {
                defpackage.e.A(iHashCode3, sVar3, iHashCode3, hVar);
            }
            l1.t.J(hVar7, rVarC6, sVar3);
            if (z30) {
                sVar3.d0(-2112655727);
                i31 = i29;
                if ((i31 & 896) == 256) {
                    z45 = true;
                } else {
                    z45 = false;
                }
                objQ7 = sVar3.Q();
                gVar2 = gVar;
                if (z45) {
                    onClickSwitchKeyboard = aVar;
                    objQ7 = new at.r(17, onClickSwitchKeyboard);
                    sVar3.o0(objQ7);
                } else {
                    onClickSwitchKeyboard = aVar;
                    objQ7 = new at.r(17, onClickSwitchKeyboard);
                    sVar3.o0(objQ7);
                }
                h1.k7.h((fz.a) objQ7, null, z12, null, b.f5186j, sVar3, ((i30 >> 3) & 896) | 196608, 26);
                z38 = false;
            } else {
                onClickSwitchKeyboard = aVar;
                i31 = i29;
                gVar2 = gVar;
                z38 = false;
                sVar3.d0(2134075104);
            }
            sVar3.p(z38);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            w4.c.r(1.0f, true, sVar3);
            if (z28) {
                sVar3.d0(-2112213419);
                if ((3670016 & i31) == 1048576) {
                    z44 = true;
                } else {
                    z44 = false;
                }
                objQ6 = sVar3.Q();
                if (z44) {
                    aVar11 = aVar9;
                    objQ6 = new at.r(18, aVar11);
                    sVar3.o0(objQ6);
                } else {
                    aVar11 = aVar9;
                    objQ6 = new at.r(18, aVar11);
                    sVar3.o0(objQ6);
                }
                h1.k7.h((fz.a) objQ6, null, z12, null, t1.e.d(1512715059, new at.m(z32, 1), sVar3), sVar3, ((i30 >> 3) & 896) | 196608, 26);
                z39 = false;
            } else {
                aVar11 = aVar9;
                z39 = false;
                sVar3.d0(2134075104);
            }
            sVar3.p(z39);
            if (z29) {
                sVar3.d0(-2111338475);
                if ((i31 & 458752) == 131072) {
                    z43 = true;
                } else {
                    z43 = false;
                }
                objQ5 = sVar3.Q();
                if (z43) {
                    aVar12 = aVar10;
                    objQ5 = new at.r(19, aVar12);
                    sVar3.o0(objQ5);
                } else {
                    aVar12 = aVar10;
                    objQ5 = new at.r(19, aVar12);
                    sVar3.o0(objQ5);
                }
                z40 = z31;
                h1.k7.h((fz.a) objQ5, null, z12, null, t1.e.d(1824821266, new at.m(z40, 2), sVar3), sVar3, ((i30 >> 3) & 896) | 196608, 26);
                z41 = false;
            } else {
                aVar12 = aVar10;
                z40 = z31;
                z41 = false;
                sVar3.d0(2134075104);
            }
            sVar3.p(z41);
            if (z18) {
                sVar3.d0(-2110475807);
                int i43 = i30 >> 6;
                f(z11, z12, onClickHint, null, sVar3, (i43 & 112) | (i43 & 14) | 24576 | ((i31 >> 3) & 896));
                z42 = false;
            } else {
                z42 = false;
                sVar3.d0(2134075104);
            }
            sVar3.p(z42);
            if ((57344 & i31) == 16384) {
                z42 = true;
            }
            objQ4 = sVar3.Q();
            if (z42) {
                aVar4 = onClickDel;
                objQ4 = new at.r(20, aVar4);
                sVar3.o0(objQ4);
            } else {
                aVar4 = onClickDel;
                objQ4 = new at.r(20, aVar4);
                sVar3.o0(objQ4);
            }
            h1.k7.h((fz.a) objQ4, null, z12, null, b.f5188l, sVar3, ((i30 >> 3) & 896) | 196608, 26);
            sVar = sVar3;
            com.google.android.material.datepicker.d.B(sVar, true, true, true);
            z25 = z32;
            aVar6 = aVar11;
            aVar5 = aVar12;
            z24 = z40;
            f11 = f13;
            z26 = z28;
            z22 = z29;
            z23 = z30;
        } else {
            sVar = sVar4;
            aVar4 = onClickDel;
            sVar.W();
            z22 = z16;
            z23 = z17;
            f11 = f5;
            aVar5 = aVar2;
            aVar6 = aVar3;
            z24 = z19;
            z25 = z20;
            z26 = z15;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            final fz.a aVar14 = aVar4;
            x1VarT.f39502d = new fz.e() { // from class: bt.j2
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(i12 | 1);
                    d3.b(optionWords, i11, z11, z12, z24, z25, z26, z22, z23, z18, f11, onClickOption, onClickSwitchKeyboard, onClickHint, aVar14, aVar5, aVar6, (l1.n) obj, iM, i13);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void c(ot.f data, ht.o courseTestParams, ys.d0 d0Var, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(data, "data");
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-454204391);
        int i12 = i11 | (sVar.h(data) ? 4 : 2) | (sVar.f(courseTestParams) ? 32 : 16) | (sVar.f(d0Var) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            jt.m1 m1VarU = md.a.u(data.f45802a, data.f45803b, data.f45804c, Long.valueOf(courseTestParams.f33756d), sVar, 1769478, 1048448);
            int i13 = i12 & 896;
            boolean z11 = i13 == 256;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                objQ = new l(d0Var, 11);
                sVar.o0(objQ);
            }
            fz.a aVar = (fz.a) objQ;
            boolean zH = (i13 == 256) | sVar.h(m1VarU);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar) {
                objQ2 = new d2(d0Var, m1VarU, 0);
                sVar.o0(objQ2);
            }
            fz.e eVar = (fz.e) objQ2;
            boolean z12 = i13 == 256;
            Object objQ3 = sVar.Q();
            if (z12 || objQ3 == gVar) {
                objQ3 = new l(d0Var, 12);
                sVar.o0(objQ3);
            }
            fz.a aVar2 = (fz.a) objQ3;
            boolean z13 = i13 == 256;
            Object objQ4 = sVar.Q();
            if (z13 || objQ4 == gVar) {
                objQ4 = new v(d0Var, 3);
                sVar.o0(objQ4);
            }
            fz.c cVar = (fz.c) objQ4;
            boolean z14 = i13 == 256;
            Object objQ5 = sVar.Q();
            if (z14 || objQ5 == gVar) {
                objQ5 = new l(d0Var, 13);
                sVar.o0(objQ5);
            }
            fz.a aVar3 = (fz.a) objQ5;
            boolean z15 = i13 == 256;
            Object objQ6 = sVar.Q();
            if (z15 || objQ6 == gVar) {
                objQ6 = new l(d0Var, 14);
                sVar.o0(objQ6);
            }
            fz.a aVar4 = (fz.a) objQ6;
            boolean z16 = i13 == 256;
            Object objQ7 = sVar.Q();
            if (z16 || objQ7 == gVar) {
                objQ7 = new l(d0Var, 15);
                sVar.o0(objQ7);
            }
            fz.a aVar5 = (fz.a) objQ7;
            int i14 = i12 & 112;
            boolean z17 = (i14 == 32) | (i13 == 256);
            Object objQ8 = sVar.Q();
            if (z17 || objQ8 == gVar) {
                objQ8 = new k(d0Var, courseTestParams, 2);
                sVar.o0(objQ8);
            }
            fz.a aVar6 = (fz.a) objQ8;
            boolean z18 = (i13 == 256) | (i14 == 32);
            Object objQ9 = sVar.Q();
            if (z18 || objQ9 == gVar) {
                objQ9 = new e0(d0Var, courseTestParams, 3);
                sVar.o0(objQ9);
            }
            d(m1VarU, courseTestParams, aVar, eVar, aVar2, cVar, aVar3, aVar4, aVar5, aVar6, (fz.c) objQ9, sVar, i14);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.i(data, courseTestParams, d0Var, i11, 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:169:0x052d  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ed  */
    public static final void d(final jt.m1 state, final ht.o courseTestParams, fz.a getComboCount, final fz.e onClickPlayAudio, fz.a onStopPlayAudio, fz.c onClickChecked, fz.a aVar, fz.a onClickContinue, fz.a getAudioTime, fz.a onClickSkipListen, fz.c onClickBugReport, l1.n nVar, int i11) {
        l1.s sVar;
        int i12;
        boolean z11;
        l1.g gVar;
        CourseSentence courseSentence;
        l1.s sVar2;
        int i13;
        ht.o oVar;
        l1.g gVar2;
        boolean z12;
        fz.a aVar2;
        boolean z13;
        Object objQ;
        kotlin.jvm.internal.m.f(state, "state");
        l1.b1 b1Var = state.f37062p;
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        kotlin.jvm.internal.m.f(getComboCount, "getComboCount");
        kotlin.jvm.internal.m.f(onClickPlayAudio, "onClickPlayAudio");
        kotlin.jvm.internal.m.f(onStopPlayAudio, "onStopPlayAudio");
        kotlin.jvm.internal.m.f(onClickChecked, "onClickChecked");
        kotlin.jvm.internal.m.f(onClickContinue, "onClickContinue");
        kotlin.jvm.internal.m.f(getAudioTime, "getAudioTime");
        kotlin.jvm.internal.m.f(onClickSkipListen, "onClickSkipListen");
        kotlin.jvm.internal.m.f(onClickBugReport, "onClickBugReport");
        l1.s sVar3 = (l1.s) nVar;
        sVar3.f0(1656734850);
        int i14 = i11 | (sVar3.h(state) ? 4 : 2) | (sVar3.f(courseTestParams) ? 32 : 16) | (sVar3.h(getComboCount) ? 256 : 128) | (sVar3.h(onClickPlayAudio) ? 2048 : 1024) | (sVar3.h(onStopPlayAudio) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar3.h(onClickChecked) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar3.h(aVar) ? 1048576 : 524288) | (sVar3.h(onClickContinue) ? 8388608 : 4194304) | (sVar3.h(onClickSkipListen) ? 536870912 : 268435456);
        int i15 = sVar3.h(onClickBugReport) ? 4 : 2;
        boolean z14 = true;
        if (sVar3.T(i14 & 1, ((i14 & 273228947) == 273228946 && (i15 & 3) == 2) ? false : true)) {
            sVar3.Y();
            if ((i11 & 1) != 0 && !sVar3.C()) {
                sVar3.W();
            }
            sVar3.q();
            Object objQ2 = sVar3.Q();
            l1.g gVar3 = l1.m.f39353a;
            if (objQ2 == gVar3) {
                objQ2 = l1.t.q(sVar3);
                sVar3.o0(objQ2);
            }
            rz.b0 b0Var = (rz.b0) objQ2;
            Boolean bool = (Boolean) sVar3.j(ju.f.f37372f);
            boolean zBooleanValue = bool.booleanValue();
            CourseSentence courseSentence2 = (CourseSentence) state.f37048a;
            final l1.b1 b1Var2 = state.f37055h;
            l1.b1 b1Var3 = state.f37056i;
            final l1.b1 b1Var4 = state.f37061o;
            WeakHashMap weakHashMap = j0.o2.f35353v;
            j0.a aVar3 = j0.b.e(sVar3).f35356c;
            l1.c3 c3Var = z2.g1.f58547h;
            boolean z15 = aVar3.e().f48796d > 0;
            boolean z16 = state.f37054g;
            final x1.p pVar = state.f37058k;
            x1.p pVar2 = state.f37059l;
            l1.b1 b1Var5 = state.f37060n;
            l1.b1 b1Var6 = state.f37068v;
            l1.b1 b1Var7 = state.f37050c;
            l1.b1 b1Var8 = state.f37051d;
            boolean z17 = state.f37052e;
            l1.b1 b1Var9 = state.f37053f;
            boolean z18 = z15;
            x1.p pVar3 = state.m;
            e2.l lVar = (e2.l) sVar3.j(z2.g1.f58548i);
            boolean zF = sVar3.f(courseSentence2) | sVar3.g(((Boolean) b1Var4.getValue()).booleanValue());
            Object objQ3 = sVar3.Q();
            if (zF || objQ3 == gVar3) {
                objQ3 = defpackage.e.v(0, sVar3);
            }
            l1.a1 a1Var = (l1.a1) objQ3;
            if (((Boolean) b1Var4.getValue()).booleanValue() && z18) {
                l1.h1 h1Var = (l1.h1) a1Var;
                if (h1Var.l() > 0) {
                    sVar3.d0(-1310618783);
                    boolean z19 = v3.f.a(((v3.c) sVar3.j(c3Var)).Q(h1Var.l()), f5309a) < 0;
                    i12 = 0;
                    sVar3.p(false);
                    z11 = z19;
                } else {
                    i12 = 0;
                    sVar3.d0(-1974475372);
                    sVar3.p(false);
                    z11 = false;
                }
            } else {
                i12 = 0;
                sVar3.d0(-1974475372);
                sVar3.p(false);
                z11 = false;
            }
            l1.b3 b3VarB = b0.h.b(z11 ? 0.97f : 0.8f, b0.e.r(AchievementLevelType.DAY_STREAK_LV_8, i12, null, 6), "m13InputHeightFraction", sVar3, 3120, 20);
            jt.a aVar4 = (jt.a) ry.m.A0(pVar3);
            qy.l lVar2 = aVar4 != null ? new qy.l(Integer.valueOf(aVar4.f36861b), Integer.valueOf(aVar4.f36862c)) : null;
            boolean zE = sVar3.e(courseTestParams.f33756d);
            Object objQ4 = sVar3.Q();
            if (zE || objQ4 == gVar3) {
                objQ4 = new l1.i1(0L);
                sVar3.o0(objQ4);
            }
            final l1.i1 i1Var = (l1.i1) objQ4;
            String strT = (!((Boolean) b1Var4.getValue()).booleanValue() || oz.q.K0((CharSequence) b1Var.getValue())) ? se.k.t(pVar) : (String) b1Var.getValue();
            boolean zF2 = sVar3.f(courseSentence2);
            Object objQ5 = sVar3.Q();
            if (zF2 || objQ5 == gVar3) {
                objQ5 = oz.q.i1(ry.m.y0(courseSentence2.getDisplayCourseWords(), " ", null, null, new br.b(5), 30) + "\n" + se.k.u(BuildConfig.VERSION_NAME, courseSentence2.getDisplayCourseWords())).toString();
                sVar3.o0(objQ5);
            }
            ns.z zVarJ = b1Var2.getValue() == ht.q.WRONG ? se.k.j(courseTestParams, "sent_m13_spell_sent", courseSentence2.getTranslation(), (String) objQ5, strT) : null;
            Object[] objArr = {courseSentence2, Boolean.valueOf(courseTestParams.f33762j), b1Var4.getValue(), bool};
            int i16 = i14 & 112;
            int i17 = i14 & 7168;
            boolean zG = sVar3.g(zBooleanValue) | sVar3.f(b1Var3) | (i16 == 32) | (i17 == 2048) | sVar3.h(courseSentence2);
            Object objQ6 = sVar3.Q();
            if (zG || objQ6 == gVar3) {
                gVar = gVar3;
                courseSentence = courseSentence2;
                sVar2 = sVar3;
                i13 = i17;
                x2 x2Var = new x2(zBooleanValue, b1Var3, courseTestParams, onClickPlayAudio, courseSentence, (vy.d) null, 0);
                oVar = courseTestParams;
                sVar2.o0(x2Var);
                objQ6 = x2Var;
            } else {
                i13 = i17;
                courseSentence = courseSentence2;
                oVar = courseTestParams;
                sVar2 = sVar3;
                gVar = gVar3;
            }
            l1.t.i(objArr, (fz.e) objQ6, sVar2);
            String translation = courseSentence.getTranslation();
            ht.q qVar = (ht.q) b1Var2.getValue();
            boolean z20 = !((Boolean) state.f37065s.getValue()).booleanValue();
            boolean z21 = !oVar.f33757e;
            boolean z22 = !((Boolean) b1Var4.getValue()).booleanValue();
            float f5 = ((Boolean) b1Var4.getValue()).booleanValue() ? CropImageView.DEFAULT_ASPECT_RATIO : 1.0f;
            ns.s sVar4 = (ns.s) state.f37066t.getValue();
            boolean zH = sVar2.h(state);
            Object objQ7 = sVar2.Q();
            if (zH || objQ7 == gVar) {
                gVar2 = gVar;
                y2 y2Var = new y2(0, state, jt.m1.class, "onRetry", "onRetry()V", 0, 0);
                sVar2.o0(y2Var);
                objQ7 = y2Var;
            } else {
                gVar2 = gVar;
            }
            mz.e eVar = (mz.e) objQ7;
            ht.l lVar3 = (ht.l) b1Var3.getValue();
            CourseSentence courseSentence3 = courseSentence;
            t1.d dVarD = t1.e.d(-1703660224, new v1(oVar, b1Var3, i1Var, onClickPlayAudio, courseSentence3, 0), sVar2);
            l1.s sVar5 = sVar2;
            boolean z23 = z11;
            t1.d dVarD2 = t1.e.d(-1157267583, new w1(b1Var4, state, z16, b0Var, lVar, z23, b3VarB, a1Var, courseTestParams, courseSentence3, i1Var, zBooleanValue, b1Var3, onStopPlayAudio, pVar, lVar2, onClickPlayAudio), sVar5);
            t1.d dVarD3 = t1.e.d(-610874942, new x1(b1Var4, b1Var5, b1Var6, b1Var7, b1Var8, b1Var9, courseTestParams, pVar2, z16, z17, b1Var3, i1Var, onClickPlayAudio, b0Var, state), sVar5);
            final CourseSentence courseSentence4 = courseSentence3;
            t1.d dVarD4 = t1.e.d(-1163355123, new y1(courseTestParams, b1Var4, courseSentence4, i1Var, b1Var3, onStopPlayAudio, zBooleanValue, 0), sVar5);
            t1.d dVarD5 = t1.e.d(1538964977, new fz.h() { // from class: bt.z1
                @Override // fz.h
                public final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    ht.o oVar2;
                    l1.b1 b1Var10;
                    CourseSentence courseSentence5;
                    jt.m1 m1Var;
                    l1.i1 i1Var2;
                    fz.e eVar2;
                    ArrayList arrayList;
                    OptionItemSelectedState optionItemSelectedState;
                    j0.q CourseTestModelScreen = (j0.q) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                    l1.n nVar2 = (l1.n) obj4;
                    int iIntValue2 = ((Integer) obj5).intValue();
                    kotlin.jvm.internal.m.f(CourseTestModelScreen, "$this$CourseTestModelScreen");
                    int i18 = (iIntValue2 & 6) == 0 ? (((l1.s) nVar2).f(CourseTestModelScreen) ? 4 : 2) | iIntValue2 : iIntValue2;
                    if ((iIntValue2 & 48) == 0) {
                        i18 |= ((l1.s) nVar2).d(iIntValue) ? 32 : 16;
                    }
                    if ((iIntValue2 & 384) == 0) {
                        i18 |= ((l1.s) nVar2).g(zBooleanValue2) ? 256 : 128;
                    }
                    l1.s sVar6 = (l1.s) nVar2;
                    if (sVar6.T(i18 & 1, (i18 & 1171) != 1170)) {
                        ht.o oVar3 = courseTestParams;
                        boolean z24 = oVar3.f33763k;
                        l1.b1 b1Var11 = b1Var2;
                        CourseSentence courseSentence6 = courseSentence4;
                        x1.p pVar4 = pVar;
                        jt.m1 m1Var2 = state;
                        l1.i1 i1Var3 = i1Var;
                        fz.e eVar3 = onClickPlayAudio;
                        l1.g gVar4 = l1.m.f39353a;
                        if (z24) {
                            sVar6.d0(-1470131084);
                            ht.q qVar2 = (ht.q) b1Var11.getValue();
                            List<CourseWord> displayCourseWords = courseSentence6.getDisplayCourseWords();
                            List<CourseWord> courseWords = courseSentence6.getCourseWords();
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj6 : courseWords) {
                                j0.q qVar3 = CourseTestModelScreen;
                                int i19 = i18;
                                ht.q qVar4 = qVar2;
                                if (((CourseWord) obj6).getWordType() != 1) {
                                    arrayList2.add(obj6);
                                }
                                i18 = i19;
                                qVar2 = qVar4;
                                CourseTestModelScreen = qVar3;
                            }
                            j0.q qVar5 = CourseTestModelScreen;
                            int i21 = i18;
                            ht.q qVar6 = qVar2;
                            sVar6.d0(1476607019);
                            ArrayList arrayList3 = new ArrayList(ry.n.W(pVar4, 10));
                            ListIterator listIterator = pVar4.listIterator();
                            while (true) {
                                sy.a aVar5 = (sy.a) listIterator;
                                if (!aVar5.hasNext()) {
                                    break;
                                }
                                CourseWord courseWord = (CourseWord) aVar5.next();
                                String word = courseWord.getWord();
                                List<CourseWord> displayCharWords = courseWord.getDisplayCharWords();
                                Object objQ8 = sVar6.Q();
                                if (objQ8 == gVar4) {
                                    objQ8 = new br.b(6);
                                    sVar6.o0(objQ8);
                                }
                                arrayList3.add(CourseWord.copy$default(courseWord, 0L, ry.m.y0(displayCharWords, BuildConfig.VERSION_NAME, null, null, (fz.c) objQ8, 30), null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, word, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -4194307, 63, null));
                            }
                            int i22 = 0;
                            sVar6.p(false);
                            ArrayList arrayList4 = new ArrayList();
                            int size = arrayList3.size();
                            while (i22 < size) {
                                int i23 = iIntValue;
                                Object obj7 = arrayList3.get(i22);
                                i22++;
                                ArrayList arrayList5 = arrayList3;
                                if (!kotlin.jvm.internal.m.a(((CourseWord) obj7).getWord(), " ")) {
                                    arrayList4.add(obj7);
                                }
                                arrayList3 = arrayList5;
                                iIntValue = i23;
                            }
                            int i24 = iIntValue;
                            String translation2 = courseSentence6.getTranslation();
                            boolean zBooleanValue3 = ((Boolean) m1Var2.f37064r.getValue()).booleanValue();
                            boolean zF3 = sVar6.f(oVar3) | sVar6.f(i1Var3) | sVar6.f(eVar3);
                            Object objQ9 = sVar6.Q();
                            if (zF3 || objQ9 == gVar4) {
                                objQ9 = new i2(oVar3, i1Var3, eVar3, 2);
                                sVar6.o0(objQ9);
                            }
                            int i25 = i21 << 15;
                            dt.v2.k(qVar5, qVar6, displayCourseWords, null, null, translation2, i24, zBooleanValue2, arrayList4, arrayList2, false, false, false, zBooleanValue3, true, (fz.c) objQ9, sVar6, (i21 & 14) | (i25 & 3670016) | (i25 & 29360128), 24576, 3596);
                            sVar6.p(false);
                        } else {
                            int i26 = i18;
                            sVar6.d0(-1468768541);
                            boolean zD = ry.l.D(new Integer[]{12, 1}, Integer.valueOf(((Number) sVar6.j(ju.f.f37370d)).intValue()));
                            pVar4.getClass();
                            p1.c cVar = x1.q.e(pVar4).f55734c;
                            String userInputSentenceString = (String) m1Var2.f37062p.getValue();
                            boolean zBooleanValue4 = ((Boolean) b1Var4.getValue()).booleanValue();
                            int i27 = m1Var2.f37049b;
                            ry.r rVar = ry.r.f50854a;
                            if (zBooleanValue4) {
                                List<List<CourseWord>> displaySpellCharWords = courseSentence6.getDisplaySpellCharWords();
                                kotlin.jvm.internal.m.f(displaySpellCharWords, "displaySpellCharWords");
                                kotlin.jvm.internal.m.f(userInputSentenceString, "userInputSentenceString");
                                int i28 = 10;
                                ArrayList arrayList6 = new ArrayList(ry.n.W(displaySpellCharWords, 10));
                                Iterator it = displaySpellCharWords.iterator();
                                while (it.hasNext()) {
                                    Iterator it2 = it;
                                    List list = (List) it.next();
                                    l1.b1 b1Var12 = b1Var11;
                                    CourseSentence courseSentence7 = courseSentence6;
                                    ArrayList arrayList7 = new ArrayList(ry.n.W(list, i28));
                                    Iterator it3 = list.iterator();
                                    while (it3.hasNext()) {
                                        CourseWord courseWord2 = (CourseWord) it3.next();
                                        arrayList7.add(new jt.m2(courseWord2.getWordType(), courseWord2.getWord(), ns.o.L(courseWord2.getWord(), courseWord2.getZhuYin(), courseWord2.getLuoMa(), courseWord2.getKunreiShikiLuoMa(), courseWord2.getHepburnLuoMa())));
                                        it3 = it3;
                                        eVar3 = eVar3;
                                        i1Var3 = i1Var3;
                                        oVar3 = oVar3;
                                        m1Var2 = m1Var2;
                                    }
                                    arrayList6.add(arrayList7);
                                    b1Var11 = b1Var12;
                                    it = it2;
                                    courseSentence6 = courseSentence7;
                                    i28 = 10;
                                }
                                oVar2 = oVar3;
                                b1Var10 = b1Var11;
                                courseSentence5 = courseSentence6;
                                m1Var = m1Var2;
                                i1Var2 = i1Var3;
                                eVar2 = eVar3;
                                ArrayList arrayListF = o00.a.f(i27, userInputSentenceString, arrayList6);
                                arrayList = new ArrayList(ry.n.W(displaySpellCharWords, 10));
                                int i29 = 0;
                                for (Object obj8 : displaySpellCharWords) {
                                    int i30 = i29 + 1;
                                    if (i29 < 0) {
                                        ns.o.V();
                                        throw null;
                                    }
                                    List list2 = (List) obj8;
                                    ArrayList arrayList8 = new ArrayList(ry.n.W(list2, 10));
                                    int i31 = 0;
                                    for (Object obj9 : list2) {
                                        int i32 = i31 + 1;
                                        if (i31 < 0) {
                                            ns.o.V();
                                            throw null;
                                        }
                                        CourseWord courseWordCopy$default = (CourseWord) obj9;
                                        List list3 = (List) ry.m.t0(i29, arrayListF);
                                        if (list3 == null || (optionItemSelectedState = (OptionItemSelectedState) ry.m.t0(i31, list3)) == null) {
                                            optionItemSelectedState = OptionItemSelectedState.DEFAULT;
                                        }
                                        if (optionItemSelectedState != OptionItemSelectedState.DEFAULT) {
                                            courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, optionItemSelectedState, null, null, 0, -1, 59, null);
                                        }
                                        arrayList8.add(courseWordCopy$default);
                                        i31 = i32;
                                    }
                                    arrayList.add(arrayList8);
                                    i29 = i30;
                                }
                            } else {
                                oVar2 = oVar3;
                                b1Var10 = b1Var11;
                                courseSentence5 = courseSentence6;
                                m1Var = m1Var2;
                                i1Var2 = i1Var3;
                                eVar2 = eVar3;
                                List<List<CourseWord>> displaySpellCharWords2 = courseSentence5.getDisplaySpellCharWords();
                                arrayList = new ArrayList(ry.n.W(displaySpellCharWords2, 10));
                                int i33 = 0;
                                for (Object obj10 : displaySpellCharWords2) {
                                    int i34 = i33 + 1;
                                    if (i33 < 0) {
                                        ns.o.V();
                                        throw null;
                                    }
                                    List list4 = (List) obj10;
                                    CourseWord courseWord3 = (CourseWord) ry.m.t0(i33, cVar);
                                    List<CourseWord> displayCharWords2 = courseWord3 != null ? courseWord3.getDisplayCharWords() : null;
                                    if (displayCharWords2 == null) {
                                        displayCharWords2 = rVar;
                                    }
                                    ArrayList arrayList9 = new ArrayList(ry.n.W(list4, 10));
                                    int i35 = 0;
                                    for (Object obj11 : list4) {
                                        int i36 = i35 + 1;
                                        if (i35 < 0) {
                                            ns.o.V();
                                            throw null;
                                        }
                                        CourseWord courseWordCopy$default2 = (CourseWord) obj11;
                                        CourseWord courseWord4 = (CourseWord) ry.m.t0(i35, displayCharWords2);
                                        if (courseWord4 != null && courseWordCopy$default2.getWordType() != 1 && !kotlin.jvm.internal.m.a(courseWordCopy$default2.getWord(), " ")) {
                                            courseWordCopy$default2 = CourseWord.copy$default(courseWordCopy$default2, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, courseWord4.getSelectedState(), null, null, 0, -1, 59, null);
                                        }
                                        arrayList9.add(courseWordCopy$default2);
                                        i35 = i36;
                                    }
                                    arrayList.add(arrayList9);
                                    i33 = i34;
                                }
                            }
                            List<CourseWord> displaySpellWords = courseSentence5.getDisplaySpellWords();
                            ArrayList arrayList10 = new ArrayList(ry.n.W(displaySpellWords, 10));
                            int i37 = 0;
                            for (Object obj12 : displaySpellWords) {
                                int i38 = i37 + 1;
                                if (i37 < 0) {
                                    ns.o.V();
                                    throw null;
                                }
                                CourseWord courseWordCopy$default3 = (CourseWord) obj12;
                                List list5 = (List) ry.m.t0(i37, arrayList);
                                List list6 = list5 == null ? rVar : list5;
                                if (!list6.isEmpty()) {
                                    courseWordCopy$default3 = CourseWord.copy$default(courseWordCopy$default3, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, list6, null, null, null, null, 0, -1, 62, null);
                                }
                                arrayList10.add(courseWordCopy$default3);
                                i37 = i38;
                            }
                            boolean zF4 = sVar6.f(courseSentence5.getSentence()) | sVar6.g(zD);
                            Object objQ10 = sVar6.Q();
                            if (zF4 || objQ10 == gVar4) {
                                String str = BuildConfig.VERSION_NAME;
                                if (zD) {
                                    List<CourseWord> displayCourseWords2 = courseSentence5.getDisplayCourseWords();
                                    String strY0 = ry.m.y0(displayCourseWords2, BuildConfig.VERSION_NAME, null, null, new br.b(7), 30);
                                    String str2 = kotlin.jvm.internal.m.a(strY0, ry.m.y0(displayCourseWords2, BuildConfig.VERSION_NAME, null, null, new br.b(8), 30)) ? null : strY0;
                                    if (str2 != null) {
                                        str = str2;
                                    }
                                }
                                objQ10 = str;
                                sVar6.o0(objQ10);
                            }
                            String str3 = (String) objQ10;
                            ht.q qVar7 = (ht.q) b1Var10.getValue();
                            List<CourseWord> courseWords2 = courseSentence5.getCourseWords();
                            ArrayList arrayList11 = new ArrayList();
                            for (Object obj13 : courseWords2) {
                                if (((CourseWord) obj13).getWordType() != 1) {
                                    arrayList11.add(obj13);
                                }
                            }
                            String translation3 = courseSentence5.getTranslation();
                            boolean zBooleanValue5 = ((Boolean) m1Var.f37064r.getValue()).booleanValue();
                            ht.o oVar4 = oVar2;
                            l1.i1 i1Var4 = i1Var2;
                            fz.e eVar4 = eVar2;
                            boolean zF5 = sVar6.f(oVar4) | sVar6.f(i1Var4) | sVar6.f(eVar4);
                            Object objQ11 = sVar6.Q();
                            if (zF5 || objQ11 == gVar4) {
                                objQ11 = new i2(oVar4, i1Var4, eVar4, 3);
                                sVar6.o0(objQ11);
                            }
                            int i39 = i26 << 15;
                            dt.v2.k(CourseTestModelScreen, qVar7, arrayList10, BuildConfig.VERSION_NAME, str3, translation3, iIntValue, zBooleanValue2, rVar, arrayList11, false, false, false, zBooleanValue5, true, (fz.c) objQ11, sVar6, 100666368 | (i26 & 14) | (i39 & 3670016) | (i39 & 29360128), 24576, 3584);
                            sVar6.p(false);
                        }
                    } else {
                        sVar6.W();
                    }
                    return qy.b0.f48488a;
                }
            }, sVar5);
            boolean zF3 = sVar5.f(a1Var);
            Object objQ8 = sVar5.Q();
            l1.g gVar4 = gVar2;
            if (zF3 || objQ8 == gVar4) {
                z12 = false;
                objQ8 = new a2(a1Var, 0);
                sVar5.o0(objQ8);
            } else {
                z12 = false;
            }
            fz.c cVar = (fz.c) objQ8;
            boolean zF4 = (i16 == 32 ? true : z12) | sVar5.f(i1Var) | (i13 == 2048 ? true : z12) | sVar5.h(courseSentence4);
            Object objQ9 = sVar5.Q();
            if (zF4 || objQ9 == gVar4) {
                b2 b2Var = new b2(courseSentence4, courseTestParams, i1Var, onClickPlayAudio, 0);
                courseSentence4 = courseSentence4;
                sVar5.o0(b2Var);
                objQ9 = b2Var;
            }
            fz.a aVar5 = (fz.a) objQ9;
            boolean zH2 = sVar5.h(lVar) | sVar5.h(b0Var) | sVar5.h(state) | sVar5.h(courseSentence4) | ((i14 & 458752) == 131072 ? true : z12);
            if (((i14 & 3670016) ^ 1572864) > 1048576) {
                aVar2 = aVar;
                if (!sVar5.f(aVar2)) {
                }
                z13 = zH2 | z14;
                objQ = sVar5.Q();
                if (z13 || objQ == gVar4) {
                    c2 c2Var = new c2(lVar, b0Var, state, courseSentence4, onClickChecked, aVar2, 0);
                    sVar5.o0(c2Var);
                    objQ = c2Var;
                }
                int i18 = i14 >> 12;
                dt.k3.e(translation, qVar, lVar3, z20, false, z22, false, z21, CropImageView.DEFAULT_ASPECT_RATIO, f5, z23, z23, null, dVarD, dVarD2, dVarD3, null, dVarD4, dVarD5, zVarJ, null, cVar, null, null, onClickSkipListen, onClickSkipListen, aVar5, onClickBugReport, getComboCount, (fz.a) objQ, sVar4, (fz.a) eVar, onClickContinue, sVar5, 221184, 907763712, (i18 & 458752) | ((i14 >> 9) & 3670016) | ((i15 << 24) & 234881024) | ((i14 << 21) & 1879048192), i18 & 7168, 27402880, 0);
                sVar = sVar5;
            } else {
                aVar2 = aVar;
            }
            if ((i14 & 1572864) != 1048576) {
                z14 = z12;
            }
            z13 = zH2 | z14;
            objQ = sVar5.Q();
            if (z13) {
                c2 c2Var2 = new c2(lVar, b0Var, state, courseSentence4, onClickChecked, aVar2, 0);
                sVar5.o0(c2Var2);
                objQ = c2Var2;
            } else {
                c2 c2Var3 = new c2(lVar, b0Var, state, courseSentence4, onClickChecked, aVar2, 0);
                sVar5.o0(c2Var3);
                objQ = c2Var3;
            }
            int i19 = i14 >> 12;
            dt.k3.e(translation, qVar, lVar3, z20, false, z22, false, z21, CropImageView.DEFAULT_ASPECT_RATIO, f5, z23, z23, null, dVarD, dVarD2, dVarD3, null, dVarD4, dVarD5, zVarJ, null, cVar, null, null, onClickSkipListen, onClickSkipListen, aVar5, onClickBugReport, getComboCount, (fz.a) objQ, sVar4, (fz.a) eVar, onClickContinue, sVar5, 221184, 907763712, (i19 & 458752) | ((i14 >> 9) & 3670016) | ((i15 << 24) & 234881024) | ((i14 << 21) & 1879048192), i19 & 7168, 27402880, 0);
            sVar = sVar5;
        } else {
            sVar = sVar3;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new u1(state, courseTestParams, getComboCount, onClickPlayAudio, onStopPlayAudio, onClickChecked, aVar, onClickContinue, getAudioTime, onClickSkipListen, onClickBugReport, i11, 0);
        }
    }

    public static final void e(ht.o oVar, l1.i1 i1Var, fz.e eVar, List list, ht.l lVar) {
        if (oVar.f33762j) {
            i1Var.n(i1Var.getValue().longValue() + 1);
        }
        eVar.invoke(list, lVar);
    }

    public static final void f(boolean z11, boolean z12, fz.a onClickHint, z1.r rVar, l1.n nVar, int i11) {
        int i12;
        z1.r rVar2;
        t1.d dVar = b.f5187k;
        kotlin.jvm.internal.m.f(onClickHint, "onClickHint");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(393052791);
        if ((i11 & 6) == 0) {
            i12 = (sVar.g(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.g(z12) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(onClickHint) ? 256 : 128;
        }
        int i13 = i12 | 3072;
        if ((i11 & 24576) == 0) {
            i13 |= sVar.h(dVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if (sVar.T(i13 & 1, (i13 & 9363) != 9362)) {
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = b0.e.a(CropImageView.DEFAULT_ASPECT_RATIO);
                sVar.o0(objQ);
            }
            b0.d dVar2 = (b0.d) objQ;
            Boolean boolValueOf = Boolean.valueOf(z11);
            boolean zH = sVar.h(dVar2) | ((i13 & 14) == 4);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar) {
                objQ2 = new bh.j0(z11, dVar2, (vy.d) null);
                sVar.o0(objQ2);
            }
            l1.t.f((fz.e) objQ2, boolValueOf, sVar);
            boolean zH2 = sVar.h(dVar2);
            Object objQ3 = sVar.Q();
            if (zH2 || objQ3 == gVar) {
                objQ3 = new p2(dVar2, 0);
                sVar.o0(objQ3);
            }
            z1.o oVar = z1.o.f58481a;
            h1.k7.h(onClickHint, j0.c.w(oVar, (fz.c) objQ3), z12, null, t1.e.d(1662864570, new bp.h1(18), sVar), sVar, ((i13 >> 6) & 14) | 196608 | ((i13 << 3) & 896), 24);
            rVar2 = oVar;
        } else {
            sVar.W();
            rVar2 = rVar;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new q2(z11, z12, onClickHint, rVar2, i11);
        }
    }

    public static final void g(l1.b1 b1Var, fz.a aVar, dt.z4 z4Var) {
        if (z4Var != dt.z4.Idle) {
            aVar.invoke();
            b1Var.setValue(new ht.j());
        } else if (b1Var.getValue() instanceof ht.j) {
            b1Var.setValue(ht.a.f33722e);
        }
    }
}
