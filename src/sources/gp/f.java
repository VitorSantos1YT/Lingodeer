package gp;

import com.lingodeer.database.model.LanguageHistoryEntity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LanguageHistoryEntity f29371a;

    public f(LanguageHistoryEntity languageHistoryEntity) {
        this.f29371a = languageHistoryEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && kotlin.jvm.internal.m.a(this.f29371a, ((f) obj).f29371a);
    }

    public final int hashCode() {
        return this.f29371a.hashCode();
    }

    public final String toString() {
        return "UpdateTimestamp(entity=" + this.f29371a + ")";
    }
}
