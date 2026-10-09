package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class TravelCategoryDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "TravelCategory";
    private final kj.a ArabicConverter;
    private final kj.a CategoryConverter;
    private final kj.a EnglishConverter;
    private final kj.a FrenchConverter;
    private final kj.a GermanConverter;
    private final kj.a IndonesianConverter;
    private final kj.a ItalianConverter;
    private final kj.a JapaneseConverter;
    private final kj.a KoreanConverter;
    private final kj.a PolishConverter;
    private final kj.a PortugueseConverter;
    private final kj.a RussianConverter;
    private final kj.a SChineseConverter;
    private final kj.a SpanishConverter;
    private final kj.a TChineseConverter;
    private final kj.a ThaiConverter;
    private final kj.a TurkishConverter;
    private final kj.a VietnameseConverter;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d CategoryId = new d(0, Long.TYPE, "CategoryId", true, "CategoryId");
        public static final d Category = new d(1, String.class, "Category", false, "Category");
        public static final d English = new d(2, String.class, "English", false, "English");
        public static final d SChinese = new d(3, String.class, "SChinese", false, "SChinese");
        public static final d TChinese = new d(4, String.class, "TChinese", false, "TChinese");
        public static final d Japanese = new d(5, String.class, "Japanese", false, "Japanese");
        public static final d Korean = new d(6, String.class, "Korean", false, "Korean");
        public static final d Spanish = new d(7, String.class, "Spanish", false, "Spanish");
        public static final d French = new d(8, String.class, "French", false, "French");
        public static final d German = new d(9, String.class, "German", false, "German");
        public static final d Italian = new d(10, String.class, "Italian", false, "Italian");
        public static final d Portuguese = new d(11, String.class, "Portuguese", false, "Portuguese");
        public static final d Vietnamese = new d(12, String.class, "Vietnamese", false, "Vietnamese");
        public static final d Russian = new d(13, String.class, "Russian", false, "Russian");
        public static final d Thai = new d(14, String.class, "Thai", false, "Thai");
        public static final d Indonesian = new d(15, String.class, "Indonesian", false, "Indonesian");
        public static final d Arabic = new d(16, String.class, "Arabic", false, "Arabic");
        public static final d Polish = new d(17, String.class, "Polish", false, "Polish");
        public static final d Turkish = new d(18, String.class, "Turkish", false, "Turkish");
    }

    public TravelCategoryDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
        this.CategoryConverter = new kj.a();
        this.EnglishConverter = new kj.a();
        this.SChineseConverter = new kj.a();
        this.TChineseConverter = new kj.a();
        this.JapaneseConverter = new kj.a();
        this.KoreanConverter = new kj.a();
        this.SpanishConverter = new kj.a();
        this.FrenchConverter = new kj.a();
        this.GermanConverter = new kj.a();
        this.ItalianConverter = new kj.a();
        this.PortugueseConverter = new kj.a();
        this.VietnameseConverter = new kj.a();
        this.RussianConverter = new kj.a();
        this.ThaiConverter = new kj.a();
        this.IndonesianConverter = new kj.a();
        this.ArabicConverter = new kj.a();
        this.PolishConverter = new kj.a();
        this.TurkishConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(TravelCategory travelCategory) {
        if (travelCategory != null) {
            return Long.valueOf(travelCategory.getCategoryId());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(TravelCategory travelCategory) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.a
    public Long readKey(Cursor cursor, int i11) {
        return Long.valueOf(cursor.getLong(i11));
    }

    @Override // org.greenrobot.greendao.a
    public final Long updateKeyAfterInsert(TravelCategory travelCategory, long j11) {
        travelCategory.setCategoryId(j11);
        return Long.valueOf(j11);
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, TravelCategory travelCategory) {
        dVar.f();
        dVar.g(1, travelCategory.getCategoryId());
        String category = travelCategory.getCategory();
        if (category != null) {
            com.google.android.material.datepicker.d.A(this.CategoryConverter, category, dVar, 2);
        }
        String english = travelCategory.getEnglish();
        if (english != null) {
            com.google.android.material.datepicker.d.A(this.EnglishConverter, english, dVar, 3);
        }
        String sChinese = travelCategory.getSChinese();
        if (sChinese != null) {
            com.google.android.material.datepicker.d.A(this.SChineseConverter, sChinese, dVar, 4);
        }
        String tChinese = travelCategory.getTChinese();
        if (tChinese != null) {
            com.google.android.material.datepicker.d.A(this.TChineseConverter, tChinese, dVar, 5);
        }
        String japanese = travelCategory.getJapanese();
        if (japanese != null) {
            com.google.android.material.datepicker.d.A(this.JapaneseConverter, japanese, dVar, 6);
        }
        String korean = travelCategory.getKorean();
        if (korean != null) {
            com.google.android.material.datepicker.d.A(this.KoreanConverter, korean, dVar, 7);
        }
        String spanish = travelCategory.getSpanish();
        if (spanish != null) {
            com.google.android.material.datepicker.d.A(this.SpanishConverter, spanish, dVar, 8);
        }
        String french = travelCategory.getFrench();
        if (french != null) {
            com.google.android.material.datepicker.d.A(this.FrenchConverter, french, dVar, 9);
        }
        String german = travelCategory.getGerman();
        if (german != null) {
            com.google.android.material.datepicker.d.A(this.GermanConverter, german, dVar, 10);
        }
        String italian = travelCategory.getItalian();
        if (italian != null) {
            com.google.android.material.datepicker.d.A(this.ItalianConverter, italian, dVar, 11);
        }
        String portuguese = travelCategory.getPortuguese();
        if (portuguese != null) {
            com.google.android.material.datepicker.d.A(this.PortugueseConverter, portuguese, dVar, 12);
        }
        String vietnamese = travelCategory.getVietnamese();
        if (vietnamese != null) {
            com.google.android.material.datepicker.d.A(this.VietnameseConverter, vietnamese, dVar, 13);
        }
        String russian = travelCategory.getRussian();
        if (russian != null) {
            com.google.android.material.datepicker.d.A(this.RussianConverter, russian, dVar, 14);
        }
        String thai = travelCategory.getThai();
        if (thai != null) {
            com.google.android.material.datepicker.d.A(this.ThaiConverter, thai, dVar, 15);
        }
        String indonesian = travelCategory.getIndonesian();
        if (indonesian != null) {
            com.google.android.material.datepicker.d.A(this.IndonesianConverter, indonesian, dVar, 16);
        }
        String arabic = travelCategory.getArabic();
        if (arabic != null) {
            com.google.android.material.datepicker.d.A(this.ArabicConverter, arabic, dVar, 17);
        }
        String polish = travelCategory.getPolish();
        if (polish != null) {
            com.google.android.material.datepicker.d.A(this.PolishConverter, polish, dVar, 18);
        }
        String turkish = travelCategory.getTurkish();
        if (turkish != null) {
            com.google.android.material.datepicker.d.A(this.TurkishConverter, turkish, dVar, 19);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 ??, still in use, count: 1, list:
          (r2v0 ?? I:??[OBJECT, ARRAY]) from 0x0182: RETURN (r2v0 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @Override // org.greenrobot.greendao.a
    public com.lingo.lingoskill.object.TravelCategory readEntity(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 ??, still in use, count: 1, list:
          (r2v0 ?? I:??[OBJECT, ARRAY]) from 0x0182: RETURN (r2v0 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r26v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public TravelCategoryDao(j10.a aVar) {
        super(aVar, null);
        this.CategoryConverter = new kj.a();
        this.EnglishConverter = new kj.a();
        this.SChineseConverter = new kj.a();
        this.TChineseConverter = new kj.a();
        this.JapaneseConverter = new kj.a();
        this.KoreanConverter = new kj.a();
        this.SpanishConverter = new kj.a();
        this.FrenchConverter = new kj.a();
        this.GermanConverter = new kj.a();
        this.ItalianConverter = new kj.a();
        this.PortugueseConverter = new kj.a();
        this.VietnameseConverter = new kj.a();
        this.RussianConverter = new kj.a();
        this.ThaiConverter = new kj.a();
        this.IndonesianConverter = new kj.a();
        this.ArabicConverter = new kj.a();
        this.PolishConverter = new kj.a();
        this.TurkishConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, TravelCategory travelCategory, int i11) {
        travelCategory.setCategoryId(cursor.getLong(i11));
        int i12 = i11 + 1;
        travelCategory.setCategory(cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.CategoryConverter));
        int i13 = i11 + 2;
        travelCategory.setEnglish(cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.EnglishConverter));
        int i14 = i11 + 3;
        travelCategory.setSChinese(cursor.isNull(i14) ? null : com.google.android.material.datepicker.d.j(cursor, i14, this.SChineseConverter));
        int i15 = i11 + 4;
        travelCategory.setTChinese(cursor.isNull(i15) ? null : com.google.android.material.datepicker.d.j(cursor, i15, this.TChineseConverter));
        int i16 = i11 + 5;
        travelCategory.setJapanese(cursor.isNull(i16) ? null : com.google.android.material.datepicker.d.j(cursor, i16, this.JapaneseConverter));
        int i17 = i11 + 6;
        travelCategory.setKorean(cursor.isNull(i17) ? null : com.google.android.material.datepicker.d.j(cursor, i17, this.KoreanConverter));
        int i18 = i11 + 7;
        travelCategory.setSpanish(cursor.isNull(i18) ? null : com.google.android.material.datepicker.d.j(cursor, i18, this.SpanishConverter));
        int i19 = i11 + 8;
        travelCategory.setFrench(cursor.isNull(i19) ? null : com.google.android.material.datepicker.d.j(cursor, i19, this.FrenchConverter));
        int i21 = i11 + 9;
        travelCategory.setGerman(cursor.isNull(i21) ? null : com.google.android.material.datepicker.d.j(cursor, i21, this.GermanConverter));
        int i22 = i11 + 10;
        travelCategory.setItalian(cursor.isNull(i22) ? null : com.google.android.material.datepicker.d.j(cursor, i22, this.ItalianConverter));
        int i23 = i11 + 11;
        travelCategory.setPortuguese(cursor.isNull(i23) ? null : com.google.android.material.datepicker.d.j(cursor, i23, this.PortugueseConverter));
        int i24 = i11 + 12;
        travelCategory.setVietnamese(cursor.isNull(i24) ? null : com.google.android.material.datepicker.d.j(cursor, i24, this.VietnameseConverter));
        int i25 = i11 + 13;
        travelCategory.setRussian(cursor.isNull(i25) ? null : com.google.android.material.datepicker.d.j(cursor, i25, this.RussianConverter));
        int i26 = i11 + 14;
        travelCategory.setThai(cursor.isNull(i26) ? null : com.google.android.material.datepicker.d.j(cursor, i26, this.ThaiConverter));
        int i27 = i11 + 15;
        travelCategory.setIndonesian(cursor.isNull(i27) ? null : com.google.android.material.datepicker.d.j(cursor, i27, this.IndonesianConverter));
        int i28 = i11 + 16;
        travelCategory.setArabic(cursor.isNull(i28) ? null : com.google.android.material.datepicker.d.j(cursor, i28, this.ArabicConverter));
        int i29 = i11 + 17;
        travelCategory.setPolish(cursor.isNull(i29) ? null : com.google.android.material.datepicker.d.j(cursor, i29, this.PolishConverter));
        int i30 = i11 + 18;
        travelCategory.setTurkish(cursor.isNull(i30) ? null : com.google.android.material.datepicker.d.j(cursor, i30, this.TurkishConverter));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, TravelCategory travelCategory) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, travelCategory.getCategoryId());
        String category = travelCategory.getCategory();
        if (category != null) {
            com.google.android.material.datepicker.d.z(this.CategoryConverter, category, sQLiteStatement, 2);
        }
        String english = travelCategory.getEnglish();
        if (english != null) {
            com.google.android.material.datepicker.d.z(this.EnglishConverter, english, sQLiteStatement, 3);
        }
        String sChinese = travelCategory.getSChinese();
        if (sChinese != null) {
            com.google.android.material.datepicker.d.z(this.SChineseConverter, sChinese, sQLiteStatement, 4);
        }
        String tChinese = travelCategory.getTChinese();
        if (tChinese != null) {
            com.google.android.material.datepicker.d.z(this.TChineseConverter, tChinese, sQLiteStatement, 5);
        }
        String japanese = travelCategory.getJapanese();
        if (japanese != null) {
            com.google.android.material.datepicker.d.z(this.JapaneseConverter, japanese, sQLiteStatement, 6);
        }
        String korean = travelCategory.getKorean();
        if (korean != null) {
            com.google.android.material.datepicker.d.z(this.KoreanConverter, korean, sQLiteStatement, 7);
        }
        String spanish = travelCategory.getSpanish();
        if (spanish != null) {
            com.google.android.material.datepicker.d.z(this.SpanishConverter, spanish, sQLiteStatement, 8);
        }
        String french = travelCategory.getFrench();
        if (french != null) {
            com.google.android.material.datepicker.d.z(this.FrenchConverter, french, sQLiteStatement, 9);
        }
        String german = travelCategory.getGerman();
        if (german != null) {
            com.google.android.material.datepicker.d.z(this.GermanConverter, german, sQLiteStatement, 10);
        }
        String italian = travelCategory.getItalian();
        if (italian != null) {
            com.google.android.material.datepicker.d.z(this.ItalianConverter, italian, sQLiteStatement, 11);
        }
        String portuguese = travelCategory.getPortuguese();
        if (portuguese != null) {
            com.google.android.material.datepicker.d.z(this.PortugueseConverter, portuguese, sQLiteStatement, 12);
        }
        String vietnamese = travelCategory.getVietnamese();
        if (vietnamese != null) {
            com.google.android.material.datepicker.d.z(this.VietnameseConverter, vietnamese, sQLiteStatement, 13);
        }
        String russian = travelCategory.getRussian();
        if (russian != null) {
            com.google.android.material.datepicker.d.z(this.RussianConverter, russian, sQLiteStatement, 14);
        }
        String thai = travelCategory.getThai();
        if (thai != null) {
            com.google.android.material.datepicker.d.z(this.ThaiConverter, thai, sQLiteStatement, 15);
        }
        String indonesian = travelCategory.getIndonesian();
        if (indonesian != null) {
            com.google.android.material.datepicker.d.z(this.IndonesianConverter, indonesian, sQLiteStatement, 16);
        }
        String arabic = travelCategory.getArabic();
        if (arabic != null) {
            com.google.android.material.datepicker.d.z(this.ArabicConverter, arabic, sQLiteStatement, 17);
        }
        String polish = travelCategory.getPolish();
        if (polish != null) {
            com.google.android.material.datepicker.d.z(this.PolishConverter, polish, sQLiteStatement, 18);
        }
        String turkish = travelCategory.getTurkish();
        if (turkish != null) {
            com.google.android.material.datepicker.d.z(this.TurkishConverter, turkish, sQLiteStatement, 19);
        }
    }
}
