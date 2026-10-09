package bh;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f4314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uz.j f4315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4316e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(l0 l0Var, vy.d dVar) {
        super(dVar);
        this.f4314c = l0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f4312a = obj;
        this.f4313b |= Integer.MIN_VALUE;
        return this.f4314c.emit(null, this);
    }
}
