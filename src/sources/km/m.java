package km;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38238b;

    public m(String topText, String str) {
        kotlin.jvm.internal.m.f(topText, "topText");
        this.f38237a = topText;
        this.f38238b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.m.a(this.f38237a, mVar.f38237a) && kotlin.jvm.internal.m.a(this.f38238b, mVar.f38238b);
    }

    public final int hashCode() {
        return this.f38238b.hashCode() + (this.f38237a.hashCode() * 31);
    }

    public final String toString() {
        return ep.a.h("LongVowelPatternData(topText=", this.f38237a, ", bottomText=", this.f38238b, ")");
    }
}
