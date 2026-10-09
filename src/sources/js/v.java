package js;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class v extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f36836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f36837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1.b f36838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36839d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(b1.b bVar, vy.d dVar) {
        super(dVar);
        this.f36838c = bVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f36837b = obj;
        this.f36839d |= Integer.MIN_VALUE;
        return this.f36838c.f(null, this);
    }
}
