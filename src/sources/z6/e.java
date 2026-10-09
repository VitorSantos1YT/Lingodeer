package z6;

import b7.f0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f58938e = new e(-1, -1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f58939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f58940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f58941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f58942d;

    public e(int i11, int i12, int i13) {
        this.f58939a = i11;
        this.f58940b = i12;
        this.f58941c = i13;
        this.f58942d = f0.H(i13) ? f0.q(i13) * i12 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f58939a == eVar.f58939a && this.f58940b == eVar.f58940b && this.f58941c == eVar.f58941c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f58939a), Integer.valueOf(this.f58940b), Integer.valueOf(this.f58941c));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioFormat[sampleRate=");
        sb2.append(this.f58939a);
        sb2.append(", channelCount=");
        sb2.append(this.f58940b);
        sb2.append(", encoding=");
        return ep.a.j(sb2, this.f58941c, ']');
    }
}
