package es;

import com.lingodeer.R;
import com.lingodeer.data.model.chinesetone.ChineseToneUnit;
import g2.f0;
import j0.e2;
import java.util.ArrayList;
import l1.m;
import l1.n;
import l1.q1;
import l1.s;
import l1.t;
import m0.l;
import qy.b0;
import qy.r;
import w2.q0;
import y2.k;
import z1.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f25790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f25791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f25792c;

    public d(ArrayList arrayList, long j11, fz.c cVar) {
        this.f25790a = arrayList;
        this.f25791b = j11;
        this.f25792c = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ca  */
    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
        long jE;
        int i12;
        l lVar = (l) obj;
        int iIntValue = ((Number) obj2).intValue();
        n nVar = (n) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i11 = (((s) nVar).f(lVar) ? 4 : 2) | iIntValue2;
        } else {
            i11 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i11 |= ((s) nVar).d(iIntValue) ? 32 : 16;
        }
        s sVar = (s) nVar;
        if (sVar.T(i11 & 1, (i11 & 147) != 146)) {
            r rVar = (r) this.f25790a.get(iIntValue);
            sVar.d0(1188753828);
            ChineseToneUnit chineseToneUnit = (ChineseToneUnit) rVar.f48505a;
            int iIntValue3 = ((Number) rVar.f48506b).intValue();
            boolean zBooleanValue = ((Boolean) rVar.f48507c).booleanValue();
            if (iIntValue3 != 0) {
                jE = (iIntValue3 == 1 || iIntValue3 == 2 || iIntValue3 == 3 || iIntValue3 == 4 || iIntValue3 != 5) ? f0.e(4294945792L) : f0.e(4294926848L);
            } else {
                jE = f0.e(4294953984L);
            }
            if (iIntValue3 == 0) {
                i12 = R.drawable.tone_unit_1;
            } else if (iIntValue3 == 1) {
                i12 = R.drawable.tone_unit_2;
            } else if (iIntValue3 == 2) {
                i12 = R.drawable.tone_unit_3;
            } else if (iIntValue3 == 3) {
                i12 = R.drawable.tone_unit_4;
            } else if (iIntValue3 == 4) {
                i12 = R.drawable.tone_unit_5;
            } else if (iIntValue3 != 5) {
                i12 = R.drawable.tone_unit_1;
            } else {
                i12 = R.drawable.tone_unit_6;
            }
            int i13 = i12;
            boolean z11 = this.f25791b == chineseToneUnit.getUnitId();
            l1.g gVar = m.f39353a;
            fz.c cVar = this.f25792c;
            if (zBooleanValue) {
                sVar.d0(1188951545);
                z1.r rVarE = e2.e(o.f58481a, 1.0f);
                q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                int iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL = sVar.l();
                z1.r rVarC = z1.a.c(sVar, rVarE);
                k.J.getClass();
                y2.i iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                t.J(y2.j.f56917f, q0VarD, sVar);
                t.J(y2.j.f56916e, q1VarL, sVar);
                y2.h hVar = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                t.J(y2.j.f56915d, rVarC, sVar);
                String unitName = chineseToneUnit.getUnitName();
                boolean zF = sVar.f(cVar) | sVar.h(chineseToneUnit);
                Object objQ = sVar.Q();
                if (zF || objQ == gVar) {
                    objQ = new b(cVar, chineseToneUnit, 0);
                    sVar.o0(objQ);
                }
                j.a(unitName, jE, i13, (fz.a) objQ, null, z11, sVar, 0);
                sVar.p(true);
                sVar.p(false);
            } else {
                sVar.d0(1189627376);
                String unitName2 = chineseToneUnit.getUnitName();
                boolean zF2 = sVar.f(cVar) | sVar.h(chineseToneUnit);
                Object objQ2 = sVar.Q();
                if (zF2 || objQ2 == gVar) {
                    objQ2 = new b(cVar, chineseToneUnit, 1);
                    sVar.o0(objQ2);
                }
                j.a(unitName2, jE, i13, (fz.a) objQ2, null, z11, sVar, 0);
                sVar.p(false);
            }
            sVar.p(false);
        } else {
            sVar.W();
        }
        return b0.f48488a;
    }
}
