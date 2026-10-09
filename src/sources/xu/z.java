package xu;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f56574b;

    public /* synthetic */ z(int i11, List list) {
        this.f56573a = i11;
        this.f56574b = list;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f56573a) {
            case 0:
                this.f56574b.get(((Number) obj).intValue());
                break;
            default:
                this.f56574b.get(((Number) obj).intValue());
                break;
        }
        return null;
    }
}
