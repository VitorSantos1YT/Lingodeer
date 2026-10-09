package n5;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0 implements rz.q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f43347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f43348c;

    public /* synthetic */ o0(int i11, Object obj, Object obj2) {
        this.f43346a = i11;
        this.f43347b = obj;
        this.f43348c = obj2;
    }

    @Override // rz.q0
    public final void dispose() {
        switch (this.f43346a) {
            case 0:
                String str = (String) this.f43347b;
                a0.e eVar = (a0.e) this.f43348c;
                synchronized (p0.f43354b) {
                    LinkedHashMap linkedHashMap = p0.f43355c;
                    p0 p0Var = (p0) linkedHashMap.get(str);
                    if (p0Var != null) {
                        p0Var.f43356a.remove(eVar);
                        if (p0Var.f43356a.isEmpty()) {
                            linkedHashMap.remove(str);
                            p0Var.stopWatching();
                        }
                    }
                    break;
                }
                return;
            default:
                sz.c cVar = (sz.c) this.f43347b;
                cVar.f51958a.removeCallbacks((Runnable) this.f43348c);
                return;
        }
    }
}
