package vt;

import rt.zc;

/* JADX INFO: loaded from: classes4.dex */
public final class x0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f54294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f54295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zc f54296c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(zc zcVar, vy.d dVar) {
        super(dVar);
        this.f54296c = zcVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f54294a = obj;
        this.f54295b |= Integer.MIN_VALUE;
        return this.f54296c.emit(null, this);
    }
}
