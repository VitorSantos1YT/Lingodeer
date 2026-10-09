package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class PhraseDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "Phrase";
    private final kj.a AudiosConverter;
    private final kj.a LessonsConverter;
    private final kj.a LuomaConverter;
    private final kj.a Option1Converter;
    private final kj.a Option2Converter;
    private final kj.a PhraseConverter;
    private final kj.a TranslationsConverter;
    private final kj.a ZhuyinConverter;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d Status1;
        public static final d Status2;
        public static final d PhraseId = new d(0, Long.TYPE, "PhraseId", true, "PhraseId");
        public static final d Phrase = new d(1, String.class, PhraseDao.TABLENAME, false, PhraseDao.TABLENAME);
        public static final d Zhuyin = new d(2, String.class, "Zhuyin", false, "Zhuyin");
        public static final d Luoma = new d(3, String.class, "Luoma", false, "Luoma");
        public static final d Translations = new d(4, String.class, "Translations", false, "Translations");
        public static final d Lessons = new d(5, String.class, "Lessons", false, "Lessons");
        public static final d Audios = new d(6, String.class, "Audios", false, "Audios");
        public static final d Option1 = new d(7, String.class, "Option1", false, "Option1");
        public static final d Option2 = new d(8, String.class, "Option2", false, "Option2");

        static {
            Class cls = Integer.TYPE;
            Status1 = new d(9, cls, "Status1", false, "Status1");
            Status2 = new d(10, cls, "Status2", false, "Status2");
        }
    }

    public PhraseDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
        this.PhraseConverter = new kj.a();
        this.ZhuyinConverter = new kj.a();
        this.LuomaConverter = new kj.a();
        this.TranslationsConverter = new kj.a();
        this.LessonsConverter = new kj.a();
        this.AudiosConverter = new kj.a();
        this.Option1Converter = new kj.a();
        this.Option2Converter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(Phrase phrase) {
        if (phrase != null) {
            return Long.valueOf(phrase.getPhraseId());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(Phrase phrase) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.a
    public Long readKey(Cursor cursor, int i11) {
        return Long.valueOf(cursor.getLong(i11));
    }

    @Override // org.greenrobot.greendao.a
    public final Long updateKeyAfterInsert(Phrase phrase, long j11) {
        phrase.setPhraseId(j11);
        return Long.valueOf(j11);
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, Phrase phrase) {
        dVar.f();
        dVar.g(1, phrase.getPhraseId());
        String phrase2 = phrase.getPhrase();
        if (phrase2 != null) {
            com.google.android.material.datepicker.d.A(this.PhraseConverter, phrase2, dVar, 2);
        }
        String zhuyin = phrase.getZhuyin();
        if (zhuyin != null) {
            com.google.android.material.datepicker.d.A(this.ZhuyinConverter, zhuyin, dVar, 3);
        }
        String luoma = phrase.getLuoma();
        if (luoma != null) {
            com.google.android.material.datepicker.d.A(this.LuomaConverter, luoma, dVar, 4);
        }
        String translations = phrase.getTranslations();
        if (translations != null) {
            com.google.android.material.datepicker.d.A(this.TranslationsConverter, translations, dVar, 5);
        }
        String lessons = phrase.getLessons();
        if (lessons != null) {
            com.google.android.material.datepicker.d.A(this.LessonsConverter, lessons, dVar, 6);
        }
        String audios = phrase.getAudios();
        if (audios != null) {
            com.google.android.material.datepicker.d.A(this.AudiosConverter, audios, dVar, 7);
        }
        String option1 = phrase.getOption1();
        if (option1 != null) {
            com.google.android.material.datepicker.d.A(this.Option1Converter, option1, dVar, 8);
        }
        String option2 = phrase.getOption2();
        if (option2 != null) {
            com.google.android.material.datepicker.d.A(this.Option2Converter, option2, dVar, 9);
        }
        dVar.g(10, phrase.getStatus1());
        dVar.g(11, phrase.getStatus2());
    }

    @Override // org.greenrobot.greendao.a
    public Phrase readEntity(Cursor cursor, int i11) {
        int i12 = i11 + 1;
        int i13 = i11 + 2;
        int i14 = i11 + 3;
        int i15 = i11 + 4;
        int i16 = i11 + 5;
        int i17 = i11 + 6;
        int i18 = i11 + 7;
        int i19 = i11 + 8;
        return new Phrase(cursor.getLong(i11), cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.PhraseConverter), cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.ZhuyinConverter), cursor.isNull(i14) ? null : com.google.android.material.datepicker.d.j(cursor, i14, this.LuomaConverter), cursor.isNull(i15) ? null : com.google.android.material.datepicker.d.j(cursor, i15, this.TranslationsConverter), cursor.isNull(i16) ? null : com.google.android.material.datepicker.d.j(cursor, i16, this.LessonsConverter), cursor.isNull(i17) ? null : com.google.android.material.datepicker.d.j(cursor, i17, this.AudiosConverter), cursor.isNull(i18) ? null : com.google.android.material.datepicker.d.j(cursor, i18, this.Option1Converter), cursor.isNull(i19) ? null : com.google.android.material.datepicker.d.j(cursor, i19, this.Option2Converter), cursor.getInt(i11 + 9), cursor.getInt(i11 + 10));
    }

    public PhraseDao(j10.a aVar) {
        super(aVar, null);
        this.PhraseConverter = new kj.a();
        this.ZhuyinConverter = new kj.a();
        this.LuomaConverter = new kj.a();
        this.TranslationsConverter = new kj.a();
        this.LessonsConverter = new kj.a();
        this.AudiosConverter = new kj.a();
        this.Option1Converter = new kj.a();
        this.Option2Converter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, Phrase phrase, int i11) {
        phrase.setPhraseId(cursor.getLong(i11));
        int i12 = i11 + 1;
        phrase.setPhrase(cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.PhraseConverter));
        int i13 = i11 + 2;
        phrase.setZhuyin(cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.ZhuyinConverter));
        int i14 = i11 + 3;
        phrase.setLuoma(cursor.isNull(i14) ? null : com.google.android.material.datepicker.d.j(cursor, i14, this.LuomaConverter));
        int i15 = i11 + 4;
        phrase.setTranslations(cursor.isNull(i15) ? null : com.google.android.material.datepicker.d.j(cursor, i15, this.TranslationsConverter));
        int i16 = i11 + 5;
        phrase.setLessons(cursor.isNull(i16) ? null : com.google.android.material.datepicker.d.j(cursor, i16, this.LessonsConverter));
        int i17 = i11 + 6;
        phrase.setAudios(cursor.isNull(i17) ? null : com.google.android.material.datepicker.d.j(cursor, i17, this.AudiosConverter));
        int i18 = i11 + 7;
        phrase.setOption1(cursor.isNull(i18) ? null : com.google.android.material.datepicker.d.j(cursor, i18, this.Option1Converter));
        int i19 = i11 + 8;
        phrase.setOption2(cursor.isNull(i19) ? null : com.google.android.material.datepicker.d.j(cursor, i19, this.Option2Converter));
        phrase.setStatus1(cursor.getInt(i11 + 9));
        phrase.setStatus2(cursor.getInt(i11 + 10));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, Phrase phrase) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, phrase.getPhraseId());
        String phrase2 = phrase.getPhrase();
        if (phrase2 != null) {
            com.google.android.material.datepicker.d.z(this.PhraseConverter, phrase2, sQLiteStatement, 2);
        }
        String zhuyin = phrase.getZhuyin();
        if (zhuyin != null) {
            com.google.android.material.datepicker.d.z(this.ZhuyinConverter, zhuyin, sQLiteStatement, 3);
        }
        String luoma = phrase.getLuoma();
        if (luoma != null) {
            com.google.android.material.datepicker.d.z(this.LuomaConverter, luoma, sQLiteStatement, 4);
        }
        String translations = phrase.getTranslations();
        if (translations != null) {
            com.google.android.material.datepicker.d.z(this.TranslationsConverter, translations, sQLiteStatement, 5);
        }
        String lessons = phrase.getLessons();
        if (lessons != null) {
            com.google.android.material.datepicker.d.z(this.LessonsConverter, lessons, sQLiteStatement, 6);
        }
        String audios = phrase.getAudios();
        if (audios != null) {
            com.google.android.material.datepicker.d.z(this.AudiosConverter, audios, sQLiteStatement, 7);
        }
        String option1 = phrase.getOption1();
        if (option1 != null) {
            com.google.android.material.datepicker.d.z(this.Option1Converter, option1, sQLiteStatement, 8);
        }
        String option2 = phrase.getOption2();
        if (option2 != null) {
            com.google.android.material.datepicker.d.z(this.Option2Converter, option2, sQLiteStatement, 9);
        }
        sQLiteStatement.bindLong(10, phrase.getStatus1());
        sQLiteStatement.bindLong(11, phrase.getStatus2());
    }
}
