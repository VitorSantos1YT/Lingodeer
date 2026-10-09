package fr;

/* JADX INFO: loaded from: classes3.dex */
public final class u3 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bh.q f27895c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(bh.q qVar, vy.d dVar) {
        super(dVar);
        this.f27895c = qVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f27893a = obj;
        this.f27894b |= Integer.MIN_VALUE;
        return this.f27895c.emit(null, this);
    }
}
