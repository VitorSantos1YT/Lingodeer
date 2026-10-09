package nu;

import bh.z0;
import com.yalantis.ucrop.view.CropImageView;
import rz.b0;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44058a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f44060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ou.f f44061d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, ou.f fVar, vy.d dVar) {
        super(2, dVar);
        this.f44060c = eVar;
        this.f44061d = fVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f44058a) {
            case 0:
                return new d(this.f44060c, dVar);
            default:
                return new d(this.f44060c, this.f44061d, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f44058a) {
            case 0:
                break;
        }
        return ((d) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v20, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v23, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v27, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, java.util.List] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        ou.f fVar;
        switch (this.f44058a) {
            case 0:
                e eVar = this.f44060c;
                ou.c cVar = eVar.f44063b;
                pu.b bVar = eVar.f44062a;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f44059b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    eVar.e();
                    bVar.k(false);
                    ou.f fVarC = bVar.c();
                    this.f44061d = fVarC;
                    this.f44059b = 1;
                    if (bVar.f(this) == aVar) {
                        return aVar;
                    }
                    fVar = fVarC;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar = this.f44061d;
                    com.bumptech.glide.e.F(obj);
                }
                bVar.h(fVar);
                bVar.f47178u.clear();
                int size = cVar.f46072e.size();
                for (int i12 = 0; i12 < size; i12++) {
                    bVar.f47178u.add(null);
                }
                bVar.F.clear();
                int size2 = cVar.f46072e.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    bVar.F.add(null);
                }
                bVar.H.clear();
                bVar.I.clear();
                int size3 = cVar.f46072e.size();
                for (int i14 = 0; i14 < size3; i14++) {
                    bVar.H.add(b0.e.a(CropImageView.DEFAULT_ASPECT_RATIO));
                    bVar.I.add(b0.e.a(1.0f));
                }
                if (fVar == ou.f.Writer && eVar.f44065d.f46087i) {
                    e.b(eVar);
                }
                bVar.i(bVar.d() + 1);
                return qy.b0.f48488a;
            default:
                ou.f fVar2 = this.f44061d;
                e eVar2 = this.f44060c;
                ou.c cVar2 = eVar2.f44063b;
                pu.b bVar2 = eVar2.f44062a;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f44059b;
                if (i15 == 0) {
                    com.bumptech.glide.e.F(obj);
                    eVar2.e();
                    bVar2.h(fVar2);
                    bVar2.l(0);
                    this.f44059b = 1;
                    if (bVar2.f(this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                bVar2.f47178u.clear();
                int size4 = cVar2.f46072e.size();
                int i16 = 0;
                while (true) {
                    vy.d dVar = null;
                    if (i16 >= size4) {
                        bVar2.F.clear();
                        int size5 = cVar2.f46072e.size();
                        for (int i17 = 0; i17 < size5; i17++) {
                            bVar2.F.add(null);
                        }
                        bVar2.H.clear();
                        bVar2.I.clear();
                        int size6 = cVar2.f46072e.size();
                        for (int i18 = 0; i18 < size6; i18++) {
                            bVar2.H.add(b0.e.a(CropImageView.DEFAULT_ASPECT_RATIO));
                            bVar2.I.add(b0.e.a(1.0f));
                        }
                        if (fVar2 == ou.f.Anim) {
                            e0.B(eVar2.f44064c, null, null, new z0(eVar2, dVar, 3), 3);
                        } else if (fVar2 == ou.f.Writer && eVar2.f44065d.f46087i) {
                            e.b(eVar2);
                        }
                        return qy.b0.f48488a;
                    }
                    bVar2.f47178u.add(null);
                    i16++;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, vy.d dVar) {
        super(2, dVar);
        this.f44060c = eVar;
    }
}
