package tg;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m0 f52319e = new m0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fz.e f52320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fz.g f52321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fz.e f52322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fz.g f52323d;

    public m0(fz.e textStyleProvider, fz.g textStyleBackProvider, fz.e contentColorProvider, fz.g contentColorBackProvider) {
        kotlin.jvm.internal.m.f(textStyleProvider, "textStyleProvider");
        kotlin.jvm.internal.m.f(textStyleBackProvider, "textStyleBackProvider");
        kotlin.jvm.internal.m.f(contentColorProvider, "contentColorProvider");
        kotlin.jvm.internal.m.f(contentColorBackProvider, "contentColorBackProvider");
        this.f52320a = textStyleProvider;
        this.f52321b = textStyleBackProvider;
        this.f52322c = contentColorProvider;
        this.f52323d = contentColorBackProvider;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return kotlin.jvm.internal.m.a(this.f52320a, m0Var.f52320a) && kotlin.jvm.internal.m.a(this.f52321b, m0Var.f52321b) && kotlin.jvm.internal.m.a(this.f52322c, m0Var.f52322c) && kotlin.jvm.internal.m.a(this.f52323d, m0Var.f52323d);
    }

    public final int hashCode() {
        return this.f52323d.hashCode() + ((this.f52322c.hashCode() + ((this.f52321b.hashCode() + (this.f52320a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RichTextThemeConfiguration(textStyleProvider=" + this.f52320a + ", textStyleBackProvider=" + this.f52321b + ", contentColorProvider=" + this.f52322c + ", contentColorBackProvider=" + this.f52323d + ")";
    }

    public /* synthetic */ m0() {
        this(l0.f52314b, m.f52317a, l0.f52315c, m.f52318b);
    }
}
