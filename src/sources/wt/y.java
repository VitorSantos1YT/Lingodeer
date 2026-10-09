package wt;

import rt.zc;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f55363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f55364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zc f55365c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(zc zcVar, vy.d dVar) {
        super(dVar);
        this.f55365c = zcVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f55363a = obj;
        this.f55364b |= Integer.MIN_VALUE;
        return this.f55365c.emit(null, this);
    }
}
