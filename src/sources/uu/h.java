package uu;

import android.content.res.Resources;
import com.yalantis.ucrop.view.CropImageView;
import fr.p3;
import g2.x;
import h1.bc;
import h1.e0;
import h1.s1;
import h1.v1;
import j0.e2;
import j0.t;
import j0.u;
import kotlin.jvm.internal.m;
import l1.c3;
import l1.n;
import l1.q1;
import l1.s;
import nv.y;
import qy.b0;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements fz.e {
    public final /* synthetic */ fz.a H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53153a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Resources f53154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f53155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.a f53156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.a f53157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fz.a f53158f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ fz.a f53159t;

    public /* synthetic */ h(Resources resources, fz.a aVar, fz.a aVar2, fz.a aVar3, fz.a aVar4, fz.a aVar5, fz.a aVar6) {
        this.f53154b = resources;
        this.f53155c = aVar;
        this.f53156d = aVar2;
        this.f53157e = aVar3;
        this.f53158f = aVar4;
        this.f53159t = aVar5;
        this.H = aVar6;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f53153a;
        b0 b0Var = b0.f48488a;
        switch (i11) {
            case 0:
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (!sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sVar.W();
                } else {
                    o oVar = o.f58481a;
                    r rVarE = e2.e(e2.g(oVar, 340), 1.0f);
                    c3 c3Var = v1.f31180a;
                    j0.o.a(d0.n.g(rVarE, p3.A(ns.o.L(new x(x.c(((s1) sVar.j(c3Var)).f31017a, 0.8f)), new x(x.c(((s1) sVar.j(c3Var)).f31017a, CropImageView.DEFAULT_ASPECT_RATIO)))), null, 6), sVar, 0);
                    r rVarD = e2.d(oVar, 1.0f);
                    u uVarA = t.a(j0.i.f35305c, z1.c.P, sVar, 48);
                    int iHashCode = Long.hashCode(sVar.T);
                    q1 q1VarL = sVar.l();
                    r rVarC = z1.a.c(sVar, rVarD);
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
                    if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar);
                    Resources resources = this.f53154b;
                    t1.d dVarD = t1.e.d(-900710166, new lr.c(resources, 7), sVar);
                    t1.d dVarD2 = t1.e.d(-1689517844, new y(9, this.H), sVar);
                    float f5 = bc.f30055a;
                    e0.a(dVarD, null, dVarD2, null, CropImageView.DEFAULT_ASPECT_RATIO, null, bc.f(x.f28621h, 0L, sVar, 30), sVar, 390, 186);
                    a.f(resources, null, this.f53155c, this.f53156d, this.f53157e, this.f53158f, this.f53159t, sVar, 0);
                    sVar.p(true);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                a.g(this.f53154b, this.f53155c, this.f53156d, this.f53157e, this.f53158f, this.f53159t, this.H, (n) obj, l1.t.M(1));
                break;
        }
        return b0Var;
    }

    public /* synthetic */ h(Resources resources, fz.a aVar, fz.a aVar2, fz.a aVar3, fz.a aVar4, fz.a aVar5, fz.a aVar6, int i11) {
        this.f53154b = resources;
        this.f53155c = aVar;
        this.f53156d = aVar2;
        this.f53157e = aVar3;
        this.f53158f = aVar4;
        this.f53159t = aVar5;
        this.H = aVar6;
    }
}
