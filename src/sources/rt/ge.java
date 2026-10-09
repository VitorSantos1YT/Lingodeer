package rt;

import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f49799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f49800b;

    public ge(List testModels, Map tipsUnitIdLookup) {
        kotlin.jvm.internal.m.f(testModels, "testModels");
        kotlin.jvm.internal.m.f(tipsUnitIdLookup, "tipsUnitIdLookup");
        this.f49799a = testModels;
        this.f49800b = tipsUnitIdLookup;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge)) {
            return false;
        }
        ge geVar = (ge) obj;
        return kotlin.jvm.internal.m.a(this.f49799a, geVar.f49799a) && kotlin.jvm.internal.m.a(this.f49800b, geVar.f49800b);
    }

    public final int hashCode() {
        return this.f49800b.hashCode() + (this.f49799a.hashCode() * 31);
    }

    public final String toString() {
        return "ExamTestModels(testModels=" + this.f49799a + xTCJ.ZWbMhbSfvvbND + this.f49800b + ")";
    }
}
