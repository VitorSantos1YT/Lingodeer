package j7;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f36138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f36139e;

    public i(String str, String str2, String str3, String str4, String str5) {
        this.f36135a = str;
        this.f36136b = str2;
        this.f36137c = str3;
        this.f36138d = str4;
        this.f36139e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Objects.equals(this.f36135a, iVar.f36135a) && Objects.equals(this.f36136b, iVar.f36136b) && Objects.equals(this.f36137c, iVar.f36137c) && Objects.equals(this.f36138d, iVar.f36138d) && Objects.equals(this.f36139e, iVar.f36139e);
    }

    public final int hashCode() {
        String str = this.f36135a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f36136b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f36137c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f36138d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f36139e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
