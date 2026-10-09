package fr;

/* JADX INFO: loaded from: classes3.dex */
public final class c4 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f27449c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(o oVar, vy.d dVar) {
        super(dVar);
        this.f27449c = oVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f27447a = obj;
        this.f27448b |= Integer.MIN_VALUE;
        return this.f27449c.emit(null, this);
    }
}
