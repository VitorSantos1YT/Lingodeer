package r8;

import b7.w;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.ImmutableIntArray;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;
import y6.b0;
import y6.c0;
import y6.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f48940a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static c7.b b(c0 c0Var, String str) {
        int i11 = 0;
        while (true) {
            b0[] b0VarArr = c0Var.f57178a;
            if (i11 >= b0VarArr.length) {
                return null;
            }
            b0 b0Var = b0VarArr[i11];
            if (b0Var instanceof c7.b) {
                c7.b bVar = (c7.b) b0Var;
                if (bVar.f6642a.equals(str)) {
                    return bVar;
                }
            }
            i11++;
        }
    }

    public static String c(ArrayList arrayList) {
        int size = arrayList.size();
        boolean z11 = false;
        String str = null;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            String str2 = ((q) obj).f48974a.f48947g.f57291n;
            if (d0.n(str2)) {
                return "video/mp4";
            }
            if (d0.k(str2)) {
                z11 = true;
            } else if (d0.l(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z11) {
            return "audio/mp4";
        }
        return str != null ? str : "application/mp4";
    }

    public static boolean d(int i11, boolean z11) {
        if ((i11 >>> 8) == 3368816) {
            return true;
        }
        if (i11 == 1751476579 && z11) {
            return true;
        }
        for (int i12 = 0; i12 < 29; i12++) {
            if (f48940a[i12] == i11) {
                return true;
            }
        }
        return false;
    }

    public static l8.a e(w wVar) {
        String str;
        int iJ = wVar.j();
        if (wVar.j() != 1684108385) {
            b7.a.B("Failed to parse cover art attribute");
            return null;
        }
        int iJ2 = wVar.j();
        byte[] bArr = c.f48855a;
        int i11 = iJ2 & 16777215;
        if (i11 == 13) {
            str = "image/jpeg";
        } else {
            str = i11 == 14 ? "image/png" : null;
        }
        if (str == null) {
            defpackage.e.y(i11, "Unrecognized cover art flags: ");
            return null;
        }
        wVar.J(4);
        int i12 = iJ - 16;
        byte[] bArr2 = new byte[i12];
        wVar.h(bArr2, 0, i12);
        return new l8.a(3, str, null, bArr2);
    }

    public static l8.o f(int i11, w wVar, String str) {
        int iJ = wVar.j();
        if (wVar.j() == 1684108385 && iJ >= 22) {
            wVar.J(10);
            int iC = wVar.C();
            if (iC > 0) {
                String strJ = nv.p.j(iC, BuildConfig.VERSION_NAME);
                int iC2 = wVar.C();
                if (iC2 > 0) {
                    strJ = nv.p.k(iC2, strJ, "/");
                }
                return new l8.o(ImmutableList.u(strJ), str, null);
            }
        }
        b7.a.B("Failed to parse index/count attribute: " + c7.f.c(i11));
        return null;
    }

    public static int g(w wVar) {
        int iJ = wVar.j();
        if (wVar.j() == 1684108385) {
            wVar.J(8);
            int i11 = iJ - 16;
            if (i11 == 1) {
                return wVar.w();
            }
            if (i11 == 2) {
                return wVar.C();
            }
            if (i11 == 3) {
                return wVar.z();
            }
            if (i11 == 4 && (wVar.f4039a[wVar.f4040b] & 128) == 0) {
                return wVar.A();
            }
        }
        b7.a.B("Failed to parse data atom to int");
        return -1;
    }

    public static l8.j h(int i11, String str, w wVar, boolean z11, boolean z12) {
        int iG = g(wVar);
        if (z12) {
            iG = Math.min(1, iG);
        }
        if (iG >= 0) {
            return z11 ? new l8.o(ImmutableList.u(Integer.toString(iG)), str, null) : new l8.e("und", str, Integer.toString(iG));
        }
        b7.a.B("Failed to parse uint8 attribute: " + c7.f.c(i11));
        return null;
    }

    public static o20.w i(byte[] bArr) {
        UUID[] uuidArr;
        w wVar = new w(bArr);
        if (wVar.f4041c < 32) {
            return null;
        }
        wVar.I(0);
        int iA = wVar.a();
        int iJ = wVar.j();
        if (iJ != iA) {
            b7.a.B("Advertised atom size (" + iJ + ") does not match buffer size: " + iA);
            return null;
        }
        int iJ2 = wVar.j();
        if (iJ2 != 1886614376) {
            defpackage.e.y(iJ2, "Atom type is not pssh: ");
            return null;
        }
        int iE = c.e(wVar.j());
        if (iE > 1) {
            defpackage.e.y(iE, "Unsupported pssh version: ");
            return null;
        }
        UUID uuid = new UUID(wVar.q(), wVar.q());
        if (iE == 1) {
            int iA2 = wVar.A();
            uuidArr = new UUID[iA2];
            for (int i11 = 0; i11 < iA2; i11++) {
                uuidArr[i11] = new UUID(wVar.q(), wVar.q());
            }
        } else {
            uuidArr = null;
        }
        int iA3 = wVar.A();
        int iA4 = wVar.a();
        if (iA3 == iA4) {
            byte[] bArr2 = new byte[iA3];
            wVar.h(bArr2, 0, iA3);
            return new o20.w(uuid, iE, bArr2, uuidArr);
        }
        b7.a.B("Atom data size (" + iA3 + ") does not match the bytes left: " + iA4);
        return null;
    }

    public static l8.o j(int i11, w wVar, String str) {
        int iJ = wVar.j();
        if (wVar.j() == 1684108385) {
            wVar.J(8);
            return new l8.o(ImmutableList.u(wVar.s(iJ - 16)), str, null);
        }
        b7.a.B("Failed to parse text attribute: " + c7.f.c(i11));
        return null;
    }

    public static void k(int i11, c0 c0Var, y6.o oVar, c0 c0Var2, c0... c0VarArr) {
        if (c0Var2 == null) {
            c0Var2 = new c0(new b0[0]);
        }
        if (c0Var != null) {
            int i12 = 0;
            while (true) {
                b0[] b0VarArr = c0Var.f57178a;
                if (i12 >= b0VarArr.length) {
                    break;
                }
                b0 b0Var = b0VarArr[i12];
                if (b0Var instanceof c7.b) {
                    c7.b bVar = (c7.b) b0Var;
                    if (!bVar.f6642a.equals("com.android.capture.fps")) {
                        c0Var2 = c0Var2.a(bVar);
                    } else if (i11 == 2) {
                        c0Var2 = c0Var2.a(bVar);
                    }
                }
                i12++;
            }
        }
        for (c0 c0Var3 : c0VarArr) {
            c0Var2 = c0Var2.b(c0Var3);
        }
        if (c0Var2.f57178a.length > 0) {
            oVar.f57263k = c0Var2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0077  */
    /* JADX WARN: Code duplicated, block: B:83:0x0138  */
    /* JADX WARN: Code duplicated, block: B:85:0x013b  */
    /* JADX WARN: Code duplicated, block: B:87:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0141  */
    /* JADX WARN: Code duplicated, block: B:90:0x0144  */
    /* JADX WARN: Code duplicated, block: B:92:0x0147 A[RETURN] */
    public static x7.c0 l(x7.n nVar, boolean z11, boolean z12) {
        x7.c0 c0Var;
        int i11;
        int i12;
        int i13;
        int[] iArr;
        long length = nVar.getLength();
        long j11 = -1;
        long j12 = 4096;
        if (length != -1 && length <= 4096) {
            j12 = length;
        }
        int i14 = (int) j12;
        w wVar = new w(64);
        int i15 = 0;
        int i16 = 0;
        boolean z13 = false;
        while (true) {
            if (i16 < i14) {
                wVar.F(8);
                boolean z14 = true;
                if (nVar.f(wVar.f4039a, i15, 8, true)) {
                    long jY = wVar.y();
                    int iJ = wVar.j();
                    if (jY == 1) {
                        j11 = j11;
                        nVar.A(wVar.f4039a, 8, 8);
                        i12 = 16;
                        wVar.H(16);
                        jY = wVar.q();
                        i16 = i16;
                    } else {
                        j11 = j11;
                        if (jY == 0) {
                            long length2 = nVar.getLength();
                            if (length2 != j11) {
                                jY = (length2 - nVar.i()) + ((long) 8);
                            }
                        }
                        i12 = 8;
                    }
                    long j13 = jY;
                    long j14 = i12;
                    if (j13 < j14) {
                        return new h();
                    }
                    int i17 = i16 + i12;
                    c0Var = null;
                    if (iJ == 1836019574) {
                        i14 += (int) j13;
                        if (length != -1 && i14 > length) {
                            i14 = (int) length;
                        }
                        i16 = i17;
                        i15 = 0;
                    } else if (iJ == 1836019558 || iJ == 1836475768) {
                        i11 = 1;
                    } else {
                        if (iJ == 1835295092) {
                            z13 = true;
                        }
                        long j15 = length;
                        if ((((long) i17) + j13) - j14 >= i14) {
                            i11 = 0;
                        } else {
                            int i18 = (int) (j13 - j14);
                            i16 = i17 + i18;
                            if (iJ != 1718909296) {
                                i13 = 0;
                                if (i18 != 0) {
                                    nVar.k(i18);
                                }
                            } else {
                                if (i18 < 8) {
                                    return new h();
                                }
                                wVar.F(i18);
                                i13 = 0;
                                nVar.A(wVar.f4039a, 0, i18);
                                if (d(wVar.j(), z12)) {
                                    z13 = true;
                                }
                                wVar.J(4);
                                int iA = wVar.a() / 4;
                                if (!z13 && iA > 0) {
                                    iArr = new int[iA];
                                    int i19 = 0;
                                    while (true) {
                                        if (i19 >= iA) {
                                            z14 = z13;
                                            break;
                                        }
                                        int iJ2 = wVar.j();
                                        iArr[i19] = iJ2;
                                        if (d(iJ2, z12)) {
                                            break;
                                        }
                                        i19++;
                                    }
                                } else {
                                    z14 = z13;
                                    iArr = null;
                                }
                                if (!z14) {
                                    h hVar = new h();
                                    if (iArr != null && iArr.length != 0) {
                                        new ImmutableIntArray(Arrays.copyOf(iArr, iArr.length));
                                    }
                                    return hVar;
                                }
                                z13 = z14;
                            }
                            i15 = i13;
                            length = j15;
                        }
                    }
                }
                if (!z13) {
                    return h.f48902c;
                }
                if (z11 != i11) {
                    return i11 != 0 ? h.f48900a : h.f48901b;
                }
                return c0Var;
            }
            c0Var = null;
            i11 = i15;
            if (!z13) {
                return h.f48902c;
            }
            if (z11 != i11) {
                if (i11 != 0) {
                }
            }
            return c0Var;
        }
    }
}
