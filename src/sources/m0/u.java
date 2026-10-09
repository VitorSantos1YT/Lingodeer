package m0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f40634b;

    public u(int i11, List list) {
        this.f40633a = i11;
        this.f40634b = list;
    }

    public u() {
        this.f40633a = 1;
        this.f40634b = Collections.singletonList(null);
    }

    public u(ArrayList arrayList) {
        this.f40633a = 0;
        this.f40634b = arrayList;
    }
}
