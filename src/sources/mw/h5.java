package mw;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f42443b;

    public h5(String str, Map map) {
        Preconditions.k(str, "policyName");
        this.f42442a = str;
        Preconditions.k(map, "rawConfigValue");
        this.f42443b = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h5) {
            h5 h5Var = (h5) obj;
            if (this.f42442a.equals(h5Var.f42442a) && this.f42443b.equals(h5Var.f42443b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42442a, this.f42443b});
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(this.f42442a, "policyName");
        toStringHelperB.c(this.f42443b, "rawConfigValue");
        return toStringHelperB.toString();
    }
}
