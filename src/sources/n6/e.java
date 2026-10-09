package n6;

import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f43452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f43453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f43454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43455d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, xy.c cVar) {
        super(cVar);
        this.f43454c = fVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43453b = obj;
        this.f43455d |= Integer.MIN_VALUE;
        return this.f43454c.d(null, null, null, null, this);
    }
}
