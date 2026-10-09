package ct;

import com.bumptech.glide.e;
import qy.b0;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends i implements fz.c {
    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        return new a(1, dVar);
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        a aVar = (a) create((vy.d) obj);
        b0 b0Var = b0.f48488a;
        aVar.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        e.F(obj);
        return b0.f48488a;
    }
}
