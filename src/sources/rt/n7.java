package rt;

import com.lingodeer.data.model.uistate.WordSentenceCharacterType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n7 implements t7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WordSentenceCharacterType f50133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50134b;

    public n7(WordSentenceCharacterType contentType, String note) {
        kotlin.jvm.internal.m.f(contentType, "contentType");
        kotlin.jvm.internal.m.f(note, "note");
        this.f50133a = contentType;
        this.f50134b = note;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7)) {
            return false;
        }
        n7 n7Var = (n7) obj;
        return kotlin.jvm.internal.m.a(this.f50133a, n7Var.f50133a) && kotlin.jvm.internal.m.a(this.f50134b, n7Var.f50134b);
    }

    public final int hashCode() {
        return this.f50134b.hashCode() + (this.f50133a.hashCode() * 31);
    }

    public final String toString() {
        return "SaveNote(contentType=" + this.f50133a + ", note=" + this.f50134b + ")";
    }
}
