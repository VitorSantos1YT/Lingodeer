package qv;

import com.lingodeer.data.model.SyllableWriteLesson;
import java.util.ArrayList;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f48425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SyllableWriteLesson f48426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48427c;

    public b(ArrayList arrayList, SyllableWriteLesson syllableWriteLesson, String currentEnteredLessonKey) {
        m.f(currentEnteredLessonKey, "currentEnteredLessonKey");
        this.f48425a = arrayList;
        this.f48426b = syllableWriteLesson;
        this.f48427c = currentEnteredLessonKey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f48425a.equals(bVar.f48425a) && m.a(this.f48426b, bVar.f48426b) && m.a(this.f48427c, bVar.f48427c);
    }

    public final int hashCode() {
        int iHashCode = this.f48425a.hashCode() * 31;
        SyllableWriteLesson syllableWriteLesson = this.f48426b;
        return this.f48427c.hashCode() + ((iHashCode + (syllableWriteLesson == null ? 0 : syllableWriteLesson.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Success(lessons=");
        sb2.append(this.f48425a);
        sb2.append(", clickedLesson=");
        sb2.append(this.f48426b);
        sb2.append(", currentEnteredLessonKey=");
        return ep.a.k(sb2, this.f48427c, ")");
    }
}
