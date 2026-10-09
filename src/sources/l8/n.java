package l8;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f39836c;

    public n(byte[] bArr, String str) {
        super("PRIV");
        this.f39835b = str;
        this.f39836c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f39835b, nVar.f39835b) && Arrays.equals(this.f39836c, nVar.f39836c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f39835b;
        return Arrays.hashCode(this.f39836c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // l8.j
    public final String toString() {
        return this.f39825a + ": owner=" + this.f39835b;
    }
}
