package lz;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends a {
    static {
        new c((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        return this.f40523a == cVar.f40523a && this.f40524b == cVar.f40524b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f40523a * 31) + this.f40524b;
    }

    public final boolean isEmpty() {
        return m.h(this.f40523a, this.f40524b) > 0;
    }

    public final String toString() {
        return this.f40523a + ".." + this.f40524b;
    }
}
