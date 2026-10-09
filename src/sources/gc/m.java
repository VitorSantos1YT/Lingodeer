package gc;

import aj.uZCn.evRpcb;
import java.util.LinkedHashMap;
import ry.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f29058a;

    public m() {
        this.f29058a = new LinkedHashMap();
    }

    public h00.m a(h00.m mVar, String key) {
        kotlin.jvm.internal.m.f(key, "key");
        kotlin.jvm.internal.m.f(mVar, evRpcb.jDqOjLIzfVuq);
        return (h00.m) this.f29058a.put(key, mVar);
    }

    public m(n nVar) {
        this.f29058a = x.k0(nVar.f29060a);
    }
}
