package lw;

import com.google.common.base.MoreObjects;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class r0 extends y {
    public final boolean equals(Object obj) {
        return this == obj;
    }

    public abstract String r();

    public abstract g1 s(Map map);

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(r(), "policy");
        toStringHelperB.a(5, "priority");
        toStringHelperB.d("available", true);
        return toStringHelperB.toString();
    }
}
