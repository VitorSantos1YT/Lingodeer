package dt;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.data.model.CourseWord;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import h1.ua;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f23837a = ry.x.Y(new qy.l((char) 772, 1), new qy.l((char) 769, 2), new qy.l((char) 780, 3), new qy.l((char) 768, 4));

    public static final void a(List options, t1.d dVar, l1.n nVar, int i11) {
        int i12;
        z1.i iVar = z1.c.L;
        z1.h hVar = z1.c.P;
        kotlin.jvm.internal.m.f(options, "options");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(105256969);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(options) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(dVar) ? 32 : 16;
        }
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            v3.c cVar = (v3.c) sVar.j(z2.g1.f58547h);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.B(new v3.f(0));
                sVar.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            boolean zBooleanValue = ((Boolean) sVar.j(ju.f.f37376j)).booleanValue();
            float f5 = 16;
            j0.g gVarG = j0.i.g(f5);
            boolean zF = sVar.f(cVar);
            Object objQ2 = sVar.Q();
            if (zF || objQ2 == gVar) {
                objQ2 = new d1.d1(cVar, b1Var, 2);
                sVar.o0(objQ2);
            }
            z1.o oVar = z1.o.f58481a;
            z1.r rVarM = w2.a0.m(oVar, (fz.c) objQ2);
            j0.u uVarA = j0.t.a(gVarG, hVar, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarM);
            y2.k.J.getClass();
            y2.i iVar2 = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar2);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar2 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar2);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            int size = zBooleanValue ? options.size() : 2;
            sVar.d0(-1279899);
            ArrayList arrayListG1 = ry.m.g1(options, size, size);
            int size2 = arrayListG1.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj = arrayListG1.get(i13);
                i13++;
                List list = (List) obj;
                j0.b bVar = j0.i.f35303a;
                j0.a2 a2VarA = j0.z1.a(j0.i.h(f5), iVar, sVar, 6);
                int iHashCode2 = Long.hashCode(sVar.T);
                l1.q1 q1VarL2 = sVar.l();
                ArrayList arrayList = arrayListG1;
                z1.r rVarC2 = z1.a.c(sVar, oVar);
                y2.k.J.getClass();
                int i14 = i12;
                y2.i iVar3 = y2.j.f56913b;
                sVar.h0();
                int i15 = size2;
                if (sVar.S) {
                    sVar.k(iVar3);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, a2VarA, sVar);
                l1.t.J(y2.j.f56916e, q1VarL2, sVar);
                y2.h hVar3 = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
                }
                l1.t.J(y2.j.f56915d, rVarC2, sVar);
                sVar.d0(1442115018);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    int size3 = list.size();
                    Object obj2 = j0.c2.f35266a;
                    if (size3 == 1) {
                        sVar.d0(1755956212);
                        z1.r rVarN = j0.e2.n(oVar, (((v3.f) b1Var.getValue()).f53489a - f5) / 2);
                        j0.a2 a2VarA2 = j0.z1.a(j0.i.f35303a, iVar, sVar, 0);
                        int iHashCode3 = Long.hashCode(sVar.T);
                        l1.q1 q1VarL3 = sVar.l();
                        z1.r rVarC3 = z1.a.c(sVar, rVarN);
                        y2.k.J.getClass();
                        z1.i iVar4 = iVar;
                        y2.i iVar5 = y2.j.f56913b;
                        sVar.h0();
                        Iterator it2 = it;
                        if (sVar.S) {
                            sVar.k(iVar5);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, a2VarA2, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL3, sVar);
                        y2.h hVar4 = y2.j.f56918g;
                        if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                            defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar4);
                        }
                        l1.t.J(y2.j.f56915d, rVarC3, sVar);
                        dVar.f(obj2, list.get(0), sVar, Integer.valueOf(6 | ((i14 << 3) & 896)));
                        sVar.p(true);
                        sVar.p(false);
                        iVar = iVar4;
                        it = it2;
                    } else {
                        sVar.d0(1756137097);
                        dVar.f(obj2, next, sVar, Integer.valueOf(6 | ((i14 << 3) & 896)));
                        sVar.p(false);
                        iVar = iVar;
                    }
                }
                sVar.p(false);
                sVar.p(true);
                arrayListG1 = arrayList;
                i12 = i14;
                size2 = i15;
            }
            sVar.p(false);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b0.t1(options, i11, 3, dVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0135  */
    /* JADX WARN: Code duplicated, block: B:105:0x0148  */
    /* JADX WARN: Code duplicated, block: B:106:0x014b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0154  */
    /* JADX WARN: Code duplicated, block: B:111:0x0158  */
    /* JADX WARN: Code duplicated, block: B:113:0x015b  */
    /* JADX WARN: Code duplicated, block: B:114:0x015d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0160  */
    /* JADX WARN: Code duplicated, block: B:117:0x0162  */
    /* JADX WARN: Code duplicated, block: B:119:0x0165  */
    /* JADX WARN: Code duplicated, block: B:121:0x0168  */
    /* JADX WARN: Code duplicated, block: B:122:0x016b  */
    /* JADX WARN: Code duplicated, block: B:124:0x016f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0172  */
    /* JADX WARN: Code duplicated, block: B:127:0x0175  */
    /* JADX WARN: Code duplicated, block: B:129:0x0179  */
    /* JADX WARN: Code duplicated, block: B:130:0x017c  */
    /* JADX WARN: Code duplicated, block: B:133:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:134:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ff A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:142:0x0201  */
    /* JADX WARN: Code duplicated, block: B:145:0x0222  */
    /* JADX WARN: Code duplicated, block: B:146:0x0225  */
    /* JADX WARN: Code duplicated, block: B:149:0x022d  */
    /* JADX WARN: Code duplicated, block: B:150:0x0230  */
    /* JADX WARN: Code duplicated, block: B:153:0x024c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:156:0x0253  */
    /* JADX WARN: Code duplicated, block: B:158:0x026b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:159:0x026d  */
    /* JADX WARN: Code duplicated, block: B:170:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:176:0x033b  */
    /* JADX WARN: Code duplicated, block: B:177:0x033d  */
    /* JADX WARN: Code duplicated, block: B:180:0x0378  */
    /* JADX WARN: Code duplicated, block: B:181:0x037c  */
    /* JADX WARN: Code duplicated, block: B:184:0x038f  */
    /* JADX WARN: Code duplicated, block: B:186:0x039d  */
    /* JADX WARN: Code duplicated, block: B:189:0x03b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:193:0x03be  */
    /* JADX WARN: Code duplicated, block: B:214:0x057b  */
    /* JADX WARN: Code duplicated, block: B:216:0x0599  */
    /* JADX WARN: Code duplicated, block: B:219:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:222:0x05b8 A[LOOP:0: B:221:0x05b6->B:222:0x05b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:225:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:226:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:228:0x0642  */
    /* JADX WARN: Code duplicated, block: B:230:0x0655  */
    /* JADX WARN: Code duplicated, block: B:241:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:243:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:246:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:249:0x06f0 A[LOOP:1: B:248:0x06ee->B:249:0x06f0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:252:0x072c  */
    /* JADX WARN: Code duplicated, block: B:253:0x0734  */
    /* JADX WARN: Code duplicated, block: B:258:0x076c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:262:0x0775  */
    /* JADX WARN: Code duplicated, block: B:270:0x08ae  */
    /* JADX WARN: Code duplicated, block: B:273:0x08c2  */
    /* JADX WARN: Code duplicated, block: B:277:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:88:0x0107  */
    /* JADX WARN: Code duplicated, block: B:89:0x010a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0114  */
    /* JADX WARN: Code duplicated, block: B:94:0x011d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0121  */
    /* JADX WARN: Code duplicated, block: B:98:0x012b  */
    /* JADX WARN: Code duplicated, block: B:99:0x012e  */
    public static final void b(final CourseWord word, final j3.y0 textStyle, z1.r rVar, boolean z11, v3.f fVar, boolean z12, boolean z13, boolean z14, int i11, z1.d dVar, l1.n nVar, final int i12, final int i13) {
        z1.r rVar2;
        int i14;
        boolean z15;
        int i15;
        int i16;
        v3.f fVar2;
        int i17;
        int i18;
        boolean z16;
        int i19;
        int i21;
        int i22;
        int i23;
        final boolean z17;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        boolean z18;
        l1.s sVar;
        final z1.d dVar2;
        final boolean z19;
        final z1.r rVar3;
        final boolean z20;
        final v3.f fVar3;
        final boolean z21;
        final int i31;
        l1.x1 x1VarT;
        z1.o oVar;
        boolean z22;
        v3.f fVar4;
        boolean z23;
        int i32;
        z1.d dVar3;
        int i33;
        l1.c3 c3Var;
        int iIntValue;
        boolean z24;
        j3.y0 y0VarB;
        boolean z25;
        boolean z26;
        Object objQ;
        j3.y0 y0Var;
        boolean zF;
        Object objQ2;
        String str;
        boolean z27;
        String str2;
        String str3;
        float fD;
        float f5;
        float f11;
        boolean zF2;
        Object objQ3;
        int i34;
        int i35;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        String str4;
        v3.f fVar5;
        j3.y0 y0Var2;
        boolean z28;
        int i36;
        j3.y0 y0Var3;
        StringBuilder sb2;
        ArrayList arrayList;
        ArrayList arrayList2;
        int size;
        int i37;
        j3.y0 y0Var4;
        z1.r rVarS;
        boolean z29;
        boolean z30;
        StringBuilder sb3;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int size2;
        int i38;
        z1.r rVarS2;
        kotlin.jvm.internal.m.f(word, "word");
        kotlin.jvm.internal.m.f(textStyle, "textStyle");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-463750786);
        int i39 = (i12 & 6) == 0 ? (sVar2.h(word) ? 4 : 2) | i12 : i12;
        if ((i12 & 48) == 0) {
            i39 |= sVar2.f(textStyle) ? 32 : 16;
        }
        int i40 = i13 & 4;
        if (i40 == 0) {
            if ((i12 & 384) == 0) {
                rVar2 = rVar;
                i39 |= sVar2.f(rVar2) ? 256 : 128;
            }
            i14 = i13 & 8;
            if (i14 != 0) {
                if ((i12 & 3072) == 0) {
                    z15 = z11;
                    if (sVar2.g(z15)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i39 |= i15;
                }
                i16 = i13 & 16;
                if (i16 != 0) {
                    if ((i12 & 24576) == 0) {
                        fVar2 = fVar;
                        if (sVar2.f(fVar2)) {
                            i17 = 16384;
                        } else {
                            i17 = OSSConstants.DEFAULT_BUFFER_SIZE;
                        }
                        i39 |= i17;
                    }
                    i18 = i13 & 32;
                    if (i18 != 0) {
                        i39 |= 196608;
                        z16 = z12;
                    } else {
                        z16 = z12;
                        if ((i12 & 196608) == 0) {
                            if (sVar2.g(z16)) {
                                i19 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                            } else {
                                i19 = 65536;
                            }
                            i39 |= i19;
                        }
                    }
                    i21 = i13 & 64;
                    if (i21 != 0) {
                        i39 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (sVar2.g(z13)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i39 |= i22;
                    }
                    i23 = i13 & 128;
                    if (i23 != 0) {
                        i39 |= 12582912;
                        z17 = z14;
                    } else {
                        z17 = z14;
                        if ((i12 & 12582912) == 0) {
                            if (sVar2.g(z17)) {
                                i24 = 8388608;
                            } else {
                                i24 = 4194304;
                            }
                            i39 |= i24;
                        }
                    }
                    i25 = i39;
                    i26 = i13 & 256;
                    if (i26 != 0) {
                        if ((i12 & 100663296) == 0) {
                            if (sVar2.d(i11)) {
                                i27 = 67108864;
                            } else {
                                i27 = 33554432;
                            }
                            i25 |= i27;
                        }
                        i28 = i13 & 512;
                        if (i28 != 0) {
                            i28 = i28;
                            i29 = i25 | 805306368;
                        } else {
                            if ((i12 & 805306368) != 0) {
                                if (sVar2.f(dVar)) {
                                    i30 = 536870912;
                                } else {
                                    i30 = 268435456;
                                }
                                i25 |= i30;
                            }
                            i29 = i25;
                        }
                        if ((i29 & 306783379) != 306783378) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (sVar2.T(i29 & 1, z18)) {
                            oVar = z1.o.f58481a;
                            if (i40 != 0) {
                                rVar2 = oVar;
                            }
                            if (i14 != 0) {
                                z22 = false;
                            } else {
                                z22 = z15;
                            }
                            if (i16 != 0) {
                                fVar4 = null;
                            } else {
                                fVar4 = fVar2;
                            }
                            if (i18 != 0) {
                                z16 = false;
                            }
                            if (i21 != 0) {
                                z23 = true;
                            } else {
                                z23 = z13;
                            }
                            if (i23 != 0) {
                                z17 = false;
                            }
                            if (i26 != 0) {
                                i32 = 2;
                            } else {
                                i32 = i11;
                            }
                            if (i28 != 0) {
                                dVar3 = z1.c.P;
                            } else {
                                dVar3 = dVar;
                            }
                            i33 = ((ct.b) sVar2.j(ct.c.f22476a)).f22473h;
                            c3Var = ju.f.f37370d;
                            iIntValue = ((Number) sVar2.j(c3Var)).intValue();
                            boolean z31 = z22;
                            v3.c cVar = (v3.c) sVar2.j(z2.g1.f58547h);
                            z24 = z16;
                            y0VarB = ct.c.b(sVar2);
                            boolean zF3 = sVar2.f(y0VarB);
                            boolean z32 = z17;
                            if ((i29 & 112) == 32) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            z26 = zF3 | z25;
                            objQ = sVar2.Q();
                            l1.g gVar = l1.m.f39353a;
                            if (z26 || objQ == gVar) {
                                objQ = j3.y0.a(y0VarB, 0L, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777215).d(textStyle);
                                sVar2.o0(objQ);
                            }
                            y0Var = (j3.y0) objQ;
                            zF = sVar2.f(word) | sVar2.d(i33);
                            objQ2 = sVar2.Q();
                            if (zF || objQ2 == gVar) {
                                objQ2 = c(word, iIntValue, i33);
                                sVar2.o0(objQ2);
                            }
                            qy.r rVar4 = (qy.r) objQ2;
                            str = (String) rVar4.f48505a;
                            z27 = z23;
                            str2 = (String) rVar4.f48506b;
                            str3 = (String) rVar4.f48507c;
                            fD = ct.c.d(sVar2);
                            if (kotlin.jvm.internal.m.a(str, str2)) {
                                f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                            } else {
                                f5 = fD;
                            }
                            if (kotlin.jvm.internal.m.a(str3, str2)) {
                                f11 = CropImageView.DEFAULT_ASPECT_RATIO;
                            } else {
                                f11 = fD;
                            }
                            j3.w0 w0VarI = j3.t.i(sVar2);
                            zF2 = sVar2.f(y0Var) | sVar2.d(i33) | sVar2.d(iIntValue);
                            objQ3 = sVar2.Q();
                            if (!zF2 || objQ3 == gVar) {
                                if ((ry.l.D(new Integer[]{11, 0}, Integer.valueOf(iIntValue)) || i33 != 0) && !((ry.l.D(new Integer[]{13, 2}, Integer.valueOf(iIntValue)) && i33 == 0) || (ry.l.D(new Integer[]{12, 1}, Integer.valueOf(iIntValue)) && i33 == 2))) {
                                    i34 = 0;
                                } else {
                                    String str5 = word.getWord();
                                    kotlin.jvm.internal.m.f(str5, "str");
                                    Pattern patternCompile = Pattern.compile("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]");
                                    kotlin.jvm.internal.m.e(patternCompile, "compile(...)");
                                    if (patternCompile.matcher(str5).matches() || ry.l.D(new String[]{"..."}, str5)) {
                                        i34 = 0;
                                    } else {
                                        int i41 = (int) (j3.w0.a(w0VarI, "a a", y0Var, 0L, 1020).f35799c >> 32);
                                        j3.u0 u0VarA = j3.w0.a(w0VarI, "aa", y0Var, 0L, 1020);
                                        y0Var = y0Var;
                                        i34 = i41 - ((int) (u0VarA.f35799c >> 32));
                                    }
                                }
                                objQ3 = Integer.valueOf(i34);
                                sVar2.o0(objQ3);
                            } else {
                                fD = fD;
                            }
                            int iIntValue2 = ((Number) objQ3).intValue();
                            if (ry.l.D(new Integer[]{51, 55}, Integer.valueOf(((Number) sVar2.j(c3Var)).intValue()))) {
                                i35 = 2;
                            } else {
                                i35 = -4;
                            }
                            z1.r rVarC = j0.c.C(rVar2, cVar.Q(iIntValue2 / 2), CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            j0.b bVar = j0.i.f35303a;
                            j0.u uVarA = j0.t.a(j0.i.i(i35), dVar3, sVar2, (((i29 >> 21) & 896) >> 3) & 112);
                            iHashCode = Long.hashCode(sVar2.T);
                            l1.q1 q1VarL = sVar2.l();
                            z1.r rVarC2 = z1.a.c(sVar2, rVarC);
                            y2.k.J.getClass();
                            iVar = y2.j.f56913b;
                            sVar2.h0();
                            if (sVar2.S) {
                                sVar2.k(iVar);
                            } else {
                                sVar2.r0();
                            }
                            l1.t.J(y2.j.f56917f, uVarA, sVar2);
                            l1.t.J(y2.j.f56916e, q1VarL, sVar2);
                            hVar = y2.j.f56918g;
                            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                            }
                            l1.t.J(y2.j.f56915d, rVarC2, sVar2);
                            if (str.length() > 0 || ((z31 && str.equals(str2)) || z32)) {
                                sVar = sVar2;
                                str4 = str;
                                fVar5 = fVar4;
                                y0Var2 = y0Var;
                                z28 = false;
                                sVar.d0(1542510382);
                            } else {
                                sVar2.d0(1547528073);
                                if (z27) {
                                    sVar2.d0(1547515549);
                                    j3.p0 p0Var = y0Var.f35827a;
                                    j3.p0 p0Var2 = y0Var.f35827a;
                                    long j11 = p0Var.f35755b;
                                    fr.j3.i(j11);
                                    y0Var2 = y0Var;
                                    j3.y0 y0VarA = j3.y0.a(y0Var2, 0L, fr.j3.L(j11 & 1095216660480L, (float) (((double) v3.o.c(j11)) * 0.6d)), n3.s.f43178t, null, null, 0L, null, null, 0, 4, 0L, null, 16711673);
                                    z1.r rVarA = d2.h.a(oVar, f5);
                                    long j12 = p0Var2.f35755b;
                                    fr.j3.i(j12);
                                    fVar5 = fVar4;
                                    long jL = fr.j3.L(j12 & 1095216660480L, (float) (((double) v3.o.c(j12)) * 0.6d));
                                    long j13 = p0Var2.f35755b;
                                    fr.j3.i(j13);
                                    long jL2 = fr.j3.L(j13 & 1095216660480L, (float) (((double) v3.o.c(j13)) * 0.6d));
                                    fr.j3.i(jL2);
                                    str4 = str;
                                    iu.k.c(str4, rVarA, y0VarA, 0, false, 1, 0, new s0.g(fr.j3.L(jL2 & 1095216660480L, (float) (((double) v3.o.c(jL2)) * 0.6d)), jL, fr.j3.A(1)), sVar2, 1572864, 184);
                                    sVar = sVar2;
                                    z28 = false;
                                    sVar.p(false);
                                } else {
                                    sVar = sVar2;
                                    str4 = str;
                                    fVar5 = fVar4;
                                    float f12 = f5;
                                    sVar.d0(1548256170);
                                    if (word.getWordType() != 4 || word.getSyllablePhonemeResult() == null) {
                                        sVar.d0(1549047600);
                                        long j14 = y0Var.f35827a.f35755b;
                                        fr.j3.i(j14);
                                        y0Var2 = y0Var;
                                        ua.b(str4, d2.h.a(oVar, f12), 0L, 0L, null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, j3.y0.a(y0Var2, 0L, fr.j3.L(j14 & 1095216660480L, (float) (((double) v3.o.c(j14)) * 0.6d)), n3.s.f43178t, null, null, 0L, null, null, 0, 4, 0L, null, 16711673), sVar, 0, 0, 65020);
                                        z28 = false;
                                        sVar.p(false);
                                    } else {
                                        sVar.d0(1548316620);
                                        long j15 = y0Var.f35827a.f35755b;
                                        fr.j3.i(j15);
                                        pt.j.a(word, str4, true, j3.y0.a(y0Var, 0L, fr.j3.L(j15 & 1095216660480L, (float) (((double) v3.o.c(j15)) * 0.6d)), n3.s.f43178t, null, null, 0L, null, null, 0, 4, 0L, null, 16711673), d2.h.a(fVar5 != null ? j0.e2.s(oVar, fVar5.f53489a) : oVar, fD), sVar, (i29 & 14) | 384);
                                        z28 = false;
                                        sVar.p(false);
                                        y0Var2 = y0Var;
                                    }
                                    sVar.p(z28);
                                }
                            }
                            sVar.p(z28);
                            if (z27) {
                                sVar.d0(1549618713);
                                sb3 = new StringBuilder(16);
                                new ArrayList();
                                arrayList3 = new ArrayList();
                                new ArrayList();
                                if (z24) {
                                    sb3.append(" ");
                                }
                                sb3.append(str2);
                                if (z24) {
                                    sb3.append(" ");
                                }
                                String string = sb3.toString();
                                arrayList4 = new ArrayList(arrayList3.size());
                                size2 = arrayList3.size();
                                for (i38 = 0; i38 < size2; i38++) {
                                    arrayList4.add(((j3.d) arrayList3.get(i38)).a(sb3.length()));
                                }
                                j3.h hVar2 = new j3.h(string, arrayList4);
                                j3.y0 y0VarA2 = j3.y0.a(y0Var2, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                                y0Var4 = y0Var2;
                                if (fVar5 != null) {
                                    rVarS2 = j0.e2.s(oVar, fVar5.f53489a);
                                } else {
                                    rVarS2 = oVar;
                                }
                                long j16 = y0Var4.f35827a.f35755b;
                                fr.j3.i(j16);
                                l1.s sVar3 = sVar;
                                int i42 = i32;
                                iu.k.b(hVar2, rVarS2, y0VarA2, 0, false, i42, 0, new s0.g(fr.j3.L(j16 & 1095216660480L, (float) (((double) v3.o.c(j16)) * 0.6d)), j16, fr.j3.A(1)), sVar3, (i29 >> 6) & 3670016);
                                i36 = i42;
                                sVar = sVar3;
                                sVar.p(false);
                            } else {
                                i36 = i32;
                                y0Var3 = y0Var2;
                                sVar.d0(1550610620);
                                if (word.getWordType() == 4 || word.getSyllablePhonemeResult() == null) {
                                    sVar.d0(1551215740);
                                    sb2 = new StringBuilder(16);
                                    new ArrayList();
                                    arrayList = new ArrayList();
                                    new ArrayList();
                                    if (z24) {
                                        sb2.append(" ");
                                    }
                                    sb2.append(str2);
                                    if (z24) {
                                        sb2.append(" ");
                                    }
                                    String string2 = sb2.toString();
                                    arrayList2 = new ArrayList(arrayList.size());
                                    size = arrayList.size();
                                    for (i37 = 0; i37 < size; i37++) {
                                        arrayList2.add(((j3.d) arrayList.get(i37)).a(sb2.length()));
                                    }
                                    j3.h hVar3 = new j3.h(string2, arrayList2);
                                    j3.y0 y0VarA3 = j3.y0.a(y0Var3, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                                    y0Var4 = y0Var3;
                                    if (fVar5 != null) {
                                        rVarS = j0.e2.s(oVar, fVar5.f53489a);
                                    } else {
                                        rVarS = oVar;
                                    }
                                    ua.c(hVar3, rVarS, 0L, 0L, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, null, y0VarA3, sVar, 0, 0, 130556);
                                    z29 = false;
                                    sVar.p(false);
                                } else {
                                    sVar.d0(1550686694);
                                    pt.j.a(word, str2, str4.length() == 0, j3.y0.a(y0Var3, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447), fVar5 != null ? j0.e2.s(oVar, fVar5.f53489a) : oVar, sVar, i29 & 14);
                                    z29 = false;
                                    sVar.p(false);
                                    y0Var4 = y0Var3;
                                }
                                sVar.p(z29);
                            }
                            if (str3.length() > 0 || (z31 && str3.equals(str2))) {
                                z30 = false;
                                sVar.d0(1542510382);
                            } else {
                                sVar.d0(1552066411);
                                if (z27) {
                                    sVar.d0(1552083988);
                                    j3.p0 p0Var3 = y0Var4.f35827a;
                                    j3.p0 p0Var4 = y0Var4.f35827a;
                                    long j17 = p0Var3.f35755b;
                                    fr.j3.i(j17);
                                    j3.y0 y0VarA4 = j3.y0.a(y0Var4, 0L, fr.j3.L(j17 & 1095216660480L, (float) (((double) v3.o.c(j17)) * 0.6d)), n3.s.f43178t, null, null, 0L, null, null, 0, 0, 0L, null, 16777209);
                                    z1.r rVarA2 = d2.h.a(oVar, f11);
                                    long j18 = p0Var4.f35755b;
                                    fr.j3.i(j18);
                                    long jL3 = fr.j3.L(j18 & 1095216660480L, (float) (((double) v3.o.c(j18)) * 0.6d));
                                    long j19 = p0Var4.f35755b;
                                    fr.j3.i(j19);
                                    long jL4 = fr.j3.L(j19 & 1095216660480L, (float) (((double) v3.o.c(j19)) * 0.6d));
                                    fr.j3.i(jL4);
                                    iu.k.c(str3, rVarA2, y0VarA4, 0, false, 1, 0, new s0.g(fr.j3.L(jL4 & 1095216660480L, (float) (((double) v3.o.c(jL4)) * 0.6d)), jL3, fr.j3.A(1)), sVar, 1572864, 184);
                                    z30 = false;
                                    sVar.p(false);
                                } else {
                                    sVar.d0(1552710932);
                                    long j21 = y0Var4.f35827a.f35755b;
                                    fr.j3.i(j21);
                                    ua.b(str3, d2.h.a(oVar, f11), 0L, 0L, null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, j3.y0.a(y0Var4, 0L, fr.j3.L(j21 & 1095216660480L, (float) (((double) v3.o.c(j21)) * 0.6d)), n3.s.f43178t, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar, 0, 0, 65020);
                                    z30 = false;
                                    sVar.p(false);
                                }
                            }
                            sVar.p(z30);
                            sVar.p(true);
                            fVar3 = fVar5;
                            rVar3 = rVar2;
                            z20 = z31;
                            z19 = z24;
                            z17 = z32;
                            z21 = z27;
                            dVar2 = dVar3;
                            i31 = i36;
                        } else {
                            sVar = sVar2;
                            sVar.W();
                            dVar2 = dVar;
                            z19 = z16;
                            rVar3 = rVar2;
                            z20 = z15;
                            fVar3 = fVar2;
                            z21 = z13;
                            i31 = i11;
                        }
                        x1VarT = sVar.t();
                        if (x1VarT != null) {
                            x1VarT.f39502d = new fz.e() { // from class: dt.e4
                                @Override // fz.e
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    g4.b(word, textStyle, rVar3, z20, fVar3, z19, z21, z17, i31, dVar2, (l1.n) obj, l1.t.M(i12 | 1), i13);
                                    return qy.b0.f48488a;
                                }
                            };
                        }
                    }
                    i25 |= 100663296;
                    i28 = i13 & 512;
                    if (i28 != 0) {
                        i28 = i28;
                        i29 = i25 | 805306368;
                    } else {
                        if ((i12 & 805306368) != 0) {
                            if (sVar2.f(dVar)) {
                                i30 = 536870912;
                            } else {
                                i30 = 268435456;
                            }
                            i25 |= i30;
                        }
                        i29 = i25;
                    }
                    if ((i29 & 306783379) != 306783378) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (sVar2.T(i29 & 1, z18)) {
                        oVar = z1.o.f58481a;
                        if (i40 != 0) {
                            rVar2 = oVar;
                        }
                        if (i14 != 0) {
                            z22 = false;
                        } else {
                            z22 = z15;
                        }
                        if (i16 != 0) {
                            fVar4 = null;
                        } else {
                            fVar4 = fVar2;
                        }
                        if (i18 != 0) {
                            z16 = false;
                        }
                        if (i21 != 0) {
                            z23 = true;
                        } else {
                            z23 = z13;
                        }
                        if (i23 != 0) {
                            z17 = false;
                        }
                        if (i26 != 0) {
                            i32 = 2;
                        } else {
                            i32 = i11;
                        }
                        if (i28 != 0) {
                            dVar3 = z1.c.P;
                        } else {
                            dVar3 = dVar;
                        }
                        i33 = ((ct.b) sVar2.j(ct.c.f22476a)).f22473h;
                        c3Var = ju.f.f37370d;
                        iIntValue = ((Number) sVar2.j(c3Var)).intValue();
                        boolean z33 = z22;
                        v3.c cVar2 = (v3.c) sVar2.j(z2.g1.f58547h);
                        z24 = z16;
                        y0VarB = ct.c.b(sVar2);
                        boolean zF4 = sVar2.f(y0VarB);
                        boolean z34 = z17;
                        if ((i29 & 112) == 32) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        z26 = zF4 | z25;
                        objQ = sVar2.Q();
                        l1.g gVar2 = l1.m.f39353a;
                        if (z26) {
                            objQ = j3.y0.a(y0VarB, 0L, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777215).d(textStyle);
                            sVar2.o0(objQ);
                        } else {
                            objQ = j3.y0.a(y0VarB, 0L, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777215).d(textStyle);
                            sVar2.o0(objQ);
                        }
                        y0Var = (j3.y0) objQ;
                        zF = sVar2.f(word) | sVar2.d(i33);
                        objQ2 = sVar2.Q();
                        if (zF) {
                            objQ2 = c(word, iIntValue, i33);
                            sVar2.o0(objQ2);
                        } else {
                            objQ2 = c(word, iIntValue, i33);
                            sVar2.o0(objQ2);
                        }
                        qy.r rVar5 = (qy.r) objQ2;
                        str = (String) rVar5.f48505a;
                        z27 = z23;
                        str2 = (String) rVar5.f48506b;
                        str3 = (String) rVar5.f48507c;
                        fD = ct.c.d(sVar2);
                        if (kotlin.jvm.internal.m.a(str, str2)) {
                            f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                        } else {
                            f5 = fD;
                        }
                        if (kotlin.jvm.internal.m.a(str3, str2)) {
                            f11 = CropImageView.DEFAULT_ASPECT_RATIO;
                        } else {
                            f11 = fD;
                        }
                        j3.w0 w0VarI2 = j3.t.i(sVar2);
                        zF2 = sVar2.f(y0Var) | sVar2.d(i33) | sVar2.d(iIntValue);
                        objQ3 = sVar2.Q();
                        if (zF2) {
                            if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(iIntValue))) {
                            }
                            i34 = 0;
                            objQ3 = Integer.valueOf(i34);
                            sVar2.o0(objQ3);
                        } else {
                            if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(iIntValue))) {
                            }
                            i34 = 0;
                            objQ3 = Integer.valueOf(i34);
                            sVar2.o0(objQ3);
                        }
                        int iIntValue3 = ((Number) objQ3).intValue();
                        if (ry.l.D(new Integer[]{51, 55}, Integer.valueOf(((Number) sVar2.j(c3Var)).intValue()))) {
                            i35 = 2;
                        } else {
                            i35 = -4;
                        }
                        z1.r rVarC3 = j0.c.C(rVar2, cVar2.Q(iIntValue3 / 2), CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        j0.b bVar2 = j0.i.f35303a;
                        j0.u uVarA2 = j0.t.a(j0.i.i(i35), dVar3, sVar2, (((i29 >> 21) & 896) >> 3) & 112);
                        iHashCode = Long.hashCode(sVar2.T);
                        l1.q1 q1VarL2 = sVar2.l();
                        z1.r rVarC4 = z1.a.c(sVar2, rVarC3);
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar);
                        } else {
                            sVar2.r0();
                        }
                        l1.t.J(y2.j.f56917f, uVarA2, sVar2);
                        l1.t.J(y2.j.f56916e, q1VarL2, sVar2);
                        hVar = y2.j.f56918g;
                        if (sVar2.S) {
                            defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                        }
                        l1.t.J(y2.j.f56915d, rVarC4, sVar2);
                        if (str.length() > 0) {
                            sVar = sVar2;
                            str4 = str;
                            fVar5 = fVar4;
                            y0Var2 = y0Var;
                            z28 = false;
                            sVar.d0(1542510382);
                        } else {
                            sVar = sVar2;
                            str4 = str;
                            fVar5 = fVar4;
                            y0Var2 = y0Var;
                            z28 = false;
                            sVar.d0(1542510382);
                        }
                        sVar.p(z28);
                        if (z27) {
                            sVar.d0(1549618713);
                            sb3 = new StringBuilder(16);
                            new ArrayList();
                            arrayList3 = new ArrayList();
                            new ArrayList();
                            if (z24) {
                                sb3.append(" ");
                            }
                            sb3.append(str2);
                            if (z24) {
                                sb3.append(" ");
                            }
                            String string3 = sb3.toString();
                            arrayList4 = new ArrayList(arrayList3.size());
                            size2 = arrayList3.size();
                            while (i38 < size2) {
                                arrayList4.add(((j3.d) arrayList3.get(i38)).a(sb3.length()));
                            }
                            j3.h hVar4 = new j3.h(string3, arrayList4);
                            j3.y0 y0VarA5 = j3.y0.a(y0Var2, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                            y0Var4 = y0Var2;
                            if (fVar5 != null) {
                                rVarS2 = j0.e2.s(oVar, fVar5.f53489a);
                            } else {
                                rVarS2 = oVar;
                            }
                            long j110 = y0Var4.f35827a.f35755b;
                            fr.j3.i(j110);
                            l1.s sVar4 = sVar;
                            int i43 = i32;
                            iu.k.b(hVar4, rVarS2, y0VarA5, 0, false, i43, 0, new s0.g(fr.j3.L(j110 & 1095216660480L, (float) (((double) v3.o.c(j110)) * 0.6d)), j110, fr.j3.A(1)), sVar4, (i29 >> 6) & 3670016);
                            i36 = i43;
                            sVar = sVar4;
                            sVar.p(false);
                        } else {
                            i36 = i32;
                            y0Var3 = y0Var2;
                            sVar.d0(1550610620);
                            if (word.getWordType() == 4) {
                                sVar.d0(1551215740);
                                sb2 = new StringBuilder(16);
                                new ArrayList();
                                arrayList = new ArrayList();
                                new ArrayList();
                                if (z24) {
                                    sb2.append(" ");
                                }
                                sb2.append(str2);
                                if (z24) {
                                    sb2.append(" ");
                                }
                                String string4 = sb2.toString();
                                arrayList2 = new ArrayList(arrayList.size());
                                size = arrayList.size();
                                while (i37 < size) {
                                    arrayList2.add(((j3.d) arrayList.get(i37)).a(sb2.length()));
                                }
                                j3.h hVar5 = new j3.h(string4, arrayList2);
                                j3.y0 y0VarA6 = j3.y0.a(y0Var3, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                                y0Var4 = y0Var3;
                                if (fVar5 != null) {
                                    rVarS = j0.e2.s(oVar, fVar5.f53489a);
                                } else {
                                    rVarS = oVar;
                                }
                                ua.c(hVar5, rVarS, 0L, 0L, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, null, y0VarA6, sVar, 0, 0, 130556);
                                z29 = false;
                                sVar.p(false);
                            } else {
                                sVar.d0(1551215740);
                                sb2 = new StringBuilder(16);
                                new ArrayList();
                                arrayList = new ArrayList();
                                new ArrayList();
                                if (z24) {
                                    sb2.append(" ");
                                }
                                sb2.append(str2);
                                if (z24) {
                                    sb2.append(" ");
                                }
                                String string5 = sb2.toString();
                                arrayList2 = new ArrayList(arrayList.size());
                                size = arrayList.size();
                                while (i37 < size) {
                                    arrayList2.add(((j3.d) arrayList.get(i37)).a(sb2.length()));
                                }
                                j3.h hVar6 = new j3.h(string5, arrayList2);
                                j3.y0 y0VarA7 = j3.y0.a(y0Var3, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                                y0Var4 = y0Var3;
                                if (fVar5 != null) {
                                    rVarS = j0.e2.s(oVar, fVar5.f53489a);
                                } else {
                                    rVarS = oVar;
                                }
                                ua.c(hVar6, rVarS, 0L, 0L, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, null, y0VarA7, sVar, 0, 0, 130556);
                                z29 = false;
                                sVar.p(false);
                            }
                            sVar.p(z29);
                        }
                        if (str3.length() > 0) {
                            z30 = false;
                            sVar.d0(1542510382);
                        } else {
                            z30 = false;
                            sVar.d0(1542510382);
                        }
                        sVar.p(z30);
                        sVar.p(true);
                        fVar3 = fVar5;
                        rVar3 = rVar2;
                        z20 = z33;
                        z19 = z24;
                        z17 = z34;
                        z21 = z27;
                        dVar2 = dVar3;
                        i31 = i36;
                    } else {
                        sVar = sVar2;
                        sVar.W();
                        dVar2 = dVar;
                        z19 = z16;
                        rVar3 = rVar2;
                        z20 = z15;
                        fVar3 = fVar2;
                        z21 = z13;
                        i31 = i11;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new fz.e() { // from class: dt.e4
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                g4.b(word, textStyle, rVar3, z20, fVar3, z19, z21, z17, i31, dVar2, (l1.n) obj, l1.t.M(i12 | 1), i13);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i39 |= 24576;
                fVar2 = fVar;
                i18 = i13 & 32;
                if (i18 != 0) {
                    i39 |= 196608;
                    z16 = z12;
                } else {
                    z16 = z12;
                    if ((i12 & 196608) == 0) {
                        if (sVar2.g(z16)) {
                            i19 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                        } else {
                            i19 = 65536;
                        }
                        i39 |= i19;
                    }
                }
                i21 = i13 & 64;
                if (i21 != 0) {
                    i39 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (sVar2.g(z13)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i39 |= i22;
                }
                i23 = i13 & 128;
                if (i23 != 0) {
                    i39 |= 12582912;
                    z17 = z14;
                } else {
                    z17 = z14;
                    if ((i12 & 12582912) == 0) {
                        if (sVar2.g(z17)) {
                            i24 = 8388608;
                        } else {
                            i24 = 4194304;
                        }
                        i39 |= i24;
                    }
                }
                i25 = i39;
                i26 = i13 & 256;
                if (i26 != 0) {
                    if ((i12 & 100663296) == 0) {
                        if (sVar2.d(i11)) {
                            i27 = 67108864;
                        } else {
                            i27 = 33554432;
                        }
                        i25 |= i27;
                    }
                    i28 = i13 & 512;
                    if (i28 != 0) {
                        i28 = i28;
                        i29 = i25 | 805306368;
                    } else {
                        if ((i12 & 805306368) != 0) {
                            if (sVar2.f(dVar)) {
                                i30 = 536870912;
                            } else {
                                i30 = 268435456;
                            }
                            i25 |= i30;
                        }
                        i29 = i25;
                    }
                    if ((i29 & 306783379) != 306783378) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (sVar2.T(i29 & 1, z18)) {
                        oVar = z1.o.f58481a;
                        if (i40 != 0) {
                            rVar2 = oVar;
                        }
                        if (i14 != 0) {
                            z22 = false;
                        } else {
                            z22 = z15;
                        }
                        if (i16 != 0) {
                            fVar4 = null;
                        } else {
                            fVar4 = fVar2;
                        }
                        if (i18 != 0) {
                            z16 = false;
                        }
                        if (i21 != 0) {
                            z23 = true;
                        } else {
                            z23 = z13;
                        }
                        if (i23 != 0) {
                            z17 = false;
                        }
                        if (i26 != 0) {
                            i32 = 2;
                        } else {
                            i32 = i11;
                        }
                        if (i28 != 0) {
                            dVar3 = z1.c.P;
                        } else {
                            dVar3 = dVar;
                        }
                        i33 = ((ct.b) sVar2.j(ct.c.f22476a)).f22473h;
                        c3Var = ju.f.f37370d;
                        iIntValue = ((Number) sVar2.j(c3Var)).intValue();
                        boolean z35 = z22;
                        v3.c cVar3 = (v3.c) sVar2.j(z2.g1.f58547h);
                        z24 = z16;
                        y0VarB = ct.c.b(sVar2);
                        boolean zF5 = sVar2.f(y0VarB);
                        boolean z36 = z17;
                        if ((i29 & 112) == 32) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        z26 = zF5 | z25;
                        objQ = sVar2.Q();
                        l1.g gVar3 = l1.m.f39353a;
                        if (z26) {
                            objQ = j3.y0.a(y0VarB, 0L, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777215).d(textStyle);
                            sVar2.o0(objQ);
                        } else {
                            objQ = j3.y0.a(y0VarB, 0L, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777215).d(textStyle);
                            sVar2.o0(objQ);
                        }
                        y0Var = (j3.y0) objQ;
                        zF = sVar2.f(word) | sVar2.d(i33);
                        objQ2 = sVar2.Q();
                        if (zF) {
                            objQ2 = c(word, iIntValue, i33);
                            sVar2.o0(objQ2);
                        } else {
                            objQ2 = c(word, iIntValue, i33);
                            sVar2.o0(objQ2);
                        }
                        qy.r rVar6 = (qy.r) objQ2;
                        str = (String) rVar6.f48505a;
                        z27 = z23;
                        str2 = (String) rVar6.f48506b;
                        str3 = (String) rVar6.f48507c;
                        fD = ct.c.d(sVar2);
                        if (kotlin.jvm.internal.m.a(str, str2)) {
                            f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                        } else {
                            f5 = fD;
                        }
                        if (kotlin.jvm.internal.m.a(str3, str2)) {
                            f11 = CropImageView.DEFAULT_ASPECT_RATIO;
                        } else {
                            f11 = fD;
                        }
                        j3.w0 w0VarI3 = j3.t.i(sVar2);
                        zF2 = sVar2.f(y0Var) | sVar2.d(i33) | sVar2.d(iIntValue);
                        objQ3 = sVar2.Q();
                        if (zF2) {
                            if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(iIntValue))) {
                            }
                            i34 = 0;
                            objQ3 = Integer.valueOf(i34);
                            sVar2.o0(objQ3);
                        } else {
                            if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(iIntValue))) {
                            }
                            i34 = 0;
                            objQ3 = Integer.valueOf(i34);
                            sVar2.o0(objQ3);
                        }
                        int iIntValue4 = ((Number) objQ3).intValue();
                        if (ry.l.D(new Integer[]{51, 55}, Integer.valueOf(((Number) sVar2.j(c3Var)).intValue()))) {
                            i35 = 2;
                        } else {
                            i35 = -4;
                        }
                        z1.r rVarC5 = j0.c.C(rVar2, cVar3.Q(iIntValue4 / 2), CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        j0.b bVar3 = j0.i.f35303a;
                        j0.u uVarA3 = j0.t.a(j0.i.i(i35), dVar3, sVar2, (((i29 >> 21) & 896) >> 3) & 112);
                        iHashCode = Long.hashCode(sVar2.T);
                        l1.q1 q1VarL3 = sVar2.l();
                        z1.r rVarC6 = z1.a.c(sVar2, rVarC5);
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar);
                        } else {
                            sVar2.r0();
                        }
                        l1.t.J(y2.j.f56917f, uVarA3, sVar2);
                        l1.t.J(y2.j.f56916e, q1VarL3, sVar2);
                        hVar = y2.j.f56918g;
                        if (sVar2.S) {
                            defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                        }
                        l1.t.J(y2.j.f56915d, rVarC6, sVar2);
                        if (str.length() > 0) {
                            sVar = sVar2;
                            str4 = str;
                            fVar5 = fVar4;
                            y0Var2 = y0Var;
                            z28 = false;
                            sVar.d0(1542510382);
                        } else {
                            sVar = sVar2;
                            str4 = str;
                            fVar5 = fVar4;
                            y0Var2 = y0Var;
                            z28 = false;
                            sVar.d0(1542510382);
                        }
                        sVar.p(z28);
                        if (z27) {
                            sVar.d0(1549618713);
                            sb3 = new StringBuilder(16);
                            new ArrayList();
                            arrayList3 = new ArrayList();
                            new ArrayList();
                            if (z24) {
                                sb3.append(" ");
                            }
                            sb3.append(str2);
                            if (z24) {
                                sb3.append(" ");
                            }
                            String string6 = sb3.toString();
                            arrayList4 = new ArrayList(arrayList3.size());
                            size2 = arrayList3.size();
                            while (i38 < size2) {
                                arrayList4.add(((j3.d) arrayList3.get(i38)).a(sb3.length()));
                            }
                            j3.h hVar7 = new j3.h(string6, arrayList4);
                            j3.y0 y0VarA8 = j3.y0.a(y0Var2, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                            y0Var4 = y0Var2;
                            if (fVar5 != null) {
                                rVarS2 = j0.e2.s(oVar, fVar5.f53489a);
                            } else {
                                rVarS2 = oVar;
                            }
                            long j111 = y0Var4.f35827a.f35755b;
                            fr.j3.i(j111);
                            l1.s sVar5 = sVar;
                            int i44 = i32;
                            iu.k.b(hVar7, rVarS2, y0VarA8, 0, false, i44, 0, new s0.g(fr.j3.L(j111 & 1095216660480L, (float) (((double) v3.o.c(j111)) * 0.6d)), j111, fr.j3.A(1)), sVar5, (i29 >> 6) & 3670016);
                            i36 = i44;
                            sVar = sVar5;
                            sVar.p(false);
                        } else {
                            i36 = i32;
                            y0Var3 = y0Var2;
                            sVar.d0(1550610620);
                            if (word.getWordType() == 4) {
                                sVar.d0(1551215740);
                                sb2 = new StringBuilder(16);
                                new ArrayList();
                                arrayList = new ArrayList();
                                new ArrayList();
                                if (z24) {
                                    sb2.append(" ");
                                }
                                sb2.append(str2);
                                if (z24) {
                                    sb2.append(" ");
                                }
                                String string7 = sb2.toString();
                                arrayList2 = new ArrayList(arrayList.size());
                                size = arrayList.size();
                                while (i37 < size) {
                                    arrayList2.add(((j3.d) arrayList.get(i37)).a(sb2.length()));
                                }
                                j3.h hVar8 = new j3.h(string7, arrayList2);
                                j3.y0 y0VarA9 = j3.y0.a(y0Var3, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                                y0Var4 = y0Var3;
                                if (fVar5 != null) {
                                    rVarS = j0.e2.s(oVar, fVar5.f53489a);
                                } else {
                                    rVarS = oVar;
                                }
                                ua.c(hVar8, rVarS, 0L, 0L, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, null, y0VarA9, sVar, 0, 0, 130556);
                                z29 = false;
                                sVar.p(false);
                            } else {
                                sVar.d0(1551215740);
                                sb2 = new StringBuilder(16);
                                new ArrayList();
                                arrayList = new ArrayList();
                                new ArrayList();
                                if (z24) {
                                    sb2.append(" ");
                                }
                                sb2.append(str2);
                                if (z24) {
                                    sb2.append(" ");
                                }
                                String string8 = sb2.toString();
                                arrayList2 = new ArrayList(arrayList.size());
                                size = arrayList.size();
                                while (i37 < size) {
                                    arrayList2.add(((j3.d) arrayList.get(i37)).a(sb2.length()));
                                }
                                j3.h hVar9 = new j3.h(string8, arrayList2);
                                j3.y0 y0VarA10 = j3.y0.a(y0Var3, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                                y0Var4 = y0Var3;
                                if (fVar5 != null) {
                                    rVarS = j0.e2.s(oVar, fVar5.f53489a);
                                } else {
                                    rVarS = oVar;
                                }
                                ua.c(hVar9, rVarS, 0L, 0L, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, null, y0VarA10, sVar, 0, 0, 130556);
                                z29 = false;
                                sVar.p(false);
                            }
                            sVar.p(z29);
                        }
                        if (str3.length() > 0) {
                            z30 = false;
                            sVar.d0(1542510382);
                        } else {
                            z30 = false;
                            sVar.d0(1542510382);
                        }
                        sVar.p(z30);
                        sVar.p(true);
                        fVar3 = fVar5;
                        rVar3 = rVar2;
                        z20 = z35;
                        z19 = z24;
                        z17 = z36;
                        z21 = z27;
                        dVar2 = dVar3;
                        i31 = i36;
                    } else {
                        sVar = sVar2;
                        sVar.W();
                        dVar2 = dVar;
                        z19 = z16;
                        rVar3 = rVar2;
                        z20 = z15;
                        fVar3 = fVar2;
                        z21 = z13;
                        i31 = i11;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new fz.e() { // from class: dt.e4
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                g4.b(word, textStyle, rVar3, z20, fVar3, z19, z21, z17, i31, dVar2, (l1.n) obj, l1.t.M(i12 | 1), i13);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i25 |= 100663296;
                i28 = i13 & 512;
                if (i28 != 0) {
                    i28 = i28;
                    i29 = i25 | 805306368;
                } else {
                    if ((i12 & 805306368) != 0) {
                        if (sVar2.f(dVar)) {
                            i30 = 536870912;
                        } else {
                            i30 = 268435456;
                        }
                        i25 |= i30;
                    }
                    i29 = i25;
                }
                if ((i29 & 306783379) != 306783378) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (sVar2.T(i29 & 1, z18)) {
                    oVar = z1.o.f58481a;
                    if (i40 != 0) {
                        rVar2 = oVar;
                    }
                    if (i14 != 0) {
                        z22 = false;
                    } else {
                        z22 = z15;
                    }
                    if (i16 != 0) {
                        fVar4 = null;
                    } else {
                        fVar4 = fVar2;
                    }
                    if (i18 != 0) {
                        z16 = false;
                    }
                    if (i21 != 0) {
                        z23 = true;
                    } else {
                        z23 = z13;
                    }
                    if (i23 != 0) {
                        z17 = false;
                    }
                    if (i26 != 0) {
                        i32 = 2;
                    } else {
                        i32 = i11;
                    }
                    if (i28 != 0) {
                        dVar3 = z1.c.P;
                    } else {
                        dVar3 = dVar;
                    }
                    i33 = ((ct.b) sVar2.j(ct.c.f22476a)).f22473h;
                    c3Var = ju.f.f37370d;
                    iIntValue = ((Number) sVar2.j(c3Var)).intValue();
                    boolean z37 = z22;
                    v3.c cVar4 = (v3.c) sVar2.j(z2.g1.f58547h);
                    z24 = z16;
                    y0VarB = ct.c.b(sVar2);
                    boolean zF6 = sVar2.f(y0VarB);
                    boolean z38 = z17;
                    if ((i29 & 112) == 32) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = zF6 | z25;
                    objQ = sVar2.Q();
                    l1.g gVar4 = l1.m.f39353a;
                    if (z26) {
                        objQ = j3.y0.a(y0VarB, 0L, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777215).d(textStyle);
                        sVar2.o0(objQ);
                    } else {
                        objQ = j3.y0.a(y0VarB, 0L, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777215).d(textStyle);
                        sVar2.o0(objQ);
                    }
                    y0Var = (j3.y0) objQ;
                    zF = sVar2.f(word) | sVar2.d(i33);
                    objQ2 = sVar2.Q();
                    if (zF) {
                        objQ2 = c(word, iIntValue, i33);
                        sVar2.o0(objQ2);
                    } else {
                        objQ2 = c(word, iIntValue, i33);
                        sVar2.o0(objQ2);
                    }
                    qy.r rVar7 = (qy.r) objQ2;
                    str = (String) rVar7.f48505a;
                    z27 = z23;
                    str2 = (String) rVar7.f48506b;
                    str3 = (String) rVar7.f48507c;
                    fD = ct.c.d(sVar2);
                    if (kotlin.jvm.internal.m.a(str, str2)) {
                        f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                    } else {
                        f5 = fD;
                    }
                    if (kotlin.jvm.internal.m.a(str3, str2)) {
                        f11 = CropImageView.DEFAULT_ASPECT_RATIO;
                    } else {
                        f11 = fD;
                    }
                    j3.w0 w0VarI4 = j3.t.i(sVar2);
                    zF2 = sVar2.f(y0Var) | sVar2.d(i33) | sVar2.d(iIntValue);
                    objQ3 = sVar2.Q();
                    if (zF2) {
                        if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(iIntValue))) {
                        }
                        i34 = 0;
                        objQ3 = Integer.valueOf(i34);
                        sVar2.o0(objQ3);
                    } else {
                        if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(iIntValue))) {
                        }
                        i34 = 0;
                        objQ3 = Integer.valueOf(i34);
                        sVar2.o0(objQ3);
                    }
                    int iIntValue5 = ((Number) objQ3).intValue();
                    if (ry.l.D(new Integer[]{51, 55}, Integer.valueOf(((Number) sVar2.j(c3Var)).intValue()))) {
                        i35 = 2;
                    } else {
                        i35 = -4;
                    }
                    z1.r rVarC7 = j0.c.C(rVar2, cVar4.Q(iIntValue5 / 2), CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    j0.b bVar4 = j0.i.f35303a;
                    j0.u uVarA4 = j0.t.a(j0.i.i(i35), dVar3, sVar2, (((i29 >> 21) & 896) >> 3) & 112);
                    iHashCode = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL4 = sVar2.l();
                    z1.r rVarC8 = z1.a.c(sVar2, rVarC7);
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA4, sVar2);
                    l1.t.J(y2.j.f56916e, q1VarL4, sVar2);
                    hVar = y2.j.f56918g;
                    if (sVar2.S) {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC8, sVar2);
                    if (str.length() > 0) {
                        sVar = sVar2;
                        str4 = str;
                        fVar5 = fVar4;
                        y0Var2 = y0Var;
                        z28 = false;
                        sVar.d0(1542510382);
                    } else {
                        sVar = sVar2;
                        str4 = str;
                        fVar5 = fVar4;
                        y0Var2 = y0Var;
                        z28 = false;
                        sVar.d0(1542510382);
                    }
                    sVar.p(z28);
                    if (z27) {
                        sVar.d0(1549618713);
                        sb3 = new StringBuilder(16);
                        new ArrayList();
                        arrayList3 = new ArrayList();
                        new ArrayList();
                        if (z24) {
                            sb3.append(" ");
                        }
                        sb3.append(str2);
                        if (z24) {
                            sb3.append(" ");
                        }
                        String string9 = sb3.toString();
                        arrayList4 = new ArrayList(arrayList3.size());
                        size2 = arrayList3.size();
                        while (i38 < size2) {
                            arrayList4.add(((j3.d) arrayList3.get(i38)).a(sb3.length()));
                        }
                        j3.h hVar10 = new j3.h(string9, arrayList4);
                        j3.y0 y0VarA11 = j3.y0.a(y0Var2, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                        y0Var4 = y0Var2;
                        if (fVar5 != null) {
                            rVarS2 = j0.e2.s(oVar, fVar5.f53489a);
                        } else {
                            rVarS2 = oVar;
                        }
                        long j112 = y0Var4.f35827a.f35755b;
                        fr.j3.i(j112);
                        l1.s sVar6 = sVar;
                        int i45 = i32;
                        iu.k.b(hVar10, rVarS2, y0VarA11, 0, false, i45, 0, new s0.g(fr.j3.L(j112 & 1095216660480L, (float) (((double) v3.o.c(j112)) * 0.6d)), j112, fr.j3.A(1)), sVar6, (i29 >> 6) & 3670016);
                        i36 = i45;
                        sVar = sVar6;
                        sVar.p(false);
                    } else {
                        i36 = i32;
                        y0Var3 = y0Var2;
                        sVar.d0(1550610620);
                        if (word.getWordType() == 4) {
                            sVar.d0(1551215740);
                            sb2 = new StringBuilder(16);
                            new ArrayList();
                            arrayList = new ArrayList();
                            new ArrayList();
                            if (z24) {
                                sb2.append(" ");
                            }
                            sb2.append(str2);
                            if (z24) {
                                sb2.append(" ");
                            }
                            String string10 = sb2.toString();
                            arrayList2 = new ArrayList(arrayList.size());
                            size = arrayList.size();
                            while (i37 < size) {
                                arrayList2.add(((j3.d) arrayList.get(i37)).a(sb2.length()));
                            }
                            j3.h hVar11 = new j3.h(string10, arrayList2);
                            j3.y0 y0VarA12 = j3.y0.a(y0Var3, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                            y0Var4 = y0Var3;
                            if (fVar5 != null) {
                                rVarS = j0.e2.s(oVar, fVar5.f53489a);
                            } else {
                                rVarS = oVar;
                            }
                            ua.c(hVar11, rVarS, 0L, 0L, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, null, y0VarA12, sVar, 0, 0, 130556);
                            z29 = false;
                            sVar.p(false);
                        } else {
                            sVar.d0(1551215740);
                            sb2 = new StringBuilder(16);
                            new ArrayList();
                            arrayList = new ArrayList();
                            new ArrayList();
                            if (z24) {
                                sb2.append(" ");
                            }
                            sb2.append(str2);
                            if (z24) {
                                sb2.append(" ");
                            }
                            String string11 = sb2.toString();
                            arrayList2 = new ArrayList(arrayList.size());
                            size = arrayList.size();
                            while (i37 < size) {
                                arrayList2.add(((j3.d) arrayList.get(i37)).a(sb2.length()));
                            }
                            j3.h hVar12 = new j3.h(string11, arrayList2);
                            j3.y0 y0VarA13 = j3.y0.a(y0Var3, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                            y0Var4 = y0Var3;
                            if (fVar5 != null) {
                                rVarS = j0.e2.s(oVar, fVar5.f53489a);
                            } else {
                                rVarS = oVar;
                            }
                            ua.c(hVar12, rVarS, 0L, 0L, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, null, y0VarA13, sVar, 0, 0, 130556);
                            z29 = false;
                            sVar.p(false);
                        }
                        sVar.p(z29);
                    }
                    if (str3.length() > 0) {
                        z30 = false;
                        sVar.d0(1542510382);
                    } else {
                        z30 = false;
                        sVar.d0(1542510382);
                    }
                    sVar.p(z30);
                    sVar.p(true);
                    fVar3 = fVar5;
                    rVar3 = rVar2;
                    z20 = z37;
                    z19 = z24;
                    z17 = z38;
                    z21 = z27;
                    dVar2 = dVar3;
                    i31 = i36;
                } else {
                    sVar = sVar2;
                    sVar.W();
                    dVar2 = dVar;
                    z19 = z16;
                    rVar3 = rVar2;
                    z20 = z15;
                    fVar3 = fVar2;
                    z21 = z13;
                    i31 = i11;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: dt.e4
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            g4.b(word, textStyle, rVar3, z20, fVar3, z19, z21, z17, i31, dVar2, (l1.n) obj, l1.t.M(i12 | 1), i13);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i39 |= 3072;
            z15 = z11;
            i16 = i13 & 16;
            if (i16 != 0) {
                if ((i12 & 24576) == 0) {
                    fVar2 = fVar;
                    if (sVar2.f(fVar2)) {
                        i17 = 16384;
                    } else {
                        i17 = OSSConstants.DEFAULT_BUFFER_SIZE;
                    }
                    i39 |= i17;
                }
                i18 = i13 & 32;
                if (i18 != 0) {
                    i39 |= 196608;
                    z16 = z12;
                } else {
                    z16 = z12;
                    if ((i12 & 196608) == 0) {
                        if (sVar2.g(z16)) {
                            i19 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                        } else {
                            i19 = 65536;
                        }
                        i39 |= i19;
                    }
                }
                i21 = i13 & 64;
                if (i21 != 0) {
                    i39 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (sVar2.g(z13)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i39 |= i22;
                }
                i23 = i13 & 128;
                if (i23 != 0) {
                    i39 |= 12582912;
                    z17 = z14;
                } else {
                    z17 = z14;
                    if ((i12 & 12582912) == 0) {
                        if (sVar2.g(z17)) {
                            i24 = 8388608;
                        } else {
                            i24 = 4194304;
                        }
                        i39 |= i24;
                    }
                }
                i25 = i39;
                i26 = i13 & 256;
                if (i26 != 0) {
                    if ((i12 & 100663296) == 0) {
                        if (sVar2.d(i11)) {
                            i27 = 67108864;
                        } else {
                            i27 = 33554432;
                        }
                        i25 |= i27;
                    }
                    i28 = i13 & 512;
                    if (i28 != 0) {
                        i28 = i28;
                        i29 = i25 | 805306368;
                    } else {
                        if ((i12 & 805306368) != 0) {
                            if (sVar2.f(dVar)) {
                                i30 = 536870912;
                            } else {
                                i30 = 268435456;
                            }
                            i25 |= i30;
                        }
                        i29 = i25;
                    }
                    if ((i29 & 306783379) != 306783378) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (sVar2.T(i29 & 1, z18)) {
                        oVar = z1.o.f58481a;
                        if (i40 != 0) {
                            rVar2 = oVar;
                        }
                        if (i14 != 0) {
                            z22 = false;
                        } else {
                            z22 = z15;
                        }
                        if (i16 != 0) {
                            fVar4 = null;
                        } else {
                            fVar4 = fVar2;
                        }
                        if (i18 != 0) {
                            z16 = false;
                        }
                        if (i21 != 0) {
                            z23 = true;
                        } else {
                            z23 = z13;
                        }
                        if (i23 != 0) {
                            z17 = false;
                        }
                        if (i26 != 0) {
                            i32 = 2;
                        } else {
                            i32 = i11;
                        }
                        if (i28 != 0) {
                            dVar3 = z1.c.P;
                        } else {
                            dVar3 = dVar;
                        }
                        i33 = ((ct.b) sVar2.j(ct.c.f22476a)).f22473h;
                        c3Var = ju.f.f37370d;
                        iIntValue = ((Number) sVar2.j(c3Var)).intValue();
                        boolean z39 = z22;
                        v3.c cVar5 = (v3.c) sVar2.j(z2.g1.f58547h);
                        z24 = z16;
                        y0VarB = ct.c.b(sVar2);
                        boolean zF7 = sVar2.f(y0VarB);
                        boolean z310 = z17;
                        if ((i29 & 112) == 32) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        z26 = zF7 | z25;
                        objQ = sVar2.Q();
                        l1.g gVar5 = l1.m.f39353a;
                        if (z26) {
                            objQ = j3.y0.a(y0VarB, 0L, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777215).d(textStyle);
                            sVar2.o0(objQ);
                        } else {
                            objQ = j3.y0.a(y0VarB, 0L, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777215).d(textStyle);
                            sVar2.o0(objQ);
                        }
                        y0Var = (j3.y0) objQ;
                        zF = sVar2.f(word) | sVar2.d(i33);
                        objQ2 = sVar2.Q();
                        if (zF) {
                            objQ2 = c(word, iIntValue, i33);
                            sVar2.o0(objQ2);
                        } else {
                            objQ2 = c(word, iIntValue, i33);
                            sVar2.o0(objQ2);
                        }
                        qy.r rVar8 = (qy.r) objQ2;
                        str = (String) rVar8.f48505a;
                        z27 = z23;
                        str2 = (String) rVar8.f48506b;
                        str3 = (String) rVar8.f48507c;
                        fD = ct.c.d(sVar2);
                        if (kotlin.jvm.internal.m.a(str, str2)) {
                            f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                        } else {
                            f5 = fD;
                        }
                        if (kotlin.jvm.internal.m.a(str3, str2)) {
                            f11 = CropImageView.DEFAULT_ASPECT_RATIO;
                        } else {
                            f11 = fD;
                        }
                        j3.w0 w0VarI5 = j3.t.i(sVar2);
                        zF2 = sVar2.f(y0Var) | sVar2.d(i33) | sVar2.d(iIntValue);
                        objQ3 = sVar2.Q();
                        if (zF2) {
                            if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(iIntValue))) {
                            }
                            i34 = 0;
                            objQ3 = Integer.valueOf(i34);
                            sVar2.o0(objQ3);
                        } else {
                            if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(iIntValue))) {
                            }
                            i34 = 0;
                            objQ3 = Integer.valueOf(i34);
                            sVar2.o0(objQ3);
                        }
                        int iIntValue6 = ((Number) objQ3).intValue();
                        if (ry.l.D(new Integer[]{51, 55}, Integer.valueOf(((Number) sVar2.j(c3Var)).intValue()))) {
                            i35 = 2;
                        } else {
                            i35 = -4;
                        }
                        z1.r rVarC9 = j0.c.C(rVar2, cVar5.Q(iIntValue6 / 2), CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        j0.b bVar5 = j0.i.f35303a;
                        j0.u uVarA5 = j0.t.a(j0.i.i(i35), dVar3, sVar2, (((i29 >> 21) & 896) >> 3) & 112);
                        iHashCode = Long.hashCode(sVar2.T);
                        l1.q1 q1VarL5 = sVar2.l();
                        z1.r rVarC10 = z1.a.c(sVar2, rVarC9);
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar);
                        } else {
                            sVar2.r0();
                        }
                        l1.t.J(y2.j.f56917f, uVarA5, sVar2);
                        l1.t.J(y2.j.f56916e, q1VarL5, sVar2);
                        hVar = y2.j.f56918g;
                        if (sVar2.S) {
                            defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                        }
                        l1.t.J(y2.j.f56915d, rVarC10, sVar2);
                        if (str.length() > 0) {
                            sVar = sVar2;
                            str4 = str;
                            fVar5 = fVar4;
                            y0Var2 = y0Var;
                            z28 = false;
                            sVar.d0(1542510382);
                        } else {
                            sVar = sVar2;
                            str4 = str;
                            fVar5 = fVar4;
                            y0Var2 = y0Var;
                            z28 = false;
                            sVar.d0(1542510382);
                        }
                        sVar.p(z28);
                        if (z27) {
                            sVar.d0(1549618713);
                            sb3 = new StringBuilder(16);
                            new ArrayList();
                            arrayList3 = new ArrayList();
                            new ArrayList();
                            if (z24) {
                                sb3.append(" ");
                            }
                            sb3.append(str2);
                            if (z24) {
                                sb3.append(" ");
                            }
                            String string12 = sb3.toString();
                            arrayList4 = new ArrayList(arrayList3.size());
                            size2 = arrayList3.size();
                            while (i38 < size2) {
                                arrayList4.add(((j3.d) arrayList3.get(i38)).a(sb3.length()));
                            }
                            j3.h hVar13 = new j3.h(string12, arrayList4);
                            j3.y0 y0VarA14 = j3.y0.a(y0Var2, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                            y0Var4 = y0Var2;
                            if (fVar5 != null) {
                                rVarS2 = j0.e2.s(oVar, fVar5.f53489a);
                            } else {
                                rVarS2 = oVar;
                            }
                            long j113 = y0Var4.f35827a.f35755b;
                            fr.j3.i(j113);
                            l1.s sVar7 = sVar;
                            int i46 = i32;
                            iu.k.b(hVar13, rVarS2, y0VarA14, 0, false, i46, 0, new s0.g(fr.j3.L(j113 & 1095216660480L, (float) (((double) v3.o.c(j113)) * 0.6d)), j113, fr.j3.A(1)), sVar7, (i29 >> 6) & 3670016);
                            i36 = i46;
                            sVar = sVar7;
                            sVar.p(false);
                        } else {
                            i36 = i32;
                            y0Var3 = y0Var2;
                            sVar.d0(1550610620);
                            if (word.getWordType() == 4) {
                                sVar.d0(1551215740);
                                sb2 = new StringBuilder(16);
                                new ArrayList();
                                arrayList = new ArrayList();
                                new ArrayList();
                                if (z24) {
                                    sb2.append(" ");
                                }
                                sb2.append(str2);
                                if (z24) {
                                    sb2.append(" ");
                                }
                                String string13 = sb2.toString();
                                arrayList2 = new ArrayList(arrayList.size());
                                size = arrayList.size();
                                while (i37 < size) {
                                    arrayList2.add(((j3.d) arrayList.get(i37)).a(sb2.length()));
                                }
                                j3.h hVar14 = new j3.h(string13, arrayList2);
                                j3.y0 y0VarA15 = j3.y0.a(y0Var3, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                                y0Var4 = y0Var3;
                                if (fVar5 != null) {
                                    rVarS = j0.e2.s(oVar, fVar5.f53489a);
                                } else {
                                    rVarS = oVar;
                                }
                                ua.c(hVar14, rVarS, 0L, 0L, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, null, y0VarA15, sVar, 0, 0, 130556);
                                z29 = false;
                                sVar.p(false);
                            } else {
                                sVar.d0(1551215740);
                                sb2 = new StringBuilder(16);
                                new ArrayList();
                                arrayList = new ArrayList();
                                new ArrayList();
                                if (z24) {
                                    sb2.append(" ");
                                }
                                sb2.append(str2);
                                if (z24) {
                                    sb2.append(" ");
                                }
                                String string14 = sb2.toString();
                                arrayList2 = new ArrayList(arrayList.size());
                                size = arrayList.size();
                                while (i37 < size) {
                                    arrayList2.add(((j3.d) arrayList.get(i37)).a(sb2.length()));
                                }
                                j3.h hVar15 = new j3.h(string14, arrayList2);
                                j3.y0 y0VarA16 = j3.y0.a(y0Var3, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                                y0Var4 = y0Var3;
                                if (fVar5 != null) {
                                    rVarS = j0.e2.s(oVar, fVar5.f53489a);
                                } else {
                                    rVarS = oVar;
                                }
                                ua.c(hVar15, rVarS, 0L, 0L, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, null, y0VarA16, sVar, 0, 0, 130556);
                                z29 = false;
                                sVar.p(false);
                            }
                            sVar.p(z29);
                        }
                        if (str3.length() > 0) {
                            z30 = false;
                            sVar.d0(1542510382);
                        } else {
                            z30 = false;
                            sVar.d0(1542510382);
                        }
                        sVar.p(z30);
                        sVar.p(true);
                        fVar3 = fVar5;
                        rVar3 = rVar2;
                        z20 = z39;
                        z19 = z24;
                        z17 = z310;
                        z21 = z27;
                        dVar2 = dVar3;
                        i31 = i36;
                    } else {
                        sVar = sVar2;
                        sVar.W();
                        dVar2 = dVar;
                        z19 = z16;
                        rVar3 = rVar2;
                        z20 = z15;
                        fVar3 = fVar2;
                        z21 = z13;
                        i31 = i11;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new fz.e() { // from class: dt.e4
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                g4.b(word, textStyle, rVar3, z20, fVar3, z19, z21, z17, i31, dVar2, (l1.n) obj, l1.t.M(i12 | 1), i13);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i25 |= 100663296;
                i28 = i13 & 512;
                if (i28 != 0) {
                    i28 = i28;
                    i29 = i25 | 805306368;
                } else {
                    if ((i12 & 805306368) != 0) {
                        if (sVar2.f(dVar)) {
                            i30 = 536870912;
                        } else {
                            i30 = 268435456;
                        }
                        i25 |= i30;
                    }
                    i29 = i25;
                }
                if ((i29 & 306783379) != 306783378) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (sVar2.T(i29 & 1, z18)) {
                    oVar = z1.o.f58481a;
                    if (i40 != 0) {
                        rVar2 = oVar;
                    }
                    if (i14 != 0) {
                        z22 = false;
                    } else {
                        z22 = z15;
                    }
                    if (i16 != 0) {
                        fVar4 = null;
                    } else {
                        fVar4 = fVar2;
                    }
                    if (i18 != 0) {
                        z16 = false;
                    }
                    if (i21 != 0) {
                        z23 = true;
                    } else {
                        z23 = z13;
                    }
                    if (i23 != 0) {
                        z17 = false;
                    }
                    if (i26 != 0) {
                        i32 = 2;
                    } else {
                        i32 = i11;
                    }
                    if (i28 != 0) {
                        dVar3 = z1.c.P;
                    } else {
                        dVar3 = dVar;
                    }
                    i33 = ((ct.b) sVar2.j(ct.c.f22476a)).f22473h;
                    c3Var = ju.f.f37370d;
                    iIntValue = ((Number) sVar2.j(c3Var)).intValue();
                    boolean z311 = z22;
                    v3.c cVar6 = (v3.c) sVar2.j(z2.g1.f58547h);
                    z24 = z16;
                    y0VarB = ct.c.b(sVar2);
                    boolean zF8 = sVar2.f(y0VarB);
                    boolean z312 = z17;
                    if ((i29 & 112) == 32) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = zF8 | z25;
                    objQ = sVar2.Q();
                    l1.g gVar6 = l1.m.f39353a;
                    if (z26) {
                        objQ = j3.y0.a(y0VarB, 0L, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777215).d(textStyle);
                        sVar2.o0(objQ);
                    } else {
                        objQ = j3.y0.a(y0VarB, 0L, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777215).d(textStyle);
                        sVar2.o0(objQ);
                    }
                    y0Var = (j3.y0) objQ;
                    zF = sVar2.f(word) | sVar2.d(i33);
                    objQ2 = sVar2.Q();
                    if (zF) {
                        objQ2 = c(word, iIntValue, i33);
                        sVar2.o0(objQ2);
                    } else {
                        objQ2 = c(word, iIntValue, i33);
                        sVar2.o0(objQ2);
                    }
                    qy.r rVar9 = (qy.r) objQ2;
                    str = (String) rVar9.f48505a;
                    z27 = z23;
                    str2 = (String) rVar9.f48506b;
                    str3 = (String) rVar9.f48507c;
                    fD = ct.c.d(sVar2);
                    if (kotlin.jvm.internal.m.a(str, str2)) {
                        f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                    } else {
                        f5 = fD;
                    }
                    if (kotlin.jvm.internal.m.a(str3, str2)) {
                        f11 = CropImageView.DEFAULT_ASPECT_RATIO;
                    } else {
                        f11 = fD;
                    }
                    j3.w0 w0VarI6 = j3.t.i(sVar2);
                    zF2 = sVar2.f(y0Var) | sVar2.d(i33) | sVar2.d(iIntValue);
                    objQ3 = sVar2.Q();
                    if (zF2) {
                        if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(iIntValue))) {
                        }
                        i34 = 0;
                        objQ3 = Integer.valueOf(i34);
                        sVar2.o0(objQ3);
                    } else {
                        if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(iIntValue))) {
                        }
                        i34 = 0;
                        objQ3 = Integer.valueOf(i34);
                        sVar2.o0(objQ3);
                    }
                    int iIntValue7 = ((Number) objQ3).intValue();
                    if (ry.l.D(new Integer[]{51, 55}, Integer.valueOf(((Number) sVar2.j(c3Var)).intValue()))) {
                        i35 = 2;
                    } else {
                        i35 = -4;
                    }
                    z1.r rVarC11 = j0.c.C(rVar2, cVar6.Q(iIntValue7 / 2), CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    j0.b bVar6 = j0.i.f35303a;
                    j0.u uVarA6 = j0.t.a(j0.i.i(i35), dVar3, sVar2, (((i29 >> 21) & 896) >> 3) & 112);
                    iHashCode = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL6 = sVar2.l();
                    z1.r rVarC12 = z1.a.c(sVar2, rVarC11);
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA6, sVar2);
                    l1.t.J(y2.j.f56916e, q1VarL6, sVar2);
                    hVar = y2.j.f56918g;
                    if (sVar2.S) {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC12, sVar2);
                    if (str.length() > 0) {
                        sVar = sVar2;
                        str4 = str;
                        fVar5 = fVar4;
                        y0Var2 = y0Var;
                        z28 = false;
                        sVar.d0(1542510382);
                    } else {
                        sVar = sVar2;
                        str4 = str;
                        fVar5 = fVar4;
                        y0Var2 = y0Var;
                        z28 = false;
                        sVar.d0(1542510382);
                    }
                    sVar.p(z28);
                    if (z27) {
                        sVar.d0(1549618713);
                        sb3 = new StringBuilder(16);
                        new ArrayList();
                        arrayList3 = new ArrayList();
                        new ArrayList();
                        if (z24) {
                            sb3.append(" ");
                        }
                        sb3.append(str2);
                        if (z24) {
                            sb3.append(" ");
                        }
                        String string15 = sb3.toString();
                        arrayList4 = new ArrayList(arrayList3.size());
                        size2 = arrayList3.size();
                        while (i38 < size2) {
                            arrayList4.add(((j3.d) arrayList3.get(i38)).a(sb3.length()));
                        }
                        j3.h hVar16 = new j3.h(string15, arrayList4);
                        j3.y0 y0VarA17 = j3.y0.a(y0Var2, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                        y0Var4 = y0Var2;
                        if (fVar5 != null) {
                            rVarS2 = j0.e2.s(oVar, fVar5.f53489a);
                        } else {
                            rVarS2 = oVar;
                        }
                        long j114 = y0Var4.f35827a.f35755b;
                        fr.j3.i(j114);
                        l1.s sVar8 = sVar;
                        int i47 = i32;
                        iu.k.b(hVar16, rVarS2, y0VarA17, 0, false, i47, 0, new s0.g(fr.j3.L(j114 & 1095216660480L, (float) (((double) v3.o.c(j114)) * 0.6d)), j114, fr.j3.A(1)), sVar8, (i29 >> 6) & 3670016);
                        i36 = i47;
                        sVar = sVar8;
                        sVar.p(false);
                    } else {
                        i36 = i32;
                        y0Var3 = y0Var2;
                        sVar.d0(1550610620);
                        if (word.getWordType() == 4) {
                            sVar.d0(1551215740);
                            sb2 = new StringBuilder(16);
                            new ArrayList();
                            arrayList = new ArrayList();
                            new ArrayList();
                            if (z24) {
                                sb2.append(" ");
                            }
                            sb2.append(str2);
                            if (z24) {
                                sb2.append(" ");
                            }
                            String string16 = sb2.toString();
                            arrayList2 = new ArrayList(arrayList.size());
                            size = arrayList.size();
                            while (i37 < size) {
                                arrayList2.add(((j3.d) arrayList.get(i37)).a(sb2.length()));
                            }
                            j3.h hVar17 = new j3.h(string16, arrayList2);
                            j3.y0 y0VarA18 = j3.y0.a(y0Var3, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                            y0Var4 = y0Var3;
                            if (fVar5 != null) {
                                rVarS = j0.e2.s(oVar, fVar5.f53489a);
                            } else {
                                rVarS = oVar;
                            }
                            ua.c(hVar17, rVarS, 0L, 0L, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, null, y0VarA18, sVar, 0, 0, 130556);
                            z29 = false;
                            sVar.p(false);
                        } else {
                            sVar.d0(1551215740);
                            sb2 = new StringBuilder(16);
                            new ArrayList();
                            arrayList = new ArrayList();
                            new ArrayList();
                            if (z24) {
                                sb2.append(" ");
                            }
                            sb2.append(str2);
                            if (z24) {
                                sb2.append(" ");
                            }
                            String string17 = sb2.toString();
                            arrayList2 = new ArrayList(arrayList.size());
                            size = arrayList.size();
                            while (i37 < size) {
                                arrayList2.add(((j3.d) arrayList.get(i37)).a(sb2.length()));
                            }
                            j3.h hVar18 = new j3.h(string17, arrayList2);
                            j3.y0 y0VarA19 = j3.y0.a(y0Var3, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                            y0Var4 = y0Var3;
                            if (fVar5 != null) {
                                rVarS = j0.e2.s(oVar, fVar5.f53489a);
                            } else {
                                rVarS = oVar;
                            }
                            ua.c(hVar18, rVarS, 0L, 0L, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, null, y0VarA19, sVar, 0, 0, 130556);
                            z29 = false;
                            sVar.p(false);
                        }
                        sVar.p(z29);
                    }
                    if (str3.length() > 0) {
                        z30 = false;
                        sVar.d0(1542510382);
                    } else {
                        z30 = false;
                        sVar.d0(1542510382);
                    }
                    sVar.p(z30);
                    sVar.p(true);
                    fVar3 = fVar5;
                    rVar3 = rVar2;
                    z20 = z311;
                    z19 = z24;
                    z17 = z312;
                    z21 = z27;
                    dVar2 = dVar3;
                    i31 = i36;
                } else {
                    sVar = sVar2;
                    sVar.W();
                    dVar2 = dVar;
                    z19 = z16;
                    rVar3 = rVar2;
                    z20 = z15;
                    fVar3 = fVar2;
                    z21 = z13;
                    i31 = i11;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: dt.e4
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            g4.b(word, textStyle, rVar3, z20, fVar3, z19, z21, z17, i31, dVar2, (l1.n) obj, l1.t.M(i12 | 1), i13);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i39 |= 24576;
            fVar2 = fVar;
            i18 = i13 & 32;
            if (i18 != 0) {
                i39 |= 196608;
                z16 = z12;
            } else {
                z16 = z12;
                if ((i12 & 196608) == 0) {
                    if (sVar2.g(z16)) {
                        i19 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i19 = 65536;
                    }
                    i39 |= i19;
                }
            }
            i21 = i13 & 64;
            if (i21 != 0) {
                i39 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (sVar2.g(z13)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i39 |= i22;
            }
            i23 = i13 & 128;
            if (i23 != 0) {
                i39 |= 12582912;
                z17 = z14;
            } else {
                z17 = z14;
                if ((i12 & 12582912) == 0) {
                    if (sVar2.g(z17)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i39 |= i24;
                }
            }
            i25 = i39;
            i26 = i13 & 256;
            if (i26 != 0) {
                if ((i12 & 100663296) == 0) {
                    if (sVar2.d(i11)) {
                        i27 = 67108864;
                    } else {
                        i27 = 33554432;
                    }
                    i25 |= i27;
                }
                i28 = i13 & 512;
                if (i28 != 0) {
                    i28 = i28;
                    i29 = i25 | 805306368;
                } else {
                    if ((i12 & 805306368) != 0) {
                        if (sVar2.f(dVar)) {
                            i30 = 536870912;
                        } else {
                            i30 = 268435456;
                        }
                        i25 |= i30;
                    }
                    i29 = i25;
                }
                if ((i29 & 306783379) != 306783378) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (sVar2.T(i29 & 1, z18)) {
                    oVar = z1.o.f58481a;
                    if (i40 != 0) {
                        rVar2 = oVar;
                    }
                    if (i14 != 0) {
                        z22 = false;
                    } else {
                        z22 = z15;
                    }
                    if (i16 != 0) {
                        fVar4 = null;
                    } else {
                        fVar4 = fVar2;
                    }
                    if (i18 != 0) {
                        z16 = false;
                    }
                    if (i21 != 0) {
                        z23 = true;
                    } else {
                        z23 = z13;
                    }
                    if (i23 != 0) {
                        z17 = false;
                    }
                    if (i26 != 0) {
                        i32 = 2;
                    } else {
                        i32 = i11;
                    }
                    if (i28 != 0) {
                        dVar3 = z1.c.P;
                    } else {
                        dVar3 = dVar;
                    }
                    i33 = ((ct.b) sVar2.j(ct.c.f22476a)).f22473h;
                    c3Var = ju.f.f37370d;
                    iIntValue = ((Number) sVar2.j(c3Var)).intValue();
                    boolean z313 = z22;
                    v3.c cVar7 = (v3.c) sVar2.j(z2.g1.f58547h);
                    z24 = z16;
                    y0VarB = ct.c.b(sVar2);
                    boolean zF9 = sVar2.f(y0VarB);
                    boolean z314 = z17;
                    if ((i29 & 112) == 32) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = zF9 | z25;
                    objQ = sVar2.Q();
                    l1.g gVar7 = l1.m.f39353a;
                    if (z26) {
                        objQ = j3.y0.a(y0VarB, 0L, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777215).d(textStyle);
                        sVar2.o0(objQ);
                    } else {
                        objQ = j3.y0.a(y0VarB, 0L, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777215).d(textStyle);
                        sVar2.o0(objQ);
                    }
                    y0Var = (j3.y0) objQ;
                    zF = sVar2.f(word) | sVar2.d(i33);
                    objQ2 = sVar2.Q();
                    if (zF) {
                        objQ2 = c(word, iIntValue, i33);
                        sVar2.o0(objQ2);
                    } else {
                        objQ2 = c(word, iIntValue, i33);
                        sVar2.o0(objQ2);
                    }
                    qy.r rVar10 = (qy.r) objQ2;
                    str = (String) rVar10.f48505a;
                    z27 = z23;
                    str2 = (String) rVar10.f48506b;
                    str3 = (String) rVar10.f48507c;
                    fD = ct.c.d(sVar2);
                    if (kotlin.jvm.internal.m.a(str, str2)) {
                        f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                    } else {
                        f5 = fD;
                    }
                    if (kotlin.jvm.internal.m.a(str3, str2)) {
                        f11 = CropImageView.DEFAULT_ASPECT_RATIO;
                    } else {
                        f11 = fD;
                    }
                    j3.w0 w0VarI7 = j3.t.i(sVar2);
                    zF2 = sVar2.f(y0Var) | sVar2.d(i33) | sVar2.d(iIntValue);
                    objQ3 = sVar2.Q();
                    if (zF2) {
                        if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(iIntValue))) {
                        }
                        i34 = 0;
                        objQ3 = Integer.valueOf(i34);
                        sVar2.o0(objQ3);
                    } else {
                        if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(iIntValue))) {
                        }
                        i34 = 0;
                        objQ3 = Integer.valueOf(i34);
                        sVar2.o0(objQ3);
                    }
                    int iIntValue8 = ((Number) objQ3).intValue();
                    if (ry.l.D(new Integer[]{51, 55}, Integer.valueOf(((Number) sVar2.j(c3Var)).intValue()))) {
                        i35 = 2;
                    } else {
                        i35 = -4;
                    }
                    z1.r rVarC13 = j0.c.C(rVar2, cVar7.Q(iIntValue8 / 2), CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    j0.b bVar7 = j0.i.f35303a;
                    j0.u uVarA7 = j0.t.a(j0.i.i(i35), dVar3, sVar2, (((i29 >> 21) & 896) >> 3) & 112);
                    iHashCode = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL7 = sVar2.l();
                    z1.r rVarC14 = z1.a.c(sVar2, rVarC13);
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA7, sVar2);
                    l1.t.J(y2.j.f56916e, q1VarL7, sVar2);
                    hVar = y2.j.f56918g;
                    if (sVar2.S) {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC14, sVar2);
                    if (str.length() > 0) {
                        sVar = sVar2;
                        str4 = str;
                        fVar5 = fVar4;
                        y0Var2 = y0Var;
                        z28 = false;
                        sVar.d0(1542510382);
                    } else {
                        sVar = sVar2;
                        str4 = str;
                        fVar5 = fVar4;
                        y0Var2 = y0Var;
                        z28 = false;
                        sVar.d0(1542510382);
                    }
                    sVar.p(z28);
                    if (z27) {
                        sVar.d0(1549618713);
                        sb3 = new StringBuilder(16);
                        new ArrayList();
                        arrayList3 = new ArrayList();
                        new ArrayList();
                        if (z24) {
                            sb3.append(" ");
                        }
                        sb3.append(str2);
                        if (z24) {
                            sb3.append(" ");
                        }
                        String string18 = sb3.toString();
                        arrayList4 = new ArrayList(arrayList3.size());
                        size2 = arrayList3.size();
                        while (i38 < size2) {
                            arrayList4.add(((j3.d) arrayList3.get(i38)).a(sb3.length()));
                        }
                        j3.h hVar19 = new j3.h(string18, arrayList4);
                        j3.y0 y0VarA110 = j3.y0.a(y0Var2, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                        y0Var4 = y0Var2;
                        if (fVar5 != null) {
                            rVarS2 = j0.e2.s(oVar, fVar5.f53489a);
                        } else {
                            rVarS2 = oVar;
                        }
                        long j115 = y0Var4.f35827a.f35755b;
                        fr.j3.i(j115);
                        l1.s sVar9 = sVar;
                        int i48 = i32;
                        iu.k.b(hVar19, rVarS2, y0VarA110, 0, false, i48, 0, new s0.g(fr.j3.L(j115 & 1095216660480L, (float) (((double) v3.o.c(j115)) * 0.6d)), j115, fr.j3.A(1)), sVar9, (i29 >> 6) & 3670016);
                        i36 = i48;
                        sVar = sVar9;
                        sVar.p(false);
                    } else {
                        i36 = i32;
                        y0Var3 = y0Var2;
                        sVar.d0(1550610620);
                        if (word.getWordType() == 4) {
                            sVar.d0(1551215740);
                            sb2 = new StringBuilder(16);
                            new ArrayList();
                            arrayList = new ArrayList();
                            new ArrayList();
                            if (z24) {
                                sb2.append(" ");
                            }
                            sb2.append(str2);
                            if (z24) {
                                sb2.append(" ");
                            }
                            String string19 = sb2.toString();
                            arrayList2 = new ArrayList(arrayList.size());
                            size = arrayList.size();
                            while (i37 < size) {
                                arrayList2.add(((j3.d) arrayList.get(i37)).a(sb2.length()));
                            }
                            j3.h hVar110 = new j3.h(string19, arrayList2);
                            j3.y0 y0VarA111 = j3.y0.a(y0Var3, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                            y0Var4 = y0Var3;
                            if (fVar5 != null) {
                                rVarS = j0.e2.s(oVar, fVar5.f53489a);
                            } else {
                                rVarS = oVar;
                            }
                            ua.c(hVar110, rVarS, 0L, 0L, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, null, y0VarA111, sVar, 0, 0, 130556);
                            z29 = false;
                            sVar.p(false);
                        } else {
                            sVar.d0(1551215740);
                            sb2 = new StringBuilder(16);
                            new ArrayList();
                            arrayList = new ArrayList();
                            new ArrayList();
                            if (z24) {
                                sb2.append(" ");
                            }
                            sb2.append(str2);
                            if (z24) {
                                sb2.append(" ");
                            }
                            String string110 = sb2.toString();
                            arrayList2 = new ArrayList(arrayList.size());
                            size = arrayList.size();
                            while (i37 < size) {
                                arrayList2.add(((j3.d) arrayList.get(i37)).a(sb2.length()));
                            }
                            j3.h hVar111 = new j3.h(string110, arrayList2);
                            j3.y0 y0VarA112 = j3.y0.a(y0Var3, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                            y0Var4 = y0Var3;
                            if (fVar5 != null) {
                                rVarS = j0.e2.s(oVar, fVar5.f53489a);
                            } else {
                                rVarS = oVar;
                            }
                            ua.c(hVar111, rVarS, 0L, 0L, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, null, y0VarA112, sVar, 0, 0, 130556);
                            z29 = false;
                            sVar.p(false);
                        }
                        sVar.p(z29);
                    }
                    if (str3.length() > 0) {
                        z30 = false;
                        sVar.d0(1542510382);
                    } else {
                        z30 = false;
                        sVar.d0(1542510382);
                    }
                    sVar.p(z30);
                    sVar.p(true);
                    fVar3 = fVar5;
                    rVar3 = rVar2;
                    z20 = z313;
                    z19 = z24;
                    z17 = z314;
                    z21 = z27;
                    dVar2 = dVar3;
                    i31 = i36;
                } else {
                    sVar = sVar2;
                    sVar.W();
                    dVar2 = dVar;
                    z19 = z16;
                    rVar3 = rVar2;
                    z20 = z15;
                    fVar3 = fVar2;
                    z21 = z13;
                    i31 = i11;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: dt.e4
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            g4.b(word, textStyle, rVar3, z20, fVar3, z19, z21, z17, i31, dVar2, (l1.n) obj, l1.t.M(i12 | 1), i13);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i25 |= 100663296;
            i28 = i13 & 512;
            if (i28 != 0) {
                i28 = i28;
                i29 = i25 | 805306368;
            } else {
                if ((i12 & 805306368) != 0) {
                    if (sVar2.f(dVar)) {
                        i30 = 536870912;
                    } else {
                        i30 = 268435456;
                    }
                    i25 |= i30;
                }
                i29 = i25;
            }
            if ((i29 & 306783379) != 306783378) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (sVar2.T(i29 & 1, z18)) {
                oVar = z1.o.f58481a;
                if (i40 != 0) {
                    rVar2 = oVar;
                }
                if (i14 != 0) {
                    z22 = false;
                } else {
                    z22 = z15;
                }
                if (i16 != 0) {
                    fVar4 = null;
                } else {
                    fVar4 = fVar2;
                }
                if (i18 != 0) {
                    z16 = false;
                }
                if (i21 != 0) {
                    z23 = true;
                } else {
                    z23 = z13;
                }
                if (i23 != 0) {
                    z17 = false;
                }
                if (i26 != 0) {
                    i32 = 2;
                } else {
                    i32 = i11;
                }
                if (i28 != 0) {
                    dVar3 = z1.c.P;
                } else {
                    dVar3 = dVar;
                }
                i33 = ((ct.b) sVar2.j(ct.c.f22476a)).f22473h;
                c3Var = ju.f.f37370d;
                iIntValue = ((Number) sVar2.j(c3Var)).intValue();
                boolean z315 = z22;
                v3.c cVar8 = (v3.c) sVar2.j(z2.g1.f58547h);
                z24 = z16;
                y0VarB = ct.c.b(sVar2);
                boolean zF10 = sVar2.f(y0VarB);
                boolean z316 = z17;
                if ((i29 & 112) == 32) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                z26 = zF10 | z25;
                objQ = sVar2.Q();
                l1.g gVar8 = l1.m.f39353a;
                if (z26) {
                    objQ = j3.y0.a(y0VarB, 0L, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777215).d(textStyle);
                    sVar2.o0(objQ);
                } else {
                    objQ = j3.y0.a(y0VarB, 0L, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777215).d(textStyle);
                    sVar2.o0(objQ);
                }
                y0Var = (j3.y0) objQ;
                zF = sVar2.f(word) | sVar2.d(i33);
                objQ2 = sVar2.Q();
                if (zF) {
                    objQ2 = c(word, iIntValue, i33);
                    sVar2.o0(objQ2);
                } else {
                    objQ2 = c(word, iIntValue, i33);
                    sVar2.o0(objQ2);
                }
                qy.r rVar11 = (qy.r) objQ2;
                str = (String) rVar11.f48505a;
                z27 = z23;
                str2 = (String) rVar11.f48506b;
                str3 = (String) rVar11.f48507c;
                fD = ct.c.d(sVar2);
                if (kotlin.jvm.internal.m.a(str, str2)) {
                    f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                } else {
                    f5 = fD;
                }
                if (kotlin.jvm.internal.m.a(str3, str2)) {
                    f11 = CropImageView.DEFAULT_ASPECT_RATIO;
                } else {
                    f11 = fD;
                }
                j3.w0 w0VarI8 = j3.t.i(sVar2);
                zF2 = sVar2.f(y0Var) | sVar2.d(i33) | sVar2.d(iIntValue);
                objQ3 = sVar2.Q();
                if (zF2) {
                    if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(iIntValue))) {
                    }
                    i34 = 0;
                    objQ3 = Integer.valueOf(i34);
                    sVar2.o0(objQ3);
                } else {
                    if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(iIntValue))) {
                    }
                    i34 = 0;
                    objQ3 = Integer.valueOf(i34);
                    sVar2.o0(objQ3);
                }
                int iIntValue9 = ((Number) objQ3).intValue();
                if (ry.l.D(new Integer[]{51, 55}, Integer.valueOf(((Number) sVar2.j(c3Var)).intValue()))) {
                    i35 = 2;
                } else {
                    i35 = -4;
                }
                z1.r rVarC15 = j0.c.C(rVar2, cVar8.Q(iIntValue9 / 2), CropImageView.DEFAULT_ASPECT_RATIO, 2);
                j0.b bVar8 = j0.i.f35303a;
                j0.u uVarA8 = j0.t.a(j0.i.i(i35), dVar3, sVar2, (((i29 >> 21) & 896) >> 3) & 112);
                iHashCode = Long.hashCode(sVar2.T);
                l1.q1 q1VarL8 = sVar2.l();
                z1.r rVarC16 = z1.a.c(sVar2, rVarC15);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                l1.t.J(y2.j.f56917f, uVarA8, sVar2);
                l1.t.J(y2.j.f56916e, q1VarL8, sVar2);
                hVar = y2.j.f56918g;
                if (sVar2.S) {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                } else {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC16, sVar2);
                if (str.length() > 0) {
                    sVar = sVar2;
                    str4 = str;
                    fVar5 = fVar4;
                    y0Var2 = y0Var;
                    z28 = false;
                    sVar.d0(1542510382);
                } else {
                    sVar = sVar2;
                    str4 = str;
                    fVar5 = fVar4;
                    y0Var2 = y0Var;
                    z28 = false;
                    sVar.d0(1542510382);
                }
                sVar.p(z28);
                if (z27) {
                    sVar.d0(1549618713);
                    sb3 = new StringBuilder(16);
                    new ArrayList();
                    arrayList3 = new ArrayList();
                    new ArrayList();
                    if (z24) {
                        sb3.append(" ");
                    }
                    sb3.append(str2);
                    if (z24) {
                        sb3.append(" ");
                    }
                    String string111 = sb3.toString();
                    arrayList4 = new ArrayList(arrayList3.size());
                    size2 = arrayList3.size();
                    while (i38 < size2) {
                        arrayList4.add(((j3.d) arrayList3.get(i38)).a(sb3.length()));
                    }
                    j3.h hVar112 = new j3.h(string111, arrayList4);
                    j3.y0 y0VarA113 = j3.y0.a(y0Var2, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                    y0Var4 = y0Var2;
                    if (fVar5 != null) {
                        rVarS2 = j0.e2.s(oVar, fVar5.f53489a);
                    } else {
                        rVarS2 = oVar;
                    }
                    long j116 = y0Var4.f35827a.f35755b;
                    fr.j3.i(j116);
                    l1.s sVar10 = sVar;
                    int i49 = i32;
                    iu.k.b(hVar112, rVarS2, y0VarA113, 0, false, i49, 0, new s0.g(fr.j3.L(j116 & 1095216660480L, (float) (((double) v3.o.c(j116)) * 0.6d)), j116, fr.j3.A(1)), sVar10, (i29 >> 6) & 3670016);
                    i36 = i49;
                    sVar = sVar10;
                    sVar.p(false);
                } else {
                    i36 = i32;
                    y0Var3 = y0Var2;
                    sVar.d0(1550610620);
                    if (word.getWordType() == 4) {
                        sVar.d0(1551215740);
                        sb2 = new StringBuilder(16);
                        new ArrayList();
                        arrayList = new ArrayList();
                        new ArrayList();
                        if (z24) {
                            sb2.append(" ");
                        }
                        sb2.append(str2);
                        if (z24) {
                            sb2.append(" ");
                        }
                        String string112 = sb2.toString();
                        arrayList2 = new ArrayList(arrayList.size());
                        size = arrayList.size();
                        while (i37 < size) {
                            arrayList2.add(((j3.d) arrayList.get(i37)).a(sb2.length()));
                        }
                        j3.h hVar113 = new j3.h(string112, arrayList2);
                        j3.y0 y0VarA114 = j3.y0.a(y0Var3, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                        y0Var4 = y0Var3;
                        if (fVar5 != null) {
                            rVarS = j0.e2.s(oVar, fVar5.f53489a);
                        } else {
                            rVarS = oVar;
                        }
                        ua.c(hVar113, rVarS, 0L, 0L, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, null, y0VarA114, sVar, 0, 0, 130556);
                        z29 = false;
                        sVar.p(false);
                    } else {
                        sVar.d0(1551215740);
                        sb2 = new StringBuilder(16);
                        new ArrayList();
                        arrayList = new ArrayList();
                        new ArrayList();
                        if (z24) {
                            sb2.append(" ");
                        }
                        sb2.append(str2);
                        if (z24) {
                            sb2.append(" ");
                        }
                        String string113 = sb2.toString();
                        arrayList2 = new ArrayList(arrayList.size());
                        size = arrayList.size();
                        while (i37 < size) {
                            arrayList2.add(((j3.d) arrayList.get(i37)).a(sb2.length()));
                        }
                        j3.h hVar114 = new j3.h(string113, arrayList2);
                        j3.y0 y0VarA115 = j3.y0.a(y0Var3, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                        y0Var4 = y0Var3;
                        if (fVar5 != null) {
                            rVarS = j0.e2.s(oVar, fVar5.f53489a);
                        } else {
                            rVarS = oVar;
                        }
                        ua.c(hVar114, rVarS, 0L, 0L, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, null, y0VarA115, sVar, 0, 0, 130556);
                        z29 = false;
                        sVar.p(false);
                    }
                    sVar.p(z29);
                }
                if (str3.length() > 0) {
                    z30 = false;
                    sVar.d0(1542510382);
                } else {
                    z30 = false;
                    sVar.d0(1542510382);
                }
                sVar.p(z30);
                sVar.p(true);
                fVar3 = fVar5;
                rVar3 = rVar2;
                z20 = z315;
                z19 = z24;
                z17 = z316;
                z21 = z27;
                dVar2 = dVar3;
                i31 = i36;
            } else {
                sVar = sVar2;
                sVar.W();
                dVar2 = dVar;
                z19 = z16;
                rVar3 = rVar2;
                z20 = z15;
                fVar3 = fVar2;
                z21 = z13;
                i31 = i11;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: dt.e4
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        g4.b(word, textStyle, rVar3, z20, fVar3, z19, z21, z17, i31, dVar2, (l1.n) obj, l1.t.M(i12 | 1), i13);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i39 |= 384;
        rVar2 = rVar;
        i14 = i13 & 8;
        if (i14 != 0) {
            if ((i12 & 3072) == 0) {
                z15 = z11;
                if (sVar2.g(z15)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i39 |= i15;
            }
            i16 = i13 & 16;
            if (i16 != 0) {
                if ((i12 & 24576) == 0) {
                    fVar2 = fVar;
                    if (sVar2.f(fVar2)) {
                        i17 = 16384;
                    } else {
                        i17 = OSSConstants.DEFAULT_BUFFER_SIZE;
                    }
                    i39 |= i17;
                }
                i18 = i13 & 32;
                if (i18 != 0) {
                    i39 |= 196608;
                    z16 = z12;
                } else {
                    z16 = z12;
                    if ((i12 & 196608) == 0) {
                        if (sVar2.g(z16)) {
                            i19 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                        } else {
                            i19 = 65536;
                        }
                        i39 |= i19;
                    }
                }
                i21 = i13 & 64;
                if (i21 != 0) {
                    i39 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (sVar2.g(z13)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i39 |= i22;
                }
                i23 = i13 & 128;
                if (i23 != 0) {
                    i39 |= 12582912;
                    z17 = z14;
                } else {
                    z17 = z14;
                    if ((i12 & 12582912) == 0) {
                        if (sVar2.g(z17)) {
                            i24 = 8388608;
                        } else {
                            i24 = 4194304;
                        }
                        i39 |= i24;
                    }
                }
                i25 = i39;
                i26 = i13 & 256;
                if (i26 != 0) {
                    if ((i12 & 100663296) == 0) {
                        if (sVar2.d(i11)) {
                            i27 = 67108864;
                        } else {
                            i27 = 33554432;
                        }
                        i25 |= i27;
                    }
                    i28 = i13 & 512;
                    if (i28 != 0) {
                        i28 = i28;
                        i29 = i25 | 805306368;
                    } else {
                        if ((i12 & 805306368) != 0) {
                            if (sVar2.f(dVar)) {
                                i30 = 536870912;
                            } else {
                                i30 = 268435456;
                            }
                            i25 |= i30;
                        }
                        i29 = i25;
                    }
                    if ((i29 & 306783379) != 306783378) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (sVar2.T(i29 & 1, z18)) {
                        oVar = z1.o.f58481a;
                        if (i40 != 0) {
                            rVar2 = oVar;
                        }
                        if (i14 != 0) {
                            z22 = false;
                        } else {
                            z22 = z15;
                        }
                        if (i16 != 0) {
                            fVar4 = null;
                        } else {
                            fVar4 = fVar2;
                        }
                        if (i18 != 0) {
                            z16 = false;
                        }
                        if (i21 != 0) {
                            z23 = true;
                        } else {
                            z23 = z13;
                        }
                        if (i23 != 0) {
                            z17 = false;
                        }
                        if (i26 != 0) {
                            i32 = 2;
                        } else {
                            i32 = i11;
                        }
                        if (i28 != 0) {
                            dVar3 = z1.c.P;
                        } else {
                            dVar3 = dVar;
                        }
                        i33 = ((ct.b) sVar2.j(ct.c.f22476a)).f22473h;
                        c3Var = ju.f.f37370d;
                        iIntValue = ((Number) sVar2.j(c3Var)).intValue();
                        boolean z317 = z22;
                        v3.c cVar9 = (v3.c) sVar2.j(z2.g1.f58547h);
                        z24 = z16;
                        y0VarB = ct.c.b(sVar2);
                        boolean zF11 = sVar2.f(y0VarB);
                        boolean z318 = z17;
                        if ((i29 & 112) == 32) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        z26 = zF11 | z25;
                        objQ = sVar2.Q();
                        l1.g gVar9 = l1.m.f39353a;
                        if (z26) {
                            objQ = j3.y0.a(y0VarB, 0L, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777215).d(textStyle);
                            sVar2.o0(objQ);
                        } else {
                            objQ = j3.y0.a(y0VarB, 0L, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777215).d(textStyle);
                            sVar2.o0(objQ);
                        }
                        y0Var = (j3.y0) objQ;
                        zF = sVar2.f(word) | sVar2.d(i33);
                        objQ2 = sVar2.Q();
                        if (zF) {
                            objQ2 = c(word, iIntValue, i33);
                            sVar2.o0(objQ2);
                        } else {
                            objQ2 = c(word, iIntValue, i33);
                            sVar2.o0(objQ2);
                        }
                        qy.r rVar12 = (qy.r) objQ2;
                        str = (String) rVar12.f48505a;
                        z27 = z23;
                        str2 = (String) rVar12.f48506b;
                        str3 = (String) rVar12.f48507c;
                        fD = ct.c.d(sVar2);
                        if (kotlin.jvm.internal.m.a(str, str2)) {
                            f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                        } else {
                            f5 = fD;
                        }
                        if (kotlin.jvm.internal.m.a(str3, str2)) {
                            f11 = CropImageView.DEFAULT_ASPECT_RATIO;
                        } else {
                            f11 = fD;
                        }
                        j3.w0 w0VarI9 = j3.t.i(sVar2);
                        zF2 = sVar2.f(y0Var) | sVar2.d(i33) | sVar2.d(iIntValue);
                        objQ3 = sVar2.Q();
                        if (zF2) {
                            if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(iIntValue))) {
                            }
                            i34 = 0;
                            objQ3 = Integer.valueOf(i34);
                            sVar2.o0(objQ3);
                        } else {
                            if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(iIntValue))) {
                            }
                            i34 = 0;
                            objQ3 = Integer.valueOf(i34);
                            sVar2.o0(objQ3);
                        }
                        int iIntValue10 = ((Number) objQ3).intValue();
                        if (ry.l.D(new Integer[]{51, 55}, Integer.valueOf(((Number) sVar2.j(c3Var)).intValue()))) {
                            i35 = 2;
                        } else {
                            i35 = -4;
                        }
                        z1.r rVarC17 = j0.c.C(rVar2, cVar9.Q(iIntValue10 / 2), CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        j0.b bVar9 = j0.i.f35303a;
                        j0.u uVarA9 = j0.t.a(j0.i.i(i35), dVar3, sVar2, (((i29 >> 21) & 896) >> 3) & 112);
                        iHashCode = Long.hashCode(sVar2.T);
                        l1.q1 q1VarL9 = sVar2.l();
                        z1.r rVarC18 = z1.a.c(sVar2, rVarC17);
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar);
                        } else {
                            sVar2.r0();
                        }
                        l1.t.J(y2.j.f56917f, uVarA9, sVar2);
                        l1.t.J(y2.j.f56916e, q1VarL9, sVar2);
                        hVar = y2.j.f56918g;
                        if (sVar2.S) {
                            defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                        }
                        l1.t.J(y2.j.f56915d, rVarC18, sVar2);
                        if (str.length() > 0) {
                            sVar = sVar2;
                            str4 = str;
                            fVar5 = fVar4;
                            y0Var2 = y0Var;
                            z28 = false;
                            sVar.d0(1542510382);
                        } else {
                            sVar = sVar2;
                            str4 = str;
                            fVar5 = fVar4;
                            y0Var2 = y0Var;
                            z28 = false;
                            sVar.d0(1542510382);
                        }
                        sVar.p(z28);
                        if (z27) {
                            sVar.d0(1549618713);
                            sb3 = new StringBuilder(16);
                            new ArrayList();
                            arrayList3 = new ArrayList();
                            new ArrayList();
                            if (z24) {
                                sb3.append(" ");
                            }
                            sb3.append(str2);
                            if (z24) {
                                sb3.append(" ");
                            }
                            String string114 = sb3.toString();
                            arrayList4 = new ArrayList(arrayList3.size());
                            size2 = arrayList3.size();
                            while (i38 < size2) {
                                arrayList4.add(((j3.d) arrayList3.get(i38)).a(sb3.length()));
                            }
                            j3.h hVar115 = new j3.h(string114, arrayList4);
                            j3.y0 y0VarA116 = j3.y0.a(y0Var2, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                            y0Var4 = y0Var2;
                            if (fVar5 != null) {
                                rVarS2 = j0.e2.s(oVar, fVar5.f53489a);
                            } else {
                                rVarS2 = oVar;
                            }
                            long j117 = y0Var4.f35827a.f35755b;
                            fr.j3.i(j117);
                            l1.s sVar11 = sVar;
                            int i410 = i32;
                            iu.k.b(hVar115, rVarS2, y0VarA116, 0, false, i410, 0, new s0.g(fr.j3.L(j117 & 1095216660480L, (float) (((double) v3.o.c(j117)) * 0.6d)), j117, fr.j3.A(1)), sVar11, (i29 >> 6) & 3670016);
                            i36 = i410;
                            sVar = sVar11;
                            sVar.p(false);
                        } else {
                            i36 = i32;
                            y0Var3 = y0Var2;
                            sVar.d0(1550610620);
                            if (word.getWordType() == 4) {
                                sVar.d0(1551215740);
                                sb2 = new StringBuilder(16);
                                new ArrayList();
                                arrayList = new ArrayList();
                                new ArrayList();
                                if (z24) {
                                    sb2.append(" ");
                                }
                                sb2.append(str2);
                                if (z24) {
                                    sb2.append(" ");
                                }
                                String string115 = sb2.toString();
                                arrayList2 = new ArrayList(arrayList.size());
                                size = arrayList.size();
                                while (i37 < size) {
                                    arrayList2.add(((j3.d) arrayList.get(i37)).a(sb2.length()));
                                }
                                j3.h hVar116 = new j3.h(string115, arrayList2);
                                j3.y0 y0VarA117 = j3.y0.a(y0Var3, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                                y0Var4 = y0Var3;
                                if (fVar5 != null) {
                                    rVarS = j0.e2.s(oVar, fVar5.f53489a);
                                } else {
                                    rVarS = oVar;
                                }
                                ua.c(hVar116, rVarS, 0L, 0L, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, null, y0VarA117, sVar, 0, 0, 130556);
                                z29 = false;
                                sVar.p(false);
                            } else {
                                sVar.d0(1551215740);
                                sb2 = new StringBuilder(16);
                                new ArrayList();
                                arrayList = new ArrayList();
                                new ArrayList();
                                if (z24) {
                                    sb2.append(" ");
                                }
                                sb2.append(str2);
                                if (z24) {
                                    sb2.append(" ");
                                }
                                String string116 = sb2.toString();
                                arrayList2 = new ArrayList(arrayList.size());
                                size = arrayList.size();
                                while (i37 < size) {
                                    arrayList2.add(((j3.d) arrayList.get(i37)).a(sb2.length()));
                                }
                                j3.h hVar117 = new j3.h(string116, arrayList2);
                                j3.y0 y0VarA118 = j3.y0.a(y0Var3, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                                y0Var4 = y0Var3;
                                if (fVar5 != null) {
                                    rVarS = j0.e2.s(oVar, fVar5.f53489a);
                                } else {
                                    rVarS = oVar;
                                }
                                ua.c(hVar117, rVarS, 0L, 0L, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, null, y0VarA118, sVar, 0, 0, 130556);
                                z29 = false;
                                sVar.p(false);
                            }
                            sVar.p(z29);
                        }
                        if (str3.length() > 0) {
                            z30 = false;
                            sVar.d0(1542510382);
                        } else {
                            z30 = false;
                            sVar.d0(1542510382);
                        }
                        sVar.p(z30);
                        sVar.p(true);
                        fVar3 = fVar5;
                        rVar3 = rVar2;
                        z20 = z317;
                        z19 = z24;
                        z17 = z318;
                        z21 = z27;
                        dVar2 = dVar3;
                        i31 = i36;
                    } else {
                        sVar = sVar2;
                        sVar.W();
                        dVar2 = dVar;
                        z19 = z16;
                        rVar3 = rVar2;
                        z20 = z15;
                        fVar3 = fVar2;
                        z21 = z13;
                        i31 = i11;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new fz.e() { // from class: dt.e4
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                g4.b(word, textStyle, rVar3, z20, fVar3, z19, z21, z17, i31, dVar2, (l1.n) obj, l1.t.M(i12 | 1), i13);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i25 |= 100663296;
                i28 = i13 & 512;
                if (i28 != 0) {
                    i28 = i28;
                    i29 = i25 | 805306368;
                } else {
                    if ((i12 & 805306368) != 0) {
                        if (sVar2.f(dVar)) {
                            i30 = 536870912;
                        } else {
                            i30 = 268435456;
                        }
                        i25 |= i30;
                    }
                    i29 = i25;
                }
                if ((i29 & 306783379) != 306783378) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (sVar2.T(i29 & 1, z18)) {
                    oVar = z1.o.f58481a;
                    if (i40 != 0) {
                        rVar2 = oVar;
                    }
                    if (i14 != 0) {
                        z22 = false;
                    } else {
                        z22 = z15;
                    }
                    if (i16 != 0) {
                        fVar4 = null;
                    } else {
                        fVar4 = fVar2;
                    }
                    if (i18 != 0) {
                        z16 = false;
                    }
                    if (i21 != 0) {
                        z23 = true;
                    } else {
                        z23 = z13;
                    }
                    if (i23 != 0) {
                        z17 = false;
                    }
                    if (i26 != 0) {
                        i32 = 2;
                    } else {
                        i32 = i11;
                    }
                    if (i28 != 0) {
                        dVar3 = z1.c.P;
                    } else {
                        dVar3 = dVar;
                    }
                    i33 = ((ct.b) sVar2.j(ct.c.f22476a)).f22473h;
                    c3Var = ju.f.f37370d;
                    iIntValue = ((Number) sVar2.j(c3Var)).intValue();
                    boolean z319 = z22;
                    v3.c cVar10 = (v3.c) sVar2.j(z2.g1.f58547h);
                    z24 = z16;
                    y0VarB = ct.c.b(sVar2);
                    boolean zF12 = sVar2.f(y0VarB);
                    boolean z3110 = z17;
                    if ((i29 & 112) == 32) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = zF12 | z25;
                    objQ = sVar2.Q();
                    l1.g gVar10 = l1.m.f39353a;
                    if (z26) {
                        objQ = j3.y0.a(y0VarB, 0L, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777215).d(textStyle);
                        sVar2.o0(objQ);
                    } else {
                        objQ = j3.y0.a(y0VarB, 0L, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777215).d(textStyle);
                        sVar2.o0(objQ);
                    }
                    y0Var = (j3.y0) objQ;
                    zF = sVar2.f(word) | sVar2.d(i33);
                    objQ2 = sVar2.Q();
                    if (zF) {
                        objQ2 = c(word, iIntValue, i33);
                        sVar2.o0(objQ2);
                    } else {
                        objQ2 = c(word, iIntValue, i33);
                        sVar2.o0(objQ2);
                    }
                    qy.r rVar13 = (qy.r) objQ2;
                    str = (String) rVar13.f48505a;
                    z27 = z23;
                    str2 = (String) rVar13.f48506b;
                    str3 = (String) rVar13.f48507c;
                    fD = ct.c.d(sVar2);
                    if (kotlin.jvm.internal.m.a(str, str2)) {
                        f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                    } else {
                        f5 = fD;
                    }
                    if (kotlin.jvm.internal.m.a(str3, str2)) {
                        f11 = CropImageView.DEFAULT_ASPECT_RATIO;
                    } else {
                        f11 = fD;
                    }
                    j3.w0 w0VarI10 = j3.t.i(sVar2);
                    zF2 = sVar2.f(y0Var) | sVar2.d(i33) | sVar2.d(iIntValue);
                    objQ3 = sVar2.Q();
                    if (zF2) {
                        if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(iIntValue))) {
                        }
                        i34 = 0;
                        objQ3 = Integer.valueOf(i34);
                        sVar2.o0(objQ3);
                    } else {
                        if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(iIntValue))) {
                        }
                        i34 = 0;
                        objQ3 = Integer.valueOf(i34);
                        sVar2.o0(objQ3);
                    }
                    int iIntValue11 = ((Number) objQ3).intValue();
                    if (ry.l.D(new Integer[]{51, 55}, Integer.valueOf(((Number) sVar2.j(c3Var)).intValue()))) {
                        i35 = 2;
                    } else {
                        i35 = -4;
                    }
                    z1.r rVarC19 = j0.c.C(rVar2, cVar10.Q(iIntValue11 / 2), CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    j0.b bVar10 = j0.i.f35303a;
                    j0.u uVarA10 = j0.t.a(j0.i.i(i35), dVar3, sVar2, (((i29 >> 21) & 896) >> 3) & 112);
                    iHashCode = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL10 = sVar2.l();
                    z1.r rVarC110 = z1.a.c(sVar2, rVarC19);
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA10, sVar2);
                    l1.t.J(y2.j.f56916e, q1VarL10, sVar2);
                    hVar = y2.j.f56918g;
                    if (sVar2.S) {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC110, sVar2);
                    if (str.length() > 0) {
                        sVar = sVar2;
                        str4 = str;
                        fVar5 = fVar4;
                        y0Var2 = y0Var;
                        z28 = false;
                        sVar.d0(1542510382);
                    } else {
                        sVar = sVar2;
                        str4 = str;
                        fVar5 = fVar4;
                        y0Var2 = y0Var;
                        z28 = false;
                        sVar.d0(1542510382);
                    }
                    sVar.p(z28);
                    if (z27) {
                        sVar.d0(1549618713);
                        sb3 = new StringBuilder(16);
                        new ArrayList();
                        arrayList3 = new ArrayList();
                        new ArrayList();
                        if (z24) {
                            sb3.append(" ");
                        }
                        sb3.append(str2);
                        if (z24) {
                            sb3.append(" ");
                        }
                        String string117 = sb3.toString();
                        arrayList4 = new ArrayList(arrayList3.size());
                        size2 = arrayList3.size();
                        while (i38 < size2) {
                            arrayList4.add(((j3.d) arrayList3.get(i38)).a(sb3.length()));
                        }
                        j3.h hVar118 = new j3.h(string117, arrayList4);
                        j3.y0 y0VarA119 = j3.y0.a(y0Var2, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                        y0Var4 = y0Var2;
                        if (fVar5 != null) {
                            rVarS2 = j0.e2.s(oVar, fVar5.f53489a);
                        } else {
                            rVarS2 = oVar;
                        }
                        long j118 = y0Var4.f35827a.f35755b;
                        fr.j3.i(j118);
                        l1.s sVar12 = sVar;
                        int i411 = i32;
                        iu.k.b(hVar118, rVarS2, y0VarA119, 0, false, i411, 0, new s0.g(fr.j3.L(j118 & 1095216660480L, (float) (((double) v3.o.c(j118)) * 0.6d)), j118, fr.j3.A(1)), sVar12, (i29 >> 6) & 3670016);
                        i36 = i411;
                        sVar = sVar12;
                        sVar.p(false);
                    } else {
                        i36 = i32;
                        y0Var3 = y0Var2;
                        sVar.d0(1550610620);
                        if (word.getWordType() == 4) {
                            sVar.d0(1551215740);
                            sb2 = new StringBuilder(16);
                            new ArrayList();
                            arrayList = new ArrayList();
                            new ArrayList();
                            if (z24) {
                                sb2.append(" ");
                            }
                            sb2.append(str2);
                            if (z24) {
                                sb2.append(" ");
                            }
                            String string118 = sb2.toString();
                            arrayList2 = new ArrayList(arrayList.size());
                            size = arrayList.size();
                            while (i37 < size) {
                                arrayList2.add(((j3.d) arrayList.get(i37)).a(sb2.length()));
                            }
                            j3.h hVar119 = new j3.h(string118, arrayList2);
                            j3.y0 y0VarA1110 = j3.y0.a(y0Var3, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                            y0Var4 = y0Var3;
                            if (fVar5 != null) {
                                rVarS = j0.e2.s(oVar, fVar5.f53489a);
                            } else {
                                rVarS = oVar;
                            }
                            ua.c(hVar119, rVarS, 0L, 0L, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, null, y0VarA1110, sVar, 0, 0, 130556);
                            z29 = false;
                            sVar.p(false);
                        } else {
                            sVar.d0(1551215740);
                            sb2 = new StringBuilder(16);
                            new ArrayList();
                            arrayList = new ArrayList();
                            new ArrayList();
                            if (z24) {
                                sb2.append(" ");
                            }
                            sb2.append(str2);
                            if (z24) {
                                sb2.append(" ");
                            }
                            String string119 = sb2.toString();
                            arrayList2 = new ArrayList(arrayList.size());
                            size = arrayList.size();
                            while (i37 < size) {
                                arrayList2.add(((j3.d) arrayList.get(i37)).a(sb2.length()));
                            }
                            j3.h hVar1110 = new j3.h(string119, arrayList2);
                            j3.y0 y0VarA1111 = j3.y0.a(y0Var3, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                            y0Var4 = y0Var3;
                            if (fVar5 != null) {
                                rVarS = j0.e2.s(oVar, fVar5.f53489a);
                            } else {
                                rVarS = oVar;
                            }
                            ua.c(hVar1110, rVarS, 0L, 0L, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, null, y0VarA1111, sVar, 0, 0, 130556);
                            z29 = false;
                            sVar.p(false);
                        }
                        sVar.p(z29);
                    }
                    if (str3.length() > 0) {
                        z30 = false;
                        sVar.d0(1542510382);
                    } else {
                        z30 = false;
                        sVar.d0(1542510382);
                    }
                    sVar.p(z30);
                    sVar.p(true);
                    fVar3 = fVar5;
                    rVar3 = rVar2;
                    z20 = z319;
                    z19 = z24;
                    z17 = z3110;
                    z21 = z27;
                    dVar2 = dVar3;
                    i31 = i36;
                } else {
                    sVar = sVar2;
                    sVar.W();
                    dVar2 = dVar;
                    z19 = z16;
                    rVar3 = rVar2;
                    z20 = z15;
                    fVar3 = fVar2;
                    z21 = z13;
                    i31 = i11;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: dt.e4
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            g4.b(word, textStyle, rVar3, z20, fVar3, z19, z21, z17, i31, dVar2, (l1.n) obj, l1.t.M(i12 | 1), i13);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i39 |= 24576;
            fVar2 = fVar;
            i18 = i13 & 32;
            if (i18 != 0) {
                i39 |= 196608;
                z16 = z12;
            } else {
                z16 = z12;
                if ((i12 & 196608) == 0) {
                    if (sVar2.g(z16)) {
                        i19 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i19 = 65536;
                    }
                    i39 |= i19;
                }
            }
            i21 = i13 & 64;
            if (i21 != 0) {
                i39 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (sVar2.g(z13)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i39 |= i22;
            }
            i23 = i13 & 128;
            if (i23 != 0) {
                i39 |= 12582912;
                z17 = z14;
            } else {
                z17 = z14;
                if ((i12 & 12582912) == 0) {
                    if (sVar2.g(z17)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i39 |= i24;
                }
            }
            i25 = i39;
            i26 = i13 & 256;
            if (i26 != 0) {
                if ((i12 & 100663296) == 0) {
                    if (sVar2.d(i11)) {
                        i27 = 67108864;
                    } else {
                        i27 = 33554432;
                    }
                    i25 |= i27;
                }
                i28 = i13 & 512;
                if (i28 != 0) {
                    i28 = i28;
                    i29 = i25 | 805306368;
                } else {
                    if ((i12 & 805306368) != 0) {
                        if (sVar2.f(dVar)) {
                            i30 = 536870912;
                        } else {
                            i30 = 268435456;
                        }
                        i25 |= i30;
                    }
                    i29 = i25;
                }
                if ((i29 & 306783379) != 306783378) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (sVar2.T(i29 & 1, z18)) {
                    oVar = z1.o.f58481a;
                    if (i40 != 0) {
                        rVar2 = oVar;
                    }
                    if (i14 != 0) {
                        z22 = false;
                    } else {
                        z22 = z15;
                    }
                    if (i16 != 0) {
                        fVar4 = null;
                    } else {
                        fVar4 = fVar2;
                    }
                    if (i18 != 0) {
                        z16 = false;
                    }
                    if (i21 != 0) {
                        z23 = true;
                    } else {
                        z23 = z13;
                    }
                    if (i23 != 0) {
                        z17 = false;
                    }
                    if (i26 != 0) {
                        i32 = 2;
                    } else {
                        i32 = i11;
                    }
                    if (i28 != 0) {
                        dVar3 = z1.c.P;
                    } else {
                        dVar3 = dVar;
                    }
                    i33 = ((ct.b) sVar2.j(ct.c.f22476a)).f22473h;
                    c3Var = ju.f.f37370d;
                    iIntValue = ((Number) sVar2.j(c3Var)).intValue();
                    boolean z3111 = z22;
                    v3.c cVar11 = (v3.c) sVar2.j(z2.g1.f58547h);
                    z24 = z16;
                    y0VarB = ct.c.b(sVar2);
                    boolean zF13 = sVar2.f(y0VarB);
                    boolean z3112 = z17;
                    if ((i29 & 112) == 32) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = zF13 | z25;
                    objQ = sVar2.Q();
                    l1.g gVar11 = l1.m.f39353a;
                    if (z26) {
                        objQ = j3.y0.a(y0VarB, 0L, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777215).d(textStyle);
                        sVar2.o0(objQ);
                    } else {
                        objQ = j3.y0.a(y0VarB, 0L, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777215).d(textStyle);
                        sVar2.o0(objQ);
                    }
                    y0Var = (j3.y0) objQ;
                    zF = sVar2.f(word) | sVar2.d(i33);
                    objQ2 = sVar2.Q();
                    if (zF) {
                        objQ2 = c(word, iIntValue, i33);
                        sVar2.o0(objQ2);
                    } else {
                        objQ2 = c(word, iIntValue, i33);
                        sVar2.o0(objQ2);
                    }
                    qy.r rVar14 = (qy.r) objQ2;
                    str = (String) rVar14.f48505a;
                    z27 = z23;
                    str2 = (String) rVar14.f48506b;
                    str3 = (String) rVar14.f48507c;
                    fD = ct.c.d(sVar2);
                    if (kotlin.jvm.internal.m.a(str, str2)) {
                        f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                    } else {
                        f5 = fD;
                    }
                    if (kotlin.jvm.internal.m.a(str3, str2)) {
                        f11 = CropImageView.DEFAULT_ASPECT_RATIO;
                    } else {
                        f11 = fD;
                    }
                    j3.w0 w0VarI11 = j3.t.i(sVar2);
                    zF2 = sVar2.f(y0Var) | sVar2.d(i33) | sVar2.d(iIntValue);
                    objQ3 = sVar2.Q();
                    if (zF2) {
                        if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(iIntValue))) {
                        }
                        i34 = 0;
                        objQ3 = Integer.valueOf(i34);
                        sVar2.o0(objQ3);
                    } else {
                        if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(iIntValue))) {
                        }
                        i34 = 0;
                        objQ3 = Integer.valueOf(i34);
                        sVar2.o0(objQ3);
                    }
                    int iIntValue12 = ((Number) objQ3).intValue();
                    if (ry.l.D(new Integer[]{51, 55}, Integer.valueOf(((Number) sVar2.j(c3Var)).intValue()))) {
                        i35 = 2;
                    } else {
                        i35 = -4;
                    }
                    z1.r rVarC111 = j0.c.C(rVar2, cVar11.Q(iIntValue12 / 2), CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    j0.b bVar11 = j0.i.f35303a;
                    j0.u uVarA11 = j0.t.a(j0.i.i(i35), dVar3, sVar2, (((i29 >> 21) & 896) >> 3) & 112);
                    iHashCode = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL11 = sVar2.l();
                    z1.r rVarC112 = z1.a.c(sVar2, rVarC111);
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA11, sVar2);
                    l1.t.J(y2.j.f56916e, q1VarL11, sVar2);
                    hVar = y2.j.f56918g;
                    if (sVar2.S) {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC112, sVar2);
                    if (str.length() > 0) {
                        sVar = sVar2;
                        str4 = str;
                        fVar5 = fVar4;
                        y0Var2 = y0Var;
                        z28 = false;
                        sVar.d0(1542510382);
                    } else {
                        sVar = sVar2;
                        str4 = str;
                        fVar5 = fVar4;
                        y0Var2 = y0Var;
                        z28 = false;
                        sVar.d0(1542510382);
                    }
                    sVar.p(z28);
                    if (z27) {
                        sVar.d0(1549618713);
                        sb3 = new StringBuilder(16);
                        new ArrayList();
                        arrayList3 = new ArrayList();
                        new ArrayList();
                        if (z24) {
                            sb3.append(" ");
                        }
                        sb3.append(str2);
                        if (z24) {
                            sb3.append(" ");
                        }
                        String string1110 = sb3.toString();
                        arrayList4 = new ArrayList(arrayList3.size());
                        size2 = arrayList3.size();
                        while (i38 < size2) {
                            arrayList4.add(((j3.d) arrayList3.get(i38)).a(sb3.length()));
                        }
                        j3.h hVar1111 = new j3.h(string1110, arrayList4);
                        j3.y0 y0VarA1112 = j3.y0.a(y0Var2, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                        y0Var4 = y0Var2;
                        if (fVar5 != null) {
                            rVarS2 = j0.e2.s(oVar, fVar5.f53489a);
                        } else {
                            rVarS2 = oVar;
                        }
                        long j119 = y0Var4.f35827a.f35755b;
                        fr.j3.i(j119);
                        l1.s sVar13 = sVar;
                        int i412 = i32;
                        iu.k.b(hVar1111, rVarS2, y0VarA1112, 0, false, i412, 0, new s0.g(fr.j3.L(j119 & 1095216660480L, (float) (((double) v3.o.c(j119)) * 0.6d)), j119, fr.j3.A(1)), sVar13, (i29 >> 6) & 3670016);
                        i36 = i412;
                        sVar = sVar13;
                        sVar.p(false);
                    } else {
                        i36 = i32;
                        y0Var3 = y0Var2;
                        sVar.d0(1550610620);
                        if (word.getWordType() == 4) {
                            sVar.d0(1551215740);
                            sb2 = new StringBuilder(16);
                            new ArrayList();
                            arrayList = new ArrayList();
                            new ArrayList();
                            if (z24) {
                                sb2.append(" ");
                            }
                            sb2.append(str2);
                            if (z24) {
                                sb2.append(" ");
                            }
                            String string1111 = sb2.toString();
                            arrayList2 = new ArrayList(arrayList.size());
                            size = arrayList.size();
                            while (i37 < size) {
                                arrayList2.add(((j3.d) arrayList.get(i37)).a(sb2.length()));
                            }
                            j3.h hVar1112 = new j3.h(string1111, arrayList2);
                            j3.y0 y0VarA1113 = j3.y0.a(y0Var3, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                            y0Var4 = y0Var3;
                            if (fVar5 != null) {
                                rVarS = j0.e2.s(oVar, fVar5.f53489a);
                            } else {
                                rVarS = oVar;
                            }
                            ua.c(hVar1112, rVarS, 0L, 0L, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, null, y0VarA1113, sVar, 0, 0, 130556);
                            z29 = false;
                            sVar.p(false);
                        } else {
                            sVar.d0(1551215740);
                            sb2 = new StringBuilder(16);
                            new ArrayList();
                            arrayList = new ArrayList();
                            new ArrayList();
                            if (z24) {
                                sb2.append(" ");
                            }
                            sb2.append(str2);
                            if (z24) {
                                sb2.append(" ");
                            }
                            String string1112 = sb2.toString();
                            arrayList2 = new ArrayList(arrayList.size());
                            size = arrayList.size();
                            while (i37 < size) {
                                arrayList2.add(((j3.d) arrayList.get(i37)).a(sb2.length()));
                            }
                            j3.h hVar1113 = new j3.h(string1112, arrayList2);
                            j3.y0 y0VarA1114 = j3.y0.a(y0Var3, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                            y0Var4 = y0Var3;
                            if (fVar5 != null) {
                                rVarS = j0.e2.s(oVar, fVar5.f53489a);
                            } else {
                                rVarS = oVar;
                            }
                            ua.c(hVar1113, rVarS, 0L, 0L, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, null, y0VarA1114, sVar, 0, 0, 130556);
                            z29 = false;
                            sVar.p(false);
                        }
                        sVar.p(z29);
                    }
                    if (str3.length() > 0) {
                        z30 = false;
                        sVar.d0(1542510382);
                    } else {
                        z30 = false;
                        sVar.d0(1542510382);
                    }
                    sVar.p(z30);
                    sVar.p(true);
                    fVar3 = fVar5;
                    rVar3 = rVar2;
                    z20 = z3111;
                    z19 = z24;
                    z17 = z3112;
                    z21 = z27;
                    dVar2 = dVar3;
                    i31 = i36;
                } else {
                    sVar = sVar2;
                    sVar.W();
                    dVar2 = dVar;
                    z19 = z16;
                    rVar3 = rVar2;
                    z20 = z15;
                    fVar3 = fVar2;
                    z21 = z13;
                    i31 = i11;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: dt.e4
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            g4.b(word, textStyle, rVar3, z20, fVar3, z19, z21, z17, i31, dVar2, (l1.n) obj, l1.t.M(i12 | 1), i13);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i25 |= 100663296;
            i28 = i13 & 512;
            if (i28 != 0) {
                i28 = i28;
                i29 = i25 | 805306368;
            } else {
                if ((i12 & 805306368) != 0) {
                    if (sVar2.f(dVar)) {
                        i30 = 536870912;
                    } else {
                        i30 = 268435456;
                    }
                    i25 |= i30;
                }
                i29 = i25;
            }
            if ((i29 & 306783379) != 306783378) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (sVar2.T(i29 & 1, z18)) {
                oVar = z1.o.f58481a;
                if (i40 != 0) {
                    rVar2 = oVar;
                }
                if (i14 != 0) {
                    z22 = false;
                } else {
                    z22 = z15;
                }
                if (i16 != 0) {
                    fVar4 = null;
                } else {
                    fVar4 = fVar2;
                }
                if (i18 != 0) {
                    z16 = false;
                }
                if (i21 != 0) {
                    z23 = true;
                } else {
                    z23 = z13;
                }
                if (i23 != 0) {
                    z17 = false;
                }
                if (i26 != 0) {
                    i32 = 2;
                } else {
                    i32 = i11;
                }
                if (i28 != 0) {
                    dVar3 = z1.c.P;
                } else {
                    dVar3 = dVar;
                }
                i33 = ((ct.b) sVar2.j(ct.c.f22476a)).f22473h;
                c3Var = ju.f.f37370d;
                iIntValue = ((Number) sVar2.j(c3Var)).intValue();
                boolean z3113 = z22;
                v3.c cVar12 = (v3.c) sVar2.j(z2.g1.f58547h);
                z24 = z16;
                y0VarB = ct.c.b(sVar2);
                boolean zF14 = sVar2.f(y0VarB);
                boolean z3114 = z17;
                if ((i29 & 112) == 32) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                z26 = zF14 | z25;
                objQ = sVar2.Q();
                l1.g gVar12 = l1.m.f39353a;
                if (z26) {
                    objQ = j3.y0.a(y0VarB, 0L, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777215).d(textStyle);
                    sVar2.o0(objQ);
                } else {
                    objQ = j3.y0.a(y0VarB, 0L, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777215).d(textStyle);
                    sVar2.o0(objQ);
                }
                y0Var = (j3.y0) objQ;
                zF = sVar2.f(word) | sVar2.d(i33);
                objQ2 = sVar2.Q();
                if (zF) {
                    objQ2 = c(word, iIntValue, i33);
                    sVar2.o0(objQ2);
                } else {
                    objQ2 = c(word, iIntValue, i33);
                    sVar2.o0(objQ2);
                }
                qy.r rVar15 = (qy.r) objQ2;
                str = (String) rVar15.f48505a;
                z27 = z23;
                str2 = (String) rVar15.f48506b;
                str3 = (String) rVar15.f48507c;
                fD = ct.c.d(sVar2);
                if (kotlin.jvm.internal.m.a(str, str2)) {
                    f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                } else {
                    f5 = fD;
                }
                if (kotlin.jvm.internal.m.a(str3, str2)) {
                    f11 = CropImageView.DEFAULT_ASPECT_RATIO;
                } else {
                    f11 = fD;
                }
                j3.w0 w0VarI12 = j3.t.i(sVar2);
                zF2 = sVar2.f(y0Var) | sVar2.d(i33) | sVar2.d(iIntValue);
                objQ3 = sVar2.Q();
                if (zF2) {
                    if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(iIntValue))) {
                    }
                    i34 = 0;
                    objQ3 = Integer.valueOf(i34);
                    sVar2.o0(objQ3);
                } else {
                    if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(iIntValue))) {
                    }
                    i34 = 0;
                    objQ3 = Integer.valueOf(i34);
                    sVar2.o0(objQ3);
                }
                int iIntValue13 = ((Number) objQ3).intValue();
                if (ry.l.D(new Integer[]{51, 55}, Integer.valueOf(((Number) sVar2.j(c3Var)).intValue()))) {
                    i35 = 2;
                } else {
                    i35 = -4;
                }
                z1.r rVarC113 = j0.c.C(rVar2, cVar12.Q(iIntValue13 / 2), CropImageView.DEFAULT_ASPECT_RATIO, 2);
                j0.b bVar12 = j0.i.f35303a;
                j0.u uVarA12 = j0.t.a(j0.i.i(i35), dVar3, sVar2, (((i29 >> 21) & 896) >> 3) & 112);
                iHashCode = Long.hashCode(sVar2.T);
                l1.q1 q1VarL12 = sVar2.l();
                z1.r rVarC114 = z1.a.c(sVar2, rVarC113);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                l1.t.J(y2.j.f56917f, uVarA12, sVar2);
                l1.t.J(y2.j.f56916e, q1VarL12, sVar2);
                hVar = y2.j.f56918g;
                if (sVar2.S) {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                } else {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC114, sVar2);
                if (str.length() > 0) {
                    sVar = sVar2;
                    str4 = str;
                    fVar5 = fVar4;
                    y0Var2 = y0Var;
                    z28 = false;
                    sVar.d0(1542510382);
                } else {
                    sVar = sVar2;
                    str4 = str;
                    fVar5 = fVar4;
                    y0Var2 = y0Var;
                    z28 = false;
                    sVar.d0(1542510382);
                }
                sVar.p(z28);
                if (z27) {
                    sVar.d0(1549618713);
                    sb3 = new StringBuilder(16);
                    new ArrayList();
                    arrayList3 = new ArrayList();
                    new ArrayList();
                    if (z24) {
                        sb3.append(" ");
                    }
                    sb3.append(str2);
                    if (z24) {
                        sb3.append(" ");
                    }
                    String string1113 = sb3.toString();
                    arrayList4 = new ArrayList(arrayList3.size());
                    size2 = arrayList3.size();
                    while (i38 < size2) {
                        arrayList4.add(((j3.d) arrayList3.get(i38)).a(sb3.length()));
                    }
                    j3.h hVar1114 = new j3.h(string1113, arrayList4);
                    j3.y0 y0VarA1115 = j3.y0.a(y0Var2, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                    y0Var4 = y0Var2;
                    if (fVar5 != null) {
                        rVarS2 = j0.e2.s(oVar, fVar5.f53489a);
                    } else {
                        rVarS2 = oVar;
                    }
                    long j1110 = y0Var4.f35827a.f35755b;
                    fr.j3.i(j1110);
                    l1.s sVar14 = sVar;
                    int i413 = i32;
                    iu.k.b(hVar1114, rVarS2, y0VarA1115, 0, false, i413, 0, new s0.g(fr.j3.L(j1110 & 1095216660480L, (float) (((double) v3.o.c(j1110)) * 0.6d)), j1110, fr.j3.A(1)), sVar14, (i29 >> 6) & 3670016);
                    i36 = i413;
                    sVar = sVar14;
                    sVar.p(false);
                } else {
                    i36 = i32;
                    y0Var3 = y0Var2;
                    sVar.d0(1550610620);
                    if (word.getWordType() == 4) {
                        sVar.d0(1551215740);
                        sb2 = new StringBuilder(16);
                        new ArrayList();
                        arrayList = new ArrayList();
                        new ArrayList();
                        if (z24) {
                            sb2.append(" ");
                        }
                        sb2.append(str2);
                        if (z24) {
                            sb2.append(" ");
                        }
                        String string1114 = sb2.toString();
                        arrayList2 = new ArrayList(arrayList.size());
                        size = arrayList.size();
                        while (i37 < size) {
                            arrayList2.add(((j3.d) arrayList.get(i37)).a(sb2.length()));
                        }
                        j3.h hVar1115 = new j3.h(string1114, arrayList2);
                        j3.y0 y0VarA1116 = j3.y0.a(y0Var3, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                        y0Var4 = y0Var3;
                        if (fVar5 != null) {
                            rVarS = j0.e2.s(oVar, fVar5.f53489a);
                        } else {
                            rVarS = oVar;
                        }
                        ua.c(hVar1115, rVarS, 0L, 0L, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, null, y0VarA1116, sVar, 0, 0, 130556);
                        z29 = false;
                        sVar.p(false);
                    } else {
                        sVar.d0(1551215740);
                        sb2 = new StringBuilder(16);
                        new ArrayList();
                        arrayList = new ArrayList();
                        new ArrayList();
                        if (z24) {
                            sb2.append(" ");
                        }
                        sb2.append(str2);
                        if (z24) {
                            sb2.append(" ");
                        }
                        String string1115 = sb2.toString();
                        arrayList2 = new ArrayList(arrayList.size());
                        size = arrayList.size();
                        while (i37 < size) {
                            arrayList2.add(((j3.d) arrayList.get(i37)).a(sb2.length()));
                        }
                        j3.h hVar1116 = new j3.h(string1115, arrayList2);
                        j3.y0 y0VarA1117 = j3.y0.a(y0Var3, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                        y0Var4 = y0Var3;
                        if (fVar5 != null) {
                            rVarS = j0.e2.s(oVar, fVar5.f53489a);
                        } else {
                            rVarS = oVar;
                        }
                        ua.c(hVar1116, rVarS, 0L, 0L, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, null, y0VarA1117, sVar, 0, 0, 130556);
                        z29 = false;
                        sVar.p(false);
                    }
                    sVar.p(z29);
                }
                if (str3.length() > 0) {
                    z30 = false;
                    sVar.d0(1542510382);
                } else {
                    z30 = false;
                    sVar.d0(1542510382);
                }
                sVar.p(z30);
                sVar.p(true);
                fVar3 = fVar5;
                rVar3 = rVar2;
                z20 = z3113;
                z19 = z24;
                z17 = z3114;
                z21 = z27;
                dVar2 = dVar3;
                i31 = i36;
            } else {
                sVar = sVar2;
                sVar.W();
                dVar2 = dVar;
                z19 = z16;
                rVar3 = rVar2;
                z20 = z15;
                fVar3 = fVar2;
                z21 = z13;
                i31 = i11;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: dt.e4
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        g4.b(word, textStyle, rVar3, z20, fVar3, z19, z21, z17, i31, dVar2, (l1.n) obj, l1.t.M(i12 | 1), i13);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i39 |= 3072;
        z15 = z11;
        i16 = i13 & 16;
        if (i16 != 0) {
            if ((i12 & 24576) == 0) {
                fVar2 = fVar;
                if (sVar2.f(fVar2)) {
                    i17 = 16384;
                } else {
                    i17 = OSSConstants.DEFAULT_BUFFER_SIZE;
                }
                i39 |= i17;
            }
            i18 = i13 & 32;
            if (i18 != 0) {
                i39 |= 196608;
                z16 = z12;
            } else {
                z16 = z12;
                if ((i12 & 196608) == 0) {
                    if (sVar2.g(z16)) {
                        i19 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i19 = 65536;
                    }
                    i39 |= i19;
                }
            }
            i21 = i13 & 64;
            if (i21 != 0) {
                i39 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (sVar2.g(z13)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i39 |= i22;
            }
            i23 = i13 & 128;
            if (i23 != 0) {
                i39 |= 12582912;
                z17 = z14;
            } else {
                z17 = z14;
                if ((i12 & 12582912) == 0) {
                    if (sVar2.g(z17)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i39 |= i24;
                }
            }
            i25 = i39;
            i26 = i13 & 256;
            if (i26 != 0) {
                if ((i12 & 100663296) == 0) {
                    if (sVar2.d(i11)) {
                        i27 = 67108864;
                    } else {
                        i27 = 33554432;
                    }
                    i25 |= i27;
                }
                i28 = i13 & 512;
                if (i28 != 0) {
                    i28 = i28;
                    i29 = i25 | 805306368;
                } else {
                    if ((i12 & 805306368) != 0) {
                        if (sVar2.f(dVar)) {
                            i30 = 536870912;
                        } else {
                            i30 = 268435456;
                        }
                        i25 |= i30;
                    }
                    i29 = i25;
                }
                if ((i29 & 306783379) != 306783378) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (sVar2.T(i29 & 1, z18)) {
                    oVar = z1.o.f58481a;
                    if (i40 != 0) {
                        rVar2 = oVar;
                    }
                    if (i14 != 0) {
                        z22 = false;
                    } else {
                        z22 = z15;
                    }
                    if (i16 != 0) {
                        fVar4 = null;
                    } else {
                        fVar4 = fVar2;
                    }
                    if (i18 != 0) {
                        z16 = false;
                    }
                    if (i21 != 0) {
                        z23 = true;
                    } else {
                        z23 = z13;
                    }
                    if (i23 != 0) {
                        z17 = false;
                    }
                    if (i26 != 0) {
                        i32 = 2;
                    } else {
                        i32 = i11;
                    }
                    if (i28 != 0) {
                        dVar3 = z1.c.P;
                    } else {
                        dVar3 = dVar;
                    }
                    i33 = ((ct.b) sVar2.j(ct.c.f22476a)).f22473h;
                    c3Var = ju.f.f37370d;
                    iIntValue = ((Number) sVar2.j(c3Var)).intValue();
                    boolean z3115 = z22;
                    v3.c cVar13 = (v3.c) sVar2.j(z2.g1.f58547h);
                    z24 = z16;
                    y0VarB = ct.c.b(sVar2);
                    boolean zF15 = sVar2.f(y0VarB);
                    boolean z3116 = z17;
                    if ((i29 & 112) == 32) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = zF15 | z25;
                    objQ = sVar2.Q();
                    l1.g gVar13 = l1.m.f39353a;
                    if (z26) {
                        objQ = j3.y0.a(y0VarB, 0L, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777215).d(textStyle);
                        sVar2.o0(objQ);
                    } else {
                        objQ = j3.y0.a(y0VarB, 0L, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777215).d(textStyle);
                        sVar2.o0(objQ);
                    }
                    y0Var = (j3.y0) objQ;
                    zF = sVar2.f(word) | sVar2.d(i33);
                    objQ2 = sVar2.Q();
                    if (zF) {
                        objQ2 = c(word, iIntValue, i33);
                        sVar2.o0(objQ2);
                    } else {
                        objQ2 = c(word, iIntValue, i33);
                        sVar2.o0(objQ2);
                    }
                    qy.r rVar16 = (qy.r) objQ2;
                    str = (String) rVar16.f48505a;
                    z27 = z23;
                    str2 = (String) rVar16.f48506b;
                    str3 = (String) rVar16.f48507c;
                    fD = ct.c.d(sVar2);
                    if (kotlin.jvm.internal.m.a(str, str2)) {
                        f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                    } else {
                        f5 = fD;
                    }
                    if (kotlin.jvm.internal.m.a(str3, str2)) {
                        f11 = CropImageView.DEFAULT_ASPECT_RATIO;
                    } else {
                        f11 = fD;
                    }
                    j3.w0 w0VarI13 = j3.t.i(sVar2);
                    zF2 = sVar2.f(y0Var) | sVar2.d(i33) | sVar2.d(iIntValue);
                    objQ3 = sVar2.Q();
                    if (zF2) {
                        if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(iIntValue))) {
                        }
                        i34 = 0;
                        objQ3 = Integer.valueOf(i34);
                        sVar2.o0(objQ3);
                    } else {
                        if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(iIntValue))) {
                        }
                        i34 = 0;
                        objQ3 = Integer.valueOf(i34);
                        sVar2.o0(objQ3);
                    }
                    int iIntValue14 = ((Number) objQ3).intValue();
                    if (ry.l.D(new Integer[]{51, 55}, Integer.valueOf(((Number) sVar2.j(c3Var)).intValue()))) {
                        i35 = 2;
                    } else {
                        i35 = -4;
                    }
                    z1.r rVarC115 = j0.c.C(rVar2, cVar13.Q(iIntValue14 / 2), CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    j0.b bVar13 = j0.i.f35303a;
                    j0.u uVarA13 = j0.t.a(j0.i.i(i35), dVar3, sVar2, (((i29 >> 21) & 896) >> 3) & 112);
                    iHashCode = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL13 = sVar2.l();
                    z1.r rVarC116 = z1.a.c(sVar2, rVarC115);
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA13, sVar2);
                    l1.t.J(y2.j.f56916e, q1VarL13, sVar2);
                    hVar = y2.j.f56918g;
                    if (sVar2.S) {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC116, sVar2);
                    if (str.length() > 0) {
                        sVar = sVar2;
                        str4 = str;
                        fVar5 = fVar4;
                        y0Var2 = y0Var;
                        z28 = false;
                        sVar.d0(1542510382);
                    } else {
                        sVar = sVar2;
                        str4 = str;
                        fVar5 = fVar4;
                        y0Var2 = y0Var;
                        z28 = false;
                        sVar.d0(1542510382);
                    }
                    sVar.p(z28);
                    if (z27) {
                        sVar.d0(1549618713);
                        sb3 = new StringBuilder(16);
                        new ArrayList();
                        arrayList3 = new ArrayList();
                        new ArrayList();
                        if (z24) {
                            sb3.append(" ");
                        }
                        sb3.append(str2);
                        if (z24) {
                            sb3.append(" ");
                        }
                        String string1116 = sb3.toString();
                        arrayList4 = new ArrayList(arrayList3.size());
                        size2 = arrayList3.size();
                        while (i38 < size2) {
                            arrayList4.add(((j3.d) arrayList3.get(i38)).a(sb3.length()));
                        }
                        j3.h hVar1117 = new j3.h(string1116, arrayList4);
                        j3.y0 y0VarA1118 = j3.y0.a(y0Var2, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                        y0Var4 = y0Var2;
                        if (fVar5 != null) {
                            rVarS2 = j0.e2.s(oVar, fVar5.f53489a);
                        } else {
                            rVarS2 = oVar;
                        }
                        long j1111 = y0Var4.f35827a.f35755b;
                        fr.j3.i(j1111);
                        l1.s sVar15 = sVar;
                        int i414 = i32;
                        iu.k.b(hVar1117, rVarS2, y0VarA1118, 0, false, i414, 0, new s0.g(fr.j3.L(j1111 & 1095216660480L, (float) (((double) v3.o.c(j1111)) * 0.6d)), j1111, fr.j3.A(1)), sVar15, (i29 >> 6) & 3670016);
                        i36 = i414;
                        sVar = sVar15;
                        sVar.p(false);
                    } else {
                        i36 = i32;
                        y0Var3 = y0Var2;
                        sVar.d0(1550610620);
                        if (word.getWordType() == 4) {
                            sVar.d0(1551215740);
                            sb2 = new StringBuilder(16);
                            new ArrayList();
                            arrayList = new ArrayList();
                            new ArrayList();
                            if (z24) {
                                sb2.append(" ");
                            }
                            sb2.append(str2);
                            if (z24) {
                                sb2.append(" ");
                            }
                            String string1117 = sb2.toString();
                            arrayList2 = new ArrayList(arrayList.size());
                            size = arrayList.size();
                            while (i37 < size) {
                                arrayList2.add(((j3.d) arrayList.get(i37)).a(sb2.length()));
                            }
                            j3.h hVar1118 = new j3.h(string1117, arrayList2);
                            j3.y0 y0VarA1119 = j3.y0.a(y0Var3, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                            y0Var4 = y0Var3;
                            if (fVar5 != null) {
                                rVarS = j0.e2.s(oVar, fVar5.f53489a);
                            } else {
                                rVarS = oVar;
                            }
                            ua.c(hVar1118, rVarS, 0L, 0L, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, null, y0VarA1119, sVar, 0, 0, 130556);
                            z29 = false;
                            sVar.p(false);
                        } else {
                            sVar.d0(1551215740);
                            sb2 = new StringBuilder(16);
                            new ArrayList();
                            arrayList = new ArrayList();
                            new ArrayList();
                            if (z24) {
                                sb2.append(" ");
                            }
                            sb2.append(str2);
                            if (z24) {
                                sb2.append(" ");
                            }
                            String string1118 = sb2.toString();
                            arrayList2 = new ArrayList(arrayList.size());
                            size = arrayList.size();
                            while (i37 < size) {
                                arrayList2.add(((j3.d) arrayList.get(i37)).a(sb2.length()));
                            }
                            j3.h hVar1119 = new j3.h(string1118, arrayList2);
                            j3.y0 y0VarA11110 = j3.y0.a(y0Var3, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                            y0Var4 = y0Var3;
                            if (fVar5 != null) {
                                rVarS = j0.e2.s(oVar, fVar5.f53489a);
                            } else {
                                rVarS = oVar;
                            }
                            ua.c(hVar1119, rVarS, 0L, 0L, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, null, y0VarA11110, sVar, 0, 0, 130556);
                            z29 = false;
                            sVar.p(false);
                        }
                        sVar.p(z29);
                    }
                    if (str3.length() > 0) {
                        z30 = false;
                        sVar.d0(1542510382);
                    } else {
                        z30 = false;
                        sVar.d0(1542510382);
                    }
                    sVar.p(z30);
                    sVar.p(true);
                    fVar3 = fVar5;
                    rVar3 = rVar2;
                    z20 = z3115;
                    z19 = z24;
                    z17 = z3116;
                    z21 = z27;
                    dVar2 = dVar3;
                    i31 = i36;
                } else {
                    sVar = sVar2;
                    sVar.W();
                    dVar2 = dVar;
                    z19 = z16;
                    rVar3 = rVar2;
                    z20 = z15;
                    fVar3 = fVar2;
                    z21 = z13;
                    i31 = i11;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: dt.e4
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            g4.b(word, textStyle, rVar3, z20, fVar3, z19, z21, z17, i31, dVar2, (l1.n) obj, l1.t.M(i12 | 1), i13);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i25 |= 100663296;
            i28 = i13 & 512;
            if (i28 != 0) {
                i28 = i28;
                i29 = i25 | 805306368;
            } else {
                if ((i12 & 805306368) != 0) {
                    if (sVar2.f(dVar)) {
                        i30 = 536870912;
                    } else {
                        i30 = 268435456;
                    }
                    i25 |= i30;
                }
                i29 = i25;
            }
            if ((i29 & 306783379) != 306783378) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (sVar2.T(i29 & 1, z18)) {
                oVar = z1.o.f58481a;
                if (i40 != 0) {
                    rVar2 = oVar;
                }
                if (i14 != 0) {
                    z22 = false;
                } else {
                    z22 = z15;
                }
                if (i16 != 0) {
                    fVar4 = null;
                } else {
                    fVar4 = fVar2;
                }
                if (i18 != 0) {
                    z16 = false;
                }
                if (i21 != 0) {
                    z23 = true;
                } else {
                    z23 = z13;
                }
                if (i23 != 0) {
                    z17 = false;
                }
                if (i26 != 0) {
                    i32 = 2;
                } else {
                    i32 = i11;
                }
                if (i28 != 0) {
                    dVar3 = z1.c.P;
                } else {
                    dVar3 = dVar;
                }
                i33 = ((ct.b) sVar2.j(ct.c.f22476a)).f22473h;
                c3Var = ju.f.f37370d;
                iIntValue = ((Number) sVar2.j(c3Var)).intValue();
                boolean z3117 = z22;
                v3.c cVar14 = (v3.c) sVar2.j(z2.g1.f58547h);
                z24 = z16;
                y0VarB = ct.c.b(sVar2);
                boolean zF16 = sVar2.f(y0VarB);
                boolean z3118 = z17;
                if ((i29 & 112) == 32) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                z26 = zF16 | z25;
                objQ = sVar2.Q();
                l1.g gVar14 = l1.m.f39353a;
                if (z26) {
                    objQ = j3.y0.a(y0VarB, 0L, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777215).d(textStyle);
                    sVar2.o0(objQ);
                } else {
                    objQ = j3.y0.a(y0VarB, 0L, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777215).d(textStyle);
                    sVar2.o0(objQ);
                }
                y0Var = (j3.y0) objQ;
                zF = sVar2.f(word) | sVar2.d(i33);
                objQ2 = sVar2.Q();
                if (zF) {
                    objQ2 = c(word, iIntValue, i33);
                    sVar2.o0(objQ2);
                } else {
                    objQ2 = c(word, iIntValue, i33);
                    sVar2.o0(objQ2);
                }
                qy.r rVar17 = (qy.r) objQ2;
                str = (String) rVar17.f48505a;
                z27 = z23;
                str2 = (String) rVar17.f48506b;
                str3 = (String) rVar17.f48507c;
                fD = ct.c.d(sVar2);
                if (kotlin.jvm.internal.m.a(str, str2)) {
                    f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                } else {
                    f5 = fD;
                }
                if (kotlin.jvm.internal.m.a(str3, str2)) {
                    f11 = CropImageView.DEFAULT_ASPECT_RATIO;
                } else {
                    f11 = fD;
                }
                j3.w0 w0VarI14 = j3.t.i(sVar2);
                zF2 = sVar2.f(y0Var) | sVar2.d(i33) | sVar2.d(iIntValue);
                objQ3 = sVar2.Q();
                if (zF2) {
                    if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(iIntValue))) {
                    }
                    i34 = 0;
                    objQ3 = Integer.valueOf(i34);
                    sVar2.o0(objQ3);
                } else {
                    if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(iIntValue))) {
                    }
                    i34 = 0;
                    objQ3 = Integer.valueOf(i34);
                    sVar2.o0(objQ3);
                }
                int iIntValue15 = ((Number) objQ3).intValue();
                if (ry.l.D(new Integer[]{51, 55}, Integer.valueOf(((Number) sVar2.j(c3Var)).intValue()))) {
                    i35 = 2;
                } else {
                    i35 = -4;
                }
                z1.r rVarC117 = j0.c.C(rVar2, cVar14.Q(iIntValue15 / 2), CropImageView.DEFAULT_ASPECT_RATIO, 2);
                j0.b bVar14 = j0.i.f35303a;
                j0.u uVarA14 = j0.t.a(j0.i.i(i35), dVar3, sVar2, (((i29 >> 21) & 896) >> 3) & 112);
                iHashCode = Long.hashCode(sVar2.T);
                l1.q1 q1VarL14 = sVar2.l();
                z1.r rVarC118 = z1.a.c(sVar2, rVarC117);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                l1.t.J(y2.j.f56917f, uVarA14, sVar2);
                l1.t.J(y2.j.f56916e, q1VarL14, sVar2);
                hVar = y2.j.f56918g;
                if (sVar2.S) {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                } else {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC118, sVar2);
                if (str.length() > 0) {
                    sVar = sVar2;
                    str4 = str;
                    fVar5 = fVar4;
                    y0Var2 = y0Var;
                    z28 = false;
                    sVar.d0(1542510382);
                } else {
                    sVar = sVar2;
                    str4 = str;
                    fVar5 = fVar4;
                    y0Var2 = y0Var;
                    z28 = false;
                    sVar.d0(1542510382);
                }
                sVar.p(z28);
                if (z27) {
                    sVar.d0(1549618713);
                    sb3 = new StringBuilder(16);
                    new ArrayList();
                    arrayList3 = new ArrayList();
                    new ArrayList();
                    if (z24) {
                        sb3.append(" ");
                    }
                    sb3.append(str2);
                    if (z24) {
                        sb3.append(" ");
                    }
                    String string1119 = sb3.toString();
                    arrayList4 = new ArrayList(arrayList3.size());
                    size2 = arrayList3.size();
                    while (i38 < size2) {
                        arrayList4.add(((j3.d) arrayList3.get(i38)).a(sb3.length()));
                    }
                    j3.h hVar11110 = new j3.h(string1119, arrayList4);
                    j3.y0 y0VarA11111 = j3.y0.a(y0Var2, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                    y0Var4 = y0Var2;
                    if (fVar5 != null) {
                        rVarS2 = j0.e2.s(oVar, fVar5.f53489a);
                    } else {
                        rVarS2 = oVar;
                    }
                    long j1112 = y0Var4.f35827a.f35755b;
                    fr.j3.i(j1112);
                    l1.s sVar16 = sVar;
                    int i415 = i32;
                    iu.k.b(hVar11110, rVarS2, y0VarA11111, 0, false, i415, 0, new s0.g(fr.j3.L(j1112 & 1095216660480L, (float) (((double) v3.o.c(j1112)) * 0.6d)), j1112, fr.j3.A(1)), sVar16, (i29 >> 6) & 3670016);
                    i36 = i415;
                    sVar = sVar16;
                    sVar.p(false);
                } else {
                    i36 = i32;
                    y0Var3 = y0Var2;
                    sVar.d0(1550610620);
                    if (word.getWordType() == 4) {
                        sVar.d0(1551215740);
                        sb2 = new StringBuilder(16);
                        new ArrayList();
                        arrayList = new ArrayList();
                        new ArrayList();
                        if (z24) {
                            sb2.append(" ");
                        }
                        sb2.append(str2);
                        if (z24) {
                            sb2.append(" ");
                        }
                        String string11110 = sb2.toString();
                        arrayList2 = new ArrayList(arrayList.size());
                        size = arrayList.size();
                        while (i37 < size) {
                            arrayList2.add(((j3.d) arrayList.get(i37)).a(sb2.length()));
                        }
                        j3.h hVar11111 = new j3.h(string11110, arrayList2);
                        j3.y0 y0VarA11112 = j3.y0.a(y0Var3, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                        y0Var4 = y0Var3;
                        if (fVar5 != null) {
                            rVarS = j0.e2.s(oVar, fVar5.f53489a);
                        } else {
                            rVarS = oVar;
                        }
                        ua.c(hVar11111, rVarS, 0L, 0L, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, null, y0VarA11112, sVar, 0, 0, 130556);
                        z29 = false;
                        sVar.p(false);
                    } else {
                        sVar.d0(1551215740);
                        sb2 = new StringBuilder(16);
                        new ArrayList();
                        arrayList = new ArrayList();
                        new ArrayList();
                        if (z24) {
                            sb2.append(" ");
                        }
                        sb2.append(str2);
                        if (z24) {
                            sb2.append(" ");
                        }
                        String string11111 = sb2.toString();
                        arrayList2 = new ArrayList(arrayList.size());
                        size = arrayList.size();
                        while (i37 < size) {
                            arrayList2.add(((j3.d) arrayList.get(i37)).a(sb2.length()));
                        }
                        j3.h hVar11112 = new j3.h(string11111, arrayList2);
                        j3.y0 y0VarA11113 = j3.y0.a(y0Var3, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                        y0Var4 = y0Var3;
                        if (fVar5 != null) {
                            rVarS = j0.e2.s(oVar, fVar5.f53489a);
                        } else {
                            rVarS = oVar;
                        }
                        ua.c(hVar11112, rVarS, 0L, 0L, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, null, y0VarA11113, sVar, 0, 0, 130556);
                        z29 = false;
                        sVar.p(false);
                    }
                    sVar.p(z29);
                }
                if (str3.length() > 0) {
                    z30 = false;
                    sVar.d0(1542510382);
                } else {
                    z30 = false;
                    sVar.d0(1542510382);
                }
                sVar.p(z30);
                sVar.p(true);
                fVar3 = fVar5;
                rVar3 = rVar2;
                z20 = z3117;
                z19 = z24;
                z17 = z3118;
                z21 = z27;
                dVar2 = dVar3;
                i31 = i36;
            } else {
                sVar = sVar2;
                sVar.W();
                dVar2 = dVar;
                z19 = z16;
                rVar3 = rVar2;
                z20 = z15;
                fVar3 = fVar2;
                z21 = z13;
                i31 = i11;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: dt.e4
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        g4.b(word, textStyle, rVar3, z20, fVar3, z19, z21, z17, i31, dVar2, (l1.n) obj, l1.t.M(i12 | 1), i13);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i39 |= 24576;
        fVar2 = fVar;
        i18 = i13 & 32;
        if (i18 != 0) {
            i39 |= 196608;
            z16 = z12;
        } else {
            z16 = z12;
            if ((i12 & 196608) == 0) {
                if (sVar2.g(z16)) {
                    i19 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                } else {
                    i19 = 65536;
                }
                i39 |= i19;
            }
        }
        i21 = i13 & 64;
        if (i21 != 0) {
            i39 |= 1572864;
        } else if ((i12 & 1572864) == 0) {
            if (sVar2.g(z13)) {
                i22 = 1048576;
            } else {
                i22 = 524288;
            }
            i39 |= i22;
        }
        i23 = i13 & 128;
        if (i23 != 0) {
            i39 |= 12582912;
            z17 = z14;
        } else {
            z17 = z14;
            if ((i12 & 12582912) == 0) {
                if (sVar2.g(z17)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i39 |= i24;
            }
        }
        i25 = i39;
        i26 = i13 & 256;
        if (i26 != 0) {
            if ((i12 & 100663296) == 0) {
                if (sVar2.d(i11)) {
                    i27 = 67108864;
                } else {
                    i27 = 33554432;
                }
                i25 |= i27;
            }
            i28 = i13 & 512;
            if (i28 != 0) {
                i28 = i28;
                i29 = i25 | 805306368;
            } else {
                if ((i12 & 805306368) != 0) {
                    if (sVar2.f(dVar)) {
                        i30 = 536870912;
                    } else {
                        i30 = 268435456;
                    }
                    i25 |= i30;
                }
                i29 = i25;
            }
            if ((i29 & 306783379) != 306783378) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (sVar2.T(i29 & 1, z18)) {
                oVar = z1.o.f58481a;
                if (i40 != 0) {
                    rVar2 = oVar;
                }
                if (i14 != 0) {
                    z22 = false;
                } else {
                    z22 = z15;
                }
                if (i16 != 0) {
                    fVar4 = null;
                } else {
                    fVar4 = fVar2;
                }
                if (i18 != 0) {
                    z16 = false;
                }
                if (i21 != 0) {
                    z23 = true;
                } else {
                    z23 = z13;
                }
                if (i23 != 0) {
                    z17 = false;
                }
                if (i26 != 0) {
                    i32 = 2;
                } else {
                    i32 = i11;
                }
                if (i28 != 0) {
                    dVar3 = z1.c.P;
                } else {
                    dVar3 = dVar;
                }
                i33 = ((ct.b) sVar2.j(ct.c.f22476a)).f22473h;
                c3Var = ju.f.f37370d;
                iIntValue = ((Number) sVar2.j(c3Var)).intValue();
                boolean z3119 = z22;
                v3.c cVar15 = (v3.c) sVar2.j(z2.g1.f58547h);
                z24 = z16;
                y0VarB = ct.c.b(sVar2);
                boolean zF17 = sVar2.f(y0VarB);
                boolean z31110 = z17;
                if ((i29 & 112) == 32) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                z26 = zF17 | z25;
                objQ = sVar2.Q();
                l1.g gVar15 = l1.m.f39353a;
                if (z26) {
                    objQ = j3.y0.a(y0VarB, 0L, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777215).d(textStyle);
                    sVar2.o0(objQ);
                } else {
                    objQ = j3.y0.a(y0VarB, 0L, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777215).d(textStyle);
                    sVar2.o0(objQ);
                }
                y0Var = (j3.y0) objQ;
                zF = sVar2.f(word) | sVar2.d(i33);
                objQ2 = sVar2.Q();
                if (zF) {
                    objQ2 = c(word, iIntValue, i33);
                    sVar2.o0(objQ2);
                } else {
                    objQ2 = c(word, iIntValue, i33);
                    sVar2.o0(objQ2);
                }
                qy.r rVar18 = (qy.r) objQ2;
                str = (String) rVar18.f48505a;
                z27 = z23;
                str2 = (String) rVar18.f48506b;
                str3 = (String) rVar18.f48507c;
                fD = ct.c.d(sVar2);
                if (kotlin.jvm.internal.m.a(str, str2)) {
                    f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                } else {
                    f5 = fD;
                }
                if (kotlin.jvm.internal.m.a(str3, str2)) {
                    f11 = CropImageView.DEFAULT_ASPECT_RATIO;
                } else {
                    f11 = fD;
                }
                j3.w0 w0VarI15 = j3.t.i(sVar2);
                zF2 = sVar2.f(y0Var) | sVar2.d(i33) | sVar2.d(iIntValue);
                objQ3 = sVar2.Q();
                if (zF2) {
                    if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(iIntValue))) {
                    }
                    i34 = 0;
                    objQ3 = Integer.valueOf(i34);
                    sVar2.o0(objQ3);
                } else {
                    if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(iIntValue))) {
                    }
                    i34 = 0;
                    objQ3 = Integer.valueOf(i34);
                    sVar2.o0(objQ3);
                }
                int iIntValue16 = ((Number) objQ3).intValue();
                if (ry.l.D(new Integer[]{51, 55}, Integer.valueOf(((Number) sVar2.j(c3Var)).intValue()))) {
                    i35 = 2;
                } else {
                    i35 = -4;
                }
                z1.r rVarC119 = j0.c.C(rVar2, cVar15.Q(iIntValue16 / 2), CropImageView.DEFAULT_ASPECT_RATIO, 2);
                j0.b bVar15 = j0.i.f35303a;
                j0.u uVarA15 = j0.t.a(j0.i.i(i35), dVar3, sVar2, (((i29 >> 21) & 896) >> 3) & 112);
                iHashCode = Long.hashCode(sVar2.T);
                l1.q1 q1VarL15 = sVar2.l();
                z1.r rVarC1110 = z1.a.c(sVar2, rVarC119);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                l1.t.J(y2.j.f56917f, uVarA15, sVar2);
                l1.t.J(y2.j.f56916e, q1VarL15, sVar2);
                hVar = y2.j.f56918g;
                if (sVar2.S) {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                } else {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC1110, sVar2);
                if (str.length() > 0) {
                    sVar = sVar2;
                    str4 = str;
                    fVar5 = fVar4;
                    y0Var2 = y0Var;
                    z28 = false;
                    sVar.d0(1542510382);
                } else {
                    sVar = sVar2;
                    str4 = str;
                    fVar5 = fVar4;
                    y0Var2 = y0Var;
                    z28 = false;
                    sVar.d0(1542510382);
                }
                sVar.p(z28);
                if (z27) {
                    sVar.d0(1549618713);
                    sb3 = new StringBuilder(16);
                    new ArrayList();
                    arrayList3 = new ArrayList();
                    new ArrayList();
                    if (z24) {
                        sb3.append(" ");
                    }
                    sb3.append(str2);
                    if (z24) {
                        sb3.append(" ");
                    }
                    String string11112 = sb3.toString();
                    arrayList4 = new ArrayList(arrayList3.size());
                    size2 = arrayList3.size();
                    while (i38 < size2) {
                        arrayList4.add(((j3.d) arrayList3.get(i38)).a(sb3.length()));
                    }
                    j3.h hVar11113 = new j3.h(string11112, arrayList4);
                    j3.y0 y0VarA11114 = j3.y0.a(y0Var2, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                    y0Var4 = y0Var2;
                    if (fVar5 != null) {
                        rVarS2 = j0.e2.s(oVar, fVar5.f53489a);
                    } else {
                        rVarS2 = oVar;
                    }
                    long j1113 = y0Var4.f35827a.f35755b;
                    fr.j3.i(j1113);
                    l1.s sVar17 = sVar;
                    int i416 = i32;
                    iu.k.b(hVar11113, rVarS2, y0VarA11114, 0, false, i416, 0, new s0.g(fr.j3.L(j1113 & 1095216660480L, (float) (((double) v3.o.c(j1113)) * 0.6d)), j1113, fr.j3.A(1)), sVar17, (i29 >> 6) & 3670016);
                    i36 = i416;
                    sVar = sVar17;
                    sVar.p(false);
                } else {
                    i36 = i32;
                    y0Var3 = y0Var2;
                    sVar.d0(1550610620);
                    if (word.getWordType() == 4) {
                        sVar.d0(1551215740);
                        sb2 = new StringBuilder(16);
                        new ArrayList();
                        arrayList = new ArrayList();
                        new ArrayList();
                        if (z24) {
                            sb2.append(" ");
                        }
                        sb2.append(str2);
                        if (z24) {
                            sb2.append(" ");
                        }
                        String string11113 = sb2.toString();
                        arrayList2 = new ArrayList(arrayList.size());
                        size = arrayList.size();
                        while (i37 < size) {
                            arrayList2.add(((j3.d) arrayList.get(i37)).a(sb2.length()));
                        }
                        j3.h hVar11114 = new j3.h(string11113, arrayList2);
                        j3.y0 y0VarA11115 = j3.y0.a(y0Var3, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                        y0Var4 = y0Var3;
                        if (fVar5 != null) {
                            rVarS = j0.e2.s(oVar, fVar5.f53489a);
                        } else {
                            rVarS = oVar;
                        }
                        ua.c(hVar11114, rVarS, 0L, 0L, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, null, y0VarA11115, sVar, 0, 0, 130556);
                        z29 = false;
                        sVar.p(false);
                    } else {
                        sVar.d0(1551215740);
                        sb2 = new StringBuilder(16);
                        new ArrayList();
                        arrayList = new ArrayList();
                        new ArrayList();
                        if (z24) {
                            sb2.append(" ");
                        }
                        sb2.append(str2);
                        if (z24) {
                            sb2.append(" ");
                        }
                        String string11114 = sb2.toString();
                        arrayList2 = new ArrayList(arrayList.size());
                        size = arrayList.size();
                        while (i37 < size) {
                            arrayList2.add(((j3.d) arrayList.get(i37)).a(sb2.length()));
                        }
                        j3.h hVar11115 = new j3.h(string11114, arrayList2);
                        j3.y0 y0VarA11116 = j3.y0.a(y0Var3, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                        y0Var4 = y0Var3;
                        if (fVar5 != null) {
                            rVarS = j0.e2.s(oVar, fVar5.f53489a);
                        } else {
                            rVarS = oVar;
                        }
                        ua.c(hVar11115, rVarS, 0L, 0L, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, null, y0VarA11116, sVar, 0, 0, 130556);
                        z29 = false;
                        sVar.p(false);
                    }
                    sVar.p(z29);
                }
                if (str3.length() > 0) {
                    z30 = false;
                    sVar.d0(1542510382);
                } else {
                    z30 = false;
                    sVar.d0(1542510382);
                }
                sVar.p(z30);
                sVar.p(true);
                fVar3 = fVar5;
                rVar3 = rVar2;
                z20 = z3119;
                z19 = z24;
                z17 = z31110;
                z21 = z27;
                dVar2 = dVar3;
                i31 = i36;
            } else {
                sVar = sVar2;
                sVar.W();
                dVar2 = dVar;
                z19 = z16;
                rVar3 = rVar2;
                z20 = z15;
                fVar3 = fVar2;
                z21 = z13;
                i31 = i11;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: dt.e4
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        g4.b(word, textStyle, rVar3, z20, fVar3, z19, z21, z17, i31, dVar2, (l1.n) obj, l1.t.M(i12 | 1), i13);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i25 |= 100663296;
        i28 = i13 & 512;
        if (i28 != 0) {
            i28 = i28;
            i29 = i25 | 805306368;
        } else {
            if ((i12 & 805306368) != 0) {
                if (sVar2.f(dVar)) {
                    i30 = 536870912;
                } else {
                    i30 = 268435456;
                }
                i25 |= i30;
            }
            i29 = i25;
        }
        if ((i29 & 306783379) != 306783378) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (sVar2.T(i29 & 1, z18)) {
            oVar = z1.o.f58481a;
            if (i40 != 0) {
                rVar2 = oVar;
            }
            if (i14 != 0) {
                z22 = false;
            } else {
                z22 = z15;
            }
            if (i16 != 0) {
                fVar4 = null;
            } else {
                fVar4 = fVar2;
            }
            if (i18 != 0) {
                z16 = false;
            }
            if (i21 != 0) {
                z23 = true;
            } else {
                z23 = z13;
            }
            if (i23 != 0) {
                z17 = false;
            }
            if (i26 != 0) {
                i32 = 2;
            } else {
                i32 = i11;
            }
            if (i28 != 0) {
                dVar3 = z1.c.P;
            } else {
                dVar3 = dVar;
            }
            i33 = ((ct.b) sVar2.j(ct.c.f22476a)).f22473h;
            c3Var = ju.f.f37370d;
            iIntValue = ((Number) sVar2.j(c3Var)).intValue();
            boolean z31111 = z22;
            v3.c cVar16 = (v3.c) sVar2.j(z2.g1.f58547h);
            z24 = z16;
            y0VarB = ct.c.b(sVar2);
            boolean zF18 = sVar2.f(y0VarB);
            boolean z31112 = z17;
            if ((i29 & 112) == 32) {
                z25 = true;
            } else {
                z25 = false;
            }
            z26 = zF18 | z25;
            objQ = sVar2.Q();
            l1.g gVar16 = l1.m.f39353a;
            if (z26) {
                objQ = j3.y0.a(y0VarB, 0L, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777215).d(textStyle);
                sVar2.o0(objQ);
            } else {
                objQ = j3.y0.a(y0VarB, 0L, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777215).d(textStyle);
                sVar2.o0(objQ);
            }
            y0Var = (j3.y0) objQ;
            zF = sVar2.f(word) | sVar2.d(i33);
            objQ2 = sVar2.Q();
            if (zF) {
                objQ2 = c(word, iIntValue, i33);
                sVar2.o0(objQ2);
            } else {
                objQ2 = c(word, iIntValue, i33);
                sVar2.o0(objQ2);
            }
            qy.r rVar19 = (qy.r) objQ2;
            str = (String) rVar19.f48505a;
            z27 = z23;
            str2 = (String) rVar19.f48506b;
            str3 = (String) rVar19.f48507c;
            fD = ct.c.d(sVar2);
            if (kotlin.jvm.internal.m.a(str, str2)) {
                f5 = CropImageView.DEFAULT_ASPECT_RATIO;
            } else {
                f5 = fD;
            }
            if (kotlin.jvm.internal.m.a(str3, str2)) {
                f11 = CropImageView.DEFAULT_ASPECT_RATIO;
            } else {
                f11 = fD;
            }
            j3.w0 w0VarI16 = j3.t.i(sVar2);
            zF2 = sVar2.f(y0Var) | sVar2.d(i33) | sVar2.d(iIntValue);
            objQ3 = sVar2.Q();
            if (zF2) {
                if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(iIntValue))) {
                }
                i34 = 0;
                objQ3 = Integer.valueOf(i34);
                sVar2.o0(objQ3);
            } else {
                if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(iIntValue))) {
                }
                i34 = 0;
                objQ3 = Integer.valueOf(i34);
                sVar2.o0(objQ3);
            }
            int iIntValue17 = ((Number) objQ3).intValue();
            if (ry.l.D(new Integer[]{51, 55}, Integer.valueOf(((Number) sVar2.j(c3Var)).intValue()))) {
                i35 = 2;
            } else {
                i35 = -4;
            }
            z1.r rVarC1111 = j0.c.C(rVar2, cVar16.Q(iIntValue17 / 2), CropImageView.DEFAULT_ASPECT_RATIO, 2);
            j0.b bVar16 = j0.i.f35303a;
            j0.u uVarA16 = j0.t.a(j0.i.i(i35), dVar3, sVar2, (((i29 >> 21) & 896) >> 3) & 112);
            iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL16 = sVar2.l();
            z1.r rVarC1112 = z1.a.c(sVar2, rVarC1111);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA16, sVar2);
            l1.t.J(y2.j.f56916e, q1VarL16, sVar2);
            hVar = y2.j.f56918g;
            if (sVar2.S) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            } else {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC1112, sVar2);
            if (str.length() > 0) {
                sVar = sVar2;
                str4 = str;
                fVar5 = fVar4;
                y0Var2 = y0Var;
                z28 = false;
                sVar.d0(1542510382);
            } else {
                sVar = sVar2;
                str4 = str;
                fVar5 = fVar4;
                y0Var2 = y0Var;
                z28 = false;
                sVar.d0(1542510382);
            }
            sVar.p(z28);
            if (z27) {
                sVar.d0(1549618713);
                sb3 = new StringBuilder(16);
                new ArrayList();
                arrayList3 = new ArrayList();
                new ArrayList();
                if (z24) {
                    sb3.append(" ");
                }
                sb3.append(str2);
                if (z24) {
                    sb3.append(" ");
                }
                String string11115 = sb3.toString();
                arrayList4 = new ArrayList(arrayList3.size());
                size2 = arrayList3.size();
                while (i38 < size2) {
                    arrayList4.add(((j3.d) arrayList3.get(i38)).a(sb3.length()));
                }
                j3.h hVar11116 = new j3.h(string11115, arrayList4);
                j3.y0 y0VarA11117 = j3.y0.a(y0Var2, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                y0Var4 = y0Var2;
                if (fVar5 != null) {
                    rVarS2 = j0.e2.s(oVar, fVar5.f53489a);
                } else {
                    rVarS2 = oVar;
                }
                long j1114 = y0Var4.f35827a.f35755b;
                fr.j3.i(j1114);
                l1.s sVar18 = sVar;
                int i417 = i32;
                iu.k.b(hVar11116, rVarS2, y0VarA11117, 0, false, i417, 0, new s0.g(fr.j3.L(j1114 & 1095216660480L, (float) (((double) v3.o.c(j1114)) * 0.6d)), j1114, fr.j3.A(1)), sVar18, (i29 >> 6) & 3670016);
                i36 = i417;
                sVar = sVar18;
                sVar.p(false);
            } else {
                i36 = i32;
                y0Var3 = y0Var2;
                sVar.d0(1550610620);
                if (word.getWordType() == 4) {
                    sVar.d0(1551215740);
                    sb2 = new StringBuilder(16);
                    new ArrayList();
                    arrayList = new ArrayList();
                    new ArrayList();
                    if (z24) {
                        sb2.append(" ");
                    }
                    sb2.append(str2);
                    if (z24) {
                        sb2.append(" ");
                    }
                    String string11116 = sb2.toString();
                    arrayList2 = new ArrayList(arrayList.size());
                    size = arrayList.size();
                    while (i37 < size) {
                        arrayList2.add(((j3.d) arrayList.get(i37)).a(sb2.length()));
                    }
                    j3.h hVar11117 = new j3.h(string11116, arrayList2);
                    j3.y0 y0VarA11118 = j3.y0.a(y0Var3, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                    y0Var4 = y0Var3;
                    if (fVar5 != null) {
                        rVarS = j0.e2.s(oVar, fVar5.f53489a);
                    } else {
                        rVarS = oVar;
                    }
                    ua.c(hVar11117, rVarS, 0L, 0L, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, null, y0VarA11118, sVar, 0, 0, 130556);
                    z29 = false;
                    sVar.p(false);
                } else {
                    sVar.d0(1551215740);
                    sb2 = new StringBuilder(16);
                    new ArrayList();
                    arrayList = new ArrayList();
                    new ArrayList();
                    if (z24) {
                        sb2.append(" ");
                    }
                    sb2.append(str2);
                    if (z24) {
                        sb2.append(" ");
                    }
                    String string11117 = sb2.toString();
                    arrayList2 = new ArrayList(arrayList.size());
                    size = arrayList.size();
                    while (i37 < size) {
                        arrayList2.add(((j3.d) arrayList.get(i37)).a(sb2.length()));
                    }
                    j3.h hVar11118 = new j3.h(string11117, arrayList2);
                    j3.y0 y0VarA11119 = j3.y0.a(y0Var3, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447);
                    y0Var4 = y0Var3;
                    if (fVar5 != null) {
                        rVarS = j0.e2.s(oVar, fVar5.f53489a);
                    } else {
                        rVarS = oVar;
                    }
                    ua.c(hVar11118, rVarS, 0L, 0L, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, null, y0VarA11119, sVar, 0, 0, 130556);
                    z29 = false;
                    sVar.p(false);
                }
                sVar.p(z29);
            }
            if (str3.length() > 0) {
                z30 = false;
                sVar.d0(1542510382);
            } else {
                z30 = false;
                sVar.d0(1542510382);
            }
            sVar.p(z30);
            sVar.p(true);
            fVar3 = fVar5;
            rVar3 = rVar2;
            z20 = z31111;
            z19 = z24;
            z17 = z31112;
            z21 = z27;
            dVar2 = dVar3;
            i31 = i36;
        } else {
            sVar = sVar2;
            sVar.W();
            dVar2 = dVar;
            z19 = z16;
            rVar3 = rVar2;
            z20 = z15;
            fVar3 = fVar2;
            z21 = z13;
            i31 = i11;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: dt.e4
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    g4.b(word, textStyle, rVar3, z20, fVar3, z19, z21, z17, i31, dVar2, (l1.n) obj, l1.t.M(i12 | 1), i13);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final qy.r c(CourseWord courseWord, int i11, int i12) {
        String word;
        kotlin.jvm.internal.m.f(courseWord, "<this>");
        boolean z11 = ry.l.D(new Integer[]{3}, Integer.valueOf(courseWord.getWordType())) && !kotlin.jvm.internal.m.a(courseWord.getWord(), "_____");
        boolean zD = ry.l.D(new Integer[]{4}, Integer.valueOf(courseWord.getWordType()));
        CourseWord courseWordCopy$default = CourseWord.copy$default(courseWord, 0L, (kotlin.jvm.internal.m.a(courseWord.getWord(), "_____") && courseWord.getRealWord().length() == 0) ? "       " : courseWord.getWord(), kotlin.jvm.internal.m.a(courseWord.getWord(), "_____") ? "       " : courseWord.getZhuYin(), kotlin.jvm.internal.m.a(courseWord.getWord(), "_____") ? "       " : courseWord.getLuoMa(), null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -15, 63, null);
        String word2 = BuildConfig.VERSION_NAME;
        if (zD) {
            return new qy.r(courseWordCopy$default.getZhuYin(), courseWordCopy$default.getWord(), BuildConfig.VERSION_NAME);
        }
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 22 && i11 != 41) {
                        switch (i11) {
                            case 10:
                                break;
                            case 11:
                            case 13:
                                break;
                            case 12:
                                break;
                            default:
                                if (i12 == -1 || i12 == 0) {
                                    return (courseWordCopy$default.getWordType() != 3 || courseWordCopy$default.getLuoMa().length() <= 0) ? new qy.r(BuildConfig.VERSION_NAME, courseWordCopy$default.getWord(), BuildConfig.VERSION_NAME) : new qy.r(courseWordCopy$default.getLuoMa(), courseWordCopy$default.getWord(), BuildConfig.VERSION_NAME);
                                }
                                String luoMa = courseWordCopy$default.getLuoMa();
                                word = luoMa.length() > 0 ? luoMa : null;
                                if (word == null) {
                                    word = !z11 ? courseWordCopy$default.getWord() : BuildConfig.VERSION_NAME;
                                }
                                return new qy.r(word, courseWordCopy$default.getWord(), BuildConfig.VERSION_NAME);
                        }
                    }
                    return new qy.r(BuildConfig.VERSION_NAME, oz.x.q0(courseWordCopy$default.getWord(), "́", BuildConfig.VERSION_NAME), BuildConfig.VERSION_NAME);
                }
            }
            if (courseWordCopy$default.getWordType() == 3 && courseWordCopy$default.getWord().length() > 0) {
                String zhuYin = courseWordCopy$default.getZhuYin();
                if (zhuYin.length() == 0) {
                    zhuYin = courseWordCopy$default.getLuoMa();
                }
                return new qy.r(zhuYin, courseWordCopy$default.getWord(), BuildConfig.VERSION_NAME);
            }
            if (courseWordCopy$default.getWord().length() == 0 && courseWordCopy$default.getZhuYin().length() > 0) {
                if (i12 != 0 && i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                return new qy.r(courseWordCopy$default.getLuoMa(), courseWordCopy$default.getZhuYin(), BuildConfig.VERSION_NAME);
                            }
                        }
                    }
                    return new qy.r(BuildConfig.VERSION_NAME, courseWordCopy$default.getLuoMa(), BuildConfig.VERSION_NAME);
                }
                return new qy.r(BuildConfig.VERSION_NAME, courseWordCopy$default.getZhuYin(), BuildConfig.VERSION_NAME);
            }
            if (i12 == 0) {
                return new qy.r(BuildConfig.VERSION_NAME, courseWordCopy$default.getWord(), BuildConfig.VERSION_NAME);
            }
            if (i12 == 1) {
                String strA = pt.g.a(courseWordCopy$default);
                word = strA.length() > 0 ? strA : null;
                if (word == null) {
                    word = courseWordCopy$default.getWord();
                }
                return new qy.r(BuildConfig.VERSION_NAME, word, BuildConfig.VERSION_NAME);
            }
            if (i12 == 2) {
                return new qy.r(BuildConfig.VERSION_NAME, courseWordCopy$default.getLuoMa(), BuildConfig.VERSION_NAME);
            }
            if (i12 == 3) {
                String zhuYin2 = courseWordCopy$default.getZhuYin();
                word = zhuYin2.length() > 0 ? zhuYin2 : null;
                if (word == null) {
                    word = !z11 ? courseWordCopy$default.getWord() : BuildConfig.VERSION_NAME;
                }
                return new qy.r(word, courseWordCopy$default.getWord(), BuildConfig.VERSION_NAME);
            }
            if (i12 == 4) {
                String luoMa2 = courseWordCopy$default.getLuoMa();
                word = luoMa2.length() > 0 ? luoMa2 : null;
                if (word == null) {
                    word = !z11 ? courseWordCopy$default.getWord() : BuildConfig.VERSION_NAME;
                }
                return new qy.r(word, courseWordCopy$default.getWord(), BuildConfig.VERSION_NAME);
            }
            if (i12 == 5) {
                String luoMa3 = courseWordCopy$default.getLuoMa();
                if (luoMa3.length() <= 0) {
                    luoMa3 = null;
                }
                if (luoMa3 == null) {
                    luoMa3 = !z11 ? courseWordCopy$default.getZhuYin() : BuildConfig.VERSION_NAME;
                }
                String strA2 = pt.g.a(courseWordCopy$default);
                word = strA2.length() > 0 ? strA2 : null;
                if (word == null) {
                    word = courseWordCopy$default.getWord();
                }
                return new qy.r(luoMa3, word, BuildConfig.VERSION_NAME);
            }
            String zhuYin3 = courseWordCopy$default.getZhuYin();
            if (zhuYin3.length() <= 0) {
                zhuYin3 = null;
            }
            if (zhuYin3 == null) {
                zhuYin3 = !z11 ? courseWordCopy$default.getWord() : BuildConfig.VERSION_NAME;
            }
            String word3 = courseWordCopy$default.getWord();
            String luoMa4 = courseWordCopy$default.getLuoMa();
            word = luoMa4.length() > 0 ? luoMa4 : null;
            if (word != null) {
                word2 = word;
            } else if (!z11) {
                word2 = courseWordCopy$default.getWord();
            }
            return new qy.r(zhuYin3, word3, word2);
        }
        int i13 = f4.f23822a[courseWordCopy$default.getDisplayType().ordinal()];
        if (i13 == 1) {
            return new qy.r(BuildConfig.VERSION_NAME, courseWordCopy$default.getWord(), BuildConfig.VERSION_NAME);
        }
        if (i13 == 2) {
            String zhuYin4 = courseWordCopy$default.getZhuYin();
            word = zhuYin4.length() > 0 ? zhuYin4 : null;
            if (word == null) {
                word = courseWordCopy$default.getWord();
            }
            return new qy.r(BuildConfig.VERSION_NAME, word, BuildConfig.VERSION_NAME);
        }
        if (i13 == 3) {
            return new qy.r(BuildConfig.VERSION_NAME, courseWordCopy$default.getLuoMa(), BuildConfig.VERSION_NAME);
        }
        if (i13 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (i12 == 0) {
            String zhuYin5 = courseWordCopy$default.getZhuYin();
            word = zhuYin5.length() > 0 ? zhuYin5 : null;
            if (word == null) {
                word = courseWordCopy$default.getWord();
            }
            return new qy.r(BuildConfig.VERSION_NAME, word, BuildConfig.VERSION_NAME);
        }
        if (i12 == 1) {
            return new qy.r(BuildConfig.VERSION_NAME, courseWordCopy$default.getWord(), BuildConfig.VERSION_NAME);
        }
        String zhuYin6 = courseWordCopy$default.getZhuYin();
        word = zhuYin6.length() > 0 ? zhuYin6 : null;
        if (word == null) {
            word = !z11 ? courseWordCopy$default.getWord() : BuildConfig.VERSION_NAME;
        }
        return new qy.r(word, courseWordCopy$default.getWord(), BuildConfig.VERSION_NAME);
    }
}
