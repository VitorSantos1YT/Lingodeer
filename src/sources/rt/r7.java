package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r7 implements t7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8 f50342a;

    public r7(r8 practiceModel) {
        kotlin.jvm.internal.m.f(practiceModel, "practiceModel");
        this.f50342a = practiceModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r7) && this.f50342a == ((r7) obj).f50342a;
    }

    public final int hashCode() {
        return this.f50342a.hashCode();
    }

    public final String toString() {
        return "SelectPracticeModeChooserModel(practiceModel=" + this.f50342a + ")";
    }
}
