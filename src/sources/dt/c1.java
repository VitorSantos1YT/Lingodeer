package dt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fz.a f23696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fz.c f23697c;

    public c1(boolean z11, fz.a onChangeFolder, fz.c onPopupLayerActiveChanged) {
        kotlin.jvm.internal.m.f(onChangeFolder, "onChangeFolder");
        kotlin.jvm.internal.m.f(onPopupLayerActiveChanged, "onPopupLayerActiveChanged");
        this.f23695a = z11;
        this.f23696b = onChangeFolder;
        this.f23697c = onPopupLayerActiveChanged;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return this.f23695a == c1Var.f23695a && kotlin.jvm.internal.m.a(this.f23696b, c1Var.f23696b) && kotlin.jvm.internal.m.a(this.f23697c, c1Var.f23697c);
    }

    public final int hashCode() {
        return this.f23697c.hashCode() + ((this.f23696b.hashCode() + (Boolean.hashCode(this.f23695a) * 31)) * 31);
    }

    public final String toString() {
        return "CourseTestBookmarkDefaultHintActions(show=" + this.f23695a + ", onChangeFolder=" + this.f23696b + ", onPopupLayerActiveChanged=" + this.f23697c + ")";
    }
}
