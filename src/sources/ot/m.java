package ot;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f45888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bh.q f45890c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(bh.q qVar, vy.d dVar) {
        super(dVar);
        this.f45890c = qVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f45888a = obj;
        this.f45889b |= Integer.MIN_VALUE;
        return this.f45890c.emit(null, this);
    }
}
