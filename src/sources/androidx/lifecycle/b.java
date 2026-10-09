package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2027b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f2026a = i11;
        this.f2027b = obj;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f2026a) {
            case 0:
                return CoroutineLiveData._init_$lambda$0((CoroutineLiveData) this.f2027b);
            default:
                return SavedStateHandleSupport.getSavedStateHandlesVM((ViewModelStoreOwner) this.f2027b);
        }
    }
}
