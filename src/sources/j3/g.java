package j3;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35696a;

    public /* synthetic */ g(int i11) {
        this.f35696a = i11;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f35696a) {
            case 0:
                break;
        }
        return qx.b.i(Integer.valueOf(((f) obj).f35690b), Integer.valueOf(((f) obj2).f35690b));
    }
}
