package j3;

import a0.b2;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import qp.o2;
import z2.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f35778a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o2 f35779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o2 f35780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o2 f35781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o2 f35782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o2 f35783f;

    static {
        int i11 = 6;
        f35779b = new o2(i11, new j0(11), new i0(20));
        f35780c = new o2(i11, new j0(12), new i0(21));
        f35781d = new o2(i11, new j0(13), new i0(22));
        f35782e = new o2(i11, new j0(14), new i0(23));
        f35783f = new o2(i11, new j0(15), new i0(24));
    }

    public static b a(String str, y0 y0Var, long j11, v3.c cVar, n3.h hVar, int i11, int i12) {
        ry.r rVar = ry.r.f50854a;
        return new b(new r3.c(str, y0Var, rVar, rVar, hVar, cVar), i11, 1, j11);
    }

    public static final long b(int i11, int i12) {
        if (i11 < 0 || i12 < 0) {
            p3.a.a("start and end cannot be negative. [start: " + i11 + ", end: " + i12 + ']');
        }
        long j11 = (((long) i12) & 4294967295L) | (((long) i11) << 32);
        int i13 = x0.f35822c;
        return j11;
    }

    public static final long c(int i11, long j11) {
        int i12 = x0.f35822c;
        int i13 = (int) (j11 >> 32);
        int i14 = i13 < 0 ? 0 : i13;
        if (i14 > i11) {
            i14 = i11;
        }
        int i15 = (int) (4294967295L & j11);
        int i16 = i15 >= 0 ? i15 : 0;
        if (i16 <= i11) {
            i11 = i16;
        }
        return (i14 == i13 && i11 == i15) ? j11 : b(i14, i11);
    }

    public static void d(i2.d dVar, w0 w0Var, String str, long j11, y0 y0Var) {
        h hVar = new h(str);
        int iRound = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (dVar.d() >> 32)) - Float.intBitsToFloat((int) (j11 >> 32))));
        if (iRound < 0) {
            iRound = 0;
        }
        int iRound2 = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (dVar.d() & 4294967295L)) - Float.intBitsToFloat((int) (j11 & 4294967295L))));
        if (iRound2 < 0) {
            iRound2 = 0;
        }
        u0 u0VarB = w0.b(w0Var, hVar, y0Var, true, Integer.MAX_VALUE, v3.b.a(0, iRound, 0, iRound2), dVar.getLayoutDirection(), dVar, null, 1568);
        xq.c cVarJ0 = dVar.j0();
        long jH = cVarJ0.H();
        cVarJ0.x().e();
        try {
            b2 b2Var = (b2) cVarJ0.f56174b;
            b2Var.r(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
            if (u0VarB.d() && u0VarB.f35797a.f35789f != 3) {
                long j12 = u0VarB.f35799c;
                b2Var.e(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, (int) (j12 >> 32), (int) (j12 & 4294967295L), 1);
            }
            x.i(u0VarB.f35798b, dVar.j0().x(), 0L, null, null, null, 30);
        } finally {
            com.google.android.material.datepicker.d.C(cVarJ0, jH);
        }
    }

    public static final int e(int i11, List list) {
        int i12;
        byte b3;
        int i13 = ((z) ry.m.z0(list)).f35832c;
        if (i11 > ((z) ry.m.z0(list)).f35832c) {
            p3.a.a("Index " + i11 + " should be less or equal than last line's end " + i13);
        }
        int size = list.size() - 1;
        int i14 = 0;
        while (true) {
            if (i14 > size) {
                i12 = -(i14 + 1);
                break;
            }
            i12 = (i14 + size) >>> 1;
            z zVar = (z) list.get(i12);
            if (zVar.f35831b > i11) {
                b3 = 1;
            } else {
                b3 = zVar.f35832c <= i11 ? (byte) -1 : (byte) 0;
            }
            if (b3 >= 0) {
                if (b3 <= 0) {
                    break;
                }
                size = i12 - 1;
            } else {
                i14 = i12 + 1;
            }
        }
        if (i12 >= 0 && i12 < list.size()) {
            return i12;
        }
        StringBuilder sbI = w4.c.i(i12, "Found paragraph index ", " should be in range [0, ");
        sbI.append(list.size());
        sbI.append(").\nDebug info: index=");
        sbI.append(i11);
        sbI.append(", paragraphs=[");
        sbI.append(x3.a.a(list, null, new in.c(18), 31));
        sbI.append(']');
        p3.a.a(sbI.toString());
        return i12;
    }

    public static final int f(int i11, List list) {
        byte b3;
        int size = list.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            z zVar = (z) list.get(i13);
            if (zVar.f35833d > i11) {
                b3 = 1;
            } else {
                b3 = zVar.f35834e <= i11 ? (byte) -1 : (byte) 0;
            }
            if (b3 < 0) {
                i12 = i13 + 1;
            } else {
                if (b3 <= 0) {
                    return i13;
                }
                size = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    public static final int g(ArrayList arrayList, float f5) {
        byte b3;
        if (f5 <= CropImageView.DEFAULT_ASPECT_RATIO) {
            return 0;
        }
        if (f5 >= ((z) ry.m.z0(arrayList)).f35836g) {
            return ns.o.A(arrayList);
        }
        int size = arrayList.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            z zVar = (z) arrayList.get(i12);
            if (zVar.f35835f > f5) {
                b3 = 1;
            } else {
                b3 = zVar.f35836g <= f5 ? (byte) -1 : (byte) 0;
            }
            if (b3 < 0) {
                i11 = i12 + 1;
            } else {
                if (b3 <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final void h(ArrayList arrayList, long j11, fz.c cVar) {
        int size = arrayList.size();
        for (int iE = e(x0.f(j11), arrayList); iE < size; iE++) {
            z zVar = (z) arrayList.get(iE);
            if (zVar.f35831b >= x0.e(j11)) {
                return;
            }
            if (zVar.f35831b != zVar.f35832c) {
                cVar.invoke(zVar);
            }
        }
    }

    public static final w0 i(l1.n nVar) {
        l1.s sVar = (l1.s) nVar;
        n3.h hVar = (n3.h) sVar.j(g1.f58550k);
        v3.c cVar = (v3.c) sVar.j(g1.f58547h);
        v3.m mVar = (v3.m) sVar.j(g1.f58552n);
        boolean zF = sVar.f(hVar) | sVar.f(cVar) | sVar.d(mVar.ordinal()) | sVar.d(8);
        Object objQ = sVar.Q();
        if (zF || objQ == l1.m.f39353a) {
            objQ = new w0(hVar, cVar, mVar);
            sVar.o0(objQ);
        }
        return (w0) objQ;
    }

    public static final y0 j(y0 y0Var, v3.m mVar) {
        p0 p0Var = y0Var.f35827a;
        u3.o oVar = q0.f35773d;
        u3.o oVar2 = p0Var.f35754a;
        if (oVar2.equals(u3.n.f52756a)) {
            oVar2 = q0.f35773d;
        }
        u3.o oVar3 = oVar2;
        long j11 = p0Var.f35755b;
        v3.p[] pVarArr = v3.o.f53500b;
        if ((j11 & 1095216660480L) == 0) {
            j11 = q0.f35770a;
        }
        long j12 = j11;
        n3.s sVar = p0Var.f35756c;
        if (sVar == null) {
            sVar = n3.s.f43178t;
        }
        n3.s sVar2 = sVar;
        n3.o oVar4 = p0Var.f35757d;
        n3.o oVar5 = new n3.o(oVar4 != null ? oVar4.f43170a : 0);
        n3.p pVar = p0Var.f35758e;
        n3.p pVar2 = new n3.p(pVar != null ? pVar.f43171a : 65535);
        n3.i iVar = p0Var.f35759f;
        if (iVar == null) {
            iVar = n3.i.f43153a;
        }
        n3.i iVar2 = iVar;
        String str = p0Var.f35760g;
        if (str == null) {
            str = BuildConfig.VERSION_NAME;
        }
        String str2 = str;
        long j13 = p0Var.f35761h;
        if ((j13 & 1095216660480L) == 0) {
            j13 = q0.f35771b;
        }
        long j14 = j13;
        u3.a aVar = p0Var.f35762i;
        float f5 = CropImageView.DEFAULT_ASPECT_RATIO;
        float f11 = aVar != null ? aVar.f52733a : 0.0f;
        if (!Float.isNaN(f11)) {
            f5 = f11;
        }
        u3.a aVar2 = new u3.a(f5);
        u3.p pVar3 = p0Var.f35763j;
        if (pVar3 == null) {
            pVar3 = u3.p.f52757c;
        }
        u3.p pVar4 = pVar3;
        q3.b bVarY = p0Var.f35764k;
        if (bVarY == null) {
            q3.b bVar = q3.b.f47418c;
            bVarY = q3.c.f47421a.y();
        }
        q3.b bVar2 = bVarY;
        long j15 = p0Var.f35765l;
        if (j15 == 16) {
            j15 = q0.f35772c;
        }
        long j16 = j15;
        u3.l lVar = p0Var.m;
        if (lVar == null) {
            lVar = u3.l.f52751b;
        }
        u3.l lVar2 = lVar;
        g2.v0 v0Var = p0Var.f35766n;
        if (v0Var == null) {
            v0Var = g2.v0.f28610d;
        }
        g2.v0 v0Var2 = v0Var;
        g0 g0Var = p0Var.f35767o;
        i2.e eVar = p0Var.f35768p;
        if (eVar == null) {
            eVar = i2.g.f34126a;
        }
        p0 p0Var2 = new p0(oVar3, j12, sVar2, oVar5, pVar2, iVar2, str2, j14, aVar2, pVar4, bVar2, j16, lVar2, v0Var2, g0Var, eVar);
        c0 c0Var = y0Var.f35828b;
        int i11 = d0.f35682b;
        int i12 = c0Var.f35668a;
        int i13 = 5;
        if (i12 == 0) {
            i12 = 5;
        }
        int i14 = c0Var.f35669b;
        if (i14 == 3) {
            int i15 = z0.f35837a[mVar.ordinal()];
            if (i15 == 1) {
                i13 = 4;
            } else if (i15 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i14 = i13;
        } else if (i14 == 0) {
            int i16 = z0.f35837a[mVar.ordinal()];
            if (i16 == 1) {
                i14 = 1;
            } else {
                if (i16 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i14 = 2;
            }
        }
        long j17 = c0Var.f35670c;
        if ((j17 & 1095216660480L) == 0) {
            j17 = d0.f35681a;
        }
        u3.q qVar = c0Var.f35671d;
        if (qVar == null) {
            qVar = u3.q.f52760c;
        }
        long j18 = j17;
        f0 f0Var = c0Var.f35672e;
        u3.i iVar3 = c0Var.f35673f;
        int i17 = c0Var.f35674g;
        if (i17 == 0) {
            i17 = u3.e.f52738b;
        }
        int i18 = c0Var.f35675h;
        if (i18 == 0) {
            i18 = 1;
        }
        u3.s sVar3 = c0Var.f35676i;
        if (sVar3 == null) {
            sVar3 = u3.s.f52764c;
        }
        return new y0(p0Var2, new c0(i12, i14, j18, qVar, f0Var, iVar3, i17, i18, sVar3), y0Var.f35829c);
    }
}
