package ot;

/* JADX INFO: loaded from: classes4.dex */
public final class y1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f46055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0.d0 f46057c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(a0.d0 d0Var, vy.d dVar) {
        super(dVar);
        this.f46057c = d0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f46055a = obj;
        this.f46056b |= Integer.MIN_VALUE;
        return this.f46057c.emit(null, this);
    }
}
