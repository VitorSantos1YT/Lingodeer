package l2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f39533c;

    public a0(float f5) {
        super(3);
        this.f39533c = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Float.compare(this.f39533c, ((a0) obj).f39533c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f39533c);
    }

    public final String toString() {
        return defpackage.e.o(new StringBuilder("VerticalTo(y="), this.f39533c, ')');
    }
}
