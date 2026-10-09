package wt;

import rt.zc;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f55283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f55284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zc f55285c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(zc zcVar, vy.d dVar) {
        super(dVar);
        this.f55285c = zcVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f55283a = obj;
        this.f55284b |= Integer.MIN_VALUE;
        return this.f55285c.emit(null, this);
    }
}
