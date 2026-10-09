package dt;

import com.lingodeer.data.model.uistate.WordSentenceCharacterType;
import rt.dc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dc f24410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WordSentenceCharacterType f24411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fz.c f24412c;

    public z1(dc uiState, WordSentenceCharacterType wordSentenceCharacterType, fz.c onSave) {
        kotlin.jvm.internal.m.f(uiState, "uiState");
        kotlin.jvm.internal.m.f(onSave, "onSave");
        this.f24410a = uiState;
        this.f24411b = wordSentenceCharacterType;
        this.f24412c = onSave;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return kotlin.jvm.internal.m.a(this.f24410a, z1Var.f24410a) && kotlin.jvm.internal.m.a(this.f24411b, z1Var.f24411b) && kotlin.jvm.internal.m.a(this.f24412c, z1Var.f24412c);
    }

    public final int hashCode() {
        return this.f24412c.hashCode() + ((this.f24411b.hashCode() + (this.f24410a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CourseTestKnowledgeNoteActions(uiState=" + this.f24410a + ", contentType=" + this.f24411b + ", onSave=" + this.f24412c + ")";
    }
}
