package jr;

import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import g2.v0;
import h1.dc;
import h1.fc;
import h1.k7;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.b2;
import j0.e2;
import j3.p0;
import j3.y0;
import java.util.ArrayList;
import l1.c3;
import l1.q1;
import ys.p2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h0 implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f36634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f36635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.a f36636d;

    public /* synthetic */ h0(int i11, int i12, fz.a aVar, fz.a aVar2) {
        this.f36633a = i12;
        this.f36634b = i11;
        this.f36635c = aVar;
        this.f36636d = aVar2;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f36633a) {
            case 0:
                b2 AppTopAppBar = (b2) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(AppTopAppBar, "$this$AppTopAppBar");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    k2.b bVarY = se.k.y(R.drawable.ic_lesson_setting_btn, sVar, 0);
                    fz.a aVar = this.f36635c;
                    boolean zF = sVar.f(aVar);
                    Object objQ = sVar.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (zF || objQ == gVar) {
                        objQ = new m(10, aVar);
                        sVar.o0(objQ);
                    }
                    z1.o oVar = z1.o.f58481a;
                    d0.n.c(bVarY, null, e2.n(iu.k.q(6, 7, (fz.a) objQ, sVar, oVar, false), 22), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 56, 120);
                    int i11 = this.f36634b;
                    if (i11 != -1) {
                        sVar.d0(-1576604389);
                        j0.c.g(sVar, e2.s(oVar, 8));
                        fz.a aVar2 = this.f36636d;
                        boolean zF2 = sVar.f(aVar2);
                        Object objQ2 = sVar.Q();
                        if (zF2 || objQ2 == gVar) {
                            objQ2 = new m(9, aVar2);
                            sVar.o0(objQ2);
                        }
                        p2.a(i11, 0, (fz.a) objQ2, sVar);
                    } else {
                        sVar.d0(-1583356933);
                    }
                    sVar.p(false);
                    j0.c.g(sVar, e2.s(oVar, 12));
                } else {
                    sVar.W();
                }
                break;
            case 1:
                j0.v ModalBottomSheet = (j0.v) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(ModalBottomSheet, "$this$ModalBottomSheet");
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    float f5 = 16;
                    z1.o oVar2 = z1.o.f58481a;
                    z1.r rVarC = j0.c.C(oVar2, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar2, 48);
                    int iHashCode = Long.hashCode(sVar2.T);
                    q1 q1VarL = sVar2.l();
                    z1.r rVarC2 = z1.a.c(sVar2, rVarC);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA, sVar2);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar2);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC2, sVar2);
                    ku.a.b(this.f36634b, sVar2, 0);
                    d0.n.c(se.k.y(R.drawable.gem_for_streak_freeze, sVar2, 0), null, null, null, w2.i.f54517d, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 24624, 108);
                    float f11 = 22;
                    j0.c.g(sVar2, e2.g(oVar2, f11));
                    sVar2.d0(1324144803);
                    StringBuilder sb2 = new StringBuilder(16);
                    new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    new ArrayList();
                    String strE0 = ub.a.e0(sVar2, R.string.one_streak_freeze);
                    String strQ0 = oz.x.q0(oz.x.q0(ub.a.e0(sVar2, R.string.use_s_gems_to_get), "%s", "200"), "%t", strE0);
                    sb2.append(strQ0);
                    arrayList.add(new j3.d(oz.q.I0(strQ0, strE0, 0, false, 6), strE0.length() + oz.q.I0(strQ0, strE0, 0, false, 6), 8, new p0(((s1) sVar2.j(v1.f31180a)).f31017a, 0L, (n3.s) null, (n3.o) null, (n3.p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (u3.l) null, (v0) null, 65534), null));
                    String string = sb2.toString();
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    int size = arrayList.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        arrayList2.add(((j3.d) arrayList.get(i12)).a(sb2.length()));
                    }
                    j3.h hVar2 = new j3.h(string, arrayList2);
                    sVar2.p(false);
                    ua.c(hVar2, j0.c.C(oVar2, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, y0.a((y0) sVar2.j(ua.f31167a), 0L, j3.A(20), n3.s.K, null, null, 0L, null, null, 3, 0, 0L, null, 16744441), sVar2, 48, 0, 131068);
                    fz.a aVar3 = this.f36635c;
                    boolean zF3 = sVar2.f(aVar3);
                    Object objQ3 = sVar2.Q();
                    l1.g gVar2 = l1.m.f39353a;
                    if (zF3 || objQ3 == gVar2) {
                        objQ3 = new m(13, aVar3);
                        sVar2.o0(objQ3);
                    }
                    iu.k.e((fz.a) objQ3, e2.e(j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 1.0f), false, 0L, null, ku.a.f38692h, sVar2, 196656, 28);
                    fz.a aVar4 = this.f36636d;
                    boolean zF4 = sVar2.f(aVar4);
                    Object objQ4 = sVar2.Q();
                    if (zF4 || objQ4 == gVar2) {
                        objQ4 = new m(14, aVar4);
                        sVar2.o0(objQ4);
                    }
                    k7.m((fz.a) objQ4, j0.c.C(e2.e(oVar2, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, f5, 1), false, null, null, null, ku.a.f38693i, sVar2, 805306416, 508);
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                break;
            default:
                j0.v ModalBottomSheet2 = (j0.v) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(ModalBottomSheet2, "$this$ModalBottomSheet");
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    z1.o oVar3 = z1.o.f58481a;
                    z1.r rVarE = j0.c.E(j0.c.C(j0.c.v(e2.e(oVar3, 1.0f)), 24, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 10, CropImageView.DEFAULT_ASPECT_RATIO, 16, 5);
                    float f12 = 12;
                    j0.u uVarA2 = j0.t.a(j0.i.g(f12), z1.c.P, sVar3, 54);
                    int iHashCode2 = Long.hashCode(sVar3.T);
                    q1 q1VarL2 = sVar3.l();
                    z1.r rVarC3 = z1.a.c(sVar3, rVarE);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar2);
                    } else {
                        sVar3.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA2, sVar3);
                    l1.t.J(y2.j.f56916e, q1VarL2, sVar3);
                    y2.h hVar3 = y2.j.f56918g;
                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar3);
                    }
                    l1.t.J(y2.j.f56915d, rVarC3, sVar3);
                    String strE1 = ub.a.e0(sVar3, R.string.srs_customize_suggestion_prompt_title);
                    c3 c3Var = fc.f30256a;
                    ua.b(strE1, null, 0L, 0L, null, n3.s.K, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, ((dc) sVar3.j(c3Var)).f30173f, sVar3, 196608, 0, 64990);
                    ua.b(ub.a.d0(R.string.srs_customize_suggestion_prompt_description, new Object[]{Integer.valueOf(this.f36634b)}, sVar3), null, ((s1) sVar3.j(v1.f31180a)).f31036s, 0L, null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, ((dc) sVar3.j(c3Var)).f30178k, sVar3, 0, 0, 65018);
                    iu.k.e(this.f36635c, j0.c.E(e2.e(oVar3, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, f12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), false, 0L, null, mt.g.I0, sVar3, 196656, 28);
                    k7.m(this.f36636d, e2.e(oVar3, 1.0f), false, null, null, null, mt.g.J0, sVar3, 805306416, 508);
                    sVar3.p(true);
                } else {
                    sVar3.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ h0(int i11, fz.a aVar, fz.a aVar2) {
        this.f36633a = 0;
        this.f36635c = aVar;
        this.f36634b = i11;
        this.f36636d = aVar2;
    }
}
