package kr;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f38549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bh.q f38551c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(bh.q qVar, vy.d dVar) {
        super(dVar);
        this.f38551c = qVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f38549a = obj;
        this.f38550b |= Integer.MIN_VALUE;
        return this.f38551c.emit(null, this);
    }
}
