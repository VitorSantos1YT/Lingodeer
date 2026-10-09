package ow;

import fr.p3;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Logger;
import m00.d0;
import m00.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f46127a = Logger.getLogger(f.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f46128b;

    static {
        l lVar = l.f40723d;
        f46128b = p3.l("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    }

    public static int a(d0 d0Var) {
        return (d0Var.readByte() & 255) | ((d0Var.readByte() & 255) << 16) | ((d0Var.readByte() & 255) << 8);
    }

    public static int b(int i11, byte b3, short s3) throws IOException {
        if ((b3 & 8) != 0) {
            i11--;
        }
        if (s3 <= i11) {
            return (short) (i11 - s3);
        }
        c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s3), Integer.valueOf(i11));
        throw null;
    }

    public static void c(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(Locale.US, str, objArr));
    }
}
