package ge;

import java.util.ArrayDeque;
import pe.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f29130a;

    public a(int i11) {
        switch (i11) {
            case 1:
                this.f29130a = new ArrayDeque();
                break;
            default:
                char[] cArr = m.f46830a;
                this.f29130a = new ArrayDeque(0);
                break;
        }
    }

    public synchronized void a(sd.c cVar) {
        cVar.f51556b = null;
        cVar.f51557c = null;
        this.f29130a.offer(cVar);
    }
}
