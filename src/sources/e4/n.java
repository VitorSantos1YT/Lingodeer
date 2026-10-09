package e4;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t f24814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f24815b;

    public static long a(g gVar, long j11) {
        t tVar = gVar.f24802d;
        ArrayList arrayList = gVar.f24809k;
        if (tVar instanceof k) {
            return j11;
        }
        int size = arrayList.size();
        long jMin = j11;
        for (int i11 = 0; i11 < size; i11++) {
            d dVar = (d) arrayList.get(i11);
            if (dVar instanceof g) {
                g gVar2 = (g) dVar;
                if (gVar2.f24802d != tVar) {
                    jMin = Math.min(jMin, a(gVar2, ((long) gVar2.f24804f) + j11));
                }
            }
        }
        g gVar3 = tVar.f24834i;
        g gVar4 = tVar.f24833h;
        if (gVar != gVar3) {
            return jMin;
        }
        long j12 = j11 - tVar.j();
        return Math.min(Math.min(jMin, a(gVar4, j12)), j12 - ((long) gVar4.f24804f));
    }

    public static long b(g gVar, long j11) {
        t tVar = gVar.f24802d;
        ArrayList arrayList = gVar.f24809k;
        if (tVar instanceof k) {
            return j11;
        }
        int size = arrayList.size();
        long jMax = j11;
        for (int i11 = 0; i11 < size; i11++) {
            d dVar = (d) arrayList.get(i11);
            if (dVar instanceof g) {
                g gVar2 = (g) dVar;
                if (gVar2.f24802d != tVar) {
                    jMax = Math.max(jMax, b(gVar2, ((long) gVar2.f24804f) + j11));
                }
            }
        }
        g gVar3 = tVar.f24833h;
        g gVar4 = tVar.f24834i;
        if (gVar != gVar3) {
            return jMax;
        }
        long j12 = tVar.j() + j11;
        return Math.max(Math.max(jMax, b(gVar4, j12)), j12 - ((long) gVar4.f24804f));
    }
}
