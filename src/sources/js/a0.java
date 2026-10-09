package js;

import com.lingodeer.data.model.chinesetone.ChineseToneLesson;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChineseToneLesson f36736a;

    public a0(ChineseToneLesson lesson) {
        kotlin.jvm.internal.m.f(lesson, "lesson");
        this.f36736a = lesson;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && kotlin.jvm.internal.m.a(this.f36736a, ((a0) obj).f36736a);
    }

    public final int hashCode() {
        return this.f36736a.hashCode();
    }

    public final String toString() {
        return "Single(lesson=" + this.f36736a + ")";
    }
}
