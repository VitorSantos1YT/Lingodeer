package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class LessonDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "Lesson";
    private final kj.a ChallengeRegexConverter;
    private final kj.a CharacterListConverter;
    private final kj.a DescriptionConverter;
    private final kj.a LastRegexConverter;
    private final kj.a LessonNameConverter;
    private final kj.a NormalRegexConverter;
    private final kj.a RepeatRegexConverter;
    private final kj.a SentenceListConverter;
    private final kj.a TDescriptionConverter;
    private final kj.a WordListConverter;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d ChallengeRegex;
        public static final d CharacterList;
        public static final d Description;
        public static final d LastRegex;
        public static final d LessonId;
        public static final d LessonName;
        public static final d LevelId;
        public static final d NormalRegex;
        public static final d RepeatRegex;
        public static final d SentenceList;
        public static final d SortIndex;
        public static final d TDescription;
        public static final d UnitId;
        public static final d WordList;

        static {
            Class cls = Long.TYPE;
            LessonId = new d(0, cls, "LessonId", true, "LessonId");
            LessonName = new d(1, String.class, "LessonName", false, "LessonName");
            Description = new d(2, String.class, "Description", false, "Description");
            TDescription = new d(3, String.class, "TDescription", false, "TDescription");
            LevelId = new d(4, cls, "LevelId", false, "LevelId");
            UnitId = new d(5, cls, "UnitId", false, "UnitId");
            WordList = new d(6, String.class, "WordList", false, "WordList");
            SentenceList = new d(7, String.class, "SentenceList", false, "SentenceList");
            CharacterList = new d(8, String.class, "CharacterList", false, "CharacterList");
            NormalRegex = new d(9, String.class, "NormalRegex", false, "NormalRegex");
            LastRegex = new d(10, String.class, "LastRegex", false, "LastRegex");
            RepeatRegex = new d(11, String.class, "RepeatRegex", false, "RepeatRegex");
            ChallengeRegex = new d(12, String.class, "ChallengeRegex", false, "ChallengeRegex");
            SortIndex = new d(13, Integer.TYPE, "SortIndex", false, "SortIndex");
        }
    }

    public LessonDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
        this.LessonNameConverter = new kj.a();
        this.DescriptionConverter = new kj.a();
        this.TDescriptionConverter = new kj.a();
        this.WordListConverter = new kj.a();
        this.SentenceListConverter = new kj.a();
        this.CharacterListConverter = new kj.a();
        this.NormalRegexConverter = new kj.a();
        this.LastRegexConverter = new kj.a();
        this.RepeatRegexConverter = new kj.a();
        this.ChallengeRegexConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(Lesson lesson) {
        if (lesson != null) {
            return Long.valueOf(lesson.getLessonId());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(Lesson lesson) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.a
    public Long readKey(Cursor cursor, int i11) {
        return Long.valueOf(cursor.getLong(i11));
    }

    @Override // org.greenrobot.greendao.a
    public final Long updateKeyAfterInsert(Lesson lesson, long j11) {
        lesson.setLessonId(j11);
        return Long.valueOf(j11);
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, Lesson lesson) {
        dVar.f();
        dVar.g(1, lesson.getLessonId());
        String lessonName = lesson.getLessonName();
        if (lessonName != null) {
            com.google.android.material.datepicker.d.A(this.LessonNameConverter, lessonName, dVar, 2);
        }
        String description = lesson.getDescription();
        if (description != null) {
            com.google.android.material.datepicker.d.A(this.DescriptionConverter, description, dVar, 3);
        }
        String tDescription = lesson.getTDescription();
        if (tDescription != null) {
            com.google.android.material.datepicker.d.A(this.TDescriptionConverter, tDescription, dVar, 4);
        }
        dVar.g(5, lesson.getLevelId());
        dVar.g(6, lesson.getUnitId());
        String wordList = lesson.getWordList();
        if (wordList != null) {
            com.google.android.material.datepicker.d.A(this.WordListConverter, wordList, dVar, 7);
        }
        String sentenceList = lesson.getSentenceList();
        if (sentenceList != null) {
            com.google.android.material.datepicker.d.A(this.SentenceListConverter, sentenceList, dVar, 8);
        }
        String characterList = lesson.getCharacterList();
        if (characterList != null) {
            com.google.android.material.datepicker.d.A(this.CharacterListConverter, characterList, dVar, 9);
        }
        String normalRegex = lesson.getNormalRegex();
        if (normalRegex != null) {
            com.google.android.material.datepicker.d.A(this.NormalRegexConverter, normalRegex, dVar, 10);
        }
        String lastRegex = lesson.getLastRegex();
        if (lastRegex != null) {
            com.google.android.material.datepicker.d.A(this.LastRegexConverter, lastRegex, dVar, 11);
        }
        String repeatRegex = lesson.getRepeatRegex();
        if (repeatRegex != null) {
            com.google.android.material.datepicker.d.A(this.RepeatRegexConverter, repeatRegex, dVar, 12);
        }
        String challengeRegex = lesson.getChallengeRegex();
        if (challengeRegex != null) {
            com.google.android.material.datepicker.d.A(this.ChallengeRegexConverter, challengeRegex, dVar, 13);
        }
        dVar.g(14, lesson.getSortIndex());
    }

    @Override // org.greenrobot.greendao.a
    public Lesson readEntity(Cursor cursor, int i11) {
        long j11 = cursor.getLong(i11);
        int i12 = i11 + 1;
        String strJ = cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.LessonNameConverter);
        int i13 = i11 + 2;
        String strJ2 = cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.DescriptionConverter);
        int i14 = i11 + 3;
        String strJ3 = cursor.isNull(i14) ? null : com.google.android.material.datepicker.d.j(cursor, i14, this.TDescriptionConverter);
        long j12 = cursor.getLong(i11 + 4);
        long j13 = cursor.getLong(i11 + 5);
        int i15 = i11 + 6;
        String strJ4 = cursor.isNull(i15) ? null : com.google.android.material.datepicker.d.j(cursor, i15, this.WordListConverter);
        int i16 = i11 + 7;
        String strJ5 = cursor.isNull(i16) ? null : com.google.android.material.datepicker.d.j(cursor, i16, this.SentenceListConverter);
        int i17 = i11 + 8;
        String strJ6 = cursor.isNull(i17) ? null : com.google.android.material.datepicker.d.j(cursor, i17, this.CharacterListConverter);
        int i18 = i11 + 9;
        String strJ7 = cursor.isNull(i18) ? null : com.google.android.material.datepicker.d.j(cursor, i18, this.NormalRegexConverter);
        int i19 = i11 + 10;
        String strJ8 = cursor.isNull(i19) ? null : com.google.android.material.datepicker.d.j(cursor, i19, this.LastRegexConverter);
        int i21 = i11 + 11;
        String strJ9 = cursor.isNull(i21) ? null : com.google.android.material.datepicker.d.j(cursor, i21, this.RepeatRegexConverter);
        int i22 = i11 + 12;
        return new Lesson(j11, strJ, strJ2, strJ3, j12, j13, strJ4, strJ5, strJ6, strJ7, strJ8, strJ9, cursor.isNull(i22) ? null : com.google.android.material.datepicker.d.j(cursor, i22, this.ChallengeRegexConverter), cursor.getInt(i11 + 13));
    }

    public LessonDao(j10.a aVar) {
        super(aVar, null);
        this.LessonNameConverter = new kj.a();
        this.DescriptionConverter = new kj.a();
        this.TDescriptionConverter = new kj.a();
        this.WordListConverter = new kj.a();
        this.SentenceListConverter = new kj.a();
        this.CharacterListConverter = new kj.a();
        this.NormalRegexConverter = new kj.a();
        this.LastRegexConverter = new kj.a();
        this.RepeatRegexConverter = new kj.a();
        this.ChallengeRegexConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, Lesson lesson, int i11) {
        lesson.setLessonId(cursor.getLong(i11));
        int i12 = i11 + 1;
        lesson.setLessonName(cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.LessonNameConverter));
        int i13 = i11 + 2;
        lesson.setDescription(cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.DescriptionConverter));
        int i14 = i11 + 3;
        lesson.setTDescription(cursor.isNull(i14) ? null : com.google.android.material.datepicker.d.j(cursor, i14, this.TDescriptionConverter));
        lesson.setLevelId(cursor.getLong(i11 + 4));
        lesson.setUnitId(cursor.getLong(i11 + 5));
        int i15 = i11 + 6;
        lesson.setWordList(cursor.isNull(i15) ? null : com.google.android.material.datepicker.d.j(cursor, i15, this.WordListConverter));
        int i16 = i11 + 7;
        lesson.setSentenceList(cursor.isNull(i16) ? null : com.google.android.material.datepicker.d.j(cursor, i16, this.SentenceListConverter));
        int i17 = i11 + 8;
        lesson.setCharacterList(cursor.isNull(i17) ? null : com.google.android.material.datepicker.d.j(cursor, i17, this.CharacterListConverter));
        int i18 = i11 + 9;
        lesson.setNormalRegex(cursor.isNull(i18) ? null : com.google.android.material.datepicker.d.j(cursor, i18, this.NormalRegexConverter));
        int i19 = i11 + 10;
        lesson.setLastRegex(cursor.isNull(i19) ? null : com.google.android.material.datepicker.d.j(cursor, i19, this.LastRegexConverter));
        int i21 = i11 + 11;
        lesson.setRepeatRegex(cursor.isNull(i21) ? null : com.google.android.material.datepicker.d.j(cursor, i21, this.RepeatRegexConverter));
        int i22 = i11 + 12;
        lesson.setChallengeRegex(cursor.isNull(i22) ? null : com.google.android.material.datepicker.d.j(cursor, i22, this.ChallengeRegexConverter));
        lesson.setSortIndex(cursor.getInt(i11 + 13));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, Lesson lesson) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, lesson.getLessonId());
        String lessonName = lesson.getLessonName();
        if (lessonName != null) {
            com.google.android.material.datepicker.d.z(this.LessonNameConverter, lessonName, sQLiteStatement, 2);
        }
        String description = lesson.getDescription();
        if (description != null) {
            com.google.android.material.datepicker.d.z(this.DescriptionConverter, description, sQLiteStatement, 3);
        }
        String tDescription = lesson.getTDescription();
        if (tDescription != null) {
            com.google.android.material.datepicker.d.z(this.TDescriptionConverter, tDescription, sQLiteStatement, 4);
        }
        sQLiteStatement.bindLong(5, lesson.getLevelId());
        sQLiteStatement.bindLong(6, lesson.getUnitId());
        String wordList = lesson.getWordList();
        if (wordList != null) {
            com.google.android.material.datepicker.d.z(this.WordListConverter, wordList, sQLiteStatement, 7);
        }
        String sentenceList = lesson.getSentenceList();
        if (sentenceList != null) {
            com.google.android.material.datepicker.d.z(this.SentenceListConverter, sentenceList, sQLiteStatement, 8);
        }
        String characterList = lesson.getCharacterList();
        if (characterList != null) {
            com.google.android.material.datepicker.d.z(this.CharacterListConverter, characterList, sQLiteStatement, 9);
        }
        String normalRegex = lesson.getNormalRegex();
        if (normalRegex != null) {
            com.google.android.material.datepicker.d.z(this.NormalRegexConverter, normalRegex, sQLiteStatement, 10);
        }
        String lastRegex = lesson.getLastRegex();
        if (lastRegex != null) {
            com.google.android.material.datepicker.d.z(this.LastRegexConverter, lastRegex, sQLiteStatement, 11);
        }
        String repeatRegex = lesson.getRepeatRegex();
        if (repeatRegex != null) {
            com.google.android.material.datepicker.d.z(this.RepeatRegexConverter, repeatRegex, sQLiteStatement, 12);
        }
        String challengeRegex = lesson.getChallengeRegex();
        if (challengeRegex != null) {
            com.google.android.material.datepicker.d.z(this.ChallengeRegexConverter, challengeRegex, sQLiteStatement, 13);
        }
        sQLiteStatement.bindLong(14, lesson.getSortIndex());
    }
}
