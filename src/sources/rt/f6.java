package rt;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f6 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map f49735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f49736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f49737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g6 f49738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f49739e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(g6 g6Var, xy.c cVar) {
        super(cVar);
        this.f49738d = g6Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f49737c = obj;
        this.f49739e |= Integer.MIN_VALUE;
        return this.f49738d.b(null, null, this);
    }
}
