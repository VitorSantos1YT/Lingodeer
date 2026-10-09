package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class pb implements rb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sf f50246a;

    public pb(sf storyLesson) {
        kotlin.jvm.internal.m.f(storyLesson, "storyLesson");
        this.f50246a = storyLesson;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pb) && kotlin.jvm.internal.m.a(this.f50246a, ((pb) obj).f50246a);
    }

    public final int hashCode() {
        return this.f50246a.hashCode();
    }

    public final String toString() {
        return "ClickedStoryLesson(storyLesson=" + this.f50246a + ")";
    }
}
