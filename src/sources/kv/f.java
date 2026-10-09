package kv;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f38736c;

    public /* synthetic */ f(String str, String str2, int i11) {
        this((List) null, str, (i11 & 2) != 0 ? null : str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.m.a(this.f38734a, fVar.f38734a) && kotlin.jvm.internal.m.a(this.f38735b, fVar.f38735b) && kotlin.jvm.internal.m.a(this.f38736c, fVar.f38736c);
    }

    public final int hashCode() {
        int iHashCode = this.f38734a.hashCode() * 31;
        String str = this.f38735b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f38736c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return b7.e0.n(defpackage.e.s("IntroTableCellData(text=", this.f38734a, ", audioKey=", this.f38735b, ", runs="), this.f38736c, ")");
    }

    public f(List list, String str, String str2) {
        this.f38734a = str;
        this.f38735b = str2;
        this.f38736c = list;
    }
}
