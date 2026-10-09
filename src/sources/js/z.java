package js;

import com.lingodeer.data.model.LessonState;
import hh.p0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class z implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f36857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f36858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LessonState f36859d;

    public z(String title, List list, boolean z11, LessonState state) {
        kotlin.jvm.internal.m.f(title, "title");
        kotlin.jvm.internal.m.f(state, "state");
        this.f36856a = title;
        this.f36857b = list;
        this.f36858c = z11;
        this.f36859d = state;
    }

    public static z a(z zVar, ArrayList arrayList, boolean z11, LessonState state, int i11) {
        String title = zVar.f36856a;
        List list = arrayList;
        if ((i11 & 2) != 0) {
            list = zVar.f36857b;
        }
        if ((i11 & 8) != 0) {
            state = zVar.f36859d;
        }
        kotlin.jvm.internal.m.f(title, "title");
        kotlin.jvm.internal.m.f(state, "state");
        return new z(title, list, z11, state);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return kotlin.jvm.internal.m.a(this.f36856a, zVar.f36856a) && kotlin.jvm.internal.m.a(this.f36857b, zVar.f36857b) && this.f36858c == zVar.f36858c && this.f36859d == zVar.f36859d;
    }

    public final int hashCode() {
        return this.f36859d.hashCode() + defpackage.e.e(p0.b(this.f36856a.hashCode() * 31, 31, this.f36857b), 31, this.f36858c);
    }

    public final String toString() {
        return "Section(title=" + this.f36856a + ", children=" + this.f36857b + ", expanded=" + this.f36858c + ", state=" + this.f36859d + ")";
    }
}
