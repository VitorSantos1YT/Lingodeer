package h1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends xy.i implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f30566d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(float f5, int i11, Object obj, vy.d dVar) {
        super(1, dVar);
        this.f30563a = i11;
        this.f30565c = obj;
        this.f30566d = f5;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        switch (this.f30563a) {
            case 0:
                return new l(this.f30566d, 0, (n) this.f30565c, dVar);
            case 1:
                return new l(this.f30566d, 1, (n) this.f30565c, dVar);
            default:
                return new l(this.f30566d, 2, (kw.h) this.f30565c, dVar);
        }
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        vy.d dVar = (vy.d) obj;
        switch (this.f30563a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((l) create(dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f30563a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f30564b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                b0.d dVar = ((n) this.f30565c).f30709d;
                Float f5 = new Float(this.f30566d);
                b0.i1 i1VarQ = b0.e.q(1.0f, 700.0f, null, 4);
                this.f30564b = 1;
                Object objC = b0.d.c(dVar, f5, i1VarQ, null, this, 12);
                return objC == aVar ? aVar : objC;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f30564b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                b0.d dVar2 = ((n) this.f30565c).f30709d;
                Float f11 = new Float(this.f30566d);
                b0.i1 i1VarQ2 = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7);
                this.f30564b = 1;
                Object objC2 = b0.d.c(dVar2, f11, i1VarQ2, null, this, 12);
                return objC2 == aVar2 ? aVar2 : objC2;
            default:
                kw.h hVar = (kw.h) this.f30565c;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f30564b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    float fL = hVar.f38868e.l();
                    a0.h hVar2 = new a0.h(hVar, 6);
                    this.f30564b = 1;
                    if (b0.e.e(fL, this.f30566d, null, hVar2, this, 12) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
        }
    }
}
