package s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r0 f51153d = new r0(0, 0, 127);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f51154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f51155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f51156c;

    public r0(int i11, int i12, int i13) {
        Boolean bool = (i13 & 2) != 0 ? null : Boolean.FALSE;
        i11 = (i13 & 4) != 0 ? 0 : i11;
        i12 = (i13 & 8) != 0 ? -1 : i12;
        this.f51154a = bool;
        this.f51155b = i11;
        this.f51156c = i12;
    }

    public final o3.j a(boolean z11) {
        Boolean bool = this.f51154a;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        int i11 = this.f51155b;
        o3.k kVar = new o3.k(i11);
        if (i11 == 0) {
            kVar = null;
        }
        int i12 = kVar != null ? kVar.f44685a : 1;
        int i13 = this.f51156c;
        o3.i iVar = i13 != -1 ? new o3.i(i13) : null;
        return new o3.j(z11, 0, zBooleanValue, i12, iVar != null ? iVar.f44677a : 1, q3.b.f47418c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return kotlin.jvm.internal.m.a(this.f51154a, r0Var.f51154a) && this.f51155b == r0Var.f51155b && this.f51156c == r0Var.f51156c;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(-1) * 31;
        Boolean bool = this.f51154a;
        return defpackage.e.b(this.f51156c, defpackage.e.b(this.f51155b, (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31, 31), 29791);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) "Unspecified") + ", autoCorrectEnabled=" + this.f51154a + ", keyboardType=" + ((Object) o3.k.a(this.f51155b)) + ", imeAction=" + ((Object) o3.i.a(this.f51156c)) + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }
}
