package m6;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f40902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f40903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f40904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f40905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f40906e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, xy.c cVar) {
        super(cVar);
        this.f40905d = lVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f40904c = obj;
        this.f40906e |= Integer.MIN_VALUE;
        return this.f40905d.b(null, null, this);
    }
}
