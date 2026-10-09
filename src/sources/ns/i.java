package ns;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f43978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f43979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f43981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f43982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43983f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, xy.c cVar) {
        super(cVar);
        this.f43982e = lVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43981d = obj;
        this.f43983f |= Integer.MIN_VALUE;
        return this.f43982e.a(null, null, null, this);
    }
}
