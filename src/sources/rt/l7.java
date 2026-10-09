package rt;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l7 implements t7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f50018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f50019b;

    public l7(List selectedContents, List practiceModels) {
        kotlin.jvm.internal.m.f(selectedContents, "selectedContents");
        kotlin.jvm.internal.m.f(practiceModels, "practiceModels");
        this.f50018a = selectedContents;
        this.f50019b = practiceModels;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7)) {
            return false;
        }
        l7 l7Var = (l7) obj;
        return kotlin.jvm.internal.m.a(this.f50018a, l7Var.f50018a) && kotlin.jvm.internal.m.a(this.f50019b, l7Var.f50019b);
    }

    public final int hashCode() {
        return this.f50019b.hashCode() + (this.f50018a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenPracticeModeChooser(selectedContents=" + this.f50018a + ", practiceModels=" + this.f50019b + ")";
    }
}
