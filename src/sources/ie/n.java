package ie;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f34402a;

    public n(o oVar) {
        this.f34402a = oVar;
    }

    @Override // ie.a
    public final void a(boolean z11) {
        ArrayList arrayList;
        pe.m.a();
        synchronized (this.f34402a) {
            arrayList = new ArrayList((HashSet) this.f34402a.f34407d);
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((a) obj).a(z11);
        }
    }
}
