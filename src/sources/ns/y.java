package ns;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@c00.e
public final class y {
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44037b;

    public /* synthetic */ y(int i11, String str, String str2) {
        if ((i11 & 1) == 0) {
            this.f44036a = BuildConfig.VERSION_NAME;
        } else {
            this.f44036a = str;
        }
        if ((i11 & 2) == 0) {
            this.f44037b = BuildConfig.VERSION_NAME;
        } else {
            this.f44037b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return kotlin.jvm.internal.m.a(this.f44036a, yVar.f44036a) && kotlin.jvm.internal.m.a(this.f44037b, yVar.f44037b);
    }

    public final int hashCode() {
        return this.f44037b.hashCode() + (this.f44036a.hashCode() * 31);
    }

    public final String toString() {
        return ep.a.h("CourseMistakeExplainComparisonView(userVersion=", this.f44036a, ", correctVersion=", this.f44037b, ")");
    }
}
