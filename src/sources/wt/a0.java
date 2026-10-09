package wt;

import rt.zc;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f55232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f55233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zc f55234c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(zc zcVar, vy.d dVar) {
        super(dVar);
        this.f55234c = zcVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f55232a = obj;
        this.f55233b |= Integer.MIN_VALUE;
        return this.f55234c.emit(null, this);
    }
}
