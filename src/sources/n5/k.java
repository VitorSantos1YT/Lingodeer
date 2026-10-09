package n5;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f43304b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(v vVar, int i11) {
        super(0);
        this.f43303a = i11;
        this.f43304b = vVar;
    }

    @Override // fz.a
    public final Object invoke() throws IOException {
        switch (this.f43303a) {
            case 0:
                return ((c0) this.f43304b.f43407j.getValue()).f43253c;
            default:
                z zVar = this.f43304b.f43398a;
                File canonicalFile = ((File) zVar.f43433c.invoke()).getCanonicalFile();
                synchronized (z.f43430e) {
                    String path = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = z.f43429d;
                    if (linkedHashSet.contains(path)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    kotlin.jvm.internal.m.e(path, "path");
                    linkedHashSet.add(path);
                }
                return new c0(canonicalFile, zVar.f43431a, (g0) zVar.f43432b.invoke(canonicalFile), new a0.c0(canonicalFile, 20));
        }
    }
}
