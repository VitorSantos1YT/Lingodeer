package ph;

import qy.b0;
import uz.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class w implements uz.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0 f46924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mh.b f46925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f46926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f46927d;

    public w(q0 q0Var, mh.b bVar, a0 a0Var, boolean z11) {
        this.f46924a = q0Var;
        this.f46925b = bVar;
        this.f46926c = a0Var;
        this.f46927d = z11;
    }

    @Override // uz.i
    public final Object collect(uz.j jVar, vy.d dVar) {
        Object objCollect = this.f46924a.f53384a.collect(new v(jVar, this.f46925b, this.f46926c, this.f46927d), dVar);
        return objCollect == wy.a.COROUTINE_SUSPENDED ? objCollect : b0.f48488a;
    }
}
