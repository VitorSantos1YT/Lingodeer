package androidx.lifecycle;

import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediatorLiveData f2093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2094c;

    public /* synthetic */ i(MediatorLiveData mediatorLiveData, Object obj, int i11) {
        this.f2092a = i11;
        this.f2093b = mediatorLiveData;
        this.f2094c = obj;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f2092a) {
            case 0:
                return Transformations.map$lambda$0(this.f2093b, (fz.c) this.f2094c, obj);
            case 1:
                return Transformations.distinctUntilChanged$lambda$4(this.f2093b, (u) this.f2094c, obj);
            default:
                return Transformations.map$lambda$1(this.f2093b, (u.a) this.f2094c, obj);
        }
    }
}
