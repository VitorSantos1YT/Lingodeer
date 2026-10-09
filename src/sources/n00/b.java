package n00;

import a.ar.MFeWs;
import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.y;
import m00.a0;
import m00.d0;
import m00.g0;
import oz.q;
import qx.p;
import qy.b0;
import qy.l;
import ry.m;
import ry.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f43059a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f43060b = new byte[0];

    public static final int a(char c11) {
        if ('0' <= c11 && c11 < ':') {
            return c11 - '0';
        }
        if ('a' <= c11 && c11 < 'g') {
            return c11 - 'W';
        }
        if ('A' <= c11 && c11 < 'G') {
            return c11 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c11);
    }

    public static final LinkedHashMap b(ArrayList arrayList) {
        String str = a0.f40673b;
        a0 a0VarM = p20.c.m("/");
        LinkedHashMap linkedHashMapA0 = x.a0(new l(a0VarM, new g(a0VarM, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532)));
        for (g gVar : m.S0(arrayList, new gu.g(6))) {
            if (((g) linkedHashMapA0.put(gVar.f43073a, gVar)) == null) {
                while (true) {
                    a0 a0Var = gVar.f43073a;
                    a0 a0VarB = a0Var.b();
                    if (a0VarB == null) {
                        break;
                    }
                    g gVar2 = (g) linkedHashMapA0.get(a0VarB);
                    if (gVar2 != null) {
                        gVar2.f43088q.add(a0Var);
                        break;
                    }
                    g gVar3 = new g(a0VarB, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                    linkedHashMapA0.put(a0VarB, gVar3);
                    gVar3.f43088q.add(a0Var);
                    gVar = gVar3;
                }
            }
        }
        return linkedHashMapA0;
    }

    public static final String c(int i11) {
        p.k(16);
        String string = Integer.toString(i11, 16);
        kotlin.jvm.internal.m.e(string, "toString(...)");
        return "0x".concat(string);
    }

    public static final g d(final d0 d0Var) throws IOException {
        int iD = d0Var.d();
        if (iD != 33639248) {
            throw new IOException("bad zip: expected " + c(33639248) + " but was " + c(iD));
        }
        d0Var.skip(4L);
        short sF = d0Var.f();
        int i11 = sF & 65535;
        if ((sF & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i11));
        }
        int iF = d0Var.f() & 65535;
        int iF2 = d0Var.f() & 65535;
        int iF3 = d0Var.f() & 65535;
        long jD = ((long) d0Var.d()) & 4294967295L;
        final kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
        xVar.f38360a = ((long) d0Var.d()) & 4294967295L;
        final kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
        xVar2.f38360a = ((long) d0Var.d()) & 4294967295L;
        int iF4 = d0Var.f() & 65535;
        int iF5 = d0Var.f() & 65535;
        int iF6 = 65535 & d0Var.f();
        d0Var.skip(8L);
        final kotlin.jvm.internal.x xVar3 = new kotlin.jvm.internal.x();
        xVar3.f38360a = ((long) d0Var.d()) & 4294967295L;
        String strH = d0Var.h(iF4);
        if (q.w0(strH, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        final long j11 = xVar2.f38360a == 4294967295L ? 8 : 0L;
        if (xVar.f38360a == 4294967295L) {
            j11 += (long) 8;
        }
        if (xVar3.f38360a == 4294967295L) {
            j11 += (long) 8;
        }
        final y yVar = new y();
        final y yVar2 = new y();
        final y yVar3 = new y();
        final u uVar = new u();
        e(d0Var, iF5, new fz.e() { // from class: n00.i
            @Override // fz.e
            public final Object invoke(Object obj, Object obj2) throws IOException {
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                d0 d0Var2 = d0Var;
                if (iIntValue == 1) {
                    u uVar2 = uVar;
                    if (uVar2.f38357a) {
                        throw new IOException("bad zip: zip64 extra repeated");
                    }
                    uVar2.f38357a = true;
                    if (jLongValue < j11) {
                        throw new IOException("bad zip: zip64 extra too short");
                    }
                    kotlin.jvm.internal.x xVar4 = xVar2;
                    long jE = xVar4.f38360a;
                    if (jE == 4294967295L) {
                        jE = d0Var2.e();
                    }
                    xVar4.f38360a = jE;
                    kotlin.jvm.internal.x xVar5 = xVar;
                    xVar5.f38360a = xVar5.f38360a == 4294967295L ? d0Var2.e() : 0L;
                    kotlin.jvm.internal.x xVar6 = xVar3;
                    xVar6.f38360a = xVar6.f38360a == 4294967295L ? d0Var2.e() : 0L;
                } else if (iIntValue == 10) {
                    if (jLongValue < 4) {
                        throw new IOException(MFeWs.BxmVzvrRzCXsO);
                    }
                    d0Var2.skip(4L);
                    b.e(d0Var2, (int) (jLongValue - 4), new h(yVar, d0Var2, yVar2, yVar3));
                }
                return b0.f48488a;
            }
        });
        if (j11 > 0 && !uVar.f38357a) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String strH2 = d0Var.h(iF6);
        String str = a0.f40673b;
        return new g(p20.c.m("/").e(strH), oz.x.k0(strH, "/", false), strH2, jD, xVar.f38360a, xVar2.f38360a, iF, xVar3.f38360a, iF3, iF2, (Long) yVar.f38361a, (Long) yVar2.f38361a, (Long) yVar3.f38361a, 57344);
    }

    public static final void e(d0 d0Var, int i11, fz.e eVar) throws IOException {
        m00.i iVar = d0Var.f40691b;
        long j11 = i11;
        while (j11 != 0) {
            if (j11 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iF = d0Var.f() & 65535;
            long jF = ((long) d0Var.f()) & 65535;
            long j12 = j11 - ((long) 4);
            if (j12 < jF) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            d0Var.s1(jF);
            long j13 = iVar.f40718b;
            eVar.invoke(Integer.valueOf(iF), Long.valueOf(jF));
            long j14 = (iVar.f40718b + jF) - j13;
            if (j14 < 0) {
                throw new IOException(nv.p.j(iF, "unsupported zip: too many bytes processed for "));
            }
            if (j14 > 0) {
                iVar.skip(j14);
            }
            j11 = j12 - jF;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0027  */
    public static final int g(g0 g0Var, int i11) {
        int i12;
        int[] iArr = g0Var.f40714f;
        int i13 = i11 + 1;
        int length = g0Var.f40713e.length;
        kotlin.jvm.internal.m.f(iArr, "<this>");
        int i14 = length - 1;
        int i15 = 0;
        while (i15 <= i14) {
            i12 = (i15 + i14) >>> 1;
            int i16 = iArr[i12];
            if (i16 < i13) {
                i15 = i12 + 1;
            } else {
                if (i16 <= i13) {
                    if (i12 >= 0) {
                        return i12;
                    }
                    return ~i12;
                }
                i14 = i12 - 1;
            }
        }
        i12 = (-i15) - 1;
        if (i12 >= 0) {
            return i12;
        }
        return ~i12;
    }

    public static final g f(d0 d0Var, g gVar) throws IOException {
        int iD = d0Var.d();
        if (iD != 67324752) {
            throw new IOException("bad zip: expected " + c(67324752) + MzwEyWCkjXL.mNXpXTKDsGs + c(iD));
        }
        d0Var.skip(2L);
        short sF = d0Var.f();
        int i11 = sF & 65535;
        if ((sF & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i11));
        }
        d0Var.skip(18L);
        long jF = ((long) d0Var.f()) & 65535;
        int iF = d0Var.f() & 65535;
        d0Var.skip(jF);
        if (gVar == null) {
            d0Var.skip(iF);
            return null;
        }
        y yVar = new y();
        y yVar2 = new y();
        y yVar3 = new y();
        e(d0Var, iF, new h(d0Var, yVar, yVar2, yVar3));
        return new g(gVar.f43073a, gVar.f43074b, gVar.f43075c, gVar.f43076d, gVar.f43077e, gVar.f43078f, gVar.f43079g, gVar.f43080h, gVar.f43081i, gVar.f43082j, gVar.f43083k, gVar.f43084l, gVar.m, (Integer) yVar.f38361a, (Integer) yVar2.f38361a, (Integer) yVar3.f38361a);
    }
}
