package sd;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import m0.n;
import ob.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f51559a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f51561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteBuffer f51562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f51563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public short[] f51564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f51565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f51566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f51567i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f51568j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f51569k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f51570l;
    public Bitmap m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f51571n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f51572o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f51573p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f51574q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f51575r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Boolean f51576s;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f51560b = new int[256];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Bitmap.Config f51577t = Bitmap.Config.ARGB_8888;

    public d(e eVar, b bVar, ByteBuffer byteBuffer, int i11) {
        this.f51561c = eVar;
        this.f51570l = new b();
        synchronized (this) {
            try {
                if (i11 <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i11);
                }
                int iHighestOneBit = Integer.highestOneBit(i11);
                int i12 = 0;
                this.f51572o = 0;
                this.f51570l = bVar;
                this.f51569k = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f51562d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f51562d.order(ByteOrder.LITTLE_ENDIAN);
                this.f51571n = false;
                ArrayList arrayList = bVar.f51548e;
                int size = arrayList.size();
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    if (((a) obj).f51539g == 3) {
                        this.f51571n = true;
                        break;
                    }
                }
                this.f51573p = iHighestOneBit;
                int i13 = bVar.f51549f;
                this.f51575r = i13 / iHighestOneBit;
                int i14 = bVar.f51550g;
                this.f51574q = i14 / iHighestOneBit;
                int i15 = i13 * i14;
                n nVar = (n) this.f51561c.f44805c;
                this.f51567i = nVar == null ? new byte[i15] : (byte[]) nVar.d(i15, byte[].class);
                e eVar2 = this.f51561c;
                int i16 = this.f51575r * this.f51574q;
                n nVar2 = (n) eVar2.f44805c;
                this.f51568j = nVar2 == null ? new int[i16] : (int[]) nVar2.d(i16, int[].class);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap a() {
        Boolean bool = this.f51576s;
        Bitmap bitmapA = ((wd.a) this.f51561c.f44804b).a(this.f51575r, this.f51574q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f51577t);
        bitmapA.setHasAlpha(true);
        return bitmapA;
    }

    public final synchronized Bitmap b() {
        try {
            if (this.f51570l.f51546c <= 0 || this.f51569k < 0) {
                if (Log.isLoggable("d", 3)) {
                    int i11 = this.f51570l.f51546c;
                }
                this.f51572o = 1;
            }
            int i12 = this.f51572o;
            if (i12 != 1 && i12 != 2) {
                this.f51572o = 0;
                if (this.f51563e == null) {
                    n nVar = (n) this.f51561c.f44805c;
                    this.f51563e = nVar == null ? new byte[255] : (byte[]) nVar.d(255, byte[].class);
                }
                a aVar = (a) this.f51570l.f51548e.get(this.f51569k);
                int i13 = this.f51569k - 1;
                a aVar2 = i13 >= 0 ? (a) this.f51570l.f51548e.get(i13) : null;
                int[] iArr = aVar.f51543k;
                if (iArr == null) {
                    iArr = this.f51570l.f51544a;
                }
                this.f51559a = iArr;
                if (iArr == null) {
                    this.f51572o = 1;
                    return null;
                }
                if (aVar.f51538f) {
                    System.arraycopy(iArr, 0, this.f51560b, 0, iArr.length);
                    int[] iArr2 = this.f51560b;
                    this.f51559a = iArr2;
                    iArr2[aVar.f51540h] = 0;
                    if (aVar.f51539g == 2 && this.f51569k == 0) {
                        this.f51576s = Boolean.TRUE;
                    }
                }
                return d(aVar, aVar2);
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f51577t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:98:0x01dc A[PHI: r5
      0x01dc: PHI (r5v44 int) = (r5v38 int), (r5v46 int), (r5v46 int) binds: [B:93:0x01c8, B:95:0x01d3, B:96:0x01d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v31, types: [short] */
    /* JADX WARN: Type inference failed for: r6v33 */
    public final Bitmap d(a aVar, a aVar2) {
        byte b3;
        int i11;
        int i12;
        int i13;
        int[] iArr;
        int i14;
        int i15;
        short s3;
        int i16;
        Bitmap bitmap;
        int i17;
        e eVar = this.f51561c;
        byte b11 = 0;
        int[] iArr2 = this.f51568j;
        if (aVar2 == null) {
            Bitmap bitmap2 = this.m;
            if (bitmap2 != null) {
                ((wd.a) eVar.f44804b).d(bitmap2);
            }
            this.m = null;
            Arrays.fill(iArr2, 0);
        }
        if (aVar2 != null && aVar2.f51539g == 3 && this.m == null) {
            Arrays.fill(iArr2, 0);
        }
        if (aVar2 != null && (i16 = aVar2.f51539g) > 0) {
            if (i16 == 2) {
                if (aVar.f51538f) {
                    i17 = 0;
                } else {
                    b bVar = this.f51570l;
                    i17 = bVar.f51554k;
                    if (aVar.f51543k != null && bVar.f51553j == aVar.f51540h) {
                        i17 = 0;
                    }
                }
                int i18 = aVar2.f51536d;
                int i19 = this.f51573p;
                int i21 = i18 / i19;
                int i22 = aVar2.f51534b / i19;
                int i23 = aVar2.f51535c / i19;
                int i24 = aVar2.f51533a / i19;
                int i25 = this.f51575r;
                int i26 = (i22 * i25) + i24;
                int i27 = (i21 * i25) + i26;
                while (i26 < i27) {
                    int i28 = i26 + i23;
                    for (int i29 = i26; i29 < i28; i29++) {
                        iArr2[i29] = i17;
                    }
                    i26 += this.f51575r;
                }
            } else if (i16 == 3 && (bitmap = this.m) != null) {
                int i30 = this.f51574q;
                int i31 = this.f51575r;
                bitmap.getPixels(iArr2, 0, i31, 0, 0, i31, i30);
            }
        }
        this.f51562d.position(aVar.f51542j);
        int i32 = aVar.f51535c * aVar.f51536d;
        byte[] bArr = this.f51567i;
        if (bArr == null || bArr.length < i32) {
            n nVar = (n) eVar.f44805c;
            this.f51567i = nVar == null ? new byte[i32] : (byte[]) nVar.d(i32, byte[].class);
        }
        byte[] bArr2 = this.f51567i;
        if (this.f51564f == null) {
            this.f51564f = new short[4096];
        }
        short[] sArr = this.f51564f;
        if (this.f51565g == null) {
            this.f51565g = new byte[4096];
        }
        byte[] bArr3 = this.f51565g;
        if (this.f51566h == null) {
            this.f51566h = new byte[4097];
        }
        byte[] bArr4 = this.f51566h;
        int i33 = this.f51562d.get() & 255;
        int i34 = 1;
        int i35 = 1 << i33;
        int i36 = i35 + 1;
        int i37 = i35 + 2;
        int i38 = i33 + 1;
        int i39 = (1 << i38) - 1;
        int i40 = 0;
        while (i40 < i35) {
            sArr[i40] = 0;
            bArr3[i40] = (byte) i40;
            i40++;
            i34 = i34;
        }
        int i41 = i34;
        byte[] bArr5 = this.f51563e;
        int i42 = 0;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        int i46 = 0;
        int i47 = 0;
        int i48 = 0;
        int i49 = 0;
        int i50 = i38;
        int i51 = i37;
        int i52 = i39;
        int i53 = -1;
        while (true) {
            if (i42 >= i32) {
                iArr2 = iArr2;
                b3 = b11;
                break;
            }
            if (i43 == 0) {
                i15 = -1;
                int i54 = this.f51562d.get() & 255;
                if (i54 > 0) {
                    ByteBuffer byteBuffer = this.f51562d;
                    byteBuffer.get(this.f51563e, 0, Math.min(i54, byteBuffer.remaining()));
                }
                if (i54 <= 0) {
                    this.f51572o = 3;
                    b3 = 0;
                    break;
                }
                i43 = i54;
                i44 = 0;
            } else {
                sArr = sArr;
                iArr2 = iArr2;
                i15 = -1;
            }
            i46 += (bArr5[i44] & 255) << i45;
            i44++;
            i43--;
            i45 += 8;
            i51 = i51;
            int i55 = i50;
            i53 = i53;
            i48 = i48;
            while (true) {
                i45 = i45;
                if (i45 < i55) {
                    i50 = i55;
                    b11 = 0;
                    break;
                }
                int i56 = i46 & i52;
                i46 >>= i55;
                i45 -= i55;
                if (i56 == i35) {
                    i55 = i38;
                    i51 = i37;
                    i52 = i39;
                    i45 = i45;
                    i53 = i15;
                } else {
                    if (i56 == i36) {
                        i50 = i55;
                        b11 = 0;
                        break;
                    }
                    int i57 = i55;
                    if (i53 == i15) {
                        bArr2[i47] = bArr3[i56];
                        i47++;
                        i42++;
                        i53 = i56;
                        i48 = i53;
                        i55 = i57;
                    } else {
                        if (i56 >= i51) {
                            bArr4[i49] = (byte) i48;
                            i49++;
                            s3 = i53;
                        } else {
                            s3 = i56;
                        }
                        while (s3 >= i35) {
                            bArr4[i49] = bArr3[s3];
                            i49++;
                            s3 = sArr[s3];
                        }
                        i48 = bArr3[s3] & 255;
                        byte b12 = (byte) i48;
                        bArr2[i47] = b12;
                        while (true) {
                            i47++;
                            i42++;
                            if (i49 <= 0) {
                                break;
                            }
                            i49--;
                            bArr2[i47] = bArr4[i49];
                        }
                        if (i51 < 4096) {
                            sArr[i51] = (short) i53;
                            bArr3[i51] = b12;
                            i51++;
                            if ((i51 & i52) != 0 || i51 >= 4096) {
                                i55 = i57;
                            } else {
                                i55 = i57 + 1;
                                i52 += i51;
                            }
                        } else {
                            i55 = i57;
                        }
                        i53 = i56;
                    }
                    i15 = -1;
                }
            }
        }
        Arrays.fill(bArr2, i47, i32, b3);
        if (aVar.f51537e || this.f51573p != i41) {
            int i58 = aVar.f51536d;
            int i59 = this.f51573p;
            int i60 = i58 / i59;
            int i61 = aVar.f51534b / i59;
            int i62 = aVar.f51535c / i59;
            int i63 = aVar.f51533a / i59;
            boolean z11 = this.f51569k == 0;
            byte[] bArr6 = this.f51567i;
            int[] iArr3 = this.f51559a;
            Boolean bool = this.f51576s;
            int i64 = 8;
            int i65 = 0;
            int i66 = 1;
            int i67 = 0;
            while (i67 < i60) {
                if (aVar.f51537e) {
                    if (i65 >= i60) {
                        i66++;
                        if (i66 == 2) {
                            i65 = 4;
                        } else if (i66 == 3) {
                            i64 = 4;
                            i65 = 2;
                        } else if (i66 == 4) {
                            i65 = 1;
                            i64 = 2;
                        }
                    }
                    i11 = i65 + i64;
                } else {
                    i11 = i65;
                    i65 = i67;
                }
                int i68 = i65 + i61;
                int i69 = i60;
                boolean z12 = i59 == 1;
                if (i68 < this.f51574q) {
                    int i70 = this.f51575r;
                    int i71 = i68 * i70;
                    int i72 = i71 + i63;
                    int i73 = i72 + i62;
                    int i74 = i71 + i70;
                    if (i74 < i73) {
                        i73 = i74;
                    }
                    i12 = i59;
                    int i75 = i67 * i59 * aVar.f51535c;
                    int[] iArr4 = this.f51568j;
                    if (z12) {
                        int i76 = i72;
                        while (i76 < i73) {
                            int i77 = i76;
                            int i78 = iArr3[bArr6[i75] & 255];
                            if (i78 != 0) {
                                iArr4[i77] = i78;
                            } else if (z11 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i75 += i12;
                            i76 = i77 + 1;
                        }
                    } else {
                        int i79 = ((i73 - i72) * i12) + i75;
                        int i80 = i72;
                        while (i80 < i73) {
                            int i81 = i73;
                            int i82 = aVar.f51535c;
                            int i83 = i80;
                            int i84 = i75;
                            int i85 = 0;
                            int i86 = 0;
                            int i87 = 0;
                            int i88 = 0;
                            int i89 = 0;
                            while (true) {
                                if (i84 >= this.f51573p + i75) {
                                    i13 = i62;
                                    break;
                                }
                                byte[] bArr7 = this.f51567i;
                                i13 = i62;
                                if (i84 >= bArr7.length || i84 >= i79) {
                                    break;
                                }
                                int i90 = this.f51559a[bArr7[i84] & 255];
                                if (i90 != 0) {
                                    i85 += (i90 >> 24) & 255;
                                    i86 += (i90 >> 16) & 255;
                                    i87 += (i90 >> 8) & 255;
                                    i88 += i90 & 255;
                                    i89++;
                                }
                                i84++;
                                i62 = i13;
                            }
                            int i91 = i75 + i82;
                            int i92 = i91;
                            while (i92 < this.f51573p + i91) {
                                byte[] bArr8 = this.f51567i;
                                int i93 = i91;
                                if (i92 >= bArr8.length || i92 >= i79) {
                                    break;
                                }
                                int i94 = this.f51559a[bArr8[i92] & 255];
                                if (i94 != 0) {
                                    i85 += (i94 >> 24) & 255;
                                    i86 += (i94 >> 16) & 255;
                                    i87 += (i94 >> 8) & 255;
                                    i88 += i94 & 255;
                                    i89++;
                                }
                                i92++;
                                i91 = i93;
                            }
                            int i95 = i89 == 0 ? 0 : ((i85 / i89) << 24) | ((i86 / i89) << 16) | ((i87 / i89) << 8) | (i88 / i89);
                            if (i95 != 0) {
                                iArr4[i83] = i95;
                            } else if (z11 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i75 += i12;
                            i80 = i83 + 1;
                            i73 = i81;
                            i62 = i13;
                        }
                    }
                    i67++;
                    i65 = i11;
                    i60 = i69;
                    i61 = i61;
                    i59 = i12;
                    i62 = i62;
                } else {
                    i12 = i59;
                }
                i67++;
                i65 = i11;
                i60 = i69;
                i61 = i61;
                i59 = i12;
                i62 = i62;
            }
            if (this.f51576s == null) {
                this.f51576s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
            }
        } else {
            int i96 = aVar.f51536d;
            int i97 = aVar.f51534b;
            int i98 = aVar.f51535c;
            int i99 = aVar.f51533a;
            byte b13 = this.f51569k == 0 ? (byte) 1 : b3;
            byte[] bArr9 = this.f51567i;
            int[] iArr5 = this.f51559a;
            byte b14 = -1;
            for (int i100 = b3; i100 < i96; i100++) {
                int i101 = this.f51575r;
                int i102 = (i100 + i97) * i101;
                int i103 = i102 + i99;
                int i104 = i103 + i98;
                int i105 = i102 + i101;
                if (i105 < i104) {
                    i104 = i105;
                }
                int i106 = aVar.f51535c * i100;
                while (i103 < i104) {
                    byte b15 = bArr9[i106];
                    int i107 = b15 & 255;
                    if (i107 != b14) {
                        int i108 = iArr5[i107];
                        if (i108 != 0) {
                            this.f51568j[i103] = i108;
                        } else {
                            b14 = b15;
                        }
                    }
                    i106++;
                    i103++;
                }
            }
            Boolean bool2 = this.f51576s;
            this.f51576s = Boolean.valueOf((bool2 != null && bool2.booleanValue()) || !(this.f51576s != null || b13 == 0 || b14 == -1));
        }
        if (this.f51571n && ((i14 = aVar.f51539g) == 0 || i14 == 1)) {
            if (this.m == null) {
                this.m = a();
            }
            Bitmap bitmap3 = this.m;
            int i109 = this.f51574q;
            int i110 = this.f51575r;
            iArr = iArr2;
            bitmap3.setPixels(iArr, 0, i110, 0, 0, i110, i109);
        } else {
            iArr = iArr2;
        }
        Bitmap bitmapA = a();
        int i111 = this.f51574q;
        int i112 = this.f51575r;
        bitmapA.setPixels(iArr, 0, i112, 0, 0, i112, i111);
        return bitmapA;
    }
}
