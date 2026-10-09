package g3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fz.a f28657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fz.a f28658b;

    public l(fz.a aVar, fz.a aVar2) {
        this.f28657a = aVar;
        this.f28658b = aVar2;
    }

    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.f28657a.invoke()).floatValue() + ", maxValue=" + ((Number) this.f28658b.invoke()).floatValue() + ", reverseScrolling=false)";
    }
}
