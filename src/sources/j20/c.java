package j20;

import a9.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import ob.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f35655b;

    public c(String str, i iVar) {
        this.f35654a = str;
        this.f35655b = iVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        c20.b bVar = (c20.b) this.f35655b.f519c;
        bVar.getClass();
        ConcurrentHashMap concurrentHashMap = bVar.f6514c;
        e20.a aVar = (e20.a) concurrentHashMap.get(this.f35654a);
        if (aVar != null) {
            m mVar = (m) bVar.f6512a.f520d;
            mVar.getClass();
            v10.b[] bVarArr = (v10.b[]) ((ConcurrentHashMap) mVar.f44827c).values().toArray(new v10.b[0]);
            ArrayList arrayList = new ArrayList();
            for (v10.b bVar2 : bVarArr) {
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            concurrentHashMap.remove(aVar.f24766b);
        }
    }
}
