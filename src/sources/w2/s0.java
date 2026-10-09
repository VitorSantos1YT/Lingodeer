package w2;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface s0 extends s {
    r0 O(int i11, int i12, Map map, fz.c cVar, fz.c cVar2);

    default r0 q0(int i11, int i12, Map map, fz.c cVar) {
        return O(i11, i12, map, null, cVar);
    }
}
