package okhttp3.internal.http2;

import com.google.firebase.annotations.jjzf.kHfjNGauVgdF;
import hh.p0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.m;
import l1.z1;
import lz.e;
import m00.d0;
import m00.i;
import m00.i0;
import m00.k;
import m00.k0;
import m00.l;
import nv.p;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.concurrent.TaskQueue;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class Http2Reader implements Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Companion f45453d = new Companion(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f45454e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f45455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ContinuationSource f45456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Hpack.Reader f45457c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        public static int a(int i11, int i12, int i13) throws IOException {
            if ((i12 & 8) != 0) {
                i11--;
            }
            if (i13 <= i11) {
                return i11 - i13;
            }
            throw new IOException(p.p("PROTOCOL_ERROR padding ", i13, i11, " > remaining length "));
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface Handler {
    }

    static {
        Logger logger = Logger.getLogger(Http2.class.getName());
        m.e(logger, "getLogger(...)");
        f45454e = logger;
    }

    public Http2Reader(k source) {
        m.f(source, "source");
        this.f45455a = source;
        ContinuationSource continuationSource = new ContinuationSource(source);
        this.f45456b = continuationSource;
        this.f45457c = new Hpack.Reader(continuationSource);
    }

    public final List b(int i11, int i12, int i13, int i14) throws IOException {
        ContinuationSource continuationSource = this.f45456b;
        continuationSource.f45462e = i11;
        continuationSource.f45459b = i11;
        continuationSource.f45463f = i12;
        continuationSource.f45460c = i13;
        continuationSource.f45461d = i14;
        Hpack.Reader reader = this.f45457c;
        d0 d0Var = reader.f45403c;
        ArrayList arrayList = reader.f45402b;
        while (!d0Var.R()) {
            byte b3 = d0Var.readByte();
            byte[] bArr = _UtilCommonKt.f45202a;
            int i15 = b3 & 255;
            if (i15 == 128) {
                throw new IOException("index == 0");
            }
            if ((b3 & 128) == 128) {
                int iE = reader.e(i15, 127);
                int i16 = iE - 1;
                if (i16 >= 0) {
                    Hpack hpack = Hpack.f45398a;
                    hpack.getClass();
                    Header[] headerArr = Hpack.f45399b;
                    if (i16 <= headerArr.length - 1) {
                        hpack.getClass();
                        arrayList.add(headerArr[i16]);
                    }
                }
                Hpack.f45398a.getClass();
                int length = reader.f45405e + 1 + (i16 - Hpack.f45399b.length);
                if (length >= 0) {
                    Header[] headerArr2 = reader.f45404d;
                    if (length < headerArr2.length) {
                        Header header = headerArr2[length];
                        m.c(header);
                        arrayList.add(header);
                    }
                }
                throw new IOException(p.j(iE, "Header index too large "));
            }
            if (i15 == 64) {
                Hpack hpack2 = Hpack.f45398a;
                l lVarD = reader.d();
                hpack2.getClass();
                Hpack.a(lVarD);
                reader.c(new Header(lVarD, reader.d()));
            } else if ((b3 & 64) == 64) {
                reader.c(new Header(reader.b(reader.e(i15, 63) - 1), reader.d()));
            } else if ((b3 & 32) == 32) {
                int iE2 = reader.e(i15, 31);
                reader.f45401a = iE2;
                if (iE2 < 0 || iE2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + reader.f45401a);
                }
                int i17 = reader.f45407g;
                if (iE2 < i17) {
                    if (iE2 == 0) {
                        Header[] headerArr3 = reader.f45404d;
                        ry.l.P(0, headerArr3.length, null, headerArr3);
                        reader.f45405e = reader.f45404d.length - 1;
                        reader.f45406f = 0;
                        reader.f45407g = 0;
                    } else {
                        reader.a(i17 - iE2);
                    }
                }
            } else if (i15 == 16 || i15 == 0) {
                Hpack hpack3 = Hpack.f45398a;
                l lVarD2 = reader.d();
                hpack3.getClass();
                Hpack.a(lVarD2);
                arrayList.add(new Header(lVarD2, reader.d()));
            } else {
                arrayList.add(new Header(reader.b(reader.e(i15, 15) - 1), reader.d()));
            }
        }
        List listA1 = ry.m.a1(arrayList);
        arrayList.clear();
        return listA1;
    }

    public final void c(Http2Connection.ReaderRunnable readerRunnable, int i11) {
        k kVar = this.f45455a;
        kVar.readInt();
        kVar.readByte();
        byte[] bArr = _UtilCommonKt.f45202a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f45455a.close();
    }

    /* JADX WARN: Code duplicated, block: B:225:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0119  */
    /* JADX WARN: Code duplicated, block: B:68:0x011d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0141  */
    /* JADX WARN: Code duplicated, block: B:95:0x0174  */
    public final boolean a(boolean z11, Http2Connection.ReaderRunnable readerRunnable) throws Exception {
        ErrorCode errorCode;
        int i11;
        l debugData;
        Http2Connection http2Connection;
        Logger logger = f45454e;
        Companion companion = f45453d;
        k kVar = this.f45455a;
        int i12 = 0;
        try {
            kVar.s1(9L);
            int iL = _UtilCommonKt.l(kVar);
            if (iL > 16384) {
                throw new IOException(p.j(iL, "FRAME_SIZE_ERROR: "));
            }
            int i13 = kVar.readByte() & 255;
            byte b3 = kVar.readByte();
            int i14 = b3 & 255;
            int i15 = kVar.readInt() & Integer.MAX_VALUE;
            if (i13 != 8 && logger.isLoggable(Level.FINE)) {
                Http2.f45416a.getClass();
                logger.fine(Http2.b(i15, iL, i13, i14, true));
            }
            if (z11 && i13 != 4) {
                StringBuilder sb2 = new StringBuilder("Expected a SETTINGS frame but was ");
                Http2.f45416a.getClass();
                sb2.append(Http2.a(i13));
                throw new IOException(sb2.toString());
            }
            ErrorCode errorCode2 = null;
            switch (i13) {
                case 0:
                    if (i15 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                    }
                    boolean z12 = (b3 & 1) != 0;
                    if ((b3 & 32) != 0) {
                        throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                    }
                    int i16 = (b3 & 8) != 0 ? kVar.readByte() & 255 : 0;
                    companion.getClass();
                    readerRunnable.a(z12, i15, kVar, Companion.a(iL, i14, i16));
                    kVar.skip(i16);
                    return true;
                case 1:
                    if (i15 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                    }
                    boolean z13 = (b3 & 1) != 0;
                    int i17 = (b3 & 8) != 0 ? kVar.readByte() & 255 : 0;
                    if ((b3 & 32) != 0) {
                        c(readerRunnable, i15);
                        iL -= 5;
                    }
                    companion.getClass();
                    readerRunnable.c(i15, b(Companion.a(iL, i14, i17), i17, i14, i15), z13);
                    return true;
                case 2:
                    if (iL != 5) {
                        throw new IOException(p0.h(iL, "TYPE_PRIORITY length: ", " != 5"));
                    }
                    if (i15 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    c(readerRunnable, i15);
                    return true;
                case 3:
                    if (iL != 4) {
                        throw new IOException(p0.h(iL, "TYPE_RST_STREAM length: ", " != 4"));
                    }
                    if (i15 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int i18 = kVar.readInt();
                    ErrorCode.Companion.getClass();
                    ErrorCode[] errorCodeArrValues = ErrorCode.values();
                    int length = errorCodeArrValues.length;
                    while (true) {
                        if (i12 < length) {
                            errorCode = errorCodeArrValues[i12];
                            if (errorCode.a() != i18) {
                                i12++;
                            }
                        } else {
                            errorCode = null;
                        }
                    }
                    if (errorCode == null) {
                        throw new IOException(p.j(i18, "TYPE_RST_STREAM unexpected error code: "));
                    }
                    readerRunnable.h(i15, errorCode);
                    return true;
                case 4:
                    if (i15 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((b3 & 1) != 0) {
                        if (iL != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                        return true;
                    }
                    if (iL % 6 != 0) {
                        throw new IOException(p.j(iL, "TYPE_SETTINGS length % 6 != 0: "));
                    }
                    Settings settings = new Settings();
                    e eVarS = hz.b.S(6, hz.b.U(0, iL));
                    int i19 = eVarS.f40532a;
                    int i21 = eVarS.f40533b;
                    int i22 = eVarS.f40534c;
                    if ((i22 > 0 && i19 <= i21) || (i22 < 0 && i21 <= i19)) {
                        while (true) {
                            short s3 = kVar.readShort();
                            byte[] bArr = _UtilCommonKt.f45202a;
                            int i23 = s3 & 65535;
                            i11 = kVar.readInt();
                            if (i23 != 2) {
                                if (i23 != 4) {
                                    if (i23 == 5 && (i11 < 16384 || i11 > 16777215)) {
                                    }
                                } else if (i11 < 0) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                }
                            } else if (i11 != 0 && i11 != 1) {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            }
                            settings.c(i23, i11);
                            if (i19 != i21) {
                                i19 += i22;
                            }
                        }
                        throw new IOException(p.j(i11, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                    }
                    Http2Connection http2Connection2 = Http2Connection.this;
                    TaskQueue.b(http2Connection2.H, ep.a.k(new StringBuilder(), http2Connection2.f45427c, " applyAndAckSettings"), new z1(23, readerRunnable, settings), 6);
                    return true;
                case 5:
                    if (i15 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                    }
                    int i24 = (b3 & 8) != 0 ? kVar.readByte() & 255 : 0;
                    int i25 = kVar.readInt() & Integer.MAX_VALUE;
                    companion.getClass();
                    readerRunnable.e(i25, b(Companion.a(iL - 4, i14, i24), i24, i14, i15));
                    return true;
                case 6:
                    if (iL != 8) {
                        throw new IOException(p.j(iL, "TYPE_PING length != 8: "));
                    }
                    if (i15 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    readerRunnable.d(kVar.readInt(), kVar.readInt(), (b3 & 1) != 0);
                    return true;
                case 7:
                    if (iL < 8) {
                        throw new IOException(p.j(iL, "TYPE_GOAWAY length < 8: "));
                    }
                    if (i15 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int i26 = kVar.readInt();
                    int i27 = kVar.readInt();
                    int i28 = iL - 8;
                    ErrorCode.Companion.getClass();
                    for (ErrorCode errorCode3 : ErrorCode.values()) {
                        if (errorCode3.a() == i27) {
                            errorCode2 = errorCode3;
                            if (errorCode2 != null) {
                                throw new IOException(p.j(i27, kHfjNGauVgdF.vQp));
                            }
                            debugData = l.f40723d;
                            if (i28 > 0) {
                                debugData = kVar.z(i28);
                            }
                            m.f(debugData, "debugData");
                            debugData.e();
                            http2Connection = Http2Connection.this;
                            synchronized (http2Connection) {
                                Object[] array = http2Connection.f45425b.values().toArray(new Http2Stream[0]);
                                http2Connection.f45430f = true;
                            }
                            for (Http2Stream http2Stream : (Http2Stream[]) array) {
                                if (http2Stream.f45464a <= i26 && http2Stream.g()) {
                                    ErrorCode errorCode4 = ErrorCode.REFUSED_STREAM;
                                    m.f(errorCode4, "errorCode");
                                    synchronized (http2Stream) {
                                        if (http2Stream.f() == null) {
                                            http2Stream.N = errorCode4;
                                            http2Stream.notifyAll();
                                        }
                                        break;
                                    }
                                    Http2Connection.this.c(http2Stream.f45464a);
                                }
                            }
                            return true;
                        }
                    }
                    if (errorCode2 != null) {
                        throw new IOException(p.j(i27, kHfjNGauVgdF.vQp));
                    }
                    debugData = l.f40723d;
                    if (i28 > 0) {
                        debugData = kVar.z(i28);
                    }
                    m.f(debugData, "debugData");
                    debugData.e();
                    http2Connection = Http2Connection.this;
                    synchronized (http2Connection) {
                        Object[] array2 = http2Connection.f45425b.values().toArray(new Http2Stream[0]);
                        http2Connection.f45430f = true;
                        while (i < r3) {
                            if (http2Stream.f45464a <= i26) {
                            }
                        }
                        return true;
                    }
                case 8:
                    try {
                        if (iL != 4) {
                            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + iL);
                        }
                        long j11 = ((long) kVar.readInt()) & 2147483647L;
                        if (j11 == 0) {
                            throw new IOException("windowSizeIncrement was 0");
                        }
                        if (logger.isLoggable(Level.FINE)) {
                            Http2.f45416a.getClass();
                            logger.fine(Http2.c(i15, iL, j11, true));
                        }
                        if (i15 == 0) {
                            Http2Connection http2Connection3 = Http2Connection.this;
                            synchronized (http2Connection3) {
                                http2Connection3.X += j11;
                                http2Connection3.notifyAll();
                            }
                            return true;
                        }
                        Http2Stream http2StreamB = Http2Connection.this.b(i15);
                        if (http2StreamB != null) {
                            synchronized (http2StreamB) {
                                http2StreamB.f45468e += j11;
                                if (j11 > 0) {
                                    http2StreamB.notifyAll();
                                }
                                break;
                            }
                            return true;
                        }
                        return true;
                    } catch (Exception e8) {
                        Http2.f45416a.getClass();
                        logger.fine(Http2.b(i15, iL, 8, i14, true));
                        throw e8;
                    }
                default:
                    kVar.skip(iL);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ContinuationSource implements i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f45458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f45459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f45460c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f45461d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f45462e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f45463f;

        public ContinuationSource(k source) {
            m.f(source, "source");
            this.f45458a = source;
        }

        @Override // m00.i0
        public final long read(i sink, long j11) throws IOException {
            int i11;
            int i12;
            m.f(sink, "sink");
            do {
                int i13 = this.f45462e;
                k kVar = this.f45458a;
                if (i13 == 0) {
                    kVar.skip(this.f45463f);
                    this.f45463f = 0;
                    if ((this.f45460c & 4) == 0) {
                        i11 = this.f45461d;
                        int iL = _UtilCommonKt.l(kVar);
                        this.f45462e = iL;
                        this.f45459b = iL;
                        int i14 = kVar.readByte() & 255;
                        this.f45460c = kVar.readByte() & 255;
                        Http2Reader.f45453d.getClass();
                        Logger logger = Http2Reader.f45454e;
                        if (logger.isLoggable(Level.FINE)) {
                            Http2 http2 = Http2.f45416a;
                            int i15 = this.f45461d;
                            int i16 = this.f45459b;
                            int i17 = this.f45460c;
                            http2.getClass();
                            logger.fine(Http2.b(i15, i16, i14, i17, true));
                        }
                        i12 = kVar.readInt() & Integer.MAX_VALUE;
                        this.f45461d = i12;
                        if (i14 != 9) {
                            throw new IOException(w4.c.f(i14, " != TYPE_CONTINUATION"));
                        }
                    }
                } else {
                    long j12 = kVar.read(sink, Math.min(j11, i13));
                    if (j12 != -1) {
                        this.f45462e -= (int) j12;
                        return j12;
                    }
                }
                return -1L;
            } while (i12 == i11);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }

        @Override // m00.i0
        public final k0 timeout() {
            return this.f45458a.timeout();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }
}
