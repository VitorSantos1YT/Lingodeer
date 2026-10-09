package f3;

import com.yalantis.ucrop.view.CropImageView;
import d0.o1;
import g3.n;
import g3.o;
import h1.e8;
import h1.l;
import ob.s;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ float f26599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f26600d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(float f5, int i11, Object obj, vy.d dVar) {
        super(2, dVar);
        this.f26597a = i11;
        this.f26600d = obj;
        this.f26599c = f5;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f26597a) {
            case 0:
                c cVar = new c((d) this.f26600d, dVar);
                cVar.f26599c = ((Number) obj).floatValue();
                return cVar;
            case 1:
                return new c(this.f26599c, 1, (e8) this.f26600d, dVar);
            case 2:
                return new c(this.f26599c, 2, (s) this.f26600d, dVar);
            case 3:
                return new c(this.f26599c, 3, (kw.h) this.f26600d, dVar);
            default:
                return new c(this.f26599c, 4, (nu.e) this.f26600d, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f26597a) {
            case 0:
                return ((c) create(Float.valueOf(((Number) obj).floatValue()), (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 1:
                return ((c) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 2:
                return ((c) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 3:
                return ((c) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            default:
                return ((c) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f26597a) {
            case 0:
                d dVar = (d) this.f26600d;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f26598b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    float f5 = this.f26599c;
                    o oVar = dVar.f26601a.f28699d;
                    Object objG = oVar.f28691a.g(n.f28670e);
                    if (objG == null) {
                        objG = null;
                    }
                    fz.e eVar = (fz.e) objG;
                    if (eVar == null) {
                        throw defpackage.e.t("Required value was null.");
                    }
                    f2.b bVar = new f2.b((((long) Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L));
                    this.f26598b = 1;
                    obj = eVar.invoke(bVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return new Float(Float.intBitsToFloat((int) (((f2.b) obj).f26570a & 4294967295L)));
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f26598b;
                b0 b0Var = b0.f48488a;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    e8 e8Var = (e8) this.f26600d;
                    float f11 = this.f26599c;
                    this.f26598b = 1;
                    Object objZ = e8Var.f30211b.z(f11, this);
                    if (objZ != aVar2) {
                        objZ = b0Var;
                    }
                    if (objZ == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0Var;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f26598b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    s sVar = (s) this.f26600d;
                    float f12 = this.f26599c;
                    this.f26598b = 1;
                    if (sVar.z(f12, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0.f48488a;
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f26598b;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    kw.h hVar = (kw.h) this.f26600d;
                    o1 o1Var = hVar.f38872i;
                    l lVar = new l(this.f26599c, 2, hVar, null);
                    this.f26598b = 1;
                    if (o1.b(o1Var, lVar, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0.f48488a;
            default:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f26598b;
                if (i15 == 0) {
                    com.bumptech.glide.e.F(obj);
                    b0.d dVar2 = ((nu.e) this.f26600d).f44062a.f47169k;
                    Float f13 = new Float(this.f26599c);
                    this.f26598b = 1;
                    if (dVar2.e(f13, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0.f48488a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, vy.d dVar2) {
        super(2, dVar2);
        this.f26597a = 0;
        this.f26600d = dVar;
    }
}
