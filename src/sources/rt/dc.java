package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class dc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f49635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49636b;

    public dc(boolean z11, String str) {
        this.f49635a = z11;
        this.f49636b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc)) {
            return false;
        }
        dc dcVar = (dc) obj;
        return this.f49635a == dcVar.f49635a && this.f49636b.equals(dcVar.f49636b);
    }

    public final int hashCode() {
        return this.f49636b.hashCode() + (Boolean.hashCode(this.f49635a) * 31);
    }

    public final String toString() {
        return "CourseTestKnowledgeNoteUiState(showNote=" + this.f49635a + ", note=" + this.f49636b + ")";
    }
}
