package gp;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f29502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bh.e0 f29504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f29505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29506e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(bh.e0 e0Var, vy.d dVar) {
        super(dVar);
        this.f29504c = e0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f29502a = obj;
        this.f29503b |= Integer.MIN_VALUE;
        return this.f29504c.emit(null, this);
    }
}
