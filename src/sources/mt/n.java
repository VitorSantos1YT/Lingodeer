package mt;

import android.content.Context;
import com.lingodeer.R;
import com.lingodeer.data.model.CourseLesson;
import com.yalantis.ucrop.view.CropImageView;
import h1.e8;
import h1.k7;
import h1.ua;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n implements fz.g {
    public final /* synthetic */ Object H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41668a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f41669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f41670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f41671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f41672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f41673f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f41674t;

    public n(List list, fz.e eVar, fz.a aVar, Context context, l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3) {
        this.f41669b = list;
        this.f41671d = eVar;
        this.f41670c = aVar;
        this.f41672e = context;
        this.f41673f = b1Var;
        this.f41674t = b1Var2;
        this.H = b1Var3;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
        float f5;
        String str;
        int i12;
        switch (this.f41668a) {
            case 0:
                l0.c cVar = (l0.c) obj;
                int iIntValue = ((Number) obj2).intValue();
                l1.n nVar = (l1.n) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i11 = (((l1.s) nVar).f(cVar) ? 4 : 2) | iIntValue2;
                } else {
                    i11 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i11 |= ((l1.s) nVar).d(iIntValue) ? 32 : 16;
                }
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(i11 & 1, (i11 & 147) != 146)) {
                    String str2 = (String) this.f41669b.get(iIntValue);
                    sVar.d0(-1080402452);
                    boolean zA = kotlin.jvm.internal.m.a(str2, (String) this.f41672e);
                    z1.i iVar = z1.c.M;
                    z1.o oVar = z1.o.f58481a;
                    float f11 = 32;
                    z1.r rVarC = j0.c.C(j0.e2.e(oVar, 1.0f), f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    boolean zH = sVar.h((rz.b0) this.f41674t) | sVar.f((fz.c) this.f41673f) | sVar.f(str2) | sVar.f((e8) this.H) | sVar.f(this.f41670c);
                    Object objQ = sVar.Q();
                    if (zH || objQ == l1.m.f39353a) {
                        fz.c cVar2 = (fz.c) this.f41673f;
                        rz.b0 b0Var = (rz.b0) this.f41674t;
                        e8 e8Var = (e8) this.H;
                        fz.a aVar = this.f41670c;
                        f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                        m mVar = new m(cVar2, str2, b0Var, e8Var, aVar);
                        str = str2;
                        sVar.o0(mVar);
                        objQ = mVar;
                    } else {
                        str = str2;
                        f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                    }
                    z1.r rVarO = d0.n.o(rVarC, false, null, (fz.a) objQ, 15);
                    j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, iVar, sVar, 48);
                    int iHashCode = Long.hashCode(sVar.T);
                    l1.q1 q1VarL = sVar.l();
                    z1.r rVarC2 = z1.a.c(sVar, rVarO);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar2);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, a2VarA, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC2, sVar);
                    if (zA) {
                        sVar.d0(-1104923223);
                        h1.r4.b(se.k.y(R.drawable.check_circle_24px, sVar, 0), null, null, ((h1.s1) sVar.j(h1.v1.f31180a)).f31017a, sVar, 48, 4);
                        j0.c.g(sVar, j0.e2.s(oVar, 6));
                    } else {
                        sVar.d0(-1125504092);
                    }
                    sVar.p(false);
                    ua.b(str, j0.c.C(oVar, f5, 16, 1), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar.j(ua.f31167a), ((h1.s1) sVar.j(h1.v1.f31180a)).f31017a, zA ? fr.j3.A(18) : fr.j3.A(16), zA ? n3.s.N : n3.s.f43178t, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar, 48, 0, 65532);
                    sVar.p(true);
                    if (iIntValue < ((List) this.f41671d).size() - 1) {
                        sVar.d0(-1078785090);
                        k7.g(j0.c.C(oVar, f11, f5, 2), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar, 6, 6);
                    } else {
                        sVar.d0(-1100318744);
                    }
                    sVar.p(false);
                    sVar.p(false);
                } else {
                    sVar.W();
                }
                break;
            default:
                l0.c cVar3 = (l0.c) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                l1.n nVar2 = (l1.n) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i12 = (((l1.s) nVar2).f(cVar3) ? 4 : 2) | iIntValue4;
                } else {
                    i12 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i12 |= ((l1.s) nVar2).d(iIntValue3) ? 32 : 16;
                }
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(i12 & 1, (i12 & 147) != 146)) {
                    CourseLesson courseLesson = (CourseLesson) this.f41669b.get(iIntValue3);
                    sVar2.d0(1280488296);
                    boolean zH2 = sVar2.h(courseLesson) | sVar2.f((fz.e) this.f41671d) | sVar2.f(this.f41670c) | sVar2.h((Context) this.f41672e);
                    Object objQ2 = sVar2.Q();
                    if (zH2 || objQ2 == l1.m.f39353a) {
                        ys.a2 a2Var = new ys.a2(courseLesson, (fz.e) this.f41671d, (l1.b1) this.f41673f, (l1.b1) this.f41674t, (l1.b1) this.H, this.f41670c, (Context) this.f41672e, 1);
                        sVar2.o0(a2Var);
                        objQ2 = a2Var;
                    }
                    at.b.b(courseLesson, (fz.c) objQ2, sVar2, 0);
                    sVar2.p(false);
                } else {
                    sVar2.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public n(List list, String str, fz.c cVar, rz.b0 b0Var, e8 e8Var, fz.a aVar, List list2) {
        this.f41669b = list;
        this.f41672e = str;
        this.f41673f = cVar;
        this.f41674t = b0Var;
        this.H = e8Var;
        this.f41670c = aVar;
        this.f41671d = list2;
    }
}
