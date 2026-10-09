package ot;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f45774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bh.q f45776c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(bh.q qVar, vy.d dVar) {
        super(dVar);
        this.f45776c = qVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f45774a = obj;
        this.f45775b |= Integer.MIN_VALUE;
        return this.f45776c.emit(null, this);
    }
}
