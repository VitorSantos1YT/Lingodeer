package ia;

import bh.q;

/* JADX INFO: loaded from: classes.dex */
public final class a extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f34277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f34279c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(q qVar, vy.d dVar) {
        super(dVar);
        this.f34279c = qVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f34277a = obj;
        this.f34278b |= Integer.MIN_VALUE;
        return this.f34279c.emit(null, this);
    }
}
