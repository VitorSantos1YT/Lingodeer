package au;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends xy.i implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f2970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2971d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(f0 f0Var, ArrayList arrayList, vy.d dVar, int i11) {
        super(1, dVar);
        this.f2968a = i11;
        this.f2970c = f0Var;
        this.f2971d = arrayList;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        switch (this.f2968a) {
            case 0:
                return new d0(this.f2970c, this.f2971d, dVar, 0);
            default:
                return new d0(this.f2970c, this.f2971d, dVar, 1);
        }
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        vy.d dVar = (vy.d) obj;
        switch (this.f2968a) {
            case 0:
                break;
        }
        return ((d0) create(dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f2968a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f2969b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f2969b = 1;
                    if (f0.a(this.f2970c, this.f2971d, this) == aVar) {
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
                int i12 = this.f2969b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f2969b = 1;
                    if (f0.c(this.f2970c, this.f2971d, this) == aVar2) {
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
}
