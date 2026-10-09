package pl;

import fv.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f46947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f46948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f46949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46950d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, xy.c cVar) {
        super(cVar);
        this.f46949c = dVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f46948b = obj;
        this.f46950d |= Integer.MIN_VALUE;
        return this.f46949c.a(null, null, null, null, this);
    }
}
