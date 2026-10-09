package rt;

import com.lingodeer.data.model.LessonState;
import com.lingodeer.data.model.StoryLessonType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class sf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f50391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LessonState f50392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StoryLessonType f50393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f50394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f50395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f50396g;

    public /* synthetic */ sf(int i11, long j11, LessonState lessonState, StoryLessonType storyLessonType, String str) {
        this(i11, j11, lessonState, storyLessonType, false, str, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf)) {
            return false;
        }
        sf sfVar = (sf) obj;
        return this.f50390a == sfVar.f50390a && this.f50391b == sfVar.f50391b && this.f50392c == sfVar.f50392c && this.f50393d == sfVar.f50393d && this.f50394e == sfVar.f50394e && kotlin.jvm.internal.m.a(this.f50395f, sfVar.f50395f) && this.f50396g == sfVar.f50396g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f50396g) + defpackage.e.d(defpackage.e.e((this.f50393d.hashCode() + ((this.f50392c.hashCode() + defpackage.e.f(this.f50391b, Integer.hashCode(this.f50390a) * 31, 31)) * 31)) * 31, 31, this.f50394e), 31, this.f50395f);
    }

    public final String toString() {
        StringBuilder sbO = b7.e0.o(this.f50390a, "StoryLesson(unitSortIndex=", ", unitId=", this.f50391b);
        sbO.append(", lessonState=");
        sbO.append(this.f50392c);
        sbO.append(", lessonType=");
        sbO.append(this.f50393d);
        sbO.append(", canAccess=");
        sbO.append(this.f50394e);
        sbO.append(", userDisplayCount=");
        sbO.append(this.f50395f);
        sbO.append(", isCurrentOpen=");
        sbO.append(this.f50396g);
        sbO.append(")");
        return sbO.toString();
    }

    public sf(int i11, long j11, LessonState lessonState, StoryLessonType lessonType, boolean z11, String userDisplayCount, boolean z12) {
        kotlin.jvm.internal.m.f(lessonState, "lessonState");
        kotlin.jvm.internal.m.f(lessonType, "lessonType");
        kotlin.jvm.internal.m.f(userDisplayCount, "userDisplayCount");
        this.f50390a = i11;
        this.f50391b = j11;
        this.f50392c = lessonState;
        this.f50393d = lessonType;
        this.f50394e = z11;
        this.f50395f = userDisplayCount;
        this.f50396g = z12;
    }
}
