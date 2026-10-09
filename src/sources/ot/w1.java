package ot;

/* JADX INFO: loaded from: classes4.dex */
public final class w1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f46034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bh.q f46036c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(bh.q qVar, vy.d dVar) {
        super(dVar);
        this.f46036c = qVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f46034a = obj;
        this.f46035b |= Integer.MIN_VALUE;
        return this.f46036c.emit(null, this);
    }
}
