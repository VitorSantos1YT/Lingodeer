package v5;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53521a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f53522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f53523c;

    public h(o20.w wVar, int i11) {
        this.f53523c = wVar;
        this.f53522b = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53521a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f53523c;
                int size = arrayList.size();
                int i11 = 0;
                if (this.f53522b == 1) {
                    while (i11 < size) {
                        ((g) arrayList.get(i11)).b();
                        i11++;
                    }
                } else {
                    while (i11 < size) {
                        ((g) arrayList.get(i11)).a();
                        i11++;
                    }
                }
                break;
            default:
                q4.a aVar = (q4.a) ((o20.w) this.f53523c).f44617b;
                if (aVar != null) {
                    aVar.i(this.f53522b);
                }
                break;
        }
    }

    public h(List list, int i11, Throwable th2) {
        ns.o.l(list, "initCallbacks cannot be null");
        this.f53523c = new ArrayList(list);
        this.f53522b = i11;
    }
}
