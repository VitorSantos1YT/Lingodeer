package ph;

import kotlin.KotlinNothingValueException;
import rz.b0;
import uz.i1;
import uz.w0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f46877c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f46875a = i11;
        this.f46877c = kVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f46875a) {
            case 0:
                return new j(this.f46877c, dVar, 0);
            default:
                return new j(this.f46877c, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f46875a) {
            case 0:
                break;
        }
        return ((j) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f46875a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f46876b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    k kVar = this.f46877c;
                    w0 w0Var = ((vt.d) kVar.f46880c).f54203n;
                    i iVar = new i(kVar, 0);
                    this.f46876b = 1;
                    w0Var.getClass();
                    if (w0.l(w0Var, iVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                throw new KotlinNothingValueException();
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f46876b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    k kVar2 = this.f46877c;
                    i1 i1Var = ((vt.d) kVar2.f46880c).f54204o;
                    i iVar2 = new i(kVar2, 1);
                    this.f46876b = 1;
                    if (i1Var.collect(iVar2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                throw new KotlinNothingValueException();
        }
    }
}
