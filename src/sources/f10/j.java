package f10;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ArrayList f26548d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f26549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f26550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f26551c;

    public static j a(o oVar, Object obj) {
        ArrayList arrayList = f26548d;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                if (size <= 0) {
                    j jVar = new j();
                    jVar.f26549a = obj;
                    jVar.f26550b = oVar;
                    return jVar;
                }
                j jVar2 = (j) arrayList.remove(size - 1);
                jVar2.f26549a = obj;
                jVar2.f26550b = oVar;
                jVar2.f26551c = null;
                return jVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
