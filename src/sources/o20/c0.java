package o20;

import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends c1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f44498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c1 f44499d;

    public /* synthetic */ c0(c1 c1Var, int i11) {
        this.f44498c = i11;
        this.f44499d = c1Var;
    }

    @Override // o20.c1
    public final void a(q0 q0Var, Object obj) {
        switch (this.f44498c) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        this.f44499d.a(q0Var, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i11 = 0; i11 < length; i11++) {
                        this.f44499d.a(q0Var, Array.get(obj, i11));
                    }
                    break;
                }
                break;
        }
    }
}
