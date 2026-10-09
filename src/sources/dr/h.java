package dr;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends xy.c {
    public int H;
    public /* synthetic */ Object K;
    public final /* synthetic */ k L;
    public int M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map f23543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f23544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f23545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23548f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f23549t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, xy.c cVar) {
        super(cVar);
        this.L = kVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.K = obj;
        this.M |= Integer.MIN_VALUE;
        return k.b(this.L, null, this);
    }
}
