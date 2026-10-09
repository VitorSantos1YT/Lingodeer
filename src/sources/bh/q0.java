package bh;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f4338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f4339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4340e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(l0 l0Var, vy.d dVar) {
        super(dVar);
        this.f4338c = l0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f4336a = obj;
        this.f4337b |= Integer.MIN_VALUE;
        return this.f4338c.emit(null, this);
    }
}
