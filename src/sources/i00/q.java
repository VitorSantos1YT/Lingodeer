package i00;

import h00.b0;
import h00.d0;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q extends m {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f33930i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f33931j;

    @Override // i00.m
    public final h00.m L() {
        return new h00.z((LinkedHashMap) this.f33919h);
    }

    @Override // i00.m
    public final void O(h00.m element, String key) {
        kotlin.jvm.internal.m.f(key, "key");
        kotlin.jvm.internal.m.f(element, "element");
        if (!this.f33931j) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f33919h;
            String str = this.f33930i;
            if (str == null) {
                kotlin.jvm.internal.m.n("tag");
                throw null;
            }
            linkedHashMap.put(str, element);
            this.f33931j = true;
            return;
        }
        if (element instanceof d0) {
            this.f33930i = ((d0) element).b();
            this.f33931j = false;
        } else {
            if (element instanceof h00.z) {
                throw j.b(b0.f29914b);
            }
            if (!(element instanceof h00.e)) {
                throw new NoWhenBranchMatchedException();
            }
            throw j.b(h00.g.f29926b);
        }
    }
}
