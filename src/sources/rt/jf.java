package rt;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class jf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f49948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f49949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f49950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f49951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f49952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f49953f;

    public jf(List units, boolean z11, int i11, float f5, boolean z12, String str) {
        kotlin.jvm.internal.m.f(units, "units");
        this.f49948a = units;
        this.f49949b = z11;
        this.f49950c = i11;
        this.f49951d = f5;
        this.f49952e = z12;
        this.f49953f = str;
    }

    public static jf a(jf jfVar, ArrayList arrayList, int i11, float f5, boolean z11, String str, int i12) {
        List list = arrayList;
        if ((i12 & 1) != 0) {
            list = jfVar.f49948a;
        }
        List units = list;
        boolean z12 = (i12 & 2) != 0 ? jfVar.f49949b : false;
        jfVar.getClass();
        if ((i12 & 8) != 0) {
            i11 = jfVar.f49950c;
        }
        int i13 = i11;
        if ((i12 & 16) != 0) {
            f5 = jfVar.f49951d;
        }
        float f11 = f5;
        if ((i12 & 32) != 0) {
            z11 = jfVar.f49952e;
        }
        boolean z13 = z11;
        if ((i12 & 64) != 0) {
            str = jfVar.f49953f;
        }
        jfVar.getClass();
        kotlin.jvm.internal.m.f(units, "units");
        return new jf(units, z12, i13, f11, z13, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf)) {
            return false;
        }
        jf jfVar = (jf) obj;
        return kotlin.jvm.internal.m.a(this.f49948a, jfVar.f49948a) && this.f49949b == jfVar.f49949b && this.f49950c == jfVar.f49950c && Float.compare(this.f49951d, jfVar.f49951d) == 0 && this.f49952e == jfVar.f49952e && kotlin.jvm.internal.m.a(this.f49953f, jfVar.f49953f);
    }

    public final int hashCode() {
        int iE = defpackage.e.e(defpackage.e.a(defpackage.e.b(this.f49950c, defpackage.e.e(defpackage.e.e(this.f49948a.hashCode() * 31, 31, this.f49949b), 31, false), 31), this.f49951d, 31), 31, this.f49952e);
        String str = this.f49953f;
        return iE + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "OfflineAllUiState(units=" + this.f49948a + ", isLoading=" + this.f49949b + ", isMultiSelectMode=false, selectedCount=" + this.f49950c + ", totalDownloadProgress=" + this.f49951d + ", isDownloading=" + this.f49952e + ", errorMessage=" + this.f49953f + ")";
    }
}
