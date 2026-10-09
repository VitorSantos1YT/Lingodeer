package z2;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 implements y2.u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f58562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f58563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Float f58564c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Float f58565d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g3.l f58566e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g3.l f58567f = null;

    public g2(int i11, ArrayList arrayList) {
        this.f58562a = i11;
        this.f58563b = arrayList;
    }

    @Override // y2.u1
    public final boolean r() {
        return this.f58563b.contains(this);
    }
}
