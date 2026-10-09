package m00;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class l implements Serializable, Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f40723d = new l(new byte[0]);
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f40724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int f40725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient String f40726c;

    public l(byte[] data) {
        kotlin.jvm.internal.m.f(data, "data");
        this.f40724a = data;
    }

    public static int h(l lVar, l other) {
        lVar.getClass();
        kotlin.jvm.internal.m.f(other, "other");
        return lVar.g(other.j(), 0);
    }

    public static int m(l lVar, l other) {
        lVar.getClass();
        kotlin.jvm.internal.m.f(other, "other");
        return lVar.l(other.j());
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException {
        int i11 = objectInputStream.readInt();
        if (i11 < 0) {
            throw new IllegalArgumentException(nv.p.j(i11, "byteCount < 0: ").toString());
        }
        byte[] bArr = new byte[i11];
        int i12 = 0;
        while (i12 < i11) {
            int i13 = objectInputStream.read(bArr, i12, i11 - i12);
            if (i13 == -1) {
                throw new EOFException();
            }
            i12 += i13;
        }
        l lVar = new l(bArr);
        Field declaredField = l.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        declaredField.set(this, lVar.f40724a);
    }

    public static /* synthetic */ l s(l lVar, int i11, int i12, int i13) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = -1234567890;
        }
        return lVar.r(i11, i12);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f40724a.length);
        objectOutputStream.write(this.f40724a);
    }

    public String a() {
        byte[] bArr = this.f40724a;
        byte[] map = a.f40672a;
        kotlin.jvm.internal.m.f(bArr, "<this>");
        kotlin.jvm.internal.m.f(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            byte b3 = bArr[i11];
            int i13 = i11 + 2;
            byte b11 = bArr[i11 + 1];
            i11 += 3;
            byte b12 = bArr[i13];
            bArr2[i12] = map[(b3 & 255) >> 2];
            bArr2[i12 + 1] = map[((b3 & 3) << 4) | ((b11 & 255) >> 4)];
            int i14 = i12 + 3;
            bArr2[i12 + 2] = map[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i12 += 4;
            bArr2[i14] = map[b12 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b13 = bArr[i11];
            bArr2[i12] = map[(b13 & 255) >> 2];
            bArr2[i12 + 1] = map[(b13 & 3) << 4];
            bArr2[i12 + 2] = 61;
            bArr2[i12 + 3] = 61;
        } else if (length2 == 2) {
            int i15 = i11 + 1;
            byte b14 = bArr[i11];
            byte b15 = bArr[i15];
            bArr2[i12] = map[(b14 & 255) >> 2];
            bArr2[i12 + 1] = map[((b14 & 3) << 4) | ((b15 & 255) >> 4)];
            bArr2[i12 + 2] = map[(b15 & 15) << 2];
            bArr2[i12 + 3] = 61;
        }
        return new String(bArr2, oz.a.f46133a);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(l other) {
        kotlin.jvm.internal.m.f(other, "other");
        int iE = e();
        int iE2 = other.e();
        int iMin = Math.min(iE, iE2);
        for (int i11 = 0; i11 < iMin; i11++) {
            int iK = k(i11) & 255;
            int iK2 = other.k(i11) & 255;
            if (iK != iK2) {
                return iK < iK2 ? -1 : 1;
            }
        }
        if (iE == iE2) {
            return 0;
        }
        return iE < iE2 ? -1 : 1;
    }

    public l c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f40724a, 0, e());
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.m.c(bArrDigest);
        return new l(bArrDigest);
    }

    public int e() {
        return this.f40724a.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            int iE = lVar.e();
            byte[] bArr = this.f40724a;
            if (iE == bArr.length && lVar.o(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        byte[] bArr = this.f40724a;
        char[] cArr = new char[bArr.length * 2];
        int i11 = 0;
        for (byte b3 : bArr) {
            int i12 = i11 + 1;
            char[] cArr2 = n00.b.f43059a;
            cArr[i11] = cArr2[(b3 >> 4) & 15];
            i11 += 2;
            cArr[i12] = cArr2[b3 & 15];
        }
        return new String(cArr);
    }

    public int g(byte[] other, int i11) {
        kotlin.jvm.internal.m.f(other, "other");
        int length = this.f40724a.length - other.length;
        int iMax = Math.max(i11, 0);
        if (iMax > length) {
            return -1;
        }
        while (!b.a(iMax, 0, other.length, this.f40724a, other)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public int hashCode() {
        int i11 = this.f40725b;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = Arrays.hashCode(this.f40724a);
        this.f40725b = iHashCode;
        return iHashCode;
    }

    public byte[] j() {
        return this.f40724a;
    }

    public byte k(int i11) {
        return this.f40724a[i11];
    }

    public int l(byte[] other) {
        kotlin.jvm.internal.m.f(other, "other");
        for (int iMin = Math.min(e(), this.f40724a.length - other.length); -1 < iMin; iMin--) {
            if (b.a(iMin, 0, other.length, this.f40724a, other)) {
                return iMin;
            }
        }
        return -1;
    }

    public boolean n(int i11, l other, int i12) {
        kotlin.jvm.internal.m.f(other, "other");
        return other.o(0, this.f40724a, i11, i12);
    }

    public boolean o(int i11, byte[] other, int i12, int i13) {
        kotlin.jvm.internal.m.f(other, "other");
        if (i11 < 0) {
            return false;
        }
        byte[] bArr = this.f40724a;
        return i11 <= bArr.length - i13 && i12 >= 0 && i12 <= other.length - i13 && b.a(i11, i12, i13, bArr, other);
    }

    public final boolean p(l prefix) {
        kotlin.jvm.internal.m.f(prefix, "prefix");
        return n(0, prefix, prefix.e());
    }

    public String q(Charset charset) {
        kotlin.jvm.internal.m.f(charset, "charset");
        return new String(this.f40724a, charset);
    }

    public l r(int i11, int i12) {
        if (i12 == -1234567890) {
            i12 = e();
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f40724a;
        if (i12 > bArr.length) {
            throw new IllegalArgumentException(ep.a.j(new StringBuilder("endIndex > length("), this.f40724a.length, ')').toString());
        }
        if (i12 - i11 >= 0) {
            return (i11 == 0 && i12 == bArr.length) ? this : new l(ry.l.M(bArr, i11, i12));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    public l t() {
        int i11 = 0;
        while (true) {
            byte[] bArr = this.f40724a;
            if (i11 >= bArr.length) {
                return this;
            }
            byte b3 = bArr[i11];
            if (b3 >= 65 && b3 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                kotlin.jvm.internal.m.e(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i11] = (byte) (b3 + 32);
                for (int i12 = i11 + 1; i12 < bArrCopyOf.length; i12++) {
                    byte b11 = bArrCopyOf[i12];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i12] = (byte) (b11 + 32);
                    }
                }
                return new l(bArrCopyOf);
            }
            i11++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:179:0x01b6 A[EDGE_INSN: B:179:0x01b6->B:180:0x01b7 BREAK  A[LOOP:0: B:7:0x000e->B:241:0x000e]] */
    public String toString() {
        byte b3;
        int i11;
        byte[] bArr = this.f40724a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        loop0: while (i12 < length) {
            byte b11 = bArr[i12];
            if (b11 < 0) {
                if ((b11 >> 5) != -2) {
                    if ((b11 >> 4) != -2) {
                        if ((b11 >> 3) != -2) {
                            if (i14 == 64) {
                                break;
                            }
                            i13 = -1;
                            break;
                        }
                        int i15 = i12 + 3;
                        if (length > i15) {
                            byte b12 = bArr[i12 + 1];
                            if ((b12 & 192) != 128) {
                                if (i14 == 64) {
                                    break;
                                }
                                i13 = -1;
                                break;
                            }
                            byte b13 = bArr[i12 + 2];
                            if ((b13 & 192) != 128) {
                                if (i14 == 64) {
                                    break;
                                }
                                i13 = -1;
                                break;
                            }
                            byte b14 = bArr[i15];
                            if ((b14 & 192) != 128) {
                                if (i14 == 64) {
                                    break;
                                }
                                i13 = -1;
                                break;
                            }
                            int i16 = (((b14 ^ 3678080) ^ (b13 << 6)) ^ (b12 << 12)) ^ (b11 << 18);
                            if (i16 <= 1114111) {
                                if (55296 <= i16 && i16 < 57344) {
                                    if (i14 == 64) {
                                        break;
                                    }
                                    i13 = -1;
                                    break;
                                }
                                if (i16 >= 65536) {
                                    i11 = i14 + 1;
                                    if (i14 == 64) {
                                        break;
                                    }
                                    if ((i16 != 10 && i16 != 13 && ((i16 >= 0 && i16 < 32) || (127 <= i16 && i16 < 160))) || i16 == 65533) {
                                        i13 = -1;
                                        break;
                                    }
                                    i13 += i16 < 65536 ? 1 : 2;
                                    i12 += 4;
                                    i14 = i11;
                                } else {
                                    if (i14 == 64) {
                                        break;
                                    }
                                    i13 = -1;
                                    break;
                                }
                            } else {
                                if (i14 == 64) {
                                    break;
                                }
                                i13 = -1;
                                break;
                            }
                        } else {
                            if (i14 == 64) {
                                break;
                            }
                            i13 = -1;
                            break;
                        }
                    } else {
                        int i17 = i12 + 2;
                        if (length > i17) {
                            byte b15 = bArr[i12 + 1];
                            if ((b15 & 192) != 128) {
                                if (i14 == 64) {
                                    break;
                                }
                                i13 = -1;
                                break;
                            }
                            byte b16 = bArr[i17];
                            if ((b16 & 192) != 128) {
                                if (i14 == 64) {
                                    break;
                                }
                                i13 = -1;
                                break;
                            }
                            int i18 = ((b16 ^ (-123008)) ^ (b15 << 6)) ^ (b11 << 12);
                            if (i18 >= 2048) {
                                if (55296 <= i18 && i18 < 57344) {
                                    if (i14 == 64) {
                                        break;
                                    }
                                    i13 = -1;
                                    break;
                                }
                                i11 = i14 + 1;
                                if (i14 == 64) {
                                    break;
                                }
                                if ((i18 != 10 && i18 != 13 && ((i18 >= 0 && i18 < 32) || (127 <= i18 && i18 < 160))) || i18 == 65533) {
                                    i13 = -1;
                                    break;
                                }
                                i13 += i18 < 65536 ? 1 : 2;
                                i12 += 3;
                                i14 = i11;
                            } else {
                                if (i14 == 64) {
                                    break;
                                }
                                i13 = -1;
                                break;
                            }
                        } else {
                            if (i14 == 64) {
                                break;
                            }
                            i13 = -1;
                            break;
                        }
                    }
                } else {
                    int i19 = i12 + 1;
                    if (length > i19) {
                        byte b17 = bArr[i19];
                        if ((b17 & 192) != 128) {
                            if (i14 == 64) {
                                break;
                            }
                            i13 = -1;
                            break;
                        }
                        int i21 = (b17 ^ 3968) ^ (b11 << 6);
                        if (i21 >= 128) {
                            i11 = i14 + 1;
                            if (i14 == 64) {
                                break;
                            }
                            if ((i21 != 10 && i21 != 13 && ((i21 >= 0 && i21 < 32) || (127 <= i21 && i21 < 160))) || i21 == 65533) {
                                i13 = -1;
                                break;
                            }
                            i13 += i21 < 65536 ? 1 : 2;
                            i12 += 2;
                            i14 = i11;
                        } else {
                            if (i14 == 64) {
                                break;
                            }
                            i13 = -1;
                            break;
                        }
                    } else {
                        if (i14 == 64) {
                            break;
                        }
                        i13 = -1;
                        break;
                    }
                }
            } else {
                int i22 = i14 + 1;
                if (i14 == 64) {
                    break;
                }
                if ((b11 == 10 || b11 == 13 || ((b11 < 0 || b11 >= 32) && (127 > b11 || b11 >= 160))) && b11 != 65533) {
                    i13 += b11 < 65536 ? 1 : 2;
                    i12++;
                    while (true) {
                        i14 = i22;
                        if (i12 < length && (b3 = bArr[i12]) >= 0) {
                            i12++;
                            i22 = i14 + 1;
                            if (i14 == 64) {
                                break loop0;
                            }
                            if ((b3 == 10 || b3 == 13 || ((b3 < 0 || b3 >= 32) && (127 > b3 || b3 >= 160))) && b3 != 65533) {
                                i13 += b3 < 65536 ? 1 : 2;
                            }
                        }
                    }
                }
                i13 = -1;
                break;
            }
        }
        if (i13 != -1) {
            String strV = v();
            String strSubstring = strV.substring(0, i13);
            kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
            String strQ0 = oz.x.q0(oz.x.q0(oz.x.q0(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i13 >= strV.length()) {
                return nv.p.q("[text=", strQ0, ']');
            }
            return "[size=" + this.f40724a.length + " text=" + strQ0 + "…]";
        }
        if (this.f40724a.length <= 64) {
            return "[hex=" + f() + ']';
        }
        StringBuilder sb2 = new StringBuilder("[size=");
        sb2.append(this.f40724a.length);
        sb2.append(" hex=");
        byte[] bArr2 = this.f40724a;
        if (64 > bArr2.length) {
            throw new IllegalArgumentException(ep.a.j(new StringBuilder("endIndex > length("), this.f40724a.length, ')').toString());
        }
        sb2.append((64 == bArr2.length ? this : new l(ry.l.M(bArr2, 0, 64))).f());
        sb2.append("…]");
        return sb2.toString();
    }

    public byte[] u() {
        byte[] bArr = this.f40724a;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.m.e(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public final String v() {
        String str = this.f40726c;
        if (str != null) {
            return str;
        }
        byte[] bArrJ = j();
        kotlin.jvm.internal.m.f(bArrJ, "<this>");
        String str2 = new String(bArrJ, oz.a.f46133a);
        this.f40726c = str2;
        return str2;
    }

    public void w(i iVar, int i11) {
        iVar.m229write(this.f40724a, 0, i11);
    }
}
