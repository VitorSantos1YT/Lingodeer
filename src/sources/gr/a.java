package gr;

import android.content.res.Resources;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import g2.f0;
import h1.ua;
import j0.a2;
import j0.e2;
import j0.z1;
import j3.y0;
import java.util.Iterator;
import java.util.List;
import l1.d0;
import l1.q1;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29657a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f29658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f29659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f29660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f29661e;

    public /* synthetic */ a(Resources resources, long j11, fz.a aVar, fz.a aVar2) {
        this.f29659c = resources;
        this.f29658b = j11;
        this.f29660d = aVar;
        this.f29661e = aVar2;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f29657a) {
            case 0:
                List list = (List) this.f29659c;
                List list2 = (List) this.f29660d;
                List list3 = (List) this.f29661e;
                l0.c item = (l0.c) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item, "$this$item");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    float f5 = 20;
                    z1.r rVarD = j0.c.D(d0.n.h(e2.e(j0.c.C(j0.c.E(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), g2.x.f28621h, r0.f.d(18)), 14, 24, f5, 36);
                    j0.u uVarA = j0.t.a(j0.i.g(32), z1.c.O, sVar, 6);
                    int iHashCode = Long.hashCode(sVar.T);
                    q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(sVar, rVarD);
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
                    Iterator itO = com.google.android.material.datepicker.d.o(sVar, rVarC, y2.j.f56915d, 488743036, list);
                    int i11 = 0;
                    while (itO.hasNext()) {
                        Object next = itO.next();
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            ns.o.V();
                            throw null;
                        }
                        n.c(((Number) list2.get(i11)).intValue(), (String) next, (String) list3.get(i11), this.f29658b, j3.A(20), j3.A(16), sVar, 1769478);
                        i11 = i12;
                    }
                    sVar.p(false);
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                return b0.f48488a;
            default:
                Resources resources = (Resources) this.f29659c;
                fz.a aVar = (fz.a) this.f29660d;
                fz.a aVar2 = (fz.a) this.f29661e;
                l0.c item2 = (l0.c) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(item2, "$this$item");
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    z1.i iVar2 = z1.c.M;
                    j0.e eVar = j0.i.f35307e;
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarE = e2.e(j0.c.C(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 32, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 20, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f);
                    a2 a2VarA = z1.a(eVar, iVar2, sVar2, 54);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    q1 q1VarL2 = sVar2.l();
                    z1.r rVarC2 = z1.a.c(sVar2, rVarE);
                    y2.k.J.getClass();
                    y2.i iVar3 = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar3);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(y2.j.f56917f, a2VarA, sVar2);
                    l1.t.J(y2.j.f56916e, q1VarL2, sVar2);
                    y2.h hVar2 = y2.j.f56918g;
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar2);
                    }
                    l1.t.J(y2.j.f56915d, rVarC2, sVar2);
                    String string = resources.getString(R.string.terms_of_use_login);
                    kotlin.jvm.internal.m.e(string, "getString(...)");
                    d0 d0Var = ua.f31167a;
                    y0 y0Var = (y0) sVar2.j(d0Var);
                    long jA = j3.A(12);
                    long j11 = this.f29658b;
                    u3.l lVar = u3.l.f52752c;
                    y0 y0VarA = y0.a(y0Var, j11, jA, null, null, null, 0L, null, lVar, 0, 0, 0L, null, 16773116);
                    Object objQ = sVar2.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (objQ == gVar) {
                        objQ = com.google.android.material.datepicker.d.f(sVar2);
                    }
                    h0.i iVar4 = (h0.i) objQ;
                    boolean zF = sVar2.f(aVar);
                    Object objQ2 = sVar2.Q();
                    if (zF || objQ2 == gVar) {
                        objQ2 = new et.p(8, aVar);
                        sVar2.o0(objQ2);
                    }
                    ua.b(string, d0.n.n(oVar, iVar4, null, false, null, (fz.a) objQ2, 28), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar2, 0, 0, 65532);
                    j0.c.g(sVar2, d0.n.h(e2.g(e2.s(j0.c.C(oVar, 10, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1), 16), j11, f0.f28556b));
                    String string2 = resources.getString(R.string.privacy_policy_login);
                    kotlin.jvm.internal.m.e(string2, "getString(...)");
                    y0 y0VarA2 = y0.a((y0) sVar2.j(d0Var), j11, j3.A(12), null, null, null, 0L, null, lVar, 0, 0, 0L, null, 16773116);
                    Object objQ3 = sVar2.Q();
                    if (objQ3 == gVar) {
                        objQ3 = com.google.android.material.datepicker.d.f(sVar2);
                    }
                    h0.i iVar5 = (h0.i) objQ3;
                    boolean zF2 = sVar2.f(aVar2);
                    Object objQ4 = sVar2.Q();
                    if (zF2 || objQ4 == gVar) {
                        objQ4 = new et.p(9, aVar2);
                        sVar2.o0(objQ4);
                    }
                    ua.b(string2, d0.n.n(oVar, iVar5, null, false, null, (fz.a) objQ4, 28), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA2, sVar2, 0, 0, 65532);
                    sVar2.p(true);
                    j0.c.g(sVar2, e2.g(j0.c.v(oVar), 120));
                } else {
                    sVar2.W();
                }
                return b0.f48488a;
        }
    }

    public /* synthetic */ a(List list, List list2, List list3, long j11) {
        this.f29659c = list;
        this.f29660d = list2;
        this.f29661e = list3;
        this.f29658b = j11;
    }
}
