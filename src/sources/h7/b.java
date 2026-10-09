package h7;

import android.os.Build;
import b7.f0;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f31820d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImmutableSet f31823c;

    static {
        b bVar;
        if (Build.VERSION.SDK_INT >= 33) {
            ImmutableSet.Builder builder = new ImmutableSet.Builder();
            for (int i11 = 1; i11 <= 10; i11++) {
                builder.a(Integer.valueOf(f0.p(i11)));
            }
            bVar = new b(2, builder.k());
        } else {
            bVar = new b(2, 10);
        }
        f31820d = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(int i11, Set set) {
        this.f31821a = i11;
        ImmutableSet immutableSetM = ImmutableSet.m(set);
        this.f31823c = immutableSetM;
        UnmodifiableIterator it = immutableSetM.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f31822b = iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f31821a == bVar.f31821a && this.f31822b == bVar.f31822b && Objects.equals(this.f31823c, bVar.f31823c);
    }

    public final int hashCode() {
        int i11 = ((this.f31821a * 31) + this.f31822b) * 31;
        ImmutableSet immutableSet = this.f31823c;
        return i11 + (immutableSet == null ? 0 : immutableSet.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f31821a + ", maxChannelCount=" + this.f31822b + ", channelMasks=" + this.f31823c + "]";
    }

    public b(int i11, int i12) {
        this.f31821a = i11;
        this.f31822b = i12;
        this.f31823c = null;
    }
}
