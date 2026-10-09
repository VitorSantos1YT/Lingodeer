package rt;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f50352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k8 f50353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f50354c;

    public s(List bookmarkFolders, k8 viewMode, k0 operationResult) {
        kotlin.jvm.internal.m.f(bookmarkFolders, "bookmarkFolders");
        kotlin.jvm.internal.m.f(viewMode, "viewMode");
        kotlin.jvm.internal.m.f(operationResult, "operationResult");
        this.f50352a = bookmarkFolders;
        this.f50353b = viewMode;
        this.f50354c = operationResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return kotlin.jvm.internal.m.a(this.f50352a, sVar.f50352a) && kotlin.jvm.internal.m.a(this.f50353b, sVar.f50353b) && kotlin.jvm.internal.m.a(this.f50354c, sVar.f50354c);
    }

    public final int hashCode() {
        return this.f50354c.hashCode() + ((this.f50353b.hashCode() + (this.f50352a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BookmarkFolderUiInputs(bookmarkFolders=" + this.f50352a + ", viewMode=" + this.f50353b + ", operationResult=" + this.f50354c + ")";
    }
}
