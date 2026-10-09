package l8;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f39815d;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f39813b = str;
        this.f39814c = str2;
        this.f39815d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (Objects.equals(this.f39814c, eVar.f39814c) && Objects.equals(this.f39813b, eVar.f39813b) && Objects.equals(this.f39815d, eVar.f39815d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f39813b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f39814c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f39815d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // l8.j
    public final String toString() {
        return this.f39825a + ": language=" + this.f39813b + ", description=" + this.f39814c + ", text=" + this.f39815d;
    }
}
