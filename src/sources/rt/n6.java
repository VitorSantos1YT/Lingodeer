package rt;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n6 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f50128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set f50129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f50130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x6 f50131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f50132e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(x6 x6Var, xy.c cVar) {
        super(cVar);
        this.f50131d = x6Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f50130c = obj;
        this.f50132e |= Integer.MIN_VALUE;
        return x6.b(this.f50131d, null, null, this);
    }
}
