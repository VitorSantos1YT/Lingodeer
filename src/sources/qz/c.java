package qz;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements Externalizable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f48520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f48521b;

    private final Object readResolve() {
        long j11 = this.f48520a;
        long j12 = this.f48521b;
        return (j11 == 0 && j12 == 0) ? b.f48517c : new b(j11, j12);
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput input) {
        m.f(input, "input");
        this.f48520a = input.readLong();
        this.f48521b = input.readLong();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput output) throws IOException {
        m.f(output, "output");
        output.writeLong(this.f48520a);
        output.writeLong(this.f48521b);
    }
}
