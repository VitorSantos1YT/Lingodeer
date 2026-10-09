package vz;

import d0.g0;
import kotlin.jvm.internal.y;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54336a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f54337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f54338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f54339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uz.j f54340e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, uz.j jVar, Object obj, vy.d dVar) {
        super(2, dVar);
        this.f54339d = iVar;
        this.f54340e = jVar;
        this.f54338c = obj;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f54336a) {
            case 0:
                return new g(this.f54339d, this.f54340e, this.f54338c, dVar);
            default:
                g gVar = new g(this.f54339d, this.f54340e, dVar);
                gVar.f54338c = obj;
                return gVar;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f54336a) {
            case 0:
                break;
        }
        return ((g) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [fz.f, xy.i] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f54336a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f54337b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    ?? r11 = this.f54339d.f54346e;
                    Object obj2 = this.f54338c;
                    this.f54337b = 1;
                    if (r11.invoke(this.f54340e, obj2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f54337b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    b0 b0Var = (b0) this.f54338c;
                    y yVar = new y();
                    i iVar = this.f54339d;
                    uz.i iVar2 = iVar.f54335d;
                    g0 g0Var = new g0(yVar, b0Var, iVar, this.f54340e, 5);
                    this.f54337b = 1;
                    if (iVar2.collect(g0Var, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, uz.j jVar, vy.d dVar) {
        super(2, dVar);
        this.f54339d = iVar;
        this.f54340e = jVar;
    }
}
