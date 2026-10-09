package mw;

import com.google.common.base.Stopwatch;
import com.google.common.base.Supplier;
import java.net.ProxySelector;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i1 implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42447a;

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f42447a) {
            case 0:
                return new Stopwatch();
            default:
                return ProxySelector.getDefault();
        }
    }
}
