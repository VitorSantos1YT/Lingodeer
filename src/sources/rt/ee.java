package rt;

import com.lingodeer.data.model.LessonState;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ee {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f49702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LessonState f49703b;

    public ee(ArrayList arrayList, LessonState lessonState) {
        kotlin.jvm.internal.m.f(lessonState, "lessonState");
        this.f49702a = arrayList;
        this.f49703b = lessonState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee)) {
            return false;
        }
        ee eeVar = (ee) obj;
        return this.f49702a.equals(eeVar.f49702a) && this.f49703b == eeVar.f49703b;
    }

    public final int hashCode() {
        return this.f49703b.hashCode() + (this.f49702a.hashCode() * 31);
    }

    public final String toString() {
        return "DialogueLesson(lessons=" + this.f49702a + ", lessonState=" + this.f49703b + ")";
    }
}
