package i1;

import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f33977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f33978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f33979c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LifecycleOwner lifecycleOwner, fz.c cVar, fz.a aVar, int i11) {
        super(2);
        this.f33977a = lifecycleOwner;
        this.f33978b = cVar;
        this.f33979c = aVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM = l1.t.M(1);
        d.a(this.f33977a, this.f33978b, this.f33979c, (l1.n) obj, iM);
        return qy.b0.f48488a;
    }
}
