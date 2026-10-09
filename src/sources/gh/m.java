package gh;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f29226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f29227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f29228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f29229f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, xy.c cVar) {
        super(cVar);
        this.f29228e = oVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f29227d = obj;
        this.f29229f |= Integer.MIN_VALUE;
        return this.f29228e.g(0, 0, this);
    }
}
