package vs;

import com.lingodeer.course.smarttips.data.model.DialogueType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DialogueType f54160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54161b;

    public g(DialogueType dialogueType, int i11) {
        kotlin.jvm.internal.m.f(dialogueType, "dialogueType");
        this.f54160a = dialogueType;
        this.f54161b = i11;
    }

    @Override // vs.m
    public final int a() {
        return this.f54161b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.m.a(this.f54160a, gVar.f54160a) && this.f54161b == gVar.f54161b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54161b) + (this.f54160a.hashCode() * 31);
    }

    public final String toString() {
        return "Dialogue(dialogueType=" + this.f54160a + ", id=" + this.f54161b + ")";
    }
}
