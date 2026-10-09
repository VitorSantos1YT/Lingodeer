package s0;

import android.content.Context;
import android.os.Build;
import android.text.Spanned;
import android.view.KeyEvent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bt.g7;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.yalantis.ucrop.view.CropImageView;
import dt.y3;
import h1.n8;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import l1.c3;
import l1.x1;
import mt.k4;
import mt.k6;
import qp.m3;
import qp.o2;
import rt.m9;
import z2.i2;
import z2.q2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x0 f51122a = new x0(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s2.a f51123b = new s2.a(1022);

    public static final void A(int i11, int i12) {
        if (!(i11 > 0 && i12 > 0)) {
            i0.a.a("both minLines " + i11 + " and maxLines " + i12 + " must be greater than zero");
        }
        if (i11 <= i12) {
            return;
        }
        i0.a.a("minLines " + i11 + " must be less than or equal to maxLines " + i12);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011a  */
    /* JADX WARN: Code duplicated, block: B:102:0x011f  */
    /* JADX WARN: Code duplicated, block: B:105:0x012e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0136  */
    /* JADX WARN: Code duplicated, block: B:112:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0141  */
    /* JADX WARN: Code duplicated, block: B:114:0x0143  */
    /* JADX WARN: Code duplicated, block: B:116:0x0146  */
    /* JADX WARN: Code duplicated, block: B:117:0x014b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0150  */
    /* JADX WARN: Code duplicated, block: B:121:0x0152  */
    /* JADX WARN: Code duplicated, block: B:123:0x0156  */
    /* JADX WARN: Code duplicated, block: B:124:0x0158  */
    /* JADX WARN: Code duplicated, block: B:127:0x0165  */
    /* JADX WARN: Code duplicated, block: B:129:0x017a  */
    /* JADX WARN: Code duplicated, block: B:131:0x0181  */
    /* JADX WARN: Code duplicated, block: B:133:0x018d  */
    /* JADX WARN: Code duplicated, block: B:135:0x0197  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ab A[EDGE_INSN: B:141:0x01ab->B:142:0x01ad BREAK  A[LOOP:0: B:130:0x017f->B:140:0x01a7], PHI: r9
      0x01ab: PHI (r9v5 boolean) = (r9v2 boolean), (r9v12 boolean) binds: [B:128:0x0178, B:176:0x01ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:144:0x01bb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:155:0x0241  */
    /* JADX WARN: Code duplicated, block: B:157:0x024e  */
    /* JADX WARN: Code duplicated, block: B:158:0x0250  */
    /* JADX WARN: Code duplicated, block: B:161:0x0259 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:162:0x025b  */
    /* JADX WARN: Code duplicated, block: B:165:0x0274 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:166:0x0276  */
    /* JADX WARN: Code duplicated, block: B:169:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:171:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:174:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:176:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x01a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:91:0x0101  */
    /* JADX WARN: Code duplicated, block: B:92:0x0104  */
    /* JADX WARN: Code duplicated, block: B:94:0x0108  */
    /* JADX WARN: Code duplicated, block: B:96:0x010c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0111  */
    /* JADX WARN: Code duplicated, block: B:99:0x0117  */
    public static final void a(final j3.h hVar, final z1.r rVar, final j3.y0 y0Var, final fz.c cVar, final int i11, final boolean z11, final int i12, int i13, Map map, g2.y yVar, g gVar, l1.n nVar, final int i14, final int i15, final int i16) {
        int i17;
        j3.y0 y0Var2;
        int i18;
        int i19;
        Map map2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean zH;
        int i27;
        boolean z12;
        boolean z13;
        l1.s sVar;
        final g2.y yVar2;
        final g gVar2;
        final Map map3;
        final int i28;
        x1 x1VarT;
        int i29;
        Map map4;
        g2.y yVar3;
        g gVar3;
        int length;
        List list;
        boolean z14;
        boolean z15;
        n3.h hVar2;
        boolean z16;
        Object objQ;
        l1.b1 b1Var;
        boolean zF;
        Object objQ2;
        Map map5;
        int size;
        int i30;
        j3.f fVar;
        int i31;
        int i32;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1343466571);
        if ((i14 & 6) == 0) {
            i17 = (sVar2.f(hVar) ? 4 : 2) | i14;
        } else {
            i17 = i14;
        }
        if ((i14 & 48) == 0) {
            i17 |= sVar2.f(rVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            y0Var2 = y0Var;
            i17 |= sVar2.f(y0Var2) ? 256 : 128;
        } else {
            y0Var2 = y0Var;
        }
        if ((i14 & 3072) == 0) {
            i17 |= sVar2.h(cVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i17 |= sVar2.d(i11) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i14) == 0) {
            i17 |= sVar2.g(z11) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i14) == 0) {
            i17 |= sVar2.d(i12) ? 1048576 : 524288;
        }
        int i33 = i16 & 128;
        if (i33 == 0) {
            if ((12582912 & i14) == 0) {
                i18 = i13;
                i17 |= sVar2.d(i18) ? 8388608 : 4194304;
            }
            i19 = i16 & 256;
            if (i19 != 0) {
                i17 |= 100663296;
                map2 = map;
            } else {
                map2 = map;
                if ((i14 & 100663296) == 0) {
                    if (sVar2.h(map2)) {
                        i21 = 67108864;
                    } else {
                        i21 = 33554432;
                    }
                    i17 |= i21;
                }
            }
            i22 = i17;
            i23 = i16 & 512;
            if (i23 != 0) {
                if ((i14 & 805306368) == 0) {
                    if (sVar2.h(yVar)) {
                        i24 = 536870912;
                    } else {
                        i24 = 268435456;
                    }
                    i22 |= i24;
                }
                i25 = i16 & 1024;
                if (i25 != 0) {
                    i26 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if ((i15 & 8) == 0) {
                        zH = sVar2.f(gVar);
                    } else {
                        zH = sVar2.h(gVar);
                    }
                    if (zH) {
                        i27 = 4;
                    } else {
                        i27 = 2;
                    }
                    i26 = i15 | i27;
                } else {
                    i26 = i15;
                }
                z12 = false;
                if ((i22 & 306783379) == 306783378 || (i26 & 3) != 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (sVar2.T(i22 & 1, z13)) {
                    if (i33 != 0) {
                        i29 = 1;
                    } else {
                        i29 = i18;
                    }
                    if (i19 != 0) {
                        map4 = ry.s.f50855a;
                    } else {
                        map4 = map2;
                    }
                    if (i23 != 0) {
                        yVar3 = null;
                    } else {
                        yVar3 = yVar;
                    }
                    if (i25 != 0) {
                        gVar3 = null;
                    } else {
                        gVar3 = gVar;
                    }
                    A(i29, i12);
                    if (sVar2.j(d1.j0.f22926a) == null) {
                        throw new ClassCastException();
                    }
                    sVar2.d0(1588771313);
                    sVar2.p(false);
                    qy.l lVar = f.f51025a;
                    length = hVar.f35700b.length();
                    list = hVar.f35699a;
                    if (list != null) {
                        z14 = z12;
                        z15 = z14;
                        break;
                    }
                    size = list.size();
                    i30 = 0;
                    while (true) {
                        if (i30 < size) {
                            z14 = z12;
                            z15 = z14;
                            break;
                        }
                        fVar = (j3.f) list.get(i30);
                        if (fVar.f35689a instanceof j3.r0) {
                            z14 = z12;
                        } else if ("androidx.compose.foundation.text.inlineContent".equals(fVar.f35692d)) {
                            i31 = fVar.f35690b;
                            i32 = fVar.f35691c;
                            z14 = false;
                            if (j3.i.b(0, length, i31, i32)) {
                                z15 = true;
                                break;
                            }
                        } else {
                            z14 = false;
                        }
                        i30++;
                        z12 = z14;
                    }
                    boolean zQ = se.k.q(hVar);
                    hVar2 = (n3.h) sVar2.j(z2.g1.f58550k);
                    if (!z15 || zQ) {
                        sVar = sVar2;
                        sVar.d0(1590033974);
                        if ((i22 & 14) == 4) {
                            z16 = true;
                        } else {
                            z16 = z14;
                        }
                        objQ = sVar.Q();
                        l1.g gVar4 = l1.m.f39353a;
                        if (z16 || objQ == gVar4) {
                            objQ = l1.t.B(hVar);
                            sVar.o0(objQ);
                        }
                        b1Var = (l1.b1) objQ;
                        j3.h hVar3 = (j3.h) b1Var.getValue();
                        zF = sVar.f(b1Var);
                        objQ2 = sVar.Q();
                        if (zF || objQ2 == gVar4) {
                            objQ2 = new mt.p(18, b1Var);
                            sVar.o0(objQ2);
                        }
                        int i34 = i22 << 6;
                        int i35 = i29;
                        map5 = map4;
                        i(rVar, hVar3, cVar, z15, map5, y0Var, i11, z11, i12, i35, hVar2, yVar3, (fz.c) objQ2, gVar3, sVar, ((i22 >> 3) & 910) | ((i22 >> 12) & 57344) | ((i22 << 9) & 458752) | (3670016 & i34) | (29360128 & i34) | (234881024 & i34) | (i34 & 1879048192), ((i22 >> 21) & 896) | ((i26 << 12) & 57344));
                        i29 = i35;
                        sVar.p(false);
                    } else {
                        sVar2.d0(1589018166);
                        t.a(hVar, y0Var2, hVar2, null, sVar2, (i22 & 14) | 3072 | ((i22 >> 3) & 112));
                        sVar = sVar2;
                        z1.r rVarZ = z(rVar, hVar, y0Var, cVar, i11, z11, i12, i29, hVar2, null, null, yVar3, null, gVar3);
                        e eVar = e.f51017c;
                        int iHashCode = Long.hashCode(sVar.T);
                        z1.r rVarC = z1.a.c(sVar, rVarZ);
                        l1.q1 q1VarL = sVar.l();
                        y2.k.J.getClass();
                        y2.i iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, eVar, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL, sVar);
                        l1.t.J(y2.j.f56915d, rVarC, sVar);
                        y2.h hVar4 = y2.j.f56918g;
                        if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
                        }
                        sVar.p(true);
                        sVar.p(false);
                        map5 = map4;
                    }
                    map3 = map5;
                    i28 = i29;
                    yVar2 = yVar3;
                    gVar2 = gVar3;
                } else {
                    sVar = sVar2;
                    sVar.W();
                    yVar2 = yVar;
                    gVar2 = gVar;
                    map3 = map2;
                    i28 = i18;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: s0.n
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM = l1.t.M(i14 | 1);
                            int iM2 = l1.t.M(i15);
                            o0.a(hVar, rVar, y0Var, cVar, i11, z11, i12, i28, map3, yVar2, gVar2, (l1.n) obj, iM, iM2, i16);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i22 |= 805306368;
            i25 = i16 & 1024;
            if (i25 != 0) {
                i26 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if ((i15 & 8) == 0) {
                    zH = sVar2.f(gVar);
                } else {
                    zH = sVar2.h(gVar);
                }
                if (zH) {
                    i27 = 4;
                } else {
                    i27 = 2;
                }
                i26 = i15 | i27;
            } else {
                i26 = i15;
            }
            z12 = false;
            if ((i22 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (sVar2.T(i22 & 1, z13)) {
                if (i33 != 0) {
                    i29 = 1;
                } else {
                    i29 = i18;
                }
                if (i19 != 0) {
                    map4 = ry.s.f50855a;
                } else {
                    map4 = map2;
                }
                if (i23 != 0) {
                    yVar3 = null;
                } else {
                    yVar3 = yVar;
                }
                if (i25 != 0) {
                    gVar3 = null;
                } else {
                    gVar3 = gVar;
                }
                A(i29, i12);
                if (sVar2.j(d1.j0.f22926a) == null) {
                    throw new ClassCastException();
                }
                sVar2.d0(1588771313);
                sVar2.p(false);
                qy.l lVar2 = f.f51025a;
                length = hVar.f35700b.length();
                list = hVar.f35699a;
                if (list != null) {
                    z14 = z12;
                    z15 = z14;
                    break;
                }
                size = list.size();
                i30 = 0;
                while (true) {
                    if (i30 < size) {
                        z14 = z12;
                        z15 = z14;
                        break;
                    }
                    fVar = (j3.f) list.get(i30);
                    if (fVar.f35689a instanceof j3.r0) {
                        z14 = z12;
                    } else if ("androidx.compose.foundation.text.inlineContent".equals(fVar.f35692d)) {
                        i31 = fVar.f35690b;
                        i32 = fVar.f35691c;
                        z14 = false;
                        if (j3.i.b(0, length, i31, i32)) {
                            z15 = true;
                            break;
                        }
                    } else {
                        z14 = false;
                    }
                    i30++;
                    z12 = z14;
                }
                boolean zQ2 = se.k.q(hVar);
                hVar2 = (n3.h) sVar2.j(z2.g1.f58550k);
                if (z15) {
                    sVar = sVar2;
                    sVar.d0(1590033974);
                    if ((i22 & 14) == 4) {
                        z16 = true;
                    } else {
                        z16 = z14;
                    }
                    objQ = sVar.Q();
                    l1.g gVar5 = l1.m.f39353a;
                    if (z16) {
                        objQ = l1.t.B(hVar);
                        sVar.o0(objQ);
                    } else {
                        objQ = l1.t.B(hVar);
                        sVar.o0(objQ);
                    }
                    b1Var = (l1.b1) objQ;
                    j3.h hVar5 = (j3.h) b1Var.getValue();
                    zF = sVar.f(b1Var);
                    objQ2 = sVar.Q();
                    if (zF) {
                        objQ2 = new mt.p(18, b1Var);
                        sVar.o0(objQ2);
                    } else {
                        objQ2 = new mt.p(18, b1Var);
                        sVar.o0(objQ2);
                    }
                    int i36 = i22 << 6;
                    int i37 = i29;
                    map5 = map4;
                    i(rVar, hVar5, cVar, z15, map5, y0Var, i11, z11, i12, i37, hVar2, yVar3, (fz.c) objQ2, gVar3, sVar, ((i22 >> 3) & 910) | ((i22 >> 12) & 57344) | ((i22 << 9) & 458752) | (3670016 & i36) | (29360128 & i36) | (234881024 & i36) | (i36 & 1879048192), ((i22 >> 21) & 896) | ((i26 << 12) & 57344));
                    i29 = i37;
                    sVar.p(false);
                } else {
                    sVar = sVar2;
                    sVar.d0(1590033974);
                    if ((i22 & 14) == 4) {
                        z16 = true;
                    } else {
                        z16 = z14;
                    }
                    objQ = sVar.Q();
                    l1.g gVar6 = l1.m.f39353a;
                    if (z16) {
                        objQ = l1.t.B(hVar);
                        sVar.o0(objQ);
                    } else {
                        objQ = l1.t.B(hVar);
                        sVar.o0(objQ);
                    }
                    b1Var = (l1.b1) objQ;
                    j3.h hVar6 = (j3.h) b1Var.getValue();
                    zF = sVar.f(b1Var);
                    objQ2 = sVar.Q();
                    if (zF) {
                        objQ2 = new mt.p(18, b1Var);
                        sVar.o0(objQ2);
                    } else {
                        objQ2 = new mt.p(18, b1Var);
                        sVar.o0(objQ2);
                    }
                    int i38 = i22 << 6;
                    int i39 = i29;
                    map5 = map4;
                    i(rVar, hVar6, cVar, z15, map5, y0Var, i11, z11, i12, i39, hVar2, yVar3, (fz.c) objQ2, gVar3, sVar, ((i22 >> 3) & 910) | ((i22 >> 12) & 57344) | ((i22 << 9) & 458752) | (3670016 & i38) | (29360128 & i38) | (234881024 & i38) | (i38 & 1879048192), ((i22 >> 21) & 896) | ((i26 << 12) & 57344));
                    i29 = i39;
                    sVar.p(false);
                }
                map3 = map5;
                i28 = i29;
                yVar2 = yVar3;
                gVar2 = gVar3;
            } else {
                sVar = sVar2;
                sVar.W();
                yVar2 = yVar;
                gVar2 = gVar;
                map3 = map2;
                i28 = i18;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: s0.n
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM = l1.t.M(i14 | 1);
                        int iM2 = l1.t.M(i15);
                        o0.a(hVar, rVar, y0Var, cVar, i11, z11, i12, i28, map3, yVar2, gVar2, (l1.n) obj, iM, iM2, i16);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i17 |= 12582912;
        i18 = i13;
        i19 = i16 & 256;
        if (i19 != 0) {
            i17 |= 100663296;
            map2 = map;
        } else {
            map2 = map;
            if ((i14 & 100663296) == 0) {
                if (sVar2.h(map2)) {
                    i21 = 67108864;
                } else {
                    i21 = 33554432;
                }
                i17 |= i21;
            }
        }
        i22 = i17;
        i23 = i16 & 512;
        if (i23 != 0) {
            if ((i14 & 805306368) == 0) {
                if (sVar2.h(yVar)) {
                    i24 = 536870912;
                } else {
                    i24 = 268435456;
                }
                i22 |= i24;
            }
            i25 = i16 & 1024;
            if (i25 != 0) {
                i26 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if ((i15 & 8) == 0) {
                    zH = sVar2.f(gVar);
                } else {
                    zH = sVar2.h(gVar);
                }
                if (zH) {
                    i27 = 4;
                } else {
                    i27 = 2;
                }
                i26 = i15 | i27;
            } else {
                i26 = i15;
            }
            z12 = false;
            if ((i22 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (sVar2.T(i22 & 1, z13)) {
                if (i33 != 0) {
                    i29 = 1;
                } else {
                    i29 = i18;
                }
                if (i19 != 0) {
                    map4 = ry.s.f50855a;
                } else {
                    map4 = map2;
                }
                if (i23 != 0) {
                    yVar3 = null;
                } else {
                    yVar3 = yVar;
                }
                if (i25 != 0) {
                    gVar3 = null;
                } else {
                    gVar3 = gVar;
                }
                A(i29, i12);
                if (sVar2.j(d1.j0.f22926a) == null) {
                    throw new ClassCastException();
                }
                sVar2.d0(1588771313);
                sVar2.p(false);
                qy.l lVar3 = f.f51025a;
                length = hVar.f35700b.length();
                list = hVar.f35699a;
                if (list != null) {
                    z14 = z12;
                    z15 = z14;
                    break;
                }
                size = list.size();
                i30 = 0;
                while (true) {
                    if (i30 < size) {
                        z14 = z12;
                        z15 = z14;
                        break;
                    }
                    fVar = (j3.f) list.get(i30);
                    if (fVar.f35689a instanceof j3.r0) {
                        z14 = z12;
                    } else if ("androidx.compose.foundation.text.inlineContent".equals(fVar.f35692d)) {
                        i31 = fVar.f35690b;
                        i32 = fVar.f35691c;
                        z14 = false;
                        if (j3.i.b(0, length, i31, i32)) {
                            z15 = true;
                            break;
                        }
                    } else {
                        z14 = false;
                    }
                    i30++;
                    z12 = z14;
                }
                boolean zQ3 = se.k.q(hVar);
                hVar2 = (n3.h) sVar2.j(z2.g1.f58550k);
                if (z15) {
                    sVar = sVar2;
                    sVar.d0(1590033974);
                    if ((i22 & 14) == 4) {
                        z16 = true;
                    } else {
                        z16 = z14;
                    }
                    objQ = sVar.Q();
                    l1.g gVar7 = l1.m.f39353a;
                    if (z16) {
                        objQ = l1.t.B(hVar);
                        sVar.o0(objQ);
                    } else {
                        objQ = l1.t.B(hVar);
                        sVar.o0(objQ);
                    }
                    b1Var = (l1.b1) objQ;
                    j3.h hVar7 = (j3.h) b1Var.getValue();
                    zF = sVar.f(b1Var);
                    objQ2 = sVar.Q();
                    if (zF) {
                        objQ2 = new mt.p(18, b1Var);
                        sVar.o0(objQ2);
                    } else {
                        objQ2 = new mt.p(18, b1Var);
                        sVar.o0(objQ2);
                    }
                    int i310 = i22 << 6;
                    int i311 = i29;
                    map5 = map4;
                    i(rVar, hVar7, cVar, z15, map5, y0Var, i11, z11, i12, i311, hVar2, yVar3, (fz.c) objQ2, gVar3, sVar, ((i22 >> 3) & 910) | ((i22 >> 12) & 57344) | ((i22 << 9) & 458752) | (3670016 & i310) | (29360128 & i310) | (234881024 & i310) | (i310 & 1879048192), ((i22 >> 21) & 896) | ((i26 << 12) & 57344));
                    i29 = i311;
                    sVar.p(false);
                } else {
                    sVar = sVar2;
                    sVar.d0(1590033974);
                    if ((i22 & 14) == 4) {
                        z16 = true;
                    } else {
                        z16 = z14;
                    }
                    objQ = sVar.Q();
                    l1.g gVar8 = l1.m.f39353a;
                    if (z16) {
                        objQ = l1.t.B(hVar);
                        sVar.o0(objQ);
                    } else {
                        objQ = l1.t.B(hVar);
                        sVar.o0(objQ);
                    }
                    b1Var = (l1.b1) objQ;
                    j3.h hVar8 = (j3.h) b1Var.getValue();
                    zF = sVar.f(b1Var);
                    objQ2 = sVar.Q();
                    if (zF) {
                        objQ2 = new mt.p(18, b1Var);
                        sVar.o0(objQ2);
                    } else {
                        objQ2 = new mt.p(18, b1Var);
                        sVar.o0(objQ2);
                    }
                    int i312 = i22 << 6;
                    int i313 = i29;
                    map5 = map4;
                    i(rVar, hVar8, cVar, z15, map5, y0Var, i11, z11, i12, i313, hVar2, yVar3, (fz.c) objQ2, gVar3, sVar, ((i22 >> 3) & 910) | ((i22 >> 12) & 57344) | ((i22 << 9) & 458752) | (3670016 & i312) | (29360128 & i312) | (234881024 & i312) | (i312 & 1879048192), ((i22 >> 21) & 896) | ((i26 << 12) & 57344));
                    i29 = i313;
                    sVar.p(false);
                }
                map3 = map5;
                i28 = i29;
                yVar2 = yVar3;
                gVar2 = gVar3;
            } else {
                sVar = sVar2;
                sVar.W();
                yVar2 = yVar;
                gVar2 = gVar;
                map3 = map2;
                i28 = i18;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: s0.n
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM = l1.t.M(i14 | 1);
                        int iM2 = l1.t.M(i15);
                        o0.a(hVar, rVar, y0Var, cVar, i11, z11, i12, i28, map3, yVar2, gVar2, (l1.n) obj, iM, iM2, i16);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i22 |= 805306368;
        i25 = i16 & 1024;
        if (i25 != 0) {
            i26 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            if ((i15 & 8) == 0) {
                zH = sVar2.f(gVar);
            } else {
                zH = sVar2.h(gVar);
            }
            if (zH) {
                i27 = 4;
            } else {
                i27 = 2;
            }
            i26 = i15 | i27;
        } else {
            i26 = i15;
        }
        z12 = false;
        if ((i22 & 306783379) == 306783378) {
            z13 = true;
        } else {
            z13 = true;
        }
        if (sVar2.T(i22 & 1, z13)) {
            if (i33 != 0) {
                i29 = 1;
            } else {
                i29 = i18;
            }
            if (i19 != 0) {
                map4 = ry.s.f50855a;
            } else {
                map4 = map2;
            }
            if (i23 != 0) {
                yVar3 = null;
            } else {
                yVar3 = yVar;
            }
            if (i25 != 0) {
                gVar3 = null;
            } else {
                gVar3 = gVar;
            }
            A(i29, i12);
            if (sVar2.j(d1.j0.f22926a) == null) {
                throw new ClassCastException();
            }
            sVar2.d0(1588771313);
            sVar2.p(false);
            qy.l lVar4 = f.f51025a;
            length = hVar.f35700b.length();
            list = hVar.f35699a;
            if (list != null) {
                z14 = z12;
                z15 = z14;
                break;
            }
            size = list.size();
            i30 = 0;
            while (true) {
                if (i30 < size) {
                    z14 = z12;
                    z15 = z14;
                    break;
                }
                fVar = (j3.f) list.get(i30);
                if (fVar.f35689a instanceof j3.r0) {
                    z14 = z12;
                } else if ("androidx.compose.foundation.text.inlineContent".equals(fVar.f35692d)) {
                    i31 = fVar.f35690b;
                    i32 = fVar.f35691c;
                    z14 = false;
                    if (j3.i.b(0, length, i31, i32)) {
                        z15 = true;
                        break;
                    }
                } else {
                    z14 = false;
                }
                i30++;
                z12 = z14;
            }
            boolean zQ4 = se.k.q(hVar);
            hVar2 = (n3.h) sVar2.j(z2.g1.f58550k);
            if (z15) {
                sVar = sVar2;
                sVar.d0(1590033974);
                if ((i22 & 14) == 4) {
                    z16 = true;
                } else {
                    z16 = z14;
                }
                objQ = sVar.Q();
                l1.g gVar9 = l1.m.f39353a;
                if (z16) {
                    objQ = l1.t.B(hVar);
                    sVar.o0(objQ);
                } else {
                    objQ = l1.t.B(hVar);
                    sVar.o0(objQ);
                }
                b1Var = (l1.b1) objQ;
                j3.h hVar9 = (j3.h) b1Var.getValue();
                zF = sVar.f(b1Var);
                objQ2 = sVar.Q();
                if (zF) {
                    objQ2 = new mt.p(18, b1Var);
                    sVar.o0(objQ2);
                } else {
                    objQ2 = new mt.p(18, b1Var);
                    sVar.o0(objQ2);
                }
                int i314 = i22 << 6;
                int i315 = i29;
                map5 = map4;
                i(rVar, hVar9, cVar, z15, map5, y0Var, i11, z11, i12, i315, hVar2, yVar3, (fz.c) objQ2, gVar3, sVar, ((i22 >> 3) & 910) | ((i22 >> 12) & 57344) | ((i22 << 9) & 458752) | (3670016 & i314) | (29360128 & i314) | (234881024 & i314) | (i314 & 1879048192), ((i22 >> 21) & 896) | ((i26 << 12) & 57344));
                i29 = i315;
                sVar.p(false);
            } else {
                sVar = sVar2;
                sVar.d0(1590033974);
                if ((i22 & 14) == 4) {
                    z16 = true;
                } else {
                    z16 = z14;
                }
                objQ = sVar.Q();
                l1.g gVar10 = l1.m.f39353a;
                if (z16) {
                    objQ = l1.t.B(hVar);
                    sVar.o0(objQ);
                } else {
                    objQ = l1.t.B(hVar);
                    sVar.o0(objQ);
                }
                b1Var = (l1.b1) objQ;
                j3.h hVar10 = (j3.h) b1Var.getValue();
                zF = sVar.f(b1Var);
                objQ2 = sVar.Q();
                if (zF) {
                    objQ2 = new mt.p(18, b1Var);
                    sVar.o0(objQ2);
                } else {
                    objQ2 = new mt.p(18, b1Var);
                    sVar.o0(objQ2);
                }
                int i316 = i22 << 6;
                int i317 = i29;
                map5 = map4;
                i(rVar, hVar10, cVar, z15, map5, y0Var, i11, z11, i12, i317, hVar2, yVar3, (fz.c) objQ2, gVar3, sVar, ((i22 >> 3) & 910) | ((i22 >> 12) & 57344) | ((i22 << 9) & 458752) | (3670016 & i316) | (29360128 & i316) | (234881024 & i316) | (i316 & 1879048192), ((i22 >> 21) & 896) | ((i26 << 12) & 57344));
                i29 = i317;
                sVar.p(false);
            }
            map3 = map5;
            i28 = i29;
            yVar2 = yVar3;
            gVar2 = gVar3;
        } else {
            sVar = sVar2;
            sVar.W();
            yVar2 = yVar;
            gVar2 = gVar;
            map3 = map2;
            i28 = i18;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: s0.n
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(i14 | 1);
                    int iM2 = l1.t.M(i15);
                    o0.a(hVar, rVar, y0Var, cVar, i11, z11, i12, i28, map3, yVar2, gVar2, (l1.n) obj, iM, iM2, i16);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void b(final j3.h hVar, final z1.r rVar, final j3.y0 y0Var, final fz.c cVar, final int i11, final boolean z11, final int i12, final int i13, final Map map, l1.n nVar, final int i14) {
        int i15;
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1064305212);
        if ((i14 & 6) == 0) {
            i15 = (sVar2.f(hVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= sVar2.f(rVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= sVar2.f(y0Var) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= sVar2.h(cVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= sVar2.d(i11) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i14) == 0) {
            i15 |= sVar2.g(z11) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= sVar2.d(i12) ? 1048576 : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= sVar2.d(i13) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i15 |= sVar2.h(map) ? 67108864 : 33554432;
        }
        int i16 = i15 | 805306368;
        if (sVar2.T(i16 & 1, (306783379 & i16) != 306783378)) {
            sVar = sVar2;
            a(hVar, rVar, y0Var, cVar, i11, z11, i12, i13, map, null, null, sVar, i16 & 2147483646, 0, 1024);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: s0.m
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    o0.b(hVar, rVar, y0Var, cVar, i11, z11, i12, i13, map, (l1.n) obj, l1.t.M(i14 | 1));
                    return qy.b0.f48488a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0124  */
    /* JADX WARN: Code duplicated, block: B:104:0x0129  */
    /* JADX WARN: Code duplicated, block: B:106:0x012f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0132  */
    /* JADX WARN: Code duplicated, block: B:110:0x0141  */
    /* JADX WARN: Code duplicated, block: B:111:0x0143  */
    /* JADX WARN: Code duplicated, block: B:114:0x014c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x014e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0153  */
    /* JADX WARN: Code duplicated, block: B:120:0x0159  */
    /* JADX WARN: Code duplicated, block: B:121:0x015c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0160  */
    /* JADX WARN: Code duplicated, block: B:124:0x0163  */
    /* JADX WARN: Code duplicated, block: B:126:0x0167  */
    /* JADX WARN: Code duplicated, block: B:127:0x016a  */
    /* JADX WARN: Code duplicated, block: B:129:0x016e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0172  */
    /* JADX WARN: Code duplicated, block: B:132:0x0175  */
    /* JADX WARN: Code duplicated, block: B:133:0x0177  */
    /* JADX WARN: Code duplicated, block: B:135:0x017b  */
    /* JADX WARN: Code duplicated, block: B:136:0x017e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0182  */
    /* JADX WARN: Code duplicated, block: B:139:0x0185  */
    /* JADX WARN: Code duplicated, block: B:142:0x0192  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:154:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:155:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:170:0x0224 A[Catch: RejectedExecutionException -> 0x01e4, TRY_LEAVE, TryCatch #2 {RejectedExecutionException -> 0x01e4, blocks: (B:148:0x01dd, B:156:0x01ee, B:158:0x01fe, B:164:0x020b, B:166:0x021c, B:170:0x0224, B:160:0x0204, B:152:0x01e7), top: B:209:0x01dd }] */
    /* JADX WARN: Code duplicated, block: B:179:0x024f  */
    /* JADX WARN: Code duplicated, block: B:181:0x025d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:182:0x025f  */
    /* JADX WARN: Code duplicated, block: B:187:0x02da  */
    /* JADX WARN: Code duplicated, block: B:188:0x02de  */
    /* JADX WARN: Code duplicated, block: B:191:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:195:0x0307  */
    /* JADX WARN: Code duplicated, block: B:197:0x031f  */
    /* JADX WARN: Code duplicated, block: B:199:0x0325  */
    /* JADX WARN: Code duplicated, block: B:202:0x033b  */
    /* JADX WARN: Code duplicated, block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00de  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:91:0x0100  */
    /* JADX WARN: Code duplicated, block: B:93:0x010a  */
    /* JADX WARN: Code duplicated, block: B:94:0x010d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0117 A[PHI: r22
      0x0117: PHI (r22v15 int) = (r22v4 int), (r22v10 int), (r22v11 int) binds: [B:97:0x0115, B:107:0x0132, B:106:0x012f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:99:0x011a  */
    public static final void c(String str, z1.r rVar, j3.y0 y0Var, fz.c cVar, int i11, boolean z11, int i12, int i13, g2.y yVar, g gVar, l1.n nVar, final int i14, final int i15) {
        int i16;
        z1.r rVar2;
        int i17;
        j3.y0 y0Var2;
        int i18;
        int i19;
        fz.c cVar2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        boolean zH;
        boolean z12;
        final int i37;
        final g gVar2;
        int i38;
        final j3.y0 y0Var3;
        final fz.c cVar3;
        final int i39;
        final boolean z13;
        final g2.y yVar2;
        x1 x1VarT;
        fz.c cVar4;
        int i40;
        boolean z14;
        int i41;
        int i42;
        g2.y yVar3;
        g gVar3;
        Executor executor;
        j3.y0 y0Var4;
        boolean z15;
        int i43;
        z1.r rVar3;
        z1.r rVarZ;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        boolean z16;
        boolean zD;
        Object objQ;
        j3.y0 y0Var5;
        final String str2 = str;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1040751001);
        if ((i14 & 6) == 0) {
            i16 = (sVar.f(str2) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i44 = i15 & 2;
        if (i44 == 0) {
            if ((i14 & 48) == 0) {
                rVar2 = rVar;
                i16 |= sVar.f(rVar2) ? 32 : 16;
            }
            i17 = i15 & 4;
            if (i17 != 0) {
                if ((i14 & 384) == 0) {
                    y0Var2 = y0Var;
                    if (sVar.f(y0Var2)) {
                        i18 = 256;
                    } else {
                        i18 = 128;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 8;
                if (i19 != 0) {
                    if ((i14 & 3072) == 0) {
                        cVar2 = cVar;
                        if (sVar.h(cVar2)) {
                            i21 = 2048;
                        } else {
                            i21 = 1024;
                        }
                        i16 |= i21;
                    }
                    i22 = i15 & 16;
                    if (i22 != 0) {
                        if ((i14 & 24576) == 0) {
                            i23 = i11;
                            if (sVar.d(i23)) {
                                i24 = 16384;
                            } else {
                                i24 = OSSConstants.DEFAULT_BUFFER_SIZE;
                            }
                            i16 |= i24;
                        }
                        i25 = i15 & 32;
                        if (i25 != 0) {
                            i16 |= 196608;
                        } else if ((i14 & 196608) == 0) {
                            if (sVar.g(z11)) {
                                i26 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                            } else {
                                i26 = 65536;
                            }
                            i16 |= i26;
                        }
                        i27 = i15 & 64;
                        if (i27 != 0) {
                            i16 |= 1572864;
                            i28 = i12;
                        } else {
                            i28 = i12;
                            if ((i14 & 1572864) == 0) {
                                if (sVar.d(i28)) {
                                    i29 = 1048576;
                                } else {
                                    i29 = 524288;
                                }
                                i16 |= i29;
                            }
                        }
                        i30 = i16;
                        i31 = i15 & 128;
                        if (i31 != 0) {
                            if ((i14 & 12582912) == 0) {
                                if (sVar.d(i13)) {
                                    i32 = 8388608;
                                } else {
                                    i32 = 4194304;
                                }
                                i30 |= i32;
                            }
                            i33 = i15 & 256;
                            if (i33 != 0) {
                                if ((i14 & 100663296) == 0) {
                                    if (sVar.h(yVar)) {
                                        i34 = 67108864;
                                    } else {
                                        i34 = 33554432;
                                    }
                                    i30 |= i34;
                                }
                                i35 = i15 & 512;
                                i36 = 805306368;
                                if (i35 == 0) {
                                    i30 |= i36;
                                } else if ((i14 & 805306368) == 0) {
                                    if ((i14 & 1073741824) == 0) {
                                        zH = sVar.f(gVar);
                                    } else {
                                        zH = sVar.h(gVar);
                                    }
                                    if (zH) {
                                        i36 = 536870912;
                                    } else {
                                        i36 = 268435456;
                                    }
                                    i30 |= i36;
                                }
                                if ((i30 & 306783379) != 306783378) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (sVar.T(i30 & 1, z12)) {
                                    if (i44 != 0) {
                                        rVar2 = z1.o.f58481a;
                                    }
                                    if (i17 != 0) {
                                        y0Var2 = j3.y0.f35826d;
                                    }
                                    if (i19 != 0) {
                                        cVar4 = null;
                                    } else {
                                        cVar4 = cVar2;
                                    }
                                    if (i22 != 0) {
                                        i40 = 1;
                                    } else {
                                        i40 = i23;
                                    }
                                    if (i25 != 0) {
                                        z14 = true;
                                    } else {
                                        z14 = z11;
                                    }
                                    if (i27 != 0) {
                                        i41 = Integer.MAX_VALUE;
                                    } else {
                                        i41 = i28;
                                    }
                                    if (i31 != 0) {
                                        i42 = 1;
                                    } else {
                                        i42 = i13;
                                    }
                                    if (i33 != 0) {
                                        yVar3 = null;
                                    } else {
                                        yVar3 = yVar;
                                    }
                                    if (i35 != 0) {
                                        gVar3 = null;
                                    } else {
                                        gVar3 = gVar;
                                    }
                                    A(i42, i41);
                                    if (sVar.j(d1.j0.f22926a) == null) {
                                        throw new ClassCastException();
                                    }
                                    sVar.d0(356926143);
                                    sVar.p(false);
                                    n3.h hVar2 = (n3.h) sVar.j(z2.g1.f58550k);
                                    int i45 = (i30 & 14) | ((i30 >> 3) & 112);
                                    executor = (Executor) sVar.j(t.f51192a);
                                    if (executor == null && t.b(str2.length())) {
                                        sVar.d0(1254328095);
                                        v3.m mVar = (v3.m) sVar.j(z2.g1.f58552n);
                                        v3.c cVar5 = (v3.c) sVar.j(z2.g1.f58547h);
                                        if (((i45 & 112) ^ 48) > 32) {
                                            try {
                                                if (sVar.f(y0Var2)) {
                                                    z16 = true;
                                                } else if ((i45 & 48) == 32) {
                                                    z16 = true;
                                                } else {
                                                    z16 = false;
                                                }
                                                zD = ((((i45 & 14) ^ 6) <= 4 && sVar.f(str2)) || (i45 & 6) == 4) | z16 | sVar.d(mVar.ordinal()) | sVar.f(cVar5) | sVar.h(hVar2);
                                                objQ = sVar.Q();
                                                if (!zD || objQ == l1.m.f39353a) {
                                                    y0Var5 = y0Var2;
                                                    try {
                                                        objQ = new fb.b0(y0Var5, mVar, str2, cVar5, hVar2, 1);
                                                        y0Var4 = y0Var5;
                                                        try {
                                                            sVar.o0(objQ);
                                                        } catch (RejectedExecutionException unused) {
                                                        }
                                                    } catch (RejectedExecutionException unused2) {
                                                        y0Var4 = y0Var5;
                                                        hVar2 = hVar2;
                                                    }
                                                } else {
                                                    y0Var4 = y0Var2;
                                                }
                                                executor.execute((Runnable) objQ);
                                            } catch (RejectedExecutionException unused3) {
                                                y0Var4 = y0Var2;
                                            }
                                            z15 = false;
                                            sVar.p(false);
                                        } else {
                                            if ((i45 & 48) == 32) {
                                                z16 = true;
                                            } else {
                                                z16 = false;
                                            }
                                            zD = ((((i45 & 14) ^ 6) <= 4 && sVar.f(str2)) || (i45 & 6) == 4) | z16 | sVar.d(mVar.ordinal()) | sVar.f(cVar5) | sVar.h(hVar2);
                                            objQ = sVar.Q();
                                            if (zD) {
                                                y0Var5 = y0Var2;
                                                objQ = new fb.b0(y0Var5, mVar, str2, cVar5, hVar2, 1);
                                                y0Var4 = y0Var5;
                                                sVar.o0(objQ);
                                                executor.execute((Runnable) objQ);
                                            } else {
                                                y0Var5 = y0Var2;
                                                objQ = new fb.b0(y0Var5, mVar, str2, cVar5, hVar2, 1);
                                                y0Var4 = y0Var5;
                                                sVar.o0(objQ);
                                                executor.execute((Runnable) objQ);
                                            }
                                            z15 = false;
                                            sVar.p(false);
                                        }
                                    } else {
                                        y0Var4 = y0Var2;
                                        z15 = false;
                                        sVar.d0(1255196839);
                                        sVar.p(false);
                                    }
                                    if (cVar4 == null || gVar3 != null) {
                                        str2 = str;
                                        i38 = i41;
                                        i43 = i42;
                                        sVar.d0(357244017);
                                        rVar3 = rVar2;
                                        rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                        sVar.p(false);
                                    } else {
                                        sVar.d0(357887763);
                                        sVar.p(z15);
                                        int i46 = i41;
                                        int i47 = i42;
                                        str2 = str;
                                        i38 = i46;
                                        i43 = i47;
                                        rVarZ = rVar2.i(new c1.m(str, y0Var4, hVar2, i40, z14, i46, i47, yVar3));
                                        rVar3 = rVar2;
                                    }
                                    e eVar = e.f51017c;
                                    iHashCode = Long.hashCode(sVar.T);
                                    z1.r rVarC = z1.a.c(sVar, rVarZ);
                                    l1.q1 q1VarL = sVar.l();
                                    y2.k.J.getClass();
                                    iVar = y2.j.f56913b;
                                    sVar.h0();
                                    if (sVar.S) {
                                        sVar.k(iVar);
                                    } else {
                                        sVar.r0();
                                    }
                                    l1.t.J(y2.j.f56917f, eVar, sVar);
                                    l1.t.J(y2.j.f56916e, q1VarL, sVar);
                                    l1.t.J(y2.j.f56915d, rVarC, sVar);
                                    hVar = y2.j.f56918g;
                                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                                    }
                                    sVar.p(true);
                                    rVar2 = rVar3;
                                    y0Var3 = y0Var4;
                                    cVar3 = cVar4;
                                    i39 = i40;
                                    z13 = z14;
                                    i37 = i43;
                                    yVar2 = yVar3;
                                    gVar2 = gVar3;
                                } else {
                                    sVar.W();
                                    i37 = i13;
                                    gVar2 = gVar;
                                    i38 = i28;
                                    y0Var3 = y0Var2;
                                    cVar3 = cVar2;
                                    i39 = i23;
                                    z13 = z11;
                                    yVar2 = yVar;
                                }
                                x1VarT = sVar.t();
                                if (x1VarT != null) {
                                    final z1.r rVar4 = rVar2;
                                    final int i48 = i38;
                                    x1VarT.f39502d = new fz.e() { // from class: s0.r
                                        @Override // fz.e
                                        public final Object invoke(Object obj, Object obj2) {
                                            ((Integer) obj2).getClass();
                                            o0.c(str2, rVar4, y0Var3, cVar3, i39, z13, i48, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                            return qy.b0.f48488a;
                                        }
                                    };
                                }
                            }
                            i30 |= 100663296;
                            i35 = i15 & 512;
                            i36 = 805306368;
                            if (i35 == 0) {
                                i30 |= i36;
                            } else if ((i14 & 805306368) == 0) {
                                if ((i14 & 1073741824) == 0) {
                                    zH = sVar.f(gVar);
                                } else {
                                    zH = sVar.h(gVar);
                                }
                                if (zH) {
                                    i36 = 536870912;
                                } else {
                                    i36 = 268435456;
                                }
                                i30 |= i36;
                            }
                            if ((i30 & 306783379) != 306783378) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (sVar.T(i30 & 1, z12)) {
                                if (i44 != 0) {
                                    rVar2 = z1.o.f58481a;
                                }
                                if (i17 != 0) {
                                    y0Var2 = j3.y0.f35826d;
                                }
                                if (i19 != 0) {
                                    cVar4 = null;
                                } else {
                                    cVar4 = cVar2;
                                }
                                if (i22 != 0) {
                                    i40 = 1;
                                } else {
                                    i40 = i23;
                                }
                                if (i25 != 0) {
                                    z14 = true;
                                } else {
                                    z14 = z11;
                                }
                                if (i27 != 0) {
                                    i41 = Integer.MAX_VALUE;
                                } else {
                                    i41 = i28;
                                }
                                if (i31 != 0) {
                                    i42 = 1;
                                } else {
                                    i42 = i13;
                                }
                                if (i33 != 0) {
                                    yVar3 = null;
                                } else {
                                    yVar3 = yVar;
                                }
                                if (i35 != 0) {
                                    gVar3 = null;
                                } else {
                                    gVar3 = gVar;
                                }
                                A(i42, i41);
                                if (sVar.j(d1.j0.f22926a) == null) {
                                    throw new ClassCastException();
                                }
                                sVar.d0(356926143);
                                sVar.p(false);
                                n3.h hVar3 = (n3.h) sVar.j(z2.g1.f58550k);
                                int i49 = (i30 & 14) | ((i30 >> 3) & 112);
                                executor = (Executor) sVar.j(t.f51192a);
                                if (executor == null) {
                                    y0Var4 = y0Var2;
                                    z15 = false;
                                    sVar.d0(1255196839);
                                    sVar.p(false);
                                } else {
                                    y0Var4 = y0Var2;
                                    z15 = false;
                                    sVar.d0(1255196839);
                                    sVar.p(false);
                                }
                                if (cVar4 == null) {
                                    str2 = str;
                                    i38 = i41;
                                    i43 = i42;
                                    sVar.d0(357244017);
                                    rVar3 = rVar2;
                                    rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                    sVar.p(false);
                                } else {
                                    str2 = str;
                                    i38 = i41;
                                    i43 = i42;
                                    sVar.d0(357244017);
                                    rVar3 = rVar2;
                                    rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                    sVar.p(false);
                                }
                                e eVar2 = e.f51017c;
                                iHashCode = Long.hashCode(sVar.T);
                                z1.r rVarC2 = z1.a.c(sVar, rVarZ);
                                l1.q1 q1VarL2 = sVar.l();
                                y2.k.J.getClass();
                                iVar = y2.j.f56913b;
                                sVar.h0();
                                if (sVar.S) {
                                    sVar.k(iVar);
                                } else {
                                    sVar.r0();
                                }
                                l1.t.J(y2.j.f56917f, eVar2, sVar);
                                l1.t.J(y2.j.f56916e, q1VarL2, sVar);
                                l1.t.J(y2.j.f56915d, rVarC2, sVar);
                                hVar = y2.j.f56918g;
                                if (sVar.S) {
                                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                                } else {
                                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                                }
                                sVar.p(true);
                                rVar2 = rVar3;
                                y0Var3 = y0Var4;
                                cVar3 = cVar4;
                                i39 = i40;
                                z13 = z14;
                                i37 = i43;
                                yVar2 = yVar3;
                                gVar2 = gVar3;
                            } else {
                                sVar.W();
                                i37 = i13;
                                gVar2 = gVar;
                                i38 = i28;
                                y0Var3 = y0Var2;
                                cVar3 = cVar2;
                                i39 = i23;
                                z13 = z11;
                                yVar2 = yVar;
                            }
                            x1VarT = sVar.t();
                            if (x1VarT != null) {
                                final z1.r rVar5 = rVar2;
                                final int i410 = i38;
                                x1VarT.f39502d = new fz.e() { // from class: s0.r
                                    @Override // fz.e
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        o0.c(str2, rVar5, y0Var3, cVar3, i39, z13, i410, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                        return qy.b0.f48488a;
                                    }
                                };
                            }
                        }
                        i30 |= 12582912;
                        i33 = i15 & 256;
                        if (i33 != 0) {
                            if ((i14 & 100663296) == 0) {
                                if (sVar.h(yVar)) {
                                    i34 = 67108864;
                                } else {
                                    i34 = 33554432;
                                }
                                i30 |= i34;
                            }
                            i35 = i15 & 512;
                            i36 = 805306368;
                            if (i35 == 0) {
                                i30 |= i36;
                            } else if ((i14 & 805306368) == 0) {
                                if ((i14 & 1073741824) == 0) {
                                    zH = sVar.f(gVar);
                                } else {
                                    zH = sVar.h(gVar);
                                }
                                if (zH) {
                                    i36 = 536870912;
                                } else {
                                    i36 = 268435456;
                                }
                                i30 |= i36;
                            }
                            if ((i30 & 306783379) != 306783378) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (sVar.T(i30 & 1, z12)) {
                                if (i44 != 0) {
                                    rVar2 = z1.o.f58481a;
                                }
                                if (i17 != 0) {
                                    y0Var2 = j3.y0.f35826d;
                                }
                                if (i19 != 0) {
                                    cVar4 = null;
                                } else {
                                    cVar4 = cVar2;
                                }
                                if (i22 != 0) {
                                    i40 = 1;
                                } else {
                                    i40 = i23;
                                }
                                if (i25 != 0) {
                                    z14 = true;
                                } else {
                                    z14 = z11;
                                }
                                if (i27 != 0) {
                                    i41 = Integer.MAX_VALUE;
                                } else {
                                    i41 = i28;
                                }
                                if (i31 != 0) {
                                    i42 = 1;
                                } else {
                                    i42 = i13;
                                }
                                if (i33 != 0) {
                                    yVar3 = null;
                                } else {
                                    yVar3 = yVar;
                                }
                                if (i35 != 0) {
                                    gVar3 = null;
                                } else {
                                    gVar3 = gVar;
                                }
                                A(i42, i41);
                                if (sVar.j(d1.j0.f22926a) == null) {
                                    throw new ClassCastException();
                                }
                                sVar.d0(356926143);
                                sVar.p(false);
                                n3.h hVar4 = (n3.h) sVar.j(z2.g1.f58550k);
                                int i411 = (i30 & 14) | ((i30 >> 3) & 112);
                                executor = (Executor) sVar.j(t.f51192a);
                                if (executor == null) {
                                    y0Var4 = y0Var2;
                                    z15 = false;
                                    sVar.d0(1255196839);
                                    sVar.p(false);
                                } else {
                                    y0Var4 = y0Var2;
                                    z15 = false;
                                    sVar.d0(1255196839);
                                    sVar.p(false);
                                }
                                if (cVar4 == null) {
                                    str2 = str;
                                    i38 = i41;
                                    i43 = i42;
                                    sVar.d0(357244017);
                                    rVar3 = rVar2;
                                    rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                    sVar.p(false);
                                } else {
                                    str2 = str;
                                    i38 = i41;
                                    i43 = i42;
                                    sVar.d0(357244017);
                                    rVar3 = rVar2;
                                    rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                    sVar.p(false);
                                }
                                e eVar3 = e.f51017c;
                                iHashCode = Long.hashCode(sVar.T);
                                z1.r rVarC3 = z1.a.c(sVar, rVarZ);
                                l1.q1 q1VarL3 = sVar.l();
                                y2.k.J.getClass();
                                iVar = y2.j.f56913b;
                                sVar.h0();
                                if (sVar.S) {
                                    sVar.k(iVar);
                                } else {
                                    sVar.r0();
                                }
                                l1.t.J(y2.j.f56917f, eVar3, sVar);
                                l1.t.J(y2.j.f56916e, q1VarL3, sVar);
                                l1.t.J(y2.j.f56915d, rVarC3, sVar);
                                hVar = y2.j.f56918g;
                                if (sVar.S) {
                                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                                } else {
                                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                                }
                                sVar.p(true);
                                rVar2 = rVar3;
                                y0Var3 = y0Var4;
                                cVar3 = cVar4;
                                i39 = i40;
                                z13 = z14;
                                i37 = i43;
                                yVar2 = yVar3;
                                gVar2 = gVar3;
                            } else {
                                sVar.W();
                                i37 = i13;
                                gVar2 = gVar;
                                i38 = i28;
                                y0Var3 = y0Var2;
                                cVar3 = cVar2;
                                i39 = i23;
                                z13 = z11;
                                yVar2 = yVar;
                            }
                            x1VarT = sVar.t();
                            if (x1VarT != null) {
                                final z1.r rVar6 = rVar2;
                                final int i412 = i38;
                                x1VarT.f39502d = new fz.e() { // from class: s0.r
                                    @Override // fz.e
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        o0.c(str2, rVar6, y0Var3, cVar3, i39, z13, i412, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                        return qy.b0.f48488a;
                                    }
                                };
                            }
                        }
                        i30 |= 100663296;
                        i35 = i15 & 512;
                        i36 = 805306368;
                        if (i35 == 0) {
                            i30 |= i36;
                        } else if ((i14 & 805306368) == 0) {
                            if ((i14 & 1073741824) == 0) {
                                zH = sVar.f(gVar);
                            } else {
                                zH = sVar.h(gVar);
                            }
                            if (zH) {
                                i36 = 536870912;
                            } else {
                                i36 = 268435456;
                            }
                            i30 |= i36;
                        }
                        if ((i30 & 306783379) != 306783378) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (sVar.T(i30 & 1, z12)) {
                            if (i44 != 0) {
                                rVar2 = z1.o.f58481a;
                            }
                            if (i17 != 0) {
                                y0Var2 = j3.y0.f35826d;
                            }
                            if (i19 != 0) {
                                cVar4 = null;
                            } else {
                                cVar4 = cVar2;
                            }
                            if (i22 != 0) {
                                i40 = 1;
                            } else {
                                i40 = i23;
                            }
                            if (i25 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i27 != 0) {
                                i41 = Integer.MAX_VALUE;
                            } else {
                                i41 = i28;
                            }
                            if (i31 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i13;
                            }
                            if (i33 != 0) {
                                yVar3 = null;
                            } else {
                                yVar3 = yVar;
                            }
                            if (i35 != 0) {
                                gVar3 = null;
                            } else {
                                gVar3 = gVar;
                            }
                            A(i42, i41);
                            if (sVar.j(d1.j0.f22926a) == null) {
                                throw new ClassCastException();
                            }
                            sVar.d0(356926143);
                            sVar.p(false);
                            n3.h hVar5 = (n3.h) sVar.j(z2.g1.f58550k);
                            int i413 = (i30 & 14) | ((i30 >> 3) & 112);
                            executor = (Executor) sVar.j(t.f51192a);
                            if (executor == null) {
                                y0Var4 = y0Var2;
                                z15 = false;
                                sVar.d0(1255196839);
                                sVar.p(false);
                            } else {
                                y0Var4 = y0Var2;
                                z15 = false;
                                sVar.d0(1255196839);
                                sVar.p(false);
                            }
                            if (cVar4 == null) {
                                str2 = str;
                                i38 = i41;
                                i43 = i42;
                                sVar.d0(357244017);
                                rVar3 = rVar2;
                                rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                sVar.p(false);
                            } else {
                                str2 = str;
                                i38 = i41;
                                i43 = i42;
                                sVar.d0(357244017);
                                rVar3 = rVar2;
                                rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                sVar.p(false);
                            }
                            e eVar4 = e.f51017c;
                            iHashCode = Long.hashCode(sVar.T);
                            z1.r rVarC4 = z1.a.c(sVar, rVarZ);
                            l1.q1 q1VarL4 = sVar.l();
                            y2.k.J.getClass();
                            iVar = y2.j.f56913b;
                            sVar.h0();
                            if (sVar.S) {
                                sVar.k(iVar);
                            } else {
                                sVar.r0();
                            }
                            l1.t.J(y2.j.f56917f, eVar4, sVar);
                            l1.t.J(y2.j.f56916e, q1VarL4, sVar);
                            l1.t.J(y2.j.f56915d, rVarC4, sVar);
                            hVar = y2.j.f56918g;
                            if (sVar.S) {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            } else {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            }
                            sVar.p(true);
                            rVar2 = rVar3;
                            y0Var3 = y0Var4;
                            cVar3 = cVar4;
                            i39 = i40;
                            z13 = z14;
                            i37 = i43;
                            yVar2 = yVar3;
                            gVar2 = gVar3;
                        } else {
                            sVar.W();
                            i37 = i13;
                            gVar2 = gVar;
                            i38 = i28;
                            y0Var3 = y0Var2;
                            cVar3 = cVar2;
                            i39 = i23;
                            z13 = z11;
                            yVar2 = yVar;
                        }
                        x1VarT = sVar.t();
                        if (x1VarT != null) {
                            final z1.r rVar7 = rVar2;
                            final int i414 = i38;
                            x1VarT.f39502d = new fz.e() { // from class: s0.r
                                @Override // fz.e
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    o0.c(str2, rVar7, y0Var3, cVar3, i39, z13, i414, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                    return qy.b0.f48488a;
                                }
                            };
                        }
                    }
                    i16 |= 24576;
                    i23 = i11;
                    i25 = i15 & 32;
                    if (i25 != 0) {
                        i16 |= 196608;
                    } else if ((i14 & 196608) == 0) {
                        if (sVar.g(z11)) {
                            i26 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                        } else {
                            i26 = 65536;
                        }
                        i16 |= i26;
                    }
                    i27 = i15 & 64;
                    if (i27 != 0) {
                        i16 |= 1572864;
                        i28 = i12;
                    } else {
                        i28 = i12;
                        if ((i14 & 1572864) == 0) {
                            if (sVar.d(i28)) {
                                i29 = 1048576;
                            } else {
                                i29 = 524288;
                            }
                            i16 |= i29;
                        }
                    }
                    i30 = i16;
                    i31 = i15 & 128;
                    if (i31 != 0) {
                        if ((i14 & 12582912) == 0) {
                            if (sVar.d(i13)) {
                                i32 = 8388608;
                            } else {
                                i32 = 4194304;
                            }
                            i30 |= i32;
                        }
                        i33 = i15 & 256;
                        if (i33 != 0) {
                            if ((i14 & 100663296) == 0) {
                                if (sVar.h(yVar)) {
                                    i34 = 67108864;
                                } else {
                                    i34 = 33554432;
                                }
                                i30 |= i34;
                            }
                            i35 = i15 & 512;
                            i36 = 805306368;
                            if (i35 == 0) {
                                i30 |= i36;
                            } else if ((i14 & 805306368) == 0) {
                                if ((i14 & 1073741824) == 0) {
                                    zH = sVar.f(gVar);
                                } else {
                                    zH = sVar.h(gVar);
                                }
                                if (zH) {
                                    i36 = 536870912;
                                } else {
                                    i36 = 268435456;
                                }
                                i30 |= i36;
                            }
                            if ((i30 & 306783379) != 306783378) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (sVar.T(i30 & 1, z12)) {
                                if (i44 != 0) {
                                    rVar2 = z1.o.f58481a;
                                }
                                if (i17 != 0) {
                                    y0Var2 = j3.y0.f35826d;
                                }
                                if (i19 != 0) {
                                    cVar4 = null;
                                } else {
                                    cVar4 = cVar2;
                                }
                                if (i22 != 0) {
                                    i40 = 1;
                                } else {
                                    i40 = i23;
                                }
                                if (i25 != 0) {
                                    z14 = true;
                                } else {
                                    z14 = z11;
                                }
                                if (i27 != 0) {
                                    i41 = Integer.MAX_VALUE;
                                } else {
                                    i41 = i28;
                                }
                                if (i31 != 0) {
                                    i42 = 1;
                                } else {
                                    i42 = i13;
                                }
                                if (i33 != 0) {
                                    yVar3 = null;
                                } else {
                                    yVar3 = yVar;
                                }
                                if (i35 != 0) {
                                    gVar3 = null;
                                } else {
                                    gVar3 = gVar;
                                }
                                A(i42, i41);
                                if (sVar.j(d1.j0.f22926a) == null) {
                                    throw new ClassCastException();
                                }
                                sVar.d0(356926143);
                                sVar.p(false);
                                n3.h hVar6 = (n3.h) sVar.j(z2.g1.f58550k);
                                int i415 = (i30 & 14) | ((i30 >> 3) & 112);
                                executor = (Executor) sVar.j(t.f51192a);
                                if (executor == null) {
                                    y0Var4 = y0Var2;
                                    z15 = false;
                                    sVar.d0(1255196839);
                                    sVar.p(false);
                                } else {
                                    y0Var4 = y0Var2;
                                    z15 = false;
                                    sVar.d0(1255196839);
                                    sVar.p(false);
                                }
                                if (cVar4 == null) {
                                    str2 = str;
                                    i38 = i41;
                                    i43 = i42;
                                    sVar.d0(357244017);
                                    rVar3 = rVar2;
                                    rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                    sVar.p(false);
                                } else {
                                    str2 = str;
                                    i38 = i41;
                                    i43 = i42;
                                    sVar.d0(357244017);
                                    rVar3 = rVar2;
                                    rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                    sVar.p(false);
                                }
                                e eVar5 = e.f51017c;
                                iHashCode = Long.hashCode(sVar.T);
                                z1.r rVarC5 = z1.a.c(sVar, rVarZ);
                                l1.q1 q1VarL5 = sVar.l();
                                y2.k.J.getClass();
                                iVar = y2.j.f56913b;
                                sVar.h0();
                                if (sVar.S) {
                                    sVar.k(iVar);
                                } else {
                                    sVar.r0();
                                }
                                l1.t.J(y2.j.f56917f, eVar5, sVar);
                                l1.t.J(y2.j.f56916e, q1VarL5, sVar);
                                l1.t.J(y2.j.f56915d, rVarC5, sVar);
                                hVar = y2.j.f56918g;
                                if (sVar.S) {
                                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                                } else {
                                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                                }
                                sVar.p(true);
                                rVar2 = rVar3;
                                y0Var3 = y0Var4;
                                cVar3 = cVar4;
                                i39 = i40;
                                z13 = z14;
                                i37 = i43;
                                yVar2 = yVar3;
                                gVar2 = gVar3;
                            } else {
                                sVar.W();
                                i37 = i13;
                                gVar2 = gVar;
                                i38 = i28;
                                y0Var3 = y0Var2;
                                cVar3 = cVar2;
                                i39 = i23;
                                z13 = z11;
                                yVar2 = yVar;
                            }
                            x1VarT = sVar.t();
                            if (x1VarT != null) {
                                final z1.r rVar8 = rVar2;
                                final int i416 = i38;
                                x1VarT.f39502d = new fz.e() { // from class: s0.r
                                    @Override // fz.e
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        o0.c(str2, rVar8, y0Var3, cVar3, i39, z13, i416, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                        return qy.b0.f48488a;
                                    }
                                };
                            }
                        }
                        i30 |= 100663296;
                        i35 = i15 & 512;
                        i36 = 805306368;
                        if (i35 == 0) {
                            i30 |= i36;
                        } else if ((i14 & 805306368) == 0) {
                            if ((i14 & 1073741824) == 0) {
                                zH = sVar.f(gVar);
                            } else {
                                zH = sVar.h(gVar);
                            }
                            if (zH) {
                                i36 = 536870912;
                            } else {
                                i36 = 268435456;
                            }
                            i30 |= i36;
                        }
                        if ((i30 & 306783379) != 306783378) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (sVar.T(i30 & 1, z12)) {
                            if (i44 != 0) {
                                rVar2 = z1.o.f58481a;
                            }
                            if (i17 != 0) {
                                y0Var2 = j3.y0.f35826d;
                            }
                            if (i19 != 0) {
                                cVar4 = null;
                            } else {
                                cVar4 = cVar2;
                            }
                            if (i22 != 0) {
                                i40 = 1;
                            } else {
                                i40 = i23;
                            }
                            if (i25 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i27 != 0) {
                                i41 = Integer.MAX_VALUE;
                            } else {
                                i41 = i28;
                            }
                            if (i31 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i13;
                            }
                            if (i33 != 0) {
                                yVar3 = null;
                            } else {
                                yVar3 = yVar;
                            }
                            if (i35 != 0) {
                                gVar3 = null;
                            } else {
                                gVar3 = gVar;
                            }
                            A(i42, i41);
                            if (sVar.j(d1.j0.f22926a) == null) {
                                throw new ClassCastException();
                            }
                            sVar.d0(356926143);
                            sVar.p(false);
                            n3.h hVar7 = (n3.h) sVar.j(z2.g1.f58550k);
                            int i417 = (i30 & 14) | ((i30 >> 3) & 112);
                            executor = (Executor) sVar.j(t.f51192a);
                            if (executor == null) {
                                y0Var4 = y0Var2;
                                z15 = false;
                                sVar.d0(1255196839);
                                sVar.p(false);
                            } else {
                                y0Var4 = y0Var2;
                                z15 = false;
                                sVar.d0(1255196839);
                                sVar.p(false);
                            }
                            if (cVar4 == null) {
                                str2 = str;
                                i38 = i41;
                                i43 = i42;
                                sVar.d0(357244017);
                                rVar3 = rVar2;
                                rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                sVar.p(false);
                            } else {
                                str2 = str;
                                i38 = i41;
                                i43 = i42;
                                sVar.d0(357244017);
                                rVar3 = rVar2;
                                rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                sVar.p(false);
                            }
                            e eVar6 = e.f51017c;
                            iHashCode = Long.hashCode(sVar.T);
                            z1.r rVarC6 = z1.a.c(sVar, rVarZ);
                            l1.q1 q1VarL6 = sVar.l();
                            y2.k.J.getClass();
                            iVar = y2.j.f56913b;
                            sVar.h0();
                            if (sVar.S) {
                                sVar.k(iVar);
                            } else {
                                sVar.r0();
                            }
                            l1.t.J(y2.j.f56917f, eVar6, sVar);
                            l1.t.J(y2.j.f56916e, q1VarL6, sVar);
                            l1.t.J(y2.j.f56915d, rVarC6, sVar);
                            hVar = y2.j.f56918g;
                            if (sVar.S) {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            } else {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            }
                            sVar.p(true);
                            rVar2 = rVar3;
                            y0Var3 = y0Var4;
                            cVar3 = cVar4;
                            i39 = i40;
                            z13 = z14;
                            i37 = i43;
                            yVar2 = yVar3;
                            gVar2 = gVar3;
                        } else {
                            sVar.W();
                            i37 = i13;
                            gVar2 = gVar;
                            i38 = i28;
                            y0Var3 = y0Var2;
                            cVar3 = cVar2;
                            i39 = i23;
                            z13 = z11;
                            yVar2 = yVar;
                        }
                        x1VarT = sVar.t();
                        if (x1VarT != null) {
                            final z1.r rVar9 = rVar2;
                            final int i418 = i38;
                            x1VarT.f39502d = new fz.e() { // from class: s0.r
                                @Override // fz.e
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    o0.c(str2, rVar9, y0Var3, cVar3, i39, z13, i418, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                    return qy.b0.f48488a;
                                }
                            };
                        }
                    }
                    i30 |= 12582912;
                    i33 = i15 & 256;
                    if (i33 != 0) {
                        if ((i14 & 100663296) == 0) {
                            if (sVar.h(yVar)) {
                                i34 = 67108864;
                            } else {
                                i34 = 33554432;
                            }
                            i30 |= i34;
                        }
                        i35 = i15 & 512;
                        i36 = 805306368;
                        if (i35 == 0) {
                            i30 |= i36;
                        } else if ((i14 & 805306368) == 0) {
                            if ((i14 & 1073741824) == 0) {
                                zH = sVar.f(gVar);
                            } else {
                                zH = sVar.h(gVar);
                            }
                            if (zH) {
                                i36 = 536870912;
                            } else {
                                i36 = 268435456;
                            }
                            i30 |= i36;
                        }
                        if ((i30 & 306783379) != 306783378) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (sVar.T(i30 & 1, z12)) {
                            if (i44 != 0) {
                                rVar2 = z1.o.f58481a;
                            }
                            if (i17 != 0) {
                                y0Var2 = j3.y0.f35826d;
                            }
                            if (i19 != 0) {
                                cVar4 = null;
                            } else {
                                cVar4 = cVar2;
                            }
                            if (i22 != 0) {
                                i40 = 1;
                            } else {
                                i40 = i23;
                            }
                            if (i25 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i27 != 0) {
                                i41 = Integer.MAX_VALUE;
                            } else {
                                i41 = i28;
                            }
                            if (i31 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i13;
                            }
                            if (i33 != 0) {
                                yVar3 = null;
                            } else {
                                yVar3 = yVar;
                            }
                            if (i35 != 0) {
                                gVar3 = null;
                            } else {
                                gVar3 = gVar;
                            }
                            A(i42, i41);
                            if (sVar.j(d1.j0.f22926a) == null) {
                                throw new ClassCastException();
                            }
                            sVar.d0(356926143);
                            sVar.p(false);
                            n3.h hVar8 = (n3.h) sVar.j(z2.g1.f58550k);
                            int i419 = (i30 & 14) | ((i30 >> 3) & 112);
                            executor = (Executor) sVar.j(t.f51192a);
                            if (executor == null) {
                                y0Var4 = y0Var2;
                                z15 = false;
                                sVar.d0(1255196839);
                                sVar.p(false);
                            } else {
                                y0Var4 = y0Var2;
                                z15 = false;
                                sVar.d0(1255196839);
                                sVar.p(false);
                            }
                            if (cVar4 == null) {
                                str2 = str;
                                i38 = i41;
                                i43 = i42;
                                sVar.d0(357244017);
                                rVar3 = rVar2;
                                rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                sVar.p(false);
                            } else {
                                str2 = str;
                                i38 = i41;
                                i43 = i42;
                                sVar.d0(357244017);
                                rVar3 = rVar2;
                                rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                sVar.p(false);
                            }
                            e eVar7 = e.f51017c;
                            iHashCode = Long.hashCode(sVar.T);
                            z1.r rVarC7 = z1.a.c(sVar, rVarZ);
                            l1.q1 q1VarL7 = sVar.l();
                            y2.k.J.getClass();
                            iVar = y2.j.f56913b;
                            sVar.h0();
                            if (sVar.S) {
                                sVar.k(iVar);
                            } else {
                                sVar.r0();
                            }
                            l1.t.J(y2.j.f56917f, eVar7, sVar);
                            l1.t.J(y2.j.f56916e, q1VarL7, sVar);
                            l1.t.J(y2.j.f56915d, rVarC7, sVar);
                            hVar = y2.j.f56918g;
                            if (sVar.S) {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            } else {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            }
                            sVar.p(true);
                            rVar2 = rVar3;
                            y0Var3 = y0Var4;
                            cVar3 = cVar4;
                            i39 = i40;
                            z13 = z14;
                            i37 = i43;
                            yVar2 = yVar3;
                            gVar2 = gVar3;
                        } else {
                            sVar.W();
                            i37 = i13;
                            gVar2 = gVar;
                            i38 = i28;
                            y0Var3 = y0Var2;
                            cVar3 = cVar2;
                            i39 = i23;
                            z13 = z11;
                            yVar2 = yVar;
                        }
                        x1VarT = sVar.t();
                        if (x1VarT != null) {
                            final z1.r rVar10 = rVar2;
                            final int i4110 = i38;
                            x1VarT.f39502d = new fz.e() { // from class: s0.r
                                @Override // fz.e
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    o0.c(str2, rVar10, y0Var3, cVar3, i39, z13, i4110, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                    return qy.b0.f48488a;
                                }
                            };
                        }
                    }
                    i30 |= 100663296;
                    i35 = i15 & 512;
                    i36 = 805306368;
                    if (i35 == 0) {
                        i30 |= i36;
                    } else if ((i14 & 805306368) == 0) {
                        if ((i14 & 1073741824) == 0) {
                            zH = sVar.f(gVar);
                        } else {
                            zH = sVar.h(gVar);
                        }
                        if (zH) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i30 |= i36;
                    }
                    if ((i30 & 306783379) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (sVar.T(i30 & 1, z12)) {
                        if (i44 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i17 != 0) {
                            y0Var2 = j3.y0.f35826d;
                        }
                        if (i19 != 0) {
                            cVar4 = null;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i22 != 0) {
                            i40 = 1;
                        } else {
                            i40 = i23;
                        }
                        if (i25 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i27 != 0) {
                            i41 = Integer.MAX_VALUE;
                        } else {
                            i41 = i28;
                        }
                        if (i31 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i13;
                        }
                        if (i33 != 0) {
                            yVar3 = null;
                        } else {
                            yVar3 = yVar;
                        }
                        if (i35 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        A(i42, i41);
                        if (sVar.j(d1.j0.f22926a) == null) {
                            throw new ClassCastException();
                        }
                        sVar.d0(356926143);
                        sVar.p(false);
                        n3.h hVar9 = (n3.h) sVar.j(z2.g1.f58550k);
                        int i4111 = (i30 & 14) | ((i30 >> 3) & 112);
                        executor = (Executor) sVar.j(t.f51192a);
                        if (executor == null) {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        } else {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        }
                        if (cVar4 == null) {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        } else {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        }
                        e eVar8 = e.f51017c;
                        iHashCode = Long.hashCode(sVar.T);
                        z1.r rVarC8 = z1.a.c(sVar, rVarZ);
                        l1.q1 q1VarL8 = sVar.l();
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, eVar8, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL8, sVar);
                        l1.t.J(y2.j.f56915d, rVarC8, sVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        sVar.p(true);
                        rVar2 = rVar3;
                        y0Var3 = y0Var4;
                        cVar3 = cVar4;
                        i39 = i40;
                        z13 = z14;
                        i37 = i43;
                        yVar2 = yVar3;
                        gVar2 = gVar3;
                    } else {
                        sVar.W();
                        i37 = i13;
                        gVar2 = gVar;
                        i38 = i28;
                        y0Var3 = y0Var2;
                        cVar3 = cVar2;
                        i39 = i23;
                        z13 = z11;
                        yVar2 = yVar;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        final z1.r rVar11 = rVar2;
                        final int i4112 = i38;
                        x1VarT.f39502d = new fz.e() { // from class: s0.r
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                o0.c(str2, rVar11, y0Var3, cVar3, i39, z13, i4112, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i16 |= 3072;
                cVar2 = cVar;
                i22 = i15 & 16;
                if (i22 != 0) {
                    if ((i14 & 24576) == 0) {
                        i23 = i11;
                        if (sVar.d(i23)) {
                            i24 = 16384;
                        } else {
                            i24 = OSSConstants.DEFAULT_BUFFER_SIZE;
                        }
                        i16 |= i24;
                    }
                    i25 = i15 & 32;
                    if (i25 != 0) {
                        i16 |= 196608;
                    } else if ((i14 & 196608) == 0) {
                        if (sVar.g(z11)) {
                            i26 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                        } else {
                            i26 = 65536;
                        }
                        i16 |= i26;
                    }
                    i27 = i15 & 64;
                    if (i27 != 0) {
                        i16 |= 1572864;
                        i28 = i12;
                    } else {
                        i28 = i12;
                        if ((i14 & 1572864) == 0) {
                            if (sVar.d(i28)) {
                                i29 = 1048576;
                            } else {
                                i29 = 524288;
                            }
                            i16 |= i29;
                        }
                    }
                    i30 = i16;
                    i31 = i15 & 128;
                    if (i31 != 0) {
                        if ((i14 & 12582912) == 0) {
                            if (sVar.d(i13)) {
                                i32 = 8388608;
                            } else {
                                i32 = 4194304;
                            }
                            i30 |= i32;
                        }
                        i33 = i15 & 256;
                        if (i33 != 0) {
                            if ((i14 & 100663296) == 0) {
                                if (sVar.h(yVar)) {
                                    i34 = 67108864;
                                } else {
                                    i34 = 33554432;
                                }
                                i30 |= i34;
                            }
                            i35 = i15 & 512;
                            i36 = 805306368;
                            if (i35 == 0) {
                                i30 |= i36;
                            } else if ((i14 & 805306368) == 0) {
                                if ((i14 & 1073741824) == 0) {
                                    zH = sVar.f(gVar);
                                } else {
                                    zH = sVar.h(gVar);
                                }
                                if (zH) {
                                    i36 = 536870912;
                                } else {
                                    i36 = 268435456;
                                }
                                i30 |= i36;
                            }
                            if ((i30 & 306783379) != 306783378) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (sVar.T(i30 & 1, z12)) {
                                if (i44 != 0) {
                                    rVar2 = z1.o.f58481a;
                                }
                                if (i17 != 0) {
                                    y0Var2 = j3.y0.f35826d;
                                }
                                if (i19 != 0) {
                                    cVar4 = null;
                                } else {
                                    cVar4 = cVar2;
                                }
                                if (i22 != 0) {
                                    i40 = 1;
                                } else {
                                    i40 = i23;
                                }
                                if (i25 != 0) {
                                    z14 = true;
                                } else {
                                    z14 = z11;
                                }
                                if (i27 != 0) {
                                    i41 = Integer.MAX_VALUE;
                                } else {
                                    i41 = i28;
                                }
                                if (i31 != 0) {
                                    i42 = 1;
                                } else {
                                    i42 = i13;
                                }
                                if (i33 != 0) {
                                    yVar3 = null;
                                } else {
                                    yVar3 = yVar;
                                }
                                if (i35 != 0) {
                                    gVar3 = null;
                                } else {
                                    gVar3 = gVar;
                                }
                                A(i42, i41);
                                if (sVar.j(d1.j0.f22926a) == null) {
                                    throw new ClassCastException();
                                }
                                sVar.d0(356926143);
                                sVar.p(false);
                                n3.h hVar10 = (n3.h) sVar.j(z2.g1.f58550k);
                                int i4113 = (i30 & 14) | ((i30 >> 3) & 112);
                                executor = (Executor) sVar.j(t.f51192a);
                                if (executor == null) {
                                    y0Var4 = y0Var2;
                                    z15 = false;
                                    sVar.d0(1255196839);
                                    sVar.p(false);
                                } else {
                                    y0Var4 = y0Var2;
                                    z15 = false;
                                    sVar.d0(1255196839);
                                    sVar.p(false);
                                }
                                if (cVar4 == null) {
                                    str2 = str;
                                    i38 = i41;
                                    i43 = i42;
                                    sVar.d0(357244017);
                                    rVar3 = rVar2;
                                    rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                    sVar.p(false);
                                } else {
                                    str2 = str;
                                    i38 = i41;
                                    i43 = i42;
                                    sVar.d0(357244017);
                                    rVar3 = rVar2;
                                    rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                    sVar.p(false);
                                }
                                e eVar9 = e.f51017c;
                                iHashCode = Long.hashCode(sVar.T);
                                z1.r rVarC9 = z1.a.c(sVar, rVarZ);
                                l1.q1 q1VarL9 = sVar.l();
                                y2.k.J.getClass();
                                iVar = y2.j.f56913b;
                                sVar.h0();
                                if (sVar.S) {
                                    sVar.k(iVar);
                                } else {
                                    sVar.r0();
                                }
                                l1.t.J(y2.j.f56917f, eVar9, sVar);
                                l1.t.J(y2.j.f56916e, q1VarL9, sVar);
                                l1.t.J(y2.j.f56915d, rVarC9, sVar);
                                hVar = y2.j.f56918g;
                                if (sVar.S) {
                                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                                } else {
                                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                                }
                                sVar.p(true);
                                rVar2 = rVar3;
                                y0Var3 = y0Var4;
                                cVar3 = cVar4;
                                i39 = i40;
                                z13 = z14;
                                i37 = i43;
                                yVar2 = yVar3;
                                gVar2 = gVar3;
                            } else {
                                sVar.W();
                                i37 = i13;
                                gVar2 = gVar;
                                i38 = i28;
                                y0Var3 = y0Var2;
                                cVar3 = cVar2;
                                i39 = i23;
                                z13 = z11;
                                yVar2 = yVar;
                            }
                            x1VarT = sVar.t();
                            if (x1VarT != null) {
                                final z1.r rVar12 = rVar2;
                                final int i4114 = i38;
                                x1VarT.f39502d = new fz.e() { // from class: s0.r
                                    @Override // fz.e
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        o0.c(str2, rVar12, y0Var3, cVar3, i39, z13, i4114, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                        return qy.b0.f48488a;
                                    }
                                };
                            }
                        }
                        i30 |= 100663296;
                        i35 = i15 & 512;
                        i36 = 805306368;
                        if (i35 == 0) {
                            i30 |= i36;
                        } else if ((i14 & 805306368) == 0) {
                            if ((i14 & 1073741824) == 0) {
                                zH = sVar.f(gVar);
                            } else {
                                zH = sVar.h(gVar);
                            }
                            if (zH) {
                                i36 = 536870912;
                            } else {
                                i36 = 268435456;
                            }
                            i30 |= i36;
                        }
                        if ((i30 & 306783379) != 306783378) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (sVar.T(i30 & 1, z12)) {
                            if (i44 != 0) {
                                rVar2 = z1.o.f58481a;
                            }
                            if (i17 != 0) {
                                y0Var2 = j3.y0.f35826d;
                            }
                            if (i19 != 0) {
                                cVar4 = null;
                            } else {
                                cVar4 = cVar2;
                            }
                            if (i22 != 0) {
                                i40 = 1;
                            } else {
                                i40 = i23;
                            }
                            if (i25 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i27 != 0) {
                                i41 = Integer.MAX_VALUE;
                            } else {
                                i41 = i28;
                            }
                            if (i31 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i13;
                            }
                            if (i33 != 0) {
                                yVar3 = null;
                            } else {
                                yVar3 = yVar;
                            }
                            if (i35 != 0) {
                                gVar3 = null;
                            } else {
                                gVar3 = gVar;
                            }
                            A(i42, i41);
                            if (sVar.j(d1.j0.f22926a) == null) {
                                throw new ClassCastException();
                            }
                            sVar.d0(356926143);
                            sVar.p(false);
                            n3.h hVar11 = (n3.h) sVar.j(z2.g1.f58550k);
                            int i4115 = (i30 & 14) | ((i30 >> 3) & 112);
                            executor = (Executor) sVar.j(t.f51192a);
                            if (executor == null) {
                                y0Var4 = y0Var2;
                                z15 = false;
                                sVar.d0(1255196839);
                                sVar.p(false);
                            } else {
                                y0Var4 = y0Var2;
                                z15 = false;
                                sVar.d0(1255196839);
                                sVar.p(false);
                            }
                            if (cVar4 == null) {
                                str2 = str;
                                i38 = i41;
                                i43 = i42;
                                sVar.d0(357244017);
                                rVar3 = rVar2;
                                rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                sVar.p(false);
                            } else {
                                str2 = str;
                                i38 = i41;
                                i43 = i42;
                                sVar.d0(357244017);
                                rVar3 = rVar2;
                                rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                sVar.p(false);
                            }
                            e eVar10 = e.f51017c;
                            iHashCode = Long.hashCode(sVar.T);
                            z1.r rVarC10 = z1.a.c(sVar, rVarZ);
                            l1.q1 q1VarL10 = sVar.l();
                            y2.k.J.getClass();
                            iVar = y2.j.f56913b;
                            sVar.h0();
                            if (sVar.S) {
                                sVar.k(iVar);
                            } else {
                                sVar.r0();
                            }
                            l1.t.J(y2.j.f56917f, eVar10, sVar);
                            l1.t.J(y2.j.f56916e, q1VarL10, sVar);
                            l1.t.J(y2.j.f56915d, rVarC10, sVar);
                            hVar = y2.j.f56918g;
                            if (sVar.S) {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            } else {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            }
                            sVar.p(true);
                            rVar2 = rVar3;
                            y0Var3 = y0Var4;
                            cVar3 = cVar4;
                            i39 = i40;
                            z13 = z14;
                            i37 = i43;
                            yVar2 = yVar3;
                            gVar2 = gVar3;
                        } else {
                            sVar.W();
                            i37 = i13;
                            gVar2 = gVar;
                            i38 = i28;
                            y0Var3 = y0Var2;
                            cVar3 = cVar2;
                            i39 = i23;
                            z13 = z11;
                            yVar2 = yVar;
                        }
                        x1VarT = sVar.t();
                        if (x1VarT != null) {
                            final z1.r rVar13 = rVar2;
                            final int i4116 = i38;
                            x1VarT.f39502d = new fz.e() { // from class: s0.r
                                @Override // fz.e
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    o0.c(str2, rVar13, y0Var3, cVar3, i39, z13, i4116, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                    return qy.b0.f48488a;
                                }
                            };
                        }
                    }
                    i30 |= 12582912;
                    i33 = i15 & 256;
                    if (i33 != 0) {
                        if ((i14 & 100663296) == 0) {
                            if (sVar.h(yVar)) {
                                i34 = 67108864;
                            } else {
                                i34 = 33554432;
                            }
                            i30 |= i34;
                        }
                        i35 = i15 & 512;
                        i36 = 805306368;
                        if (i35 == 0) {
                            i30 |= i36;
                        } else if ((i14 & 805306368) == 0) {
                            if ((i14 & 1073741824) == 0) {
                                zH = sVar.f(gVar);
                            } else {
                                zH = sVar.h(gVar);
                            }
                            if (zH) {
                                i36 = 536870912;
                            } else {
                                i36 = 268435456;
                            }
                            i30 |= i36;
                        }
                        if ((i30 & 306783379) != 306783378) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (sVar.T(i30 & 1, z12)) {
                            if (i44 != 0) {
                                rVar2 = z1.o.f58481a;
                            }
                            if (i17 != 0) {
                                y0Var2 = j3.y0.f35826d;
                            }
                            if (i19 != 0) {
                                cVar4 = null;
                            } else {
                                cVar4 = cVar2;
                            }
                            if (i22 != 0) {
                                i40 = 1;
                            } else {
                                i40 = i23;
                            }
                            if (i25 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i27 != 0) {
                                i41 = Integer.MAX_VALUE;
                            } else {
                                i41 = i28;
                            }
                            if (i31 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i13;
                            }
                            if (i33 != 0) {
                                yVar3 = null;
                            } else {
                                yVar3 = yVar;
                            }
                            if (i35 != 0) {
                                gVar3 = null;
                            } else {
                                gVar3 = gVar;
                            }
                            A(i42, i41);
                            if (sVar.j(d1.j0.f22926a) == null) {
                                throw new ClassCastException();
                            }
                            sVar.d0(356926143);
                            sVar.p(false);
                            n3.h hVar12 = (n3.h) sVar.j(z2.g1.f58550k);
                            int i4117 = (i30 & 14) | ((i30 >> 3) & 112);
                            executor = (Executor) sVar.j(t.f51192a);
                            if (executor == null) {
                                y0Var4 = y0Var2;
                                z15 = false;
                                sVar.d0(1255196839);
                                sVar.p(false);
                            } else {
                                y0Var4 = y0Var2;
                                z15 = false;
                                sVar.d0(1255196839);
                                sVar.p(false);
                            }
                            if (cVar4 == null) {
                                str2 = str;
                                i38 = i41;
                                i43 = i42;
                                sVar.d0(357244017);
                                rVar3 = rVar2;
                                rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                sVar.p(false);
                            } else {
                                str2 = str;
                                i38 = i41;
                                i43 = i42;
                                sVar.d0(357244017);
                                rVar3 = rVar2;
                                rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                sVar.p(false);
                            }
                            e eVar11 = e.f51017c;
                            iHashCode = Long.hashCode(sVar.T);
                            z1.r rVarC11 = z1.a.c(sVar, rVarZ);
                            l1.q1 q1VarL11 = sVar.l();
                            y2.k.J.getClass();
                            iVar = y2.j.f56913b;
                            sVar.h0();
                            if (sVar.S) {
                                sVar.k(iVar);
                            } else {
                                sVar.r0();
                            }
                            l1.t.J(y2.j.f56917f, eVar11, sVar);
                            l1.t.J(y2.j.f56916e, q1VarL11, sVar);
                            l1.t.J(y2.j.f56915d, rVarC11, sVar);
                            hVar = y2.j.f56918g;
                            if (sVar.S) {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            } else {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            }
                            sVar.p(true);
                            rVar2 = rVar3;
                            y0Var3 = y0Var4;
                            cVar3 = cVar4;
                            i39 = i40;
                            z13 = z14;
                            i37 = i43;
                            yVar2 = yVar3;
                            gVar2 = gVar3;
                        } else {
                            sVar.W();
                            i37 = i13;
                            gVar2 = gVar;
                            i38 = i28;
                            y0Var3 = y0Var2;
                            cVar3 = cVar2;
                            i39 = i23;
                            z13 = z11;
                            yVar2 = yVar;
                        }
                        x1VarT = sVar.t();
                        if (x1VarT != null) {
                            final z1.r rVar14 = rVar2;
                            final int i4118 = i38;
                            x1VarT.f39502d = new fz.e() { // from class: s0.r
                                @Override // fz.e
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    o0.c(str2, rVar14, y0Var3, cVar3, i39, z13, i4118, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                    return qy.b0.f48488a;
                                }
                            };
                        }
                    }
                    i30 |= 100663296;
                    i35 = i15 & 512;
                    i36 = 805306368;
                    if (i35 == 0) {
                        i30 |= i36;
                    } else if ((i14 & 805306368) == 0) {
                        if ((i14 & 1073741824) == 0) {
                            zH = sVar.f(gVar);
                        } else {
                            zH = sVar.h(gVar);
                        }
                        if (zH) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i30 |= i36;
                    }
                    if ((i30 & 306783379) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (sVar.T(i30 & 1, z12)) {
                        if (i44 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i17 != 0) {
                            y0Var2 = j3.y0.f35826d;
                        }
                        if (i19 != 0) {
                            cVar4 = null;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i22 != 0) {
                            i40 = 1;
                        } else {
                            i40 = i23;
                        }
                        if (i25 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i27 != 0) {
                            i41 = Integer.MAX_VALUE;
                        } else {
                            i41 = i28;
                        }
                        if (i31 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i13;
                        }
                        if (i33 != 0) {
                            yVar3 = null;
                        } else {
                            yVar3 = yVar;
                        }
                        if (i35 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        A(i42, i41);
                        if (sVar.j(d1.j0.f22926a) == null) {
                            throw new ClassCastException();
                        }
                        sVar.d0(356926143);
                        sVar.p(false);
                        n3.h hVar13 = (n3.h) sVar.j(z2.g1.f58550k);
                        int i4119 = (i30 & 14) | ((i30 >> 3) & 112);
                        executor = (Executor) sVar.j(t.f51192a);
                        if (executor == null) {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        } else {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        }
                        if (cVar4 == null) {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        } else {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        }
                        e eVar12 = e.f51017c;
                        iHashCode = Long.hashCode(sVar.T);
                        z1.r rVarC12 = z1.a.c(sVar, rVarZ);
                        l1.q1 q1VarL12 = sVar.l();
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, eVar12, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL12, sVar);
                        l1.t.J(y2.j.f56915d, rVarC12, sVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        sVar.p(true);
                        rVar2 = rVar3;
                        y0Var3 = y0Var4;
                        cVar3 = cVar4;
                        i39 = i40;
                        z13 = z14;
                        i37 = i43;
                        yVar2 = yVar3;
                        gVar2 = gVar3;
                    } else {
                        sVar.W();
                        i37 = i13;
                        gVar2 = gVar;
                        i38 = i28;
                        y0Var3 = y0Var2;
                        cVar3 = cVar2;
                        i39 = i23;
                        z13 = z11;
                        yVar2 = yVar;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        final z1.r rVar15 = rVar2;
                        final int i41110 = i38;
                        x1VarT.f39502d = new fz.e() { // from class: s0.r
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                o0.c(str2, rVar15, y0Var3, cVar3, i39, z13, i41110, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i16 |= 24576;
                i23 = i11;
                i25 = i15 & 32;
                if (i25 != 0) {
                    i16 |= 196608;
                } else if ((i14 & 196608) == 0) {
                    if (sVar.g(z11)) {
                        i26 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i26 = 65536;
                    }
                    i16 |= i26;
                }
                i27 = i15 & 64;
                if (i27 != 0) {
                    i16 |= 1572864;
                    i28 = i12;
                } else {
                    i28 = i12;
                    if ((i14 & 1572864) == 0) {
                        if (sVar.d(i28)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i16 |= i29;
                    }
                }
                i30 = i16;
                i31 = i15 & 128;
                if (i31 != 0) {
                    if ((i14 & 12582912) == 0) {
                        if (sVar.d(i13)) {
                            i32 = 8388608;
                        } else {
                            i32 = 4194304;
                        }
                        i30 |= i32;
                    }
                    i33 = i15 & 256;
                    if (i33 != 0) {
                        if ((i14 & 100663296) == 0) {
                            if (sVar.h(yVar)) {
                                i34 = 67108864;
                            } else {
                                i34 = 33554432;
                            }
                            i30 |= i34;
                        }
                        i35 = i15 & 512;
                        i36 = 805306368;
                        if (i35 == 0) {
                            i30 |= i36;
                        } else if ((i14 & 805306368) == 0) {
                            if ((i14 & 1073741824) == 0) {
                                zH = sVar.f(gVar);
                            } else {
                                zH = sVar.h(gVar);
                            }
                            if (zH) {
                                i36 = 536870912;
                            } else {
                                i36 = 268435456;
                            }
                            i30 |= i36;
                        }
                        if ((i30 & 306783379) != 306783378) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (sVar.T(i30 & 1, z12)) {
                            if (i44 != 0) {
                                rVar2 = z1.o.f58481a;
                            }
                            if (i17 != 0) {
                                y0Var2 = j3.y0.f35826d;
                            }
                            if (i19 != 0) {
                                cVar4 = null;
                            } else {
                                cVar4 = cVar2;
                            }
                            if (i22 != 0) {
                                i40 = 1;
                            } else {
                                i40 = i23;
                            }
                            if (i25 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i27 != 0) {
                                i41 = Integer.MAX_VALUE;
                            } else {
                                i41 = i28;
                            }
                            if (i31 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i13;
                            }
                            if (i33 != 0) {
                                yVar3 = null;
                            } else {
                                yVar3 = yVar;
                            }
                            if (i35 != 0) {
                                gVar3 = null;
                            } else {
                                gVar3 = gVar;
                            }
                            A(i42, i41);
                            if (sVar.j(d1.j0.f22926a) == null) {
                                throw new ClassCastException();
                            }
                            sVar.d0(356926143);
                            sVar.p(false);
                            n3.h hVar14 = (n3.h) sVar.j(z2.g1.f58550k);
                            int i41111 = (i30 & 14) | ((i30 >> 3) & 112);
                            executor = (Executor) sVar.j(t.f51192a);
                            if (executor == null) {
                                y0Var4 = y0Var2;
                                z15 = false;
                                sVar.d0(1255196839);
                                sVar.p(false);
                            } else {
                                y0Var4 = y0Var2;
                                z15 = false;
                                sVar.d0(1255196839);
                                sVar.p(false);
                            }
                            if (cVar4 == null) {
                                str2 = str;
                                i38 = i41;
                                i43 = i42;
                                sVar.d0(357244017);
                                rVar3 = rVar2;
                                rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                sVar.p(false);
                            } else {
                                str2 = str;
                                i38 = i41;
                                i43 = i42;
                                sVar.d0(357244017);
                                rVar3 = rVar2;
                                rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                sVar.p(false);
                            }
                            e eVar13 = e.f51017c;
                            iHashCode = Long.hashCode(sVar.T);
                            z1.r rVarC13 = z1.a.c(sVar, rVarZ);
                            l1.q1 q1VarL13 = sVar.l();
                            y2.k.J.getClass();
                            iVar = y2.j.f56913b;
                            sVar.h0();
                            if (sVar.S) {
                                sVar.k(iVar);
                            } else {
                                sVar.r0();
                            }
                            l1.t.J(y2.j.f56917f, eVar13, sVar);
                            l1.t.J(y2.j.f56916e, q1VarL13, sVar);
                            l1.t.J(y2.j.f56915d, rVarC13, sVar);
                            hVar = y2.j.f56918g;
                            if (sVar.S) {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            } else {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            }
                            sVar.p(true);
                            rVar2 = rVar3;
                            y0Var3 = y0Var4;
                            cVar3 = cVar4;
                            i39 = i40;
                            z13 = z14;
                            i37 = i43;
                            yVar2 = yVar3;
                            gVar2 = gVar3;
                        } else {
                            sVar.W();
                            i37 = i13;
                            gVar2 = gVar;
                            i38 = i28;
                            y0Var3 = y0Var2;
                            cVar3 = cVar2;
                            i39 = i23;
                            z13 = z11;
                            yVar2 = yVar;
                        }
                        x1VarT = sVar.t();
                        if (x1VarT != null) {
                            final z1.r rVar16 = rVar2;
                            final int i41112 = i38;
                            x1VarT.f39502d = new fz.e() { // from class: s0.r
                                @Override // fz.e
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    o0.c(str2, rVar16, y0Var3, cVar3, i39, z13, i41112, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                    return qy.b0.f48488a;
                                }
                            };
                        }
                    }
                    i30 |= 100663296;
                    i35 = i15 & 512;
                    i36 = 805306368;
                    if (i35 == 0) {
                        i30 |= i36;
                    } else if ((i14 & 805306368) == 0) {
                        if ((i14 & 1073741824) == 0) {
                            zH = sVar.f(gVar);
                        } else {
                            zH = sVar.h(gVar);
                        }
                        if (zH) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i30 |= i36;
                    }
                    if ((i30 & 306783379) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (sVar.T(i30 & 1, z12)) {
                        if (i44 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i17 != 0) {
                            y0Var2 = j3.y0.f35826d;
                        }
                        if (i19 != 0) {
                            cVar4 = null;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i22 != 0) {
                            i40 = 1;
                        } else {
                            i40 = i23;
                        }
                        if (i25 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i27 != 0) {
                            i41 = Integer.MAX_VALUE;
                        } else {
                            i41 = i28;
                        }
                        if (i31 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i13;
                        }
                        if (i33 != 0) {
                            yVar3 = null;
                        } else {
                            yVar3 = yVar;
                        }
                        if (i35 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        A(i42, i41);
                        if (sVar.j(d1.j0.f22926a) == null) {
                            throw new ClassCastException();
                        }
                        sVar.d0(356926143);
                        sVar.p(false);
                        n3.h hVar15 = (n3.h) sVar.j(z2.g1.f58550k);
                        int i41113 = (i30 & 14) | ((i30 >> 3) & 112);
                        executor = (Executor) sVar.j(t.f51192a);
                        if (executor == null) {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        } else {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        }
                        if (cVar4 == null) {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        } else {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        }
                        e eVar14 = e.f51017c;
                        iHashCode = Long.hashCode(sVar.T);
                        z1.r rVarC14 = z1.a.c(sVar, rVarZ);
                        l1.q1 q1VarL14 = sVar.l();
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, eVar14, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL14, sVar);
                        l1.t.J(y2.j.f56915d, rVarC14, sVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        sVar.p(true);
                        rVar2 = rVar3;
                        y0Var3 = y0Var4;
                        cVar3 = cVar4;
                        i39 = i40;
                        z13 = z14;
                        i37 = i43;
                        yVar2 = yVar3;
                        gVar2 = gVar3;
                    } else {
                        sVar.W();
                        i37 = i13;
                        gVar2 = gVar;
                        i38 = i28;
                        y0Var3 = y0Var2;
                        cVar3 = cVar2;
                        i39 = i23;
                        z13 = z11;
                        yVar2 = yVar;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        final z1.r rVar17 = rVar2;
                        final int i41114 = i38;
                        x1VarT.f39502d = new fz.e() { // from class: s0.r
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                o0.c(str2, rVar17, y0Var3, cVar3, i39, z13, i41114, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i30 |= 12582912;
                i33 = i15 & 256;
                if (i33 != 0) {
                    if ((i14 & 100663296) == 0) {
                        if (sVar.h(yVar)) {
                            i34 = 67108864;
                        } else {
                            i34 = 33554432;
                        }
                        i30 |= i34;
                    }
                    i35 = i15 & 512;
                    i36 = 805306368;
                    if (i35 == 0) {
                        i30 |= i36;
                    } else if ((i14 & 805306368) == 0) {
                        if ((i14 & 1073741824) == 0) {
                            zH = sVar.f(gVar);
                        } else {
                            zH = sVar.h(gVar);
                        }
                        if (zH) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i30 |= i36;
                    }
                    if ((i30 & 306783379) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (sVar.T(i30 & 1, z12)) {
                        if (i44 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i17 != 0) {
                            y0Var2 = j3.y0.f35826d;
                        }
                        if (i19 != 0) {
                            cVar4 = null;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i22 != 0) {
                            i40 = 1;
                        } else {
                            i40 = i23;
                        }
                        if (i25 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i27 != 0) {
                            i41 = Integer.MAX_VALUE;
                        } else {
                            i41 = i28;
                        }
                        if (i31 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i13;
                        }
                        if (i33 != 0) {
                            yVar3 = null;
                        } else {
                            yVar3 = yVar;
                        }
                        if (i35 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        A(i42, i41);
                        if (sVar.j(d1.j0.f22926a) == null) {
                            throw new ClassCastException();
                        }
                        sVar.d0(356926143);
                        sVar.p(false);
                        n3.h hVar16 = (n3.h) sVar.j(z2.g1.f58550k);
                        int i41115 = (i30 & 14) | ((i30 >> 3) & 112);
                        executor = (Executor) sVar.j(t.f51192a);
                        if (executor == null) {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        } else {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        }
                        if (cVar4 == null) {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        } else {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        }
                        e eVar15 = e.f51017c;
                        iHashCode = Long.hashCode(sVar.T);
                        z1.r rVarC15 = z1.a.c(sVar, rVarZ);
                        l1.q1 q1VarL15 = sVar.l();
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, eVar15, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL15, sVar);
                        l1.t.J(y2.j.f56915d, rVarC15, sVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        sVar.p(true);
                        rVar2 = rVar3;
                        y0Var3 = y0Var4;
                        cVar3 = cVar4;
                        i39 = i40;
                        z13 = z14;
                        i37 = i43;
                        yVar2 = yVar3;
                        gVar2 = gVar3;
                    } else {
                        sVar.W();
                        i37 = i13;
                        gVar2 = gVar;
                        i38 = i28;
                        y0Var3 = y0Var2;
                        cVar3 = cVar2;
                        i39 = i23;
                        z13 = z11;
                        yVar2 = yVar;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        final z1.r rVar18 = rVar2;
                        final int i41116 = i38;
                        x1VarT.f39502d = new fz.e() { // from class: s0.r
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                o0.c(str2, rVar18, y0Var3, cVar3, i39, z13, i41116, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i30 |= 100663296;
                i35 = i15 & 512;
                i36 = 805306368;
                if (i35 == 0) {
                    i30 |= i36;
                } else if ((i14 & 805306368) == 0) {
                    if ((i14 & 1073741824) == 0) {
                        zH = sVar.f(gVar);
                    } else {
                        zH = sVar.h(gVar);
                    }
                    if (zH) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i30 |= i36;
                }
                if ((i30 & 306783379) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (sVar.T(i30 & 1, z12)) {
                    if (i44 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i17 != 0) {
                        y0Var2 = j3.y0.f35826d;
                    }
                    if (i19 != 0) {
                        cVar4 = null;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i22 != 0) {
                        i40 = 1;
                    } else {
                        i40 = i23;
                    }
                    if (i25 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i27 != 0) {
                        i41 = Integer.MAX_VALUE;
                    } else {
                        i41 = i28;
                    }
                    if (i31 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i13;
                    }
                    if (i33 != 0) {
                        yVar3 = null;
                    } else {
                        yVar3 = yVar;
                    }
                    if (i35 != 0) {
                        gVar3 = null;
                    } else {
                        gVar3 = gVar;
                    }
                    A(i42, i41);
                    if (sVar.j(d1.j0.f22926a) == null) {
                        throw new ClassCastException();
                    }
                    sVar.d0(356926143);
                    sVar.p(false);
                    n3.h hVar17 = (n3.h) sVar.j(z2.g1.f58550k);
                    int i41117 = (i30 & 14) | ((i30 >> 3) & 112);
                    executor = (Executor) sVar.j(t.f51192a);
                    if (executor == null) {
                        y0Var4 = y0Var2;
                        z15 = false;
                        sVar.d0(1255196839);
                        sVar.p(false);
                    } else {
                        y0Var4 = y0Var2;
                        z15 = false;
                        sVar.d0(1255196839);
                        sVar.p(false);
                    }
                    if (cVar4 == null) {
                        str2 = str;
                        i38 = i41;
                        i43 = i42;
                        sVar.d0(357244017);
                        rVar3 = rVar2;
                        rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                        sVar.p(false);
                    } else {
                        str2 = str;
                        i38 = i41;
                        i43 = i42;
                        sVar.d0(357244017);
                        rVar3 = rVar2;
                        rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                        sVar.p(false);
                    }
                    e eVar16 = e.f51017c;
                    iHashCode = Long.hashCode(sVar.T);
                    z1.r rVarC16 = z1.a.c(sVar, rVarZ);
                    l1.q1 q1VarL16 = sVar.l();
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, eVar16, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL16, sVar);
                    l1.t.J(y2.j.f56915d, rVarC16, sVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    sVar.p(true);
                    rVar2 = rVar3;
                    y0Var3 = y0Var4;
                    cVar3 = cVar4;
                    i39 = i40;
                    z13 = z14;
                    i37 = i43;
                    yVar2 = yVar3;
                    gVar2 = gVar3;
                } else {
                    sVar.W();
                    i37 = i13;
                    gVar2 = gVar;
                    i38 = i28;
                    y0Var3 = y0Var2;
                    cVar3 = cVar2;
                    i39 = i23;
                    z13 = z11;
                    yVar2 = yVar;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    final z1.r rVar19 = rVar2;
                    final int i41118 = i38;
                    x1VarT.f39502d = new fz.e() { // from class: s0.r
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            o0.c(str2, rVar19, y0Var3, cVar3, i39, z13, i41118, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i16 |= 384;
            y0Var2 = y0Var;
            i19 = i15 & 8;
            if (i19 != 0) {
                if ((i14 & 3072) == 0) {
                    cVar2 = cVar;
                    if (sVar.h(cVar2)) {
                        i21 = 2048;
                    } else {
                        i21 = 1024;
                    }
                    i16 |= i21;
                }
                i22 = i15 & 16;
                if (i22 != 0) {
                    if ((i14 & 24576) == 0) {
                        i23 = i11;
                        if (sVar.d(i23)) {
                            i24 = 16384;
                        } else {
                            i24 = OSSConstants.DEFAULT_BUFFER_SIZE;
                        }
                        i16 |= i24;
                    }
                    i25 = i15 & 32;
                    if (i25 != 0) {
                        i16 |= 196608;
                    } else if ((i14 & 196608) == 0) {
                        if (sVar.g(z11)) {
                            i26 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                        } else {
                            i26 = 65536;
                        }
                        i16 |= i26;
                    }
                    i27 = i15 & 64;
                    if (i27 != 0) {
                        i16 |= 1572864;
                        i28 = i12;
                    } else {
                        i28 = i12;
                        if ((i14 & 1572864) == 0) {
                            if (sVar.d(i28)) {
                                i29 = 1048576;
                            } else {
                                i29 = 524288;
                            }
                            i16 |= i29;
                        }
                    }
                    i30 = i16;
                    i31 = i15 & 128;
                    if (i31 != 0) {
                        if ((i14 & 12582912) == 0) {
                            if (sVar.d(i13)) {
                                i32 = 8388608;
                            } else {
                                i32 = 4194304;
                            }
                            i30 |= i32;
                        }
                        i33 = i15 & 256;
                        if (i33 != 0) {
                            if ((i14 & 100663296) == 0) {
                                if (sVar.h(yVar)) {
                                    i34 = 67108864;
                                } else {
                                    i34 = 33554432;
                                }
                                i30 |= i34;
                            }
                            i35 = i15 & 512;
                            i36 = 805306368;
                            if (i35 == 0) {
                                i30 |= i36;
                            } else if ((i14 & 805306368) == 0) {
                                if ((i14 & 1073741824) == 0) {
                                    zH = sVar.f(gVar);
                                } else {
                                    zH = sVar.h(gVar);
                                }
                                if (zH) {
                                    i36 = 536870912;
                                } else {
                                    i36 = 268435456;
                                }
                                i30 |= i36;
                            }
                            if ((i30 & 306783379) != 306783378) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (sVar.T(i30 & 1, z12)) {
                                if (i44 != 0) {
                                    rVar2 = z1.o.f58481a;
                                }
                                if (i17 != 0) {
                                    y0Var2 = j3.y0.f35826d;
                                }
                                if (i19 != 0) {
                                    cVar4 = null;
                                } else {
                                    cVar4 = cVar2;
                                }
                                if (i22 != 0) {
                                    i40 = 1;
                                } else {
                                    i40 = i23;
                                }
                                if (i25 != 0) {
                                    z14 = true;
                                } else {
                                    z14 = z11;
                                }
                                if (i27 != 0) {
                                    i41 = Integer.MAX_VALUE;
                                } else {
                                    i41 = i28;
                                }
                                if (i31 != 0) {
                                    i42 = 1;
                                } else {
                                    i42 = i13;
                                }
                                if (i33 != 0) {
                                    yVar3 = null;
                                } else {
                                    yVar3 = yVar;
                                }
                                if (i35 != 0) {
                                    gVar3 = null;
                                } else {
                                    gVar3 = gVar;
                                }
                                A(i42, i41);
                                if (sVar.j(d1.j0.f22926a) == null) {
                                    throw new ClassCastException();
                                }
                                sVar.d0(356926143);
                                sVar.p(false);
                                n3.h hVar18 = (n3.h) sVar.j(z2.g1.f58550k);
                                int i41119 = (i30 & 14) | ((i30 >> 3) & 112);
                                executor = (Executor) sVar.j(t.f51192a);
                                if (executor == null) {
                                    y0Var4 = y0Var2;
                                    z15 = false;
                                    sVar.d0(1255196839);
                                    sVar.p(false);
                                } else {
                                    y0Var4 = y0Var2;
                                    z15 = false;
                                    sVar.d0(1255196839);
                                    sVar.p(false);
                                }
                                if (cVar4 == null) {
                                    str2 = str;
                                    i38 = i41;
                                    i43 = i42;
                                    sVar.d0(357244017);
                                    rVar3 = rVar2;
                                    rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                    sVar.p(false);
                                } else {
                                    str2 = str;
                                    i38 = i41;
                                    i43 = i42;
                                    sVar.d0(357244017);
                                    rVar3 = rVar2;
                                    rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                    sVar.p(false);
                                }
                                e eVar17 = e.f51017c;
                                iHashCode = Long.hashCode(sVar.T);
                                z1.r rVarC17 = z1.a.c(sVar, rVarZ);
                                l1.q1 q1VarL17 = sVar.l();
                                y2.k.J.getClass();
                                iVar = y2.j.f56913b;
                                sVar.h0();
                                if (sVar.S) {
                                    sVar.k(iVar);
                                } else {
                                    sVar.r0();
                                }
                                l1.t.J(y2.j.f56917f, eVar17, sVar);
                                l1.t.J(y2.j.f56916e, q1VarL17, sVar);
                                l1.t.J(y2.j.f56915d, rVarC17, sVar);
                                hVar = y2.j.f56918g;
                                if (sVar.S) {
                                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                                } else {
                                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                                }
                                sVar.p(true);
                                rVar2 = rVar3;
                                y0Var3 = y0Var4;
                                cVar3 = cVar4;
                                i39 = i40;
                                z13 = z14;
                                i37 = i43;
                                yVar2 = yVar3;
                                gVar2 = gVar3;
                            } else {
                                sVar.W();
                                i37 = i13;
                                gVar2 = gVar;
                                i38 = i28;
                                y0Var3 = y0Var2;
                                cVar3 = cVar2;
                                i39 = i23;
                                z13 = z11;
                                yVar2 = yVar;
                            }
                            x1VarT = sVar.t();
                            if (x1VarT != null) {
                                final z1.r rVar110 = rVar2;
                                final int i411110 = i38;
                                x1VarT.f39502d = new fz.e() { // from class: s0.r
                                    @Override // fz.e
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        o0.c(str2, rVar110, y0Var3, cVar3, i39, z13, i411110, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                        return qy.b0.f48488a;
                                    }
                                };
                            }
                        }
                        i30 |= 100663296;
                        i35 = i15 & 512;
                        i36 = 805306368;
                        if (i35 == 0) {
                            i30 |= i36;
                        } else if ((i14 & 805306368) == 0) {
                            if ((i14 & 1073741824) == 0) {
                                zH = sVar.f(gVar);
                            } else {
                                zH = sVar.h(gVar);
                            }
                            if (zH) {
                                i36 = 536870912;
                            } else {
                                i36 = 268435456;
                            }
                            i30 |= i36;
                        }
                        if ((i30 & 306783379) != 306783378) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (sVar.T(i30 & 1, z12)) {
                            if (i44 != 0) {
                                rVar2 = z1.o.f58481a;
                            }
                            if (i17 != 0) {
                                y0Var2 = j3.y0.f35826d;
                            }
                            if (i19 != 0) {
                                cVar4 = null;
                            } else {
                                cVar4 = cVar2;
                            }
                            if (i22 != 0) {
                                i40 = 1;
                            } else {
                                i40 = i23;
                            }
                            if (i25 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i27 != 0) {
                                i41 = Integer.MAX_VALUE;
                            } else {
                                i41 = i28;
                            }
                            if (i31 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i13;
                            }
                            if (i33 != 0) {
                                yVar3 = null;
                            } else {
                                yVar3 = yVar;
                            }
                            if (i35 != 0) {
                                gVar3 = null;
                            } else {
                                gVar3 = gVar;
                            }
                            A(i42, i41);
                            if (sVar.j(d1.j0.f22926a) == null) {
                                throw new ClassCastException();
                            }
                            sVar.d0(356926143);
                            sVar.p(false);
                            n3.h hVar19 = (n3.h) sVar.j(z2.g1.f58550k);
                            int i411111 = (i30 & 14) | ((i30 >> 3) & 112);
                            executor = (Executor) sVar.j(t.f51192a);
                            if (executor == null) {
                                y0Var4 = y0Var2;
                                z15 = false;
                                sVar.d0(1255196839);
                                sVar.p(false);
                            } else {
                                y0Var4 = y0Var2;
                                z15 = false;
                                sVar.d0(1255196839);
                                sVar.p(false);
                            }
                            if (cVar4 == null) {
                                str2 = str;
                                i38 = i41;
                                i43 = i42;
                                sVar.d0(357244017);
                                rVar3 = rVar2;
                                rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                sVar.p(false);
                            } else {
                                str2 = str;
                                i38 = i41;
                                i43 = i42;
                                sVar.d0(357244017);
                                rVar3 = rVar2;
                                rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                sVar.p(false);
                            }
                            e eVar18 = e.f51017c;
                            iHashCode = Long.hashCode(sVar.T);
                            z1.r rVarC18 = z1.a.c(sVar, rVarZ);
                            l1.q1 q1VarL18 = sVar.l();
                            y2.k.J.getClass();
                            iVar = y2.j.f56913b;
                            sVar.h0();
                            if (sVar.S) {
                                sVar.k(iVar);
                            } else {
                                sVar.r0();
                            }
                            l1.t.J(y2.j.f56917f, eVar18, sVar);
                            l1.t.J(y2.j.f56916e, q1VarL18, sVar);
                            l1.t.J(y2.j.f56915d, rVarC18, sVar);
                            hVar = y2.j.f56918g;
                            if (sVar.S) {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            } else {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            }
                            sVar.p(true);
                            rVar2 = rVar3;
                            y0Var3 = y0Var4;
                            cVar3 = cVar4;
                            i39 = i40;
                            z13 = z14;
                            i37 = i43;
                            yVar2 = yVar3;
                            gVar2 = gVar3;
                        } else {
                            sVar.W();
                            i37 = i13;
                            gVar2 = gVar;
                            i38 = i28;
                            y0Var3 = y0Var2;
                            cVar3 = cVar2;
                            i39 = i23;
                            z13 = z11;
                            yVar2 = yVar;
                        }
                        x1VarT = sVar.t();
                        if (x1VarT != null) {
                            final z1.r rVar111 = rVar2;
                            final int i411112 = i38;
                            x1VarT.f39502d = new fz.e() { // from class: s0.r
                                @Override // fz.e
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    o0.c(str2, rVar111, y0Var3, cVar3, i39, z13, i411112, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                    return qy.b0.f48488a;
                                }
                            };
                        }
                    }
                    i30 |= 12582912;
                    i33 = i15 & 256;
                    if (i33 != 0) {
                        if ((i14 & 100663296) == 0) {
                            if (sVar.h(yVar)) {
                                i34 = 67108864;
                            } else {
                                i34 = 33554432;
                            }
                            i30 |= i34;
                        }
                        i35 = i15 & 512;
                        i36 = 805306368;
                        if (i35 == 0) {
                            i30 |= i36;
                        } else if ((i14 & 805306368) == 0) {
                            if ((i14 & 1073741824) == 0) {
                                zH = sVar.f(gVar);
                            } else {
                                zH = sVar.h(gVar);
                            }
                            if (zH) {
                                i36 = 536870912;
                            } else {
                                i36 = 268435456;
                            }
                            i30 |= i36;
                        }
                        if ((i30 & 306783379) != 306783378) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (sVar.T(i30 & 1, z12)) {
                            if (i44 != 0) {
                                rVar2 = z1.o.f58481a;
                            }
                            if (i17 != 0) {
                                y0Var2 = j3.y0.f35826d;
                            }
                            if (i19 != 0) {
                                cVar4 = null;
                            } else {
                                cVar4 = cVar2;
                            }
                            if (i22 != 0) {
                                i40 = 1;
                            } else {
                                i40 = i23;
                            }
                            if (i25 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i27 != 0) {
                                i41 = Integer.MAX_VALUE;
                            } else {
                                i41 = i28;
                            }
                            if (i31 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i13;
                            }
                            if (i33 != 0) {
                                yVar3 = null;
                            } else {
                                yVar3 = yVar;
                            }
                            if (i35 != 0) {
                                gVar3 = null;
                            } else {
                                gVar3 = gVar;
                            }
                            A(i42, i41);
                            if (sVar.j(d1.j0.f22926a) == null) {
                                throw new ClassCastException();
                            }
                            sVar.d0(356926143);
                            sVar.p(false);
                            n3.h hVar110 = (n3.h) sVar.j(z2.g1.f58550k);
                            int i411113 = (i30 & 14) | ((i30 >> 3) & 112);
                            executor = (Executor) sVar.j(t.f51192a);
                            if (executor == null) {
                                y0Var4 = y0Var2;
                                z15 = false;
                                sVar.d0(1255196839);
                                sVar.p(false);
                            } else {
                                y0Var4 = y0Var2;
                                z15 = false;
                                sVar.d0(1255196839);
                                sVar.p(false);
                            }
                            if (cVar4 == null) {
                                str2 = str;
                                i38 = i41;
                                i43 = i42;
                                sVar.d0(357244017);
                                rVar3 = rVar2;
                                rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                sVar.p(false);
                            } else {
                                str2 = str;
                                i38 = i41;
                                i43 = i42;
                                sVar.d0(357244017);
                                rVar3 = rVar2;
                                rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                sVar.p(false);
                            }
                            e eVar19 = e.f51017c;
                            iHashCode = Long.hashCode(sVar.T);
                            z1.r rVarC19 = z1.a.c(sVar, rVarZ);
                            l1.q1 q1VarL19 = sVar.l();
                            y2.k.J.getClass();
                            iVar = y2.j.f56913b;
                            sVar.h0();
                            if (sVar.S) {
                                sVar.k(iVar);
                            } else {
                                sVar.r0();
                            }
                            l1.t.J(y2.j.f56917f, eVar19, sVar);
                            l1.t.J(y2.j.f56916e, q1VarL19, sVar);
                            l1.t.J(y2.j.f56915d, rVarC19, sVar);
                            hVar = y2.j.f56918g;
                            if (sVar.S) {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            } else {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            }
                            sVar.p(true);
                            rVar2 = rVar3;
                            y0Var3 = y0Var4;
                            cVar3 = cVar4;
                            i39 = i40;
                            z13 = z14;
                            i37 = i43;
                            yVar2 = yVar3;
                            gVar2 = gVar3;
                        } else {
                            sVar.W();
                            i37 = i13;
                            gVar2 = gVar;
                            i38 = i28;
                            y0Var3 = y0Var2;
                            cVar3 = cVar2;
                            i39 = i23;
                            z13 = z11;
                            yVar2 = yVar;
                        }
                        x1VarT = sVar.t();
                        if (x1VarT != null) {
                            final z1.r rVar112 = rVar2;
                            final int i411114 = i38;
                            x1VarT.f39502d = new fz.e() { // from class: s0.r
                                @Override // fz.e
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    o0.c(str2, rVar112, y0Var3, cVar3, i39, z13, i411114, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                    return qy.b0.f48488a;
                                }
                            };
                        }
                    }
                    i30 |= 100663296;
                    i35 = i15 & 512;
                    i36 = 805306368;
                    if (i35 == 0) {
                        i30 |= i36;
                    } else if ((i14 & 805306368) == 0) {
                        if ((i14 & 1073741824) == 0) {
                            zH = sVar.f(gVar);
                        } else {
                            zH = sVar.h(gVar);
                        }
                        if (zH) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i30 |= i36;
                    }
                    if ((i30 & 306783379) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (sVar.T(i30 & 1, z12)) {
                        if (i44 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i17 != 0) {
                            y0Var2 = j3.y0.f35826d;
                        }
                        if (i19 != 0) {
                            cVar4 = null;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i22 != 0) {
                            i40 = 1;
                        } else {
                            i40 = i23;
                        }
                        if (i25 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i27 != 0) {
                            i41 = Integer.MAX_VALUE;
                        } else {
                            i41 = i28;
                        }
                        if (i31 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i13;
                        }
                        if (i33 != 0) {
                            yVar3 = null;
                        } else {
                            yVar3 = yVar;
                        }
                        if (i35 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        A(i42, i41);
                        if (sVar.j(d1.j0.f22926a) == null) {
                            throw new ClassCastException();
                        }
                        sVar.d0(356926143);
                        sVar.p(false);
                        n3.h hVar111 = (n3.h) sVar.j(z2.g1.f58550k);
                        int i411115 = (i30 & 14) | ((i30 >> 3) & 112);
                        executor = (Executor) sVar.j(t.f51192a);
                        if (executor == null) {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        } else {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        }
                        if (cVar4 == null) {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        } else {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        }
                        e eVar110 = e.f51017c;
                        iHashCode = Long.hashCode(sVar.T);
                        z1.r rVarC110 = z1.a.c(sVar, rVarZ);
                        l1.q1 q1VarL110 = sVar.l();
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, eVar110, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL110, sVar);
                        l1.t.J(y2.j.f56915d, rVarC110, sVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        sVar.p(true);
                        rVar2 = rVar3;
                        y0Var3 = y0Var4;
                        cVar3 = cVar4;
                        i39 = i40;
                        z13 = z14;
                        i37 = i43;
                        yVar2 = yVar3;
                        gVar2 = gVar3;
                    } else {
                        sVar.W();
                        i37 = i13;
                        gVar2 = gVar;
                        i38 = i28;
                        y0Var3 = y0Var2;
                        cVar3 = cVar2;
                        i39 = i23;
                        z13 = z11;
                        yVar2 = yVar;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        final z1.r rVar113 = rVar2;
                        final int i411116 = i38;
                        x1VarT.f39502d = new fz.e() { // from class: s0.r
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                o0.c(str2, rVar113, y0Var3, cVar3, i39, z13, i411116, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i16 |= 24576;
                i23 = i11;
                i25 = i15 & 32;
                if (i25 != 0) {
                    i16 |= 196608;
                } else if ((i14 & 196608) == 0) {
                    if (sVar.g(z11)) {
                        i26 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i26 = 65536;
                    }
                    i16 |= i26;
                }
                i27 = i15 & 64;
                if (i27 != 0) {
                    i16 |= 1572864;
                    i28 = i12;
                } else {
                    i28 = i12;
                    if ((i14 & 1572864) == 0) {
                        if (sVar.d(i28)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i16 |= i29;
                    }
                }
                i30 = i16;
                i31 = i15 & 128;
                if (i31 != 0) {
                    if ((i14 & 12582912) == 0) {
                        if (sVar.d(i13)) {
                            i32 = 8388608;
                        } else {
                            i32 = 4194304;
                        }
                        i30 |= i32;
                    }
                    i33 = i15 & 256;
                    if (i33 != 0) {
                        if ((i14 & 100663296) == 0) {
                            if (sVar.h(yVar)) {
                                i34 = 67108864;
                            } else {
                                i34 = 33554432;
                            }
                            i30 |= i34;
                        }
                        i35 = i15 & 512;
                        i36 = 805306368;
                        if (i35 == 0) {
                            i30 |= i36;
                        } else if ((i14 & 805306368) == 0) {
                            if ((i14 & 1073741824) == 0) {
                                zH = sVar.f(gVar);
                            } else {
                                zH = sVar.h(gVar);
                            }
                            if (zH) {
                                i36 = 536870912;
                            } else {
                                i36 = 268435456;
                            }
                            i30 |= i36;
                        }
                        if ((i30 & 306783379) != 306783378) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (sVar.T(i30 & 1, z12)) {
                            if (i44 != 0) {
                                rVar2 = z1.o.f58481a;
                            }
                            if (i17 != 0) {
                                y0Var2 = j3.y0.f35826d;
                            }
                            if (i19 != 0) {
                                cVar4 = null;
                            } else {
                                cVar4 = cVar2;
                            }
                            if (i22 != 0) {
                                i40 = 1;
                            } else {
                                i40 = i23;
                            }
                            if (i25 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i27 != 0) {
                                i41 = Integer.MAX_VALUE;
                            } else {
                                i41 = i28;
                            }
                            if (i31 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i13;
                            }
                            if (i33 != 0) {
                                yVar3 = null;
                            } else {
                                yVar3 = yVar;
                            }
                            if (i35 != 0) {
                                gVar3 = null;
                            } else {
                                gVar3 = gVar;
                            }
                            A(i42, i41);
                            if (sVar.j(d1.j0.f22926a) == null) {
                                throw new ClassCastException();
                            }
                            sVar.d0(356926143);
                            sVar.p(false);
                            n3.h hVar112 = (n3.h) sVar.j(z2.g1.f58550k);
                            int i411117 = (i30 & 14) | ((i30 >> 3) & 112);
                            executor = (Executor) sVar.j(t.f51192a);
                            if (executor == null) {
                                y0Var4 = y0Var2;
                                z15 = false;
                                sVar.d0(1255196839);
                                sVar.p(false);
                            } else {
                                y0Var4 = y0Var2;
                                z15 = false;
                                sVar.d0(1255196839);
                                sVar.p(false);
                            }
                            if (cVar4 == null) {
                                str2 = str;
                                i38 = i41;
                                i43 = i42;
                                sVar.d0(357244017);
                                rVar3 = rVar2;
                                rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                sVar.p(false);
                            } else {
                                str2 = str;
                                i38 = i41;
                                i43 = i42;
                                sVar.d0(357244017);
                                rVar3 = rVar2;
                                rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                sVar.p(false);
                            }
                            e eVar111 = e.f51017c;
                            iHashCode = Long.hashCode(sVar.T);
                            z1.r rVarC111 = z1.a.c(sVar, rVarZ);
                            l1.q1 q1VarL111 = sVar.l();
                            y2.k.J.getClass();
                            iVar = y2.j.f56913b;
                            sVar.h0();
                            if (sVar.S) {
                                sVar.k(iVar);
                            } else {
                                sVar.r0();
                            }
                            l1.t.J(y2.j.f56917f, eVar111, sVar);
                            l1.t.J(y2.j.f56916e, q1VarL111, sVar);
                            l1.t.J(y2.j.f56915d, rVarC111, sVar);
                            hVar = y2.j.f56918g;
                            if (sVar.S) {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            } else {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            }
                            sVar.p(true);
                            rVar2 = rVar3;
                            y0Var3 = y0Var4;
                            cVar3 = cVar4;
                            i39 = i40;
                            z13 = z14;
                            i37 = i43;
                            yVar2 = yVar3;
                            gVar2 = gVar3;
                        } else {
                            sVar.W();
                            i37 = i13;
                            gVar2 = gVar;
                            i38 = i28;
                            y0Var3 = y0Var2;
                            cVar3 = cVar2;
                            i39 = i23;
                            z13 = z11;
                            yVar2 = yVar;
                        }
                        x1VarT = sVar.t();
                        if (x1VarT != null) {
                            final z1.r rVar114 = rVar2;
                            final int i411118 = i38;
                            x1VarT.f39502d = new fz.e() { // from class: s0.r
                                @Override // fz.e
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    o0.c(str2, rVar114, y0Var3, cVar3, i39, z13, i411118, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                    return qy.b0.f48488a;
                                }
                            };
                        }
                    }
                    i30 |= 100663296;
                    i35 = i15 & 512;
                    i36 = 805306368;
                    if (i35 == 0) {
                        i30 |= i36;
                    } else if ((i14 & 805306368) == 0) {
                        if ((i14 & 1073741824) == 0) {
                            zH = sVar.f(gVar);
                        } else {
                            zH = sVar.h(gVar);
                        }
                        if (zH) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i30 |= i36;
                    }
                    if ((i30 & 306783379) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (sVar.T(i30 & 1, z12)) {
                        if (i44 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i17 != 0) {
                            y0Var2 = j3.y0.f35826d;
                        }
                        if (i19 != 0) {
                            cVar4 = null;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i22 != 0) {
                            i40 = 1;
                        } else {
                            i40 = i23;
                        }
                        if (i25 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i27 != 0) {
                            i41 = Integer.MAX_VALUE;
                        } else {
                            i41 = i28;
                        }
                        if (i31 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i13;
                        }
                        if (i33 != 0) {
                            yVar3 = null;
                        } else {
                            yVar3 = yVar;
                        }
                        if (i35 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        A(i42, i41);
                        if (sVar.j(d1.j0.f22926a) == null) {
                            throw new ClassCastException();
                        }
                        sVar.d0(356926143);
                        sVar.p(false);
                        n3.h hVar113 = (n3.h) sVar.j(z2.g1.f58550k);
                        int i411119 = (i30 & 14) | ((i30 >> 3) & 112);
                        executor = (Executor) sVar.j(t.f51192a);
                        if (executor == null) {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        } else {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        }
                        if (cVar4 == null) {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        } else {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        }
                        e eVar112 = e.f51017c;
                        iHashCode = Long.hashCode(sVar.T);
                        z1.r rVarC112 = z1.a.c(sVar, rVarZ);
                        l1.q1 q1VarL112 = sVar.l();
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, eVar112, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL112, sVar);
                        l1.t.J(y2.j.f56915d, rVarC112, sVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        sVar.p(true);
                        rVar2 = rVar3;
                        y0Var3 = y0Var4;
                        cVar3 = cVar4;
                        i39 = i40;
                        z13 = z14;
                        i37 = i43;
                        yVar2 = yVar3;
                        gVar2 = gVar3;
                    } else {
                        sVar.W();
                        i37 = i13;
                        gVar2 = gVar;
                        i38 = i28;
                        y0Var3 = y0Var2;
                        cVar3 = cVar2;
                        i39 = i23;
                        z13 = z11;
                        yVar2 = yVar;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        final z1.r rVar115 = rVar2;
                        final int i4111110 = i38;
                        x1VarT.f39502d = new fz.e() { // from class: s0.r
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                o0.c(str2, rVar115, y0Var3, cVar3, i39, z13, i4111110, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i30 |= 12582912;
                i33 = i15 & 256;
                if (i33 != 0) {
                    if ((i14 & 100663296) == 0) {
                        if (sVar.h(yVar)) {
                            i34 = 67108864;
                        } else {
                            i34 = 33554432;
                        }
                        i30 |= i34;
                    }
                    i35 = i15 & 512;
                    i36 = 805306368;
                    if (i35 == 0) {
                        i30 |= i36;
                    } else if ((i14 & 805306368) == 0) {
                        if ((i14 & 1073741824) == 0) {
                            zH = sVar.f(gVar);
                        } else {
                            zH = sVar.h(gVar);
                        }
                        if (zH) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i30 |= i36;
                    }
                    if ((i30 & 306783379) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (sVar.T(i30 & 1, z12)) {
                        if (i44 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i17 != 0) {
                            y0Var2 = j3.y0.f35826d;
                        }
                        if (i19 != 0) {
                            cVar4 = null;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i22 != 0) {
                            i40 = 1;
                        } else {
                            i40 = i23;
                        }
                        if (i25 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i27 != 0) {
                            i41 = Integer.MAX_VALUE;
                        } else {
                            i41 = i28;
                        }
                        if (i31 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i13;
                        }
                        if (i33 != 0) {
                            yVar3 = null;
                        } else {
                            yVar3 = yVar;
                        }
                        if (i35 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        A(i42, i41);
                        if (sVar.j(d1.j0.f22926a) == null) {
                            throw new ClassCastException();
                        }
                        sVar.d0(356926143);
                        sVar.p(false);
                        n3.h hVar114 = (n3.h) sVar.j(z2.g1.f58550k);
                        int i4111111 = (i30 & 14) | ((i30 >> 3) & 112);
                        executor = (Executor) sVar.j(t.f51192a);
                        if (executor == null) {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        } else {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        }
                        if (cVar4 == null) {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        } else {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        }
                        e eVar113 = e.f51017c;
                        iHashCode = Long.hashCode(sVar.T);
                        z1.r rVarC113 = z1.a.c(sVar, rVarZ);
                        l1.q1 q1VarL113 = sVar.l();
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, eVar113, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL113, sVar);
                        l1.t.J(y2.j.f56915d, rVarC113, sVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        sVar.p(true);
                        rVar2 = rVar3;
                        y0Var3 = y0Var4;
                        cVar3 = cVar4;
                        i39 = i40;
                        z13 = z14;
                        i37 = i43;
                        yVar2 = yVar3;
                        gVar2 = gVar3;
                    } else {
                        sVar.W();
                        i37 = i13;
                        gVar2 = gVar;
                        i38 = i28;
                        y0Var3 = y0Var2;
                        cVar3 = cVar2;
                        i39 = i23;
                        z13 = z11;
                        yVar2 = yVar;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        final z1.r rVar116 = rVar2;
                        final int i4111112 = i38;
                        x1VarT.f39502d = new fz.e() { // from class: s0.r
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                o0.c(str2, rVar116, y0Var3, cVar3, i39, z13, i4111112, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i30 |= 100663296;
                i35 = i15 & 512;
                i36 = 805306368;
                if (i35 == 0) {
                    i30 |= i36;
                } else if ((i14 & 805306368) == 0) {
                    if ((i14 & 1073741824) == 0) {
                        zH = sVar.f(gVar);
                    } else {
                        zH = sVar.h(gVar);
                    }
                    if (zH) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i30 |= i36;
                }
                if ((i30 & 306783379) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (sVar.T(i30 & 1, z12)) {
                    if (i44 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i17 != 0) {
                        y0Var2 = j3.y0.f35826d;
                    }
                    if (i19 != 0) {
                        cVar4 = null;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i22 != 0) {
                        i40 = 1;
                    } else {
                        i40 = i23;
                    }
                    if (i25 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i27 != 0) {
                        i41 = Integer.MAX_VALUE;
                    } else {
                        i41 = i28;
                    }
                    if (i31 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i13;
                    }
                    if (i33 != 0) {
                        yVar3 = null;
                    } else {
                        yVar3 = yVar;
                    }
                    if (i35 != 0) {
                        gVar3 = null;
                    } else {
                        gVar3 = gVar;
                    }
                    A(i42, i41);
                    if (sVar.j(d1.j0.f22926a) == null) {
                        throw new ClassCastException();
                    }
                    sVar.d0(356926143);
                    sVar.p(false);
                    n3.h hVar115 = (n3.h) sVar.j(z2.g1.f58550k);
                    int i4111113 = (i30 & 14) | ((i30 >> 3) & 112);
                    executor = (Executor) sVar.j(t.f51192a);
                    if (executor == null) {
                        y0Var4 = y0Var2;
                        z15 = false;
                        sVar.d0(1255196839);
                        sVar.p(false);
                    } else {
                        y0Var4 = y0Var2;
                        z15 = false;
                        sVar.d0(1255196839);
                        sVar.p(false);
                    }
                    if (cVar4 == null) {
                        str2 = str;
                        i38 = i41;
                        i43 = i42;
                        sVar.d0(357244017);
                        rVar3 = rVar2;
                        rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                        sVar.p(false);
                    } else {
                        str2 = str;
                        i38 = i41;
                        i43 = i42;
                        sVar.d0(357244017);
                        rVar3 = rVar2;
                        rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                        sVar.p(false);
                    }
                    e eVar114 = e.f51017c;
                    iHashCode = Long.hashCode(sVar.T);
                    z1.r rVarC114 = z1.a.c(sVar, rVarZ);
                    l1.q1 q1VarL114 = sVar.l();
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, eVar114, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL114, sVar);
                    l1.t.J(y2.j.f56915d, rVarC114, sVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    sVar.p(true);
                    rVar2 = rVar3;
                    y0Var3 = y0Var4;
                    cVar3 = cVar4;
                    i39 = i40;
                    z13 = z14;
                    i37 = i43;
                    yVar2 = yVar3;
                    gVar2 = gVar3;
                } else {
                    sVar.W();
                    i37 = i13;
                    gVar2 = gVar;
                    i38 = i28;
                    y0Var3 = y0Var2;
                    cVar3 = cVar2;
                    i39 = i23;
                    z13 = z11;
                    yVar2 = yVar;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    final z1.r rVar117 = rVar2;
                    final int i4111114 = i38;
                    x1VarT.f39502d = new fz.e() { // from class: s0.r
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            o0.c(str2, rVar117, y0Var3, cVar3, i39, z13, i4111114, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i16 |= 3072;
            cVar2 = cVar;
            i22 = i15 & 16;
            if (i22 != 0) {
                if ((i14 & 24576) == 0) {
                    i23 = i11;
                    if (sVar.d(i23)) {
                        i24 = 16384;
                    } else {
                        i24 = OSSConstants.DEFAULT_BUFFER_SIZE;
                    }
                    i16 |= i24;
                }
                i25 = i15 & 32;
                if (i25 != 0) {
                    i16 |= 196608;
                } else if ((i14 & 196608) == 0) {
                    if (sVar.g(z11)) {
                        i26 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i26 = 65536;
                    }
                    i16 |= i26;
                }
                i27 = i15 & 64;
                if (i27 != 0) {
                    i16 |= 1572864;
                    i28 = i12;
                } else {
                    i28 = i12;
                    if ((i14 & 1572864) == 0) {
                        if (sVar.d(i28)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i16 |= i29;
                    }
                }
                i30 = i16;
                i31 = i15 & 128;
                if (i31 != 0) {
                    if ((i14 & 12582912) == 0) {
                        if (sVar.d(i13)) {
                            i32 = 8388608;
                        } else {
                            i32 = 4194304;
                        }
                        i30 |= i32;
                    }
                    i33 = i15 & 256;
                    if (i33 != 0) {
                        if ((i14 & 100663296) == 0) {
                            if (sVar.h(yVar)) {
                                i34 = 67108864;
                            } else {
                                i34 = 33554432;
                            }
                            i30 |= i34;
                        }
                        i35 = i15 & 512;
                        i36 = 805306368;
                        if (i35 == 0) {
                            i30 |= i36;
                        } else if ((i14 & 805306368) == 0) {
                            if ((i14 & 1073741824) == 0) {
                                zH = sVar.f(gVar);
                            } else {
                                zH = sVar.h(gVar);
                            }
                            if (zH) {
                                i36 = 536870912;
                            } else {
                                i36 = 268435456;
                            }
                            i30 |= i36;
                        }
                        if ((i30 & 306783379) != 306783378) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (sVar.T(i30 & 1, z12)) {
                            if (i44 != 0) {
                                rVar2 = z1.o.f58481a;
                            }
                            if (i17 != 0) {
                                y0Var2 = j3.y0.f35826d;
                            }
                            if (i19 != 0) {
                                cVar4 = null;
                            } else {
                                cVar4 = cVar2;
                            }
                            if (i22 != 0) {
                                i40 = 1;
                            } else {
                                i40 = i23;
                            }
                            if (i25 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i27 != 0) {
                                i41 = Integer.MAX_VALUE;
                            } else {
                                i41 = i28;
                            }
                            if (i31 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i13;
                            }
                            if (i33 != 0) {
                                yVar3 = null;
                            } else {
                                yVar3 = yVar;
                            }
                            if (i35 != 0) {
                                gVar3 = null;
                            } else {
                                gVar3 = gVar;
                            }
                            A(i42, i41);
                            if (sVar.j(d1.j0.f22926a) == null) {
                                throw new ClassCastException();
                            }
                            sVar.d0(356926143);
                            sVar.p(false);
                            n3.h hVar116 = (n3.h) sVar.j(z2.g1.f58550k);
                            int i4111115 = (i30 & 14) | ((i30 >> 3) & 112);
                            executor = (Executor) sVar.j(t.f51192a);
                            if (executor == null) {
                                y0Var4 = y0Var2;
                                z15 = false;
                                sVar.d0(1255196839);
                                sVar.p(false);
                            } else {
                                y0Var4 = y0Var2;
                                z15 = false;
                                sVar.d0(1255196839);
                                sVar.p(false);
                            }
                            if (cVar4 == null) {
                                str2 = str;
                                i38 = i41;
                                i43 = i42;
                                sVar.d0(357244017);
                                rVar3 = rVar2;
                                rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                sVar.p(false);
                            } else {
                                str2 = str;
                                i38 = i41;
                                i43 = i42;
                                sVar.d0(357244017);
                                rVar3 = rVar2;
                                rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                sVar.p(false);
                            }
                            e eVar115 = e.f51017c;
                            iHashCode = Long.hashCode(sVar.T);
                            z1.r rVarC115 = z1.a.c(sVar, rVarZ);
                            l1.q1 q1VarL115 = sVar.l();
                            y2.k.J.getClass();
                            iVar = y2.j.f56913b;
                            sVar.h0();
                            if (sVar.S) {
                                sVar.k(iVar);
                            } else {
                                sVar.r0();
                            }
                            l1.t.J(y2.j.f56917f, eVar115, sVar);
                            l1.t.J(y2.j.f56916e, q1VarL115, sVar);
                            l1.t.J(y2.j.f56915d, rVarC115, sVar);
                            hVar = y2.j.f56918g;
                            if (sVar.S) {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            } else {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            }
                            sVar.p(true);
                            rVar2 = rVar3;
                            y0Var3 = y0Var4;
                            cVar3 = cVar4;
                            i39 = i40;
                            z13 = z14;
                            i37 = i43;
                            yVar2 = yVar3;
                            gVar2 = gVar3;
                        } else {
                            sVar.W();
                            i37 = i13;
                            gVar2 = gVar;
                            i38 = i28;
                            y0Var3 = y0Var2;
                            cVar3 = cVar2;
                            i39 = i23;
                            z13 = z11;
                            yVar2 = yVar;
                        }
                        x1VarT = sVar.t();
                        if (x1VarT != null) {
                            final z1.r rVar118 = rVar2;
                            final int i4111116 = i38;
                            x1VarT.f39502d = new fz.e() { // from class: s0.r
                                @Override // fz.e
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    o0.c(str2, rVar118, y0Var3, cVar3, i39, z13, i4111116, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                    return qy.b0.f48488a;
                                }
                            };
                        }
                    }
                    i30 |= 100663296;
                    i35 = i15 & 512;
                    i36 = 805306368;
                    if (i35 == 0) {
                        i30 |= i36;
                    } else if ((i14 & 805306368) == 0) {
                        if ((i14 & 1073741824) == 0) {
                            zH = sVar.f(gVar);
                        } else {
                            zH = sVar.h(gVar);
                        }
                        if (zH) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i30 |= i36;
                    }
                    if ((i30 & 306783379) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (sVar.T(i30 & 1, z12)) {
                        if (i44 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i17 != 0) {
                            y0Var2 = j3.y0.f35826d;
                        }
                        if (i19 != 0) {
                            cVar4 = null;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i22 != 0) {
                            i40 = 1;
                        } else {
                            i40 = i23;
                        }
                        if (i25 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i27 != 0) {
                            i41 = Integer.MAX_VALUE;
                        } else {
                            i41 = i28;
                        }
                        if (i31 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i13;
                        }
                        if (i33 != 0) {
                            yVar3 = null;
                        } else {
                            yVar3 = yVar;
                        }
                        if (i35 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        A(i42, i41);
                        if (sVar.j(d1.j0.f22926a) == null) {
                            throw new ClassCastException();
                        }
                        sVar.d0(356926143);
                        sVar.p(false);
                        n3.h hVar117 = (n3.h) sVar.j(z2.g1.f58550k);
                        int i4111117 = (i30 & 14) | ((i30 >> 3) & 112);
                        executor = (Executor) sVar.j(t.f51192a);
                        if (executor == null) {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        } else {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        }
                        if (cVar4 == null) {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        } else {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        }
                        e eVar116 = e.f51017c;
                        iHashCode = Long.hashCode(sVar.T);
                        z1.r rVarC116 = z1.a.c(sVar, rVarZ);
                        l1.q1 q1VarL116 = sVar.l();
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, eVar116, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL116, sVar);
                        l1.t.J(y2.j.f56915d, rVarC116, sVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        sVar.p(true);
                        rVar2 = rVar3;
                        y0Var3 = y0Var4;
                        cVar3 = cVar4;
                        i39 = i40;
                        z13 = z14;
                        i37 = i43;
                        yVar2 = yVar3;
                        gVar2 = gVar3;
                    } else {
                        sVar.W();
                        i37 = i13;
                        gVar2 = gVar;
                        i38 = i28;
                        y0Var3 = y0Var2;
                        cVar3 = cVar2;
                        i39 = i23;
                        z13 = z11;
                        yVar2 = yVar;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        final z1.r rVar119 = rVar2;
                        final int i4111118 = i38;
                        x1VarT.f39502d = new fz.e() { // from class: s0.r
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                o0.c(str2, rVar119, y0Var3, cVar3, i39, z13, i4111118, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i30 |= 12582912;
                i33 = i15 & 256;
                if (i33 != 0) {
                    if ((i14 & 100663296) == 0) {
                        if (sVar.h(yVar)) {
                            i34 = 67108864;
                        } else {
                            i34 = 33554432;
                        }
                        i30 |= i34;
                    }
                    i35 = i15 & 512;
                    i36 = 805306368;
                    if (i35 == 0) {
                        i30 |= i36;
                    } else if ((i14 & 805306368) == 0) {
                        if ((i14 & 1073741824) == 0) {
                            zH = sVar.f(gVar);
                        } else {
                            zH = sVar.h(gVar);
                        }
                        if (zH) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i30 |= i36;
                    }
                    if ((i30 & 306783379) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (sVar.T(i30 & 1, z12)) {
                        if (i44 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i17 != 0) {
                            y0Var2 = j3.y0.f35826d;
                        }
                        if (i19 != 0) {
                            cVar4 = null;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i22 != 0) {
                            i40 = 1;
                        } else {
                            i40 = i23;
                        }
                        if (i25 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i27 != 0) {
                            i41 = Integer.MAX_VALUE;
                        } else {
                            i41 = i28;
                        }
                        if (i31 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i13;
                        }
                        if (i33 != 0) {
                            yVar3 = null;
                        } else {
                            yVar3 = yVar;
                        }
                        if (i35 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        A(i42, i41);
                        if (sVar.j(d1.j0.f22926a) == null) {
                            throw new ClassCastException();
                        }
                        sVar.d0(356926143);
                        sVar.p(false);
                        n3.h hVar118 = (n3.h) sVar.j(z2.g1.f58550k);
                        int i4111119 = (i30 & 14) | ((i30 >> 3) & 112);
                        executor = (Executor) sVar.j(t.f51192a);
                        if (executor == null) {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        } else {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        }
                        if (cVar4 == null) {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        } else {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        }
                        e eVar117 = e.f51017c;
                        iHashCode = Long.hashCode(sVar.T);
                        z1.r rVarC117 = z1.a.c(sVar, rVarZ);
                        l1.q1 q1VarL117 = sVar.l();
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, eVar117, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL117, sVar);
                        l1.t.J(y2.j.f56915d, rVarC117, sVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        sVar.p(true);
                        rVar2 = rVar3;
                        y0Var3 = y0Var4;
                        cVar3 = cVar4;
                        i39 = i40;
                        z13 = z14;
                        i37 = i43;
                        yVar2 = yVar3;
                        gVar2 = gVar3;
                    } else {
                        sVar.W();
                        i37 = i13;
                        gVar2 = gVar;
                        i38 = i28;
                        y0Var3 = y0Var2;
                        cVar3 = cVar2;
                        i39 = i23;
                        z13 = z11;
                        yVar2 = yVar;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        final z1.r rVar1110 = rVar2;
                        final int i41111110 = i38;
                        x1VarT.f39502d = new fz.e() { // from class: s0.r
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                o0.c(str2, rVar1110, y0Var3, cVar3, i39, z13, i41111110, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i30 |= 100663296;
                i35 = i15 & 512;
                i36 = 805306368;
                if (i35 == 0) {
                    i30 |= i36;
                } else if ((i14 & 805306368) == 0) {
                    if ((i14 & 1073741824) == 0) {
                        zH = sVar.f(gVar);
                    } else {
                        zH = sVar.h(gVar);
                    }
                    if (zH) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i30 |= i36;
                }
                if ((i30 & 306783379) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (sVar.T(i30 & 1, z12)) {
                    if (i44 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i17 != 0) {
                        y0Var2 = j3.y0.f35826d;
                    }
                    if (i19 != 0) {
                        cVar4 = null;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i22 != 0) {
                        i40 = 1;
                    } else {
                        i40 = i23;
                    }
                    if (i25 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i27 != 0) {
                        i41 = Integer.MAX_VALUE;
                    } else {
                        i41 = i28;
                    }
                    if (i31 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i13;
                    }
                    if (i33 != 0) {
                        yVar3 = null;
                    } else {
                        yVar3 = yVar;
                    }
                    if (i35 != 0) {
                        gVar3 = null;
                    } else {
                        gVar3 = gVar;
                    }
                    A(i42, i41);
                    if (sVar.j(d1.j0.f22926a) == null) {
                        throw new ClassCastException();
                    }
                    sVar.d0(356926143);
                    sVar.p(false);
                    n3.h hVar119 = (n3.h) sVar.j(z2.g1.f58550k);
                    int i41111111 = (i30 & 14) | ((i30 >> 3) & 112);
                    executor = (Executor) sVar.j(t.f51192a);
                    if (executor == null) {
                        y0Var4 = y0Var2;
                        z15 = false;
                        sVar.d0(1255196839);
                        sVar.p(false);
                    } else {
                        y0Var4 = y0Var2;
                        z15 = false;
                        sVar.d0(1255196839);
                        sVar.p(false);
                    }
                    if (cVar4 == null) {
                        str2 = str;
                        i38 = i41;
                        i43 = i42;
                        sVar.d0(357244017);
                        rVar3 = rVar2;
                        rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                        sVar.p(false);
                    } else {
                        str2 = str;
                        i38 = i41;
                        i43 = i42;
                        sVar.d0(357244017);
                        rVar3 = rVar2;
                        rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                        sVar.p(false);
                    }
                    e eVar118 = e.f51017c;
                    iHashCode = Long.hashCode(sVar.T);
                    z1.r rVarC118 = z1.a.c(sVar, rVarZ);
                    l1.q1 q1VarL118 = sVar.l();
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, eVar118, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL118, sVar);
                    l1.t.J(y2.j.f56915d, rVarC118, sVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    sVar.p(true);
                    rVar2 = rVar3;
                    y0Var3 = y0Var4;
                    cVar3 = cVar4;
                    i39 = i40;
                    z13 = z14;
                    i37 = i43;
                    yVar2 = yVar3;
                    gVar2 = gVar3;
                } else {
                    sVar.W();
                    i37 = i13;
                    gVar2 = gVar;
                    i38 = i28;
                    y0Var3 = y0Var2;
                    cVar3 = cVar2;
                    i39 = i23;
                    z13 = z11;
                    yVar2 = yVar;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    final z1.r rVar1111 = rVar2;
                    final int i41111112 = i38;
                    x1VarT.f39502d = new fz.e() { // from class: s0.r
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            o0.c(str2, rVar1111, y0Var3, cVar3, i39, z13, i41111112, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i16 |= 24576;
            i23 = i11;
            i25 = i15 & 32;
            if (i25 != 0) {
                i16 |= 196608;
            } else if ((i14 & 196608) == 0) {
                if (sVar.g(z11)) {
                    i26 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                } else {
                    i26 = 65536;
                }
                i16 |= i26;
            }
            i27 = i15 & 64;
            if (i27 != 0) {
                i16 |= 1572864;
                i28 = i12;
            } else {
                i28 = i12;
                if ((i14 & 1572864) == 0) {
                    if (sVar.d(i28)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i16 |= i29;
                }
            }
            i30 = i16;
            i31 = i15 & 128;
            if (i31 != 0) {
                if ((i14 & 12582912) == 0) {
                    if (sVar.d(i13)) {
                        i32 = 8388608;
                    } else {
                        i32 = 4194304;
                    }
                    i30 |= i32;
                }
                i33 = i15 & 256;
                if (i33 != 0) {
                    if ((i14 & 100663296) == 0) {
                        if (sVar.h(yVar)) {
                            i34 = 67108864;
                        } else {
                            i34 = 33554432;
                        }
                        i30 |= i34;
                    }
                    i35 = i15 & 512;
                    i36 = 805306368;
                    if (i35 == 0) {
                        i30 |= i36;
                    } else if ((i14 & 805306368) == 0) {
                        if ((i14 & 1073741824) == 0) {
                            zH = sVar.f(gVar);
                        } else {
                            zH = sVar.h(gVar);
                        }
                        if (zH) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i30 |= i36;
                    }
                    if ((i30 & 306783379) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (sVar.T(i30 & 1, z12)) {
                        if (i44 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i17 != 0) {
                            y0Var2 = j3.y0.f35826d;
                        }
                        if (i19 != 0) {
                            cVar4 = null;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i22 != 0) {
                            i40 = 1;
                        } else {
                            i40 = i23;
                        }
                        if (i25 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i27 != 0) {
                            i41 = Integer.MAX_VALUE;
                        } else {
                            i41 = i28;
                        }
                        if (i31 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i13;
                        }
                        if (i33 != 0) {
                            yVar3 = null;
                        } else {
                            yVar3 = yVar;
                        }
                        if (i35 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        A(i42, i41);
                        if (sVar.j(d1.j0.f22926a) == null) {
                            throw new ClassCastException();
                        }
                        sVar.d0(356926143);
                        sVar.p(false);
                        n3.h hVar1110 = (n3.h) sVar.j(z2.g1.f58550k);
                        int i41111113 = (i30 & 14) | ((i30 >> 3) & 112);
                        executor = (Executor) sVar.j(t.f51192a);
                        if (executor == null) {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        } else {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        }
                        if (cVar4 == null) {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        } else {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        }
                        e eVar119 = e.f51017c;
                        iHashCode = Long.hashCode(sVar.T);
                        z1.r rVarC119 = z1.a.c(sVar, rVarZ);
                        l1.q1 q1VarL119 = sVar.l();
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, eVar119, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL119, sVar);
                        l1.t.J(y2.j.f56915d, rVarC119, sVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        sVar.p(true);
                        rVar2 = rVar3;
                        y0Var3 = y0Var4;
                        cVar3 = cVar4;
                        i39 = i40;
                        z13 = z14;
                        i37 = i43;
                        yVar2 = yVar3;
                        gVar2 = gVar3;
                    } else {
                        sVar.W();
                        i37 = i13;
                        gVar2 = gVar;
                        i38 = i28;
                        y0Var3 = y0Var2;
                        cVar3 = cVar2;
                        i39 = i23;
                        z13 = z11;
                        yVar2 = yVar;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        final z1.r rVar1112 = rVar2;
                        final int i41111114 = i38;
                        x1VarT.f39502d = new fz.e() { // from class: s0.r
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                o0.c(str2, rVar1112, y0Var3, cVar3, i39, z13, i41111114, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i30 |= 100663296;
                i35 = i15 & 512;
                i36 = 805306368;
                if (i35 == 0) {
                    i30 |= i36;
                } else if ((i14 & 805306368) == 0) {
                    if ((i14 & 1073741824) == 0) {
                        zH = sVar.f(gVar);
                    } else {
                        zH = sVar.h(gVar);
                    }
                    if (zH) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i30 |= i36;
                }
                if ((i30 & 306783379) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (sVar.T(i30 & 1, z12)) {
                    if (i44 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i17 != 0) {
                        y0Var2 = j3.y0.f35826d;
                    }
                    if (i19 != 0) {
                        cVar4 = null;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i22 != 0) {
                        i40 = 1;
                    } else {
                        i40 = i23;
                    }
                    if (i25 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i27 != 0) {
                        i41 = Integer.MAX_VALUE;
                    } else {
                        i41 = i28;
                    }
                    if (i31 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i13;
                    }
                    if (i33 != 0) {
                        yVar3 = null;
                    } else {
                        yVar3 = yVar;
                    }
                    if (i35 != 0) {
                        gVar3 = null;
                    } else {
                        gVar3 = gVar;
                    }
                    A(i42, i41);
                    if (sVar.j(d1.j0.f22926a) == null) {
                        throw new ClassCastException();
                    }
                    sVar.d0(356926143);
                    sVar.p(false);
                    n3.h hVar1111 = (n3.h) sVar.j(z2.g1.f58550k);
                    int i41111115 = (i30 & 14) | ((i30 >> 3) & 112);
                    executor = (Executor) sVar.j(t.f51192a);
                    if (executor == null) {
                        y0Var4 = y0Var2;
                        z15 = false;
                        sVar.d0(1255196839);
                        sVar.p(false);
                    } else {
                        y0Var4 = y0Var2;
                        z15 = false;
                        sVar.d0(1255196839);
                        sVar.p(false);
                    }
                    if (cVar4 == null) {
                        str2 = str;
                        i38 = i41;
                        i43 = i42;
                        sVar.d0(357244017);
                        rVar3 = rVar2;
                        rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                        sVar.p(false);
                    } else {
                        str2 = str;
                        i38 = i41;
                        i43 = i42;
                        sVar.d0(357244017);
                        rVar3 = rVar2;
                        rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                        sVar.p(false);
                    }
                    e eVar1110 = e.f51017c;
                    iHashCode = Long.hashCode(sVar.T);
                    z1.r rVarC1110 = z1.a.c(sVar, rVarZ);
                    l1.q1 q1VarL1110 = sVar.l();
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, eVar1110, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL1110, sVar);
                    l1.t.J(y2.j.f56915d, rVarC1110, sVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    sVar.p(true);
                    rVar2 = rVar3;
                    y0Var3 = y0Var4;
                    cVar3 = cVar4;
                    i39 = i40;
                    z13 = z14;
                    i37 = i43;
                    yVar2 = yVar3;
                    gVar2 = gVar3;
                } else {
                    sVar.W();
                    i37 = i13;
                    gVar2 = gVar;
                    i38 = i28;
                    y0Var3 = y0Var2;
                    cVar3 = cVar2;
                    i39 = i23;
                    z13 = z11;
                    yVar2 = yVar;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    final z1.r rVar1113 = rVar2;
                    final int i41111116 = i38;
                    x1VarT.f39502d = new fz.e() { // from class: s0.r
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            o0.c(str2, rVar1113, y0Var3, cVar3, i39, z13, i41111116, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i30 |= 12582912;
            i33 = i15 & 256;
            if (i33 != 0) {
                if ((i14 & 100663296) == 0) {
                    if (sVar.h(yVar)) {
                        i34 = 67108864;
                    } else {
                        i34 = 33554432;
                    }
                    i30 |= i34;
                }
                i35 = i15 & 512;
                i36 = 805306368;
                if (i35 == 0) {
                    i30 |= i36;
                } else if ((i14 & 805306368) == 0) {
                    if ((i14 & 1073741824) == 0) {
                        zH = sVar.f(gVar);
                    } else {
                        zH = sVar.h(gVar);
                    }
                    if (zH) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i30 |= i36;
                }
                if ((i30 & 306783379) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (sVar.T(i30 & 1, z12)) {
                    if (i44 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i17 != 0) {
                        y0Var2 = j3.y0.f35826d;
                    }
                    if (i19 != 0) {
                        cVar4 = null;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i22 != 0) {
                        i40 = 1;
                    } else {
                        i40 = i23;
                    }
                    if (i25 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i27 != 0) {
                        i41 = Integer.MAX_VALUE;
                    } else {
                        i41 = i28;
                    }
                    if (i31 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i13;
                    }
                    if (i33 != 0) {
                        yVar3 = null;
                    } else {
                        yVar3 = yVar;
                    }
                    if (i35 != 0) {
                        gVar3 = null;
                    } else {
                        gVar3 = gVar;
                    }
                    A(i42, i41);
                    if (sVar.j(d1.j0.f22926a) == null) {
                        throw new ClassCastException();
                    }
                    sVar.d0(356926143);
                    sVar.p(false);
                    n3.h hVar1112 = (n3.h) sVar.j(z2.g1.f58550k);
                    int i41111117 = (i30 & 14) | ((i30 >> 3) & 112);
                    executor = (Executor) sVar.j(t.f51192a);
                    if (executor == null) {
                        y0Var4 = y0Var2;
                        z15 = false;
                        sVar.d0(1255196839);
                        sVar.p(false);
                    } else {
                        y0Var4 = y0Var2;
                        z15 = false;
                        sVar.d0(1255196839);
                        sVar.p(false);
                    }
                    if (cVar4 == null) {
                        str2 = str;
                        i38 = i41;
                        i43 = i42;
                        sVar.d0(357244017);
                        rVar3 = rVar2;
                        rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                        sVar.p(false);
                    } else {
                        str2 = str;
                        i38 = i41;
                        i43 = i42;
                        sVar.d0(357244017);
                        rVar3 = rVar2;
                        rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                        sVar.p(false);
                    }
                    e eVar1111 = e.f51017c;
                    iHashCode = Long.hashCode(sVar.T);
                    z1.r rVarC1111 = z1.a.c(sVar, rVarZ);
                    l1.q1 q1VarL1111 = sVar.l();
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, eVar1111, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL1111, sVar);
                    l1.t.J(y2.j.f56915d, rVarC1111, sVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    sVar.p(true);
                    rVar2 = rVar3;
                    y0Var3 = y0Var4;
                    cVar3 = cVar4;
                    i39 = i40;
                    z13 = z14;
                    i37 = i43;
                    yVar2 = yVar3;
                    gVar2 = gVar3;
                } else {
                    sVar.W();
                    i37 = i13;
                    gVar2 = gVar;
                    i38 = i28;
                    y0Var3 = y0Var2;
                    cVar3 = cVar2;
                    i39 = i23;
                    z13 = z11;
                    yVar2 = yVar;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    final z1.r rVar1114 = rVar2;
                    final int i41111118 = i38;
                    x1VarT.f39502d = new fz.e() { // from class: s0.r
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            o0.c(str2, rVar1114, y0Var3, cVar3, i39, z13, i41111118, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i30 |= 100663296;
            i35 = i15 & 512;
            i36 = 805306368;
            if (i35 == 0) {
                i30 |= i36;
            } else if ((i14 & 805306368) == 0) {
                if ((i14 & 1073741824) == 0) {
                    zH = sVar.f(gVar);
                } else {
                    zH = sVar.h(gVar);
                }
                if (zH) {
                    i36 = 536870912;
                } else {
                    i36 = 268435456;
                }
                i30 |= i36;
            }
            if ((i30 & 306783379) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (sVar.T(i30 & 1, z12)) {
                if (i44 != 0) {
                    rVar2 = z1.o.f58481a;
                }
                if (i17 != 0) {
                    y0Var2 = j3.y0.f35826d;
                }
                if (i19 != 0) {
                    cVar4 = null;
                } else {
                    cVar4 = cVar2;
                }
                if (i22 != 0) {
                    i40 = 1;
                } else {
                    i40 = i23;
                }
                if (i25 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                if (i27 != 0) {
                    i41 = Integer.MAX_VALUE;
                } else {
                    i41 = i28;
                }
                if (i31 != 0) {
                    i42 = 1;
                } else {
                    i42 = i13;
                }
                if (i33 != 0) {
                    yVar3 = null;
                } else {
                    yVar3 = yVar;
                }
                if (i35 != 0) {
                    gVar3 = null;
                } else {
                    gVar3 = gVar;
                }
                A(i42, i41);
                if (sVar.j(d1.j0.f22926a) == null) {
                    throw new ClassCastException();
                }
                sVar.d0(356926143);
                sVar.p(false);
                n3.h hVar1113 = (n3.h) sVar.j(z2.g1.f58550k);
                int i41111119 = (i30 & 14) | ((i30 >> 3) & 112);
                executor = (Executor) sVar.j(t.f51192a);
                if (executor == null) {
                    y0Var4 = y0Var2;
                    z15 = false;
                    sVar.d0(1255196839);
                    sVar.p(false);
                } else {
                    y0Var4 = y0Var2;
                    z15 = false;
                    sVar.d0(1255196839);
                    sVar.p(false);
                }
                if (cVar4 == null) {
                    str2 = str;
                    i38 = i41;
                    i43 = i42;
                    sVar.d0(357244017);
                    rVar3 = rVar2;
                    rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                    sVar.p(false);
                } else {
                    str2 = str;
                    i38 = i41;
                    i43 = i42;
                    sVar.d0(357244017);
                    rVar3 = rVar2;
                    rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                    sVar.p(false);
                }
                e eVar1112 = e.f51017c;
                iHashCode = Long.hashCode(sVar.T);
                z1.r rVarC1112 = z1.a.c(sVar, rVarZ);
                l1.q1 q1VarL1112 = sVar.l();
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, eVar1112, sVar);
                l1.t.J(y2.j.f56916e, q1VarL1112, sVar);
                l1.t.J(y2.j.f56915d, rVarC1112, sVar);
                hVar = y2.j.f56918g;
                if (sVar.S) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                } else {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                sVar.p(true);
                rVar2 = rVar3;
                y0Var3 = y0Var4;
                cVar3 = cVar4;
                i39 = i40;
                z13 = z14;
                i37 = i43;
                yVar2 = yVar3;
                gVar2 = gVar3;
            } else {
                sVar.W();
                i37 = i13;
                gVar2 = gVar;
                i38 = i28;
                y0Var3 = y0Var2;
                cVar3 = cVar2;
                i39 = i23;
                z13 = z11;
                yVar2 = yVar;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                final z1.r rVar1115 = rVar2;
                final int i411111110 = i38;
                x1VarT.f39502d = new fz.e() { // from class: s0.r
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        o0.c(str2, rVar1115, y0Var3, cVar3, i39, z13, i411111110, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i16 |= 48;
        rVar2 = rVar;
        i17 = i15 & 4;
        if (i17 != 0) {
            if ((i14 & 384) == 0) {
                y0Var2 = y0Var;
                if (sVar.f(y0Var2)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i16 |= i18;
            }
            i19 = i15 & 8;
            if (i19 != 0) {
                if ((i14 & 3072) == 0) {
                    cVar2 = cVar;
                    if (sVar.h(cVar2)) {
                        i21 = 2048;
                    } else {
                        i21 = 1024;
                    }
                    i16 |= i21;
                }
                i22 = i15 & 16;
                if (i22 != 0) {
                    if ((i14 & 24576) == 0) {
                        i23 = i11;
                        if (sVar.d(i23)) {
                            i24 = 16384;
                        } else {
                            i24 = OSSConstants.DEFAULT_BUFFER_SIZE;
                        }
                        i16 |= i24;
                    }
                    i25 = i15 & 32;
                    if (i25 != 0) {
                        i16 |= 196608;
                    } else if ((i14 & 196608) == 0) {
                        if (sVar.g(z11)) {
                            i26 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                        } else {
                            i26 = 65536;
                        }
                        i16 |= i26;
                    }
                    i27 = i15 & 64;
                    if (i27 != 0) {
                        i16 |= 1572864;
                        i28 = i12;
                    } else {
                        i28 = i12;
                        if ((i14 & 1572864) == 0) {
                            if (sVar.d(i28)) {
                                i29 = 1048576;
                            } else {
                                i29 = 524288;
                            }
                            i16 |= i29;
                        }
                    }
                    i30 = i16;
                    i31 = i15 & 128;
                    if (i31 != 0) {
                        if ((i14 & 12582912) == 0) {
                            if (sVar.d(i13)) {
                                i32 = 8388608;
                            } else {
                                i32 = 4194304;
                            }
                            i30 |= i32;
                        }
                        i33 = i15 & 256;
                        if (i33 != 0) {
                            if ((i14 & 100663296) == 0) {
                                if (sVar.h(yVar)) {
                                    i34 = 67108864;
                                } else {
                                    i34 = 33554432;
                                }
                                i30 |= i34;
                            }
                            i35 = i15 & 512;
                            i36 = 805306368;
                            if (i35 == 0) {
                                i30 |= i36;
                            } else if ((i14 & 805306368) == 0) {
                                if ((i14 & 1073741824) == 0) {
                                    zH = sVar.f(gVar);
                                } else {
                                    zH = sVar.h(gVar);
                                }
                                if (zH) {
                                    i36 = 536870912;
                                } else {
                                    i36 = 268435456;
                                }
                                i30 |= i36;
                            }
                            if ((i30 & 306783379) != 306783378) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (sVar.T(i30 & 1, z12)) {
                                if (i44 != 0) {
                                    rVar2 = z1.o.f58481a;
                                }
                                if (i17 != 0) {
                                    y0Var2 = j3.y0.f35826d;
                                }
                                if (i19 != 0) {
                                    cVar4 = null;
                                } else {
                                    cVar4 = cVar2;
                                }
                                if (i22 != 0) {
                                    i40 = 1;
                                } else {
                                    i40 = i23;
                                }
                                if (i25 != 0) {
                                    z14 = true;
                                } else {
                                    z14 = z11;
                                }
                                if (i27 != 0) {
                                    i41 = Integer.MAX_VALUE;
                                } else {
                                    i41 = i28;
                                }
                                if (i31 != 0) {
                                    i42 = 1;
                                } else {
                                    i42 = i13;
                                }
                                if (i33 != 0) {
                                    yVar3 = null;
                                } else {
                                    yVar3 = yVar;
                                }
                                if (i35 != 0) {
                                    gVar3 = null;
                                } else {
                                    gVar3 = gVar;
                                }
                                A(i42, i41);
                                if (sVar.j(d1.j0.f22926a) == null) {
                                    throw new ClassCastException();
                                }
                                sVar.d0(356926143);
                                sVar.p(false);
                                n3.h hVar1114 = (n3.h) sVar.j(z2.g1.f58550k);
                                int i411111111 = (i30 & 14) | ((i30 >> 3) & 112);
                                executor = (Executor) sVar.j(t.f51192a);
                                if (executor == null) {
                                    y0Var4 = y0Var2;
                                    z15 = false;
                                    sVar.d0(1255196839);
                                    sVar.p(false);
                                } else {
                                    y0Var4 = y0Var2;
                                    z15 = false;
                                    sVar.d0(1255196839);
                                    sVar.p(false);
                                }
                                if (cVar4 == null) {
                                    str2 = str;
                                    i38 = i41;
                                    i43 = i42;
                                    sVar.d0(357244017);
                                    rVar3 = rVar2;
                                    rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                    sVar.p(false);
                                } else {
                                    str2 = str;
                                    i38 = i41;
                                    i43 = i42;
                                    sVar.d0(357244017);
                                    rVar3 = rVar2;
                                    rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                    sVar.p(false);
                                }
                                e eVar1113 = e.f51017c;
                                iHashCode = Long.hashCode(sVar.T);
                                z1.r rVarC1113 = z1.a.c(sVar, rVarZ);
                                l1.q1 q1VarL1113 = sVar.l();
                                y2.k.J.getClass();
                                iVar = y2.j.f56913b;
                                sVar.h0();
                                if (sVar.S) {
                                    sVar.k(iVar);
                                } else {
                                    sVar.r0();
                                }
                                l1.t.J(y2.j.f56917f, eVar1113, sVar);
                                l1.t.J(y2.j.f56916e, q1VarL1113, sVar);
                                l1.t.J(y2.j.f56915d, rVarC1113, sVar);
                                hVar = y2.j.f56918g;
                                if (sVar.S) {
                                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                                } else {
                                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                                }
                                sVar.p(true);
                                rVar2 = rVar3;
                                y0Var3 = y0Var4;
                                cVar3 = cVar4;
                                i39 = i40;
                                z13 = z14;
                                i37 = i43;
                                yVar2 = yVar3;
                                gVar2 = gVar3;
                            } else {
                                sVar.W();
                                i37 = i13;
                                gVar2 = gVar;
                                i38 = i28;
                                y0Var3 = y0Var2;
                                cVar3 = cVar2;
                                i39 = i23;
                                z13 = z11;
                                yVar2 = yVar;
                            }
                            x1VarT = sVar.t();
                            if (x1VarT != null) {
                                final z1.r rVar1116 = rVar2;
                                final int i411111112 = i38;
                                x1VarT.f39502d = new fz.e() { // from class: s0.r
                                    @Override // fz.e
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        o0.c(str2, rVar1116, y0Var3, cVar3, i39, z13, i411111112, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                        return qy.b0.f48488a;
                                    }
                                };
                            }
                        }
                        i30 |= 100663296;
                        i35 = i15 & 512;
                        i36 = 805306368;
                        if (i35 == 0) {
                            i30 |= i36;
                        } else if ((i14 & 805306368) == 0) {
                            if ((i14 & 1073741824) == 0) {
                                zH = sVar.f(gVar);
                            } else {
                                zH = sVar.h(gVar);
                            }
                            if (zH) {
                                i36 = 536870912;
                            } else {
                                i36 = 268435456;
                            }
                            i30 |= i36;
                        }
                        if ((i30 & 306783379) != 306783378) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (sVar.T(i30 & 1, z12)) {
                            if (i44 != 0) {
                                rVar2 = z1.o.f58481a;
                            }
                            if (i17 != 0) {
                                y0Var2 = j3.y0.f35826d;
                            }
                            if (i19 != 0) {
                                cVar4 = null;
                            } else {
                                cVar4 = cVar2;
                            }
                            if (i22 != 0) {
                                i40 = 1;
                            } else {
                                i40 = i23;
                            }
                            if (i25 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i27 != 0) {
                                i41 = Integer.MAX_VALUE;
                            } else {
                                i41 = i28;
                            }
                            if (i31 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i13;
                            }
                            if (i33 != 0) {
                                yVar3 = null;
                            } else {
                                yVar3 = yVar;
                            }
                            if (i35 != 0) {
                                gVar3 = null;
                            } else {
                                gVar3 = gVar;
                            }
                            A(i42, i41);
                            if (sVar.j(d1.j0.f22926a) == null) {
                                throw new ClassCastException();
                            }
                            sVar.d0(356926143);
                            sVar.p(false);
                            n3.h hVar1115 = (n3.h) sVar.j(z2.g1.f58550k);
                            int i411111113 = (i30 & 14) | ((i30 >> 3) & 112);
                            executor = (Executor) sVar.j(t.f51192a);
                            if (executor == null) {
                                y0Var4 = y0Var2;
                                z15 = false;
                                sVar.d0(1255196839);
                                sVar.p(false);
                            } else {
                                y0Var4 = y0Var2;
                                z15 = false;
                                sVar.d0(1255196839);
                                sVar.p(false);
                            }
                            if (cVar4 == null) {
                                str2 = str;
                                i38 = i41;
                                i43 = i42;
                                sVar.d0(357244017);
                                rVar3 = rVar2;
                                rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                sVar.p(false);
                            } else {
                                str2 = str;
                                i38 = i41;
                                i43 = i42;
                                sVar.d0(357244017);
                                rVar3 = rVar2;
                                rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                sVar.p(false);
                            }
                            e eVar1114 = e.f51017c;
                            iHashCode = Long.hashCode(sVar.T);
                            z1.r rVarC1114 = z1.a.c(sVar, rVarZ);
                            l1.q1 q1VarL1114 = sVar.l();
                            y2.k.J.getClass();
                            iVar = y2.j.f56913b;
                            sVar.h0();
                            if (sVar.S) {
                                sVar.k(iVar);
                            } else {
                                sVar.r0();
                            }
                            l1.t.J(y2.j.f56917f, eVar1114, sVar);
                            l1.t.J(y2.j.f56916e, q1VarL1114, sVar);
                            l1.t.J(y2.j.f56915d, rVarC1114, sVar);
                            hVar = y2.j.f56918g;
                            if (sVar.S) {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            } else {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            }
                            sVar.p(true);
                            rVar2 = rVar3;
                            y0Var3 = y0Var4;
                            cVar3 = cVar4;
                            i39 = i40;
                            z13 = z14;
                            i37 = i43;
                            yVar2 = yVar3;
                            gVar2 = gVar3;
                        } else {
                            sVar.W();
                            i37 = i13;
                            gVar2 = gVar;
                            i38 = i28;
                            y0Var3 = y0Var2;
                            cVar3 = cVar2;
                            i39 = i23;
                            z13 = z11;
                            yVar2 = yVar;
                        }
                        x1VarT = sVar.t();
                        if (x1VarT != null) {
                            final z1.r rVar1117 = rVar2;
                            final int i411111114 = i38;
                            x1VarT.f39502d = new fz.e() { // from class: s0.r
                                @Override // fz.e
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    o0.c(str2, rVar1117, y0Var3, cVar3, i39, z13, i411111114, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                    return qy.b0.f48488a;
                                }
                            };
                        }
                    }
                    i30 |= 12582912;
                    i33 = i15 & 256;
                    if (i33 != 0) {
                        if ((i14 & 100663296) == 0) {
                            if (sVar.h(yVar)) {
                                i34 = 67108864;
                            } else {
                                i34 = 33554432;
                            }
                            i30 |= i34;
                        }
                        i35 = i15 & 512;
                        i36 = 805306368;
                        if (i35 == 0) {
                            i30 |= i36;
                        } else if ((i14 & 805306368) == 0) {
                            if ((i14 & 1073741824) == 0) {
                                zH = sVar.f(gVar);
                            } else {
                                zH = sVar.h(gVar);
                            }
                            if (zH) {
                                i36 = 536870912;
                            } else {
                                i36 = 268435456;
                            }
                            i30 |= i36;
                        }
                        if ((i30 & 306783379) != 306783378) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (sVar.T(i30 & 1, z12)) {
                            if (i44 != 0) {
                                rVar2 = z1.o.f58481a;
                            }
                            if (i17 != 0) {
                                y0Var2 = j3.y0.f35826d;
                            }
                            if (i19 != 0) {
                                cVar4 = null;
                            } else {
                                cVar4 = cVar2;
                            }
                            if (i22 != 0) {
                                i40 = 1;
                            } else {
                                i40 = i23;
                            }
                            if (i25 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i27 != 0) {
                                i41 = Integer.MAX_VALUE;
                            } else {
                                i41 = i28;
                            }
                            if (i31 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i13;
                            }
                            if (i33 != 0) {
                                yVar3 = null;
                            } else {
                                yVar3 = yVar;
                            }
                            if (i35 != 0) {
                                gVar3 = null;
                            } else {
                                gVar3 = gVar;
                            }
                            A(i42, i41);
                            if (sVar.j(d1.j0.f22926a) == null) {
                                throw new ClassCastException();
                            }
                            sVar.d0(356926143);
                            sVar.p(false);
                            n3.h hVar1116 = (n3.h) sVar.j(z2.g1.f58550k);
                            int i411111115 = (i30 & 14) | ((i30 >> 3) & 112);
                            executor = (Executor) sVar.j(t.f51192a);
                            if (executor == null) {
                                y0Var4 = y0Var2;
                                z15 = false;
                                sVar.d0(1255196839);
                                sVar.p(false);
                            } else {
                                y0Var4 = y0Var2;
                                z15 = false;
                                sVar.d0(1255196839);
                                sVar.p(false);
                            }
                            if (cVar4 == null) {
                                str2 = str;
                                i38 = i41;
                                i43 = i42;
                                sVar.d0(357244017);
                                rVar3 = rVar2;
                                rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                sVar.p(false);
                            } else {
                                str2 = str;
                                i38 = i41;
                                i43 = i42;
                                sVar.d0(357244017);
                                rVar3 = rVar2;
                                rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                sVar.p(false);
                            }
                            e eVar1115 = e.f51017c;
                            iHashCode = Long.hashCode(sVar.T);
                            z1.r rVarC1115 = z1.a.c(sVar, rVarZ);
                            l1.q1 q1VarL1115 = sVar.l();
                            y2.k.J.getClass();
                            iVar = y2.j.f56913b;
                            sVar.h0();
                            if (sVar.S) {
                                sVar.k(iVar);
                            } else {
                                sVar.r0();
                            }
                            l1.t.J(y2.j.f56917f, eVar1115, sVar);
                            l1.t.J(y2.j.f56916e, q1VarL1115, sVar);
                            l1.t.J(y2.j.f56915d, rVarC1115, sVar);
                            hVar = y2.j.f56918g;
                            if (sVar.S) {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            } else {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            }
                            sVar.p(true);
                            rVar2 = rVar3;
                            y0Var3 = y0Var4;
                            cVar3 = cVar4;
                            i39 = i40;
                            z13 = z14;
                            i37 = i43;
                            yVar2 = yVar3;
                            gVar2 = gVar3;
                        } else {
                            sVar.W();
                            i37 = i13;
                            gVar2 = gVar;
                            i38 = i28;
                            y0Var3 = y0Var2;
                            cVar3 = cVar2;
                            i39 = i23;
                            z13 = z11;
                            yVar2 = yVar;
                        }
                        x1VarT = sVar.t();
                        if (x1VarT != null) {
                            final z1.r rVar1118 = rVar2;
                            final int i411111116 = i38;
                            x1VarT.f39502d = new fz.e() { // from class: s0.r
                                @Override // fz.e
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    o0.c(str2, rVar1118, y0Var3, cVar3, i39, z13, i411111116, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                    return qy.b0.f48488a;
                                }
                            };
                        }
                    }
                    i30 |= 100663296;
                    i35 = i15 & 512;
                    i36 = 805306368;
                    if (i35 == 0) {
                        i30 |= i36;
                    } else if ((i14 & 805306368) == 0) {
                        if ((i14 & 1073741824) == 0) {
                            zH = sVar.f(gVar);
                        } else {
                            zH = sVar.h(gVar);
                        }
                        if (zH) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i30 |= i36;
                    }
                    if ((i30 & 306783379) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (sVar.T(i30 & 1, z12)) {
                        if (i44 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i17 != 0) {
                            y0Var2 = j3.y0.f35826d;
                        }
                        if (i19 != 0) {
                            cVar4 = null;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i22 != 0) {
                            i40 = 1;
                        } else {
                            i40 = i23;
                        }
                        if (i25 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i27 != 0) {
                            i41 = Integer.MAX_VALUE;
                        } else {
                            i41 = i28;
                        }
                        if (i31 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i13;
                        }
                        if (i33 != 0) {
                            yVar3 = null;
                        } else {
                            yVar3 = yVar;
                        }
                        if (i35 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        A(i42, i41);
                        if (sVar.j(d1.j0.f22926a) == null) {
                            throw new ClassCastException();
                        }
                        sVar.d0(356926143);
                        sVar.p(false);
                        n3.h hVar1117 = (n3.h) sVar.j(z2.g1.f58550k);
                        int i411111117 = (i30 & 14) | ((i30 >> 3) & 112);
                        executor = (Executor) sVar.j(t.f51192a);
                        if (executor == null) {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        } else {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        }
                        if (cVar4 == null) {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        } else {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        }
                        e eVar1116 = e.f51017c;
                        iHashCode = Long.hashCode(sVar.T);
                        z1.r rVarC1116 = z1.a.c(sVar, rVarZ);
                        l1.q1 q1VarL1116 = sVar.l();
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, eVar1116, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL1116, sVar);
                        l1.t.J(y2.j.f56915d, rVarC1116, sVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        sVar.p(true);
                        rVar2 = rVar3;
                        y0Var3 = y0Var4;
                        cVar3 = cVar4;
                        i39 = i40;
                        z13 = z14;
                        i37 = i43;
                        yVar2 = yVar3;
                        gVar2 = gVar3;
                    } else {
                        sVar.W();
                        i37 = i13;
                        gVar2 = gVar;
                        i38 = i28;
                        y0Var3 = y0Var2;
                        cVar3 = cVar2;
                        i39 = i23;
                        z13 = z11;
                        yVar2 = yVar;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        final z1.r rVar1119 = rVar2;
                        final int i411111118 = i38;
                        x1VarT.f39502d = new fz.e() { // from class: s0.r
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                o0.c(str2, rVar1119, y0Var3, cVar3, i39, z13, i411111118, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i16 |= 24576;
                i23 = i11;
                i25 = i15 & 32;
                if (i25 != 0) {
                    i16 |= 196608;
                } else if ((i14 & 196608) == 0) {
                    if (sVar.g(z11)) {
                        i26 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i26 = 65536;
                    }
                    i16 |= i26;
                }
                i27 = i15 & 64;
                if (i27 != 0) {
                    i16 |= 1572864;
                    i28 = i12;
                } else {
                    i28 = i12;
                    if ((i14 & 1572864) == 0) {
                        if (sVar.d(i28)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i16 |= i29;
                    }
                }
                i30 = i16;
                i31 = i15 & 128;
                if (i31 != 0) {
                    if ((i14 & 12582912) == 0) {
                        if (sVar.d(i13)) {
                            i32 = 8388608;
                        } else {
                            i32 = 4194304;
                        }
                        i30 |= i32;
                    }
                    i33 = i15 & 256;
                    if (i33 != 0) {
                        if ((i14 & 100663296) == 0) {
                            if (sVar.h(yVar)) {
                                i34 = 67108864;
                            } else {
                                i34 = 33554432;
                            }
                            i30 |= i34;
                        }
                        i35 = i15 & 512;
                        i36 = 805306368;
                        if (i35 == 0) {
                            i30 |= i36;
                        } else if ((i14 & 805306368) == 0) {
                            if ((i14 & 1073741824) == 0) {
                                zH = sVar.f(gVar);
                            } else {
                                zH = sVar.h(gVar);
                            }
                            if (zH) {
                                i36 = 536870912;
                            } else {
                                i36 = 268435456;
                            }
                            i30 |= i36;
                        }
                        if ((i30 & 306783379) != 306783378) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (sVar.T(i30 & 1, z12)) {
                            if (i44 != 0) {
                                rVar2 = z1.o.f58481a;
                            }
                            if (i17 != 0) {
                                y0Var2 = j3.y0.f35826d;
                            }
                            if (i19 != 0) {
                                cVar4 = null;
                            } else {
                                cVar4 = cVar2;
                            }
                            if (i22 != 0) {
                                i40 = 1;
                            } else {
                                i40 = i23;
                            }
                            if (i25 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i27 != 0) {
                                i41 = Integer.MAX_VALUE;
                            } else {
                                i41 = i28;
                            }
                            if (i31 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i13;
                            }
                            if (i33 != 0) {
                                yVar3 = null;
                            } else {
                                yVar3 = yVar;
                            }
                            if (i35 != 0) {
                                gVar3 = null;
                            } else {
                                gVar3 = gVar;
                            }
                            A(i42, i41);
                            if (sVar.j(d1.j0.f22926a) == null) {
                                throw new ClassCastException();
                            }
                            sVar.d0(356926143);
                            sVar.p(false);
                            n3.h hVar1118 = (n3.h) sVar.j(z2.g1.f58550k);
                            int i411111119 = (i30 & 14) | ((i30 >> 3) & 112);
                            executor = (Executor) sVar.j(t.f51192a);
                            if (executor == null) {
                                y0Var4 = y0Var2;
                                z15 = false;
                                sVar.d0(1255196839);
                                sVar.p(false);
                            } else {
                                y0Var4 = y0Var2;
                                z15 = false;
                                sVar.d0(1255196839);
                                sVar.p(false);
                            }
                            if (cVar4 == null) {
                                str2 = str;
                                i38 = i41;
                                i43 = i42;
                                sVar.d0(357244017);
                                rVar3 = rVar2;
                                rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                sVar.p(false);
                            } else {
                                str2 = str;
                                i38 = i41;
                                i43 = i42;
                                sVar.d0(357244017);
                                rVar3 = rVar2;
                                rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                sVar.p(false);
                            }
                            e eVar1117 = e.f51017c;
                            iHashCode = Long.hashCode(sVar.T);
                            z1.r rVarC1117 = z1.a.c(sVar, rVarZ);
                            l1.q1 q1VarL1117 = sVar.l();
                            y2.k.J.getClass();
                            iVar = y2.j.f56913b;
                            sVar.h0();
                            if (sVar.S) {
                                sVar.k(iVar);
                            } else {
                                sVar.r0();
                            }
                            l1.t.J(y2.j.f56917f, eVar1117, sVar);
                            l1.t.J(y2.j.f56916e, q1VarL1117, sVar);
                            l1.t.J(y2.j.f56915d, rVarC1117, sVar);
                            hVar = y2.j.f56918g;
                            if (sVar.S) {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            } else {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            }
                            sVar.p(true);
                            rVar2 = rVar3;
                            y0Var3 = y0Var4;
                            cVar3 = cVar4;
                            i39 = i40;
                            z13 = z14;
                            i37 = i43;
                            yVar2 = yVar3;
                            gVar2 = gVar3;
                        } else {
                            sVar.W();
                            i37 = i13;
                            gVar2 = gVar;
                            i38 = i28;
                            y0Var3 = y0Var2;
                            cVar3 = cVar2;
                            i39 = i23;
                            z13 = z11;
                            yVar2 = yVar;
                        }
                        x1VarT = sVar.t();
                        if (x1VarT != null) {
                            final z1.r rVar11110 = rVar2;
                            final int i4111111110 = i38;
                            x1VarT.f39502d = new fz.e() { // from class: s0.r
                                @Override // fz.e
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    o0.c(str2, rVar11110, y0Var3, cVar3, i39, z13, i4111111110, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                    return qy.b0.f48488a;
                                }
                            };
                        }
                    }
                    i30 |= 100663296;
                    i35 = i15 & 512;
                    i36 = 805306368;
                    if (i35 == 0) {
                        i30 |= i36;
                    } else if ((i14 & 805306368) == 0) {
                        if ((i14 & 1073741824) == 0) {
                            zH = sVar.f(gVar);
                        } else {
                            zH = sVar.h(gVar);
                        }
                        if (zH) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i30 |= i36;
                    }
                    if ((i30 & 306783379) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (sVar.T(i30 & 1, z12)) {
                        if (i44 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i17 != 0) {
                            y0Var2 = j3.y0.f35826d;
                        }
                        if (i19 != 0) {
                            cVar4 = null;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i22 != 0) {
                            i40 = 1;
                        } else {
                            i40 = i23;
                        }
                        if (i25 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i27 != 0) {
                            i41 = Integer.MAX_VALUE;
                        } else {
                            i41 = i28;
                        }
                        if (i31 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i13;
                        }
                        if (i33 != 0) {
                            yVar3 = null;
                        } else {
                            yVar3 = yVar;
                        }
                        if (i35 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        A(i42, i41);
                        if (sVar.j(d1.j0.f22926a) == null) {
                            throw new ClassCastException();
                        }
                        sVar.d0(356926143);
                        sVar.p(false);
                        n3.h hVar1119 = (n3.h) sVar.j(z2.g1.f58550k);
                        int i4111111111 = (i30 & 14) | ((i30 >> 3) & 112);
                        executor = (Executor) sVar.j(t.f51192a);
                        if (executor == null) {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        } else {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        }
                        if (cVar4 == null) {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        } else {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        }
                        e eVar1118 = e.f51017c;
                        iHashCode = Long.hashCode(sVar.T);
                        z1.r rVarC1118 = z1.a.c(sVar, rVarZ);
                        l1.q1 q1VarL1118 = sVar.l();
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, eVar1118, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL1118, sVar);
                        l1.t.J(y2.j.f56915d, rVarC1118, sVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        sVar.p(true);
                        rVar2 = rVar3;
                        y0Var3 = y0Var4;
                        cVar3 = cVar4;
                        i39 = i40;
                        z13 = z14;
                        i37 = i43;
                        yVar2 = yVar3;
                        gVar2 = gVar3;
                    } else {
                        sVar.W();
                        i37 = i13;
                        gVar2 = gVar;
                        i38 = i28;
                        y0Var3 = y0Var2;
                        cVar3 = cVar2;
                        i39 = i23;
                        z13 = z11;
                        yVar2 = yVar;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        final z1.r rVar11111 = rVar2;
                        final int i4111111112 = i38;
                        x1VarT.f39502d = new fz.e() { // from class: s0.r
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                o0.c(str2, rVar11111, y0Var3, cVar3, i39, z13, i4111111112, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i30 |= 12582912;
                i33 = i15 & 256;
                if (i33 != 0) {
                    if ((i14 & 100663296) == 0) {
                        if (sVar.h(yVar)) {
                            i34 = 67108864;
                        } else {
                            i34 = 33554432;
                        }
                        i30 |= i34;
                    }
                    i35 = i15 & 512;
                    i36 = 805306368;
                    if (i35 == 0) {
                        i30 |= i36;
                    } else if ((i14 & 805306368) == 0) {
                        if ((i14 & 1073741824) == 0) {
                            zH = sVar.f(gVar);
                        } else {
                            zH = sVar.h(gVar);
                        }
                        if (zH) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i30 |= i36;
                    }
                    if ((i30 & 306783379) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (sVar.T(i30 & 1, z12)) {
                        if (i44 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i17 != 0) {
                            y0Var2 = j3.y0.f35826d;
                        }
                        if (i19 != 0) {
                            cVar4 = null;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i22 != 0) {
                            i40 = 1;
                        } else {
                            i40 = i23;
                        }
                        if (i25 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i27 != 0) {
                            i41 = Integer.MAX_VALUE;
                        } else {
                            i41 = i28;
                        }
                        if (i31 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i13;
                        }
                        if (i33 != 0) {
                            yVar3 = null;
                        } else {
                            yVar3 = yVar;
                        }
                        if (i35 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        A(i42, i41);
                        if (sVar.j(d1.j0.f22926a) == null) {
                            throw new ClassCastException();
                        }
                        sVar.d0(356926143);
                        sVar.p(false);
                        n3.h hVar11110 = (n3.h) sVar.j(z2.g1.f58550k);
                        int i4111111113 = (i30 & 14) | ((i30 >> 3) & 112);
                        executor = (Executor) sVar.j(t.f51192a);
                        if (executor == null) {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        } else {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        }
                        if (cVar4 == null) {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        } else {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        }
                        e eVar1119 = e.f51017c;
                        iHashCode = Long.hashCode(sVar.T);
                        z1.r rVarC1119 = z1.a.c(sVar, rVarZ);
                        l1.q1 q1VarL1119 = sVar.l();
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, eVar1119, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL1119, sVar);
                        l1.t.J(y2.j.f56915d, rVarC1119, sVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        sVar.p(true);
                        rVar2 = rVar3;
                        y0Var3 = y0Var4;
                        cVar3 = cVar4;
                        i39 = i40;
                        z13 = z14;
                        i37 = i43;
                        yVar2 = yVar3;
                        gVar2 = gVar3;
                    } else {
                        sVar.W();
                        i37 = i13;
                        gVar2 = gVar;
                        i38 = i28;
                        y0Var3 = y0Var2;
                        cVar3 = cVar2;
                        i39 = i23;
                        z13 = z11;
                        yVar2 = yVar;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        final z1.r rVar11112 = rVar2;
                        final int i4111111114 = i38;
                        x1VarT.f39502d = new fz.e() { // from class: s0.r
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                o0.c(str2, rVar11112, y0Var3, cVar3, i39, z13, i4111111114, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i30 |= 100663296;
                i35 = i15 & 512;
                i36 = 805306368;
                if (i35 == 0) {
                    i30 |= i36;
                } else if ((i14 & 805306368) == 0) {
                    if ((i14 & 1073741824) == 0) {
                        zH = sVar.f(gVar);
                    } else {
                        zH = sVar.h(gVar);
                    }
                    if (zH) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i30 |= i36;
                }
                if ((i30 & 306783379) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (sVar.T(i30 & 1, z12)) {
                    if (i44 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i17 != 0) {
                        y0Var2 = j3.y0.f35826d;
                    }
                    if (i19 != 0) {
                        cVar4 = null;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i22 != 0) {
                        i40 = 1;
                    } else {
                        i40 = i23;
                    }
                    if (i25 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i27 != 0) {
                        i41 = Integer.MAX_VALUE;
                    } else {
                        i41 = i28;
                    }
                    if (i31 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i13;
                    }
                    if (i33 != 0) {
                        yVar3 = null;
                    } else {
                        yVar3 = yVar;
                    }
                    if (i35 != 0) {
                        gVar3 = null;
                    } else {
                        gVar3 = gVar;
                    }
                    A(i42, i41);
                    if (sVar.j(d1.j0.f22926a) == null) {
                        throw new ClassCastException();
                    }
                    sVar.d0(356926143);
                    sVar.p(false);
                    n3.h hVar11111 = (n3.h) sVar.j(z2.g1.f58550k);
                    int i4111111115 = (i30 & 14) | ((i30 >> 3) & 112);
                    executor = (Executor) sVar.j(t.f51192a);
                    if (executor == null) {
                        y0Var4 = y0Var2;
                        z15 = false;
                        sVar.d0(1255196839);
                        sVar.p(false);
                    } else {
                        y0Var4 = y0Var2;
                        z15 = false;
                        sVar.d0(1255196839);
                        sVar.p(false);
                    }
                    if (cVar4 == null) {
                        str2 = str;
                        i38 = i41;
                        i43 = i42;
                        sVar.d0(357244017);
                        rVar3 = rVar2;
                        rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                        sVar.p(false);
                    } else {
                        str2 = str;
                        i38 = i41;
                        i43 = i42;
                        sVar.d0(357244017);
                        rVar3 = rVar2;
                        rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                        sVar.p(false);
                    }
                    e eVar11110 = e.f51017c;
                    iHashCode = Long.hashCode(sVar.T);
                    z1.r rVarC11110 = z1.a.c(sVar, rVarZ);
                    l1.q1 q1VarL11110 = sVar.l();
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, eVar11110, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL11110, sVar);
                    l1.t.J(y2.j.f56915d, rVarC11110, sVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    sVar.p(true);
                    rVar2 = rVar3;
                    y0Var3 = y0Var4;
                    cVar3 = cVar4;
                    i39 = i40;
                    z13 = z14;
                    i37 = i43;
                    yVar2 = yVar3;
                    gVar2 = gVar3;
                } else {
                    sVar.W();
                    i37 = i13;
                    gVar2 = gVar;
                    i38 = i28;
                    y0Var3 = y0Var2;
                    cVar3 = cVar2;
                    i39 = i23;
                    z13 = z11;
                    yVar2 = yVar;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    final z1.r rVar11113 = rVar2;
                    final int i4111111116 = i38;
                    x1VarT.f39502d = new fz.e() { // from class: s0.r
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            o0.c(str2, rVar11113, y0Var3, cVar3, i39, z13, i4111111116, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i16 |= 3072;
            cVar2 = cVar;
            i22 = i15 & 16;
            if (i22 != 0) {
                if ((i14 & 24576) == 0) {
                    i23 = i11;
                    if (sVar.d(i23)) {
                        i24 = 16384;
                    } else {
                        i24 = OSSConstants.DEFAULT_BUFFER_SIZE;
                    }
                    i16 |= i24;
                }
                i25 = i15 & 32;
                if (i25 != 0) {
                    i16 |= 196608;
                } else if ((i14 & 196608) == 0) {
                    if (sVar.g(z11)) {
                        i26 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i26 = 65536;
                    }
                    i16 |= i26;
                }
                i27 = i15 & 64;
                if (i27 != 0) {
                    i16 |= 1572864;
                    i28 = i12;
                } else {
                    i28 = i12;
                    if ((i14 & 1572864) == 0) {
                        if (sVar.d(i28)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i16 |= i29;
                    }
                }
                i30 = i16;
                i31 = i15 & 128;
                if (i31 != 0) {
                    if ((i14 & 12582912) == 0) {
                        if (sVar.d(i13)) {
                            i32 = 8388608;
                        } else {
                            i32 = 4194304;
                        }
                        i30 |= i32;
                    }
                    i33 = i15 & 256;
                    if (i33 != 0) {
                        if ((i14 & 100663296) == 0) {
                            if (sVar.h(yVar)) {
                                i34 = 67108864;
                            } else {
                                i34 = 33554432;
                            }
                            i30 |= i34;
                        }
                        i35 = i15 & 512;
                        i36 = 805306368;
                        if (i35 == 0) {
                            i30 |= i36;
                        } else if ((i14 & 805306368) == 0) {
                            if ((i14 & 1073741824) == 0) {
                                zH = sVar.f(gVar);
                            } else {
                                zH = sVar.h(gVar);
                            }
                            if (zH) {
                                i36 = 536870912;
                            } else {
                                i36 = 268435456;
                            }
                            i30 |= i36;
                        }
                        if ((i30 & 306783379) != 306783378) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (sVar.T(i30 & 1, z12)) {
                            if (i44 != 0) {
                                rVar2 = z1.o.f58481a;
                            }
                            if (i17 != 0) {
                                y0Var2 = j3.y0.f35826d;
                            }
                            if (i19 != 0) {
                                cVar4 = null;
                            } else {
                                cVar4 = cVar2;
                            }
                            if (i22 != 0) {
                                i40 = 1;
                            } else {
                                i40 = i23;
                            }
                            if (i25 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i27 != 0) {
                                i41 = Integer.MAX_VALUE;
                            } else {
                                i41 = i28;
                            }
                            if (i31 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i13;
                            }
                            if (i33 != 0) {
                                yVar3 = null;
                            } else {
                                yVar3 = yVar;
                            }
                            if (i35 != 0) {
                                gVar3 = null;
                            } else {
                                gVar3 = gVar;
                            }
                            A(i42, i41);
                            if (sVar.j(d1.j0.f22926a) == null) {
                                throw new ClassCastException();
                            }
                            sVar.d0(356926143);
                            sVar.p(false);
                            n3.h hVar11112 = (n3.h) sVar.j(z2.g1.f58550k);
                            int i4111111117 = (i30 & 14) | ((i30 >> 3) & 112);
                            executor = (Executor) sVar.j(t.f51192a);
                            if (executor == null) {
                                y0Var4 = y0Var2;
                                z15 = false;
                                sVar.d0(1255196839);
                                sVar.p(false);
                            } else {
                                y0Var4 = y0Var2;
                                z15 = false;
                                sVar.d0(1255196839);
                                sVar.p(false);
                            }
                            if (cVar4 == null) {
                                str2 = str;
                                i38 = i41;
                                i43 = i42;
                                sVar.d0(357244017);
                                rVar3 = rVar2;
                                rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                sVar.p(false);
                            } else {
                                str2 = str;
                                i38 = i41;
                                i43 = i42;
                                sVar.d0(357244017);
                                rVar3 = rVar2;
                                rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                sVar.p(false);
                            }
                            e eVar11111 = e.f51017c;
                            iHashCode = Long.hashCode(sVar.T);
                            z1.r rVarC11111 = z1.a.c(sVar, rVarZ);
                            l1.q1 q1VarL11111 = sVar.l();
                            y2.k.J.getClass();
                            iVar = y2.j.f56913b;
                            sVar.h0();
                            if (sVar.S) {
                                sVar.k(iVar);
                            } else {
                                sVar.r0();
                            }
                            l1.t.J(y2.j.f56917f, eVar11111, sVar);
                            l1.t.J(y2.j.f56916e, q1VarL11111, sVar);
                            l1.t.J(y2.j.f56915d, rVarC11111, sVar);
                            hVar = y2.j.f56918g;
                            if (sVar.S) {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            } else {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            }
                            sVar.p(true);
                            rVar2 = rVar3;
                            y0Var3 = y0Var4;
                            cVar3 = cVar4;
                            i39 = i40;
                            z13 = z14;
                            i37 = i43;
                            yVar2 = yVar3;
                            gVar2 = gVar3;
                        } else {
                            sVar.W();
                            i37 = i13;
                            gVar2 = gVar;
                            i38 = i28;
                            y0Var3 = y0Var2;
                            cVar3 = cVar2;
                            i39 = i23;
                            z13 = z11;
                            yVar2 = yVar;
                        }
                        x1VarT = sVar.t();
                        if (x1VarT != null) {
                            final z1.r rVar11114 = rVar2;
                            final int i4111111118 = i38;
                            x1VarT.f39502d = new fz.e() { // from class: s0.r
                                @Override // fz.e
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    o0.c(str2, rVar11114, y0Var3, cVar3, i39, z13, i4111111118, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                    return qy.b0.f48488a;
                                }
                            };
                        }
                    }
                    i30 |= 100663296;
                    i35 = i15 & 512;
                    i36 = 805306368;
                    if (i35 == 0) {
                        i30 |= i36;
                    } else if ((i14 & 805306368) == 0) {
                        if ((i14 & 1073741824) == 0) {
                            zH = sVar.f(gVar);
                        } else {
                            zH = sVar.h(gVar);
                        }
                        if (zH) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i30 |= i36;
                    }
                    if ((i30 & 306783379) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (sVar.T(i30 & 1, z12)) {
                        if (i44 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i17 != 0) {
                            y0Var2 = j3.y0.f35826d;
                        }
                        if (i19 != 0) {
                            cVar4 = null;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i22 != 0) {
                            i40 = 1;
                        } else {
                            i40 = i23;
                        }
                        if (i25 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i27 != 0) {
                            i41 = Integer.MAX_VALUE;
                        } else {
                            i41 = i28;
                        }
                        if (i31 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i13;
                        }
                        if (i33 != 0) {
                            yVar3 = null;
                        } else {
                            yVar3 = yVar;
                        }
                        if (i35 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        A(i42, i41);
                        if (sVar.j(d1.j0.f22926a) == null) {
                            throw new ClassCastException();
                        }
                        sVar.d0(356926143);
                        sVar.p(false);
                        n3.h hVar11113 = (n3.h) sVar.j(z2.g1.f58550k);
                        int i4111111119 = (i30 & 14) | ((i30 >> 3) & 112);
                        executor = (Executor) sVar.j(t.f51192a);
                        if (executor == null) {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        } else {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        }
                        if (cVar4 == null) {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        } else {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        }
                        e eVar11112 = e.f51017c;
                        iHashCode = Long.hashCode(sVar.T);
                        z1.r rVarC11112 = z1.a.c(sVar, rVarZ);
                        l1.q1 q1VarL11112 = sVar.l();
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, eVar11112, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL11112, sVar);
                        l1.t.J(y2.j.f56915d, rVarC11112, sVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        sVar.p(true);
                        rVar2 = rVar3;
                        y0Var3 = y0Var4;
                        cVar3 = cVar4;
                        i39 = i40;
                        z13 = z14;
                        i37 = i43;
                        yVar2 = yVar3;
                        gVar2 = gVar3;
                    } else {
                        sVar.W();
                        i37 = i13;
                        gVar2 = gVar;
                        i38 = i28;
                        y0Var3 = y0Var2;
                        cVar3 = cVar2;
                        i39 = i23;
                        z13 = z11;
                        yVar2 = yVar;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        final z1.r rVar11115 = rVar2;
                        final int i41111111110 = i38;
                        x1VarT.f39502d = new fz.e() { // from class: s0.r
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                o0.c(str2, rVar11115, y0Var3, cVar3, i39, z13, i41111111110, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i30 |= 12582912;
                i33 = i15 & 256;
                if (i33 != 0) {
                    if ((i14 & 100663296) == 0) {
                        if (sVar.h(yVar)) {
                            i34 = 67108864;
                        } else {
                            i34 = 33554432;
                        }
                        i30 |= i34;
                    }
                    i35 = i15 & 512;
                    i36 = 805306368;
                    if (i35 == 0) {
                        i30 |= i36;
                    } else if ((i14 & 805306368) == 0) {
                        if ((i14 & 1073741824) == 0) {
                            zH = sVar.f(gVar);
                        } else {
                            zH = sVar.h(gVar);
                        }
                        if (zH) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i30 |= i36;
                    }
                    if ((i30 & 306783379) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (sVar.T(i30 & 1, z12)) {
                        if (i44 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i17 != 0) {
                            y0Var2 = j3.y0.f35826d;
                        }
                        if (i19 != 0) {
                            cVar4 = null;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i22 != 0) {
                            i40 = 1;
                        } else {
                            i40 = i23;
                        }
                        if (i25 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i27 != 0) {
                            i41 = Integer.MAX_VALUE;
                        } else {
                            i41 = i28;
                        }
                        if (i31 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i13;
                        }
                        if (i33 != 0) {
                            yVar3 = null;
                        } else {
                            yVar3 = yVar;
                        }
                        if (i35 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        A(i42, i41);
                        if (sVar.j(d1.j0.f22926a) == null) {
                            throw new ClassCastException();
                        }
                        sVar.d0(356926143);
                        sVar.p(false);
                        n3.h hVar11114 = (n3.h) sVar.j(z2.g1.f58550k);
                        int i41111111111 = (i30 & 14) | ((i30 >> 3) & 112);
                        executor = (Executor) sVar.j(t.f51192a);
                        if (executor == null) {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        } else {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        }
                        if (cVar4 == null) {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        } else {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        }
                        e eVar11113 = e.f51017c;
                        iHashCode = Long.hashCode(sVar.T);
                        z1.r rVarC11113 = z1.a.c(sVar, rVarZ);
                        l1.q1 q1VarL11113 = sVar.l();
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, eVar11113, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL11113, sVar);
                        l1.t.J(y2.j.f56915d, rVarC11113, sVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        sVar.p(true);
                        rVar2 = rVar3;
                        y0Var3 = y0Var4;
                        cVar3 = cVar4;
                        i39 = i40;
                        z13 = z14;
                        i37 = i43;
                        yVar2 = yVar3;
                        gVar2 = gVar3;
                    } else {
                        sVar.W();
                        i37 = i13;
                        gVar2 = gVar;
                        i38 = i28;
                        y0Var3 = y0Var2;
                        cVar3 = cVar2;
                        i39 = i23;
                        z13 = z11;
                        yVar2 = yVar;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        final z1.r rVar11116 = rVar2;
                        final int i41111111112 = i38;
                        x1VarT.f39502d = new fz.e() { // from class: s0.r
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                o0.c(str2, rVar11116, y0Var3, cVar3, i39, z13, i41111111112, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i30 |= 100663296;
                i35 = i15 & 512;
                i36 = 805306368;
                if (i35 == 0) {
                    i30 |= i36;
                } else if ((i14 & 805306368) == 0) {
                    if ((i14 & 1073741824) == 0) {
                        zH = sVar.f(gVar);
                    } else {
                        zH = sVar.h(gVar);
                    }
                    if (zH) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i30 |= i36;
                }
                if ((i30 & 306783379) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (sVar.T(i30 & 1, z12)) {
                    if (i44 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i17 != 0) {
                        y0Var2 = j3.y0.f35826d;
                    }
                    if (i19 != 0) {
                        cVar4 = null;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i22 != 0) {
                        i40 = 1;
                    } else {
                        i40 = i23;
                    }
                    if (i25 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i27 != 0) {
                        i41 = Integer.MAX_VALUE;
                    } else {
                        i41 = i28;
                    }
                    if (i31 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i13;
                    }
                    if (i33 != 0) {
                        yVar3 = null;
                    } else {
                        yVar3 = yVar;
                    }
                    if (i35 != 0) {
                        gVar3 = null;
                    } else {
                        gVar3 = gVar;
                    }
                    A(i42, i41);
                    if (sVar.j(d1.j0.f22926a) == null) {
                        throw new ClassCastException();
                    }
                    sVar.d0(356926143);
                    sVar.p(false);
                    n3.h hVar11115 = (n3.h) sVar.j(z2.g1.f58550k);
                    int i41111111113 = (i30 & 14) | ((i30 >> 3) & 112);
                    executor = (Executor) sVar.j(t.f51192a);
                    if (executor == null) {
                        y0Var4 = y0Var2;
                        z15 = false;
                        sVar.d0(1255196839);
                        sVar.p(false);
                    } else {
                        y0Var4 = y0Var2;
                        z15 = false;
                        sVar.d0(1255196839);
                        sVar.p(false);
                    }
                    if (cVar4 == null) {
                        str2 = str;
                        i38 = i41;
                        i43 = i42;
                        sVar.d0(357244017);
                        rVar3 = rVar2;
                        rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                        sVar.p(false);
                    } else {
                        str2 = str;
                        i38 = i41;
                        i43 = i42;
                        sVar.d0(357244017);
                        rVar3 = rVar2;
                        rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                        sVar.p(false);
                    }
                    e eVar11114 = e.f51017c;
                    iHashCode = Long.hashCode(sVar.T);
                    z1.r rVarC11114 = z1.a.c(sVar, rVarZ);
                    l1.q1 q1VarL11114 = sVar.l();
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, eVar11114, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL11114, sVar);
                    l1.t.J(y2.j.f56915d, rVarC11114, sVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    sVar.p(true);
                    rVar2 = rVar3;
                    y0Var3 = y0Var4;
                    cVar3 = cVar4;
                    i39 = i40;
                    z13 = z14;
                    i37 = i43;
                    yVar2 = yVar3;
                    gVar2 = gVar3;
                } else {
                    sVar.W();
                    i37 = i13;
                    gVar2 = gVar;
                    i38 = i28;
                    y0Var3 = y0Var2;
                    cVar3 = cVar2;
                    i39 = i23;
                    z13 = z11;
                    yVar2 = yVar;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    final z1.r rVar11117 = rVar2;
                    final int i41111111114 = i38;
                    x1VarT.f39502d = new fz.e() { // from class: s0.r
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            o0.c(str2, rVar11117, y0Var3, cVar3, i39, z13, i41111111114, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i16 |= 24576;
            i23 = i11;
            i25 = i15 & 32;
            if (i25 != 0) {
                i16 |= 196608;
            } else if ((i14 & 196608) == 0) {
                if (sVar.g(z11)) {
                    i26 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                } else {
                    i26 = 65536;
                }
                i16 |= i26;
            }
            i27 = i15 & 64;
            if (i27 != 0) {
                i16 |= 1572864;
                i28 = i12;
            } else {
                i28 = i12;
                if ((i14 & 1572864) == 0) {
                    if (sVar.d(i28)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i16 |= i29;
                }
            }
            i30 = i16;
            i31 = i15 & 128;
            if (i31 != 0) {
                if ((i14 & 12582912) == 0) {
                    if (sVar.d(i13)) {
                        i32 = 8388608;
                    } else {
                        i32 = 4194304;
                    }
                    i30 |= i32;
                }
                i33 = i15 & 256;
                if (i33 != 0) {
                    if ((i14 & 100663296) == 0) {
                        if (sVar.h(yVar)) {
                            i34 = 67108864;
                        } else {
                            i34 = 33554432;
                        }
                        i30 |= i34;
                    }
                    i35 = i15 & 512;
                    i36 = 805306368;
                    if (i35 == 0) {
                        i30 |= i36;
                    } else if ((i14 & 805306368) == 0) {
                        if ((i14 & 1073741824) == 0) {
                            zH = sVar.f(gVar);
                        } else {
                            zH = sVar.h(gVar);
                        }
                        if (zH) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i30 |= i36;
                    }
                    if ((i30 & 306783379) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (sVar.T(i30 & 1, z12)) {
                        if (i44 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i17 != 0) {
                            y0Var2 = j3.y0.f35826d;
                        }
                        if (i19 != 0) {
                            cVar4 = null;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i22 != 0) {
                            i40 = 1;
                        } else {
                            i40 = i23;
                        }
                        if (i25 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i27 != 0) {
                            i41 = Integer.MAX_VALUE;
                        } else {
                            i41 = i28;
                        }
                        if (i31 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i13;
                        }
                        if (i33 != 0) {
                            yVar3 = null;
                        } else {
                            yVar3 = yVar;
                        }
                        if (i35 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        A(i42, i41);
                        if (sVar.j(d1.j0.f22926a) == null) {
                            throw new ClassCastException();
                        }
                        sVar.d0(356926143);
                        sVar.p(false);
                        n3.h hVar11116 = (n3.h) sVar.j(z2.g1.f58550k);
                        int i41111111115 = (i30 & 14) | ((i30 >> 3) & 112);
                        executor = (Executor) sVar.j(t.f51192a);
                        if (executor == null) {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        } else {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        }
                        if (cVar4 == null) {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        } else {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        }
                        e eVar11115 = e.f51017c;
                        iHashCode = Long.hashCode(sVar.T);
                        z1.r rVarC11115 = z1.a.c(sVar, rVarZ);
                        l1.q1 q1VarL11115 = sVar.l();
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, eVar11115, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL11115, sVar);
                        l1.t.J(y2.j.f56915d, rVarC11115, sVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        sVar.p(true);
                        rVar2 = rVar3;
                        y0Var3 = y0Var4;
                        cVar3 = cVar4;
                        i39 = i40;
                        z13 = z14;
                        i37 = i43;
                        yVar2 = yVar3;
                        gVar2 = gVar3;
                    } else {
                        sVar.W();
                        i37 = i13;
                        gVar2 = gVar;
                        i38 = i28;
                        y0Var3 = y0Var2;
                        cVar3 = cVar2;
                        i39 = i23;
                        z13 = z11;
                        yVar2 = yVar;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        final z1.r rVar11118 = rVar2;
                        final int i41111111116 = i38;
                        x1VarT.f39502d = new fz.e() { // from class: s0.r
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                o0.c(str2, rVar11118, y0Var3, cVar3, i39, z13, i41111111116, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i30 |= 100663296;
                i35 = i15 & 512;
                i36 = 805306368;
                if (i35 == 0) {
                    i30 |= i36;
                } else if ((i14 & 805306368) == 0) {
                    if ((i14 & 1073741824) == 0) {
                        zH = sVar.f(gVar);
                    } else {
                        zH = sVar.h(gVar);
                    }
                    if (zH) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i30 |= i36;
                }
                if ((i30 & 306783379) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (sVar.T(i30 & 1, z12)) {
                    if (i44 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i17 != 0) {
                        y0Var2 = j3.y0.f35826d;
                    }
                    if (i19 != 0) {
                        cVar4 = null;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i22 != 0) {
                        i40 = 1;
                    } else {
                        i40 = i23;
                    }
                    if (i25 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i27 != 0) {
                        i41 = Integer.MAX_VALUE;
                    } else {
                        i41 = i28;
                    }
                    if (i31 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i13;
                    }
                    if (i33 != 0) {
                        yVar3 = null;
                    } else {
                        yVar3 = yVar;
                    }
                    if (i35 != 0) {
                        gVar3 = null;
                    } else {
                        gVar3 = gVar;
                    }
                    A(i42, i41);
                    if (sVar.j(d1.j0.f22926a) == null) {
                        throw new ClassCastException();
                    }
                    sVar.d0(356926143);
                    sVar.p(false);
                    n3.h hVar11117 = (n3.h) sVar.j(z2.g1.f58550k);
                    int i41111111117 = (i30 & 14) | ((i30 >> 3) & 112);
                    executor = (Executor) sVar.j(t.f51192a);
                    if (executor == null) {
                        y0Var4 = y0Var2;
                        z15 = false;
                        sVar.d0(1255196839);
                        sVar.p(false);
                    } else {
                        y0Var4 = y0Var2;
                        z15 = false;
                        sVar.d0(1255196839);
                        sVar.p(false);
                    }
                    if (cVar4 == null) {
                        str2 = str;
                        i38 = i41;
                        i43 = i42;
                        sVar.d0(357244017);
                        rVar3 = rVar2;
                        rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                        sVar.p(false);
                    } else {
                        str2 = str;
                        i38 = i41;
                        i43 = i42;
                        sVar.d0(357244017);
                        rVar3 = rVar2;
                        rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                        sVar.p(false);
                    }
                    e eVar11116 = e.f51017c;
                    iHashCode = Long.hashCode(sVar.T);
                    z1.r rVarC11116 = z1.a.c(sVar, rVarZ);
                    l1.q1 q1VarL11116 = sVar.l();
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, eVar11116, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL11116, sVar);
                    l1.t.J(y2.j.f56915d, rVarC11116, sVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    sVar.p(true);
                    rVar2 = rVar3;
                    y0Var3 = y0Var4;
                    cVar3 = cVar4;
                    i39 = i40;
                    z13 = z14;
                    i37 = i43;
                    yVar2 = yVar3;
                    gVar2 = gVar3;
                } else {
                    sVar.W();
                    i37 = i13;
                    gVar2 = gVar;
                    i38 = i28;
                    y0Var3 = y0Var2;
                    cVar3 = cVar2;
                    i39 = i23;
                    z13 = z11;
                    yVar2 = yVar;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    final z1.r rVar11119 = rVar2;
                    final int i41111111118 = i38;
                    x1VarT.f39502d = new fz.e() { // from class: s0.r
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            o0.c(str2, rVar11119, y0Var3, cVar3, i39, z13, i41111111118, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i30 |= 12582912;
            i33 = i15 & 256;
            if (i33 != 0) {
                if ((i14 & 100663296) == 0) {
                    if (sVar.h(yVar)) {
                        i34 = 67108864;
                    } else {
                        i34 = 33554432;
                    }
                    i30 |= i34;
                }
                i35 = i15 & 512;
                i36 = 805306368;
                if (i35 == 0) {
                    i30 |= i36;
                } else if ((i14 & 805306368) == 0) {
                    if ((i14 & 1073741824) == 0) {
                        zH = sVar.f(gVar);
                    } else {
                        zH = sVar.h(gVar);
                    }
                    if (zH) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i30 |= i36;
                }
                if ((i30 & 306783379) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (sVar.T(i30 & 1, z12)) {
                    if (i44 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i17 != 0) {
                        y0Var2 = j3.y0.f35826d;
                    }
                    if (i19 != 0) {
                        cVar4 = null;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i22 != 0) {
                        i40 = 1;
                    } else {
                        i40 = i23;
                    }
                    if (i25 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i27 != 0) {
                        i41 = Integer.MAX_VALUE;
                    } else {
                        i41 = i28;
                    }
                    if (i31 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i13;
                    }
                    if (i33 != 0) {
                        yVar3 = null;
                    } else {
                        yVar3 = yVar;
                    }
                    if (i35 != 0) {
                        gVar3 = null;
                    } else {
                        gVar3 = gVar;
                    }
                    A(i42, i41);
                    if (sVar.j(d1.j0.f22926a) == null) {
                        throw new ClassCastException();
                    }
                    sVar.d0(356926143);
                    sVar.p(false);
                    n3.h hVar11118 = (n3.h) sVar.j(z2.g1.f58550k);
                    int i41111111119 = (i30 & 14) | ((i30 >> 3) & 112);
                    executor = (Executor) sVar.j(t.f51192a);
                    if (executor == null) {
                        y0Var4 = y0Var2;
                        z15 = false;
                        sVar.d0(1255196839);
                        sVar.p(false);
                    } else {
                        y0Var4 = y0Var2;
                        z15 = false;
                        sVar.d0(1255196839);
                        sVar.p(false);
                    }
                    if (cVar4 == null) {
                        str2 = str;
                        i38 = i41;
                        i43 = i42;
                        sVar.d0(357244017);
                        rVar3 = rVar2;
                        rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                        sVar.p(false);
                    } else {
                        str2 = str;
                        i38 = i41;
                        i43 = i42;
                        sVar.d0(357244017);
                        rVar3 = rVar2;
                        rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                        sVar.p(false);
                    }
                    e eVar11117 = e.f51017c;
                    iHashCode = Long.hashCode(sVar.T);
                    z1.r rVarC11117 = z1.a.c(sVar, rVarZ);
                    l1.q1 q1VarL11117 = sVar.l();
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, eVar11117, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL11117, sVar);
                    l1.t.J(y2.j.f56915d, rVarC11117, sVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    sVar.p(true);
                    rVar2 = rVar3;
                    y0Var3 = y0Var4;
                    cVar3 = cVar4;
                    i39 = i40;
                    z13 = z14;
                    i37 = i43;
                    yVar2 = yVar3;
                    gVar2 = gVar3;
                } else {
                    sVar.W();
                    i37 = i13;
                    gVar2 = gVar;
                    i38 = i28;
                    y0Var3 = y0Var2;
                    cVar3 = cVar2;
                    i39 = i23;
                    z13 = z11;
                    yVar2 = yVar;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    final z1.r rVar111110 = rVar2;
                    final int i411111111110 = i38;
                    x1VarT.f39502d = new fz.e() { // from class: s0.r
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            o0.c(str2, rVar111110, y0Var3, cVar3, i39, z13, i411111111110, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i30 |= 100663296;
            i35 = i15 & 512;
            i36 = 805306368;
            if (i35 == 0) {
                i30 |= i36;
            } else if ((i14 & 805306368) == 0) {
                if ((i14 & 1073741824) == 0) {
                    zH = sVar.f(gVar);
                } else {
                    zH = sVar.h(gVar);
                }
                if (zH) {
                    i36 = 536870912;
                } else {
                    i36 = 268435456;
                }
                i30 |= i36;
            }
            if ((i30 & 306783379) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (sVar.T(i30 & 1, z12)) {
                if (i44 != 0) {
                    rVar2 = z1.o.f58481a;
                }
                if (i17 != 0) {
                    y0Var2 = j3.y0.f35826d;
                }
                if (i19 != 0) {
                    cVar4 = null;
                } else {
                    cVar4 = cVar2;
                }
                if (i22 != 0) {
                    i40 = 1;
                } else {
                    i40 = i23;
                }
                if (i25 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                if (i27 != 0) {
                    i41 = Integer.MAX_VALUE;
                } else {
                    i41 = i28;
                }
                if (i31 != 0) {
                    i42 = 1;
                } else {
                    i42 = i13;
                }
                if (i33 != 0) {
                    yVar3 = null;
                } else {
                    yVar3 = yVar;
                }
                if (i35 != 0) {
                    gVar3 = null;
                } else {
                    gVar3 = gVar;
                }
                A(i42, i41);
                if (sVar.j(d1.j0.f22926a) == null) {
                    throw new ClassCastException();
                }
                sVar.d0(356926143);
                sVar.p(false);
                n3.h hVar11119 = (n3.h) sVar.j(z2.g1.f58550k);
                int i411111111111 = (i30 & 14) | ((i30 >> 3) & 112);
                executor = (Executor) sVar.j(t.f51192a);
                if (executor == null) {
                    y0Var4 = y0Var2;
                    z15 = false;
                    sVar.d0(1255196839);
                    sVar.p(false);
                } else {
                    y0Var4 = y0Var2;
                    z15 = false;
                    sVar.d0(1255196839);
                    sVar.p(false);
                }
                if (cVar4 == null) {
                    str2 = str;
                    i38 = i41;
                    i43 = i42;
                    sVar.d0(357244017);
                    rVar3 = rVar2;
                    rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                    sVar.p(false);
                } else {
                    str2 = str;
                    i38 = i41;
                    i43 = i42;
                    sVar.d0(357244017);
                    rVar3 = rVar2;
                    rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                    sVar.p(false);
                }
                e eVar11118 = e.f51017c;
                iHashCode = Long.hashCode(sVar.T);
                z1.r rVarC11118 = z1.a.c(sVar, rVarZ);
                l1.q1 q1VarL11118 = sVar.l();
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, eVar11118, sVar);
                l1.t.J(y2.j.f56916e, q1VarL11118, sVar);
                l1.t.J(y2.j.f56915d, rVarC11118, sVar);
                hVar = y2.j.f56918g;
                if (sVar.S) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                } else {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                sVar.p(true);
                rVar2 = rVar3;
                y0Var3 = y0Var4;
                cVar3 = cVar4;
                i39 = i40;
                z13 = z14;
                i37 = i43;
                yVar2 = yVar3;
                gVar2 = gVar3;
            } else {
                sVar.W();
                i37 = i13;
                gVar2 = gVar;
                i38 = i28;
                y0Var3 = y0Var2;
                cVar3 = cVar2;
                i39 = i23;
                z13 = z11;
                yVar2 = yVar;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                final z1.r rVar111111 = rVar2;
                final int i411111111112 = i38;
                x1VarT.f39502d = new fz.e() { // from class: s0.r
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        o0.c(str2, rVar111111, y0Var3, cVar3, i39, z13, i411111111112, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i16 |= 384;
        y0Var2 = y0Var;
        i19 = i15 & 8;
        if (i19 != 0) {
            if ((i14 & 3072) == 0) {
                cVar2 = cVar;
                if (sVar.h(cVar2)) {
                    i21 = 2048;
                } else {
                    i21 = 1024;
                }
                i16 |= i21;
            }
            i22 = i15 & 16;
            if (i22 != 0) {
                if ((i14 & 24576) == 0) {
                    i23 = i11;
                    if (sVar.d(i23)) {
                        i24 = 16384;
                    } else {
                        i24 = OSSConstants.DEFAULT_BUFFER_SIZE;
                    }
                    i16 |= i24;
                }
                i25 = i15 & 32;
                if (i25 != 0) {
                    i16 |= 196608;
                } else if ((i14 & 196608) == 0) {
                    if (sVar.g(z11)) {
                        i26 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i26 = 65536;
                    }
                    i16 |= i26;
                }
                i27 = i15 & 64;
                if (i27 != 0) {
                    i16 |= 1572864;
                    i28 = i12;
                } else {
                    i28 = i12;
                    if ((i14 & 1572864) == 0) {
                        if (sVar.d(i28)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i16 |= i29;
                    }
                }
                i30 = i16;
                i31 = i15 & 128;
                if (i31 != 0) {
                    if ((i14 & 12582912) == 0) {
                        if (sVar.d(i13)) {
                            i32 = 8388608;
                        } else {
                            i32 = 4194304;
                        }
                        i30 |= i32;
                    }
                    i33 = i15 & 256;
                    if (i33 != 0) {
                        if ((i14 & 100663296) == 0) {
                            if (sVar.h(yVar)) {
                                i34 = 67108864;
                            } else {
                                i34 = 33554432;
                            }
                            i30 |= i34;
                        }
                        i35 = i15 & 512;
                        i36 = 805306368;
                        if (i35 == 0) {
                            i30 |= i36;
                        } else if ((i14 & 805306368) == 0) {
                            if ((i14 & 1073741824) == 0) {
                                zH = sVar.f(gVar);
                            } else {
                                zH = sVar.h(gVar);
                            }
                            if (zH) {
                                i36 = 536870912;
                            } else {
                                i36 = 268435456;
                            }
                            i30 |= i36;
                        }
                        if ((i30 & 306783379) != 306783378) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (sVar.T(i30 & 1, z12)) {
                            if (i44 != 0) {
                                rVar2 = z1.o.f58481a;
                            }
                            if (i17 != 0) {
                                y0Var2 = j3.y0.f35826d;
                            }
                            if (i19 != 0) {
                                cVar4 = null;
                            } else {
                                cVar4 = cVar2;
                            }
                            if (i22 != 0) {
                                i40 = 1;
                            } else {
                                i40 = i23;
                            }
                            if (i25 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i27 != 0) {
                                i41 = Integer.MAX_VALUE;
                            } else {
                                i41 = i28;
                            }
                            if (i31 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i13;
                            }
                            if (i33 != 0) {
                                yVar3 = null;
                            } else {
                                yVar3 = yVar;
                            }
                            if (i35 != 0) {
                                gVar3 = null;
                            } else {
                                gVar3 = gVar;
                            }
                            A(i42, i41);
                            if (sVar.j(d1.j0.f22926a) == null) {
                                throw new ClassCastException();
                            }
                            sVar.d0(356926143);
                            sVar.p(false);
                            n3.h hVar111110 = (n3.h) sVar.j(z2.g1.f58550k);
                            int i411111111113 = (i30 & 14) | ((i30 >> 3) & 112);
                            executor = (Executor) sVar.j(t.f51192a);
                            if (executor == null) {
                                y0Var4 = y0Var2;
                                z15 = false;
                                sVar.d0(1255196839);
                                sVar.p(false);
                            } else {
                                y0Var4 = y0Var2;
                                z15 = false;
                                sVar.d0(1255196839);
                                sVar.p(false);
                            }
                            if (cVar4 == null) {
                                str2 = str;
                                i38 = i41;
                                i43 = i42;
                                sVar.d0(357244017);
                                rVar3 = rVar2;
                                rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                sVar.p(false);
                            } else {
                                str2 = str;
                                i38 = i41;
                                i43 = i42;
                                sVar.d0(357244017);
                                rVar3 = rVar2;
                                rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                                sVar.p(false);
                            }
                            e eVar11119 = e.f51017c;
                            iHashCode = Long.hashCode(sVar.T);
                            z1.r rVarC11119 = z1.a.c(sVar, rVarZ);
                            l1.q1 q1VarL11119 = sVar.l();
                            y2.k.J.getClass();
                            iVar = y2.j.f56913b;
                            sVar.h0();
                            if (sVar.S) {
                                sVar.k(iVar);
                            } else {
                                sVar.r0();
                            }
                            l1.t.J(y2.j.f56917f, eVar11119, sVar);
                            l1.t.J(y2.j.f56916e, q1VarL11119, sVar);
                            l1.t.J(y2.j.f56915d, rVarC11119, sVar);
                            hVar = y2.j.f56918g;
                            if (sVar.S) {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            } else {
                                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                            }
                            sVar.p(true);
                            rVar2 = rVar3;
                            y0Var3 = y0Var4;
                            cVar3 = cVar4;
                            i39 = i40;
                            z13 = z14;
                            i37 = i43;
                            yVar2 = yVar3;
                            gVar2 = gVar3;
                        } else {
                            sVar.W();
                            i37 = i13;
                            gVar2 = gVar;
                            i38 = i28;
                            y0Var3 = y0Var2;
                            cVar3 = cVar2;
                            i39 = i23;
                            z13 = z11;
                            yVar2 = yVar;
                        }
                        x1VarT = sVar.t();
                        if (x1VarT != null) {
                            final z1.r rVar111112 = rVar2;
                            final int i411111111114 = i38;
                            x1VarT.f39502d = new fz.e() { // from class: s0.r
                                @Override // fz.e
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    o0.c(str2, rVar111112, y0Var3, cVar3, i39, z13, i411111111114, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                    return qy.b0.f48488a;
                                }
                            };
                        }
                    }
                    i30 |= 100663296;
                    i35 = i15 & 512;
                    i36 = 805306368;
                    if (i35 == 0) {
                        i30 |= i36;
                    } else if ((i14 & 805306368) == 0) {
                        if ((i14 & 1073741824) == 0) {
                            zH = sVar.f(gVar);
                        } else {
                            zH = sVar.h(gVar);
                        }
                        if (zH) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i30 |= i36;
                    }
                    if ((i30 & 306783379) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (sVar.T(i30 & 1, z12)) {
                        if (i44 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i17 != 0) {
                            y0Var2 = j3.y0.f35826d;
                        }
                        if (i19 != 0) {
                            cVar4 = null;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i22 != 0) {
                            i40 = 1;
                        } else {
                            i40 = i23;
                        }
                        if (i25 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i27 != 0) {
                            i41 = Integer.MAX_VALUE;
                        } else {
                            i41 = i28;
                        }
                        if (i31 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i13;
                        }
                        if (i33 != 0) {
                            yVar3 = null;
                        } else {
                            yVar3 = yVar;
                        }
                        if (i35 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        A(i42, i41);
                        if (sVar.j(d1.j0.f22926a) == null) {
                            throw new ClassCastException();
                        }
                        sVar.d0(356926143);
                        sVar.p(false);
                        n3.h hVar111111 = (n3.h) sVar.j(z2.g1.f58550k);
                        int i411111111115 = (i30 & 14) | ((i30 >> 3) & 112);
                        executor = (Executor) sVar.j(t.f51192a);
                        if (executor == null) {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        } else {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        }
                        if (cVar4 == null) {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        } else {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        }
                        e eVar111110 = e.f51017c;
                        iHashCode = Long.hashCode(sVar.T);
                        z1.r rVarC111110 = z1.a.c(sVar, rVarZ);
                        l1.q1 q1VarL111110 = sVar.l();
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, eVar111110, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL111110, sVar);
                        l1.t.J(y2.j.f56915d, rVarC111110, sVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        sVar.p(true);
                        rVar2 = rVar3;
                        y0Var3 = y0Var4;
                        cVar3 = cVar4;
                        i39 = i40;
                        z13 = z14;
                        i37 = i43;
                        yVar2 = yVar3;
                        gVar2 = gVar3;
                    } else {
                        sVar.W();
                        i37 = i13;
                        gVar2 = gVar;
                        i38 = i28;
                        y0Var3 = y0Var2;
                        cVar3 = cVar2;
                        i39 = i23;
                        z13 = z11;
                        yVar2 = yVar;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        final z1.r rVar111113 = rVar2;
                        final int i411111111116 = i38;
                        x1VarT.f39502d = new fz.e() { // from class: s0.r
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                o0.c(str2, rVar111113, y0Var3, cVar3, i39, z13, i411111111116, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i30 |= 12582912;
                i33 = i15 & 256;
                if (i33 != 0) {
                    if ((i14 & 100663296) == 0) {
                        if (sVar.h(yVar)) {
                            i34 = 67108864;
                        } else {
                            i34 = 33554432;
                        }
                        i30 |= i34;
                    }
                    i35 = i15 & 512;
                    i36 = 805306368;
                    if (i35 == 0) {
                        i30 |= i36;
                    } else if ((i14 & 805306368) == 0) {
                        if ((i14 & 1073741824) == 0) {
                            zH = sVar.f(gVar);
                        } else {
                            zH = sVar.h(gVar);
                        }
                        if (zH) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i30 |= i36;
                    }
                    if ((i30 & 306783379) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (sVar.T(i30 & 1, z12)) {
                        if (i44 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i17 != 0) {
                            y0Var2 = j3.y0.f35826d;
                        }
                        if (i19 != 0) {
                            cVar4 = null;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i22 != 0) {
                            i40 = 1;
                        } else {
                            i40 = i23;
                        }
                        if (i25 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i27 != 0) {
                            i41 = Integer.MAX_VALUE;
                        } else {
                            i41 = i28;
                        }
                        if (i31 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i13;
                        }
                        if (i33 != 0) {
                            yVar3 = null;
                        } else {
                            yVar3 = yVar;
                        }
                        if (i35 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        A(i42, i41);
                        if (sVar.j(d1.j0.f22926a) == null) {
                            throw new ClassCastException();
                        }
                        sVar.d0(356926143);
                        sVar.p(false);
                        n3.h hVar111112 = (n3.h) sVar.j(z2.g1.f58550k);
                        int i411111111117 = (i30 & 14) | ((i30 >> 3) & 112);
                        executor = (Executor) sVar.j(t.f51192a);
                        if (executor == null) {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        } else {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        }
                        if (cVar4 == null) {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        } else {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        }
                        e eVar111111 = e.f51017c;
                        iHashCode = Long.hashCode(sVar.T);
                        z1.r rVarC111111 = z1.a.c(sVar, rVarZ);
                        l1.q1 q1VarL111111 = sVar.l();
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, eVar111111, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL111111, sVar);
                        l1.t.J(y2.j.f56915d, rVarC111111, sVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        sVar.p(true);
                        rVar2 = rVar3;
                        y0Var3 = y0Var4;
                        cVar3 = cVar4;
                        i39 = i40;
                        z13 = z14;
                        i37 = i43;
                        yVar2 = yVar3;
                        gVar2 = gVar3;
                    } else {
                        sVar.W();
                        i37 = i13;
                        gVar2 = gVar;
                        i38 = i28;
                        y0Var3 = y0Var2;
                        cVar3 = cVar2;
                        i39 = i23;
                        z13 = z11;
                        yVar2 = yVar;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        final z1.r rVar111114 = rVar2;
                        final int i411111111118 = i38;
                        x1VarT.f39502d = new fz.e() { // from class: s0.r
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                o0.c(str2, rVar111114, y0Var3, cVar3, i39, z13, i411111111118, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i30 |= 100663296;
                i35 = i15 & 512;
                i36 = 805306368;
                if (i35 == 0) {
                    i30 |= i36;
                } else if ((i14 & 805306368) == 0) {
                    if ((i14 & 1073741824) == 0) {
                        zH = sVar.f(gVar);
                    } else {
                        zH = sVar.h(gVar);
                    }
                    if (zH) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i30 |= i36;
                }
                if ((i30 & 306783379) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (sVar.T(i30 & 1, z12)) {
                    if (i44 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i17 != 0) {
                        y0Var2 = j3.y0.f35826d;
                    }
                    if (i19 != 0) {
                        cVar4 = null;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i22 != 0) {
                        i40 = 1;
                    } else {
                        i40 = i23;
                    }
                    if (i25 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i27 != 0) {
                        i41 = Integer.MAX_VALUE;
                    } else {
                        i41 = i28;
                    }
                    if (i31 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i13;
                    }
                    if (i33 != 0) {
                        yVar3 = null;
                    } else {
                        yVar3 = yVar;
                    }
                    if (i35 != 0) {
                        gVar3 = null;
                    } else {
                        gVar3 = gVar;
                    }
                    A(i42, i41);
                    if (sVar.j(d1.j0.f22926a) == null) {
                        throw new ClassCastException();
                    }
                    sVar.d0(356926143);
                    sVar.p(false);
                    n3.h hVar111113 = (n3.h) sVar.j(z2.g1.f58550k);
                    int i411111111119 = (i30 & 14) | ((i30 >> 3) & 112);
                    executor = (Executor) sVar.j(t.f51192a);
                    if (executor == null) {
                        y0Var4 = y0Var2;
                        z15 = false;
                        sVar.d0(1255196839);
                        sVar.p(false);
                    } else {
                        y0Var4 = y0Var2;
                        z15 = false;
                        sVar.d0(1255196839);
                        sVar.p(false);
                    }
                    if (cVar4 == null) {
                        str2 = str;
                        i38 = i41;
                        i43 = i42;
                        sVar.d0(357244017);
                        rVar3 = rVar2;
                        rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                        sVar.p(false);
                    } else {
                        str2 = str;
                        i38 = i41;
                        i43 = i42;
                        sVar.d0(357244017);
                        rVar3 = rVar2;
                        rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                        sVar.p(false);
                    }
                    e eVar111112 = e.f51017c;
                    iHashCode = Long.hashCode(sVar.T);
                    z1.r rVarC111112 = z1.a.c(sVar, rVarZ);
                    l1.q1 q1VarL111112 = sVar.l();
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, eVar111112, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL111112, sVar);
                    l1.t.J(y2.j.f56915d, rVarC111112, sVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    sVar.p(true);
                    rVar2 = rVar3;
                    y0Var3 = y0Var4;
                    cVar3 = cVar4;
                    i39 = i40;
                    z13 = z14;
                    i37 = i43;
                    yVar2 = yVar3;
                    gVar2 = gVar3;
                } else {
                    sVar.W();
                    i37 = i13;
                    gVar2 = gVar;
                    i38 = i28;
                    y0Var3 = y0Var2;
                    cVar3 = cVar2;
                    i39 = i23;
                    z13 = z11;
                    yVar2 = yVar;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    final z1.r rVar111115 = rVar2;
                    final int i4111111111110 = i38;
                    x1VarT.f39502d = new fz.e() { // from class: s0.r
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            o0.c(str2, rVar111115, y0Var3, cVar3, i39, z13, i4111111111110, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i16 |= 24576;
            i23 = i11;
            i25 = i15 & 32;
            if (i25 != 0) {
                i16 |= 196608;
            } else if ((i14 & 196608) == 0) {
                if (sVar.g(z11)) {
                    i26 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                } else {
                    i26 = 65536;
                }
                i16 |= i26;
            }
            i27 = i15 & 64;
            if (i27 != 0) {
                i16 |= 1572864;
                i28 = i12;
            } else {
                i28 = i12;
                if ((i14 & 1572864) == 0) {
                    if (sVar.d(i28)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i16 |= i29;
                }
            }
            i30 = i16;
            i31 = i15 & 128;
            if (i31 != 0) {
                if ((i14 & 12582912) == 0) {
                    if (sVar.d(i13)) {
                        i32 = 8388608;
                    } else {
                        i32 = 4194304;
                    }
                    i30 |= i32;
                }
                i33 = i15 & 256;
                if (i33 != 0) {
                    if ((i14 & 100663296) == 0) {
                        if (sVar.h(yVar)) {
                            i34 = 67108864;
                        } else {
                            i34 = 33554432;
                        }
                        i30 |= i34;
                    }
                    i35 = i15 & 512;
                    i36 = 805306368;
                    if (i35 == 0) {
                        i30 |= i36;
                    } else if ((i14 & 805306368) == 0) {
                        if ((i14 & 1073741824) == 0) {
                            zH = sVar.f(gVar);
                        } else {
                            zH = sVar.h(gVar);
                        }
                        if (zH) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i30 |= i36;
                    }
                    if ((i30 & 306783379) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (sVar.T(i30 & 1, z12)) {
                        if (i44 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i17 != 0) {
                            y0Var2 = j3.y0.f35826d;
                        }
                        if (i19 != 0) {
                            cVar4 = null;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i22 != 0) {
                            i40 = 1;
                        } else {
                            i40 = i23;
                        }
                        if (i25 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i27 != 0) {
                            i41 = Integer.MAX_VALUE;
                        } else {
                            i41 = i28;
                        }
                        if (i31 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i13;
                        }
                        if (i33 != 0) {
                            yVar3 = null;
                        } else {
                            yVar3 = yVar;
                        }
                        if (i35 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        A(i42, i41);
                        if (sVar.j(d1.j0.f22926a) == null) {
                            throw new ClassCastException();
                        }
                        sVar.d0(356926143);
                        sVar.p(false);
                        n3.h hVar111114 = (n3.h) sVar.j(z2.g1.f58550k);
                        int i4111111111111 = (i30 & 14) | ((i30 >> 3) & 112);
                        executor = (Executor) sVar.j(t.f51192a);
                        if (executor == null) {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        } else {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        }
                        if (cVar4 == null) {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        } else {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        }
                        e eVar111113 = e.f51017c;
                        iHashCode = Long.hashCode(sVar.T);
                        z1.r rVarC111113 = z1.a.c(sVar, rVarZ);
                        l1.q1 q1VarL111113 = sVar.l();
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, eVar111113, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL111113, sVar);
                        l1.t.J(y2.j.f56915d, rVarC111113, sVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        sVar.p(true);
                        rVar2 = rVar3;
                        y0Var3 = y0Var4;
                        cVar3 = cVar4;
                        i39 = i40;
                        z13 = z14;
                        i37 = i43;
                        yVar2 = yVar3;
                        gVar2 = gVar3;
                    } else {
                        sVar.W();
                        i37 = i13;
                        gVar2 = gVar;
                        i38 = i28;
                        y0Var3 = y0Var2;
                        cVar3 = cVar2;
                        i39 = i23;
                        z13 = z11;
                        yVar2 = yVar;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        final z1.r rVar111116 = rVar2;
                        final int i4111111111112 = i38;
                        x1VarT.f39502d = new fz.e() { // from class: s0.r
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                o0.c(str2, rVar111116, y0Var3, cVar3, i39, z13, i4111111111112, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i30 |= 100663296;
                i35 = i15 & 512;
                i36 = 805306368;
                if (i35 == 0) {
                    i30 |= i36;
                } else if ((i14 & 805306368) == 0) {
                    if ((i14 & 1073741824) == 0) {
                        zH = sVar.f(gVar);
                    } else {
                        zH = sVar.h(gVar);
                    }
                    if (zH) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i30 |= i36;
                }
                if ((i30 & 306783379) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (sVar.T(i30 & 1, z12)) {
                    if (i44 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i17 != 0) {
                        y0Var2 = j3.y0.f35826d;
                    }
                    if (i19 != 0) {
                        cVar4 = null;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i22 != 0) {
                        i40 = 1;
                    } else {
                        i40 = i23;
                    }
                    if (i25 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i27 != 0) {
                        i41 = Integer.MAX_VALUE;
                    } else {
                        i41 = i28;
                    }
                    if (i31 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i13;
                    }
                    if (i33 != 0) {
                        yVar3 = null;
                    } else {
                        yVar3 = yVar;
                    }
                    if (i35 != 0) {
                        gVar3 = null;
                    } else {
                        gVar3 = gVar;
                    }
                    A(i42, i41);
                    if (sVar.j(d1.j0.f22926a) == null) {
                        throw new ClassCastException();
                    }
                    sVar.d0(356926143);
                    sVar.p(false);
                    n3.h hVar111115 = (n3.h) sVar.j(z2.g1.f58550k);
                    int i4111111111113 = (i30 & 14) | ((i30 >> 3) & 112);
                    executor = (Executor) sVar.j(t.f51192a);
                    if (executor == null) {
                        y0Var4 = y0Var2;
                        z15 = false;
                        sVar.d0(1255196839);
                        sVar.p(false);
                    } else {
                        y0Var4 = y0Var2;
                        z15 = false;
                        sVar.d0(1255196839);
                        sVar.p(false);
                    }
                    if (cVar4 == null) {
                        str2 = str;
                        i38 = i41;
                        i43 = i42;
                        sVar.d0(357244017);
                        rVar3 = rVar2;
                        rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                        sVar.p(false);
                    } else {
                        str2 = str;
                        i38 = i41;
                        i43 = i42;
                        sVar.d0(357244017);
                        rVar3 = rVar2;
                        rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                        sVar.p(false);
                    }
                    e eVar111114 = e.f51017c;
                    iHashCode = Long.hashCode(sVar.T);
                    z1.r rVarC111114 = z1.a.c(sVar, rVarZ);
                    l1.q1 q1VarL111114 = sVar.l();
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, eVar111114, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL111114, sVar);
                    l1.t.J(y2.j.f56915d, rVarC111114, sVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    sVar.p(true);
                    rVar2 = rVar3;
                    y0Var3 = y0Var4;
                    cVar3 = cVar4;
                    i39 = i40;
                    z13 = z14;
                    i37 = i43;
                    yVar2 = yVar3;
                    gVar2 = gVar3;
                } else {
                    sVar.W();
                    i37 = i13;
                    gVar2 = gVar;
                    i38 = i28;
                    y0Var3 = y0Var2;
                    cVar3 = cVar2;
                    i39 = i23;
                    z13 = z11;
                    yVar2 = yVar;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    final z1.r rVar111117 = rVar2;
                    final int i4111111111114 = i38;
                    x1VarT.f39502d = new fz.e() { // from class: s0.r
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            o0.c(str2, rVar111117, y0Var3, cVar3, i39, z13, i4111111111114, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i30 |= 12582912;
            i33 = i15 & 256;
            if (i33 != 0) {
                if ((i14 & 100663296) == 0) {
                    if (sVar.h(yVar)) {
                        i34 = 67108864;
                    } else {
                        i34 = 33554432;
                    }
                    i30 |= i34;
                }
                i35 = i15 & 512;
                i36 = 805306368;
                if (i35 == 0) {
                    i30 |= i36;
                } else if ((i14 & 805306368) == 0) {
                    if ((i14 & 1073741824) == 0) {
                        zH = sVar.f(gVar);
                    } else {
                        zH = sVar.h(gVar);
                    }
                    if (zH) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i30 |= i36;
                }
                if ((i30 & 306783379) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (sVar.T(i30 & 1, z12)) {
                    if (i44 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i17 != 0) {
                        y0Var2 = j3.y0.f35826d;
                    }
                    if (i19 != 0) {
                        cVar4 = null;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i22 != 0) {
                        i40 = 1;
                    } else {
                        i40 = i23;
                    }
                    if (i25 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i27 != 0) {
                        i41 = Integer.MAX_VALUE;
                    } else {
                        i41 = i28;
                    }
                    if (i31 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i13;
                    }
                    if (i33 != 0) {
                        yVar3 = null;
                    } else {
                        yVar3 = yVar;
                    }
                    if (i35 != 0) {
                        gVar3 = null;
                    } else {
                        gVar3 = gVar;
                    }
                    A(i42, i41);
                    if (sVar.j(d1.j0.f22926a) == null) {
                        throw new ClassCastException();
                    }
                    sVar.d0(356926143);
                    sVar.p(false);
                    n3.h hVar111116 = (n3.h) sVar.j(z2.g1.f58550k);
                    int i4111111111115 = (i30 & 14) | ((i30 >> 3) & 112);
                    executor = (Executor) sVar.j(t.f51192a);
                    if (executor == null) {
                        y0Var4 = y0Var2;
                        z15 = false;
                        sVar.d0(1255196839);
                        sVar.p(false);
                    } else {
                        y0Var4 = y0Var2;
                        z15 = false;
                        sVar.d0(1255196839);
                        sVar.p(false);
                    }
                    if (cVar4 == null) {
                        str2 = str;
                        i38 = i41;
                        i43 = i42;
                        sVar.d0(357244017);
                        rVar3 = rVar2;
                        rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                        sVar.p(false);
                    } else {
                        str2 = str;
                        i38 = i41;
                        i43 = i42;
                        sVar.d0(357244017);
                        rVar3 = rVar2;
                        rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                        sVar.p(false);
                    }
                    e eVar111115 = e.f51017c;
                    iHashCode = Long.hashCode(sVar.T);
                    z1.r rVarC111115 = z1.a.c(sVar, rVarZ);
                    l1.q1 q1VarL111115 = sVar.l();
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, eVar111115, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL111115, sVar);
                    l1.t.J(y2.j.f56915d, rVarC111115, sVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    sVar.p(true);
                    rVar2 = rVar3;
                    y0Var3 = y0Var4;
                    cVar3 = cVar4;
                    i39 = i40;
                    z13 = z14;
                    i37 = i43;
                    yVar2 = yVar3;
                    gVar2 = gVar3;
                } else {
                    sVar.W();
                    i37 = i13;
                    gVar2 = gVar;
                    i38 = i28;
                    y0Var3 = y0Var2;
                    cVar3 = cVar2;
                    i39 = i23;
                    z13 = z11;
                    yVar2 = yVar;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    final z1.r rVar111118 = rVar2;
                    final int i4111111111116 = i38;
                    x1VarT.f39502d = new fz.e() { // from class: s0.r
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            o0.c(str2, rVar111118, y0Var3, cVar3, i39, z13, i4111111111116, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i30 |= 100663296;
            i35 = i15 & 512;
            i36 = 805306368;
            if (i35 == 0) {
                i30 |= i36;
            } else if ((i14 & 805306368) == 0) {
                if ((i14 & 1073741824) == 0) {
                    zH = sVar.f(gVar);
                } else {
                    zH = sVar.h(gVar);
                }
                if (zH) {
                    i36 = 536870912;
                } else {
                    i36 = 268435456;
                }
                i30 |= i36;
            }
            if ((i30 & 306783379) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (sVar.T(i30 & 1, z12)) {
                if (i44 != 0) {
                    rVar2 = z1.o.f58481a;
                }
                if (i17 != 0) {
                    y0Var2 = j3.y0.f35826d;
                }
                if (i19 != 0) {
                    cVar4 = null;
                } else {
                    cVar4 = cVar2;
                }
                if (i22 != 0) {
                    i40 = 1;
                } else {
                    i40 = i23;
                }
                if (i25 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                if (i27 != 0) {
                    i41 = Integer.MAX_VALUE;
                } else {
                    i41 = i28;
                }
                if (i31 != 0) {
                    i42 = 1;
                } else {
                    i42 = i13;
                }
                if (i33 != 0) {
                    yVar3 = null;
                } else {
                    yVar3 = yVar;
                }
                if (i35 != 0) {
                    gVar3 = null;
                } else {
                    gVar3 = gVar;
                }
                A(i42, i41);
                if (sVar.j(d1.j0.f22926a) == null) {
                    throw new ClassCastException();
                }
                sVar.d0(356926143);
                sVar.p(false);
                n3.h hVar111117 = (n3.h) sVar.j(z2.g1.f58550k);
                int i4111111111117 = (i30 & 14) | ((i30 >> 3) & 112);
                executor = (Executor) sVar.j(t.f51192a);
                if (executor == null) {
                    y0Var4 = y0Var2;
                    z15 = false;
                    sVar.d0(1255196839);
                    sVar.p(false);
                } else {
                    y0Var4 = y0Var2;
                    z15 = false;
                    sVar.d0(1255196839);
                    sVar.p(false);
                }
                if (cVar4 == null) {
                    str2 = str;
                    i38 = i41;
                    i43 = i42;
                    sVar.d0(357244017);
                    rVar3 = rVar2;
                    rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                    sVar.p(false);
                } else {
                    str2 = str;
                    i38 = i41;
                    i43 = i42;
                    sVar.d0(357244017);
                    rVar3 = rVar2;
                    rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                    sVar.p(false);
                }
                e eVar111116 = e.f51017c;
                iHashCode = Long.hashCode(sVar.T);
                z1.r rVarC111116 = z1.a.c(sVar, rVarZ);
                l1.q1 q1VarL111116 = sVar.l();
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, eVar111116, sVar);
                l1.t.J(y2.j.f56916e, q1VarL111116, sVar);
                l1.t.J(y2.j.f56915d, rVarC111116, sVar);
                hVar = y2.j.f56918g;
                if (sVar.S) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                } else {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                sVar.p(true);
                rVar2 = rVar3;
                y0Var3 = y0Var4;
                cVar3 = cVar4;
                i39 = i40;
                z13 = z14;
                i37 = i43;
                yVar2 = yVar3;
                gVar2 = gVar3;
            } else {
                sVar.W();
                i37 = i13;
                gVar2 = gVar;
                i38 = i28;
                y0Var3 = y0Var2;
                cVar3 = cVar2;
                i39 = i23;
                z13 = z11;
                yVar2 = yVar;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                final z1.r rVar111119 = rVar2;
                final int i4111111111118 = i38;
                x1VarT.f39502d = new fz.e() { // from class: s0.r
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        o0.c(str2, rVar111119, y0Var3, cVar3, i39, z13, i4111111111118, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i16 |= 3072;
        cVar2 = cVar;
        i22 = i15 & 16;
        if (i22 != 0) {
            if ((i14 & 24576) == 0) {
                i23 = i11;
                if (sVar.d(i23)) {
                    i24 = 16384;
                } else {
                    i24 = OSSConstants.DEFAULT_BUFFER_SIZE;
                }
                i16 |= i24;
            }
            i25 = i15 & 32;
            if (i25 != 0) {
                i16 |= 196608;
            } else if ((i14 & 196608) == 0) {
                if (sVar.g(z11)) {
                    i26 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                } else {
                    i26 = 65536;
                }
                i16 |= i26;
            }
            i27 = i15 & 64;
            if (i27 != 0) {
                i16 |= 1572864;
                i28 = i12;
            } else {
                i28 = i12;
                if ((i14 & 1572864) == 0) {
                    if (sVar.d(i28)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i16 |= i29;
                }
            }
            i30 = i16;
            i31 = i15 & 128;
            if (i31 != 0) {
                if ((i14 & 12582912) == 0) {
                    if (sVar.d(i13)) {
                        i32 = 8388608;
                    } else {
                        i32 = 4194304;
                    }
                    i30 |= i32;
                }
                i33 = i15 & 256;
                if (i33 != 0) {
                    if ((i14 & 100663296) == 0) {
                        if (sVar.h(yVar)) {
                            i34 = 67108864;
                        } else {
                            i34 = 33554432;
                        }
                        i30 |= i34;
                    }
                    i35 = i15 & 512;
                    i36 = 805306368;
                    if (i35 == 0) {
                        i30 |= i36;
                    } else if ((i14 & 805306368) == 0) {
                        if ((i14 & 1073741824) == 0) {
                            zH = sVar.f(gVar);
                        } else {
                            zH = sVar.h(gVar);
                        }
                        if (zH) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i30 |= i36;
                    }
                    if ((i30 & 306783379) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (sVar.T(i30 & 1, z12)) {
                        if (i44 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if (i17 != 0) {
                            y0Var2 = j3.y0.f35826d;
                        }
                        if (i19 != 0) {
                            cVar4 = null;
                        } else {
                            cVar4 = cVar2;
                        }
                        if (i22 != 0) {
                            i40 = 1;
                        } else {
                            i40 = i23;
                        }
                        if (i25 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i27 != 0) {
                            i41 = Integer.MAX_VALUE;
                        } else {
                            i41 = i28;
                        }
                        if (i31 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i13;
                        }
                        if (i33 != 0) {
                            yVar3 = null;
                        } else {
                            yVar3 = yVar;
                        }
                        if (i35 != 0) {
                            gVar3 = null;
                        } else {
                            gVar3 = gVar;
                        }
                        A(i42, i41);
                        if (sVar.j(d1.j0.f22926a) == null) {
                            throw new ClassCastException();
                        }
                        sVar.d0(356926143);
                        sVar.p(false);
                        n3.h hVar111118 = (n3.h) sVar.j(z2.g1.f58550k);
                        int i4111111111119 = (i30 & 14) | ((i30 >> 3) & 112);
                        executor = (Executor) sVar.j(t.f51192a);
                        if (executor == null) {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        } else {
                            y0Var4 = y0Var2;
                            z15 = false;
                            sVar.d0(1255196839);
                            sVar.p(false);
                        }
                        if (cVar4 == null) {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        } else {
                            str2 = str;
                            i38 = i41;
                            i43 = i42;
                            sVar.d0(357244017);
                            rVar3 = rVar2;
                            rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                            sVar.p(false);
                        }
                        e eVar111117 = e.f51017c;
                        iHashCode = Long.hashCode(sVar.T);
                        z1.r rVarC111117 = z1.a.c(sVar, rVarZ);
                        l1.q1 q1VarL111117 = sVar.l();
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, eVar111117, sVar);
                        l1.t.J(y2.j.f56916e, q1VarL111117, sVar);
                        l1.t.J(y2.j.f56915d, rVarC111117, sVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        } else {
                            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                        }
                        sVar.p(true);
                        rVar2 = rVar3;
                        y0Var3 = y0Var4;
                        cVar3 = cVar4;
                        i39 = i40;
                        z13 = z14;
                        i37 = i43;
                        yVar2 = yVar3;
                        gVar2 = gVar3;
                    } else {
                        sVar.W();
                        i37 = i13;
                        gVar2 = gVar;
                        i38 = i28;
                        y0Var3 = y0Var2;
                        cVar3 = cVar2;
                        i39 = i23;
                        z13 = z11;
                        yVar2 = yVar;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        final z1.r rVar1111110 = rVar2;
                        final int i41111111111110 = i38;
                        x1VarT.f39502d = new fz.e() { // from class: s0.r
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                o0.c(str2, rVar1111110, y0Var3, cVar3, i39, z13, i41111111111110, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i30 |= 100663296;
                i35 = i15 & 512;
                i36 = 805306368;
                if (i35 == 0) {
                    i30 |= i36;
                } else if ((i14 & 805306368) == 0) {
                    if ((i14 & 1073741824) == 0) {
                        zH = sVar.f(gVar);
                    } else {
                        zH = sVar.h(gVar);
                    }
                    if (zH) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i30 |= i36;
                }
                if ((i30 & 306783379) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (sVar.T(i30 & 1, z12)) {
                    if (i44 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i17 != 0) {
                        y0Var2 = j3.y0.f35826d;
                    }
                    if (i19 != 0) {
                        cVar4 = null;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i22 != 0) {
                        i40 = 1;
                    } else {
                        i40 = i23;
                    }
                    if (i25 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i27 != 0) {
                        i41 = Integer.MAX_VALUE;
                    } else {
                        i41 = i28;
                    }
                    if (i31 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i13;
                    }
                    if (i33 != 0) {
                        yVar3 = null;
                    } else {
                        yVar3 = yVar;
                    }
                    if (i35 != 0) {
                        gVar3 = null;
                    } else {
                        gVar3 = gVar;
                    }
                    A(i42, i41);
                    if (sVar.j(d1.j0.f22926a) == null) {
                        throw new ClassCastException();
                    }
                    sVar.d0(356926143);
                    sVar.p(false);
                    n3.h hVar111119 = (n3.h) sVar.j(z2.g1.f58550k);
                    int i41111111111111 = (i30 & 14) | ((i30 >> 3) & 112);
                    executor = (Executor) sVar.j(t.f51192a);
                    if (executor == null) {
                        y0Var4 = y0Var2;
                        z15 = false;
                        sVar.d0(1255196839);
                        sVar.p(false);
                    } else {
                        y0Var4 = y0Var2;
                        z15 = false;
                        sVar.d0(1255196839);
                        sVar.p(false);
                    }
                    if (cVar4 == null) {
                        str2 = str;
                        i38 = i41;
                        i43 = i42;
                        sVar.d0(357244017);
                        rVar3 = rVar2;
                        rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                        sVar.p(false);
                    } else {
                        str2 = str;
                        i38 = i41;
                        i43 = i42;
                        sVar.d0(357244017);
                        rVar3 = rVar2;
                        rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                        sVar.p(false);
                    }
                    e eVar111118 = e.f51017c;
                    iHashCode = Long.hashCode(sVar.T);
                    z1.r rVarC111118 = z1.a.c(sVar, rVarZ);
                    l1.q1 q1VarL111118 = sVar.l();
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, eVar111118, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL111118, sVar);
                    l1.t.J(y2.j.f56915d, rVarC111118, sVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    sVar.p(true);
                    rVar2 = rVar3;
                    y0Var3 = y0Var4;
                    cVar3 = cVar4;
                    i39 = i40;
                    z13 = z14;
                    i37 = i43;
                    yVar2 = yVar3;
                    gVar2 = gVar3;
                } else {
                    sVar.W();
                    i37 = i13;
                    gVar2 = gVar;
                    i38 = i28;
                    y0Var3 = y0Var2;
                    cVar3 = cVar2;
                    i39 = i23;
                    z13 = z11;
                    yVar2 = yVar;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    final z1.r rVar1111111 = rVar2;
                    final int i41111111111112 = i38;
                    x1VarT.f39502d = new fz.e() { // from class: s0.r
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            o0.c(str2, rVar1111111, y0Var3, cVar3, i39, z13, i41111111111112, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i30 |= 12582912;
            i33 = i15 & 256;
            if (i33 != 0) {
                if ((i14 & 100663296) == 0) {
                    if (sVar.h(yVar)) {
                        i34 = 67108864;
                    } else {
                        i34 = 33554432;
                    }
                    i30 |= i34;
                }
                i35 = i15 & 512;
                i36 = 805306368;
                if (i35 == 0) {
                    i30 |= i36;
                } else if ((i14 & 805306368) == 0) {
                    if ((i14 & 1073741824) == 0) {
                        zH = sVar.f(gVar);
                    } else {
                        zH = sVar.h(gVar);
                    }
                    if (zH) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i30 |= i36;
                }
                if ((i30 & 306783379) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (sVar.T(i30 & 1, z12)) {
                    if (i44 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i17 != 0) {
                        y0Var2 = j3.y0.f35826d;
                    }
                    if (i19 != 0) {
                        cVar4 = null;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i22 != 0) {
                        i40 = 1;
                    } else {
                        i40 = i23;
                    }
                    if (i25 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i27 != 0) {
                        i41 = Integer.MAX_VALUE;
                    } else {
                        i41 = i28;
                    }
                    if (i31 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i13;
                    }
                    if (i33 != 0) {
                        yVar3 = null;
                    } else {
                        yVar3 = yVar;
                    }
                    if (i35 != 0) {
                        gVar3 = null;
                    } else {
                        gVar3 = gVar;
                    }
                    A(i42, i41);
                    if (sVar.j(d1.j0.f22926a) == null) {
                        throw new ClassCastException();
                    }
                    sVar.d0(356926143);
                    sVar.p(false);
                    n3.h hVar1111110 = (n3.h) sVar.j(z2.g1.f58550k);
                    int i41111111111113 = (i30 & 14) | ((i30 >> 3) & 112);
                    executor = (Executor) sVar.j(t.f51192a);
                    if (executor == null) {
                        y0Var4 = y0Var2;
                        z15 = false;
                        sVar.d0(1255196839);
                        sVar.p(false);
                    } else {
                        y0Var4 = y0Var2;
                        z15 = false;
                        sVar.d0(1255196839);
                        sVar.p(false);
                    }
                    if (cVar4 == null) {
                        str2 = str;
                        i38 = i41;
                        i43 = i42;
                        sVar.d0(357244017);
                        rVar3 = rVar2;
                        rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                        sVar.p(false);
                    } else {
                        str2 = str;
                        i38 = i41;
                        i43 = i42;
                        sVar.d0(357244017);
                        rVar3 = rVar2;
                        rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                        sVar.p(false);
                    }
                    e eVar111119 = e.f51017c;
                    iHashCode = Long.hashCode(sVar.T);
                    z1.r rVarC111119 = z1.a.c(sVar, rVarZ);
                    l1.q1 q1VarL111119 = sVar.l();
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, eVar111119, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL111119, sVar);
                    l1.t.J(y2.j.f56915d, rVarC111119, sVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    sVar.p(true);
                    rVar2 = rVar3;
                    y0Var3 = y0Var4;
                    cVar3 = cVar4;
                    i39 = i40;
                    z13 = z14;
                    i37 = i43;
                    yVar2 = yVar3;
                    gVar2 = gVar3;
                } else {
                    sVar.W();
                    i37 = i13;
                    gVar2 = gVar;
                    i38 = i28;
                    y0Var3 = y0Var2;
                    cVar3 = cVar2;
                    i39 = i23;
                    z13 = z11;
                    yVar2 = yVar;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    final z1.r rVar1111112 = rVar2;
                    final int i41111111111114 = i38;
                    x1VarT.f39502d = new fz.e() { // from class: s0.r
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            o0.c(str2, rVar1111112, y0Var3, cVar3, i39, z13, i41111111111114, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i30 |= 100663296;
            i35 = i15 & 512;
            i36 = 805306368;
            if (i35 == 0) {
                i30 |= i36;
            } else if ((i14 & 805306368) == 0) {
                if ((i14 & 1073741824) == 0) {
                    zH = sVar.f(gVar);
                } else {
                    zH = sVar.h(gVar);
                }
                if (zH) {
                    i36 = 536870912;
                } else {
                    i36 = 268435456;
                }
                i30 |= i36;
            }
            if ((i30 & 306783379) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (sVar.T(i30 & 1, z12)) {
                if (i44 != 0) {
                    rVar2 = z1.o.f58481a;
                }
                if (i17 != 0) {
                    y0Var2 = j3.y0.f35826d;
                }
                if (i19 != 0) {
                    cVar4 = null;
                } else {
                    cVar4 = cVar2;
                }
                if (i22 != 0) {
                    i40 = 1;
                } else {
                    i40 = i23;
                }
                if (i25 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                if (i27 != 0) {
                    i41 = Integer.MAX_VALUE;
                } else {
                    i41 = i28;
                }
                if (i31 != 0) {
                    i42 = 1;
                } else {
                    i42 = i13;
                }
                if (i33 != 0) {
                    yVar3 = null;
                } else {
                    yVar3 = yVar;
                }
                if (i35 != 0) {
                    gVar3 = null;
                } else {
                    gVar3 = gVar;
                }
                A(i42, i41);
                if (sVar.j(d1.j0.f22926a) == null) {
                    throw new ClassCastException();
                }
                sVar.d0(356926143);
                sVar.p(false);
                n3.h hVar1111111 = (n3.h) sVar.j(z2.g1.f58550k);
                int i41111111111115 = (i30 & 14) | ((i30 >> 3) & 112);
                executor = (Executor) sVar.j(t.f51192a);
                if (executor == null) {
                    y0Var4 = y0Var2;
                    z15 = false;
                    sVar.d0(1255196839);
                    sVar.p(false);
                } else {
                    y0Var4 = y0Var2;
                    z15 = false;
                    sVar.d0(1255196839);
                    sVar.p(false);
                }
                if (cVar4 == null) {
                    str2 = str;
                    i38 = i41;
                    i43 = i42;
                    sVar.d0(357244017);
                    rVar3 = rVar2;
                    rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                    sVar.p(false);
                } else {
                    str2 = str;
                    i38 = i41;
                    i43 = i42;
                    sVar.d0(357244017);
                    rVar3 = rVar2;
                    rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                    sVar.p(false);
                }
                e eVar1111110 = e.f51017c;
                iHashCode = Long.hashCode(sVar.T);
                z1.r rVarC1111110 = z1.a.c(sVar, rVarZ);
                l1.q1 q1VarL1111110 = sVar.l();
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, eVar1111110, sVar);
                l1.t.J(y2.j.f56916e, q1VarL1111110, sVar);
                l1.t.J(y2.j.f56915d, rVarC1111110, sVar);
                hVar = y2.j.f56918g;
                if (sVar.S) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                } else {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                sVar.p(true);
                rVar2 = rVar3;
                y0Var3 = y0Var4;
                cVar3 = cVar4;
                i39 = i40;
                z13 = z14;
                i37 = i43;
                yVar2 = yVar3;
                gVar2 = gVar3;
            } else {
                sVar.W();
                i37 = i13;
                gVar2 = gVar;
                i38 = i28;
                y0Var3 = y0Var2;
                cVar3 = cVar2;
                i39 = i23;
                z13 = z11;
                yVar2 = yVar;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                final z1.r rVar1111113 = rVar2;
                final int i41111111111116 = i38;
                x1VarT.f39502d = new fz.e() { // from class: s0.r
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        o0.c(str2, rVar1111113, y0Var3, cVar3, i39, z13, i41111111111116, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i16 |= 24576;
        i23 = i11;
        i25 = i15 & 32;
        if (i25 != 0) {
            i16 |= 196608;
        } else if ((i14 & 196608) == 0) {
            if (sVar.g(z11)) {
                i26 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
            } else {
                i26 = 65536;
            }
            i16 |= i26;
        }
        i27 = i15 & 64;
        if (i27 != 0) {
            i16 |= 1572864;
            i28 = i12;
        } else {
            i28 = i12;
            if ((i14 & 1572864) == 0) {
                if (sVar.d(i28)) {
                    i29 = 1048576;
                } else {
                    i29 = 524288;
                }
                i16 |= i29;
            }
        }
        i30 = i16;
        i31 = i15 & 128;
        if (i31 != 0) {
            if ((i14 & 12582912) == 0) {
                if (sVar.d(i13)) {
                    i32 = 8388608;
                } else {
                    i32 = 4194304;
                }
                i30 |= i32;
            }
            i33 = i15 & 256;
            if (i33 != 0) {
                if ((i14 & 100663296) == 0) {
                    if (sVar.h(yVar)) {
                        i34 = 67108864;
                    } else {
                        i34 = 33554432;
                    }
                    i30 |= i34;
                }
                i35 = i15 & 512;
                i36 = 805306368;
                if (i35 == 0) {
                    i30 |= i36;
                } else if ((i14 & 805306368) == 0) {
                    if ((i14 & 1073741824) == 0) {
                        zH = sVar.f(gVar);
                    } else {
                        zH = sVar.h(gVar);
                    }
                    if (zH) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i30 |= i36;
                }
                if ((i30 & 306783379) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (sVar.T(i30 & 1, z12)) {
                    if (i44 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if (i17 != 0) {
                        y0Var2 = j3.y0.f35826d;
                    }
                    if (i19 != 0) {
                        cVar4 = null;
                    } else {
                        cVar4 = cVar2;
                    }
                    if (i22 != 0) {
                        i40 = 1;
                    } else {
                        i40 = i23;
                    }
                    if (i25 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i27 != 0) {
                        i41 = Integer.MAX_VALUE;
                    } else {
                        i41 = i28;
                    }
                    if (i31 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i13;
                    }
                    if (i33 != 0) {
                        yVar3 = null;
                    } else {
                        yVar3 = yVar;
                    }
                    if (i35 != 0) {
                        gVar3 = null;
                    } else {
                        gVar3 = gVar;
                    }
                    A(i42, i41);
                    if (sVar.j(d1.j0.f22926a) == null) {
                        throw new ClassCastException();
                    }
                    sVar.d0(356926143);
                    sVar.p(false);
                    n3.h hVar1111112 = (n3.h) sVar.j(z2.g1.f58550k);
                    int i41111111111117 = (i30 & 14) | ((i30 >> 3) & 112);
                    executor = (Executor) sVar.j(t.f51192a);
                    if (executor == null) {
                        y0Var4 = y0Var2;
                        z15 = false;
                        sVar.d0(1255196839);
                        sVar.p(false);
                    } else {
                        y0Var4 = y0Var2;
                        z15 = false;
                        sVar.d0(1255196839);
                        sVar.p(false);
                    }
                    if (cVar4 == null) {
                        str2 = str;
                        i38 = i41;
                        i43 = i42;
                        sVar.d0(357244017);
                        rVar3 = rVar2;
                        rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                        sVar.p(false);
                    } else {
                        str2 = str;
                        i38 = i41;
                        i43 = i42;
                        sVar.d0(357244017);
                        rVar3 = rVar2;
                        rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                        sVar.p(false);
                    }
                    e eVar1111111 = e.f51017c;
                    iHashCode = Long.hashCode(sVar.T);
                    z1.r rVarC1111111 = z1.a.c(sVar, rVarZ);
                    l1.q1 q1VarL1111111 = sVar.l();
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, eVar1111111, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL1111111, sVar);
                    l1.t.J(y2.j.f56915d, rVarC1111111, sVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    } else {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    sVar.p(true);
                    rVar2 = rVar3;
                    y0Var3 = y0Var4;
                    cVar3 = cVar4;
                    i39 = i40;
                    z13 = z14;
                    i37 = i43;
                    yVar2 = yVar3;
                    gVar2 = gVar3;
                } else {
                    sVar.W();
                    i37 = i13;
                    gVar2 = gVar;
                    i38 = i28;
                    y0Var3 = y0Var2;
                    cVar3 = cVar2;
                    i39 = i23;
                    z13 = z11;
                    yVar2 = yVar;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    final z1.r rVar1111114 = rVar2;
                    final int i41111111111118 = i38;
                    x1VarT.f39502d = new fz.e() { // from class: s0.r
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            o0.c(str2, rVar1111114, y0Var3, cVar3, i39, z13, i41111111111118, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i30 |= 100663296;
            i35 = i15 & 512;
            i36 = 805306368;
            if (i35 == 0) {
                i30 |= i36;
            } else if ((i14 & 805306368) == 0) {
                if ((i14 & 1073741824) == 0) {
                    zH = sVar.f(gVar);
                } else {
                    zH = sVar.h(gVar);
                }
                if (zH) {
                    i36 = 536870912;
                } else {
                    i36 = 268435456;
                }
                i30 |= i36;
            }
            if ((i30 & 306783379) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (sVar.T(i30 & 1, z12)) {
                if (i44 != 0) {
                    rVar2 = z1.o.f58481a;
                }
                if (i17 != 0) {
                    y0Var2 = j3.y0.f35826d;
                }
                if (i19 != 0) {
                    cVar4 = null;
                } else {
                    cVar4 = cVar2;
                }
                if (i22 != 0) {
                    i40 = 1;
                } else {
                    i40 = i23;
                }
                if (i25 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                if (i27 != 0) {
                    i41 = Integer.MAX_VALUE;
                } else {
                    i41 = i28;
                }
                if (i31 != 0) {
                    i42 = 1;
                } else {
                    i42 = i13;
                }
                if (i33 != 0) {
                    yVar3 = null;
                } else {
                    yVar3 = yVar;
                }
                if (i35 != 0) {
                    gVar3 = null;
                } else {
                    gVar3 = gVar;
                }
                A(i42, i41);
                if (sVar.j(d1.j0.f22926a) == null) {
                    throw new ClassCastException();
                }
                sVar.d0(356926143);
                sVar.p(false);
                n3.h hVar1111113 = (n3.h) sVar.j(z2.g1.f58550k);
                int i41111111111119 = (i30 & 14) | ((i30 >> 3) & 112);
                executor = (Executor) sVar.j(t.f51192a);
                if (executor == null) {
                    y0Var4 = y0Var2;
                    z15 = false;
                    sVar.d0(1255196839);
                    sVar.p(false);
                } else {
                    y0Var4 = y0Var2;
                    z15 = false;
                    sVar.d0(1255196839);
                    sVar.p(false);
                }
                if (cVar4 == null) {
                    str2 = str;
                    i38 = i41;
                    i43 = i42;
                    sVar.d0(357244017);
                    rVar3 = rVar2;
                    rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                    sVar.p(false);
                } else {
                    str2 = str;
                    i38 = i41;
                    i43 = i42;
                    sVar.d0(357244017);
                    rVar3 = rVar2;
                    rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                    sVar.p(false);
                }
                e eVar1111112 = e.f51017c;
                iHashCode = Long.hashCode(sVar.T);
                z1.r rVarC1111112 = z1.a.c(sVar, rVarZ);
                l1.q1 q1VarL1111112 = sVar.l();
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, eVar1111112, sVar);
                l1.t.J(y2.j.f56916e, q1VarL1111112, sVar);
                l1.t.J(y2.j.f56915d, rVarC1111112, sVar);
                hVar = y2.j.f56918g;
                if (sVar.S) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                } else {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                sVar.p(true);
                rVar2 = rVar3;
                y0Var3 = y0Var4;
                cVar3 = cVar4;
                i39 = i40;
                z13 = z14;
                i37 = i43;
                yVar2 = yVar3;
                gVar2 = gVar3;
            } else {
                sVar.W();
                i37 = i13;
                gVar2 = gVar;
                i38 = i28;
                y0Var3 = y0Var2;
                cVar3 = cVar2;
                i39 = i23;
                z13 = z11;
                yVar2 = yVar;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                final z1.r rVar1111115 = rVar2;
                final int i411111111111110 = i38;
                x1VarT.f39502d = new fz.e() { // from class: s0.r
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        o0.c(str2, rVar1111115, y0Var3, cVar3, i39, z13, i411111111111110, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i30 |= 12582912;
        i33 = i15 & 256;
        if (i33 != 0) {
            if ((i14 & 100663296) == 0) {
                if (sVar.h(yVar)) {
                    i34 = 67108864;
                } else {
                    i34 = 33554432;
                }
                i30 |= i34;
            }
            i35 = i15 & 512;
            i36 = 805306368;
            if (i35 == 0) {
                i30 |= i36;
            } else if ((i14 & 805306368) == 0) {
                if ((i14 & 1073741824) == 0) {
                    zH = sVar.f(gVar);
                } else {
                    zH = sVar.h(gVar);
                }
                if (zH) {
                    i36 = 536870912;
                } else {
                    i36 = 268435456;
                }
                i30 |= i36;
            }
            if ((i30 & 306783379) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (sVar.T(i30 & 1, z12)) {
                if (i44 != 0) {
                    rVar2 = z1.o.f58481a;
                }
                if (i17 != 0) {
                    y0Var2 = j3.y0.f35826d;
                }
                if (i19 != 0) {
                    cVar4 = null;
                } else {
                    cVar4 = cVar2;
                }
                if (i22 != 0) {
                    i40 = 1;
                } else {
                    i40 = i23;
                }
                if (i25 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                if (i27 != 0) {
                    i41 = Integer.MAX_VALUE;
                } else {
                    i41 = i28;
                }
                if (i31 != 0) {
                    i42 = 1;
                } else {
                    i42 = i13;
                }
                if (i33 != 0) {
                    yVar3 = null;
                } else {
                    yVar3 = yVar;
                }
                if (i35 != 0) {
                    gVar3 = null;
                } else {
                    gVar3 = gVar;
                }
                A(i42, i41);
                if (sVar.j(d1.j0.f22926a) == null) {
                    throw new ClassCastException();
                }
                sVar.d0(356926143);
                sVar.p(false);
                n3.h hVar1111114 = (n3.h) sVar.j(z2.g1.f58550k);
                int i411111111111111 = (i30 & 14) | ((i30 >> 3) & 112);
                executor = (Executor) sVar.j(t.f51192a);
                if (executor == null) {
                    y0Var4 = y0Var2;
                    z15 = false;
                    sVar.d0(1255196839);
                    sVar.p(false);
                } else {
                    y0Var4 = y0Var2;
                    z15 = false;
                    sVar.d0(1255196839);
                    sVar.p(false);
                }
                if (cVar4 == null) {
                    str2 = str;
                    i38 = i41;
                    i43 = i42;
                    sVar.d0(357244017);
                    rVar3 = rVar2;
                    rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                    sVar.p(false);
                } else {
                    str2 = str;
                    i38 = i41;
                    i43 = i42;
                    sVar.d0(357244017);
                    rVar3 = rVar2;
                    rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                    sVar.p(false);
                }
                e eVar1111113 = e.f51017c;
                iHashCode = Long.hashCode(sVar.T);
                z1.r rVarC1111113 = z1.a.c(sVar, rVarZ);
                l1.q1 q1VarL1111113 = sVar.l();
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, eVar1111113, sVar);
                l1.t.J(y2.j.f56916e, q1VarL1111113, sVar);
                l1.t.J(y2.j.f56915d, rVarC1111113, sVar);
                hVar = y2.j.f56918g;
                if (sVar.S) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                } else {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                sVar.p(true);
                rVar2 = rVar3;
                y0Var3 = y0Var4;
                cVar3 = cVar4;
                i39 = i40;
                z13 = z14;
                i37 = i43;
                yVar2 = yVar3;
                gVar2 = gVar3;
            } else {
                sVar.W();
                i37 = i13;
                gVar2 = gVar;
                i38 = i28;
                y0Var3 = y0Var2;
                cVar3 = cVar2;
                i39 = i23;
                z13 = z11;
                yVar2 = yVar;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                final z1.r rVar1111116 = rVar2;
                final int i411111111111112 = i38;
                x1VarT.f39502d = new fz.e() { // from class: s0.r
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        o0.c(str2, rVar1111116, y0Var3, cVar3, i39, z13, i411111111111112, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i30 |= 100663296;
        i35 = i15 & 512;
        i36 = 805306368;
        if (i35 == 0) {
            i30 |= i36;
        } else if ((i14 & 805306368) == 0) {
            if ((i14 & 1073741824) == 0) {
                zH = sVar.f(gVar);
            } else {
                zH = sVar.h(gVar);
            }
            if (zH) {
                i36 = 536870912;
            } else {
                i36 = 268435456;
            }
            i30 |= i36;
        }
        if ((i30 & 306783379) != 306783378) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (sVar.T(i30 & 1, z12)) {
            if (i44 != 0) {
                rVar2 = z1.o.f58481a;
            }
            if (i17 != 0) {
                y0Var2 = j3.y0.f35826d;
            }
            if (i19 != 0) {
                cVar4 = null;
            } else {
                cVar4 = cVar2;
            }
            if (i22 != 0) {
                i40 = 1;
            } else {
                i40 = i23;
            }
            if (i25 != 0) {
                z14 = true;
            } else {
                z14 = z11;
            }
            if (i27 != 0) {
                i41 = Integer.MAX_VALUE;
            } else {
                i41 = i28;
            }
            if (i31 != 0) {
                i42 = 1;
            } else {
                i42 = i13;
            }
            if (i33 != 0) {
                yVar3 = null;
            } else {
                yVar3 = yVar;
            }
            if (i35 != 0) {
                gVar3 = null;
            } else {
                gVar3 = gVar;
            }
            A(i42, i41);
            if (sVar.j(d1.j0.f22926a) == null) {
                throw new ClassCastException();
            }
            sVar.d0(356926143);
            sVar.p(false);
            n3.h hVar1111115 = (n3.h) sVar.j(z2.g1.f58550k);
            int i411111111111113 = (i30 & 14) | ((i30 >> 3) & 112);
            executor = (Executor) sVar.j(t.f51192a);
            if (executor == null) {
                y0Var4 = y0Var2;
                z15 = false;
                sVar.d0(1255196839);
                sVar.p(false);
            } else {
                y0Var4 = y0Var2;
                z15 = false;
                sVar.d0(1255196839);
                sVar.p(false);
            }
            if (cVar4 == null) {
                str2 = str;
                i38 = i41;
                i43 = i42;
                sVar.d0(357244017);
                rVar3 = rVar2;
                rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                sVar.p(false);
            } else {
                str2 = str;
                i38 = i41;
                i43 = i42;
                sVar.d0(357244017);
                rVar3 = rVar2;
                rVarZ = z(rVar3, new j3.h(str2), y0Var4, cVar4, i40, z14, i38, i43, (n3.h) sVar.j(z2.g1.f58550k), null, null, yVar3, null, gVar3);
                sVar.p(false);
            }
            e eVar1111114 = e.f51017c;
            iHashCode = Long.hashCode(sVar.T);
            z1.r rVarC1111114 = z1.a.c(sVar, rVarZ);
            l1.q1 q1VarL1111114 = sVar.l();
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, eVar1111114, sVar);
            l1.t.J(y2.j.f56916e, q1VarL1111114, sVar);
            l1.t.J(y2.j.f56915d, rVarC1111114, sVar);
            hVar = y2.j.f56918g;
            if (sVar.S) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            } else {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            sVar.p(true);
            rVar2 = rVar3;
            y0Var3 = y0Var4;
            cVar3 = cVar4;
            i39 = i40;
            z13 = z14;
            i37 = i43;
            yVar2 = yVar3;
            gVar2 = gVar3;
        } else {
            sVar.W();
            i37 = i13;
            gVar2 = gVar;
            i38 = i28;
            y0Var3 = y0Var2;
            cVar3 = cVar2;
            i39 = i23;
            z13 = z11;
            yVar2 = yVar;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            final z1.r rVar1111117 = rVar2;
            final int i411111111111114 = i38;
            x1VarT.f39502d = new fz.e() { // from class: s0.r
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    o0.c(str2, rVar1111117, y0Var3, cVar3, i39, z13, i411111111111114, i37, yVar2, gVar2, (l1.n) obj, l1.t.M(i14 | 1), i15);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void d(String str, z1.r rVar, j3.y0 y0Var, int i11, boolean z11, int i12, int i13, l1.n nVar, int i14) {
        int i15;
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1186827822);
        if ((i14 & 6) == 0) {
            i15 = (sVar2.f(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= sVar2.f(rVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= sVar2.f(y0Var) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= sVar2.h(null) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= sVar2.d(i11) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i14) == 0) {
            i15 |= sVar2.g(z11) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= sVar2.d(i12) ? 1048576 : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= sVar2.d(i13) ? 8388608 : 4194304;
        }
        int i16 = i15 | 100663296;
        if (sVar2.T(i16 & 1, (38347923 & i16) != 38347922)) {
            sVar = sVar2;
            c(str, rVar, y0Var, null, i11, z11, i12, i13, null, null, sVar, i16 & 268435454, 512);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new pr.r(str, rVar, y0Var, i11, z11, i12, i13, i14);
        }
    }

    public static final void e(j3.h hVar, z1.r rVar, j3.y0 y0Var, boolean z11, int i11, int i12, fz.c cVar, g7 g7Var, l1.n nVar, int i13) {
        l1.s sVar;
        boolean z12;
        int i14;
        int i15;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-246609449);
        int i16 = i13 | (sVar2.f(hVar) ? 4 : 2) | (sVar2.f(rVar) ? 32 : 16) | (sVar2.f(y0Var) ? 256 : 128) | 224256 | (sVar2.h(cVar) ? 1048576 : 524288) | (sVar2.h(g7Var) ? 8388608 : 4194304);
        if (sVar2.T(i16 & 1, (4793491 & i16) != 4793490)) {
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.B(null);
                sVar2.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            boolean z13 = (29360128 & i16) == 8388608;
            Object objQ2 = sVar2.Q();
            if (z13 || objQ2 == gVar) {
                objQ2 = new bp.s0(2, b1Var, g7Var);
                sVar2.o0(objQ2);
            }
            z1.r rVarI = rVar.i(s2.g0.a(z1.o.f58481a, g7Var, (PointerInputEventHandler) objQ2));
            boolean z14 = (3670016 & i16) == 1048576;
            Object objQ3 = sVar2.Q();
            if (z14 || objQ3 == gVar) {
                objQ3 = new y3(b1Var, cVar, 7);
                sVar2.o0(objQ3);
            }
            sVar = sVar2;
            a(hVar, rVarI, y0Var, (fz.c) objQ3, 1, true, Integer.MAX_VALUE, 0, null, null, null, sVar, (i16 & 58254) | 1769472, 0, 1920);
            i14 = 1;
            z12 = true;
            i15 = Integer.MAX_VALUE;
        } else {
            sVar = sVar2;
            sVar.W();
            z12 = z11;
            i14 = i11;
            i15 = i12;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new dt.j1(hVar, rVar, y0Var, z12, i14, i15, cVar, g7Var, i13);
        }
    }

    public static final void f(d1.z0 z0Var, t1.d dVar, l1.n nVar, int i11) {
        int i12;
        z1.r rVarD;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(2080741862);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(z0Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(dVar) ? 32 : 16;
        }
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            sVar.d0(-1881943916);
            if (z0Var.j()) {
                vy.d dVar2 = null;
                int i13 = 0;
                rVarD = y0.h.d(y0.h.c(new d1.r0(z0Var, dVar2, 0)), z0Var.f23060y, new d1.r0(z0Var, dVar2, 1), new d1.s0(z0Var, dVar2, i13), new d1.q0(z0Var, i13));
            } else {
                rVarD = z1.o.f58481a;
            }
            vc.a.d(rVarD, dVar, sVar, i12 & 112);
            sVar.p(false);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b0.t1(z0Var, i11, 22, dVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:242:0x049c  */
    /* JADX WARN: Code duplicated, block: B:288:0x061a  */
    /* JADX WARN: Code duplicated, block: B:294:0x065a  */
    /* JADX WARN: Code duplicated, block: B:301:0x068b  */
    /* JADX WARN: Code duplicated, block: B:303:0x0691 A[PHI: r27
      0x0691: PHI (r27v9 s0.s0) = (r27v5 s0.s0), (r27v11 s0.s0) binds: [B:302:0x068f, B:300:0x0688] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:304:0x0693  */
    /* JADX WARN: Code duplicated, block: B:307:0x069c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:310:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:313:0x06de A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:314:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:317:0x0704  */
    /* JADX WARN: Code duplicated, block: B:318:0x0706  */
    /* JADX WARN: Code duplicated, block: B:321:0x070e  */
    /* JADX WARN: Code duplicated, block: B:322:0x0710  */
    /* JADX WARN: Code duplicated, block: B:325:0x0722 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:326:0x0724  */
    /* JADX WARN: Code duplicated, block: B:331:0x0741  */
    /* JADX WARN: Code duplicated, block: B:332:0x074c  */
    /* JADX WARN: Code duplicated, block: B:335:0x0780  */
    /* JADX WARN: Code duplicated, block: B:336:0x0782  */
    /* JADX WARN: Code duplicated, block: B:339:0x0791 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:340:0x0793  */
    /* JADX WARN: Code duplicated, block: B:343:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:344:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:347:0x07ba  */
    /* JADX WARN: Code duplicated, block: B:348:0x07bc  */
    /* JADX WARN: Code duplicated, block: B:351:0x07c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:354:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:357:0x080e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:366:0x0845  */
    /* JADX WARN: Code duplicated, block: B:368:0x0848  */
    /* JADX WARN: Code duplicated, block: B:369:0x085c  */
    /* JADX WARN: Code duplicated, block: B:372:0x0869 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:373:0x086b  */
    /* JADX WARN: Code duplicated, block: B:376:0x0885  */
    /* JADX WARN: Code duplicated, block: B:377:0x0887  */
    /* JADX WARN: Code duplicated, block: B:380:0x088f  */
    /* JADX WARN: Code duplicated, block: B:382:0x0895  */
    /* JADX WARN: Code duplicated, block: B:388:0x08a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:391:0x08a8  */
    /* JADX WARN: Code duplicated, block: B:394:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:396:0x08c8  */
    /* JADX WARN: Code duplicated, block: B:400:0x08e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:401:0x08e8  */
    /* JADX WARN: Code duplicated, block: B:405:0x0907 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:406:0x0909  */
    /* JADX WARN: Code duplicated, block: B:409:0x0933 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:410:0x0935  */
    /* JADX WARN: Code duplicated, block: B:413:0x09a3  */
    /* JADX WARN: Code duplicated, block: B:420:0x09cc  */
    /* JADX WARN: Code duplicated, block: B:422:0x09cf  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v62 */
    /* JADX WARN: Type inference failed for: r11v1, types: [l1.s] */
    /* JADX WARN: Type inference failed for: r11v16, types: [l1.s] */
    /* JADX WARN: Type inference failed for: r11v17, types: [l1.n, l1.s] */
    /* JADX WARN: Type inference failed for: r11v19, types: [l1.n] */
    /* JADX WARN: Type inference failed for: r11v2, types: [l1.s] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r60v0 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v45 */
    /* JADX WARN: Type inference failed for: r9v1, types: [l1.n, l1.s] */
    public static final void g(final o3.w wVar, fz.c cVar, z1.r rVar, j3.y0 y0Var, o3.f0 f0Var, fz.c cVar2, h0.i iVar, g2.t tVar, boolean z11, int i11, int i12, o3.j jVar, q0 q0Var, final boolean z12, final boolean z13, t1.d dVar, l1.n nVar, int i13, int i14) {
        int i15;
        int i16;
        ?? r11;
        ?? r12;
        Object obj;
        v3.c cVar3;
        l1.g gVar;
        j3.y0 y0Var2;
        Object s0Var;
        j3.h hVar;
        n3.h hVar2;
        boolean z14;
        ?? r13;
        boolean z15;
        boolean z16;
        boolean z17;
        o3.w wVarA;
        Object obj2;
        d1.m mVar;
        boolean z18;
        o3.j jVar2;
        boolean z19;
        int i17;
        boolean zH;
        Object obj3;
        e2.v vVar;
        final s0 s0Var2;
        boolean z20;
        o3.w wVar2;
        rz.b0 b0Var;
        o3.j jVar3;
        o3.p pVar;
        z1.o oVar;
        boolean z21;
        l1.b1 b1VarH;
        s0 s0Var3;
        boolean z22;
        boolean z23;
        Object x0Var;
        h0.i iVar2;
        z1.r rVarA;
        final s0 s0Var4;
        boolean zH2;
        Object obj4;
        z1.r rVarA2;
        boolean z24;
        int i18;
        boolean z25;
        boolean zH3;
        Object objQ;
        final o3.p pVar2;
        z1.r rVar2;
        fz.c cVar4;
        z1.r rVarA3;
        boolean z26;
        boolean zH4;
        int i19;
        Object obj5;
        boolean z27;
        boolean z28;
        boolean zH5;
        Object objQ2;
        q2 q2Var;
        o3.p pVar3;
        d1.z0 z0Var;
        o3.x xVar;
        s0 s0Var5;
        boolean z29;
        z1.r rVarA4;
        boolean zH6;
        Object obj6;
        boolean z30;
        boolean z31;
        Object objQ3;
        o3.j jVar4;
        boolean z32;
        int i21;
        boolean z33;
        boolean zG;
        Object obj7;
        long j11;
        boolean zH7;
        Object obj8;
        boolean z34;
        ?? r9 = (l1.s) nVar;
        r9.f0(31062401);
        if ((i13 & 6) == 0) {
            i15 = i13 | (r9.f(wVar) ? 4 : 2);
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= r9.h(cVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= r9.f(rVar) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= r9.f(y0Var) ? 2048 : 1024;
        }
        int i22 = i13 & 24576;
        int i23 = OSSConstants.DEFAULT_BUFFER_SIZE;
        if (i22 == 0) {
            i15 |= r9.f(f0Var) ? 16384 : 8192;
        }
        int i24 = i13 & 196608;
        int i25 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
        if (i24 == 0) {
            i15 |= r9.h(cVar2) ? 131072 : 65536;
        }
        if ((i13 & 1572864) == 0) {
            i15 |= r9.f(iVar) ? 1048576 : 524288;
        }
        if ((i13 & 12582912) == 0) {
            i15 |= r9.f(tVar) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i15 |= r9.g(z11) ? 67108864 : 33554432;
        }
        if ((i13 & 805306368) == 0) {
            i15 |= r9.d(i11) ? 536870912 : 268435456;
        }
        if ((i14 & 6) == 0) {
            i16 = i14 | (r9.d(i12) ? 4 : 2);
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= r9.f(jVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= r9.f(q0Var) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= r9.g(z12) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            if (r9.g(z13)) {
                i23 = 16384;
            }
            i16 |= i23;
        }
        if ((i14 & 196608) == 0) {
            if (!r9.h(dVar)) {
                i25 = 65536;
            }
            i16 |= i25;
        }
        int i26 = i16 | 1572864;
        if (r9.T(i15 & 1, ((i15 & 306783379) == 306783378 && (i26 & 599187) == 599186) ? false : true)) {
            r9.Y();
            if ((i13 & 1) != 0 && !r9.C()) {
                r9.W();
            }
            r9.q();
            Object objQ4 = r9.Q();
            l1.g gVar2 = l1.m.f39353a;
            Object obj9 = objQ4;
            if (objQ4 == gVar2) {
                e2.v vVar2 = new e2.v();
                r9.o0(vVar2);
                obj9 = vVar2;
            }
            e2.v vVar3 = (e2.v) obj9;
            Object objQ5 = r9.Q();
            Object obj10 = objQ5;
            if (objQ5 == gVar2) {
                b1.u uVar = b1.v.f3822a;
                b1.e eVar = new b1.e();
                r9.o0(eVar);
                obj10 = eVar;
            }
            b1.e eVar2 = (b1.e) obj10;
            Object objQ6 = r9.Q();
            Object obj11 = objQ6;
            if (objQ6 == gVar2) {
                o3.x xVar2 = new o3.x(eVar2);
                r9.o0(xVar2);
                obj11 = xVar2;
            }
            o3.x xVar3 = (o3.x) obj11;
            v3.c cVar5 = (v3.c) r9.j(z2.g1.f58547h);
            n3.h hVar3 = (n3.h) r9.j(z2.g1.f58550k);
            long j12 = ((d1.g1) r9.j(d1.h1.f22920a)).f22915b;
            e2.l lVar = (e2.l) r9.j(z2.g1.f58548i);
            q2 q2Var2 = (q2) r9.j(z2.g1.f58558t);
            i2 i2Var = (i2) r9.j(z2.g1.f58554p);
            f0.h1 h1Var = (i11 == 1 && !z11 && jVar.f44679a) ? f0.h1.Horizontal : f0.h1.Vertical;
            r9.d0(-213743954);
            Object[] objArr = {h1Var};
            o2 o2Var = m1.f51098g;
            boolean zD = r9.d(h1Var.ordinal());
            Object objQ7 = r9.Q();
            if (zD || objQ7 == gVar2) {
                r12 = 0;
                u uVar2 = new u(h1Var, false ? 1 : 0);
                r9.o0(uVar2);
                obj = uVar2;
            } else {
                r12 = 0;
                obj = objQ7;
            }
            m1 m1Var = (m1) w1.j.d(objArr, o2Var, (fz.a) obj, r9, r12);
            r9.p(r12);
            if (((f0.h1) m1Var.f51104f.getValue()) != h1Var) {
                throw new IllegalArgumentException("Mismatching scroller orientation; ".concat(h1Var == f0.h1.Vertical ? "only single-line, non-wrap text fields can scroll horizontally" : "single-line, non-wrap text fields can only scroll horizontally"));
            }
            int i27 = i15 & 14;
            ?? r14 = ((i15 & 57344) == 16384 ? (char) 1 : (char) 0) | (i27 == 4 ? 1 : r12);
            Object objQ8 = r9.Q();
            if (r14 != 0 || objQ8 == gVar2) {
                o3.d0 d0VarA = u1.a(f0Var, wVar.f44704a);
                j3.x0 x0Var2 = wVar.f44706c;
                if (x0Var2 != null) {
                    long j13 = x0Var2.f35823a;
                    o3.p pVar4 = d0VarA.f44671b;
                    int i28 = j3.x0.f35822c;
                    int iS = pVar4.s((int) (j13 >> 32));
                    int iS2 = pVar4.s((int) (j13 & 4294967295L));
                    int iMin = Math.min(iS, iS2);
                    int iMax = Math.max(iS, iS2);
                    j3.e eVar3 = new j3.e(d0VarA.f44670a);
                    eVar3.a(new j3.p0(0L, 0L, (n3.s) null, (n3.o) null, (n3.p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, u3.l.f52752c, (g2.v0) null, 61439), iMin, iMax);
                    objQ8 = new o3.d0(eVar3.j(), pVar4);
                } else {
                    objQ8 = d0VarA;
                }
                r9.o0(objQ8);
            } else {
                m1Var = m1Var;
            }
            o3.d0 d0Var = (o3.d0) objQ8;
            j3.h hVar4 = d0Var.f44670a;
            final o3.p pVar5 = d0Var.f44671b;
            x1 x1VarB = r9.B();
            if (x1VarB == null) {
                throw new IllegalStateException("no recompose scope found");
            }
            x1VarB.f39500b |= 1;
            boolean zF = r9.f(i2Var);
            Object objQ9 = r9.Q();
            if (zF || objQ9 == gVar2) {
                cVar3 = cVar5;
                gVar = gVar2;
                y0Var2 = y0Var;
                hVar = hVar4;
                ?? r15 = r9;
                hVar2 = hVar3;
                z14 = z11;
                s0Var = new s0(new z0(hVar, y0Var2, z14, cVar3, hVar2, 0), x1VarB, i2Var);
                r15.o0(s0Var);
                r13 = r15;
            } else {
                gVar = gVar2;
                cVar3 = cVar5;
                y0Var2 = y0Var;
                s0Var = objQ9;
                hVar = hVar4;
                r13 = r9;
                hVar2 = hVar3;
                z14 = z11;
            }
            s0 s0Var6 = (s0) s0Var;
            j3.h hVar5 = wVar.f44704a;
            long j14 = wVar.f44705b;
            s0Var6.f51185u = cVar;
            s0Var6.f51190z = j12;
            p0 p0Var = s0Var6.f51182r;
            p0Var.f51130b = q0Var;
            p0Var.f51131c = r27;
            s0Var6.f51175j = hVar5;
            z0 z0Var2 = s0Var6.f51166a;
            if (!kotlin.jvm.internal.m.a(z0Var2.f51266a, hVar) || !kotlin.jvm.internal.m.a(z0Var2.f51267b, y0Var2) || z0Var2.f51270e != z14 || z0Var2.f51271f != 1 || z0Var2.f51268c != Integer.MAX_VALUE || z0Var2.f51269d != 1 || !kotlin.jvm.internal.m.a(z0Var2.f51272g, cVar3) || !kotlin.jvm.internal.m.a(z0Var2.f51274i, ry.r.f50854a) || z0Var2.f51273h != hVar2) {
                z0Var2 = new z0(hVar, y0Var2, z14, cVar3, hVar2, 0);
            }
            j3.y0 y0Var3 = y0Var2;
            v3.c cVar6 = cVar3;
            if (s0Var6.f51166a != z0Var2) {
                s0Var6.f51180p = true;
            }
            s0Var6.f51166a = z0Var2;
            ob.c cVar7 = s0Var6.f51169d;
            o3.c0 c0Var = s0Var6.f51170e;
            cVar7.getClass();
            j3.x0 x0Var3 = wVar.f44706c;
            boolean zA = kotlin.jvm.internal.m.a(x0Var3, ((b7.p) cVar7.f44800c).d());
            String str = ((o3.w) cVar7.f44799b).f44704a.f35700b;
            j3.h hVar6 = wVar.f44704a;
            if (kotlin.jvm.internal.m.a(str, hVar6.f35700b)) {
                if (j3.x0.b(((o3.w) cVar7.f44799b).f44705b, j14)) {
                    z15 = false;
                } else {
                    ((b7.p) cVar7.f44800c).h(j3.x0.f(j14), j3.x0.e(j14));
                    z15 = true;
                }
                z16 = false;
            } else {
                cVar7.f44800c = new b7.p(hVar6, j14);
                z15 = false;
                z16 = true;
            }
            if (x0Var3 == null) {
                b7.p pVar6 = (b7.p) cVar7.f44800c;
                pVar6.f4018d = -1;
                pVar6.f4019e = -1;
                z17 = z16;
            } else {
                z17 = z16;
                long j15 = x0Var3.f35823a;
                if (!j3.x0.c(j15)) {
                    ((b7.p) cVar7.f44800c).g(j3.x0.f(j15), j3.x0.e(j15));
                }
            }
            if (z17 || !(z15 || zA)) {
                b7.p pVar7 = (b7.p) cVar7.f44800c;
                pVar7.f4018d = -1;
                pVar7.f4019e = -1;
                wVarA = o3.w.a(wVar, null, 0L, 3);
            } else {
                wVarA = wVar;
            }
            o3.w wVar3 = (o3.w) cVar7.f44799b;
            cVar7.f44799b = wVarA;
            if (c0Var != null) {
                c0Var.a(wVar3, wVarA);
            }
            Object objQ10 = r13.Q();
            l1.g gVar3 = gVar;
            Object obj12 = objQ10;
            if (objQ10 == gVar3) {
                t1 t1Var = new t1();
                r13.o0(t1Var);
                obj12 = t1Var;
            }
            t1 t1Var2 = (t1) obj12;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (t1Var2.f51200e) {
                t1Var2.f51199d = Long.valueOf(jCurrentTimeMillis);
                t1Var2.a(wVar);
            } else {
                Long l9 = t1Var2.f51199d;
                if (jCurrentTimeMillis > (l9 != null ? l9.longValue() : 0L) + ((long) 5000)) {
                    t1Var2.f51199d = Long.valueOf(jCurrentTimeMillis);
                    t1Var2.a(wVar);
                }
            }
            Object objQ11 = r13.Q();
            Object obj13 = objQ11;
            if (objQ11 == gVar3) {
                rz.b0 b0VarQ = l1.t.q(r13);
                r13.o0(b0VarQ);
                obj13 = b0VarQ;
            }
            final rz.b0 b0Var2 = (rz.b0) obj13;
            Object objQ12 = r13.Q();
            Object obj14 = objQ12;
            if (objQ12 == gVar3) {
                p0.c cVar8 = new p0.c();
                r13.o0(cVar8);
                obj14 = cVar8;
            }
            final p0.c cVar9 = (p0.c) obj14;
            Object objQ13 = r13.Q();
            Object obj15 = objQ13;
            if (objQ13 == gVar3) {
                d1.z0 z0Var3 = new d1.z0(t1Var2);
                r13.o0(z0Var3);
                obj15 = z0Var3;
            }
            final d1.z0 z0Var4 = (d1.z0) obj15;
            z0Var4.f23038b = pVar5;
            z0Var4.f23042f = f0Var;
            z0Var4.f23039c = s0Var6.f51186v;
            z0Var4.f23040d = s0Var6;
            z0Var4.f23041e.setValue(wVar);
            z0Var4.f23058w = new j3.x0(j14);
            z0Var4.f23044h = (z2.c1) r13.j(z2.g1.f58545f);
            z0Var4.f23045i = b0Var2;
            z0Var4.f23047k = (n2.a) r13.j(z2.g1.f58551l);
            z0Var4.f23048l = vVar3;
            boolean z35 = !z13;
            z0Var4.m.setValue(Boolean.valueOf(z35));
            z0Var4.f23049n.setValue(Boolean.valueOf(z12));
            r13.d0(1966776937);
            d1.u uVar3 = d1.u.EditableText;
            q3.b bVar = y0Var3.f35827a.f35764k;
            c3 c3Var = d1.s.f22986a;
            r13.d0(430530635);
            if (Build.VERSION.SDK_INT < 28) {
                z18 = false;
                r13.p(false);
                mVar = null;
            } else {
                Context context = (Context) r13.j(AndroidCompositionLocals_androidKt.f1200b);
                vy.i iVar3 = (vy.i) r13.j(d1.s.f22986a);
                boolean zF2 = r13.f(iVar3) | r13.f(context) | r13.f(bVar);
                Object objQ14 = r13.Q();
                if (zF2 || objQ14 == gVar3) {
                    obj2 = objQ14;
                    d1.s.f22987b.getClass();
                    d1.r rVar3 = new d1.r(iVar3, context, uVar3, bVar);
                    r13.o0(rVar3);
                    obj2 = rVar3;
                }
                mVar = (d1.m) obj2;
                z18 = false;
                r13.p(false);
            }
            z0Var4.f23046j = mVar;
            r13.p(z18);
            int i29 = i26 & 7168;
            int i30 = i26 & 57344;
            final o3.x xVar4 = xVar3;
            boolean zH8 = r13.h(s0Var6) | (i29 == 2048) | (i30 == 16384) | r13.h(xVar4) | (i27 == 4);
            int i31 = (i26 & 112) ^ 48;
            if (i31 > 32) {
                jVar2 = jVar;
                if (r13.f(jVar2)) {
                    z19 = zH8;
                    i17 = i29;
                }
                zH = z19 | z | r13.h(pVar5) | r13.h(b0Var2) | r13.h(cVar9) | r13.h(z0Var4);
                Object objQ15 = r13.Q();
                if (!zH || objQ15 == gVar3) {
                    final o3.j jVar5 = jVar2;
                    vVar = vVar3;
                    s0Var2 = s0Var6;
                    obj3 = new fz.c() { // from class: s0.v
                        @Override // fz.c
                        public final Object invoke(Object obj16) {
                            o1 o1VarD;
                            s0 s0Var7 = s0Var2;
                            e2.b0 b0Var3 = (e2.b0) ((e2.z) obj16);
                            if (s0Var7.b() != b0Var3.a()) {
                                s0Var7.f51171f.setValue(Boolean.valueOf(b0Var3.a()));
                                boolean zB = s0Var7.b();
                                o3.w wVar4 = wVar;
                                o3.p pVar8 = pVar5;
                                if (zB && z12 && !z13) {
                                    o0.y(xVar4, s0Var7, wVar4, jVar5, pVar8);
                                } else {
                                    o0.q(s0Var7);
                                }
                                if (b0Var3.a() && (o1VarD = s0Var7.d()) != null) {
                                    rz.e0.B(b0Var2, null, null, new b0.x0(cVar9, wVar4, s0Var7, o1VarD, pVar8, (vy.d) null, 22), 3);
                                }
                                if (!b0Var3.a()) {
                                    z0Var4.g(null);
                                }
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    z20 = z12;
                    wVar2 = wVar;
                    b0Var = b0Var2;
                    xVar4 = xVar4;
                    jVar3 = jVar5;
                    pVar = pVar5;
                    r13.o0(obj3);
                } else {
                    obj3 = objQ15;
                    s0Var2 = s0Var6;
                    b0Var = b0Var2;
                    wVar2 = wVar;
                    z20 = z12;
                    pVar = pVar5;
                    jVar3 = jVar2;
                    vVar = vVar3;
                }
                oVar = z1.o.f58481a;
                z1.r rVarQ = d0.n.q(e2.d.t(e2.d.j(oVar, vVar), (fz.c) obj3), z20, iVar);
                if (z20 || z13) {
                    z21 = false;
                } else {
                    z21 = true;
                }
                b1VarH = l1.t.H(Boolean.valueOf(z21), r13);
                boolean zF3 = r13.f(b1VarH) | r13.h(s0Var2) | r13.h(xVar4) | r13.h(z0Var4);
                if (i31 > 32 || !r13.f(jVar3)) {
                    s0Var3 = s0Var2;
                    if ((i26 & 48) != 32) {
                        z22 = false;
                    }
                    z23 = zF3 | z22;
                    Object objQ16 = r13.Q();
                    if (!z23 || objQ16 == gVar3) {
                        iVar2 = iVar;
                        rVarA = oVar;
                        s0Var4 = s0Var3;
                        x0Var = new b0.x0(s0Var4, b1VarH, xVar4, z0Var4, jVar3, (vy.d) null, 21);
                        z0Var4 = z0Var4;
                        r13.o0(x0Var);
                    } else {
                        x0Var = objQ16;
                        s0Var4 = s0Var3;
                        rVarA = oVar;
                        iVar2 = iVar;
                    }
                    l1.t.f((fz.e) x0Var, qy.b0.f48488a, r13);
                    zH2 = r13.h(s0Var4);
                    Object objQ17 = r13.Q();
                    obj4 = objQ17;
                    if (zH2 || objQ17 == gVar3) {
                        w wVar4 = new w(s0Var4, 0);
                        r13.o0(wVar4);
                        obj4 = wVar4;
                    }
                    rVarA2 = s2.g0.a(rVarA, 8675309, new a1.d((fz.c) obj4, 4));
                    boolean zH9 = r13.h(s0Var4);
                    if (i30 == 16384) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    boolean z36 = zH9 | z24;
                    i18 = i17;
                    if (i18 == 2048) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    zH3 = z36 | z25 | r13.h(pVar) | r13.h(z0Var4);
                    objQ = r13.Q();
                    if (!zH3 || objQ == gVar3) {
                        final d1.z0 z0Var5 = z0Var4;
                        pVar2 = pVar;
                        final e2.v vVar4 = vVar;
                        final boolean z37 = z20;
                        rVar2 = rVarA2;
                        fz.c cVar10 = new fz.c() { // from class: s0.x
                            @Override // fz.c
                            public final Object invoke(Object obj16) {
                                i2 i2Var2;
                                f2.b bVar2 = (f2.b) obj16;
                                s0 s0Var7 = s0Var4;
                                if (!s0Var7.b()) {
                                    e2.v.b(vVar4);
                                } else if (!z13 && (i2Var2 = s0Var7.f51168c) != null) {
                                    ((z2.h1) i2Var2).b();
                                }
                                if (s0Var7.b() && z37) {
                                    if (s0Var7.a() != h0.Selection) {
                                        o1 o1VarD = s0Var7.d();
                                        if (o1VarD != null) {
                                            long j16 = bVar2.f26570a;
                                            ob.c cVar11 = s0Var7.f51169d;
                                            w wVar5 = s0Var7.f51186v;
                                            int iF = pVar2.f(o1VarD.b(j16, true));
                                            wVar5.invoke(o3.w.a((o3.w) cVar11.f44799b, null, j3.t.b(iF, iF), 5));
                                            if (s0Var7.f51166a.f51266a.f35700b.length() > 0) {
                                                s0Var7.f51176k.setValue(h0.Cursor);
                                            }
                                        }
                                    } else {
                                        z0Var5.g(bVar2);
                                    }
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        z0Var4 = z0Var5;
                        r13.o0(cVar10);
                        objQ = cVar10;
                    } else {
                        rVar2 = rVarA2;
                        pVar2 = pVar;
                    }
                    cVar4 = (fz.c) objQ;
                    if (z12) {
                        rVarA3 = z1.a.a(rVar2, new d0.b1(4, cVar4, iVar2));
                    } else {
                        rVarA3 = rVar2;
                    }
                    ie.o oVar2 = z0Var4.A;
                    d1.v0 v0Var = z0Var4.f23061z;
                    z1.r rVarI = rVarA3.i(new s2.e0(oVar2, v0Var, null, new bp.s0(1, oVar2, v0Var), 4));
                    s2.q.f51338a.getClass();
                    z1.r rVarF = s2.s.f(rVarI, s2.s.f51340b);
                    boolean zH10 = r13.h(s0Var4);
                    if (i27 == 4) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    zH4 = zH10 | z26 | r13.h(pVar2);
                    Object objQ18 = r13.Q();
                    i19 = 17;
                    obj5 = objQ18;
                    if (zH4 || objQ18 == gVar3) {
                        pr.a0 a0Var = new pr.a0(s0Var4, wVar2, pVar2, i19);
                        r13.o0(a0Var);
                        obj5 = a0Var;
                    }
                    z1.r rVarD = d2.h.d(rVarA, (fz.c) obj5);
                    boolean zH11 = r13.h(s0Var4);
                    if (i18 == 2048) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    boolean zF4 = zH11 | z27 | r13.f(q2Var2) | r13.h(z0Var4);
                    if (i27 == 4) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    zH5 = zF4 | z28 | r13.h(pVar2);
                    objQ2 = r13.Q();
                    if (!zH5 || objQ2 == gVar3) {
                        d1.z0 z0Var6 = z0Var4;
                        et.d dVar2 = new et.d(s0Var4, z12, q2Var2, z0Var6, wVar2, pVar2);
                        q2Var = q2Var2;
                        z0Var4 = z0Var6;
                        r13.o0(dVar2);
                        objQ2 = dVar2;
                    } else {
                        q2Var = q2Var2;
                    }
                    z1.r rVarM = w2.a0.m(rVarA, (fz.c) objQ2);
                    pVar3 = pVar2;
                    s0 s0Var7 = s0Var4;
                    z0Var = z0Var4;
                    xVar = xVar4;
                    b1.h hVar7 = new b1.h(d0Var, wVar, s0Var7, z13, z12, f0Var instanceof o3.q, pVar3, z0Var, jVar, vVar);
                    s0Var5 = s0Var7;
                    if (!z12 && !z13 && ((Boolean) ((z2.u1) q2Var).f58681c.getValue()).booleanValue() && j3.x0.c(((j3.x0) s0Var5.A.getValue()).f35823a) && j3.x0.c(((j3.x0) s0Var5.B.getValue()).f35823a)) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    if (z29) {
                        b1 b1Var = new b1(tVar, s0Var5, wVar, pVar3, 0);
                        s0Var5 = s0Var5;
                        rVarA4 = z1.a.a(rVarA, b1Var);
                    } else {
                        rVarA4 = rVarA;
                    }
                    zH6 = r13.h(z0Var);
                    Object objQ19 = r13.Q();
                    obj6 = objQ19;
                    if (zH6 || objQ19 == gVar3) {
                        d1.q0 q0Var2 = new d1.q0(z0Var, 1);
                        r13.o0(q0Var2);
                        obj6 = q0Var2;
                    }
                    l1.t.c(z0Var, (fz.c) obj6, r13);
                    boolean zH12 = r13.h(s0Var5) | r13.h(xVar);
                    if (i27 == 4) {
                        z30 = true;
                    } else {
                        z30 = false;
                    }
                    z31 = zH12 | z30 | ((i31 <= 32 && r13.f(jVar)) || (i26 & 48) == 32);
                    objQ3 = r13.Q();
                    if (!z31 || objQ3 == gVar3) {
                        b0.a aVar = new b0.a(s0Var5, xVar, wVar, jVar, 27);
                        jVar4 = jVar;
                        r13.o0(aVar);
                        objQ3 = aVar;
                    } else {
                        jVar4 = jVar;
                    }
                    l1.t.c(jVar4, (fz.c) objQ3, r13);
                    w wVar5 = s0Var5.f51186v;
                    if (i11 == 1) {
                        z32 = true;
                    } else {
                        z32 = false;
                    }
                    z1.r rVarA5 = z1.a.a(rVarA, new g1(s0Var5, z0Var, wVar, z35, z32, pVar3, t1Var2, wVar5, jVar4.f44683e));
                    i21 = jVar4.f44682d;
                    if (i21 == 7 && i21 != 8) {
                        z33 = true;
                    } else {
                        z33 = false;
                    }
                    boolean zBooleanValue = ((Boolean) b1VarH.getValue()).booleanValue();
                    zG = r13.g(z33) | r13.h(eVar2);
                    Object objQ20 = r13.Q();
                    obj7 = objQ20;
                    if (zG || objQ20 == gVar3) {
                        bt.w wVar6 = new bt.w(z33, eVar2, 4);
                        r13.o0(wVar6);
                        obj7 = wVar6;
                    }
                    z1.r rVarA6 = a1.b.a(zBooleanValue, z33, (fz.a) obj7);
                    j11 = ((g2.x) r13.j(i.f51056a)).f28624a;
                    zH7 = r13.h(s0Var5) | r13.e(j11);
                    Object objQ21 = r13.Q();
                    obj8 = objQ21;
                    if (zH7 || objQ21 == gVar3) {
                        k4 k4Var = new k4(s0Var5, j11, 5);
                        r13.o0(k4Var);
                        obj8 = k4Var;
                    }
                    z1.r rVarE = q2.c.e(b1.s.l(rVar.i(d2.h.d(rVarA, (fz.c) obj8)), eVar2, s0Var5, z0Var).i(rVarA6).i(rVarQ), new av.r(18, lVar, s0Var5));
                    int i32 = 17;
                    m1 m1Var2 = m1Var;
                    z1.r rVarA7 = y0.h.a(w2.a0.m(z1.a.a(q2.c.e(rVarE, new av.r(i32, s0Var5, z0Var)).i(rVarA5), new l1(m1Var2, z12, iVar)).i(rVarF).i(hVar7), new av.t(s0Var5, 8)), new ch.z(i32, z0Var, b0Var));
                    if (!z12 && s0Var5.b() && ((Boolean) s0Var5.f51181q.getValue()).booleanValue() && ((Boolean) ((z2.u1) q2Var).f58681c.getValue()).booleanValue()) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    if (z34 && d0.k1.a()) {
                        rVarA = z1.a.a(rVarA, new d1.e1(z0Var, 0));
                    }
                    ?? r16 = r13;
                    h(rVarA7, z0Var, t1.e.d(-814563849, new b0(dVar, s0Var5, y0Var, i12, i11, m1Var2, wVar, f0Var, rVarA4, rVarD, rVarM, rVarA, cVar9, z0Var, z34, z13, cVar2, pVar3, cVar6), r16), r16, 384);
                    r11 = r16;
                } else {
                    s0Var3 = s0Var2;
                }
                z22 = true;
                z23 = zF3 | z22;
                Object objQ110 = r13.Q();
                if (z23) {
                    iVar2 = iVar;
                    rVarA = oVar;
                    s0Var4 = s0Var3;
                    x0Var = new b0.x0(s0Var4, b1VarH, xVar4, z0Var4, jVar3, (vy.d) null, 21);
                    z0Var4 = z0Var4;
                    r13.o0(x0Var);
                } else {
                    iVar2 = iVar;
                    rVarA = oVar;
                    s0Var4 = s0Var3;
                    x0Var = new b0.x0(s0Var4, b1VarH, xVar4, z0Var4, jVar3, (vy.d) null, 21);
                    z0Var4 = z0Var4;
                    r13.o0(x0Var);
                }
                l1.t.f((fz.e) x0Var, qy.b0.f48488a, r13);
                zH2 = r13.h(s0Var4);
                Object objQ111 = r13.Q();
                obj4 = objQ111;
                if (zH2) {
                    w wVar7 = new w(s0Var4, 0);
                    r13.o0(wVar7);
                    obj4 = wVar7;
                } else {
                    w wVar8 = new w(s0Var4, 0);
                    r13.o0(wVar8);
                    obj4 = wVar8;
                }
                rVarA2 = s2.g0.a(rVarA, 8675309, new a1.d((fz.c) obj4, 4));
                boolean zH13 = r13.h(s0Var4);
                if (i30 == 16384) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean z38 = zH13 | z24;
                i18 = i17;
                if (i18 == 2048) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                zH3 = z38 | z25 | r13.h(pVar) | r13.h(z0Var4);
                objQ = r13.Q();
                if (zH3) {
                    final d1.z0 z0Var7 = z0Var4;
                    pVar2 = pVar;
                    final e2.v vVar5 = vVar;
                    final boolean z39 = z20;
                    rVar2 = rVarA2;
                    fz.c cVar11 = new fz.c() { // from class: s0.x
                        @Override // fz.c
                        public final Object invoke(Object obj16) {
                            i2 i2Var2;
                            f2.b bVar2 = (f2.b) obj16;
                            s0 s0Var8 = s0Var4;
                            if (!s0Var8.b()) {
                                e2.v.b(vVar5);
                            } else if (!z13 && (i2Var2 = s0Var8.f51168c) != null) {
                                ((z2.h1) i2Var2).b();
                            }
                            if (s0Var8.b() && z39) {
                                if (s0Var8.a() != h0.Selection) {
                                    o1 o1VarD = s0Var8.d();
                                    if (o1VarD != null) {
                                        long j16 = bVar2.f26570a;
                                        ob.c cVar12 = s0Var8.f51169d;
                                        w wVar9 = s0Var8.f51186v;
                                        int iF = pVar2.f(o1VarD.b(j16, true));
                                        wVar9.invoke(o3.w.a((o3.w) cVar12.f44799b, null, j3.t.b(iF, iF), 5));
                                        if (s0Var8.f51166a.f51266a.f35700b.length() > 0) {
                                            s0Var8.f51176k.setValue(h0.Cursor);
                                        }
                                    }
                                } else {
                                    z0Var7.g(bVar2);
                                }
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    z0Var4 = z0Var7;
                    r13.o0(cVar11);
                    objQ = cVar11;
                } else {
                    final d1.z0 z0Var8 = z0Var4;
                    pVar2 = pVar;
                    final e2.v vVar6 = vVar;
                    final boolean z310 = z20;
                    rVar2 = rVarA2;
                    fz.c cVar12 = new fz.c() { // from class: s0.x
                        @Override // fz.c
                        public final Object invoke(Object obj16) {
                            i2 i2Var2;
                            f2.b bVar2 = (f2.b) obj16;
                            s0 s0Var8 = s0Var4;
                            if (!s0Var8.b()) {
                                e2.v.b(vVar6);
                            } else if (!z13 && (i2Var2 = s0Var8.f51168c) != null) {
                                ((z2.h1) i2Var2).b();
                            }
                            if (s0Var8.b() && z310) {
                                if (s0Var8.a() != h0.Selection) {
                                    o1 o1VarD = s0Var8.d();
                                    if (o1VarD != null) {
                                        long j16 = bVar2.f26570a;
                                        ob.c cVar13 = s0Var8.f51169d;
                                        w wVar9 = s0Var8.f51186v;
                                        int iF = pVar2.f(o1VarD.b(j16, true));
                                        wVar9.invoke(o3.w.a((o3.w) cVar13.f44799b, null, j3.t.b(iF, iF), 5));
                                        if (s0Var8.f51166a.f51266a.f35700b.length() > 0) {
                                            s0Var8.f51176k.setValue(h0.Cursor);
                                        }
                                    }
                                } else {
                                    z0Var8.g(bVar2);
                                }
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    z0Var4 = z0Var8;
                    r13.o0(cVar12);
                    objQ = cVar12;
                }
                cVar4 = (fz.c) objQ;
                if (z12) {
                    rVarA3 = z1.a.a(rVar2, new d0.b1(4, cVar4, iVar2));
                } else {
                    rVarA3 = rVar2;
                }
                ie.o oVar3 = z0Var4.A;
                d1.v0 v0Var2 = z0Var4.f23061z;
                z1.r rVarI2 = rVarA3.i(new s2.e0(oVar3, v0Var2, null, new bp.s0(1, oVar3, v0Var2), 4));
                s2.q.f51338a.getClass();
                z1.r rVarF2 = s2.s.f(rVarI2, s2.s.f51340b);
                boolean zH14 = r13.h(s0Var4);
                if (i27 == 4) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                zH4 = zH14 | z26 | r13.h(pVar2);
                Object objQ112 = r13.Q();
                i19 = 17;
                obj5 = objQ112;
                if (zH4) {
                    pr.a0 a0Var2 = new pr.a0(s0Var4, wVar2, pVar2, i19);
                    r13.o0(a0Var2);
                    obj5 = a0Var2;
                } else {
                    pr.a0 a0Var3 = new pr.a0(s0Var4, wVar2, pVar2, i19);
                    r13.o0(a0Var3);
                    obj5 = a0Var3;
                }
                z1.r rVarD2 = d2.h.d(rVarA, (fz.c) obj5);
                boolean zH15 = r13.h(s0Var4);
                if (i18 == 2048) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                boolean zF5 = zH15 | z27 | r13.f(q2Var2) | r13.h(z0Var4);
                if (i27 == 4) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                zH5 = zF5 | z28 | r13.h(pVar2);
                objQ2 = r13.Q();
                if (zH5) {
                    d1.z0 z0Var9 = z0Var4;
                    et.d dVar3 = new et.d(s0Var4, z12, q2Var2, z0Var9, wVar2, pVar2);
                    q2Var = q2Var2;
                    z0Var4 = z0Var9;
                    r13.o0(dVar3);
                    objQ2 = dVar3;
                } else {
                    d1.z0 z0Var10 = z0Var4;
                    et.d dVar4 = new et.d(s0Var4, z12, q2Var2, z0Var10, wVar2, pVar2);
                    q2Var = q2Var2;
                    z0Var4 = z0Var10;
                    r13.o0(dVar4);
                    objQ2 = dVar4;
                }
                z1.r rVarM2 = w2.a0.m(rVarA, (fz.c) objQ2);
                pVar3 = pVar2;
                s0 s0Var8 = s0Var4;
                z0Var = z0Var4;
                xVar = xVar4;
                b1.h hVar8 = new b1.h(d0Var, wVar, s0Var8, z13, z12, f0Var instanceof o3.q, pVar3, z0Var, jVar, vVar);
                s0Var5 = s0Var8;
                if (!z12) {
                    z29 = false;
                } else {
                    z29 = false;
                }
                if (z29) {
                    b1 b1Var2 = new b1(tVar, s0Var5, wVar, pVar3, 0);
                    s0Var5 = s0Var5;
                    rVarA4 = z1.a.a(rVarA, b1Var2);
                } else {
                    rVarA4 = rVarA;
                }
                zH6 = r13.h(z0Var);
                Object objQ113 = r13.Q();
                obj6 = objQ113;
                if (zH6) {
                    d1.q0 q0Var3 = new d1.q0(z0Var, 1);
                    r13.o0(q0Var3);
                    obj6 = q0Var3;
                } else {
                    d1.q0 q0Var4 = new d1.q0(z0Var, 1);
                    r13.o0(q0Var4);
                    obj6 = q0Var4;
                }
                l1.t.c(z0Var, (fz.c) obj6, r13);
                boolean zH16 = r13.h(s0Var5) | r13.h(xVar);
                if (i27 == 4) {
                    z30 = true;
                } else {
                    z30 = false;
                }
                z31 = zH16 | z30 | ((i31 <= 32 && r13.f(jVar)) || (i26 & 48) == 32);
                objQ3 = r13.Q();
                if (z31) {
                    b0.a aVar2 = new b0.a(s0Var5, xVar, wVar, jVar, 27);
                    jVar4 = jVar;
                    r13.o0(aVar2);
                    objQ3 = aVar2;
                } else {
                    b0.a aVar3 = new b0.a(s0Var5, xVar, wVar, jVar, 27);
                    jVar4 = jVar;
                    r13.o0(aVar3);
                    objQ3 = aVar3;
                }
                l1.t.c(jVar4, (fz.c) objQ3, r13);
                w wVar9 = s0Var5.f51186v;
                if (i11 == 1) {
                    z32 = true;
                } else {
                    z32 = false;
                }
                z1.r rVarA8 = z1.a.a(rVarA, new g1(s0Var5, z0Var, wVar, z35, z32, pVar3, t1Var2, wVar9, jVar4.f44683e));
                i21 = jVar4.f44682d;
                if (i21 == 7) {
                    z33 = false;
                } else {
                    z33 = true;
                }
                boolean zBooleanValue2 = ((Boolean) b1VarH.getValue()).booleanValue();
                zG = r13.g(z33) | r13.h(eVar2);
                Object objQ22 = r13.Q();
                obj7 = objQ22;
                if (zG) {
                    bt.w wVar10 = new bt.w(z33, eVar2, 4);
                    r13.o0(wVar10);
                    obj7 = wVar10;
                } else {
                    bt.w wVar11 = new bt.w(z33, eVar2, 4);
                    r13.o0(wVar11);
                    obj7 = wVar11;
                }
                z1.r rVarA9 = a1.b.a(zBooleanValue2, z33, (fz.a) obj7);
                j11 = ((g2.x) r13.j(i.f51056a)).f28624a;
                zH7 = r13.h(s0Var5) | r13.e(j11);
                Object objQ23 = r13.Q();
                obj8 = objQ23;
                if (zH7) {
                    k4 k4Var2 = new k4(s0Var5, j11, 5);
                    r13.o0(k4Var2);
                    obj8 = k4Var2;
                } else {
                    k4 k4Var3 = new k4(s0Var5, j11, 5);
                    r13.o0(k4Var3);
                    obj8 = k4Var3;
                }
                z1.r rVarE2 = q2.c.e(b1.s.l(rVar.i(d2.h.d(rVarA, (fz.c) obj8)), eVar2, s0Var5, z0Var).i(rVarA9).i(rVarQ), new av.r(18, lVar, s0Var5));
                int i33 = 17;
                m1 m1Var3 = m1Var;
                z1.r rVarA10 = y0.h.a(w2.a0.m(z1.a.a(q2.c.e(rVarE2, new av.r(i33, s0Var5, z0Var)).i(rVarA8), new l1(m1Var3, z12, iVar)).i(rVarF2).i(hVar8), new av.t(s0Var5, 8)), new ch.z(i33, z0Var, b0Var));
                if (!z12) {
                    z34 = false;
                } else {
                    z34 = false;
                }
                if (z34) {
                    rVarA = z1.a.a(rVarA, new d1.e1(z0Var, 0));
                }
                ?? r17 = r13;
                h(rVarA10, z0Var, t1.e.d(-814563849, new b0(dVar, s0Var5, y0Var, i12, i11, m1Var3, wVar, f0Var, rVarA4, rVarD2, rVarM2, rVarA, cVar9, z0Var, z34, z13, cVar2, pVar3, cVar6), r17), r17, 384);
                r11 = r17;
            } else {
                jVar2 = jVar;
            }
            z19 = zH8;
            i17 = i29;
            boolean z40 = (i26 & 48) == 32;
            zH = z19 | z40 | r13.h(pVar5) | r13.h(b0Var2) | r13.h(cVar9) | r13.h(z0Var4);
            Object objQ114 = r13.Q();
            if (zH) {
                final o3.j jVar6 = jVar2;
                vVar = vVar3;
                s0Var2 = s0Var6;
                obj3 = new fz.c() { // from class: s0.v
                    @Override // fz.c
                    public final Object invoke(Object obj16) {
                        o1 o1VarD;
                        s0 s0Var9 = s0Var2;
                        e2.b0 b0Var3 = (e2.b0) ((e2.z) obj16);
                        if (s0Var9.b() != b0Var3.a()) {
                            s0Var9.f51171f.setValue(Boolean.valueOf(b0Var3.a()));
                            boolean zB = s0Var9.b();
                            o3.w wVar12 = wVar;
                            o3.p pVar8 = pVar5;
                            if (zB && z12 && !z13) {
                                o0.y(xVar4, s0Var9, wVar12, jVar6, pVar8);
                            } else {
                                o0.q(s0Var9);
                            }
                            if (b0Var3.a() && (o1VarD = s0Var9.d()) != null) {
                                rz.e0.B(b0Var2, null, null, new b0.x0(cVar9, wVar12, s0Var9, o1VarD, pVar8, (vy.d) null, 22), 3);
                            }
                            if (!b0Var3.a()) {
                                z0Var4.g(null);
                            }
                        }
                        return qy.b0.f48488a;
                    }
                };
                z20 = z12;
                wVar2 = wVar;
                b0Var = b0Var2;
                xVar4 = xVar4;
                jVar3 = jVar6;
                pVar = pVar5;
                r13.o0(obj3);
            } else {
                final o3.j jVar7 = jVar2;
                vVar = vVar3;
                s0Var2 = s0Var6;
                obj3 = new fz.c() { // from class: s0.v
                    @Override // fz.c
                    public final Object invoke(Object obj16) {
                        o1 o1VarD;
                        s0 s0Var9 = s0Var2;
                        e2.b0 b0Var3 = (e2.b0) ((e2.z) obj16);
                        if (s0Var9.b() != b0Var3.a()) {
                            s0Var9.f51171f.setValue(Boolean.valueOf(b0Var3.a()));
                            boolean zB = s0Var9.b();
                            o3.w wVar12 = wVar;
                            o3.p pVar8 = pVar5;
                            if (zB && z12 && !z13) {
                                o0.y(xVar4, s0Var9, wVar12, jVar7, pVar8);
                            } else {
                                o0.q(s0Var9);
                            }
                            if (b0Var3.a() && (o1VarD = s0Var9.d()) != null) {
                                rz.e0.B(b0Var2, null, null, new b0.x0(cVar9, wVar12, s0Var9, o1VarD, pVar8, (vy.d) null, 22), 3);
                            }
                            if (!b0Var3.a()) {
                                z0Var4.g(null);
                            }
                        }
                        return qy.b0.f48488a;
                    }
                };
                z20 = z12;
                wVar2 = wVar;
                b0Var = b0Var2;
                xVar4 = xVar4;
                jVar3 = jVar7;
                pVar = pVar5;
                r13.o0(obj3);
            }
            oVar = z1.o.f58481a;
            z1.r rVarQ2 = d0.n.q(e2.d.t(e2.d.j(oVar, vVar), (fz.c) obj3), z20, iVar);
            if (z20) {
                z21 = false;
            } else {
                z21 = false;
            }
            b1VarH = l1.t.H(Boolean.valueOf(z21), r13);
            boolean zF6 = r13.f(b1VarH) | r13.h(s0Var2) | r13.h(xVar4) | r13.h(z0Var4);
            if (i31 > 32) {
                s0Var3 = s0Var2;
                if ((i26 & 48) != 32) {
                    z22 = true;
                } else {
                    z22 = false;
                }
            } else {
                s0Var3 = s0Var2;
                if ((i26 & 48) != 32) {
                    z22 = true;
                } else {
                    z22 = false;
                }
            }
            z23 = zF6 | z22;
            Object objQ115 = r13.Q();
            if (z23) {
                iVar2 = iVar;
                rVarA = oVar;
                s0Var4 = s0Var3;
                x0Var = new b0.x0(s0Var4, b1VarH, xVar4, z0Var4, jVar3, (vy.d) null, 21);
                z0Var4 = z0Var4;
                r13.o0(x0Var);
            } else {
                iVar2 = iVar;
                rVarA = oVar;
                s0Var4 = s0Var3;
                x0Var = new b0.x0(s0Var4, b1VarH, xVar4, z0Var4, jVar3, (vy.d) null, 21);
                z0Var4 = z0Var4;
                r13.o0(x0Var);
            }
            l1.t.f((fz.e) x0Var, qy.b0.f48488a, r13);
            zH2 = r13.h(s0Var4);
            Object objQ116 = r13.Q();
            obj4 = objQ116;
            if (zH2) {
                w wVar12 = new w(s0Var4, 0);
                r13.o0(wVar12);
                obj4 = wVar12;
            } else {
                w wVar13 = new w(s0Var4, 0);
                r13.o0(wVar13);
                obj4 = wVar13;
            }
            rVarA2 = s2.g0.a(rVarA, 8675309, new a1.d((fz.c) obj4, 4));
            boolean zH17 = r13.h(s0Var4);
            if (i30 == 16384) {
                z24 = true;
            } else {
                z24 = false;
            }
            boolean z311 = zH17 | z24;
            i18 = i17;
            if (i18 == 2048) {
                z25 = true;
            } else {
                z25 = false;
            }
            zH3 = z311 | z25 | r13.h(pVar) | r13.h(z0Var4);
            objQ = r13.Q();
            if (zH3) {
                final d1.z0 z0Var11 = z0Var4;
                pVar2 = pVar;
                final e2.v vVar7 = vVar;
                final boolean z312 = z20;
                rVar2 = rVarA2;
                fz.c cVar13 = new fz.c() { // from class: s0.x
                    @Override // fz.c
                    public final Object invoke(Object obj16) {
                        i2 i2Var2;
                        f2.b bVar2 = (f2.b) obj16;
                        s0 s0Var9 = s0Var4;
                        if (!s0Var9.b()) {
                            e2.v.b(vVar7);
                        } else if (!z13 && (i2Var2 = s0Var9.f51168c) != null) {
                            ((z2.h1) i2Var2).b();
                        }
                        if (s0Var9.b() && z312) {
                            if (s0Var9.a() != h0.Selection) {
                                o1 o1VarD = s0Var9.d();
                                if (o1VarD != null) {
                                    long j16 = bVar2.f26570a;
                                    ob.c cVar14 = s0Var9.f51169d;
                                    w wVar14 = s0Var9.f51186v;
                                    int iF = pVar2.f(o1VarD.b(j16, true));
                                    wVar14.invoke(o3.w.a((o3.w) cVar14.f44799b, null, j3.t.b(iF, iF), 5));
                                    if (s0Var9.f51166a.f51266a.f35700b.length() > 0) {
                                        s0Var9.f51176k.setValue(h0.Cursor);
                                    }
                                }
                            } else {
                                z0Var11.g(bVar2);
                            }
                        }
                        return qy.b0.f48488a;
                    }
                };
                z0Var4 = z0Var11;
                r13.o0(cVar13);
                objQ = cVar13;
            } else {
                final d1.z0 z0Var12 = z0Var4;
                pVar2 = pVar;
                final e2.v vVar8 = vVar;
                final boolean z313 = z20;
                rVar2 = rVarA2;
                fz.c cVar14 = new fz.c() { // from class: s0.x
                    @Override // fz.c
                    public final Object invoke(Object obj16) {
                        i2 i2Var2;
                        f2.b bVar2 = (f2.b) obj16;
                        s0 s0Var9 = s0Var4;
                        if (!s0Var9.b()) {
                            e2.v.b(vVar8);
                        } else if (!z13 && (i2Var2 = s0Var9.f51168c) != null) {
                            ((z2.h1) i2Var2).b();
                        }
                        if (s0Var9.b() && z313) {
                            if (s0Var9.a() != h0.Selection) {
                                o1 o1VarD = s0Var9.d();
                                if (o1VarD != null) {
                                    long j16 = bVar2.f26570a;
                                    ob.c cVar15 = s0Var9.f51169d;
                                    w wVar14 = s0Var9.f51186v;
                                    int iF = pVar2.f(o1VarD.b(j16, true));
                                    wVar14.invoke(o3.w.a((o3.w) cVar15.f44799b, null, j3.t.b(iF, iF), 5));
                                    if (s0Var9.f51166a.f51266a.f35700b.length() > 0) {
                                        s0Var9.f51176k.setValue(h0.Cursor);
                                    }
                                }
                            } else {
                                z0Var12.g(bVar2);
                            }
                        }
                        return qy.b0.f48488a;
                    }
                };
                z0Var4 = z0Var12;
                r13.o0(cVar14);
                objQ = cVar14;
            }
            cVar4 = (fz.c) objQ;
            if (z12) {
                rVarA3 = z1.a.a(rVar2, new d0.b1(4, cVar4, iVar2));
            } else {
                rVarA3 = rVar2;
            }
            ie.o oVar4 = z0Var4.A;
            d1.v0 v0Var3 = z0Var4.f23061z;
            z1.r rVarI3 = rVarA3.i(new s2.e0(oVar4, v0Var3, null, new bp.s0(1, oVar4, v0Var3), 4));
            s2.q.f51338a.getClass();
            z1.r rVarF3 = s2.s.f(rVarI3, s2.s.f51340b);
            boolean zH18 = r13.h(s0Var4);
            if (i27 == 4) {
                z26 = true;
            } else {
                z26 = false;
            }
            zH4 = zH18 | z26 | r13.h(pVar2);
            Object objQ117 = r13.Q();
            i19 = 17;
            obj5 = objQ117;
            if (zH4) {
                pr.a0 a0Var4 = new pr.a0(s0Var4, wVar2, pVar2, i19);
                r13.o0(a0Var4);
                obj5 = a0Var4;
            } else {
                pr.a0 a0Var5 = new pr.a0(s0Var4, wVar2, pVar2, i19);
                r13.o0(a0Var5);
                obj5 = a0Var5;
            }
            z1.r rVarD3 = d2.h.d(rVarA, (fz.c) obj5);
            boolean zH19 = r13.h(s0Var4);
            if (i18 == 2048) {
                z27 = true;
            } else {
                z27 = false;
            }
            boolean zF7 = zH19 | z27 | r13.f(q2Var2) | r13.h(z0Var4);
            if (i27 == 4) {
                z28 = true;
            } else {
                z28 = false;
            }
            zH5 = zF7 | z28 | r13.h(pVar2);
            objQ2 = r13.Q();
            if (zH5) {
                d1.z0 z0Var13 = z0Var4;
                et.d dVar5 = new et.d(s0Var4, z12, q2Var2, z0Var13, wVar2, pVar2);
                q2Var = q2Var2;
                z0Var4 = z0Var13;
                r13.o0(dVar5);
                objQ2 = dVar5;
            } else {
                d1.z0 z0Var14 = z0Var4;
                et.d dVar6 = new et.d(s0Var4, z12, q2Var2, z0Var14, wVar2, pVar2);
                q2Var = q2Var2;
                z0Var4 = z0Var14;
                r13.o0(dVar6);
                objQ2 = dVar6;
            }
            z1.r rVarM3 = w2.a0.m(rVarA, (fz.c) objQ2);
            pVar3 = pVar2;
            s0 s0Var9 = s0Var4;
            z0Var = z0Var4;
            xVar = xVar4;
            b1.h hVar9 = new b1.h(d0Var, wVar, s0Var9, z13, z12, f0Var instanceof o3.q, pVar3, z0Var, jVar, vVar);
            s0Var5 = s0Var9;
            if (!z12) {
                z29 = false;
            } else {
                z29 = false;
            }
            if (z29) {
                b1 b1Var3 = new b1(tVar, s0Var5, wVar, pVar3, 0);
                s0Var5 = s0Var5;
                rVarA4 = z1.a.a(rVarA, b1Var3);
            } else {
                rVarA4 = rVarA;
            }
            zH6 = r13.h(z0Var);
            Object objQ118 = r13.Q();
            obj6 = objQ118;
            if (zH6) {
                d1.q0 q0Var5 = new d1.q0(z0Var, 1);
                r13.o0(q0Var5);
                obj6 = q0Var5;
            } else {
                d1.q0 q0Var6 = new d1.q0(z0Var, 1);
                r13.o0(q0Var6);
                obj6 = q0Var6;
            }
            l1.t.c(z0Var, (fz.c) obj6, r13);
            boolean zH110 = r13.h(s0Var5) | r13.h(xVar);
            if (i27 == 4) {
                z30 = true;
            } else {
                z30 = false;
            }
            z31 = zH110 | z30 | ((i31 <= 32 && r13.f(jVar)) || (i26 & 48) == 32);
            objQ3 = r13.Q();
            if (z31) {
                b0.a aVar4 = new b0.a(s0Var5, xVar, wVar, jVar, 27);
                jVar4 = jVar;
                r13.o0(aVar4);
                objQ3 = aVar4;
            } else {
                b0.a aVar5 = new b0.a(s0Var5, xVar, wVar, jVar, 27);
                jVar4 = jVar;
                r13.o0(aVar5);
                objQ3 = aVar5;
            }
            l1.t.c(jVar4, (fz.c) objQ3, r13);
            w wVar14 = s0Var5.f51186v;
            if (i11 == 1) {
                z32 = true;
            } else {
                z32 = false;
            }
            z1.r rVarA11 = z1.a.a(rVarA, new g1(s0Var5, z0Var, wVar, z35, z32, pVar3, t1Var2, wVar14, jVar4.f44683e));
            i21 = jVar4.f44682d;
            if (i21 == 7) {
                z33 = false;
            } else {
                z33 = true;
            }
            boolean zBooleanValue3 = ((Boolean) b1VarH.getValue()).booleanValue();
            zG = r13.g(z33) | r13.h(eVar2);
            Object objQ24 = r13.Q();
            obj7 = objQ24;
            if (zG) {
                bt.w wVar15 = new bt.w(z33, eVar2, 4);
                r13.o0(wVar15);
                obj7 = wVar15;
            } else {
                bt.w wVar16 = new bt.w(z33, eVar2, 4);
                r13.o0(wVar16);
                obj7 = wVar16;
            }
            z1.r rVarA12 = a1.b.a(zBooleanValue3, z33, (fz.a) obj7);
            j11 = ((g2.x) r13.j(i.f51056a)).f28624a;
            zH7 = r13.h(s0Var5) | r13.e(j11);
            Object objQ25 = r13.Q();
            obj8 = objQ25;
            if (zH7) {
                k4 k4Var4 = new k4(s0Var5, j11, 5);
                r13.o0(k4Var4);
                obj8 = k4Var4;
            } else {
                k4 k4Var5 = new k4(s0Var5, j11, 5);
                r13.o0(k4Var5);
                obj8 = k4Var5;
            }
            z1.r rVarE3 = q2.c.e(b1.s.l(rVar.i(d2.h.d(rVarA, (fz.c) obj8)), eVar2, s0Var5, z0Var).i(rVarA12).i(rVarQ2), new av.r(18, lVar, s0Var5));
            int i34 = 17;
            m1 m1Var4 = m1Var;
            z1.r rVarA13 = y0.h.a(w2.a0.m(z1.a.a(q2.c.e(rVarE3, new av.r(i34, s0Var5, z0Var)).i(rVarA11), new l1(m1Var4, z12, iVar)).i(rVarF3).i(hVar9), new av.t(s0Var5, 8)), new ch.z(i34, z0Var, b0Var));
            if (!z12) {
                z34 = false;
            } else {
                z34 = false;
            }
            if (z34) {
                rVarA = z1.a.a(rVarA, new d1.e1(z0Var, 0));
            }
            ?? r18 = r13;
            h(rVarA13, z0Var, t1.e.d(-814563849, new b0(dVar, s0Var5, y0Var, i12, i11, m1Var4, wVar, f0Var, rVarA4, rVarD3, rVarM3, rVarA, cVar9, z0Var, z34, z13, cVar2, pVar3, cVar6), r18), r18, 384);
            r11 = r18;
        } else {
            ?? r19 = r9;
            r19.W();
            r11 = r19;
        }
        x1 x1VarT = r11.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k(wVar, cVar, rVar, y0Var, f0Var, cVar2, iVar, tVar, z11, i11, i12, jVar, q0Var, z12, z13, dVar, i13, i14);
        }
    }

    public static final void h(z1.r rVar, d1.z0 z0Var, t1.d dVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(2036174316);
        int i12 = (sVar.f(rVar) ? 4 : 2) | i11 | (sVar.h(z0Var) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, true);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVar);
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
            f(z0Var, dVar, sVar, (i12 >> 3) & 126);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k6(rVar, z0Var, dVar, i11, 16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:167:0x026c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2, types: [fz.c] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r4v1, types: [l1.n, l1.s] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, s0.q1] */
    public static final void i(final z1.r rVar, final j3.h hVar, final fz.c cVar, final boolean z11, final Map map, final j3.y0 y0Var, final int i11, final boolean z12, final int i12, final int i13, final n3.h hVar2, final g2.y yVar, final fz.c cVar2, final g gVar, l1.n nVar, final int i14, final int i15) {
        int i16;
        int i17;
        ?? r9;
        fz.a aVar;
        qy.l lVar;
        l1.b1 b1Var;
        l1.b1 b1Var2;
        ?? r19;
        Object obj;
        Object r1Var;
        boolean z13;
        boolean z14;
        Object obj2;
        Object obj3;
        Object obj4;
        Map map2 = map;
        ?? r11 = (l1.s) nVar;
        r11.f0(-2118572703);
        if ((i14 & 6) == 0) {
            i16 = (r11.f(rVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= r11.f(hVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= r11.h(cVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= r11.g(z11) ? 2048 : 1024;
        }
        int i18 = i14 & 24576;
        int i19 = OSSConstants.DEFAULT_BUFFER_SIZE;
        if (i18 == 0) {
            i16 |= r11.h(map2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i16 |= r11.f(y0Var) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i16 |= r11.d(i11) ? 1048576 : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i16 |= r11.g(z12) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i16 |= r11.d(i12) ? 67108864 : 33554432;
        }
        if ((i14 & 805306368) == 0) {
            i16 |= r11.d(i13) ? 536870912 : 268435456;
        }
        if ((i15 & 6) == 0) {
            i17 = i15 | (r11.h(hVar2) ? 4 : 2);
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= r11.h(null) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= r11.h(yVar) ? 256 : 128;
        }
        int i21 = i16;
        if ((i15 & 3072) == 0) {
            i17 |= r11.h(cVar2) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            if ((32768 & i15) == 0 ? r11.f(gVar) : r11.h(gVar)) {
                i19 = 16384;
            }
            i17 |= i19;
        }
        int i22 = i17;
        if (r11.T(i21 & 1, ((i21 & 306783379) == 306783378 && (i22 & 9363) == 9362) ? false : true)) {
            boolean zQ = se.k.q(hVar);
            l1.g gVar2 = l1.m.f39353a;
            if (zQ) {
                r11.d0(145661411);
                boolean z15 = (i21 & 112) == 32;
                Object objQ = r11.Q();
                Object obj5 = objQ;
                if (z15 || objQ == gVar2) {
                    q1 q1Var = new q1(hVar);
                    r11.o0(q1Var);
                    obj5 = q1Var;
                }
                r11.p(false);
                r9 = (q1) obj5;
            } else {
                r11.d0(145727068);
                r11.p(false);
                r9 = 0;
            }
            if (se.k.q(hVar)) {
                r11.d0(145925283);
                boolean zF = ((i21 & 112) == 32) | r11.f(r9);
                Object objQ2 = r11.Q();
                Object obj6 = objQ2;
                if (zF || objQ2 == gVar2) {
                    pv.c cVar3 = new pv.c(12, (Object) r9, hVar);
                    r11.o0(cVar3);
                    obj6 = cVar3;
                }
                aVar = (fz.a) obj6;
                r11.p(false);
            } else {
                r11.d0(146022561);
                boolean z16 = (i21 & 112) == 32;
                Object objQ3 = r11.Q();
                Object obj7 = objQ3;
                if (z16 || objQ3 == gVar2) {
                    lt.e eVar = new lt.e(hVar, 29);
                    r11.o0(eVar);
                    obj7 = eVar;
                }
                aVar = (fz.a) obj7;
                r11.p(false);
            }
            fz.a aVar2 = aVar;
            if (z11) {
                if (map2 != null) {
                    qy.l lVar2 = f.f51025a;
                    if (map2.isEmpty()) {
                        lVar = f.f51025a;
                    } else {
                        List listB = hVar.b(hVar.f35700b.length(), "androidx.compose.foundation.text.inlineContent");
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int size = listB.size();
                        int i23 = 0;
                        while (i23 < size) {
                            List list = listB;
                            j3.f fVar = (j3.f) listB.get(i23);
                            int i24 = size;
                            Object obj8 = fVar.f35689a;
                            int i25 = i23;
                            int i26 = fVar.f35691c;
                            int i27 = fVar.f35690b;
                            k0 k0Var = (k0) map2.get(obj8);
                            if (k0Var != null) {
                                arrayList.add(new j3.f(k0Var.f51081a, i27, i26));
                                arrayList2.add(new j3.f(k0Var.f51082b, i27, i26));
                            }
                            i23 = i25 + 1;
                            map2 = map;
                            size = i24;
                            listB = list;
                        }
                        lVar = new qy.l(arrayList, arrayList2);
                    }
                } else {
                    lVar = f.f51025a;
                }
                b1Var = null;
            } else {
                b1Var = null;
                lVar = new qy.l(null, null);
            }
            List list2 = (List) lVar.f48495a;
            List list3 = (List) lVar.f48496b;
            if (z11) {
                r11.d0(146338668);
                Object objQ4 = r11.Q();
                if (objQ4 == gVar2) {
                    obj4 = objQ4;
                    l1.k1 k1VarB = l1.t.B(b1Var);
                    r11.o0(k1VarB);
                    obj4 = k1VarB;
                }
                obj4 = objQ4;
                r11.p(false);
                b1Var2 = (l1.b1) obj4;
            } else {
                r11.d0(146426428);
                r11.p(false);
                b1Var2 = b1Var;
            }
            if (z11) {
                r11.d0(146519677);
                boolean zF2 = r11.f(b1Var2);
                Object objQ5 = r11.Q();
                if (zF2 || objQ5 == gVar2) {
                    obj3 = objQ5;
                    mt.p pVar = new mt.p(19, b1Var2);
                    r11.o0(pVar);
                    obj3 = pVar;
                }
                r11.p(false);
                r19 = (fz.c) obj3;
            } else {
                r11.d0(146591100);
                r11.p(false);
                r19 = b1Var;
            }
            int i28 = (i21 >> 3) & 14;
            l1.b1 b1Var3 = b1Var2;
            t.a(hVar, y0Var, hVar2, list2, r11, ((i21 >> 12) & 112) | i28 | ((i22 << 6) & 896));
            j3.h hVar3 = (j3.h) aVar2.invoke();
            boolean zH = r11.h(r9) | ((i21 & 896) == 256);
            Object objQ6 = r11.Q();
            Object obj9 = objQ6;
            if (zH || objQ6 == gVar2) {
                o oVar = new o(r9, cVar, 0);
                r11.o0(oVar);
                obj9 = oVar;
            }
            fz.c cVar4 = (fz.c) obj9;
            int i29 = 2;
            z1.r rVarZ = z(rVar, hVar3, y0Var, cVar4, i11, z12, i12, i13, hVar2, list2, r19, yVar, cVar2, gVar);
            if (z11) {
                r11.d0(147947537);
                boolean zH2 = r11.h(r9);
                Object objQ7 = r11.Q();
                if (zH2 || objQ7 == gVar2) {
                    obj = objQ7;
                    p pVar2 = new p(r9, 1);
                    r11.o0(pVar2);
                    obj = pVar2;
                }
                fz.a aVar3 = (fz.a) obj;
                boolean zF3 = r11.f(b1Var3);
                Object objQ8 = r11.Q();
                Object obj10 = objQ8;
                if (zF3 || objQ8 == gVar2) {
                    pr.z zVar = new pr.z(5, b1Var3);
                    r11.o0(zVar);
                    obj10 = zVar;
                }
                r1Var = new r1(0, aVar3, (fz.a) obj10);
                r11.p(false);
            } else {
                r11.d0(147770775);
                boolean zH3 = r11.h(r9);
                Object objQ9 = r11.Q();
                if (zH3 || objQ9 == gVar2) {
                    z14 = false;
                    p pVar3 = new p(r9, false ? 1 : 0);
                    r11.o0(pVar3);
                    obj2 = pVar3;
                } else {
                    z14 = false;
                    obj2 = objQ9;
                }
                r1Var = new n8((fz.a) obj2, i29);
                r11.p(z14);
            }
            int iHashCode = Long.hashCode(r11.T);
            l1.q1 q1VarL = r11.l();
            z1.r rVarC = z1.a.c(r11, rVarZ);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            r11.h0();
            if (r11.S) {
                r11.k(iVar);
            } else {
                r11.r0();
            }
            l1.t.J(y2.j.f56917f, r1Var, r11);
            l1.t.J(y2.j.f56916e, q1VarL, r11);
            y2.h hVar4 = y2.j.f56918g;
            if (r11.S || !kotlin.jvm.internal.m.a(r11.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, r11, iHashCode, hVar4);
            }
            l1.t.J(y2.j.f56915d, rVarC, r11);
            if (r9 == 0) {
                r11.d0(-433557001);
                z13 = false;
            } else {
                z13 = false;
                r11.d0(-291080374);
                r9.a(r11, 0);
            }
            r11.p(z13);
            if (list3 == null) {
                r11.d0(-433506223);
            } else {
                r11.d0(-433506222);
                f.a(hVar, list3, r11, i28);
            }
            r11.p(z13);
            r11.p(true);
        } else {
            r11.W();
        }
        x1 x1VarT = r11.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: s0.q
                @Override // fz.e
                public final Object invoke(Object obj11, Object obj12) {
                    ((Integer) obj12).getClass();
                    int iM = l1.t.M(i14 | 1);
                    int iM2 = l1.t.M(i15);
                    o0.i(rVar, hVar, cVar, z11, map, y0Var, i11, z12, i12, i13, hVar2, yVar, cVar2, gVar, (l1.n) obj11, iM, iM2);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void j(d1.z0 z0Var, boolean z11, l1.n nVar, int i11) {
        o1 o1VarD;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(626339208);
        int i12 = (sVar.h(z0Var) ? 4 : 2) | i11 | (sVar.g(z11) ? 32 : 16);
        if (!sVar.T(i12 & 1, (i12 & 19) != 18)) {
            sVar.W();
        } else if (z11) {
            sVar.d0(1529773841);
            s0 s0Var = z0Var.f23040d;
            j3.u0 u0Var = null;
            if (s0Var != null && (o1VarD = s0Var.d()) != null) {
                j3.u0 u0Var2 = o1VarD.f51124a;
                s0 s0Var2 = z0Var.f23040d;
                if (!(s0Var2 != null ? s0Var2.f51180p : true)) {
                    u0Var = u0Var2;
                }
            }
            if (u0Var == null) {
                sVar.d0(1530097387);
            } else {
                sVar.d0(1530097388);
                if (j3.x0.c(z0Var.m().f44705b)) {
                    sVar.d0(2110860558);
                    sVar.p(false);
                } else {
                    sVar.d0(2109807302);
                    int iS = z0Var.f23038b.s((int) (z0Var.m().f44705b >> 32));
                    int iS2 = z0Var.f23038b.s((int) (z0Var.m().f44705b & 4294967295L));
                    u3.j jVarA = u0Var.a(iS);
                    u3.j jVarA2 = u0Var.a(Math.max(iS2 - 1, 0));
                    s0 s0Var3 = z0Var.f23040d;
                    if (s0Var3 == null || !((Boolean) s0Var3.m.getValue()).booleanValue()) {
                        sVar.d0(2110490542);
                        sVar.p(false);
                    } else {
                        sVar.d0(2110225306);
                        ve.i.f(true, jVarA, z0Var, sVar, ((i12 << 6) & 896) | 6);
                        sVar.p(false);
                    }
                    s0 s0Var4 = z0Var.f23040d;
                    if (s0Var4 == null || !((Boolean) s0Var4.f51178n.getValue()).booleanValue()) {
                        sVar.d0(2110838734);
                        sVar.p(false);
                    } else {
                        sVar.d0(2110574459);
                        ve.i.f(false, jVarA2, z0Var, sVar, ((i12 << 6) & 896) | 6);
                        sVar.p(false);
                    }
                    sVar.p(false);
                }
                s0 s0Var5 = z0Var.f23040d;
                if (s0Var5 != null) {
                    l1.k1 k1Var = s0Var5.f51177l;
                    if (!kotlin.jvm.internal.m.a(z0Var.f23056u.f44704a.f35700b, z0Var.m().f44704a.f35700b)) {
                        k1Var.setValue(Boolean.FALSE);
                    }
                    if (s0Var5.b()) {
                        if (((Boolean) k1Var.getValue()).booleanValue()) {
                            z0Var.q();
                        } else {
                            z0Var.n();
                        }
                    }
                }
            }
            sVar.p(false);
            sVar.p(false);
        } else {
            sVar.d0(1989076778);
            sVar.p(false);
            z0Var.n();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new dt.g0(z0Var, z11, i11, 3);
        }
    }

    public static final void k(d1.z0 z0Var, l1.n nVar, int i11) {
        j3.h hVarL;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1436003720);
        int i12 = (sVar.h(z0Var) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            s0 s0Var = z0Var.f23040d;
            if (s0Var == null || !((Boolean) s0Var.f51179o.getValue()).booleanValue() || (hVarL = z0Var.l()) == null || hVarL.f35700b.length() <= 0) {
                sVar.d0(-2111021718);
                sVar.p(false);
            } else {
                sVar.d0(-2112330600);
                boolean zF = sVar.f(z0Var);
                Object objQ = sVar.Q();
                l1.g gVar = l1.m.f39353a;
                if (zF || objQ == gVar) {
                    objQ = new d1.t0(z0Var);
                    sVar.o0(objQ);
                }
                a1 a1Var = (a1) objQ;
                v3.c cVar = (v3.c) sVar.j(z2.g1.f58547h);
                o3.p pVar = z0Var.f23038b;
                long j11 = z0Var.m().f44705b;
                int i13 = j3.x0.f35822c;
                int iS = pVar.s((int) (j11 >> 32));
                s0 s0Var2 = z0Var.f23040d;
                o1 o1VarD = s0Var2 != null ? s0Var2.d() : null;
                kotlin.jvm.internal.m.c(o1VarD);
                j3.u0 u0Var = o1VarD.f51124a;
                f2.c cVarC = u0Var.c(hz.b.l(iS, 0, u0Var.f35797a.f35784a.f35700b.length()));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((cVar.e0(c1.f51011a) / 2) + cVarC.f26572a)) << 32) | (((long) Float.floatToRawIntBits(cVarC.f26575d)) & 4294967295L);
                boolean zE = sVar.e(jFloatToRawIntBits);
                Object objQ2 = sVar.Q();
                if (zE || objQ2 == gVar) {
                    objQ2 = new d0(jFloatToRawIntBits);
                    sVar.o0(objQ2);
                }
                d1.l lVar = (d1.l) objQ2;
                boolean zH = sVar.h(a1Var) | sVar.h(z0Var);
                Object objQ3 = sVar.Q();
                if (zH || objQ3 == gVar) {
                    objQ3 = new bp.s0(3, a1Var, z0Var);
                    sVar.o0(objQ3);
                }
                z1.r rVarA = s2.g0.a(z1.o.f58481a, a1Var, (PointerInputEventHandler) objQ3);
                boolean zE2 = sVar.e(jFloatToRawIntBits);
                Object objQ4 = sVar.Q();
                if (zE2 || objQ4 == gVar) {
                    objQ4 = new au.o(jFloatToRawIntBits, 21);
                    sVar.o0(objQ4);
                }
                d.a(lVar, g3.r.b(rVarA, false, (fz.c) objQ4), 0L, sVar, 0);
                sVar.p(false);
            }
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new mt.r(z0Var, i11, 13);
        }
    }

    public static final f2.c l(w2.f1 f1Var, int i11, o3.d0 d0Var, j3.u0 u0Var, boolean z11, int i12) {
        f2.c cVarC = u0Var != null ? u0Var.c(d0Var.f44671b.s(i11)) : f2.c.f26571e;
        float f5 = cVarC.f26572a;
        int iN0 = f1Var.n0(c1.f51011a);
        return new f2.c(z11 ? (i12 - f5) - iN0 : f5, cVarC.f26573b, z11 ? i12 - f5 : iN0 + f5, cVarC.f26575d);
    }

    public static final boolean m(int i11, KeyEvent keyEvent) {
        return ((int) (q2.c.b(keyEvent) >> 32)) == i11;
    }

    public static final ArrayList n(List list, fz.a aVar) {
        b.a aVar2;
        if (!((Boolean) aVar.invoke()).booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            w2.p0 p0Var = (w2.p0) list.get(i11);
            Object objG = p0Var.G();
            kotlin.jvm.internal.m.d(objG, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier");
            com.google.android.datatransport.runtime.scheduling.jobscheduling.e eVar = ((s1) objG).f51191a;
            q1 q1Var = (q1) eVar.f8173b;
            j3.f fVar = (j3.f) eVar.f8174c;
            j3.u0 u0Var = (j3.u0) q1Var.f51143a.getValue();
            if (u0Var == null) {
                aVar2 = new b.a(0, 0, new m9(5));
            } else {
                j3.f fVarC = q1.c(fVar, u0Var);
                if (fVarC == null) {
                    aVar2 = new b.a(0, 0, new m9(6));
                } else {
                    v3.k kVarA = fb.g0.A(u0Var.i(fVarC.f35690b, fVarC.f35691c).e());
                    aVar2 = new b.a(kVarA.d(), kVarA.b(), new u(kVarA, 2));
                }
            }
            int i12 = aVar2.f3413a;
            int i13 = aVar2.f3414b;
            arrayList.add(new qy.l(p0Var.B(com.bumptech.glide.f.q(i12, i12, i13, i13)), (fz.a) aVar2.f3415c));
        }
        return arrayList;
    }

    public static final void o(j3.e eVar, String str, String str2) {
        if (str2.length() <= 0) {
            i0.a.a("alternateText can't be an empty string.");
        }
        eVar.h("androidx.compose.foundation.text.inlineContent", str);
        eVar.d(str2);
        eVar.e();
    }

    public static final int p(float f5) {
        return Math.round((float) Math.ceil(f5));
    }

    public static final void q(s0 s0Var) {
        o3.c0 c0Var = s0Var.f51170e;
        if (c0Var != null) {
            s0Var.f51186v.invoke(o3.w.a((o3.w) s0Var.f51169d.f44799b, null, 0L, 3));
            o3.x xVar = c0Var.f44668a;
            AtomicReference atomicReference = xVar.f44708b;
            while (!atomicReference.compareAndSet(c0Var, null)) {
                if (atomicReference.get() != c0Var) {
                }
            }
            xVar.f44707a.d();
        }
        s0Var.f51170e = null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.text.BreakIterator] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, qp.m3] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final int r(int i11, String str) {
        ?? r9;
        ?? r11;
        int spanEnd;
        v5.j jVarV = v();
        Integer num = null;
        if (jVarV != null) {
            if (!(jVarV.c() == 1)) {
                throw new IllegalStateException("Not initialized yet");
            }
            ns.o.l(str, "charSequence cannot be null");
            ?? r12 = (m3) jVarV.f53530e.f7467b;
            r12.getClass();
            if (i11 < 0 || i11 >= str.length()) {
                r11 = str;
                spanEnd = -1;
            } else if (str instanceof Spanned) {
                Spanned spanned = (Spanned) str;
                v5.w[] wVarArr = (v5.w[]) spanned.getSpans(i11, i11 + 1, v5.w.class);
                if (wVarArr.length > 0) {
                    spanEnd = spanned.getSpanEnd(wVarArr[0]);
                    r11 = str;
                } else {
                    ?? r13 = str;
                    spanEnd = ((v5.o) r12.i(r13, Math.max(0, i11 - 16), Math.min(str.length(), i11 + 16), Integer.MAX_VALUE, true, new v5.o(i11))).f53540c;
                    r11 = r13;
                }
            } else {
                ?? r14 = str;
                spanEnd = ((v5.o) r12.i(r14, Math.max(0, i11 - 16), Math.min(str.length(), i11 + 16), Integer.MAX_VALUE, true, new v5.o(i11))).f53540c;
                r11 = r14;
            }
            Integer numValueOf = Integer.valueOf(spanEnd);
            r9 = r11;
            if (spanEnd != -1) {
                num = numValueOf;
            }
        } else {
            r9 = str;
        }
        if (num != null) {
            r9 = r11;
            return num.intValue();
        }
        r9 = r11;
        ?? characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(r9);
        return characterInstance.following(i11);
    }

    public static final int s(CharSequence charSequence, int i11) {
        int length = charSequence.length();
        while (i11 < length) {
            if (charSequence.charAt(i11) == '\n') {
                return i11;
            }
            i11++;
        }
        return charSequence.length();
    }

    public static final int t(CharSequence charSequence, int i11) {
        while (i11 > 0) {
            if (charSequence.charAt(i11 - 1) == '\n') {
                return i11;
            }
            i11--;
        }
        return 0;
    }

    public static final int u(int i11, String str) {
        v5.j jVarV = v();
        Integer num = null;
        if (jVarV != null) {
            Integer numValueOf = Integer.valueOf(jVarV.b(str, Math.max(0, i11 - 1)));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i11);
    }

    public static final v5.j v() {
        if (!v5.j.d()) {
            return null;
        }
        v5.j jVarA = v5.j.a();
        if (jVarA.c() == 1) {
            return jVarA;
        }
        return null;
    }

    public static final void w(s0 s0Var, o3.w wVar, o3.p pVar) {
        x1.f fVarN = re.q.n();
        fz.c cVarE = fVarN != null ? fVarN.e() : null;
        x1.f fVarR = re.q.r(fVarN);
        try {
            o1 o1VarD = s0Var.d();
            if (o1VarD == null) {
                return;
            }
            o3.c0 c0Var = s0Var.f51170e;
            if (c0Var == null) {
                return;
            }
            w2.x xVarC = s0Var.c();
            if (xVarC == null) {
                return;
            }
            x(wVar, s0Var.f51166a, o1VarD.f51124a, xVarC, c0Var, s0Var.b(), pVar);
        } finally {
            re.q.t(fVarN, fVarR, cVarE);
        }
    }

    public static void x(o3.w wVar, z0 z0Var, j3.u0 u0Var, w2.x xVar, o3.c0 c0Var, boolean z11, o3.p pVar) {
        f2.c cVarB;
        if (z11) {
            int iS = pVar.s(j3.x0.e(wVar.f44705b));
            String str = d1.f51015a;
            if (iS < u0Var.f35797a.f35784a.f35700b.length()) {
                cVarB = u0Var.b(iS);
            } else {
                cVarB = iS != 0 ? u0Var.b(iS - 1) : new f2.c(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, (int) (d1.a(z0Var.f51267b, z0Var.f51272g, z0Var.f51273h, d1.f51015a, 1) & 4294967295L));
            }
            float f5 = cVarB.f26573b;
            float f11 = cVarB.f26572a;
            long jP = xVar.P((((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L));
            f2.c cVarE = com.bumptech.glide.e.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jP & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jP >> 32)))) << 32), (((long) Float.floatToRawIntBits(cVarB.f26574c - f11)) << 32) | (((long) Float.floatToRawIntBits(cVarB.f26575d - f5)) & 4294967295L));
            if (kotlin.jvm.internal.m.a((o3.c0) c0Var.f44668a.f44708b.get(), c0Var)) {
                c0Var.f44669b.b(cVarE);
            }
        }
    }

    public static final void y(o3.x xVar, s0 s0Var, o3.w wVar, o3.j jVar, o3.p pVar) {
        ob.c cVar = s0Var.f51169d;
        w wVar2 = s0Var.f51186v;
        w wVar3 = s0Var.f51187w;
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        pr.a0 a0Var = new pr.a0(cVar, wVar2, yVar, 19);
        o3.r rVar = xVar.f44707a;
        rVar.e(wVar, jVar, a0Var, wVar3);
        o3.c0 c0Var = new o3.c0(xVar, rVar);
        xVar.f44708b.set(c0Var);
        yVar.f38361a = c0Var;
        s0Var.f51170e = c0Var;
        w(s0Var, wVar, pVar);
    }

    public static final z1.r z(z1.r rVar, j3.h hVar, j3.y0 y0Var, fz.c cVar, int i11, boolean z11, int i12, int i13, n3.h hVar2, List list, fz.c cVar2, g2.y yVar, fz.c cVar3, g gVar) {
        return rVar.i(z1.o.f58481a).i(new c1.h(hVar, y0Var, hVar2, cVar, i11, z11, i12, i13, list, cVar2, yVar, gVar, cVar3));
    }
}
