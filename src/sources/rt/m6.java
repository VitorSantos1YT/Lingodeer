package rt;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m6 extends xy.c {
    public int H;
    public /* synthetic */ Object K;
    public final /* synthetic */ x6 L;
    public int M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f50059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set f50060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinkedHashMap f50061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f50062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinkedHashMap f50063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f50064f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f50065t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(x6 x6Var, xy.c cVar) {
        super(cVar);
        this.L = x6Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.K = obj;
        this.M |= Integer.MIN_VALUE;
        return x6.a(this.L, null, null, this);
    }
}
