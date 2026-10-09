package js;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f36740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f36741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f36742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1.b f36743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36744e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b1.b bVar, vy.d dVar) {
        super(dVar);
        this.f36743d = bVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f36742c = obj;
        this.f36744e |= Integer.MIN_VALUE;
        return this.f36743d.f(null, this);
    }
}
