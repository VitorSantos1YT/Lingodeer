package js;

import com.lingodeer.data.model.chinesetone.ChineseToneUnit;
import hh.p0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class t implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChineseToneUnit f36833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f36834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f36835c;

    public t(ChineseToneUnit unit, List entries, Long l9) {
        kotlin.jvm.internal.m.f(unit, "unit");
        kotlin.jvm.internal.m.f(entries, "entries");
        this.f36833a = unit;
        this.f36834b = entries;
        this.f36835c = l9;
    }

    public static t a(t tVar, List list, Long l9, int i11) {
        ChineseToneUnit unit = tVar.f36833a;
        if ((i11 & 4) != 0) {
            l9 = tVar.f36835c;
        }
        kotlin.jvm.internal.m.f(unit, "unit");
        return new t(unit, list, l9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return kotlin.jvm.internal.m.a(this.f36833a, tVar.f36833a) && kotlin.jvm.internal.m.a(this.f36834b, tVar.f36834b) && kotlin.jvm.internal.m.a(this.f36835c, tVar.f36835c);
    }

    public final int hashCode() {
        int iB = p0.b(this.f36833a.hashCode() * 31, 31, this.f36834b);
        Long l9 = this.f36835c;
        return iB + (l9 == null ? 0 : l9.hashCode());
    }

    public final String toString() {
        return "Success(unit=" + this.f36833a + ", entries=" + this.f36834b + ", lastVisitedLessonId=" + this.f36835c + ")";
    }
}
