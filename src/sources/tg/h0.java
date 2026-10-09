package tg;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import java.util.Map;
import l1.x1;
import rt.m9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l1.d0 f52286a = new l1.d0(new m9(11));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l1.d0 f52287b = new l1.d0(g0.f52281a);

    /* JADX WARN: Code duplicated, block: B:63:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:73:0x0138  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public static final void a(i0 Text, j3.h text, z1.r rVar, fz.c cVar, Map map, l1.n nVar, int i11, int i12) {
        int i13;
        fz.c cVar2;
        Map map2;
        Map map3;
        long jB;
        z1.r rVar2;
        Map map4;
        x1 x1VarT;
        kotlin.jvm.internal.m.f(Text, "$this$Text");
        kotlin.jvm.internal.m.f(text, "text");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(559740240);
        if ((i11 & 6) == 0) {
            i13 = (sVar.f(Text) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar.f(text) ? 32 : 16;
        }
        int i14 = i13 | 384;
        if ((i11 & 3072) == 0) {
            cVar2 = cVar;
            i14 |= sVar.h(cVar2) ? 2048 : 1024;
        } else {
            cVar2 = cVar;
        }
        if ((i11 & 24576) == 0) {
            i14 |= sVar.d(1) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i14 |= sVar.g(true) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i11) == 0) {
            i14 |= sVar.d(Integer.MAX_VALUE) ? 1048576 : 524288;
        }
        int i15 = i12 & 64;
        if (i15 == 0) {
            if ((12582912 & i11) == 0) {
                map2 = map;
                i14 |= sVar.h(map2) ? 8388608 : 4194304;
            }
            if ((4793491 & i14) == 4793490 || !sVar.F()) {
                if (i15 != 0) {
                    map3 = ry.s.f50855a;
                } else {
                    map3 = map2;
                }
                sVar.d0(1165610213);
                jB = d(Text, sVar).b();
                if (jB == 16) {
                    jB = c(Text, sVar);
                }
                long j11 = jB;
                sVar.p(false);
                j3.y0 y0VarA = j3.y0.a(d(Text, sVar), j11, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214);
                int i16 = ((i14 >> 3) & 126) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (3670016 & i14) | ((i14 << 3) & 234881024);
                rVar2 = z1.o.f58481a;
                s0.o0.a(text, rVar2, y0VarA, cVar2, 1, true, Integer.MAX_VALUE, 0, map3, null, null, sVar, i16, 0, 1664);
                map4 = map3;
            } else {
                sVar.W();
                rVar2 = rVar;
                map4 = map2;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new br.n(Text, text, rVar2, cVar, map4, i11, i12, 5);
            }
        }
        i14 |= 12582912;
        map2 = map;
        if ((4793491 & i14) == 4793490) {
            if (i15 != 0) {
                map3 = ry.s.f50855a;
            } else {
                map3 = map2;
            }
            sVar.d0(1165610213);
            jB = d(Text, sVar).b();
            if (jB == 16) {
                jB = c(Text, sVar);
            }
            long j12 = jB;
            sVar.p(false);
            j3.y0 y0VarA2 = j3.y0.a(d(Text, sVar), j12, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214);
            int i17 = ((i14 >> 3) & 126) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (3670016 & i14) | ((i14 << 3) & 234881024);
            rVar2 = z1.o.f58481a;
            s0.o0.a(text, rVar2, y0VarA2, cVar2, 1, true, Integer.MAX_VALUE, 0, map3, null, null, sVar, i17, 0, 1664);
            map4 = map3;
        } else {
            if (i15 != 0) {
                map3 = ry.s.f50855a;
            } else {
                map3 = map2;
            }
            sVar.d0(1165610213);
            jB = d(Text, sVar).b();
            if (jB == 16) {
                jB = c(Text, sVar);
            }
            long j13 = jB;
            sVar.p(false);
            j3.y0 y0VarA3 = j3.y0.a(d(Text, sVar), j13, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214);
            int i18 = ((i14 >> 3) & 126) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (3670016 & i14) | ((i14 << 3) & 234881024);
            rVar2 = z1.o.f58481a;
            s0.o0.a(text, rVar2, y0VarA3, cVar2, 1, true, Integer.MAX_VALUE, 0, map3, null, null, sVar, i18, 0, 1664);
            map4 = map3;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new br.n(Text, text, rVar2, cVar, map4, i11, i12, 5);
        }
    }

    public static final void b(i0 Text, String text, z1.r rVar, fz.c cVar, int i11, boolean z11, int i12, l1.n nVar, int i13) {
        int i14;
        z1.r rVar2;
        fz.c cVar2;
        int i15;
        boolean z12;
        int i16;
        kotlin.jvm.internal.m.f(Text, "$this$Text");
        kotlin.jvm.internal.m.f(text, "text");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1456639868);
        if ((i13 & 6) == 0) {
            i14 = i13 | (sVar.f(Text) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= sVar.f(text) ? 32 : 16;
        }
        int i17 = i14 | 1797504;
        if ((599187 & i17) == 599186 && sVar.F()) {
            sVar.W();
            rVar2 = rVar;
            cVar2 = cVar;
            i15 = i11;
            z12 = z11;
            i16 = i12;
        } else {
            sVar.d0(1165584677);
            Object objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                objQ = new st.a(11);
                sVar.o0(objQ);
            }
            fz.c cVar3 = (fz.c) objQ;
            sVar.p(false);
            sVar.d0(1165589669);
            long jB = d(Text, sVar).b();
            if (jB == 16) {
                jB = c(Text, sVar);
            }
            long j11 = jB;
            sVar.p(false);
            rVar2 = z1.o.f58481a;
            s0.o0.c(text, rVar2, j3.y0.a(d(Text, sVar), j11, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), cVar3, 1, true, Integer.MAX_VALUE, 0, null, null, sVar, ((i17 >> 3) & 126) | (i17 & 7168) | (57344 & i17) | (458752 & i17) | (i17 & 3670016), 896);
            cVar2 = cVar3;
            i15 = 1;
            z12 = true;
            i16 = Integer.MAX_VALUE;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new f0(Text, text, rVar2, cVar2, i15, z12, i16, i13);
        }
    }

    public static final long c(i0 i0Var, l1.n nVar) {
        kotlin.jvm.internal.m.f(i0Var, "<this>");
        l1.s sVar = (l1.s) nVar;
        sVar.d0(-401305534);
        l1.d0 d0Var = n0.f52325a;
        sVar.d0(-730696581);
        fz.e eVar = ((m0) sVar.j(n0.f52325a)).f52322c;
        sVar.p(false);
        long j11 = ((g2.x) eVar.invoke(sVar, 0)).f28624a;
        sVar.p(false);
        return j11;
    }

    public static final j3.y0 d(i0 i0Var, l1.n nVar) {
        kotlin.jvm.internal.m.f(i0Var, "<this>");
        l1.s sVar = (l1.s) nVar;
        sVar.d0(-1652167225);
        l1.d0 d0Var = n0.f52325a;
        sVar.d0(605597993);
        fz.e eVar = ((m0) sVar.j(n0.f52325a)).f52320a;
        sVar.p(false);
        j3.y0 y0Var = (j3.y0) eVar.invoke(sVar, 0);
        sVar.p(false);
        return y0Var;
    }
}
