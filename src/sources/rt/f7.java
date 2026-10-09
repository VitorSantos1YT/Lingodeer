package rt;

import com.lingodeer.data.model.uistate.WordSentenceCharacterType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f7 implements t7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WordSentenceCharacterType f49740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49741b;

    public f7(WordSentenceCharacterType contentType, String folderId) {
        kotlin.jvm.internal.m.f(contentType, "contentType");
        kotlin.jvm.internal.m.f(folderId, "folderId");
        this.f49740a = contentType;
        this.f49741b = folderId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7)) {
            return false;
        }
        f7 f7Var = (f7) obj;
        return kotlin.jvm.internal.m.a(this.f49740a, f7Var.f49740a) && kotlin.jvm.internal.m.a(this.f49741b, f7Var.f49741b);
    }

    public final int hashCode() {
        return this.f49741b.hashCode() + (this.f49740a.hashCode() * 31);
    }

    public final String toString() {
        return "MoveFavoriteToBookmarkFolder(contentType=" + this.f49740a + ", folderId=" + this.f49741b + ")";
    }
}
