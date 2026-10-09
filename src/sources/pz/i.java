package pz;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements Externalizable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f47234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47235b;

    private final Object readResolve() {
        d dVar = d.f47223c;
        return f.i(this.f47235b, this.f47234a);
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput input) {
        m.f(input, "input");
        this.f47234a = input.readLong();
        this.f47235b = input.readInt();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput output) throws IOException {
        m.f(output, "output");
        output.writeLong(this.f47234a);
        output.writeInt(this.f47235b);
    }
}
