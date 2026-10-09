package p7;

import com.google.common.collect.ImmutableList;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g1 f46387d = new g1(new y6.p0[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImmutableList f46389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46390c;

    static {
        b7.f0.G(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g1(y6.p0... p0VarArr) {
        ImmutableList immutableListO = ImmutableList.o(p0VarArr);
        this.f46389b = immutableListO;
        this.f46388a = p0VarArr.length;
        int i11 = 0;
        while (i11 < immutableListO.size()) {
            int i12 = i11 + 1;
            for (int i13 = i12; i13 < immutableListO.size(); i13++) {
                if (((y6.p0) immutableListO.get(i11)).equals(immutableListO.get(i13))) {
                    b7.a.p(BuildConfig.VERSION_NAME, new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i11 = i12;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final y6.p0 a(int i11) {
        return (y6.p0) this.f46389b.get(i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g1.class == obj.getClass()) {
            g1 g1Var = (g1) obj;
            if (this.f46388a == g1Var.f46388a && this.f46389b.equals(g1Var.f46389b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f46390c == 0) {
            this.f46390c = this.f46389b.hashCode();
        }
        return this.f46390c;
    }

    public final String toString() {
        return this.f46389b.toString();
    }
}
