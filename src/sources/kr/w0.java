package kr;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f38605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bh.q f38607c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(bh.q qVar, vy.d dVar) {
        super(dVar);
        this.f38607c = qVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f38605a = obj;
        this.f38606b |= Integer.MIN_VALUE;
        return this.f38607c.emit(null, this);
    }
}
