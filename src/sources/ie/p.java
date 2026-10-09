package ie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f34408a = Collections.newSetFromMap(new WeakHashMap());

    @Override // ie.i
    public final void a() {
        ArrayList arrayListE = pe.m.e(this.f34408a);
        int size = arrayListE.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayListE.get(i11);
            i11++;
            ((me.d) obj).a();
        }
    }

    @Override // ie.i
    public final void onDestroy() {
        ArrayList arrayListE = pe.m.e(this.f34408a);
        int size = arrayListE.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayListE.get(i11);
            i11++;
            ((me.d) obj).onDestroy();
        }
    }

    @Override // ie.i
    public final void onStart() {
        ArrayList arrayListE = pe.m.e(this.f34408a);
        int size = arrayListE.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayListE.get(i11);
            i11++;
            ((me.d) obj).onStart();
        }
    }
}
