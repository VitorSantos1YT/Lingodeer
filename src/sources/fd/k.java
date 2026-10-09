package fd;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f27174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f27175b;

    public k(String str, j jVar, boolean z11) {
        this.f27174a = jVar;
        this.f27175b = z11;
    }

    @Override // fd.b
    public final yc.c a(wc.v vVar, wc.h hVar, gd.c cVar) {
        if (((HashSet) vVar.O.f44522b).contains(wc.w.MergePathsApi19)) {
            return new yc.m(this);
        }
        kd.d.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        return "MergePaths{mode=" + this.f27174a + '}';
    }
}
