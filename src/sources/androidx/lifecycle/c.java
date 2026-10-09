package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediatorLiveData f2029b;

    public /* synthetic */ c(MediatorLiveData mediatorLiveData, int i11) {
        this.f2028a = i11;
        this.f2029b = mediatorLiveData;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f2028a) {
            case 0:
                return CoroutineLiveDataKt.AnonymousClass2.invokeSuspend$lambda$0(this.f2029b, obj);
            case 1:
                return Transformations.switchMap$lambda$3$lambda$2(this.f2029b, obj);
            default:
                return Transformations.AnonymousClass2.onChanged$lambda$0(this.f2029b, obj);
        }
    }
}
