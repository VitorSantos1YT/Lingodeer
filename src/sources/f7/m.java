package f7;

import com.google.common.base.Supplier;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26841b;

    public /* synthetic */ m(Object obj, int i11) {
        this.f26840a = i11;
        this.f26841b = obj;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f26840a) {
            case 0:
                return (j) this.f26841b;
            case 1:
                return (s7.q) this.f26841b;
            default:
                try {
                    return (p7.a0) ((Class) this.f26841b).getConstructor(null).newInstance(null);
                } catch (Exception e8) {
                    throw new IllegalStateException(e8);
                }
        }
    }
}
