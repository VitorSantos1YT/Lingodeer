package vd;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f53921b = new n(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f53922c = new n(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f53923d = new n(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53924a;

    public /* synthetic */ n(int i11) {
        this.f53924a = i11;
    }

    public final boolean a(td.a aVar) {
        switch (this.f53924a) {
            case 0:
                return false;
            case 1:
                return (aVar == td.a.DATA_DISK_CACHE || aVar == td.a.MEMORY_CACHE) ? false : true;
            default:
                return aVar == td.a.REMOTE;
        }
    }
}
