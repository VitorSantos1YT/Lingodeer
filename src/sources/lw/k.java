package lw;

import com.google.common.base.Charsets;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import mw.d4;
import mw.l3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k implements l, b1, o1, y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f40407b = new k(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f40408c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40409a;

    public /* synthetic */ k(int i11) {
        this.f40409a = i11;
    }

    @Override // lw.y0
    public String a(Object obj) {
        return (String) obj;
    }

    @Override // lw.l
    public OutputStream b(l3 l3Var) {
        switch (this.f40409a) {
            case 0:
                return l3Var;
            default:
                return new GZIPOutputStream(l3Var);
        }
    }

    @Override // lw.o1
    public boolean c(Object obj) {
        switch (this.f40409a) {
            case 6:
                ((r0) obj).getClass();
                break;
            case 7:
                ((u0) obj).getClass();
                break;
            default:
                ((i1) obj).getClass();
                break;
        }
        return true;
    }

    @Override // lw.o1
    public int d(Object obj) {
        switch (this.f40409a) {
            case 6:
                ((r0) obj).getClass();
                return 5;
            case 7:
                ((nw.k) ((u0) obj)).getClass();
                try {
                    Class.forName("android.app.Application", false, nw.k.class.getClassLoader());
                    return 8;
                } catch (Exception unused) {
                    return 3;
                }
            default:
                ((i1) obj).getClass();
                return 5;
        }
    }

    @Override // lw.l
    public InputStream e(d4 d4Var) {
        switch (this.f40409a) {
            case 0:
                return d4Var;
            default:
                return new GZIPInputStream(d4Var);
        }
    }

    @Override // lw.l
    public String f() {
        switch (this.f40409a) {
            case 0:
                return "identity";
            default:
                return "gzip";
        }
    }

    @Override // lw.b1
    public Object m(byte[] bArr) {
        int i11;
        byte b3;
        switch (this.f40409a) {
            case 1:
                for (int i12 = 0; i12 < bArr.length; i12++) {
                    byte b11 = bArr[i12];
                    if (b11 < 32 || b11 >= 126 || (b11 == 37 && i12 + 2 < bArr.length)) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length);
                        int i13 = 0;
                        while (i13 < bArr.length) {
                            if (bArr[i13] == 37 && i13 + 2 < bArr.length) {
                                try {
                                    byteBufferAllocate.put((byte) Integer.parseInt(new String(bArr, i13 + 1, 2, Charsets.f16352a), 16));
                                    i13 += 3;
                                } catch (NumberFormatException unused) {
                                    byteBufferAllocate.put(bArr[i13]);
                                    i13++;
                                }
                            }
                            byteBufferAllocate.put(bArr[i13]);
                            i13++;
                        }
                        return new String(byteBufferAllocate.array(), 0, byteBufferAllocate.position(), Charsets.f16353b);
                    }
                }
                return new String(bArr, 0);
            default:
                char c11 = 0;
                if (bArr.length == 1 && bArr[0] == 48) {
                    return q1.f40434e;
                }
                int length = bArr.length;
                if (length != 1) {
                    if (length == 2 && (b3 = bArr[0]) >= 48 && b3 <= 57) {
                        i11 = (b3 - 48) * 10;
                        c11 = 1;
                    }
                    return q1.f40436g.h("Unknown code ".concat(new String(bArr, Charsets.f16352a)));
                }
                i11 = 0;
                byte b12 = bArr[c11];
                if (b12 >= 48 && b12 <= 57) {
                    int i14 = (b12 - 48) + i11;
                    List list = q1.f40433d;
                    if (i14 < list.size()) {
                        return (q1) list.get(i14);
                    }
                }
                return q1.f40436g.h("Unknown code ".concat(new String(bArr, Charsets.f16352a)));
        }
    }

    public String toString() {
        switch (this.f40409a) {
            case 5:
                return "internal:health-check-consumer-listener";
            default:
                return super.toString();
        }
    }

    public k(SSLSession sSLSession) {
        this.f40409a = 4;
        sSLSession.getCipherSuite();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            Certificate certificate = localCertificates[0];
        }
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            if (peerCertificates != null) {
                Certificate certificate2 = peerCertificates[0];
            }
        } catch (SSLPeerUnverifiedException e8) {
            c0.f40356d.log(Level.FINE, "Peer cert not available for peerHost=" + sSLSession.getPeerHost(), (Throwable) e8);
        }
    }

    @Override // lw.b1
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public byte[] mo227a(Object obj) {
        switch (this.f40409a) {
            case 1:
                byte[] bytes = ((String) obj).getBytes(Charsets.f16353b);
                int i11 = 0;
                while (i11 < bytes.length) {
                    byte b3 = bytes[i11];
                    if (b3 < 32 || b3 >= 126 || b3 == 37) {
                        byte[] bArr = new byte[((bytes.length - i11) * 3) + i11];
                        if (i11 != 0) {
                            System.arraycopy(bytes, 0, bArr, 0, i11);
                        }
                        int i12 = i11;
                        while (i11 < bytes.length) {
                            byte b11 = bytes[i11];
                            if (b11 < 32 || b11 >= 126 || b11 == 37) {
                                bArr[i12] = 37;
                                byte[] bArr2 = f40408c;
                                bArr[i12 + 1] = bArr2[(b11 >> 4) & 15];
                                bArr[i12 + 2] = bArr2[b11 & 15];
                                i12 += 3;
                            } else {
                                bArr[i12] = b11;
                                i12++;
                            }
                            i11++;
                        }
                        return Arrays.copyOf(bArr, i12);
                    }
                    i11++;
                }
                return bytes;
            default:
                return p1.a(((q1) obj).f40444a);
        }
    }

    @Override // lw.y0
    public Object i(String str) {
        return str;
    }
}
