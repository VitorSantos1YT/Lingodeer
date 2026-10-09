package rt;

import com.lingodeer.data.model.uistate.WordSentenceCharacterType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s7 implements t7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WordSentenceCharacterType f50379a;

    public s7(WordSentenceCharacterType contentType) {
        kotlin.jvm.internal.m.f(contentType, "contentType");
        this.f50379a = contentType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s7) && kotlin.jvm.internal.m.a(this.f50379a, ((s7) obj).f50379a);
    }

    public final int hashCode() {
        return this.f50379a.hashCode();
    }

    public final String toString() {
        return "ToggleFavorite(contentType=" + this.f50379a + ")";
    }
}
