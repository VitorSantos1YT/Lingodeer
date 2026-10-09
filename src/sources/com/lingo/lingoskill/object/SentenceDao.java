package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class SentenceDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "Sentence";
    private final kj.a DirCodeConverter;
    private final kj.a LessonsConverter;
    private final kj.a SentenceConverter;
    private final kj.a TSentenceConverter;
    private final kj.a TranslationsConverter;
    private final kj.a WordListConverter;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d SentenceId = new d(0, Long.TYPE, "SentenceId", true, "SentenceId");
        public static final d Sentence = new d(1, String.class, SentenceDao.TABLENAME, false, SentenceDao.TABLENAME);
        public static final d TSentence = new d(2, String.class, "TSentence", false, "TSentence");
        public static final d WordList = new d(3, String.class, "WordList", false, "WordList");
        public static final d Translations = new d(4, String.class, "Translations", false, "Translations");
        public static final d DirCode = new d(5, String.class, "DirCode", false, "DirCode");
        public static final d Lessons = new d(6, String.class, "Lessons", false, "Lessons");
    }

    public SentenceDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
        this.SentenceConverter = new kj.a();
        this.TSentenceConverter = new kj.a();
        this.WordListConverter = new kj.a();
        this.TranslationsConverter = new kj.a();
        this.DirCodeConverter = new kj.a();
        this.LessonsConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(Sentence sentence) {
        if (sentence != null) {
            return Long.valueOf(sentence.getSentenceId());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(Sentence sentence) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.a
    public Long readKey(Cursor cursor, int i11) {
        return Long.valueOf(cursor.getLong(i11));
    }

    @Override // org.greenrobot.greendao.a
    public final Long updateKeyAfterInsert(Sentence sentence, long j11) {
        sentence.setSentenceId(j11);
        return Long.valueOf(j11);
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, Sentence sentence) {
        dVar.f();
        dVar.g(1, sentence.getSentenceId());
        String sentence2 = sentence.getSentence();
        if (sentence2 != null) {
            com.google.android.material.datepicker.d.A(this.SentenceConverter, sentence2, dVar, 2);
        }
        String tSentence = sentence.getTSentence();
        if (tSentence != null) {
            com.google.android.material.datepicker.d.A(this.TSentenceConverter, tSentence, dVar, 3);
        }
        String wordList = sentence.getWordList();
        if (wordList != null) {
            com.google.android.material.datepicker.d.A(this.WordListConverter, wordList, dVar, 4);
        }
        String translations = sentence.getTranslations();
        if (translations != null) {
            com.google.android.material.datepicker.d.A(this.TranslationsConverter, translations, dVar, 5);
        }
        String dirCode = sentence.getDirCode();
        if (dirCode != null) {
            com.google.android.material.datepicker.d.A(this.DirCodeConverter, dirCode, dVar, 6);
        }
        String lessons = sentence.getLessons();
        if (lessons != null) {
            com.google.android.material.datepicker.d.A(this.LessonsConverter, lessons, dVar, 7);
        }
    }

    @Override // org.greenrobot.greendao.a
    public Sentence readEntity(Cursor cursor, int i11) {
        long j11 = cursor.getLong(i11);
        int i12 = i11 + 1;
        int i13 = i11 + 2;
        int i14 = i11 + 3;
        int i15 = i11 + 4;
        int i16 = i11 + 5;
        int i17 = i11 + 6;
        return new Sentence(j11, cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.SentenceConverter), cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.TSentenceConverter), cursor.isNull(i14) ? null : com.google.android.material.datepicker.d.j(cursor, i14, this.WordListConverter), cursor.isNull(i15) ? null : com.google.android.material.datepicker.d.j(cursor, i15, this.TranslationsConverter), cursor.isNull(i16) ? null : com.google.android.material.datepicker.d.j(cursor, i16, this.DirCodeConverter), cursor.isNull(i17) ? null : com.google.android.material.datepicker.d.j(cursor, i17, this.LessonsConverter));
    }

    public SentenceDao(j10.a aVar) {
        super(aVar, null);
        this.SentenceConverter = new kj.a();
        this.TSentenceConverter = new kj.a();
        this.WordListConverter = new kj.a();
        this.TranslationsConverter = new kj.a();
        this.DirCodeConverter = new kj.a();
        this.LessonsConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, Sentence sentence, int i11) {
        sentence.setSentenceId(cursor.getLong(i11));
        int i12 = i11 + 1;
        sentence.setSentence(cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.SentenceConverter));
        int i13 = i11 + 2;
        sentence.setTSentence(cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.TSentenceConverter));
        int i14 = i11 + 3;
        sentence.setWordList(cursor.isNull(i14) ? null : com.google.android.material.datepicker.d.j(cursor, i14, this.WordListConverter));
        int i15 = i11 + 4;
        sentence.setTranslations(cursor.isNull(i15) ? null : com.google.android.material.datepicker.d.j(cursor, i15, this.TranslationsConverter));
        int i16 = i11 + 5;
        sentence.setDirCode(cursor.isNull(i16) ? null : com.google.android.material.datepicker.d.j(cursor, i16, this.DirCodeConverter));
        int i17 = i11 + 6;
        sentence.setLessons(cursor.isNull(i17) ? null : com.google.android.material.datepicker.d.j(cursor, i17, this.LessonsConverter));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, Sentence sentence) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, sentence.getSentenceId());
        String sentence2 = sentence.getSentence();
        if (sentence2 != null) {
            com.google.android.material.datepicker.d.z(this.SentenceConverter, sentence2, sQLiteStatement, 2);
        }
        String tSentence = sentence.getTSentence();
        if (tSentence != null) {
            com.google.android.material.datepicker.d.z(this.TSentenceConverter, tSentence, sQLiteStatement, 3);
        }
        String wordList = sentence.getWordList();
        if (wordList != null) {
            com.google.android.material.datepicker.d.z(this.WordListConverter, wordList, sQLiteStatement, 4);
        }
        String translations = sentence.getTranslations();
        if (translations != null) {
            com.google.android.material.datepicker.d.z(this.TranslationsConverter, translations, sQLiteStatement, 5);
        }
        String dirCode = sentence.getDirCode();
        if (dirCode != null) {
            com.google.android.material.datepicker.d.z(this.DirCodeConverter, dirCode, sQLiteStatement, 6);
        }
        String lessons = sentence.getLessons();
        if (lessons != null) {
            com.google.android.material.datepicker.d.z(this.LessonsConverter, lessons, sQLiteStatement, 7);
        }
    }
}
