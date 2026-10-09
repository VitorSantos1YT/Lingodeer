package n5;

import androidx.datastore.core.NativeSharedCounter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f43302b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(n0 n0Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f43301a = i11;
        this.f43302b = n0Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f43301a) {
            case 0:
                return new j0(this.f43302b, dVar, 0);
            default:
                return new j0(this.f43302b, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f43301a) {
            case 0:
                break;
        }
        return ((j0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f43301a;
        NativeSharedCounter nativeSharedCounter = t0.f43387b;
        n0 n0Var = this.f43302b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return new Integer(nativeSharedCounter.nativeGetCounterValue(((t0) n0Var.f43339i.getValue()).f43388a));
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return new Integer(nativeSharedCounter.nativeIncrementAndGetCounterValue(((t0) n0Var.f43339i.getValue()).f43388a));
        }
    }
}
