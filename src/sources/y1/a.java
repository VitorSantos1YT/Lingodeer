package y1;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f56811a;

    public a(List list) {
        this.f56811a = list;
    }

    public final boolean a() {
        List list = this.f56811a;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((b) list.get(i11)).getClass();
        }
        return false;
    }
}
