package gs;

import bp.u;
import com.yalantis.ucrop.view.CropImageView;
import j0.e2;
import j0.v;
import j0.v1;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bs.f f29775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f29776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.c f29777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.a f29778e;

    public /* synthetic */ d(int i11, bs.f fVar, fz.a aVar, fz.c cVar, String str) {
        this.f29774a = i11;
        this.f29775b = fVar;
        this.f29776c = str;
        this.f29777d = cVar;
        this.f29778e = aVar;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f29774a) {
            case 0:
                v ToneIntroductionLayout = (v) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(ToneIntroductionLayout, "$this$ToneIntroductionLayout");
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    z1.r rVarD = e2.d(z1.o.f58481a, 1.0f);
                    float f5 = 16;
                    j0.g gVarG = j0.i.g(f5);
                    v1 v1VarD = j0.c.d(CropImageView.DEFAULT_ASPECT_RATIO, f5, 1);
                    final bs.f fVar = this.f29775b;
                    boolean zH = sVar.h(fVar);
                    final String str = this.f29776c;
                    boolean zF = zH | sVar.f(str);
                    final fz.c cVar = this.f29777d;
                    boolean zF2 = zF | sVar.f(cVar);
                    final fz.a aVar = this.f29778e;
                    boolean zF3 = zF2 | sVar.f(aVar);
                    Object objQ = sVar.Q();
                    if (zF3 || objQ == l1.m.f39353a) {
                        final int i11 = 0;
                        objQ = new fz.c() { // from class: gs.f
                            @Override // fz.c
                            public final Object invoke(Object obj4) {
                                l0.h LazyColumn = (l0.h) obj4;
                                switch (i11) {
                                    case 0:
                                        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                                        l0.h.p(LazyColumn, null, a.f29763a, 3);
                                        bs.f fVar2 = fVar;
                                        l0.h.p(LazyColumn, null, new t1.d(new g(fVar2, 0), true, -587429868), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new h(fVar2, str, cVar, 0), true, 283391731), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new u(5, aVar), true, 1154213330), 3);
                                        break;
                                    case 1:
                                        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                                        l0.h.p(LazyColumn, null, a.f29764b, 3);
                                        bs.f fVar3 = fVar;
                                        l0.h.p(LazyColumn, null, new t1.d(new g(fVar3, 1), true, -2146277864), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new h(fVar3, str, cVar, 2), true, 1489623351), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new u(6, aVar), true, 830557270), 3);
                                        break;
                                    case 2:
                                        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                                        l0.h.p(LazyColumn, null, a.f29765c, 3);
                                        bs.f fVar4 = fVar;
                                        l0.h.p(LazyColumn, null, new t1.d(new g(fVar4, 2), true, 1217106470), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new h(fVar4, str, cVar, 4), true, -785204859), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new u(7, aVar), true, 1507451108), 3);
                                        break;
                                    case 3:
                                        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                                        l0.h.p(LazyColumn, null, a.f29766d, 3);
                                        bs.f fVar5 = fVar;
                                        l0.h.p(LazyColumn, null, new t1.d(new g(fVar5, 3), true, -471731112), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new h(fVar5, str, cVar, 6), true, -1130797193), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new u(8, aVar), true, -1789863274), 3);
                                        break;
                                    default:
                                        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                                        l0.h.p(LazyColumn, null, a.f29767e, 3);
                                        bs.f fVar6 = fVar;
                                        l0.h.p(LazyColumn, null, new t1.d(new g(fVar6, 4), true, -947171546), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new h(fVar6, str, cVar, 8), true, -76349947), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new u(9, aVar), true, 794471652), 3);
                                        break;
                                }
                                return b0.f48488a;
                            }
                        };
                        sVar.o0(objQ);
                    }
                    ue.f.a(rVarD, null, v1VarD, gVarG, null, null, false, null, (fz.c) objQ, sVar, 24966, 490);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                v ToneIntroductionLayout2 = (v) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(ToneIntroductionLayout2, "$this$ToneIntroductionLayout");
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    z1.r rVarD2 = e2.d(z1.o.f58481a, 1.0f);
                    float f11 = 16;
                    j0.g gVarG2 = j0.i.g(f11);
                    v1 v1VarD2 = j0.c.d(CropImageView.DEFAULT_ASPECT_RATIO, f11, 1);
                    final bs.f fVar2 = this.f29775b;
                    boolean zH2 = sVar2.h(fVar2);
                    final String str2 = this.f29776c;
                    boolean zF4 = zH2 | sVar2.f(str2);
                    final fz.c cVar2 = this.f29777d;
                    boolean zF5 = zF4 | sVar2.f(cVar2);
                    final fz.a aVar2 = this.f29778e;
                    boolean zF6 = zF5 | sVar2.f(aVar2);
                    Object objQ2 = sVar2.Q();
                    if (zF6 || objQ2 == l1.m.f39353a) {
                        final int i12 = 1;
                        objQ2 = new fz.c() { // from class: gs.f
                            @Override // fz.c
                            public final Object invoke(Object obj4) {
                                l0.h LazyColumn = (l0.h) obj4;
                                switch (i12) {
                                    case 0:
                                        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                                        l0.h.p(LazyColumn, null, a.f29763a, 3);
                                        bs.f fVar3 = fVar2;
                                        l0.h.p(LazyColumn, null, new t1.d(new g(fVar3, 0), true, -587429868), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new h(fVar3, str2, cVar2, 0), true, 283391731), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new u(5, aVar2), true, 1154213330), 3);
                                        break;
                                    case 1:
                                        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                                        l0.h.p(LazyColumn, null, a.f29764b, 3);
                                        bs.f fVar4 = fVar2;
                                        l0.h.p(LazyColumn, null, new t1.d(new g(fVar4, 1), true, -2146277864), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new h(fVar4, str2, cVar2, 2), true, 1489623351), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new u(6, aVar2), true, 830557270), 3);
                                        break;
                                    case 2:
                                        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                                        l0.h.p(LazyColumn, null, a.f29765c, 3);
                                        bs.f fVar5 = fVar2;
                                        l0.h.p(LazyColumn, null, new t1.d(new g(fVar5, 2), true, 1217106470), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new h(fVar5, str2, cVar2, 4), true, -785204859), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new u(7, aVar2), true, 1507451108), 3);
                                        break;
                                    case 3:
                                        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                                        l0.h.p(LazyColumn, null, a.f29766d, 3);
                                        bs.f fVar6 = fVar2;
                                        l0.h.p(LazyColumn, null, new t1.d(new g(fVar6, 3), true, -471731112), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new h(fVar6, str2, cVar2, 6), true, -1130797193), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new u(8, aVar2), true, -1789863274), 3);
                                        break;
                                    default:
                                        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                                        l0.h.p(LazyColumn, null, a.f29767e, 3);
                                        bs.f fVar7 = fVar2;
                                        l0.h.p(LazyColumn, null, new t1.d(new g(fVar7, 4), true, -947171546), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new h(fVar7, str2, cVar2, 8), true, -76349947), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new u(9, aVar2), true, 794471652), 3);
                                        break;
                                }
                                return b0.f48488a;
                            }
                        };
                        sVar2.o0(objQ2);
                    }
                    ue.f.a(rVarD2, null, v1VarD2, gVarG2, null, null, false, null, (fz.c) objQ2, sVar2, 24966, 490);
                } else {
                    sVar2.W();
                }
                break;
            case 2:
                v ToneIntroductionLayout3 = (v) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(ToneIntroductionLayout3, "$this$ToneIntroductionLayout");
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    z1.r rVarD3 = e2.d(z1.o.f58481a, 1.0f);
                    float f12 = 16;
                    j0.g gVarG3 = j0.i.g(f12);
                    v1 v1VarD3 = j0.c.d(CropImageView.DEFAULT_ASPECT_RATIO, f12, 1);
                    final bs.f fVar3 = this.f29775b;
                    boolean zH3 = sVar3.h(fVar3);
                    final String str3 = this.f29776c;
                    boolean zF7 = zH3 | sVar3.f(str3);
                    final fz.c cVar3 = this.f29777d;
                    boolean zF8 = zF7 | sVar3.f(cVar3);
                    final fz.a aVar3 = this.f29778e;
                    boolean zF9 = zF8 | sVar3.f(aVar3);
                    Object objQ3 = sVar3.Q();
                    if (zF9 || objQ3 == l1.m.f39353a) {
                        final int i13 = 2;
                        objQ3 = new fz.c() { // from class: gs.f
                            @Override // fz.c
                            public final Object invoke(Object obj4) {
                                l0.h LazyColumn = (l0.h) obj4;
                                switch (i13) {
                                    case 0:
                                        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                                        l0.h.p(LazyColumn, null, a.f29763a, 3);
                                        bs.f fVar4 = fVar3;
                                        l0.h.p(LazyColumn, null, new t1.d(new g(fVar4, 0), true, -587429868), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new h(fVar4, str3, cVar3, 0), true, 283391731), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new u(5, aVar3), true, 1154213330), 3);
                                        break;
                                    case 1:
                                        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                                        l0.h.p(LazyColumn, null, a.f29764b, 3);
                                        bs.f fVar5 = fVar3;
                                        l0.h.p(LazyColumn, null, new t1.d(new g(fVar5, 1), true, -2146277864), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new h(fVar5, str3, cVar3, 2), true, 1489623351), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new u(6, aVar3), true, 830557270), 3);
                                        break;
                                    case 2:
                                        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                                        l0.h.p(LazyColumn, null, a.f29765c, 3);
                                        bs.f fVar6 = fVar3;
                                        l0.h.p(LazyColumn, null, new t1.d(new g(fVar6, 2), true, 1217106470), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new h(fVar6, str3, cVar3, 4), true, -785204859), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new u(7, aVar3), true, 1507451108), 3);
                                        break;
                                    case 3:
                                        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                                        l0.h.p(LazyColumn, null, a.f29766d, 3);
                                        bs.f fVar7 = fVar3;
                                        l0.h.p(LazyColumn, null, new t1.d(new g(fVar7, 3), true, -471731112), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new h(fVar7, str3, cVar3, 6), true, -1130797193), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new u(8, aVar3), true, -1789863274), 3);
                                        break;
                                    default:
                                        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                                        l0.h.p(LazyColumn, null, a.f29767e, 3);
                                        bs.f fVar8 = fVar3;
                                        l0.h.p(LazyColumn, null, new t1.d(new g(fVar8, 4), true, -947171546), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new h(fVar8, str3, cVar3, 8), true, -76349947), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new u(9, aVar3), true, 794471652), 3);
                                        break;
                                }
                                return b0.f48488a;
                            }
                        };
                        sVar3.o0(objQ3);
                    }
                    ue.f.a(rVarD3, null, v1VarD3, gVarG3, null, null, false, null, (fz.c) objQ3, sVar3, 24966, 490);
                } else {
                    sVar3.W();
                }
                break;
            case 3:
                v ToneIntroductionLayout4 = (v) obj;
                l1.n nVar4 = (l1.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(ToneIntroductionLayout4, "$this$ToneIntroductionLayout");
                l1.s sVar4 = (l1.s) nVar4;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    z1.r rVarD4 = e2.d(z1.o.f58481a, 1.0f);
                    float f13 = 16;
                    j0.g gVarG4 = j0.i.g(f13);
                    v1 v1VarD4 = j0.c.d(CropImageView.DEFAULT_ASPECT_RATIO, f13, 1);
                    final bs.f fVar4 = this.f29775b;
                    boolean zH4 = sVar4.h(fVar4);
                    final String str4 = this.f29776c;
                    boolean zF10 = zH4 | sVar4.f(str4);
                    final fz.c cVar4 = this.f29777d;
                    boolean zF11 = zF10 | sVar4.f(cVar4);
                    final fz.a aVar4 = this.f29778e;
                    boolean zF12 = zF11 | sVar4.f(aVar4);
                    Object objQ4 = sVar4.Q();
                    if (zF12 || objQ4 == l1.m.f39353a) {
                        final int i14 = 3;
                        objQ4 = new fz.c() { // from class: gs.f
                            @Override // fz.c
                            public final Object invoke(Object obj4) {
                                l0.h LazyColumn = (l0.h) obj4;
                                switch (i14) {
                                    case 0:
                                        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                                        l0.h.p(LazyColumn, null, a.f29763a, 3);
                                        bs.f fVar5 = fVar4;
                                        l0.h.p(LazyColumn, null, new t1.d(new g(fVar5, 0), true, -587429868), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new h(fVar5, str4, cVar4, 0), true, 283391731), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new u(5, aVar4), true, 1154213330), 3);
                                        break;
                                    case 1:
                                        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                                        l0.h.p(LazyColumn, null, a.f29764b, 3);
                                        bs.f fVar6 = fVar4;
                                        l0.h.p(LazyColumn, null, new t1.d(new g(fVar6, 1), true, -2146277864), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new h(fVar6, str4, cVar4, 2), true, 1489623351), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new u(6, aVar4), true, 830557270), 3);
                                        break;
                                    case 2:
                                        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                                        l0.h.p(LazyColumn, null, a.f29765c, 3);
                                        bs.f fVar7 = fVar4;
                                        l0.h.p(LazyColumn, null, new t1.d(new g(fVar7, 2), true, 1217106470), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new h(fVar7, str4, cVar4, 4), true, -785204859), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new u(7, aVar4), true, 1507451108), 3);
                                        break;
                                    case 3:
                                        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                                        l0.h.p(LazyColumn, null, a.f29766d, 3);
                                        bs.f fVar8 = fVar4;
                                        l0.h.p(LazyColumn, null, new t1.d(new g(fVar8, 3), true, -471731112), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new h(fVar8, str4, cVar4, 6), true, -1130797193), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new u(8, aVar4), true, -1789863274), 3);
                                        break;
                                    default:
                                        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                                        l0.h.p(LazyColumn, null, a.f29767e, 3);
                                        bs.f fVar9 = fVar4;
                                        l0.h.p(LazyColumn, null, new t1.d(new g(fVar9, 4), true, -947171546), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new h(fVar9, str4, cVar4, 8), true, -76349947), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new u(9, aVar4), true, 794471652), 3);
                                        break;
                                }
                                return b0.f48488a;
                            }
                        };
                        sVar4.o0(objQ4);
                    }
                    ue.f.a(rVarD4, null, v1VarD4, gVarG4, null, null, false, null, (fz.c) objQ4, sVar4, 24966, 490);
                } else {
                    sVar4.W();
                }
                break;
            default:
                v ToneIntroductionLayout5 = (v) obj;
                l1.n nVar5 = (l1.n) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(ToneIntroductionLayout5, "$this$ToneIntroductionLayout");
                l1.s sVar5 = (l1.s) nVar5;
                if (sVar5.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    z1.r rVarD5 = e2.d(z1.o.f58481a, 1.0f);
                    float f14 = 16;
                    j0.g gVarG5 = j0.i.g(f14);
                    v1 v1VarD5 = j0.c.d(CropImageView.DEFAULT_ASPECT_RATIO, f14, 1);
                    final bs.f fVar5 = this.f29775b;
                    boolean zH5 = sVar5.h(fVar5);
                    final String str5 = this.f29776c;
                    boolean zF13 = zH5 | sVar5.f(str5);
                    final fz.c cVar5 = this.f29777d;
                    boolean zF14 = zF13 | sVar5.f(cVar5);
                    final fz.a aVar5 = this.f29778e;
                    boolean zF15 = zF14 | sVar5.f(aVar5);
                    Object objQ5 = sVar5.Q();
                    if (zF15 || objQ5 == l1.m.f39353a) {
                        final int i15 = 4;
                        objQ5 = new fz.c() { // from class: gs.f
                            @Override // fz.c
                            public final Object invoke(Object obj4) {
                                l0.h LazyColumn = (l0.h) obj4;
                                switch (i15) {
                                    case 0:
                                        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                                        l0.h.p(LazyColumn, null, a.f29763a, 3);
                                        bs.f fVar6 = fVar5;
                                        l0.h.p(LazyColumn, null, new t1.d(new g(fVar6, 0), true, -587429868), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new h(fVar6, str5, cVar5, 0), true, 283391731), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new u(5, aVar5), true, 1154213330), 3);
                                        break;
                                    case 1:
                                        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                                        l0.h.p(LazyColumn, null, a.f29764b, 3);
                                        bs.f fVar7 = fVar5;
                                        l0.h.p(LazyColumn, null, new t1.d(new g(fVar7, 1), true, -2146277864), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new h(fVar7, str5, cVar5, 2), true, 1489623351), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new u(6, aVar5), true, 830557270), 3);
                                        break;
                                    case 2:
                                        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                                        l0.h.p(LazyColumn, null, a.f29765c, 3);
                                        bs.f fVar8 = fVar5;
                                        l0.h.p(LazyColumn, null, new t1.d(new g(fVar8, 2), true, 1217106470), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new h(fVar8, str5, cVar5, 4), true, -785204859), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new u(7, aVar5), true, 1507451108), 3);
                                        break;
                                    case 3:
                                        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                                        l0.h.p(LazyColumn, null, a.f29766d, 3);
                                        bs.f fVar9 = fVar5;
                                        l0.h.p(LazyColumn, null, new t1.d(new g(fVar9, 3), true, -471731112), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new h(fVar9, str5, cVar5, 6), true, -1130797193), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new u(8, aVar5), true, -1789863274), 3);
                                        break;
                                    default:
                                        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                                        l0.h.p(LazyColumn, null, a.f29767e, 3);
                                        bs.f fVar10 = fVar5;
                                        l0.h.p(LazyColumn, null, new t1.d(new g(fVar10, 4), true, -947171546), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new h(fVar10, str5, cVar5, 8), true, -76349947), 3);
                                        l0.h.p(LazyColumn, null, new t1.d(new u(9, aVar5), true, 794471652), 3);
                                        break;
                                }
                                return b0.f48488a;
                            }
                        };
                        sVar5.o0(objQ5);
                    }
                    ue.f.a(rVarD5, null, v1VarD5, gVarG5, null, null, false, null, (fz.c) objQ5, sVar5, 24966, 490);
                } else {
                    sVar5.W();
                }
                break;
        }
        return b0.f48488a;
    }
}
