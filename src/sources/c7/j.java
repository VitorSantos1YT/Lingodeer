package c7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6662c;

    public /* synthetic */ j(int i11, int i12, int i13) {
        this.f6660a = i11;
        this.f6661b = i12;
        this.f6662c = i13;
    }

    public j(int i11, int i12) {
        this.f6660a = i11;
        this.f6661b = i11;
        this.f6662c = i12;
        if (i11 == 0) {
            throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
        }
    }
}
