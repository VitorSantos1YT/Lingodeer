package bc;

import kotlin.jvm.internal.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends xy.c {
    public y H;
    public /* synthetic */ Object K;
    public final /* synthetic */ g L;
    public int M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f4086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public gc.i f4087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f4088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f4089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y f4090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y f4091f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public y f4092t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, xy.c cVar) {
        super(cVar);
        this.L = gVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.K = obj;
        this.M |= Integer.MIN_VALUE;
        return g.b(this.L, null, null, null, null, this);
    }
}
