package bh;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f4224c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(e0 e0Var, vy.d dVar) {
        super(dVar);
        this.f4224c = e0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f4222a = obj;
        this.f4223b |= Integer.MIN_VALUE;
        return this.f4224c.emit(null, this);
    }
}
