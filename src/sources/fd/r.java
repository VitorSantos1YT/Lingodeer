package fd;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f27204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f27205c;

    public r(String str, List list, boolean z11) {
        this.f27203a = str;
        this.f27204b = list;
        this.f27205c = z11;
    }

    @Override // fd.b
    public final yc.c a(wc.v vVar, wc.h hVar, gd.c cVar) {
        return new yc.d(vVar, cVar, this, hVar);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f27203a + "' Shapes: " + Arrays.toString(this.f27204b.toArray()) + '}';
    }
}
