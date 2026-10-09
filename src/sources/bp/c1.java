package bp;

import com.lingo.lingoskill.object.LocateLanguageItem;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import h1.k7;
import h1.ua;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c1 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fz.c f4513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocateLanguageItem f4514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f4516d;

    public c1(fz.c cVar, LocateLanguageItem locateLanguageItem, ArrayList arrayList, boolean z11) {
        this.f4513a = cVar;
        this.f4514b = locateLanguageItem;
        this.f4515c = arrayList;
        this.f4516d = z11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        boolean z11;
        long j11;
        boolean z12;
        l1.n nVar = (l1.n) obj;
        int iIntValue = ((Number) obj2).intValue();
        l1.s sVar = (l1.s) nVar;
        if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarE = j0.e2.e(oVar, 1.0f);
            fz.c cVar = this.f4513a;
            boolean zF = sVar.f(cVar);
            LocateLanguageItem locateLanguageItem = this.f4514b;
            boolean zH = zF | sVar.h(locateLanguageItem);
            Object objQ = sVar.Q();
            if (zH || objQ == l1.m.f39353a) {
                objQ = new b1(0, cVar, locateLanguageItem);
                sVar.o0(objQ);
            }
            float f5 = 12;
            float f11 = 8;
            z1.r rVarB = j0.c.B(d0.n.o(rVarE, false, null, (fz.a) objQ, 15), f11, f5);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarB);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, a2VarA, sVar);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            boolean z13 = this.f4516d;
            float f12 = 4;
            z1.r rVarP = j0.e2.p(d2.h.a(oVar, z13 ? 1.0f : CropImageView.DEFAULT_ASPECT_RATIO), f12, 26);
            l1.c3 c3Var = h1.v1.f31180a;
            j0.c.g(sVar, d0.n.h(rVarP, ((h1.s1) sVar.j(c3Var)).f31017a, r0.f.d(f12)));
            z1.r rVarN = j0.e2.n(j0.c.E(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 36);
            w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarN);
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
            d0.n.c(se.k.y(R.drawable.ic_locate_lan_bg, sVar, 0), null, j0.e2.d(oVar, 1.0f), null, w2.i.f54515b, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 25016, 104);
            String upperCase = locateLanguageItem.getLocate().toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.m.e(upperCase, "toUpperCase(...)");
            long jS = ob.f.s((h1.s1) sVar.j(c3Var), sVar);
            long jA = fr.j3.A(14);
            n3.s sVar2 = n3.s.L;
            ua.b(upperCase, null, jS, jA, null, sVar2, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 199680, 0, 131026);
            sVar.p(true);
            String title = locateLanguageItem.getTitle();
            if (!z13) {
                sVar2 = n3.s.f43178t;
            }
            if (z13) {
                sVar.d0(235361972);
                j11 = ((h1.s1) sVar.j(c3Var)).f31017a;
                z11 = false;
            } else {
                z11 = false;
                sVar.d0(235363222);
                j11 = ((h1.s1) sVar.j(c3Var)).f31034q;
            }
            sVar.p(z11);
            long j12 = j11;
            z1.r rVarC3 = j0.c.C(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            ua.b(title, w4.c.p(1.0f, true, rVarC3), j12, 0L, null, sVar2, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 0, 0, 131032);
            sVar.p(true);
            ArrayList arrayList = this.f4515c;
            if (ns.o.A(arrayList) != arrayList.indexOf(locateLanguageItem)) {
                sVar.d0(841379964);
                k7.g(null, (float) 0.5d, 0L, sVar, 48, 5);
                z12 = false;
            } else {
                z12 = false;
                sVar.d0(810637977);
            }
            sVar.p(z12);
        } else {
            sVar.W();
        }
        return qy.b0.f48488a;
    }
}
