package rz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f50954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f50955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fz.f f50956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f50957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f50958e;

    public u(Object obj, k kVar, fz.f fVar, Object obj2, Throwable th2) {
        this.f50954a = obj;
        this.f50955b = kVar;
        this.f50956c = fVar;
        this.f50957d = obj2;
        this.f50958e = th2;
    }

    public static u a(u uVar, k kVar, Throwable th2, int i11) {
        Object obj = uVar.f50954a;
        if ((i11 & 2) != 0) {
            kVar = uVar.f50955b;
        }
        k kVar2 = kVar;
        fz.f fVar = uVar.f50956c;
        Object obj2 = uVar.f50957d;
        if ((i11 & 16) != 0) {
            th2 = uVar.f50958e;
        }
        return new u(obj, kVar2, fVar, obj2, th2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return kotlin.jvm.internal.m.a(this.f50954a, uVar.f50954a) && kotlin.jvm.internal.m.a(this.f50955b, uVar.f50955b) && kotlin.jvm.internal.m.a(this.f50956c, uVar.f50956c) && kotlin.jvm.internal.m.a(this.f50957d, uVar.f50957d) && kotlin.jvm.internal.m.a(this.f50958e, uVar.f50958e);
    }

    public final int hashCode() {
        Object obj = this.f50954a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        k kVar = this.f50955b;
        int iHashCode2 = (iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        fz.f fVar = this.f50956c;
        int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        Object obj2 = this.f50957d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f50958e;
        return iHashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f50954a + ", cancelHandler=" + this.f50955b + ", onCancellation=" + this.f50956c + ", idempotentResume=" + this.f50957d + ", cancelCause=" + this.f50958e + ')';
    }

    public /* synthetic */ u(Object obj, k kVar, fz.f fVar, Throwable th2, int i11) {
        this(obj, (i11 & 2) != 0 ? null : kVar, (i11 & 4) != 0 ? null : fVar, (Object) null, (i11 & 16) != 0 ? null : th2);
    }
}
