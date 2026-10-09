package tm;

import com.lingodeer.data.model.SyllableWriteLesson;
import java.util.ArrayList;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f52433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SyllableWriteLesson f52434b;

    public b(ArrayList arrayList, SyllableWriteLesson syllableWriteLesson) {
        this.f52433a = arrayList;
        this.f52434b = syllableWriteLesson;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f52433a.equals(bVar.f52433a) && m.a(this.f52434b, bVar.f52434b);
    }

    public final int hashCode() {
        int iHashCode = this.f52433a.hashCode() * 31;
        SyllableWriteLesson syllableWriteLesson = this.f52434b;
        return iHashCode + (syllableWriteLesson == null ? 0 : syllableWriteLesson.hashCode());
    }

    public final String toString() {
        return "Success(lessons=" + this.f52433a + ", clickedLesson=" + this.f52434b + ")";
    }
}
