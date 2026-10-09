package km;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f38155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f38156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f38158d;

    public a2(i iVar, i iVar2, String str, long j11) {
        this.f38155a = iVar;
        this.f38156b = iVar2;
        this.f38157c = str;
        this.f38158d = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return kotlin.jvm.internal.m.a(this.f38155a, a2Var.f38155a) && kotlin.jvm.internal.m.a(this.f38156b, a2Var.f38156b) && kotlin.jvm.internal.m.a(this.f38157c, a2Var.f38157c) && this.f38158d == a2Var.f38158d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f38158d) + defpackage.e.d((this.f38156b.hashCode() + (this.f38155a.hashCode() * 31)) * 31, 31, this.f38157c);
    }

    public final String toString() {
        return "WordExampleData(wordText=" + this.f38155a + ", romajiText=" + this.f38156b + ", translation=" + this.f38157c + ", wordId=" + this.f38158d + ")";
    }
}
