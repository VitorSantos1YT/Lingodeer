package dy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f24620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f24623d;

    public v(Runnable runnable, Long l9, int i11) {
        this.f24620a = runnable;
        this.f24621b = l9.longValue();
        this.f24622c = i11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        v vVar = (v) obj;
        int iCompare = Long.compare(this.f24621b, vVar.f24621b);
        return iCompare == 0 ? Integer.compare(this.f24622c, vVar.f24622c) : iCompare;
    }
}
