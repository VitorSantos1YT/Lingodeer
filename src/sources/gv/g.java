package gv;

import com.lingodeer.network.model.AssAclResponse;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f29870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AssAclResponse f29871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f29872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f29873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29874e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, xy.c cVar) {
        super(cVar);
        this.f29873d = hVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f29872c = obj;
        this.f29874e |= Integer.MIN_VALUE;
        return h.a(this.f29873d, this);
    }
}
