package d9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f23318b;

    public f(int i11, b bVar) {
        this.f23317a = i11;
        this.f23318b = bVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f23317a, ((f) obj).f23317a);
    }
}
