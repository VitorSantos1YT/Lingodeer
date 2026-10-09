package fr;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f27714c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, vy.d dVar) {
        super(dVar);
        this.f27714c = oVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f27712a = obj;
        this.f27713b |= Integer.MIN_VALUE;
        return this.f27714c.emit(null, this);
    }
}
