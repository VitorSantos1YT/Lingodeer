package j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f0 f35693c = new f0(0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35695b;

    public f0() {
        this.f35694a = false;
        this.f35695b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f35694a == f0Var.f35694a && this.f35695b == f0Var.f35695b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35695b) + (Boolean.hashCode(this.f35694a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f35694a + ", emojiSupportMatch=" + ((Object) q.a(this.f35695b)) + ')';
    }

    public f0(int i11, boolean z11) {
        this.f35694a = z11;
        this.f35695b = i11;
    }
}
