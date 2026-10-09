package gq;

import android.net.NetworkRequest;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f29591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f29592d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(i iVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f29589a = i11;
        this.f29592d = iVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f29589a) {
            case 0:
                g gVar = new g(this.f29592d, dVar, 0);
                gVar.f29591c = obj;
                return gVar;
            default:
                g gVar2 = new g(this.f29592d, dVar, 1);
                gVar2.f29591c = obj;
                return gVar2;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29589a) {
            case 0:
                return ((g) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((g) create((tz.t) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f29589a) {
            case 0:
                uz.j jVar = (uz.j) this.f29591c;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f29590b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
                    i iVar = this.f29592d;
                    uVar.f38357a = iVar.a();
                    uz.i iVarO = x0.o(x0.g(new g(iVar, null, 1)));
                    f fVar = new f(uVar, jVar, 0);
                    this.f29591c = null;
                    this.f29590b = 1;
                    if (iVarO.collect(fVar, this) == aVar) {
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
                tz.t tVar = (tz.t) this.f29591c;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f29590b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    i iVar2 = this.f29592d;
                    h hVar = new h(iVar2, tVar);
                    new NetworkRequest.Builder().addCapability(12).build();
                    tz.s sVar = (tz.s) tVar;
                    sVar.i(Boolean.valueOf(iVar2.a()));
                    iVar2.f29595a.registerDefaultNetworkCallback(hVar);
                    fp.f fVar2 = new fp.f(4, iVar2, hVar);
                    this.f29591c = null;
                    this.f29590b = 1;
                    if (se.k.i(sVar, fVar2, this) == aVar2) {
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
