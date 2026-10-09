package com.lingo.lingoskill.object;

import am.rVFB.LwKl;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class TravelPhraseDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "TravelPhrase";
    private final kj.a ArabicConverter;
    private final kj.a EnglishConverter;
    private final kj.a FrenchConverter;
    private final kj.a GermanConverter;
    private final kj.a IndonesianConverter;
    private final kj.a ItalianConverter;
    private final kj.a JapaneseConverter;
    private final kj.a KoreanConverter;
    private final kj.a PhraseConverter;
    private final kj.a PhraseLuomaConverter;
    private final kj.a PhraseZhuyinConverter;
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
        public static final d Arabic;
        public static final d CID;
        public static final d English;
        public static final d French;
        public static final d German;
        public static final d ID;
        public static final d Indonesian;
        public static final d Italian;
        public static final d Japanese;
        public static final d Korean;
        public static final d Phrase;
        public static final d PhraseLuoma;
        public static final d PhraseZhuyin;
        public static final d Polish;
        public static final d Portuguese;
        public static final d Russian;
        public static final d SChinese;
        public static final d Spanish;
        public static final d TChinese;
        public static final d Thai;
        public static final d Turkish;
        public static final d Vietnamese;

        static {
            Class cls = Long.TYPE;
            ID = new d(0, cls, "ID", true, "ID");
            CID = new d(1, cls, "CID", false, "CID");
            Phrase = new d(2, String.class, PhraseDao.TABLENAME, false, PhraseDao.TABLENAME);
            PhraseZhuyin = new d(3, String.class, "PhraseZhuyin", false, "PhraseZhuyin");
            PhraseLuoma = new d(4, String.class, "PhraseLuoma", false, "PhraseLuoma");
            English = new d(5, String.class, "English", false, "English");
            SChinese = new d(6, String.class, "SChinese", false, "SChinese");
            TChinese = new d(7, String.class, "TChinese", false, "TChinese");
            Japanese = new d(8, String.class, "Japanese", false, "Japanese");
            Korean = new d(9, String.class, "Korean", false, "Korean");
            Spanish = new d(10, String.class, "Spanish", false, LwKl.gzsXqaJS);
            French = new d(11, String.class, "French", false, "French");
            German = new d(12, String.class, "German", false, "German");
            Italian = new d(13, String.class, "Italian", false, "Italian");
            Portuguese = new d(14, String.class, "Portuguese", false, "Portuguese");
            Vietnamese = new d(15, String.class, "Vietnamese", false, "Vietnamese");
            Russian = new d(16, String.class, "Russian", false, "Russian");
            Thai = new d(17, String.class, "Thai", false, "Thai");
            Indonesian = new d(18, String.class, "Indonesian", false, "Indonesian");
            Arabic = new d(19, String.class, "Arabic", false, "Arabic");
            Polish = new d(20, String.class, "Polish", false, "Polish");
            Turkish = new d(21, String.class, "Turkish", false, "Turkish");
        }
    }

    public TravelPhraseDao(j10.a aVar) {
        super(aVar, null);
        this.PhraseConverter = new kj.a();
        this.PhraseZhuyinConverter = new kj.a();
        this.PhraseLuomaConverter = new kj.a();
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
    public Long getKey(TravelPhrase travelPhrase) {
        if (travelPhrase != null) {
            return Long.valueOf(travelPhrase.getID());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(TravelPhrase travelPhrase) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.a
    public Long readKey(Cursor cursor, int i11) {
        return Long.valueOf(cursor.getLong(i11));
    }

    @Override // org.greenrobot.greendao.a
    public final Long updateKeyAfterInsert(TravelPhrase travelPhrase, long j11) {
        travelPhrase.setID(j11);
        return Long.valueOf(j11);
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, TravelPhrase travelPhrase) {
        dVar.f();
        dVar.g(1, travelPhrase.getID());
        dVar.g(2, travelPhrase.getCID());
        String phrase = travelPhrase.getPhrase();
        if (phrase != null) {
            com.google.android.material.datepicker.d.A(this.PhraseConverter, phrase, dVar, 3);
        }
        String phraseZhuyin = travelPhrase.getPhraseZhuyin();
        if (phraseZhuyin != null) {
            com.google.android.material.datepicker.d.A(this.PhraseZhuyinConverter, phraseZhuyin, dVar, 4);
        }
        String phraseLuoma = travelPhrase.getPhraseLuoma();
        if (phraseLuoma != null) {
            com.google.android.material.datepicker.d.A(this.PhraseLuomaConverter, phraseLuoma, dVar, 5);
        }
        String english = travelPhrase.getEnglish();
        if (english != null) {
            com.google.android.material.datepicker.d.A(this.EnglishConverter, english, dVar, 6);
        }
        String sChinese = travelPhrase.getSChinese();
        if (sChinese != null) {
            com.google.android.material.datepicker.d.A(this.SChineseConverter, sChinese, dVar, 7);
        }
        String tChinese = travelPhrase.getTChinese();
        if (tChinese != null) {
            com.google.android.material.datepicker.d.A(this.TChineseConverter, tChinese, dVar, 8);
        }
        String japanese = travelPhrase.getJapanese();
        if (japanese != null) {
            com.google.android.material.datepicker.d.A(this.JapaneseConverter, japanese, dVar, 9);
        }
        String korean = travelPhrase.getKorean();
        if (korean != null) {
            com.google.android.material.datepicker.d.A(this.KoreanConverter, korean, dVar, 10);
        }
        String spanish = travelPhrase.getSpanish();
        if (spanish != null) {
            com.google.android.material.datepicker.d.A(this.SpanishConverter, spanish, dVar, 11);
        }
        String french = travelPhrase.getFrench();
        if (french != null) {
            com.google.android.material.datepicker.d.A(this.FrenchConverter, french, dVar, 12);
        }
        String german = travelPhrase.getGerman();
        if (german != null) {
            com.google.android.material.datepicker.d.A(this.GermanConverter, german, dVar, 13);
        }
        String italian = travelPhrase.getItalian();
        if (italian != null) {
            com.google.android.material.datepicker.d.A(this.ItalianConverter, italian, dVar, 14);
        }
        String portuguese = travelPhrase.getPortuguese();
        if (portuguese != null) {
            com.google.android.material.datepicker.d.A(this.PortugueseConverter, portuguese, dVar, 15);
        }
        String vietnamese = travelPhrase.getVietnamese();
        if (vietnamese != null) {
            com.google.android.material.datepicker.d.A(this.VietnameseConverter, vietnamese, dVar, 16);
        }
        String russian = travelPhrase.getRussian();
        if (russian != null) {
            com.google.android.material.datepicker.d.A(this.RussianConverter, russian, dVar, 17);
        }
        String thai = travelPhrase.getThai();
        if (thai != null) {
            com.google.android.material.datepicker.d.A(this.ThaiConverter, thai, dVar, 18);
        }
        String indonesian = travelPhrase.getIndonesian();
        if (indonesian != null) {
            com.google.android.material.datepicker.d.A(this.IndonesianConverter, indonesian, dVar, 19);
        }
        String arabic = travelPhrase.getArabic();
        if (arabic != null) {
            com.google.android.material.datepicker.d.A(this.ArabicConverter, arabic, dVar, 20);
        }
        String polish = travelPhrase.getPolish();
        if (polish != null) {
            com.google.android.material.datepicker.d.A(this.PolishConverter, polish, dVar, 21);
        }
        String turkish = travelPhrase.getTurkish();
        if (turkish != null) {
            com.google.android.material.datepicker.d.A(this.TurkishConverter, turkish, dVar, 22);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 ??, still in use, count: 1, list:
          (r2v0 ?? I:??[OBJECT, ARRAY]) from 0x01c6: RETURN (r2v0 ?? I:??[OBJECT, ARRAY])
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
    public com.lingo.lingoskill.object.TravelPhrase readEntity(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 ??, still in use, count: 1, list:
          (r2v0 ?? I:??[OBJECT, ARRAY]) from 0x01c6: RETURN (r2v0 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r30v0 ??
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

    public TravelPhraseDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
        this.PhraseConverter = new kj.a();
        this.PhraseZhuyinConverter = new kj.a();
        this.PhraseLuomaConverter = new kj.a();
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
    public void readEntity(Cursor cursor, TravelPhrase travelPhrase, int i11) {
        travelPhrase.setID(cursor.getLong(i11));
        travelPhrase.setCID(cursor.getLong(i11 + 1));
        int i12 = i11 + 2;
        travelPhrase.setPhrase(cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.PhraseConverter));
        int i13 = i11 + 3;
        travelPhrase.setPhraseZhuyin(cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.PhraseZhuyinConverter));
        int i14 = i11 + 4;
        travelPhrase.setPhraseLuoma(cursor.isNull(i14) ? null : com.google.android.material.datepicker.d.j(cursor, i14, this.PhraseLuomaConverter));
        int i15 = i11 + 5;
        travelPhrase.setEnglish(cursor.isNull(i15) ? null : com.google.android.material.datepicker.d.j(cursor, i15, this.EnglishConverter));
        int i16 = i11 + 6;
        travelPhrase.setSChinese(cursor.isNull(i16) ? null : com.google.android.material.datepicker.d.j(cursor, i16, this.SChineseConverter));
        int i17 = i11 + 7;
        travelPhrase.setTChinese(cursor.isNull(i17) ? null : com.google.android.material.datepicker.d.j(cursor, i17, this.TChineseConverter));
        int i18 = i11 + 8;
        travelPhrase.setJapanese(cursor.isNull(i18) ? null : com.google.android.material.datepicker.d.j(cursor, i18, this.JapaneseConverter));
        int i19 = i11 + 9;
        travelPhrase.setKorean(cursor.isNull(i19) ? null : com.google.android.material.datepicker.d.j(cursor, i19, this.KoreanConverter));
        int i21 = i11 + 10;
        travelPhrase.setSpanish(cursor.isNull(i21) ? null : com.google.android.material.datepicker.d.j(cursor, i21, this.SpanishConverter));
        int i22 = i11 + 11;
        travelPhrase.setFrench(cursor.isNull(i22) ? null : com.google.android.material.datepicker.d.j(cursor, i22, this.FrenchConverter));
        int i23 = i11 + 12;
        travelPhrase.setGerman(cursor.isNull(i23) ? null : com.google.android.material.datepicker.d.j(cursor, i23, this.GermanConverter));
        int i24 = i11 + 13;
        travelPhrase.setItalian(cursor.isNull(i24) ? null : com.google.android.material.datepicker.d.j(cursor, i24, this.ItalianConverter));
        int i25 = i11 + 14;
        travelPhrase.setPortuguese(cursor.isNull(i25) ? null : com.google.android.material.datepicker.d.j(cursor, i25, this.PortugueseConverter));
        int i26 = i11 + 15;
        travelPhrase.setVietnamese(cursor.isNull(i26) ? null : com.google.android.material.datepicker.d.j(cursor, i26, this.VietnameseConverter));
        int i27 = i11 + 16;
        travelPhrase.setRussian(cursor.isNull(i27) ? null : com.google.android.material.datepicker.d.j(cursor, i27, this.RussianConverter));
        int i28 = i11 + 17;
        travelPhrase.setThai(cursor.isNull(i28) ? null : com.google.android.material.datepicker.d.j(cursor, i28, this.ThaiConverter));
        int i29 = i11 + 18;
        travelPhrase.setIndonesian(cursor.isNull(i29) ? null : com.google.android.material.datepicker.d.j(cursor, i29, this.IndonesianConverter));
        int i30 = i11 + 19;
        travelPhrase.setArabic(cursor.isNull(i30) ? null : com.google.android.material.datepicker.d.j(cursor, i30, this.ArabicConverter));
        int i31 = i11 + 20;
        travelPhrase.setPolish(cursor.isNull(i31) ? null : com.google.android.material.datepicker.d.j(cursor, i31, this.PolishConverter));
        int i32 = i11 + 21;
        travelPhrase.setTurkish(cursor.isNull(i32) ? null : com.google.android.material.datepicker.d.j(cursor, i32, this.TurkishConverter));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, TravelPhrase travelPhrase) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, travelPhrase.getID());
        sQLiteStatement.bindLong(2, travelPhrase.getCID());
        String phrase = travelPhrase.getPhrase();
        if (phrase != null) {
            com.google.android.material.datepicker.d.z(this.PhraseConverter, phrase, sQLiteStatement, 3);
        }
        String phraseZhuyin = travelPhrase.getPhraseZhuyin();
        if (phraseZhuyin != null) {
            com.google.android.material.datepicker.d.z(this.PhraseZhuyinConverter, phraseZhuyin, sQLiteStatement, 4);
        }
        String phraseLuoma = travelPhrase.getPhraseLuoma();
        if (phraseLuoma != null) {
            com.google.android.material.datepicker.d.z(this.PhraseLuomaConverter, phraseLuoma, sQLiteStatement, 5);
        }
        String english = travelPhrase.getEnglish();
        if (english != null) {
            com.google.android.material.datepicker.d.z(this.EnglishConverter, english, sQLiteStatement, 6);
        }
        String sChinese = travelPhrase.getSChinese();
        if (sChinese != null) {
            com.google.android.material.datepicker.d.z(this.SChineseConverter, sChinese, sQLiteStatement, 7);
        }
        String tChinese = travelPhrase.getTChinese();
        if (tChinese != null) {
            com.google.android.material.datepicker.d.z(this.TChineseConverter, tChinese, sQLiteStatement, 8);
        }
        String japanese = travelPhrase.getJapanese();
        if (japanese != null) {
            com.google.android.material.datepicker.d.z(this.JapaneseConverter, japanese, sQLiteStatement, 9);
        }
        String korean = travelPhrase.getKorean();
        if (korean != null) {
            com.google.android.material.datepicker.d.z(this.KoreanConverter, korean, sQLiteStatement, 10);
        }
        String spanish = travelPhrase.getSpanish();
        if (spanish != null) {
            com.google.android.material.datepicker.d.z(this.SpanishConverter, spanish, sQLiteStatement, 11);
        }
        String french = travelPhrase.getFrench();
        if (french != null) {
            com.google.android.material.datepicker.d.z(this.FrenchConverter, french, sQLiteStatement, 12);
        }
        String german = travelPhrase.getGerman();
        if (german != null) {
            com.google.android.material.datepicker.d.z(this.GermanConverter, german, sQLiteStatement, 13);
        }
        String italian = travelPhrase.getItalian();
        if (italian != null) {
            com.google.android.material.datepicker.d.z(this.ItalianConverter, italian, sQLiteStatement, 14);
        }
        String portuguese = travelPhrase.getPortuguese();
        if (portuguese != null) {
            com.google.android.material.datepicker.d.z(this.PortugueseConverter, portuguese, sQLiteStatement, 15);
        }
        String vietnamese = travelPhrase.getVietnamese();
        if (vietnamese != null) {
            com.google.android.material.datepicker.d.z(this.VietnameseConverter, vietnamese, sQLiteStatement, 16);
        }
        String russian = travelPhrase.getRussian();
        if (russian != null) {
            com.google.android.material.datepicker.d.z(this.RussianConverter, russian, sQLiteStatement, 17);
        }
        String thai = travelPhrase.getThai();
        if (thai != null) {
            com.google.android.material.datepicker.d.z(this.ThaiConverter, thai, sQLiteStatement, 18);
        }
        String indonesian = travelPhrase.getIndonesian();
        if (indonesian != null) {
            com.google.android.material.datepicker.d.z(this.IndonesianConverter, indonesian, sQLiteStatement, 19);
        }
        String arabic = travelPhrase.getArabic();
        if (arabic != null) {
            com.google.android.material.datepicker.d.z(this.ArabicConverter, arabic, sQLiteStatement, 20);
        }
        String polish = travelPhrase.getPolish();
        if (polish != null) {
            com.google.android.material.datepicker.d.z(this.PolishConverter, polish, sQLiteStatement, 21);
        }
        String turkish = travelPhrase.getTurkish();
        if (turkish != null) {
            com.google.android.material.datepicker.d.z(this.TurkishConverter, turkish, sQLiteStatement, 22);
        }
    }
}
