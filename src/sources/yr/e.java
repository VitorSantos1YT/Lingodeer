package yr;

import b7.e0;
import g00.d1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@c00.e
public final class e {
    public static final d Companion = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final qy.h[] f57868d = {null, null, com.bumptech.glide.d.u(qy.j.PUBLICATION, new uu.f(27))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f57870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f57871c;

    public /* synthetic */ e(int i11, String str, String str2, List list) {
        if (7 != (i11 & 7)) {
            d1.k(i11, 7, c.f57867a.getDescriptor());
            throw null;
        }
        this.f57869a = str;
        this.f57870b = str2;
        this.f57871c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.m.a(this.f57869a, eVar.f57869a) && kotlin.jvm.internal.m.a(this.f57870b, eVar.f57870b) && kotlin.jvm.internal.m.a(this.f57871c, eVar.f57871c);
    }

    public final int hashCode() {
        String str = this.f57869a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f57870b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f57871c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return e0.n(defpackage.e.s("CategoryItem(name_zh=", this.f57869a, ", name_en=", this.f57870b, ", characters="), this.f57871c, ")");
    }
}
