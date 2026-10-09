package mt;

import com.yalantis.ucrop.view.CropImageView;
import h1.k7;
import java.util.List;
import rt.y8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d6 implements fz.g {
    public final /* synthetic */ fz.c H;
    public final /* synthetic */ boolean K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f41358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y8 f41359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.f f41360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.a f41361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f41362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fz.c f41363f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f41364t;

    public d6(List list, y8 y8Var, fz.f fVar, fz.a aVar, fz.c cVar, fz.c cVar2, boolean z11, fz.c cVar3, boolean z12) {
        this.f41358a = list;
        this.f41359b = y8Var;
        this.f41360c = fVar;
        this.f41361d = aVar;
        this.f41362e = cVar;
        this.f41363f = cVar2;
        this.f41364t = z11;
        this.H = cVar3;
        this.K = z12;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
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
            rt.k6 k6Var = (rt.k6) this.f41358a.get(iIntValue);
            sVar.d0(-358586149);
            y8 y8Var = this.f41359b;
            boolean zH = sVar.h(y8Var);
            fz.f fVar = this.f41360c;
            boolean zF = zH | sVar.f(fVar);
            fz.a aVar = this.f41361d;
            boolean zF2 = zF | sVar.f(aVar);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF2 || objQ == gVar) {
                objQ = new e0.d(y8Var, fVar, aVar, 1);
                sVar.o0(objQ);
            }
            fz.f fVar2 = (fz.f) objQ;
            boolean zH2 = sVar.h(y8Var);
            fz.c cVar2 = this.H;
            boolean zF3 = zH2 | sVar.f(cVar2) | sVar.f(aVar);
            Object objQ2 = sVar.Q();
            if (zF3 || objQ2 == gVar) {
                objQ2 = new c6(y8Var, cVar2, aVar, 0);
                sVar.o0(objQ2);
            }
            f6.h(k6Var, fVar2, this.f41362e, this.f41363f, this.f41364t, (fz.c) objQ2, this.K, sVar, 0);
            if (iIntValue != y8Var.f50700j.size() - 1) {
                sVar.d0(-357539621);
                k7.g(j0.c.C(z1.o.f58481a, 16, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar, 6, 6);
            } else {
                sVar.d0(-387191059);
            }
            sVar.p(false);
            sVar.p(false);
        } else {
            sVar.W();
        }
        return qy.b0.f48488a;
    }
}
