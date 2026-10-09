package rt;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f49472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f49473b;

    public b0(List folders, p operationResult) {
        kotlin.jvm.internal.m.f(folders, "folders");
        kotlin.jvm.internal.m.f(operationResult, "operationResult");
        this.f49472a = folders;
        this.f49473b = operationResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return kotlin.jvm.internal.m.a(this.f49472a, b0Var.f49472a) && kotlin.jvm.internal.m.a(this.f49473b, b0Var.f49473b);
    }

    public final int hashCode() {
        return this.f49473b.hashCode() + (this.f49472a.hashCode() * 31);
    }

    public final String toString() {
        return "CourseBookmarkFolderListUiState(folders=" + this.f49472a + ", operationResult=" + this.f49473b + ")";
    }
}
