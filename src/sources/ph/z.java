package ph;

import kotlin.KotlinNothingValueException;
import rz.b0;
import uz.i1;
import uz.w0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class z extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f46936c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(a0 a0Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f46934a = i11;
        this.f46936c = a0Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f46934a) {
            case 0:
                return new z(this.f46936c, dVar, 0);
            case 1:
                return new z(this.f46936c, dVar, 1);
            case 2:
                return new z(this.f46936c, dVar, 2);
            default:
                return new z(this.f46936c, dVar, 3);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f46934a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((z) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f46934a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f46935b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    a0 a0Var = this.f46936c;
                    w0 w0Var = ((vt.d) a0Var.f46842c).f54203n;
                    y yVar = new y(a0Var, 0);
                    this.f46935b = 1;
                    w0Var.getClass();
                    if (w0.l(w0Var, yVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                throw new KotlinNothingValueException();
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f46935b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    a0 a0Var2 = this.f46936c;
                    i1 i1Var = ((vt.d) a0Var2.f46842c).f54204o;
                    y yVar2 = new y(a0Var2, 1);
                    this.f46935b = 1;
                    if (i1Var.collect(yVar2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                throw new KotlinNothingValueException();
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f46935b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    a0 a0Var3 = this.f46936c;
                    i1 i1Var2 = ((vt.d) a0Var3.f46842c).m;
                    y yVar3 = new y(a0Var3, 2);
                    this.f46935b = 1;
                    if (i1Var2.collect(yVar3, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                throw new KotlinNothingValueException();
            default:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f46935b;
                qy.b0 b0Var = qy.b0.f48488a;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    a0 a0Var4 = this.f46936c;
                    i1 i1Var3 = a0Var4.f46843d;
                    i1Var3.getClass();
                    i1Var3.l(null, ry.s.f50855a);
                    i1 i1Var4 = a0Var4.f46844e;
                    i1Var4.getClass();
                    i1Var4.l(null, ry.r.f50854a);
                    vt.c cVar = a0Var4.f46842c;
                    this.f46935b = 1;
                    ((vt.d) cVar).f(this);
                    if (b0Var == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0Var;
        }
    }
}
