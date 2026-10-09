package v8;

import b7.w;
import com.google.protobuf.DescriptorProtos;
import com.lingodeer.data.model.AchievementLevelType;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f53745i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f53746j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f53747k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f53750o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f53751p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f53752q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f53753r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f53754s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f53755t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte f53756u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte f53757v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f53759x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f53760y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f53743z = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, AchievementLevelType.DAY_STREAK_LV_7, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w f53744h = new w();
    public final ArrayList m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f53749n = new b(0, 4);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f53758w = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f53748l = 16000000;

    public c(String str, int i11) {
        this.f53745i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i11 == 1) {
            this.f53747k = 0;
            this.f53746j = 0;
        } else if (i11 == 2) {
            this.f53747k = 1;
            this.f53746j = 0;
        } else if (i11 == 3) {
            this.f53747k = 0;
            this.f53746j = 1;
        } else if (i11 != 4) {
            b7.a.B("Invalid channel. Defaulting to CC1.");
            this.f53747k = 0;
            this.f53746j = 0;
        } else {
            this.f53747k = 1;
            this.f53746j = 1;
        }
        l(0);
        k();
        this.f53759x = true;
        this.f53760y = -9223372036854775807L;
    }

    @Override // v8.h
    public final tp.g f() {
        List list = this.f53750o;
        this.f53751p = list;
        list.getClass();
        return new tp.g(list, 3);
    }

    @Override // v8.h, e7.c
    public final void flush() {
        super.flush();
        this.f53750o = null;
        this.f53751p = null;
        l(0);
        this.f53753r = 4;
        this.f53749n.f53742h = 4;
        k();
        this.f53754s = false;
        this.f53755t = false;
        this.f53756u = (byte) 0;
        this.f53757v = (byte) 0;
        this.f53758w = 0;
        this.f53759x = true;
        this.f53760y = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x019a  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:134:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:141:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01da  */
    /* JADX WARN: Code duplicated, block: B:143:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:148:0x0207 A[LOOP:1: B:146:0x0201->B:148:0x0207, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x020b  */
    /* JADX WARN: Code duplicated, block: B:151:0x0211 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x0213  */
    /* JADX WARN: Code duplicated, block: B:153:0x0218  */
    /* JADX WARN: Code duplicated, block: B:154:0x021f  */
    /* JADX WARN: Code duplicated, block: B:155:0x022a  */
    /* JADX WARN: Code duplicated, block: B:156:0x0235  */
    /* JADX WARN: Code duplicated, block: B:157:0x0240  */
    /* JADX WARN: Code duplicated, block: B:158:0x0245  */
    /* JADX WARN: Code duplicated, block: B:159:0x024a  */
    /* JADX WARN: Code duplicated, block: B:161:0x025b  */
    /* JADX WARN: Code duplicated, block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x012a  */
    /* JADX WARN: Code duplicated, block: B:93:0x012e  */
    @Override // v8.h
    public final void g(g gVar) {
        boolean z11;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        int i14;
        ArrayList arrayList;
        int iMin;
        ByteBuffer byteBuffer = gVar.f25115e;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        w wVar = this.f53744h;
        wVar.G(bArrArray, iLimit);
        boolean z12 = false;
        while (true) {
            int iA = wVar.a();
            int i15 = this.f53745i;
            if (iA < i15) {
                if (z12) {
                    int i16 = this.f53752q;
                    if (i16 == 1 || i16 == 3) {
                        this.f53750o = j();
                        this.f53760y = this.f53802e;
                        return;
                    }
                    return;
                }
                return;
            }
            int iW = i15 == 2 ? -4 : wVar.w();
            int iW2 = wVar.w();
            int iW3 = wVar.w();
            if ((iW & 2) == 0 && (iW & 1) == this.f53746j) {
                byte b3 = (byte) (iW2 & 127);
                byte b11 = (byte) (iW3 & 127);
                if (b3 != 0 || b11 != 0) {
                    boolean z13 = this.f53754s;
                    if ((iW & 4) == 4) {
                        boolean[] zArr = G;
                        if (zArr[iW2] && zArr[iW3]) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    } else {
                        z11 = false;
                    }
                    this.f53754s = z11;
                    if (!z11 || (b3 & 240) != 16) {
                        this.f53755t = false;
                        if (!z11) {
                            if (1 > b3 && b3 <= 15) {
                                this.f53759x = false;
                            } else if ((b3 & 246) == 20) {
                                if (b11 == 32 && b11 != 47) {
                                    switch (b11) {
                                        default:
                                            switch (b11) {
                                                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                                                case 43:
                                                    this.f53759x = false;
                                                    break;
                                            }
                                        case 37:
                                        case 38:
                                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                            this.f53759x = true;
                                            break;
                                    }
                                } else {
                                    this.f53759x = true;
                                }
                            }
                            if (this.f53759x) {
                                i11 = b3 & 224;
                                if (i11 == 0) {
                                    this.f53758w = (b3 >> 3) & 1;
                                }
                                if (this.f53758w != this.f53747k) {
                                    if (i11 == 0) {
                                        i12 = b3 & 247;
                                        if (i12 == 17 || (b11 & 240) != 48) {
                                            i13 = b3 & 246;
                                            if (i13 != 18 && (b11 & 224) == 32) {
                                                this.f53749n.b();
                                                this.f53749n.a((char) ((b3 & 1) == 0 ? E[b11 & 31] : F[b11 & 31]));
                                            } else if (i12 != 17 && (b11 & 240) == 32) {
                                                this.f53749n.a(' ');
                                                boolean z14 = (b11 & 1) == 1;
                                                b bVar = this.f53749n;
                                                bVar.f53735a.add(new a((b11 >> 1) & 7, z14, bVar.f53737c.length()));
                                            } else if ((b3 & 240) != 16 && (b11 & 192) == 64) {
                                                int i17 = f53743z[b3 & 7];
                                                if ((b11 & 32) != 0) {
                                                    i17++;
                                                }
                                                b bVar2 = this.f53749n;
                                                if (i17 != bVar2.f53738d) {
                                                    if (this.f53752q != 1 && !bVar2.e()) {
                                                        b bVar3 = new b(this.f53752q, this.f53753r);
                                                        this.f53749n = bVar3;
                                                        this.m.add(bVar3);
                                                    }
                                                    this.f53749n.f53738d = i17;
                                                }
                                                boolean z15 = (b11 & 16) == 16;
                                                boolean z16 = (b11 & 1) == 1;
                                                int i18 = (b11 >> 1) & 7;
                                                b bVar4 = this.f53749n;
                                                bVar4.f53735a.add(new a(z15 ? 8 : i18, z16, bVar4.f53737c.length()));
                                                if (z15) {
                                                    this.f53749n.f53739e = A[i18];
                                                }
                                            } else if (i12 != 23 && b11 >= 33 && b11 <= 35) {
                                                this.f53749n.f53740f = b11 - 32;
                                            } else if (i13 == 20 && (b11 & 240) == 32) {
                                                if (b11 == 32) {
                                                    l(2);
                                                } else if (b11 != 41) {
                                                    switch (b11) {
                                                        case 37:
                                                            l(1);
                                                            this.f53753r = 2;
                                                            this.f53749n.f53742h = 2;
                                                            break;
                                                        case 38:
                                                            l(1);
                                                            this.f53753r = 3;
                                                            this.f53749n.f53742h = 3;
                                                            break;
                                                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                            l(1);
                                                            this.f53753r = 4;
                                                            this.f53749n.f53742h = 4;
                                                            break;
                                                        default:
                                                            i14 = this.f53752q;
                                                            if (i14 != 0) {
                                                                if (b11 != 33) {
                                                                    switch (b11) {
                                                                        case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                            this.f53750o = Collections.EMPTY_LIST;
                                                                            if (i14 != 1 || i14 == 3) {
                                                                                k();
                                                                            }
                                                                            break;
                                                                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                            if (i14 == 1 && !this.f53749n.e()) {
                                                                                b bVar5 = this.f53749n;
                                                                                arrayList = bVar5.f53736b;
                                                                                arrayList.add(bVar5.d());
                                                                                bVar5.f53737c.setLength(0);
                                                                                bVar5.f53735a.clear();
                                                                                iMin = Math.min(bVar5.f53742h, bVar5.f53738d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            k();
                                                                            break;
                                                                        case 47:
                                                                            this.f53750o = j();
                                                                            k();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f53749n.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    l(3);
                                                }
                                            }
                                        } else {
                                            this.f53749n.a((char) D[b11 & 15]);
                                        }
                                    } else {
                                        b bVar6 = this.f53749n;
                                        iArr = C;
                                        bVar6.a((char) iArr[(b3 & 127) - 32]);
                                        if ((b11 & 224) != 0) {
                                            this.f53749n.a((char) iArr[(b11 & 127) - 32]);
                                        }
                                    }
                                    z12 = true;
                                }
                            }
                        } else if (z13) {
                            k();
                            z12 = true;
                        }
                    } else if (this.f53755t && this.f53756u == b3 && this.f53757v == b11) {
                        this.f53755t = false;
                    } else {
                        this.f53755t = true;
                        this.f53756u = b3;
                        this.f53757v = b11;
                        if (!z11) {
                            if (1 > b3) {
                                if ((b3 & 246) == 20) {
                                    if (b11 == 32) {
                                        this.f53759x = true;
                                    } else {
                                        this.f53759x = true;
                                    }
                                }
                            } else if ((b3 & 246) == 20) {
                                if (b11 == 32) {
                                    this.f53759x = true;
                                } else {
                                    this.f53759x = true;
                                }
                            }
                            if (this.f53759x) {
                                i11 = b3 & 224;
                                if (i11 == 0) {
                                    this.f53758w = (b3 >> 3) & 1;
                                }
                                if (this.f53758w != this.f53747k) {
                                    if (i11 == 0) {
                                        i12 = b3 & 247;
                                        if (i12 == 17) {
                                            i13 = b3 & 246;
                                            if (i13 != 18) {
                                                if (i12 != 17) {
                                                    if ((b3 & 240) != 16) {
                                                        if (i12 != 23) {
                                                            if (i13 == 20) {
                                                                if (b11 == 32) {
                                                                    l(2);
                                                                } else if (b11 != 41) {
                                                                    switch (b11) {
                                                                        case 37:
                                                                            l(1);
                                                                            this.f53753r = 2;
                                                                            this.f53749n.f53742h = 2;
                                                                            break;
                                                                        case 38:
                                                                            l(1);
                                                                            this.f53753r = 3;
                                                                            this.f53749n.f53742h = 3;
                                                                            break;
                                                                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                            l(1);
                                                                            this.f53753r = 4;
                                                                            this.f53749n.f53742h = 4;
                                                                            break;
                                                                        default:
                                                                            i14 = this.f53752q;
                                                                            if (i14 != 0) {
                                                                                if (b11 != 33) {
                                                                                    switch (b11) {
                                                                                        case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                            this.f53750o = Collections.EMPTY_LIST;
                                                                                            if (i14 != 1) {
                                                                                                k();
                                                                                            } else {
                                                                                                k();
                                                                                            }
                                                                                            break;
                                                                                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                            if (i14 == 1) {
                                                                                                b bVar7 = this.f53749n;
                                                                                                arrayList = bVar7.f53736b;
                                                                                                arrayList.add(bVar7.d());
                                                                                                bVar7.f53737c.setLength(0);
                                                                                                bVar7.f53735a.clear();
                                                                                                iMin = Math.min(bVar7.f53742h, bVar7.f53738d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            k();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f53750o = j();
                                                                                            k();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f53749n.b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    l(3);
                                                                }
                                                            }
                                                        } else if (i13 == 20) {
                                                            if (b11 == 32) {
                                                                l(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.f53753r = 2;
                                                                        this.f53749n.f53742h = 2;
                                                                        break;
                                                                    case 38:
                                                                        l(1);
                                                                        this.f53753r = 3;
                                                                        this.f53749n.f53742h = 3;
                                                                        break;
                                                                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                        l(1);
                                                                        this.f53753r = 4;
                                                                        this.f53749n.f53742h = 4;
                                                                        break;
                                                                    default:
                                                                        i14 = this.f53752q;
                                                                        if (i14 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                        this.f53750o = Collections.EMPTY_LIST;
                                                                                        if (i14 != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                        if (i14 == 1) {
                                                                                            b bVar8 = this.f53749n;
                                                                                            arrayList = bVar8.f53736b;
                                                                                            arrayList.add(bVar8.d());
                                                                                            bVar8.f53737c.setLength(0);
                                                                                            bVar8.f53735a.clear();
                                                                                            iMin = Math.min(bVar8.f53742h, bVar8.f53738d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f53750o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f53749n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i12 != 23) {
                                                        if (i13 == 20) {
                                                            if (b11 == 32) {
                                                                l(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.f53753r = 2;
                                                                        this.f53749n.f53742h = 2;
                                                                        break;
                                                                    case 38:
                                                                        l(1);
                                                                        this.f53753r = 3;
                                                                        this.f53749n.f53742h = 3;
                                                                        break;
                                                                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                        l(1);
                                                                        this.f53753r = 4;
                                                                        this.f53749n.f53742h = 4;
                                                                        break;
                                                                    default:
                                                                        i14 = this.f53752q;
                                                                        if (i14 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                        this.f53750o = Collections.EMPTY_LIST;
                                                                                        if (i14 != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                        if (i14 == 1) {
                                                                                            b bVar9 = this.f53749n;
                                                                                            arrayList = bVar9.f53736b;
                                                                                            arrayList.add(bVar9.d());
                                                                                            bVar9.f53737c.setLength(0);
                                                                                            bVar9.f53735a.clear();
                                                                                            iMin = Math.min(bVar9.f53742h, bVar9.f53738d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f53750o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f53749n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i13 == 20) {
                                                        if (b11 == 32) {
                                                            l(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    l(1);
                                                                    this.f53753r = 2;
                                                                    this.f53749n.f53742h = 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.f53753r = 3;
                                                                    this.f53749n.f53742h = 3;
                                                                    break;
                                                                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                    l(1);
                                                                    this.f53753r = 4;
                                                                    this.f53749n.f53742h = 4;
                                                                    break;
                                                                default:
                                                                    i14 = this.f53752q;
                                                                    if (i14 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                    this.f53750o = Collections.EMPTY_LIST;
                                                                                    if (i14 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                    if (i14 == 1) {
                                                                                        b bVar10 = this.f53749n;
                                                                                        arrayList = bVar10.f53736b;
                                                                                        arrayList.add(bVar10.d());
                                                                                        bVar10.f53737c.setLength(0);
                                                                                        bVar10.f53735a.clear();
                                                                                        iMin = Math.min(bVar10.f53742h, bVar10.f53738d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f53750o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f53749n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if ((b3 & 240) != 16) {
                                                    if (i12 != 23) {
                                                        if (i13 == 20) {
                                                            if (b11 == 32) {
                                                                l(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.f53753r = 2;
                                                                        this.f53749n.f53742h = 2;
                                                                        break;
                                                                    case 38:
                                                                        l(1);
                                                                        this.f53753r = 3;
                                                                        this.f53749n.f53742h = 3;
                                                                        break;
                                                                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                        l(1);
                                                                        this.f53753r = 4;
                                                                        this.f53749n.f53742h = 4;
                                                                        break;
                                                                    default:
                                                                        i14 = this.f53752q;
                                                                        if (i14 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                        this.f53750o = Collections.EMPTY_LIST;
                                                                                        if (i14 != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                        if (i14 == 1) {
                                                                                            b bVar11 = this.f53749n;
                                                                                            arrayList = bVar11.f53736b;
                                                                                            arrayList.add(bVar11.d());
                                                                                            bVar11.f53737c.setLength(0);
                                                                                            bVar11.f53735a.clear();
                                                                                            iMin = Math.min(bVar11.f53742h, bVar11.f53738d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f53750o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f53749n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i13 == 20) {
                                                        if (b11 == 32) {
                                                            l(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    l(1);
                                                                    this.f53753r = 2;
                                                                    this.f53749n.f53742h = 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.f53753r = 3;
                                                                    this.f53749n.f53742h = 3;
                                                                    break;
                                                                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                    l(1);
                                                                    this.f53753r = 4;
                                                                    this.f53749n.f53742h = 4;
                                                                    break;
                                                                default:
                                                                    i14 = this.f53752q;
                                                                    if (i14 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                    this.f53750o = Collections.EMPTY_LIST;
                                                                                    if (i14 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                    if (i14 == 1) {
                                                                                        b bVar12 = this.f53749n;
                                                                                        arrayList = bVar12.f53736b;
                                                                                        arrayList.add(bVar12.d());
                                                                                        bVar12.f53737c.setLength(0);
                                                                                        bVar12.f53735a.clear();
                                                                                        iMin = Math.min(bVar12.f53742h, bVar12.f53738d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f53750o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f53749n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i12 != 23) {
                                                    if (i13 == 20) {
                                                        if (b11 == 32) {
                                                            l(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    l(1);
                                                                    this.f53753r = 2;
                                                                    this.f53749n.f53742h = 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.f53753r = 3;
                                                                    this.f53749n.f53742h = 3;
                                                                    break;
                                                                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                    l(1);
                                                                    this.f53753r = 4;
                                                                    this.f53749n.f53742h = 4;
                                                                    break;
                                                                default:
                                                                    i14 = this.f53752q;
                                                                    if (i14 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                    this.f53750o = Collections.EMPTY_LIST;
                                                                                    if (i14 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                    if (i14 == 1) {
                                                                                        b bVar13 = this.f53749n;
                                                                                        arrayList = bVar13.f53736b;
                                                                                        arrayList.add(bVar13.d());
                                                                                        bVar13.f53737c.setLength(0);
                                                                                        bVar13.f53735a.clear();
                                                                                        iMin = Math.min(bVar13.f53742h, bVar13.f53738d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f53750o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f53749n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i13 == 20) {
                                                    if (b11 == 32) {
                                                        l(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                l(1);
                                                                this.f53753r = 2;
                                                                this.f53749n.f53742h = 2;
                                                                break;
                                                            case 38:
                                                                l(1);
                                                                this.f53753r = 3;
                                                                this.f53749n.f53742h = 3;
                                                                break;
                                                            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                l(1);
                                                                this.f53753r = 4;
                                                                this.f53749n.f53742h = 4;
                                                                break;
                                                            default:
                                                                i14 = this.f53752q;
                                                                if (i14 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                this.f53750o = Collections.EMPTY_LIST;
                                                                                if (i14 != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                if (i14 == 1) {
                                                                                    b bVar14 = this.f53749n;
                                                                                    arrayList = bVar14.f53736b;
                                                                                    arrayList.add(bVar14.d());
                                                                                    bVar14.f53737c.setLength(0);
                                                                                    bVar14.f53735a.clear();
                                                                                    iMin = Math.min(bVar14.f53742h, bVar14.f53738d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.f53750o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f53749n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if (i12 != 17) {
                                                if ((b3 & 240) != 16) {
                                                    if (i12 != 23) {
                                                        if (i13 == 20) {
                                                            if (b11 == 32) {
                                                                l(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.f53753r = 2;
                                                                        this.f53749n.f53742h = 2;
                                                                        break;
                                                                    case 38:
                                                                        l(1);
                                                                        this.f53753r = 3;
                                                                        this.f53749n.f53742h = 3;
                                                                        break;
                                                                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                        l(1);
                                                                        this.f53753r = 4;
                                                                        this.f53749n.f53742h = 4;
                                                                        break;
                                                                    default:
                                                                        i14 = this.f53752q;
                                                                        if (i14 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                        this.f53750o = Collections.EMPTY_LIST;
                                                                                        if (i14 != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                        if (i14 == 1) {
                                                                                            b bVar15 = this.f53749n;
                                                                                            arrayList = bVar15.f53736b;
                                                                                            arrayList.add(bVar15.d());
                                                                                            bVar15.f53737c.setLength(0);
                                                                                            bVar15.f53735a.clear();
                                                                                            iMin = Math.min(bVar15.f53742h, bVar15.f53738d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f53750o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f53749n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i13 == 20) {
                                                        if (b11 == 32) {
                                                            l(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    l(1);
                                                                    this.f53753r = 2;
                                                                    this.f53749n.f53742h = 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.f53753r = 3;
                                                                    this.f53749n.f53742h = 3;
                                                                    break;
                                                                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                    l(1);
                                                                    this.f53753r = 4;
                                                                    this.f53749n.f53742h = 4;
                                                                    break;
                                                                default:
                                                                    i14 = this.f53752q;
                                                                    if (i14 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                    this.f53750o = Collections.EMPTY_LIST;
                                                                                    if (i14 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                    if (i14 == 1) {
                                                                                        b bVar16 = this.f53749n;
                                                                                        arrayList = bVar16.f53736b;
                                                                                        arrayList.add(bVar16.d());
                                                                                        bVar16.f53737c.setLength(0);
                                                                                        bVar16.f53735a.clear();
                                                                                        iMin = Math.min(bVar16.f53742h, bVar16.f53738d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f53750o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f53749n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i12 != 23) {
                                                    if (i13 == 20) {
                                                        if (b11 == 32) {
                                                            l(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    l(1);
                                                                    this.f53753r = 2;
                                                                    this.f53749n.f53742h = 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.f53753r = 3;
                                                                    this.f53749n.f53742h = 3;
                                                                    break;
                                                                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                    l(1);
                                                                    this.f53753r = 4;
                                                                    this.f53749n.f53742h = 4;
                                                                    break;
                                                                default:
                                                                    i14 = this.f53752q;
                                                                    if (i14 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                    this.f53750o = Collections.EMPTY_LIST;
                                                                                    if (i14 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                    if (i14 == 1) {
                                                                                        b bVar17 = this.f53749n;
                                                                                        arrayList = bVar17.f53736b;
                                                                                        arrayList.add(bVar17.d());
                                                                                        bVar17.f53737c.setLength(0);
                                                                                        bVar17.f53735a.clear();
                                                                                        iMin = Math.min(bVar17.f53742h, bVar17.f53738d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f53750o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f53749n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i13 == 20) {
                                                    if (b11 == 32) {
                                                        l(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                l(1);
                                                                this.f53753r = 2;
                                                                this.f53749n.f53742h = 2;
                                                                break;
                                                            case 38:
                                                                l(1);
                                                                this.f53753r = 3;
                                                                this.f53749n.f53742h = 3;
                                                                break;
                                                            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                l(1);
                                                                this.f53753r = 4;
                                                                this.f53749n.f53742h = 4;
                                                                break;
                                                            default:
                                                                i14 = this.f53752q;
                                                                if (i14 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                this.f53750o = Collections.EMPTY_LIST;
                                                                                if (i14 != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                if (i14 == 1) {
                                                                                    b bVar18 = this.f53749n;
                                                                                    arrayList = bVar18.f53736b;
                                                                                    arrayList.add(bVar18.d());
                                                                                    bVar18.f53737c.setLength(0);
                                                                                    bVar18.f53735a.clear();
                                                                                    iMin = Math.min(bVar18.f53742h, bVar18.f53738d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.f53750o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f53749n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if ((b3 & 240) != 16) {
                                                if (i12 != 23) {
                                                    if (i13 == 20) {
                                                        if (b11 == 32) {
                                                            l(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    l(1);
                                                                    this.f53753r = 2;
                                                                    this.f53749n.f53742h = 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.f53753r = 3;
                                                                    this.f53749n.f53742h = 3;
                                                                    break;
                                                                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                    l(1);
                                                                    this.f53753r = 4;
                                                                    this.f53749n.f53742h = 4;
                                                                    break;
                                                                default:
                                                                    i14 = this.f53752q;
                                                                    if (i14 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                    this.f53750o = Collections.EMPTY_LIST;
                                                                                    if (i14 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                    if (i14 == 1) {
                                                                                        b bVar19 = this.f53749n;
                                                                                        arrayList = bVar19.f53736b;
                                                                                        arrayList.add(bVar19.d());
                                                                                        bVar19.f53737c.setLength(0);
                                                                                        bVar19.f53735a.clear();
                                                                                        iMin = Math.min(bVar19.f53742h, bVar19.f53738d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f53750o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f53749n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i13 == 20) {
                                                    if (b11 == 32) {
                                                        l(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                l(1);
                                                                this.f53753r = 2;
                                                                this.f53749n.f53742h = 2;
                                                                break;
                                                            case 38:
                                                                l(1);
                                                                this.f53753r = 3;
                                                                this.f53749n.f53742h = 3;
                                                                break;
                                                            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                l(1);
                                                                this.f53753r = 4;
                                                                this.f53749n.f53742h = 4;
                                                                break;
                                                            default:
                                                                i14 = this.f53752q;
                                                                if (i14 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                this.f53750o = Collections.EMPTY_LIST;
                                                                                if (i14 != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                if (i14 == 1) {
                                                                                    b bVar110 = this.f53749n;
                                                                                    arrayList = bVar110.f53736b;
                                                                                    arrayList.add(bVar110.d());
                                                                                    bVar110.f53737c.setLength(0);
                                                                                    bVar110.f53735a.clear();
                                                                                    iMin = Math.min(bVar110.f53742h, bVar110.f53738d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.f53750o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f53749n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if (i12 != 23) {
                                                if (i13 == 20) {
                                                    if (b11 == 32) {
                                                        l(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                l(1);
                                                                this.f53753r = 2;
                                                                this.f53749n.f53742h = 2;
                                                                break;
                                                            case 38:
                                                                l(1);
                                                                this.f53753r = 3;
                                                                this.f53749n.f53742h = 3;
                                                                break;
                                                            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                l(1);
                                                                this.f53753r = 4;
                                                                this.f53749n.f53742h = 4;
                                                                break;
                                                            default:
                                                                i14 = this.f53752q;
                                                                if (i14 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                this.f53750o = Collections.EMPTY_LIST;
                                                                                if (i14 != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                if (i14 == 1) {
                                                                                    b bVar111 = this.f53749n;
                                                                                    arrayList = bVar111.f53736b;
                                                                                    arrayList.add(bVar111.d());
                                                                                    bVar111.f53737c.setLength(0);
                                                                                    bVar111.f53735a.clear();
                                                                                    iMin = Math.min(bVar111.f53742h, bVar111.f53738d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.f53750o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f53749n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if (i13 == 20) {
                                                if (b11 == 32) {
                                                    l(2);
                                                } else if (b11 != 41) {
                                                    switch (b11) {
                                                        case 37:
                                                            l(1);
                                                            this.f53753r = 2;
                                                            this.f53749n.f53742h = 2;
                                                            break;
                                                        case 38:
                                                            l(1);
                                                            this.f53753r = 3;
                                                            this.f53749n.f53742h = 3;
                                                            break;
                                                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                            l(1);
                                                            this.f53753r = 4;
                                                            this.f53749n.f53742h = 4;
                                                            break;
                                                        default:
                                                            i14 = this.f53752q;
                                                            if (i14 != 0) {
                                                                if (b11 != 33) {
                                                                    switch (b11) {
                                                                        case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                            this.f53750o = Collections.EMPTY_LIST;
                                                                            if (i14 != 1) {
                                                                                k();
                                                                            } else {
                                                                                k();
                                                                            }
                                                                            break;
                                                                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                            if (i14 == 1) {
                                                                                b bVar112 = this.f53749n;
                                                                                arrayList = bVar112.f53736b;
                                                                                arrayList.add(bVar112.d());
                                                                                bVar112.f53737c.setLength(0);
                                                                                bVar112.f53735a.clear();
                                                                                iMin = Math.min(bVar112.f53742h, bVar112.f53738d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            k();
                                                                            break;
                                                                        case 47:
                                                                            this.f53750o = j();
                                                                            k();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f53749n.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    l(3);
                                                }
                                            }
                                        } else {
                                            i13 = b3 & 246;
                                            if (i13 != 18) {
                                                if (i12 != 17) {
                                                    if ((b3 & 240) != 16) {
                                                        if (i12 != 23) {
                                                            if (i13 == 20) {
                                                                if (b11 == 32) {
                                                                    l(2);
                                                                } else if (b11 != 41) {
                                                                    switch (b11) {
                                                                        case 37:
                                                                            l(1);
                                                                            this.f53753r = 2;
                                                                            this.f53749n.f53742h = 2;
                                                                            break;
                                                                        case 38:
                                                                            l(1);
                                                                            this.f53753r = 3;
                                                                            this.f53749n.f53742h = 3;
                                                                            break;
                                                                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                            l(1);
                                                                            this.f53753r = 4;
                                                                            this.f53749n.f53742h = 4;
                                                                            break;
                                                                        default:
                                                                            i14 = this.f53752q;
                                                                            if (i14 != 0) {
                                                                                if (b11 != 33) {
                                                                                    switch (b11) {
                                                                                        case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                            this.f53750o = Collections.EMPTY_LIST;
                                                                                            if (i14 != 1) {
                                                                                                k();
                                                                                            } else {
                                                                                                k();
                                                                                            }
                                                                                            break;
                                                                                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                            if (i14 == 1) {
                                                                                                b bVar113 = this.f53749n;
                                                                                                arrayList = bVar113.f53736b;
                                                                                                arrayList.add(bVar113.d());
                                                                                                bVar113.f53737c.setLength(0);
                                                                                                bVar113.f53735a.clear();
                                                                                                iMin = Math.min(bVar113.f53742h, bVar113.f53738d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            k();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f53750o = j();
                                                                                            k();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f53749n.b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    l(3);
                                                                }
                                                            }
                                                        } else if (i13 == 20) {
                                                            if (b11 == 32) {
                                                                l(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.f53753r = 2;
                                                                        this.f53749n.f53742h = 2;
                                                                        break;
                                                                    case 38:
                                                                        l(1);
                                                                        this.f53753r = 3;
                                                                        this.f53749n.f53742h = 3;
                                                                        break;
                                                                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                        l(1);
                                                                        this.f53753r = 4;
                                                                        this.f53749n.f53742h = 4;
                                                                        break;
                                                                    default:
                                                                        i14 = this.f53752q;
                                                                        if (i14 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                        this.f53750o = Collections.EMPTY_LIST;
                                                                                        if (i14 != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                        if (i14 == 1) {
                                                                                            b bVar114 = this.f53749n;
                                                                                            arrayList = bVar114.f53736b;
                                                                                            arrayList.add(bVar114.d());
                                                                                            bVar114.f53737c.setLength(0);
                                                                                            bVar114.f53735a.clear();
                                                                                            iMin = Math.min(bVar114.f53742h, bVar114.f53738d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f53750o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f53749n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i12 != 23) {
                                                        if (i13 == 20) {
                                                            if (b11 == 32) {
                                                                l(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.f53753r = 2;
                                                                        this.f53749n.f53742h = 2;
                                                                        break;
                                                                    case 38:
                                                                        l(1);
                                                                        this.f53753r = 3;
                                                                        this.f53749n.f53742h = 3;
                                                                        break;
                                                                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                        l(1);
                                                                        this.f53753r = 4;
                                                                        this.f53749n.f53742h = 4;
                                                                        break;
                                                                    default:
                                                                        i14 = this.f53752q;
                                                                        if (i14 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                        this.f53750o = Collections.EMPTY_LIST;
                                                                                        if (i14 != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                        if (i14 == 1) {
                                                                                            b bVar115 = this.f53749n;
                                                                                            arrayList = bVar115.f53736b;
                                                                                            arrayList.add(bVar115.d());
                                                                                            bVar115.f53737c.setLength(0);
                                                                                            bVar115.f53735a.clear();
                                                                                            iMin = Math.min(bVar115.f53742h, bVar115.f53738d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f53750o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f53749n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i13 == 20) {
                                                        if (b11 == 32) {
                                                            l(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    l(1);
                                                                    this.f53753r = 2;
                                                                    this.f53749n.f53742h = 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.f53753r = 3;
                                                                    this.f53749n.f53742h = 3;
                                                                    break;
                                                                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                    l(1);
                                                                    this.f53753r = 4;
                                                                    this.f53749n.f53742h = 4;
                                                                    break;
                                                                default:
                                                                    i14 = this.f53752q;
                                                                    if (i14 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                    this.f53750o = Collections.EMPTY_LIST;
                                                                                    if (i14 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                    if (i14 == 1) {
                                                                                        b bVar116 = this.f53749n;
                                                                                        arrayList = bVar116.f53736b;
                                                                                        arrayList.add(bVar116.d());
                                                                                        bVar116.f53737c.setLength(0);
                                                                                        bVar116.f53735a.clear();
                                                                                        iMin = Math.min(bVar116.f53742h, bVar116.f53738d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f53750o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f53749n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if ((b3 & 240) != 16) {
                                                    if (i12 != 23) {
                                                        if (i13 == 20) {
                                                            if (b11 == 32) {
                                                                l(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.f53753r = 2;
                                                                        this.f53749n.f53742h = 2;
                                                                        break;
                                                                    case 38:
                                                                        l(1);
                                                                        this.f53753r = 3;
                                                                        this.f53749n.f53742h = 3;
                                                                        break;
                                                                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                        l(1);
                                                                        this.f53753r = 4;
                                                                        this.f53749n.f53742h = 4;
                                                                        break;
                                                                    default:
                                                                        i14 = this.f53752q;
                                                                        if (i14 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                        this.f53750o = Collections.EMPTY_LIST;
                                                                                        if (i14 != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                        if (i14 == 1) {
                                                                                            b bVar117 = this.f53749n;
                                                                                            arrayList = bVar117.f53736b;
                                                                                            arrayList.add(bVar117.d());
                                                                                            bVar117.f53737c.setLength(0);
                                                                                            bVar117.f53735a.clear();
                                                                                            iMin = Math.min(bVar117.f53742h, bVar117.f53738d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f53750o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f53749n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i13 == 20) {
                                                        if (b11 == 32) {
                                                            l(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    l(1);
                                                                    this.f53753r = 2;
                                                                    this.f53749n.f53742h = 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.f53753r = 3;
                                                                    this.f53749n.f53742h = 3;
                                                                    break;
                                                                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                    l(1);
                                                                    this.f53753r = 4;
                                                                    this.f53749n.f53742h = 4;
                                                                    break;
                                                                default:
                                                                    i14 = this.f53752q;
                                                                    if (i14 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                    this.f53750o = Collections.EMPTY_LIST;
                                                                                    if (i14 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                    if (i14 == 1) {
                                                                                        b bVar118 = this.f53749n;
                                                                                        arrayList = bVar118.f53736b;
                                                                                        arrayList.add(bVar118.d());
                                                                                        bVar118.f53737c.setLength(0);
                                                                                        bVar118.f53735a.clear();
                                                                                        iMin = Math.min(bVar118.f53742h, bVar118.f53738d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f53750o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f53749n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i12 != 23) {
                                                    if (i13 == 20) {
                                                        if (b11 == 32) {
                                                            l(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    l(1);
                                                                    this.f53753r = 2;
                                                                    this.f53749n.f53742h = 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.f53753r = 3;
                                                                    this.f53749n.f53742h = 3;
                                                                    break;
                                                                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                    l(1);
                                                                    this.f53753r = 4;
                                                                    this.f53749n.f53742h = 4;
                                                                    break;
                                                                default:
                                                                    i14 = this.f53752q;
                                                                    if (i14 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                    this.f53750o = Collections.EMPTY_LIST;
                                                                                    if (i14 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                    if (i14 == 1) {
                                                                                        b bVar119 = this.f53749n;
                                                                                        arrayList = bVar119.f53736b;
                                                                                        arrayList.add(bVar119.d());
                                                                                        bVar119.f53737c.setLength(0);
                                                                                        bVar119.f53735a.clear();
                                                                                        iMin = Math.min(bVar119.f53742h, bVar119.f53738d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f53750o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f53749n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i13 == 20) {
                                                    if (b11 == 32) {
                                                        l(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                l(1);
                                                                this.f53753r = 2;
                                                                this.f53749n.f53742h = 2;
                                                                break;
                                                            case 38:
                                                                l(1);
                                                                this.f53753r = 3;
                                                                this.f53749n.f53742h = 3;
                                                                break;
                                                            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                l(1);
                                                                this.f53753r = 4;
                                                                this.f53749n.f53742h = 4;
                                                                break;
                                                            default:
                                                                i14 = this.f53752q;
                                                                if (i14 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                this.f53750o = Collections.EMPTY_LIST;
                                                                                if (i14 != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                if (i14 == 1) {
                                                                                    b bVar1110 = this.f53749n;
                                                                                    arrayList = bVar1110.f53736b;
                                                                                    arrayList.add(bVar1110.d());
                                                                                    bVar1110.f53737c.setLength(0);
                                                                                    bVar1110.f53735a.clear();
                                                                                    iMin = Math.min(bVar1110.f53742h, bVar1110.f53738d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.f53750o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f53749n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if (i12 != 17) {
                                                if ((b3 & 240) != 16) {
                                                    if (i12 != 23) {
                                                        if (i13 == 20) {
                                                            if (b11 == 32) {
                                                                l(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.f53753r = 2;
                                                                        this.f53749n.f53742h = 2;
                                                                        break;
                                                                    case 38:
                                                                        l(1);
                                                                        this.f53753r = 3;
                                                                        this.f53749n.f53742h = 3;
                                                                        break;
                                                                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                        l(1);
                                                                        this.f53753r = 4;
                                                                        this.f53749n.f53742h = 4;
                                                                        break;
                                                                    default:
                                                                        i14 = this.f53752q;
                                                                        if (i14 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                        this.f53750o = Collections.EMPTY_LIST;
                                                                                        if (i14 != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                        if (i14 == 1) {
                                                                                            b bVar1111 = this.f53749n;
                                                                                            arrayList = bVar1111.f53736b;
                                                                                            arrayList.add(bVar1111.d());
                                                                                            bVar1111.f53737c.setLength(0);
                                                                                            bVar1111.f53735a.clear();
                                                                                            iMin = Math.min(bVar1111.f53742h, bVar1111.f53738d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f53750o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f53749n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i13 == 20) {
                                                        if (b11 == 32) {
                                                            l(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    l(1);
                                                                    this.f53753r = 2;
                                                                    this.f53749n.f53742h = 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.f53753r = 3;
                                                                    this.f53749n.f53742h = 3;
                                                                    break;
                                                                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                    l(1);
                                                                    this.f53753r = 4;
                                                                    this.f53749n.f53742h = 4;
                                                                    break;
                                                                default:
                                                                    i14 = this.f53752q;
                                                                    if (i14 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                    this.f53750o = Collections.EMPTY_LIST;
                                                                                    if (i14 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                    if (i14 == 1) {
                                                                                        b bVar1112 = this.f53749n;
                                                                                        arrayList = bVar1112.f53736b;
                                                                                        arrayList.add(bVar1112.d());
                                                                                        bVar1112.f53737c.setLength(0);
                                                                                        bVar1112.f53735a.clear();
                                                                                        iMin = Math.min(bVar1112.f53742h, bVar1112.f53738d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f53750o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f53749n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i12 != 23) {
                                                    if (i13 == 20) {
                                                        if (b11 == 32) {
                                                            l(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    l(1);
                                                                    this.f53753r = 2;
                                                                    this.f53749n.f53742h = 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.f53753r = 3;
                                                                    this.f53749n.f53742h = 3;
                                                                    break;
                                                                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                    l(1);
                                                                    this.f53753r = 4;
                                                                    this.f53749n.f53742h = 4;
                                                                    break;
                                                                default:
                                                                    i14 = this.f53752q;
                                                                    if (i14 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                    this.f53750o = Collections.EMPTY_LIST;
                                                                                    if (i14 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                    if (i14 == 1) {
                                                                                        b bVar1113 = this.f53749n;
                                                                                        arrayList = bVar1113.f53736b;
                                                                                        arrayList.add(bVar1113.d());
                                                                                        bVar1113.f53737c.setLength(0);
                                                                                        bVar1113.f53735a.clear();
                                                                                        iMin = Math.min(bVar1113.f53742h, bVar1113.f53738d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f53750o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f53749n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i13 == 20) {
                                                    if (b11 == 32) {
                                                        l(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                l(1);
                                                                this.f53753r = 2;
                                                                this.f53749n.f53742h = 2;
                                                                break;
                                                            case 38:
                                                                l(1);
                                                                this.f53753r = 3;
                                                                this.f53749n.f53742h = 3;
                                                                break;
                                                            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                l(1);
                                                                this.f53753r = 4;
                                                                this.f53749n.f53742h = 4;
                                                                break;
                                                            default:
                                                                i14 = this.f53752q;
                                                                if (i14 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                this.f53750o = Collections.EMPTY_LIST;
                                                                                if (i14 != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                if (i14 == 1) {
                                                                                    b bVar1114 = this.f53749n;
                                                                                    arrayList = bVar1114.f53736b;
                                                                                    arrayList.add(bVar1114.d());
                                                                                    bVar1114.f53737c.setLength(0);
                                                                                    bVar1114.f53735a.clear();
                                                                                    iMin = Math.min(bVar1114.f53742h, bVar1114.f53738d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.f53750o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f53749n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if ((b3 & 240) != 16) {
                                                if (i12 != 23) {
                                                    if (i13 == 20) {
                                                        if (b11 == 32) {
                                                            l(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    l(1);
                                                                    this.f53753r = 2;
                                                                    this.f53749n.f53742h = 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.f53753r = 3;
                                                                    this.f53749n.f53742h = 3;
                                                                    break;
                                                                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                    l(1);
                                                                    this.f53753r = 4;
                                                                    this.f53749n.f53742h = 4;
                                                                    break;
                                                                default:
                                                                    i14 = this.f53752q;
                                                                    if (i14 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                    this.f53750o = Collections.EMPTY_LIST;
                                                                                    if (i14 != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                    if (i14 == 1) {
                                                                                        b bVar1115 = this.f53749n;
                                                                                        arrayList = bVar1115.f53736b;
                                                                                        arrayList.add(bVar1115.d());
                                                                                        bVar1115.f53737c.setLength(0);
                                                                                        bVar1115.f53735a.clear();
                                                                                        iMin = Math.min(bVar1115.f53742h, bVar1115.f53738d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f53750o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f53749n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i13 == 20) {
                                                    if (b11 == 32) {
                                                        l(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                l(1);
                                                                this.f53753r = 2;
                                                                this.f53749n.f53742h = 2;
                                                                break;
                                                            case 38:
                                                                l(1);
                                                                this.f53753r = 3;
                                                                this.f53749n.f53742h = 3;
                                                                break;
                                                            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                l(1);
                                                                this.f53753r = 4;
                                                                this.f53749n.f53742h = 4;
                                                                break;
                                                            default:
                                                                i14 = this.f53752q;
                                                                if (i14 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                this.f53750o = Collections.EMPTY_LIST;
                                                                                if (i14 != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                if (i14 == 1) {
                                                                                    b bVar1116 = this.f53749n;
                                                                                    arrayList = bVar1116.f53736b;
                                                                                    arrayList.add(bVar1116.d());
                                                                                    bVar1116.f53737c.setLength(0);
                                                                                    bVar1116.f53735a.clear();
                                                                                    iMin = Math.min(bVar1116.f53742h, bVar1116.f53738d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.f53750o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f53749n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if (i12 != 23) {
                                                if (i13 == 20) {
                                                    if (b11 == 32) {
                                                        l(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                l(1);
                                                                this.f53753r = 2;
                                                                this.f53749n.f53742h = 2;
                                                                break;
                                                            case 38:
                                                                l(1);
                                                                this.f53753r = 3;
                                                                this.f53749n.f53742h = 3;
                                                                break;
                                                            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                l(1);
                                                                this.f53753r = 4;
                                                                this.f53749n.f53742h = 4;
                                                                break;
                                                            default:
                                                                i14 = this.f53752q;
                                                                if (i14 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                this.f53750o = Collections.EMPTY_LIST;
                                                                                if (i14 != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                if (i14 == 1) {
                                                                                    b bVar1117 = this.f53749n;
                                                                                    arrayList = bVar1117.f53736b;
                                                                                    arrayList.add(bVar1117.d());
                                                                                    bVar1117.f53737c.setLength(0);
                                                                                    bVar1117.f53735a.clear();
                                                                                    iMin = Math.min(bVar1117.f53742h, bVar1117.f53738d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.f53750o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f53749n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if (i13 == 20) {
                                                if (b11 == 32) {
                                                    l(2);
                                                } else if (b11 != 41) {
                                                    switch (b11) {
                                                        case 37:
                                                            l(1);
                                                            this.f53753r = 2;
                                                            this.f53749n.f53742h = 2;
                                                            break;
                                                        case 38:
                                                            l(1);
                                                            this.f53753r = 3;
                                                            this.f53749n.f53742h = 3;
                                                            break;
                                                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                            l(1);
                                                            this.f53753r = 4;
                                                            this.f53749n.f53742h = 4;
                                                            break;
                                                        default:
                                                            i14 = this.f53752q;
                                                            if (i14 != 0) {
                                                                if (b11 != 33) {
                                                                    switch (b11) {
                                                                        case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                            this.f53750o = Collections.EMPTY_LIST;
                                                                            if (i14 != 1) {
                                                                                k();
                                                                            } else {
                                                                                k();
                                                                            }
                                                                            break;
                                                                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                            if (i14 == 1) {
                                                                                b bVar1118 = this.f53749n;
                                                                                arrayList = bVar1118.f53736b;
                                                                                arrayList.add(bVar1118.d());
                                                                                bVar1118.f53737c.setLength(0);
                                                                                bVar1118.f53735a.clear();
                                                                                iMin = Math.min(bVar1118.f53742h, bVar1118.f53738d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            k();
                                                                            break;
                                                                        case 47:
                                                                            this.f53750o = j();
                                                                            k();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f53749n.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    l(3);
                                                }
                                            }
                                        }
                                    } else {
                                        b bVar20 = this.f53749n;
                                        iArr = C;
                                        bVar20.a((char) iArr[(b3 & 127) - 32]);
                                        if ((b11 & 224) != 0) {
                                            this.f53749n.a((char) iArr[(b11 & 127) - 32]);
                                        }
                                    }
                                    z12 = true;
                                }
                            }
                        } else if (z13) {
                            k();
                            z12 = true;
                        }
                    }
                }
            }
        }
    }

    @Override // v8.h, e7.c
    /* JADX INFO: renamed from: h */
    public final u8.c c() {
        u8.c cVar;
        u8.c cVarC = super.c();
        if (cVarC != null) {
            return cVarC;
        }
        long j11 = this.f53748l;
        if (j11 == -9223372036854775807L) {
            return null;
        }
        long j12 = this.f53760y;
        if (j12 == -9223372036854775807L || this.f53802e - j12 < j11 || (cVar = (u8.c) this.f53799b.pollFirst()) == null) {
            return null;
        }
        this.f53750o = Collections.EMPTY_LIST;
        this.f53760y = -9223372036854775807L;
        tp.g gVarF = f();
        long j13 = this.f53802e;
        cVar.f25118c = j13;
        cVar.f52825e = gVarF;
        cVar.f52826f = j13;
        return cVar;
    }

    @Override // v8.h
    public final boolean i() {
        return this.f53750o != this.f53751p;
    }

    public final ArrayList j() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i11 = 0; i11 < size; i11++) {
            a7.b bVarC = ((b) arrayList.get(i11)).c(Integer.MIN_VALUE);
            arrayList2.add(bVarC);
            if (bVarC != null) {
                iMin = Math.min(iMin, bVarC.f421i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            a7.b bVarC2 = (a7.b) arrayList2.get(i12);
            if (bVarC2 != null) {
                if (bVarC2.f421i != iMin) {
                    bVarC2 = ((b) arrayList.get(i12)).c(iMin);
                    bVarC2.getClass();
                }
                arrayList3.add(bVarC2);
            }
        }
        return arrayList3;
    }

    public final void k() {
        b bVar = this.f53749n;
        bVar.f53741g = this.f53752q;
        bVar.f53735a.clear();
        bVar.f53736b.clear();
        bVar.f53737c.setLength(0);
        bVar.f53738d = 15;
        bVar.f53739e = 0;
        bVar.f53740f = 0;
        ArrayList arrayList = this.m;
        arrayList.clear();
        arrayList.add(this.f53749n);
    }

    public final void l(int i11) {
        int i12 = this.f53752q;
        if (i12 == i11) {
            return;
        }
        this.f53752q = i11;
        if (i11 != 3) {
            k();
            if (i12 == 3 || i11 == 1 || i11 == 0) {
                this.f53750o = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.m;
            if (i13 >= arrayList.size()) {
                return;
            }
            ((b) arrayList.get(i13)).f53741g = i11;
            i13++;
        }
    }

    @Override // v8.h, e7.c
    public final void release() {
    }
}
