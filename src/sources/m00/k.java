package m00;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public interface k extends i0, ReadableByteChannel {
    InputStream C1();

    l D0();

    byte[] M();

    long O(h0 h0Var);

    int Q(z zVar);

    boolean R();

    String R0();

    String c0(long j11);

    i n();

    byte readByte();

    int readInt();

    short readShort();

    boolean request(long j11);

    String s0(Charset charset);

    void s1(long j11);

    void skip(long j11);

    l z(long j11);

    long z1();
}
