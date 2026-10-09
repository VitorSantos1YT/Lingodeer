package ds;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f23595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f23596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f23597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23598d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g gVar, xy.c cVar) {
        super(cVar);
        this.f23597c = gVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f23596b = obj;
        this.f23598d |= Integer.MIN_VALUE;
        return this.f23597c.a(null, this);
    }
}
