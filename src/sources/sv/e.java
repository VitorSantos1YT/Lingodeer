package sv;

import com.lingodeer.syllable_ko.model.KOSyllableLesson;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KOSyllableLesson f51801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f51802b;

    public e(KOSyllableLesson lesson, boolean z11) {
        kotlin.jvm.internal.m.f(lesson, "lesson");
        this.f51801a = lesson;
        this.f51802b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.m.a(this.f51801a, eVar.f51801a) && this.f51802b == eVar.f51802b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f51802b) + (this.f51801a.hashCode() * 31);
    }

    public final String toString() {
        return "KOSyllableIndexClickLesson(lesson=" + this.f51801a + ", showLife=" + this.f51802b + ")";
    }
}
