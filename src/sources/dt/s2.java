package dt;

import com.lingodeer.R;
import com.lingodeer.data.model.CourseWord;
import com.yalantis.ucrop.view.CropImageView;
import h1.dc;
import h1.fc;
import h1.ua;
import java.util.List;
import rt.ue;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s2 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24183a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f24184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f24185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f24187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f24188f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f24189t;

    public /* synthetic */ s2(int i11, int i12, fz.a aVar, fz.a aVar2, fz.a aVar3, boolean z11) {
        this.f24185c = i11;
        this.f24184b = z11;
        this.f24187e = aVar;
        this.f24188f = aVar2;
        this.f24189t = aVar3;
        this.f24186d = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        boolean z11;
        String strValueOf;
        k2.b bVarY;
        switch (this.f24183a) {
            case 0:
                ((Integer) obj2).intValue();
                v2.l((j0.q) this.f24187e, (ht.q) this.f24188f, (CourseWord) this.f24189t, this.f24185c, this.f24184b, (l1.n) obj, l1.t.M(this.f24186d | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                iv.a.n((String) this.f24187e, (String) this.f24188f, this.f24184b, (fz.a) this.f24189t, (l1.n) obj, l1.t.M(this.f24185c | 1), this.f24186d);
                break;
            case 2:
                ((Integer) obj2).intValue();
                ku.a.c(this.f24185c, this.f24184b, (fz.a) this.f24187e, (fz.a) this.f24188f, (fz.a) this.f24189t, (l1.n) obj, l1.t.M(this.f24186d | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ku.a.a(this.f24185c, (String) this.f24187e, (String) this.f24188f, (z1.r) this.f24189t, this.f24184b, (l1.n) obj, l1.t.M(49), this.f24186d);
                break;
            case 4:
                i3.a aVar = (i3.a) this.f24187e;
                fz.c cVar = (fz.c) this.f24188f;
                ue ueVar = (ue) this.f24189t;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    z1.o oVar = z1.o.f58481a;
                    float f5 = 12;
                    z1.r rVarB = j0.c.B(j0.e2.e(oVar, 1.0f), 4, f5);
                    z1.i iVar = z1.c.M;
                    j0.b bVar = j0.i.f35303a;
                    j0.a2 a2VarA = j0.z1.a(bVar, iVar, sVar, 48);
                    int iHashCode = Long.hashCode(sVar.T);
                    l1.q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(sVar, rVarB);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar2);
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
                    int i11 = this.f24185c;
                    boolean z12 = i11 > 0;
                    boolean zD = sVar.d(aVar.ordinal()) | sVar.d(i11) | sVar.f(cVar);
                    Object objQ = sVar.Q();
                    if (zD || objQ == l1.m.f39353a) {
                        objQ = new g00.y(cVar, i11, 1, aVar);
                        sVar.o0(objQ);
                    }
                    h1.e1.c(aVar, (fz.a) objQ, null, z12, null, sVar, 0, 52);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    j0.i1 i1Var = new j0.i1(1.0f, true);
                    j0.a2 a2VarA2 = j0.z1.a(bVar, iVar, sVar, 48);
                    int iHashCode2 = Long.hashCode(sVar.T);
                    l1.q1 q1VarL2 = sVar.l();
                    z1.r rVarC2 = z1.a.c(sVar, i1Var);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar2);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(hVar, a2VarA2, sVar);
                    l1.t.J(hVar2, q1VarL2, sVar);
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
                    }
                    l1.t.J(hVar4, rVarC2, sVar);
                    float f11 = 8;
                    z1.r rVarE = j0.c.E(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
                    int iHashCode3 = Long.hashCode(sVar.T);
                    l1.q1 q1VarL3 = sVar.l();
                    z1.r rVarC3 = z1.a.c(sVar, rVarE);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar2);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(hVar, uVarA, sVar);
                    l1.t.J(hVar2, q1VarL3, sVar);
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                    }
                    l1.t.J(hVar4, rVarC3, sVar);
                    String str = ueVar.f50511b;
                    List list = ueVar.f50513d;
                    l1.c3 c3Var = fc.f30256a;
                    ua.b(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30175h, sVar, 0, 0, 65534);
                    sVar.p(true);
                    sVar.p(true);
                    int i12 = this.f24186d;
                    if (i12 > 0) {
                        sVar.d0(-329037686);
                        ua.b("(" + i12 + ")", null, ((h1.s1) sVar.j(h1.v1.f31180a)).f31017a, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30179l, sVar, 0, 0, 65530);
                        j0.c.g(sVar, j0.e2.s(oVar, f11));
                        z11 = false;
                    } else {
                        z11 = false;
                        sVar.d0(-353248345);
                    }
                    sVar.p(z11);
                    if (i11 == list.size()) {
                        strValueOf = String.valueOf(list.size());
                    } else {
                        strValueOf = i11 + "/" + list.size();
                    }
                    ua.b(strValueOf, null, ((h1.s1) sVar.j(h1.v1.f31180a)).f31036s, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30179l, sVar, 0, 0, 65530);
                    j0.c.g(sVar, j0.e2.s(oVar, f5));
                    if (this.f24184b) {
                        sVar.d0(-328267646);
                        bVarY = se.k.y(R.drawable.keyboard_arrow_down_24px, sVar, 0);
                        sVar.p(false);
                    } else {
                        sVar.d0(-328097983);
                        bVarY = se.k.y(R.drawable.keyboard_arrow_right_24px, sVar, 0);
                        sVar.p(false);
                    }
                    h1.r4.b(bVarY, null, null, 0L, sVar, 48, 12);
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 5:
                ((Integer) obj2).getClass();
                mt.b1.l((ue) this.f24187e, this.f24185c, this.f24186d, this.f24184b, (fz.a) this.f24188f, (fz.c) this.f24189t, (l1.n) obj, l1.t.M(1));
                return qy.b0.f48488a;
            default:
                ((Integer) obj2).getClass();
                us.b.i((Long) this.f24187e, this.f24184b, (vs.d) this.f24188f, (fz.a) this.f24189t, (l1.n) obj, l1.t.M(this.f24185c | 1), this.f24186d);
                return qy.b0.f48488a;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ s2(int i11, i3.a aVar, fz.c cVar, int i12, ue ueVar, boolean z11) {
        this.f24185c = i11;
        this.f24187e = aVar;
        this.f24188f = cVar;
        this.f24186d = i12;
        this.f24189t = ueVar;
        this.f24184b = z11;
    }

    public /* synthetic */ s2(int i11, String str, String str2, z1.r rVar, boolean z11, int i12, int i13) {
        this.f24185c = i11;
        this.f24187e = str;
        this.f24188f = str2;
        this.f24189t = rVar;
        this.f24184b = z11;
        this.f24186d = i13;
    }

    public /* synthetic */ s2(j0.q qVar, ht.q qVar2, CourseWord courseWord, int i11, boolean z11, int i12) {
        this.f24187e = qVar;
        this.f24188f = qVar2;
        this.f24189t = courseWord;
        this.f24185c = i11;
        this.f24184b = z11;
        this.f24186d = i12;
    }

    public /* synthetic */ s2(Long l9, boolean z11, vs.d dVar, fz.a aVar, int i11, int i12) {
        this.f24187e = l9;
        this.f24184b = z11;
        this.f24188f = dVar;
        this.f24189t = aVar;
        this.f24185c = i11;
        this.f24186d = i12;
    }

    public /* synthetic */ s2(String str, String str2, boolean z11, fz.a aVar, int i11, int i12) {
        this.f24187e = str;
        this.f24188f = str2;
        this.f24184b = z11;
        this.f24189t = aVar;
        this.f24185c = i11;
        this.f24186d = i12;
    }

    public /* synthetic */ s2(ue ueVar, int i11, int i12, boolean z11, fz.a aVar, fz.c cVar, int i13) {
        this.f24187e = ueVar;
        this.f24185c = i11;
        this.f24186d = i12;
        this.f24184b = z11;
        this.f24188f = aVar;
        this.f24189t = cVar;
    }
}
