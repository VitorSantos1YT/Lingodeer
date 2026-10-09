package qg;

import java.util.ArrayList;
import ry.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a10.c f47728a;

    public c() {
        a10.c cVar = new a10.c();
        int i11 = 0;
        ArrayList arrayListT = l.T(new p00.a[]{new s00.b(1), new s00.b(0), new q00.a()});
        int size = arrayListT.size();
        while (i11 < size) {
            Object obj = arrayListT.get(i11);
            i11++;
            p00.a aVar = (p00.a) obj;
            if (aVar instanceof a10.d) {
                ((a10.d) aVar).a(cVar);
            }
        }
        this.f47728a = new a10.c(cVar);
    }
}
