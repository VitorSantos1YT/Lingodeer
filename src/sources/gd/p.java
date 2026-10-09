package gd;

import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import fd.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ob.u;
import wc.v;
import wc.z;
import y.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends c {
    public final StringBuilder D;
    public final RectF E;
    public final Matrix F;
    public final m G;
    public final m H;
    public final HashMap I;
    public final r J;
    public final ArrayList K;
    public final zc.e L;
    public final v M;
    public final wc.h N;
    public final x O;
    public final zc.e P;
    public zc.p Q;
    public final zc.e R;
    public zc.p S;
    public final zc.g T;
    public zc.p U;
    public final zc.g V;
    public zc.p W;
    public final zc.e X;
    public zc.p Y;
    public zc.p Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final zc.e f29127a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final zc.e f29128b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final zc.e f29129c0;

    public p(v vVar, i iVar) {
        dm.c cVar;
        dm.c cVar2;
        ed.a aVar;
        dm.c cVar3;
        ed.a aVar2;
        dm.c cVar4;
        ed.a aVar3;
        a9.i iVar2;
        ed.a aVar4;
        a9.i iVar3;
        ed.b bVar;
        a9.i iVar4;
        ed.b bVar2;
        a9.i iVar5;
        ed.a aVar5;
        a9.i iVar6;
        ed.a aVar6;
        super(vVar, iVar);
        this.D = new StringBuilder(2);
        this.E = new RectF();
        this.F = new Matrix();
        m mVar = new m(1, 0);
        mVar.setStyle(Paint.Style.FILL);
        this.G = mVar;
        m mVar2 = new m(1, 1);
        mVar2.setStyle(Paint.Style.STROKE);
        this.H = mVar2;
        this.I = new HashMap();
        this.J = new r((Object) null);
        this.K = new ArrayList();
        this.O = x.INDEX;
        this.M = vVar;
        this.N = iVar.f29100b;
        zc.e eVar = new zc.e(2, (List) iVar.f29114q.f3561b);
        this.L = eVar;
        eVar.a(this);
        g(eVar);
        ob.l lVar = iVar.f29115r;
        if (lVar != null && (iVar6 = (a9.i) lVar.f44822b) != null && (aVar6 = (ed.a) iVar6.f517a) != null) {
            zc.d dVarI = aVar6.I();
            this.P = (zc.e) dVarI;
            dVarI.a(this);
            g(dVarI);
        }
        if (lVar != null && (iVar5 = (a9.i) lVar.f44822b) != null && (aVar5 = (ed.a) iVar5.f518b) != null) {
            zc.d dVarI2 = aVar5.I();
            this.R = (zc.e) dVarI2;
            dVarI2.a(this);
            g(dVarI2);
        }
        if (lVar != null && (iVar4 = (a9.i) lVar.f44822b) != null && (bVar2 = (ed.b) iVar4.f519c) != null) {
            zc.g gVarI = bVar2.I();
            this.T = gVarI;
            gVarI.a(this);
            g(gVarI);
        }
        if (lVar != null && (iVar3 = (a9.i) lVar.f44822b) != null && (bVar = (ed.b) iVar3.f520d) != null) {
            zc.g gVarI2 = bVar.I();
            this.V = gVarI2;
            gVarI2.a(this);
            g(gVarI2);
        }
        if (lVar != null && (iVar2 = (a9.i) lVar.f44822b) != null && (aVar4 = (ed.a) iVar2.f521e) != null) {
            zc.d dVarI3 = aVar4.I();
            this.X = (zc.e) dVarI3;
            dVarI3.a(this);
            g(dVarI3);
        }
        if (lVar != null && (cVar4 = (dm.c) lVar.f44823c) != null && (aVar3 = (ed.a) cVar4.f23490b) != null) {
            zc.d dVarI4 = aVar3.I();
            this.f29127a0 = (zc.e) dVarI4;
            dVarI4.a(this);
            g(dVarI4);
        }
        if (lVar != null && (cVar3 = (dm.c) lVar.f44823c) != null && (aVar2 = (ed.a) cVar3.f23491c) != null) {
            zc.d dVarI5 = aVar2.I();
            this.f29128b0 = (zc.e) dVarI5;
            dVarI5.a(this);
            g(dVarI5);
        }
        if (lVar != null && (cVar2 = (dm.c) lVar.f44823c) != null && (aVar = (ed.a) cVar2.f23492d) != null) {
            zc.d dVarI6 = aVar.I();
            this.f29129c0 = (zc.e) dVarI6;
            dVarI6.a(this);
            g(dVarI6);
        }
        if (lVar == null || (cVar = (dm.c) lVar.f44823c) == null) {
            return;
        }
        this.O = (x) cVar.f23493e;
    }

    public static void t(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == CropImageView.DEFAULT_ASPECT_RATIO) {
            return;
        }
        canvas.drawText(str, 0, str.length(), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, paint);
    }

    public static void u(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == CropImageView.DEFAULT_ASPECT_RATIO) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // gd.c, yc.e
    public final void e(RectF rectF, Matrix matrix, boolean z11) {
        super.e(rectF, matrix, z11);
        wc.h hVar = this.N;
        rectF.set(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, hVar.f54967k.width(), hVar.f54967k.height());
    }

    @Override // gd.c, dd.g
    public final void f(Object obj, u uVar) {
        super.f(obj, uVar);
        PointF pointF = z.f55043a;
        if (obj == 1) {
            zc.p pVar = this.Q;
            if (pVar != null) {
                o(pVar);
            }
            if (uVar == null) {
                this.Q = null;
                return;
            }
            zc.p pVar2 = new zc.p(null, uVar);
            this.Q = pVar2;
            pVar2.a(this);
            g(this.Q);
            return;
        }
        if (obj == 2) {
            zc.p pVar3 = this.S;
            if (pVar3 != null) {
                o(pVar3);
            }
            if (uVar == null) {
                this.S = null;
                return;
            }
            zc.p pVar4 = new zc.p(null, uVar);
            this.S = pVar4;
            pVar4.a(this);
            g(this.S);
            return;
        }
        if (obj == z.f55055n) {
            zc.p pVar5 = this.U;
            if (pVar5 != null) {
                o(pVar5);
            }
            if (uVar == null) {
                this.U = null;
                return;
            }
            zc.p pVar6 = new zc.p(null, uVar);
            this.U = pVar6;
            pVar6.a(this);
            g(this.U);
            return;
        }
        if (obj == z.f55056o) {
            zc.p pVar7 = this.W;
            if (pVar7 != null) {
                o(pVar7);
            }
            if (uVar == null) {
                this.W = null;
                return;
            }
            zc.p pVar8 = new zc.p(null, uVar);
            this.W = pVar8;
            pVar8.a(this);
            g(this.W);
            return;
        }
        if (obj == z.A) {
            zc.p pVar9 = this.Y;
            if (pVar9 != null) {
                o(pVar9);
            }
            if (uVar == null) {
                this.Y = null;
                return;
            }
            zc.p pVar10 = new zc.p(null, uVar);
            this.Y = pVar10;
            pVar10.a(this);
            g(this.Y);
            return;
        }
        if (obj != z.H) {
            if (obj == z.J) {
                zc.e eVar = this.L;
                eVar.getClass();
                eVar.k(new zc.n(new ld.b(), uVar, new dd.c()));
                return;
            }
            return;
        }
        zc.p pVar11 = this.Z;
        if (pVar11 != null) {
            o(pVar11);
        }
        if (uVar == null) {
            this.Z = null;
            return;
        }
        zc.p pVar12 = new zc.p(null, uVar);
        this.Z = pVar12;
        pVar12.a(this);
        g(this.Z);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0354  */
    /* JADX WARN: Code duplicated, block: B:102:0x035c  */
    /* JADX WARN: Code duplicated, block: B:120:0x03df  */
    /* JADX WARN: Code duplicated, block: B:122:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:123:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:127:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:129:0x0415  */
    /* JADX WARN: Code duplicated, block: B:132:0x0422  */
    /* JADX WARN: Code duplicated, block: B:135:0x043a  */
    /* JADX WARN: Code duplicated, block: B:151:0x0488  */
    /* JADX WARN: Code duplicated, block: B:152:0x0493  */
    /* JADX WARN: Code duplicated, block: B:154:0x04a1 A[LOOP:9: B:153:0x049f->B:154:0x04a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:158:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:159:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:162:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:181:0x047d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:24:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:25:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:29:0x0104  */
    /* JADX WARN: Code duplicated, block: B:31:0x0117  */
    /* JADX WARN: Code duplicated, block: B:34:0x0123  */
    /* JADX WARN: Code duplicated, block: B:36:0x013f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0151  */
    /* JADX WARN: Code duplicated, block: B:39:0x015c  */
    /* JADX WARN: Code duplicated, block: B:40:0x016d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0184 A[LOOP:4: B:41:0x0182->B:42:0x0184, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:49:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:50:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:55:0x024d  */
    /* JADX WARN: Code duplicated, block: B:76:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:83:0x0300  */
    /* JADX WARN: Code duplicated, block: B:84:0x0305  */
    /* JADX WARN: Code duplicated, block: B:86:0x0309  */
    /* JADX WARN: Code duplicated, block: B:87:0x030d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0342 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0344  */
    /* JADX WARN: Code duplicated, block: B:94:0x0347 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0349  */
    /* JADX WARN: Code duplicated, block: B:96:0x034c  */
    /* JADX WARN: Instruction removed from duplicated block: B:87:0x030d, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // gd.c
    public final void k(Canvas canvas, Matrix matrix, int i11, kd.b bVar) {
        a9.i iVarJ;
        Typeface typefaceCreateFromAsset;
        ob.c cVar;
        HashMap map;
        Typeface typeface;
        HashMap map2;
        Typeface typeface2;
        Typeface typeface3;
        boolean zContains;
        boolean zContains2;
        int i12;
        float fFloatValue;
        float fC;
        List listAsList;
        int size;
        int i13;
        int length;
        int i14;
        PointF pointF;
        float f5;
        float f11;
        List listY;
        int i15;
        o oVar;
        String str;
        int length2;
        int iCodePointAt;
        int i16;
        int iCharCount;
        float f12;
        long j11;
        r rVar;
        StringBuilder sb2;
        int iCharCount2;
        String string;
        int iCodePointAt2;
        Canvas canvas2;
        float fFloatValue2;
        float f13;
        int i17;
        int i18;
        PointF pointF2;
        float f14;
        float f15;
        List listY2;
        int i19;
        o oVar2;
        String str2;
        int i21;
        float f16;
        wc.h hVar;
        dd.e eVar;
        HashMap map3;
        ArrayList arrayList;
        int size2;
        ArrayList arrayList2;
        int i22;
        List list;
        int i23;
        m mVar;
        m mVar2;
        Path pathA;
        m mVar3;
        m mVar4;
        dd.c cVar2 = (dd.c) this.L.f();
        wc.h hVar2 = this.N;
        dd.d dVar = (dd.d) hVar2.f54962f.get(cVar2.f23358b);
        if (dVar == null) {
            return;
        }
        String str3 = dVar.f23371c;
        String str4 = dVar.f23369a;
        canvas.save();
        canvas.concat(matrix);
        s(cVar2, i11, 0);
        v vVar = this.M;
        Map map4 = vVar.M;
        String str5 = "\n";
        zc.g gVar = this.V;
        int i24 = 0;
        m mVar5 = this.G;
        m mVar6 = this.H;
        if (map4 != null || vVar.f55010a.f54964h.h() <= 0) {
            zc.p pVar = this.Z;
            if (pVar == null || (typefaceCreateFromAsset = (Typeface) pVar.f()) == null) {
                Map map5 = vVar.M;
                if (map5 == null) {
                    iVarJ = vVar.j();
                    if (iVarJ != null) {
                        cVar = (ob.c) iVarJ.f517a;
                        cVar.f44799b = str4;
                        cVar.f44800c = str3;
                        map = (HashMap) iVarJ.f520d;
                        typeface = (Typeface) map.get(cVar);
                        if (typeface != null) {
                            typefaceCreateFromAsset = typeface;
                            str5 = "\n";
                        } else {
                            map2 = (HashMap) iVarJ.f521e;
                            typeface2 = (Typeface) map2.get(str4);
                            if (typeface2 != null) {
                                typefaceCreateFromAsset = typeface2;
                            } else {
                                typeface3 = dVar.f23372d;
                                if (typeface3 != null) {
                                    typefaceCreateFromAsset = typeface3;
                                } else {
                                    typefaceCreateFromAsset = Typeface.createFromAsset((AssetManager) iVarJ.f518b, "fonts/" + str4 + ((String) iVarJ.f519c));
                                    map2.put(str4, typefaceCreateFromAsset);
                                }
                            }
                            zContains = str3.contains("Italic");
                            zContains2 = str3.contains("Bold");
                            if (!zContains && zContains2) {
                                i12 = 3;
                            } else if (zContains) {
                                i12 = 2;
                            } else if (zContains2) {
                                i12 = 1;
                            } else {
                                i12 = 0;
                            }
                            if (typefaceCreateFromAsset.getStyle() != i12) {
                                typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i12);
                            }
                            map.put(cVar, typefaceCreateFromAsset);
                        }
                    } else {
                        str5 = "\n";
                        typefaceCreateFromAsset = null;
                    }
                } else {
                    if (map5.containsKey(str4)) {
                        typefaceCreateFromAsset = (Typeface) map5.get(str4);
                    } else {
                        String str6 = dVar.f23370b;
                        if (map5.containsKey(str6)) {
                            typefaceCreateFromAsset = (Typeface) map5.get(str6);
                        } else {
                            String strD = ep.a.D(str4, "-", str3);
                            if (map5.containsKey(strD)) {
                                typefaceCreateFromAsset = (Typeface) map5.get(strD);
                            } else {
                                iVarJ = vVar.j();
                                if (iVarJ != null) {
                                    cVar = (ob.c) iVarJ.f517a;
                                    cVar.f44799b = str4;
                                    cVar.f44800c = str3;
                                    map = (HashMap) iVarJ.f520d;
                                    typeface = (Typeface) map.get(cVar);
                                    if (typeface != null) {
                                        typefaceCreateFromAsset = typeface;
                                    } else {
                                        map2 = (HashMap) iVarJ.f521e;
                                        typeface2 = (Typeface) map2.get(str4);
                                        if (typeface2 != null) {
                                            typefaceCreateFromAsset = typeface2;
                                        } else {
                                            typeface3 = dVar.f23372d;
                                            if (typeface3 != null) {
                                                typefaceCreateFromAsset = typeface3;
                                            } else {
                                                typefaceCreateFromAsset = Typeface.createFromAsset((AssetManager) iVarJ.f518b, "fonts/" + str4 + ((String) iVarJ.f519c));
                                                map2.put(str4, typefaceCreateFromAsset);
                                            }
                                        }
                                        zContains = str3.contains("Italic");
                                        zContains2 = str3.contains("Bold");
                                        if (!zContains) {
                                            if (zContains) {
                                                i12 = 2;
                                            } else if (zContains2) {
                                                i12 = 1;
                                            } else {
                                                i12 = 0;
                                            }
                                        } else if (zContains) {
                                            i12 = 2;
                                        } else if (zContains2) {
                                            i12 = 1;
                                        } else {
                                            i12 = 0;
                                        }
                                        if (typefaceCreateFromAsset.getStyle() != i12) {
                                            typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i12);
                                        }
                                        map.put(cVar, typefaceCreateFromAsset);
                                    }
                                } else {
                                    str5 = "\n";
                                    typefaceCreateFromAsset = null;
                                }
                            }
                        }
                    }
                    str5 = "\n";
                }
                if (typefaceCreateFromAsset == null) {
                    typefaceCreateFromAsset = dVar.f23372d;
                }
            } else {
                str5 = "\n";
            }
            if (typefaceCreateFromAsset != null) {
                String str7 = cVar2.f23357a;
                mVar5.setTypeface(typefaceCreateFromAsset);
                zc.p pVar2 = this.Y;
                float fFloatValue3 = pVar2 != null ? ((Float) pVar2.f()).floatValue() : cVar2.f23359c;
                mVar5.setTextSize(kd.k.c() * fFloatValue3);
                mVar6.setTypeface(mVar5.getTypeface());
                mVar6.setTextSize(mVar5.getTextSize());
                float f17 = cVar2.f23361e / 10.0f;
                zc.p pVar3 = this.W;
                if (pVar3 != null) {
                    fFloatValue = ((Float) pVar3.f()).floatValue();
                } else {
                    if (gVar != null) {
                        fFloatValue = ((Float) gVar.f()).floatValue();
                    }
                    fC = ((kd.k.c() * f17) * fFloatValue3) / 100.0f;
                    listAsList = Arrays.asList(str7.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll(str5, "\r").split("\r"));
                    size = listAsList.size();
                    i13 = 0;
                    length = 0;
                    i14 = -1;
                    while (i13 < size) {
                        String str8 = (String) listAsList.get(i13);
                        pointF = cVar2.m;
                        if (pointF == null) {
                            f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                        } else {
                            f5 = pointF.x;
                        }
                        f11 = fC;
                        listY = y(str8, f5, dVar, CropImageView.DEFAULT_ASPECT_RATIO, f11, false);
                        i15 = 0;
                        while (i15 < listY.size()) {
                            oVar = (o) listY.get(i15);
                            i14++;
                            canvas.save();
                            if (x(canvas, cVar2, i14, mVar5.measureText(oVar.f29125a))) {
                                str = oVar.f29125a;
                                length2 = 0;
                                while (length2 < str.length()) {
                                    iCodePointAt = str.codePointAt(length2);
                                    i16 = length2;
                                    iCharCount = Character.charCount(iCodePointAt) + length2;
                                    dd.d dVar2 = dVar;
                                    while (true) {
                                        if (iCharCount < str.length()) {
                                            f12 = f11;
                                            break;
                                        }
                                        iCodePointAt2 = str.codePointAt(iCharCount);
                                        f12 = f11;
                                        if (Character.getType(iCodePointAt2) == 16 && Character.getType(iCodePointAt2) != 27 && Character.getType(iCodePointAt2) != 6 && Character.getType(iCodePointAt2) != 28 && Character.getType(iCodePointAt2) != 8 && Character.getType(iCodePointAt2) != 19) {
                                            break;
                                        }
                                        iCharCount += Character.charCount(iCodePointAt2);
                                        iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
                                        f11 = f12;
                                    }
                                    j11 = iCodePointAt;
                                    rVar = this.J;
                                    if (rVar.d(j11) >= 0) {
                                        string = (String) rVar.c(j11);
                                    } else {
                                        sb2 = this.D;
                                        sb2.setLength(0);
                                        iCharCount2 = i16;
                                        while (iCharCount2 < iCharCount) {
                                            int i25 = iCharCount;
                                            int iCodePointAt3 = str.codePointAt(iCharCount2);
                                            sb2.appendCodePoint(iCodePointAt3);
                                            iCharCount2 += Character.charCount(iCodePointAt3);
                                            iCharCount = i25;
                                        }
                                        string = sb2.toString();
                                        rVar.h(j11, string);
                                    }
                                    s(cVar2, i11, length + i16);
                                    if (cVar2.f23367k) {
                                        t(string, mVar5, canvas);
                                        t(string, mVar6, canvas);
                                    } else {
                                        t(string, mVar6, canvas);
                                        t(string, mVar5, canvas);
                                    }
                                    canvas.translate(mVar5.measureText(string) + f12, CropImageView.DEFAULT_ASPECT_RATIO);
                                    length2 = string.length() + i16;
                                    dVar = dVar2;
                                    listAsList = listAsList;
                                    f11 = f12;
                                    size = size;
                                }
                            }
                            dd.d dVar3 = dVar;
                            float f18 = f11;
                            List list2 = listAsList;
                            int i26 = size;
                            length += oVar.f29125a.length();
                            canvas.restore();
                            i15++;
                            listY = listY;
                            dVar = dVar3;
                            listAsList = list2;
                            f11 = f18;
                            size = i26;
                        }
                        i13++;
                        dVar = dVar;
                        fC = f11;
                    }
                }
                f17 += fFloatValue;
                fC = ((kd.k.c() * f17) * fFloatValue3) / 100.0f;
                listAsList = Arrays.asList(str7.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll(str5, "\r").split("\r"));
                size = listAsList.size();
                i13 = 0;
                length = 0;
                i14 = -1;
                while (i13 < size) {
                    String str9 = (String) listAsList.get(i13);
                    pointF = cVar2.m;
                    if (pointF == null) {
                        f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                    } else {
                        f5 = pointF.x;
                    }
                    f11 = fC;
                    listY = y(str9, f5, dVar, CropImageView.DEFAULT_ASPECT_RATIO, f11, false);
                    i15 = 0;
                    while (i15 < listY.size()) {
                        oVar = (o) listY.get(i15);
                        i14++;
                        canvas.save();
                        if (x(canvas, cVar2, i14, mVar5.measureText(oVar.f29125a))) {
                            str = oVar.f29125a;
                            length2 = 0;
                            while (length2 < str.length()) {
                                iCodePointAt = str.codePointAt(length2);
                                i16 = length2;
                                iCharCount = Character.charCount(iCodePointAt) + length2;
                                dd.d dVar4 = dVar;
                                while (true) {
                                    if (iCharCount < str.length()) {
                                        f12 = f11;
                                        break;
                                    }
                                    iCodePointAt2 = str.codePointAt(iCharCount);
                                    f12 = f11;
                                    if (Character.getType(iCodePointAt2) == 16) {
                                    }
                                    iCharCount += Character.charCount(iCodePointAt2);
                                    iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
                                    f11 = f12;
                                }
                                j11 = iCodePointAt;
                                rVar = this.J;
                                if (rVar.d(j11) >= 0) {
                                    string = (String) rVar.c(j11);
                                } else {
                                    sb2 = this.D;
                                    sb2.setLength(0);
                                    iCharCount2 = i16;
                                    while (iCharCount2 < iCharCount) {
                                        int i27 = iCharCount;
                                        int iCodePointAt4 = str.codePointAt(iCharCount2);
                                        sb2.appendCodePoint(iCodePointAt4);
                                        iCharCount2 += Character.charCount(iCodePointAt4);
                                        iCharCount = i27;
                                    }
                                    string = sb2.toString();
                                    rVar.h(j11, string);
                                }
                                s(cVar2, i11, length + i16);
                                if (cVar2.f23367k) {
                                    t(string, mVar5, canvas);
                                    t(string, mVar6, canvas);
                                } else {
                                    t(string, mVar6, canvas);
                                    t(string, mVar5, canvas);
                                }
                                canvas.translate(mVar5.measureText(string) + f12, CropImageView.DEFAULT_ASPECT_RATIO);
                                length2 = string.length() + i16;
                                dVar = dVar4;
                                listAsList = listAsList;
                                f11 = f12;
                                size = size;
                            }
                        }
                        dd.d dVar5 = dVar;
                        float f19 = f11;
                        List list3 = listAsList;
                        int i28 = size;
                        length += oVar.f29125a.length();
                        canvas.restore();
                        i15++;
                        listY = listY;
                        dVar = dVar5;
                        listAsList = list3;
                        f11 = f19;
                        size = i28;
                    }
                    i13++;
                    dVar = dVar;
                    fC = f11;
                }
            }
            canvas2 = canvas;
        } else {
            zc.p pVar4 = this.Y;
            float fFloatValue4 = pVar4 != null ? ((Float) pVar4.f()).floatValue() : cVar2.f23359c;
            Object obj = kd.k.f38128e.get();
            float f21 = CropImageView.DEFAULT_ASPECT_RATIO;
            float[] fArr = (float[]) obj;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f22 = kd.k.f38129f;
            fArr[2] = f22;
            fArr[3] = f22;
            float f23 = fFloatValue4 / 100.0f;
            matrix.mapPoints(fArr);
            m mVar7 = mVar5;
            v vVar2 = vVar;
            wc.h hVar3 = hVar2;
            String str10 = str3;
            Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
            List listAsList2 = Arrays.asList(cVar2.f23357a.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
            int size3 = listAsList2.size();
            float f24 = cVar2.f23361e / 10.0f;
            zc.p pVar5 = this.W;
            if (pVar5 != null) {
                fFloatValue2 = ((Float) pVar5.f()).floatValue();
            } else {
                if (gVar != null) {
                    fFloatValue2 = ((Float) gVar.f()).floatValue();
                }
                f13 = f24;
                i17 = 0;
                i18 = -1;
                while (i17 < size3) {
                    String str11 = (String) listAsList2.get(i17);
                    pointF2 = cVar2.m;
                    if (pointF2 == null) {
                        f14 = f21;
                    } else {
                        f14 = pointF2.x;
                    }
                    f15 = f23;
                    i19 = i24;
                    for (listY2 = y(str11, f14, dVar, f15, f13, true); i19 < listY2.size(); listY2 = listY2) {
                        oVar2 = (o) listY2.get(i19);
                        i18++;
                        canvas.save();
                        if (x(canvas, cVar2, i18, oVar2.f29126b)) {
                            str2 = oVar2.f29125a;
                            i21 = i24;
                            while (i21 < str2.length()) {
                                List list4 = listAsList2;
                                String str12 = str10;
                                int i29 = i19;
                                f16 = f13;
                                hVar = hVar3;
                                eVar = (dd.e) hVar.f54964h.d(dd.e.a(str4, str12, str2.charAt(i21)));
                                if (eVar == null) {
                                    hVar3 = hVar;
                                    str2 = str2;
                                    size3 = size3;
                                    i17 = i17;
                                    i21 = i21;
                                    mVar = mVar6;
                                    vVar2 = vVar2;
                                    mVar2 = mVar7;
                                } else {
                                    s(cVar2, i11, i21);
                                    map3 = this.I;
                                    if (map3.containsKey(eVar)) {
                                        list = (List) map3.get(eVar);
                                    } else {
                                        arrayList = eVar.f23373a;
                                        size2 = arrayList.size();
                                        arrayList2 = new ArrayList(size2);
                                        i22 = i24;
                                        while (i22 < size2) {
                                            arrayList2.add(new yc.d(vVar2, this, (fd.r) arrayList.get(i22), hVar));
                                            size2 = size2;
                                            i22++;
                                            arrayList = arrayList;
                                        }
                                        map3.put(eVar, arrayList2);
                                        list = arrayList2;
                                    }
                                    i23 = i24;
                                    while (i23 < list.size()) {
                                        pathA = ((yc.d) list.get(i23)).a();
                                        wc.h hVar4 = hVar;
                                        pathA.computeBounds(this.E, i24);
                                        Matrix matrix2 = this.F;
                                        matrix2.reset();
                                        List list5 = list;
                                        matrix2.preTranslate(f21, (-cVar2.f23363g) * kd.k.c());
                                        matrix2.preScale(f15, f15);
                                        pathA.transform(matrix2);
                                        if (cVar2.f23367k) {
                                            mVar4 = mVar7;
                                            u(pathA, mVar4, canvas);
                                            mVar3 = mVar6;
                                            u(pathA, mVar3, canvas);
                                        } else {
                                            mVar3 = mVar6;
                                            mVar4 = mVar7;
                                            u(pathA, mVar3, canvas);
                                            u(pathA, mVar4, canvas);
                                        }
                                        i23++;
                                        mVar6 = mVar3;
                                        mVar7 = mVar4;
                                        list = list5;
                                        hVar = hVar4;
                                        i24 = 0;
                                        f21 = CropImageView.DEFAULT_ASPECT_RATIO;
                                    }
                                    hVar3 = hVar;
                                    mVar = mVar6;
                                    mVar2 = mVar7;
                                    canvas.translate((kd.k.c() * ((float) eVar.f23375c) * f15) + f16, CropImageView.DEFAULT_ASPECT_RATIO);
                                }
                                f13 = f16;
                                mVar6 = mVar;
                                str10 = str12;
                                mVar7 = mVar2;
                                vVar2 = vVar2;
                                i19 = i29;
                                listAsList2 = list4;
                                str2 = str2;
                                size3 = size3;
                                i17 = i17;
                                i24 = 0;
                                f21 = CropImageView.DEFAULT_ASPECT_RATIO;
                                i21++;
                            }
                        }
                        int i30 = i19;
                        float f25 = f13;
                        List list6 = listAsList2;
                        int i31 = size3;
                        int i32 = i17;
                        m mVar8 = mVar6;
                        v vVar3 = vVar2;
                        m mVar9 = mVar7;
                        String str13 = str10;
                        canvas.restore();
                        f13 = f25;
                        mVar6 = mVar8;
                        str10 = str13;
                        mVar7 = mVar9;
                        vVar2 = vVar3;
                        listAsList2 = list6;
                        size3 = i31;
                        i17 = i32;
                        i24 = 0;
                        f21 = CropImageView.DEFAULT_ASPECT_RATIO;
                        i19 = i30 + 1;
                    }
                    listAsList2 = listAsList2;
                    i24 = 0;
                    f21 = CropImageView.DEFAULT_ASPECT_RATIO;
                    i17++;
                    f23 = f15;
                }
                canvas2 = canvas;
            }
            f24 += fFloatValue2;
            f13 = f24;
            i17 = 0;
            i18 = -1;
            while (i17 < size3) {
                String str14 = (String) listAsList2.get(i17);
                pointF2 = cVar2.m;
                if (pointF2 == null) {
                    f14 = f21;
                } else {
                    f14 = pointF2.x;
                }
                f15 = f23;
                i19 = i24;
                while (i19 < listY2.size()) {
                    oVar2 = (o) listY2.get(i19);
                    i18++;
                    canvas.save();
                    if (x(canvas, cVar2, i18, oVar2.f29126b)) {
                        str2 = oVar2.f29125a;
                        i21 = i24;
                        while (i21 < str2.length()) {
                            List list7 = listAsList2;
                            String str15 = str10;
                            int i210 = i19;
                            f16 = f13;
                            hVar = hVar3;
                            eVar = (dd.e) hVar.f54964h.d(dd.e.a(str4, str15, str2.charAt(i21)));
                            if (eVar == null) {
                                hVar3 = hVar;
                                str2 = str2;
                                size3 = size3;
                                i17 = i17;
                                i21 = i21;
                                mVar = mVar6;
                                vVar2 = vVar2;
                                mVar2 = mVar7;
                            } else {
                                s(cVar2, i11, i21);
                                map3 = this.I;
                                if (map3.containsKey(eVar)) {
                                    list = (List) map3.get(eVar);
                                } else {
                                    arrayList = eVar.f23373a;
                                    size2 = arrayList.size();
                                    arrayList2 = new ArrayList(size2);
                                    i22 = i24;
                                    while (i22 < size2) {
                                        arrayList2.add(new yc.d(vVar2, this, (fd.r) arrayList.get(i22), hVar));
                                        size2 = size2;
                                        i22++;
                                        arrayList = arrayList;
                                    }
                                    map3.put(eVar, arrayList2);
                                    list = arrayList2;
                                }
                                i23 = i24;
                                while (i23 < list.size()) {
                                    pathA = ((yc.d) list.get(i23)).a();
                                    wc.h hVar5 = hVar;
                                    pathA.computeBounds(this.E, i24);
                                    Matrix matrix3 = this.F;
                                    matrix3.reset();
                                    List list8 = list;
                                    matrix3.preTranslate(f21, (-cVar2.f23363g) * kd.k.c());
                                    matrix3.preScale(f15, f15);
                                    pathA.transform(matrix3);
                                    if (cVar2.f23367k) {
                                        mVar4 = mVar7;
                                        u(pathA, mVar4, canvas);
                                        mVar3 = mVar6;
                                        u(pathA, mVar3, canvas);
                                    } else {
                                        mVar3 = mVar6;
                                        mVar4 = mVar7;
                                        u(pathA, mVar3, canvas);
                                        u(pathA, mVar4, canvas);
                                    }
                                    i23++;
                                    mVar6 = mVar3;
                                    mVar7 = mVar4;
                                    list = list8;
                                    hVar = hVar5;
                                    i24 = 0;
                                    f21 = CropImageView.DEFAULT_ASPECT_RATIO;
                                }
                                hVar3 = hVar;
                                mVar = mVar6;
                                mVar2 = mVar7;
                                canvas.translate((kd.k.c() * ((float) eVar.f23375c) * f15) + f16, CropImageView.DEFAULT_ASPECT_RATIO);
                            }
                            f13 = f16;
                            mVar6 = mVar;
                            str10 = str15;
                            mVar7 = mVar2;
                            vVar2 = vVar2;
                            i19 = i210;
                            listAsList2 = list7;
                            str2 = str2;
                            size3 = size3;
                            i17 = i17;
                            i24 = 0;
                            f21 = CropImageView.DEFAULT_ASPECT_RATIO;
                            i21++;
                        }
                    }
                    int i33 = i19;
                    float f26 = f13;
                    List list9 = listAsList2;
                    int i34 = size3;
                    int i35 = i17;
                    m mVar10 = mVar6;
                    v vVar4 = vVar2;
                    m mVar11 = mVar7;
                    String str16 = str10;
                    canvas.restore();
                    f13 = f26;
                    mVar6 = mVar10;
                    str10 = str16;
                    mVar7 = mVar11;
                    vVar2 = vVar4;
                    listAsList2 = list9;
                    size3 = i34;
                    i17 = i35;
                    i24 = 0;
                    f21 = CropImageView.DEFAULT_ASPECT_RATIO;
                    i19 = i33 + 1;
                }
                listAsList2 = listAsList2;
                i24 = 0;
                f21 = CropImageView.DEFAULT_ASPECT_RATIO;
                i17++;
                f23 = f15;
            }
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public final void s(dd.c cVar, int i11, int i12) {
        zc.p pVar = this.Q;
        m mVar = this.G;
        if (pVar != null) {
            mVar.setColor(((Integer) pVar.f()).intValue());
        } else {
            zc.e eVar = this.P;
            if (eVar == null || !w(i12)) {
                mVar.setColor(cVar.f23364h);
            } else {
                mVar.setColor(((Integer) eVar.f()).intValue());
            }
        }
        zc.p pVar2 = this.S;
        m mVar2 = this.H;
        if (pVar2 != null) {
            mVar2.setColor(((Integer) pVar2.f()).intValue());
        } else {
            zc.e eVar2 = this.R;
            if (eVar2 == null || !w(i12)) {
                mVar2.setColor(cVar.f23365i);
            } else {
                mVar2.setColor(((Integer) eVar2.f()).intValue());
            }
        }
        zc.d dVar = this.f29094w.f59139j;
        int iIntValue = 100;
        int iIntValue2 = dVar == null ? 100 : ((Integer) dVar.f()).intValue();
        zc.e eVar3 = this.X;
        if (eVar3 != null && w(i12)) {
            iIntValue = ((Integer) eVar3.f()).intValue();
        }
        int iRound = Math.round((((iIntValue / 100.0f) * ((iIntValue2 * 255.0f) / 100.0f)) * i11) / 255.0f);
        mVar.setAlpha(iRound);
        mVar2.setAlpha(iRound);
        zc.p pVar3 = this.U;
        if (pVar3 != null) {
            mVar2.setStrokeWidth(((Float) pVar3.f()).floatValue());
            return;
        }
        zc.g gVar = this.T;
        if (gVar == null || !w(i12)) {
            mVar2.setStrokeWidth(kd.k.c() * cVar.f23366j);
        } else {
            mVar2.setStrokeWidth(((Float) gVar.f()).floatValue());
        }
    }

    public final o v(int i11) {
        ArrayList arrayList = this.K;
        for (int size = arrayList.size(); size < i11; size++) {
            o oVar = new o();
            oVar.f29125a = BuildConfig.VERSION_NAME;
            oVar.f29126b = CropImageView.DEFAULT_ASPECT_RATIO;
            arrayList.add(oVar);
        }
        return (o) arrayList.get(i11 - 1);
    }

    public final boolean w(int i11) {
        zc.e eVar;
        int length = ((dd.c) this.L.f()).f23357a.length();
        zc.e eVar2 = this.f29127a0;
        if (eVar2 == null || (eVar = this.f29128b0) == null) {
            return true;
        }
        int iMin = Math.min(((Integer) eVar2.f()).intValue(), ((Integer) eVar.f()).intValue());
        int iMax = Math.max(((Integer) eVar2.f()).intValue(), ((Integer) eVar.f()).intValue());
        zc.e eVar3 = this.f29129c0;
        if (eVar3 != null) {
            int iIntValue = ((Integer) eVar3.f()).intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.O == x.INDEX) {
            return i11 >= iMin && i11 < iMax;
        }
        float f5 = (i11 / length) * 100.0f;
        return f5 >= ((float) iMin) && f5 < ((float) iMax);
    }

    public final boolean x(Canvas canvas, dd.c cVar, int i11, float f5) {
        PointF pointF = cVar.f23368l;
        PointF pointF2 = cVar.m;
        float fC = kd.k.c();
        float f11 = CropImageView.DEFAULT_ASPECT_RATIO;
        float f12 = (i11 * cVar.f23362f * fC) + (pointF == null ? 0.0f : (cVar.f23362f * fC) + pointF.y);
        if (this.M.X && pointF2 != null && pointF != null && f12 >= pointF.y + pointF2.y + cVar.f23359c) {
            return false;
        }
        float f13 = pointF == null ? 0.0f : pointF.x;
        if (pointF2 != null) {
            f11 = pointF2.x;
        }
        int i12 = n.f29124a[cVar.f23360d.ordinal()];
        if (i12 == 1) {
            canvas.translate(f13, f12);
            return true;
        }
        if (i12 == 2) {
            canvas.translate((f13 + f11) - f5, f12);
            return true;
        }
        if (i12 != 3) {
            return true;
        }
        canvas.translate(((f11 / 2.0f) + f13) - (f5 / 2.0f), f12);
        return true;
    }

    public final List y(String str, float f5, dd.d dVar, float f11, float f12, boolean z11) {
        float fMeasureText;
        int i11 = 0;
        int i12 = 0;
        boolean z12 = false;
        int i13 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i14 = 0; i14 < str.length(); i14++) {
            char cCharAt = str.charAt(i14);
            if (z11) {
                dd.e eVar = (dd.e) this.N.f54964h.d(dd.e.a(dVar.f23369a, dVar.f23371c, cCharAt));
                if (eVar != null) {
                    fMeasureText = (kd.k.c() * ((float) eVar.f23375c) * f11) + f12;
                }
            } else {
                fMeasureText = this.G.measureText(str.substring(i14, i14 + 1)) + f12;
            }
            if (cCharAt == ' ') {
                z12 = true;
                f15 = fMeasureText;
            } else if (z12) {
                z12 = false;
                i13 = i14;
                f14 = fMeasureText;
            } else {
                f14 += fMeasureText;
            }
            f13 += fMeasureText;
            if (f5 > CropImageView.DEFAULT_ASPECT_RATIO && f13 >= f5 && cCharAt != ' ') {
                i11++;
                o oVarV = v(i11);
                if (i13 == i12) {
                    String strSubstring = str.substring(i12, i14);
                    String strTrim = strSubstring.trim();
                    float length = (f13 - fMeasureText) - ((strTrim.length() - strSubstring.length()) * f15);
                    oVarV.f29125a = strTrim;
                    oVarV.f29126b = length;
                    i12 = i14;
                    i13 = i12;
                    f13 = fMeasureText;
                    f14 = f13;
                } else {
                    String strSubstring2 = str.substring(i12, i13 - 1);
                    String strTrim2 = strSubstring2.trim();
                    float length2 = ((f13 - f14) - ((strSubstring2.length() - strTrim2.length()) * f15)) - f15;
                    oVarV.f29125a = strTrim2;
                    oVarV.f29126b = length2;
                    f13 = f14;
                    i12 = i13;
                }
            }
        }
        if (f13 > CropImageView.DEFAULT_ASPECT_RATIO) {
            i11++;
            o oVarV2 = v(i11);
            oVarV2.f29125a = str.substring(i12);
            oVarV2.f29126b = f13;
        }
        return this.K.subList(0, i11);
    }
}
