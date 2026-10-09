package rt;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i5 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f49871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f49872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r5 f49873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f49874d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(r5 r5Var, xy.c cVar) {
        super(cVar);
        this.f49873c = r5Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f49872b = obj;
        this.f49874d |= Integer.MIN_VALUE;
        return r5.c(this.f49873c, null, this);
    }
}
