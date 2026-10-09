package ce;

import a0.b2;
import com.adjust.sdk.Constants;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements td.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f6865a = "Exif\u0000\u0000".getBytes(Charset.forName(Constants.ENCODING));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f6866b = "MPF".getBytes(Charset.forName(Constants.ENCODING));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f6867c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static int g(j jVar, m0.n nVar) {
        try {
            int uInt16 = jVar.getUInt16();
            if ((uInt16 & 65496) != 65496 && uInt16 != 19789 && uInt16 != 18761) {
                return -1;
            }
            int iK = k(jVar, 225);
            if (iK != -1) {
                byte[] bArr = (byte[]) nVar.d(iK, byte[].class);
                try {
                    return l(jVar, bArr, iK);
                } finally {
                    nVar.i(bArr);
                }
            }
        } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused) {
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType h(j jVar) {
        try {
            int uInt16 = jVar.getUInt16();
            if (uInt16 == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int uInt8 = (uInt16 << 8) | jVar.getUInt8();
            if (uInt8 == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int uInt9 = (uInt8 << 8) | jVar.getUInt8();
            if (uInt9 == -1991225785) {
                jVar.skip(21L);
                try {
                    return jVar.getUInt8() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (uInt9 == 1380533830) {
                jVar.skip(4L);
                if (((jVar.getUInt16() << 16) | jVar.getUInt16()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int uInt17 = (jVar.getUInt16() << 16) | jVar.getUInt16();
                if ((uInt17 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i11 = uInt17 & 255;
                if (i11 != 88) {
                    if (i11 != 76) {
                        return ImageHeaderParser$ImageType.WEBP;
                    }
                    jVar.skip(4L);
                    return (jVar.getUInt8() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                jVar.skip(4L);
                short uInt10 = jVar.getUInt8();
                if ((uInt10 & 2) != 0) {
                    return ImageHeaderParser$ImageType.ANIMATED_WEBP;
                }
                return (uInt10 & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((jVar.getUInt16() << 16) | jVar.getUInt16()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int uInt18 = (jVar.getUInt16() << 16) | jVar.getUInt16();
            if (uInt18 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            int i12 = 0;
            boolean z11 = uInt18 == 1635150182;
            jVar.skip(4L);
            int i13 = uInt9 - 16;
            if (i13 % 4 == 0) {
                while (i12 < 5 && i13 > 0) {
                    int uInt19 = (jVar.getUInt16() << 16) | jVar.getUInt16();
                    if (uInt19 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (uInt19 == 1635150182) {
                        z11 = true;
                    }
                    i12++;
                    i13 -= 4;
                }
            }
            return z11 ? ImageHeaderParser$ImageType.AVIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public static boolean i(j jVar, m0.n nVar) {
        if (h(jVar) == ImageHeaderParser$ImageType.JPEG) {
            int iK = k(jVar, 226);
            while (iK > 0) {
                byte[] bArr = (byte[]) nVar.d(iK, byte[].class);
                try {
                    if (jVar.read(bArr, iK) != iK ? false : j(iK, bArr, f6866b)) {
                        nVar.i(bArr);
                        return true;
                    }
                    nVar.i(bArr);
                    iK = k(jVar, 226);
                } catch (Throwable th2) {
                    nVar.i(bArr);
                    throw th2;
                }
            }
        }
        return false;
    }

    public static boolean j(int i11, byte[] bArr, byte[] bArr2) {
        boolean z11 = (bArr == null || bArr2 == null || i11 <= bArr2.length) ? false : true;
        if (z11) {
            for (int i12 = 0; i12 < bArr2.length; i12++) {
                if (bArr[i12] != bArr2[i12]) {
                    return false;
                }
            }
        }
        return z11;
    }

    public static int k(j jVar, int i11) {
        short uInt8;
        while (jVar.getUInt8() == 255 && (uInt8 = jVar.getUInt8()) != 218 && uInt8 != 217) {
            int uInt16 = jVar.getUInt16() - 2;
            if (uInt8 == i11) {
                return uInt16;
            }
            long j11 = uInt16;
            if (jVar.skip(j11) != j11) {
                return -1;
            }
        }
        return -1;
    }

    public static int l(j jVar, byte[] bArr, int i11) {
        int i12;
        int i13;
        if (jVar.read(bArr, i11) == i11 && j(i11, bArr, f6865a)) {
            ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i11);
            short s3 = byteBuffer.remaining() - 6 >= 2 ? byteBuffer.getShort(6) : (short) -1;
            byteBuffer.order(s3 != 18761 ? s3 != 19789 ? ByteOrder.BIG_ENDIAN : ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
            int i14 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
            int i15 = i14 + 6;
            short s11 = byteBuffer.remaining() - i15 >= 2 ? byteBuffer.getShort(i15) : (short) -1;
            for (int i16 = 0; i16 < s11; i16++) {
                int i17 = (i16 * 12) + i14 + 8;
                if ((byteBuffer.remaining() - i17 >= 2 ? byteBuffer.getShort(i17) : (short) -1) == 274) {
                    int i18 = i17 + 2;
                    short s12 = byteBuffer.remaining() - i18 >= 2 ? byteBuffer.getShort(i18) : (short) -1;
                    if (s12 >= 1 && s12 <= 12) {
                        int i19 = i17 + 4;
                        int i21 = byteBuffer.remaining() - i19 >= 4 ? byteBuffer.getInt(i19) : -1;
                        if (i21 >= 0 && (i12 = i21 + f6867c[s12]) <= 4 && (i13 = i17 + 8) >= 0 && i13 <= byteBuffer.remaining() && i12 >= 0 && i12 + i13 <= byteBuffer.remaining()) {
                            if (byteBuffer.remaining() - i13 >= 2) {
                                return byteBuffer.getShort(i13);
                            }
                            return -1;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @Override // td.f
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        pe.f.c(byteBuffer, "Argument must not be null");
        return h(new i(0, byteBuffer));
    }

    @Override // td.f
    public final int b(InputStream inputStream, m0.n nVar) {
        b2 b2Var = new b2(inputStream, 4);
        pe.f.c(nVar, "Argument must not be null");
        return g(b2Var, nVar);
    }

    @Override // td.f
    public final boolean c(ByteBuffer byteBuffer, m0.n nVar) {
        i iVar = new i(0, byteBuffer);
        pe.f.c(nVar, "Argument must not be null");
        return i(iVar, nVar);
    }

    @Override // td.f
    public final int d(ByteBuffer byteBuffer, m0.n nVar) {
        i iVar = new i(0, byteBuffer);
        pe.f.c(nVar, "Argument must not be null");
        return g(iVar, nVar);
    }

    @Override // td.f
    public final ImageHeaderParser$ImageType e(InputStream inputStream) {
        return h(new b2(inputStream, 4));
    }

    @Override // td.f
    public final boolean f(InputStream inputStream, m0.n nVar) {
        pe.f.c(inputStream, "Argument must not be null");
        b2 b2Var = new b2(inputStream, 4);
        pe.f.c(nVar, "Argument must not be null");
        return i(b2Var, nVar);
    }
}
