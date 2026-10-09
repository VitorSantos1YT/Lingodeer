package fr;

/* JADX INFO: loaded from: classes3.dex */
public final class e4 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f27488c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(o oVar, vy.d dVar) {
        super(dVar);
        this.f27488c = oVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f27486a = obj;
        this.f27487b |= Integer.MIN_VALUE;
        return this.f27488c.emit(null, this);
    }
}
