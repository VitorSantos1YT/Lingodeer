package y5;

import hh.p0;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f57102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f57103d;

    public d(byte[] bArr, int i11, int i12) {
        this(-1L, i11, bArr, i12);
    }

    public static d a(String str) {
        byte[] bytes = str.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(h.f57111b0);
        return new d(bytes, 2, bytes.length);
    }

    public static d b(long j11, ByteOrder byteOrder) {
        return c(new long[]{j11}, byteOrder);
    }

    public static d c(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[h.S[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j11 : jArr) {
            byteBufferWrap.putInt((int) j11);
        }
        return new d(byteBufferWrap.array(), 4, jArr.length);
    }

    public static d d(f[] fVarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[h.S[5] * fVarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (f fVar : fVarArr) {
            byteBufferWrap.putInt((int) fVar.f57108a);
            byteBufferWrap.putInt((int) fVar.f57109b);
        }
        return new d(byteBufferWrap.array(), 5, fVarArr.length);
    }

    public static d e(int i11, ByteOrder byteOrder) {
        return f(new int[]{i11}, byteOrder);
    }

    public static d f(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[h.S[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i11 : iArr) {
            byteBufferWrap.putShort((short) i11);
        }
        return new d(byteBufferWrap.array(), 3, iArr.length);
    }

    public final double g(ByteOrder byteOrder) throws Throwable {
        Object objJ = j(byteOrder);
        if (objJ == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objJ instanceof String) {
            return Double.parseDouble((String) objJ);
        }
        if (objJ instanceof long[]) {
            long[] jArr = (long[]) objJ;
            if (jArr.length == 1) {
                return jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objJ instanceof int[]) {
            int[] iArr = (int[]) objJ;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objJ instanceof double[]) {
            double[] dArr = (double[]) objJ;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objJ instanceof f[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        f[] fVarArr = (f[]) objJ;
        if (fVarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        f fVar = fVarArr[0];
        return fVar.f57108a / fVar.f57109b;
    }

    public final int h(ByteOrder byteOrder) {
        Object objJ = j(byteOrder);
        if (objJ == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objJ instanceof String) {
            return Integer.parseInt((String) objJ);
        }
        if (objJ instanceof long[]) {
            long[] jArr = (long[]) objJ;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objJ instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objJ;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String i(ByteOrder byteOrder) {
        Object objJ = j(byteOrder);
        if (objJ == null) {
            return null;
        }
        if (objJ instanceof String) {
            return (String) objJ;
        }
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        if (objJ instanceof long[]) {
            long[] jArr = (long[]) objJ;
            while (i11 < jArr.length) {
                sb2.append(jArr[i11]);
                i11++;
                if (i11 != jArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (objJ instanceof int[]) {
            int[] iArr = (int[]) objJ;
            while (i11 < iArr.length) {
                sb2.append(iArr[i11]);
                i11++;
                if (i11 != iArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (objJ instanceof double[]) {
            double[] dArr = (double[]) objJ;
            while (i11 < dArr.length) {
                sb2.append(dArr[i11]);
                i11++;
                if (i11 != dArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (!(objJ instanceof f[])) {
            return null;
        }
        f[] fVarArr = (f[]) objJ;
        while (i11 < fVarArr.length) {
            sb2.append(fVarArr[i11].f57108a);
            sb2.append('/');
            sb2.append(fVarArr[i11].f57109b);
            i11++;
            if (i11 != fVarArr.length) {
                sb2.append(",");
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Type inference failed for: r12v17, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.io.Serializable, y5.f[]] */
    /* JADX WARN: Type inference failed for: r12v20, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v21, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v22, types: [java.io.Serializable, y5.f[]] */
    /* JADX WARN: Type inference failed for: r12v23, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v24, types: [double[], java.io.Serializable] */
    public final Serializable j(ByteOrder byteOrder) throws Throwable {
        b bVar;
        byte b3;
        byte[] bArr = this.f57103d;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
            try {
                bVar.f57095c = byteOrder;
                int i11 = this.f57100a;
                int length = 0;
                int i12 = this.f57101b;
                switch (i11) {
                    case 1:
                    case 6:
                        if (bArr.length != 1 || (b3 = bArr[0]) < 0 || b3 > 1) {
                            String str = new String(bArr, h.f57111b0);
                            try {
                                bVar.close();
                                break;
                            } catch (IOException unused) {
                            }
                            return str;
                        }
                        String str2 = new String(new char[]{(char) (b3 + 48)});
                        try {
                            bVar.close();
                            break;
                        } catch (IOException unused2) {
                        }
                        return str2;
                    case 2:
                    case 7:
                        if (i12 >= h.T.length) {
                            int i13 = 0;
                            while (true) {
                                byte[] bArr2 = h.T;
                                if (i13 >= bArr2.length) {
                                    length = bArr2.length;
                                } else if (bArr[i13] == bArr2[i13]) {
                                    i13++;
                                }
                            }
                        }
                        StringBuilder sb2 = new StringBuilder();
                        try {
                            while (length < i12) {
                                byte b11 = bArr[length];
                                if (b11 == 0) {
                                    String string = sb2.toString();
                                    bVar.close();
                                    return string;
                                }
                                if (b11 >= 32) {
                                    sb2.append((char) b11);
                                } else {
                                    sb2.append('?');
                                }
                                length++;
                            }
                            bVar.close();
                            break;
                        } catch (IOException unused3) {
                        }
                        String string2 = sb2.toString();
                        return string2;
                    case 3:
                        ?? r12 = new int[i12];
                        while (length < i12) {
                            r12[length] = bVar.readUnsignedShort();
                            length++;
                        }
                        try {
                            bVar.close();
                            break;
                        } catch (IOException unused4) {
                        }
                        return r12;
                    case 4:
                        ?? r13 = new long[i12];
                        while (length < i12) {
                            r13[length] = ((long) bVar.readInt()) & 4294967295L;
                            length++;
                        }
                        try {
                            bVar.close();
                            break;
                        } catch (IOException unused5) {
                        }
                        return r13;
                    case 5:
                        ?? r14 = new f[i12];
                        while (length < i12) {
                            r14[length] = new f(((long) bVar.readInt()) & 4294967295L, ((long) bVar.readInt()) & 4294967295L);
                            length++;
                        }
                        try {
                            bVar.close();
                            break;
                        } catch (IOException unused6) {
                        }
                        return r14;
                    case 8:
                        ?? r15 = new int[i12];
                        while (length < i12) {
                            r15[length] = bVar.readShort();
                            length++;
                        }
                        try {
                            bVar.close();
                            break;
                        } catch (IOException unused7) {
                        }
                        return r15;
                    case 9:
                        ?? r16 = new int[i12];
                        while (length < i12) {
                            r16[length] = bVar.readInt();
                            length++;
                        }
                        try {
                            bVar.close();
                            break;
                        } catch (IOException unused8) {
                        }
                        return r16;
                    case 10:
                        ?? r17 = new f[i12];
                        while (length < i12) {
                            r17[length] = new f(bVar.readInt(), bVar.readInt());
                            length++;
                        }
                        try {
                            bVar.close();
                            break;
                        } catch (IOException unused9) {
                        }
                        return r17;
                    case 11:
                        ?? r18 = new double[i12];
                        while (length < i12) {
                            r18[length] = bVar.readFloat();
                            length++;
                        }
                        try {
                            bVar.close();
                            break;
                        } catch (IOException unused10) {
                        }
                        return r18;
                    case 12:
                        ?? r19 = new double[i12];
                        while (length < i12) {
                            r19[length] = bVar.readDouble();
                            length++;
                        }
                        try {
                            bVar.close();
                            break;
                        } catch (IOException unused11) {
                        }
                        return r19;
                    default:
                        try {
                            bVar.close();
                            break;
                        } catch (IOException unused12) {
                        }
                        return null;
                }
            } catch (IOException unused13) {
                if (bVar != null) {
                    try {
                        bVar.close();
                    } catch (IOException unused14) {
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                bVar2 = bVar;
                if (bVar2 != null) {
                    try {
                        bVar2.close();
                    } catch (IOException unused15) {
                    }
                }
                throw th;
            }
        } catch (IOException unused16) {
            bVar = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(h.R[this.f57100a]);
        sb2.append(", data length:");
        return p0.i(this.f57103d.length, ")", sb2);
    }

    public d(long j11, int i11, byte[] bArr, int i12) {
        this.f57100a = i11;
        this.f57101b = i12;
        this.f57102c = j11;
        this.f57103d = bArr;
    }
}
