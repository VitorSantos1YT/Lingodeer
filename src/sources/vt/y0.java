package vt;

import rt.zc;

/* JADX INFO: loaded from: classes4.dex */
public final class y0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f54297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f54298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zc f54299c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(zc zcVar, vy.d dVar) {
        super(dVar);
        this.f54299c = zcVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f54297a = obj;
        this.f54298b |= Integer.MIN_VALUE;
        return this.f54299c.emit(null, this);
    }
}
