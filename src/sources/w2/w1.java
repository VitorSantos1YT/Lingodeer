package w2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 implements v1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f54600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f54601d;

    public w1(String str) {
        this.f54599b = str;
        this.f54600c = new q(str);
        this.f54601d = new q(str.concat(" maximum"));
    }

    public final String toString() {
        return this.f54599b;
    }
}
