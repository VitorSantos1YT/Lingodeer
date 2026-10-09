package ep;

import java.util.HashMap;
import java.util.LinkedList;
import uv.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends uv.d {
    @Override // uv.d
    public final void a() {
        f10.e.b().f(new np.a());
    }

    @Override // uv.d
    public final void b() {
        f10.e.b().f(new np.a());
        r rVar = uv.e.f53205a;
        LinkedList linkedList = (LinkedList) ((HashMap) rVar.f53231b).get("event.service.connect.changed");
        if (linkedList == null) {
            synchronized ("event.service.connect.changed".intern()) {
                linkedList = (LinkedList) ((HashMap) rVar.f53231b).get("event.service.connect.changed");
            }
        }
        if (linkedList != null) {
            synchronized ("event.service.connect.changed".intern()) {
                try {
                    linkedList.remove(this);
                    if (linkedList.size() <= 0) {
                        ((HashMap) rVar.f53231b).remove("event.service.connect.changed");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
