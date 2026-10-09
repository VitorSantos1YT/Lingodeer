package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ka implements g2.y, kotlin.jvm.internal.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g6 f30557a;

    public ka(g6 g6Var) {
        this.f30557a = g6Var;
    }

    @Override // g2.y
    public final long a() {
        return ((g2.x) this.f30557a.get()).f28624a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g2.y) || !(obj instanceof kotlin.jvm.internal.g)) {
            return false;
        }
        return this.f30557a.equals(((kotlin.jvm.internal.g) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.g
    public final qy.e getFunctionDelegate() {
        return this.f30557a;
    }

    public final int hashCode() {
        return this.f30557a.hashCode();
    }
}
