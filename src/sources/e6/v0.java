package e6;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f25058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f25060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f25061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25062e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(x xVar, xy.c cVar) {
        super(cVar);
        this.f25061d = xVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f25060c = obj;
        this.f25062e |= Integer.MIN_VALUE;
        return this.f25061d.b(null, 0, this);
    }
}
