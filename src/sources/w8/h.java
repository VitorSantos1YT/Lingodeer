package w8;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import b7.f0;
import b7.v;
import b7.w;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.DescriptorProtos;
import com.stkouyu.util.httputil.Consts;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.List;
import u8.j;
import u8.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements k {
    public static final byte[] H = {0, 7, 8, 15};
    public static final byte[] K = {0, 119, -120, -1};
    public static final byte[] L = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f54741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f54742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Canvas f54743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f54744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f54745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f54746f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Bitmap f54747t;

    public h(List list) {
        w wVar = new w((byte[]) list.get(0));
        int iC = wVar.C();
        int iC2 = wVar.C();
        Paint paint = new Paint();
        this.f54741a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f54742b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f54743c = new Canvas();
        this.f54744d = new b(719, 575, 0, 719, 0, 575);
        this.f54745e = new a(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.f54746f = new g(iC, iC2);
    }

    public static byte[] a(int i11, int i12, v vVar) {
        byte[] bArr = new byte[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            bArr[i13] = (byte) vVar.i(i12);
        }
        return bArr;
    }

    public static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i11 = 1; i11 < 16; i11++) {
            if (i11 < 8) {
                iArr[i11] = d(255, (i11 & 1) != 0 ? 255 : 0, (i11 & 2) != 0 ? 255 : 0, (i11 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i11] = d(255, (i11 & 1) != 0 ? 127 : 0, (i11 & 2) != 0 ? 127 : 0, (i11 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            if (i11 < 8) {
                iArr[i11] = d(63, (i11 & 1) != 0 ? 255 : 0, (i11 & 2) != 0 ? 255 : 0, (i11 & 4) == 0 ? 0 : 255);
            } else {
                int i12 = i11 & 136;
                if (i12 == 0) {
                    iArr[i11] = d(255, ((i11 & 1) != 0 ? 85 : 0) + ((i11 & 16) != 0 ? 170 : 0), ((i11 & 2) != 0 ? 85 : 0) + ((i11 & 32) != 0 ? 170 : 0), ((i11 & 4) == 0 ? 0 : 85) + ((i11 & 64) == 0 ? 0 : 170));
                } else if (i12 == 8) {
                    iArr[i11] = d(127, ((i11 & 1) != 0 ? 85 : 0) + ((i11 & 16) != 0 ? 170 : 0), ((i11 & 2) != 0 ? 85 : 0) + ((i11 & 32) != 0 ? 170 : 0), ((i11 & 4) == 0 ? 0 : 85) + ((i11 & 64) == 0 ? 0 : 170));
                } else if (i12 == 128) {
                    iArr[i11] = d(255, ((i11 & 1) != 0 ? 43 : 0) + 127 + ((i11 & 16) != 0 ? 85 : 0), ((i11 & 2) != 0 ? 43 : 0) + 127 + ((i11 & 32) != 0 ? 85 : 0), ((i11 & 4) == 0 ? 0 : 43) + 127 + ((i11 & 64) == 0 ? 0 : 85));
                } else if (i12 == 136) {
                    iArr[i11] = d(255, ((i11 & 1) != 0 ? 43 : 0) + ((i11 & 16) != 0 ? 85 : 0), ((i11 & 2) != 0 ? 43 : 0) + ((i11 & 32) != 0 ? 85 : 0), ((i11 & 4) == 0 ? 0 : 43) + ((i11 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int d(int i11, int i12, int i13, int i14) {
        return (i11 << 24) | (i12 << 16) | (i13 << 8) | i14;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:119:0x0203 A[LOOP:3: B:87:0x0156->B:119:0x0203, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x01ff A[SYNTHETIC] */
    public static void e(byte[] bArr, int[] iArr, int i11, int i12, int i13, Paint paint, Canvas canvas) {
        byte[] bArr2;
        char c11;
        char c12;
        int i14;
        int i15;
        boolean z11;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        boolean z12;
        int i22;
        v vVar = new v(bArr, bArr.length);
        int i23 = i12;
        int i24 = i13;
        byte[] bArrA = null;
        byte[] bArrA2 = null;
        byte[] bArrA3 = null;
        while (vVar.b() != 0) {
            int i25 = 8;
            int i26 = vVar.i(8);
            if (i26 != 240) {
                int i27 = 3;
                int i28 = 2;
                int i29 = 4;
                switch (i26) {
                    case 16:
                        if (i11 == 3) {
                            bArr2 = bArrA == null ? K : bArrA;
                        } else if (i11 == 2) {
                            bArr2 = bArrA3 == null ? H : bArrA3;
                        } else {
                            bArr2 = null;
                        }
                        boolean z13 = false;
                        while (true) {
                            int i30 = vVar.i(2);
                            if (i30 != 0) {
                                i14 = i30;
                                i15 = 1;
                            } else {
                                if (vVar.h()) {
                                    int i31 = vVar.i(3) + 3;
                                    i14 = vVar.i(2);
                                    i15 = i31;
                                } else {
                                    if (vVar.h()) {
                                        i15 = 1;
                                        c11 = '\b';
                                        c12 = 4;
                                    } else {
                                        int i32 = vVar.i(2);
                                        if (i32 == 0) {
                                            c11 = '\b';
                                            c12 = 4;
                                            z13 = true;
                                        } else if (i32 == 1) {
                                            c11 = '\b';
                                            c12 = 4;
                                            i15 = 2;
                                        } else if (i32 == 2) {
                                            c11 = '\b';
                                            c12 = 4;
                                            i15 = vVar.i(4) + 12;
                                            i14 = vVar.i(2);
                                            z13 = z13;
                                        } else if (i32 != 3) {
                                            z13 = z13;
                                            c11 = '\b';
                                            c12 = 4;
                                        } else {
                                            c11 = '\b';
                                            int i33 = vVar.i(8) + 29;
                                            i14 = vVar.i(2);
                                            z13 = z13;
                                            i15 = i33;
                                            c12 = 4;
                                        }
                                        i14 = 0;
                                        i15 = 0;
                                    }
                                    i14 = 0;
                                }
                                if (i15 == 0 && paint != null) {
                                    if (bArr2 != 0) {
                                        i14 = bArr2[i14];
                                    }
                                    paint.setColor(iArr[i14]);
                                    canvas.drawRect(i23, i24, i23 + i15, i24 + 1, paint);
                                }
                                i23 += i15;
                                if (z13) {
                                    vVar.c();
                                } else {
                                    paint = paint;
                                    z13 = z13;
                                }
                            }
                            c11 = '\b';
                            c12 = 4;
                            if (i15 == 0) {
                            }
                            i23 += i15;
                            if (z13) {
                                vVar.c();
                            } else {
                                paint = paint;
                                z13 = z13;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr3 = i11 == 3 ? bArrA2 == null ? L : bArrA2 : null;
                        boolean z14 = false;
                        while (true) {
                            int i34 = vVar.i(i29);
                            if (i34 != 0) {
                                z11 = z14;
                                i18 = i34;
                                i16 = 1;
                            } else if (vVar.h()) {
                                if (vVar.h()) {
                                    int i35 = vVar.i(i28);
                                    if (i35 == 0) {
                                        z11 = z14;
                                        i16 = 1;
                                    } else if (i35 != 1) {
                                        if (i35 == i28) {
                                            i16 = vVar.i(i29) + 9;
                                            i17 = vVar.i(i29);
                                        } else if (i35 != i27) {
                                            z11 = z14;
                                            i16 = 0;
                                        } else {
                                            i16 = vVar.i(i25) + 25;
                                            i17 = vVar.i(i29);
                                        }
                                        i18 = i17;
                                    } else {
                                        z11 = z14;
                                        i16 = i28;
                                    }
                                    i18 = 0;
                                } else {
                                    i16 = vVar.i(i28) + 4;
                                    i18 = vVar.i(i29);
                                }
                                z11 = z14;
                            } else {
                                int i36 = vVar.i(i27);
                                if (i36 != 0) {
                                    i16 = i36 + 2;
                                    z11 = z14;
                                } else {
                                    z11 = true;
                                    i16 = 0;
                                }
                                i18 = 0;
                            }
                            if (i16 == 0 || paint == 0) {
                                i19 = i27;
                                i21 = i28;
                            } else {
                                if (bArr3 != 0) {
                                    i18 = bArr3[i18];
                                }
                                paint.setColor(iArr[i18]);
                                i19 = i27;
                                i21 = 2;
                                canvas.drawRect(i23, i24, i23 + i16, i24 + 1, paint);
                            }
                            i23 += i16;
                            if (z11) {
                                vVar.c();
                            } else {
                                z14 = z11;
                                i27 = i19;
                                i28 = i21;
                                i29 = 4;
                                i25 = 8;
                            }
                            break;
                        }
                        break;
                    case 18:
                        boolean z15 = false;
                        while (true) {
                            int i37 = vVar.i(8);
                            if (i37 != 0) {
                                z12 = z15;
                                i22 = 1;
                            } else if (vVar.h()) {
                                z12 = z15;
                                i22 = vVar.i(7);
                                i37 = vVar.i(8);
                            } else {
                                int i38 = vVar.i(7);
                                if (i38 != 0) {
                                    z12 = z15;
                                    i22 = i38;
                                    i37 = 0;
                                } else {
                                    z12 = true;
                                    i37 = 0;
                                    i22 = 0;
                                }
                            }
                            if (i22 != 0 && paint != 0) {
                                paint.setColor(iArr[i37]);
                                canvas.drawRect(i23, i24, i23 + i22, i24 + 1, paint);
                            }
                            i23 += i22;
                            if (!z12) {
                                z15 = z12;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (i26) {
                            case Consts.SP /* 32 */:
                                bArrA3 = a(4, 4, vVar);
                                break;
                            case 33:
                                bArrA = a(4, 8, vVar);
                                break;
                            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                                bArrA2 = a(16, 8, vVar);
                                break;
                        }
                        break;
                }
            } else {
                i24 += 2;
                i23 = i12;
            }
        }
    }

    public static a f(v vVar, int i11) {
        int[] iArr;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = 8;
        int i18 = vVar.i(8);
        vVar.t(8);
        int i19 = 2;
        int i21 = i11 - 2;
        int i22 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] iArrB = b();
        int[] iArrC = c();
        while (i21 > 0) {
            int i23 = vVar.i(i17);
            int i24 = vVar.i(i17);
            if ((i24 & 128) != 0) {
                iArr = iArr2;
            } else {
                iArr = (i24 & 64) != 0 ? iArrB : iArrC;
            }
            if ((i24 & 1) != 0) {
                i15 = vVar.i(i17);
                i16 = vVar.i(i17);
                i12 = vVar.i(i17);
                i14 = vVar.i(i17);
                i13 = i21 - 6;
            } else {
                int i25 = vVar.i(6) << i19;
                int i26 = vVar.i(4) << 4;
                i12 = vVar.i(4) << 4;
                i13 = i21 - 4;
                i14 = vVar.i(i19) << 6;
                i15 = i25;
                i16 = i26;
            }
            if (i15 == 0) {
                i16 = i22;
                i12 = i16;
                i14 = 255;
            }
            double d5 = i15;
            double d11 = i16 - 128;
            double d12 = i12 - 128;
            iArr[i23] = d((byte) (255 - (i14 & 255)), f0.g((int) ((1.402d * d11) + d5), 0, 255), f0.g((int) ((d5 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255), f0.g((int) ((d12 * 1.772d) + d5), 0, 255));
            i21 = i13;
            i22 = 0;
            i18 = i18;
            iArrC = iArrC;
            i17 = 8;
            i19 = 2;
        }
        return new a(i18, iArr2, iArrB, iArrC);
    }

    public static c g(v vVar) {
        byte[] bArr;
        int i11 = vVar.i(16);
        vVar.t(4);
        int i12 = vVar.i(2);
        boolean zH = vVar.h();
        vVar.t(1);
        byte[] bArr2 = f0.f3976b;
        if (i12 != 1) {
            if (i12 == 0) {
                int i13 = vVar.i(16);
                int i14 = vVar.i(16);
                if (i13 > 0) {
                    bArr2 = new byte[i13];
                    vVar.l(bArr2, i13);
                }
                if (i14 > 0) {
                    bArr = new byte[i14];
                    vVar.l(bArr, i14);
                }
            }
            return new c(i11, zH, bArr2, bArr);
        }
        vVar.t(vVar.i(8) * 16);
        bArr = bArr2;
        return new c(i11, zH, bArr2, bArr);
    }

    @Override // u8.k
    public final void j(byte[] bArr, int i11, int i12, j jVar, b7.g gVar) {
        g gVar2;
        boolean z11;
        u8.a aVar;
        char c11;
        char c12;
        char c13;
        int i13;
        int i14;
        e eVar;
        int i15;
        int i16;
        e eVar2;
        int i17;
        int i18;
        int i19;
        int i21;
        v vVar = new v(bArr, i11 + i12);
        vVar.q(i11);
        while (true) {
            int iB = vVar.b();
            gVar2 = this.f54746f;
            z11 = true;
            if (iB >= 48 && vVar.i(8) == 15) {
                int i22 = vVar.i(8);
                int i23 = vVar.i(16);
                int i24 = vVar.i(16);
                int iF = vVar.f() + i24;
                if (i24 * 8 > vVar.b()) {
                    b7.a.B("Data field length exceeds limit");
                    vVar.t(vVar.b());
                } else {
                    switch (i22) {
                        case 16:
                            if (i23 == gVar2.f54732a) {
                                b.a aVar2 = gVar2.f54740i;
                                vVar.i(8);
                                int i25 = vVar.i(4);
                                int i26 = vVar.i(2);
                                vVar.t(2);
                                int i27 = i24 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i27 > 0) {
                                    int i28 = vVar.i(8);
                                    vVar.t(8);
                                    i27 -= 6;
                                    sparseArray.put(i28, new d(vVar.i(16), vVar.i(16)));
                                }
                                b.a aVar3 = new b.a(i25, i26, sparseArray);
                                if (i26 != 0) {
                                    gVar2.f54740i = aVar3;
                                    gVar2.f54734c.clear();
                                    gVar2.f54735d.clear();
                                    gVar2.f54736e.clear();
                                } else if (aVar2 != null && aVar2.f3413a != i25) {
                                    gVar2.f54740i = aVar3;
                                }
                            }
                            break;
                        case 17:
                            b.a aVar4 = gVar2.f54740i;
                            SparseArray sparseArray2 = gVar2.f54734c;
                            if (i23 == gVar2.f54732a && aVar4 != null) {
                                int i29 = vVar.i(8);
                                vVar.t(4);
                                boolean zH = vVar.h();
                                vVar.t(3);
                                int i30 = vVar.i(16);
                                int i31 = vVar.i(16);
                                vVar.i(3);
                                int i32 = vVar.i(3);
                                vVar.t(2);
                                int i33 = vVar.i(8);
                                int i34 = vVar.i(8);
                                int i35 = vVar.i(4);
                                int i36 = vVar.i(2);
                                vVar.t(2);
                                int i37 = i24 - 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i37 > 0) {
                                    int i38 = vVar.i(16);
                                    int i39 = vVar.i(2);
                                    vVar.i(2);
                                    int i40 = vVar.i(12);
                                    vVar.t(4);
                                    int i41 = vVar.i(12);
                                    int i42 = i37 - 6;
                                    if (i39 == 1 || i39 == 2) {
                                        vVar.i(8);
                                        vVar.i(8);
                                        i37 -= 8;
                                    } else {
                                        i37 = i42;
                                    }
                                    sparseArray3.put(i38, new f(i40, i41));
                                }
                                e eVar3 = new e(i29, zH, i30, i31, i32, i33, i34, i35, i36, sparseArray3);
                                if (aVar4.f3414b == 0 && (eVar2 = (e) sparseArray2.get(i29)) != null) {
                                    SparseArray sparseArray4 = eVar2.f54729j;
                                    for (int i43 = 0; i43 < sparseArray4.size(); i43++) {
                                        eVar3.f54729j.put(sparseArray4.keyAt(i43), (f) sparseArray4.valueAt(i43));
                                    }
                                }
                                sparseArray2.put(eVar3.f54720a, eVar3);
                            }
                            break;
                        case 18:
                            if (i23 == gVar2.f54732a) {
                                a aVarF = f(vVar, i24);
                                gVar2.f54735d.put(aVarF.f54704a, aVarF);
                            } else if (i23 == gVar2.f54733b) {
                                a aVarF2 = f(vVar, i24);
                                gVar2.f54737f.put(aVarF2.f54704a, aVarF2);
                            }
                            break;
                        case 19:
                            if (i23 == gVar2.f54732a) {
                                c cVarG = g(vVar);
                                gVar2.f54736e.put(cVarG.f54714a, cVarG);
                            } else if (i23 == gVar2.f54733b) {
                                c cVarG2 = g(vVar);
                                gVar2.f54738g.put(cVarG2.f54714a, cVarG2);
                            }
                            break;
                        case 20:
                            if (i23 == gVar2.f54732a) {
                                vVar.t(4);
                                boolean zH2 = vVar.h();
                                vVar.t(3);
                                int i44 = vVar.i(16);
                                int i45 = vVar.i(16);
                                if (zH2) {
                                    int i46 = vVar.i(16);
                                    i17 = vVar.i(16);
                                    i21 = vVar.i(16);
                                    i18 = vVar.i(16);
                                    i19 = i46;
                                } else {
                                    i17 = i44;
                                    i18 = i45;
                                    i19 = 0;
                                    i21 = 0;
                                }
                                gVar2.f54739h = new b(i44, i45, i19, i17, i21, i18);
                            }
                            break;
                    }
                    vVar.u(iF - vVar.f());
                }
            }
        }
        b.a aVar5 = gVar2.f54740i;
        if (aVar5 == null) {
            aVar = new u8.a(-9223372036854775807L, -9223372036854775807L, ImmutableList.s());
        } else {
            b bVar = gVar2.f54739h;
            if (bVar == null) {
                bVar = this.f54744d;
            }
            Bitmap bitmap = this.f54747t;
            Canvas canvas = this.f54743c;
            if (bitmap == null || bVar.f54708a + 1 != bitmap.getWidth() || bVar.f54709b + 1 != this.f54747t.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bVar.f54708a + 1, bVar.f54709b + 1, Bitmap.Config.ARGB_8888);
                this.f54747t = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray5 = (SparseArray) aVar5.f3415c;
            int i47 = 0;
            while (i47 < sparseArray5.size()) {
                canvas.save();
                d dVar = (d) sparseArray5.valueAt(i47);
                e eVar4 = (e) gVar2.f54734c.get(sparseArray5.keyAt(i47));
                int i48 = dVar.f54718a + bVar.f54710c;
                int i49 = dVar.f54719b + bVar.f54712e;
                int i50 = eVar4.f54722c;
                int i51 = eVar4.f54725f;
                int i52 = eVar4.f54723d;
                boolean z12 = z11;
                int i53 = i48 + i50;
                int i54 = i49 + i52;
                SparseArray sparseArray6 = sparseArray5;
                canvas.clipRect(i48, i49, Math.min(i53, bVar.f54711d), Math.min(i54, bVar.f54713f));
                a aVar6 = (a) gVar2.f54735d.get(i51);
                if (aVar6 == null && (aVar6 = (a) gVar2.f54737f.get(i51)) == null) {
                    aVar6 = this.f54745e;
                }
                SparseArray sparseArray7 = eVar4.f54729j;
                int i55 = i47;
                int i56 = 0;
                while (i56 < sparseArray7.size()) {
                    int iKeyAt = sparseArray7.keyAt(i56);
                    SparseArray sparseArray8 = sparseArray7;
                    f fVar = (f) sparseArray7.valueAt(i56);
                    int i57 = i49;
                    c cVar = (c) gVar2.f54736e.get(iKeyAt);
                    if (cVar == null) {
                        cVar = (c) gVar2.f54738g.get(iKeyAt);
                    }
                    c cVar2 = cVar;
                    if (cVar2 != null) {
                        Paint paint = cVar2.f54715b ? null : this.f54741a;
                        int i58 = i48;
                        int i59 = eVar4.f54724e;
                        int i60 = i58 + fVar.f54730a;
                        int i61 = i57 + fVar.f54731b;
                        int i62 = i52;
                        Paint paint2 = paint;
                        i15 = i58;
                        i14 = i57;
                        e eVar5 = eVar4;
                        int[] iArr = i59 == 3 ? aVar6.f54707d : i59 == 2 ? aVar6.f54706c : aVar6.f54705b;
                        eVar = eVar5;
                        i16 = i62;
                        e(cVar2.f54716c, iArr, i59, i60, i61, paint2, canvas);
                        e(cVar2.f54717d, iArr, i59, i60, i61 + 1, paint2, canvas);
                    } else {
                        i14 = i57;
                        eVar = eVar4;
                        i15 = i48;
                        i16 = i52;
                    }
                    i56++;
                    i50 = i50;
                    i49 = i14;
                    eVar4 = eVar;
                    i48 = i15;
                    arrayList = arrayList;
                    sparseArray7 = sparseArray8;
                    bVar = bVar;
                    gVar2 = gVar2;
                    i52 = i16;
                }
                b bVar2 = bVar;
                ArrayList arrayList2 = arrayList;
                g gVar3 = gVar2;
                int i63 = i49;
                e eVar6 = eVar4;
                int i64 = i48;
                int i65 = i50;
                int i66 = i52;
                if (eVar6.f54721b) {
                    int i67 = eVar6.f54724e;
                    if (i67 == 3) {
                        i13 = aVar6.f54707d[eVar6.f54726g];
                        c13 = 2;
                    } else {
                        c13 = 2;
                        i13 = i67 == 2 ? aVar6.f54706c[eVar6.f54727h] : aVar6.f54705b[eVar6.f54728i];
                    }
                    Paint paint3 = this.f54742b;
                    paint3.setColor(i13);
                    c11 = c13;
                    c12 = 3;
                    canvas.drawRect(i64, i63, i53, i54, paint3);
                } else {
                    c11 = 2;
                    c12 = 3;
                }
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f54747t, i64, i63, i65, i66);
                float f5 = bVar2.f54708a;
                float f11 = bVar2.f54709b;
                arrayList2.add(new a7.b(null, null, null, bitmapCreateBitmap2, i63 / f11, 0, 0, i64 / f5, 0, Integer.MIN_VALUE, -3.4028235E38f, i65 / f5, i66 / f11, false, -16777216, Integer.MIN_VALUE, CropImageView.DEFAULT_ASPECT_RATIO, 0));
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i47 = i55 + 1;
                z11 = z12;
                bVar = bVar2;
                arrayList = arrayList2;
                gVar2 = gVar3;
                sparseArray5 = sparseArray6;
            }
            aVar = new u8.a(-9223372036854775807L, -9223372036854775807L, arrayList);
        }
        gVar.accept(aVar);
    }

    @Override // u8.k
    public final int l() {
        return 2;
    }

    @Override // u8.k
    public final void reset() {
        g gVar = this.f54746f;
        gVar.f54734c.clear();
        gVar.f54735d.clear();
        gVar.f54736e.clear();
        gVar.f54737f.clear();
        gVar.f54738g.clear();
        gVar.f54739h = null;
        gVar.f54740i = null;
    }
}
