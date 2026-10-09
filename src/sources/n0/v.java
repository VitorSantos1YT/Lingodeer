package n0;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ij.d f43008b;

    public /* synthetic */ v(ij.d dVar, int i11) {
        this.f43007a = i11;
        this.f43008b = dVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f43007a) {
            case 0:
                Object key = ((e0) obj).getKey();
                ij.d dVar = this.f43008b;
                return qx.b.i(Integer.valueOf(dVar.l(key)), Integer.valueOf(dVar.l(((e0) obj2).getKey())));
            case 1:
                Object key2 = ((e0) obj).getKey();
                ij.d dVar2 = this.f43008b;
                return qx.b.i(Integer.valueOf(dVar2.l(key2)), Integer.valueOf(dVar2.l(((e0) obj2).getKey())));
            case 2:
                Object key3 = ((e0) obj2).getKey();
                ij.d dVar3 = this.f43008b;
                return qx.b.i(Integer.valueOf(dVar3.l(key3)), Integer.valueOf(dVar3.l(((e0) obj).getKey())));
            default:
                Object key4 = ((e0) obj2).getKey();
                ij.d dVar4 = this.f43008b;
                return qx.b.i(Integer.valueOf(dVar4.l(key4)), Integer.valueOf(dVar4.l(((e0) obj).getKey())));
        }
    }
}
