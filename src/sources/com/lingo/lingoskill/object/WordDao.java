package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class WordDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "Word";
    private final kj.a DirCodeConverter;
    private final kj.a ExplanationConverter;
    private final kj.a FeaturedConverter;
    private final kj.a LessonsConverter;
    private final kj.a LuomaConverter;
    private final kj.a MainPicConverter;
    private final kj.a PosConverter;
    private final kj.a TWordConverter;
    private final kj.a TranslationsConverter;
    private final kj.a WordConverter;
    private final kj.a ZhuyinConverter;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d Animation;
        public static final d Featured;
        public static final d Pos;
        public static final d WordType;
        public static final d WordId = new d(0, Long.TYPE, "WordId", true, "WordId");
        public static final d Word = new d(1, String.class, WordDao.TABLENAME, false, WordDao.TABLENAME);
        public static final d TWord = new d(2, String.class, "TWord", false, "TWord");
        public static final d Zhuyin = new d(3, String.class, "Zhuyin", false, "Zhuyin");
        public static final d Luoma = new d(4, String.class, "Luoma", false, "Luoma");
        public static final d Translations = new d(5, String.class, "Translations", false, "Translations");
        public static final d Explanation = new d(6, String.class, "Explanation", false, "Explanation");
        public static final d MainPic = new d(7, String.class, "MainPic", false, "MainPic");
        public static final d DirCode = new d(8, String.class, "DirCode", false, "DirCode");
        public static final d Lessons = new d(9, String.class, "Lessons", false, "Lessons");

        static {
            Class cls = Integer.TYPE;
            WordType = new d(10, cls, "WordType", false, "WordType");
            Animation = new d(11, cls, "Animation", false, "Animation");
            Pos = new d(12, String.class, "Pos", false, "Pos");
            Featured = new d(13, String.class, "Featured", false, "Featured");
        }
    }

    public WordDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
        this.WordConverter = new kj.a();
        this.TWordConverter = new kj.a();
        this.ZhuyinConverter = new kj.a();
        this.LuomaConverter = new kj.a();
        this.TranslationsConverter = new kj.a();
        this.ExplanationConverter = new kj.a();
        this.MainPicConverter = new kj.a();
        this.DirCodeConverter = new kj.a();
        this.LessonsConverter = new kj.a();
        this.PosConverter = new kj.a();
        this.FeaturedConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(Word word) {
        if (word != null) {
            return Long.valueOf(word.getWordId());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(Word word) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.a
    public Long readKey(Cursor cursor, int i11) {
        return Long.valueOf(cursor.getLong(i11));
    }

    @Override // org.greenrobot.greendao.a
    public final Long updateKeyAfterInsert(Word word, long j11) {
        word.setWordId(j11);
        return Long.valueOf(j11);
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, Word word) {
        dVar.f();
        dVar.g(1, word.getWordId());
        String word2 = word.getWord();
        if (word2 != null) {
            com.google.android.material.datepicker.d.A(this.WordConverter, word2, dVar, 2);
        }
        String tWord = word.getTWord();
        if (tWord != null) {
            com.google.android.material.datepicker.d.A(this.TWordConverter, tWord, dVar, 3);
        }
        String zhuyin = word.getZhuyin();
        if (zhuyin != null) {
            com.google.android.material.datepicker.d.A(this.ZhuyinConverter, zhuyin, dVar, 4);
        }
        String luoma = word.getLuoma();
        if (luoma != null) {
            com.google.android.material.datepicker.d.A(this.LuomaConverter, luoma, dVar, 5);
        }
        String translations = word.getTranslations();
        if (translations != null) {
            com.google.android.material.datepicker.d.A(this.TranslationsConverter, translations, dVar, 6);
        }
        String explanation = word.getExplanation();
        if (explanation != null) {
            com.google.android.material.datepicker.d.A(this.ExplanationConverter, explanation, dVar, 7);
        }
        String mainPic = word.getMainPic();
        if (mainPic != null) {
            com.google.android.material.datepicker.d.A(this.MainPicConverter, mainPic, dVar, 8);
        }
        String dirCode = word.getDirCode();
        if (dirCode != null) {
            com.google.android.material.datepicker.d.A(this.DirCodeConverter, dirCode, dVar, 9);
        }
        String lessons = word.getLessons();
        if (lessons != null) {
            com.google.android.material.datepicker.d.A(this.LessonsConverter, lessons, dVar, 10);
        }
        dVar.g(11, word.getWordType());
        dVar.g(12, word.getAnimation());
        String pos = word.getPos();
        if (pos != null) {
            com.google.android.material.datepicker.d.A(this.PosConverter, pos, dVar, 13);
        }
        String featured = word.getFeatured();
        if (featured != null) {
            com.google.android.material.datepicker.d.A(this.FeaturedConverter, featured, dVar, 14);
        }
    }

    @Override // org.greenrobot.greendao.a
    public Word readEntity(Cursor cursor, int i11) {
        String strJ;
        long j11 = cursor.getLong(i11);
        int i12 = i11 + 1;
        String strJ2 = cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.WordConverter);
        int i13 = i11 + 2;
        String strJ3 = cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.TWordConverter);
        int i14 = i11 + 3;
        String strJ4 = cursor.isNull(i14) ? null : com.google.android.material.datepicker.d.j(cursor, i14, this.ZhuyinConverter);
        int i15 = i11 + 4;
        String strJ5 = cursor.isNull(i15) ? null : com.google.android.material.datepicker.d.j(cursor, i15, this.LuomaConverter);
        int i16 = i11 + 5;
        String strJ6 = cursor.isNull(i16) ? null : com.google.android.material.datepicker.d.j(cursor, i16, this.TranslationsConverter);
        int i17 = i11 + 6;
        String strJ7 = cursor.isNull(i17) ? null : com.google.android.material.datepicker.d.j(cursor, i17, this.ExplanationConverter);
        int i18 = i11 + 7;
        String strJ8 = cursor.isNull(i18) ? null : com.google.android.material.datepicker.d.j(cursor, i18, this.MainPicConverter);
        int i19 = i11 + 8;
        String strJ9 = cursor.isNull(i19) ? null : com.google.android.material.datepicker.d.j(cursor, i19, this.DirCodeConverter);
        int i21 = i11 + 9;
        String strJ10 = cursor.isNull(i21) ? null : com.google.android.material.datepicker.d.j(cursor, i21, this.LessonsConverter);
        int i22 = cursor.getInt(i11 + 10);
        int i23 = cursor.getInt(i11 + 11);
        int i24 = i11 + 12;
        String strJ11 = cursor.isNull(i24) ? null : com.google.android.material.datepicker.d.j(cursor, i24, this.PosConverter);
        int i25 = i11 + 13;
        if (cursor.isNull(i25)) {
            strJ = null;
        } else {
            strJ11 = strJ11;
            strJ = com.google.android.material.datepicker.d.j(cursor, i25, this.FeaturedConverter);
        }
        return new Word(j11, strJ2, strJ3, strJ4, strJ5, strJ6, strJ7, strJ8, strJ9, strJ10, i22, i23, strJ11, strJ);
    }

    public WordDao(j10.a aVar) {
        super(aVar, null);
        this.WordConverter = new kj.a();
        this.TWordConverter = new kj.a();
        this.ZhuyinConverter = new kj.a();
        this.LuomaConverter = new kj.a();
        this.TranslationsConverter = new kj.a();
        this.ExplanationConverter = new kj.a();
        this.MainPicConverter = new kj.a();
        this.DirCodeConverter = new kj.a();
        this.LessonsConverter = new kj.a();
        this.PosConverter = new kj.a();
        this.FeaturedConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, Word word, int i11) {
        word.setWordId(cursor.getLong(i11));
        int i12 = i11 + 1;
        word.setWord(cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.WordConverter));
        int i13 = i11 + 2;
        word.setTWord(cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.TWordConverter));
        int i14 = i11 + 3;
        word.setZhuyin(cursor.isNull(i14) ? null : com.google.android.material.datepicker.d.j(cursor, i14, this.ZhuyinConverter));
        int i15 = i11 + 4;
        word.setLuoma(cursor.isNull(i15) ? null : com.google.android.material.datepicker.d.j(cursor, i15, this.LuomaConverter));
        int i16 = i11 + 5;
        word.setTranslations(cursor.isNull(i16) ? null : com.google.android.material.datepicker.d.j(cursor, i16, this.TranslationsConverter));
        int i17 = i11 + 6;
        word.setExplanation(cursor.isNull(i17) ? null : com.google.android.material.datepicker.d.j(cursor, i17, this.ExplanationConverter));
        int i18 = i11 + 7;
        word.setMainPic(cursor.isNull(i18) ? null : com.google.android.material.datepicker.d.j(cursor, i18, this.MainPicConverter));
        int i19 = i11 + 8;
        word.setDirCode(cursor.isNull(i19) ? null : com.google.android.material.datepicker.d.j(cursor, i19, this.DirCodeConverter));
        int i21 = i11 + 9;
        word.setLessons(cursor.isNull(i21) ? null : com.google.android.material.datepicker.d.j(cursor, i21, this.LessonsConverter));
        word.setWordType(cursor.getInt(i11 + 10));
        word.setAnimation(cursor.getInt(i11 + 11));
        int i22 = i11 + 12;
        word.setPos(cursor.isNull(i22) ? null : com.google.android.material.datepicker.d.j(cursor, i22, this.PosConverter));
        int i23 = i11 + 13;
        word.setFeatured(cursor.isNull(i23) ? null : com.google.android.material.datepicker.d.j(cursor, i23, this.FeaturedConverter));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, Word word) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, word.getWordId());
        String word2 = word.getWord();
        if (word2 != null) {
            com.google.android.material.datepicker.d.z(this.WordConverter, word2, sQLiteStatement, 2);
        }
        String tWord = word.getTWord();
        if (tWord != null) {
            com.google.android.material.datepicker.d.z(this.TWordConverter, tWord, sQLiteStatement, 3);
        }
        String zhuyin = word.getZhuyin();
        if (zhuyin != null) {
            com.google.android.material.datepicker.d.z(this.ZhuyinConverter, zhuyin, sQLiteStatement, 4);
        }
        String luoma = word.getLuoma();
        if (luoma != null) {
            com.google.android.material.datepicker.d.z(this.LuomaConverter, luoma, sQLiteStatement, 5);
        }
        String translations = word.getTranslations();
        if (translations != null) {
            com.google.android.material.datepicker.d.z(this.TranslationsConverter, translations, sQLiteStatement, 6);
        }
        String explanation = word.getExplanation();
        if (explanation != null) {
            com.google.android.material.datepicker.d.z(this.ExplanationConverter, explanation, sQLiteStatement, 7);
        }
        String mainPic = word.getMainPic();
        if (mainPic != null) {
            com.google.android.material.datepicker.d.z(this.MainPicConverter, mainPic, sQLiteStatement, 8);
        }
        String dirCode = word.getDirCode();
        if (dirCode != null) {
            com.google.android.material.datepicker.d.z(this.DirCodeConverter, dirCode, sQLiteStatement, 9);
        }
        String lessons = word.getLessons();
        if (lessons != null) {
            com.google.android.material.datepicker.d.z(this.LessonsConverter, lessons, sQLiteStatement, 10);
        }
        sQLiteStatement.bindLong(11, word.getWordType());
        sQLiteStatement.bindLong(12, word.getAnimation());
        String pos = word.getPos();
        if (pos != null) {
            com.google.android.material.datepicker.d.z(this.PosConverter, pos, sQLiteStatement, 13);
        }
        String featured = word.getFeatured();
        if (featured != null) {
            com.google.android.material.datepicker.d.z(this.FeaturedConverter, featured, sQLiteStatement, 14);
        }
    }
}
