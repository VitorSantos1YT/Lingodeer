package vd;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f53939a;

    public r(ArrayList arrayList) {
        this.f53939a = arrayList;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f53939a.iterator();
    }
}
