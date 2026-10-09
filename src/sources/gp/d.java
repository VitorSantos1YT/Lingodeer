package gp;

import com.lingodeer.database.model.LanguageHistoryEntity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LanguageHistoryEntity f29358a;

    public d(LanguageHistoryEntity languageHistoryEntity) {
        this.f29358a = languageHistoryEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && kotlin.jvm.internal.m.a(this.f29358a, ((d) obj).f29358a);
    }

    public final int hashCode() {
        return this.f29358a.hashCode();
    }

    public final String toString() {
        return "Delete(entity=" + this.f29358a + ")";
    }
}
