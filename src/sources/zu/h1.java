package zu;

import rt.zc;

/* JADX INFO: loaded from: classes4.dex */
public final class h1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f59431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f59432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zc f59433c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(zc zcVar, vy.d dVar) {
        super(dVar);
        this.f59433c = zcVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f59431a = obj;
        this.f59432b |= Integer.MIN_VALUE;
        return this.f59433c.emit(null, this);
    }
}
