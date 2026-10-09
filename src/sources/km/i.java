package km;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f38211b;

    public i(String text, Set highlightedIndices) {
        kotlin.jvm.internal.m.f(text, "text");
        kotlin.jvm.internal.m.f(highlightedIndices, "highlightedIndices");
        this.f38210a = text;
        this.f38211b = highlightedIndices;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.m.a(this.f38210a, iVar.f38210a) && kotlin.jvm.internal.m.a(this.f38211b, iVar.f38211b);
    }

    public final int hashCode() {
        return this.f38211b.hashCode() + (this.f38210a.hashCode() * 31);
    }

    public final String toString() {
        return "HighlightedTextData(text=" + this.f38210a + ", highlightedIndices=" + this.f38211b + ")";
    }
}
