package bh;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f4377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f4378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4379e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(l0 l0Var, vy.d dVar) {
        super(dVar);
        this.f4377c = l0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f4375a = obj;
        this.f4376b |= Integer.MIN_VALUE;
        return this.f4377c.emit(null, this);
    }
}
