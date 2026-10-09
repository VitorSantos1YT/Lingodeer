package dt;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import bt.z6;
import bt.z7;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.RecordingStatus;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import h1.a6;
import h1.e8;
import h1.g7;
import h1.i9;
import h1.k7;
import h1.ua;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import rt.s5;
import rt.t5;
import rt.u5;
import rt.v5;
import rt.w5;
import rt.z5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1.d f23754a = new t1.d(new at.a(27), false, -1434805073);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t1.d f23755b = new t1.d(new at.a(28), false, -598296726);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t1.d f23756c = new t1.d(new at.a(29), false, -314311188);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t1.d f23757d = new t1.d(new bp.h1(29), false, -799810062);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t1.d f23758e = new t1.d(new f(0), false, -1488905278);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t1.d f23759f = new t1.d(new f(1), false, -1066490919);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t1.d f23760g = new t1.d(new g(0), false, -2108226314);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t1.d f23761h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t1.d f23762i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final t1.d f23763j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final t1.d f23764k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final t1.d f23765l;
    public static final t1.d m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final t1.d f23766n;

    static {
        new t1.d(new f(2), false, 1427551592);
        f23761h = new t1.d(new f(3), false, -1314567561);
        f23762i = new t1.d(new f(4), false, -672602211);
        f23763j = new t1.d(new f(5), false, -549544180);
        f23764k = new t1.d(new f(6), false, 141995014);
        f23765l = new t1.d(new f(7), false, 814939614);
        m = new t1.d(new g(1), false, 2037187881);
        f23766n = new t1.d(new f(8), false, -480317899);
    }

    public static final void A(z1.r rVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1766833306);
        if (sVar.T(i11 & 1, (i11 & 3) != 2)) {
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            Object objQ2 = sVar.Q();
            vy.d dVar = null;
            if (objQ2 == gVar) {
                objQ2 = new b2(b1Var, dVar, 0);
                sVar.o0(objQ2);
            }
            l1.t.f((fz.e) objQ2, qy.b0.f48488a, sVar);
            a0.j0.d(((Boolean) b1Var.getValue()).booleanValue(), null, a0.f1.p(null, 3).a(a0.f1.g(null, CropImageView.DEFAULT_ASPECT_RATIO, 7)), a0.f1.u(null, 3).a(a0.f1.h(null, CropImageView.DEFAULT_ASPECT_RATIO, 7)), null, t1.e.d(-1251619954, new a00.b(rVar, 11), sVar), sVar, 200064, 18);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new ch.g(rVar, i11, 8);
        }
    }

    public static final void B(z1.r rVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(53895516);
        int i12 = i11 | 6;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            Object objQ2 = sVar.Q();
            vy.d dVar = null;
            if (objQ2 == gVar) {
                objQ2 = new b2(b1Var, dVar, 1);
                sVar.o0(objQ2);
            }
            l1.t.f((fz.e) objQ2, qy.b0.f48488a, sVar);
            a0.j0.d(((Boolean) b1Var.getValue()).booleanValue(), null, a0.f1.p(null, 3).a(a0.f1.g(null, CropImageView.DEFAULT_ASPECT_RATIO, 7)), a0.f1.u(null, 3).a(a0.f1.h(null, CropImageView.DEFAULT_ASPECT_RATIO, 7)), null, t1.e.d(-1154359756, new f(9), sVar), sVar, 200064, 18);
            rVar = z1.o.f58481a;
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new ch.g(rVar, i11, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012c  */
    /* JADX WARN: Code duplicated, block: B:102:0x0131  */
    /* JADX WARN: Code duplicated, block: B:105:0x0142  */
    /* JADX WARN: Code duplicated, block: B:109:0x014a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0154 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0156  */
    /* JADX WARN: Code duplicated, block: B:114:0x0159  */
    /* JADX WARN: Code duplicated, block: B:116:0x015c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0161  */
    /* JADX WARN: Code duplicated, block: B:120:0x0164  */
    /* JADX WARN: Code duplicated, block: B:121:0x0166  */
    /* JADX WARN: Code duplicated, block: B:123:0x0169  */
    /* JADX WARN: Code duplicated, block: B:124:0x016d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0171  */
    /* JADX WARN: Code duplicated, block: B:129:0x0186  */
    /* JADX WARN: Code duplicated, block: B:130:0x0189  */
    /* JADX WARN: Code duplicated, block: B:133:0x0192 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:134:0x0194  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:142:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:145:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:149:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:152:0x021b  */
    /* JADX WARN: Code duplicated, block: B:155:0x0250  */
    /* JADX WARN: Code duplicated, block: B:158:0x0270  */
    /* JADX WARN: Code duplicated, block: B:159:0x0273  */
    /* JADX WARN: Code duplicated, block: B:162:0x027b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:163:0x027d  */
    /* JADX WARN: Code duplicated, block: B:165:0x0293  */
    /* JADX WARN: Code duplicated, block: B:166:0x029e  */
    /* JADX WARN: Code duplicated, block: B:170:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:171:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:174:0x02c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:175:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:178:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:179:0x02da  */
    /* JADX WARN: Code duplicated, block: B:182:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:183:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:186:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:187:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:190:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:191:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:194:0x0314  */
    /* JADX WARN: Code duplicated, block: B:195:0x0317  */
    /* JADX WARN: Code duplicated, block: B:198:0x031f  */
    /* JADX WARN: Code duplicated, block: B:199:0x0322  */
    /* JADX WARN: Code duplicated, block: B:203:0x032b  */
    /* JADX WARN: Code duplicated, block: B:206:0x0335 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:209:0x0344  */
    /* JADX WARN: Code duplicated, block: B:211:0x0374  */
    /* JADX WARN: Code duplicated, block: B:214:0x0385  */
    /* JADX WARN: Code duplicated, block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    /* JADX WARN: Code duplicated, block: B:35:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:40:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0085  */
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    /* JADX WARN: Code duplicated, block: B:49:0x0095  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:86:0x0101  */
    /* JADX WARN: Code duplicated, block: B:88:0x0108  */
    /* JADX WARN: Code duplicated, block: B:90:0x010c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0116  */
    /* JADX WARN: Code duplicated, block: B:93:0x0119  */
    /* JADX WARN: Code duplicated, block: B:97:0x0123  */
    /* JADX WARN: Code duplicated, block: B:99:0x0129  */
    public static final void C(z1.r rVar, final j0.f fVar, z1.i iVar, z1.i iVar2, final boolean z11, final l1.b1 currentTextStyle, float f5, final float f11, int i11, long j11, final t1.d dVar, l1.n nVar, final int i12, final int i13, final int i14) {
        z1.r rVar2;
        int i15;
        final z1.i iVar3;
        int i16;
        z1.i iVar4;
        int i17;
        int i18;
        float f12;
        int i19;
        int i21;
        int i22;
        int i23;
        long jA;
        int i24;
        int i25;
        boolean z12;
        l1.s sVar;
        final int i26;
        final z1.r rVar3;
        final float f13;
        final long j12;
        final z1.i iVar5;
        final z1.i iVar6;
        l1.x1 x1VarT;
        z1.r rVar4;
        float f14;
        int i27;
        long j13;
        v3.c cVar;
        boolean z13;
        Object objQ;
        l1.g gVar;
        final int iIntValue;
        boolean z14;
        Object objQ2;
        final int iIntValue2;
        Object objQ3;
        l1.b1 b1Var;
        Object objQ4;
        final l1.b1 b1Var2;
        z1.i iVar7;
        Object objQ5;
        l1.b1 b1Var3;
        boolean z15;
        boolean z16;
        Object objQ6;
        long j14;
        final long j15;
        int i28;
        boolean z17;
        boolean zE;
        Object objQ7;
        final fz.c cVar2;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        Object objQ8;
        final int i29;
        final z1.i iVar8;
        int i30;
        int i31;
        int i32;
        int i33;
        kotlin.jvm.internal.m.f(currentTextStyle, "currentTextStyle");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1008797961);
        int i34 = i14 & 1;
        if (i34 != 0) {
            i15 = i12 | 6;
            rVar2 = rVar;
        } else if ((i12 & 6) == 0) {
            rVar2 = rVar;
            i15 = (sVar2.f(rVar2) ? 4 : 2) | i12;
        } else {
            rVar2 = rVar;
            i15 = i12;
        }
        if ((i12 & 48) == 0) {
            i15 |= sVar2.f(fVar) ? 32 : 16;
        }
        int i35 = i14 & 4;
        if (i35 == 0) {
            if ((i12 & 384) == 0) {
                iVar3 = iVar;
                i15 |= sVar2.f(iVar3) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i12 & 3072) == 0) {
                    iVar4 = iVar2;
                    if (sVar2.f(iVar4)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i15 |= i17;
                }
                if ((i12 & 24576) != 0) {
                    if (sVar2.g(z11)) {
                        i33 = 16384;
                    } else {
                        i33 = OSSConstants.DEFAULT_BUFFER_SIZE;
                    }
                    i15 |= i33;
                }
                if ((i12 & 196608) == 0) {
                    if (sVar2.f(currentTextStyle)) {
                        i32 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i32 = 65536;
                    }
                    i15 |= i32;
                }
                i18 = i14 & 64;
                if (i18 != 0) {
                    i15 |= 1572864;
                    f12 = f5;
                } else {
                    f12 = f5;
                    if ((i12 & 1572864) == 0) {
                        if (sVar2.c(f12)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i15 |= i19;
                    }
                }
                if ((i12 & 12582912) == 0) {
                    if (sVar2.c(f11)) {
                        i31 = 8388608;
                    } else {
                        i31 = 4194304;
                    }
                    i15 |= i31;
                }
                i21 = i14 & 256;
                if (i21 != 0) {
                    i15 |= 100663296;
                } else if ((i12 & 100663296) == 0) {
                    if (sVar2.d(i11)) {
                        i22 = 67108864;
                    } else {
                        i22 = 33554432;
                    }
                    i15 |= i22;
                }
                i23 = i14 & 512;
                if (i23 != 0) {
                    if ((i12 & 805306368) == 0) {
                        jA = j11;
                        if (sVar2.e(jA)) {
                            i24 = 536870912;
                        } else {
                            i24 = 268435456;
                        }
                        i15 |= i24;
                    }
                    if ((i13 & 6) == 0) {
                        if (sVar2.h(dVar)) {
                            i30 = 4;
                        } else {
                            i30 = 2;
                        }
                        i25 = i13 | i30;
                    } else {
                        i25 = i13;
                    }
                    if ((i15 & 306783379) == 306783378 || (i25 & 3) != 2) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (sVar2.T(i15 & 1, z12)) {
                        if (i34 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i35 != 0) {
                            iVar3 = z1.c.N;
                        }
                        if (i16 != 0) {
                            iVar4 = null;
                        }
                        if (i18 != 0) {
                            f14 = 0;
                        } else {
                            f14 = f12;
                        }
                        if (i21 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i11;
                        }
                        if (i23 != 0) {
                            jA = fr.j3.A(16);
                        }
                        j13 = jA;
                        cVar = (v3.c) sVar2.j(z2.g1.f58547h);
                        if ((3670016 & i15) == 1048576) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objQ = sVar2.Q();
                        gVar = l1.m.f39353a;
                        if (z13 || objQ == gVar) {
                            objQ = Integer.valueOf(cVar.n0(f14));
                            sVar2.o0(objQ);
                        }
                        iIntValue = ((Number) objQ).intValue();
                        if ((29360128 & i15) == 8388608) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objQ2 = sVar2.Q();
                        if (z14 || objQ2 == gVar) {
                            objQ2 = Integer.valueOf(cVar.n0(f11));
                            sVar2.o0(objQ2);
                        }
                        iIntValue2 = ((Number) objQ2).intValue();
                        objQ3 = sVar2.Q();
                        if (objQ3 == gVar) {
                            objQ3 = l1.t.B(new v3.o(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b));
                            sVar2.o0(objQ3);
                        }
                        b1Var = (l1.b1) objQ3;
                        objQ4 = sVar2.Q();
                        if (objQ4 == gVar) {
                            objQ4 = l1.t.B(null);
                            sVar2.o0(objQ4);
                        }
                        b1Var2 = (l1.b1) objQ4;
                        z1.r rVar5 = rVar4;
                        iVar7 = iVar4;
                        if (!v3.o.a(((v3.o) b1Var.getValue()).f53502a, ((j3.y0) currentTextStyle.getValue()).f35827a.f35755b)) {
                            v3.o.f(((v3.o) b1Var.getValue()).f53502a);
                            v3.o.f(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b);
                            b1Var.setValue(new v3.o(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b));
                            b1Var2.setValue(null);
                        }
                        objQ5 = sVar2.Q();
                        if (objQ5 == gVar) {
                            objQ5 = l1.t.B(Boolean.FALSE);
                            sVar2.o0(objQ5);
                        }
                        b1Var3 = (l1.b1) objQ5;
                        boolean zE2 = sVar2.e(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b);
                        if ((1879048192 & i15) == 536870912) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zE2 | z15;
                        objQ6 = sVar2.Q();
                        if (z16 || objQ6 == gVar) {
                            if (v3.o.c(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b) <= v3.o.c(j13)) {
                                j14 = ((j3.y0) currentTextStyle.getValue()).f35827a.f35755b;
                            } else {
                                j14 = j13;
                            }
                            v3.o oVar = new v3.o(j14);
                            sVar2.o0(oVar);
                            objQ6 = oVar;
                        }
                        j15 = ((v3.o) objQ6).f53502a;
                        i28 = 458752 & i15;
                        if (i28 == 131072) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zE = z17 | sVar2.e(j15);
                        objQ7 = sVar2.Q();
                        if (zE || objQ7 == gVar) {
                            objQ7 = new au.j(currentTextStyle, b1Var3, j15);
                            sVar2.o0(objQ7);
                        }
                        cVar2 = (fz.c) objQ7;
                        boolean zE3 = sVar2.e(j15);
                        if (i28 == 131072) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        boolean z25 = zE3 | z18;
                        if ((234881024 & i15) == 67108864) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        boolean z26 = z25 | z19;
                        if ((i25 & 14) == 4) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        boolean z27 = z26 | z20;
                        if ((57344 & i15) == 16384) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        boolean zD = z27 | z21 | sVar2.d(iIntValue) | sVar2.d(iIntValue2) | sVar2.f(cVar2);
                        if ((i15 & 112) == 32) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        boolean z28 = zD | z22;
                        if ((i15 & 7168) == 2048) {
                            z23 = true;
                        } else {
                            z23 = false;
                        }
                        z24 = z28 | z23 | ((i15 & 896) == 256);
                        objQ8 = sVar2.Q();
                        if (!z24 || objQ8 == gVar) {
                            sVar = sVar2;
                            i29 = i27;
                            iVar8 = iVar7;
                            fz.e eVar = new fz.e() { // from class: dt.l3
                                /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
                                /* JADX WARN: Code duplicated, block: B:26:0x00e8  */
                                /* JADX WARN: Code duplicated, block: B:28:0x010c  */
                                /* JADX WARN: Code duplicated, block: B:37:0x0126  */
                                /* JADX WARN: Code duplicated, block: B:44:0x0165  */
                                /* JADX WARN: Code duplicated, block: B:46:0x0184  */
                                /* JADX WARN: Code duplicated, block: B:47:0x01a2  */
                                /* JADX WARN: Code duplicated, block: B:49:0x01a6  */
                                /* JADX WARN: Code duplicated, block: B:51:0x01ac  */
                                /* JADX WARN: Code duplicated, block: B:66:0x0223  */
                                /* JADX WARN: Code duplicated, block: B:68:0x0248  */
                                /* JADX WARN: Code duplicated, block: B:69:0x024a A[PHI: r3 r18
                                  0x024a: PHI (r3v2 'SubcomposeLayout' w2.q1) = (r3v1 'SubcomposeLayout' w2.q1), (r3v4 'SubcomposeLayout' w2.q1) binds: [B:23:0x00cd, B:68:0x0248] A[DONT_GENERATE, DONT_INLINE]
                                  0x024a: PHI (r18v2 float) = (r18v1 float), (r18v4 float) binds: [B:23:0x00cd, B:68:0x0248] A[DONT_GENERATE, DONT_INLINE]] */
                                /* JADX WARN: Code duplicated, block: B:72:0x0269  */
                                /* JADX WARN: Code duplicated, block: B:73:0x026c  */
                                /* JADX WARN: Code duplicated, block: B:76:0x0276  */
                                @Override // fz.e
                                public final Object invoke(Object obj, Object obj2) {
                                    boolean z29;
                                    float f15;
                                    float f16;
                                    float f17;
                                    boolean z30;
                                    int iQ;
                                    int i36;
                                    long j16;
                                    float f18;
                                    int iR;
                                    int iH;
                                    final int i37;
                                    int iG;
                                    float f19;
                                    qy.r rVarD;
                                    List list;
                                    LinkedHashMap linkedHashMap;
                                    boolean z31;
                                    float f21;
                                    boolean z32;
                                    qy.r rVarD2;
                                    List list2;
                                    float f22;
                                    float f23;
                                    float f24;
                                    float f25;
                                    w2.q1 SubcomposeLayout = (w2.q1) obj;
                                    v3.a aVar = (v3.a) obj2;
                                    kotlin.jvm.internal.m.f(SubcomposeLayout, "$this$SubcomposeLayout");
                                    System.currentTimeMillis();
                                    float fC = v3.o.c(j15);
                                    l1.b1 b1Var4 = currentTextStyle;
                                    float fC2 = v3.o.c(((j3.y0) b1Var4.getValue()).f35827a.f35755b);
                                    float f26 = fC2 < fC ? fC : fC2;
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    final kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                                    yVar.f38361a = ry.r.f50854a;
                                    l1.b1 b1Var5 = b1Var2;
                                    v3.o oVar2 = (v3.o) b1Var5.getValue();
                                    final int i38 = iIntValue2;
                                    final int i39 = iIntValue;
                                    int i40 = i29;
                                    boolean z33 = z11;
                                    t1.d dVar2 = dVar;
                                    if (oVar2 != null) {
                                        f15 = fC;
                                        f16 = f26;
                                        long j17 = oVar2.f53502a;
                                        if (v3.o.c(j17) < f15 || v3.o.c(j17) > f16) {
                                            z29 = z33;
                                        } else {
                                            v3.o.c(j17);
                                            z29 = z33;
                                            qy.r rVarD3 = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z29, aVar, i39, i38, dVar2, i40, v3.o.c(j17));
                                            List list3 = (List) rVarD3.f48506b;
                                            if (!((Boolean) rVarD3.f48507c).booleanValue() || v3.o.c(j17) == f15) {
                                                v3.o.c(j17);
                                                float fC3 = v3.o.c(j17);
                                                yVar.f38361a = list3;
                                                int iR2 = e.R(i38, list3);
                                                int iQ2 = e.Q(i39, list3);
                                                f17 = fC3;
                                                i36 = iR2;
                                                iQ = iQ2;
                                                z30 = true;
                                                if (z30) {
                                                    j16 = 4294967296L;
                                                    f18 = f17;
                                                    iR = i36;
                                                } else {
                                                    f19 = f16;
                                                    rVarD = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z29, aVar, i39, i38, dVar2, i40, f19);
                                                    list = (List) rVarD.f48506b;
                                                    if (((Boolean) rVarD.f48507c).booleanValue()) {
                                                        if (list.size() == i40 + 1 || f19 <= f15) {
                                                            linkedHashMap = linkedHashMap2;
                                                            z31 = false;
                                                        } else {
                                                            float f27 = f19 - 1.0f;
                                                            if (f27 < f15) {
                                                                f27 = f15;
                                                            }
                                                            if (f27 == f19) {
                                                                linkedHashMap = linkedHashMap2;
                                                            } else {
                                                                qy.r rVarD4 = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z29, aVar, i39, i38, dVar2, i40, f27);
                                                                linkedHashMap = linkedHashMap2;
                                                                List list4 = (List) rVarD4.f48506b;
                                                                if (!((Boolean) rVarD4.f48507c).booleanValue()) {
                                                                    yVar.f38361a = list4;
                                                                    b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f27)));
                                                                    f17 = f27;
                                                                    z31 = true;
                                                                }
                                                            }
                                                            z31 = false;
                                                        }
                                                        if (z31) {
                                                            SubcomposeLayout = SubcomposeLayout;
                                                            j16 = 4294967296L;
                                                            f18 = f17;
                                                            iR = i36;
                                                        } else {
                                                            f21 = f15;
                                                            LinkedHashMap linkedHashMap3 = linkedHashMap;
                                                            rVarD2 = e.D(linkedHashMap3, b1Var4, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f21);
                                                            list2 = (List) rVarD2.f48506b;
                                                            if (((Boolean) rVarD2.f48507c).booleanValue()) {
                                                                SubcomposeLayout = SubcomposeLayout;
                                                                z32 = z29;
                                                                yVar.f38361a = list2;
                                                                iR = e.R(i38, list2);
                                                                iQ = e.Q(i39, list2);
                                                                b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f21)));
                                                                f18 = f21;
                                                            } else {
                                                                if (f19 > f21) {
                                                                    f22 = f19 - f21;
                                                                    if (f22 >= 1.0f) {
                                                                        SubcomposeLayout = SubcomposeLayout;
                                                                        z32 = z29;
                                                                        l1.b1 b1Var6 = b1Var4;
                                                                        int iCeil = (int) Math.ceil((float) (Math.log(f22 + 1) / hz.a.f33863a));
                                                                        int i41 = 2;
                                                                        int i42 = iCeil + 2;
                                                                        f23 = f19;
                                                                        int i43 = 0;
                                                                        f24 = f21;
                                                                        List list5 = list2;
                                                                        float f28 = f24;
                                                                        while (true) {
                                                                            f25 = f23 - f24;
                                                                            if (f25 >= 1.0f && i43 < i42) {
                                                                                i43++;
                                                                                float f29 = (f25 / i41) + f24;
                                                                                if (f29 == f24 || f29 == f23) {
                                                                                    break;
                                                                                }
                                                                                b1Var6 = b1Var6;
                                                                                List list6 = list5;
                                                                                float f30 = f24;
                                                                                i42 = i42;
                                                                                qy.r rVarD5 = e.D(linkedHashMap3, b1Var6, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f29);
                                                                                List list7 = (List) rVarD5.f48506b;
                                                                                if (((Boolean) rVarD5.f48507c).booleanValue()) {
                                                                                    f24 = f30;
                                                                                    f23 = f29;
                                                                                    list5 = list6;
                                                                                    i41 = 2;
                                                                                } else {
                                                                                    f24 = f29;
                                                                                    f28 = f24;
                                                                                    i41 = 2;
                                                                                    list5 = list7;
                                                                                }
                                                                            } else {
                                                                                break;
                                                                            }
                                                                        }
                                                                        yVar.f38361a = list5;
                                                                        f18 = f28;
                                                                    } else {
                                                                        SubcomposeLayout = SubcomposeLayout;
                                                                        z32 = z29;
                                                                        SubcomposeLayout = SubcomposeLayout;
                                                                        z32 = z29;
                                                                        yVar.f38361a = list2;
                                                                        f18 = f21;
                                                                    }
                                                                } else {
                                                                    SubcomposeLayout = SubcomposeLayout;
                                                                    z32 = z29;
                                                                    SubcomposeLayout = SubcomposeLayout;
                                                                    z32 = z29;
                                                                    yVar.f38361a = list2;
                                                                    f18 = f21;
                                                                }
                                                                iR = e.R(i38, (List) yVar.f38361a);
                                                                iQ = e.Q(i39, (List) yVar.f38361a);
                                                                j16 = 4294967296L;
                                                                b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f18)));
                                                            }
                                                        }
                                                    } else {
                                                        yVar.f38361a = list;
                                                        int iR3 = e.R(i38, list);
                                                        iQ = e.Q(i39, list);
                                                        b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f19)));
                                                        f18 = f19;
                                                        iR = iR3;
                                                    }
                                                    j16 = 4294967296L;
                                                }
                                                cVar2.invoke(new v3.o(fr.j3.L(j16, f18)));
                                                iH = v3.a.h(aVar.f53483a);
                                                if (iQ > iH) {
                                                    i37 = iH;
                                                } else {
                                                    i37 = iQ;
                                                }
                                                iG = v3.a.g(aVar.f53483a);
                                                if (iR > iG) {
                                                    iR = iG;
                                                }
                                                System.currentTimeMillis();
                                                ((List) yVar.f38361a).size();
                                                final j0.f fVar2 = fVar;
                                                final z1.i iVar9 = iVar8;
                                                final z1.i iVar10 = iVar3;
                                                return SubcomposeLayout.q0(i37, iR, ry.s.f50855a, new fz.c() { // from class: dt.n3
                                                    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
                                                    @Override // fz.c
                                                    public final Object invoke(Object obj3) {
                                                        Integer num;
                                                        int i44;
                                                        z1.i iVar11;
                                                        int iA;
                                                        w2.f1 layout = (w2.f1) obj3;
                                                        kotlin.jvm.internal.m.f(layout, "$this$layout");
                                                        int i45 = 0;
                                                        int i46 = 0;
                                                        for (List<w2.g1> list8 : (Iterable) yVar.f38361a) {
                                                            if (!list8.isEmpty()) {
                                                                Iterator it = list8.iterator();
                                                                if (it.hasNext()) {
                                                                    Integer numValueOf = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                                    while (it.hasNext()) {
                                                                        Integer numValueOf2 = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                                        if (numValueOf.compareTo(numValueOf2) < 0) {
                                                                            numValueOf = numValueOf2;
                                                                        }
                                                                    }
                                                                    num = numValueOf;
                                                                } else {
                                                                    num = null;
                                                                }
                                                                int iIntValue3 = num != null ? num.intValue() : 0;
                                                                int size = list8.size() - 1;
                                                                if (size < 0) {
                                                                    size = 0;
                                                                }
                                                                int i47 = i39;
                                                                int i48 = size * i47;
                                                                Iterator it2 = list8.iterator();
                                                                int i49 = 0;
                                                                while (it2.hasNext()) {
                                                                    i49 += ((w2.g1) it2.next()).f54501a;
                                                                }
                                                                int i50 = i49 + i48;
                                                                j0.b bVar = j0.i.f35303a;
                                                                j0.f fVar3 = fVar2;
                                                                if (kotlin.jvm.internal.m.a(fVar3, bVar)) {
                                                                    i44 = 0;
                                                                } else {
                                                                    boolean zA = kotlin.jvm.internal.m.a(fVar3, j0.i.f35307e);
                                                                    int i51 = i37;
                                                                    if (zA) {
                                                                        int i52 = i51 - i50;
                                                                        if (i52 < 0) {
                                                                            i52 = 0;
                                                                        }
                                                                        i44 = i52 / 2;
                                                                    } else if (!kotlin.jvm.internal.m.a(fVar3, j0.i.f35304b) || (i44 = i51 - i50) < 0) {
                                                                        i44 = 0;
                                                                    }
                                                                }
                                                                for (w2.g1 g1Var : list8) {
                                                                    if (i46 != 0 || (iVar11 = iVar9) == null) {
                                                                        iVar11 = iVar10;
                                                                    }
                                                                    if (kotlin.jvm.internal.m.a(iVar11, z1.c.L)) {
                                                                        iA = 0;
                                                                    } else {
                                                                        z1.i iVar12 = z1.c.M;
                                                                        iA = kotlin.jvm.internal.m.a(iVar11, iVar12) ? (iIntValue3 - g1Var.f54502b) / 2 : kotlin.jvm.internal.m.a(iVar11, z1.c.N) ? iIntValue3 - g1Var.f54502b : iVar12.a(g1Var.f54502b, iIntValue3);
                                                                    }
                                                                    w2.f1.k(layout, g1Var, i44, iA + i45);
                                                                    i44 += g1Var.f54501a + i47;
                                                                    i46++;
                                                                }
                                                                i45 += iIntValue3 + i38;
                                                            }
                                                        }
                                                        return qy.b0.f48488a;
                                                    }
                                                });
                                            }
                                            v3.o.c(j17);
                                            b1Var5.setValue(null);
                                        }
                                    } else {
                                        z29 = z33;
                                        f15 = fC;
                                        f16 = f26;
                                    }
                                    f17 = f15;
                                    z30 = false;
                                    iQ = 0;
                                    i36 = 0;
                                    if (z30) {
                                        f19 = f16;
                                        rVarD = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z29, aVar, i39, i38, dVar2, i40, f19);
                                        list = (List) rVarD.f48506b;
                                        if (((Boolean) rVarD.f48507c).booleanValue()) {
                                            yVar.f38361a = list;
                                            int iR4 = e.R(i38, list);
                                            iQ = e.Q(i39, list);
                                            b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f19)));
                                            f18 = f19;
                                            iR = iR4;
                                        } else {
                                            if (list.size() == i40 + 1) {
                                                linkedHashMap = linkedHashMap2;
                                                z31 = false;
                                            } else {
                                                linkedHashMap = linkedHashMap2;
                                                z31 = false;
                                            }
                                            if (z31) {
                                                f21 = f15;
                                                LinkedHashMap linkedHashMap4 = linkedHashMap;
                                                rVarD2 = e.D(linkedHashMap4, b1Var4, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f21);
                                                list2 = (List) rVarD2.f48506b;
                                                if (((Boolean) rVarD2.f48507c).booleanValue()) {
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    z32 = z29;
                                                    yVar.f38361a = list2;
                                                    iR = e.R(i38, list2);
                                                    iQ = e.Q(i39, list2);
                                                    b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f21)));
                                                    f18 = f21;
                                                } else {
                                                    if (f19 > f21) {
                                                        f22 = f19 - f21;
                                                        if (f22 >= 1.0f) {
                                                            SubcomposeLayout = SubcomposeLayout;
                                                            z32 = z29;
                                                            l1.b1 b1Var7 = b1Var4;
                                                            int iCeil2 = (int) Math.ceil((float) (Math.log(f22 + 1) / hz.a.f33863a));
                                                            int i44 = 2;
                                                            int i45 = iCeil2 + 2;
                                                            f23 = f19;
                                                            int i46 = 0;
                                                            f24 = f21;
                                                            List list8 = list2;
                                                            float f210 = f24;
                                                            while (true) {
                                                                f25 = f23 - f24;
                                                                if (f25 >= 1.0f) {
                                                                    break;
                                                                }
                                                                break;
                                                                break;
                                                            }
                                                            yVar.f38361a = list8;
                                                            f18 = f210;
                                                        } else {
                                                            SubcomposeLayout = SubcomposeLayout;
                                                            z32 = z29;
                                                            SubcomposeLayout = SubcomposeLayout;
                                                            z32 = z29;
                                                            yVar.f38361a = list2;
                                                            f18 = f21;
                                                        }
                                                    } else {
                                                        SubcomposeLayout = SubcomposeLayout;
                                                        z32 = z29;
                                                        SubcomposeLayout = SubcomposeLayout;
                                                        z32 = z29;
                                                        yVar.f38361a = list2;
                                                        f18 = f21;
                                                    }
                                                    iR = e.R(i38, (List) yVar.f38361a);
                                                    iQ = e.Q(i39, (List) yVar.f38361a);
                                                    j16 = 4294967296L;
                                                    b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f18)));
                                                }
                                            } else {
                                                SubcomposeLayout = SubcomposeLayout;
                                                j16 = 4294967296L;
                                                f18 = f17;
                                                iR = i36;
                                            }
                                        }
                                        j16 = 4294967296L;
                                    } else {
                                        j16 = 4294967296L;
                                        f18 = f17;
                                        iR = i36;
                                    }
                                    cVar2.invoke(new v3.o(fr.j3.L(j16, f18)));
                                    iH = v3.a.h(aVar.f53483a);
                                    if (iQ > iH) {
                                        i37 = iH;
                                    } else {
                                        i37 = iQ;
                                    }
                                    iG = v3.a.g(aVar.f53483a);
                                    if (iR > iG) {
                                        iR = iG;
                                    }
                                    System.currentTimeMillis();
                                    ((List) yVar.f38361a).size();
                                    final j0.f fVar3 = fVar;
                                    final z1.i iVar11 = iVar8;
                                    final z1.i iVar12 = iVar3;
                                    return SubcomposeLayout.q0(i37, iR, ry.s.f50855a, new fz.c() { // from class: dt.n3
                                        /* JADX WARN: Code duplicated, block: B:29:0x008d  */
                                        @Override // fz.c
                                        public final Object invoke(Object obj3) {
                                            Integer num;
                                            int i47;
                                            z1.i iVar13;
                                            int iA;
                                            w2.f1 layout = (w2.f1) obj3;
                                            kotlin.jvm.internal.m.f(layout, "$this$layout");
                                            int i48 = 0;
                                            int i49 = 0;
                                            for (List<w2.g1> list9 : (Iterable) yVar.f38361a) {
                                                if (!list9.isEmpty()) {
                                                    Iterator it = list9.iterator();
                                                    if (it.hasNext()) {
                                                        Integer numValueOf = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                        while (it.hasNext()) {
                                                            Integer numValueOf2 = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                            if (numValueOf.compareTo(numValueOf2) < 0) {
                                                                numValueOf = numValueOf2;
                                                            }
                                                        }
                                                        num = numValueOf;
                                                    } else {
                                                        num = null;
                                                    }
                                                    int iIntValue3 = num != null ? num.intValue() : 0;
                                                    int size = list9.size() - 1;
                                                    if (size < 0) {
                                                        size = 0;
                                                    }
                                                    int i410 = i39;
                                                    int i411 = size * i410;
                                                    Iterator it2 = list9.iterator();
                                                    int i412 = 0;
                                                    while (it2.hasNext()) {
                                                        i412 += ((w2.g1) it2.next()).f54501a;
                                                    }
                                                    int i50 = i412 + i411;
                                                    j0.b bVar = j0.i.f35303a;
                                                    j0.f fVar4 = fVar3;
                                                    if (kotlin.jvm.internal.m.a(fVar4, bVar)) {
                                                        i47 = 0;
                                                    } else {
                                                        boolean zA = kotlin.jvm.internal.m.a(fVar4, j0.i.f35307e);
                                                        int i51 = i37;
                                                        if (zA) {
                                                            int i52 = i51 - i50;
                                                            if (i52 < 0) {
                                                                i52 = 0;
                                                            }
                                                            i47 = i52 / 2;
                                                        } else if (!kotlin.jvm.internal.m.a(fVar4, j0.i.f35304b) || (i47 = i51 - i50) < 0) {
                                                            i47 = 0;
                                                        }
                                                    }
                                                    for (w2.g1 g1Var : list9) {
                                                        if (i49 != 0 || (iVar13 = iVar11) == null) {
                                                            iVar13 = iVar12;
                                                        }
                                                        if (kotlin.jvm.internal.m.a(iVar13, z1.c.L)) {
                                                            iA = 0;
                                                        } else {
                                                            z1.i iVar14 = z1.c.M;
                                                            iA = kotlin.jvm.internal.m.a(iVar13, iVar14) ? (iIntValue3 - g1Var.f54502b) / 2 : kotlin.jvm.internal.m.a(iVar13, z1.c.N) ? iIntValue3 - g1Var.f54502b : iVar14.a(g1Var.f54502b, iIntValue3);
                                                        }
                                                        w2.f1.k(layout, g1Var, i47, iA + i48);
                                                        i47 += g1Var.f54501a + i410;
                                                        i49++;
                                                    }
                                                    i48 += iIntValue3 + i38;
                                                }
                                            }
                                            return qy.b0.f48488a;
                                        }
                                    });
                                }
                            };
                            sVar.o0(eVar);
                            objQ8 = eVar;
                        } else {
                            iVar8 = iVar7;
                            sVar = sVar2;
                            i29 = i27;
                        }
                        w2.a0.b(rVar5, (fz.e) objQ8, sVar, i15 & 14, 0);
                        i26 = i29;
                        rVar3 = rVar5;
                        f13 = f14;
                        j12 = j13;
                        iVar6 = iVar8;
                        iVar5 = iVar3;
                    } else {
                        sVar = sVar2;
                        sVar.W();
                        i26 = i11;
                        rVar3 = rVar2;
                        f13 = f12;
                        j12 = jA;
                        iVar5 = iVar3;
                        iVar6 = iVar4;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new fz.e() { // from class: dt.m3
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iM = l1.t.M(i12 | 1);
                                int iM2 = l1.t.M(i13);
                                e.C(rVar3, fVar, iVar5, iVar6, z11, currentTextStyle, f13, f11, i26, j12, dVar, (l1.n) obj, iM, iM2, i14);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i15 |= 805306368;
                jA = j11;
                if ((i13 & 6) == 0) {
                    if (sVar2.h(dVar)) {
                        i30 = 4;
                    } else {
                        i30 = 2;
                    }
                    i25 = i13 | i30;
                } else {
                    i25 = i13;
                }
                if ((i15 & 306783379) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (sVar2.T(i15 & 1, z12)) {
                    if (i34 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i35 != 0) {
                        iVar3 = z1.c.N;
                    }
                    if (i16 != 0) {
                        iVar4 = null;
                    }
                    if (i18 != 0) {
                        f14 = 0;
                    } else {
                        f14 = f12;
                    }
                    if (i21 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i23 != 0) {
                        jA = fr.j3.A(16);
                    }
                    j13 = jA;
                    cVar = (v3.c) sVar2.j(z2.g1.f58547h);
                    if ((3670016 & i15) == 1048576) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objQ = sVar2.Q();
                    gVar = l1.m.f39353a;
                    if (z13) {
                        objQ = Integer.valueOf(cVar.n0(f14));
                        sVar2.o0(objQ);
                    } else {
                        objQ = Integer.valueOf(cVar.n0(f14));
                        sVar2.o0(objQ);
                    }
                    iIntValue = ((Number) objQ).intValue();
                    if ((29360128 & i15) == 8388608) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objQ2 = sVar2.Q();
                    if (z14) {
                        objQ2 = Integer.valueOf(cVar.n0(f11));
                        sVar2.o0(objQ2);
                    } else {
                        objQ2 = Integer.valueOf(cVar.n0(f11));
                        sVar2.o0(objQ2);
                    }
                    iIntValue2 = ((Number) objQ2).intValue();
                    objQ3 = sVar2.Q();
                    if (objQ3 == gVar) {
                        objQ3 = l1.t.B(new v3.o(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b));
                        sVar2.o0(objQ3);
                    }
                    b1Var = (l1.b1) objQ3;
                    objQ4 = sVar2.Q();
                    if (objQ4 == gVar) {
                        objQ4 = l1.t.B(null);
                        sVar2.o0(objQ4);
                    }
                    b1Var2 = (l1.b1) objQ4;
                    z1.r rVar6 = rVar4;
                    iVar7 = iVar4;
                    if (!v3.o.a(((v3.o) b1Var.getValue()).f53502a, ((j3.y0) currentTextStyle.getValue()).f35827a.f35755b)) {
                        v3.o.f(((v3.o) b1Var.getValue()).f53502a);
                        v3.o.f(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b);
                        b1Var.setValue(new v3.o(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b));
                        b1Var2.setValue(null);
                    }
                    objQ5 = sVar2.Q();
                    if (objQ5 == gVar) {
                        objQ5 = l1.t.B(Boolean.FALSE);
                        sVar2.o0(objQ5);
                    }
                    b1Var3 = (l1.b1) objQ5;
                    boolean zE4 = sVar2.e(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b);
                    if ((1879048192 & i15) == 536870912) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zE4 | z15;
                    objQ6 = sVar2.Q();
                    if (z16) {
                        if (v3.o.c(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b) <= v3.o.c(j13)) {
                            j14 = ((j3.y0) currentTextStyle.getValue()).f35827a.f35755b;
                        } else {
                            j14 = j13;
                        }
                        v3.o oVar2 = new v3.o(j14);
                        sVar2.o0(oVar2);
                        objQ6 = oVar2;
                    } else {
                        if (v3.o.c(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b) <= v3.o.c(j13)) {
                            j14 = ((j3.y0) currentTextStyle.getValue()).f35827a.f35755b;
                        } else {
                            j14 = j13;
                        }
                        v3.o oVar3 = new v3.o(j14);
                        sVar2.o0(oVar3);
                        objQ6 = oVar3;
                    }
                    j15 = ((v3.o) objQ6).f53502a;
                    i28 = 458752 & i15;
                    if (i28 == 131072) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zE = z17 | sVar2.e(j15);
                    objQ7 = sVar2.Q();
                    if (zE) {
                        objQ7 = new au.j(currentTextStyle, b1Var3, j15);
                        sVar2.o0(objQ7);
                    } else {
                        objQ7 = new au.j(currentTextStyle, b1Var3, j15);
                        sVar2.o0(objQ7);
                    }
                    cVar2 = (fz.c) objQ7;
                    boolean zE5 = sVar2.e(j15);
                    if (i28 == 131072) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean z29 = zE5 | z18;
                    if ((234881024 & i15) == 67108864) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z210 = z29 | z19;
                    if ((i25 & 14) == 4) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    boolean z211 = z210 | z20;
                    if ((57344 & i15) == 16384) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    boolean zD2 = z211 | z21 | sVar2.d(iIntValue) | sVar2.d(iIntValue2) | sVar2.f(cVar2);
                    if ((i15 & 112) == 32) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    boolean z212 = zD2 | z22;
                    if ((i15 & 7168) == 2048) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    z24 = z212 | z23 | ((i15 & 896) == 256);
                    objQ8 = sVar2.Q();
                    if (z24) {
                        sVar = sVar2;
                        i29 = i27;
                        iVar8 = iVar7;
                        fz.e eVar2 = new fz.e() { // from class: dt.l3
                            /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
                            /* JADX WARN: Code duplicated, block: B:26:0x00e8  */
                            /* JADX WARN: Code duplicated, block: B:28:0x010c  */
                            /* JADX WARN: Code duplicated, block: B:37:0x0126  */
                            /* JADX WARN: Code duplicated, block: B:44:0x0165  */
                            /* JADX WARN: Code duplicated, block: B:46:0x0184  */
                            /* JADX WARN: Code duplicated, block: B:47:0x01a2  */
                            /* JADX WARN: Code duplicated, block: B:49:0x01a6  */
                            /* JADX WARN: Code duplicated, block: B:51:0x01ac  */
                            /* JADX WARN: Code duplicated, block: B:66:0x0223  */
                            /* JADX WARN: Code duplicated, block: B:68:0x0248  */
                            /* JADX WARN: Code duplicated, block: B:69:0x024a A[PHI: r3 r18
                              0x024a: PHI (r3v2 'SubcomposeLayout' w2.q1) = (r3v1 'SubcomposeLayout' w2.q1), (r3v4 'SubcomposeLayout' w2.q1) binds: [B:23:0x00cd, B:68:0x0248] A[DONT_GENERATE, DONT_INLINE]
                              0x024a: PHI (r18v2 float) = (r18v1 float), (r18v4 float) binds: [B:23:0x00cd, B:68:0x0248] A[DONT_GENERATE, DONT_INLINE]] */
                            /* JADX WARN: Code duplicated, block: B:72:0x0269  */
                            /* JADX WARN: Code duplicated, block: B:73:0x026c  */
                            /* JADX WARN: Code duplicated, block: B:76:0x0276  */
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                boolean z213;
                                float f15;
                                float f16;
                                float f17;
                                boolean z30;
                                int iQ;
                                int i36;
                                long j16;
                                float f18;
                                int iR;
                                int iH;
                                final int i37;
                                int iG;
                                float f19;
                                qy.r rVarD;
                                List list;
                                LinkedHashMap linkedHashMap;
                                boolean z31;
                                float f21;
                                boolean z32;
                                qy.r rVarD2;
                                List list2;
                                float f22;
                                float f23;
                                float f24;
                                float f25;
                                w2.q1 SubcomposeLayout = (w2.q1) obj;
                                v3.a aVar = (v3.a) obj2;
                                kotlin.jvm.internal.m.f(SubcomposeLayout, "$this$SubcomposeLayout");
                                System.currentTimeMillis();
                                float fC = v3.o.c(j15);
                                l1.b1 b1Var4 = currentTextStyle;
                                float fC2 = v3.o.c(((j3.y0) b1Var4.getValue()).f35827a.f35755b);
                                float f26 = fC2 < fC ? fC : fC2;
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                final kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                                yVar.f38361a = ry.r.f50854a;
                                l1.b1 b1Var5 = b1Var2;
                                v3.o oVar4 = (v3.o) b1Var5.getValue();
                                final int i38 = iIntValue2;
                                final int i39 = iIntValue;
                                int i40 = i29;
                                boolean z33 = z11;
                                t1.d dVar2 = dVar;
                                if (oVar4 != null) {
                                    f15 = fC;
                                    f16 = f26;
                                    long j17 = oVar4.f53502a;
                                    if (v3.o.c(j17) < f15 || v3.o.c(j17) > f16) {
                                        z213 = z33;
                                    } else {
                                        v3.o.c(j17);
                                        z213 = z33;
                                        qy.r rVarD3 = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z213, aVar, i39, i38, dVar2, i40, v3.o.c(j17));
                                        List list3 = (List) rVarD3.f48506b;
                                        if (!((Boolean) rVarD3.f48507c).booleanValue() || v3.o.c(j17) == f15) {
                                            v3.o.c(j17);
                                            float fC3 = v3.o.c(j17);
                                            yVar.f38361a = list3;
                                            int iR2 = e.R(i38, list3);
                                            int iQ2 = e.Q(i39, list3);
                                            f17 = fC3;
                                            i36 = iR2;
                                            iQ = iQ2;
                                            z30 = true;
                                            if (z30) {
                                                j16 = 4294967296L;
                                                f18 = f17;
                                                iR = i36;
                                            } else {
                                                f19 = f16;
                                                rVarD = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z213, aVar, i39, i38, dVar2, i40, f19);
                                                list = (List) rVarD.f48506b;
                                                if (((Boolean) rVarD.f48507c).booleanValue()) {
                                                    if (list.size() == i40 + 1 || f19 <= f15) {
                                                        linkedHashMap = linkedHashMap2;
                                                        z31 = false;
                                                    } else {
                                                        float f27 = f19 - 1.0f;
                                                        if (f27 < f15) {
                                                            f27 = f15;
                                                        }
                                                        if (f27 == f19) {
                                                            linkedHashMap = linkedHashMap2;
                                                        } else {
                                                            qy.r rVarD4 = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z213, aVar, i39, i38, dVar2, i40, f27);
                                                            linkedHashMap = linkedHashMap2;
                                                            List list4 = (List) rVarD4.f48506b;
                                                            if (!((Boolean) rVarD4.f48507c).booleanValue()) {
                                                                yVar.f38361a = list4;
                                                                b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f27)));
                                                                f17 = f27;
                                                                z31 = true;
                                                            }
                                                        }
                                                        z31 = false;
                                                    }
                                                    if (z31) {
                                                        SubcomposeLayout = SubcomposeLayout;
                                                        j16 = 4294967296L;
                                                        f18 = f17;
                                                        iR = i36;
                                                    } else {
                                                        f21 = f15;
                                                        LinkedHashMap linkedHashMap4 = linkedHashMap;
                                                        rVarD2 = e.D(linkedHashMap4, b1Var4, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f21);
                                                        list2 = (List) rVarD2.f48506b;
                                                        if (((Boolean) rVarD2.f48507c).booleanValue()) {
                                                            SubcomposeLayout = SubcomposeLayout;
                                                            z32 = z213;
                                                            yVar.f38361a = list2;
                                                            iR = e.R(i38, list2);
                                                            iQ = e.Q(i39, list2);
                                                            b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f21)));
                                                            f18 = f21;
                                                        } else {
                                                            if (f19 > f21) {
                                                                f22 = f19 - f21;
                                                                if (f22 >= 1.0f) {
                                                                    SubcomposeLayout = SubcomposeLayout;
                                                                    z32 = z213;
                                                                    l1.b1 b1Var7 = b1Var4;
                                                                    int iCeil2 = (int) Math.ceil((float) (Math.log(f22 + 1) / hz.a.f33863a));
                                                                    int i44 = 2;
                                                                    int i45 = iCeil2 + 2;
                                                                    f23 = f19;
                                                                    int i46 = 0;
                                                                    f24 = f21;
                                                                    List list8 = list2;
                                                                    float f210 = f24;
                                                                    while (true) {
                                                                        f25 = f23 - f24;
                                                                        if (f25 >= 1.0f && i46 < i45) {
                                                                            i46++;
                                                                            float f29 = (f25 / i44) + f24;
                                                                            if (f29 == f24 || f29 == f23) {
                                                                                break;
                                                                            }
                                                                            b1Var7 = b1Var7;
                                                                            List list6 = list8;
                                                                            float f30 = f24;
                                                                            i45 = i45;
                                                                            qy.r rVarD5 = e.D(linkedHashMap4, b1Var7, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f29);
                                                                            List list7 = (List) rVarD5.f48506b;
                                                                            if (((Boolean) rVarD5.f48507c).booleanValue()) {
                                                                                f24 = f30;
                                                                                f23 = f29;
                                                                                list8 = list6;
                                                                                i44 = 2;
                                                                            } else {
                                                                                f24 = f29;
                                                                                f210 = f24;
                                                                                i44 = 2;
                                                                                list8 = list7;
                                                                            }
                                                                        } else {
                                                                            break;
                                                                        }
                                                                    }
                                                                    yVar.f38361a = list8;
                                                                    f18 = f210;
                                                                } else {
                                                                    SubcomposeLayout = SubcomposeLayout;
                                                                    z32 = z213;
                                                                    SubcomposeLayout = SubcomposeLayout;
                                                                    z32 = z213;
                                                                    yVar.f38361a = list2;
                                                                    f18 = f21;
                                                                }
                                                            } else {
                                                                SubcomposeLayout = SubcomposeLayout;
                                                                z32 = z213;
                                                                SubcomposeLayout = SubcomposeLayout;
                                                                z32 = z213;
                                                                yVar.f38361a = list2;
                                                                f18 = f21;
                                                            }
                                                            iR = e.R(i38, (List) yVar.f38361a);
                                                            iQ = e.Q(i39, (List) yVar.f38361a);
                                                            j16 = 4294967296L;
                                                            b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f18)));
                                                        }
                                                    }
                                                } else {
                                                    yVar.f38361a = list;
                                                    int iR4 = e.R(i38, list);
                                                    iQ = e.Q(i39, list);
                                                    b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f19)));
                                                    f18 = f19;
                                                    iR = iR4;
                                                }
                                                j16 = 4294967296L;
                                            }
                                            cVar2.invoke(new v3.o(fr.j3.L(j16, f18)));
                                            iH = v3.a.h(aVar.f53483a);
                                            if (iQ > iH) {
                                                i37 = iH;
                                            } else {
                                                i37 = iQ;
                                            }
                                            iG = v3.a.g(aVar.f53483a);
                                            if (iR > iG) {
                                                iR = iG;
                                            }
                                            System.currentTimeMillis();
                                            ((List) yVar.f38361a).size();
                                            final j0.f fVar3 = fVar;
                                            final z1.i iVar11 = iVar8;
                                            final z1.i iVar12 = iVar3;
                                            return SubcomposeLayout.q0(i37, iR, ry.s.f50855a, new fz.c() { // from class: dt.n3
                                                /* JADX WARN: Code duplicated, block: B:29:0x008d  */
                                                @Override // fz.c
                                                public final Object invoke(Object obj3) {
                                                    Integer num;
                                                    int i47;
                                                    z1.i iVar13;
                                                    int iA;
                                                    w2.f1 layout = (w2.f1) obj3;
                                                    kotlin.jvm.internal.m.f(layout, "$this$layout");
                                                    int i48 = 0;
                                                    int i49 = 0;
                                                    for (List<w2.g1> list9 : (Iterable) yVar.f38361a) {
                                                        if (!list9.isEmpty()) {
                                                            Iterator it = list9.iterator();
                                                            if (it.hasNext()) {
                                                                Integer numValueOf = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                                while (it.hasNext()) {
                                                                    Integer numValueOf2 = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                                    if (numValueOf.compareTo(numValueOf2) < 0) {
                                                                        numValueOf = numValueOf2;
                                                                    }
                                                                }
                                                                num = numValueOf;
                                                            } else {
                                                                num = null;
                                                            }
                                                            int iIntValue3 = num != null ? num.intValue() : 0;
                                                            int size = list9.size() - 1;
                                                            if (size < 0) {
                                                                size = 0;
                                                            }
                                                            int i410 = i39;
                                                            int i411 = size * i410;
                                                            Iterator it2 = list9.iterator();
                                                            int i412 = 0;
                                                            while (it2.hasNext()) {
                                                                i412 += ((w2.g1) it2.next()).f54501a;
                                                            }
                                                            int i50 = i412 + i411;
                                                            j0.b bVar = j0.i.f35303a;
                                                            j0.f fVar4 = fVar3;
                                                            if (kotlin.jvm.internal.m.a(fVar4, bVar)) {
                                                                i47 = 0;
                                                            } else {
                                                                boolean zA = kotlin.jvm.internal.m.a(fVar4, j0.i.f35307e);
                                                                int i51 = i37;
                                                                if (zA) {
                                                                    int i52 = i51 - i50;
                                                                    if (i52 < 0) {
                                                                        i52 = 0;
                                                                    }
                                                                    i47 = i52 / 2;
                                                                } else if (!kotlin.jvm.internal.m.a(fVar4, j0.i.f35304b) || (i47 = i51 - i50) < 0) {
                                                                    i47 = 0;
                                                                }
                                                            }
                                                            for (w2.g1 g1Var : list9) {
                                                                if (i49 != 0 || (iVar13 = iVar11) == null) {
                                                                    iVar13 = iVar12;
                                                                }
                                                                if (kotlin.jvm.internal.m.a(iVar13, z1.c.L)) {
                                                                    iA = 0;
                                                                } else {
                                                                    z1.i iVar14 = z1.c.M;
                                                                    iA = kotlin.jvm.internal.m.a(iVar13, iVar14) ? (iIntValue3 - g1Var.f54502b) / 2 : kotlin.jvm.internal.m.a(iVar13, z1.c.N) ? iIntValue3 - g1Var.f54502b : iVar14.a(g1Var.f54502b, iIntValue3);
                                                                }
                                                                w2.f1.k(layout, g1Var, i47, iA + i48);
                                                                i47 += g1Var.f54501a + i410;
                                                                i49++;
                                                            }
                                                            i48 += iIntValue3 + i38;
                                                        }
                                                    }
                                                    return qy.b0.f48488a;
                                                }
                                            });
                                        }
                                        v3.o.c(j17);
                                        b1Var5.setValue(null);
                                    }
                                } else {
                                    z213 = z33;
                                    f15 = fC;
                                    f16 = f26;
                                }
                                f17 = f15;
                                z30 = false;
                                iQ = 0;
                                i36 = 0;
                                if (z30) {
                                    f19 = f16;
                                    rVarD = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z213, aVar, i39, i38, dVar2, i40, f19);
                                    list = (List) rVarD.f48506b;
                                    if (((Boolean) rVarD.f48507c).booleanValue()) {
                                        yVar.f38361a = list;
                                        int iR5 = e.R(i38, list);
                                        iQ = e.Q(i39, list);
                                        b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f19)));
                                        f18 = f19;
                                        iR = iR5;
                                    } else {
                                        if (list.size() == i40 + 1) {
                                            linkedHashMap = linkedHashMap2;
                                            z31 = false;
                                        } else {
                                            linkedHashMap = linkedHashMap2;
                                            z31 = false;
                                        }
                                        if (z31) {
                                            f21 = f15;
                                            LinkedHashMap linkedHashMap5 = linkedHashMap;
                                            rVarD2 = e.D(linkedHashMap5, b1Var4, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f21);
                                            list2 = (List) rVarD2.f48506b;
                                            if (((Boolean) rVarD2.f48507c).booleanValue()) {
                                                SubcomposeLayout = SubcomposeLayout;
                                                z32 = z213;
                                                yVar.f38361a = list2;
                                                iR = e.R(i38, list2);
                                                iQ = e.Q(i39, list2);
                                                b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f21)));
                                                f18 = f21;
                                            } else {
                                                if (f19 > f21) {
                                                    f22 = f19 - f21;
                                                    if (f22 >= 1.0f) {
                                                        SubcomposeLayout = SubcomposeLayout;
                                                        z32 = z213;
                                                        l1.b1 b1Var8 = b1Var4;
                                                        int iCeil3 = (int) Math.ceil((float) (Math.log(f22 + 1) / hz.a.f33863a));
                                                        int i47 = 2;
                                                        int i48 = iCeil3 + 2;
                                                        f23 = f19;
                                                        int i49 = 0;
                                                        f24 = f21;
                                                        List list9 = list2;
                                                        float f211 = f24;
                                                        while (true) {
                                                            f25 = f23 - f24;
                                                            if (f25 >= 1.0f) {
                                                                break;
                                                            }
                                                            break;
                                                            break;
                                                        }
                                                        yVar.f38361a = list9;
                                                        f18 = f211;
                                                    } else {
                                                        SubcomposeLayout = SubcomposeLayout;
                                                        z32 = z213;
                                                        SubcomposeLayout = SubcomposeLayout;
                                                        z32 = z213;
                                                        yVar.f38361a = list2;
                                                        f18 = f21;
                                                    }
                                                } else {
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    z32 = z213;
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    z32 = z213;
                                                    yVar.f38361a = list2;
                                                    f18 = f21;
                                                }
                                                iR = e.R(i38, (List) yVar.f38361a);
                                                iQ = e.Q(i39, (List) yVar.f38361a);
                                                j16 = 4294967296L;
                                                b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f18)));
                                            }
                                        } else {
                                            SubcomposeLayout = SubcomposeLayout;
                                            j16 = 4294967296L;
                                            f18 = f17;
                                            iR = i36;
                                        }
                                    }
                                    j16 = 4294967296L;
                                } else {
                                    j16 = 4294967296L;
                                    f18 = f17;
                                    iR = i36;
                                }
                                cVar2.invoke(new v3.o(fr.j3.L(j16, f18)));
                                iH = v3.a.h(aVar.f53483a);
                                if (iQ > iH) {
                                    i37 = iH;
                                } else {
                                    i37 = iQ;
                                }
                                iG = v3.a.g(aVar.f53483a);
                                if (iR > iG) {
                                    iR = iG;
                                }
                                System.currentTimeMillis();
                                ((List) yVar.f38361a).size();
                                final j0.f fVar4 = fVar;
                                final z1.i iVar13 = iVar8;
                                final z1.i iVar14 = iVar3;
                                return SubcomposeLayout.q0(i37, iR, ry.s.f50855a, new fz.c() { // from class: dt.n3
                                    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
                                    @Override // fz.c
                                    public final Object invoke(Object obj3) {
                                        Integer num;
                                        int i410;
                                        z1.i iVar15;
                                        int iA;
                                        w2.f1 layout = (w2.f1) obj3;
                                        kotlin.jvm.internal.m.f(layout, "$this$layout");
                                        int i411 = 0;
                                        int i412 = 0;
                                        for (List<w2.g1> list10 : (Iterable) yVar.f38361a) {
                                            if (!list10.isEmpty()) {
                                                Iterator it = list10.iterator();
                                                if (it.hasNext()) {
                                                    Integer numValueOf = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                    while (it.hasNext()) {
                                                        Integer numValueOf2 = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                        if (numValueOf.compareTo(numValueOf2) < 0) {
                                                            numValueOf = numValueOf2;
                                                        }
                                                    }
                                                    num = numValueOf;
                                                } else {
                                                    num = null;
                                                }
                                                int iIntValue3 = num != null ? num.intValue() : 0;
                                                int size = list10.size() - 1;
                                                if (size < 0) {
                                                    size = 0;
                                                }
                                                int i413 = i39;
                                                int i414 = size * i413;
                                                Iterator it2 = list10.iterator();
                                                int i415 = 0;
                                                while (it2.hasNext()) {
                                                    i415 += ((w2.g1) it2.next()).f54501a;
                                                }
                                                int i50 = i415 + i414;
                                                j0.b bVar = j0.i.f35303a;
                                                j0.f fVar5 = fVar4;
                                                if (kotlin.jvm.internal.m.a(fVar5, bVar)) {
                                                    i410 = 0;
                                                } else {
                                                    boolean zA = kotlin.jvm.internal.m.a(fVar5, j0.i.f35307e);
                                                    int i51 = i37;
                                                    if (zA) {
                                                        int i52 = i51 - i50;
                                                        if (i52 < 0) {
                                                            i52 = 0;
                                                        }
                                                        i410 = i52 / 2;
                                                    } else if (!kotlin.jvm.internal.m.a(fVar5, j0.i.f35304b) || (i410 = i51 - i50) < 0) {
                                                        i410 = 0;
                                                    }
                                                }
                                                for (w2.g1 g1Var : list10) {
                                                    if (i412 != 0 || (iVar15 = iVar13) == null) {
                                                        iVar15 = iVar14;
                                                    }
                                                    if (kotlin.jvm.internal.m.a(iVar15, z1.c.L)) {
                                                        iA = 0;
                                                    } else {
                                                        z1.i iVar16 = z1.c.M;
                                                        iA = kotlin.jvm.internal.m.a(iVar15, iVar16) ? (iIntValue3 - g1Var.f54502b) / 2 : kotlin.jvm.internal.m.a(iVar15, z1.c.N) ? iIntValue3 - g1Var.f54502b : iVar16.a(g1Var.f54502b, iIntValue3);
                                                    }
                                                    w2.f1.k(layout, g1Var, i410, iA + i411);
                                                    i410 += g1Var.f54501a + i413;
                                                    i412++;
                                                }
                                                i411 += iIntValue3 + i38;
                                            }
                                        }
                                        return qy.b0.f48488a;
                                    }
                                });
                            }
                        };
                        sVar.o0(eVar2);
                        objQ8 = eVar2;
                    } else {
                        sVar = sVar2;
                        i29 = i27;
                        iVar8 = iVar7;
                        fz.e eVar3 = new fz.e() { // from class: dt.l3
                            /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
                            /* JADX WARN: Code duplicated, block: B:26:0x00e8  */
                            /* JADX WARN: Code duplicated, block: B:28:0x010c  */
                            /* JADX WARN: Code duplicated, block: B:37:0x0126  */
                            /* JADX WARN: Code duplicated, block: B:44:0x0165  */
                            /* JADX WARN: Code duplicated, block: B:46:0x0184  */
                            /* JADX WARN: Code duplicated, block: B:47:0x01a2  */
                            /* JADX WARN: Code duplicated, block: B:49:0x01a6  */
                            /* JADX WARN: Code duplicated, block: B:51:0x01ac  */
                            /* JADX WARN: Code duplicated, block: B:66:0x0223  */
                            /* JADX WARN: Code duplicated, block: B:68:0x0248  */
                            /* JADX WARN: Code duplicated, block: B:69:0x024a A[PHI: r3 r18
                              0x024a: PHI (r3v2 'SubcomposeLayout' w2.q1) = (r3v1 'SubcomposeLayout' w2.q1), (r3v4 'SubcomposeLayout' w2.q1) binds: [B:23:0x00cd, B:68:0x0248] A[DONT_GENERATE, DONT_INLINE]
                              0x024a: PHI (r18v2 float) = (r18v1 float), (r18v4 float) binds: [B:23:0x00cd, B:68:0x0248] A[DONT_GENERATE, DONT_INLINE]] */
                            /* JADX WARN: Code duplicated, block: B:72:0x0269  */
                            /* JADX WARN: Code duplicated, block: B:73:0x026c  */
                            /* JADX WARN: Code duplicated, block: B:76:0x0276  */
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                boolean z213;
                                float f15;
                                float f16;
                                float f17;
                                boolean z30;
                                int iQ;
                                int i36;
                                long j16;
                                float f18;
                                int iR;
                                int iH;
                                final int i37;
                                int iG;
                                float f19;
                                qy.r rVarD;
                                List list;
                                LinkedHashMap linkedHashMap;
                                boolean z31;
                                float f21;
                                boolean z32;
                                qy.r rVarD2;
                                List list2;
                                float f22;
                                float f23;
                                float f24;
                                float f25;
                                w2.q1 SubcomposeLayout = (w2.q1) obj;
                                v3.a aVar = (v3.a) obj2;
                                kotlin.jvm.internal.m.f(SubcomposeLayout, "$this$SubcomposeLayout");
                                System.currentTimeMillis();
                                float fC = v3.o.c(j15);
                                l1.b1 b1Var4 = currentTextStyle;
                                float fC2 = v3.o.c(((j3.y0) b1Var4.getValue()).f35827a.f35755b);
                                float f26 = fC2 < fC ? fC : fC2;
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                final kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                                yVar.f38361a = ry.r.f50854a;
                                l1.b1 b1Var5 = b1Var2;
                                v3.o oVar4 = (v3.o) b1Var5.getValue();
                                final int i38 = iIntValue2;
                                final int i39 = iIntValue;
                                int i40 = i29;
                                boolean z33 = z11;
                                t1.d dVar2 = dVar;
                                if (oVar4 != null) {
                                    f15 = fC;
                                    f16 = f26;
                                    long j17 = oVar4.f53502a;
                                    if (v3.o.c(j17) < f15 || v3.o.c(j17) > f16) {
                                        z213 = z33;
                                    } else {
                                        v3.o.c(j17);
                                        z213 = z33;
                                        qy.r rVarD3 = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z213, aVar, i39, i38, dVar2, i40, v3.o.c(j17));
                                        List list3 = (List) rVarD3.f48506b;
                                        if (!((Boolean) rVarD3.f48507c).booleanValue() || v3.o.c(j17) == f15) {
                                            v3.o.c(j17);
                                            float fC3 = v3.o.c(j17);
                                            yVar.f38361a = list3;
                                            int iR2 = e.R(i38, list3);
                                            int iQ2 = e.Q(i39, list3);
                                            f17 = fC3;
                                            i36 = iR2;
                                            iQ = iQ2;
                                            z30 = true;
                                            if (z30) {
                                                j16 = 4294967296L;
                                                f18 = f17;
                                                iR = i36;
                                            } else {
                                                f19 = f16;
                                                rVarD = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z213, aVar, i39, i38, dVar2, i40, f19);
                                                list = (List) rVarD.f48506b;
                                                if (((Boolean) rVarD.f48507c).booleanValue()) {
                                                    if (list.size() == i40 + 1 || f19 <= f15) {
                                                        linkedHashMap = linkedHashMap2;
                                                        z31 = false;
                                                    } else {
                                                        float f27 = f19 - 1.0f;
                                                        if (f27 < f15) {
                                                            f27 = f15;
                                                        }
                                                        if (f27 == f19) {
                                                            linkedHashMap = linkedHashMap2;
                                                        } else {
                                                            qy.r rVarD4 = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z213, aVar, i39, i38, dVar2, i40, f27);
                                                            linkedHashMap = linkedHashMap2;
                                                            List list4 = (List) rVarD4.f48506b;
                                                            if (!((Boolean) rVarD4.f48507c).booleanValue()) {
                                                                yVar.f38361a = list4;
                                                                b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f27)));
                                                                f17 = f27;
                                                                z31 = true;
                                                            }
                                                        }
                                                        z31 = false;
                                                    }
                                                    if (z31) {
                                                        SubcomposeLayout = SubcomposeLayout;
                                                        j16 = 4294967296L;
                                                        f18 = f17;
                                                        iR = i36;
                                                    } else {
                                                        f21 = f15;
                                                        LinkedHashMap linkedHashMap5 = linkedHashMap;
                                                        rVarD2 = e.D(linkedHashMap5, b1Var4, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f21);
                                                        list2 = (List) rVarD2.f48506b;
                                                        if (((Boolean) rVarD2.f48507c).booleanValue()) {
                                                            SubcomposeLayout = SubcomposeLayout;
                                                            z32 = z213;
                                                            yVar.f38361a = list2;
                                                            iR = e.R(i38, list2);
                                                            iQ = e.Q(i39, list2);
                                                            b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f21)));
                                                            f18 = f21;
                                                        } else {
                                                            if (f19 > f21) {
                                                                f22 = f19 - f21;
                                                                if (f22 >= 1.0f) {
                                                                    SubcomposeLayout = SubcomposeLayout;
                                                                    z32 = z213;
                                                                    l1.b1 b1Var8 = b1Var4;
                                                                    int iCeil3 = (int) Math.ceil((float) (Math.log(f22 + 1) / hz.a.f33863a));
                                                                    int i47 = 2;
                                                                    int i48 = iCeil3 + 2;
                                                                    f23 = f19;
                                                                    int i49 = 0;
                                                                    f24 = f21;
                                                                    List list9 = list2;
                                                                    float f211 = f24;
                                                                    while (true) {
                                                                        f25 = f23 - f24;
                                                                        if (f25 >= 1.0f && i49 < i48) {
                                                                            i49++;
                                                                            float f29 = (f25 / i47) + f24;
                                                                            if (f29 == f24 || f29 == f23) {
                                                                                break;
                                                                            }
                                                                            b1Var8 = b1Var8;
                                                                            List list6 = list9;
                                                                            float f30 = f24;
                                                                            i48 = i48;
                                                                            qy.r rVarD5 = e.D(linkedHashMap5, b1Var8, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f29);
                                                                            List list7 = (List) rVarD5.f48506b;
                                                                            if (((Boolean) rVarD5.f48507c).booleanValue()) {
                                                                                f24 = f30;
                                                                                f23 = f29;
                                                                                list9 = list6;
                                                                                i47 = 2;
                                                                            } else {
                                                                                f24 = f29;
                                                                                f211 = f24;
                                                                                i47 = 2;
                                                                                list9 = list7;
                                                                            }
                                                                        } else {
                                                                            break;
                                                                        }
                                                                    }
                                                                    yVar.f38361a = list9;
                                                                    f18 = f211;
                                                                } else {
                                                                    SubcomposeLayout = SubcomposeLayout;
                                                                    z32 = z213;
                                                                    SubcomposeLayout = SubcomposeLayout;
                                                                    z32 = z213;
                                                                    yVar.f38361a = list2;
                                                                    f18 = f21;
                                                                }
                                                            } else {
                                                                SubcomposeLayout = SubcomposeLayout;
                                                                z32 = z213;
                                                                SubcomposeLayout = SubcomposeLayout;
                                                                z32 = z213;
                                                                yVar.f38361a = list2;
                                                                f18 = f21;
                                                            }
                                                            iR = e.R(i38, (List) yVar.f38361a);
                                                            iQ = e.Q(i39, (List) yVar.f38361a);
                                                            j16 = 4294967296L;
                                                            b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f18)));
                                                        }
                                                    }
                                                } else {
                                                    yVar.f38361a = list;
                                                    int iR5 = e.R(i38, list);
                                                    iQ = e.Q(i39, list);
                                                    b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f19)));
                                                    f18 = f19;
                                                    iR = iR5;
                                                }
                                                j16 = 4294967296L;
                                            }
                                            cVar2.invoke(new v3.o(fr.j3.L(j16, f18)));
                                            iH = v3.a.h(aVar.f53483a);
                                            if (iQ > iH) {
                                                i37 = iH;
                                            } else {
                                                i37 = iQ;
                                            }
                                            iG = v3.a.g(aVar.f53483a);
                                            if (iR > iG) {
                                                iR = iG;
                                            }
                                            System.currentTimeMillis();
                                            ((List) yVar.f38361a).size();
                                            final j0.f fVar4 = fVar;
                                            final z1.i iVar13 = iVar8;
                                            final z1.i iVar14 = iVar3;
                                            return SubcomposeLayout.q0(i37, iR, ry.s.f50855a, new fz.c() { // from class: dt.n3
                                                /* JADX WARN: Code duplicated, block: B:29:0x008d  */
                                                @Override // fz.c
                                                public final Object invoke(Object obj3) {
                                                    Integer num;
                                                    int i410;
                                                    z1.i iVar15;
                                                    int iA;
                                                    w2.f1 layout = (w2.f1) obj3;
                                                    kotlin.jvm.internal.m.f(layout, "$this$layout");
                                                    int i411 = 0;
                                                    int i412 = 0;
                                                    for (List<w2.g1> list10 : (Iterable) yVar.f38361a) {
                                                        if (!list10.isEmpty()) {
                                                            Iterator it = list10.iterator();
                                                            if (it.hasNext()) {
                                                                Integer numValueOf = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                                while (it.hasNext()) {
                                                                    Integer numValueOf2 = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                                    if (numValueOf.compareTo(numValueOf2) < 0) {
                                                                        numValueOf = numValueOf2;
                                                                    }
                                                                }
                                                                num = numValueOf;
                                                            } else {
                                                                num = null;
                                                            }
                                                            int iIntValue3 = num != null ? num.intValue() : 0;
                                                            int size = list10.size() - 1;
                                                            if (size < 0) {
                                                                size = 0;
                                                            }
                                                            int i413 = i39;
                                                            int i414 = size * i413;
                                                            Iterator it2 = list10.iterator();
                                                            int i415 = 0;
                                                            while (it2.hasNext()) {
                                                                i415 += ((w2.g1) it2.next()).f54501a;
                                                            }
                                                            int i50 = i415 + i414;
                                                            j0.b bVar = j0.i.f35303a;
                                                            j0.f fVar5 = fVar4;
                                                            if (kotlin.jvm.internal.m.a(fVar5, bVar)) {
                                                                i410 = 0;
                                                            } else {
                                                                boolean zA = kotlin.jvm.internal.m.a(fVar5, j0.i.f35307e);
                                                                int i51 = i37;
                                                                if (zA) {
                                                                    int i52 = i51 - i50;
                                                                    if (i52 < 0) {
                                                                        i52 = 0;
                                                                    }
                                                                    i410 = i52 / 2;
                                                                } else if (!kotlin.jvm.internal.m.a(fVar5, j0.i.f35304b) || (i410 = i51 - i50) < 0) {
                                                                    i410 = 0;
                                                                }
                                                            }
                                                            for (w2.g1 g1Var : list10) {
                                                                if (i412 != 0 || (iVar15 = iVar13) == null) {
                                                                    iVar15 = iVar14;
                                                                }
                                                                if (kotlin.jvm.internal.m.a(iVar15, z1.c.L)) {
                                                                    iA = 0;
                                                                } else {
                                                                    z1.i iVar16 = z1.c.M;
                                                                    iA = kotlin.jvm.internal.m.a(iVar15, iVar16) ? (iIntValue3 - g1Var.f54502b) / 2 : kotlin.jvm.internal.m.a(iVar15, z1.c.N) ? iIntValue3 - g1Var.f54502b : iVar16.a(g1Var.f54502b, iIntValue3);
                                                                }
                                                                w2.f1.k(layout, g1Var, i410, iA + i411);
                                                                i410 += g1Var.f54501a + i413;
                                                                i412++;
                                                            }
                                                            i411 += iIntValue3 + i38;
                                                        }
                                                    }
                                                    return qy.b0.f48488a;
                                                }
                                            });
                                        }
                                        v3.o.c(j17);
                                        b1Var5.setValue(null);
                                    }
                                } else {
                                    z213 = z33;
                                    f15 = fC;
                                    f16 = f26;
                                }
                                f17 = f15;
                                z30 = false;
                                iQ = 0;
                                i36 = 0;
                                if (z30) {
                                    f19 = f16;
                                    rVarD = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z213, aVar, i39, i38, dVar2, i40, f19);
                                    list = (List) rVarD.f48506b;
                                    if (((Boolean) rVarD.f48507c).booleanValue()) {
                                        yVar.f38361a = list;
                                        int iR6 = e.R(i38, list);
                                        iQ = e.Q(i39, list);
                                        b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f19)));
                                        f18 = f19;
                                        iR = iR6;
                                    } else {
                                        if (list.size() == i40 + 1) {
                                            linkedHashMap = linkedHashMap2;
                                            z31 = false;
                                        } else {
                                            linkedHashMap = linkedHashMap2;
                                            z31 = false;
                                        }
                                        if (z31) {
                                            f21 = f15;
                                            LinkedHashMap linkedHashMap6 = linkedHashMap;
                                            rVarD2 = e.D(linkedHashMap6, b1Var4, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f21);
                                            list2 = (List) rVarD2.f48506b;
                                            if (((Boolean) rVarD2.f48507c).booleanValue()) {
                                                SubcomposeLayout = SubcomposeLayout;
                                                z32 = z213;
                                                yVar.f38361a = list2;
                                                iR = e.R(i38, list2);
                                                iQ = e.Q(i39, list2);
                                                b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f21)));
                                                f18 = f21;
                                            } else {
                                                if (f19 > f21) {
                                                    f22 = f19 - f21;
                                                    if (f22 >= 1.0f) {
                                                        SubcomposeLayout = SubcomposeLayout;
                                                        z32 = z213;
                                                        l1.b1 b1Var9 = b1Var4;
                                                        int iCeil4 = (int) Math.ceil((float) (Math.log(f22 + 1) / hz.a.f33863a));
                                                        int i410 = 2;
                                                        int i411 = iCeil4 + 2;
                                                        f23 = f19;
                                                        int i412 = 0;
                                                        f24 = f21;
                                                        List list10 = list2;
                                                        float f212 = f24;
                                                        while (true) {
                                                            f25 = f23 - f24;
                                                            if (f25 >= 1.0f) {
                                                                break;
                                                            }
                                                            break;
                                                            break;
                                                        }
                                                        yVar.f38361a = list10;
                                                        f18 = f212;
                                                    } else {
                                                        SubcomposeLayout = SubcomposeLayout;
                                                        z32 = z213;
                                                        SubcomposeLayout = SubcomposeLayout;
                                                        z32 = z213;
                                                        yVar.f38361a = list2;
                                                        f18 = f21;
                                                    }
                                                } else {
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    z32 = z213;
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    z32 = z213;
                                                    yVar.f38361a = list2;
                                                    f18 = f21;
                                                }
                                                iR = e.R(i38, (List) yVar.f38361a);
                                                iQ = e.Q(i39, (List) yVar.f38361a);
                                                j16 = 4294967296L;
                                                b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f18)));
                                            }
                                        } else {
                                            SubcomposeLayout = SubcomposeLayout;
                                            j16 = 4294967296L;
                                            f18 = f17;
                                            iR = i36;
                                        }
                                    }
                                    j16 = 4294967296L;
                                } else {
                                    j16 = 4294967296L;
                                    f18 = f17;
                                    iR = i36;
                                }
                                cVar2.invoke(new v3.o(fr.j3.L(j16, f18)));
                                iH = v3.a.h(aVar.f53483a);
                                if (iQ > iH) {
                                    i37 = iH;
                                } else {
                                    i37 = iQ;
                                }
                                iG = v3.a.g(aVar.f53483a);
                                if (iR > iG) {
                                    iR = iG;
                                }
                                System.currentTimeMillis();
                                ((List) yVar.f38361a).size();
                                final j0.f fVar5 = fVar;
                                final z1.i iVar15 = iVar8;
                                final z1.i iVar16 = iVar3;
                                return SubcomposeLayout.q0(i37, iR, ry.s.f50855a, new fz.c() { // from class: dt.n3
                                    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
                                    @Override // fz.c
                                    public final Object invoke(Object obj3) {
                                        Integer num;
                                        int i413;
                                        z1.i iVar17;
                                        int iA;
                                        w2.f1 layout = (w2.f1) obj3;
                                        kotlin.jvm.internal.m.f(layout, "$this$layout");
                                        int i414 = 0;
                                        int i415 = 0;
                                        for (List<w2.g1> list11 : (Iterable) yVar.f38361a) {
                                            if (!list11.isEmpty()) {
                                                Iterator it = list11.iterator();
                                                if (it.hasNext()) {
                                                    Integer numValueOf = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                    while (it.hasNext()) {
                                                        Integer numValueOf2 = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                        if (numValueOf.compareTo(numValueOf2) < 0) {
                                                            numValueOf = numValueOf2;
                                                        }
                                                    }
                                                    num = numValueOf;
                                                } else {
                                                    num = null;
                                                }
                                                int iIntValue3 = num != null ? num.intValue() : 0;
                                                int size = list11.size() - 1;
                                                if (size < 0) {
                                                    size = 0;
                                                }
                                                int i416 = i39;
                                                int i417 = size * i416;
                                                Iterator it2 = list11.iterator();
                                                int i418 = 0;
                                                while (it2.hasNext()) {
                                                    i418 += ((w2.g1) it2.next()).f54501a;
                                                }
                                                int i50 = i418 + i417;
                                                j0.b bVar = j0.i.f35303a;
                                                j0.f fVar6 = fVar5;
                                                if (kotlin.jvm.internal.m.a(fVar6, bVar)) {
                                                    i413 = 0;
                                                } else {
                                                    boolean zA = kotlin.jvm.internal.m.a(fVar6, j0.i.f35307e);
                                                    int i51 = i37;
                                                    if (zA) {
                                                        int i52 = i51 - i50;
                                                        if (i52 < 0) {
                                                            i52 = 0;
                                                        }
                                                        i413 = i52 / 2;
                                                    } else if (!kotlin.jvm.internal.m.a(fVar6, j0.i.f35304b) || (i413 = i51 - i50) < 0) {
                                                        i413 = 0;
                                                    }
                                                }
                                                for (w2.g1 g1Var : list11) {
                                                    if (i415 != 0 || (iVar17 = iVar15) == null) {
                                                        iVar17 = iVar16;
                                                    }
                                                    if (kotlin.jvm.internal.m.a(iVar17, z1.c.L)) {
                                                        iA = 0;
                                                    } else {
                                                        z1.i iVar18 = z1.c.M;
                                                        iA = kotlin.jvm.internal.m.a(iVar17, iVar18) ? (iIntValue3 - g1Var.f54502b) / 2 : kotlin.jvm.internal.m.a(iVar17, z1.c.N) ? iIntValue3 - g1Var.f54502b : iVar18.a(g1Var.f54502b, iIntValue3);
                                                    }
                                                    w2.f1.k(layout, g1Var, i413, iA + i414);
                                                    i413 += g1Var.f54501a + i416;
                                                    i415++;
                                                }
                                                i414 += iIntValue3 + i38;
                                            }
                                        }
                                        return qy.b0.f48488a;
                                    }
                                });
                            }
                        };
                        sVar.o0(eVar3);
                        objQ8 = eVar3;
                    }
                    w2.a0.b(rVar6, (fz.e) objQ8, sVar, i15 & 14, 0);
                    i26 = i29;
                    rVar3 = rVar6;
                    f13 = f14;
                    j12 = j13;
                    iVar6 = iVar8;
                    iVar5 = iVar3;
                } else {
                    sVar = sVar2;
                    sVar.W();
                    i26 = i11;
                    rVar3 = rVar2;
                    f13 = f12;
                    j12 = jA;
                    iVar5 = iVar3;
                    iVar6 = iVar4;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: dt.m3
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM = l1.t.M(i12 | 1);
                            int iM2 = l1.t.M(i13);
                            e.C(rVar3, fVar, iVar5, iVar6, z11, currentTextStyle, f13, f11, i26, j12, dVar, (l1.n) obj, iM, iM2, i14);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i15 |= 3072;
            iVar4 = iVar2;
            if ((i12 & 24576) != 0) {
                if (sVar2.g(z11)) {
                    i33 = 16384;
                } else {
                    i33 = OSSConstants.DEFAULT_BUFFER_SIZE;
                }
                i15 |= i33;
            }
            if ((i12 & 196608) == 0) {
                if (sVar2.f(currentTextStyle)) {
                    i32 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                } else {
                    i32 = 65536;
                }
                i15 |= i32;
            }
            i18 = i14 & 64;
            if (i18 != 0) {
                i15 |= 1572864;
                f12 = f5;
            } else {
                f12 = f5;
                if ((i12 & 1572864) == 0) {
                    if (sVar2.c(f12)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i15 |= i19;
                }
            }
            if ((i12 & 12582912) == 0) {
                if (sVar2.c(f11)) {
                    i31 = 8388608;
                } else {
                    i31 = 4194304;
                }
                i15 |= i31;
            }
            i21 = i14 & 256;
            if (i21 != 0) {
                i15 |= 100663296;
            } else if ((i12 & 100663296) == 0) {
                if (sVar2.d(i11)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
                i15 |= i22;
            }
            i23 = i14 & 512;
            if (i23 != 0) {
                if ((i12 & 805306368) == 0) {
                    jA = j11;
                    if (sVar2.e(jA)) {
                        i24 = 536870912;
                    } else {
                        i24 = 268435456;
                    }
                    i15 |= i24;
                }
                if ((i13 & 6) == 0) {
                    if (sVar2.h(dVar)) {
                        i30 = 4;
                    } else {
                        i30 = 2;
                    }
                    i25 = i13 | i30;
                } else {
                    i25 = i13;
                }
                if ((i15 & 306783379) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (sVar2.T(i15 & 1, z12)) {
                    if (i34 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i35 != 0) {
                        iVar3 = z1.c.N;
                    }
                    if (i16 != 0) {
                        iVar4 = null;
                    }
                    if (i18 != 0) {
                        f14 = 0;
                    } else {
                        f14 = f12;
                    }
                    if (i21 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i23 != 0) {
                        jA = fr.j3.A(16);
                    }
                    j13 = jA;
                    cVar = (v3.c) sVar2.j(z2.g1.f58547h);
                    if ((3670016 & i15) == 1048576) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objQ = sVar2.Q();
                    gVar = l1.m.f39353a;
                    if (z13) {
                        objQ = Integer.valueOf(cVar.n0(f14));
                        sVar2.o0(objQ);
                    } else {
                        objQ = Integer.valueOf(cVar.n0(f14));
                        sVar2.o0(objQ);
                    }
                    iIntValue = ((Number) objQ).intValue();
                    if ((29360128 & i15) == 8388608) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objQ2 = sVar2.Q();
                    if (z14) {
                        objQ2 = Integer.valueOf(cVar.n0(f11));
                        sVar2.o0(objQ2);
                    } else {
                        objQ2 = Integer.valueOf(cVar.n0(f11));
                        sVar2.o0(objQ2);
                    }
                    iIntValue2 = ((Number) objQ2).intValue();
                    objQ3 = sVar2.Q();
                    if (objQ3 == gVar) {
                        objQ3 = l1.t.B(new v3.o(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b));
                        sVar2.o0(objQ3);
                    }
                    b1Var = (l1.b1) objQ3;
                    objQ4 = sVar2.Q();
                    if (objQ4 == gVar) {
                        objQ4 = l1.t.B(null);
                        sVar2.o0(objQ4);
                    }
                    b1Var2 = (l1.b1) objQ4;
                    z1.r rVar7 = rVar4;
                    iVar7 = iVar4;
                    if (!v3.o.a(((v3.o) b1Var.getValue()).f53502a, ((j3.y0) currentTextStyle.getValue()).f35827a.f35755b)) {
                        v3.o.f(((v3.o) b1Var.getValue()).f53502a);
                        v3.o.f(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b);
                        b1Var.setValue(new v3.o(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b));
                        b1Var2.setValue(null);
                    }
                    objQ5 = sVar2.Q();
                    if (objQ5 == gVar) {
                        objQ5 = l1.t.B(Boolean.FALSE);
                        sVar2.o0(objQ5);
                    }
                    b1Var3 = (l1.b1) objQ5;
                    boolean zE6 = sVar2.e(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b);
                    if ((1879048192 & i15) == 536870912) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zE6 | z15;
                    objQ6 = sVar2.Q();
                    if (z16) {
                        if (v3.o.c(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b) <= v3.o.c(j13)) {
                            j14 = ((j3.y0) currentTextStyle.getValue()).f35827a.f35755b;
                        } else {
                            j14 = j13;
                        }
                        v3.o oVar4 = new v3.o(j14);
                        sVar2.o0(oVar4);
                        objQ6 = oVar4;
                    } else {
                        if (v3.o.c(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b) <= v3.o.c(j13)) {
                            j14 = ((j3.y0) currentTextStyle.getValue()).f35827a.f35755b;
                        } else {
                            j14 = j13;
                        }
                        v3.o oVar5 = new v3.o(j14);
                        sVar2.o0(oVar5);
                        objQ6 = oVar5;
                    }
                    j15 = ((v3.o) objQ6).f53502a;
                    i28 = 458752 & i15;
                    if (i28 == 131072) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zE = z17 | sVar2.e(j15);
                    objQ7 = sVar2.Q();
                    if (zE) {
                        objQ7 = new au.j(currentTextStyle, b1Var3, j15);
                        sVar2.o0(objQ7);
                    } else {
                        objQ7 = new au.j(currentTextStyle, b1Var3, j15);
                        sVar2.o0(objQ7);
                    }
                    cVar2 = (fz.c) objQ7;
                    boolean zE7 = sVar2.e(j15);
                    if (i28 == 131072) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean z213 = zE7 | z18;
                    if ((234881024 & i15) == 67108864) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z214 = z213 | z19;
                    if ((i25 & 14) == 4) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    boolean z215 = z214 | z20;
                    if ((57344 & i15) == 16384) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    boolean zD3 = z215 | z21 | sVar2.d(iIntValue) | sVar2.d(iIntValue2) | sVar2.f(cVar2);
                    if ((i15 & 112) == 32) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    boolean z216 = zD3 | z22;
                    if ((i15 & 7168) == 2048) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    z24 = z216 | z23 | ((i15 & 896) == 256);
                    objQ8 = sVar2.Q();
                    if (z24) {
                        sVar = sVar2;
                        i29 = i27;
                        iVar8 = iVar7;
                        fz.e eVar4 = new fz.e() { // from class: dt.l3
                            /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
                            /* JADX WARN: Code duplicated, block: B:26:0x00e8  */
                            /* JADX WARN: Code duplicated, block: B:28:0x010c  */
                            /* JADX WARN: Code duplicated, block: B:37:0x0126  */
                            /* JADX WARN: Code duplicated, block: B:44:0x0165  */
                            /* JADX WARN: Code duplicated, block: B:46:0x0184  */
                            /* JADX WARN: Code duplicated, block: B:47:0x01a2  */
                            /* JADX WARN: Code duplicated, block: B:49:0x01a6  */
                            /* JADX WARN: Code duplicated, block: B:51:0x01ac  */
                            /* JADX WARN: Code duplicated, block: B:66:0x0223  */
                            /* JADX WARN: Code duplicated, block: B:68:0x0248  */
                            /* JADX WARN: Code duplicated, block: B:69:0x024a A[PHI: r3 r18
                              0x024a: PHI (r3v2 'SubcomposeLayout' w2.q1) = (r3v1 'SubcomposeLayout' w2.q1), (r3v4 'SubcomposeLayout' w2.q1) binds: [B:23:0x00cd, B:68:0x0248] A[DONT_GENERATE, DONT_INLINE]
                              0x024a: PHI (r18v2 float) = (r18v1 float), (r18v4 float) binds: [B:23:0x00cd, B:68:0x0248] A[DONT_GENERATE, DONT_INLINE]] */
                            /* JADX WARN: Code duplicated, block: B:72:0x0269  */
                            /* JADX WARN: Code duplicated, block: B:73:0x026c  */
                            /* JADX WARN: Code duplicated, block: B:76:0x0276  */
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                boolean z217;
                                float f15;
                                float f16;
                                float f17;
                                boolean z30;
                                int iQ;
                                int i36;
                                long j16;
                                float f18;
                                int iR;
                                int iH;
                                final int i37;
                                int iG;
                                float f19;
                                qy.r rVarD;
                                List list;
                                LinkedHashMap linkedHashMap;
                                boolean z31;
                                float f21;
                                boolean z32;
                                qy.r rVarD2;
                                List list2;
                                float f22;
                                float f23;
                                float f24;
                                float f25;
                                w2.q1 SubcomposeLayout = (w2.q1) obj;
                                v3.a aVar = (v3.a) obj2;
                                kotlin.jvm.internal.m.f(SubcomposeLayout, "$this$SubcomposeLayout");
                                System.currentTimeMillis();
                                float fC = v3.o.c(j15);
                                l1.b1 b1Var4 = currentTextStyle;
                                float fC2 = v3.o.c(((j3.y0) b1Var4.getValue()).f35827a.f35755b);
                                float f26 = fC2 < fC ? fC : fC2;
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                final kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                                yVar.f38361a = ry.r.f50854a;
                                l1.b1 b1Var5 = b1Var2;
                                v3.o oVar6 = (v3.o) b1Var5.getValue();
                                final int i38 = iIntValue2;
                                final int i39 = iIntValue;
                                int i40 = i29;
                                boolean z33 = z11;
                                t1.d dVar2 = dVar;
                                if (oVar6 != null) {
                                    f15 = fC;
                                    f16 = f26;
                                    long j17 = oVar6.f53502a;
                                    if (v3.o.c(j17) < f15 || v3.o.c(j17) > f16) {
                                        z217 = z33;
                                    } else {
                                        v3.o.c(j17);
                                        z217 = z33;
                                        qy.r rVarD3 = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z217, aVar, i39, i38, dVar2, i40, v3.o.c(j17));
                                        List list3 = (List) rVarD3.f48506b;
                                        if (!((Boolean) rVarD3.f48507c).booleanValue() || v3.o.c(j17) == f15) {
                                            v3.o.c(j17);
                                            float fC3 = v3.o.c(j17);
                                            yVar.f38361a = list3;
                                            int iR2 = e.R(i38, list3);
                                            int iQ2 = e.Q(i39, list3);
                                            f17 = fC3;
                                            i36 = iR2;
                                            iQ = iQ2;
                                            z30 = true;
                                            if (z30) {
                                                j16 = 4294967296L;
                                                f18 = f17;
                                                iR = i36;
                                            } else {
                                                f19 = f16;
                                                rVarD = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z217, aVar, i39, i38, dVar2, i40, f19);
                                                list = (List) rVarD.f48506b;
                                                if (((Boolean) rVarD.f48507c).booleanValue()) {
                                                    if (list.size() == i40 + 1 || f19 <= f15) {
                                                        linkedHashMap = linkedHashMap2;
                                                        z31 = false;
                                                    } else {
                                                        float f27 = f19 - 1.0f;
                                                        if (f27 < f15) {
                                                            f27 = f15;
                                                        }
                                                        if (f27 == f19) {
                                                            linkedHashMap = linkedHashMap2;
                                                        } else {
                                                            qy.r rVarD4 = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z217, aVar, i39, i38, dVar2, i40, f27);
                                                            linkedHashMap = linkedHashMap2;
                                                            List list4 = (List) rVarD4.f48506b;
                                                            if (!((Boolean) rVarD4.f48507c).booleanValue()) {
                                                                yVar.f38361a = list4;
                                                                b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f27)));
                                                                f17 = f27;
                                                                z31 = true;
                                                            }
                                                        }
                                                        z31 = false;
                                                    }
                                                    if (z31) {
                                                        SubcomposeLayout = SubcomposeLayout;
                                                        j16 = 4294967296L;
                                                        f18 = f17;
                                                        iR = i36;
                                                    } else {
                                                        f21 = f15;
                                                        LinkedHashMap linkedHashMap6 = linkedHashMap;
                                                        rVarD2 = e.D(linkedHashMap6, b1Var4, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f21);
                                                        list2 = (List) rVarD2.f48506b;
                                                        if (((Boolean) rVarD2.f48507c).booleanValue()) {
                                                            SubcomposeLayout = SubcomposeLayout;
                                                            z32 = z217;
                                                            yVar.f38361a = list2;
                                                            iR = e.R(i38, list2);
                                                            iQ = e.Q(i39, list2);
                                                            b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f21)));
                                                            f18 = f21;
                                                        } else {
                                                            if (f19 > f21) {
                                                                f22 = f19 - f21;
                                                                if (f22 >= 1.0f) {
                                                                    SubcomposeLayout = SubcomposeLayout;
                                                                    z32 = z217;
                                                                    l1.b1 b1Var9 = b1Var4;
                                                                    int iCeil4 = (int) Math.ceil((float) (Math.log(f22 + 1) / hz.a.f33863a));
                                                                    int i410 = 2;
                                                                    int i411 = iCeil4 + 2;
                                                                    f23 = f19;
                                                                    int i412 = 0;
                                                                    f24 = f21;
                                                                    List list10 = list2;
                                                                    float f212 = f24;
                                                                    while (true) {
                                                                        f25 = f23 - f24;
                                                                        if (f25 >= 1.0f && i412 < i411) {
                                                                            i412++;
                                                                            float f29 = (f25 / i410) + f24;
                                                                            if (f29 == f24 || f29 == f23) {
                                                                                break;
                                                                            }
                                                                            b1Var9 = b1Var9;
                                                                            List list6 = list10;
                                                                            float f30 = f24;
                                                                            i411 = i411;
                                                                            qy.r rVarD5 = e.D(linkedHashMap6, b1Var9, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f29);
                                                                            List list7 = (List) rVarD5.f48506b;
                                                                            if (((Boolean) rVarD5.f48507c).booleanValue()) {
                                                                                f24 = f30;
                                                                                f23 = f29;
                                                                                list10 = list6;
                                                                                i410 = 2;
                                                                            } else {
                                                                                f24 = f29;
                                                                                f212 = f24;
                                                                                i410 = 2;
                                                                                list10 = list7;
                                                                            }
                                                                        } else {
                                                                            break;
                                                                        }
                                                                    }
                                                                    yVar.f38361a = list10;
                                                                    f18 = f212;
                                                                } else {
                                                                    SubcomposeLayout = SubcomposeLayout;
                                                                    z32 = z217;
                                                                    SubcomposeLayout = SubcomposeLayout;
                                                                    z32 = z217;
                                                                    yVar.f38361a = list2;
                                                                    f18 = f21;
                                                                }
                                                            } else {
                                                                SubcomposeLayout = SubcomposeLayout;
                                                                z32 = z217;
                                                                SubcomposeLayout = SubcomposeLayout;
                                                                z32 = z217;
                                                                yVar.f38361a = list2;
                                                                f18 = f21;
                                                            }
                                                            iR = e.R(i38, (List) yVar.f38361a);
                                                            iQ = e.Q(i39, (List) yVar.f38361a);
                                                            j16 = 4294967296L;
                                                            b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f18)));
                                                        }
                                                    }
                                                } else {
                                                    yVar.f38361a = list;
                                                    int iR6 = e.R(i38, list);
                                                    iQ = e.Q(i39, list);
                                                    b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f19)));
                                                    f18 = f19;
                                                    iR = iR6;
                                                }
                                                j16 = 4294967296L;
                                            }
                                            cVar2.invoke(new v3.o(fr.j3.L(j16, f18)));
                                            iH = v3.a.h(aVar.f53483a);
                                            if (iQ > iH) {
                                                i37 = iH;
                                            } else {
                                                i37 = iQ;
                                            }
                                            iG = v3.a.g(aVar.f53483a);
                                            if (iR > iG) {
                                                iR = iG;
                                            }
                                            System.currentTimeMillis();
                                            ((List) yVar.f38361a).size();
                                            final j0.f fVar5 = fVar;
                                            final z1.i iVar15 = iVar8;
                                            final z1.i iVar16 = iVar3;
                                            return SubcomposeLayout.q0(i37, iR, ry.s.f50855a, new fz.c() { // from class: dt.n3
                                                /* JADX WARN: Code duplicated, block: B:29:0x008d  */
                                                @Override // fz.c
                                                public final Object invoke(Object obj3) {
                                                    Integer num;
                                                    int i413;
                                                    z1.i iVar17;
                                                    int iA;
                                                    w2.f1 layout = (w2.f1) obj3;
                                                    kotlin.jvm.internal.m.f(layout, "$this$layout");
                                                    int i414 = 0;
                                                    int i415 = 0;
                                                    for (List<w2.g1> list11 : (Iterable) yVar.f38361a) {
                                                        if (!list11.isEmpty()) {
                                                            Iterator it = list11.iterator();
                                                            if (it.hasNext()) {
                                                                Integer numValueOf = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                                while (it.hasNext()) {
                                                                    Integer numValueOf2 = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                                    if (numValueOf.compareTo(numValueOf2) < 0) {
                                                                        numValueOf = numValueOf2;
                                                                    }
                                                                }
                                                                num = numValueOf;
                                                            } else {
                                                                num = null;
                                                            }
                                                            int iIntValue3 = num != null ? num.intValue() : 0;
                                                            int size = list11.size() - 1;
                                                            if (size < 0) {
                                                                size = 0;
                                                            }
                                                            int i416 = i39;
                                                            int i417 = size * i416;
                                                            Iterator it2 = list11.iterator();
                                                            int i418 = 0;
                                                            while (it2.hasNext()) {
                                                                i418 += ((w2.g1) it2.next()).f54501a;
                                                            }
                                                            int i50 = i418 + i417;
                                                            j0.b bVar = j0.i.f35303a;
                                                            j0.f fVar6 = fVar5;
                                                            if (kotlin.jvm.internal.m.a(fVar6, bVar)) {
                                                                i413 = 0;
                                                            } else {
                                                                boolean zA = kotlin.jvm.internal.m.a(fVar6, j0.i.f35307e);
                                                                int i51 = i37;
                                                                if (zA) {
                                                                    int i52 = i51 - i50;
                                                                    if (i52 < 0) {
                                                                        i52 = 0;
                                                                    }
                                                                    i413 = i52 / 2;
                                                                } else if (!kotlin.jvm.internal.m.a(fVar6, j0.i.f35304b) || (i413 = i51 - i50) < 0) {
                                                                    i413 = 0;
                                                                }
                                                            }
                                                            for (w2.g1 g1Var : list11) {
                                                                if (i415 != 0 || (iVar17 = iVar15) == null) {
                                                                    iVar17 = iVar16;
                                                                }
                                                                if (kotlin.jvm.internal.m.a(iVar17, z1.c.L)) {
                                                                    iA = 0;
                                                                } else {
                                                                    z1.i iVar18 = z1.c.M;
                                                                    iA = kotlin.jvm.internal.m.a(iVar17, iVar18) ? (iIntValue3 - g1Var.f54502b) / 2 : kotlin.jvm.internal.m.a(iVar17, z1.c.N) ? iIntValue3 - g1Var.f54502b : iVar18.a(g1Var.f54502b, iIntValue3);
                                                                }
                                                                w2.f1.k(layout, g1Var, i413, iA + i414);
                                                                i413 += g1Var.f54501a + i416;
                                                                i415++;
                                                            }
                                                            i414 += iIntValue3 + i38;
                                                        }
                                                    }
                                                    return qy.b0.f48488a;
                                                }
                                            });
                                        }
                                        v3.o.c(j17);
                                        b1Var5.setValue(null);
                                    }
                                } else {
                                    z217 = z33;
                                    f15 = fC;
                                    f16 = f26;
                                }
                                f17 = f15;
                                z30 = false;
                                iQ = 0;
                                i36 = 0;
                                if (z30) {
                                    f19 = f16;
                                    rVarD = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z217, aVar, i39, i38, dVar2, i40, f19);
                                    list = (List) rVarD.f48506b;
                                    if (((Boolean) rVarD.f48507c).booleanValue()) {
                                        yVar.f38361a = list;
                                        int iR7 = e.R(i38, list);
                                        iQ = e.Q(i39, list);
                                        b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f19)));
                                        f18 = f19;
                                        iR = iR7;
                                    } else {
                                        if (list.size() == i40 + 1) {
                                            linkedHashMap = linkedHashMap2;
                                            z31 = false;
                                        } else {
                                            linkedHashMap = linkedHashMap2;
                                            z31 = false;
                                        }
                                        if (z31) {
                                            f21 = f15;
                                            LinkedHashMap linkedHashMap7 = linkedHashMap;
                                            rVarD2 = e.D(linkedHashMap7, b1Var4, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f21);
                                            list2 = (List) rVarD2.f48506b;
                                            if (((Boolean) rVarD2.f48507c).booleanValue()) {
                                                SubcomposeLayout = SubcomposeLayout;
                                                z32 = z217;
                                                yVar.f38361a = list2;
                                                iR = e.R(i38, list2);
                                                iQ = e.Q(i39, list2);
                                                b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f21)));
                                                f18 = f21;
                                            } else {
                                                if (f19 > f21) {
                                                    f22 = f19 - f21;
                                                    if (f22 >= 1.0f) {
                                                        SubcomposeLayout = SubcomposeLayout;
                                                        z32 = z217;
                                                        l1.b1 b1Var10 = b1Var4;
                                                        int iCeil5 = (int) Math.ceil((float) (Math.log(f22 + 1) / hz.a.f33863a));
                                                        int i413 = 2;
                                                        int i414 = iCeil5 + 2;
                                                        f23 = f19;
                                                        int i415 = 0;
                                                        f24 = f21;
                                                        List list11 = list2;
                                                        float f213 = f24;
                                                        while (true) {
                                                            f25 = f23 - f24;
                                                            if (f25 >= 1.0f) {
                                                                break;
                                                            }
                                                            break;
                                                            break;
                                                        }
                                                        yVar.f38361a = list11;
                                                        f18 = f213;
                                                    } else {
                                                        SubcomposeLayout = SubcomposeLayout;
                                                        z32 = z217;
                                                        SubcomposeLayout = SubcomposeLayout;
                                                        z32 = z217;
                                                        yVar.f38361a = list2;
                                                        f18 = f21;
                                                    }
                                                } else {
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    z32 = z217;
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    z32 = z217;
                                                    yVar.f38361a = list2;
                                                    f18 = f21;
                                                }
                                                iR = e.R(i38, (List) yVar.f38361a);
                                                iQ = e.Q(i39, (List) yVar.f38361a);
                                                j16 = 4294967296L;
                                                b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f18)));
                                            }
                                        } else {
                                            SubcomposeLayout = SubcomposeLayout;
                                            j16 = 4294967296L;
                                            f18 = f17;
                                            iR = i36;
                                        }
                                    }
                                    j16 = 4294967296L;
                                } else {
                                    j16 = 4294967296L;
                                    f18 = f17;
                                    iR = i36;
                                }
                                cVar2.invoke(new v3.o(fr.j3.L(j16, f18)));
                                iH = v3.a.h(aVar.f53483a);
                                if (iQ > iH) {
                                    i37 = iH;
                                } else {
                                    i37 = iQ;
                                }
                                iG = v3.a.g(aVar.f53483a);
                                if (iR > iG) {
                                    iR = iG;
                                }
                                System.currentTimeMillis();
                                ((List) yVar.f38361a).size();
                                final j0.f fVar6 = fVar;
                                final z1.i iVar17 = iVar8;
                                final z1.i iVar18 = iVar3;
                                return SubcomposeLayout.q0(i37, iR, ry.s.f50855a, new fz.c() { // from class: dt.n3
                                    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
                                    @Override // fz.c
                                    public final Object invoke(Object obj3) {
                                        Integer num;
                                        int i416;
                                        z1.i iVar19;
                                        int iA;
                                        w2.f1 layout = (w2.f1) obj3;
                                        kotlin.jvm.internal.m.f(layout, "$this$layout");
                                        int i417 = 0;
                                        int i418 = 0;
                                        for (List<w2.g1> list12 : (Iterable) yVar.f38361a) {
                                            if (!list12.isEmpty()) {
                                                Iterator it = list12.iterator();
                                                if (it.hasNext()) {
                                                    Integer numValueOf = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                    while (it.hasNext()) {
                                                        Integer numValueOf2 = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                        if (numValueOf.compareTo(numValueOf2) < 0) {
                                                            numValueOf = numValueOf2;
                                                        }
                                                    }
                                                    num = numValueOf;
                                                } else {
                                                    num = null;
                                                }
                                                int iIntValue3 = num != null ? num.intValue() : 0;
                                                int size = list12.size() - 1;
                                                if (size < 0) {
                                                    size = 0;
                                                }
                                                int i419 = i39;
                                                int i4110 = size * i419;
                                                Iterator it2 = list12.iterator();
                                                int i4111 = 0;
                                                while (it2.hasNext()) {
                                                    i4111 += ((w2.g1) it2.next()).f54501a;
                                                }
                                                int i50 = i4111 + i4110;
                                                j0.b bVar = j0.i.f35303a;
                                                j0.f fVar7 = fVar6;
                                                if (kotlin.jvm.internal.m.a(fVar7, bVar)) {
                                                    i416 = 0;
                                                } else {
                                                    boolean zA = kotlin.jvm.internal.m.a(fVar7, j0.i.f35307e);
                                                    int i51 = i37;
                                                    if (zA) {
                                                        int i52 = i51 - i50;
                                                        if (i52 < 0) {
                                                            i52 = 0;
                                                        }
                                                        i416 = i52 / 2;
                                                    } else if (!kotlin.jvm.internal.m.a(fVar7, j0.i.f35304b) || (i416 = i51 - i50) < 0) {
                                                        i416 = 0;
                                                    }
                                                }
                                                for (w2.g1 g1Var : list12) {
                                                    if (i418 != 0 || (iVar19 = iVar17) == null) {
                                                        iVar19 = iVar18;
                                                    }
                                                    if (kotlin.jvm.internal.m.a(iVar19, z1.c.L)) {
                                                        iA = 0;
                                                    } else {
                                                        z1.i iVar110 = z1.c.M;
                                                        iA = kotlin.jvm.internal.m.a(iVar19, iVar110) ? (iIntValue3 - g1Var.f54502b) / 2 : kotlin.jvm.internal.m.a(iVar19, z1.c.N) ? iIntValue3 - g1Var.f54502b : iVar110.a(g1Var.f54502b, iIntValue3);
                                                    }
                                                    w2.f1.k(layout, g1Var, i416, iA + i417);
                                                    i416 += g1Var.f54501a + i419;
                                                    i418++;
                                                }
                                                i417 += iIntValue3 + i38;
                                            }
                                        }
                                        return qy.b0.f48488a;
                                    }
                                });
                            }
                        };
                        sVar.o0(eVar4);
                        objQ8 = eVar4;
                    } else {
                        sVar = sVar2;
                        i29 = i27;
                        iVar8 = iVar7;
                        fz.e eVar5 = new fz.e() { // from class: dt.l3
                            /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
                            /* JADX WARN: Code duplicated, block: B:26:0x00e8  */
                            /* JADX WARN: Code duplicated, block: B:28:0x010c  */
                            /* JADX WARN: Code duplicated, block: B:37:0x0126  */
                            /* JADX WARN: Code duplicated, block: B:44:0x0165  */
                            /* JADX WARN: Code duplicated, block: B:46:0x0184  */
                            /* JADX WARN: Code duplicated, block: B:47:0x01a2  */
                            /* JADX WARN: Code duplicated, block: B:49:0x01a6  */
                            /* JADX WARN: Code duplicated, block: B:51:0x01ac  */
                            /* JADX WARN: Code duplicated, block: B:66:0x0223  */
                            /* JADX WARN: Code duplicated, block: B:68:0x0248  */
                            /* JADX WARN: Code duplicated, block: B:69:0x024a A[PHI: r3 r18
                              0x024a: PHI (r3v2 'SubcomposeLayout' w2.q1) = (r3v1 'SubcomposeLayout' w2.q1), (r3v4 'SubcomposeLayout' w2.q1) binds: [B:23:0x00cd, B:68:0x0248] A[DONT_GENERATE, DONT_INLINE]
                              0x024a: PHI (r18v2 float) = (r18v1 float), (r18v4 float) binds: [B:23:0x00cd, B:68:0x0248] A[DONT_GENERATE, DONT_INLINE]] */
                            /* JADX WARN: Code duplicated, block: B:72:0x0269  */
                            /* JADX WARN: Code duplicated, block: B:73:0x026c  */
                            /* JADX WARN: Code duplicated, block: B:76:0x0276  */
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                boolean z217;
                                float f15;
                                float f16;
                                float f17;
                                boolean z30;
                                int iQ;
                                int i36;
                                long j16;
                                float f18;
                                int iR;
                                int iH;
                                final int i37;
                                int iG;
                                float f19;
                                qy.r rVarD;
                                List list;
                                LinkedHashMap linkedHashMap;
                                boolean z31;
                                float f21;
                                boolean z32;
                                qy.r rVarD2;
                                List list2;
                                float f22;
                                float f23;
                                float f24;
                                float f25;
                                w2.q1 SubcomposeLayout = (w2.q1) obj;
                                v3.a aVar = (v3.a) obj2;
                                kotlin.jvm.internal.m.f(SubcomposeLayout, "$this$SubcomposeLayout");
                                System.currentTimeMillis();
                                float fC = v3.o.c(j15);
                                l1.b1 b1Var4 = currentTextStyle;
                                float fC2 = v3.o.c(((j3.y0) b1Var4.getValue()).f35827a.f35755b);
                                float f26 = fC2 < fC ? fC : fC2;
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                final kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                                yVar.f38361a = ry.r.f50854a;
                                l1.b1 b1Var5 = b1Var2;
                                v3.o oVar6 = (v3.o) b1Var5.getValue();
                                final int i38 = iIntValue2;
                                final int i39 = iIntValue;
                                int i40 = i29;
                                boolean z33 = z11;
                                t1.d dVar2 = dVar;
                                if (oVar6 != null) {
                                    f15 = fC;
                                    f16 = f26;
                                    long j17 = oVar6.f53502a;
                                    if (v3.o.c(j17) < f15 || v3.o.c(j17) > f16) {
                                        z217 = z33;
                                    } else {
                                        v3.o.c(j17);
                                        z217 = z33;
                                        qy.r rVarD3 = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z217, aVar, i39, i38, dVar2, i40, v3.o.c(j17));
                                        List list3 = (List) rVarD3.f48506b;
                                        if (!((Boolean) rVarD3.f48507c).booleanValue() || v3.o.c(j17) == f15) {
                                            v3.o.c(j17);
                                            float fC3 = v3.o.c(j17);
                                            yVar.f38361a = list3;
                                            int iR2 = e.R(i38, list3);
                                            int iQ2 = e.Q(i39, list3);
                                            f17 = fC3;
                                            i36 = iR2;
                                            iQ = iQ2;
                                            z30 = true;
                                            if (z30) {
                                                j16 = 4294967296L;
                                                f18 = f17;
                                                iR = i36;
                                            } else {
                                                f19 = f16;
                                                rVarD = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z217, aVar, i39, i38, dVar2, i40, f19);
                                                list = (List) rVarD.f48506b;
                                                if (((Boolean) rVarD.f48507c).booleanValue()) {
                                                    if (list.size() == i40 + 1 || f19 <= f15) {
                                                        linkedHashMap = linkedHashMap2;
                                                        z31 = false;
                                                    } else {
                                                        float f27 = f19 - 1.0f;
                                                        if (f27 < f15) {
                                                            f27 = f15;
                                                        }
                                                        if (f27 == f19) {
                                                            linkedHashMap = linkedHashMap2;
                                                        } else {
                                                            qy.r rVarD4 = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z217, aVar, i39, i38, dVar2, i40, f27);
                                                            linkedHashMap = linkedHashMap2;
                                                            List list4 = (List) rVarD4.f48506b;
                                                            if (!((Boolean) rVarD4.f48507c).booleanValue()) {
                                                                yVar.f38361a = list4;
                                                                b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f27)));
                                                                f17 = f27;
                                                                z31 = true;
                                                            }
                                                        }
                                                        z31 = false;
                                                    }
                                                    if (z31) {
                                                        SubcomposeLayout = SubcomposeLayout;
                                                        j16 = 4294967296L;
                                                        f18 = f17;
                                                        iR = i36;
                                                    } else {
                                                        f21 = f15;
                                                        LinkedHashMap linkedHashMap7 = linkedHashMap;
                                                        rVarD2 = e.D(linkedHashMap7, b1Var4, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f21);
                                                        list2 = (List) rVarD2.f48506b;
                                                        if (((Boolean) rVarD2.f48507c).booleanValue()) {
                                                            SubcomposeLayout = SubcomposeLayout;
                                                            z32 = z217;
                                                            yVar.f38361a = list2;
                                                            iR = e.R(i38, list2);
                                                            iQ = e.Q(i39, list2);
                                                            b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f21)));
                                                            f18 = f21;
                                                        } else {
                                                            if (f19 > f21) {
                                                                f22 = f19 - f21;
                                                                if (f22 >= 1.0f) {
                                                                    SubcomposeLayout = SubcomposeLayout;
                                                                    z32 = z217;
                                                                    l1.b1 b1Var10 = b1Var4;
                                                                    int iCeil5 = (int) Math.ceil((float) (Math.log(f22 + 1) / hz.a.f33863a));
                                                                    int i413 = 2;
                                                                    int i414 = iCeil5 + 2;
                                                                    f23 = f19;
                                                                    int i415 = 0;
                                                                    f24 = f21;
                                                                    List list11 = list2;
                                                                    float f213 = f24;
                                                                    while (true) {
                                                                        f25 = f23 - f24;
                                                                        if (f25 >= 1.0f && i415 < i414) {
                                                                            i415++;
                                                                            float f29 = (f25 / i413) + f24;
                                                                            if (f29 == f24 || f29 == f23) {
                                                                                break;
                                                                            }
                                                                            b1Var10 = b1Var10;
                                                                            List list6 = list11;
                                                                            float f30 = f24;
                                                                            i414 = i414;
                                                                            qy.r rVarD5 = e.D(linkedHashMap7, b1Var10, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f29);
                                                                            List list7 = (List) rVarD5.f48506b;
                                                                            if (((Boolean) rVarD5.f48507c).booleanValue()) {
                                                                                f24 = f30;
                                                                                f23 = f29;
                                                                                list11 = list6;
                                                                                i413 = 2;
                                                                            } else {
                                                                                f24 = f29;
                                                                                f213 = f24;
                                                                                i413 = 2;
                                                                                list11 = list7;
                                                                            }
                                                                        } else {
                                                                            break;
                                                                        }
                                                                    }
                                                                    yVar.f38361a = list11;
                                                                    f18 = f213;
                                                                } else {
                                                                    SubcomposeLayout = SubcomposeLayout;
                                                                    z32 = z217;
                                                                    SubcomposeLayout = SubcomposeLayout;
                                                                    z32 = z217;
                                                                    yVar.f38361a = list2;
                                                                    f18 = f21;
                                                                }
                                                            } else {
                                                                SubcomposeLayout = SubcomposeLayout;
                                                                z32 = z217;
                                                                SubcomposeLayout = SubcomposeLayout;
                                                                z32 = z217;
                                                                yVar.f38361a = list2;
                                                                f18 = f21;
                                                            }
                                                            iR = e.R(i38, (List) yVar.f38361a);
                                                            iQ = e.Q(i39, (List) yVar.f38361a);
                                                            j16 = 4294967296L;
                                                            b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f18)));
                                                        }
                                                    }
                                                } else {
                                                    yVar.f38361a = list;
                                                    int iR7 = e.R(i38, list);
                                                    iQ = e.Q(i39, list);
                                                    b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f19)));
                                                    f18 = f19;
                                                    iR = iR7;
                                                }
                                                j16 = 4294967296L;
                                            }
                                            cVar2.invoke(new v3.o(fr.j3.L(j16, f18)));
                                            iH = v3.a.h(aVar.f53483a);
                                            if (iQ > iH) {
                                                i37 = iH;
                                            } else {
                                                i37 = iQ;
                                            }
                                            iG = v3.a.g(aVar.f53483a);
                                            if (iR > iG) {
                                                iR = iG;
                                            }
                                            System.currentTimeMillis();
                                            ((List) yVar.f38361a).size();
                                            final j0.f fVar6 = fVar;
                                            final z1.i iVar17 = iVar8;
                                            final z1.i iVar18 = iVar3;
                                            return SubcomposeLayout.q0(i37, iR, ry.s.f50855a, new fz.c() { // from class: dt.n3
                                                /* JADX WARN: Code duplicated, block: B:29:0x008d  */
                                                @Override // fz.c
                                                public final Object invoke(Object obj3) {
                                                    Integer num;
                                                    int i416;
                                                    z1.i iVar19;
                                                    int iA;
                                                    w2.f1 layout = (w2.f1) obj3;
                                                    kotlin.jvm.internal.m.f(layout, "$this$layout");
                                                    int i417 = 0;
                                                    int i418 = 0;
                                                    for (List<w2.g1> list12 : (Iterable) yVar.f38361a) {
                                                        if (!list12.isEmpty()) {
                                                            Iterator it = list12.iterator();
                                                            if (it.hasNext()) {
                                                                Integer numValueOf = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                                while (it.hasNext()) {
                                                                    Integer numValueOf2 = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                                    if (numValueOf.compareTo(numValueOf2) < 0) {
                                                                        numValueOf = numValueOf2;
                                                                    }
                                                                }
                                                                num = numValueOf;
                                                            } else {
                                                                num = null;
                                                            }
                                                            int iIntValue3 = num != null ? num.intValue() : 0;
                                                            int size = list12.size() - 1;
                                                            if (size < 0) {
                                                                size = 0;
                                                            }
                                                            int i419 = i39;
                                                            int i4110 = size * i419;
                                                            Iterator it2 = list12.iterator();
                                                            int i4111 = 0;
                                                            while (it2.hasNext()) {
                                                                i4111 += ((w2.g1) it2.next()).f54501a;
                                                            }
                                                            int i50 = i4111 + i4110;
                                                            j0.b bVar = j0.i.f35303a;
                                                            j0.f fVar7 = fVar6;
                                                            if (kotlin.jvm.internal.m.a(fVar7, bVar)) {
                                                                i416 = 0;
                                                            } else {
                                                                boolean zA = kotlin.jvm.internal.m.a(fVar7, j0.i.f35307e);
                                                                int i51 = i37;
                                                                if (zA) {
                                                                    int i52 = i51 - i50;
                                                                    if (i52 < 0) {
                                                                        i52 = 0;
                                                                    }
                                                                    i416 = i52 / 2;
                                                                } else if (!kotlin.jvm.internal.m.a(fVar7, j0.i.f35304b) || (i416 = i51 - i50) < 0) {
                                                                    i416 = 0;
                                                                }
                                                            }
                                                            for (w2.g1 g1Var : list12) {
                                                                if (i418 != 0 || (iVar19 = iVar17) == null) {
                                                                    iVar19 = iVar18;
                                                                }
                                                                if (kotlin.jvm.internal.m.a(iVar19, z1.c.L)) {
                                                                    iA = 0;
                                                                } else {
                                                                    z1.i iVar110 = z1.c.M;
                                                                    iA = kotlin.jvm.internal.m.a(iVar19, iVar110) ? (iIntValue3 - g1Var.f54502b) / 2 : kotlin.jvm.internal.m.a(iVar19, z1.c.N) ? iIntValue3 - g1Var.f54502b : iVar110.a(g1Var.f54502b, iIntValue3);
                                                                }
                                                                w2.f1.k(layout, g1Var, i416, iA + i417);
                                                                i416 += g1Var.f54501a + i419;
                                                                i418++;
                                                            }
                                                            i417 += iIntValue3 + i38;
                                                        }
                                                    }
                                                    return qy.b0.f48488a;
                                                }
                                            });
                                        }
                                        v3.o.c(j17);
                                        b1Var5.setValue(null);
                                    }
                                } else {
                                    z217 = z33;
                                    f15 = fC;
                                    f16 = f26;
                                }
                                f17 = f15;
                                z30 = false;
                                iQ = 0;
                                i36 = 0;
                                if (z30) {
                                    f19 = f16;
                                    rVarD = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z217, aVar, i39, i38, dVar2, i40, f19);
                                    list = (List) rVarD.f48506b;
                                    if (((Boolean) rVarD.f48507c).booleanValue()) {
                                        yVar.f38361a = list;
                                        int iR8 = e.R(i38, list);
                                        iQ = e.Q(i39, list);
                                        b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f19)));
                                        f18 = f19;
                                        iR = iR8;
                                    } else {
                                        if (list.size() == i40 + 1) {
                                            linkedHashMap = linkedHashMap2;
                                            z31 = false;
                                        } else {
                                            linkedHashMap = linkedHashMap2;
                                            z31 = false;
                                        }
                                        if (z31) {
                                            f21 = f15;
                                            LinkedHashMap linkedHashMap8 = linkedHashMap;
                                            rVarD2 = e.D(linkedHashMap8, b1Var4, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f21);
                                            list2 = (List) rVarD2.f48506b;
                                            if (((Boolean) rVarD2.f48507c).booleanValue()) {
                                                SubcomposeLayout = SubcomposeLayout;
                                                z32 = z217;
                                                yVar.f38361a = list2;
                                                iR = e.R(i38, list2);
                                                iQ = e.Q(i39, list2);
                                                b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f21)));
                                                f18 = f21;
                                            } else {
                                                if (f19 > f21) {
                                                    f22 = f19 - f21;
                                                    if (f22 >= 1.0f) {
                                                        SubcomposeLayout = SubcomposeLayout;
                                                        z32 = z217;
                                                        l1.b1 b1Var11 = b1Var4;
                                                        int iCeil6 = (int) Math.ceil((float) (Math.log(f22 + 1) / hz.a.f33863a));
                                                        int i416 = 2;
                                                        int i417 = iCeil6 + 2;
                                                        f23 = f19;
                                                        int i418 = 0;
                                                        f24 = f21;
                                                        List list12 = list2;
                                                        float f214 = f24;
                                                        while (true) {
                                                            f25 = f23 - f24;
                                                            if (f25 >= 1.0f) {
                                                                break;
                                                            }
                                                            break;
                                                            break;
                                                        }
                                                        yVar.f38361a = list12;
                                                        f18 = f214;
                                                    } else {
                                                        SubcomposeLayout = SubcomposeLayout;
                                                        z32 = z217;
                                                        SubcomposeLayout = SubcomposeLayout;
                                                        z32 = z217;
                                                        yVar.f38361a = list2;
                                                        f18 = f21;
                                                    }
                                                } else {
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    z32 = z217;
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    z32 = z217;
                                                    yVar.f38361a = list2;
                                                    f18 = f21;
                                                }
                                                iR = e.R(i38, (List) yVar.f38361a);
                                                iQ = e.Q(i39, (List) yVar.f38361a);
                                                j16 = 4294967296L;
                                                b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f18)));
                                            }
                                        } else {
                                            SubcomposeLayout = SubcomposeLayout;
                                            j16 = 4294967296L;
                                            f18 = f17;
                                            iR = i36;
                                        }
                                    }
                                    j16 = 4294967296L;
                                } else {
                                    j16 = 4294967296L;
                                    f18 = f17;
                                    iR = i36;
                                }
                                cVar2.invoke(new v3.o(fr.j3.L(j16, f18)));
                                iH = v3.a.h(aVar.f53483a);
                                if (iQ > iH) {
                                    i37 = iH;
                                } else {
                                    i37 = iQ;
                                }
                                iG = v3.a.g(aVar.f53483a);
                                if (iR > iG) {
                                    iR = iG;
                                }
                                System.currentTimeMillis();
                                ((List) yVar.f38361a).size();
                                final j0.f fVar7 = fVar;
                                final z1.i iVar19 = iVar8;
                                final z1.i iVar110 = iVar3;
                                return SubcomposeLayout.q0(i37, iR, ry.s.f50855a, new fz.c() { // from class: dt.n3
                                    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
                                    @Override // fz.c
                                    public final Object invoke(Object obj3) {
                                        Integer num;
                                        int i419;
                                        z1.i iVar111;
                                        int iA;
                                        w2.f1 layout = (w2.f1) obj3;
                                        kotlin.jvm.internal.m.f(layout, "$this$layout");
                                        int i4110 = 0;
                                        int i4111 = 0;
                                        for (List<w2.g1> list13 : (Iterable) yVar.f38361a) {
                                            if (!list13.isEmpty()) {
                                                Iterator it = list13.iterator();
                                                if (it.hasNext()) {
                                                    Integer numValueOf = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                    while (it.hasNext()) {
                                                        Integer numValueOf2 = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                        if (numValueOf.compareTo(numValueOf2) < 0) {
                                                            numValueOf = numValueOf2;
                                                        }
                                                    }
                                                    num = numValueOf;
                                                } else {
                                                    num = null;
                                                }
                                                int iIntValue3 = num != null ? num.intValue() : 0;
                                                int size = list13.size() - 1;
                                                if (size < 0) {
                                                    size = 0;
                                                }
                                                int i4112 = i39;
                                                int i4113 = size * i4112;
                                                Iterator it2 = list13.iterator();
                                                int i4114 = 0;
                                                while (it2.hasNext()) {
                                                    i4114 += ((w2.g1) it2.next()).f54501a;
                                                }
                                                int i50 = i4114 + i4113;
                                                j0.b bVar = j0.i.f35303a;
                                                j0.f fVar8 = fVar7;
                                                if (kotlin.jvm.internal.m.a(fVar8, bVar)) {
                                                    i419 = 0;
                                                } else {
                                                    boolean zA = kotlin.jvm.internal.m.a(fVar8, j0.i.f35307e);
                                                    int i51 = i37;
                                                    if (zA) {
                                                        int i52 = i51 - i50;
                                                        if (i52 < 0) {
                                                            i52 = 0;
                                                        }
                                                        i419 = i52 / 2;
                                                    } else if (!kotlin.jvm.internal.m.a(fVar8, j0.i.f35304b) || (i419 = i51 - i50) < 0) {
                                                        i419 = 0;
                                                    }
                                                }
                                                for (w2.g1 g1Var : list13) {
                                                    if (i4111 != 0 || (iVar111 = iVar19) == null) {
                                                        iVar111 = iVar110;
                                                    }
                                                    if (kotlin.jvm.internal.m.a(iVar111, z1.c.L)) {
                                                        iA = 0;
                                                    } else {
                                                        z1.i iVar112 = z1.c.M;
                                                        iA = kotlin.jvm.internal.m.a(iVar111, iVar112) ? (iIntValue3 - g1Var.f54502b) / 2 : kotlin.jvm.internal.m.a(iVar111, z1.c.N) ? iIntValue3 - g1Var.f54502b : iVar112.a(g1Var.f54502b, iIntValue3);
                                                    }
                                                    w2.f1.k(layout, g1Var, i419, iA + i4110);
                                                    i419 += g1Var.f54501a + i4112;
                                                    i4111++;
                                                }
                                                i4110 += iIntValue3 + i38;
                                            }
                                        }
                                        return qy.b0.f48488a;
                                    }
                                });
                            }
                        };
                        sVar.o0(eVar5);
                        objQ8 = eVar5;
                    }
                    w2.a0.b(rVar7, (fz.e) objQ8, sVar, i15 & 14, 0);
                    i26 = i29;
                    rVar3 = rVar7;
                    f13 = f14;
                    j12 = j13;
                    iVar6 = iVar8;
                    iVar5 = iVar3;
                } else {
                    sVar = sVar2;
                    sVar.W();
                    i26 = i11;
                    rVar3 = rVar2;
                    f13 = f12;
                    j12 = jA;
                    iVar5 = iVar3;
                    iVar6 = iVar4;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: dt.m3
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM = l1.t.M(i12 | 1);
                            int iM2 = l1.t.M(i13);
                            e.C(rVar3, fVar, iVar5, iVar6, z11, currentTextStyle, f13, f11, i26, j12, dVar, (l1.n) obj, iM, iM2, i14);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i15 |= 805306368;
            jA = j11;
            if ((i13 & 6) == 0) {
                if (sVar2.h(dVar)) {
                    i30 = 4;
                } else {
                    i30 = 2;
                }
                i25 = i13 | i30;
            } else {
                i25 = i13;
            }
            if ((i15 & 306783379) == 306783378) {
                z12 = true;
            } else {
                z12 = true;
            }
            if (sVar2.T(i15 & 1, z12)) {
                if (i34 != 0) {
                    rVar4 = z1.o.f58481a;
                } else {
                    rVar4 = rVar2;
                }
                if (i35 != 0) {
                    iVar3 = z1.c.N;
                }
                if (i16 != 0) {
                    iVar4 = null;
                }
                if (i18 != 0) {
                    f14 = 0;
                } else {
                    f14 = f12;
                }
                if (i21 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i11;
                }
                if (i23 != 0) {
                    jA = fr.j3.A(16);
                }
                j13 = jA;
                cVar = (v3.c) sVar2.j(z2.g1.f58547h);
                if ((3670016 & i15) == 1048576) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objQ = sVar2.Q();
                gVar = l1.m.f39353a;
                if (z13) {
                    objQ = Integer.valueOf(cVar.n0(f14));
                    sVar2.o0(objQ);
                } else {
                    objQ = Integer.valueOf(cVar.n0(f14));
                    sVar2.o0(objQ);
                }
                iIntValue = ((Number) objQ).intValue();
                if ((29360128 & i15) == 8388608) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objQ2 = sVar2.Q();
                if (z14) {
                    objQ2 = Integer.valueOf(cVar.n0(f11));
                    sVar2.o0(objQ2);
                } else {
                    objQ2 = Integer.valueOf(cVar.n0(f11));
                    sVar2.o0(objQ2);
                }
                iIntValue2 = ((Number) objQ2).intValue();
                objQ3 = sVar2.Q();
                if (objQ3 == gVar) {
                    objQ3 = l1.t.B(new v3.o(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b));
                    sVar2.o0(objQ3);
                }
                b1Var = (l1.b1) objQ3;
                objQ4 = sVar2.Q();
                if (objQ4 == gVar) {
                    objQ4 = l1.t.B(null);
                    sVar2.o0(objQ4);
                }
                b1Var2 = (l1.b1) objQ4;
                z1.r rVar8 = rVar4;
                iVar7 = iVar4;
                if (!v3.o.a(((v3.o) b1Var.getValue()).f53502a, ((j3.y0) currentTextStyle.getValue()).f35827a.f35755b)) {
                    v3.o.f(((v3.o) b1Var.getValue()).f53502a);
                    v3.o.f(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b);
                    b1Var.setValue(new v3.o(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b));
                    b1Var2.setValue(null);
                }
                objQ5 = sVar2.Q();
                if (objQ5 == gVar) {
                    objQ5 = l1.t.B(Boolean.FALSE);
                    sVar2.o0(objQ5);
                }
                b1Var3 = (l1.b1) objQ5;
                boolean zE8 = sVar2.e(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b);
                if ((1879048192 & i15) == 536870912) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zE8 | z15;
                objQ6 = sVar2.Q();
                if (z16) {
                    if (v3.o.c(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b) <= v3.o.c(j13)) {
                        j14 = ((j3.y0) currentTextStyle.getValue()).f35827a.f35755b;
                    } else {
                        j14 = j13;
                    }
                    v3.o oVar6 = new v3.o(j14);
                    sVar2.o0(oVar6);
                    objQ6 = oVar6;
                } else {
                    if (v3.o.c(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b) <= v3.o.c(j13)) {
                        j14 = ((j3.y0) currentTextStyle.getValue()).f35827a.f35755b;
                    } else {
                        j14 = j13;
                    }
                    v3.o oVar7 = new v3.o(j14);
                    sVar2.o0(oVar7);
                    objQ6 = oVar7;
                }
                j15 = ((v3.o) objQ6).f53502a;
                i28 = 458752 & i15;
                if (i28 == 131072) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zE = z17 | sVar2.e(j15);
                objQ7 = sVar2.Q();
                if (zE) {
                    objQ7 = new au.j(currentTextStyle, b1Var3, j15);
                    sVar2.o0(objQ7);
                } else {
                    objQ7 = new au.j(currentTextStyle, b1Var3, j15);
                    sVar2.o0(objQ7);
                }
                cVar2 = (fz.c) objQ7;
                boolean zE9 = sVar2.e(j15);
                if (i28 == 131072) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z217 = zE9 | z18;
                if ((234881024 & i15) == 67108864) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z218 = z217 | z19;
                if ((i25 & 14) == 4) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                boolean z219 = z218 | z20;
                if ((57344 & i15) == 16384) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                boolean zD4 = z219 | z21 | sVar2.d(iIntValue) | sVar2.d(iIntValue2) | sVar2.f(cVar2);
                if ((i15 & 112) == 32) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                boolean z2110 = zD4 | z22;
                if ((i15 & 7168) == 2048) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                z24 = z2110 | z23 | ((i15 & 896) == 256);
                objQ8 = sVar2.Q();
                if (z24) {
                    sVar = sVar2;
                    i29 = i27;
                    iVar8 = iVar7;
                    fz.e eVar6 = new fz.e() { // from class: dt.l3
                        /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
                        /* JADX WARN: Code duplicated, block: B:26:0x00e8  */
                        /* JADX WARN: Code duplicated, block: B:28:0x010c  */
                        /* JADX WARN: Code duplicated, block: B:37:0x0126  */
                        /* JADX WARN: Code duplicated, block: B:44:0x0165  */
                        /* JADX WARN: Code duplicated, block: B:46:0x0184  */
                        /* JADX WARN: Code duplicated, block: B:47:0x01a2  */
                        /* JADX WARN: Code duplicated, block: B:49:0x01a6  */
                        /* JADX WARN: Code duplicated, block: B:51:0x01ac  */
                        /* JADX WARN: Code duplicated, block: B:66:0x0223  */
                        /* JADX WARN: Code duplicated, block: B:68:0x0248  */
                        /* JADX WARN: Code duplicated, block: B:69:0x024a A[PHI: r3 r18
                          0x024a: PHI (r3v2 'SubcomposeLayout' w2.q1) = (r3v1 'SubcomposeLayout' w2.q1), (r3v4 'SubcomposeLayout' w2.q1) binds: [B:23:0x00cd, B:68:0x0248] A[DONT_GENERATE, DONT_INLINE]
                          0x024a: PHI (r18v2 float) = (r18v1 float), (r18v4 float) binds: [B:23:0x00cd, B:68:0x0248] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:72:0x0269  */
                        /* JADX WARN: Code duplicated, block: B:73:0x026c  */
                        /* JADX WARN: Code duplicated, block: B:76:0x0276  */
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            boolean z2111;
                            float f15;
                            float f16;
                            float f17;
                            boolean z30;
                            int iQ;
                            int i36;
                            long j16;
                            float f18;
                            int iR;
                            int iH;
                            final int i37;
                            int iG;
                            float f19;
                            qy.r rVarD;
                            List list;
                            LinkedHashMap linkedHashMap;
                            boolean z31;
                            float f21;
                            boolean z32;
                            qy.r rVarD2;
                            List list2;
                            float f22;
                            float f23;
                            float f24;
                            float f25;
                            w2.q1 SubcomposeLayout = (w2.q1) obj;
                            v3.a aVar = (v3.a) obj2;
                            kotlin.jvm.internal.m.f(SubcomposeLayout, "$this$SubcomposeLayout");
                            System.currentTimeMillis();
                            float fC = v3.o.c(j15);
                            l1.b1 b1Var4 = currentTextStyle;
                            float fC2 = v3.o.c(((j3.y0) b1Var4.getValue()).f35827a.f35755b);
                            float f26 = fC2 < fC ? fC : fC2;
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            final kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                            yVar.f38361a = ry.r.f50854a;
                            l1.b1 b1Var5 = b1Var2;
                            v3.o oVar8 = (v3.o) b1Var5.getValue();
                            final int i38 = iIntValue2;
                            final int i39 = iIntValue;
                            int i40 = i29;
                            boolean z33 = z11;
                            t1.d dVar2 = dVar;
                            if (oVar8 != null) {
                                f15 = fC;
                                f16 = f26;
                                long j17 = oVar8.f53502a;
                                if (v3.o.c(j17) < f15 || v3.o.c(j17) > f16) {
                                    z2111 = z33;
                                } else {
                                    v3.o.c(j17);
                                    z2111 = z33;
                                    qy.r rVarD3 = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z2111, aVar, i39, i38, dVar2, i40, v3.o.c(j17));
                                    List list3 = (List) rVarD3.f48506b;
                                    if (!((Boolean) rVarD3.f48507c).booleanValue() || v3.o.c(j17) == f15) {
                                        v3.o.c(j17);
                                        float fC3 = v3.o.c(j17);
                                        yVar.f38361a = list3;
                                        int iR2 = e.R(i38, list3);
                                        int iQ2 = e.Q(i39, list3);
                                        f17 = fC3;
                                        i36 = iR2;
                                        iQ = iQ2;
                                        z30 = true;
                                        if (z30) {
                                            j16 = 4294967296L;
                                            f18 = f17;
                                            iR = i36;
                                        } else {
                                            f19 = f16;
                                            rVarD = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z2111, aVar, i39, i38, dVar2, i40, f19);
                                            list = (List) rVarD.f48506b;
                                            if (((Boolean) rVarD.f48507c).booleanValue()) {
                                                if (list.size() == i40 + 1 || f19 <= f15) {
                                                    linkedHashMap = linkedHashMap2;
                                                    z31 = false;
                                                } else {
                                                    float f27 = f19 - 1.0f;
                                                    if (f27 < f15) {
                                                        f27 = f15;
                                                    }
                                                    if (f27 == f19) {
                                                        linkedHashMap = linkedHashMap2;
                                                    } else {
                                                        qy.r rVarD4 = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z2111, aVar, i39, i38, dVar2, i40, f27);
                                                        linkedHashMap = linkedHashMap2;
                                                        List list4 = (List) rVarD4.f48506b;
                                                        if (!((Boolean) rVarD4.f48507c).booleanValue()) {
                                                            yVar.f38361a = list4;
                                                            b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f27)));
                                                            f17 = f27;
                                                            z31 = true;
                                                        }
                                                    }
                                                    z31 = false;
                                                }
                                                if (z31) {
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    j16 = 4294967296L;
                                                    f18 = f17;
                                                    iR = i36;
                                                } else {
                                                    f21 = f15;
                                                    LinkedHashMap linkedHashMap8 = linkedHashMap;
                                                    rVarD2 = e.D(linkedHashMap8, b1Var4, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f21);
                                                    list2 = (List) rVarD2.f48506b;
                                                    if (((Boolean) rVarD2.f48507c).booleanValue()) {
                                                        SubcomposeLayout = SubcomposeLayout;
                                                        z32 = z2111;
                                                        yVar.f38361a = list2;
                                                        iR = e.R(i38, list2);
                                                        iQ = e.Q(i39, list2);
                                                        b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f21)));
                                                        f18 = f21;
                                                    } else {
                                                        if (f19 > f21) {
                                                            f22 = f19 - f21;
                                                            if (f22 >= 1.0f) {
                                                                SubcomposeLayout = SubcomposeLayout;
                                                                z32 = z2111;
                                                                l1.b1 b1Var11 = b1Var4;
                                                                int iCeil6 = (int) Math.ceil((float) (Math.log(f22 + 1) / hz.a.f33863a));
                                                                int i416 = 2;
                                                                int i417 = iCeil6 + 2;
                                                                f23 = f19;
                                                                int i418 = 0;
                                                                f24 = f21;
                                                                List list12 = list2;
                                                                float f214 = f24;
                                                                while (true) {
                                                                    f25 = f23 - f24;
                                                                    if (f25 >= 1.0f && i418 < i417) {
                                                                        i418++;
                                                                        float f29 = (f25 / i416) + f24;
                                                                        if (f29 == f24 || f29 == f23) {
                                                                            break;
                                                                        }
                                                                        b1Var11 = b1Var11;
                                                                        List list6 = list12;
                                                                        float f30 = f24;
                                                                        i417 = i417;
                                                                        qy.r rVarD5 = e.D(linkedHashMap8, b1Var11, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f29);
                                                                        List list7 = (List) rVarD5.f48506b;
                                                                        if (((Boolean) rVarD5.f48507c).booleanValue()) {
                                                                            f24 = f30;
                                                                            f23 = f29;
                                                                            list12 = list6;
                                                                            i416 = 2;
                                                                        } else {
                                                                            f24 = f29;
                                                                            f214 = f24;
                                                                            i416 = 2;
                                                                            list12 = list7;
                                                                        }
                                                                    } else {
                                                                        break;
                                                                    }
                                                                }
                                                                yVar.f38361a = list12;
                                                                f18 = f214;
                                                            } else {
                                                                SubcomposeLayout = SubcomposeLayout;
                                                                z32 = z2111;
                                                                SubcomposeLayout = SubcomposeLayout;
                                                                z32 = z2111;
                                                                yVar.f38361a = list2;
                                                                f18 = f21;
                                                            }
                                                        } else {
                                                            SubcomposeLayout = SubcomposeLayout;
                                                            z32 = z2111;
                                                            SubcomposeLayout = SubcomposeLayout;
                                                            z32 = z2111;
                                                            yVar.f38361a = list2;
                                                            f18 = f21;
                                                        }
                                                        iR = e.R(i38, (List) yVar.f38361a);
                                                        iQ = e.Q(i39, (List) yVar.f38361a);
                                                        j16 = 4294967296L;
                                                        b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f18)));
                                                    }
                                                }
                                            } else {
                                                yVar.f38361a = list;
                                                int iR8 = e.R(i38, list);
                                                iQ = e.Q(i39, list);
                                                b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f19)));
                                                f18 = f19;
                                                iR = iR8;
                                            }
                                            j16 = 4294967296L;
                                        }
                                        cVar2.invoke(new v3.o(fr.j3.L(j16, f18)));
                                        iH = v3.a.h(aVar.f53483a);
                                        if (iQ > iH) {
                                            i37 = iH;
                                        } else {
                                            i37 = iQ;
                                        }
                                        iG = v3.a.g(aVar.f53483a);
                                        if (iR > iG) {
                                            iR = iG;
                                        }
                                        System.currentTimeMillis();
                                        ((List) yVar.f38361a).size();
                                        final j0.f fVar7 = fVar;
                                        final z1.i iVar19 = iVar8;
                                        final z1.i iVar110 = iVar3;
                                        return SubcomposeLayout.q0(i37, iR, ry.s.f50855a, new fz.c() { // from class: dt.n3
                                            /* JADX WARN: Code duplicated, block: B:29:0x008d  */
                                            @Override // fz.c
                                            public final Object invoke(Object obj3) {
                                                Integer num;
                                                int i419;
                                                z1.i iVar111;
                                                int iA;
                                                w2.f1 layout = (w2.f1) obj3;
                                                kotlin.jvm.internal.m.f(layout, "$this$layout");
                                                int i4110 = 0;
                                                int i4111 = 0;
                                                for (List<w2.g1> list13 : (Iterable) yVar.f38361a) {
                                                    if (!list13.isEmpty()) {
                                                        Iterator it = list13.iterator();
                                                        if (it.hasNext()) {
                                                            Integer numValueOf = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                            while (it.hasNext()) {
                                                                Integer numValueOf2 = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                                if (numValueOf.compareTo(numValueOf2) < 0) {
                                                                    numValueOf = numValueOf2;
                                                                }
                                                            }
                                                            num = numValueOf;
                                                        } else {
                                                            num = null;
                                                        }
                                                        int iIntValue3 = num != null ? num.intValue() : 0;
                                                        int size = list13.size() - 1;
                                                        if (size < 0) {
                                                            size = 0;
                                                        }
                                                        int i4112 = i39;
                                                        int i4113 = size * i4112;
                                                        Iterator it2 = list13.iterator();
                                                        int i4114 = 0;
                                                        while (it2.hasNext()) {
                                                            i4114 += ((w2.g1) it2.next()).f54501a;
                                                        }
                                                        int i50 = i4114 + i4113;
                                                        j0.b bVar = j0.i.f35303a;
                                                        j0.f fVar8 = fVar7;
                                                        if (kotlin.jvm.internal.m.a(fVar8, bVar)) {
                                                            i419 = 0;
                                                        } else {
                                                            boolean zA = kotlin.jvm.internal.m.a(fVar8, j0.i.f35307e);
                                                            int i51 = i37;
                                                            if (zA) {
                                                                int i52 = i51 - i50;
                                                                if (i52 < 0) {
                                                                    i52 = 0;
                                                                }
                                                                i419 = i52 / 2;
                                                            } else if (!kotlin.jvm.internal.m.a(fVar8, j0.i.f35304b) || (i419 = i51 - i50) < 0) {
                                                                i419 = 0;
                                                            }
                                                        }
                                                        for (w2.g1 g1Var : list13) {
                                                            if (i4111 != 0 || (iVar111 = iVar19) == null) {
                                                                iVar111 = iVar110;
                                                            }
                                                            if (kotlin.jvm.internal.m.a(iVar111, z1.c.L)) {
                                                                iA = 0;
                                                            } else {
                                                                z1.i iVar112 = z1.c.M;
                                                                iA = kotlin.jvm.internal.m.a(iVar111, iVar112) ? (iIntValue3 - g1Var.f54502b) / 2 : kotlin.jvm.internal.m.a(iVar111, z1.c.N) ? iIntValue3 - g1Var.f54502b : iVar112.a(g1Var.f54502b, iIntValue3);
                                                            }
                                                            w2.f1.k(layout, g1Var, i419, iA + i4110);
                                                            i419 += g1Var.f54501a + i4112;
                                                            i4111++;
                                                        }
                                                        i4110 += iIntValue3 + i38;
                                                    }
                                                }
                                                return qy.b0.f48488a;
                                            }
                                        });
                                    }
                                    v3.o.c(j17);
                                    b1Var5.setValue(null);
                                }
                            } else {
                                z2111 = z33;
                                f15 = fC;
                                f16 = f26;
                            }
                            f17 = f15;
                            z30 = false;
                            iQ = 0;
                            i36 = 0;
                            if (z30) {
                                f19 = f16;
                                rVarD = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z2111, aVar, i39, i38, dVar2, i40, f19);
                                list = (List) rVarD.f48506b;
                                if (((Boolean) rVarD.f48507c).booleanValue()) {
                                    yVar.f38361a = list;
                                    int iR9 = e.R(i38, list);
                                    iQ = e.Q(i39, list);
                                    b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f19)));
                                    f18 = f19;
                                    iR = iR9;
                                } else {
                                    if (list.size() == i40 + 1) {
                                        linkedHashMap = linkedHashMap2;
                                        z31 = false;
                                    } else {
                                        linkedHashMap = linkedHashMap2;
                                        z31 = false;
                                    }
                                    if (z31) {
                                        f21 = f15;
                                        LinkedHashMap linkedHashMap9 = linkedHashMap;
                                        rVarD2 = e.D(linkedHashMap9, b1Var4, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f21);
                                        list2 = (List) rVarD2.f48506b;
                                        if (((Boolean) rVarD2.f48507c).booleanValue()) {
                                            SubcomposeLayout = SubcomposeLayout;
                                            z32 = z2111;
                                            yVar.f38361a = list2;
                                            iR = e.R(i38, list2);
                                            iQ = e.Q(i39, list2);
                                            b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f21)));
                                            f18 = f21;
                                        } else {
                                            if (f19 > f21) {
                                                f22 = f19 - f21;
                                                if (f22 >= 1.0f) {
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    z32 = z2111;
                                                    l1.b1 b1Var12 = b1Var4;
                                                    int iCeil7 = (int) Math.ceil((float) (Math.log(f22 + 1) / hz.a.f33863a));
                                                    int i419 = 2;
                                                    int i4110 = iCeil7 + 2;
                                                    f23 = f19;
                                                    int i4111 = 0;
                                                    f24 = f21;
                                                    List list13 = list2;
                                                    float f215 = f24;
                                                    while (true) {
                                                        f25 = f23 - f24;
                                                        if (f25 >= 1.0f) {
                                                            break;
                                                        }
                                                        break;
                                                        break;
                                                    }
                                                    yVar.f38361a = list13;
                                                    f18 = f215;
                                                } else {
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    z32 = z2111;
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    z32 = z2111;
                                                    yVar.f38361a = list2;
                                                    f18 = f21;
                                                }
                                            } else {
                                                SubcomposeLayout = SubcomposeLayout;
                                                z32 = z2111;
                                                SubcomposeLayout = SubcomposeLayout;
                                                z32 = z2111;
                                                yVar.f38361a = list2;
                                                f18 = f21;
                                            }
                                            iR = e.R(i38, (List) yVar.f38361a);
                                            iQ = e.Q(i39, (List) yVar.f38361a);
                                            j16 = 4294967296L;
                                            b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f18)));
                                        }
                                    } else {
                                        SubcomposeLayout = SubcomposeLayout;
                                        j16 = 4294967296L;
                                        f18 = f17;
                                        iR = i36;
                                    }
                                }
                                j16 = 4294967296L;
                            } else {
                                j16 = 4294967296L;
                                f18 = f17;
                                iR = i36;
                            }
                            cVar2.invoke(new v3.o(fr.j3.L(j16, f18)));
                            iH = v3.a.h(aVar.f53483a);
                            if (iQ > iH) {
                                i37 = iH;
                            } else {
                                i37 = iQ;
                            }
                            iG = v3.a.g(aVar.f53483a);
                            if (iR > iG) {
                                iR = iG;
                            }
                            System.currentTimeMillis();
                            ((List) yVar.f38361a).size();
                            final j0.f fVar8 = fVar;
                            final z1.i iVar111 = iVar8;
                            final z1.i iVar112 = iVar3;
                            return SubcomposeLayout.q0(i37, iR, ry.s.f50855a, new fz.c() { // from class: dt.n3
                                /* JADX WARN: Code duplicated, block: B:29:0x008d  */
                                @Override // fz.c
                                public final Object invoke(Object obj3) {
                                    Integer num;
                                    int i4112;
                                    z1.i iVar113;
                                    int iA;
                                    w2.f1 layout = (w2.f1) obj3;
                                    kotlin.jvm.internal.m.f(layout, "$this$layout");
                                    int i4113 = 0;
                                    int i4114 = 0;
                                    for (List<w2.g1> list14 : (Iterable) yVar.f38361a) {
                                        if (!list14.isEmpty()) {
                                            Iterator it = list14.iterator();
                                            if (it.hasNext()) {
                                                Integer numValueOf = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                while (it.hasNext()) {
                                                    Integer numValueOf2 = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                    if (numValueOf.compareTo(numValueOf2) < 0) {
                                                        numValueOf = numValueOf2;
                                                    }
                                                }
                                                num = numValueOf;
                                            } else {
                                                num = null;
                                            }
                                            int iIntValue3 = num != null ? num.intValue() : 0;
                                            int size = list14.size() - 1;
                                            if (size < 0) {
                                                size = 0;
                                            }
                                            int i4115 = i39;
                                            int i4116 = size * i4115;
                                            Iterator it2 = list14.iterator();
                                            int i4117 = 0;
                                            while (it2.hasNext()) {
                                                i4117 += ((w2.g1) it2.next()).f54501a;
                                            }
                                            int i50 = i4117 + i4116;
                                            j0.b bVar = j0.i.f35303a;
                                            j0.f fVar9 = fVar8;
                                            if (kotlin.jvm.internal.m.a(fVar9, bVar)) {
                                                i4112 = 0;
                                            } else {
                                                boolean zA = kotlin.jvm.internal.m.a(fVar9, j0.i.f35307e);
                                                int i51 = i37;
                                                if (zA) {
                                                    int i52 = i51 - i50;
                                                    if (i52 < 0) {
                                                        i52 = 0;
                                                    }
                                                    i4112 = i52 / 2;
                                                } else if (!kotlin.jvm.internal.m.a(fVar9, j0.i.f35304b) || (i4112 = i51 - i50) < 0) {
                                                    i4112 = 0;
                                                }
                                            }
                                            for (w2.g1 g1Var : list14) {
                                                if (i4114 != 0 || (iVar113 = iVar111) == null) {
                                                    iVar113 = iVar112;
                                                }
                                                if (kotlin.jvm.internal.m.a(iVar113, z1.c.L)) {
                                                    iA = 0;
                                                } else {
                                                    z1.i iVar114 = z1.c.M;
                                                    iA = kotlin.jvm.internal.m.a(iVar113, iVar114) ? (iIntValue3 - g1Var.f54502b) / 2 : kotlin.jvm.internal.m.a(iVar113, z1.c.N) ? iIntValue3 - g1Var.f54502b : iVar114.a(g1Var.f54502b, iIntValue3);
                                                }
                                                w2.f1.k(layout, g1Var, i4112, iA + i4113);
                                                i4112 += g1Var.f54501a + i4115;
                                                i4114++;
                                            }
                                            i4113 += iIntValue3 + i38;
                                        }
                                    }
                                    return qy.b0.f48488a;
                                }
                            });
                        }
                    };
                    sVar.o0(eVar6);
                    objQ8 = eVar6;
                } else {
                    sVar = sVar2;
                    i29 = i27;
                    iVar8 = iVar7;
                    fz.e eVar7 = new fz.e() { // from class: dt.l3
                        /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
                        /* JADX WARN: Code duplicated, block: B:26:0x00e8  */
                        /* JADX WARN: Code duplicated, block: B:28:0x010c  */
                        /* JADX WARN: Code duplicated, block: B:37:0x0126  */
                        /* JADX WARN: Code duplicated, block: B:44:0x0165  */
                        /* JADX WARN: Code duplicated, block: B:46:0x0184  */
                        /* JADX WARN: Code duplicated, block: B:47:0x01a2  */
                        /* JADX WARN: Code duplicated, block: B:49:0x01a6  */
                        /* JADX WARN: Code duplicated, block: B:51:0x01ac  */
                        /* JADX WARN: Code duplicated, block: B:66:0x0223  */
                        /* JADX WARN: Code duplicated, block: B:68:0x0248  */
                        /* JADX WARN: Code duplicated, block: B:69:0x024a A[PHI: r3 r18
                          0x024a: PHI (r3v2 'SubcomposeLayout' w2.q1) = (r3v1 'SubcomposeLayout' w2.q1), (r3v4 'SubcomposeLayout' w2.q1) binds: [B:23:0x00cd, B:68:0x0248] A[DONT_GENERATE, DONT_INLINE]
                          0x024a: PHI (r18v2 float) = (r18v1 float), (r18v4 float) binds: [B:23:0x00cd, B:68:0x0248] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:72:0x0269  */
                        /* JADX WARN: Code duplicated, block: B:73:0x026c  */
                        /* JADX WARN: Code duplicated, block: B:76:0x0276  */
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            boolean z2111;
                            float f15;
                            float f16;
                            float f17;
                            boolean z30;
                            int iQ;
                            int i36;
                            long j16;
                            float f18;
                            int iR;
                            int iH;
                            final int i37;
                            int iG;
                            float f19;
                            qy.r rVarD;
                            List list;
                            LinkedHashMap linkedHashMap;
                            boolean z31;
                            float f21;
                            boolean z32;
                            qy.r rVarD2;
                            List list2;
                            float f22;
                            float f23;
                            float f24;
                            float f25;
                            w2.q1 SubcomposeLayout = (w2.q1) obj;
                            v3.a aVar = (v3.a) obj2;
                            kotlin.jvm.internal.m.f(SubcomposeLayout, "$this$SubcomposeLayout");
                            System.currentTimeMillis();
                            float fC = v3.o.c(j15);
                            l1.b1 b1Var4 = currentTextStyle;
                            float fC2 = v3.o.c(((j3.y0) b1Var4.getValue()).f35827a.f35755b);
                            float f26 = fC2 < fC ? fC : fC2;
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            final kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                            yVar.f38361a = ry.r.f50854a;
                            l1.b1 b1Var5 = b1Var2;
                            v3.o oVar8 = (v3.o) b1Var5.getValue();
                            final int i38 = iIntValue2;
                            final int i39 = iIntValue;
                            int i40 = i29;
                            boolean z33 = z11;
                            t1.d dVar2 = dVar;
                            if (oVar8 != null) {
                                f15 = fC;
                                f16 = f26;
                                long j17 = oVar8.f53502a;
                                if (v3.o.c(j17) < f15 || v3.o.c(j17) > f16) {
                                    z2111 = z33;
                                } else {
                                    v3.o.c(j17);
                                    z2111 = z33;
                                    qy.r rVarD3 = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z2111, aVar, i39, i38, dVar2, i40, v3.o.c(j17));
                                    List list3 = (List) rVarD3.f48506b;
                                    if (!((Boolean) rVarD3.f48507c).booleanValue() || v3.o.c(j17) == f15) {
                                        v3.o.c(j17);
                                        float fC3 = v3.o.c(j17);
                                        yVar.f38361a = list3;
                                        int iR2 = e.R(i38, list3);
                                        int iQ2 = e.Q(i39, list3);
                                        f17 = fC3;
                                        i36 = iR2;
                                        iQ = iQ2;
                                        z30 = true;
                                        if (z30) {
                                            j16 = 4294967296L;
                                            f18 = f17;
                                            iR = i36;
                                        } else {
                                            f19 = f16;
                                            rVarD = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z2111, aVar, i39, i38, dVar2, i40, f19);
                                            list = (List) rVarD.f48506b;
                                            if (((Boolean) rVarD.f48507c).booleanValue()) {
                                                if (list.size() == i40 + 1 || f19 <= f15) {
                                                    linkedHashMap = linkedHashMap2;
                                                    z31 = false;
                                                } else {
                                                    float f27 = f19 - 1.0f;
                                                    if (f27 < f15) {
                                                        f27 = f15;
                                                    }
                                                    if (f27 == f19) {
                                                        linkedHashMap = linkedHashMap2;
                                                    } else {
                                                        qy.r rVarD4 = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z2111, aVar, i39, i38, dVar2, i40, f27);
                                                        linkedHashMap = linkedHashMap2;
                                                        List list4 = (List) rVarD4.f48506b;
                                                        if (!((Boolean) rVarD4.f48507c).booleanValue()) {
                                                            yVar.f38361a = list4;
                                                            b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f27)));
                                                            f17 = f27;
                                                            z31 = true;
                                                        }
                                                    }
                                                    z31 = false;
                                                }
                                                if (z31) {
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    j16 = 4294967296L;
                                                    f18 = f17;
                                                    iR = i36;
                                                } else {
                                                    f21 = f15;
                                                    LinkedHashMap linkedHashMap9 = linkedHashMap;
                                                    rVarD2 = e.D(linkedHashMap9, b1Var4, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f21);
                                                    list2 = (List) rVarD2.f48506b;
                                                    if (((Boolean) rVarD2.f48507c).booleanValue()) {
                                                        SubcomposeLayout = SubcomposeLayout;
                                                        z32 = z2111;
                                                        yVar.f38361a = list2;
                                                        iR = e.R(i38, list2);
                                                        iQ = e.Q(i39, list2);
                                                        b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f21)));
                                                        f18 = f21;
                                                    } else {
                                                        if (f19 > f21) {
                                                            f22 = f19 - f21;
                                                            if (f22 >= 1.0f) {
                                                                SubcomposeLayout = SubcomposeLayout;
                                                                z32 = z2111;
                                                                l1.b1 b1Var12 = b1Var4;
                                                                int iCeil7 = (int) Math.ceil((float) (Math.log(f22 + 1) / hz.a.f33863a));
                                                                int i419 = 2;
                                                                int i4110 = iCeil7 + 2;
                                                                f23 = f19;
                                                                int i4111 = 0;
                                                                f24 = f21;
                                                                List list13 = list2;
                                                                float f215 = f24;
                                                                while (true) {
                                                                    f25 = f23 - f24;
                                                                    if (f25 >= 1.0f && i4111 < i4110) {
                                                                        i4111++;
                                                                        float f29 = (f25 / i419) + f24;
                                                                        if (f29 == f24 || f29 == f23) {
                                                                            break;
                                                                        }
                                                                        b1Var12 = b1Var12;
                                                                        List list6 = list13;
                                                                        float f30 = f24;
                                                                        i4110 = i4110;
                                                                        qy.r rVarD5 = e.D(linkedHashMap9, b1Var12, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f29);
                                                                        List list7 = (List) rVarD5.f48506b;
                                                                        if (((Boolean) rVarD5.f48507c).booleanValue()) {
                                                                            f24 = f30;
                                                                            f23 = f29;
                                                                            list13 = list6;
                                                                            i419 = 2;
                                                                        } else {
                                                                            f24 = f29;
                                                                            f215 = f24;
                                                                            i419 = 2;
                                                                            list13 = list7;
                                                                        }
                                                                    } else {
                                                                        break;
                                                                    }
                                                                }
                                                                yVar.f38361a = list13;
                                                                f18 = f215;
                                                            } else {
                                                                SubcomposeLayout = SubcomposeLayout;
                                                                z32 = z2111;
                                                                SubcomposeLayout = SubcomposeLayout;
                                                                z32 = z2111;
                                                                yVar.f38361a = list2;
                                                                f18 = f21;
                                                            }
                                                        } else {
                                                            SubcomposeLayout = SubcomposeLayout;
                                                            z32 = z2111;
                                                            SubcomposeLayout = SubcomposeLayout;
                                                            z32 = z2111;
                                                            yVar.f38361a = list2;
                                                            f18 = f21;
                                                        }
                                                        iR = e.R(i38, (List) yVar.f38361a);
                                                        iQ = e.Q(i39, (List) yVar.f38361a);
                                                        j16 = 4294967296L;
                                                        b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f18)));
                                                    }
                                                }
                                            } else {
                                                yVar.f38361a = list;
                                                int iR9 = e.R(i38, list);
                                                iQ = e.Q(i39, list);
                                                b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f19)));
                                                f18 = f19;
                                                iR = iR9;
                                            }
                                            j16 = 4294967296L;
                                        }
                                        cVar2.invoke(new v3.o(fr.j3.L(j16, f18)));
                                        iH = v3.a.h(aVar.f53483a);
                                        if (iQ > iH) {
                                            i37 = iH;
                                        } else {
                                            i37 = iQ;
                                        }
                                        iG = v3.a.g(aVar.f53483a);
                                        if (iR > iG) {
                                            iR = iG;
                                        }
                                        System.currentTimeMillis();
                                        ((List) yVar.f38361a).size();
                                        final j0.f fVar8 = fVar;
                                        final z1.i iVar111 = iVar8;
                                        final z1.i iVar112 = iVar3;
                                        return SubcomposeLayout.q0(i37, iR, ry.s.f50855a, new fz.c() { // from class: dt.n3
                                            /* JADX WARN: Code duplicated, block: B:29:0x008d  */
                                            @Override // fz.c
                                            public final Object invoke(Object obj3) {
                                                Integer num;
                                                int i4112;
                                                z1.i iVar113;
                                                int iA;
                                                w2.f1 layout = (w2.f1) obj3;
                                                kotlin.jvm.internal.m.f(layout, "$this$layout");
                                                int i4113 = 0;
                                                int i4114 = 0;
                                                for (List<w2.g1> list14 : (Iterable) yVar.f38361a) {
                                                    if (!list14.isEmpty()) {
                                                        Iterator it = list14.iterator();
                                                        if (it.hasNext()) {
                                                            Integer numValueOf = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                            while (it.hasNext()) {
                                                                Integer numValueOf2 = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                                if (numValueOf.compareTo(numValueOf2) < 0) {
                                                                    numValueOf = numValueOf2;
                                                                }
                                                            }
                                                            num = numValueOf;
                                                        } else {
                                                            num = null;
                                                        }
                                                        int iIntValue3 = num != null ? num.intValue() : 0;
                                                        int size = list14.size() - 1;
                                                        if (size < 0) {
                                                            size = 0;
                                                        }
                                                        int i4115 = i39;
                                                        int i4116 = size * i4115;
                                                        Iterator it2 = list14.iterator();
                                                        int i4117 = 0;
                                                        while (it2.hasNext()) {
                                                            i4117 += ((w2.g1) it2.next()).f54501a;
                                                        }
                                                        int i50 = i4117 + i4116;
                                                        j0.b bVar = j0.i.f35303a;
                                                        j0.f fVar9 = fVar8;
                                                        if (kotlin.jvm.internal.m.a(fVar9, bVar)) {
                                                            i4112 = 0;
                                                        } else {
                                                            boolean zA = kotlin.jvm.internal.m.a(fVar9, j0.i.f35307e);
                                                            int i51 = i37;
                                                            if (zA) {
                                                                int i52 = i51 - i50;
                                                                if (i52 < 0) {
                                                                    i52 = 0;
                                                                }
                                                                i4112 = i52 / 2;
                                                            } else if (!kotlin.jvm.internal.m.a(fVar9, j0.i.f35304b) || (i4112 = i51 - i50) < 0) {
                                                                i4112 = 0;
                                                            }
                                                        }
                                                        for (w2.g1 g1Var : list14) {
                                                            if (i4114 != 0 || (iVar113 = iVar111) == null) {
                                                                iVar113 = iVar112;
                                                            }
                                                            if (kotlin.jvm.internal.m.a(iVar113, z1.c.L)) {
                                                                iA = 0;
                                                            } else {
                                                                z1.i iVar114 = z1.c.M;
                                                                iA = kotlin.jvm.internal.m.a(iVar113, iVar114) ? (iIntValue3 - g1Var.f54502b) / 2 : kotlin.jvm.internal.m.a(iVar113, z1.c.N) ? iIntValue3 - g1Var.f54502b : iVar114.a(g1Var.f54502b, iIntValue3);
                                                            }
                                                            w2.f1.k(layout, g1Var, i4112, iA + i4113);
                                                            i4112 += g1Var.f54501a + i4115;
                                                            i4114++;
                                                        }
                                                        i4113 += iIntValue3 + i38;
                                                    }
                                                }
                                                return qy.b0.f48488a;
                                            }
                                        });
                                    }
                                    v3.o.c(j17);
                                    b1Var5.setValue(null);
                                }
                            } else {
                                z2111 = z33;
                                f15 = fC;
                                f16 = f26;
                            }
                            f17 = f15;
                            z30 = false;
                            iQ = 0;
                            i36 = 0;
                            if (z30) {
                                f19 = f16;
                                rVarD = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z2111, aVar, i39, i38, dVar2, i40, f19);
                                list = (List) rVarD.f48506b;
                                if (((Boolean) rVarD.f48507c).booleanValue()) {
                                    yVar.f38361a = list;
                                    int iR10 = e.R(i38, list);
                                    iQ = e.Q(i39, list);
                                    b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f19)));
                                    f18 = f19;
                                    iR = iR10;
                                } else {
                                    if (list.size() == i40 + 1) {
                                        linkedHashMap = linkedHashMap2;
                                        z31 = false;
                                    } else {
                                        linkedHashMap = linkedHashMap2;
                                        z31 = false;
                                    }
                                    if (z31) {
                                        f21 = f15;
                                        LinkedHashMap linkedHashMap10 = linkedHashMap;
                                        rVarD2 = e.D(linkedHashMap10, b1Var4, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f21);
                                        list2 = (List) rVarD2.f48506b;
                                        if (((Boolean) rVarD2.f48507c).booleanValue()) {
                                            SubcomposeLayout = SubcomposeLayout;
                                            z32 = z2111;
                                            yVar.f38361a = list2;
                                            iR = e.R(i38, list2);
                                            iQ = e.Q(i39, list2);
                                            b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f21)));
                                            f18 = f21;
                                        } else {
                                            if (f19 > f21) {
                                                f22 = f19 - f21;
                                                if (f22 >= 1.0f) {
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    z32 = z2111;
                                                    l1.b1 b1Var13 = b1Var4;
                                                    int iCeil8 = (int) Math.ceil((float) (Math.log(f22 + 1) / hz.a.f33863a));
                                                    int i4112 = 2;
                                                    int i4113 = iCeil8 + 2;
                                                    f23 = f19;
                                                    int i4114 = 0;
                                                    f24 = f21;
                                                    List list14 = list2;
                                                    float f216 = f24;
                                                    while (true) {
                                                        f25 = f23 - f24;
                                                        if (f25 >= 1.0f) {
                                                            break;
                                                        }
                                                        break;
                                                        break;
                                                    }
                                                    yVar.f38361a = list14;
                                                    f18 = f216;
                                                } else {
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    z32 = z2111;
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    z32 = z2111;
                                                    yVar.f38361a = list2;
                                                    f18 = f21;
                                                }
                                            } else {
                                                SubcomposeLayout = SubcomposeLayout;
                                                z32 = z2111;
                                                SubcomposeLayout = SubcomposeLayout;
                                                z32 = z2111;
                                                yVar.f38361a = list2;
                                                f18 = f21;
                                            }
                                            iR = e.R(i38, (List) yVar.f38361a);
                                            iQ = e.Q(i39, (List) yVar.f38361a);
                                            j16 = 4294967296L;
                                            b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f18)));
                                        }
                                    } else {
                                        SubcomposeLayout = SubcomposeLayout;
                                        j16 = 4294967296L;
                                        f18 = f17;
                                        iR = i36;
                                    }
                                }
                                j16 = 4294967296L;
                            } else {
                                j16 = 4294967296L;
                                f18 = f17;
                                iR = i36;
                            }
                            cVar2.invoke(new v3.o(fr.j3.L(j16, f18)));
                            iH = v3.a.h(aVar.f53483a);
                            if (iQ > iH) {
                                i37 = iH;
                            } else {
                                i37 = iQ;
                            }
                            iG = v3.a.g(aVar.f53483a);
                            if (iR > iG) {
                                iR = iG;
                            }
                            System.currentTimeMillis();
                            ((List) yVar.f38361a).size();
                            final j0.f fVar9 = fVar;
                            final z1.i iVar113 = iVar8;
                            final z1.i iVar114 = iVar3;
                            return SubcomposeLayout.q0(i37, iR, ry.s.f50855a, new fz.c() { // from class: dt.n3
                                /* JADX WARN: Code duplicated, block: B:29:0x008d  */
                                @Override // fz.c
                                public final Object invoke(Object obj3) {
                                    Integer num;
                                    int i4115;
                                    z1.i iVar115;
                                    int iA;
                                    w2.f1 layout = (w2.f1) obj3;
                                    kotlin.jvm.internal.m.f(layout, "$this$layout");
                                    int i4116 = 0;
                                    int i4117 = 0;
                                    for (List<w2.g1> list15 : (Iterable) yVar.f38361a) {
                                        if (!list15.isEmpty()) {
                                            Iterator it = list15.iterator();
                                            if (it.hasNext()) {
                                                Integer numValueOf = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                while (it.hasNext()) {
                                                    Integer numValueOf2 = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                    if (numValueOf.compareTo(numValueOf2) < 0) {
                                                        numValueOf = numValueOf2;
                                                    }
                                                }
                                                num = numValueOf;
                                            } else {
                                                num = null;
                                            }
                                            int iIntValue3 = num != null ? num.intValue() : 0;
                                            int size = list15.size() - 1;
                                            if (size < 0) {
                                                size = 0;
                                            }
                                            int i4118 = i39;
                                            int i4119 = size * i4118;
                                            Iterator it2 = list15.iterator();
                                            int i41110 = 0;
                                            while (it2.hasNext()) {
                                                i41110 += ((w2.g1) it2.next()).f54501a;
                                            }
                                            int i50 = i41110 + i4119;
                                            j0.b bVar = j0.i.f35303a;
                                            j0.f fVar10 = fVar9;
                                            if (kotlin.jvm.internal.m.a(fVar10, bVar)) {
                                                i4115 = 0;
                                            } else {
                                                boolean zA = kotlin.jvm.internal.m.a(fVar10, j0.i.f35307e);
                                                int i51 = i37;
                                                if (zA) {
                                                    int i52 = i51 - i50;
                                                    if (i52 < 0) {
                                                        i52 = 0;
                                                    }
                                                    i4115 = i52 / 2;
                                                } else if (!kotlin.jvm.internal.m.a(fVar10, j0.i.f35304b) || (i4115 = i51 - i50) < 0) {
                                                    i4115 = 0;
                                                }
                                            }
                                            for (w2.g1 g1Var : list15) {
                                                if (i4117 != 0 || (iVar115 = iVar113) == null) {
                                                    iVar115 = iVar114;
                                                }
                                                if (kotlin.jvm.internal.m.a(iVar115, z1.c.L)) {
                                                    iA = 0;
                                                } else {
                                                    z1.i iVar116 = z1.c.M;
                                                    iA = kotlin.jvm.internal.m.a(iVar115, iVar116) ? (iIntValue3 - g1Var.f54502b) / 2 : kotlin.jvm.internal.m.a(iVar115, z1.c.N) ? iIntValue3 - g1Var.f54502b : iVar116.a(g1Var.f54502b, iIntValue3);
                                                }
                                                w2.f1.k(layout, g1Var, i4115, iA + i4116);
                                                i4115 += g1Var.f54501a + i4118;
                                                i4117++;
                                            }
                                            i4116 += iIntValue3 + i38;
                                        }
                                    }
                                    return qy.b0.f48488a;
                                }
                            });
                        }
                    };
                    sVar.o0(eVar7);
                    objQ8 = eVar7;
                }
                w2.a0.b(rVar8, (fz.e) objQ8, sVar, i15 & 14, 0);
                i26 = i29;
                rVar3 = rVar8;
                f13 = f14;
                j12 = j13;
                iVar6 = iVar8;
                iVar5 = iVar3;
            } else {
                sVar = sVar2;
                sVar.W();
                i26 = i11;
                rVar3 = rVar2;
                f13 = f12;
                j12 = jA;
                iVar5 = iVar3;
                iVar6 = iVar4;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: dt.m3
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM = l1.t.M(i12 | 1);
                        int iM2 = l1.t.M(i13);
                        e.C(rVar3, fVar, iVar5, iVar6, z11, currentTextStyle, f13, f11, i26, j12, dVar, (l1.n) obj, iM, iM2, i14);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i15 |= 384;
        iVar3 = iVar;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i12 & 3072) == 0) {
                iVar4 = iVar2;
                if (sVar2.f(iVar4)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i15 |= i17;
            }
            if ((i12 & 24576) != 0) {
                if (sVar2.g(z11)) {
                    i33 = 16384;
                } else {
                    i33 = OSSConstants.DEFAULT_BUFFER_SIZE;
                }
                i15 |= i33;
            }
            if ((i12 & 196608) == 0) {
                if (sVar2.f(currentTextStyle)) {
                    i32 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                } else {
                    i32 = 65536;
                }
                i15 |= i32;
            }
            i18 = i14 & 64;
            if (i18 != 0) {
                i15 |= 1572864;
                f12 = f5;
            } else {
                f12 = f5;
                if ((i12 & 1572864) == 0) {
                    if (sVar2.c(f12)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i15 |= i19;
                }
            }
            if ((i12 & 12582912) == 0) {
                if (sVar2.c(f11)) {
                    i31 = 8388608;
                } else {
                    i31 = 4194304;
                }
                i15 |= i31;
            }
            i21 = i14 & 256;
            if (i21 != 0) {
                i15 |= 100663296;
            } else if ((i12 & 100663296) == 0) {
                if (sVar2.d(i11)) {
                    i22 = 67108864;
                } else {
                    i22 = 33554432;
                }
                i15 |= i22;
            }
            i23 = i14 & 512;
            if (i23 != 0) {
                if ((i12 & 805306368) == 0) {
                    jA = j11;
                    if (sVar2.e(jA)) {
                        i24 = 536870912;
                    } else {
                        i24 = 268435456;
                    }
                    i15 |= i24;
                }
                if ((i13 & 6) == 0) {
                    if (sVar2.h(dVar)) {
                        i30 = 4;
                    } else {
                        i30 = 2;
                    }
                    i25 = i13 | i30;
                } else {
                    i25 = i13;
                }
                if ((i15 & 306783379) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (sVar2.T(i15 & 1, z12)) {
                    if (i34 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i35 != 0) {
                        iVar3 = z1.c.N;
                    }
                    if (i16 != 0) {
                        iVar4 = null;
                    }
                    if (i18 != 0) {
                        f14 = 0;
                    } else {
                        f14 = f12;
                    }
                    if (i21 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i11;
                    }
                    if (i23 != 0) {
                        jA = fr.j3.A(16);
                    }
                    j13 = jA;
                    cVar = (v3.c) sVar2.j(z2.g1.f58547h);
                    if ((3670016 & i15) == 1048576) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objQ = sVar2.Q();
                    gVar = l1.m.f39353a;
                    if (z13) {
                        objQ = Integer.valueOf(cVar.n0(f14));
                        sVar2.o0(objQ);
                    } else {
                        objQ = Integer.valueOf(cVar.n0(f14));
                        sVar2.o0(objQ);
                    }
                    iIntValue = ((Number) objQ).intValue();
                    if ((29360128 & i15) == 8388608) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objQ2 = sVar2.Q();
                    if (z14) {
                        objQ2 = Integer.valueOf(cVar.n0(f11));
                        sVar2.o0(objQ2);
                    } else {
                        objQ2 = Integer.valueOf(cVar.n0(f11));
                        sVar2.o0(objQ2);
                    }
                    iIntValue2 = ((Number) objQ2).intValue();
                    objQ3 = sVar2.Q();
                    if (objQ3 == gVar) {
                        objQ3 = l1.t.B(new v3.o(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b));
                        sVar2.o0(objQ3);
                    }
                    b1Var = (l1.b1) objQ3;
                    objQ4 = sVar2.Q();
                    if (objQ4 == gVar) {
                        objQ4 = l1.t.B(null);
                        sVar2.o0(objQ4);
                    }
                    b1Var2 = (l1.b1) objQ4;
                    z1.r rVar9 = rVar4;
                    iVar7 = iVar4;
                    if (!v3.o.a(((v3.o) b1Var.getValue()).f53502a, ((j3.y0) currentTextStyle.getValue()).f35827a.f35755b)) {
                        v3.o.f(((v3.o) b1Var.getValue()).f53502a);
                        v3.o.f(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b);
                        b1Var.setValue(new v3.o(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b));
                        b1Var2.setValue(null);
                    }
                    objQ5 = sVar2.Q();
                    if (objQ5 == gVar) {
                        objQ5 = l1.t.B(Boolean.FALSE);
                        sVar2.o0(objQ5);
                    }
                    b1Var3 = (l1.b1) objQ5;
                    boolean zE10 = sVar2.e(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b);
                    if ((1879048192 & i15) == 536870912) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zE10 | z15;
                    objQ6 = sVar2.Q();
                    if (z16) {
                        if (v3.o.c(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b) <= v3.o.c(j13)) {
                            j14 = ((j3.y0) currentTextStyle.getValue()).f35827a.f35755b;
                        } else {
                            j14 = j13;
                        }
                        v3.o oVar8 = new v3.o(j14);
                        sVar2.o0(oVar8);
                        objQ6 = oVar8;
                    } else {
                        if (v3.o.c(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b) <= v3.o.c(j13)) {
                            j14 = ((j3.y0) currentTextStyle.getValue()).f35827a.f35755b;
                        } else {
                            j14 = j13;
                        }
                        v3.o oVar9 = new v3.o(j14);
                        sVar2.o0(oVar9);
                        objQ6 = oVar9;
                    }
                    j15 = ((v3.o) objQ6).f53502a;
                    i28 = 458752 & i15;
                    if (i28 == 131072) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zE = z17 | sVar2.e(j15);
                    objQ7 = sVar2.Q();
                    if (zE) {
                        objQ7 = new au.j(currentTextStyle, b1Var3, j15);
                        sVar2.o0(objQ7);
                    } else {
                        objQ7 = new au.j(currentTextStyle, b1Var3, j15);
                        sVar2.o0(objQ7);
                    }
                    cVar2 = (fz.c) objQ7;
                    boolean zE11 = sVar2.e(j15);
                    if (i28 == 131072) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean z2111 = zE11 | z18;
                    if ((234881024 & i15) == 67108864) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z2112 = z2111 | z19;
                    if ((i25 & 14) == 4) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    boolean z2113 = z2112 | z20;
                    if ((57344 & i15) == 16384) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    boolean zD5 = z2113 | z21 | sVar2.d(iIntValue) | sVar2.d(iIntValue2) | sVar2.f(cVar2);
                    if ((i15 & 112) == 32) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    boolean z2114 = zD5 | z22;
                    if ((i15 & 7168) == 2048) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    z24 = z2114 | z23 | ((i15 & 896) == 256);
                    objQ8 = sVar2.Q();
                    if (z24) {
                        sVar = sVar2;
                        i29 = i27;
                        iVar8 = iVar7;
                        fz.e eVar8 = new fz.e() { // from class: dt.l3
                            /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
                            /* JADX WARN: Code duplicated, block: B:26:0x00e8  */
                            /* JADX WARN: Code duplicated, block: B:28:0x010c  */
                            /* JADX WARN: Code duplicated, block: B:37:0x0126  */
                            /* JADX WARN: Code duplicated, block: B:44:0x0165  */
                            /* JADX WARN: Code duplicated, block: B:46:0x0184  */
                            /* JADX WARN: Code duplicated, block: B:47:0x01a2  */
                            /* JADX WARN: Code duplicated, block: B:49:0x01a6  */
                            /* JADX WARN: Code duplicated, block: B:51:0x01ac  */
                            /* JADX WARN: Code duplicated, block: B:66:0x0223  */
                            /* JADX WARN: Code duplicated, block: B:68:0x0248  */
                            /* JADX WARN: Code duplicated, block: B:69:0x024a A[PHI: r3 r18
                              0x024a: PHI (r3v2 'SubcomposeLayout' w2.q1) = (r3v1 'SubcomposeLayout' w2.q1), (r3v4 'SubcomposeLayout' w2.q1) binds: [B:23:0x00cd, B:68:0x0248] A[DONT_GENERATE, DONT_INLINE]
                              0x024a: PHI (r18v2 float) = (r18v1 float), (r18v4 float) binds: [B:23:0x00cd, B:68:0x0248] A[DONT_GENERATE, DONT_INLINE]] */
                            /* JADX WARN: Code duplicated, block: B:72:0x0269  */
                            /* JADX WARN: Code duplicated, block: B:73:0x026c  */
                            /* JADX WARN: Code duplicated, block: B:76:0x0276  */
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                boolean z2115;
                                float f15;
                                float f16;
                                float f17;
                                boolean z30;
                                int iQ;
                                int i36;
                                long j16;
                                float f18;
                                int iR;
                                int iH;
                                final int i37;
                                int iG;
                                float f19;
                                qy.r rVarD;
                                List list;
                                LinkedHashMap linkedHashMap;
                                boolean z31;
                                float f21;
                                boolean z32;
                                qy.r rVarD2;
                                List list2;
                                float f22;
                                float f23;
                                float f24;
                                float f25;
                                w2.q1 SubcomposeLayout = (w2.q1) obj;
                                v3.a aVar = (v3.a) obj2;
                                kotlin.jvm.internal.m.f(SubcomposeLayout, "$this$SubcomposeLayout");
                                System.currentTimeMillis();
                                float fC = v3.o.c(j15);
                                l1.b1 b1Var4 = currentTextStyle;
                                float fC2 = v3.o.c(((j3.y0) b1Var4.getValue()).f35827a.f35755b);
                                float f26 = fC2 < fC ? fC : fC2;
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                final kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                                yVar.f38361a = ry.r.f50854a;
                                l1.b1 b1Var5 = b1Var2;
                                v3.o oVar10 = (v3.o) b1Var5.getValue();
                                final int i38 = iIntValue2;
                                final int i39 = iIntValue;
                                int i40 = i29;
                                boolean z33 = z11;
                                t1.d dVar2 = dVar;
                                if (oVar10 != null) {
                                    f15 = fC;
                                    f16 = f26;
                                    long j17 = oVar10.f53502a;
                                    if (v3.o.c(j17) < f15 || v3.o.c(j17) > f16) {
                                        z2115 = z33;
                                    } else {
                                        v3.o.c(j17);
                                        z2115 = z33;
                                        qy.r rVarD3 = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z2115, aVar, i39, i38, dVar2, i40, v3.o.c(j17));
                                        List list3 = (List) rVarD3.f48506b;
                                        if (!((Boolean) rVarD3.f48507c).booleanValue() || v3.o.c(j17) == f15) {
                                            v3.o.c(j17);
                                            float fC3 = v3.o.c(j17);
                                            yVar.f38361a = list3;
                                            int iR2 = e.R(i38, list3);
                                            int iQ2 = e.Q(i39, list3);
                                            f17 = fC3;
                                            i36 = iR2;
                                            iQ = iQ2;
                                            z30 = true;
                                            if (z30) {
                                                j16 = 4294967296L;
                                                f18 = f17;
                                                iR = i36;
                                            } else {
                                                f19 = f16;
                                                rVarD = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z2115, aVar, i39, i38, dVar2, i40, f19);
                                                list = (List) rVarD.f48506b;
                                                if (((Boolean) rVarD.f48507c).booleanValue()) {
                                                    if (list.size() == i40 + 1 || f19 <= f15) {
                                                        linkedHashMap = linkedHashMap2;
                                                        z31 = false;
                                                    } else {
                                                        float f27 = f19 - 1.0f;
                                                        if (f27 < f15) {
                                                            f27 = f15;
                                                        }
                                                        if (f27 == f19) {
                                                            linkedHashMap = linkedHashMap2;
                                                        } else {
                                                            qy.r rVarD4 = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z2115, aVar, i39, i38, dVar2, i40, f27);
                                                            linkedHashMap = linkedHashMap2;
                                                            List list4 = (List) rVarD4.f48506b;
                                                            if (!((Boolean) rVarD4.f48507c).booleanValue()) {
                                                                yVar.f38361a = list4;
                                                                b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f27)));
                                                                f17 = f27;
                                                                z31 = true;
                                                            }
                                                        }
                                                        z31 = false;
                                                    }
                                                    if (z31) {
                                                        SubcomposeLayout = SubcomposeLayout;
                                                        j16 = 4294967296L;
                                                        f18 = f17;
                                                        iR = i36;
                                                    } else {
                                                        f21 = f15;
                                                        LinkedHashMap linkedHashMap10 = linkedHashMap;
                                                        rVarD2 = e.D(linkedHashMap10, b1Var4, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f21);
                                                        list2 = (List) rVarD2.f48506b;
                                                        if (((Boolean) rVarD2.f48507c).booleanValue()) {
                                                            SubcomposeLayout = SubcomposeLayout;
                                                            z32 = z2115;
                                                            yVar.f38361a = list2;
                                                            iR = e.R(i38, list2);
                                                            iQ = e.Q(i39, list2);
                                                            b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f21)));
                                                            f18 = f21;
                                                        } else {
                                                            if (f19 > f21) {
                                                                f22 = f19 - f21;
                                                                if (f22 >= 1.0f) {
                                                                    SubcomposeLayout = SubcomposeLayout;
                                                                    z32 = z2115;
                                                                    l1.b1 b1Var13 = b1Var4;
                                                                    int iCeil8 = (int) Math.ceil((float) (Math.log(f22 + 1) / hz.a.f33863a));
                                                                    int i4112 = 2;
                                                                    int i4113 = iCeil8 + 2;
                                                                    f23 = f19;
                                                                    int i4114 = 0;
                                                                    f24 = f21;
                                                                    List list14 = list2;
                                                                    float f216 = f24;
                                                                    while (true) {
                                                                        f25 = f23 - f24;
                                                                        if (f25 >= 1.0f && i4114 < i4113) {
                                                                            i4114++;
                                                                            float f29 = (f25 / i4112) + f24;
                                                                            if (f29 == f24 || f29 == f23) {
                                                                                break;
                                                                            }
                                                                            b1Var13 = b1Var13;
                                                                            List list6 = list14;
                                                                            float f30 = f24;
                                                                            i4113 = i4113;
                                                                            qy.r rVarD5 = e.D(linkedHashMap10, b1Var13, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f29);
                                                                            List list7 = (List) rVarD5.f48506b;
                                                                            if (((Boolean) rVarD5.f48507c).booleanValue()) {
                                                                                f24 = f30;
                                                                                f23 = f29;
                                                                                list14 = list6;
                                                                                i4112 = 2;
                                                                            } else {
                                                                                f24 = f29;
                                                                                f216 = f24;
                                                                                i4112 = 2;
                                                                                list14 = list7;
                                                                            }
                                                                        } else {
                                                                            break;
                                                                        }
                                                                    }
                                                                    yVar.f38361a = list14;
                                                                    f18 = f216;
                                                                } else {
                                                                    SubcomposeLayout = SubcomposeLayout;
                                                                    z32 = z2115;
                                                                    SubcomposeLayout = SubcomposeLayout;
                                                                    z32 = z2115;
                                                                    yVar.f38361a = list2;
                                                                    f18 = f21;
                                                                }
                                                            } else {
                                                                SubcomposeLayout = SubcomposeLayout;
                                                                z32 = z2115;
                                                                SubcomposeLayout = SubcomposeLayout;
                                                                z32 = z2115;
                                                                yVar.f38361a = list2;
                                                                f18 = f21;
                                                            }
                                                            iR = e.R(i38, (List) yVar.f38361a);
                                                            iQ = e.Q(i39, (List) yVar.f38361a);
                                                            j16 = 4294967296L;
                                                            b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f18)));
                                                        }
                                                    }
                                                } else {
                                                    yVar.f38361a = list;
                                                    int iR10 = e.R(i38, list);
                                                    iQ = e.Q(i39, list);
                                                    b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f19)));
                                                    f18 = f19;
                                                    iR = iR10;
                                                }
                                                j16 = 4294967296L;
                                            }
                                            cVar2.invoke(new v3.o(fr.j3.L(j16, f18)));
                                            iH = v3.a.h(aVar.f53483a);
                                            if (iQ > iH) {
                                                i37 = iH;
                                            } else {
                                                i37 = iQ;
                                            }
                                            iG = v3.a.g(aVar.f53483a);
                                            if (iR > iG) {
                                                iR = iG;
                                            }
                                            System.currentTimeMillis();
                                            ((List) yVar.f38361a).size();
                                            final j0.f fVar9 = fVar;
                                            final z1.i iVar113 = iVar8;
                                            final z1.i iVar114 = iVar3;
                                            return SubcomposeLayout.q0(i37, iR, ry.s.f50855a, new fz.c() { // from class: dt.n3
                                                /* JADX WARN: Code duplicated, block: B:29:0x008d  */
                                                @Override // fz.c
                                                public final Object invoke(Object obj3) {
                                                    Integer num;
                                                    int i4115;
                                                    z1.i iVar115;
                                                    int iA;
                                                    w2.f1 layout = (w2.f1) obj3;
                                                    kotlin.jvm.internal.m.f(layout, "$this$layout");
                                                    int i4116 = 0;
                                                    int i4117 = 0;
                                                    for (List<w2.g1> list15 : (Iterable) yVar.f38361a) {
                                                        if (!list15.isEmpty()) {
                                                            Iterator it = list15.iterator();
                                                            if (it.hasNext()) {
                                                                Integer numValueOf = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                                while (it.hasNext()) {
                                                                    Integer numValueOf2 = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                                    if (numValueOf.compareTo(numValueOf2) < 0) {
                                                                        numValueOf = numValueOf2;
                                                                    }
                                                                }
                                                                num = numValueOf;
                                                            } else {
                                                                num = null;
                                                            }
                                                            int iIntValue3 = num != null ? num.intValue() : 0;
                                                            int size = list15.size() - 1;
                                                            if (size < 0) {
                                                                size = 0;
                                                            }
                                                            int i4118 = i39;
                                                            int i4119 = size * i4118;
                                                            Iterator it2 = list15.iterator();
                                                            int i41110 = 0;
                                                            while (it2.hasNext()) {
                                                                i41110 += ((w2.g1) it2.next()).f54501a;
                                                            }
                                                            int i50 = i41110 + i4119;
                                                            j0.b bVar = j0.i.f35303a;
                                                            j0.f fVar10 = fVar9;
                                                            if (kotlin.jvm.internal.m.a(fVar10, bVar)) {
                                                                i4115 = 0;
                                                            } else {
                                                                boolean zA = kotlin.jvm.internal.m.a(fVar10, j0.i.f35307e);
                                                                int i51 = i37;
                                                                if (zA) {
                                                                    int i52 = i51 - i50;
                                                                    if (i52 < 0) {
                                                                        i52 = 0;
                                                                    }
                                                                    i4115 = i52 / 2;
                                                                } else if (!kotlin.jvm.internal.m.a(fVar10, j0.i.f35304b) || (i4115 = i51 - i50) < 0) {
                                                                    i4115 = 0;
                                                                }
                                                            }
                                                            for (w2.g1 g1Var : list15) {
                                                                if (i4117 != 0 || (iVar115 = iVar113) == null) {
                                                                    iVar115 = iVar114;
                                                                }
                                                                if (kotlin.jvm.internal.m.a(iVar115, z1.c.L)) {
                                                                    iA = 0;
                                                                } else {
                                                                    z1.i iVar116 = z1.c.M;
                                                                    iA = kotlin.jvm.internal.m.a(iVar115, iVar116) ? (iIntValue3 - g1Var.f54502b) / 2 : kotlin.jvm.internal.m.a(iVar115, z1.c.N) ? iIntValue3 - g1Var.f54502b : iVar116.a(g1Var.f54502b, iIntValue3);
                                                                }
                                                                w2.f1.k(layout, g1Var, i4115, iA + i4116);
                                                                i4115 += g1Var.f54501a + i4118;
                                                                i4117++;
                                                            }
                                                            i4116 += iIntValue3 + i38;
                                                        }
                                                    }
                                                    return qy.b0.f48488a;
                                                }
                                            });
                                        }
                                        v3.o.c(j17);
                                        b1Var5.setValue(null);
                                    }
                                } else {
                                    z2115 = z33;
                                    f15 = fC;
                                    f16 = f26;
                                }
                                f17 = f15;
                                z30 = false;
                                iQ = 0;
                                i36 = 0;
                                if (z30) {
                                    f19 = f16;
                                    rVarD = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z2115, aVar, i39, i38, dVar2, i40, f19);
                                    list = (List) rVarD.f48506b;
                                    if (((Boolean) rVarD.f48507c).booleanValue()) {
                                        yVar.f38361a = list;
                                        int iR11 = e.R(i38, list);
                                        iQ = e.Q(i39, list);
                                        b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f19)));
                                        f18 = f19;
                                        iR = iR11;
                                    } else {
                                        if (list.size() == i40 + 1) {
                                            linkedHashMap = linkedHashMap2;
                                            z31 = false;
                                        } else {
                                            linkedHashMap = linkedHashMap2;
                                            z31 = false;
                                        }
                                        if (z31) {
                                            f21 = f15;
                                            LinkedHashMap linkedHashMap11 = linkedHashMap;
                                            rVarD2 = e.D(linkedHashMap11, b1Var4, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f21);
                                            list2 = (List) rVarD2.f48506b;
                                            if (((Boolean) rVarD2.f48507c).booleanValue()) {
                                                SubcomposeLayout = SubcomposeLayout;
                                                z32 = z2115;
                                                yVar.f38361a = list2;
                                                iR = e.R(i38, list2);
                                                iQ = e.Q(i39, list2);
                                                b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f21)));
                                                f18 = f21;
                                            } else {
                                                if (f19 > f21) {
                                                    f22 = f19 - f21;
                                                    if (f22 >= 1.0f) {
                                                        SubcomposeLayout = SubcomposeLayout;
                                                        z32 = z2115;
                                                        l1.b1 b1Var14 = b1Var4;
                                                        int iCeil9 = (int) Math.ceil((float) (Math.log(f22 + 1) / hz.a.f33863a));
                                                        int i4115 = 2;
                                                        int i4116 = iCeil9 + 2;
                                                        f23 = f19;
                                                        int i4117 = 0;
                                                        f24 = f21;
                                                        List list15 = list2;
                                                        float f217 = f24;
                                                        while (true) {
                                                            f25 = f23 - f24;
                                                            if (f25 >= 1.0f) {
                                                                break;
                                                            }
                                                            break;
                                                            break;
                                                        }
                                                        yVar.f38361a = list15;
                                                        f18 = f217;
                                                    } else {
                                                        SubcomposeLayout = SubcomposeLayout;
                                                        z32 = z2115;
                                                        SubcomposeLayout = SubcomposeLayout;
                                                        z32 = z2115;
                                                        yVar.f38361a = list2;
                                                        f18 = f21;
                                                    }
                                                } else {
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    z32 = z2115;
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    z32 = z2115;
                                                    yVar.f38361a = list2;
                                                    f18 = f21;
                                                }
                                                iR = e.R(i38, (List) yVar.f38361a);
                                                iQ = e.Q(i39, (List) yVar.f38361a);
                                                j16 = 4294967296L;
                                                b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f18)));
                                            }
                                        } else {
                                            SubcomposeLayout = SubcomposeLayout;
                                            j16 = 4294967296L;
                                            f18 = f17;
                                            iR = i36;
                                        }
                                    }
                                    j16 = 4294967296L;
                                } else {
                                    j16 = 4294967296L;
                                    f18 = f17;
                                    iR = i36;
                                }
                                cVar2.invoke(new v3.o(fr.j3.L(j16, f18)));
                                iH = v3.a.h(aVar.f53483a);
                                if (iQ > iH) {
                                    i37 = iH;
                                } else {
                                    i37 = iQ;
                                }
                                iG = v3.a.g(aVar.f53483a);
                                if (iR > iG) {
                                    iR = iG;
                                }
                                System.currentTimeMillis();
                                ((List) yVar.f38361a).size();
                                final j0.f fVar10 = fVar;
                                final z1.i iVar115 = iVar8;
                                final z1.i iVar116 = iVar3;
                                return SubcomposeLayout.q0(i37, iR, ry.s.f50855a, new fz.c() { // from class: dt.n3
                                    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
                                    @Override // fz.c
                                    public final Object invoke(Object obj3) {
                                        Integer num;
                                        int i4118;
                                        z1.i iVar117;
                                        int iA;
                                        w2.f1 layout = (w2.f1) obj3;
                                        kotlin.jvm.internal.m.f(layout, "$this$layout");
                                        int i4119 = 0;
                                        int i41110 = 0;
                                        for (List<w2.g1> list16 : (Iterable) yVar.f38361a) {
                                            if (!list16.isEmpty()) {
                                                Iterator it = list16.iterator();
                                                if (it.hasNext()) {
                                                    Integer numValueOf = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                    while (it.hasNext()) {
                                                        Integer numValueOf2 = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                        if (numValueOf.compareTo(numValueOf2) < 0) {
                                                            numValueOf = numValueOf2;
                                                        }
                                                    }
                                                    num = numValueOf;
                                                } else {
                                                    num = null;
                                                }
                                                int iIntValue3 = num != null ? num.intValue() : 0;
                                                int size = list16.size() - 1;
                                                if (size < 0) {
                                                    size = 0;
                                                }
                                                int i41111 = i39;
                                                int i41112 = size * i41111;
                                                Iterator it2 = list16.iterator();
                                                int i41113 = 0;
                                                while (it2.hasNext()) {
                                                    i41113 += ((w2.g1) it2.next()).f54501a;
                                                }
                                                int i50 = i41113 + i41112;
                                                j0.b bVar = j0.i.f35303a;
                                                j0.f fVar11 = fVar10;
                                                if (kotlin.jvm.internal.m.a(fVar11, bVar)) {
                                                    i4118 = 0;
                                                } else {
                                                    boolean zA = kotlin.jvm.internal.m.a(fVar11, j0.i.f35307e);
                                                    int i51 = i37;
                                                    if (zA) {
                                                        int i52 = i51 - i50;
                                                        if (i52 < 0) {
                                                            i52 = 0;
                                                        }
                                                        i4118 = i52 / 2;
                                                    } else if (!kotlin.jvm.internal.m.a(fVar11, j0.i.f35304b) || (i4118 = i51 - i50) < 0) {
                                                        i4118 = 0;
                                                    }
                                                }
                                                for (w2.g1 g1Var : list16) {
                                                    if (i41110 != 0 || (iVar117 = iVar115) == null) {
                                                        iVar117 = iVar116;
                                                    }
                                                    if (kotlin.jvm.internal.m.a(iVar117, z1.c.L)) {
                                                        iA = 0;
                                                    } else {
                                                        z1.i iVar118 = z1.c.M;
                                                        iA = kotlin.jvm.internal.m.a(iVar117, iVar118) ? (iIntValue3 - g1Var.f54502b) / 2 : kotlin.jvm.internal.m.a(iVar117, z1.c.N) ? iIntValue3 - g1Var.f54502b : iVar118.a(g1Var.f54502b, iIntValue3);
                                                    }
                                                    w2.f1.k(layout, g1Var, i4118, iA + i4119);
                                                    i4118 += g1Var.f54501a + i41111;
                                                    i41110++;
                                                }
                                                i4119 += iIntValue3 + i38;
                                            }
                                        }
                                        return qy.b0.f48488a;
                                    }
                                });
                            }
                        };
                        sVar.o0(eVar8);
                        objQ8 = eVar8;
                    } else {
                        sVar = sVar2;
                        i29 = i27;
                        iVar8 = iVar7;
                        fz.e eVar9 = new fz.e() { // from class: dt.l3
                            /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
                            /* JADX WARN: Code duplicated, block: B:26:0x00e8  */
                            /* JADX WARN: Code duplicated, block: B:28:0x010c  */
                            /* JADX WARN: Code duplicated, block: B:37:0x0126  */
                            /* JADX WARN: Code duplicated, block: B:44:0x0165  */
                            /* JADX WARN: Code duplicated, block: B:46:0x0184  */
                            /* JADX WARN: Code duplicated, block: B:47:0x01a2  */
                            /* JADX WARN: Code duplicated, block: B:49:0x01a6  */
                            /* JADX WARN: Code duplicated, block: B:51:0x01ac  */
                            /* JADX WARN: Code duplicated, block: B:66:0x0223  */
                            /* JADX WARN: Code duplicated, block: B:68:0x0248  */
                            /* JADX WARN: Code duplicated, block: B:69:0x024a A[PHI: r3 r18
                              0x024a: PHI (r3v2 'SubcomposeLayout' w2.q1) = (r3v1 'SubcomposeLayout' w2.q1), (r3v4 'SubcomposeLayout' w2.q1) binds: [B:23:0x00cd, B:68:0x0248] A[DONT_GENERATE, DONT_INLINE]
                              0x024a: PHI (r18v2 float) = (r18v1 float), (r18v4 float) binds: [B:23:0x00cd, B:68:0x0248] A[DONT_GENERATE, DONT_INLINE]] */
                            /* JADX WARN: Code duplicated, block: B:72:0x0269  */
                            /* JADX WARN: Code duplicated, block: B:73:0x026c  */
                            /* JADX WARN: Code duplicated, block: B:76:0x0276  */
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                boolean z2115;
                                float f15;
                                float f16;
                                float f17;
                                boolean z30;
                                int iQ;
                                int i36;
                                long j16;
                                float f18;
                                int iR;
                                int iH;
                                final int i37;
                                int iG;
                                float f19;
                                qy.r rVarD;
                                List list;
                                LinkedHashMap linkedHashMap;
                                boolean z31;
                                float f21;
                                boolean z32;
                                qy.r rVarD2;
                                List list2;
                                float f22;
                                float f23;
                                float f24;
                                float f25;
                                w2.q1 SubcomposeLayout = (w2.q1) obj;
                                v3.a aVar = (v3.a) obj2;
                                kotlin.jvm.internal.m.f(SubcomposeLayout, "$this$SubcomposeLayout");
                                System.currentTimeMillis();
                                float fC = v3.o.c(j15);
                                l1.b1 b1Var4 = currentTextStyle;
                                float fC2 = v3.o.c(((j3.y0) b1Var4.getValue()).f35827a.f35755b);
                                float f26 = fC2 < fC ? fC : fC2;
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                final kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                                yVar.f38361a = ry.r.f50854a;
                                l1.b1 b1Var5 = b1Var2;
                                v3.o oVar10 = (v3.o) b1Var5.getValue();
                                final int i38 = iIntValue2;
                                final int i39 = iIntValue;
                                int i40 = i29;
                                boolean z33 = z11;
                                t1.d dVar2 = dVar;
                                if (oVar10 != null) {
                                    f15 = fC;
                                    f16 = f26;
                                    long j17 = oVar10.f53502a;
                                    if (v3.o.c(j17) < f15 || v3.o.c(j17) > f16) {
                                        z2115 = z33;
                                    } else {
                                        v3.o.c(j17);
                                        z2115 = z33;
                                        qy.r rVarD3 = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z2115, aVar, i39, i38, dVar2, i40, v3.o.c(j17));
                                        List list3 = (List) rVarD3.f48506b;
                                        if (!((Boolean) rVarD3.f48507c).booleanValue() || v3.o.c(j17) == f15) {
                                            v3.o.c(j17);
                                            float fC3 = v3.o.c(j17);
                                            yVar.f38361a = list3;
                                            int iR2 = e.R(i38, list3);
                                            int iQ2 = e.Q(i39, list3);
                                            f17 = fC3;
                                            i36 = iR2;
                                            iQ = iQ2;
                                            z30 = true;
                                            if (z30) {
                                                j16 = 4294967296L;
                                                f18 = f17;
                                                iR = i36;
                                            } else {
                                                f19 = f16;
                                                rVarD = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z2115, aVar, i39, i38, dVar2, i40, f19);
                                                list = (List) rVarD.f48506b;
                                                if (((Boolean) rVarD.f48507c).booleanValue()) {
                                                    if (list.size() == i40 + 1 || f19 <= f15) {
                                                        linkedHashMap = linkedHashMap2;
                                                        z31 = false;
                                                    } else {
                                                        float f27 = f19 - 1.0f;
                                                        if (f27 < f15) {
                                                            f27 = f15;
                                                        }
                                                        if (f27 == f19) {
                                                            linkedHashMap = linkedHashMap2;
                                                        } else {
                                                            qy.r rVarD4 = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z2115, aVar, i39, i38, dVar2, i40, f27);
                                                            linkedHashMap = linkedHashMap2;
                                                            List list4 = (List) rVarD4.f48506b;
                                                            if (!((Boolean) rVarD4.f48507c).booleanValue()) {
                                                                yVar.f38361a = list4;
                                                                b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f27)));
                                                                f17 = f27;
                                                                z31 = true;
                                                            }
                                                        }
                                                        z31 = false;
                                                    }
                                                    if (z31) {
                                                        SubcomposeLayout = SubcomposeLayout;
                                                        j16 = 4294967296L;
                                                        f18 = f17;
                                                        iR = i36;
                                                    } else {
                                                        f21 = f15;
                                                        LinkedHashMap linkedHashMap11 = linkedHashMap;
                                                        rVarD2 = e.D(linkedHashMap11, b1Var4, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f21);
                                                        list2 = (List) rVarD2.f48506b;
                                                        if (((Boolean) rVarD2.f48507c).booleanValue()) {
                                                            SubcomposeLayout = SubcomposeLayout;
                                                            z32 = z2115;
                                                            yVar.f38361a = list2;
                                                            iR = e.R(i38, list2);
                                                            iQ = e.Q(i39, list2);
                                                            b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f21)));
                                                            f18 = f21;
                                                        } else {
                                                            if (f19 > f21) {
                                                                f22 = f19 - f21;
                                                                if (f22 >= 1.0f) {
                                                                    SubcomposeLayout = SubcomposeLayout;
                                                                    z32 = z2115;
                                                                    l1.b1 b1Var14 = b1Var4;
                                                                    int iCeil9 = (int) Math.ceil((float) (Math.log(f22 + 1) / hz.a.f33863a));
                                                                    int i4115 = 2;
                                                                    int i4116 = iCeil9 + 2;
                                                                    f23 = f19;
                                                                    int i4117 = 0;
                                                                    f24 = f21;
                                                                    List list15 = list2;
                                                                    float f217 = f24;
                                                                    while (true) {
                                                                        f25 = f23 - f24;
                                                                        if (f25 >= 1.0f && i4117 < i4116) {
                                                                            i4117++;
                                                                            float f29 = (f25 / i4115) + f24;
                                                                            if (f29 == f24 || f29 == f23) {
                                                                                break;
                                                                            }
                                                                            b1Var14 = b1Var14;
                                                                            List list6 = list15;
                                                                            float f30 = f24;
                                                                            i4116 = i4116;
                                                                            qy.r rVarD5 = e.D(linkedHashMap11, b1Var14, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f29);
                                                                            List list7 = (List) rVarD5.f48506b;
                                                                            if (((Boolean) rVarD5.f48507c).booleanValue()) {
                                                                                f24 = f30;
                                                                                f23 = f29;
                                                                                list15 = list6;
                                                                                i4115 = 2;
                                                                            } else {
                                                                                f24 = f29;
                                                                                f217 = f24;
                                                                                i4115 = 2;
                                                                                list15 = list7;
                                                                            }
                                                                        } else {
                                                                            break;
                                                                        }
                                                                    }
                                                                    yVar.f38361a = list15;
                                                                    f18 = f217;
                                                                } else {
                                                                    SubcomposeLayout = SubcomposeLayout;
                                                                    z32 = z2115;
                                                                    SubcomposeLayout = SubcomposeLayout;
                                                                    z32 = z2115;
                                                                    yVar.f38361a = list2;
                                                                    f18 = f21;
                                                                }
                                                            } else {
                                                                SubcomposeLayout = SubcomposeLayout;
                                                                z32 = z2115;
                                                                SubcomposeLayout = SubcomposeLayout;
                                                                z32 = z2115;
                                                                yVar.f38361a = list2;
                                                                f18 = f21;
                                                            }
                                                            iR = e.R(i38, (List) yVar.f38361a);
                                                            iQ = e.Q(i39, (List) yVar.f38361a);
                                                            j16 = 4294967296L;
                                                            b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f18)));
                                                        }
                                                    }
                                                } else {
                                                    yVar.f38361a = list;
                                                    int iR11 = e.R(i38, list);
                                                    iQ = e.Q(i39, list);
                                                    b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f19)));
                                                    f18 = f19;
                                                    iR = iR11;
                                                }
                                                j16 = 4294967296L;
                                            }
                                            cVar2.invoke(new v3.o(fr.j3.L(j16, f18)));
                                            iH = v3.a.h(aVar.f53483a);
                                            if (iQ > iH) {
                                                i37 = iH;
                                            } else {
                                                i37 = iQ;
                                            }
                                            iG = v3.a.g(aVar.f53483a);
                                            if (iR > iG) {
                                                iR = iG;
                                            }
                                            System.currentTimeMillis();
                                            ((List) yVar.f38361a).size();
                                            final j0.f fVar10 = fVar;
                                            final z1.i iVar115 = iVar8;
                                            final z1.i iVar116 = iVar3;
                                            return SubcomposeLayout.q0(i37, iR, ry.s.f50855a, new fz.c() { // from class: dt.n3
                                                /* JADX WARN: Code duplicated, block: B:29:0x008d  */
                                                @Override // fz.c
                                                public final Object invoke(Object obj3) {
                                                    Integer num;
                                                    int i4118;
                                                    z1.i iVar117;
                                                    int iA;
                                                    w2.f1 layout = (w2.f1) obj3;
                                                    kotlin.jvm.internal.m.f(layout, "$this$layout");
                                                    int i4119 = 0;
                                                    int i41110 = 0;
                                                    for (List<w2.g1> list16 : (Iterable) yVar.f38361a) {
                                                        if (!list16.isEmpty()) {
                                                            Iterator it = list16.iterator();
                                                            if (it.hasNext()) {
                                                                Integer numValueOf = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                                while (it.hasNext()) {
                                                                    Integer numValueOf2 = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                                    if (numValueOf.compareTo(numValueOf2) < 0) {
                                                                        numValueOf = numValueOf2;
                                                                    }
                                                                }
                                                                num = numValueOf;
                                                            } else {
                                                                num = null;
                                                            }
                                                            int iIntValue3 = num != null ? num.intValue() : 0;
                                                            int size = list16.size() - 1;
                                                            if (size < 0) {
                                                                size = 0;
                                                            }
                                                            int i41111 = i39;
                                                            int i41112 = size * i41111;
                                                            Iterator it2 = list16.iterator();
                                                            int i41113 = 0;
                                                            while (it2.hasNext()) {
                                                                i41113 += ((w2.g1) it2.next()).f54501a;
                                                            }
                                                            int i50 = i41113 + i41112;
                                                            j0.b bVar = j0.i.f35303a;
                                                            j0.f fVar11 = fVar10;
                                                            if (kotlin.jvm.internal.m.a(fVar11, bVar)) {
                                                                i4118 = 0;
                                                            } else {
                                                                boolean zA = kotlin.jvm.internal.m.a(fVar11, j0.i.f35307e);
                                                                int i51 = i37;
                                                                if (zA) {
                                                                    int i52 = i51 - i50;
                                                                    if (i52 < 0) {
                                                                        i52 = 0;
                                                                    }
                                                                    i4118 = i52 / 2;
                                                                } else if (!kotlin.jvm.internal.m.a(fVar11, j0.i.f35304b) || (i4118 = i51 - i50) < 0) {
                                                                    i4118 = 0;
                                                                }
                                                            }
                                                            for (w2.g1 g1Var : list16) {
                                                                if (i41110 != 0 || (iVar117 = iVar115) == null) {
                                                                    iVar117 = iVar116;
                                                                }
                                                                if (kotlin.jvm.internal.m.a(iVar117, z1.c.L)) {
                                                                    iA = 0;
                                                                } else {
                                                                    z1.i iVar118 = z1.c.M;
                                                                    iA = kotlin.jvm.internal.m.a(iVar117, iVar118) ? (iIntValue3 - g1Var.f54502b) / 2 : kotlin.jvm.internal.m.a(iVar117, z1.c.N) ? iIntValue3 - g1Var.f54502b : iVar118.a(g1Var.f54502b, iIntValue3);
                                                                }
                                                                w2.f1.k(layout, g1Var, i4118, iA + i4119);
                                                                i4118 += g1Var.f54501a + i41111;
                                                                i41110++;
                                                            }
                                                            i4119 += iIntValue3 + i38;
                                                        }
                                                    }
                                                    return qy.b0.f48488a;
                                                }
                                            });
                                        }
                                        v3.o.c(j17);
                                        b1Var5.setValue(null);
                                    }
                                } else {
                                    z2115 = z33;
                                    f15 = fC;
                                    f16 = f26;
                                }
                                f17 = f15;
                                z30 = false;
                                iQ = 0;
                                i36 = 0;
                                if (z30) {
                                    f19 = f16;
                                    rVarD = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z2115, aVar, i39, i38, dVar2, i40, f19);
                                    list = (List) rVarD.f48506b;
                                    if (((Boolean) rVarD.f48507c).booleanValue()) {
                                        yVar.f38361a = list;
                                        int iR12 = e.R(i38, list);
                                        iQ = e.Q(i39, list);
                                        b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f19)));
                                        f18 = f19;
                                        iR = iR12;
                                    } else {
                                        if (list.size() == i40 + 1) {
                                            linkedHashMap = linkedHashMap2;
                                            z31 = false;
                                        } else {
                                            linkedHashMap = linkedHashMap2;
                                            z31 = false;
                                        }
                                        if (z31) {
                                            f21 = f15;
                                            LinkedHashMap linkedHashMap12 = linkedHashMap;
                                            rVarD2 = e.D(linkedHashMap12, b1Var4, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f21);
                                            list2 = (List) rVarD2.f48506b;
                                            if (((Boolean) rVarD2.f48507c).booleanValue()) {
                                                SubcomposeLayout = SubcomposeLayout;
                                                z32 = z2115;
                                                yVar.f38361a = list2;
                                                iR = e.R(i38, list2);
                                                iQ = e.Q(i39, list2);
                                                b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f21)));
                                                f18 = f21;
                                            } else {
                                                if (f19 > f21) {
                                                    f22 = f19 - f21;
                                                    if (f22 >= 1.0f) {
                                                        SubcomposeLayout = SubcomposeLayout;
                                                        z32 = z2115;
                                                        l1.b1 b1Var15 = b1Var4;
                                                        int iCeil10 = (int) Math.ceil((float) (Math.log(f22 + 1) / hz.a.f33863a));
                                                        int i4118 = 2;
                                                        int i4119 = iCeil10 + 2;
                                                        f23 = f19;
                                                        int i41110 = 0;
                                                        f24 = f21;
                                                        List list16 = list2;
                                                        float f218 = f24;
                                                        while (true) {
                                                            f25 = f23 - f24;
                                                            if (f25 >= 1.0f) {
                                                                break;
                                                            }
                                                            break;
                                                            break;
                                                        }
                                                        yVar.f38361a = list16;
                                                        f18 = f218;
                                                    } else {
                                                        SubcomposeLayout = SubcomposeLayout;
                                                        z32 = z2115;
                                                        SubcomposeLayout = SubcomposeLayout;
                                                        z32 = z2115;
                                                        yVar.f38361a = list2;
                                                        f18 = f21;
                                                    }
                                                } else {
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    z32 = z2115;
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    z32 = z2115;
                                                    yVar.f38361a = list2;
                                                    f18 = f21;
                                                }
                                                iR = e.R(i38, (List) yVar.f38361a);
                                                iQ = e.Q(i39, (List) yVar.f38361a);
                                                j16 = 4294967296L;
                                                b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f18)));
                                            }
                                        } else {
                                            SubcomposeLayout = SubcomposeLayout;
                                            j16 = 4294967296L;
                                            f18 = f17;
                                            iR = i36;
                                        }
                                    }
                                    j16 = 4294967296L;
                                } else {
                                    j16 = 4294967296L;
                                    f18 = f17;
                                    iR = i36;
                                }
                                cVar2.invoke(new v3.o(fr.j3.L(j16, f18)));
                                iH = v3.a.h(aVar.f53483a);
                                if (iQ > iH) {
                                    i37 = iH;
                                } else {
                                    i37 = iQ;
                                }
                                iG = v3.a.g(aVar.f53483a);
                                if (iR > iG) {
                                    iR = iG;
                                }
                                System.currentTimeMillis();
                                ((List) yVar.f38361a).size();
                                final j0.f fVar11 = fVar;
                                final z1.i iVar117 = iVar8;
                                final z1.i iVar118 = iVar3;
                                return SubcomposeLayout.q0(i37, iR, ry.s.f50855a, new fz.c() { // from class: dt.n3
                                    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
                                    @Override // fz.c
                                    public final Object invoke(Object obj3) {
                                        Integer num;
                                        int i41111;
                                        z1.i iVar119;
                                        int iA;
                                        w2.f1 layout = (w2.f1) obj3;
                                        kotlin.jvm.internal.m.f(layout, "$this$layout");
                                        int i41112 = 0;
                                        int i41113 = 0;
                                        for (List<w2.g1> list17 : (Iterable) yVar.f38361a) {
                                            if (!list17.isEmpty()) {
                                                Iterator it = list17.iterator();
                                                if (it.hasNext()) {
                                                    Integer numValueOf = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                    while (it.hasNext()) {
                                                        Integer numValueOf2 = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                        if (numValueOf.compareTo(numValueOf2) < 0) {
                                                            numValueOf = numValueOf2;
                                                        }
                                                    }
                                                    num = numValueOf;
                                                } else {
                                                    num = null;
                                                }
                                                int iIntValue3 = num != null ? num.intValue() : 0;
                                                int size = list17.size() - 1;
                                                if (size < 0) {
                                                    size = 0;
                                                }
                                                int i41114 = i39;
                                                int i41115 = size * i41114;
                                                Iterator it2 = list17.iterator();
                                                int i41116 = 0;
                                                while (it2.hasNext()) {
                                                    i41116 += ((w2.g1) it2.next()).f54501a;
                                                }
                                                int i50 = i41116 + i41115;
                                                j0.b bVar = j0.i.f35303a;
                                                j0.f fVar12 = fVar11;
                                                if (kotlin.jvm.internal.m.a(fVar12, bVar)) {
                                                    i41111 = 0;
                                                } else {
                                                    boolean zA = kotlin.jvm.internal.m.a(fVar12, j0.i.f35307e);
                                                    int i51 = i37;
                                                    if (zA) {
                                                        int i52 = i51 - i50;
                                                        if (i52 < 0) {
                                                            i52 = 0;
                                                        }
                                                        i41111 = i52 / 2;
                                                    } else if (!kotlin.jvm.internal.m.a(fVar12, j0.i.f35304b) || (i41111 = i51 - i50) < 0) {
                                                        i41111 = 0;
                                                    }
                                                }
                                                for (w2.g1 g1Var : list17) {
                                                    if (i41113 != 0 || (iVar119 = iVar117) == null) {
                                                        iVar119 = iVar118;
                                                    }
                                                    if (kotlin.jvm.internal.m.a(iVar119, z1.c.L)) {
                                                        iA = 0;
                                                    } else {
                                                        z1.i iVar1110 = z1.c.M;
                                                        iA = kotlin.jvm.internal.m.a(iVar119, iVar1110) ? (iIntValue3 - g1Var.f54502b) / 2 : kotlin.jvm.internal.m.a(iVar119, z1.c.N) ? iIntValue3 - g1Var.f54502b : iVar1110.a(g1Var.f54502b, iIntValue3);
                                                    }
                                                    w2.f1.k(layout, g1Var, i41111, iA + i41112);
                                                    i41111 += g1Var.f54501a + i41114;
                                                    i41113++;
                                                }
                                                i41112 += iIntValue3 + i38;
                                            }
                                        }
                                        return qy.b0.f48488a;
                                    }
                                });
                            }
                        };
                        sVar.o0(eVar9);
                        objQ8 = eVar9;
                    }
                    w2.a0.b(rVar9, (fz.e) objQ8, sVar, i15 & 14, 0);
                    i26 = i29;
                    rVar3 = rVar9;
                    f13 = f14;
                    j12 = j13;
                    iVar6 = iVar8;
                    iVar5 = iVar3;
                } else {
                    sVar = sVar2;
                    sVar.W();
                    i26 = i11;
                    rVar3 = rVar2;
                    f13 = f12;
                    j12 = jA;
                    iVar5 = iVar3;
                    iVar6 = iVar4;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: dt.m3
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM = l1.t.M(i12 | 1);
                            int iM2 = l1.t.M(i13);
                            e.C(rVar3, fVar, iVar5, iVar6, z11, currentTextStyle, f13, f11, i26, j12, dVar, (l1.n) obj, iM, iM2, i14);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i15 |= 805306368;
            jA = j11;
            if ((i13 & 6) == 0) {
                if (sVar2.h(dVar)) {
                    i30 = 4;
                } else {
                    i30 = 2;
                }
                i25 = i13 | i30;
            } else {
                i25 = i13;
            }
            if ((i15 & 306783379) == 306783378) {
                z12 = true;
            } else {
                z12 = true;
            }
            if (sVar2.T(i15 & 1, z12)) {
                if (i34 != 0) {
                    rVar4 = z1.o.f58481a;
                } else {
                    rVar4 = rVar2;
                }
                if (i35 != 0) {
                    iVar3 = z1.c.N;
                }
                if (i16 != 0) {
                    iVar4 = null;
                }
                if (i18 != 0) {
                    f14 = 0;
                } else {
                    f14 = f12;
                }
                if (i21 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i11;
                }
                if (i23 != 0) {
                    jA = fr.j3.A(16);
                }
                j13 = jA;
                cVar = (v3.c) sVar2.j(z2.g1.f58547h);
                if ((3670016 & i15) == 1048576) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objQ = sVar2.Q();
                gVar = l1.m.f39353a;
                if (z13) {
                    objQ = Integer.valueOf(cVar.n0(f14));
                    sVar2.o0(objQ);
                } else {
                    objQ = Integer.valueOf(cVar.n0(f14));
                    sVar2.o0(objQ);
                }
                iIntValue = ((Number) objQ).intValue();
                if ((29360128 & i15) == 8388608) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objQ2 = sVar2.Q();
                if (z14) {
                    objQ2 = Integer.valueOf(cVar.n0(f11));
                    sVar2.o0(objQ2);
                } else {
                    objQ2 = Integer.valueOf(cVar.n0(f11));
                    sVar2.o0(objQ2);
                }
                iIntValue2 = ((Number) objQ2).intValue();
                objQ3 = sVar2.Q();
                if (objQ3 == gVar) {
                    objQ3 = l1.t.B(new v3.o(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b));
                    sVar2.o0(objQ3);
                }
                b1Var = (l1.b1) objQ3;
                objQ4 = sVar2.Q();
                if (objQ4 == gVar) {
                    objQ4 = l1.t.B(null);
                    sVar2.o0(objQ4);
                }
                b1Var2 = (l1.b1) objQ4;
                z1.r rVar10 = rVar4;
                iVar7 = iVar4;
                if (!v3.o.a(((v3.o) b1Var.getValue()).f53502a, ((j3.y0) currentTextStyle.getValue()).f35827a.f35755b)) {
                    v3.o.f(((v3.o) b1Var.getValue()).f53502a);
                    v3.o.f(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b);
                    b1Var.setValue(new v3.o(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b));
                    b1Var2.setValue(null);
                }
                objQ5 = sVar2.Q();
                if (objQ5 == gVar) {
                    objQ5 = l1.t.B(Boolean.FALSE);
                    sVar2.o0(objQ5);
                }
                b1Var3 = (l1.b1) objQ5;
                boolean zE12 = sVar2.e(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b);
                if ((1879048192 & i15) == 536870912) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zE12 | z15;
                objQ6 = sVar2.Q();
                if (z16) {
                    if (v3.o.c(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b) <= v3.o.c(j13)) {
                        j14 = ((j3.y0) currentTextStyle.getValue()).f35827a.f35755b;
                    } else {
                        j14 = j13;
                    }
                    v3.o oVar10 = new v3.o(j14);
                    sVar2.o0(oVar10);
                    objQ6 = oVar10;
                } else {
                    if (v3.o.c(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b) <= v3.o.c(j13)) {
                        j14 = ((j3.y0) currentTextStyle.getValue()).f35827a.f35755b;
                    } else {
                        j14 = j13;
                    }
                    v3.o oVar11 = new v3.o(j14);
                    sVar2.o0(oVar11);
                    objQ6 = oVar11;
                }
                j15 = ((v3.o) objQ6).f53502a;
                i28 = 458752 & i15;
                if (i28 == 131072) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zE = z17 | sVar2.e(j15);
                objQ7 = sVar2.Q();
                if (zE) {
                    objQ7 = new au.j(currentTextStyle, b1Var3, j15);
                    sVar2.o0(objQ7);
                } else {
                    objQ7 = new au.j(currentTextStyle, b1Var3, j15);
                    sVar2.o0(objQ7);
                }
                cVar2 = (fz.c) objQ7;
                boolean zE13 = sVar2.e(j15);
                if (i28 == 131072) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z2115 = zE13 | z18;
                if ((234881024 & i15) == 67108864) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z2116 = z2115 | z19;
                if ((i25 & 14) == 4) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                boolean z2117 = z2116 | z20;
                if ((57344 & i15) == 16384) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                boolean zD6 = z2117 | z21 | sVar2.d(iIntValue) | sVar2.d(iIntValue2) | sVar2.f(cVar2);
                if ((i15 & 112) == 32) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                boolean z2118 = zD6 | z22;
                if ((i15 & 7168) == 2048) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                z24 = z2118 | z23 | ((i15 & 896) == 256);
                objQ8 = sVar2.Q();
                if (z24) {
                    sVar = sVar2;
                    i29 = i27;
                    iVar8 = iVar7;
                    fz.e eVar10 = new fz.e() { // from class: dt.l3
                        /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
                        /* JADX WARN: Code duplicated, block: B:26:0x00e8  */
                        /* JADX WARN: Code duplicated, block: B:28:0x010c  */
                        /* JADX WARN: Code duplicated, block: B:37:0x0126  */
                        /* JADX WARN: Code duplicated, block: B:44:0x0165  */
                        /* JADX WARN: Code duplicated, block: B:46:0x0184  */
                        /* JADX WARN: Code duplicated, block: B:47:0x01a2  */
                        /* JADX WARN: Code duplicated, block: B:49:0x01a6  */
                        /* JADX WARN: Code duplicated, block: B:51:0x01ac  */
                        /* JADX WARN: Code duplicated, block: B:66:0x0223  */
                        /* JADX WARN: Code duplicated, block: B:68:0x0248  */
                        /* JADX WARN: Code duplicated, block: B:69:0x024a A[PHI: r3 r18
                          0x024a: PHI (r3v2 'SubcomposeLayout' w2.q1) = (r3v1 'SubcomposeLayout' w2.q1), (r3v4 'SubcomposeLayout' w2.q1) binds: [B:23:0x00cd, B:68:0x0248] A[DONT_GENERATE, DONT_INLINE]
                          0x024a: PHI (r18v2 float) = (r18v1 float), (r18v4 float) binds: [B:23:0x00cd, B:68:0x0248] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:72:0x0269  */
                        /* JADX WARN: Code duplicated, block: B:73:0x026c  */
                        /* JADX WARN: Code duplicated, block: B:76:0x0276  */
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            boolean z2119;
                            float f15;
                            float f16;
                            float f17;
                            boolean z30;
                            int iQ;
                            int i36;
                            long j16;
                            float f18;
                            int iR;
                            int iH;
                            final int i37;
                            int iG;
                            float f19;
                            qy.r rVarD;
                            List list;
                            LinkedHashMap linkedHashMap;
                            boolean z31;
                            float f21;
                            boolean z32;
                            qy.r rVarD2;
                            List list2;
                            float f22;
                            float f23;
                            float f24;
                            float f25;
                            w2.q1 SubcomposeLayout = (w2.q1) obj;
                            v3.a aVar = (v3.a) obj2;
                            kotlin.jvm.internal.m.f(SubcomposeLayout, "$this$SubcomposeLayout");
                            System.currentTimeMillis();
                            float fC = v3.o.c(j15);
                            l1.b1 b1Var4 = currentTextStyle;
                            float fC2 = v3.o.c(((j3.y0) b1Var4.getValue()).f35827a.f35755b);
                            float f26 = fC2 < fC ? fC : fC2;
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            final kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                            yVar.f38361a = ry.r.f50854a;
                            l1.b1 b1Var5 = b1Var2;
                            v3.o oVar12 = (v3.o) b1Var5.getValue();
                            final int i38 = iIntValue2;
                            final int i39 = iIntValue;
                            int i40 = i29;
                            boolean z33 = z11;
                            t1.d dVar2 = dVar;
                            if (oVar12 != null) {
                                f15 = fC;
                                f16 = f26;
                                long j17 = oVar12.f53502a;
                                if (v3.o.c(j17) < f15 || v3.o.c(j17) > f16) {
                                    z2119 = z33;
                                } else {
                                    v3.o.c(j17);
                                    z2119 = z33;
                                    qy.r rVarD3 = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z2119, aVar, i39, i38, dVar2, i40, v3.o.c(j17));
                                    List list3 = (List) rVarD3.f48506b;
                                    if (!((Boolean) rVarD3.f48507c).booleanValue() || v3.o.c(j17) == f15) {
                                        v3.o.c(j17);
                                        float fC3 = v3.o.c(j17);
                                        yVar.f38361a = list3;
                                        int iR2 = e.R(i38, list3);
                                        int iQ2 = e.Q(i39, list3);
                                        f17 = fC3;
                                        i36 = iR2;
                                        iQ = iQ2;
                                        z30 = true;
                                        if (z30) {
                                            j16 = 4294967296L;
                                            f18 = f17;
                                            iR = i36;
                                        } else {
                                            f19 = f16;
                                            rVarD = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z2119, aVar, i39, i38, dVar2, i40, f19);
                                            list = (List) rVarD.f48506b;
                                            if (((Boolean) rVarD.f48507c).booleanValue()) {
                                                if (list.size() == i40 + 1 || f19 <= f15) {
                                                    linkedHashMap = linkedHashMap2;
                                                    z31 = false;
                                                } else {
                                                    float f27 = f19 - 1.0f;
                                                    if (f27 < f15) {
                                                        f27 = f15;
                                                    }
                                                    if (f27 == f19) {
                                                        linkedHashMap = linkedHashMap2;
                                                    } else {
                                                        qy.r rVarD4 = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z2119, aVar, i39, i38, dVar2, i40, f27);
                                                        linkedHashMap = linkedHashMap2;
                                                        List list4 = (List) rVarD4.f48506b;
                                                        if (!((Boolean) rVarD4.f48507c).booleanValue()) {
                                                            yVar.f38361a = list4;
                                                            b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f27)));
                                                            f17 = f27;
                                                            z31 = true;
                                                        }
                                                    }
                                                    z31 = false;
                                                }
                                                if (z31) {
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    j16 = 4294967296L;
                                                    f18 = f17;
                                                    iR = i36;
                                                } else {
                                                    f21 = f15;
                                                    LinkedHashMap linkedHashMap12 = linkedHashMap;
                                                    rVarD2 = e.D(linkedHashMap12, b1Var4, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f21);
                                                    list2 = (List) rVarD2.f48506b;
                                                    if (((Boolean) rVarD2.f48507c).booleanValue()) {
                                                        SubcomposeLayout = SubcomposeLayout;
                                                        z32 = z2119;
                                                        yVar.f38361a = list2;
                                                        iR = e.R(i38, list2);
                                                        iQ = e.Q(i39, list2);
                                                        b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f21)));
                                                        f18 = f21;
                                                    } else {
                                                        if (f19 > f21) {
                                                            f22 = f19 - f21;
                                                            if (f22 >= 1.0f) {
                                                                SubcomposeLayout = SubcomposeLayout;
                                                                z32 = z2119;
                                                                l1.b1 b1Var15 = b1Var4;
                                                                int iCeil10 = (int) Math.ceil((float) (Math.log(f22 + 1) / hz.a.f33863a));
                                                                int i4118 = 2;
                                                                int i4119 = iCeil10 + 2;
                                                                f23 = f19;
                                                                int i41110 = 0;
                                                                f24 = f21;
                                                                List list16 = list2;
                                                                float f218 = f24;
                                                                while (true) {
                                                                    f25 = f23 - f24;
                                                                    if (f25 >= 1.0f && i41110 < i4119) {
                                                                        i41110++;
                                                                        float f29 = (f25 / i4118) + f24;
                                                                        if (f29 == f24 || f29 == f23) {
                                                                            break;
                                                                        }
                                                                        b1Var15 = b1Var15;
                                                                        List list6 = list16;
                                                                        float f30 = f24;
                                                                        i4119 = i4119;
                                                                        qy.r rVarD5 = e.D(linkedHashMap12, b1Var15, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f29);
                                                                        List list7 = (List) rVarD5.f48506b;
                                                                        if (((Boolean) rVarD5.f48507c).booleanValue()) {
                                                                            f24 = f30;
                                                                            f23 = f29;
                                                                            list16 = list6;
                                                                            i4118 = 2;
                                                                        } else {
                                                                            f24 = f29;
                                                                            f218 = f24;
                                                                            i4118 = 2;
                                                                            list16 = list7;
                                                                        }
                                                                    } else {
                                                                        break;
                                                                    }
                                                                }
                                                                yVar.f38361a = list16;
                                                                f18 = f218;
                                                            } else {
                                                                SubcomposeLayout = SubcomposeLayout;
                                                                z32 = z2119;
                                                                SubcomposeLayout = SubcomposeLayout;
                                                                z32 = z2119;
                                                                yVar.f38361a = list2;
                                                                f18 = f21;
                                                            }
                                                        } else {
                                                            SubcomposeLayout = SubcomposeLayout;
                                                            z32 = z2119;
                                                            SubcomposeLayout = SubcomposeLayout;
                                                            z32 = z2119;
                                                            yVar.f38361a = list2;
                                                            f18 = f21;
                                                        }
                                                        iR = e.R(i38, (List) yVar.f38361a);
                                                        iQ = e.Q(i39, (List) yVar.f38361a);
                                                        j16 = 4294967296L;
                                                        b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f18)));
                                                    }
                                                }
                                            } else {
                                                yVar.f38361a = list;
                                                int iR12 = e.R(i38, list);
                                                iQ = e.Q(i39, list);
                                                b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f19)));
                                                f18 = f19;
                                                iR = iR12;
                                            }
                                            j16 = 4294967296L;
                                        }
                                        cVar2.invoke(new v3.o(fr.j3.L(j16, f18)));
                                        iH = v3.a.h(aVar.f53483a);
                                        if (iQ > iH) {
                                            i37 = iH;
                                        } else {
                                            i37 = iQ;
                                        }
                                        iG = v3.a.g(aVar.f53483a);
                                        if (iR > iG) {
                                            iR = iG;
                                        }
                                        System.currentTimeMillis();
                                        ((List) yVar.f38361a).size();
                                        final j0.f fVar11 = fVar;
                                        final z1.i iVar117 = iVar8;
                                        final z1.i iVar118 = iVar3;
                                        return SubcomposeLayout.q0(i37, iR, ry.s.f50855a, new fz.c() { // from class: dt.n3
                                            /* JADX WARN: Code duplicated, block: B:29:0x008d  */
                                            @Override // fz.c
                                            public final Object invoke(Object obj3) {
                                                Integer num;
                                                int i41111;
                                                z1.i iVar119;
                                                int iA;
                                                w2.f1 layout = (w2.f1) obj3;
                                                kotlin.jvm.internal.m.f(layout, "$this$layout");
                                                int i41112 = 0;
                                                int i41113 = 0;
                                                for (List<w2.g1> list17 : (Iterable) yVar.f38361a) {
                                                    if (!list17.isEmpty()) {
                                                        Iterator it = list17.iterator();
                                                        if (it.hasNext()) {
                                                            Integer numValueOf = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                            while (it.hasNext()) {
                                                                Integer numValueOf2 = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                                if (numValueOf.compareTo(numValueOf2) < 0) {
                                                                    numValueOf = numValueOf2;
                                                                }
                                                            }
                                                            num = numValueOf;
                                                        } else {
                                                            num = null;
                                                        }
                                                        int iIntValue3 = num != null ? num.intValue() : 0;
                                                        int size = list17.size() - 1;
                                                        if (size < 0) {
                                                            size = 0;
                                                        }
                                                        int i41114 = i39;
                                                        int i41115 = size * i41114;
                                                        Iterator it2 = list17.iterator();
                                                        int i41116 = 0;
                                                        while (it2.hasNext()) {
                                                            i41116 += ((w2.g1) it2.next()).f54501a;
                                                        }
                                                        int i50 = i41116 + i41115;
                                                        j0.b bVar = j0.i.f35303a;
                                                        j0.f fVar12 = fVar11;
                                                        if (kotlin.jvm.internal.m.a(fVar12, bVar)) {
                                                            i41111 = 0;
                                                        } else {
                                                            boolean zA = kotlin.jvm.internal.m.a(fVar12, j0.i.f35307e);
                                                            int i51 = i37;
                                                            if (zA) {
                                                                int i52 = i51 - i50;
                                                                if (i52 < 0) {
                                                                    i52 = 0;
                                                                }
                                                                i41111 = i52 / 2;
                                                            } else if (!kotlin.jvm.internal.m.a(fVar12, j0.i.f35304b) || (i41111 = i51 - i50) < 0) {
                                                                i41111 = 0;
                                                            }
                                                        }
                                                        for (w2.g1 g1Var : list17) {
                                                            if (i41113 != 0 || (iVar119 = iVar117) == null) {
                                                                iVar119 = iVar118;
                                                            }
                                                            if (kotlin.jvm.internal.m.a(iVar119, z1.c.L)) {
                                                                iA = 0;
                                                            } else {
                                                                z1.i iVar1110 = z1.c.M;
                                                                iA = kotlin.jvm.internal.m.a(iVar119, iVar1110) ? (iIntValue3 - g1Var.f54502b) / 2 : kotlin.jvm.internal.m.a(iVar119, z1.c.N) ? iIntValue3 - g1Var.f54502b : iVar1110.a(g1Var.f54502b, iIntValue3);
                                                            }
                                                            w2.f1.k(layout, g1Var, i41111, iA + i41112);
                                                            i41111 += g1Var.f54501a + i41114;
                                                            i41113++;
                                                        }
                                                        i41112 += iIntValue3 + i38;
                                                    }
                                                }
                                                return qy.b0.f48488a;
                                            }
                                        });
                                    }
                                    v3.o.c(j17);
                                    b1Var5.setValue(null);
                                }
                            } else {
                                z2119 = z33;
                                f15 = fC;
                                f16 = f26;
                            }
                            f17 = f15;
                            z30 = false;
                            iQ = 0;
                            i36 = 0;
                            if (z30) {
                                f19 = f16;
                                rVarD = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z2119, aVar, i39, i38, dVar2, i40, f19);
                                list = (List) rVarD.f48506b;
                                if (((Boolean) rVarD.f48507c).booleanValue()) {
                                    yVar.f38361a = list;
                                    int iR13 = e.R(i38, list);
                                    iQ = e.Q(i39, list);
                                    b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f19)));
                                    f18 = f19;
                                    iR = iR13;
                                } else {
                                    if (list.size() == i40 + 1) {
                                        linkedHashMap = linkedHashMap2;
                                        z31 = false;
                                    } else {
                                        linkedHashMap = linkedHashMap2;
                                        z31 = false;
                                    }
                                    if (z31) {
                                        f21 = f15;
                                        LinkedHashMap linkedHashMap13 = linkedHashMap;
                                        rVarD2 = e.D(linkedHashMap13, b1Var4, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f21);
                                        list2 = (List) rVarD2.f48506b;
                                        if (((Boolean) rVarD2.f48507c).booleanValue()) {
                                            SubcomposeLayout = SubcomposeLayout;
                                            z32 = z2119;
                                            yVar.f38361a = list2;
                                            iR = e.R(i38, list2);
                                            iQ = e.Q(i39, list2);
                                            b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f21)));
                                            f18 = f21;
                                        } else {
                                            if (f19 > f21) {
                                                f22 = f19 - f21;
                                                if (f22 >= 1.0f) {
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    z32 = z2119;
                                                    l1.b1 b1Var16 = b1Var4;
                                                    int iCeil11 = (int) Math.ceil((float) (Math.log(f22 + 1) / hz.a.f33863a));
                                                    int i41111 = 2;
                                                    int i41112 = iCeil11 + 2;
                                                    f23 = f19;
                                                    int i41113 = 0;
                                                    f24 = f21;
                                                    List list17 = list2;
                                                    float f219 = f24;
                                                    while (true) {
                                                        f25 = f23 - f24;
                                                        if (f25 >= 1.0f) {
                                                            break;
                                                        }
                                                        break;
                                                        break;
                                                    }
                                                    yVar.f38361a = list17;
                                                    f18 = f219;
                                                } else {
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    z32 = z2119;
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    z32 = z2119;
                                                    yVar.f38361a = list2;
                                                    f18 = f21;
                                                }
                                            } else {
                                                SubcomposeLayout = SubcomposeLayout;
                                                z32 = z2119;
                                                SubcomposeLayout = SubcomposeLayout;
                                                z32 = z2119;
                                                yVar.f38361a = list2;
                                                f18 = f21;
                                            }
                                            iR = e.R(i38, (List) yVar.f38361a);
                                            iQ = e.Q(i39, (List) yVar.f38361a);
                                            j16 = 4294967296L;
                                            b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f18)));
                                        }
                                    } else {
                                        SubcomposeLayout = SubcomposeLayout;
                                        j16 = 4294967296L;
                                        f18 = f17;
                                        iR = i36;
                                    }
                                }
                                j16 = 4294967296L;
                            } else {
                                j16 = 4294967296L;
                                f18 = f17;
                                iR = i36;
                            }
                            cVar2.invoke(new v3.o(fr.j3.L(j16, f18)));
                            iH = v3.a.h(aVar.f53483a);
                            if (iQ > iH) {
                                i37 = iH;
                            } else {
                                i37 = iQ;
                            }
                            iG = v3.a.g(aVar.f53483a);
                            if (iR > iG) {
                                iR = iG;
                            }
                            System.currentTimeMillis();
                            ((List) yVar.f38361a).size();
                            final j0.f fVar12 = fVar;
                            final z1.i iVar119 = iVar8;
                            final z1.i iVar1110 = iVar3;
                            return SubcomposeLayout.q0(i37, iR, ry.s.f50855a, new fz.c() { // from class: dt.n3
                                /* JADX WARN: Code duplicated, block: B:29:0x008d  */
                                @Override // fz.c
                                public final Object invoke(Object obj3) {
                                    Integer num;
                                    int i41114;
                                    z1.i iVar1111;
                                    int iA;
                                    w2.f1 layout = (w2.f1) obj3;
                                    kotlin.jvm.internal.m.f(layout, "$this$layout");
                                    int i41115 = 0;
                                    int i41116 = 0;
                                    for (List<w2.g1> list18 : (Iterable) yVar.f38361a) {
                                        if (!list18.isEmpty()) {
                                            Iterator it = list18.iterator();
                                            if (it.hasNext()) {
                                                Integer numValueOf = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                while (it.hasNext()) {
                                                    Integer numValueOf2 = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                    if (numValueOf.compareTo(numValueOf2) < 0) {
                                                        numValueOf = numValueOf2;
                                                    }
                                                }
                                                num = numValueOf;
                                            } else {
                                                num = null;
                                            }
                                            int iIntValue3 = num != null ? num.intValue() : 0;
                                            int size = list18.size() - 1;
                                            if (size < 0) {
                                                size = 0;
                                            }
                                            int i41117 = i39;
                                            int i41118 = size * i41117;
                                            Iterator it2 = list18.iterator();
                                            int i41119 = 0;
                                            while (it2.hasNext()) {
                                                i41119 += ((w2.g1) it2.next()).f54501a;
                                            }
                                            int i50 = i41119 + i41118;
                                            j0.b bVar = j0.i.f35303a;
                                            j0.f fVar13 = fVar12;
                                            if (kotlin.jvm.internal.m.a(fVar13, bVar)) {
                                                i41114 = 0;
                                            } else {
                                                boolean zA = kotlin.jvm.internal.m.a(fVar13, j0.i.f35307e);
                                                int i51 = i37;
                                                if (zA) {
                                                    int i52 = i51 - i50;
                                                    if (i52 < 0) {
                                                        i52 = 0;
                                                    }
                                                    i41114 = i52 / 2;
                                                } else if (!kotlin.jvm.internal.m.a(fVar13, j0.i.f35304b) || (i41114 = i51 - i50) < 0) {
                                                    i41114 = 0;
                                                }
                                            }
                                            for (w2.g1 g1Var : list18) {
                                                if (i41116 != 0 || (iVar1111 = iVar119) == null) {
                                                    iVar1111 = iVar1110;
                                                }
                                                if (kotlin.jvm.internal.m.a(iVar1111, z1.c.L)) {
                                                    iA = 0;
                                                } else {
                                                    z1.i iVar1112 = z1.c.M;
                                                    iA = kotlin.jvm.internal.m.a(iVar1111, iVar1112) ? (iIntValue3 - g1Var.f54502b) / 2 : kotlin.jvm.internal.m.a(iVar1111, z1.c.N) ? iIntValue3 - g1Var.f54502b : iVar1112.a(g1Var.f54502b, iIntValue3);
                                                }
                                                w2.f1.k(layout, g1Var, i41114, iA + i41115);
                                                i41114 += g1Var.f54501a + i41117;
                                                i41116++;
                                            }
                                            i41115 += iIntValue3 + i38;
                                        }
                                    }
                                    return qy.b0.f48488a;
                                }
                            });
                        }
                    };
                    sVar.o0(eVar10);
                    objQ8 = eVar10;
                } else {
                    sVar = sVar2;
                    i29 = i27;
                    iVar8 = iVar7;
                    fz.e eVar11 = new fz.e() { // from class: dt.l3
                        /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
                        /* JADX WARN: Code duplicated, block: B:26:0x00e8  */
                        /* JADX WARN: Code duplicated, block: B:28:0x010c  */
                        /* JADX WARN: Code duplicated, block: B:37:0x0126  */
                        /* JADX WARN: Code duplicated, block: B:44:0x0165  */
                        /* JADX WARN: Code duplicated, block: B:46:0x0184  */
                        /* JADX WARN: Code duplicated, block: B:47:0x01a2  */
                        /* JADX WARN: Code duplicated, block: B:49:0x01a6  */
                        /* JADX WARN: Code duplicated, block: B:51:0x01ac  */
                        /* JADX WARN: Code duplicated, block: B:66:0x0223  */
                        /* JADX WARN: Code duplicated, block: B:68:0x0248  */
                        /* JADX WARN: Code duplicated, block: B:69:0x024a A[PHI: r3 r18
                          0x024a: PHI (r3v2 'SubcomposeLayout' w2.q1) = (r3v1 'SubcomposeLayout' w2.q1), (r3v4 'SubcomposeLayout' w2.q1) binds: [B:23:0x00cd, B:68:0x0248] A[DONT_GENERATE, DONT_INLINE]
                          0x024a: PHI (r18v2 float) = (r18v1 float), (r18v4 float) binds: [B:23:0x00cd, B:68:0x0248] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:72:0x0269  */
                        /* JADX WARN: Code duplicated, block: B:73:0x026c  */
                        /* JADX WARN: Code duplicated, block: B:76:0x0276  */
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            boolean z2119;
                            float f15;
                            float f16;
                            float f17;
                            boolean z30;
                            int iQ;
                            int i36;
                            long j16;
                            float f18;
                            int iR;
                            int iH;
                            final int i37;
                            int iG;
                            float f19;
                            qy.r rVarD;
                            List list;
                            LinkedHashMap linkedHashMap;
                            boolean z31;
                            float f21;
                            boolean z32;
                            qy.r rVarD2;
                            List list2;
                            float f22;
                            float f23;
                            float f24;
                            float f25;
                            w2.q1 SubcomposeLayout = (w2.q1) obj;
                            v3.a aVar = (v3.a) obj2;
                            kotlin.jvm.internal.m.f(SubcomposeLayout, "$this$SubcomposeLayout");
                            System.currentTimeMillis();
                            float fC = v3.o.c(j15);
                            l1.b1 b1Var4 = currentTextStyle;
                            float fC2 = v3.o.c(((j3.y0) b1Var4.getValue()).f35827a.f35755b);
                            float f26 = fC2 < fC ? fC : fC2;
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            final kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                            yVar.f38361a = ry.r.f50854a;
                            l1.b1 b1Var5 = b1Var2;
                            v3.o oVar12 = (v3.o) b1Var5.getValue();
                            final int i38 = iIntValue2;
                            final int i39 = iIntValue;
                            int i40 = i29;
                            boolean z33 = z11;
                            t1.d dVar2 = dVar;
                            if (oVar12 != null) {
                                f15 = fC;
                                f16 = f26;
                                long j17 = oVar12.f53502a;
                                if (v3.o.c(j17) < f15 || v3.o.c(j17) > f16) {
                                    z2119 = z33;
                                } else {
                                    v3.o.c(j17);
                                    z2119 = z33;
                                    qy.r rVarD3 = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z2119, aVar, i39, i38, dVar2, i40, v3.o.c(j17));
                                    List list3 = (List) rVarD3.f48506b;
                                    if (!((Boolean) rVarD3.f48507c).booleanValue() || v3.o.c(j17) == f15) {
                                        v3.o.c(j17);
                                        float fC3 = v3.o.c(j17);
                                        yVar.f38361a = list3;
                                        int iR2 = e.R(i38, list3);
                                        int iQ2 = e.Q(i39, list3);
                                        f17 = fC3;
                                        i36 = iR2;
                                        iQ = iQ2;
                                        z30 = true;
                                        if (z30) {
                                            j16 = 4294967296L;
                                            f18 = f17;
                                            iR = i36;
                                        } else {
                                            f19 = f16;
                                            rVarD = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z2119, aVar, i39, i38, dVar2, i40, f19);
                                            list = (List) rVarD.f48506b;
                                            if (((Boolean) rVarD.f48507c).booleanValue()) {
                                                if (list.size() == i40 + 1 || f19 <= f15) {
                                                    linkedHashMap = linkedHashMap2;
                                                    z31 = false;
                                                } else {
                                                    float f27 = f19 - 1.0f;
                                                    if (f27 < f15) {
                                                        f27 = f15;
                                                    }
                                                    if (f27 == f19) {
                                                        linkedHashMap = linkedHashMap2;
                                                    } else {
                                                        qy.r rVarD4 = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z2119, aVar, i39, i38, dVar2, i40, f27);
                                                        linkedHashMap = linkedHashMap2;
                                                        List list4 = (List) rVarD4.f48506b;
                                                        if (!((Boolean) rVarD4.f48507c).booleanValue()) {
                                                            yVar.f38361a = list4;
                                                            b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f27)));
                                                            f17 = f27;
                                                            z31 = true;
                                                        }
                                                    }
                                                    z31 = false;
                                                }
                                                if (z31) {
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    j16 = 4294967296L;
                                                    f18 = f17;
                                                    iR = i36;
                                                } else {
                                                    f21 = f15;
                                                    LinkedHashMap linkedHashMap13 = linkedHashMap;
                                                    rVarD2 = e.D(linkedHashMap13, b1Var4, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f21);
                                                    list2 = (List) rVarD2.f48506b;
                                                    if (((Boolean) rVarD2.f48507c).booleanValue()) {
                                                        SubcomposeLayout = SubcomposeLayout;
                                                        z32 = z2119;
                                                        yVar.f38361a = list2;
                                                        iR = e.R(i38, list2);
                                                        iQ = e.Q(i39, list2);
                                                        b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f21)));
                                                        f18 = f21;
                                                    } else {
                                                        if (f19 > f21) {
                                                            f22 = f19 - f21;
                                                            if (f22 >= 1.0f) {
                                                                SubcomposeLayout = SubcomposeLayout;
                                                                z32 = z2119;
                                                                l1.b1 b1Var16 = b1Var4;
                                                                int iCeil11 = (int) Math.ceil((float) (Math.log(f22 + 1) / hz.a.f33863a));
                                                                int i41111 = 2;
                                                                int i41112 = iCeil11 + 2;
                                                                f23 = f19;
                                                                int i41113 = 0;
                                                                f24 = f21;
                                                                List list17 = list2;
                                                                float f219 = f24;
                                                                while (true) {
                                                                    f25 = f23 - f24;
                                                                    if (f25 >= 1.0f && i41113 < i41112) {
                                                                        i41113++;
                                                                        float f29 = (f25 / i41111) + f24;
                                                                        if (f29 == f24 || f29 == f23) {
                                                                            break;
                                                                        }
                                                                        b1Var16 = b1Var16;
                                                                        List list6 = list17;
                                                                        float f30 = f24;
                                                                        i41112 = i41112;
                                                                        qy.r rVarD5 = e.D(linkedHashMap13, b1Var16, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f29);
                                                                        List list7 = (List) rVarD5.f48506b;
                                                                        if (((Boolean) rVarD5.f48507c).booleanValue()) {
                                                                            f24 = f30;
                                                                            f23 = f29;
                                                                            list17 = list6;
                                                                            i41111 = 2;
                                                                        } else {
                                                                            f24 = f29;
                                                                            f219 = f24;
                                                                            i41111 = 2;
                                                                            list17 = list7;
                                                                        }
                                                                    } else {
                                                                        break;
                                                                    }
                                                                }
                                                                yVar.f38361a = list17;
                                                                f18 = f219;
                                                            } else {
                                                                SubcomposeLayout = SubcomposeLayout;
                                                                z32 = z2119;
                                                                SubcomposeLayout = SubcomposeLayout;
                                                                z32 = z2119;
                                                                yVar.f38361a = list2;
                                                                f18 = f21;
                                                            }
                                                        } else {
                                                            SubcomposeLayout = SubcomposeLayout;
                                                            z32 = z2119;
                                                            SubcomposeLayout = SubcomposeLayout;
                                                            z32 = z2119;
                                                            yVar.f38361a = list2;
                                                            f18 = f21;
                                                        }
                                                        iR = e.R(i38, (List) yVar.f38361a);
                                                        iQ = e.Q(i39, (List) yVar.f38361a);
                                                        j16 = 4294967296L;
                                                        b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f18)));
                                                    }
                                                }
                                            } else {
                                                yVar.f38361a = list;
                                                int iR13 = e.R(i38, list);
                                                iQ = e.Q(i39, list);
                                                b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f19)));
                                                f18 = f19;
                                                iR = iR13;
                                            }
                                            j16 = 4294967296L;
                                        }
                                        cVar2.invoke(new v3.o(fr.j3.L(j16, f18)));
                                        iH = v3.a.h(aVar.f53483a);
                                        if (iQ > iH) {
                                            i37 = iH;
                                        } else {
                                            i37 = iQ;
                                        }
                                        iG = v3.a.g(aVar.f53483a);
                                        if (iR > iG) {
                                            iR = iG;
                                        }
                                        System.currentTimeMillis();
                                        ((List) yVar.f38361a).size();
                                        final j0.f fVar12 = fVar;
                                        final z1.i iVar119 = iVar8;
                                        final z1.i iVar1110 = iVar3;
                                        return SubcomposeLayout.q0(i37, iR, ry.s.f50855a, new fz.c() { // from class: dt.n3
                                            /* JADX WARN: Code duplicated, block: B:29:0x008d  */
                                            @Override // fz.c
                                            public final Object invoke(Object obj3) {
                                                Integer num;
                                                int i41114;
                                                z1.i iVar1111;
                                                int iA;
                                                w2.f1 layout = (w2.f1) obj3;
                                                kotlin.jvm.internal.m.f(layout, "$this$layout");
                                                int i41115 = 0;
                                                int i41116 = 0;
                                                for (List<w2.g1> list18 : (Iterable) yVar.f38361a) {
                                                    if (!list18.isEmpty()) {
                                                        Iterator it = list18.iterator();
                                                        if (it.hasNext()) {
                                                            Integer numValueOf = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                            while (it.hasNext()) {
                                                                Integer numValueOf2 = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                                if (numValueOf.compareTo(numValueOf2) < 0) {
                                                                    numValueOf = numValueOf2;
                                                                }
                                                            }
                                                            num = numValueOf;
                                                        } else {
                                                            num = null;
                                                        }
                                                        int iIntValue3 = num != null ? num.intValue() : 0;
                                                        int size = list18.size() - 1;
                                                        if (size < 0) {
                                                            size = 0;
                                                        }
                                                        int i41117 = i39;
                                                        int i41118 = size * i41117;
                                                        Iterator it2 = list18.iterator();
                                                        int i41119 = 0;
                                                        while (it2.hasNext()) {
                                                            i41119 += ((w2.g1) it2.next()).f54501a;
                                                        }
                                                        int i50 = i41119 + i41118;
                                                        j0.b bVar = j0.i.f35303a;
                                                        j0.f fVar13 = fVar12;
                                                        if (kotlin.jvm.internal.m.a(fVar13, bVar)) {
                                                            i41114 = 0;
                                                        } else {
                                                            boolean zA = kotlin.jvm.internal.m.a(fVar13, j0.i.f35307e);
                                                            int i51 = i37;
                                                            if (zA) {
                                                                int i52 = i51 - i50;
                                                                if (i52 < 0) {
                                                                    i52 = 0;
                                                                }
                                                                i41114 = i52 / 2;
                                                            } else if (!kotlin.jvm.internal.m.a(fVar13, j0.i.f35304b) || (i41114 = i51 - i50) < 0) {
                                                                i41114 = 0;
                                                            }
                                                        }
                                                        for (w2.g1 g1Var : list18) {
                                                            if (i41116 != 0 || (iVar1111 = iVar119) == null) {
                                                                iVar1111 = iVar1110;
                                                            }
                                                            if (kotlin.jvm.internal.m.a(iVar1111, z1.c.L)) {
                                                                iA = 0;
                                                            } else {
                                                                z1.i iVar1112 = z1.c.M;
                                                                iA = kotlin.jvm.internal.m.a(iVar1111, iVar1112) ? (iIntValue3 - g1Var.f54502b) / 2 : kotlin.jvm.internal.m.a(iVar1111, z1.c.N) ? iIntValue3 - g1Var.f54502b : iVar1112.a(g1Var.f54502b, iIntValue3);
                                                            }
                                                            w2.f1.k(layout, g1Var, i41114, iA + i41115);
                                                            i41114 += g1Var.f54501a + i41117;
                                                            i41116++;
                                                        }
                                                        i41115 += iIntValue3 + i38;
                                                    }
                                                }
                                                return qy.b0.f48488a;
                                            }
                                        });
                                    }
                                    v3.o.c(j17);
                                    b1Var5.setValue(null);
                                }
                            } else {
                                z2119 = z33;
                                f15 = fC;
                                f16 = f26;
                            }
                            f17 = f15;
                            z30 = false;
                            iQ = 0;
                            i36 = 0;
                            if (z30) {
                                f19 = f16;
                                rVarD = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z2119, aVar, i39, i38, dVar2, i40, f19);
                                list = (List) rVarD.f48506b;
                                if (((Boolean) rVarD.f48507c).booleanValue()) {
                                    yVar.f38361a = list;
                                    int iR14 = e.R(i38, list);
                                    iQ = e.Q(i39, list);
                                    b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f19)));
                                    f18 = f19;
                                    iR = iR14;
                                } else {
                                    if (list.size() == i40 + 1) {
                                        linkedHashMap = linkedHashMap2;
                                        z31 = false;
                                    } else {
                                        linkedHashMap = linkedHashMap2;
                                        z31 = false;
                                    }
                                    if (z31) {
                                        f21 = f15;
                                        LinkedHashMap linkedHashMap14 = linkedHashMap;
                                        rVarD2 = e.D(linkedHashMap14, b1Var4, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f21);
                                        list2 = (List) rVarD2.f48506b;
                                        if (((Boolean) rVarD2.f48507c).booleanValue()) {
                                            SubcomposeLayout = SubcomposeLayout;
                                            z32 = z2119;
                                            yVar.f38361a = list2;
                                            iR = e.R(i38, list2);
                                            iQ = e.Q(i39, list2);
                                            b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f21)));
                                            f18 = f21;
                                        } else {
                                            if (f19 > f21) {
                                                f22 = f19 - f21;
                                                if (f22 >= 1.0f) {
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    z32 = z2119;
                                                    l1.b1 b1Var17 = b1Var4;
                                                    int iCeil12 = (int) Math.ceil((float) (Math.log(f22 + 1) / hz.a.f33863a));
                                                    int i41114 = 2;
                                                    int i41115 = iCeil12 + 2;
                                                    f23 = f19;
                                                    int i41116 = 0;
                                                    f24 = f21;
                                                    List list18 = list2;
                                                    float f2110 = f24;
                                                    while (true) {
                                                        f25 = f23 - f24;
                                                        if (f25 >= 1.0f) {
                                                            break;
                                                        }
                                                        break;
                                                        break;
                                                    }
                                                    yVar.f38361a = list18;
                                                    f18 = f2110;
                                                } else {
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    z32 = z2119;
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    z32 = z2119;
                                                    yVar.f38361a = list2;
                                                    f18 = f21;
                                                }
                                            } else {
                                                SubcomposeLayout = SubcomposeLayout;
                                                z32 = z2119;
                                                SubcomposeLayout = SubcomposeLayout;
                                                z32 = z2119;
                                                yVar.f38361a = list2;
                                                f18 = f21;
                                            }
                                            iR = e.R(i38, (List) yVar.f38361a);
                                            iQ = e.Q(i39, (List) yVar.f38361a);
                                            j16 = 4294967296L;
                                            b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f18)));
                                        }
                                    } else {
                                        SubcomposeLayout = SubcomposeLayout;
                                        j16 = 4294967296L;
                                        f18 = f17;
                                        iR = i36;
                                    }
                                }
                                j16 = 4294967296L;
                            } else {
                                j16 = 4294967296L;
                                f18 = f17;
                                iR = i36;
                            }
                            cVar2.invoke(new v3.o(fr.j3.L(j16, f18)));
                            iH = v3.a.h(aVar.f53483a);
                            if (iQ > iH) {
                                i37 = iH;
                            } else {
                                i37 = iQ;
                            }
                            iG = v3.a.g(aVar.f53483a);
                            if (iR > iG) {
                                iR = iG;
                            }
                            System.currentTimeMillis();
                            ((List) yVar.f38361a).size();
                            final j0.f fVar13 = fVar;
                            final z1.i iVar1111 = iVar8;
                            final z1.i iVar1112 = iVar3;
                            return SubcomposeLayout.q0(i37, iR, ry.s.f50855a, new fz.c() { // from class: dt.n3
                                /* JADX WARN: Code duplicated, block: B:29:0x008d  */
                                @Override // fz.c
                                public final Object invoke(Object obj3) {
                                    Integer num;
                                    int i41117;
                                    z1.i iVar1113;
                                    int iA;
                                    w2.f1 layout = (w2.f1) obj3;
                                    kotlin.jvm.internal.m.f(layout, "$this$layout");
                                    int i41118 = 0;
                                    int i41119 = 0;
                                    for (List<w2.g1> list19 : (Iterable) yVar.f38361a) {
                                        if (!list19.isEmpty()) {
                                            Iterator it = list19.iterator();
                                            if (it.hasNext()) {
                                                Integer numValueOf = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                while (it.hasNext()) {
                                                    Integer numValueOf2 = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                    if (numValueOf.compareTo(numValueOf2) < 0) {
                                                        numValueOf = numValueOf2;
                                                    }
                                                }
                                                num = numValueOf;
                                            } else {
                                                num = null;
                                            }
                                            int iIntValue3 = num != null ? num.intValue() : 0;
                                            int size = list19.size() - 1;
                                            if (size < 0) {
                                                size = 0;
                                            }
                                            int i411110 = i39;
                                            int i411111 = size * i411110;
                                            Iterator it2 = list19.iterator();
                                            int i411112 = 0;
                                            while (it2.hasNext()) {
                                                i411112 += ((w2.g1) it2.next()).f54501a;
                                            }
                                            int i50 = i411112 + i411111;
                                            j0.b bVar = j0.i.f35303a;
                                            j0.f fVar14 = fVar13;
                                            if (kotlin.jvm.internal.m.a(fVar14, bVar)) {
                                                i41117 = 0;
                                            } else {
                                                boolean zA = kotlin.jvm.internal.m.a(fVar14, j0.i.f35307e);
                                                int i51 = i37;
                                                if (zA) {
                                                    int i52 = i51 - i50;
                                                    if (i52 < 0) {
                                                        i52 = 0;
                                                    }
                                                    i41117 = i52 / 2;
                                                } else if (!kotlin.jvm.internal.m.a(fVar14, j0.i.f35304b) || (i41117 = i51 - i50) < 0) {
                                                    i41117 = 0;
                                                }
                                            }
                                            for (w2.g1 g1Var : list19) {
                                                if (i41119 != 0 || (iVar1113 = iVar1111) == null) {
                                                    iVar1113 = iVar1112;
                                                }
                                                if (kotlin.jvm.internal.m.a(iVar1113, z1.c.L)) {
                                                    iA = 0;
                                                } else {
                                                    z1.i iVar1114 = z1.c.M;
                                                    iA = kotlin.jvm.internal.m.a(iVar1113, iVar1114) ? (iIntValue3 - g1Var.f54502b) / 2 : kotlin.jvm.internal.m.a(iVar1113, z1.c.N) ? iIntValue3 - g1Var.f54502b : iVar1114.a(g1Var.f54502b, iIntValue3);
                                                }
                                                w2.f1.k(layout, g1Var, i41117, iA + i41118);
                                                i41117 += g1Var.f54501a + i411110;
                                                i41119++;
                                            }
                                            i41118 += iIntValue3 + i38;
                                        }
                                    }
                                    return qy.b0.f48488a;
                                }
                            });
                        }
                    };
                    sVar.o0(eVar11);
                    objQ8 = eVar11;
                }
                w2.a0.b(rVar10, (fz.e) objQ8, sVar, i15 & 14, 0);
                i26 = i29;
                rVar3 = rVar10;
                f13 = f14;
                j12 = j13;
                iVar6 = iVar8;
                iVar5 = iVar3;
            } else {
                sVar = sVar2;
                sVar.W();
                i26 = i11;
                rVar3 = rVar2;
                f13 = f12;
                j12 = jA;
                iVar5 = iVar3;
                iVar6 = iVar4;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: dt.m3
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM = l1.t.M(i12 | 1);
                        int iM2 = l1.t.M(i13);
                        e.C(rVar3, fVar, iVar5, iVar6, z11, currentTextStyle, f13, f11, i26, j12, dVar, (l1.n) obj, iM, iM2, i14);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i15 |= 3072;
        iVar4 = iVar2;
        if ((i12 & 24576) != 0) {
            if (sVar2.g(z11)) {
                i33 = 16384;
            } else {
                i33 = OSSConstants.DEFAULT_BUFFER_SIZE;
            }
            i15 |= i33;
        }
        if ((i12 & 196608) == 0) {
            if (sVar2.f(currentTextStyle)) {
                i32 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
            } else {
                i32 = 65536;
            }
            i15 |= i32;
        }
        i18 = i14 & 64;
        if (i18 != 0) {
            i15 |= 1572864;
            f12 = f5;
        } else {
            f12 = f5;
            if ((i12 & 1572864) == 0) {
                if (sVar2.c(f12)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i15 |= i19;
            }
        }
        if ((i12 & 12582912) == 0) {
            if (sVar2.c(f11)) {
                i31 = 8388608;
            } else {
                i31 = 4194304;
            }
            i15 |= i31;
        }
        i21 = i14 & 256;
        if (i21 != 0) {
            i15 |= 100663296;
        } else if ((i12 & 100663296) == 0) {
            if (sVar2.d(i11)) {
                i22 = 67108864;
            } else {
                i22 = 33554432;
            }
            i15 |= i22;
        }
        i23 = i14 & 512;
        if (i23 != 0) {
            if ((i12 & 805306368) == 0) {
                jA = j11;
                if (sVar2.e(jA)) {
                    i24 = 536870912;
                } else {
                    i24 = 268435456;
                }
                i15 |= i24;
            }
            if ((i13 & 6) == 0) {
                if (sVar2.h(dVar)) {
                    i30 = 4;
                } else {
                    i30 = 2;
                }
                i25 = i13 | i30;
            } else {
                i25 = i13;
            }
            if ((i15 & 306783379) == 306783378) {
                z12 = true;
            } else {
                z12 = true;
            }
            if (sVar2.T(i15 & 1, z12)) {
                if (i34 != 0) {
                    rVar4 = z1.o.f58481a;
                } else {
                    rVar4 = rVar2;
                }
                if (i35 != 0) {
                    iVar3 = z1.c.N;
                }
                if (i16 != 0) {
                    iVar4 = null;
                }
                if (i18 != 0) {
                    f14 = 0;
                } else {
                    f14 = f12;
                }
                if (i21 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i11;
                }
                if (i23 != 0) {
                    jA = fr.j3.A(16);
                }
                j13 = jA;
                cVar = (v3.c) sVar2.j(z2.g1.f58547h);
                if ((3670016 & i15) == 1048576) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objQ = sVar2.Q();
                gVar = l1.m.f39353a;
                if (z13) {
                    objQ = Integer.valueOf(cVar.n0(f14));
                    sVar2.o0(objQ);
                } else {
                    objQ = Integer.valueOf(cVar.n0(f14));
                    sVar2.o0(objQ);
                }
                iIntValue = ((Number) objQ).intValue();
                if ((29360128 & i15) == 8388608) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objQ2 = sVar2.Q();
                if (z14) {
                    objQ2 = Integer.valueOf(cVar.n0(f11));
                    sVar2.o0(objQ2);
                } else {
                    objQ2 = Integer.valueOf(cVar.n0(f11));
                    sVar2.o0(objQ2);
                }
                iIntValue2 = ((Number) objQ2).intValue();
                objQ3 = sVar2.Q();
                if (objQ3 == gVar) {
                    objQ3 = l1.t.B(new v3.o(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b));
                    sVar2.o0(objQ3);
                }
                b1Var = (l1.b1) objQ3;
                objQ4 = sVar2.Q();
                if (objQ4 == gVar) {
                    objQ4 = l1.t.B(null);
                    sVar2.o0(objQ4);
                }
                b1Var2 = (l1.b1) objQ4;
                z1.r rVar11 = rVar4;
                iVar7 = iVar4;
                if (!v3.o.a(((v3.o) b1Var.getValue()).f53502a, ((j3.y0) currentTextStyle.getValue()).f35827a.f35755b)) {
                    v3.o.f(((v3.o) b1Var.getValue()).f53502a);
                    v3.o.f(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b);
                    b1Var.setValue(new v3.o(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b));
                    b1Var2.setValue(null);
                }
                objQ5 = sVar2.Q();
                if (objQ5 == gVar) {
                    objQ5 = l1.t.B(Boolean.FALSE);
                    sVar2.o0(objQ5);
                }
                b1Var3 = (l1.b1) objQ5;
                boolean zE14 = sVar2.e(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b);
                if ((1879048192 & i15) == 536870912) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zE14 | z15;
                objQ6 = sVar2.Q();
                if (z16) {
                    if (v3.o.c(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b) <= v3.o.c(j13)) {
                        j14 = ((j3.y0) currentTextStyle.getValue()).f35827a.f35755b;
                    } else {
                        j14 = j13;
                    }
                    v3.o oVar12 = new v3.o(j14);
                    sVar2.o0(oVar12);
                    objQ6 = oVar12;
                } else {
                    if (v3.o.c(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b) <= v3.o.c(j13)) {
                        j14 = ((j3.y0) currentTextStyle.getValue()).f35827a.f35755b;
                    } else {
                        j14 = j13;
                    }
                    v3.o oVar13 = new v3.o(j14);
                    sVar2.o0(oVar13);
                    objQ6 = oVar13;
                }
                j15 = ((v3.o) objQ6).f53502a;
                i28 = 458752 & i15;
                if (i28 == 131072) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zE = z17 | sVar2.e(j15);
                objQ7 = sVar2.Q();
                if (zE) {
                    objQ7 = new au.j(currentTextStyle, b1Var3, j15);
                    sVar2.o0(objQ7);
                } else {
                    objQ7 = new au.j(currentTextStyle, b1Var3, j15);
                    sVar2.o0(objQ7);
                }
                cVar2 = (fz.c) objQ7;
                boolean zE15 = sVar2.e(j15);
                if (i28 == 131072) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z2119 = zE15 | z18;
                if ((234881024 & i15) == 67108864) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z21110 = z2119 | z19;
                if ((i25 & 14) == 4) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                boolean z21111 = z21110 | z20;
                if ((57344 & i15) == 16384) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                boolean zD7 = z21111 | z21 | sVar2.d(iIntValue) | sVar2.d(iIntValue2) | sVar2.f(cVar2);
                if ((i15 & 112) == 32) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                boolean z21112 = zD7 | z22;
                if ((i15 & 7168) == 2048) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                z24 = z21112 | z23 | ((i15 & 896) == 256);
                objQ8 = sVar2.Q();
                if (z24) {
                    sVar = sVar2;
                    i29 = i27;
                    iVar8 = iVar7;
                    fz.e eVar12 = new fz.e() { // from class: dt.l3
                        /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
                        /* JADX WARN: Code duplicated, block: B:26:0x00e8  */
                        /* JADX WARN: Code duplicated, block: B:28:0x010c  */
                        /* JADX WARN: Code duplicated, block: B:37:0x0126  */
                        /* JADX WARN: Code duplicated, block: B:44:0x0165  */
                        /* JADX WARN: Code duplicated, block: B:46:0x0184  */
                        /* JADX WARN: Code duplicated, block: B:47:0x01a2  */
                        /* JADX WARN: Code duplicated, block: B:49:0x01a6  */
                        /* JADX WARN: Code duplicated, block: B:51:0x01ac  */
                        /* JADX WARN: Code duplicated, block: B:66:0x0223  */
                        /* JADX WARN: Code duplicated, block: B:68:0x0248  */
                        /* JADX WARN: Code duplicated, block: B:69:0x024a A[PHI: r3 r18
                          0x024a: PHI (r3v2 'SubcomposeLayout' w2.q1) = (r3v1 'SubcomposeLayout' w2.q1), (r3v4 'SubcomposeLayout' w2.q1) binds: [B:23:0x00cd, B:68:0x0248] A[DONT_GENERATE, DONT_INLINE]
                          0x024a: PHI (r18v2 float) = (r18v1 float), (r18v4 float) binds: [B:23:0x00cd, B:68:0x0248] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:72:0x0269  */
                        /* JADX WARN: Code duplicated, block: B:73:0x026c  */
                        /* JADX WARN: Code duplicated, block: B:76:0x0276  */
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            boolean z21113;
                            float f15;
                            float f16;
                            float f17;
                            boolean z30;
                            int iQ;
                            int i36;
                            long j16;
                            float f18;
                            int iR;
                            int iH;
                            final int i37;
                            int iG;
                            float f19;
                            qy.r rVarD;
                            List list;
                            LinkedHashMap linkedHashMap;
                            boolean z31;
                            float f21;
                            boolean z32;
                            qy.r rVarD2;
                            List list2;
                            float f22;
                            float f23;
                            float f24;
                            float f25;
                            w2.q1 SubcomposeLayout = (w2.q1) obj;
                            v3.a aVar = (v3.a) obj2;
                            kotlin.jvm.internal.m.f(SubcomposeLayout, "$this$SubcomposeLayout");
                            System.currentTimeMillis();
                            float fC = v3.o.c(j15);
                            l1.b1 b1Var4 = currentTextStyle;
                            float fC2 = v3.o.c(((j3.y0) b1Var4.getValue()).f35827a.f35755b);
                            float f26 = fC2 < fC ? fC : fC2;
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            final kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                            yVar.f38361a = ry.r.f50854a;
                            l1.b1 b1Var5 = b1Var2;
                            v3.o oVar14 = (v3.o) b1Var5.getValue();
                            final int i38 = iIntValue2;
                            final int i39 = iIntValue;
                            int i40 = i29;
                            boolean z33 = z11;
                            t1.d dVar2 = dVar;
                            if (oVar14 != null) {
                                f15 = fC;
                                f16 = f26;
                                long j17 = oVar14.f53502a;
                                if (v3.o.c(j17) < f15 || v3.o.c(j17) > f16) {
                                    z21113 = z33;
                                } else {
                                    v3.o.c(j17);
                                    z21113 = z33;
                                    qy.r rVarD3 = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z21113, aVar, i39, i38, dVar2, i40, v3.o.c(j17));
                                    List list3 = (List) rVarD3.f48506b;
                                    if (!((Boolean) rVarD3.f48507c).booleanValue() || v3.o.c(j17) == f15) {
                                        v3.o.c(j17);
                                        float fC3 = v3.o.c(j17);
                                        yVar.f38361a = list3;
                                        int iR2 = e.R(i38, list3);
                                        int iQ2 = e.Q(i39, list3);
                                        f17 = fC3;
                                        i36 = iR2;
                                        iQ = iQ2;
                                        z30 = true;
                                        if (z30) {
                                            j16 = 4294967296L;
                                            f18 = f17;
                                            iR = i36;
                                        } else {
                                            f19 = f16;
                                            rVarD = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z21113, aVar, i39, i38, dVar2, i40, f19);
                                            list = (List) rVarD.f48506b;
                                            if (((Boolean) rVarD.f48507c).booleanValue()) {
                                                if (list.size() == i40 + 1 || f19 <= f15) {
                                                    linkedHashMap = linkedHashMap2;
                                                    z31 = false;
                                                } else {
                                                    float f27 = f19 - 1.0f;
                                                    if (f27 < f15) {
                                                        f27 = f15;
                                                    }
                                                    if (f27 == f19) {
                                                        linkedHashMap = linkedHashMap2;
                                                    } else {
                                                        qy.r rVarD4 = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z21113, aVar, i39, i38, dVar2, i40, f27);
                                                        linkedHashMap = linkedHashMap2;
                                                        List list4 = (List) rVarD4.f48506b;
                                                        if (!((Boolean) rVarD4.f48507c).booleanValue()) {
                                                            yVar.f38361a = list4;
                                                            b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f27)));
                                                            f17 = f27;
                                                            z31 = true;
                                                        }
                                                    }
                                                    z31 = false;
                                                }
                                                if (z31) {
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    j16 = 4294967296L;
                                                    f18 = f17;
                                                    iR = i36;
                                                } else {
                                                    f21 = f15;
                                                    LinkedHashMap linkedHashMap14 = linkedHashMap;
                                                    rVarD2 = e.D(linkedHashMap14, b1Var4, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f21);
                                                    list2 = (List) rVarD2.f48506b;
                                                    if (((Boolean) rVarD2.f48507c).booleanValue()) {
                                                        SubcomposeLayout = SubcomposeLayout;
                                                        z32 = z21113;
                                                        yVar.f38361a = list2;
                                                        iR = e.R(i38, list2);
                                                        iQ = e.Q(i39, list2);
                                                        b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f21)));
                                                        f18 = f21;
                                                    } else {
                                                        if (f19 > f21) {
                                                            f22 = f19 - f21;
                                                            if (f22 >= 1.0f) {
                                                                SubcomposeLayout = SubcomposeLayout;
                                                                z32 = z21113;
                                                                l1.b1 b1Var17 = b1Var4;
                                                                int iCeil12 = (int) Math.ceil((float) (Math.log(f22 + 1) / hz.a.f33863a));
                                                                int i41114 = 2;
                                                                int i41115 = iCeil12 + 2;
                                                                f23 = f19;
                                                                int i41116 = 0;
                                                                f24 = f21;
                                                                List list18 = list2;
                                                                float f2110 = f24;
                                                                while (true) {
                                                                    f25 = f23 - f24;
                                                                    if (f25 >= 1.0f && i41116 < i41115) {
                                                                        i41116++;
                                                                        float f29 = (f25 / i41114) + f24;
                                                                        if (f29 == f24 || f29 == f23) {
                                                                            break;
                                                                        }
                                                                        b1Var17 = b1Var17;
                                                                        List list6 = list18;
                                                                        float f30 = f24;
                                                                        i41115 = i41115;
                                                                        qy.r rVarD5 = e.D(linkedHashMap14, b1Var17, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f29);
                                                                        List list7 = (List) rVarD5.f48506b;
                                                                        if (((Boolean) rVarD5.f48507c).booleanValue()) {
                                                                            f24 = f30;
                                                                            f23 = f29;
                                                                            list18 = list6;
                                                                            i41114 = 2;
                                                                        } else {
                                                                            f24 = f29;
                                                                            f2110 = f24;
                                                                            i41114 = 2;
                                                                            list18 = list7;
                                                                        }
                                                                    } else {
                                                                        break;
                                                                    }
                                                                }
                                                                yVar.f38361a = list18;
                                                                f18 = f2110;
                                                            } else {
                                                                SubcomposeLayout = SubcomposeLayout;
                                                                z32 = z21113;
                                                                SubcomposeLayout = SubcomposeLayout;
                                                                z32 = z21113;
                                                                yVar.f38361a = list2;
                                                                f18 = f21;
                                                            }
                                                        } else {
                                                            SubcomposeLayout = SubcomposeLayout;
                                                            z32 = z21113;
                                                            SubcomposeLayout = SubcomposeLayout;
                                                            z32 = z21113;
                                                            yVar.f38361a = list2;
                                                            f18 = f21;
                                                        }
                                                        iR = e.R(i38, (List) yVar.f38361a);
                                                        iQ = e.Q(i39, (List) yVar.f38361a);
                                                        j16 = 4294967296L;
                                                        b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f18)));
                                                    }
                                                }
                                            } else {
                                                yVar.f38361a = list;
                                                int iR14 = e.R(i38, list);
                                                iQ = e.Q(i39, list);
                                                b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f19)));
                                                f18 = f19;
                                                iR = iR14;
                                            }
                                            j16 = 4294967296L;
                                        }
                                        cVar2.invoke(new v3.o(fr.j3.L(j16, f18)));
                                        iH = v3.a.h(aVar.f53483a);
                                        if (iQ > iH) {
                                            i37 = iH;
                                        } else {
                                            i37 = iQ;
                                        }
                                        iG = v3.a.g(aVar.f53483a);
                                        if (iR > iG) {
                                            iR = iG;
                                        }
                                        System.currentTimeMillis();
                                        ((List) yVar.f38361a).size();
                                        final j0.f fVar13 = fVar;
                                        final z1.i iVar1111 = iVar8;
                                        final z1.i iVar1112 = iVar3;
                                        return SubcomposeLayout.q0(i37, iR, ry.s.f50855a, new fz.c() { // from class: dt.n3
                                            /* JADX WARN: Code duplicated, block: B:29:0x008d  */
                                            @Override // fz.c
                                            public final Object invoke(Object obj3) {
                                                Integer num;
                                                int i41117;
                                                z1.i iVar1113;
                                                int iA;
                                                w2.f1 layout = (w2.f1) obj3;
                                                kotlin.jvm.internal.m.f(layout, "$this$layout");
                                                int i41118 = 0;
                                                int i41119 = 0;
                                                for (List<w2.g1> list19 : (Iterable) yVar.f38361a) {
                                                    if (!list19.isEmpty()) {
                                                        Iterator it = list19.iterator();
                                                        if (it.hasNext()) {
                                                            Integer numValueOf = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                            while (it.hasNext()) {
                                                                Integer numValueOf2 = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                                if (numValueOf.compareTo(numValueOf2) < 0) {
                                                                    numValueOf = numValueOf2;
                                                                }
                                                            }
                                                            num = numValueOf;
                                                        } else {
                                                            num = null;
                                                        }
                                                        int iIntValue3 = num != null ? num.intValue() : 0;
                                                        int size = list19.size() - 1;
                                                        if (size < 0) {
                                                            size = 0;
                                                        }
                                                        int i411110 = i39;
                                                        int i411111 = size * i411110;
                                                        Iterator it2 = list19.iterator();
                                                        int i411112 = 0;
                                                        while (it2.hasNext()) {
                                                            i411112 += ((w2.g1) it2.next()).f54501a;
                                                        }
                                                        int i50 = i411112 + i411111;
                                                        j0.b bVar = j0.i.f35303a;
                                                        j0.f fVar14 = fVar13;
                                                        if (kotlin.jvm.internal.m.a(fVar14, bVar)) {
                                                            i41117 = 0;
                                                        } else {
                                                            boolean zA = kotlin.jvm.internal.m.a(fVar14, j0.i.f35307e);
                                                            int i51 = i37;
                                                            if (zA) {
                                                                int i52 = i51 - i50;
                                                                if (i52 < 0) {
                                                                    i52 = 0;
                                                                }
                                                                i41117 = i52 / 2;
                                                            } else if (!kotlin.jvm.internal.m.a(fVar14, j0.i.f35304b) || (i41117 = i51 - i50) < 0) {
                                                                i41117 = 0;
                                                            }
                                                        }
                                                        for (w2.g1 g1Var : list19) {
                                                            if (i41119 != 0 || (iVar1113 = iVar1111) == null) {
                                                                iVar1113 = iVar1112;
                                                            }
                                                            if (kotlin.jvm.internal.m.a(iVar1113, z1.c.L)) {
                                                                iA = 0;
                                                            } else {
                                                                z1.i iVar1114 = z1.c.M;
                                                                iA = kotlin.jvm.internal.m.a(iVar1113, iVar1114) ? (iIntValue3 - g1Var.f54502b) / 2 : kotlin.jvm.internal.m.a(iVar1113, z1.c.N) ? iIntValue3 - g1Var.f54502b : iVar1114.a(g1Var.f54502b, iIntValue3);
                                                            }
                                                            w2.f1.k(layout, g1Var, i41117, iA + i41118);
                                                            i41117 += g1Var.f54501a + i411110;
                                                            i41119++;
                                                        }
                                                        i41118 += iIntValue3 + i38;
                                                    }
                                                }
                                                return qy.b0.f48488a;
                                            }
                                        });
                                    }
                                    v3.o.c(j17);
                                    b1Var5.setValue(null);
                                }
                            } else {
                                z21113 = z33;
                                f15 = fC;
                                f16 = f26;
                            }
                            f17 = f15;
                            z30 = false;
                            iQ = 0;
                            i36 = 0;
                            if (z30) {
                                f19 = f16;
                                rVarD = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z21113, aVar, i39, i38, dVar2, i40, f19);
                                list = (List) rVarD.f48506b;
                                if (((Boolean) rVarD.f48507c).booleanValue()) {
                                    yVar.f38361a = list;
                                    int iR15 = e.R(i38, list);
                                    iQ = e.Q(i39, list);
                                    b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f19)));
                                    f18 = f19;
                                    iR = iR15;
                                } else {
                                    if (list.size() == i40 + 1) {
                                        linkedHashMap = linkedHashMap2;
                                        z31 = false;
                                    } else {
                                        linkedHashMap = linkedHashMap2;
                                        z31 = false;
                                    }
                                    if (z31) {
                                        f21 = f15;
                                        LinkedHashMap linkedHashMap15 = linkedHashMap;
                                        rVarD2 = e.D(linkedHashMap15, b1Var4, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f21);
                                        list2 = (List) rVarD2.f48506b;
                                        if (((Boolean) rVarD2.f48507c).booleanValue()) {
                                            SubcomposeLayout = SubcomposeLayout;
                                            z32 = z21113;
                                            yVar.f38361a = list2;
                                            iR = e.R(i38, list2);
                                            iQ = e.Q(i39, list2);
                                            b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f21)));
                                            f18 = f21;
                                        } else {
                                            if (f19 > f21) {
                                                f22 = f19 - f21;
                                                if (f22 >= 1.0f) {
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    z32 = z21113;
                                                    l1.b1 b1Var18 = b1Var4;
                                                    int iCeil13 = (int) Math.ceil((float) (Math.log(f22 + 1) / hz.a.f33863a));
                                                    int i41117 = 2;
                                                    int i41118 = iCeil13 + 2;
                                                    f23 = f19;
                                                    int i41119 = 0;
                                                    f24 = f21;
                                                    List list19 = list2;
                                                    float f2111 = f24;
                                                    while (true) {
                                                        f25 = f23 - f24;
                                                        if (f25 >= 1.0f) {
                                                            break;
                                                        }
                                                        break;
                                                        break;
                                                    }
                                                    yVar.f38361a = list19;
                                                    f18 = f2111;
                                                } else {
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    z32 = z21113;
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    z32 = z21113;
                                                    yVar.f38361a = list2;
                                                    f18 = f21;
                                                }
                                            } else {
                                                SubcomposeLayout = SubcomposeLayout;
                                                z32 = z21113;
                                                SubcomposeLayout = SubcomposeLayout;
                                                z32 = z21113;
                                                yVar.f38361a = list2;
                                                f18 = f21;
                                            }
                                            iR = e.R(i38, (List) yVar.f38361a);
                                            iQ = e.Q(i39, (List) yVar.f38361a);
                                            j16 = 4294967296L;
                                            b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f18)));
                                        }
                                    } else {
                                        SubcomposeLayout = SubcomposeLayout;
                                        j16 = 4294967296L;
                                        f18 = f17;
                                        iR = i36;
                                    }
                                }
                                j16 = 4294967296L;
                            } else {
                                j16 = 4294967296L;
                                f18 = f17;
                                iR = i36;
                            }
                            cVar2.invoke(new v3.o(fr.j3.L(j16, f18)));
                            iH = v3.a.h(aVar.f53483a);
                            if (iQ > iH) {
                                i37 = iH;
                            } else {
                                i37 = iQ;
                            }
                            iG = v3.a.g(aVar.f53483a);
                            if (iR > iG) {
                                iR = iG;
                            }
                            System.currentTimeMillis();
                            ((List) yVar.f38361a).size();
                            final j0.f fVar14 = fVar;
                            final z1.i iVar1113 = iVar8;
                            final z1.i iVar1114 = iVar3;
                            return SubcomposeLayout.q0(i37, iR, ry.s.f50855a, new fz.c() { // from class: dt.n3
                                /* JADX WARN: Code duplicated, block: B:29:0x008d  */
                                @Override // fz.c
                                public final Object invoke(Object obj3) {
                                    Integer num;
                                    int i411110;
                                    z1.i iVar1115;
                                    int iA;
                                    w2.f1 layout = (w2.f1) obj3;
                                    kotlin.jvm.internal.m.f(layout, "$this$layout");
                                    int i411111 = 0;
                                    int i411112 = 0;
                                    for (List<w2.g1> list110 : (Iterable) yVar.f38361a) {
                                        if (!list110.isEmpty()) {
                                            Iterator it = list110.iterator();
                                            if (it.hasNext()) {
                                                Integer numValueOf = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                while (it.hasNext()) {
                                                    Integer numValueOf2 = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                    if (numValueOf.compareTo(numValueOf2) < 0) {
                                                        numValueOf = numValueOf2;
                                                    }
                                                }
                                                num = numValueOf;
                                            } else {
                                                num = null;
                                            }
                                            int iIntValue3 = num != null ? num.intValue() : 0;
                                            int size = list110.size() - 1;
                                            if (size < 0) {
                                                size = 0;
                                            }
                                            int i411113 = i39;
                                            int i411114 = size * i411113;
                                            Iterator it2 = list110.iterator();
                                            int i411115 = 0;
                                            while (it2.hasNext()) {
                                                i411115 += ((w2.g1) it2.next()).f54501a;
                                            }
                                            int i50 = i411115 + i411114;
                                            j0.b bVar = j0.i.f35303a;
                                            j0.f fVar15 = fVar14;
                                            if (kotlin.jvm.internal.m.a(fVar15, bVar)) {
                                                i411110 = 0;
                                            } else {
                                                boolean zA = kotlin.jvm.internal.m.a(fVar15, j0.i.f35307e);
                                                int i51 = i37;
                                                if (zA) {
                                                    int i52 = i51 - i50;
                                                    if (i52 < 0) {
                                                        i52 = 0;
                                                    }
                                                    i411110 = i52 / 2;
                                                } else if (!kotlin.jvm.internal.m.a(fVar15, j0.i.f35304b) || (i411110 = i51 - i50) < 0) {
                                                    i411110 = 0;
                                                }
                                            }
                                            for (w2.g1 g1Var : list110) {
                                                if (i411112 != 0 || (iVar1115 = iVar1113) == null) {
                                                    iVar1115 = iVar1114;
                                                }
                                                if (kotlin.jvm.internal.m.a(iVar1115, z1.c.L)) {
                                                    iA = 0;
                                                } else {
                                                    z1.i iVar1116 = z1.c.M;
                                                    iA = kotlin.jvm.internal.m.a(iVar1115, iVar1116) ? (iIntValue3 - g1Var.f54502b) / 2 : kotlin.jvm.internal.m.a(iVar1115, z1.c.N) ? iIntValue3 - g1Var.f54502b : iVar1116.a(g1Var.f54502b, iIntValue3);
                                                }
                                                w2.f1.k(layout, g1Var, i411110, iA + i411111);
                                                i411110 += g1Var.f54501a + i411113;
                                                i411112++;
                                            }
                                            i411111 += iIntValue3 + i38;
                                        }
                                    }
                                    return qy.b0.f48488a;
                                }
                            });
                        }
                    };
                    sVar.o0(eVar12);
                    objQ8 = eVar12;
                } else {
                    sVar = sVar2;
                    i29 = i27;
                    iVar8 = iVar7;
                    fz.e eVar13 = new fz.e() { // from class: dt.l3
                        /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
                        /* JADX WARN: Code duplicated, block: B:26:0x00e8  */
                        /* JADX WARN: Code duplicated, block: B:28:0x010c  */
                        /* JADX WARN: Code duplicated, block: B:37:0x0126  */
                        /* JADX WARN: Code duplicated, block: B:44:0x0165  */
                        /* JADX WARN: Code duplicated, block: B:46:0x0184  */
                        /* JADX WARN: Code duplicated, block: B:47:0x01a2  */
                        /* JADX WARN: Code duplicated, block: B:49:0x01a6  */
                        /* JADX WARN: Code duplicated, block: B:51:0x01ac  */
                        /* JADX WARN: Code duplicated, block: B:66:0x0223  */
                        /* JADX WARN: Code duplicated, block: B:68:0x0248  */
                        /* JADX WARN: Code duplicated, block: B:69:0x024a A[PHI: r3 r18
                          0x024a: PHI (r3v2 'SubcomposeLayout' w2.q1) = (r3v1 'SubcomposeLayout' w2.q1), (r3v4 'SubcomposeLayout' w2.q1) binds: [B:23:0x00cd, B:68:0x0248] A[DONT_GENERATE, DONT_INLINE]
                          0x024a: PHI (r18v2 float) = (r18v1 float), (r18v4 float) binds: [B:23:0x00cd, B:68:0x0248] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:72:0x0269  */
                        /* JADX WARN: Code duplicated, block: B:73:0x026c  */
                        /* JADX WARN: Code duplicated, block: B:76:0x0276  */
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            boolean z21113;
                            float f15;
                            float f16;
                            float f17;
                            boolean z30;
                            int iQ;
                            int i36;
                            long j16;
                            float f18;
                            int iR;
                            int iH;
                            final int i37;
                            int iG;
                            float f19;
                            qy.r rVarD;
                            List list;
                            LinkedHashMap linkedHashMap;
                            boolean z31;
                            float f21;
                            boolean z32;
                            qy.r rVarD2;
                            List list2;
                            float f22;
                            float f23;
                            float f24;
                            float f25;
                            w2.q1 SubcomposeLayout = (w2.q1) obj;
                            v3.a aVar = (v3.a) obj2;
                            kotlin.jvm.internal.m.f(SubcomposeLayout, "$this$SubcomposeLayout");
                            System.currentTimeMillis();
                            float fC = v3.o.c(j15);
                            l1.b1 b1Var4 = currentTextStyle;
                            float fC2 = v3.o.c(((j3.y0) b1Var4.getValue()).f35827a.f35755b);
                            float f26 = fC2 < fC ? fC : fC2;
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            final kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                            yVar.f38361a = ry.r.f50854a;
                            l1.b1 b1Var5 = b1Var2;
                            v3.o oVar14 = (v3.o) b1Var5.getValue();
                            final int i38 = iIntValue2;
                            final int i39 = iIntValue;
                            int i40 = i29;
                            boolean z33 = z11;
                            t1.d dVar2 = dVar;
                            if (oVar14 != null) {
                                f15 = fC;
                                f16 = f26;
                                long j17 = oVar14.f53502a;
                                if (v3.o.c(j17) < f15 || v3.o.c(j17) > f16) {
                                    z21113 = z33;
                                } else {
                                    v3.o.c(j17);
                                    z21113 = z33;
                                    qy.r rVarD3 = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z21113, aVar, i39, i38, dVar2, i40, v3.o.c(j17));
                                    List list3 = (List) rVarD3.f48506b;
                                    if (!((Boolean) rVarD3.f48507c).booleanValue() || v3.o.c(j17) == f15) {
                                        v3.o.c(j17);
                                        float fC3 = v3.o.c(j17);
                                        yVar.f38361a = list3;
                                        int iR2 = e.R(i38, list3);
                                        int iQ2 = e.Q(i39, list3);
                                        f17 = fC3;
                                        i36 = iR2;
                                        iQ = iQ2;
                                        z30 = true;
                                        if (z30) {
                                            j16 = 4294967296L;
                                            f18 = f17;
                                            iR = i36;
                                        } else {
                                            f19 = f16;
                                            rVarD = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z21113, aVar, i39, i38, dVar2, i40, f19);
                                            list = (List) rVarD.f48506b;
                                            if (((Boolean) rVarD.f48507c).booleanValue()) {
                                                if (list.size() == i40 + 1 || f19 <= f15) {
                                                    linkedHashMap = linkedHashMap2;
                                                    z31 = false;
                                                } else {
                                                    float f27 = f19 - 1.0f;
                                                    if (f27 < f15) {
                                                        f27 = f15;
                                                    }
                                                    if (f27 == f19) {
                                                        linkedHashMap = linkedHashMap2;
                                                    } else {
                                                        qy.r rVarD4 = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z21113, aVar, i39, i38, dVar2, i40, f27);
                                                        linkedHashMap = linkedHashMap2;
                                                        List list4 = (List) rVarD4.f48506b;
                                                        if (!((Boolean) rVarD4.f48507c).booleanValue()) {
                                                            yVar.f38361a = list4;
                                                            b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f27)));
                                                            f17 = f27;
                                                            z31 = true;
                                                        }
                                                    }
                                                    z31 = false;
                                                }
                                                if (z31) {
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    j16 = 4294967296L;
                                                    f18 = f17;
                                                    iR = i36;
                                                } else {
                                                    f21 = f15;
                                                    LinkedHashMap linkedHashMap15 = linkedHashMap;
                                                    rVarD2 = e.D(linkedHashMap15, b1Var4, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f21);
                                                    list2 = (List) rVarD2.f48506b;
                                                    if (((Boolean) rVarD2.f48507c).booleanValue()) {
                                                        SubcomposeLayout = SubcomposeLayout;
                                                        z32 = z21113;
                                                        yVar.f38361a = list2;
                                                        iR = e.R(i38, list2);
                                                        iQ = e.Q(i39, list2);
                                                        b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f21)));
                                                        f18 = f21;
                                                    } else {
                                                        if (f19 > f21) {
                                                            f22 = f19 - f21;
                                                            if (f22 >= 1.0f) {
                                                                SubcomposeLayout = SubcomposeLayout;
                                                                z32 = z21113;
                                                                l1.b1 b1Var18 = b1Var4;
                                                                int iCeil13 = (int) Math.ceil((float) (Math.log(f22 + 1) / hz.a.f33863a));
                                                                int i41117 = 2;
                                                                int i41118 = iCeil13 + 2;
                                                                f23 = f19;
                                                                int i41119 = 0;
                                                                f24 = f21;
                                                                List list19 = list2;
                                                                float f2111 = f24;
                                                                while (true) {
                                                                    f25 = f23 - f24;
                                                                    if (f25 >= 1.0f && i41119 < i41118) {
                                                                        i41119++;
                                                                        float f29 = (f25 / i41117) + f24;
                                                                        if (f29 == f24 || f29 == f23) {
                                                                            break;
                                                                        }
                                                                        b1Var18 = b1Var18;
                                                                        List list6 = list19;
                                                                        float f30 = f24;
                                                                        i41118 = i41118;
                                                                        qy.r rVarD5 = e.D(linkedHashMap15, b1Var18, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f29);
                                                                        List list7 = (List) rVarD5.f48506b;
                                                                        if (((Boolean) rVarD5.f48507c).booleanValue()) {
                                                                            f24 = f30;
                                                                            f23 = f29;
                                                                            list19 = list6;
                                                                            i41117 = 2;
                                                                        } else {
                                                                            f24 = f29;
                                                                            f2111 = f24;
                                                                            i41117 = 2;
                                                                            list19 = list7;
                                                                        }
                                                                    } else {
                                                                        break;
                                                                    }
                                                                }
                                                                yVar.f38361a = list19;
                                                                f18 = f2111;
                                                            } else {
                                                                SubcomposeLayout = SubcomposeLayout;
                                                                z32 = z21113;
                                                                SubcomposeLayout = SubcomposeLayout;
                                                                z32 = z21113;
                                                                yVar.f38361a = list2;
                                                                f18 = f21;
                                                            }
                                                        } else {
                                                            SubcomposeLayout = SubcomposeLayout;
                                                            z32 = z21113;
                                                            SubcomposeLayout = SubcomposeLayout;
                                                            z32 = z21113;
                                                            yVar.f38361a = list2;
                                                            f18 = f21;
                                                        }
                                                        iR = e.R(i38, (List) yVar.f38361a);
                                                        iQ = e.Q(i39, (List) yVar.f38361a);
                                                        j16 = 4294967296L;
                                                        b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f18)));
                                                    }
                                                }
                                            } else {
                                                yVar.f38361a = list;
                                                int iR15 = e.R(i38, list);
                                                iQ = e.Q(i39, list);
                                                b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f19)));
                                                f18 = f19;
                                                iR = iR15;
                                            }
                                            j16 = 4294967296L;
                                        }
                                        cVar2.invoke(new v3.o(fr.j3.L(j16, f18)));
                                        iH = v3.a.h(aVar.f53483a);
                                        if (iQ > iH) {
                                            i37 = iH;
                                        } else {
                                            i37 = iQ;
                                        }
                                        iG = v3.a.g(aVar.f53483a);
                                        if (iR > iG) {
                                            iR = iG;
                                        }
                                        System.currentTimeMillis();
                                        ((List) yVar.f38361a).size();
                                        final j0.f fVar14 = fVar;
                                        final z1.i iVar1113 = iVar8;
                                        final z1.i iVar1114 = iVar3;
                                        return SubcomposeLayout.q0(i37, iR, ry.s.f50855a, new fz.c() { // from class: dt.n3
                                            /* JADX WARN: Code duplicated, block: B:29:0x008d  */
                                            @Override // fz.c
                                            public final Object invoke(Object obj3) {
                                                Integer num;
                                                int i411110;
                                                z1.i iVar1115;
                                                int iA;
                                                w2.f1 layout = (w2.f1) obj3;
                                                kotlin.jvm.internal.m.f(layout, "$this$layout");
                                                int i411111 = 0;
                                                int i411112 = 0;
                                                for (List<w2.g1> list110 : (Iterable) yVar.f38361a) {
                                                    if (!list110.isEmpty()) {
                                                        Iterator it = list110.iterator();
                                                        if (it.hasNext()) {
                                                            Integer numValueOf = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                            while (it.hasNext()) {
                                                                Integer numValueOf2 = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                                if (numValueOf.compareTo(numValueOf2) < 0) {
                                                                    numValueOf = numValueOf2;
                                                                }
                                                            }
                                                            num = numValueOf;
                                                        } else {
                                                            num = null;
                                                        }
                                                        int iIntValue3 = num != null ? num.intValue() : 0;
                                                        int size = list110.size() - 1;
                                                        if (size < 0) {
                                                            size = 0;
                                                        }
                                                        int i411113 = i39;
                                                        int i411114 = size * i411113;
                                                        Iterator it2 = list110.iterator();
                                                        int i411115 = 0;
                                                        while (it2.hasNext()) {
                                                            i411115 += ((w2.g1) it2.next()).f54501a;
                                                        }
                                                        int i50 = i411115 + i411114;
                                                        j0.b bVar = j0.i.f35303a;
                                                        j0.f fVar15 = fVar14;
                                                        if (kotlin.jvm.internal.m.a(fVar15, bVar)) {
                                                            i411110 = 0;
                                                        } else {
                                                            boolean zA = kotlin.jvm.internal.m.a(fVar15, j0.i.f35307e);
                                                            int i51 = i37;
                                                            if (zA) {
                                                                int i52 = i51 - i50;
                                                                if (i52 < 0) {
                                                                    i52 = 0;
                                                                }
                                                                i411110 = i52 / 2;
                                                            } else if (!kotlin.jvm.internal.m.a(fVar15, j0.i.f35304b) || (i411110 = i51 - i50) < 0) {
                                                                i411110 = 0;
                                                            }
                                                        }
                                                        for (w2.g1 g1Var : list110) {
                                                            if (i411112 != 0 || (iVar1115 = iVar1113) == null) {
                                                                iVar1115 = iVar1114;
                                                            }
                                                            if (kotlin.jvm.internal.m.a(iVar1115, z1.c.L)) {
                                                                iA = 0;
                                                            } else {
                                                                z1.i iVar1116 = z1.c.M;
                                                                iA = kotlin.jvm.internal.m.a(iVar1115, iVar1116) ? (iIntValue3 - g1Var.f54502b) / 2 : kotlin.jvm.internal.m.a(iVar1115, z1.c.N) ? iIntValue3 - g1Var.f54502b : iVar1116.a(g1Var.f54502b, iIntValue3);
                                                            }
                                                            w2.f1.k(layout, g1Var, i411110, iA + i411111);
                                                            i411110 += g1Var.f54501a + i411113;
                                                            i411112++;
                                                        }
                                                        i411111 += iIntValue3 + i38;
                                                    }
                                                }
                                                return qy.b0.f48488a;
                                            }
                                        });
                                    }
                                    v3.o.c(j17);
                                    b1Var5.setValue(null);
                                }
                            } else {
                                z21113 = z33;
                                f15 = fC;
                                f16 = f26;
                            }
                            f17 = f15;
                            z30 = false;
                            iQ = 0;
                            i36 = 0;
                            if (z30) {
                                f19 = f16;
                                rVarD = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z21113, aVar, i39, i38, dVar2, i40, f19);
                                list = (List) rVarD.f48506b;
                                if (((Boolean) rVarD.f48507c).booleanValue()) {
                                    yVar.f38361a = list;
                                    int iR16 = e.R(i38, list);
                                    iQ = e.Q(i39, list);
                                    b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f19)));
                                    f18 = f19;
                                    iR = iR16;
                                } else {
                                    if (list.size() == i40 + 1) {
                                        linkedHashMap = linkedHashMap2;
                                        z31 = false;
                                    } else {
                                        linkedHashMap = linkedHashMap2;
                                        z31 = false;
                                    }
                                    if (z31) {
                                        f21 = f15;
                                        LinkedHashMap linkedHashMap16 = linkedHashMap;
                                        rVarD2 = e.D(linkedHashMap16, b1Var4, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f21);
                                        list2 = (List) rVarD2.f48506b;
                                        if (((Boolean) rVarD2.f48507c).booleanValue()) {
                                            SubcomposeLayout = SubcomposeLayout;
                                            z32 = z21113;
                                            yVar.f38361a = list2;
                                            iR = e.R(i38, list2);
                                            iQ = e.Q(i39, list2);
                                            b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f21)));
                                            f18 = f21;
                                        } else {
                                            if (f19 > f21) {
                                                f22 = f19 - f21;
                                                if (f22 >= 1.0f) {
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    z32 = z21113;
                                                    l1.b1 b1Var19 = b1Var4;
                                                    int iCeil14 = (int) Math.ceil((float) (Math.log(f22 + 1) / hz.a.f33863a));
                                                    int i411110 = 2;
                                                    int i411111 = iCeil14 + 2;
                                                    f23 = f19;
                                                    int i411112 = 0;
                                                    f24 = f21;
                                                    List list110 = list2;
                                                    float f2112 = f24;
                                                    while (true) {
                                                        f25 = f23 - f24;
                                                        if (f25 >= 1.0f) {
                                                            break;
                                                        }
                                                        break;
                                                        break;
                                                    }
                                                    yVar.f38361a = list110;
                                                    f18 = f2112;
                                                } else {
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    z32 = z21113;
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    z32 = z21113;
                                                    yVar.f38361a = list2;
                                                    f18 = f21;
                                                }
                                            } else {
                                                SubcomposeLayout = SubcomposeLayout;
                                                z32 = z21113;
                                                SubcomposeLayout = SubcomposeLayout;
                                                z32 = z21113;
                                                yVar.f38361a = list2;
                                                f18 = f21;
                                            }
                                            iR = e.R(i38, (List) yVar.f38361a);
                                            iQ = e.Q(i39, (List) yVar.f38361a);
                                            j16 = 4294967296L;
                                            b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f18)));
                                        }
                                    } else {
                                        SubcomposeLayout = SubcomposeLayout;
                                        j16 = 4294967296L;
                                        f18 = f17;
                                        iR = i36;
                                    }
                                }
                                j16 = 4294967296L;
                            } else {
                                j16 = 4294967296L;
                                f18 = f17;
                                iR = i36;
                            }
                            cVar2.invoke(new v3.o(fr.j3.L(j16, f18)));
                            iH = v3.a.h(aVar.f53483a);
                            if (iQ > iH) {
                                i37 = iH;
                            } else {
                                i37 = iQ;
                            }
                            iG = v3.a.g(aVar.f53483a);
                            if (iR > iG) {
                                iR = iG;
                            }
                            System.currentTimeMillis();
                            ((List) yVar.f38361a).size();
                            final j0.f fVar15 = fVar;
                            final z1.i iVar1115 = iVar8;
                            final z1.i iVar1116 = iVar3;
                            return SubcomposeLayout.q0(i37, iR, ry.s.f50855a, new fz.c() { // from class: dt.n3
                                /* JADX WARN: Code duplicated, block: B:29:0x008d  */
                                @Override // fz.c
                                public final Object invoke(Object obj3) {
                                    Integer num;
                                    int i411113;
                                    z1.i iVar1117;
                                    int iA;
                                    w2.f1 layout = (w2.f1) obj3;
                                    kotlin.jvm.internal.m.f(layout, "$this$layout");
                                    int i411114 = 0;
                                    int i411115 = 0;
                                    for (List<w2.g1> list111 : (Iterable) yVar.f38361a) {
                                        if (!list111.isEmpty()) {
                                            Iterator it = list111.iterator();
                                            if (it.hasNext()) {
                                                Integer numValueOf = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                while (it.hasNext()) {
                                                    Integer numValueOf2 = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                    if (numValueOf.compareTo(numValueOf2) < 0) {
                                                        numValueOf = numValueOf2;
                                                    }
                                                }
                                                num = numValueOf;
                                            } else {
                                                num = null;
                                            }
                                            int iIntValue3 = num != null ? num.intValue() : 0;
                                            int size = list111.size() - 1;
                                            if (size < 0) {
                                                size = 0;
                                            }
                                            int i411116 = i39;
                                            int i411117 = size * i411116;
                                            Iterator it2 = list111.iterator();
                                            int i411118 = 0;
                                            while (it2.hasNext()) {
                                                i411118 += ((w2.g1) it2.next()).f54501a;
                                            }
                                            int i50 = i411118 + i411117;
                                            j0.b bVar = j0.i.f35303a;
                                            j0.f fVar16 = fVar15;
                                            if (kotlin.jvm.internal.m.a(fVar16, bVar)) {
                                                i411113 = 0;
                                            } else {
                                                boolean zA = kotlin.jvm.internal.m.a(fVar16, j0.i.f35307e);
                                                int i51 = i37;
                                                if (zA) {
                                                    int i52 = i51 - i50;
                                                    if (i52 < 0) {
                                                        i52 = 0;
                                                    }
                                                    i411113 = i52 / 2;
                                                } else if (!kotlin.jvm.internal.m.a(fVar16, j0.i.f35304b) || (i411113 = i51 - i50) < 0) {
                                                    i411113 = 0;
                                                }
                                            }
                                            for (w2.g1 g1Var : list111) {
                                                if (i411115 != 0 || (iVar1117 = iVar1115) == null) {
                                                    iVar1117 = iVar1116;
                                                }
                                                if (kotlin.jvm.internal.m.a(iVar1117, z1.c.L)) {
                                                    iA = 0;
                                                } else {
                                                    z1.i iVar1118 = z1.c.M;
                                                    iA = kotlin.jvm.internal.m.a(iVar1117, iVar1118) ? (iIntValue3 - g1Var.f54502b) / 2 : kotlin.jvm.internal.m.a(iVar1117, z1.c.N) ? iIntValue3 - g1Var.f54502b : iVar1118.a(g1Var.f54502b, iIntValue3);
                                                }
                                                w2.f1.k(layout, g1Var, i411113, iA + i411114);
                                                i411113 += g1Var.f54501a + i411116;
                                                i411115++;
                                            }
                                            i411114 += iIntValue3 + i38;
                                        }
                                    }
                                    return qy.b0.f48488a;
                                }
                            });
                        }
                    };
                    sVar.o0(eVar13);
                    objQ8 = eVar13;
                }
                w2.a0.b(rVar11, (fz.e) objQ8, sVar, i15 & 14, 0);
                i26 = i29;
                rVar3 = rVar11;
                f13 = f14;
                j12 = j13;
                iVar6 = iVar8;
                iVar5 = iVar3;
            } else {
                sVar = sVar2;
                sVar.W();
                i26 = i11;
                rVar3 = rVar2;
                f13 = f12;
                j12 = jA;
                iVar5 = iVar3;
                iVar6 = iVar4;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: dt.m3
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM = l1.t.M(i12 | 1);
                        int iM2 = l1.t.M(i13);
                        e.C(rVar3, fVar, iVar5, iVar6, z11, currentTextStyle, f13, f11, i26, j12, dVar, (l1.n) obj, iM, iM2, i14);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i15 |= 805306368;
        jA = j11;
        if ((i13 & 6) == 0) {
            if (sVar2.h(dVar)) {
                i30 = 4;
            } else {
                i30 = 2;
            }
            i25 = i13 | i30;
        } else {
            i25 = i13;
        }
        if ((i15 & 306783379) == 306783378) {
            z12 = true;
        } else {
            z12 = true;
        }
        if (sVar2.T(i15 & 1, z12)) {
            if (i34 != 0) {
                rVar4 = z1.o.f58481a;
            } else {
                rVar4 = rVar2;
            }
            if (i35 != 0) {
                iVar3 = z1.c.N;
            }
            if (i16 != 0) {
                iVar4 = null;
            }
            if (i18 != 0) {
                f14 = 0;
            } else {
                f14 = f12;
            }
            if (i21 != 0) {
                i27 = Integer.MAX_VALUE;
            } else {
                i27 = i11;
            }
            if (i23 != 0) {
                jA = fr.j3.A(16);
            }
            j13 = jA;
            cVar = (v3.c) sVar2.j(z2.g1.f58547h);
            if ((3670016 & i15) == 1048576) {
                z13 = true;
            } else {
                z13 = false;
            }
            objQ = sVar2.Q();
            gVar = l1.m.f39353a;
            if (z13) {
                objQ = Integer.valueOf(cVar.n0(f14));
                sVar2.o0(objQ);
            } else {
                objQ = Integer.valueOf(cVar.n0(f14));
                sVar2.o0(objQ);
            }
            iIntValue = ((Number) objQ).intValue();
            if ((29360128 & i15) == 8388608) {
                z14 = true;
            } else {
                z14 = false;
            }
            objQ2 = sVar2.Q();
            if (z14) {
                objQ2 = Integer.valueOf(cVar.n0(f11));
                sVar2.o0(objQ2);
            } else {
                objQ2 = Integer.valueOf(cVar.n0(f11));
                sVar2.o0(objQ2);
            }
            iIntValue2 = ((Number) objQ2).intValue();
            objQ3 = sVar2.Q();
            if (objQ3 == gVar) {
                objQ3 = l1.t.B(new v3.o(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b));
                sVar2.o0(objQ3);
            }
            b1Var = (l1.b1) objQ3;
            objQ4 = sVar2.Q();
            if (objQ4 == gVar) {
                objQ4 = l1.t.B(null);
                sVar2.o0(objQ4);
            }
            b1Var2 = (l1.b1) objQ4;
            z1.r rVar12 = rVar4;
            iVar7 = iVar4;
            if (!v3.o.a(((v3.o) b1Var.getValue()).f53502a, ((j3.y0) currentTextStyle.getValue()).f35827a.f35755b)) {
                v3.o.f(((v3.o) b1Var.getValue()).f53502a);
                v3.o.f(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b);
                b1Var.setValue(new v3.o(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b));
                b1Var2.setValue(null);
            }
            objQ5 = sVar2.Q();
            if (objQ5 == gVar) {
                objQ5 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ5);
            }
            b1Var3 = (l1.b1) objQ5;
            boolean zE16 = sVar2.e(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b);
            if ((1879048192 & i15) == 536870912) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = zE16 | z15;
            objQ6 = sVar2.Q();
            if (z16) {
                if (v3.o.c(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b) <= v3.o.c(j13)) {
                    j14 = ((j3.y0) currentTextStyle.getValue()).f35827a.f35755b;
                } else {
                    j14 = j13;
                }
                v3.o oVar14 = new v3.o(j14);
                sVar2.o0(oVar14);
                objQ6 = oVar14;
            } else {
                if (v3.o.c(((j3.y0) currentTextStyle.getValue()).f35827a.f35755b) <= v3.o.c(j13)) {
                    j14 = ((j3.y0) currentTextStyle.getValue()).f35827a.f35755b;
                } else {
                    j14 = j13;
                }
                v3.o oVar15 = new v3.o(j14);
                sVar2.o0(oVar15);
                objQ6 = oVar15;
            }
            j15 = ((v3.o) objQ6).f53502a;
            i28 = 458752 & i15;
            if (i28 == 131072) {
                z17 = true;
            } else {
                z17 = false;
            }
            zE = z17 | sVar2.e(j15);
            objQ7 = sVar2.Q();
            if (zE) {
                objQ7 = new au.j(currentTextStyle, b1Var3, j15);
                sVar2.o0(objQ7);
            } else {
                objQ7 = new au.j(currentTextStyle, b1Var3, j15);
                sVar2.o0(objQ7);
            }
            cVar2 = (fz.c) objQ7;
            boolean zE17 = sVar2.e(j15);
            if (i28 == 131072) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean z21113 = zE17 | z18;
            if ((234881024 & i15) == 67108864) {
                z19 = true;
            } else {
                z19 = false;
            }
            boolean z21114 = z21113 | z19;
            if ((i25 & 14) == 4) {
                z20 = true;
            } else {
                z20 = false;
            }
            boolean z21115 = z21114 | z20;
            if ((57344 & i15) == 16384) {
                z21 = true;
            } else {
                z21 = false;
            }
            boolean zD8 = z21115 | z21 | sVar2.d(iIntValue) | sVar2.d(iIntValue2) | sVar2.f(cVar2);
            if ((i15 & 112) == 32) {
                z22 = true;
            } else {
                z22 = false;
            }
            boolean z21116 = zD8 | z22;
            if ((i15 & 7168) == 2048) {
                z23 = true;
            } else {
                z23 = false;
            }
            z24 = z21116 | z23 | ((i15 & 896) == 256);
            objQ8 = sVar2.Q();
            if (z24) {
                sVar = sVar2;
                i29 = i27;
                iVar8 = iVar7;
                fz.e eVar14 = new fz.e() { // from class: dt.l3
                    /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
                    /* JADX WARN: Code duplicated, block: B:26:0x00e8  */
                    /* JADX WARN: Code duplicated, block: B:28:0x010c  */
                    /* JADX WARN: Code duplicated, block: B:37:0x0126  */
                    /* JADX WARN: Code duplicated, block: B:44:0x0165  */
                    /* JADX WARN: Code duplicated, block: B:46:0x0184  */
                    /* JADX WARN: Code duplicated, block: B:47:0x01a2  */
                    /* JADX WARN: Code duplicated, block: B:49:0x01a6  */
                    /* JADX WARN: Code duplicated, block: B:51:0x01ac  */
                    /* JADX WARN: Code duplicated, block: B:66:0x0223  */
                    /* JADX WARN: Code duplicated, block: B:68:0x0248  */
                    /* JADX WARN: Code duplicated, block: B:69:0x024a A[PHI: r3 r18
                      0x024a: PHI (r3v2 'SubcomposeLayout' w2.q1) = (r3v1 'SubcomposeLayout' w2.q1), (r3v4 'SubcomposeLayout' w2.q1) binds: [B:23:0x00cd, B:68:0x0248] A[DONT_GENERATE, DONT_INLINE]
                      0x024a: PHI (r18v2 float) = (r18v1 float), (r18v4 float) binds: [B:23:0x00cd, B:68:0x0248] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Code duplicated, block: B:72:0x0269  */
                    /* JADX WARN: Code duplicated, block: B:73:0x026c  */
                    /* JADX WARN: Code duplicated, block: B:76:0x0276  */
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        boolean z21117;
                        float f15;
                        float f16;
                        float f17;
                        boolean z30;
                        int iQ;
                        int i36;
                        long j16;
                        float f18;
                        int iR;
                        int iH;
                        final int i37;
                        int iG;
                        float f19;
                        qy.r rVarD;
                        List list;
                        LinkedHashMap linkedHashMap;
                        boolean z31;
                        float f21;
                        boolean z32;
                        qy.r rVarD2;
                        List list2;
                        float f22;
                        float f23;
                        float f24;
                        float f25;
                        w2.q1 SubcomposeLayout = (w2.q1) obj;
                        v3.a aVar = (v3.a) obj2;
                        kotlin.jvm.internal.m.f(SubcomposeLayout, "$this$SubcomposeLayout");
                        System.currentTimeMillis();
                        float fC = v3.o.c(j15);
                        l1.b1 b1Var4 = currentTextStyle;
                        float fC2 = v3.o.c(((j3.y0) b1Var4.getValue()).f35827a.f35755b);
                        float f26 = fC2 < fC ? fC : fC2;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        final kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                        yVar.f38361a = ry.r.f50854a;
                        l1.b1 b1Var5 = b1Var2;
                        v3.o oVar16 = (v3.o) b1Var5.getValue();
                        final int i38 = iIntValue2;
                        final int i39 = iIntValue;
                        int i40 = i29;
                        boolean z33 = z11;
                        t1.d dVar2 = dVar;
                        if (oVar16 != null) {
                            f15 = fC;
                            f16 = f26;
                            long j17 = oVar16.f53502a;
                            if (v3.o.c(j17) < f15 || v3.o.c(j17) > f16) {
                                z21117 = z33;
                            } else {
                                v3.o.c(j17);
                                z21117 = z33;
                                qy.r rVarD3 = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z21117, aVar, i39, i38, dVar2, i40, v3.o.c(j17));
                                List list3 = (List) rVarD3.f48506b;
                                if (!((Boolean) rVarD3.f48507c).booleanValue() || v3.o.c(j17) == f15) {
                                    v3.o.c(j17);
                                    float fC3 = v3.o.c(j17);
                                    yVar.f38361a = list3;
                                    int iR2 = e.R(i38, list3);
                                    int iQ2 = e.Q(i39, list3);
                                    f17 = fC3;
                                    i36 = iR2;
                                    iQ = iQ2;
                                    z30 = true;
                                    if (z30) {
                                        j16 = 4294967296L;
                                        f18 = f17;
                                        iR = i36;
                                    } else {
                                        f19 = f16;
                                        rVarD = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z21117, aVar, i39, i38, dVar2, i40, f19);
                                        list = (List) rVarD.f48506b;
                                        if (((Boolean) rVarD.f48507c).booleanValue()) {
                                            if (list.size() == i40 + 1 || f19 <= f15) {
                                                linkedHashMap = linkedHashMap2;
                                                z31 = false;
                                            } else {
                                                float f27 = f19 - 1.0f;
                                                if (f27 < f15) {
                                                    f27 = f15;
                                                }
                                                if (f27 == f19) {
                                                    linkedHashMap = linkedHashMap2;
                                                } else {
                                                    qy.r rVarD4 = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z21117, aVar, i39, i38, dVar2, i40, f27);
                                                    linkedHashMap = linkedHashMap2;
                                                    List list4 = (List) rVarD4.f48506b;
                                                    if (!((Boolean) rVarD4.f48507c).booleanValue()) {
                                                        yVar.f38361a = list4;
                                                        b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f27)));
                                                        f17 = f27;
                                                        z31 = true;
                                                    }
                                                }
                                                z31 = false;
                                            }
                                            if (z31) {
                                                SubcomposeLayout = SubcomposeLayout;
                                                j16 = 4294967296L;
                                                f18 = f17;
                                                iR = i36;
                                            } else {
                                                f21 = f15;
                                                LinkedHashMap linkedHashMap16 = linkedHashMap;
                                                rVarD2 = e.D(linkedHashMap16, b1Var4, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f21);
                                                list2 = (List) rVarD2.f48506b;
                                                if (((Boolean) rVarD2.f48507c).booleanValue()) {
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    z32 = z21117;
                                                    yVar.f38361a = list2;
                                                    iR = e.R(i38, list2);
                                                    iQ = e.Q(i39, list2);
                                                    b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f21)));
                                                    f18 = f21;
                                                } else {
                                                    if (f19 > f21) {
                                                        f22 = f19 - f21;
                                                        if (f22 >= 1.0f) {
                                                            SubcomposeLayout = SubcomposeLayout;
                                                            z32 = z21117;
                                                            l1.b1 b1Var19 = b1Var4;
                                                            int iCeil14 = (int) Math.ceil((float) (Math.log(f22 + 1) / hz.a.f33863a));
                                                            int i411110 = 2;
                                                            int i411111 = iCeil14 + 2;
                                                            f23 = f19;
                                                            int i411112 = 0;
                                                            f24 = f21;
                                                            List list110 = list2;
                                                            float f2112 = f24;
                                                            while (true) {
                                                                f25 = f23 - f24;
                                                                if (f25 >= 1.0f && i411112 < i411111) {
                                                                    i411112++;
                                                                    float f29 = (f25 / i411110) + f24;
                                                                    if (f29 == f24 || f29 == f23) {
                                                                        break;
                                                                    }
                                                                    b1Var19 = b1Var19;
                                                                    List list6 = list110;
                                                                    float f30 = f24;
                                                                    i411111 = i411111;
                                                                    qy.r rVarD5 = e.D(linkedHashMap16, b1Var19, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f29);
                                                                    List list7 = (List) rVarD5.f48506b;
                                                                    if (((Boolean) rVarD5.f48507c).booleanValue()) {
                                                                        f24 = f30;
                                                                        f23 = f29;
                                                                        list110 = list6;
                                                                        i411110 = 2;
                                                                    } else {
                                                                        f24 = f29;
                                                                        f2112 = f24;
                                                                        i411110 = 2;
                                                                        list110 = list7;
                                                                    }
                                                                } else {
                                                                    break;
                                                                }
                                                            }
                                                            yVar.f38361a = list110;
                                                            f18 = f2112;
                                                        } else {
                                                            SubcomposeLayout = SubcomposeLayout;
                                                            z32 = z21117;
                                                            SubcomposeLayout = SubcomposeLayout;
                                                            z32 = z21117;
                                                            yVar.f38361a = list2;
                                                            f18 = f21;
                                                        }
                                                    } else {
                                                        SubcomposeLayout = SubcomposeLayout;
                                                        z32 = z21117;
                                                        SubcomposeLayout = SubcomposeLayout;
                                                        z32 = z21117;
                                                        yVar.f38361a = list2;
                                                        f18 = f21;
                                                    }
                                                    iR = e.R(i38, (List) yVar.f38361a);
                                                    iQ = e.Q(i39, (List) yVar.f38361a);
                                                    j16 = 4294967296L;
                                                    b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f18)));
                                                }
                                            }
                                        } else {
                                            yVar.f38361a = list;
                                            int iR16 = e.R(i38, list);
                                            iQ = e.Q(i39, list);
                                            b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f19)));
                                            f18 = f19;
                                            iR = iR16;
                                        }
                                        j16 = 4294967296L;
                                    }
                                    cVar2.invoke(new v3.o(fr.j3.L(j16, f18)));
                                    iH = v3.a.h(aVar.f53483a);
                                    if (iQ > iH) {
                                        i37 = iH;
                                    } else {
                                        i37 = iQ;
                                    }
                                    iG = v3.a.g(aVar.f53483a);
                                    if (iR > iG) {
                                        iR = iG;
                                    }
                                    System.currentTimeMillis();
                                    ((List) yVar.f38361a).size();
                                    final j0.f fVar15 = fVar;
                                    final z1.i iVar1115 = iVar8;
                                    final z1.i iVar1116 = iVar3;
                                    return SubcomposeLayout.q0(i37, iR, ry.s.f50855a, new fz.c() { // from class: dt.n3
                                        /* JADX WARN: Code duplicated, block: B:29:0x008d  */
                                        @Override // fz.c
                                        public final Object invoke(Object obj3) {
                                            Integer num;
                                            int i411113;
                                            z1.i iVar1117;
                                            int iA;
                                            w2.f1 layout = (w2.f1) obj3;
                                            kotlin.jvm.internal.m.f(layout, "$this$layout");
                                            int i411114 = 0;
                                            int i411115 = 0;
                                            for (List<w2.g1> list111 : (Iterable) yVar.f38361a) {
                                                if (!list111.isEmpty()) {
                                                    Iterator it = list111.iterator();
                                                    if (it.hasNext()) {
                                                        Integer numValueOf = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                        while (it.hasNext()) {
                                                            Integer numValueOf2 = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                            if (numValueOf.compareTo(numValueOf2) < 0) {
                                                                numValueOf = numValueOf2;
                                                            }
                                                        }
                                                        num = numValueOf;
                                                    } else {
                                                        num = null;
                                                    }
                                                    int iIntValue3 = num != null ? num.intValue() : 0;
                                                    int size = list111.size() - 1;
                                                    if (size < 0) {
                                                        size = 0;
                                                    }
                                                    int i411116 = i39;
                                                    int i411117 = size * i411116;
                                                    Iterator it2 = list111.iterator();
                                                    int i411118 = 0;
                                                    while (it2.hasNext()) {
                                                        i411118 += ((w2.g1) it2.next()).f54501a;
                                                    }
                                                    int i50 = i411118 + i411117;
                                                    j0.b bVar = j0.i.f35303a;
                                                    j0.f fVar16 = fVar15;
                                                    if (kotlin.jvm.internal.m.a(fVar16, bVar)) {
                                                        i411113 = 0;
                                                    } else {
                                                        boolean zA = kotlin.jvm.internal.m.a(fVar16, j0.i.f35307e);
                                                        int i51 = i37;
                                                        if (zA) {
                                                            int i52 = i51 - i50;
                                                            if (i52 < 0) {
                                                                i52 = 0;
                                                            }
                                                            i411113 = i52 / 2;
                                                        } else if (!kotlin.jvm.internal.m.a(fVar16, j0.i.f35304b) || (i411113 = i51 - i50) < 0) {
                                                            i411113 = 0;
                                                        }
                                                    }
                                                    for (w2.g1 g1Var : list111) {
                                                        if (i411115 != 0 || (iVar1117 = iVar1115) == null) {
                                                            iVar1117 = iVar1116;
                                                        }
                                                        if (kotlin.jvm.internal.m.a(iVar1117, z1.c.L)) {
                                                            iA = 0;
                                                        } else {
                                                            z1.i iVar1118 = z1.c.M;
                                                            iA = kotlin.jvm.internal.m.a(iVar1117, iVar1118) ? (iIntValue3 - g1Var.f54502b) / 2 : kotlin.jvm.internal.m.a(iVar1117, z1.c.N) ? iIntValue3 - g1Var.f54502b : iVar1118.a(g1Var.f54502b, iIntValue3);
                                                        }
                                                        w2.f1.k(layout, g1Var, i411113, iA + i411114);
                                                        i411113 += g1Var.f54501a + i411116;
                                                        i411115++;
                                                    }
                                                    i411114 += iIntValue3 + i38;
                                                }
                                            }
                                            return qy.b0.f48488a;
                                        }
                                    });
                                }
                                v3.o.c(j17);
                                b1Var5.setValue(null);
                            }
                        } else {
                            z21117 = z33;
                            f15 = fC;
                            f16 = f26;
                        }
                        f17 = f15;
                        z30 = false;
                        iQ = 0;
                        i36 = 0;
                        if (z30) {
                            f19 = f16;
                            rVarD = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z21117, aVar, i39, i38, dVar2, i40, f19);
                            list = (List) rVarD.f48506b;
                            if (((Boolean) rVarD.f48507c).booleanValue()) {
                                yVar.f38361a = list;
                                int iR17 = e.R(i38, list);
                                iQ = e.Q(i39, list);
                                b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f19)));
                                f18 = f19;
                                iR = iR17;
                            } else {
                                if (list.size() == i40 + 1) {
                                    linkedHashMap = linkedHashMap2;
                                    z31 = false;
                                } else {
                                    linkedHashMap = linkedHashMap2;
                                    z31 = false;
                                }
                                if (z31) {
                                    f21 = f15;
                                    LinkedHashMap linkedHashMap17 = linkedHashMap;
                                    rVarD2 = e.D(linkedHashMap17, b1Var4, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f21);
                                    list2 = (List) rVarD2.f48506b;
                                    if (((Boolean) rVarD2.f48507c).booleanValue()) {
                                        SubcomposeLayout = SubcomposeLayout;
                                        z32 = z21117;
                                        yVar.f38361a = list2;
                                        iR = e.R(i38, list2);
                                        iQ = e.Q(i39, list2);
                                        b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f21)));
                                        f18 = f21;
                                    } else {
                                        if (f19 > f21) {
                                            f22 = f19 - f21;
                                            if (f22 >= 1.0f) {
                                                SubcomposeLayout = SubcomposeLayout;
                                                z32 = z21117;
                                                l1.b1 b1Var110 = b1Var4;
                                                int iCeil15 = (int) Math.ceil((float) (Math.log(f22 + 1) / hz.a.f33863a));
                                                int i411113 = 2;
                                                int i411114 = iCeil15 + 2;
                                                f23 = f19;
                                                int i411115 = 0;
                                                f24 = f21;
                                                List list111 = list2;
                                                float f2113 = f24;
                                                while (true) {
                                                    f25 = f23 - f24;
                                                    if (f25 >= 1.0f) {
                                                        break;
                                                    }
                                                    break;
                                                    break;
                                                }
                                                yVar.f38361a = list111;
                                                f18 = f2113;
                                            } else {
                                                SubcomposeLayout = SubcomposeLayout;
                                                z32 = z21117;
                                                SubcomposeLayout = SubcomposeLayout;
                                                z32 = z21117;
                                                yVar.f38361a = list2;
                                                f18 = f21;
                                            }
                                        } else {
                                            SubcomposeLayout = SubcomposeLayout;
                                            z32 = z21117;
                                            SubcomposeLayout = SubcomposeLayout;
                                            z32 = z21117;
                                            yVar.f38361a = list2;
                                            f18 = f21;
                                        }
                                        iR = e.R(i38, (List) yVar.f38361a);
                                        iQ = e.Q(i39, (List) yVar.f38361a);
                                        j16 = 4294967296L;
                                        b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f18)));
                                    }
                                } else {
                                    SubcomposeLayout = SubcomposeLayout;
                                    j16 = 4294967296L;
                                    f18 = f17;
                                    iR = i36;
                                }
                            }
                            j16 = 4294967296L;
                        } else {
                            j16 = 4294967296L;
                            f18 = f17;
                            iR = i36;
                        }
                        cVar2.invoke(new v3.o(fr.j3.L(j16, f18)));
                        iH = v3.a.h(aVar.f53483a);
                        if (iQ > iH) {
                            i37 = iH;
                        } else {
                            i37 = iQ;
                        }
                        iG = v3.a.g(aVar.f53483a);
                        if (iR > iG) {
                            iR = iG;
                        }
                        System.currentTimeMillis();
                        ((List) yVar.f38361a).size();
                        final j0.f fVar16 = fVar;
                        final z1.i iVar1117 = iVar8;
                        final z1.i iVar1118 = iVar3;
                        return SubcomposeLayout.q0(i37, iR, ry.s.f50855a, new fz.c() { // from class: dt.n3
                            /* JADX WARN: Code duplicated, block: B:29:0x008d  */
                            @Override // fz.c
                            public final Object invoke(Object obj3) {
                                Integer num;
                                int i411116;
                                z1.i iVar1119;
                                int iA;
                                w2.f1 layout = (w2.f1) obj3;
                                kotlin.jvm.internal.m.f(layout, "$this$layout");
                                int i411117 = 0;
                                int i411118 = 0;
                                for (List<w2.g1> list112 : (Iterable) yVar.f38361a) {
                                    if (!list112.isEmpty()) {
                                        Iterator it = list112.iterator();
                                        if (it.hasNext()) {
                                            Integer numValueOf = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                            while (it.hasNext()) {
                                                Integer numValueOf2 = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                if (numValueOf.compareTo(numValueOf2) < 0) {
                                                    numValueOf = numValueOf2;
                                                }
                                            }
                                            num = numValueOf;
                                        } else {
                                            num = null;
                                        }
                                        int iIntValue3 = num != null ? num.intValue() : 0;
                                        int size = list112.size() - 1;
                                        if (size < 0) {
                                            size = 0;
                                        }
                                        int i411119 = i39;
                                        int i4111110 = size * i411119;
                                        Iterator it2 = list112.iterator();
                                        int i4111111 = 0;
                                        while (it2.hasNext()) {
                                            i4111111 += ((w2.g1) it2.next()).f54501a;
                                        }
                                        int i50 = i4111111 + i4111110;
                                        j0.b bVar = j0.i.f35303a;
                                        j0.f fVar17 = fVar16;
                                        if (kotlin.jvm.internal.m.a(fVar17, bVar)) {
                                            i411116 = 0;
                                        } else {
                                            boolean zA = kotlin.jvm.internal.m.a(fVar17, j0.i.f35307e);
                                            int i51 = i37;
                                            if (zA) {
                                                int i52 = i51 - i50;
                                                if (i52 < 0) {
                                                    i52 = 0;
                                                }
                                                i411116 = i52 / 2;
                                            } else if (!kotlin.jvm.internal.m.a(fVar17, j0.i.f35304b) || (i411116 = i51 - i50) < 0) {
                                                i411116 = 0;
                                            }
                                        }
                                        for (w2.g1 g1Var : list112) {
                                            if (i411118 != 0 || (iVar1119 = iVar1117) == null) {
                                                iVar1119 = iVar1118;
                                            }
                                            if (kotlin.jvm.internal.m.a(iVar1119, z1.c.L)) {
                                                iA = 0;
                                            } else {
                                                z1.i iVar11110 = z1.c.M;
                                                iA = kotlin.jvm.internal.m.a(iVar1119, iVar11110) ? (iIntValue3 - g1Var.f54502b) / 2 : kotlin.jvm.internal.m.a(iVar1119, z1.c.N) ? iIntValue3 - g1Var.f54502b : iVar11110.a(g1Var.f54502b, iIntValue3);
                                            }
                                            w2.f1.k(layout, g1Var, i411116, iA + i411117);
                                            i411116 += g1Var.f54501a + i411119;
                                            i411118++;
                                        }
                                        i411117 += iIntValue3 + i38;
                                    }
                                }
                                return qy.b0.f48488a;
                            }
                        });
                    }
                };
                sVar.o0(eVar14);
                objQ8 = eVar14;
            } else {
                sVar = sVar2;
                i29 = i27;
                iVar8 = iVar7;
                fz.e eVar15 = new fz.e() { // from class: dt.l3
                    /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
                    /* JADX WARN: Code duplicated, block: B:26:0x00e8  */
                    /* JADX WARN: Code duplicated, block: B:28:0x010c  */
                    /* JADX WARN: Code duplicated, block: B:37:0x0126  */
                    /* JADX WARN: Code duplicated, block: B:44:0x0165  */
                    /* JADX WARN: Code duplicated, block: B:46:0x0184  */
                    /* JADX WARN: Code duplicated, block: B:47:0x01a2  */
                    /* JADX WARN: Code duplicated, block: B:49:0x01a6  */
                    /* JADX WARN: Code duplicated, block: B:51:0x01ac  */
                    /* JADX WARN: Code duplicated, block: B:66:0x0223  */
                    /* JADX WARN: Code duplicated, block: B:68:0x0248  */
                    /* JADX WARN: Code duplicated, block: B:69:0x024a A[PHI: r3 r18
                      0x024a: PHI (r3v2 'SubcomposeLayout' w2.q1) = (r3v1 'SubcomposeLayout' w2.q1), (r3v4 'SubcomposeLayout' w2.q1) binds: [B:23:0x00cd, B:68:0x0248] A[DONT_GENERATE, DONT_INLINE]
                      0x024a: PHI (r18v2 float) = (r18v1 float), (r18v4 float) binds: [B:23:0x00cd, B:68:0x0248] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Code duplicated, block: B:72:0x0269  */
                    /* JADX WARN: Code duplicated, block: B:73:0x026c  */
                    /* JADX WARN: Code duplicated, block: B:76:0x0276  */
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        boolean z21117;
                        float f15;
                        float f16;
                        float f17;
                        boolean z30;
                        int iQ;
                        int i36;
                        long j16;
                        float f18;
                        int iR;
                        int iH;
                        final int i37;
                        int iG;
                        float f19;
                        qy.r rVarD;
                        List list;
                        LinkedHashMap linkedHashMap;
                        boolean z31;
                        float f21;
                        boolean z32;
                        qy.r rVarD2;
                        List list2;
                        float f22;
                        float f23;
                        float f24;
                        float f25;
                        w2.q1 SubcomposeLayout = (w2.q1) obj;
                        v3.a aVar = (v3.a) obj2;
                        kotlin.jvm.internal.m.f(SubcomposeLayout, "$this$SubcomposeLayout");
                        System.currentTimeMillis();
                        float fC = v3.o.c(j15);
                        l1.b1 b1Var4 = currentTextStyle;
                        float fC2 = v3.o.c(((j3.y0) b1Var4.getValue()).f35827a.f35755b);
                        float f26 = fC2 < fC ? fC : fC2;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        final kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                        yVar.f38361a = ry.r.f50854a;
                        l1.b1 b1Var5 = b1Var2;
                        v3.o oVar16 = (v3.o) b1Var5.getValue();
                        final int i38 = iIntValue2;
                        final int i39 = iIntValue;
                        int i40 = i29;
                        boolean z33 = z11;
                        t1.d dVar2 = dVar;
                        if (oVar16 != null) {
                            f15 = fC;
                            f16 = f26;
                            long j17 = oVar16.f53502a;
                            if (v3.o.c(j17) < f15 || v3.o.c(j17) > f16) {
                                z21117 = z33;
                            } else {
                                v3.o.c(j17);
                                z21117 = z33;
                                qy.r rVarD3 = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z21117, aVar, i39, i38, dVar2, i40, v3.o.c(j17));
                                List list3 = (List) rVarD3.f48506b;
                                if (!((Boolean) rVarD3.f48507c).booleanValue() || v3.o.c(j17) == f15) {
                                    v3.o.c(j17);
                                    float fC3 = v3.o.c(j17);
                                    yVar.f38361a = list3;
                                    int iR2 = e.R(i38, list3);
                                    int iQ2 = e.Q(i39, list3);
                                    f17 = fC3;
                                    i36 = iR2;
                                    iQ = iQ2;
                                    z30 = true;
                                    if (z30) {
                                        j16 = 4294967296L;
                                        f18 = f17;
                                        iR = i36;
                                    } else {
                                        f19 = f16;
                                        rVarD = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z21117, aVar, i39, i38, dVar2, i40, f19);
                                        list = (List) rVarD.f48506b;
                                        if (((Boolean) rVarD.f48507c).booleanValue()) {
                                            if (list.size() == i40 + 1 || f19 <= f15) {
                                                linkedHashMap = linkedHashMap2;
                                                z31 = false;
                                            } else {
                                                float f27 = f19 - 1.0f;
                                                if (f27 < f15) {
                                                    f27 = f15;
                                                }
                                                if (f27 == f19) {
                                                    linkedHashMap = linkedHashMap2;
                                                } else {
                                                    qy.r rVarD4 = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z21117, aVar, i39, i38, dVar2, i40, f27);
                                                    linkedHashMap = linkedHashMap2;
                                                    List list4 = (List) rVarD4.f48506b;
                                                    if (!((Boolean) rVarD4.f48507c).booleanValue()) {
                                                        yVar.f38361a = list4;
                                                        b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f27)));
                                                        f17 = f27;
                                                        z31 = true;
                                                    }
                                                }
                                                z31 = false;
                                            }
                                            if (z31) {
                                                SubcomposeLayout = SubcomposeLayout;
                                                j16 = 4294967296L;
                                                f18 = f17;
                                                iR = i36;
                                            } else {
                                                f21 = f15;
                                                LinkedHashMap linkedHashMap17 = linkedHashMap;
                                                rVarD2 = e.D(linkedHashMap17, b1Var4, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f21);
                                                list2 = (List) rVarD2.f48506b;
                                                if (((Boolean) rVarD2.f48507c).booleanValue()) {
                                                    SubcomposeLayout = SubcomposeLayout;
                                                    z32 = z21117;
                                                    yVar.f38361a = list2;
                                                    iR = e.R(i38, list2);
                                                    iQ = e.Q(i39, list2);
                                                    b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f21)));
                                                    f18 = f21;
                                                } else {
                                                    if (f19 > f21) {
                                                        f22 = f19 - f21;
                                                        if (f22 >= 1.0f) {
                                                            SubcomposeLayout = SubcomposeLayout;
                                                            z32 = z21117;
                                                            l1.b1 b1Var110 = b1Var4;
                                                            int iCeil15 = (int) Math.ceil((float) (Math.log(f22 + 1) / hz.a.f33863a));
                                                            int i411113 = 2;
                                                            int i411114 = iCeil15 + 2;
                                                            f23 = f19;
                                                            int i411115 = 0;
                                                            f24 = f21;
                                                            List list111 = list2;
                                                            float f2113 = f24;
                                                            while (true) {
                                                                f25 = f23 - f24;
                                                                if (f25 >= 1.0f && i411115 < i411114) {
                                                                    i411115++;
                                                                    float f29 = (f25 / i411113) + f24;
                                                                    if (f29 == f24 || f29 == f23) {
                                                                        break;
                                                                    }
                                                                    b1Var110 = b1Var110;
                                                                    List list6 = list111;
                                                                    float f30 = f24;
                                                                    i411114 = i411114;
                                                                    qy.r rVarD5 = e.D(linkedHashMap17, b1Var110, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f29);
                                                                    List list7 = (List) rVarD5.f48506b;
                                                                    if (((Boolean) rVarD5.f48507c).booleanValue()) {
                                                                        f24 = f30;
                                                                        f23 = f29;
                                                                        list111 = list6;
                                                                        i411113 = 2;
                                                                    } else {
                                                                        f24 = f29;
                                                                        f2113 = f24;
                                                                        i411113 = 2;
                                                                        list111 = list7;
                                                                    }
                                                                } else {
                                                                    break;
                                                                }
                                                            }
                                                            yVar.f38361a = list111;
                                                            f18 = f2113;
                                                        } else {
                                                            SubcomposeLayout = SubcomposeLayout;
                                                            z32 = z21117;
                                                            SubcomposeLayout = SubcomposeLayout;
                                                            z32 = z21117;
                                                            yVar.f38361a = list2;
                                                            f18 = f21;
                                                        }
                                                    } else {
                                                        SubcomposeLayout = SubcomposeLayout;
                                                        z32 = z21117;
                                                        SubcomposeLayout = SubcomposeLayout;
                                                        z32 = z21117;
                                                        yVar.f38361a = list2;
                                                        f18 = f21;
                                                    }
                                                    iR = e.R(i38, (List) yVar.f38361a);
                                                    iQ = e.Q(i39, (List) yVar.f38361a);
                                                    j16 = 4294967296L;
                                                    b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f18)));
                                                }
                                            }
                                        } else {
                                            yVar.f38361a = list;
                                            int iR17 = e.R(i38, list);
                                            iQ = e.Q(i39, list);
                                            b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f19)));
                                            f18 = f19;
                                            iR = iR17;
                                        }
                                        j16 = 4294967296L;
                                    }
                                    cVar2.invoke(new v3.o(fr.j3.L(j16, f18)));
                                    iH = v3.a.h(aVar.f53483a);
                                    if (iQ > iH) {
                                        i37 = iH;
                                    } else {
                                        i37 = iQ;
                                    }
                                    iG = v3.a.g(aVar.f53483a);
                                    if (iR > iG) {
                                        iR = iG;
                                    }
                                    System.currentTimeMillis();
                                    ((List) yVar.f38361a).size();
                                    final j0.f fVar16 = fVar;
                                    final z1.i iVar1117 = iVar8;
                                    final z1.i iVar1118 = iVar3;
                                    return SubcomposeLayout.q0(i37, iR, ry.s.f50855a, new fz.c() { // from class: dt.n3
                                        /* JADX WARN: Code duplicated, block: B:29:0x008d  */
                                        @Override // fz.c
                                        public final Object invoke(Object obj3) {
                                            Integer num;
                                            int i411116;
                                            z1.i iVar1119;
                                            int iA;
                                            w2.f1 layout = (w2.f1) obj3;
                                            kotlin.jvm.internal.m.f(layout, "$this$layout");
                                            int i411117 = 0;
                                            int i411118 = 0;
                                            for (List<w2.g1> list112 : (Iterable) yVar.f38361a) {
                                                if (!list112.isEmpty()) {
                                                    Iterator it = list112.iterator();
                                                    if (it.hasNext()) {
                                                        Integer numValueOf = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                        while (it.hasNext()) {
                                                            Integer numValueOf2 = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                            if (numValueOf.compareTo(numValueOf2) < 0) {
                                                                numValueOf = numValueOf2;
                                                            }
                                                        }
                                                        num = numValueOf;
                                                    } else {
                                                        num = null;
                                                    }
                                                    int iIntValue3 = num != null ? num.intValue() : 0;
                                                    int size = list112.size() - 1;
                                                    if (size < 0) {
                                                        size = 0;
                                                    }
                                                    int i411119 = i39;
                                                    int i4111110 = size * i411119;
                                                    Iterator it2 = list112.iterator();
                                                    int i4111111 = 0;
                                                    while (it2.hasNext()) {
                                                        i4111111 += ((w2.g1) it2.next()).f54501a;
                                                    }
                                                    int i50 = i4111111 + i4111110;
                                                    j0.b bVar = j0.i.f35303a;
                                                    j0.f fVar17 = fVar16;
                                                    if (kotlin.jvm.internal.m.a(fVar17, bVar)) {
                                                        i411116 = 0;
                                                    } else {
                                                        boolean zA = kotlin.jvm.internal.m.a(fVar17, j0.i.f35307e);
                                                        int i51 = i37;
                                                        if (zA) {
                                                            int i52 = i51 - i50;
                                                            if (i52 < 0) {
                                                                i52 = 0;
                                                            }
                                                            i411116 = i52 / 2;
                                                        } else if (!kotlin.jvm.internal.m.a(fVar17, j0.i.f35304b) || (i411116 = i51 - i50) < 0) {
                                                            i411116 = 0;
                                                        }
                                                    }
                                                    for (w2.g1 g1Var : list112) {
                                                        if (i411118 != 0 || (iVar1119 = iVar1117) == null) {
                                                            iVar1119 = iVar1118;
                                                        }
                                                        if (kotlin.jvm.internal.m.a(iVar1119, z1.c.L)) {
                                                            iA = 0;
                                                        } else {
                                                            z1.i iVar11110 = z1.c.M;
                                                            iA = kotlin.jvm.internal.m.a(iVar1119, iVar11110) ? (iIntValue3 - g1Var.f54502b) / 2 : kotlin.jvm.internal.m.a(iVar1119, z1.c.N) ? iIntValue3 - g1Var.f54502b : iVar11110.a(g1Var.f54502b, iIntValue3);
                                                        }
                                                        w2.f1.k(layout, g1Var, i411116, iA + i411117);
                                                        i411116 += g1Var.f54501a + i411119;
                                                        i411118++;
                                                    }
                                                    i411117 += iIntValue3 + i38;
                                                }
                                            }
                                            return qy.b0.f48488a;
                                        }
                                    });
                                }
                                v3.o.c(j17);
                                b1Var5.setValue(null);
                            }
                        } else {
                            z21117 = z33;
                            f15 = fC;
                            f16 = f26;
                        }
                        f17 = f15;
                        z30 = false;
                        iQ = 0;
                        i36 = 0;
                        if (z30) {
                            f19 = f16;
                            rVarD = e.D(linkedHashMap2, b1Var4, SubcomposeLayout, z21117, aVar, i39, i38, dVar2, i40, f19);
                            list = (List) rVarD.f48506b;
                            if (((Boolean) rVarD.f48507c).booleanValue()) {
                                yVar.f38361a = list;
                                int iR18 = e.R(i38, list);
                                iQ = e.Q(i39, list);
                                b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f19)));
                                f18 = f19;
                                iR = iR18;
                            } else {
                                if (list.size() == i40 + 1) {
                                    linkedHashMap = linkedHashMap2;
                                    z31 = false;
                                } else {
                                    linkedHashMap = linkedHashMap2;
                                    z31 = false;
                                }
                                if (z31) {
                                    f21 = f15;
                                    LinkedHashMap linkedHashMap18 = linkedHashMap;
                                    rVarD2 = e.D(linkedHashMap18, b1Var4, SubcomposeLayout, z32, aVar, i39, i38, dVar2, i40, f21);
                                    list2 = (List) rVarD2.f48506b;
                                    if (((Boolean) rVarD2.f48507c).booleanValue()) {
                                        SubcomposeLayout = SubcomposeLayout;
                                        z32 = z21117;
                                        yVar.f38361a = list2;
                                        iR = e.R(i38, list2);
                                        iQ = e.Q(i39, list2);
                                        b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f21)));
                                        f18 = f21;
                                    } else {
                                        if (f19 > f21) {
                                            f22 = f19 - f21;
                                            if (f22 >= 1.0f) {
                                                SubcomposeLayout = SubcomposeLayout;
                                                z32 = z21117;
                                                l1.b1 b1Var111 = b1Var4;
                                                int iCeil16 = (int) Math.ceil((float) (Math.log(f22 + 1) / hz.a.f33863a));
                                                int i411116 = 2;
                                                int i411117 = iCeil16 + 2;
                                                f23 = f19;
                                                int i411118 = 0;
                                                f24 = f21;
                                                List list112 = list2;
                                                float f2114 = f24;
                                                while (true) {
                                                    f25 = f23 - f24;
                                                    if (f25 >= 1.0f) {
                                                        break;
                                                    }
                                                    break;
                                                    break;
                                                }
                                                yVar.f38361a = list112;
                                                f18 = f2114;
                                            } else {
                                                SubcomposeLayout = SubcomposeLayout;
                                                z32 = z21117;
                                                SubcomposeLayout = SubcomposeLayout;
                                                z32 = z21117;
                                                yVar.f38361a = list2;
                                                f18 = f21;
                                            }
                                        } else {
                                            SubcomposeLayout = SubcomposeLayout;
                                            z32 = z21117;
                                            SubcomposeLayout = SubcomposeLayout;
                                            z32 = z21117;
                                            yVar.f38361a = list2;
                                            f18 = f21;
                                        }
                                        iR = e.R(i38, (List) yVar.f38361a);
                                        iQ = e.Q(i39, (List) yVar.f38361a);
                                        j16 = 4294967296L;
                                        b1Var5.setValue(new v3.o(fr.j3.L(4294967296L, f18)));
                                    }
                                } else {
                                    SubcomposeLayout = SubcomposeLayout;
                                    j16 = 4294967296L;
                                    f18 = f17;
                                    iR = i36;
                                }
                            }
                            j16 = 4294967296L;
                        } else {
                            j16 = 4294967296L;
                            f18 = f17;
                            iR = i36;
                        }
                        cVar2.invoke(new v3.o(fr.j3.L(j16, f18)));
                        iH = v3.a.h(aVar.f53483a);
                        if (iQ > iH) {
                            i37 = iH;
                        } else {
                            i37 = iQ;
                        }
                        iG = v3.a.g(aVar.f53483a);
                        if (iR > iG) {
                            iR = iG;
                        }
                        System.currentTimeMillis();
                        ((List) yVar.f38361a).size();
                        final j0.f fVar17 = fVar;
                        final z1.i iVar1119 = iVar8;
                        final z1.i iVar11110 = iVar3;
                        return SubcomposeLayout.q0(i37, iR, ry.s.f50855a, new fz.c() { // from class: dt.n3
                            /* JADX WARN: Code duplicated, block: B:29:0x008d  */
                            @Override // fz.c
                            public final Object invoke(Object obj3) {
                                Integer num;
                                int i411119;
                                z1.i iVar11111;
                                int iA;
                                w2.f1 layout = (w2.f1) obj3;
                                kotlin.jvm.internal.m.f(layout, "$this$layout");
                                int i4111110 = 0;
                                int i4111111 = 0;
                                for (List<w2.g1> list113 : (Iterable) yVar.f38361a) {
                                    if (!list113.isEmpty()) {
                                        Iterator it = list113.iterator();
                                        if (it.hasNext()) {
                                            Integer numValueOf = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                            while (it.hasNext()) {
                                                Integer numValueOf2 = Integer.valueOf(((w2.g1) it.next()).f54502b);
                                                if (numValueOf.compareTo(numValueOf2) < 0) {
                                                    numValueOf = numValueOf2;
                                                }
                                            }
                                            num = numValueOf;
                                        } else {
                                            num = null;
                                        }
                                        int iIntValue3 = num != null ? num.intValue() : 0;
                                        int size = list113.size() - 1;
                                        if (size < 0) {
                                            size = 0;
                                        }
                                        int i4111112 = i39;
                                        int i4111113 = size * i4111112;
                                        Iterator it2 = list113.iterator();
                                        int i4111114 = 0;
                                        while (it2.hasNext()) {
                                            i4111114 += ((w2.g1) it2.next()).f54501a;
                                        }
                                        int i50 = i4111114 + i4111113;
                                        j0.b bVar = j0.i.f35303a;
                                        j0.f fVar18 = fVar17;
                                        if (kotlin.jvm.internal.m.a(fVar18, bVar)) {
                                            i411119 = 0;
                                        } else {
                                            boolean zA = kotlin.jvm.internal.m.a(fVar18, j0.i.f35307e);
                                            int i51 = i37;
                                            if (zA) {
                                                int i52 = i51 - i50;
                                                if (i52 < 0) {
                                                    i52 = 0;
                                                }
                                                i411119 = i52 / 2;
                                            } else if (!kotlin.jvm.internal.m.a(fVar18, j0.i.f35304b) || (i411119 = i51 - i50) < 0) {
                                                i411119 = 0;
                                            }
                                        }
                                        for (w2.g1 g1Var : list113) {
                                            if (i4111111 != 0 || (iVar11111 = iVar1119) == null) {
                                                iVar11111 = iVar11110;
                                            }
                                            if (kotlin.jvm.internal.m.a(iVar11111, z1.c.L)) {
                                                iA = 0;
                                            } else {
                                                z1.i iVar11112 = z1.c.M;
                                                iA = kotlin.jvm.internal.m.a(iVar11111, iVar11112) ? (iIntValue3 - g1Var.f54502b) / 2 : kotlin.jvm.internal.m.a(iVar11111, z1.c.N) ? iIntValue3 - g1Var.f54502b : iVar11112.a(g1Var.f54502b, iIntValue3);
                                            }
                                            w2.f1.k(layout, g1Var, i411119, iA + i4111110);
                                            i411119 += g1Var.f54501a + i4111112;
                                            i4111111++;
                                        }
                                        i4111110 += iIntValue3 + i38;
                                    }
                                }
                                return qy.b0.f48488a;
                            }
                        });
                    }
                };
                sVar.o0(eVar15);
                objQ8 = eVar15;
            }
            w2.a0.b(rVar12, (fz.e) objQ8, sVar, i15 & 14, 0);
            i26 = i29;
            rVar3 = rVar12;
            f13 = f14;
            j12 = j13;
            iVar6 = iVar8;
            iVar5 = iVar3;
        } else {
            sVar = sVar2;
            sVar.W();
            i26 = i11;
            rVar3 = rVar2;
            f13 = f12;
            j12 = jA;
            iVar5 = iVar3;
            iVar6 = iVar4;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: dt.m3
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(i12 | 1);
                    int iM2 = l1.t.M(i13);
                    e.C(rVar3, fVar, iVar5, iVar6, z11, currentTextStyle, f13, f11, i26, j12, dVar, (l1.n) obj, iM, iM2, i14);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x01be  */
    public static final qy.r D(LinkedHashMap linkedHashMap, l1.b1 b1Var, w2.q1 q1Var, boolean z11, v3.a aVar, int i11, int i12, t1.d dVar, int i13, float f5) {
        List list;
        qy.r rVar = (qy.r) linkedHashMap.get(Float.valueOf(f5));
        if (rVar != null) {
            return rVar;
        }
        j3.y0 y0VarA = j3.y0.a((j3.y0) b1Var.getValue(), 0L, fr.j3.L(4294967296L, f5), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777213);
        String str = "measure_" + f5;
        if (linkedHashMap.containsKey(Float.valueOf(f5))) {
            Object obj = linkedHashMap.get(Float.valueOf(f5));
            kotlin.jvm.internal.m.c(obj);
            return (qy.r) obj;
        }
        boolean z12 = true;
        List listC = q1Var.C(str, new t1.d(new ch.z(21, y0VarA, dVar), true, -1326224698));
        ArrayList arrayList = new ArrayList(ry.n.W(listC, 10));
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(((w2.p0) it.next()).B(aVar.f53483a));
        }
        long j11 = aVar.f53483a;
        ArrayList arrayList2 = new ArrayList();
        if (!arrayList.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList.size();
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            while (i16 < size) {
                Object obj2 = arrayList.get(i16);
                i16++;
                int i17 = i14 + 1;
                if (i14 < 0) {
                    ns.o.V();
                    throw null;
                }
                w2.g1 g1Var = (w2.g1) obj2;
                int i18 = g1Var.f54501a;
                int i19 = !arrayList3.isEmpty() ? i11 : 0;
                if (!arrayList3.isEmpty() || i18 <= v3.a.h(j11)) {
                    if (arrayList3.isEmpty() || i15 + i19 + i18 <= v3.a.h(j11)) {
                        arrayList3.add(g1Var);
                        i18 = i19 + i18 + i15;
                    } else {
                        arrayList2.add(arrayList3);
                        arrayList3 = ns.o.M(g1Var);
                    }
                    i15 = i18;
                } else {
                    if (!arrayList3.isEmpty()) {
                        arrayList2.add(arrayList3);
                    }
                    arrayList2.add(ns.o.K(g1Var));
                    arrayList3 = new ArrayList();
                    i15 = 0;
                }
                i14 = i17;
            }
            if (!arrayList3.isEmpty()) {
                arrayList2.add(arrayList3);
            }
            if (!z11) {
                z12 = true;
            } else if (arrayList2.size() <= 1 || ((List) ry.m.z0(arrayList2)).size() != 1 || (list = (List) ry.m.t0(arrayList2.size() - 2, arrayList2)) == null || !(!list.isEmpty())) {
                z12 = true;
            } else {
                List listL = ns.o.L((w2.g1) ry.m.z0(list), (w2.g1) ry.m.q0((List) ry.m.z0(arrayList2)));
                Iterator it2 = listL.iterator();
                int i21 = 0;
                while (it2.hasNext()) {
                    i21 += ((w2.g1) it2.next()).f54501a;
                }
                if (i21 + (i11 < 0 ? 0 : i11) <= v3.a.h(j11)) {
                    List listL0 = ry.m.l0(1, list);
                    if (listL0.isEmpty()) {
                        arrayList2.remove(arrayList2.size() - 2);
                    } else {
                        arrayList2.set(arrayList2.size() - 2, listL0);
                    }
                    z12 = true;
                    arrayList2.set(arrayList2.size() - 1, listL);
                } else {
                    z12 = true;
                }
            }
        }
        int iR = R(i12, arrayList2);
        int iQ = Q(i11, arrayList2);
        if (arrayList2.size() <= i13 && iR <= v3.a.g(j11) && iQ <= v3.a.h(j11)) {
            z12 = false;
        }
        arrayList2.size();
        qy.r rVar2 = new qy.r(arrayList, arrayList2, Boolean.valueOf(z12));
        linkedHashMap.put(Float.valueOf(f5), rVar2);
        return rVar2;
    }

    public static final void E(final long j11, final float f5, long j12, long j13, final float f11, final boolean z11, final fz.c cVar, final boolean z12, final fz.a aVar, final t1.d dVar, l1.n nVar, final int i11) {
        int i12;
        float f12;
        final long j14;
        final long j15;
        int i13;
        final long j16;
        final long j17;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1913823224);
        if ((i11 & 6) == 0) {
            i12 = (sVar.e(j11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            f12 = f5;
            i12 |= sVar.c(f12) ? 32 : 16;
        } else {
            f12 = f5;
        }
        if ((i11 & 384) == 0) {
            i12 |= 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.c(f11) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.g(z11) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar.h(cVar) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= sVar.g(z12) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= sVar.h(aVar) ? 67108864 : 33554432;
        }
        if ((805306368 & i11) == 0) {
            i12 |= sVar.h(dVar) ? 536870912 : 268435456;
        }
        if (sVar.T(i12 & 1, (306783379 & i12) != 306783378)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                l1.c3 c3Var = h1.v1.f31180a;
                i13 = i12 & (-8065);
                j16 = ((h1.s1) sVar.j(c3Var)).f31035r;
                j17 = ((h1.s1) sVar.j(c3Var)).A;
            } else {
                sVar.W();
                i13 = i12 & (-8065);
                j16 = j12;
                j17 = j13;
            }
            sVar.q();
            final float f13 = f12;
            z3.k.b(null, j11, aVar, new z3.z(z12, 11), t1.e.d(-960996325, new fz.e() { // from class: dt.j0
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    l1.n nVar2 = (l1.n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    l1.s sVar2 = (l1.s) nVar2;
                    if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        z1.r rVarO = w2.a0.o(z1.o.f58481a, cVar);
                        float f14 = f11;
                        boolean zC = sVar2.c(f14);
                        boolean z13 = z11;
                        boolean zG = zC | sVar2.g(z13);
                        long j18 = j16;
                        boolean zE = zG | sVar2.e(j18);
                        long j19 = j17;
                        boolean zE2 = zE | sVar2.e(j19);
                        Object objQ = sVar2.Q();
                        if (zE2 || objQ == l1.m.f39353a) {
                            objQ = new d0(f14, 0, j18, j19, z13);
                            sVar2.o0(objQ);
                        }
                        z1.r rVarI = j0.e2.i(j0.e2.s(d2.h.e(rVarO, (fz.c) objQ), f13 * 2), 52, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                        int iHashCode = Long.hashCode(sVar2.T);
                        l1.q1 q1VarL = sVar2.l();
                        z1.r rVarC = z1.a.c(sVar2, rVarI);
                        y2.k.J.getClass();
                        y2.i iVar = y2.j.f56913b;
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar);
                        } else {
                            sVar2.r0();
                        }
                        l1.t.J(y2.j.f56917f, q0VarD, sVar2);
                        l1.t.J(y2.j.f56916e, q1VarL, sVar2);
                        y2.h hVar = y2.j.f56918g;
                        if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                        }
                        l1.t.J(y2.j.f56915d, rVarC, sVar2);
                        hh.p0.x(0, dVar, sVar2, true);
                    } else {
                        sVar2.W();
                    }
                    return qy.b0.f48488a;
                }
            }, sVar), sVar, ((i13 << 3) & 112) | 24576 | ((i13 >> 18) & 896), 1);
            j14 = j16;
            j15 = j17;
        } else {
            sVar.W();
            j14 = j12;
            j15 = j13;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: dt.k0
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(i11 | 1);
                    e.E(j11, f5, j14, j15, f11, z11, cVar, z12, aVar, dVar, (l1.n) obj, iM);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void F(final qy.l lVar, final float f5, final boolean z11, final fz.a aVar, l1.n nVar, final int i11) {
        int i12;
        boolean z12;
        long jB;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-90680842);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(lVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.c(f5) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.g(z11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(aVar) ? 2048 : 1024;
        }
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            v3.c cVar = (v3.c) sVar.j(z2.g1.f58547h);
            float fE0 = cVar.e0(((Configuration) sVar.j(AndroidCompositionLocals_androidKt.f1199a)).screenHeightDp);
            Object obj = lVar.f48496b;
            float f11 = fE0 - ((int) (((v3.j) obj).f53492a & 4294967295L));
            float fE1 = cVar.e0(280);
            boolean z13 = f11 < fE1;
            float fE2 = cVar.e0(f5);
            if (z13) {
                sVar.d0(62184116);
                v3.j jVar = (v3.j) obj;
                long j11 = jVar.f53492a;
                jB = v3.j.a(iu.k.u(25, sVar), ((((int) (jVar.f53492a & 4294967295L)) - ((int) fE1)) - ((int) fE2)) - iu.k.u(4, sVar));
                z12 = false;
                sVar.p(false);
            } else {
                z12 = false;
                sVar.d0(62400186);
                jB = v3.j.b(iu.k.u(25, sVar), 0, 2, ((v3.j) obj).f53492a);
                sVar.p(false);
            }
            z3.k.b(null, jB, aVar, new z3.z(z11, z3.a0.SecureOff, z12, 51), t1.e.d(-275005479, new g0(z13, lVar, 0), sVar), sVar, ((i12 >> 3) & 896) | 24576, 1);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: dt.h0
                @Override // fz.e
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    e.F(lVar, f5, z11, aVar, (l1.n) obj2, l1.t.M(i11 | 1));
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void G(qy.l lVar, float f5, int i11, int i12, boolean z11, fz.a onDismiss, l1.n nVar, int i13) {
        kotlin.jvm.internal.m.f(onDismiss, "onDismiss");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(571122249);
        int i14 = i13 | (sVar.h(lVar) ? 4 : 2) | (sVar.c(f5) ? 32 : 16) | (sVar.d(i11) ? 256 : 128) | (sVar.d(i12) ? 2048 : 1024) | (sVar.g(z11) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.h(onDismiss) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536);
        if (!sVar.T(i14 & 1, (74899 & i14) != 74898)) {
            sVar.W();
        } else if (((CourseWord) lVar.f48495a).getExplain().length() > 0) {
            sVar.d0(1937787183);
            int i15 = i14 & 126;
            int i16 = i14 >> 6;
            F(lVar, f5, z11, onDismiss, sVar, i15 | (i16 & 896) | (i16 & 7168));
            sVar.p(false);
        } else {
            sVar.d0(1937905572);
            H(lVar, f5, i11, i12, z11, onDismiss, sVar, i14 & 524286);
            sVar = sVar;
            sVar.p(false);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new t(lVar, f5, i11, i12, z11, onDismiss, i13);
        }
    }

    public static final void H(final qy.l lVar, final float f5, final int i11, final int i12, final boolean z11, final fz.a aVar, l1.n nVar, final int i13) {
        int i14;
        l1.s sVar;
        int i15;
        final float f11;
        Object obj = lVar.f48496b;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-508629462);
        if ((i13 & 6) == 0) {
            i14 = (sVar2.h(lVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= sVar2.c(f5) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= sVar2.d(i11) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= sVar2.d(i12) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i14 |= sVar2.g(z11) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i13) == 0) {
            i14 |= sVar2.h(aVar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if (sVar2.T(i14 & 1, (74899 & i14) != 74898)) {
            v3.c cVar = (v3.c) sVar2.j(z2.g1.f58547h);
            Configuration configuration = (Configuration) sVar2.j(AndroidCompositionLocals_androidKt.f1199a);
            float fE0 = cVar.e0(configuration.screenWidthDp);
            float fE1 = (cVar.e0(configuration.screenHeightDp) - i11) - i12;
            float f12 = 75;
            float fE2 = cVar.e0(f12) * 2;
            float f13 = fE0 - fE2;
            if (f13 < CropImageView.DEFAULT_ASPECT_RATIO) {
                f13 = 0.0f;
            }
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.B(new v3.l(0L));
                sVar2.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            float fE3 = ((int) (((v3.l) b1Var.getValue()).f53498a & 4294967295L)) > 0 ? (int) (((v3.l) b1Var.getValue()).f53498a & 4294967295L) : cVar.e0(80);
            float f14 = (int) (((v3.j) obj).f53492a >> 32);
            if (iu.k.p(sVar2) == -1.0f) {
                f14 = fE0 - f14;
            }
            float f15 = f14;
            float f16 = (int) (((v3.j) obj).f53492a & 4294967295L);
            float fE4 = (f16 - cVar.e0(f5)) - cVar.e0(4);
            boolean z12 = fE1 - f16 < fE3;
            float fK = hz.b.k(f15 - (fE2 / 2.0f), CropImageView.DEFAULT_ASPECT_RATIO, f13);
            float f17 = f15 - fK;
            if (z12) {
                float f18 = fE4 - fE3;
                if (f18 < CropImageView.DEFAULT_ASPECT_RATIO) {
                    f18 = 0.0f;
                }
                f16 = f18;
            }
            boolean z13 = z12;
            boolean z14 = !z13;
            if (z13) {
                i15 = 16;
                f11 = 16;
            } else {
                f11 = 26;
                i15 = 16;
            }
            final float f19 = !z13 ? i15 : 26;
            int i16 = i14;
            long jQ = (((long) hz.b.Q(f16)) & 4294967295L) | (((long) hz.b.Q(fK)) << 32);
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = new bp.h0(10, b1Var);
                sVar2.o0(objQ2);
            }
            int i17 = i16 << 9;
            sVar = sVar2;
            E(jQ, f12, 0L, 0L, f17, z14, (fz.c) objQ2, z11, aVar, t1.e.d(457092735, new fz.e() { // from class: dt.e0
                @Override // fz.e
                public final Object invoke(Object obj2, Object obj3) {
                    boolean zContains;
                    boolean z15;
                    l1.n nVar2 = (l1.n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    l1.s sVar3 = (l1.s) nVar2;
                    if (sVar3.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        float f21 = 12;
                        z1.o oVar = z1.o.f58481a;
                        z1.r rVarE = j0.e2.e(j0.c.D(oVar, f21, f11, f21, f19), 1.0f);
                        w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                        int iHashCode = Long.hashCode(sVar3.T);
                        l1.q1 q1VarL = sVar3.l();
                        z1.r rVarC = z1.a.c(sVar3, rVarE);
                        y2.k.J.getClass();
                        y2.i iVar = y2.j.f56913b;
                        sVar3.h0();
                        if (sVar3.S) {
                            sVar3.k(iVar);
                        } else {
                            sVar3.r0();
                        }
                        y2.h hVar = y2.j.f56917f;
                        l1.t.J(hVar, q0VarD, sVar3);
                        y2.h hVar2 = y2.j.f56916e;
                        l1.t.J(hVar2, q1VarL, sVar3);
                        y2.h hVar3 = y2.j.f56918g;
                        if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar3, iHashCode, hVar3);
                        }
                        y2.h hVar4 = y2.j.f56915d;
                        l1.t.J(hVar4, rVarC, sVar3);
                        z1.h hVar5 = z1.c.P;
                        z1.r rVarE2 = j0.e2.e(oVar, 1.0f);
                        j0.u uVarA = j0.t.a(j0.i.f35305c, hVar5, sVar3, 48);
                        int iHashCode2 = Long.hashCode(sVar3.T);
                        l1.q1 q1VarL2 = sVar3.l();
                        z1.r rVarC2 = z1.a.c(sVar3, rVarE2);
                        sVar3.h0();
                        if (sVar3.S) {
                            sVar3.k(iVar);
                        } else {
                            sVar3.r0();
                        }
                        l1.t.J(hVar, uVarA, sVar3);
                        l1.t.J(hVar2, q1VarL2, sVar3);
                        if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode2))) {
                            defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar3);
                        }
                        l1.t.J(hVar4, rVarC2, sVar3);
                        CourseWord courseWord = (CourseWord) lVar.f48495a;
                        String strQ0 = oz.x.q0(courseWord.getTranslation(), ";", "\n");
                        l1.d0 d0Var = ua.f31167a;
                        ua.b(strQ0, j0.c.C(j0.e2.e(oVar, 1.0f), 28, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar3.j(d0Var), 0L, fr.j3.A(16), n3.s.H, null, null, 0L, null, null, 3, 0, 0L, null, 16744441), sVar3, 48, 0, 65532);
                        l1.s sVar4 = sVar3;
                        sVar4.d0(-1606354678);
                        if (courseWord.getPos().length() > 0) {
                            sVar4.d0(-1606353622);
                            zContains = ry.l.m0(new Integer[]{4, 14, 47, 48, 5, 15, 53, 54}).contains(Integer.valueOf(((Number) sVar4.j(ju.f.f37370d)).intValue()));
                            sVar4.p(false);
                        } else {
                            sVar4.d0(1742646507);
                            sVar4.p(false);
                            zContains = false;
                        }
                        if (zContains) {
                            sVar4.d0(1742670816);
                            ua.b(courseWord.getPos(), j0.e2.e(oVar, 1.0f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar4.j(d0Var), g2.f0.e(4287203721L), fr.j3.A(12), null, new n3.o(1), n3.i.f43155c, 0L, null, null, 3, 0, 0L, null, 16744404), sVar4, 48, 0, 65532);
                            sVar4 = sVar4;
                            z15 = false;
                            sVar4.p(false);
                        } else {
                            if (ry.l.D(new Integer[]{12, 1}, Integer.valueOf(((Number) sVar4.j(ju.f.f37370d)).intValue()))) {
                                sVar4.d0(1743252562);
                                ua.b(courseWord.getZhuYin(), j0.e2.e(oVar, 1.0f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar4.j(d0Var), g2.f0.e(4287203721L), fr.j3.A(12), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar4, 48, 0, 65532);
                                sVar4 = sVar4;
                                z15 = false;
                            } else {
                                z15 = false;
                                sVar4.d0(1724387295);
                            }
                            sVar4.p(z15);
                        }
                        sVar4.p(z15);
                        sVar4.p(true);
                        v2.m(courseWord.getWordId(), ((h1.s1) sVar4.j(h1.v1.f31180a)).f31036s, j0.c.x(j0.r.f35391a.a(oVar, z1.c.f58465c), 10, -16), 20, sVar4, 3072, 0);
                        sVar4.p(true);
                    } else {
                        sVar3.W();
                    }
                    return qy.b0.f48488a;
                }
            }, sVar2), sVar, (29360128 & i17) | 806879280 | (i17 & 234881024));
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: dt.f0
                @Override // fz.e
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    e.H(lVar, f5, i11, i12, z11, aVar, (l1.n) obj2, l1.t.M(i13 | 1));
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void I(int i11, fz.a onDismissRequest, fz.c cVar, String sentenceTranslation, List literalTranslationWords, l1.n nVar) {
        int i12;
        l1.s sVar;
        kotlin.jvm.internal.m.f(literalTranslationWords, "literalTranslationWords");
        kotlin.jvm.internal.m.f(sentenceTranslation, "sentenceTranslation");
        kotlin.jvm.internal.m.f(onDismissRequest, "onDismissRequest");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1277319758);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.h(literalTranslationWords) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.f(sentenceTranslation) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar2.h(onDismissRequest) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.h(cVar) ? 2048 : 1024;
        }
        if (sVar2.T(i12 & 1, (i12 & 1171) != 1170)) {
            ht.l lVar = (ht.l) sVar2.j(v2.f24275a);
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.B(-1L);
                sVar2.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            boolean zH = sVar2.h(lVar);
            Object objQ2 = sVar2.Q();
            vy.d dVar = null;
            if (zH || objQ2 == gVar) {
                objQ2 = new av.f0(17, lVar, b1Var, dVar);
                sVar2.o0(objQ2);
            }
            l1.t.f((fz.e) objQ2, lVar, sVar2);
            sVar = sVar2;
            a6.a(onDismissRequest, null, a6.f(6, 2, null, sVar2), CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, t1.e.d(1402594575, new bp.y((Object) literalTranslationWords, (Object) lVar, (Object) cVar, (Object) sentenceTranslation, b1Var, 3), sVar2), sVar, (i12 >> 6) & 14, 384, 4090);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new cs.a(literalTranslationWords, sentenceTranslation, onDismissRequest, cVar, i11, 2);
        }
    }

    public static final void J(final int i11, final long j11, final fz.a aVar, z1.r rVar, l1.n nVar, final int i12) {
        l1.s sVar;
        final z1.r rVar2;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1117898411);
        int i13 = i12 | (sVar2.d(i11) ? 4 : 2) | (sVar2.e(j11) ? 32 : 16) | (sVar2.h(aVar) ? 256 : 128) | 3072;
        if (sVar2.T(i13 & 1, (i13 & 1171) != 1170)) {
            z1.o oVar = z1.o.f58481a;
            sVar = sVar2;
            i9.c(aVar, j0.e2.n(oVar, 40), false, r0.f.f48733a, g2.x.f28621h, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, d0.n.a(j11, 1), null, t1.e.d(-1121486730, new t0(i11, 0, (byte) 0), sVar2), sVar, ((i13 >> 6) & 14) | 24576, 740);
            rVar2 = oVar;
        } else {
            sVar = sVar2;
            sVar.W();
            rVar2 = rVar;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(i11, j11, aVar, rVar2, i12) { // from class: dt.u0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f24234a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f24235b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ fz.a f24236c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ z1.r f24237d;

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(1);
                    e.J(this.f24234a, this.f24235b, this.f24236c, this.f24237d, (l1.n) obj, iM);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void K(boolean z11, fz.a onDismiss, z1.r rVar, t1.d dVar, l1.n nVar, int i11) {
        t1.d dVar2;
        z1.r rVar2;
        kotlin.jvm.internal.m.f(onDismiss, "onDismiss");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1835981218);
        int i12 = i11 | (sVar.g(z11) ? 4 : 2) | (sVar.h(onDismiss) ? 32 : 16) | 384;
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarD = j0.e2.d(oVar, 1.0f);
            z1.j jVar = z1.c.H;
            w2.q0 q0VarD = j0.o.d(jVar, false);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarD);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, q0VarD, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            int i13 = (i12 & 14) | 200064;
            a0.j0.d(z11, null, a0.f1.e(null, 3), a0.f1.f(null, 3), null, t1.e.d(-1996114428, new bp.u(3, onDismiss), sVar), sVar, i13, 18);
            a0.l1 l1VarE = a0.f1.e(null, 3);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = new b0.k2(29);
                sVar.o0(objQ);
            }
            a0.l1 l1VarA = l1VarE.a(a0.f1.r((fz.c) objQ, 1));
            a0.m1 m1VarF = a0.f1.f(null, 3);
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = new b0.k2(29);
                sVar.o0(objQ2);
            }
            a0.m1 m1VarA = m1VarF.a(a0.f1.w((fz.c) objQ2, 1));
            z1.r rVarA = j0.r.f35391a.a(oVar, jVar);
            dVar2 = dVar;
            a0.j0.d(z11, rVarA, l1VarA, m1VarA, null, t1.e.d(1383575725, new at.p(6, onDismiss, dVar2), sVar), sVar, i13, 16);
            sVar.p(true);
            rVar2 = oVar;
        } else {
            dVar2 = dVar;
            sVar.W();
            rVar2 = rVar;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.d(z11, onDismiss, rVar2, dVar2, i11);
        }
    }

    public static final void L(int i11, fz.a onClick, l1.n nVar, z1.r rVar) {
        z1.r rVar2;
        kotlin.jvm.internal.m.f(onClick, "onClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-419379901);
        int i12 = (sVar.h(onClick) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            boolean z11 = (i12 & 112) == 32;
            Object objQ = sVar.Q();
            if (z11 || objQ == l1.m.f39353a) {
                objQ = new ch.o0(22, onClick);
                sVar.o0(objQ);
            }
            rVar2 = rVar;
            k7.i((fz.a) objQ, rVar2, false, null, null, null, null, f23766n, sVar, 805306416, 508);
        } else {
            rVar2 = rVar;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new u(i11, 1, onClick, rVar2);
        }
    }

    public static final void M(String str, l1.n nVar, int i11) {
        String str2 = str;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(803449276);
        int i12 = i11 | (sVar.f(str2) ? 4 : 2);
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarE = j0.c.E(j0.e2.e(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 16, CropImageView.DEFAULT_ASPECT_RATIO, 32, 5);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarE);
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
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            String strE0 = ub.a.e0(sVar, R.string.view_literal_translation_meaning);
            l1.d0 d0Var = ua.f31167a;
            j3.y0 y0Var = (j3.y0) sVar.j(d0Var);
            long jA = fr.j3.A(12);
            n3.s sVar2 = n3.s.L;
            l1.c3 c3Var = h1.v1.f31180a;
            ua.b(strE0, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(y0Var, ((h1.s1) sVar.j(c3Var)).f31036s, jA, sVar2, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, 0, 0, 65534);
            str2 = str;
            ua.b(str2, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar.j(d0Var), ((h1.s1) sVar.j(c3Var)).f31034q, fr.j3.A(16), n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, (i12 & 14) | 48, 0, 65532);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.e0(str2, i11, 6);
        }
    }

    public static final void N(final List displayCourseWords, final boolean z11, final List keyWordIds, final boolean z12, final int i11, final fz.a onClickAudioView, final fz.c onShowWordPopup, final int i12, final boolean z13, l1.n nVar, final int i13) {
        l1.s sVar;
        l1.x1 x1VarT;
        fz.e eVar;
        kotlin.jvm.internal.m.f(displayCourseWords, "displayCourseWords");
        kotlin.jvm.internal.m.f(keyWordIds, "keyWordIds");
        kotlin.jvm.internal.m.f(onClickAudioView, "onClickAudioView");
        kotlin.jvm.internal.m.f(onShowWordPopup, "onShowWordPopup");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(953542875);
        int i14 = (sVar2.h(displayCourseWords) ? 4 : 2) | i13;
        if ((i13 & 48) == 0) {
            i14 |= sVar2.g(z11) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= sVar2.h(keyWordIds) ? 256 : 128;
        }
        int i15 = i14 | (sVar2.g(z12) ? 2048 : 1024) | (sVar2.d(i11) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        if ((196608 & i13) == 0) {
            i15 |= sVar2.h(onClickAudioView) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        int i16 = i15 | (sVar2.h(onShowWordPopup) ? 1048576 : 524288);
        if ((12582912 & i13) == 0) {
            i16 |= sVar2.d(i12) ? 8388608 : 4194304;
        }
        int i17 = i16 | (sVar2.g(z13) ? 67108864 : 33554432);
        if (sVar2.T(i17 & 1, (38347923 & i17) != 38347922)) {
            boolean zBooleanValue = ((Boolean) sVar2.j(ju.f.f37378l)).booleanValue();
            Object objJ = sVar2.j(a0.f23628c);
            boolean zG = sVar2.g(zBooleanValue) | sVar2.f(objJ) | sVar2.f(displayCourseWords);
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (zG || objQ == gVar) {
                objQ = ep.a.s(!zBooleanValue, sVar2);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            if (!zBooleanValue || ((Boolean) b1Var.getValue()).booleanValue()) {
                sVar2.d0(72321191);
                sVar2.p(false);
                int i18 = i17 >> 15;
                int i19 = i17 << 12;
                sVar = sVar2;
                d4.a(displayCourseWords, null, keyWordIds, z13, false, null, j0.i.f35303a, z12, z11, i11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, i12, 0L, false, null, false, false, false, onClickAudioView, null, onShowWordPopup, sVar, (i17 & 14) | 1572864 | (i17 & 896) | (i18 & 7168) | (i19 & 29360128) | ((i17 << 21) & 234881024) | ((i17 << 15) & 1879048192), (i18 & 896) | (i19 & 1879048192), i18 & 112, 1567794);
            } else {
                sVar2.d0(82746739);
                String strU = se.k.u(" ", displayCourseWords);
                boolean zF = sVar2.f(b1Var);
                Object objQ2 = sVar2.Q();
                if (zF || objQ2 == gVar) {
                    objQ2 = new bp.h0(11, b1Var);
                    sVar2.o0(objQ2);
                }
                iu.k.m(strU, true, null, objJ, false, (fz.c) objQ2, j3.y0.a((j3.y0) sVar2.j(ua.f31167a), ((h1.s1) sVar2.j(h1.v1.f31180a)).f31034q, ct.c.c(sVar2), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), i12, 0, null, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, (i17 & 29360128) | 48, 7956);
                sVar2.p(false);
                x1VarT = sVar2.t();
                if (x1VarT == null) {
                    return;
                }
                final int i21 = 0;
                eVar = new fz.e() { // from class: dt.f1
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i21) {
                            case 0:
                                ((Integer) obj2).getClass();
                                e.N(displayCourseWords, z11, keyWordIds, z12, i11, onClickAudioView, onShowWordPopup, i12, z13, (l1.n) obj, l1.t.M(i13 | 1));
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                e.N(displayCourseWords, z11, keyWordIds, z12, i11, onClickAudioView, onShowWordPopup, i12, z13, (l1.n) obj, l1.t.M(i13 | 1));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
            }
            x1VarT.f39502d = eVar;
        }
        sVar = sVar2;
        sVar.W();
        x1VarT = sVar.t();
        if (x1VarT != null) {
            final int i22 = 1;
            eVar = new fz.e() { // from class: dt.f1
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    switch (i22) {
                        case 0:
                            ((Integer) obj2).getClass();
                            e.N(displayCourseWords, z11, keyWordIds, z12, i11, onClickAudioView, onShowWordPopup, i12, z13, (l1.n) obj, l1.t.M(i13 | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            e.N(displayCourseWords, z11, keyWordIds, z12, i11, onClickAudioView, onShowWordPopup, i12, z13, (l1.n) obj, l1.t.M(i13 | 1));
                            break;
                    }
                    return qy.b0.f48488a;
                }
            };
            x1VarT.f39502d = eVar;
        }
    }

    public static final void O(final qy.l lVar, l1.b1 b1Var, final boolean z11, final fz.a onClickBilling, l1.n nVar, int i11) {
        l1.s sVar;
        Object obj = lVar.f48495a;
        kotlin.jvm.internal.m.f(onClickBilling, "onClickBilling");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-722101206);
        int i12 = i11 | (sVar2.h(lVar) ? 4 : 2) | (sVar2.g(z11) ? 256 : 128) | (sVar2.h(onClickBilling) ? 2048 : 1024);
        if (sVar2.T(i12 & 1, (i12 & 1171) != 1170)) {
            final long j11 = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31033p;
            CourseWord courseWord = (CourseWord) obj;
            boolean zF = sVar2.f(courseWord.getExplain());
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                String str = "<html>\n<body bgcolor=\"#FFFFFF\" style=\"font-size:14px;\">\n<style>\n  @import url('https://fonts.googleapis.com/css2?family=Nunito:ital,wght@0,200..1000;1,200..1000&display=swap');\n  * {\n    font-family: \"Nunito\", sans-serif !important;\n  }\n  table {\n    width: 100%;\n    background: #FFFFFF;\n    border-collapse: collapse;\n  }\n  td, th {\n    font-size: 14px;\n    border: 1px solid #E5E5E5;\n    padding: 6px;\n    box-sizing: border-box;\n  }\n</style>" + courseWord.getExplain() + "</body>\n</html>";
                kotlin.jvm.internal.m.e(str, "toString(...)");
                objQ = oz.x.q0(str, "<td>", "<td style=\"font-size:14px;\">");
                sVar2.o0(objQ);
            }
            final wg.r rVarA = wg.t.a((String) objQ, sVar2, 30);
            final boolean zT = d0.n.t(sVar2);
            e8 e8VarF = a6.f(6, 2, null, sVar2);
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = xt.b.c();
                sVar2.o0(objQ2);
            }
            final vt.n0 n0Var = (vt.n0) objQ2;
            Object objQ3 = sVar2.Q();
            if (objQ3 == gVar) {
                objQ3 = l1.t.q(sVar2);
                sVar2.o0(objQ3);
            }
            final rz.b0 b0Var = (rz.b0) objQ3;
            Object objQ4 = sVar2.Q();
            if (objQ4 == gVar) {
                objQ4 = l1.t.B(null);
                sVar2.o0(objQ4);
            }
            final l1.b1 b1Var2 = (l1.b1) objQ4;
            Object objQ5 = sVar2.Q();
            if (objQ5 == gVar) {
                objQ5 = l1.t.B(Boolean.TRUE);
                sVar2.o0(objQ5);
            }
            final l1.b1 b1Var3 = (l1.b1) objQ5;
            Object objQ6 = sVar2.Q();
            if (objQ6 == gVar) {
                objQ6 = l1.t.B(Integer.valueOf(hz.b.l(((fr.o0) n0Var).f27733a.webViewTextZoom, 50, 150)));
                sVar2.o0(objQ6);
            }
            final l1.b1 b1Var4 = (l1.b1) objQ6;
            boolean zD = sVar2.d(((Number) b1Var4.getValue()).intValue());
            Object objQ7 = sVar2.Q();
            if (zD || objQ7 == gVar) {
                objQ7 = Boolean.valueOf(((Number) b1Var4.getValue()).intValue() < 150);
                sVar2.o0(objQ7);
            }
            final boolean zBooleanValue = ((Boolean) objQ7).booleanValue();
            boolean zD2 = sVar2.d(((Number) b1Var4.getValue()).intValue());
            Object objQ8 = sVar2.Q();
            if (zD2 || objQ8 == gVar) {
                objQ8 = Boolean.valueOf(((Number) b1Var4.getValue()).intValue() > 50);
                sVar2.o0(objQ8);
            }
            final boolean zBooleanValue2 = ((Boolean) objQ8).booleanValue();
            final c1 c1Var = (c1) sVar2.j(v2.f24278d);
            boolean z12 = c1Var != null;
            Boolean boolValueOf = Boolean.valueOf(z12);
            boolean z13 = z12;
            boolean zG = sVar2.g(z13) | sVar2.f(c1Var);
            Object objQ9 = sVar2.Q();
            if (zG || objQ9 == gVar) {
                objQ9 = new s3(z13, c1Var, 1);
                sVar2.o0(objQ9);
            }
            l1.t.c(boolValueOf, (fz.c) objQ9, sVar2);
            sVar = sVar2;
            iu.k.f(b1Var, null, e8VarF, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, t1.e.d(1016262094, new fz.f() { // from class: dt.a5
                @Override // fz.f
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    boolean zS;
                    CourseWord courseWord2;
                    z1.o oVar;
                    y2.h hVar;
                    y2.h hVar2;
                    y2.h hVar3;
                    z1.h hVar4;
                    y2.i iVar;
                    boolean z14;
                    y2.h hVar5;
                    l1.b1 b1Var5;
                    l1.b1 b1Var6;
                    boolean z15;
                    boolean z16;
                    boolean z17;
                    j0.v AppModalBottomSheet = (j0.v) obj2;
                    l1.n nVar2 = (l1.n) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    kotlin.jvm.internal.m.f(AppModalBottomSheet, "$this$AppModalBottomSheet");
                    l1.s sVar3 = (l1.s) nVar2;
                    boolean zT2 = sVar3.T(iIntValue & 1, (iIntValue & 17) != 16);
                    qy.b0 b0Var2 = qy.b0.f48488a;
                    if (!zT2) {
                        sVar3.W();
                        return b0Var2;
                    }
                    z1.o oVar2 = z1.o.f58481a;
                    z1.r rVarC = j0.e2.c(j0.e2.e(oVar2, 1.0f), 0.6f);
                    j0.d dVar = j0.i.f35305c;
                    z1.h hVar6 = z1.c.O;
                    j0.u uVarA = j0.t.a(dVar, hVar6, sVar3, 0);
                    int iHashCode = Long.hashCode(sVar3.T);
                    l1.q1 q1VarL = sVar3.l();
                    z1.r rVarC2 = z1.a.c(sVar3, rVarC);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar2);
                    } else {
                        sVar3.r0();
                    }
                    y2.h hVar7 = y2.j.f56917f;
                    l1.t.J(hVar7, uVarA, sVar3);
                    y2.h hVar8 = y2.j.f56916e;
                    l1.t.J(hVar8, q1VarL, sVar3);
                    y2.h hVar9 = y2.j.f56918g;
                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar3, iHashCode, hVar9);
                    }
                    y2.h hVar10 = y2.j.f56915d;
                    l1.t.J(hVar10, rVarC2, sVar3);
                    float f5 = 16;
                    z1.r rVarB = j0.c.B(j0.e2.e(oVar2, 1.0f), f5, 12);
                    l1.c3 c3Var = ju.f.f37370d;
                    j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, xt.d.w(((Number) sVar3.j(c3Var)).intValue()) ? z1.c.M : z1.c.N, sVar3, 0);
                    int iHashCode2 = Long.hashCode(sVar3.T);
                    l1.q1 q1VarL2 = sVar3.l();
                    z1.r rVarC3 = z1.a.c(sVar3, rVarB);
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar2);
                    } else {
                        sVar3.r0();
                    }
                    l1.t.J(hVar7, a2VarA, sVar3);
                    l1.t.J(hVar8, q1VarL2, sVar3);
                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar9);
                    }
                    l1.t.J(hVar10, rVarC3, sVar3);
                    sVar3.d0(-2035340707);
                    CourseWord courseWord3 = (CourseWord) lVar.f48495a;
                    if (courseWord3.getPos().length() > 0) {
                        sVar3.d0(-2035339429);
                        zS = xt.d.s(((Number) sVar3.j(c3Var)).intValue());
                        sVar3.p(false);
                    } else {
                        sVar3.d0(1328988378);
                        sVar3.p(false);
                        zS = false;
                    }
                    if (zS) {
                        sVar3.d0(1329011168);
                        hVar2 = hVar9;
                        hVar = hVar8;
                        iVar = iVar2;
                        oVar = oVar2;
                        hVar4 = hVar6;
                        courseWord2 = courseWord3;
                        hVar3 = hVar7;
                        ua.b(courseWord3.getPos(), j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 6, CropImageView.DEFAULT_ASPECT_RATIO, 11), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar3.j(ua.f31167a), g2.f0.e(4287203721L), fr.j3.A(12), null, new n3.o(1), n3.i.f43155c, 0L, null, null, 0, 0, 0L, null, 16777172), sVar3, 48, 0, 65532);
                        sVar3 = sVar3;
                        z14 = false;
                        sVar3.p(false);
                    } else {
                        courseWord2 = courseWord3;
                        oVar = oVar2;
                        hVar = hVar8;
                        hVar2 = hVar9;
                        hVar3 = hVar7;
                        hVar4 = hVar6;
                        if (xt.d.w(((Number) sVar3.j(c3Var)).intValue())) {
                            sVar3.d0(1329544306);
                            iVar = iVar2;
                            ua.b(courseWord2.getZhuYin(), j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 6, CropImageView.DEFAULT_ASPECT_RATIO, 11), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar3.j(ua.f31167a), g2.f0.e(4287203721L), fr.j3.A(14), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar3, 48, 0, 65532);
                            sVar3 = sVar3;
                            z14 = false;
                        } else {
                            iVar = iVar2;
                            z14 = false;
                            sVar3.d0(1322433774);
                        }
                        sVar3.p(z14);
                    }
                    sVar3.p(z14);
                    String translation = courseWord2.getTranslation();
                    l1.d0 d0Var = ua.f31167a;
                    j3.y0 y0VarA = j3.y0.a((j3.y0) sVar3.j(d0Var), 0L, fr.j3.A(16), n3.s.H, null, null, 0L, null, null, 5, 0, 0L, null, 16744441);
                    if (!(((double) 1.0f) > 0.0d)) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    l1.s sVar4 = sVar3;
                    ua.b(translation, new j0.i1(1.0f, true), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar4, 0, 0, 65532);
                    long wordId = courseWord2.getWordId();
                    l1.c3 c3Var2 = h1.v1.f31180a;
                    v2.m(wordId, ((h1.s1) sVar4.j(c3Var2)).f31036s, null, 22, sVar4, 3072, 4);
                    sVar4.p(true);
                    z1.o oVar3 = oVar;
                    k7.g(j0.e2.e(j0.c.E(oVar3, f5, 10, f5, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f), 1, 0L, sVar4, 48, 4);
                    z1.r rVarA2 = j0.v.a(oVar3, 1.0f);
                    Object objQ10 = sVar4.Q();
                    l1.b1 b1Var7 = b1Var3;
                    l1.g gVar2 = l1.m.f39353a;
                    if (objQ10 == gVar2) {
                        objQ10 = new f5(0, b1Var7);
                        sVar4.o0(objQ10);
                    }
                    z1.r rVarA3 = s2.g0.a(rVarA2, b0Var2, (PointerInputEventHandler) objQ10);
                    z1.j jVar = z1.c.f58463a;
                    w2.q0 q0VarD = j0.o.d(jVar, false);
                    int iHashCode3 = Long.hashCode(sVar4.T);
                    l1.q1 q1VarL3 = sVar4.l();
                    z1.r rVarC4 = z1.a.c(sVar4, rVarA3);
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar);
                    } else {
                        sVar4.r0();
                    }
                    l1.t.J(hVar3, q0VarD, sVar4);
                    y2.h hVar11 = hVar;
                    l1.t.J(hVar11, q1VarL3, sVar4);
                    if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode3))) {
                        hVar5 = hVar2;
                        defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar5);
                    } else {
                        hVar5 = hVar2;
                    }
                    l1.t.J(hVar10, rVarC4, sVar4);
                    z1.r rVarY = d0.n.y(j0.e2.d(j0.c.v(d0.n.h(oVar3, ((h1.s1) sVar4.j(c3Var2)).f31033p, g2.f0.f28556b)), 1.0f), d0.n.u(sVar4), true, 12);
                    j0.u uVarA2 = j0.t.a(dVar, hVar4, sVar4, 0);
                    int iHashCode4 = Long.hashCode(sVar4.T);
                    l1.q1 q1VarL4 = sVar4.l();
                    z1.r rVarC5 = z1.a.c(sVar4, rVarY);
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar);
                    } else {
                        sVar4.r0();
                    }
                    l1.t.J(hVar3, uVarA2, sVar4);
                    l1.t.J(hVar11, q1VarL4, sVar4);
                    if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode4))) {
                        defpackage.e.A(iHashCode4, sVar4, iHashCode4, hVar5);
                    }
                    l1.t.J(hVar10, rVarC5, sVar4);
                    long j12 = j11;
                    boolean zE = sVar4.e(j12);
                    boolean z18 = zT;
                    boolean zG2 = zE | sVar4.g(z18);
                    Object objQ11 = sVar4.Q();
                    l1.b1 b1Var8 = b1Var2;
                    l1.b1 b1Var9 = b1Var4;
                    if (zG2 || objQ11 == gVar2) {
                        objQ11 = new b5(j12, z18, b1Var8, b1Var9, b1Var7, 0);
                        b1Var5 = b1Var8;
                        b1Var6 = b1Var9;
                        sVar4.o0(objQ11);
                    } else {
                        b1Var6 = b1Var9;
                        b1Var5 = b1Var8;
                    }
                    y2.h hVar12 = hVar5;
                    l1.b1 b1Var10 = b1Var5;
                    y2.h hVar13 = hVar3;
                    qx.p.g(rVarA, null, false, null, (fz.c) objQ11, null, null, null, sVar4, 0, 494);
                    ua.b("Copyright @ 2026 LingoDeer. All rights reserved.", j0.c.A(j0.e2.e(oVar3, 1.0f), f5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar4.j(d0Var), ((h1.s1) sVar4.j(c3Var2)).f31036s, fr.j3.A(12), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar4, 54, 0, 65532);
                    sVar4.p(true);
                    boolean zBooleanValue3 = ((Boolean) b1Var7.getValue()).booleanValue();
                    z1.j jVar2 = z1.c.K;
                    j0.r rVar = j0.r.f35391a;
                    z1.r rVarE = j0.c.E(j0.c.v(rVar.a(oVar3, jVar2)), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f5, f5, 3);
                    a0.l1 l1VarE = a0.f1.e(null, 3);
                    Object objQ12 = sVar4.Q();
                    if (objQ12 == gVar2) {
                        objQ12 = new b0.k2(29);
                        sVar4.o0(objQ12);
                    }
                    a0.l1 l1VarA = l1VarE.a(a0.f1.r((fz.c) objQ12, 1));
                    a0.m1 m1VarF = a0.f1.f(null, 3);
                    Object objQ13 = sVar4.Q();
                    if (objQ13 == gVar2) {
                        objQ13 = new b0.k2(29);
                        sVar4.o0(objQ13);
                    }
                    a0.j0.c(zBooleanValue3, rVarE, l1VarA, m1VarF.a(a0.f1.w((fz.c) objQ13, 1)), null, t1.e.d(1945264634, new c5(b1Var7, zBooleanValue, b0Var, n0Var, zBooleanValue2, b1Var10, b1Var6), sVar4), sVar4, 1600518, 16);
                    if (z11) {
                        sVar4.d0(-1195070163);
                        z1.r rVarD = j0.e2.d(oVar3, 1.0f);
                        Object objQ14 = sVar4.Q();
                        if (objQ14 == gVar2) {
                            objQ14 = new ju.d(25);
                            sVar4.o0(objQ14);
                        }
                        z1.r rVarQ = iu.k.q(24582, 7, (fz.a) objQ14, sVar4, rVarD, false);
                        w2.q0 q0VarD2 = j0.o.d(jVar, false);
                        int iHashCode5 = Long.hashCode(sVar4.T);
                        l1.q1 q1VarL5 = sVar4.l();
                        z1.r rVarC6 = z1.a.c(sVar4, rVarQ);
                        sVar4.h0();
                        if (sVar4.S) {
                            sVar4.k(iVar);
                        } else {
                            sVar4.r0();
                        }
                        l1.t.J(hVar13, q0VarD2, sVar4);
                        l1.t.J(hVar11, q1VarL5, sVar4);
                        if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode5))) {
                            defpackage.e.A(iHashCode5, sVar4, iHashCode5, hVar12);
                        }
                        l1.t.J(hVar10, rVarC6, sVar4);
                        z15 = false;
                        ys.j3.a(0, onClickBilling, sVar4, rVar.a(j0.e2.c(j0.e2.e(oVar3, 1.0f), 1.0f), z1.c.f58464b));
                        z16 = true;
                        sVar4.p(true);
                    } else {
                        z15 = false;
                        z16 = true;
                        sVar4.d0(-1209378864);
                    }
                    sVar4.p(z15);
                    c1 c1Var2 = c1Var;
                    if (c1Var2 != null && c1Var2.f23695a == z16) {
                        sVar4.d0(-1194476792);
                        mt.g.a(6, c1Var2.f23696b, sVar4, null);
                        z17 = false;
                    } else {
                        z17 = false;
                        sVar4.d0(-1209378864);
                    }
                    sVar4.p(z17);
                    sVar4.p(true);
                    sVar4.p(true);
                    return b0Var2;
                }
            }, sVar2), sVar, 805306374, 506);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.d(lVar, b1Var, z11, onClickBilling, i11, 4);
        }
    }

    public static final Bundle P(ys.v vVar, ns.z zVar) {
        String str = zVar.f44041d;
        Bundle bundle = new Bundle();
        long j11 = vVar.f58285a;
        if (j11 > 0) {
            bundle.putString("lesson", String.valueOf(j11));
        }
        long j12 = vVar.f58286b;
        if (j12 > 0) {
            bundle.putString("unit", String.valueOf(j12));
        }
        if (!oz.q.K0(str)) {
            bundle.putString("question_type", str);
        }
        return bundle;
    }

    public static final int Q(int i11, List list) {
        Integer num;
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it = list.iterator();
        if (it.hasNext()) {
            List list2 = (List) it.next();
            Iterator it2 = list2.iterator();
            int i12 = 0;
            while (it2.hasNext()) {
                i12 += ((w2.g1) it2.next()).f54501a;
            }
            int size = list2.size() - 1;
            if (size < 0) {
                size = 0;
            }
            Integer numValueOf = Integer.valueOf((size * i11) + i12);
            while (it.hasNext()) {
                List list3 = (List) it.next();
                Iterator it3 = list3.iterator();
                int i13 = 0;
                while (it3.hasNext()) {
                    i13 += ((w2.g1) it3.next()).f54501a;
                }
                int size2 = list3.size() - 1;
                if (size2 < 0) {
                    size2 = 0;
                }
                Integer numValueOf2 = Integer.valueOf((size2 * i11) + i13);
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final int R(int i11, List list) {
        Integer num;
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it = list.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            if (it2.hasNext()) {
                Integer numValueOf = Integer.valueOf(((w2.g1) it2.next()).f54502b);
                while (it2.hasNext()) {
                    Integer numValueOf2 = Integer.valueOf(((w2.g1) it2.next()).f54502b);
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        numValueOf = numValueOf2;
                    }
                }
                num = numValueOf;
            } else {
                num = null;
            }
            iIntValue += num != null ? num.intValue() : 0;
        }
        int size = list.size() - 1;
        return ((size >= 0 ? size : 0) * i11) + iIntValue;
    }

    public static final void a(CourseWord courseWord, boolean z11, fz.c cVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1248054443);
        int i12 = (sVar.h(courseWord) ? 4 : 2) | i11 | (sVar.g(z11) ? 32 : 16) | (sVar.h(cVar) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            k7.k(null, r0.f.d(8), null, null, null, t1.e.d(104460897, new n2(cVar, courseWord, z11, 1), sVar), sVar, 196608, 29);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.b0(courseWord, z11, cVar, i11, 5);
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
    public static final void b(l1.b1 b1Var, final ns.z zVar, l1.n nVar, int i11) {
        int i12;
        int i13;
        long j11;
        Long l9;
        l1.b1 b1Var2;
        boolean z11;
        z5 z5Var;
        ur.a aVar;
        ys.v vVar;
        l1.b1 b1Var3;
        z5 z5Var2;
        boolean z12;
        l1.b1 b1Var4 = b1Var;
        long j12 = zVar.f44038a;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1570026208);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar.f(b1Var4) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(zVar) ? 32 : 16;
        }
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            sVar.d0(-1614864554);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(z5.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
            sVar.p(false);
            z5 z5Var3 = (z5) viewModelA;
            final l1.b1 b1VarO = l1.t.o(z5Var3.f50767e, sVar);
            final l1.b1 b1VarO2 = l1.t.o(z5Var3.f50768f, sVar);
            e20.a aVarC = w4.c.c(sVar, -1168520582, sVar, -1633490746);
            vy.d dVar = null;
            boolean zF = sVar.f(null) | sVar.f(aVarC);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = w4.c.e(ur.a.class, aVarC, null, null, sVar);
            }
            sVar.p(false);
            sVar.p(false);
            ur.a aVar2 = (ur.a) objQ;
            ys.v vVar2 = (ys.v) sVar.j(ys.w.f58298a);
            boolean z13 = ((w5) b1VarO.getValue()) instanceof v5;
            final Context context = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
            final String strE0 = ub.a.e0(sVar, R.string.tell_me_why_feedback_thanks);
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ2);
            }
            l1.b1 b1Var5 = (l1.b1) objQ2;
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar) {
                objQ3 = l1.t.B(null);
                sVar.o0(objQ3);
            }
            l1.b1 b1Var6 = (l1.b1) objQ3;
            Long lValueOf = Long.valueOf(j12);
            int i14 = i12 & 112;
            boolean zH = sVar.h(z5Var3) | (i14 == 32);
            Object objQ4 = sVar.Q();
            if (zH || objQ4 == gVar) {
                objQ4 = new av.f0(15, z5Var3, zVar, dVar);
                sVar.o0(objQ4);
            }
            l1.t.f((fz.e) objQ4, lValueOf, sVar);
            Object value = b1Var.getValue();
            Long lValueOf2 = Long.valueOf(j12);
            int i15 = i12 & 14;
            boolean zH2 = (i15 == 4) | sVar.h(z5Var3) | (i14 == 32);
            Object objQ5 = sVar.Q();
            if (zH2 || objQ5 == gVar) {
                i13 = i14;
                j11 = j12;
                l9 = lValueOf2;
                b1Var2 = b1Var6;
                z11 = z13;
                ad.x xVar = new ad.x(b1Var, z5Var3, zVar, b1Var2, null, 7);
                z5Var = z5Var3;
                sVar.o0(xVar);
                objQ5 = xVar;
            } else {
                z5Var = z5Var3;
                b1Var2 = b1Var6;
                z11 = z13;
                j11 = j12;
                l9 = lValueOf2;
                i13 = i14;
            }
            l1.t.g(value, l9, (fz.e) objQ5, sVar);
            Boolean boolValueOf = Boolean.valueOf(z11);
            Long lValueOf3 = Long.valueOf(j11);
            boolean zG = sVar.g(z11) | (i13 == 32) | sVar.h(aVar2) | sVar.f(vVar2);
            Object objQ6 = sVar.Q();
            if (zG || objQ6 == gVar) {
                bt.x2 x2Var = new bt.x2(z11, zVar, aVar2, b1Var2, vVar2, (vy.d) null);
                aVar = aVar2;
                vVar = vVar2;
                sVar.o0(x2Var);
                objQ6 = x2Var;
            } else {
                vVar = vVar2;
                aVar = aVar2;
            }
            l1.t.g(boolValueOf, lValueOf3, (fz.e) objQ6, sVar);
            if (((Boolean) b1Var5.getValue()).booleanValue()) {
                sVar.d0(458449232);
                Object objQ7 = sVar.Q();
                if (objQ7 == gVar) {
                    objQ7 = new z6(27, b1Var5);
                    sVar.o0(objQ7);
                }
                b1Var3 = b1Var5;
                z5Var2 = z5Var;
                z12 = false;
                k7.a((fz.a) objQ7, t1.e.d(637709741, new bp.t(z5Var2, zVar, b1Var3, b1Var2, 5), sVar), null, t1.e.d(921695279, new bp.s(b1Var3, 1, (byte) 0), sVar), null, f23757d, null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 1575990, 16308);
                sVar = sVar;
            } else {
                b1Var3 = b1Var5;
                z5Var2 = z5Var;
                z12 = false;
                sVar.d0(450999746);
            }
            sVar.p(z12);
            final z5 z5Var4 = z5Var2;
            final l1.b1 b1Var7 = b1Var3;
            final l1.b1 b1Var8 = b1Var2;
            final ur.a aVar3 = aVar;
            final ys.v vVar3 = vVar;
            b1Var4 = b1Var;
            iu.k.f(b1Var4, null, null, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, t1.e.d(-1718067780, new fz.f() { // from class: dt.y0
                @Override // fz.f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    j0.v AppModalBottomSheet = (j0.v) obj;
                    l1.n nVar2 = (l1.n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    z1.h hVar = z1.c.P;
                    kotlin.jvm.internal.m.f(AppModalBottomSheet, "$this$AppModalBottomSheet");
                    l1.s sVar2 = (l1.s) nVar2;
                    if (sVar2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                        w5 w5Var = (w5) b1VarO.getValue();
                        boolean z14 = w5Var instanceof u5;
                        t5 t5Var = t5.f50425a;
                        z0 z0Var = null;
                        if (!z14) {
                            if (w5Var instanceof v5) {
                                z0Var = new z0(((v5) w5Var).f50528a, true, false);
                            } else if (!(w5Var instanceof s5) && !kotlin.jvm.internal.m.a(w5Var, t5Var)) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        ns.z zVar2 = zVar;
                        l1.g gVar2 = l1.m.f39353a;
                        if (z0Var != null) {
                            sVar2.d0(168821745);
                            ns.r0 r0Var = z0Var.f24407a;
                            boolean z15 = z0Var.f24408b;
                            boolean z16 = z0Var.f24409c;
                            boolean zBooleanValue = ((Boolean) b1VarO2.getValue()).booleanValue();
                            ur.a aVar4 = aVar3;
                            boolean zH3 = sVar2.h(aVar4);
                            ys.v vVar4 = vVar3;
                            boolean zF2 = zH3 | sVar2.f(vVar4) | sVar2.f(zVar2);
                            Context context2 = context;
                            boolean zH4 = zF2 | sVar2.h(context2);
                            String str = strE0;
                            boolean zF3 = zH4 | sVar2.f(str);
                            Object objQ8 = sVar2.Q();
                            if (zF3 || objQ8 == gVar2) {
                                bp.x1 x1Var = new bp.x1(aVar4, context2, str, vVar4, zVar2, 4);
                                sVar2.o0(x1Var);
                                objQ8 = x1Var;
                            }
                            fz.a aVar5 = (fz.a) objQ8;
                            boolean zH5 = sVar2.h(aVar4) | sVar2.f(vVar4) | sVar2.f(zVar2);
                            Object objQ9 = sVar2.Q();
                            if (zH5 || objQ9 == gVar2) {
                                b0.k0 k0Var = new b0.k0(aVar4, vVar4, zVar2, b1Var7, 10);
                                sVar2.o0(k0Var);
                                objQ9 = k0Var;
                            }
                            e.g(r0Var, z15, z16, zBooleanValue, aVar5, (fz.a) objQ9, sVar2, 0);
                            sVar2.p(false);
                        } else {
                            sVar2.d0(169828005);
                            boolean zA = kotlin.jvm.internal.m.a(w5Var, t5Var);
                            z1.o oVar = z1.o.f58481a;
                            if (zA || z14) {
                                sVar2.d0(169914371);
                                z1.r rVarC = j0.e2.c(oVar, 0.9f);
                                j0.u uVarA = j0.t.a(j0.i.f35307e, hVar, sVar2, 54);
                                int iHashCode = Long.hashCode(sVar2.T);
                                l1.q1 q1VarL = sVar2.l();
                                z1.r rVarC2 = z1.a.c(sVar2, rVarC);
                                y2.k.J.getClass();
                                y2.i iVar = y2.j.f56913b;
                                sVar2.h0();
                                if (sVar2.S) {
                                    sVar2.k(iVar);
                                } else {
                                    sVar2.r0();
                                }
                                l1.t.J(y2.j.f56917f, uVarA, sVar2);
                                l1.t.J(y2.j.f56916e, q1VarL, sVar2);
                                y2.h hVar2 = y2.j.f56918g;
                                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar2);
                                }
                                l1.t.J(y2.j.f56915d, rVarC2, sVar2);
                                tv.a.f(ns.o.L(ub.a.e0(sVar2, R.string.tell_me_why_loading_1), ub.a.e0(sVar2, R.string.tell_me_why_loading_2), ub.a.e0(sVar2, R.string.tell_me_why_loading_3), ub.a.e0(sVar2, R.string.tell_me_why_loading_4)), sVar2, 0);
                                sVar2.p(true);
                                sVar2.p(false);
                            } else if (w5Var instanceof s5) {
                                sVar2.d0(170739281);
                                j0.u uVarA2 = j0.t.a(j0.i.f35307e, hVar, sVar2, 54);
                                int iHashCode2 = Long.hashCode(sVar2.T);
                                l1.q1 q1VarL2 = sVar2.l();
                                z1.r rVarC3 = z1.a.c(sVar2, oVar);
                                y2.k.J.getClass();
                                y2.i iVar2 = y2.j.f56913b;
                                sVar2.h0();
                                if (sVar2.S) {
                                    sVar2.k(iVar2);
                                } else {
                                    sVar2.r0();
                                }
                                l1.t.J(y2.j.f56917f, uVarA2, sVar2);
                                l1.t.J(y2.j.f56916e, q1VarL2, sVar2);
                                y2.h hVar3 = y2.j.f56918g;
                                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                                    defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
                                }
                                l1.t.J(y2.j.f56915d, rVarC3, sVar2);
                                ua.b(((s5) w5Var).f50374a, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar2.j(ua.f31167a), 0L, fr.j3.A(14), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777213), sVar2, 0, 0, 65534);
                                z5 z5Var5 = z5Var4;
                                boolean zH6 = sVar2.h(z5Var5) | sVar2.f(zVar2);
                                Object objQ10 = sVar2.Q();
                                if (zH6 || objQ10 == gVar2) {
                                    objQ10 = new androidx.lifecycle.compose.a(z5Var5, zVar2, b1Var8, 11);
                                    sVar2.o0(objQ10);
                                }
                                iu.k.e((fz.a) objQ10, j0.e2.e(oVar, 1.0f), false, 0L, null, e.f23758e, sVar2, 196656, 28);
                                sVar2 = sVar2;
                                sVar2.p(true);
                                sVar2.p(false);
                            } else {
                                sVar2.d0(-1795580320);
                                sVar2.p(false);
                            }
                            sVar2.p(false);
                        }
                    } else {
                        sVar2.W();
                    }
                    return qy.b0.f48488a;
                }
            }, sVar), sVar, i15 | 805306368, 510);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b0.t1(b1Var4, i11, 2, zVar);
        }
    }

    public static final void c(final String str, final String str2, final int i11, final long j11, final long j12, final long j13, final String str3, z1.r rVar, l1.n nVar, final int i12) {
        final z1.r rVar2;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1618416207);
        int i13 = 12582912 | i12 | (sVar.f(str) ? 4 : 2) | (sVar.f(str2) ? 32 : 16) | (sVar.d(i11) ? 256 : 128) | (sVar.e(j11) ? 2048 : 1024) | (sVar.e(j12) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.e(j13) ? 131072 : 65536);
        if (!sVar.T(i13 & 1, (4793491 & i13) != 4793490)) {
            sVar.W();
            rVar2 = rVar;
        } else {
            if (oz.q.K0(str2)) {
                l1.x1 x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new v0(str, str2, i11, j11, j12, j13, str3, i12);
                    return;
                }
                return;
            }
            boolean z11 = (458752 & i13) == 131072;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                objQ = new j3.p0(j13, 0L, n3.s.K, (n3.o) null, (n3.p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (u3.l) null, (g2.v0) null, 65530);
                sVar.o0(objQ);
            }
            j3.p0 p0Var = (j3.p0) objQ;
            boolean zF = ((i13 & 112) == 32) | sVar.f(p0Var);
            Object objQ2 = sVar.Q();
            if (zF || objQ2 == gVar) {
                if (oz.q.K0(str2)) {
                    objQ2 = new j3.h(BuildConfig.VERSION_NAME);
                } else {
                    String strG = ep.a.g("<", str3, ">");
                    String strG2 = ep.a.g("</", str3, ">");
                    j3.e eVar = new j3.e();
                    int length = 0;
                    while (length < str2.length()) {
                        int iI0 = oz.q.I0(str2, strG, length, false, 4);
                        if (iI0 == -1) {
                            String strSubstring = str2.substring(length);
                            kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                            eVar.d(strSubstring);
                            break;
                        }
                        if (iI0 > length) {
                            String strSubstring2 = str2.substring(length, iI0);
                            kotlin.jvm.internal.m.e(strSubstring2, "substring(...)");
                            eVar.d(strSubstring2);
                        }
                        int length2 = strG.length() + iI0;
                        String str4 = strG;
                        int iI1 = oz.q.I0(str2, strG2, length2, false, 4);
                        if (iI1 == -1) {
                            String strSubstring3 = str2.substring(iI0);
                            kotlin.jvm.internal.m.e(strSubstring3, "substring(...)");
                            eVar.d(strSubstring3);
                            break;
                        }
                        int i14 = eVar.i(p0Var);
                        try {
                            String strSubstring4 = str2.substring(length2, iI1);
                            kotlin.jvm.internal.m.e(strSubstring4, "substring(...)");
                            eVar.d(strSubstring4);
                            eVar.f(i14);
                            length = strG2.length() + iI1;
                            strG = str4;
                        } catch (Throwable th2) {
                            eVar.f(i14);
                            throw th2;
                        }
                    }
                    objQ2 = eVar.j();
                }
                sVar.o0(objQ2);
            }
            j3.h hVar = (j3.h) objQ2;
            z1.o oVar = z1.o.f58481a;
            float f5 = 12;
            z1.r rVarA = j0.c.A(d0.n.h(j0.e2.e(oVar, 1.0f), j12, r0.f.d(f5)), f5);
            j0.a2 a2VarA = j0.z1.a(j0.i.g(f5), z1.c.M, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarA);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar2 = y2.j.f56917f;
            l1.t.J(hVar2, a2VarA, sVar);
            y2.h hVar3 = y2.j.f56916e;
            l1.t.J(hVar3, q1VarL, sVar);
            y2.h hVar4 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
            }
            y2.h hVar5 = y2.j.f56915d;
            l1.t.J(hVar5, rVarC, sVar);
            z1.r rVarN = j0.e2.n(oVar, 24);
            l1.c3 c3Var = h1.v1.f31180a;
            z1.r rVarH = d0.n.h(rVarN, ((h1.s1) sVar.j(c3Var)).f31033p, r0.f.f48733a);
            w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarH);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar2, q0VarD, sVar);
            l1.t.J(hVar3, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar4);
            }
            l1.t.J(hVar5, rVarC2, sVar);
            h1.r4.b(se.k.y(i11, sVar, (i13 >> 6) & 14), null, j0.e2.n(oVar, 14), j11, sVar, (i13 & 7168) | 432, 0);
            sVar.p(true);
            j0.u uVarA = j0.t.a(j0.i.g(2), z1.c.O, sVar, 6);
            int iHashCode3 = Long.hashCode(sVar.T);
            l1.q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar2, uVarA, sVar);
            l1.t.J(hVar3, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar4);
            }
            l1.t.J(hVar5, rVarC3, sVar);
            l1.d0 d0Var = ua.f31167a;
            j3.y0 y0Var = (j3.y0) sVar.j(d0Var);
            long jA = fr.j3.A(10);
            n3.s sVar2 = n3.s.K;
            ua.b(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(y0Var, j11, jA, sVar2, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, i13 & 14, 0, 65534);
            ua.c(hVar, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, j3.y0.a((j3.y0) sVar.j(d0Var), ((h1.s1) sVar.j(c3Var)).f31034q, fr.j3.A(16), sVar2, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, 0, 0, 131070);
            sVar = sVar;
            sVar.p(true);
            sVar.p(true);
            rVar2 = oVar;
        }
        l1.x1 x1VarT2 = sVar.t();
        if (x1VarT2 != null) {
            x1VarT2.f39502d = new fz.e(str, str2, i11, j11, j12, j13, str3, rVar2, i12) { // from class: dt.w0
                public final /* synthetic */ z1.r H;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f24299a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f24300b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f24301c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f24302d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f24303e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ long f24304f;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ String f24305t;

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(1572865);
                    e.c(this.f24299a, this.f24300b, this.f24301c, this.f24302d, this.f24303e, this.f24304f, this.f24305t, this.H, (l1.n) obj, iM);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void d(final ns.v vVar, z1.r rVar, l1.n nVar, final int i11) {
        l1.s sVar;
        z1.r rVar2;
        l1.x1 x1VarT;
        fz.e zVar;
        Integer num;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1085641847);
        int i12 = (sVar2.h(vVar) ? 4 : 2) | i11 | 48;
        if (sVar2.T(i12 & 1, (i12 & 19) != 18)) {
            if (vVar == null) {
                x1VarT = sVar2.t();
                if (x1VarT == null) {
                    return;
                }
                final int i13 = 0;
                zVar = new fz.e(vVar, i11, i13) { // from class: dt.o0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f24050a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ns.v f24051b;

                    {
                        this.f24050a = i13;
                    }

                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        int i14 = this.f24050a;
                        l1.n nVar2 = (l1.n) obj;
                        ((Integer) obj2).getClass();
                        switch (i14) {
                            case 0:
                                e.d(this.f24051b, z1.o.f58481a, nVar2, l1.t.M(1));
                                break;
                            default:
                                e.d(this.f24051b, z1.o.f58481a, nVar2, l1.t.M(1));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
            } else {
                Iterator it = vVar.f44028b.iterator();
                if (it.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((List) it.next()).size());
                    while (it.hasNext()) {
                        Integer numValueOf2 = Integer.valueOf(((List) it.next()).size());
                        if (numValueOf.compareTo(numValueOf2) < 0) {
                            numValueOf = numValueOf2;
                        }
                    }
                    num = numValueOf;
                } else {
                    num = null;
                }
                int iMax = Math.max(vVar.f44027a.size(), num != null ? num.intValue() : 0);
                if (iMax == 0) {
                    x1VarT = sVar2.t();
                    if (x1VarT == null) {
                        return;
                    }
                    final int i14 = 1;
                    zVar = new fz.e(vVar, i11, i14) { // from class: dt.o0

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f24050a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ ns.v f24051b;

                        {
                            this.f24050a = i14;
                        }

                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            int i15 = this.f24050a;
                            l1.n nVar2 = (l1.n) obj;
                            ((Integer) obj2).getClass();
                            switch (i15) {
                                case 0:
                                    e.d(this.f24051b, z1.o.f58481a, nVar2, l1.t.M(1));
                                    break;
                                default:
                                    e.d(this.f24051b, z1.o.f58481a, nVar2, l1.t.M(1));
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                } else {
                    j3.w0 w0VarI = j3.t.i(sVar2);
                    v3.c cVar = (v3.c) sVar2.j(z2.g1.f58547h);
                    l1.d0 d0Var = ua.f31167a;
                    j3.y0 y0Var = (j3.y0) sVar2.j(d0Var);
                    long jA = fr.j3.A(12);
                    n3.s sVar3 = n3.s.K;
                    l1.c3 c3Var = h1.v1.f31180a;
                    j3.y0 y0VarA = j3.y0.a(y0Var, ((h1.s1) sVar2.j(c3Var)).f31022d, jA, sVar3, null, null, 0L, null, null, 0, 0, 0L, null, 16777208);
                    j3.y0 y0VarA2 = j3.y0.a((j3.y0) sVar2.j(d0Var), 0L, fr.j3.A(14), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209);
                    float fE0 = 2 * cVar.e0(4);
                    rVar2 = z1.o.f58481a;
                    z1.r rVarE = j0.e2.e(rVar2, 1.0f);
                    d0.v vVarA = d0.n.a(((h1.s1) sVar2.j(c3Var)).B, 1);
                    t1.d dVarD = t1.e.d(2110857603, new p0(cVar, fE0, vVar, iMax, y0VarA, y0VarA2, w0VarI, 0), sVar2);
                    sVar = sVar2;
                    k7.k(rVarE, null, null, null, vVarA, dVarD, sVar, 196608, 14);
                }
            }
            x1VarT.f39502d = zVar;
        }
        sVar = sVar2;
        sVar.W();
        rVar2 = rVar;
        x1VarT = sVar.t();
        if (x1VarT != null) {
            zVar = new ch.z(vVar, i11, 19, rVar2);
            x1VarT.f39502d = zVar;
        }
    }

    public static final void e(float f5, j3.w0 w0Var, float f11, float[] fArr, int i11, String str, j3.y0 y0Var) {
        if (i11 >= 2 || oz.q.K0(str)) {
            return;
        }
        int i12 = (int) f5;
        if (i12 < 0) {
            i12 = 0;
        }
        float f12 = ((int) (j3.w0.a(w0Var, str, y0Var, v3.b.b(i12, 0, 13), 988).f35799c >> 32)) + f11;
        if (f12 > fArr[i11]) {
            fArr[i11] = f12;
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r13v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v1 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v1 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v1 l1.s, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    public static final void f(final ns.y yVar, z1.r rVar, l1.n nVar, final int i11) {
        final z1.r rVar2;
        String str;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(83199529);
        int i12 = (sVar.f(yVar) ? 4 : 2) | i11 | 48;
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            String str2 = yVar.f44036a;
            String str3 = yVar.f44037b;
            boolean zK0 = oz.q.K0(str2);
            final z1.o oVar = z1.o.f58481a;
            if (zK0 && oz.q.K0(str3)) {
                l1.x1 x1VarT = sVar.t();
                if (x1VarT != null) {
                    final int i13 = 0;
                    x1VarT.f39502d = new fz.e(yVar, oVar, i11, i13) { // from class: dt.s0

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f24173a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ ns.y f24174b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ z1.r f24175c;

                        {
                            this.f24173a = i13;
                        }

                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            int i14 = this.f24173a;
                            l1.n nVar2 = (l1.n) obj;
                            ((Integer) obj2).getClass();
                            switch (i14) {
                                case 0:
                                    e.f(this.f24174b, this.f24175c, nVar2, l1.t.M(1));
                                    break;
                                default:
                                    e.f(this.f24174b, this.f24175c, nVar2, l1.t.M(1));
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    return;
                }
                return;
            }
            j0.u uVarA = j0.t.a(j0.i.g(8), z1.c.O, sVar, 6);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, oVar);
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
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            if (oz.q.K0(yVar.f44036a)) {
                str = str3;
                sVar.d0(-2126162993);
            } else {
                sVar.d0(-2099662891);
                String strE0 = ub.a.e0(sVar, R.string.tell_me_why_your_answer);
                String str4 = yVar.f44036a;
                l1.c3 c3Var = h1.v1.f31180a;
                str = str3;
                c(strE0, str4, R.drawable.close_24px, ob.f.y((h1.s1) sVar.j(c3Var), sVar), ob.f.z((h1.s1) sVar.j(c3Var), sVar), ob.f.y((h1.s1) sVar.j(c3Var), sVar), "err", null, sVar, 1572864);
            }
            sVar.p(r5);
            if (oz.q.K0(str)) {
                sVar.d0(-2126162993);
            } else {
                sVar.d0(-2099114067);
                String strE1 = ub.a.e0(sVar, R.string.tell_me_why_correct_answer);
                String str5 = yVar.f44037b;
                l1.c3 c3Var2 = h1.v1.f31180a;
                c(strE1, str5, R.drawable.check_24px, ob.f.w((h1.s1) sVar.j(c3Var2), sVar), ob.f.x((h1.s1) sVar.j(c3Var2), sVar), ((h1.s1) sVar.j(c3Var2)).f31017a, "fix", null, sVar, 1572864);
            }
            sVar.p(false);
            sVar.p(true);
            rVar2 = oVar;
        } else {
            sVar.W();
            rVar2 = rVar;
        }
        l1.x1 x1VarT2 = sVar.t();
        if (x1VarT2 != null) {
            final int i14 = 1;
            x1VarT2.f39502d = new fz.e(yVar, rVar2, i11, i14) { // from class: dt.s0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f24173a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ns.y f24174b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ z1.r f24175c;

                {
                    this.f24173a = i14;
                }

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    int i15 = this.f24173a;
                    l1.n nVar2 = (l1.n) obj;
                    ((Integer) obj2).getClass();
                    switch (i15) {
                        case 0:
                            e.f(this.f24174b, this.f24175c, nVar2, l1.t.M(1));
                            break;
                        default:
                            e.f(this.f24174b, this.f24175c, nVar2, l1.t.M(1));
                            break;
                    }
                    return qy.b0.f48488a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public static final void g(ns.r0 r0Var, boolean z11, boolean z12, boolean z13, fz.a aVar, fz.a aVar2, l1.n nVar, int i11) {
        l1.s sVar;
        z1.o oVar;
        List list;
        int i12;
        ?? r9;
        ns.f0 f0Var;
        l1.s sVar2;
        l1.s sVar3;
        int i13;
        l1.s sVar4 = (l1.s) nVar;
        sVar4.f0(-612138206);
        int i14 = i11 | (sVar4.h(r0Var) ? 4 : 2) | (sVar4.g(z11) ? 32 : 16) | (sVar4.g(z12) ? 256 : 128) | (sVar4.g(z13) ? 2048 : 1024) | (sVar4.h(aVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar4.h(aVar2) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536);
        if (sVar4.T(i14 & 1, (i14 & 74899) != 74898)) {
            z1.o oVar2 = z1.o.f58481a;
            z1.r rVarY = d0.n.y(j0.c.A(j0.c.r(j0.e2.c(j0.e2.e(oVar2, 1.0f), 0.9f)), 16), d0.n.u(sVar4), false, 14);
            j0.u uVarA = j0.t.a(j0.i.g(12), z1.c.O, sVar4, 6);
            int iHashCode = Long.hashCode(sVar4.T);
            l1.q1 q1VarL = sVar4.l();
            z1.r rVarC = z1.a.c(sVar4, rVarY);
            y2.k.J.getClass();
            fz.a aVar3 = y2.j.f56913b;
            sVar4.h0();
            if (sVar4.S) {
                sVar4.k(aVar3);
            } else {
                sVar4.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA, sVar4);
            l1.t.J(y2.j.f56916e, q1VarL, sVar4);
            y2.h hVar = y2.j.f56918g;
            if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar4, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar4);
            ns.f0 f0Var2 = r0Var.f44014a;
            List list2 = r0Var.f44018e;
            if (oz.q.K0(f0Var2.f43968a)) {
                oVar = oVar2;
                list = list2;
                i12 = 14;
                r9 = 0;
                l1.s sVar5 = sVar4;
                f0Var = f0Var2;
                sVar5.d0(-2122749770);
                sVar2 = sVar5;
            } else {
                sVar4.d0(-2103981471);
                String str = f0Var2.f43968a;
                j3.y0 y0VarA = j3.y0.a((j3.y0) sVar4.j(ua.f31167a), 0L, fr.j3.A(20), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777209);
                list = list2;
                i12 = 14;
                r9 = 0;
                f0Var = f0Var2;
                oVar = oVar2;
                ua.b(str, j0.e2.e(oVar2, 1.0f), 0L, 0L, null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, y0VarA, sVar4, 48, 0, 65020);
                sVar2 = sVar4;
            }
            sVar2.p(r9);
            if (oz.q.K0(f0Var.f43969b)) {
                sVar2.d0(-2122749770);
                sVar3 = sVar2;
            } else {
                sVar2.d0(-2103654328);
                l1.s sVar6 = sVar2;
                ua.b(f0Var.f43969b, j0.e2.e(oVar, 1.0f), 0L, 0L, null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar2.j(ua.f31167a), ((h1.s1) sVar2.j(h1.v1.f31180a)).f31036s, fr.j3.A(i12), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar6, 48, 0, 65020);
                sVar3 = sVar6;
            }
            sVar3.p(r9);
            ns.y yVar = r0Var.f44015b;
            if (yVar == null) {
                sVar3.d0(-2103326070);
            } else {
                sVar3.d0(-2103326069);
                f(yVar, null, sVar3, r9);
            }
            sVar3.p(r9);
            if (oz.q.K0(r0Var.f44016c)) {
                sVar3.d0(-2122749770);
            } else {
                sVar3.d0(-2103157894);
                k(ub.a.e0(sVar3, R.string.tell_me_why_explanation), sVar3, r9);
                ug.d.a(null, t1.e.d(655123460, new a00.b(r0Var, 10), sVar3), sVar3, 384);
            }
            sVar3.p(r9);
            d(r0Var.f44017d, null, sVar3, r9);
            if (list.isEmpty()) {
                i13 = -2122749770;
                sVar3.d0(-2122749770);
                sVar3.p(r9);
            } else {
                sVar3.d0(-2102750554);
                k(ub.a.e0(sVar3, R.string.tell_me_why_examples), sVar3, r9);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    h((ns.c0) it.next(), null, sVar3, r9);
                }
                sVar3.p(r9);
                i13 = -2122749770;
            }
            if (z12) {
                sVar3.d0(-2102450474);
                l(null, sVar3, r9);
            } else {
                sVar3.d0(i13);
            }
            sVar3.p(r9);
            if (z11) {
                sVar3.d0(-2102353661);
                i(aVar, aVar2, null, sVar3, (i14 >> 12) & 126);
                if (z13) {
                    sVar3.d0(-2122749770);
                } else {
                    sVar3.d0(-2102156749);
                    j(null, sVar3, r9);
                }
                sVar3.p(r9);
                ep.a.C(oVar, 22, sVar3, r9);
            } else {
                sVar3.d0(-2122749770);
                sVar3.p(r9);
            }
            sVar3.p(true);
            sVar = sVar3;
        } else {
            l1.s sVar7 = sVar4;
            sVar7.W();
            sVar = sVar7;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new l0(r0Var, z11, z12, z13, aVar, aVar2, i11);
        }
    }

    public static final void h(ns.c0 c0Var, z1.r rVar, l1.n nVar, int i11) {
        z1.r rVar2;
        l1.x1 x1VarT;
        fz.e zVar;
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(639364077);
        int i13 = (sVar.h(c0Var) ? 4 : 2) | i11 | 48;
        if (sVar.T(i13 & 1, (i13 & 19) != 18)) {
            List list = c0Var.f43964b;
            boolean zF = sVar.f(list);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                ArrayList arrayList = new ArrayList(ry.n.W(list, 10));
                int i14 = 0;
                for (Object obj : list) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        ns.o.V();
                        throw null;
                    }
                    ns.w0 w0Var = (ns.w0) obj;
                    String str = w0Var.f44030a;
                    if (oz.q.K0(str)) {
                        i12 = 0;
                        break;
                    }
                    int i16 = 0;
                    while (true) {
                        if (i16 >= str.length()) {
                            i12 = 1;
                            break;
                        } else {
                            if (Character.isLetterOrDigit(str.charAt(i16))) {
                                i12 = 0;
                                break;
                            }
                            i16++;
                        }
                    }
                    long j11 = i14;
                    String str2 = w0Var.f44030a;
                    String str3 = w0Var.f44033d;
                    if (str3 == null) {
                        str3 = BuildConfig.VERSION_NAME;
                    }
                    arrayList.add(new CourseWord(j11, str2, str3, w0Var.f44034e, w0Var.f44032c, BuildConfig.VERSION_NAME, i12, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, str2, false, false, false, false, false, null, null, null, null, null, null, i14, -33554688, 31, null));
                    i14 = i15;
                }
                objQ = c.a.G(((fr.o0) xt.b.c()).f27733a.keyLanguage, arrayList);
                sVar.o0(objQ);
            }
            List list2 = (List) objQ;
            boolean zF2 = sVar.f(list);
            Object objQ2 = sVar.Q();
            Object obj2 = objQ2;
            if (zF2 || objQ2 == gVar) {
                ArrayList arrayList2 = new ArrayList();
                int i17 = 0;
                for (Object obj3 : list) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        ns.o.V();
                        throw null;
                    }
                    Long lValueOf = ((ns.w0) obj3).f44035f ? Long.valueOf(i17) : null;
                    if (lValueOf != null) {
                        arrayList2.add(lValueOf);
                    }
                    i17 = i18;
                }
                sVar.o0(arrayList2);
                obj2 = arrayList2;
            }
            List list3 = (List) obj2;
            if (list2.isEmpty() && oz.q.K0(c0Var.f43963a)) {
                x1VarT = sVar.t();
                if (x1VarT == null) {
                    return;
                } else {
                    zVar = new ch.b0(c0Var, i11, 3);
                }
            } else {
                rVar2 = z1.o.f58481a;
                k7.k(j0.e2.e(rVar2, 1.0f), null, null, null, d0.n.a(((h1.s1) sVar.j(h1.v1.f31180a)).B, 1), t1.e.d(204148985, new defpackage.d(list2, list3, c0Var, 3), sVar), sVar, 196608, 14);
            }
            x1VarT.f39502d = zVar;
        }
        sVar.W();
        rVar2 = rVar;
        x1VarT = sVar.t();
        if (x1VarT != null) {
            zVar = new ch.z(c0Var, i11, 20, rVar2);
            x1VarT.f39502d = zVar;
        }
    }

    public static final void i(final fz.a aVar, final fz.a aVar2, z1.r rVar, l1.n nVar, int i11) {
        int i12;
        z1.r rVar2;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1279910539);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar.h(aVar) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(aVar2) ? 32 : 16;
        }
        int i13 = i12 | 384;
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ);
            }
            final l1.b1 b1Var = (l1.b1) objQ;
            l1.c3 c3Var = h1.v1.f31180a;
            final long jC = g2.x.c(((h1.s1) sVar.j(c3Var)).f31036s, 0.7f);
            final long jC2 = g2.x.c(((h1.s1) sVar.j(c3Var)).f31036s, 0.8f);
            final long jC3 = g2.x.c(((h1.s1) sVar.j(c3Var)).f31036s, 0.35f);
            Object objQ2 = sVar.Q();
            vy.d dVar = null;
            if (objQ2 == gVar) {
                objQ2 = new z7(b1Var, dVar, 1);
                sVar.o0(objQ2);
            }
            l1.t.f((fz.e) objQ2, qy.b0.f48488a, sVar);
            boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
            a0.l1 l1VarE = a0.f1.e(b0.e.r(360, 80, null, 4), 2);
            b0.i2 i2VarR = b0.e.r(420, 80, null, 4);
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar) {
                objQ3 = new d0.y1(14);
                sVar.o0(objQ3);
            }
            a0.j0.d(zBooleanValue, null, l1VarE.a(a0.f1.q(i2VarR, (fz.c) objQ3)), null, null, t1.e.d(-794172851, new fz.f() { // from class: dt.q0
                @Override // fz.f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a0.k0 AnimatedVisibility = (a0.k0) obj;
                    l1.n nVar2 = (l1.n) obj2;
                    ((Integer) obj3).getClass();
                    kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
                    z1.o oVar = z1.o.f58481a;
                    float f5 = 16;
                    float f11 = 4;
                    z1.r rVarE = j0.c.E(j0.e2.e(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, f11, 5);
                    j0.u uVarA = j0.t.a(j0.i.g(10), z1.c.P, nVar2, 54);
                    l1.s sVar2 = (l1.s) nVar2;
                    int iHashCode = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL = sVar2.l();
                    z1.r rVarC = z1.a.c(nVar2, rVarE);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    y2.h hVar = y2.j.f56917f;
                    l1.t.J(hVar, uVarA, nVar2);
                    y2.h hVar2 = y2.j.f56916e;
                    l1.t.J(hVar2, q1VarL, nVar2);
                    y2.h hVar3 = y2.j.f56918g;
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
                    }
                    y2.h hVar4 = y2.j.f56915d;
                    l1.t.J(hVar4, rVarC, nVar2);
                    l1.b3 b3VarB = b0.h.b(((Boolean) b1Var.getValue()).booleanValue() ? 1.0f : 0.85f, b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7), "ai_generated_sparkle", nVar2, 3120, 20);
                    z1.i iVar2 = z1.c.M;
                    j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, iVar2, nVar2, 48);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL2 = sVar2.l();
                    z1.r rVarC2 = z1.a.c(nVar2, oVar);
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(hVar, a2VarA, nVar2);
                    l1.t.J(hVar2, q1VarL2, nVar2);
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
                    }
                    l1.t.J(hVar4, rVarC2, nVar2);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    k7.g(j0.c.A(new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), f5), CropImageView.DEFAULT_ASPECT_RATIO, 0L, nVar2, 0, 6);
                    j0.a2 a2VarA2 = j0.z1.a(j0.i.g(f11), iVar2, nVar2, 54);
                    int iHashCode3 = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL3 = sVar2.l();
                    z1.r rVarC3 = z1.a.c(nVar2, oVar);
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(hVar, a2VarA2, nVar2);
                    l1.t.J(hVar2, q1VarL3, nVar2);
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar3);
                    }
                    l1.t.J(hVar4, rVarC3, nVar2);
                    h1.r4.b(se.k.y(R.drawable.ic_ai_generated_sparkle, nVar2, 0), null, g2.f0.s(j0.e2.n(oVar, 18), ((Number) b3VarB.getValue()).floatValue(), ((Number) b3VarB.getValue()).floatValue(), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 524284), ((h1.s1) ((l1.s) nVar2).j(h1.v1.f31180a)).f31017a, nVar2, 48, 0);
                    String strE0 = ub.a.e0(nVar2, R.string.tell_me_why_ai_generated_label);
                    l1.d0 d0Var = ua.f31167a;
                    ua.b(strE0, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar2.j(d0Var), jC, fr.j3.A(12), n3.s.K, null, null, fr.j3.A(2), null, null, 0, 0, 0L, null, 16777080), nVar2, 0, 0, 65534);
                    sVar2.p(true);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    k7.g(j0.c.A(new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), f5), CropImageView.DEFAULT_ASPECT_RATIO, 0L, nVar2, 0, 6);
                    sVar2.p(true);
                    ua.b(ub.a.e0(nVar2, R.string.tell_me_why_feedback_question), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar2.j(d0Var), jC2, fr.j3.A(14), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), nVar2, 0, 0, 65534);
                    z1.r rVarE2 = j0.e2.e(oVar, 1.0f);
                    j0.a2 a2VarA3 = j0.z1.a(j0.i.f35307e, iVar2, nVar2, 54);
                    int iHashCode4 = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL4 = sVar2.l();
                    z1.r rVarC4 = z1.a.c(nVar2, rVarE2);
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(hVar, a2VarA3, nVar2);
                    l1.t.J(hVar2, q1VarL4, nVar2);
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode4))) {
                        defpackage.e.A(iHashCode4, sVar2, iHashCode4, hVar3);
                    }
                    l1.t.J(hVar4, rVarC4, nVar2);
                    long j11 = jC3;
                    e.J(R.drawable.ic_feedback_thumb_up, j11, aVar, null, nVar2, 0);
                    j0.c.g(nVar2, j0.e2.s(oVar, 12));
                    e.J(R.drawable.ic_feedback_thumb_down, j11, aVar2, null, nVar2, 0);
                    sVar2.p(true);
                    sVar2.p(true);
                    return qy.b0.f48488a;
                }
            }, sVar), sVar, 196608, 26);
            rVar2 = z1.o.f58481a;
        } else {
            sVar.W();
            rVar2 = rVar;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new ch.f(aVar, aVar2, rVar2, i11, 1);
        }
    }

    public static final void j(z1.r rVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-2118336083);
        int i12 = i11 | 6;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            fz.c cVar = (fz.c) sVar.j(ys.e.f57981a);
            l1.c3 c3Var = h1.v1.f31180a;
            long j11 = ((h1.s1) sVar.j(c3Var)).f31021c;
            long jW = ob.f.w((h1.s1) sVar.j(c3Var), sVar);
            long jC = g2.x.c(ob.f.v((h1.s1) sVar.j(c3Var), sVar), 0.3f);
            z1.o oVar = z1.o.f58481a;
            k7.k(j0.e2.e(oVar, 1.0f), r0.f.d(16), k7.y(j11, 0L, sVar, 14), null, d0.n.a(jC, 1), t1.e.d(-398844487, new n0(jW, cVar), sVar), sVar, 196608, 8);
            sVar = sVar;
            rVar = oVar;
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new ch.g(rVar, i11, 5);
        }
    }

    public static final void k(String str, l1.n nVar, int i11) {
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-807975116);
        int i12 = i11 | (sVar2.f(str) ? 4 : 2);
        if (sVar2.T(i12 & 1, (i12 & 3) != 2)) {
            sVar = sVar2;
            ua.b(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar2.j(ua.f31167a), ((h1.s1) sVar2.j(h1.v1.f31180a)).f31017a, fr.j3.A(12), n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, i12 & 14, 0, 65534);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.e0(str, i11, 3);
        }
    }

    public static final void l(z1.r rVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(108161440);
        int i12 = i11 | 6;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            rVar = z1.o.f58481a;
            z1.r rVarE = j0.e2.e(rVar, 1.0f);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarE);
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
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            z1.r rVarG = j0.e2.g(j0.e2.e(rVar, 1.0f), 2);
            l1.c3 c3Var = h1.v1.f31180a;
            g7.d(CropImageView.DEFAULT_ASPECT_RATIO, 0, 6, 24, ((h1.s1) sVar.j(c3Var)).f31017a, ((h1.s1) sVar.j(c3Var)).f31035r, sVar, rVarG);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new ch.g(rVar, i11, 6);
        }
    }

    public static final void m(List list, int i11, qy.l lVar, j3.y0 y0Var, z1.r rVar, l1.n nVar, int i12) {
        l1.s sVar;
        z1.r rVar2;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1154148477);
        int i13 = 4;
        int i14 = i12 | (sVar2.h(list) ? 4 : 2) | (sVar2.d(i11) ? 32 : 16) | (sVar2.f(lVar) ? 256 : 128) | (sVar2.f(y0Var) ? 2048 : 1024) | 24576;
        boolean z11 = false;
        boolean z12 = true;
        if (sVar2.T(i14 & 1, (i14 & 9363) != 9362)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarI = j0.e2.i(d0.n.h(j0.e2.e(oVar, 1.0f), ((h1.s1) sVar2.j(h1.v1.f31180a)).f31021c, g2.f0.f28556b), 36, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            j0.a2 a2VarA = j0.z1.a(j0.i.g(12), z1.c.M, sVar2, 54);
            int iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVarI);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(y2.j.f56917f, a2VarA, sVar2);
            l1.t.J(y2.j.f56916e, q1VarL, sVar2);
            y2.h hVar = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar2);
            sVar2.d0(446114331);
            int i15 = 0;
            while (i15 < i11) {
                float fFloatValue = i15 == 0 ? ((Number) lVar.f48495a).floatValue() : ((Number) lVar.f48496b).floatValue();
                if (fFloatValue <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                if (fFloatValue > Float.MAX_VALUE) {
                    fFloatValue = Float.MAX_VALUE;
                }
                z1.r rVarA = j0.c.A(new j0.i1(fFloatValue, z12), i13);
                w2.q0 q0VarD = j0.o.d(z1.c.f58467e, z11);
                int iHashCode2 = Long.hashCode(sVar2.T);
                l1.q1 q1VarL2 = sVar2.l();
                z1.r rVarC2 = z1.a.c(sVar2, rVarA);
                y2.k.J.getClass();
                y2.i iVar2 = y2.j.f56913b;
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar2);
                } else {
                    sVar2.r0();
                }
                l1.t.J(y2.j.f56917f, q0VarD, sVar2);
                l1.t.J(y2.j.f56916e, q1VarL2, sVar2);
                y2.h hVar2 = y2.j.f56918g;
                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar2);
                }
                l1.t.J(y2.j.f56915d, rVarC2, sVar2);
                String str = (String) ry.m.t0(i15, list);
                if (str == null) {
                    str = BuildConfig.VERSION_NAME;
                }
                boolean z13 = z12;
                l1.s sVar3 = sVar2;
                ua.b(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0Var, sVar3, 0, (i14 << 9) & 3670016, 65534);
                sVar3.p(z13);
                i15++;
                z12 = z13;
                sVar2 = sVar3;
                i13 = 4;
                oVar = oVar;
                z11 = false;
                i14 = i14;
            }
            sVar = sVar2;
            sVar.p(z11);
            sVar.p(z12);
            rVar2 = oVar;
        } else {
            sVar = sVar2;
            sVar.W();
            rVar2 = rVar;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new x0(list, i11, lVar, y0Var, rVar2, i12, 0);
        }
    }

    public static final void n(List list, int i11, qy.l lVar, j3.y0 y0Var, z1.r rVar, l1.n nVar, int i12) {
        l1.s sVar;
        z1.r rVar2;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1429587440);
        int i13 = 4;
        int i14 = i12 | (sVar2.h(list) ? 4 : 2) | (sVar2.d(i11) ? 32 : 16) | (sVar2.f(lVar) ? 256 : 128) | (sVar2.f(y0Var) ? 2048 : 1024) | 24576;
        boolean z11 = false;
        boolean z12 = true;
        if (sVar2.T(i14 & 1, (i14 & 9363) != 9362)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarI = j0.e2.i(j0.e2.e(oVar, 1.0f), 42, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar2, 48);
            int iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVarI);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(y2.j.f56917f, a2VarA, sVar2);
            l1.t.J(y2.j.f56916e, q1VarL, sVar2);
            y2.h hVar = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar2);
            sVar2.d0(-161726924);
            int i15 = 0;
            while (i15 < i11) {
                float fFloatValue = i15 == 0 ? ((Number) lVar.f48495a).floatValue() : ((Number) lVar.f48496b).floatValue();
                if (fFloatValue <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                if (fFloatValue > Float.MAX_VALUE) {
                    fFloatValue = Float.MAX_VALUE;
                }
                z1.r rVarA = j0.c.A(new j0.i1(fFloatValue, z12), i13);
                w2.q0 q0VarD = j0.o.d(z1.c.f58467e, z11);
                int iHashCode2 = Long.hashCode(sVar2.T);
                l1.q1 q1VarL2 = sVar2.l();
                z1.r rVarC2 = z1.a.c(sVar2, rVarA);
                y2.k.J.getClass();
                y2.i iVar2 = y2.j.f56913b;
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar2);
                } else {
                    sVar2.r0();
                }
                l1.t.J(y2.j.f56917f, q0VarD, sVar2);
                l1.t.J(y2.j.f56916e, q1VarL2, sVar2);
                y2.h hVar2 = y2.j.f56918g;
                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar2);
                }
                l1.t.J(y2.j.f56915d, rVarC2, sVar2);
                String str = (String) ry.m.t0(i15, list);
                if (str == null) {
                    str = BuildConfig.VERSION_NAME;
                }
                boolean z13 = z12;
                l1.s sVar3 = sVar2;
                ua.b(str, null, 0L, 0L, null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, y0Var, sVar3, 0, (i14 << 9) & 3670016, 65022);
                sVar3.p(z13);
                i15++;
                z12 = z13;
                sVar2 = sVar3;
                i13 = 4;
                i14 = i14;
                oVar = oVar;
                z11 = false;
            }
            sVar = sVar2;
            sVar.p(z11);
            sVar.p(z12);
            rVar2 = oVar;
        } else {
            sVar = sVar2;
            sVar.W();
            rVar2 = rVar;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new x0(list, i11, lVar, y0Var, rVar2, i12, 1);
        }
    }

    public static final void o(ht.q courseTestState, ht.l audioPlayingState, fz.a getAudioTime, fz.a onClickPlayingAudio, l1.n nVar, int i11) {
        l1.s sVar;
        kotlin.jvm.internal.m.f(courseTestState, "courseTestState");
        kotlin.jvm.internal.m.f(audioPlayingState, "audioPlayingState");
        kotlin.jvm.internal.m.f(getAudioTime, "getAudioTime");
        kotlin.jvm.internal.m.f(onClickPlayingAudio, "onClickPlayingAudio");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(216585088);
        int i12 = (sVar2.d(courseTestState.ordinal()) ? 4 : 2) | i11 | (sVar2.h(audioPlayingState) ? 32 : 16);
        if ((i11 & 384) == 0) {
            i12 |= sVar2.h(getAudioTime) ? 256 : 128;
        }
        int i13 = i12 | (sVar2.h(onClickPlayingAudio) ? 2048 : 1024);
        if (sVar2.T(i13 & 1, (i13 & 1171) != 1170)) {
            Uri EMPTY = Uri.EMPTY;
            kotlin.jvm.internal.m.e(EMPTY, "EMPTY");
            sVar = sVar2;
            q(new d(EMPTY, 0L, qy.b0.f48488a, audioPlayingState, null, courseTestState, false, false, new d0.y1(13), getAudioTime), null, false, null, null, t1.e.d(-1753764282, new at.p(4, onClickPlayingAudio, audioPlayingState), sVar2), sVar, 196608, 30);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new cs.a(courseTestState, audioPlayingState, getAudioTime, onClickPlayingAudio, i11, 1);
        }
    }

    public static final void p(final ht.q courseTestState, final ht.l audioPlayingState, final RecordingStatus recordingStatus, final List stemWords, final String translation, final boolean z11, z1.r rVar, boolean z12, boolean z13, final boolean z14, boolean z15, List list, final int i11, int i12, Uri uri, long j11, Object obj, fz.c cVar, final fz.a getAudioTime, final fz.a onClickPlayingAudio, final fz.c onShowWordPopup, fz.f fVar, l1.n nVar, final int i13, final int i14, final int i15, final int i16) {
        z1.r rVar2;
        boolean z16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        final boolean z17;
        final int i24;
        final Uri uri2;
        final long j12;
        final Object obj2;
        final fz.c cVar2;
        final fz.f fVar2;
        final z1.r rVar3;
        final boolean z18;
        l1.s sVar;
        final boolean z19;
        final List list2;
        boolean z20;
        boolean z21;
        List list3;
        Uri EMPTY;
        Object obj3;
        fz.c cVar3;
        int i25;
        fz.f fVar3;
        long j13;
        z1.r rVar4;
        boolean z22;
        kotlin.jvm.internal.m.f(courseTestState, "courseTestState");
        kotlin.jvm.internal.m.f(audioPlayingState, "audioPlayingState");
        kotlin.jvm.internal.m.f(stemWords, "stemWords");
        kotlin.jvm.internal.m.f(translation, "translation");
        kotlin.jvm.internal.m.f(getAudioTime, "getAudioTime");
        kotlin.jvm.internal.m.f(onClickPlayingAudio, "onClickPlayingAudio");
        kotlin.jvm.internal.m.f(onShowWordPopup, "onShowWordPopup");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1283026518);
        int i26 = (sVar2.d(courseTestState.ordinal()) ? 4 : 2) | i13 | (sVar2.h(audioPlayingState) ? 32 : 16);
        if ((i13 & 384) == 0) {
            i26 |= sVar2.h(recordingStatus) ? 256 : 128;
        }
        int i27 = i26 | (sVar2.h(stemWords) ? 2048 : 1024);
        boolean zF = sVar2.f(translation);
        int i28 = OSSConstants.DEFAULT_BUFFER_SIZE;
        int i29 = i27 | (zF ? 16384 : 8192);
        int i30 = i16 & 64;
        if (i30 != 0) {
            i29 |= 1572864;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            if ((i13 & 1572864) == 0) {
                i29 |= sVar2.f(rVar2) ? 1048576 : 524288;
            }
        }
        int i31 = i16 & 128;
        if (i31 != 0) {
            i17 = i29 | 12582912;
            z16 = z12;
        } else {
            z16 = z12;
            i17 = i29 | (sVar2.g(z16) ? 8388608 : 4194304);
        }
        int i32 = i16 & 256;
        if (i32 != 0) {
            i17 |= 100663296;
        } else if ((i13 & 100663296) == 0) {
            i17 |= sVar2.g(z13) ? 67108864 : 33554432;
        }
        int i33 = i17;
        int i34 = i16 & 1024;
        if (i34 != 0) {
            i18 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i18 = i14 | (sVar2.g(z15) ? 4 : 2);
        } else {
            i18 = i14;
        }
        int i35 = i16 & 2048;
        if (i35 != 0) {
            i19 = i18 | 48;
        } else {
            i19 = i18 | (sVar2.h(list) ? 32 : 16);
        }
        int i36 = i19 | (sVar2.d(i11) ? 256 : 128) | 3072;
        if ((i16 & 16384) == 0 && sVar2.h(uri)) {
            i28 = 16384;
        }
        int i37 = i36 | i28;
        int i38 = i16 & 32768;
        if (i38 != 0) {
            i21 = i37 | 196608;
        } else {
            i21 = i37 | (sVar2.e(j11) ? 131072 : 65536);
        }
        int i39 = i16 & 65536;
        if (i39 != 0) {
            i22 = i21 | 1572864;
        } else {
            i22 = i21 | (sVar2.h(obj) ? 1048576 : 524288);
        }
        int i40 = i16 & OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
        if (i40 != 0) {
            i23 = i22 | 12582912;
        } else {
            i23 = i22 | (sVar2.h(cVar) ? 8388608 : 4194304);
        }
        int i41 = i23 | (sVar2.h(getAudioTime) ? 67108864 : 33554432);
        if ((i14 & 805306368) == 0) {
            i41 |= sVar2.h(onClickPlayingAudio) ? 536870912 : 268435456;
        }
        int i42 = i15 | (sVar2.h(onShowWordPopup) ? 4 : 2);
        int i43 = i16 & 2097152;
        if (i43 != 0) {
            i42 |= 48;
        } else if ((i15 & 48) == 0) {
            i42 |= sVar2.h(fVar) ? 32 : 16;
        }
        if (sVar2.T(i33 & 1, ((i33 & 306783379) == 306783378 && (i41 & 306783379) == 306783378 && (i42 & 19) == 18) ? false : true)) {
            sVar2.Y();
            if ((i13 & 1) == 0 || sVar2.C()) {
                if (i30 != 0) {
                    rVar2 = z1.o.f58481a;
                }
                if (i31 != 0) {
                    z16 = true;
                }
                z20 = i32 == 0 ? z13 : false;
                z21 = i34 == 0 ? z15 : true;
                list3 = i35 != 0 ? ry.r.f50854a : list;
                if ((i16 & 16384) != 0) {
                    EMPTY = Uri.EMPTY;
                    kotlin.jvm.internal.m.e(EMPTY, "EMPTY");
                } else {
                    EMPTY = uri;
                }
                long j14 = i38 != 0 ? 0L : j11;
                obj3 = i39 != 0 ? qy.b0.f48488a : obj;
                if (i40 != 0) {
                    Object objQ = sVar2.Q();
                    if (objQ == l1.m.f39353a) {
                        objQ = new d0.y1(15);
                        sVar2.o0(objQ);
                    }
                    cVar3 = (fz.c) objQ;
                } else {
                    cVar3 = cVar;
                }
                i25 = Integer.MAX_VALUE;
                fVar3 = i43 != 0 ? f23761h : fVar;
                j13 = j14;
                rVar4 = rVar2;
                z22 = z16;
            } else {
                sVar2.W();
                z20 = z13;
                z21 = z15;
                list3 = list;
                i25 = i12;
                EMPTY = uri;
                obj3 = obj;
                cVar3 = cVar;
                fVar3 = fVar;
                rVar4 = rVar2;
                z22 = z16;
                j13 = j11;
            }
            sVar2.q();
            d dVar = new d(EMPTY, j13, obj3, audioPlayingState, recordingStatus, courseTestState, z20, z11, cVar3, getAudioTime);
            Object obj4 = obj3;
            boolean z23 = z20;
            t1.d dVarD = t1.e.d(-948395192, new bp.e0(translation, 4), sVar2);
            final boolean z24 = z21;
            final List list4 = list3;
            final int i44 = i25;
            t1.d dVarD2 = t1.e.d(-243259664, new fz.f() { // from class: dt.k1
                @Override // fz.f
                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                    j0.q CourseTestChallengeBaseTitle = (j0.q) obj5;
                    l1.n nVar2 = (l1.n) obj6;
                    int iIntValue = ((Integer) obj7).intValue();
                    kotlin.jvm.internal.m.f(CourseTestChallengeBaseTitle, "$this$CourseTestChallengeBaseTitle");
                    l1.s sVar3 = (l1.s) nVar2;
                    if (sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                        z1.r rVarE = j0.c.E(j0.c.C(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, c.f23680k, 1), c.f23681l, CropImageView.DEFAULT_ASPECT_RATIO, c.m, CropImageView.DEFAULT_ASPECT_RATIO, 10);
                        j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar3, 0);
                        int iHashCode = Long.hashCode(sVar3.T);
                        l1.q1 q1VarL = sVar3.l();
                        z1.r rVarC = z1.a.c(sVar3, rVarE);
                        y2.k.J.getClass();
                        y2.i iVar = y2.j.f56913b;
                        sVar3.h0();
                        if (sVar3.S) {
                            sVar3.k(iVar);
                        } else {
                            sVar3.r0();
                        }
                        l1.t.J(y2.j.f56917f, uVarA, sVar3);
                        l1.t.J(y2.j.f56916e, q1VarL, sVar3);
                        y2.h hVar = y2.j.f56918g;
                        if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar3, iHashCode, hVar);
                        }
                        l1.t.J(y2.j.f56915d, rVarC, sVar3);
                        ht.l lVar = audioPlayingState;
                        e.N(stemWords, z14, list4, (lVar instanceof ht.c) || (lVar instanceof ht.i), i11, onClickPlayingAudio, onShowWordPopup, i44, z24, sVar3, 0);
                        sVar3.p(true);
                    } else {
                        sVar3.W();
                    }
                    return qy.b0.f48488a;
                }
            }, sVar2);
            int i45 = i33 >> 15;
            z1.r rVar5 = rVar4;
            boolean z25 = z22;
            fz.f fVar4 = fVar3;
            q(dVar, rVar5, z25, fVar4, dVarD, dVarD2, sVar2, (i45 & 896) | (i45 & 112) | 221184 | ((i42 << 6) & 7168), 0);
            z17 = z24;
            list2 = list4;
            i24 = i44;
            rVar3 = rVar5;
            z18 = z25;
            sVar = sVar2;
            uri2 = EMPTY;
            z19 = z23;
            j12 = j13;
            obj2 = obj4;
            cVar2 = cVar3;
            fVar2 = fVar4;
        } else {
            sVar2.W();
            z17 = z15;
            i24 = i12;
            uri2 = uri;
            j12 = j11;
            obj2 = obj;
            cVar2 = cVar;
            fVar2 = fVar;
            rVar3 = rVar2;
            z18 = z16;
            sVar = sVar2;
            z19 = z13;
            list2 = list;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: dt.l1
                @Override // fz.e
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    int iM = l1.t.M(i13 | 1);
                    int iM2 = l1.t.M(i14);
                    int iM3 = l1.t.M(i15);
                    e.p(courseTestState, audioPlayingState, recordingStatus, stemWords, translation, z11, rVar3, z18, z19, z14, z17, list2, i11, i24, uri2, j12, obj2, cVar2, getAudioTime, onClickPlayingAudio, onShowWordPopup, fVar2, (l1.n) obj5, iM, iM2, iM3, i16);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0133  */
    /* JADX WARN: Code duplicated, block: B:106:0x013d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0141  */
    /* JADX WARN: Code duplicated, block: B:112:0x015f  */
    /* JADX WARN: Code duplicated, block: B:115:0x016c  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x0078  */
    /* JADX WARN: Code duplicated, block: B:49:0x007c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:56:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:90:0x0109  */
    /* JADX WARN: Code duplicated, block: B:91:0x010c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0114  */
    /* JADX WARN: Code duplicated, block: B:95:0x0117  */
    /* JADX WARN: Code duplicated, block: B:98:0x0125  */
    /* JADX WARN: Code duplicated, block: B:99:0x0128  */
    public static final void q(d dVar, z1.r rVar, boolean z11, fz.f fVar, fz.e eVar, t1.d dVar2, l1.n nVar, int i11, int i12) {
        int i13;
        z1.r rVar2;
        int i14;
        boolean z12;
        int i15;
        int i16;
        fz.f fVar2;
        int i17;
        int i18;
        fz.e eVar2;
        int i19;
        t1.d dVar3;
        boolean z13;
        z1.r rVar3;
        boolean z14;
        fz.f fVar3;
        fz.e eVar3;
        l1.x1 x1VarT;
        z1.r rVar4;
        boolean z15;
        fz.f fVar4;
        fz.e eVar4;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        Object i1Var;
        int i21;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1863995060);
        if ((i11 & 6) == 0) {
            i13 = (sVar.h(dVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i22 = i12 & 2;
        if (i22 == 0) {
            if ((i11 & 48) == 0) {
                rVar2 = rVar;
                i13 |= sVar.f(rVar2) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & 384) == 0) {
                    z12 = z11;
                    if (sVar.g(z12)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 8;
                if (i16 != 0) {
                    if ((i11 & 3072) == 0) {
                        fVar2 = fVar;
                        if (sVar.h(fVar2)) {
                            i17 = 2048;
                        } else {
                            i17 = 1024;
                        }
                        i13 |= i17;
                    }
                    i18 = i12 & 16;
                    if (i18 != 0) {
                        if ((i11 & 24576) == 0) {
                            eVar2 = eVar;
                            if (sVar.h(eVar2)) {
                                i19 = 16384;
                            } else {
                                i19 = OSSConstants.DEFAULT_BUFFER_SIZE;
                            }
                            i13 |= i19;
                        }
                        if ((196608 & i11) == 0) {
                            dVar3 = dVar2;
                            if (sVar.h(dVar3)) {
                                i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                            } else {
                                i21 = 65536;
                            }
                            i13 |= i21;
                        } else {
                            dVar3 = dVar2;
                        }
                        if ((i13 & 74899) != 74898) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (sVar.T(i13 & 1, z13)) {
                            if (i22 != 0) {
                                rVar4 = z1.o.f58481a;
                            } else {
                                rVar4 = rVar2;
                            }
                            if (i14 != 0) {
                                z15 = true;
                            } else {
                                z15 = z12;
                            }
                            if (i16 != 0) {
                                fVar4 = f23759f;
                            } else {
                                fVar4 = fVar2;
                            }
                            if (i18 != 0) {
                                eVar4 = f23760g;
                            } else {
                                eVar4 = eVar2;
                            }
                            if (d4.g(sVar) == v3.m.Rtl) {
                                sVar.d0(-644215496);
                                sVar.p(false);
                                z16 = true;
                            } else {
                                sVar.d0(-297874355);
                                if (iu.k.p(sVar) == -1.0f) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                sVar.p(false);
                            }
                            boolean zH = sVar.h(dVar);
                            if ((i13 & 896) == 256) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            boolean z21 = zH | z17;
                            if ((i13 & 7168) == 2048) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            boolean zG = z21 | z18 | sVar.g(z16);
                            if ((458752 & i13) == 131072) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            z20 = zG | z19 | ((57344 & i13) == 16384);
                            Object objQ = sVar.Q();
                            if (!z20 || objQ == l1.m.f39353a) {
                                i1Var = new i1(dVar, z15, fVar4, z16, dVar3, eVar4);
                                sVar.o0(i1Var);
                            } else {
                                i1Var = objQ;
                            }
                            w2.a0.b(rVar4, (fz.e) i1Var, sVar, (i13 >> 3) & 14, 0);
                            fVar3 = fVar4;
                            eVar3 = eVar4;
                            z14 = z15;
                            rVar3 = rVar4;
                        } else {
                            sVar.W();
                            rVar3 = rVar2;
                            z14 = z12;
                            fVar3 = fVar2;
                            eVar3 = eVar2;
                        }
                        x1VarT = sVar.t();
                        if (x1VarT != null) {
                            x1VarT.f39502d = new j1(dVar, rVar3, z14, fVar3, eVar3, dVar2, i11, i12);
                        }
                    }
                    i13 |= 24576;
                    eVar2 = eVar;
                    if ((196608 & i11) == 0) {
                        dVar3 = dVar2;
                        if (sVar.h(dVar3)) {
                            i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i13 & 74899) != 74898) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (sVar.T(i13 & 1, z13)) {
                        if (i22 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i14 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i16 != 0) {
                            fVar4 = f23759f;
                        } else {
                            fVar4 = fVar2;
                        }
                        if (i18 != 0) {
                            eVar4 = f23760g;
                        } else {
                            eVar4 = eVar2;
                        }
                        if (d4.g(sVar) == v3.m.Rtl) {
                            sVar.d0(-644215496);
                            sVar.p(false);
                            z16 = true;
                        } else {
                            sVar.d0(-297874355);
                            if (iu.k.p(sVar) == -1.0f) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            sVar.p(false);
                        }
                        boolean zH2 = sVar.h(dVar);
                        if ((i13 & 896) == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        boolean z22 = zH2 | z17;
                        if ((i13 & 7168) == 2048) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        boolean zG2 = z22 | z18 | sVar.g(z16);
                        if ((458752 & i13) == 131072) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z20 = zG2 | z19 | ((57344 & i13) == 16384);
                        Object objQ2 = sVar.Q();
                        if (z20) {
                            i1Var = new i1(dVar, z15, fVar4, z16, dVar3, eVar4);
                            sVar.o0(i1Var);
                        } else {
                            i1Var = new i1(dVar, z15, fVar4, z16, dVar3, eVar4);
                            sVar.o0(i1Var);
                        }
                        w2.a0.b(rVar4, (fz.e) i1Var, sVar, (i13 >> 3) & 14, 0);
                        fVar3 = fVar4;
                        eVar3 = eVar4;
                        z14 = z15;
                        rVar3 = rVar4;
                    } else {
                        sVar.W();
                        rVar3 = rVar2;
                        z14 = z12;
                        fVar3 = fVar2;
                        eVar3 = eVar2;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new j1(dVar, rVar3, z14, fVar3, eVar3, dVar2, i11, i12);
                    }
                }
                i13 |= 3072;
                fVar2 = fVar;
                i18 = i12 & 16;
                if (i18 != 0) {
                    if ((i11 & 24576) == 0) {
                        eVar2 = eVar;
                        if (sVar.h(eVar2)) {
                            i19 = 16384;
                        } else {
                            i19 = OSSConstants.DEFAULT_BUFFER_SIZE;
                        }
                        i13 |= i19;
                    }
                    if ((196608 & i11) == 0) {
                        dVar3 = dVar2;
                        if (sVar.h(dVar3)) {
                            i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i13 & 74899) != 74898) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (sVar.T(i13 & 1, z13)) {
                        if (i22 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i14 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i16 != 0) {
                            fVar4 = f23759f;
                        } else {
                            fVar4 = fVar2;
                        }
                        if (i18 != 0) {
                            eVar4 = f23760g;
                        } else {
                            eVar4 = eVar2;
                        }
                        if (d4.g(sVar) == v3.m.Rtl) {
                            sVar.d0(-644215496);
                            sVar.p(false);
                            z16 = true;
                        } else {
                            sVar.d0(-297874355);
                            if (iu.k.p(sVar) == -1.0f) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            sVar.p(false);
                        }
                        boolean zH3 = sVar.h(dVar);
                        if ((i13 & 896) == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        boolean z23 = zH3 | z17;
                        if ((i13 & 7168) == 2048) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        boolean zG3 = z23 | z18 | sVar.g(z16);
                        if ((458752 & i13) == 131072) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z20 = zG3 | z19 | ((57344 & i13) == 16384);
                        Object objQ3 = sVar.Q();
                        if (z20) {
                            i1Var = new i1(dVar, z15, fVar4, z16, dVar3, eVar4);
                            sVar.o0(i1Var);
                        } else {
                            i1Var = new i1(dVar, z15, fVar4, z16, dVar3, eVar4);
                            sVar.o0(i1Var);
                        }
                        w2.a0.b(rVar4, (fz.e) i1Var, sVar, (i13 >> 3) & 14, 0);
                        fVar3 = fVar4;
                        eVar3 = eVar4;
                        z14 = z15;
                        rVar3 = rVar4;
                    } else {
                        sVar.W();
                        rVar3 = rVar2;
                        z14 = z12;
                        fVar3 = fVar2;
                        eVar3 = eVar2;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new j1(dVar, rVar3, z14, fVar3, eVar3, dVar2, i11, i12);
                    }
                }
                i13 |= 24576;
                eVar2 = eVar;
                if ((196608 & i11) == 0) {
                    dVar3 = dVar2;
                    if (sVar.h(dVar3)) {
                        i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                } else {
                    dVar3 = dVar2;
                }
                if ((i13 & 74899) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (sVar.T(i13 & 1, z13)) {
                    if (i22 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i14 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i16 != 0) {
                        fVar4 = f23759f;
                    } else {
                        fVar4 = fVar2;
                    }
                    if (i18 != 0) {
                        eVar4 = f23760g;
                    } else {
                        eVar4 = eVar2;
                    }
                    if (d4.g(sVar) == v3.m.Rtl) {
                        sVar.d0(-644215496);
                        sVar.p(false);
                        z16 = true;
                    } else {
                        sVar.d0(-297874355);
                        if (iu.k.p(sVar) == -1.0f) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        sVar.p(false);
                    }
                    boolean zH4 = sVar.h(dVar);
                    if ((i13 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean z24 = zH4 | z17;
                    if ((i13 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean zG4 = z24 | z18 | sVar.g(z16);
                    if ((458752 & i13) == 131072) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z20 = zG4 | z19 | ((57344 & i13) == 16384);
                    Object objQ4 = sVar.Q();
                    if (z20) {
                        i1Var = new i1(dVar, z15, fVar4, z16, dVar3, eVar4);
                        sVar.o0(i1Var);
                    } else {
                        i1Var = new i1(dVar, z15, fVar4, z16, dVar3, eVar4);
                        sVar.o0(i1Var);
                    }
                    w2.a0.b(rVar4, (fz.e) i1Var, sVar, (i13 >> 3) & 14, 0);
                    fVar3 = fVar4;
                    eVar3 = eVar4;
                    z14 = z15;
                    rVar3 = rVar4;
                } else {
                    sVar.W();
                    rVar3 = rVar2;
                    z14 = z12;
                    fVar3 = fVar2;
                    eVar3 = eVar2;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new j1(dVar, rVar3, z14, fVar3, eVar3, dVar2, i11, i12);
                }
            }
            i13 |= 384;
            z12 = z11;
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 3072) == 0) {
                    fVar2 = fVar;
                    if (sVar.h(fVar2)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 16;
                if (i18 != 0) {
                    if ((i11 & 24576) == 0) {
                        eVar2 = eVar;
                        if (sVar.h(eVar2)) {
                            i19 = 16384;
                        } else {
                            i19 = OSSConstants.DEFAULT_BUFFER_SIZE;
                        }
                        i13 |= i19;
                    }
                    if ((196608 & i11) == 0) {
                        dVar3 = dVar2;
                        if (sVar.h(dVar3)) {
                            i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i13 & 74899) != 74898) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (sVar.T(i13 & 1, z13)) {
                        if (i22 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i14 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i16 != 0) {
                            fVar4 = f23759f;
                        } else {
                            fVar4 = fVar2;
                        }
                        if (i18 != 0) {
                            eVar4 = f23760g;
                        } else {
                            eVar4 = eVar2;
                        }
                        if (d4.g(sVar) == v3.m.Rtl) {
                            sVar.d0(-644215496);
                            sVar.p(false);
                            z16 = true;
                        } else {
                            sVar.d0(-297874355);
                            if (iu.k.p(sVar) == -1.0f) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            sVar.p(false);
                        }
                        boolean zH5 = sVar.h(dVar);
                        if ((i13 & 896) == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        boolean z25 = zH5 | z17;
                        if ((i13 & 7168) == 2048) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        boolean zG5 = z25 | z18 | sVar.g(z16);
                        if ((458752 & i13) == 131072) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z20 = zG5 | z19 | ((57344 & i13) == 16384);
                        Object objQ5 = sVar.Q();
                        if (z20) {
                            i1Var = new i1(dVar, z15, fVar4, z16, dVar3, eVar4);
                            sVar.o0(i1Var);
                        } else {
                            i1Var = new i1(dVar, z15, fVar4, z16, dVar3, eVar4);
                            sVar.o0(i1Var);
                        }
                        w2.a0.b(rVar4, (fz.e) i1Var, sVar, (i13 >> 3) & 14, 0);
                        fVar3 = fVar4;
                        eVar3 = eVar4;
                        z14 = z15;
                        rVar3 = rVar4;
                    } else {
                        sVar.W();
                        rVar3 = rVar2;
                        z14 = z12;
                        fVar3 = fVar2;
                        eVar3 = eVar2;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new j1(dVar, rVar3, z14, fVar3, eVar3, dVar2, i11, i12);
                    }
                }
                i13 |= 24576;
                eVar2 = eVar;
                if ((196608 & i11) == 0) {
                    dVar3 = dVar2;
                    if (sVar.h(dVar3)) {
                        i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                } else {
                    dVar3 = dVar2;
                }
                if ((i13 & 74899) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (sVar.T(i13 & 1, z13)) {
                    if (i22 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i14 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i16 != 0) {
                        fVar4 = f23759f;
                    } else {
                        fVar4 = fVar2;
                    }
                    if (i18 != 0) {
                        eVar4 = f23760g;
                    } else {
                        eVar4 = eVar2;
                    }
                    if (d4.g(sVar) == v3.m.Rtl) {
                        sVar.d0(-644215496);
                        sVar.p(false);
                        z16 = true;
                    } else {
                        sVar.d0(-297874355);
                        if (iu.k.p(sVar) == -1.0f) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        sVar.p(false);
                    }
                    boolean zH6 = sVar.h(dVar);
                    if ((i13 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean z26 = zH6 | z17;
                    if ((i13 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean zG6 = z26 | z18 | sVar.g(z16);
                    if ((458752 & i13) == 131072) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z20 = zG6 | z19 | ((57344 & i13) == 16384);
                    Object objQ6 = sVar.Q();
                    if (z20) {
                        i1Var = new i1(dVar, z15, fVar4, z16, dVar3, eVar4);
                        sVar.o0(i1Var);
                    } else {
                        i1Var = new i1(dVar, z15, fVar4, z16, dVar3, eVar4);
                        sVar.o0(i1Var);
                    }
                    w2.a0.b(rVar4, (fz.e) i1Var, sVar, (i13 >> 3) & 14, 0);
                    fVar3 = fVar4;
                    eVar3 = eVar4;
                    z14 = z15;
                    rVar3 = rVar4;
                } else {
                    sVar.W();
                    rVar3 = rVar2;
                    z14 = z12;
                    fVar3 = fVar2;
                    eVar3 = eVar2;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new j1(dVar, rVar3, z14, fVar3, eVar3, dVar2, i11, i12);
                }
            }
            i13 |= 3072;
            fVar2 = fVar;
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((i11 & 24576) == 0) {
                    eVar2 = eVar;
                    if (sVar.h(eVar2)) {
                        i19 = 16384;
                    } else {
                        i19 = OSSConstants.DEFAULT_BUFFER_SIZE;
                    }
                    i13 |= i19;
                }
                if ((196608 & i11) == 0) {
                    dVar3 = dVar2;
                    if (sVar.h(dVar3)) {
                        i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                } else {
                    dVar3 = dVar2;
                }
                if ((i13 & 74899) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (sVar.T(i13 & 1, z13)) {
                    if (i22 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i14 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i16 != 0) {
                        fVar4 = f23759f;
                    } else {
                        fVar4 = fVar2;
                    }
                    if (i18 != 0) {
                        eVar4 = f23760g;
                    } else {
                        eVar4 = eVar2;
                    }
                    if (d4.g(sVar) == v3.m.Rtl) {
                        sVar.d0(-644215496);
                        sVar.p(false);
                        z16 = true;
                    } else {
                        sVar.d0(-297874355);
                        if (iu.k.p(sVar) == -1.0f) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        sVar.p(false);
                    }
                    boolean zH7 = sVar.h(dVar);
                    if ((i13 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean z27 = zH7 | z17;
                    if ((i13 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean zG7 = z27 | z18 | sVar.g(z16);
                    if ((458752 & i13) == 131072) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z20 = zG7 | z19 | ((57344 & i13) == 16384);
                    Object objQ7 = sVar.Q();
                    if (z20) {
                        i1Var = new i1(dVar, z15, fVar4, z16, dVar3, eVar4);
                        sVar.o0(i1Var);
                    } else {
                        i1Var = new i1(dVar, z15, fVar4, z16, dVar3, eVar4);
                        sVar.o0(i1Var);
                    }
                    w2.a0.b(rVar4, (fz.e) i1Var, sVar, (i13 >> 3) & 14, 0);
                    fVar3 = fVar4;
                    eVar3 = eVar4;
                    z14 = z15;
                    rVar3 = rVar4;
                } else {
                    sVar.W();
                    rVar3 = rVar2;
                    z14 = z12;
                    fVar3 = fVar2;
                    eVar3 = eVar2;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new j1(dVar, rVar3, z14, fVar3, eVar3, dVar2, i11, i12);
                }
            }
            i13 |= 24576;
            eVar2 = eVar;
            if ((196608 & i11) == 0) {
                dVar3 = dVar2;
                if (sVar.h(dVar3)) {
                    i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                } else {
                    i21 = 65536;
                }
                i13 |= i21;
            } else {
                dVar3 = dVar2;
            }
            if ((i13 & 74899) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (sVar.T(i13 & 1, z13)) {
                if (i22 != 0) {
                    rVar4 = z1.o.f58481a;
                } else {
                    rVar4 = rVar2;
                }
                if (i14 != 0) {
                    z15 = true;
                } else {
                    z15 = z12;
                }
                if (i16 != 0) {
                    fVar4 = f23759f;
                } else {
                    fVar4 = fVar2;
                }
                if (i18 != 0) {
                    eVar4 = f23760g;
                } else {
                    eVar4 = eVar2;
                }
                if (d4.g(sVar) == v3.m.Rtl) {
                    sVar.d0(-644215496);
                    sVar.p(false);
                    z16 = true;
                } else {
                    sVar.d0(-297874355);
                    if (iu.k.p(sVar) == -1.0f) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    sVar.p(false);
                }
                boolean zH8 = sVar.h(dVar);
                if ((i13 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z28 = zH8 | z17;
                if ((i13 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean zG8 = z28 | z18 | sVar.g(z16);
                if ((458752 & i13) == 131072) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z20 = zG8 | z19 | ((57344 & i13) == 16384);
                Object objQ8 = sVar.Q();
                if (z20) {
                    i1Var = new i1(dVar, z15, fVar4, z16, dVar3, eVar4);
                    sVar.o0(i1Var);
                } else {
                    i1Var = new i1(dVar, z15, fVar4, z16, dVar3, eVar4);
                    sVar.o0(i1Var);
                }
                w2.a0.b(rVar4, (fz.e) i1Var, sVar, (i13 >> 3) & 14, 0);
                fVar3 = fVar4;
                eVar3 = eVar4;
                z14 = z15;
                rVar3 = rVar4;
            } else {
                sVar.W();
                rVar3 = rVar2;
                z14 = z12;
                fVar3 = fVar2;
                eVar3 = eVar2;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new j1(dVar, rVar3, z14, fVar3, eVar3, dVar2, i11, i12);
            }
        }
        i13 |= 48;
        rVar2 = rVar;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & 384) == 0) {
                z12 = z11;
                if (sVar.g(z12)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 3072) == 0) {
                    fVar2 = fVar;
                    if (sVar.h(fVar2)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 16;
                if (i18 != 0) {
                    if ((i11 & 24576) == 0) {
                        eVar2 = eVar;
                        if (sVar.h(eVar2)) {
                            i19 = 16384;
                        } else {
                            i19 = OSSConstants.DEFAULT_BUFFER_SIZE;
                        }
                        i13 |= i19;
                    }
                    if ((196608 & i11) == 0) {
                        dVar3 = dVar2;
                        if (sVar.h(dVar3)) {
                            i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    } else {
                        dVar3 = dVar2;
                    }
                    if ((i13 & 74899) != 74898) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (sVar.T(i13 & 1, z13)) {
                        if (i22 != 0) {
                            rVar4 = z1.o.f58481a;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i14 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i16 != 0) {
                            fVar4 = f23759f;
                        } else {
                            fVar4 = fVar2;
                        }
                        if (i18 != 0) {
                            eVar4 = f23760g;
                        } else {
                            eVar4 = eVar2;
                        }
                        if (d4.g(sVar) == v3.m.Rtl) {
                            sVar.d0(-644215496);
                            sVar.p(false);
                            z16 = true;
                        } else {
                            sVar.d0(-297874355);
                            if (iu.k.p(sVar) == -1.0f) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            sVar.p(false);
                        }
                        boolean zH9 = sVar.h(dVar);
                        if ((i13 & 896) == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        boolean z29 = zH9 | z17;
                        if ((i13 & 7168) == 2048) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        boolean zG9 = z29 | z18 | sVar.g(z16);
                        if ((458752 & i13) == 131072) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z20 = zG9 | z19 | ((57344 & i13) == 16384);
                        Object objQ9 = sVar.Q();
                        if (z20) {
                            i1Var = new i1(dVar, z15, fVar4, z16, dVar3, eVar4);
                            sVar.o0(i1Var);
                        } else {
                            i1Var = new i1(dVar, z15, fVar4, z16, dVar3, eVar4);
                            sVar.o0(i1Var);
                        }
                        w2.a0.b(rVar4, (fz.e) i1Var, sVar, (i13 >> 3) & 14, 0);
                        fVar3 = fVar4;
                        eVar3 = eVar4;
                        z14 = z15;
                        rVar3 = rVar4;
                    } else {
                        sVar.W();
                        rVar3 = rVar2;
                        z14 = z12;
                        fVar3 = fVar2;
                        eVar3 = eVar2;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new j1(dVar, rVar3, z14, fVar3, eVar3, dVar2, i11, i12);
                    }
                }
                i13 |= 24576;
                eVar2 = eVar;
                if ((196608 & i11) == 0) {
                    dVar3 = dVar2;
                    if (sVar.h(dVar3)) {
                        i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                } else {
                    dVar3 = dVar2;
                }
                if ((i13 & 74899) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (sVar.T(i13 & 1, z13)) {
                    if (i22 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i14 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i16 != 0) {
                        fVar4 = f23759f;
                    } else {
                        fVar4 = fVar2;
                    }
                    if (i18 != 0) {
                        eVar4 = f23760g;
                    } else {
                        eVar4 = eVar2;
                    }
                    if (d4.g(sVar) == v3.m.Rtl) {
                        sVar.d0(-644215496);
                        sVar.p(false);
                        z16 = true;
                    } else {
                        sVar.d0(-297874355);
                        if (iu.k.p(sVar) == -1.0f) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        sVar.p(false);
                    }
                    boolean zH10 = sVar.h(dVar);
                    if ((i13 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean z210 = zH10 | z17;
                    if ((i13 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean zG10 = z210 | z18 | sVar.g(z16);
                    if ((458752 & i13) == 131072) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z20 = zG10 | z19 | ((57344 & i13) == 16384);
                    Object objQ10 = sVar.Q();
                    if (z20) {
                        i1Var = new i1(dVar, z15, fVar4, z16, dVar3, eVar4);
                        sVar.o0(i1Var);
                    } else {
                        i1Var = new i1(dVar, z15, fVar4, z16, dVar3, eVar4);
                        sVar.o0(i1Var);
                    }
                    w2.a0.b(rVar4, (fz.e) i1Var, sVar, (i13 >> 3) & 14, 0);
                    fVar3 = fVar4;
                    eVar3 = eVar4;
                    z14 = z15;
                    rVar3 = rVar4;
                } else {
                    sVar.W();
                    rVar3 = rVar2;
                    z14 = z12;
                    fVar3 = fVar2;
                    eVar3 = eVar2;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new j1(dVar, rVar3, z14, fVar3, eVar3, dVar2, i11, i12);
                }
            }
            i13 |= 3072;
            fVar2 = fVar;
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((i11 & 24576) == 0) {
                    eVar2 = eVar;
                    if (sVar.h(eVar2)) {
                        i19 = 16384;
                    } else {
                        i19 = OSSConstants.DEFAULT_BUFFER_SIZE;
                    }
                    i13 |= i19;
                }
                if ((196608 & i11) == 0) {
                    dVar3 = dVar2;
                    if (sVar.h(dVar3)) {
                        i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                } else {
                    dVar3 = dVar2;
                }
                if ((i13 & 74899) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (sVar.T(i13 & 1, z13)) {
                    if (i22 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i14 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i16 != 0) {
                        fVar4 = f23759f;
                    } else {
                        fVar4 = fVar2;
                    }
                    if (i18 != 0) {
                        eVar4 = f23760g;
                    } else {
                        eVar4 = eVar2;
                    }
                    if (d4.g(sVar) == v3.m.Rtl) {
                        sVar.d0(-644215496);
                        sVar.p(false);
                        z16 = true;
                    } else {
                        sVar.d0(-297874355);
                        if (iu.k.p(sVar) == -1.0f) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        sVar.p(false);
                    }
                    boolean zH11 = sVar.h(dVar);
                    if ((i13 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean z211 = zH11 | z17;
                    if ((i13 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean zG11 = z211 | z18 | sVar.g(z16);
                    if ((458752 & i13) == 131072) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z20 = zG11 | z19 | ((57344 & i13) == 16384);
                    Object objQ11 = sVar.Q();
                    if (z20) {
                        i1Var = new i1(dVar, z15, fVar4, z16, dVar3, eVar4);
                        sVar.o0(i1Var);
                    } else {
                        i1Var = new i1(dVar, z15, fVar4, z16, dVar3, eVar4);
                        sVar.o0(i1Var);
                    }
                    w2.a0.b(rVar4, (fz.e) i1Var, sVar, (i13 >> 3) & 14, 0);
                    fVar3 = fVar4;
                    eVar3 = eVar4;
                    z14 = z15;
                    rVar3 = rVar4;
                } else {
                    sVar.W();
                    rVar3 = rVar2;
                    z14 = z12;
                    fVar3 = fVar2;
                    eVar3 = eVar2;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new j1(dVar, rVar3, z14, fVar3, eVar3, dVar2, i11, i12);
                }
            }
            i13 |= 24576;
            eVar2 = eVar;
            if ((196608 & i11) == 0) {
                dVar3 = dVar2;
                if (sVar.h(dVar3)) {
                    i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                } else {
                    i21 = 65536;
                }
                i13 |= i21;
            } else {
                dVar3 = dVar2;
            }
            if ((i13 & 74899) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (sVar.T(i13 & 1, z13)) {
                if (i22 != 0) {
                    rVar4 = z1.o.f58481a;
                } else {
                    rVar4 = rVar2;
                }
                if (i14 != 0) {
                    z15 = true;
                } else {
                    z15 = z12;
                }
                if (i16 != 0) {
                    fVar4 = f23759f;
                } else {
                    fVar4 = fVar2;
                }
                if (i18 != 0) {
                    eVar4 = f23760g;
                } else {
                    eVar4 = eVar2;
                }
                if (d4.g(sVar) == v3.m.Rtl) {
                    sVar.d0(-644215496);
                    sVar.p(false);
                    z16 = true;
                } else {
                    sVar.d0(-297874355);
                    if (iu.k.p(sVar) == -1.0f) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    sVar.p(false);
                }
                boolean zH12 = sVar.h(dVar);
                if ((i13 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z212 = zH12 | z17;
                if ((i13 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean zG12 = z212 | z18 | sVar.g(z16);
                if ((458752 & i13) == 131072) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z20 = zG12 | z19 | ((57344 & i13) == 16384);
                Object objQ12 = sVar.Q();
                if (z20) {
                    i1Var = new i1(dVar, z15, fVar4, z16, dVar3, eVar4);
                    sVar.o0(i1Var);
                } else {
                    i1Var = new i1(dVar, z15, fVar4, z16, dVar3, eVar4);
                    sVar.o0(i1Var);
                }
                w2.a0.b(rVar4, (fz.e) i1Var, sVar, (i13 >> 3) & 14, 0);
                fVar3 = fVar4;
                eVar3 = eVar4;
                z14 = z15;
                rVar3 = rVar4;
            } else {
                sVar.W();
                rVar3 = rVar2;
                z14 = z12;
                fVar3 = fVar2;
                eVar3 = eVar2;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new j1(dVar, rVar3, z14, fVar3, eVar3, dVar2, i11, i12);
            }
        }
        i13 |= 384;
        z12 = z11;
        i16 = i12 & 8;
        if (i16 != 0) {
            if ((i11 & 3072) == 0) {
                fVar2 = fVar;
                if (sVar.h(fVar2)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i13 |= i17;
            }
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((i11 & 24576) == 0) {
                    eVar2 = eVar;
                    if (sVar.h(eVar2)) {
                        i19 = 16384;
                    } else {
                        i19 = OSSConstants.DEFAULT_BUFFER_SIZE;
                    }
                    i13 |= i19;
                }
                if ((196608 & i11) == 0) {
                    dVar3 = dVar2;
                    if (sVar.h(dVar3)) {
                        i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                } else {
                    dVar3 = dVar2;
                }
                if ((i13 & 74899) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (sVar.T(i13 & 1, z13)) {
                    if (i22 != 0) {
                        rVar4 = z1.o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i14 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i16 != 0) {
                        fVar4 = f23759f;
                    } else {
                        fVar4 = fVar2;
                    }
                    if (i18 != 0) {
                        eVar4 = f23760g;
                    } else {
                        eVar4 = eVar2;
                    }
                    if (d4.g(sVar) == v3.m.Rtl) {
                        sVar.d0(-644215496);
                        sVar.p(false);
                        z16 = true;
                    } else {
                        sVar.d0(-297874355);
                        if (iu.k.p(sVar) == -1.0f) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        sVar.p(false);
                    }
                    boolean zH13 = sVar.h(dVar);
                    if ((i13 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean z213 = zH13 | z17;
                    if ((i13 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean zG13 = z213 | z18 | sVar.g(z16);
                    if ((458752 & i13) == 131072) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z20 = zG13 | z19 | ((57344 & i13) == 16384);
                    Object objQ13 = sVar.Q();
                    if (z20) {
                        i1Var = new i1(dVar, z15, fVar4, z16, dVar3, eVar4);
                        sVar.o0(i1Var);
                    } else {
                        i1Var = new i1(dVar, z15, fVar4, z16, dVar3, eVar4);
                        sVar.o0(i1Var);
                    }
                    w2.a0.b(rVar4, (fz.e) i1Var, sVar, (i13 >> 3) & 14, 0);
                    fVar3 = fVar4;
                    eVar3 = eVar4;
                    z14 = z15;
                    rVar3 = rVar4;
                } else {
                    sVar.W();
                    rVar3 = rVar2;
                    z14 = z12;
                    fVar3 = fVar2;
                    eVar3 = eVar2;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new j1(dVar, rVar3, z14, fVar3, eVar3, dVar2, i11, i12);
                }
            }
            i13 |= 24576;
            eVar2 = eVar;
            if ((196608 & i11) == 0) {
                dVar3 = dVar2;
                if (sVar.h(dVar3)) {
                    i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                } else {
                    i21 = 65536;
                }
                i13 |= i21;
            } else {
                dVar3 = dVar2;
            }
            if ((i13 & 74899) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (sVar.T(i13 & 1, z13)) {
                if (i22 != 0) {
                    rVar4 = z1.o.f58481a;
                } else {
                    rVar4 = rVar2;
                }
                if (i14 != 0) {
                    z15 = true;
                } else {
                    z15 = z12;
                }
                if (i16 != 0) {
                    fVar4 = f23759f;
                } else {
                    fVar4 = fVar2;
                }
                if (i18 != 0) {
                    eVar4 = f23760g;
                } else {
                    eVar4 = eVar2;
                }
                if (d4.g(sVar) == v3.m.Rtl) {
                    sVar.d0(-644215496);
                    sVar.p(false);
                    z16 = true;
                } else {
                    sVar.d0(-297874355);
                    if (iu.k.p(sVar) == -1.0f) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    sVar.p(false);
                }
                boolean zH14 = sVar.h(dVar);
                if ((i13 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z214 = zH14 | z17;
                if ((i13 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean zG14 = z214 | z18 | sVar.g(z16);
                if ((458752 & i13) == 131072) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z20 = zG14 | z19 | ((57344 & i13) == 16384);
                Object objQ14 = sVar.Q();
                if (z20) {
                    i1Var = new i1(dVar, z15, fVar4, z16, dVar3, eVar4);
                    sVar.o0(i1Var);
                } else {
                    i1Var = new i1(dVar, z15, fVar4, z16, dVar3, eVar4);
                    sVar.o0(i1Var);
                }
                w2.a0.b(rVar4, (fz.e) i1Var, sVar, (i13 >> 3) & 14, 0);
                fVar3 = fVar4;
                eVar3 = eVar4;
                z14 = z15;
                rVar3 = rVar4;
            } else {
                sVar.W();
                rVar3 = rVar2;
                z14 = z12;
                fVar3 = fVar2;
                eVar3 = eVar2;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new j1(dVar, rVar3, z14, fVar3, eVar3, dVar2, i11, i12);
            }
        }
        i13 |= 3072;
        fVar2 = fVar;
        i18 = i12 & 16;
        if (i18 != 0) {
            if ((i11 & 24576) == 0) {
                eVar2 = eVar;
                if (sVar.h(eVar2)) {
                    i19 = 16384;
                } else {
                    i19 = OSSConstants.DEFAULT_BUFFER_SIZE;
                }
                i13 |= i19;
            }
            if ((196608 & i11) == 0) {
                dVar3 = dVar2;
                if (sVar.h(dVar3)) {
                    i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                } else {
                    i21 = 65536;
                }
                i13 |= i21;
            } else {
                dVar3 = dVar2;
            }
            if ((i13 & 74899) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (sVar.T(i13 & 1, z13)) {
                if (i22 != 0) {
                    rVar4 = z1.o.f58481a;
                } else {
                    rVar4 = rVar2;
                }
                if (i14 != 0) {
                    z15 = true;
                } else {
                    z15 = z12;
                }
                if (i16 != 0) {
                    fVar4 = f23759f;
                } else {
                    fVar4 = fVar2;
                }
                if (i18 != 0) {
                    eVar4 = f23760g;
                } else {
                    eVar4 = eVar2;
                }
                if (d4.g(sVar) == v3.m.Rtl) {
                    sVar.d0(-644215496);
                    sVar.p(false);
                    z16 = true;
                } else {
                    sVar.d0(-297874355);
                    if (iu.k.p(sVar) == -1.0f) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    sVar.p(false);
                }
                boolean zH15 = sVar.h(dVar);
                if ((i13 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z215 = zH15 | z17;
                if ((i13 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean zG15 = z215 | z18 | sVar.g(z16);
                if ((458752 & i13) == 131072) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z20 = zG15 | z19 | ((57344 & i13) == 16384);
                Object objQ15 = sVar.Q();
                if (z20) {
                    i1Var = new i1(dVar, z15, fVar4, z16, dVar3, eVar4);
                    sVar.o0(i1Var);
                } else {
                    i1Var = new i1(dVar, z15, fVar4, z16, dVar3, eVar4);
                    sVar.o0(i1Var);
                }
                w2.a0.b(rVar4, (fz.e) i1Var, sVar, (i13 >> 3) & 14, 0);
                fVar3 = fVar4;
                eVar3 = eVar4;
                z14 = z15;
                rVar3 = rVar4;
            } else {
                sVar.W();
                rVar3 = rVar2;
                z14 = z12;
                fVar3 = fVar2;
                eVar3 = eVar2;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new j1(dVar, rVar3, z14, fVar3, eVar3, dVar2, i11, i12);
            }
        }
        i13 |= 24576;
        eVar2 = eVar;
        if ((196608 & i11) == 0) {
            dVar3 = dVar2;
            if (sVar.h(dVar3)) {
                i21 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
            } else {
                i21 = 65536;
            }
            i13 |= i21;
        } else {
            dVar3 = dVar2;
        }
        if ((i13 & 74899) != 74898) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (sVar.T(i13 & 1, z13)) {
            if (i22 != 0) {
                rVar4 = z1.o.f58481a;
            } else {
                rVar4 = rVar2;
            }
            if (i14 != 0) {
                z15 = true;
            } else {
                z15 = z12;
            }
            if (i16 != 0) {
                fVar4 = f23759f;
            } else {
                fVar4 = fVar2;
            }
            if (i18 != 0) {
                eVar4 = f23760g;
            } else {
                eVar4 = eVar2;
            }
            if (d4.g(sVar) == v3.m.Rtl) {
                sVar.d0(-644215496);
                sVar.p(false);
                z16 = true;
            } else {
                sVar.d0(-297874355);
                if (iu.k.p(sVar) == -1.0f) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                sVar.p(false);
            }
            boolean zH16 = sVar.h(dVar);
            if ((i13 & 896) == 256) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean z216 = zH16 | z17;
            if ((i13 & 7168) == 2048) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean zG16 = z216 | z18 | sVar.g(z16);
            if ((458752 & i13) == 131072) {
                z19 = true;
            } else {
                z19 = false;
            }
            z20 = zG16 | z19 | ((57344 & i13) == 16384);
            Object objQ16 = sVar.Q();
            if (z20) {
                i1Var = new i1(dVar, z15, fVar4, z16, dVar3, eVar4);
                sVar.o0(i1Var);
            } else {
                i1Var = new i1(dVar, z15, fVar4, z16, dVar3, eVar4);
                sVar.o0(i1Var);
            }
            w2.a0.b(rVar4, (fz.e) i1Var, sVar, (i13 >> 3) & 14, 0);
            fVar3 = fVar4;
            eVar3 = eVar4;
            z14 = z15;
            rVar3 = rVar4;
        } else {
            sVar.W();
            rVar3 = rVar2;
            z14 = z12;
            fVar3 = fVar2;
            eVar3 = eVar2;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new j1(dVar, rVar3, z14, fVar3, eVar3, dVar2, i11, i12);
        }
    }

    public static final void r(boolean z11, t1.d dVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-817052152);
        int i12 = (sVar.g(z11) ? 4 : 2) | i11 | (sVar.h(dVar) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            l1.c3 c3Var = h1.v1.f31180a;
            long j11 = ((h1.s1) sVar.j(c3Var)).f31033p;
            float fP = iu.k.p(sVar);
            long j12 = ((h1.s1) sVar.j(c3Var)).A;
            z1.r rVarI = j0.e2.i(j0.e2.e(z1.o.f58481a, 1.0f), c.f23677h, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            boolean zC = sVar.c(fP) | sVar.e(j11) | sVar.e(j12);
            Object objQ = sVar.Q();
            if (zC || objQ == l1.m.f39353a) {
                g1 g1Var = new g1(fP, j11, j12, 0);
                sVar.o0(g1Var);
                objQ = g1Var;
            }
            z1.r rVarD = d2.h.d(rVarI, (fz.c) objQ);
            int i13 = (i12 << 6) & 7168;
            w2.q0 q0VarD = j0.o.d(z11 ? z1.c.f58467e : z1.c.f58466d, false);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarD);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, q0VarD, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            dVar.invoke(j0.r.f35391a, sVar, Integer.valueOf(((i13 >> 6) & 112) | 6));
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new d1(z11, dVar, i11, 1);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    public static final void s(d dVar, boolean z11, fz.f fVar, l1.n nVar, int i11) {
        b bVar;
        boolean z12 = z11;
        boolean z13 = dVar.f23725h;
        boolean z14 = dVar.f23724g;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(809517781);
        int i12 = i11 | (sVar.h(dVar) ? 4 : 2) | (sVar.g(z12) ? 32 : 16) | (sVar.h(fVar) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.o oVar = z1.o.f58481a;
            z1.r rVarC = z1.a.c(sVar, oVar);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, uVarA, sVar);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            int iIntValue = ((Number) sVar.j(ju.f.f37370d)).intValue();
            boolean zG = sVar.g(z14) | sVar.g(z13);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zG || objQ == gVar) {
                if (z14) {
                    bVar = b.SENTENCE_LEARN;
                } else {
                    bVar = z13 ? b.SPEAKING_PRACTICE : b.NORMAL;
                }
                objQ = bVar;
                sVar.o0(objQ);
            }
            b bVar2 = (b) objQ;
            boolean zG2 = sVar.g(ry.l.D(new Integer[]{12, 1}, Integer.valueOf(iIntValue))) | sVar.d(bVar2.ordinal());
            Object objQ2 = sVar.Q();
            if (zG2 || objQ2 == gVar) {
                float f5 = c.f23670a;
                ry.l.D(new Integer[]{12, 1}, Integer.valueOf(iIntValue));
                List list = c.f23686r;
                List list2 = (List) c.f23688t.get(bVar2);
                if (list2 == null) {
                    list2 = list;
                }
                ry.r rVar = c.f23687s;
                if (list2 == rVar) {
                    rVar.getClass();
                }
                jz.d dVar2 = jz.e.f37397a;
                a aVar = (a) ry.m.J0(list2);
                if (aVar == null) {
                    a aVar2 = (a) ry.m.s0(list);
                    if (aVar2 == null) {
                        aVar2 = (a) ry.m.q0(c.f23684p);
                    }
                    objQ2 = aVar2;
                } else {
                    objQ2 = aVar;
                }
                sVar.o0(objQ2);
            }
            a aVar3 = (a) objQ2;
            z1.j jVar = z1.c.f58467e;
            float f11 = aVar3.f23623b;
            long j11 = aVar3.f23625d;
            z1.r rVarX = j0.c.x(j0.c.j(j0.e2.s(oVar, f11), 0.7075812f), v3.g.a(j11), Float.intBitsToFloat((int) (j11 & 4294967295L)));
            w2.q0 q0VarD = j0.o.d(jVar, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarX);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, q0VarD, sVar);
            l1.t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar);
            if (kotlin.jvm.internal.m.a(dVar.f23718a, Uri.EMPTY)) {
                z12 = z11;
                sVar.d0(585347391);
                com.bumptech.glide.d.a(j0.c.A(j0.e2.s(oVar, aVar3.f23624c), 4), aVar3.f23622a, dVar.f23721d, dVar.f23722e, dVar.f23723f, dVar.f23727j, null, sVar, 0);
                sVar.p(false);
            } else {
                sVar.d0(584228446);
                float f12 = 12;
                z1.r rVarB = d2.h.b(j0.c.j(j0.e2.s(j0.c.E(oVar, (-v3.g.a(j11)) - 6, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), (v3.g.a(j11) + aVar3.f23623b) - f12), 0.82857144f), r0.f.d(f12));
                d0.v vVarA = d0.n.a(((h1.s1) sVar.j(h1.v1.f31180a)).A, 1);
                z1.r rVarK = d0.n.k(vVarA.f22811a, vVarA.f22812b, r0.f.d(f12), rVarB);
                w2.q0 q0VarD2 = j0.o.d(z1.c.f58463a, false);
                int iHashCode3 = Long.hashCode(sVar.T);
                l1.q1 q1VarL3 = sVar.l();
                z1.r rVarC3 = z1.a.c(sVar, rVarK);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar, q0VarD2, sVar);
                l1.t.J(hVar2, q1VarL3, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                    defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                }
                l1.t.J(hVar4, rVarC3, sVar);
                z12 = z11;
                y4.a(dVar.f23718a, j0.e2.d(oVar, 1.0f), dVar.f23722e, z12, dVar.f23719b, dVar.f23720c, dVar.f23726i, sVar, ((i12 << 6) & 7168) | 48, 0);
                sVar.p(true);
                sVar.p(false);
            }
            sVar.p(true);
            fVar.invoke(j0.v.f35424a, sVar, Integer.valueOf(6 | ((i12 >> 3) & 112)));
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new h1(dVar, z12, fVar, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0302  */
    /* JADX WARN: Code duplicated, block: B:117:0x0306  */
    /* JADX WARN: Code duplicated, block: B:120:0x031c  */
    /* JADX WARN: Code duplicated, block: B:121:0x031e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0345  */
    /* JADX WARN: Code duplicated, block: B:130:0x0387  */
    /* JADX WARN: Code duplicated, block: B:131:0x0389  */
    /* JADX WARN: Code duplicated, block: B:137:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:141:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:144:0x0401  */
    /* JADX WARN: Code duplicated, block: B:145:0x0405  */
    /* JADX WARN: Code duplicated, block: B:150:0x0428  */
    /* JADX WARN: Code duplicated, block: B:153:0x0446  */
    /* JADX WARN: Code duplicated, block: B:156:0x0476  */
    /* JADX WARN: Code duplicated, block: B:158:0x047b  */
    /* JADX WARN: Code duplicated, block: B:161:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:162:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:165:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:166:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:169:0x04df  */
    /* JADX WARN: Code duplicated, block: B:170:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:173:0x050a  */
    /* JADX WARN: Code duplicated, block: B:175:0x050f  */
    /* JADX WARN: Code duplicated, block: B:178:0x0539  */
    /* JADX WARN: Code duplicated, block: B:179:0x053c  */
    /* JADX WARN: Code duplicated, block: B:182:0x055d  */
    /* JADX WARN: Code duplicated, block: B:183:0x0589  */
    /* JADX WARN: Code duplicated, block: B:185:0x059f  */
    /* JADX WARN: Code duplicated, block: B:194:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:197:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:199:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:202:0x063f  */
    /* JADX WARN: Code duplicated, block: B:207:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:209:0x0730  */
    /* JADX WARN: Code duplicated, block: B:292:0x0b2e  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void t(final j0.q qVar, final boolean z11, final Uri videoUri, final Long l9, final long j11, final fz.c onVideoPlayingStateChanged, z1.r rVar, final boolean z12, l1.n nVar, final int i11) {
        int i12;
        l1.s sVar;
        final z1.r rVar2;
        Object objB;
        l1.g gVar;
        l1.b1 b1Var;
        l1.b1 b1Var2;
        l1.b1 b1Var3;
        float f5;
        float f11;
        float f12;
        float f13;
        int i13;
        boolean z13;
        l1.b1 b1Var4;
        boolean z14;
        boolean z15;
        Object objQ;
        float f14;
        int i14;
        boolean z16;
        boolean zF;
        Object objQ2;
        vy.d dVar;
        l1.b1 b1Var5;
        l1.b1 b1Var6;
        l1.b1 b1Var7;
        z1.o oVar;
        boolean zF2;
        Object objQ3;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        float f15;
        float f16;
        boolean zBooleanValue;
        float f17;
        l1.g gVar2;
        float f18;
        float f19;
        int i15;
        float f21;
        float f22;
        int iQ;
        long jQ;
        b0.m g1Var;
        float f23;
        l1.b1 b1Var8;
        l1.b1 b1Var9;
        float f24;
        l1.b1 b1Var10;
        l1.b1 b1Var11;
        float f25;
        float f26;
        l1.g gVar3;
        z1.r e0Var;
        z1.o oVar2;
        boolean z17;
        boolean z18;
        boolean z19;
        y2.h hVar2;
        float f27;
        float f28;
        float f29;
        l1.b1 b1Var12;
        l1.b1 b1Var13;
        l1.b1 b1Var14;
        l1.b1 b1Var15;
        float f30;
        float f31;
        l1.b1 b1Var16;
        boolean zF3;
        Object objQ4;
        float f32;
        l1.b1 b1Var17;
        l1.b1 b1Var18;
        l1.b1 b1Var19;
        float f33;
        kotlin.jvm.internal.m.f(qVar, "<this>");
        kotlin.jvm.internal.m.f(videoUri, "videoUri");
        kotlin.jvm.internal.m.f(onVideoPlayingStateChanged, "onVideoPlayingStateChanged");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1952332179);
        if ((i11 & 48) == 0) {
            i12 = (sVar2.g(z11) ? 32 : 16) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar2.h(videoUri) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.h(l9) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar2.e(j11) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar2.h(onVideoPlayingStateChanged) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        int i16 = i12 | 1572864;
        if ((12582912 & i11) == 0) {
            i16 |= sVar2.g(z12) ? 8388608 : 4194304;
        }
        int i17 = i16;
        if (!sVar2.T(i17 & 1, (4793489 & i17) != 4793488)) {
            sVar = sVar2;
            sVar.W();
            rVar2 = rVar;
        } else {
            if (videoUri.equals(Uri.EMPTY)) {
                l1.x1 x1VarT = sVar2.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: dt.m1
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            e.t(qVar, z11, videoUri, l9, j11, onVideoPlayingStateChanged, z1.o.f58481a, z12, (l1.n) obj, l1.t.M(i11 | 1));
                            return qy.b0.f48488a;
                        }
                    };
                    return;
                }
                return;
            }
            v3.c cVar = (v3.c) sVar2.j(z2.g1.f58547h);
            float f34 = 112;
            float f35 = f34 * 1.2068965f;
            float f36 = 24;
            float f37 = 84;
            float f38 = 12;
            float f39 = 10;
            r0.e eVarF = r0.f.f(f39, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f39, 6);
            float fE0 = cVar.e0(f34);
            float fE1 = cVar.e0(f35);
            float fE2 = cVar.e0(f36);
            float fE3 = cVar.e0(f37);
            float fE4 = cVar.e0(f38);
            float fE5 = cVar.e0(54);
            boolean zF4 = sVar2.f(l9);
            Object objQ5 = sVar2.Q();
            l1.g gVar4 = l1.m.f39353a;
            if (zF4 || objQ5 == gVar4) {
                objQ5 = l1.t.B(new v3.l(0L));
                sVar2.o0(objQ5);
            }
            l1.b1 b1Var20 = (l1.b1) objQ5;
            boolean zF5 = sVar2.f(l9);
            Object objQ6 = sVar2.Q();
            if (zF5 || objQ6 == gVar4) {
                objQ6 = l1.t.B(Boolean.TRUE);
                sVar2.o0(objQ6);
            }
            l1.b1 b1Var21 = (l1.b1) objQ6;
            boolean zF6 = sVar2.f(l9);
            Object objQ7 = sVar2.Q();
            if (zF6 || objQ7 == gVar4) {
                objQ7 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ7);
            }
            l1.b1 b1Var22 = (l1.b1) objQ7;
            boolean zF7 = sVar2.f(l9);
            Object objQ8 = sVar2.Q();
            if (zF7 || objQ8 == gVar4) {
                objQ8 = l1.t.B(new f2.b(0L));
                sVar2.o0(objQ8);
            }
            l1.b1 b1Var23 = (l1.b1) objQ8;
            boolean zF8 = sVar2.f(l9);
            Object objQ9 = sVar2.Q();
            if (zF8 || objQ9 == gVar4) {
                objB = l1.t.B(new f2.b(0L));
                sVar2.o0(objB);
            } else {
                objB = objQ9;
            }
            l1.b1 b1Var24 = (l1.b1) objB;
            boolean zF9 = sVar2.f(l9);
            Object objQ10 = sVar2.Q();
            if (zF9 || objQ10 == gVar4) {
                objQ10 = hh.p0.s(CropImageView.DEFAULT_ASPECT_RATIO, sVar2);
            }
            l1.g1 g1Var2 = (l1.g1) objQ10;
            boolean zF10 = sVar2.f(l9);
            Object objQ11 = sVar2.Q();
            if (zF10 || objQ11 == gVar4) {
                objQ11 = new l1.i1(0L);
                sVar2.o0(objQ11);
            }
            l1.i1 i1Var = (l1.i1) objQ11;
            boolean zF11 = sVar2.f(l9);
            Object objQ12 = sVar2.Q();
            if (zF11 || objQ12 == gVar4) {
                objQ12 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ12);
            }
            l1.b1 b1Var25 = (l1.b1) objQ12;
            boolean zF12 = sVar2.f(l9);
            Object objQ13 = sVar2.Q();
            if (zF12 || objQ13 == gVar4) {
                objQ13 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ13);
            }
            l1.b1 b1Var26 = (l1.b1) objQ13;
            boolean zF13 = sVar2.f(l9);
            Object objQ14 = sVar2.Q();
            if (zF13 || objQ14 == gVar4) {
                objQ14 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ14);
            }
            l1.b1 b1Var27 = (l1.b1) objQ14;
            WeakHashMap weakHashMap = j0.o2.f35353v;
            float f40 = j0.b.e(sVar2).f35359f.e().f48794b;
            float fMax = Math.max(j0.b.e(sVar2).f35356c.e().f48796d, j0.b.e(sVar2).f35358e.e().f48796d);
            Object[] objArr = {new v3.l(z(b1Var20)), Float.valueOf(f40), Float.valueOf(fMax), l9};
            boolean zF14 = sVar2.f(b1Var20) | sVar2.f(b1Var22) | sVar2.c(fE0) | sVar2.c(fE4) | sVar2.c(f40) | sVar2.c(fMax) | sVar2.c(fE1) | sVar2.c(fE5) | sVar2.f(b1Var23) | sVar2.f(b1Var24) | sVar2.f(g1Var2);
            Object objQ15 = sVar2.Q();
            if (zF14) {
                gVar = gVar4;
            } else {
                gVar = gVar4;
                if (objQ15 != gVar) {
                    b1Var = b1Var24;
                    f11 = f40;
                    f12 = fMax;
                    b1Var2 = b1Var23;
                    f13 = fE1;
                    b1Var3 = b1Var20;
                    f5 = fE0;
                }
                l1.t.i(objArr, (fz.e) objQ15, sVar2);
                Boolean boolValueOf = Boolean.valueOf(z11);
                Boolean boolValueOf2 = Boolean.valueOf(((Boolean) b1Var21.getValue()).booleanValue());
                i13 = i17 & 112;
                if (i13 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                b1Var4 = b1Var21;
                boolean zF15 = z13 | sVar2.f(b1Var4) | sVar2.f(b1Var27);
                if ((i17 & 458752) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | zF15;
                objQ = sVar2.Q();
                if (!z15 || objQ == gVar) {
                    f14 = CropImageView.DEFAULT_ASPECT_RATIO;
                    i14 = 12;
                    bt.n nVar2 = new bt.n(z11, onVideoPlayingStateChanged, b1Var4, b1Var27, (vy.d) null);
                    b1Var4 = b1Var4;
                    sVar2.o0(nVar2);
                    objQ = nVar2;
                } else {
                    f14 = CropImageView.DEFAULT_ASPECT_RATIO;
                    i14 = 12;
                }
                l1.t.h(boolValueOf, boolValueOf2, l9, (fz.e) objQ, sVar2);
                Boolean boolValueOf3 = Boolean.valueOf(z11);
                Boolean bool = (Boolean) b1Var22.getValue();
                bool.getClass();
                if (i13 == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zF = z16 | sVar2.f(b1Var22) | sVar2.f(r42);
                objQ2 = sVar2.Q();
                dVar = null;
                if (!zF || objQ2 == gVar) {
                    b1Var5 = b1Var4;
                    t1 t1Var = new t1(z11, b1Var22, r42, dVar, 0);
                    b1Var6 = b1Var22;
                    b1Var7 = r42;
                    sVar2.o0(t1Var);
                    objQ2 = t1Var;
                } else {
                    b1Var6 = b1Var22;
                    b1Var7 = b1Var26;
                    b1Var5 = b1Var4;
                }
                l1.t.h(boolValueOf3, bool, l9, (fz.e) objQ2, sVar2);
                oVar = z1.o.f58481a;
                z1.r rVarD = j0.e2.d(oVar, 1.0f);
                zF2 = sVar2.f(b1Var3);
                objQ3 = sVar2.Q();
                if (zF2 || objQ3 == gVar) {
                    objQ3 = new bp.h0(i14, b1Var3);
                    sVar2.o0(objQ3);
                }
                z1.r rVarO = w2.a0.o(rVarD, (fz.c) objQ3);
                z1.j jVar = z1.c.f58463a;
                w2.q0 q0VarD = j0.o.d(jVar, false);
                iHashCode = Long.hashCode(sVar2.T);
                l1.q1 q1VarL = sVar2.l();
                z1.r rVarC = z1.a.c(sVar2, rVarO);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                y2.h hVar3 = y2.j.f56917f;
                l1.t.J(hVar3, q0VarD, sVar2);
                y2.h hVar4 = y2.j.f56916e;
                l1.t.J(hVar4, q1VarL, sVar2);
                hVar = y2.j.f56918g;
                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                }
                y2.h hVar5 = y2.j.f56915d;
                l1.t.J(hVar5, rVarC, sVar2);
                f15 = (((int) (((v3.l) b1Var3.getValue()).f53498a >> 32)) - f5) - fE4;
                if (f15 < fE4) {
                    f15 = fE4;
                }
                float f41 = 0.2f * f5;
                f16 = f15 + f41;
                b0.v vVar = b0.b0.f3438a;
                b0.i2 i2VarR = b0.e.r(260, 0, vVar, 2);
                zBooleanValue = ((Boolean) b1Var7.getValue()).booleanValue();
                if (((Boolean) b1Var5.getValue()).booleanValue()) {
                    f17 = f14;
                } else {
                    f17 = 1.0f;
                }
                gVar2 = gVar;
                l1.b3 b3VarB = b0.h.b(f17, b0.e.r(260, 0, vVar, 2), "CourseVideoOverlayCollapseProgress", sVar2, 3072, 20);
                if (((Boolean) b1Var5.getValue()).booleanValue()) {
                    f18 = 1.0f;
                } else {
                    f18 = f14;
                }
                final l1.b3 b3VarB2 = b0.h.b(f18, b0.e.r(140, 0, null, 6), "CourseVideoOverlayPlayerAlpha", sVar2, 3120, 20);
                if (((Boolean) b1Var5.getValue()).booleanValue()) {
                    f19 = f14;
                } else {
                    f19 = 1.0f;
                }
                if (((Boolean) b1Var5.getValue()).booleanValue()) {
                    i15 = 90;
                } else {
                    i15 = 110;
                }
                l1.b3 b3VarB3 = b0.h.b(f19, b0.e.r(i15, 0, null, 4), "CourseVideoOverlayHandleAlpha", sVar2, 3072, 20);
                if (((Boolean) b1Var5.getValue()).booleanValue()) {
                    f21 = f34;
                } else {
                    f21 = f36;
                }
                l1.b3 b3VarA = b0.h.a(f21, b0.e.r(260, 0, vVar, 2), "CourseVideoOverlayPlayerWidth", sVar2, 384, 8);
                if (((Boolean) b1Var5.getValue()).booleanValue()) {
                    f22 = f35;
                } else {
                    f22 = f37;
                }
                l1.b3 b3VarA2 = b0.h.a(f22, b0.e.r(260, 0, vVar, 2), "CourseVideoOverlayPlayerHeight", sVar2, 384, 8);
                if (((Boolean) b1Var5.getValue()).booleanValue()) {
                    jQ = (((long) hz.b.Q(Float.intBitsToFloat((int) (((f2.b) b1Var2.getValue()).f26570a & 4294967295L)))) & 4294967295L) | (((long) hz.b.Q(Float.intBitsToFloat((int) (w(b1Var2) >> 32)))) << 32);
                } else {
                    iQ = hz.b.Q(((int) (((v3.l) b1Var3.getValue()).f53498a >> 32)) - fE2);
                    if (iQ < 0) {
                        iQ = 0;
                    }
                    jQ = (((long) hz.b.Q(g1Var2.l())) & 4294967295L) | (((long) iQ) << 32);
                }
                if (zBooleanValue || (((Boolean) b1Var5.getValue()).booleanValue() && ((Boolean) b1Var25.getValue()).booleanValue())) {
                    g1Var = new b0.g1(0);
                } else {
                    g1Var = i2VarR;
                }
                final l1.b3 b3VarC = b0.h.c(new v3.j(jQ), b0.e.f3501p, g1Var, null, "CourseVideoOverlayOffset", sVar2, 24576, 8);
                if (((Boolean) b1Var5.getValue()).booleanValue()) {
                    f23 = f34;
                } else {
                    f23 = f36;
                }
                l1.b3 b3VarA3 = b0.h.a(f23, b0.e.r(260, 0, vVar, 2), "CourseVideoOverlayWidth", sVar2, 384, 8);
                r0.e eVarE = r0.f.e(f38, (1.0f - ((Number) b3VarB.getValue()).floatValue()) * f38, (1.0f - ((Number) b3VarB.getValue()).floatValue()) * f38, f38);
                if (((Boolean) b1Var5.getValue()).booleanValue()) {
                    sVar2.d0(-1885601140);
                    Float fValueOf = Float.valueOf(f16);
                    b1Var15 = b1Var2;
                    float f42 = f11;
                    boolean zF16 = sVar2.f(b1Var25) | sVar2.f(b1Var15) | sVar2.c(f16) | sVar2.f(b1Var3) | sVar2.c(fE4) | sVar2.c(f5) | sVar2.c(f42);
                    f30 = f42;
                    float f43 = f12;
                    f31 = f43;
                    boolean zC = zF16 | sVar2.c(f43) | sVar2.c(f13);
                    b1Var16 = b1Var;
                    zF3 = zC | sVar2.f(b1Var16) | sVar2.f(g1Var2) | sVar2.f(r41) | sVar2.f(b1Var5);
                    objQ4 = sVar2.Q();
                    gVar3 = gVar2;
                    if (!zF3 || objQ4 == gVar3) {
                        l1.b1 b1Var28 = b1Var3;
                        float f44 = f13;
                        l1.b1 b1Var29 = b1Var5;
                        objQ4 = new y1(f16, fE4, f5, f30, f31, f44, b1Var25, b1Var15, b1Var28, b1Var16, b1Var29, g1Var2, i1Var);
                        f32 = f44;
                        b1Var17 = b1Var28;
                        b1Var18 = b1Var29;
                        g1Var2 = g1Var2;
                        f31 = f31;
                        b1Var19 = b1Var15;
                        f30 = f30;
                        f33 = fE4;
                        sVar2.o0(objQ4);
                    } else {
                        b1Var17 = b1Var3;
                        f32 = f13;
                        b1Var19 = b1Var15;
                        f33 = fE4;
                        b1Var18 = b1Var5;
                    }
                    PointerInputEventHandler pointerInputEventHandler = (PointerInputEventHandler) objQ4;
                    s2.l lVar = s2.g0.f51302a;
                    f5 = f5;
                    f24 = f33;
                    f25 = f30;
                    f26 = f31;
                    b1Var9 = b1Var17;
                    b1Var10 = b1Var19;
                    b1Var11 = b1Var16;
                    b1Var8 = b1Var18;
                    f13 = f32;
                    e0Var = new s2.e0(l9, fValueOf, null, pointerInputEventHandler, 4);
                    sVar2.p(false);
                } else {
                    b1Var8 = b1Var5;
                    b1Var9 = b1Var3;
                    f24 = fE4;
                    b1Var10 = b1Var2;
                    b1Var11 = b1Var;
                    f25 = f11;
                    f26 = f12;
                    gVar3 = gVar2;
                    sVar2.d0(-1884226693);
                    sVar2.p(false);
                    e0Var = oVar;
                }
                if (z11 || !((Boolean) b1Var6.getValue()).booleanValue()) {
                    sVar = sVar2;
                    oVar2 = oVar;
                    z17 = true;
                    z18 = false;
                    sVar.d0(-1896867749);
                } else {
                    sVar2.d0(-1884011832);
                    j0.r rVar3 = j0.r.f35391a;
                    z1.r rVarD2 = z1.a.d(rVar3.a(oVar, jVar), r79);
                    boolean zF17 = sVar2.f(b3VarC);
                    Object objQ16 = sVar2.Q();
                    if (zF17 || objQ16 == gVar3) {
                        z19 = false;
                        final Object[] objArr2 = 0 == true ? 1 : 0;
                        objQ16 = new fz.c() { // from class: dt.n1
                            @Override // fz.c
                            public final Object invoke(Object obj) {
                                switch (objArr2) {
                                    case 0:
                                        v3.c offset = (v3.c) obj;
                                        kotlin.jvm.internal.m.f(offset, "$this$offset");
                                        return new v3.j(((v3.j) b3VarC.getValue()).f53492a);
                                    default:
                                        g2.t0 graphicsLayer = (g2.t0) obj;
                                        kotlin.jvm.internal.m.f(graphicsLayer, "$this$graphicsLayer");
                                        graphicsLayer.b(((Number) b3VarC.getValue()).floatValue());
                                        return qy.b0.f48488a;
                                }
                            }
                        };
                        sVar2.o0(objQ16);
                    } else {
                        z19 = false;
                    }
                    z1.r rVarI = d2.h.b(j0.e2.p(j0.c.w(rVarD2, (fz.c) objQ16), ((v3.f) b3VarA3.getValue()).f53489a, f35), eVarE).i(e0Var);
                    w2.q0 q0VarD2 = j0.o.d(jVar, z19);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL2 = sVar2.l();
                    z1.r rVarC2 = z1.a.c(sVar2, rVarI);
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(r39, q0VarD2, sVar2);
                    l1.t.J(hVar4, q1VarL2, sVar2);
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                        hVar2 = r55;
                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar2);
                    } else {
                        hVar2 = hVar;
                    }
                    l1.t.J(hVar5, rVarC2, sVar2);
                    z1.r rVarA = rVar3.a(j0.e2.p(oVar, ((v3.f) b3VarA.getValue()).f53489a, ((v3.f) b3VarA2.getValue()).f53489a), z1.c.f58468f);
                    boolean zF18 = sVar2.f(b3VarB2);
                    Object objQ17 = sVar2.Q();
                    if (zF18 || objQ17 == gVar3) {
                        final int i18 = 1;
                        objQ17 = new fz.c() { // from class: dt.n1
                            @Override // fz.c
                            public final Object invoke(Object obj) {
                                switch (i18) {
                                    case 0:
                                        v3.c offset = (v3.c) obj;
                                        kotlin.jvm.internal.m.f(offset, "$this$offset");
                                        return new v3.j(((v3.j) b3VarB2.getValue()).f53492a);
                                    default:
                                        g2.t0 graphicsLayer = (g2.t0) obj;
                                        kotlin.jvm.internal.m.f(graphicsLayer, "$this$graphicsLayer");
                                        graphicsLayer.b(((Number) b3VarB2.getValue()).floatValue());
                                        return qy.b0.f48488a;
                                }
                            }
                        };
                        sVar2.o0(objQ17);
                    }
                    z1.r rVarQ = g2.f0.q(rVarA, (fz.c) objQ17);
                    w2.q0 q0VarD3 = j0.o.d(jVar, false);
                    int iHashCode3 = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL3 = sVar2.l();
                    z1.r rVarC3 = z1.a.c(sVar2, rVarQ);
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(r45);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(r39, q0VarD3, sVar2);
                    l1.t.J(hVar4, q1VarL3, sVar2);
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar2);
                    }
                    l1.t.J(hVar5, rVarC3, sVar2);
                    l1.g gVar5 = gVar3;
                    y2.h hVar6 = hVar2;
                    y4.a(videoUri, j0.e2.d(oVar, 1.0f), null, z12 && ((Boolean) b1Var8.getValue()).booleanValue(), r41.l() + j11, l9, onVideoPlayingStateChanged, sVar2, ((i17 >> 6) & 14) | 48 | ((i17 << 6) & 458752) | (3670016 & (i17 << 3)), 4);
                    sVar = sVar2;
                    sVar.p(true);
                    sVar.p(true);
                    if (!((Boolean) b1Var8.getValue()).booleanValue() || ((Number) b3VarB3.getValue()).floatValue() > 0.02f) {
                        sVar.d0(-1882241019);
                        final float fL = ((f13 - fE3) / 2.0f) + g1Var2.l();
                        final float f45 = ((int) (((v3.l) b1Var9.getValue()).f53498a >> 32)) - fE2;
                        if (f45 < f14) {
                            f45 = f14;
                        }
                        z1.r rVarD3 = z1.a.d(rVar3.a(oVar, jVar), 2.0f);
                        boolean zC2 = sVar.c(f45) | sVar.c(fL);
                        Object objQ18 = sVar.Q();
                        if (zC2 || objQ18 == gVar5) {
                            objQ18 = new fz.c() { // from class: dt.o1
                                @Override // fz.c
                                public final Object invoke(Object obj) {
                                    v3.c offset = (v3.c) obj;
                                    kotlin.jvm.internal.m.f(offset, "$this$offset");
                                    return new v3.j((((long) hz.b.Q(f45)) << 32) | (((long) hz.b.Q(fL)) & 4294967295L));
                                }
                            };
                            sVar.o0(objQ18);
                        }
                        z1.r rVarP = j0.e2.p(j0.c.w(rVarD3, (fz.c) objQ18), f36, f37);
                        boolean zF19 = sVar.f(b3VarB3) | sVar.f(b3VarB) | sVar.c(fE2);
                        Object objQ19 = sVar.Q();
                        if (zF19 || objQ19 == gVar5) {
                            objQ19 = new p1(fE2, b3VarB3, b3VarB, 0);
                            sVar.o0(objQ19);
                        }
                        z1.r rVarB = d2.h.b(g2.f0.q(rVarP, (fz.c) objQ19), eVarF);
                        long jC = g2.x.c(((h1.s1) sVar.j(h1.v1.f31180a)).f31034q, 0.72f);
                        g2.r0 r0Var = g2.f0.f28556b;
                        z1.r rVarH = d0.n.h(rVarB, jC, r0Var);
                        Float fValueOf2 = Float.valueOf(f41);
                        l1.b1 b1Var30 = b1Var9;
                        float f46 = f24;
                        float f47 = f5;
                        float f48 = f25;
                        float f49 = f26;
                        float f50 = f13;
                        l1.b1 b1Var31 = b1Var11;
                        boolean zC3 = sVar.c(f41) | sVar.f(b1Var30) | sVar.c(f46) | sVar.c(f47) | sVar.c(f48) | sVar.c(f49) | sVar.c(f50) | sVar.f(b1Var31);
                        l1.b1 b1Var32 = b1Var10;
                        boolean zF20 = zC3 | sVar.f(b1Var32);
                        l1.b1 b1Var33 = b1Var8;
                        boolean zF21 = zF20 | sVar.f(b1Var33);
                        Object objQ20 = sVar.Q();
                        if (zF21 || objQ20 == gVar5) {
                            f27 = f48;
                            f28 = f49;
                            objQ20 = new w1(f41, b1Var31, f46, f47, f27, f28, f50, b1Var30, b1Var32, b1Var33);
                            f29 = f46;
                            b1Var12 = b1Var30;
                            b1Var13 = b1Var33;
                            b1Var14 = b1Var31;
                            sVar.o0(objQ20);
                        } else {
                            f27 = f48;
                            f28 = f49;
                            b1Var12 = b1Var30;
                            b1Var13 = b1Var33;
                            b1Var14 = b1Var31;
                            f29 = f46;
                        }
                        PointerInputEventHandler pointerInputEventHandler2 = (PointerInputEventHandler) objQ20;
                        s2.l lVar2 = s2.g0.f51302a;
                        l1.b1 b1Var34 = b1Var13;
                        float f51 = f27;
                        float f52 = f28;
                        l1.b1 b1Var35 = b1Var12;
                        l1.b1 b1Var36 = b1Var14;
                        z1.r rVarI2 = rVarH.i(new s2.e0(l9, fValueOf2, null, pointerInputEventHandler2, 4));
                        boolean z20 = !((Boolean) b1Var34.getValue()).booleanValue();
                        boolean zF22 = sVar.f(b1Var35) | sVar.c(f29) | sVar.c(f47) | sVar.c(f51) | sVar.c(f52) | sVar.c(f50) | sVar.f(b1Var36) | sVar.f(b1Var32) | sVar.f(b1Var34);
                        Object objQ21 = sVar.Q();
                        if (zF22 || objQ21 == gVar5) {
                            objQ21 = new q1(b1Var36, f29, f47, f51, f52, f50, b1Var35, b1Var32, b1Var34);
                            sVar.o0(objQ21);
                        }
                        z1.r rVarO2 = d0.n.o(rVarI2, z20, null, (fz.a) objQ21, 14);
                        w2.q0 q0VarD4 = j0.o.d(z1.c.f58467e, false);
                        int iHashCode4 = Long.hashCode(sVar.T);
                        l1.q1 q1VarL4 = sVar.l();
                        z1.r rVarC4 = z1.a.c(sVar, rVarO2);
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(r45);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(hVar3, q0VarD4, sVar);
                        l1.t.J(hVar4, q1VarL4, sVar);
                        if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                            defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar6);
                        }
                        l1.t.J(hVar5, rVarC4, sVar);
                        oVar2 = oVar;
                        z1.r rVarH2 = d0.n.h(d2.h.b(j0.e2.p(oVar2, 2, 20), r0.f.d(999)), g2.x.c(g2.x.f28618e, 0.92f), r0Var);
                        z18 = false;
                        j0.o.a(rVarH2, sVar, 0);
                        z17 = true;
                        sVar.p(true);
                        sVar.p(false);
                    } else {
                        sVar.d0(-1896867749);
                        sVar.p(false);
                        z18 = false;
                        oVar2 = oVar;
                        z17 = true;
                    }
                }
                sVar.p(z18);
                sVar.p(z17);
                rVar2 = oVar2;
            }
            b1Var = b1Var24;
            b1Var2 = b1Var23;
            objQ15 = new s1(b1Var20, b1Var22, fE0, fE4, f40, fMax, fE1, fE5, b1Var2, b1Var, g1Var2, null);
            b1Var3 = b1Var20;
            f5 = fE0;
            f11 = f40;
            f12 = fMax;
            f13 = fE1;
            sVar2.o0(objQ15);
            l1.t.i(objArr, (fz.e) objQ15, sVar2);
            Boolean boolValueOf4 = Boolean.valueOf(z11);
            Boolean boolValueOf5 = Boolean.valueOf(((Boolean) b1Var21.getValue()).booleanValue());
            i13 = i17 & 112;
            if (i13 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            b1Var4 = b1Var21;
            boolean zF110 = z13 | sVar2.f(b1Var4) | sVar2.f(b1Var27);
            if ((i17 & 458752) == 131072) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z14 | zF110;
            objQ = sVar2.Q();
            if (z15) {
                f14 = CropImageView.DEFAULT_ASPECT_RATIO;
                i14 = 12;
                bt.n nVar3 = new bt.n(z11, onVideoPlayingStateChanged, b1Var4, b1Var27, (vy.d) null);
                b1Var4 = b1Var4;
                sVar2.o0(nVar3);
                objQ = nVar3;
            } else {
                f14 = CropImageView.DEFAULT_ASPECT_RATIO;
                i14 = 12;
                bt.n nVar4 = new bt.n(z11, onVideoPlayingStateChanged, b1Var4, b1Var27, (vy.d) null);
                b1Var4 = b1Var4;
                sVar2.o0(nVar4);
                objQ = nVar4;
            }
            l1.t.h(boolValueOf4, boolValueOf5, l9, (fz.e) objQ, sVar2);
            Boolean boolValueOf6 = Boolean.valueOf(z11);
            Boolean bool2 = (Boolean) b1Var22.getValue();
            bool2.getClass();
            if (i13 == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            zF = z16 | sVar2.f(b1Var22) | sVar2.f(r42);
            objQ2 = sVar2.Q();
            dVar = null;
            if (zF) {
                b1Var5 = b1Var4;
                t1 t1Var2 = new t1(z11, b1Var22, r42, dVar, 0);
                b1Var6 = b1Var22;
                b1Var7 = r42;
                sVar2.o0(t1Var2);
                objQ2 = t1Var2;
            } else {
                b1Var5 = b1Var4;
                t1 t1Var3 = new t1(z11, b1Var22, r42, dVar, 0);
                b1Var6 = b1Var22;
                b1Var7 = r42;
                sVar2.o0(t1Var3);
                objQ2 = t1Var3;
            }
            l1.t.h(boolValueOf6, bool2, l9, (fz.e) objQ2, sVar2);
            oVar = z1.o.f58481a;
            z1.r rVarD4 = j0.e2.d(oVar, 1.0f);
            zF2 = sVar2.f(b1Var3);
            objQ3 = sVar2.Q();
            if (zF2) {
                objQ3 = new bp.h0(i14, b1Var3);
                sVar2.o0(objQ3);
            } else {
                objQ3 = new bp.h0(i14, b1Var3);
                sVar2.o0(objQ3);
            }
            z1.r rVarO3 = w2.a0.o(rVarD4, (fz.c) objQ3);
            z1.j jVar2 = z1.c.f58463a;
            w2.q0 q0VarD5 = j0.o.d(jVar2, false);
            iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL5 = sVar2.l();
            z1.r rVarC5 = z1.a.c(sVar2, rVarO3);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            y2.h hVar7 = y2.j.f56917f;
            l1.t.J(hVar7, q0VarD5, sVar2);
            y2.h hVar8 = y2.j.f56916e;
            l1.t.J(hVar8, q1VarL5, sVar2);
            hVar = y2.j.f56918g;
            if (sVar2.S) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            } else {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            y2.h hVar9 = y2.j.f56915d;
            l1.t.J(hVar9, rVarC5, sVar2);
            f15 = (((int) (((v3.l) b1Var3.getValue()).f53498a >> 32)) - f5) - fE4;
            if (f15 < fE4) {
                f15 = fE4;
            }
            float f410 = 0.2f * f5;
            f16 = f15 + f410;
            b0.v vVar2 = b0.b0.f3438a;
            b0.i2 i2VarR2 = b0.e.r(260, 0, vVar2, 2);
            zBooleanValue = ((Boolean) b1Var7.getValue()).booleanValue();
            if (((Boolean) b1Var5.getValue()).booleanValue()) {
                f17 = f14;
            } else {
                f17 = 1.0f;
            }
            gVar2 = gVar;
            l1.b3 b3VarB4 = b0.h.b(f17, b0.e.r(260, 0, vVar2, 2), "CourseVideoOverlayCollapseProgress", sVar2, 3072, 20);
            if (((Boolean) b1Var5.getValue()).booleanValue()) {
                f18 = 1.0f;
            } else {
                f18 = f14;
            }
            final l1.b3 b3VarB5 = b0.h.b(f18, b0.e.r(140, 0, null, 6), "CourseVideoOverlayPlayerAlpha", sVar2, 3120, 20);
            if (((Boolean) b1Var5.getValue()).booleanValue()) {
                f19 = f14;
            } else {
                f19 = 1.0f;
            }
            if (((Boolean) b1Var5.getValue()).booleanValue()) {
                i15 = 90;
            } else {
                i15 = 110;
            }
            l1.b3 b3VarB6 = b0.h.b(f19, b0.e.r(i15, 0, null, 4), "CourseVideoOverlayHandleAlpha", sVar2, 3072, 20);
            if (((Boolean) b1Var5.getValue()).booleanValue()) {
                f21 = f34;
            } else {
                f21 = f36;
            }
            l1.b3 b3VarA4 = b0.h.a(f21, b0.e.r(260, 0, vVar2, 2), "CourseVideoOverlayPlayerWidth", sVar2, 384, 8);
            if (((Boolean) b1Var5.getValue()).booleanValue()) {
                f22 = f35;
            } else {
                f22 = f37;
            }
            l1.b3 b3VarA5 = b0.h.a(f22, b0.e.r(260, 0, vVar2, 2), "CourseVideoOverlayPlayerHeight", sVar2, 384, 8);
            if (((Boolean) b1Var5.getValue()).booleanValue()) {
                jQ = (((long) hz.b.Q(Float.intBitsToFloat((int) (((f2.b) b1Var2.getValue()).f26570a & 4294967295L)))) & 4294967295L) | (((long) hz.b.Q(Float.intBitsToFloat((int) (w(b1Var2) >> 32)))) << 32);
            } else {
                iQ = hz.b.Q(((int) (((v3.l) b1Var3.getValue()).f53498a >> 32)) - fE2);
                if (iQ < 0) {
                    iQ = 0;
                }
                jQ = (((long) hz.b.Q(g1Var2.l())) & 4294967295L) | (((long) iQ) << 32);
            }
            if (zBooleanValue) {
                g1Var = new b0.g1(0);
            } else {
                g1Var = new b0.g1(0);
            }
            final l1.b3 b3VarC2 = b0.h.c(new v3.j(jQ), b0.e.f3501p, g1Var, null, "CourseVideoOverlayOffset", sVar2, 24576, 8);
            if (((Boolean) b1Var5.getValue()).booleanValue()) {
                f23 = f34;
            } else {
                f23 = f36;
            }
            l1.b3 b3VarA6 = b0.h.a(f23, b0.e.r(260, 0, vVar2, 2), "CourseVideoOverlayWidth", sVar2, 384, 8);
            r0.e eVarE2 = r0.f.e(f38, (1.0f - ((Number) b3VarB4.getValue()).floatValue()) * f38, (1.0f - ((Number) b3VarB4.getValue()).floatValue()) * f38, f38);
            if (((Boolean) b1Var5.getValue()).booleanValue()) {
                sVar2.d0(-1885601140);
                Float fValueOf3 = Float.valueOf(f16);
                b1Var15 = b1Var2;
                float f411 = f11;
                boolean zF111 = sVar2.f(b1Var25) | sVar2.f(b1Var15) | sVar2.c(f16) | sVar2.f(b1Var3) | sVar2.c(fE4) | sVar2.c(f5) | sVar2.c(f411);
                f30 = f411;
                float f412 = f12;
                f31 = f412;
                boolean zC4 = zF111 | sVar2.c(f412) | sVar2.c(f13);
                b1Var16 = b1Var;
                zF3 = zC4 | sVar2.f(b1Var16) | sVar2.f(g1Var2) | sVar2.f(r41) | sVar2.f(b1Var5);
                objQ4 = sVar2.Q();
                gVar3 = gVar2;
                if (zF3) {
                    l1.b1 b1Var210 = b1Var3;
                    float f413 = f13;
                    l1.b1 b1Var211 = b1Var5;
                    objQ4 = new y1(f16, fE4, f5, f30, f31, f413, b1Var25, b1Var15, b1Var210, b1Var16, b1Var211, g1Var2, i1Var);
                    f32 = f413;
                    b1Var17 = b1Var210;
                    b1Var18 = b1Var211;
                    g1Var2 = g1Var2;
                    f31 = f31;
                    b1Var19 = b1Var15;
                    f30 = f30;
                    f33 = fE4;
                    sVar2.o0(objQ4);
                } else {
                    l1.b1 b1Var212 = b1Var3;
                    float f414 = f13;
                    l1.b1 b1Var213 = b1Var5;
                    objQ4 = new y1(f16, fE4, f5, f30, f31, f414, b1Var25, b1Var15, b1Var212, b1Var16, b1Var213, g1Var2, i1Var);
                    f32 = f414;
                    b1Var17 = b1Var212;
                    b1Var18 = b1Var213;
                    g1Var2 = g1Var2;
                    f31 = f31;
                    b1Var19 = b1Var15;
                    f30 = f30;
                    f33 = fE4;
                    sVar2.o0(objQ4);
                }
                PointerInputEventHandler pointerInputEventHandler3 = (PointerInputEventHandler) objQ4;
                s2.l lVar3 = s2.g0.f51302a;
                f5 = f5;
                f24 = f33;
                f25 = f30;
                f26 = f31;
                b1Var9 = b1Var17;
                b1Var10 = b1Var19;
                b1Var11 = b1Var16;
                b1Var8 = b1Var18;
                f13 = f32;
                e0Var = new s2.e0(l9, fValueOf3, null, pointerInputEventHandler3, 4);
                sVar2.p(false);
            } else {
                b1Var8 = b1Var5;
                b1Var9 = b1Var3;
                f24 = fE4;
                b1Var10 = b1Var2;
                b1Var11 = b1Var;
                f25 = f11;
                f26 = f12;
                gVar3 = gVar2;
                sVar2.d0(-1884226693);
                sVar2.p(false);
                e0Var = oVar;
            }
            if (z11) {
                sVar = sVar2;
                oVar2 = oVar;
                z17 = true;
                z18 = false;
                sVar.d0(-1896867749);
            } else {
                sVar = sVar2;
                oVar2 = oVar;
                z17 = true;
                z18 = false;
                sVar.d0(-1896867749);
            }
            sVar.p(z18);
            sVar.p(z17);
            rVar2 = oVar2;
        }
        l1.x1 x1VarT2 = sVar.t();
        if (x1VarT2 != null) {
            x1VarT2.f39502d = new fz.e() { // from class: dt.r1
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    e.t(qVar, z11, videoUri, l9, j11, onVideoPlayingStateChanged, rVar2, z12, (l1.n) obj, l1.t.M(i11 | 1));
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final float u(float f5, float f11, float f12, float f13, l1.b1 b1Var, float f14) {
        if (v3.l.a(((v3.l) b1Var.getValue()).f53498a, 0L)) {
            return f14;
        }
        float f15 = f5 + f11;
        float f16 = ((((int) (((v3.l) b1Var.getValue()).f53498a & 4294967295L)) - f12) - f13) - f11;
        if (f16 < f15) {
            f16 = f15;
        }
        return hz.b.k(f14, f15, f16);
    }

    public static final long v(float f5, float f11, float f12, float f13, float f14, l1.b1 b1Var, long j11) {
        if (v3.l.a(z(b1Var), 0L)) {
            return j11;
        }
        float f15 = (((int) (((v3.l) b1Var.getValue()).f53498a >> 32)) - f11) - f5;
        if (f15 < f5) {
            f15 = f5;
        }
        float f16 = f12 + f5;
        float f17 = ((((int) (((v3.l) b1Var.getValue()).f53498a & 4294967295L)) - f13) - f14) - f5;
        if (f17 < f16) {
            f17 = f16;
        }
        float fK = hz.b.k(Float.intBitsToFloat((int) (j11 >> 32)), f5, f15);
        return (((long) Float.floatToRawIntBits(hz.b.k(Float.intBitsToFloat((int) (j11 & 4294967295L)), f16, f17))) & 4294967295L) | (Float.floatToRawIntBits(fK) << 32);
    }

    public static final long w(l1.b1 b1Var) {
        return ((f2.b) b1Var.getValue()).f26570a;
    }

    public static final void x(long j11, l1.b1 b1Var) {
        b1Var.setValue(new f2.b(j11));
    }

    public static final void y(long j11, l1.b1 b1Var) {
        b1Var.setValue(new f2.b(j11));
    }

    public static final long z(l1.b1 b1Var) {
        return ((v3.l) b1Var.getValue()).f53498a;
    }
}
