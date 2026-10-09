package rt;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f49548a;

    static {
        yy.a aVarB = wt.c0.b();
        int iW = ry.x.W(ry.n.W(aVarB, 10));
        if (iW < 16) {
            iW = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
        for (Object obj : aVarB) {
            linkedHashMap.put(obj, new qy.l(0, wt.t.MIN));
        }
        f49548a = linkedHashMap;
    }
}
