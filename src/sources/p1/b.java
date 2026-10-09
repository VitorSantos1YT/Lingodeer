package p1;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Collection f46250b;

    public /* synthetic */ b(int i11, Collection collection) {
        this.f46249a = i11;
        this.f46250b = collection;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        boolean zContains;
        switch (this.f46249a) {
            case 0:
                zContains = this.f46250b.contains(obj);
                break;
            case 1:
                zContains = this.f46250b.contains(obj);
                break;
            default:
                zContains = ((List) obj).retainAll(this.f46250b);
                break;
        }
        return Boolean.valueOf(zContains);
    }
}
