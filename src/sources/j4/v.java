package j4;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap f36051a;

    public final void a(int i11, u uVar) {
        HashMap map = this.f36051a;
        HashSet hashSet = (HashSet) map.get(Integer.valueOf(i11));
        if (hashSet == null) {
            hashSet = new HashSet();
            map.put(Integer.valueOf(i11), hashSet);
        }
        hashSet.add(new WeakReference(uVar));
    }
}
