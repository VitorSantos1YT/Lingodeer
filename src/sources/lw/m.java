package lw;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f40415b = new m(new k(2), k.f40407b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f40416a = new ConcurrentHashMap();

    public m(l... lVarArr) {
        for (l lVar : lVarArr) {
            this.f40416a.put(lVar.f(), lVar);
        }
    }
}
