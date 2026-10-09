package o20;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends b {
    @Override // o20.b
    public final List a(Executor executor) {
        return Arrays.asList(new k(0), new o(executor));
    }

    @Override // o20.b
    public final List b() {
        return Collections.singletonList(new c(1));
    }
}
