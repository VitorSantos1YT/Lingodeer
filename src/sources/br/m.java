package br;

import com.lingodeer.ui.ShareMedalView;
import com.yalantis.ucrop.view.CropImageView;
import h1.i9;
import h1.s1;
import h1.v1;
import hh.p0;
import iv.b1;
import iv.z0;
import j0.e2;
import l1.q1;
import w2.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t1.d f5065b;

    public /* synthetic */ m(t1.d dVar, int i11) {
        this.f5064a = i11;
        this.f5065b = dVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f5064a;
        int i12 = 8;
        qy.b0 b0Var = qy.b0.f48488a;
        t1.d dVar = this.f5065b;
        switch (i11) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (!sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sVar.W();
                } else {
                    dVar.invoke(sVar, 0);
                }
                break;
            case 1:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (!sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    sVar2.W();
                } else {
                    dVar.invoke(sVar2, 0);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                se.p.G(dVar, (l1.n) obj, l1.t.M(7));
                break;
            case 3:
                l1.n nVar3 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar3;
                if (!sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    sVar3.W();
                } else {
                    z1.r rVarE = j0.c.E(e2.e(z1.o.f58481a, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 8, 7);
                    q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    int iHashCode = Long.hashCode(sVar3.T);
                    q1 q1VarL = sVar3.l();
                    z1.r rVarC = z1.a.c(sVar3, rVarE);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar);
                    } else {
                        sVar3.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD, sVar3);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar3);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar3, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar3);
                    p0.x(0, dVar, sVar3, true);
                }
                break;
            case 4:
                l1.n nVar4 = (l1.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                l1.s sVar4 = (l1.s) nVar4;
                if (!sVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    sVar4.W();
                } else {
                    dVar.invoke(sVar4, 0);
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                z0.t(dVar, (l1.n) obj, l1.t.M(7));
                break;
            case 6:
                ((Integer) obj2).getClass();
                b1.e(dVar, (l1.n) obj, l1.t.M(7));
                break;
            case 7:
                l1.n nVar5 = (l1.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                l1.s sVar5 = (l1.s) nVar5;
                if (!sVar5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    sVar5.W();
                } else {
                    i9.a(null, null, ((s1) sVar5.j(v1.f31180a)).f31031n, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(827365515, new m(dVar, i12), sVar5), sVar5, 12582912, 123);
                }
                break;
            case 8:
                l1.n nVar6 = (l1.n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                l1.s sVar6 = (l1.s) nVar6;
                if (!sVar6.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    sVar6.W();
                } else {
                    dVar.invoke(sVar6, 0);
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                km.b1.b(dVar, (l1.n) obj, l1.t.M(7));
                break;
            case 10:
                ((Integer) obj2).getClass();
                n0.l.c(dVar, (l1.n) obj, l1.t.M(7));
                break;
            case 11:
                ((Integer) obj2).getClass();
                tg.u.c(dVar, (l1.n) obj, l1.t.M(7));
                break;
            case 12:
                l1.n nVar7 = (l1.n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                int i13 = ShareMedalView.R;
                l1.s sVar7 = (l1.s) nVar7;
                if (!sVar7.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    sVar7.W();
                } else {
                    dVar.invoke(sVar7, 0);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ug.d.b(dVar, (l1.n) obj, l1.t.M(7));
                break;
        }
        return b0Var;
    }

    public /* synthetic */ m(t1.d dVar, int i11, int i12) {
        this.f5064a = i12;
        this.f5065b = dVar;
    }
}
