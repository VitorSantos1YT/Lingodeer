package ot;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f45865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bh.q f45867c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(bh.q qVar, vy.d dVar) {
        super(dVar);
        this.f45867c = qVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f45865a = obj;
        this.f45866b |= Integer.MIN_VALUE;
        return this.f45867c.emit(null, this);
    }
}
