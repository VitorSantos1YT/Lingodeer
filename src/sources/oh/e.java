package oh;

import kotlin.jvm.internal.m;
import mh.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f44917a;

    public e(i lesson) {
        m.f(lesson, "lesson");
        this.f44917a = lesson;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && m.a(this.f44917a, ((e) obj).f44917a);
    }

    public final int hashCode() {
        return this.f44917a.hashCode();
    }

    public final String toString() {
        return "LessonClick(lesson=" + this.f44917a + ")";
    }
}
