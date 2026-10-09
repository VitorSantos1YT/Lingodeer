package m00;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public interface j extends h0, WritableByteChannel {
    j A0(long j11);

    j Q0(l lVar);

    @Override // m00.h0, java.io.Flushable
    void flush();

    j l0(String str);

    long m0(i0 i0Var);

    i n();

    i w();

    j write(byte[] bArr);

    j write(byte[] bArr, int i11, int i12);

    j writeByte(int i11);

    j writeInt(int i11);

    j writeShort(int i11);
}
