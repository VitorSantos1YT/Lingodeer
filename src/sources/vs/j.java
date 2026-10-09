package vs;

import com.lingodeer.course.smarttips.data.model.TableType;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TableType f54166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54167b;

    public j(TableType tableType) {
        int iHashCode = UUID.randomUUID().hashCode();
        kotlin.jvm.internal.m.f(tableType, "tableType");
        this.f54166a = tableType;
        this.f54167b = iHashCode;
    }

    @Override // vs.m
    public final int a() {
        return this.f54167b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.m.a(this.f54166a, jVar.f54166a) && this.f54167b == jVar.f54167b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54167b) + (this.f54166a.hashCode() * 31);
    }

    public final String toString() {
        return "Table(tableType=" + this.f54166a + ", id=" + this.f54167b + ")";
    }
}
