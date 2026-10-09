package ph;

import qy.b0;
import uz.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements uz.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0 f46864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f46865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f46866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f46867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f46868e;

    public g(q0 q0Var, String str, kotlin.jvm.internal.y yVar, k kVar, boolean z11) {
        this.f46864a = q0Var;
        this.f46865b = str;
        this.f46866c = yVar;
        this.f46867d = kVar;
        this.f46868e = z11;
    }

    @Override // uz.i
    public final Object collect(uz.j jVar, vy.d dVar) {
        Object objCollect = this.f46864a.f53384a.collect(new f(jVar, this.f46865b, this.f46866c, this.f46867d, this.f46868e), dVar);
        return objCollect == wy.a.COROUTINE_SUSPENDED ? objCollect : b0.f48488a;
    }
}
