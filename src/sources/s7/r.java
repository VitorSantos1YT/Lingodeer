package s7;

import y6.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f51459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f51460b;

    public r(int i11, p0 p0Var, int[] iArr) {
        if (iArr.length == 0) {
            b7.a.p("Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f51459a = p0Var;
        this.f51460b = iArr;
    }
}
