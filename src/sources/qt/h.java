package qt;

import pt.ImS.aYZzTH;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends ve.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final NumberFormatException f48328e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String value, NumberFormatException numberFormatException) {
        super("无效的元素ID: ".concat(value), 0);
        kotlin.jvm.internal.m.f(value, "value");
        this.f48327d = value;
        this.f48328e = numberFormatException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.m.a(this.f48327d, hVar.f48327d) && kotlin.jvm.internal.m.a(this.f48328e, hVar.f48328e);
    }

    public final int hashCode() {
        int iHashCode = this.f48327d.hashCode() * 31;
        NumberFormatException numberFormatException = this.f48328e;
        return iHashCode + (numberFormatException == null ? 0 : numberFormatException.hashCode());
    }

    public final String toString() {
        return aYZzTH.xaw + this.f48327d + ", exception=" + this.f48328e + ")";
    }
}
