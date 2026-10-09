package zr;

import com.lingodeer.data.model.CourseCharacterGroup;
import hh.p0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseCharacterGroup f59298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f59299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f59300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f59301d;

    public /* synthetic */ g(CourseCharacterGroup courseCharacterGroup, List list) {
        this(courseCharacterGroup, list, null, false);
    }

    public static g a(g gVar, Long l9, boolean z11, int i11) {
        CourseCharacterGroup courseCharGroup = gVar.f59298a;
        List characters = gVar.f59299b;
        if ((i11 & 4) != 0) {
            l9 = gVar.f59300c;
        }
        kotlin.jvm.internal.m.f(courseCharGroup, "courseCharGroup");
        kotlin.jvm.internal.m.f(characters, "characters");
        return new g(courseCharGroup, characters, l9, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.m.a(this.f59298a, gVar.f59298a) && kotlin.jvm.internal.m.a(this.f59299b, gVar.f59299b) && kotlin.jvm.internal.m.a(this.f59300c, gVar.f59300c) && this.f59301d == gVar.f59301d;
    }

    public final int hashCode() {
        int iB = p0.b(this.f59298a.hashCode() * 31, 31, this.f59299b);
        Long l9 = this.f59300c;
        return Boolean.hashCode(this.f59301d) + ((iB + (l9 == null ? 0 : l9.hashCode())) * 31);
    }

    public final String toString() {
        return "Success(courseCharGroup=" + this.f59298a + ", characters=" + this.f59299b + ", selectedCharId=" + this.f59300c + ", isAnimating=" + this.f59301d + ")";
    }

    public g(CourseCharacterGroup courseCharGroup, List characters, Long l9, boolean z11) {
        kotlin.jvm.internal.m.f(courseCharGroup, "courseCharGroup");
        kotlin.jvm.internal.m.f(characters, "characters");
        this.f59298a = courseCharGroup;
        this.f59299b = characters;
        this.f59300c = l9;
        this.f59301d = z11;
    }
}
