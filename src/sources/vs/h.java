package vs;

import com.lingodeer.course.smarttips.data.model.DividerType;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DividerType f54162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54163b;

    public h(DividerType dividerType) {
        int iHashCode = UUID.randomUUID().hashCode();
        kotlin.jvm.internal.m.f(dividerType, "dividerType");
        this.f54162a = dividerType;
        this.f54163b = iHashCode;
    }

    @Override // vs.m
    public final int a() {
        return this.f54163b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.m.a(this.f54162a, hVar.f54162a) && this.f54163b == hVar.f54163b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54163b) + (this.f54162a.hashCode() * 31);
    }

    public final String toString() {
        return "Divider(dividerType=" + this.f54162a + ", id=" + this.f54163b + ")";
    }
}
