package mv;

import hh.p0;
import java.util.List;
import rt.fb;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kv.i0 f42274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f42275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fb f42276c;

    public t(kv.i0 lesson, List characters, fb downloadUiState) {
        kotlin.jvm.internal.m.f(lesson, "lesson");
        kotlin.jvm.internal.m.f(characters, "characters");
        kotlin.jvm.internal.m.f(downloadUiState, "downloadUiState");
        this.f42274a = lesson;
        this.f42275b = characters;
        this.f42276c = downloadUiState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return kotlin.jvm.internal.m.a(this.f42274a, tVar.f42274a) && kotlin.jvm.internal.m.a(this.f42275b, tVar.f42275b) && kotlin.jvm.internal.m.a(this.f42276c, tVar.f42276c);
    }

    public final int hashCode() {
        return this.f42276c.hashCode() + p0.b(this.f42274a.hashCode() * 31, 31, this.f42275b);
    }

    public final String toString() {
        return "Success(lesson=" + this.f42274a + ", characters=" + this.f42275b + ", downloadUiState=" + this.f42276c + ")";
    }
}
