package d1;

import android.view.textclassifier.TextClassification;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f22943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClassification f22945c;

    public n0(CharSequence charSequence, long j11, TextClassification textClassification) {
        this.f22943a = charSequence;
        this.f22944b = j11;
        this.f22945c = textClassification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return kotlin.jvm.internal.m.a(this.f22943a, n0Var.f22943a) && j3.x0.b(this.f22944b, n0Var.f22944b) && kotlin.jvm.internal.m.a(this.f22945c, n0Var.f22945c);
    }

    public final int hashCode() {
        int iHashCode = this.f22943a.hashCode() * 31;
        int i11 = j3.x0.f35822c;
        return this.f22945c.hashCode() + defpackage.e.f(this.f22944b, iHashCode, 31);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.f22943a) + ", selection=" + ((Object) j3.x0.h(this.f22944b)) + ", textClassification=" + this.f22945c + ')';
    }
}
