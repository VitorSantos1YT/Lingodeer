package rt;

import com.lingodeer.data.model.uistate.WordSentenceCharacterType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k7 implements t7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WordSentenceCharacterType f49976a;

    public k7(WordSentenceCharacterType contentType) {
        kotlin.jvm.internal.m.f(contentType, "contentType");
        this.f49976a = contentType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k7) && kotlin.jvm.internal.m.a(this.f49976a, ((k7) obj).f49976a);
    }

    public final int hashCode() {
        return this.f49976a.hashCode();
    }

    public final String toString() {
        return "OnPlayAudio(contentType=" + this.f49976a + ")";
    }
}
