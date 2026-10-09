package iv;

import androidx.lifecycle.ViewModelKt;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mv.n f34767b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(mv.n nVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f34766a = i11;
        this.f34767b = nVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f34766a) {
            case 0:
                return new k(this.f34767b, dVar, 0);
            default:
                return new k(this.f34767b, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f34766a) {
            case 0:
                k kVar = (k) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                kVar.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                k kVar2 = (k) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                kVar2.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f34766a;
        qy.b0 b0Var = qy.b0.f48488a;
        mv.n nVar = this.f34767b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                nVar.getClass();
                rz.e0.B(ViewModelKt.getViewModelScope(nVar), null, null, new mv.l(nVar, null, 0), 3);
                break;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                nVar.a(new mv.g(System.currentTimeMillis()));
                ArrayList requiredAudioKeys = kv.o0.m;
                kotlin.jvm.internal.m.f(requiredAudioKeys, "requiredAudioKeys");
                rz.e0.B(ViewModelKt.getViewModelScope(nVar), null, null, new kb.e(18, nVar, requiredAudioKeys, null), 3);
                break;
        }
        return b0Var;
    }
}
