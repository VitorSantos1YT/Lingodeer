package au;

import android.graphics.DashPathEffect;
import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import com.lingo.lingoskill.object.HwCharacterDao;
import com.lingo.lingoskill.object.WordDao;
import com.lingodeer.database.model.CharacterStrokeEntity;
import com.lingodeer.database.model.ChineseToneExercise010Entity;
import com.lingodeer.database.model.ChineseToneExercise020Entity;
import com.lingodeer.database.model.ChineseToneLessonEntity;
import com.lingodeer.database.model.ChineseToneUnitEntity;
import com.lingodeer.database.model.ChineseToneWordEntity;
import com.yalantis.ucrop.view.CropImageView;
import dt.o2;
import dt.p1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pt.ImS.aYZzTH;
import rt.d5;
import su.Mbl.tcppUUQxZjFdy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f3054b;

    public /* synthetic */ o(long j11, int i11) {
        this.f3053a = i11;
        this.f3054b = j11;
    }

    private final Object a(Object obj) {
        i2.d Canvas = (i2.d) obj;
        kotlin.jvm.internal.m.f(Canvas, "$this$Canvas");
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO)) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.d() >> 32)) / 2.0f) << 32);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.d() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.d() & 4294967295L)) * 0.72f)) & 4294967295L);
        float f5 = 2;
        float fE0 = Canvas.e0(f5);
        long j11 = this.f3054b;
        Canvas.f0(j11, jFloatToRawIntBits, jFloatToRawIntBits2, (480 & 8) != 0 ? 0.0f : fE0, (480 & 16) != 0 ? 0 : 1, (480 & 32) != 0 ? null : null, 3);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.d() >> 32)) / 2.0f;
        Canvas.f0(j11, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.d() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), (((long) Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.d() & 4294967295L)) * 0.58f)) & 4294967295L), (480 & 8) != 0 ? 0.0f : Canvas.e0(f5), (480 & 16) != 0 ? 0 : 1, (480 & 32) != 0 ? null : null, 3);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.d() >> 32)) / 2.0f;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.d() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32);
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (Canvas.d() >> 32));
        Canvas.f0(j11, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.d() & 4294967295L)) * 0.58f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32), (480 & 8) != 0 ? 0.0f : Canvas.e0(f5), (480 & 16) != 0 ? 0 : 1, (480 & 32) != 0 ? null : null, 3);
        return qy.b0.f48488a;
    }

    private final Object c(Object obj) {
        i2.d Canvas = (i2.d) obj;
        kotlin.jvm.internal.m.f(Canvas, "$this$Canvas");
        g2.k kVarA = g2.o.a();
        kVarA.g(CropImageView.DEFAULT_ASPECT_RATIO, Float.intBitsToFloat((int) (Canvas.d() & 4294967295L)));
        kVarA.f(Float.intBitsToFloat((int) (Canvas.d() >> 32)) / 2, CropImageView.DEFAULT_ASPECT_RATIO);
        kVarA.f(Float.intBitsToFloat((int) (Canvas.d() >> 32)), Float.intBitsToFloat((int) (Canvas.d() & 4294967295L)));
        kVarA.d();
        i2.d.o0(Canvas, kVarA, this.f3054b, CropImageView.DEFAULT_ASPECT_RATIO, i2.g.f34126a, 52);
        return qy.b0.f48488a;
    }

    private final Object d(Object obj) {
        String text = (String) obj;
        kotlin.jvm.internal.m.f(text, "text");
        char c11 = this.f3054b == 231 ? 'k' : 's';
        lz.g gVarD0 = oz.q.D0(text);
        ArrayList arrayList = new ArrayList();
        Iterator it = gVarD0.iterator();
        while (((lz.f) it).hasNext()) {
            Object next = ((ry.w) it).next();
            if (text.charAt(((Number) next).intValue()) == c11) {
                arrayList.add(next);
            }
        }
        return ry.m.f1(arrayList);
    }

    private final Object e(Object obj) {
        i2.d Canvas = (i2.d) obj;
        kotlin.jvm.internal.m.f(Canvas, "$this$Canvas");
        g2.k kVarA = g2.o.a();
        kVarA.g(Float.intBitsToFloat((int) (Canvas.d() >> 32)) / 2.0f, CropImageView.DEFAULT_ASPECT_RATIO);
        kVarA.f(Float.intBitsToFloat((int) (Canvas.d() >> 32)), Float.intBitsToFloat((int) (Canvas.d() & 4294967295L)));
        kVarA.f(CropImageView.DEFAULT_ASPECT_RATIO, Float.intBitsToFloat((int) (Canvas.d() & 4294967295L)));
        kVarA.d();
        i2.d.o0(Canvas, kVarA, this.f3054b, CropImageView.DEFAULT_ASPECT_RATIO, null, 60);
        return qy.b0.f48488a;
    }

    private final Object h(Object obj) {
        i2.d Canvas = (i2.d) obj;
        kotlin.jvm.internal.m.f(Canvas, "$this$Canvas");
        float f5 = 2;
        i2.d.y(Canvas, this.f3054b, 0L, 0L, (((long) Float.floatToRawIntBits(Canvas.e0(f5))) << 32) | (((long) Float.floatToRawIntBits(Canvas.e0(f5))) & 4294967295L), null, 246);
        return qy.b0.f48488a;
    }

    private final Object j(Object obj) {
        i2.d Canvas = (i2.d) obj;
        kotlin.jvm.internal.m.f(Canvas, "$this$Canvas");
        char c11 = ' ';
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.d() >> 32));
        float f5 = 2.0f;
        float fSqrt = (((float) Math.sqrt(3.0f)) * fIntBitsToFloat) / 2.0f;
        long j11 = 4294967295L;
        List listL = ns.o.L(new f2.b((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (Canvas.d() & 4294967295L)) + fSqrt) / 2.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (Canvas.d() >> 32)) - fIntBitsToFloat) / 2.0f)) << 32)), new f2.b((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (Canvas.d() >> 32)) + fIntBitsToFloat) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (Canvas.d() & 4294967295L)) + fSqrt) / 2.0f)) & 4294967295L)), new f2.b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.d() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (Canvas.d() & 4294967295L)) - fSqrt) / 2.0f)) & 4294967295L)));
        g2.k kVarA = g2.o.a();
        int size = listL.size();
        int i11 = 0;
        while (i11 < size) {
            long j12 = ((f2.b) listL.get(i11)).f26570a;
            long j13 = ((f2.b) listL.get((listL.size() + (i11 - 1)) % listL.size())).f26570a;
            int i12 = i11 + 1;
            long j14 = ((f2.b) listL.get(i12 % listL.size())).f26570a;
            long jG = f2.b.g(j13, j12);
            long jG2 = f2.b.g(j14, j12);
            char c12 = c11;
            float f11 = f5;
            long j15 = j11;
            float fHypot = (float) Math.hypot(Float.intBitsToFloat((int) (jG >> c12)), Float.intBitsToFloat((int) (jG & j15)));
            int i13 = size;
            int i14 = i11;
            float fHypot2 = (float) Math.hypot(Float.intBitsToFloat((int) (jG2 >> c12)), Float.intBitsToFloat((int) (jG2 & j15)));
            long jB = fHypot == CropImageView.DEFAULT_ASPECT_RATIO ? 0L : f2.b.b(jG, fHypot);
            long jB2 = fHypot2 != CropImageView.DEFAULT_ASPECT_RATIO ? f2.b.b(jG2, fHypot2) : 0L;
            float f12 = 2;
            float fMin = Math.min(Canvas.e0(f12), fHypot / f11);
            float fMin2 = Math.min(Canvas.e0(f12), fHypot2 / f11);
            long jH = f2.b.h(j12, f2.b.i(jB, fMin));
            long jH2 = f2.b.h(j12, f2.b.i(jB2, fMin2));
            if (i14 == 0) {
                kVarA.g(Float.intBitsToFloat((int) (jH >> c12)), Float.intBitsToFloat((int) (jH & j15)));
            } else {
                kVarA.f(Float.intBitsToFloat((int) (jH >> c12)), Float.intBitsToFloat((int) (jH & j15)));
            }
            kVarA.i(Float.intBitsToFloat((int) (j12 >> c12)), Float.intBitsToFloat((int) (j12 & j15)), Float.intBitsToFloat((int) (jH2 >> c12)), Float.intBitsToFloat((int) (jH2 & j15)));
            c11 = c12;
            size = i13;
            f5 = f11;
            j11 = j15;
            i11 = i12;
        }
        kVarA.d();
        i2.d.o0(Canvas, kVarA, this.f3054b, CropImageView.DEFAULT_ASPECT_RATIO, null, 60);
        return qy.b0.f48488a;
    }

    private final Object k(Object obj) {
        List<d5> units = (List) obj;
        kotlin.jvm.internal.m.f(units, "units");
        ArrayList arrayList = new ArrayList(ry.n.W(units, 10));
        for (d5 d5VarA : units) {
            if (d5VarA.f49613a == this.f3054b && d5VarA.f49618f) {
                d5VarA = d5.a(d5VarA, 0, 0, false, !d5VarA.f49619g, 63);
            }
            arrayList.add(d5VarA);
        }
        return arrayList;
    }

    private final Object l(Object obj) {
        d2.e eVar = (d2.e) obj;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (eVar.f23069a.d() >> 32)) / 2.0f;
        return eVar.b(new p1(fIntBitsToFloat, qx.p.m(eVar, fIntBitsToFloat), new g2.p(this.f3054b, 5), 4));
    }

    private final Object m(Object obj) {
        ((g3.b0) obj).b(d1.g0.f22913c, new d1.f0(s0.g0.Cursor, this.f3054b, d1.e0.Middle, true));
        return qy.b0.f48488a;
    }

    private final Object n(Object obj) {
        w2.p0 item = (w2.p0) obj;
        kotlin.jvm.internal.m.f(item, "item");
        return item.B(this.f3054b);
    }

    private final Object o(Object obj) {
        return Long.valueOf(this.f3054b);
    }

    public /* synthetic */ o(long j11, Object obj, int i11) {
        this.f3053a = i11;
        this.f3054b = j11;
    }

    @Override // fz.c
    public final Object invoke(Object obj) throws Exception {
        rz.m mVar;
        Object objL;
        int i11 = this.f3053a;
        String str = tcppUUQxZjFdy.PIi;
        qy.b0 b0Var = qy.b0.f48488a;
        CharacterStrokeEntity characterStrokeEntity = null;
        String strB0 = null;
        ChineseToneWordEntity chineseToneWordEntity = null;
        String strB1 = null;
        ChineseToneUnitEntity chineseToneUnitEntity = null;
        String strB2 = null;
        ChineseToneLessonEntity chineseToneLessonEntity = null;
        String strB3 = null;
        long j11 = this.f3054b;
        switch (i11) {
            case 0:
                ja.a _connection = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection, "_connection");
                ja.c cVarB1 = _connection.B1("SELECT * FROM CharacterStroke WHERE CharId = ?");
                try {
                    cVarB1.g(1, j11);
                    int iM = com.bumptech.glide.g.m(cVarB1, "CharId");
                    int iM2 = com.bumptech.glide.g.m(cVarB1, HwCharacterDao.TABLENAME);
                    int iM3 = com.bumptech.glide.g.m(cVarB1, "Zhuyin");
                    int iM4 = com.bumptech.glide.g.m(cVarB1, "Pinyin");
                    int iM5 = com.bumptech.glide.g.m(cVarB1, "Luoma");
                    int iM6 = com.bumptech.glide.g.m(cVarB1, aYZzTH.thrdaPLWV);
                    int iM7 = com.bumptech.glide.g.m(cVarB1, "Version");
                    int iM8 = com.bumptech.glide.g.m(cVarB1, "TranCHN");
                    int iM9 = com.bumptech.glide.g.m(cVarB1, "TranTCHN");
                    int iM10 = com.bumptech.glide.g.m(cVarB1, "TranJPN");
                    int iM11 = com.bumptech.glide.g.m(cVarB1, "TranKRN");
                    int iM12 = com.bumptech.glide.g.m(cVarB1, "TranENG");
                    int iM13 = com.bumptech.glide.g.m(cVarB1, "TranSPN");
                    int iM14 = com.bumptech.glide.g.m(cVarB1, "TranFRN");
                    int iM15 = com.bumptech.glide.g.m(cVarB1, "TranDEN");
                    int iM16 = com.bumptech.glide.g.m(cVarB1, "TranITN");
                    int iM17 = com.bumptech.glide.g.m(cVarB1, "TranPTG");
                    int iM18 = com.bumptech.glide.g.m(cVarB1, "TranVTN");
                    int iM19 = com.bumptech.glide.g.m(cVarB1, "TranRUS");
                    int iM20 = com.bumptech.glide.g.m(cVarB1, "TranTUR");
                    int iM21 = com.bumptech.glide.g.m(cVarB1, "TranIDN");
                    int iM22 = com.bumptech.glide.g.m(cVarB1, "TranARA");
                    int iM23 = com.bumptech.glide.g.m(cVarB1, "TranPOL");
                    int iM24 = com.bumptech.glide.g.m(cVarB1, "TranTHAI");
                    int iM25 = com.bumptech.glide.g.m(cVarB1, "TranHINDI");
                    if (cVarB1.r1()) {
                        long j12 = cVarB1.getLong(iM);
                        zt.a aVarJ = re.g0.j(cVarB1.isNull(iM2) ? null : cVarB1.B0(iM2));
                        zt.a aVarJ2 = re.g0.j(cVarB1.isNull(iM3) ? null : cVarB1.B0(iM3));
                        zt.a aVarJ3 = re.g0.j(cVarB1.isNull(iM4) ? null : cVarB1.B0(iM4));
                        zt.a aVarJ4 = re.g0.j(cVarB1.isNull(iM5) ? null : cVarB1.B0(iM5));
                        zt.a aVarJ5 = re.g0.j(cVarB1.isNull(iM6) ? null : cVarB1.B0(iM6));
                        Integer numValueOf = cVarB1.isNull(iM7) ? null : Integer.valueOf((int) cVarB1.getLong(iM7));
                        zt.a aVarJ6 = re.g0.j(cVarB1.isNull(iM8) ? null : cVarB1.B0(iM8));
                        zt.a aVarJ7 = re.g0.j(cVarB1.isNull(iM9) ? null : cVarB1.B0(iM9));
                        zt.a aVarJ8 = re.g0.j(cVarB1.isNull(iM10) ? null : cVarB1.B0(iM10));
                        zt.a aVarJ9 = re.g0.j(cVarB1.isNull(iM11) ? null : cVarB1.B0(iM11));
                        zt.a aVarJ10 = re.g0.j(cVarB1.isNull(iM12) ? null : cVarB1.B0(iM12));
                        zt.a aVarJ11 = re.g0.j(cVarB1.isNull(iM13) ? null : cVarB1.B0(iM13));
                        zt.a aVarJ12 = re.g0.j(cVarB1.isNull(iM14) ? null : cVarB1.B0(iM14));
                        zt.a aVarJ13 = re.g0.j(cVarB1.isNull(iM15) ? null : cVarB1.B0(iM15));
                        zt.a aVarJ14 = re.g0.j(cVarB1.isNull(iM16) ? null : cVarB1.B0(iM16));
                        zt.a aVarJ15 = re.g0.j(cVarB1.isNull(iM17) ? null : cVarB1.B0(iM17));
                        zt.a aVarJ16 = re.g0.j(cVarB1.isNull(iM18) ? null : cVarB1.B0(iM18));
                        zt.a aVarJ17 = re.g0.j(cVarB1.isNull(iM19) ? null : cVarB1.B0(iM19));
                        zt.a aVarJ18 = re.g0.j(cVarB1.isNull(iM20) ? null : cVarB1.B0(iM20));
                        zt.a aVarJ19 = re.g0.j(cVarB1.isNull(iM21) ? null : cVarB1.B0(iM21));
                        zt.a aVarJ20 = re.g0.j(cVarB1.isNull(iM22) ? null : cVarB1.B0(iM22));
                        zt.a aVarJ21 = re.g0.j(cVarB1.isNull(iM23) ? null : cVarB1.B0(iM23));
                        zt.a aVarJ22 = re.g0.j(cVarB1.isNull(iM24) ? null : cVarB1.B0(iM24));
                        if (!cVarB1.isNull(iM25)) {
                            strB3 = cVarB1.B0(iM25);
                        }
                        characterStrokeEntity = new CharacterStrokeEntity(j12, aVarJ, aVarJ2, aVarJ3, aVarJ4, aVarJ5, numValueOf, aVarJ6, aVarJ7, aVarJ8, aVarJ9, aVarJ10, aVarJ11, aVarJ12, aVarJ13, aVarJ14, aVarJ15, aVarJ16, aVarJ17, aVarJ18, aVarJ19, aVarJ20, aVarJ21, aVarJ22, re.g0.j(strB3));
                    }
                    return characterStrokeEntity;
                } finally {
                    cVarB1.close();
                }
            case 1:
                ja.a _connection2 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection2, "_connection");
                ja.c cVarB2 = _connection2.B1("SELECT * FROM Model_Word_010 WHERE wordId = ?");
                try {
                    cVarB2.g(1, j11);
                    int iM26 = com.bumptech.glide.g.m(cVarB2, "Id");
                    int iM27 = com.bumptech.glide.g.m(cVarB2, str);
                    int iM28 = com.bumptech.glide.g.m(cVarB2, "ImageOptions");
                    int iM29 = com.bumptech.glide.g.m(cVarB2, "Answer");
                    ArrayList arrayList = new ArrayList();
                    while (cVarB2.r1()) {
                        arrayList.add(new ChineseToneExercise010Entity(cVarB2.getLong(iM26), cVarB2.getLong(iM27), re.g0.j(cVarB2.isNull(iM28) ? null : cVarB2.B0(iM28)), re.g0.j(cVarB2.isNull(iM29) ? null : cVarB2.B0(iM29))));
                        break;
                    }
                    return arrayList;
                } finally {
                    cVarB2.close();
                }
            case 2:
                ja.a _connection3 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection3, "_connection");
                ja.c cVarB3 = _connection3.B1("SELECT * FROM Model_Word_020 WHERE wordId = ?");
                try {
                    cVarB3.g(1, j11);
                    int iM30 = com.bumptech.glide.g.m(cVarB3, "Id");
                    int iM31 = com.bumptech.glide.g.m(cVarB3, str);
                    int iM32 = com.bumptech.glide.g.m(cVarB3, "Options");
                    int iM33 = com.bumptech.glide.g.m(cVarB3, "Answer");
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarB3.r1()) {
                        arrayList2.add(new ChineseToneExercise020Entity(cVarB3.getLong(iM30), cVarB3.getLong(iM31), re.g0.j(cVarB3.isNull(iM32) ? null : cVarB3.B0(iM32)), re.g0.j(cVarB3.isNull(iM33) ? null : cVarB3.B0(iM33))));
                        break;
                    }
                    return arrayList2;
                } finally {
                    cVarB3.close();
                }
            case 3:
                ja.a _connection4 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection4, "_connection");
                ja.c cVarB4 = _connection4.B1("SELECT * FROM Lesson WHERE lessonId = ?");
                try {
                    cVarB4.g(1, j11);
                    int iM34 = com.bumptech.glide.g.m(cVarB4, "LessonId");
                    int iM35 = com.bumptech.glide.g.m(cVarB4, "LessonName");
                    int iM36 = com.bumptech.glide.g.m(cVarB4, "Description");
                    int iM37 = com.bumptech.glide.g.m(cVarB4, "TDescription");
                    int iM38 = com.bumptech.glide.g.m(cVarB4, "WordList");
                    int iM39 = com.bumptech.glide.g.m(cVarB4, "SentenceList");
                    int iM40 = com.bumptech.glide.g.m(cVarB4, "CharacterList");
                    int iM41 = com.bumptech.glide.g.m(cVarB4, "RepeatRegex");
                    int iM42 = com.bumptech.glide.g.m(cVarB4, "LastRegex");
                    int iM43 = com.bumptech.glide.g.m(cVarB4, "NormalRegex");
                    int iM44 = com.bumptech.glide.g.m(cVarB4, "ChallengeRegex");
                    int iM45 = com.bumptech.glide.g.m(cVarB4, "LevelId");
                    int iM46 = com.bumptech.glide.g.m(cVarB4, "UnitId");
                    int iM47 = com.bumptech.glide.g.m(cVarB4, "SortIndex");
                    if (cVarB4.r1()) {
                        long j13 = cVarB4.getLong(iM34);
                        zt.a aVarJ23 = re.g0.j(cVarB4.isNull(iM35) ? null : cVarB4.B0(iM35));
                        zt.a aVarJ24 = re.g0.j(cVarB4.isNull(iM36) ? null : cVarB4.B0(iM36));
                        zt.a aVarJ25 = re.g0.j(cVarB4.isNull(iM37) ? null : cVarB4.B0(iM37));
                        zt.a aVarJ26 = re.g0.j(cVarB4.isNull(iM38) ? null : cVarB4.B0(iM38));
                        zt.a aVarJ27 = re.g0.j(cVarB4.isNull(iM39) ? null : cVarB4.B0(iM39));
                        zt.a aVarJ28 = re.g0.j(cVarB4.isNull(iM40) ? null : cVarB4.B0(iM40));
                        zt.a aVarJ29 = re.g0.j(cVarB4.isNull(iM41) ? null : cVarB4.B0(iM41));
                        zt.a aVarJ30 = re.g0.j(cVarB4.isNull(iM42) ? null : cVarB4.B0(iM42));
                        zt.a aVarJ31 = re.g0.j(cVarB4.isNull(iM43) ? null : cVarB4.B0(iM43));
                        if (!cVarB4.isNull(iM44)) {
                            strB2 = cVarB4.B0(iM44);
                        }
                        chineseToneLessonEntity = new ChineseToneLessonEntity(j13, aVarJ23, aVarJ24, aVarJ25, aVarJ26, aVarJ27, aVarJ28, aVarJ29, aVarJ30, aVarJ31, re.g0.j(strB2), cVarB4.getLong(iM45), cVarB4.getLong(iM46), (int) cVarB4.getLong(iM47));
                    }
                    return chineseToneLessonEntity;
                } finally {
                    cVarB4.close();
                }
            case 4:
                ja.a _connection5 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection5, "_connection");
                ja.c cVarB5 = _connection5.B1("SELECT * FROM Unit WHERE unitId = ?");
                try {
                    cVarB5.g(1, j11);
                    int iM48 = com.bumptech.glide.g.m(cVarB5, "UnitId");
                    int iM49 = com.bumptech.glide.g.m(cVarB5, "UnitName");
                    int iM50 = com.bumptech.glide.g.m(cVarB5, "Description");
                    int iM51 = com.bumptech.glide.g.m(cVarB5, "LessonList");
                    int iM52 = com.bumptech.glide.g.m(cVarB5, "SortIndex");
                    int iM53 = com.bumptech.glide.g.m(cVarB5, "LevelId");
                    int iM54 = com.bumptech.glide.g.m(cVarB5, "iconResSuffix");
                    if (cVarB5.r1()) {
                        long j14 = cVarB5.getLong(iM48);
                        zt.a aVarJ32 = re.g0.j(cVarB5.isNull(iM49) ? null : cVarB5.B0(iM49));
                        zt.a aVarJ33 = re.g0.j(cVarB5.isNull(iM50) ? null : cVarB5.B0(iM50));
                        zt.a aVarJ34 = re.g0.j(cVarB5.isNull(iM51) ? null : cVarB5.B0(iM51));
                        int i12 = (int) cVarB5.getLong(iM52);
                        long j15 = cVarB5.getLong(iM53);
                        if (!cVarB5.isNull(iM54)) {
                            strB1 = cVarB5.B0(iM54);
                        }
                        chineseToneUnitEntity = new ChineseToneUnitEntity(j14, aVarJ32, aVarJ33, aVarJ34, i12, j15, re.g0.j(strB1));
                    }
                    return chineseToneUnitEntity;
                } finally {
                    cVarB5.close();
                }
            case 5:
                ja.a _connection6 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection6, "_connection");
                ja.c cVarB6 = _connection6.B1("SELECT * FROM ToneWord WHERE wordId = ?");
                try {
                    cVarB6.g(1, j11);
                    int iM55 = com.bumptech.glide.g.m(cVarB6, str);
                    int iM56 = com.bumptech.glide.g.m(cVarB6, WordDao.TABLENAME);
                    int iM57 = com.bumptech.glide.g.m(cVarB6, HwCharacterDao.TABLENAME);
                    int iM58 = com.bumptech.glide.g.m(cVarB6, "ShengMu");
                    int iM59 = com.bumptech.glide.g.m(cVarB6, "YunMu");
                    int iM60 = com.bumptech.glide.g.m(cVarB6, "QingSheng");
                    int iM61 = com.bumptech.glide.g.m(cVarB6, "ShengDiao");
                    int iM62 = com.bumptech.glide.g.m(cVarB6, "Audio");
                    int iM63 = com.bumptech.glide.g.m(cVarB6, "Type");
                    if (cVarB6.r1()) {
                        long j16 = cVarB6.getLong(iM55);
                        zt.a aVarJ35 = re.g0.j(cVarB6.isNull(iM56) ? null : cVarB6.B0(iM56));
                        zt.a aVarJ36 = re.g0.j(cVarB6.isNull(iM57) ? null : cVarB6.B0(iM57));
                        zt.a aVarJ37 = re.g0.j(cVarB6.isNull(iM58) ? null : cVarB6.B0(iM58));
                        zt.a aVarJ38 = re.g0.j(cVarB6.isNull(iM59) ? null : cVarB6.B0(iM59));
                        zt.a aVarJ39 = re.g0.j(cVarB6.isNull(iM60) ? null : cVarB6.B0(iM60));
                        zt.a aVarJ40 = re.g0.j(cVarB6.isNull(iM61) ? null : cVarB6.B0(iM61));
                        zt.a aVarJ41 = re.g0.j(cVarB6.isNull(iM62) ? null : cVarB6.B0(iM62));
                        if (!cVarB6.isNull(iM63)) {
                            strB0 = cVarB6.B0(iM63);
                        }
                        chineseToneWordEntity = new ChineseToneWordEntity(j16, aVarJ35, aVarJ36, aVarJ37, aVarJ38, aVarJ39, aVarJ40, aVarJ41, re.g0.j(strB0));
                    }
                    return chineseToneWordEntity;
                } finally {
                    cVarB6.close();
                }
            case 6:
                i2.d drawBehind = (i2.d) obj;
                kotlin.jvm.internal.m.f(drawBehind, "$this$drawBehind");
                drawBehind.f0(this.f3054b, (((long) Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.d() & 4294967295L)))) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.d() & 4294967295L)))) & 4294967295L), (480 & 8) != 0 ? 0.0f : drawBehind.e0(2), (480 & 16) != 0 ? 0 : 1, (480 & 32) != 0 ? null : null, 3);
                return b0Var;
            case 7:
                i2.d Canvas = (i2.d) obj;
                kotlin.jvm.internal.m.f(Canvas, "$this$Canvas");
                float f5 = 2;
                Canvas.f0(this.f3054b, (((long) Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.d() & 4294967295L)) / 2.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.d() & 4294967295L)) / 2.0f)) & 4294967295L), (480 & 8) != 0 ? 0.0f : Canvas.e0(1), (480 & 16) != 0 ? 0 : 1, (480 & 32) != 0 ? null : new g2.l(new DashPathEffect(new float[]{Canvas.e0(f5), Canvas.e0(f5)}, CropImageView.DEFAULT_ASPECT_RATIO)), 3);
                return b0Var;
            case 8:
                d2.e drawWithCache = (d2.e) obj;
                kotlin.jvm.internal.m.f(drawWithCache, "$this$drawWithCache");
                return drawWithCache.a(new o(j11, 11));
            case 9:
                d2.e drawWithCache2 = (d2.e) obj;
                kotlin.jvm.internal.m.f(drawWithCache2, "$this$drawWithCache");
                return drawWithCache2.a(new o2(drawWithCache2.getDensity() * 8, drawWithCache2.getDensity() * 3, this.f3054b, drawWithCache2.getDensity() * 2, 1));
            case 10:
                d2.e drawWithCache3 = (d2.e) obj;
                kotlin.jvm.internal.m.f(drawWithCache3, "$this$drawWithCache");
                float f11 = 4;
                return drawWithCache3.a(new o2(drawWithCache3.getDensity() * f11, drawWithCache3.getDensity() * f11, this.f3054b, drawWithCache3.getDensity() * 2, 2));
            case 11:
                i2.d dVar = (i2.d) obj;
                kotlin.jvm.internal.m.f(dVar, scqhIrGXy.JfGylDlcreeSse);
                long jC = g2.x.c(j11, 0.8f);
                float fE0 = dVar.e0(4);
                i2.d.y(dVar, jC, 0L, 0L, (((long) Float.floatToRawIntBits(fE0)) << 32) | (((long) Float.floatToRawIntBits(fE0)) & 4294967295L), null, 246);
                return b0Var;
            case 12:
                return a(obj);
            case 13:
                return c(obj);
            case 14:
                return d(obj);
            case 15:
                l1.e eVar = (l1.e) obj;
                fz.c cVar = eVar.f39283b;
                if (cVar != null && (mVar = eVar.f39282a) != null) {
                    try {
                        objL = cVar.invoke(Long.valueOf(j11));
                    } catch (Throwable th2) {
                        objL = com.bumptech.glide.e.l(th2);
                    }
                    mVar.resumeWith(objL);
                    break;
                }
                return b0Var;
            case 16:
                return e(obj);
            case 17:
                return h(obj);
            case 18:
                return j(obj);
            case 19:
                return k(obj);
            case 20:
                return l(obj);
            case 21:
                return m(obj);
            case 22:
                return n(obj);
            case 23:
                return o(obj);
            default:
                i2.d drawBehind2 = (i2.d) obj;
                kotlin.jvm.internal.m.f(drawBehind2, "$this$drawBehind");
                g2.k kVarA = g2.o.a();
                kVarA.g(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
                kVarA.f(Float.intBitsToFloat((int) (drawBehind2.d() >> 32)), CropImageView.DEFAULT_ASPECT_RATIO);
                kVarA.f(Float.intBitsToFloat((int) (drawBehind2.d() >> 32)), Float.intBitsToFloat((int) (drawBehind2.d() & 4294967295L)) * 0.4f);
                kVarA.i(Float.intBitsToFloat((int) (drawBehind2.d() >> 32)) / 2, Float.intBitsToFloat((int) (drawBehind2.d() & 4294967295L)) * 0.6f, CropImageView.DEFAULT_ASPECT_RATIO, Float.intBitsToFloat((int) (drawBehind2.d() & 4294967295L)) * 0.4f);
                kVarA.f(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
                long j17 = this.f3054b;
                i2.d.o0(drawBehind2, kVarA, j17, 0.45f, null, 56);
                float f12 = 14;
                i2.d.y(drawBehind2, j17, (((long) Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO)) << 32) | (((long) Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind2.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind2.d() & 4294967295L)))) & 4294967295L), (((long) Float.floatToRawIntBits(drawBehind2.e0(f12))) << 32) | (((long) Float.floatToRawIntBits(drawBehind2.e0(f12))) & 4294967295L), new i2.h(drawBehind2.e0(3), CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, null, 30), 192);
                return b0Var;
        }
    }
}
