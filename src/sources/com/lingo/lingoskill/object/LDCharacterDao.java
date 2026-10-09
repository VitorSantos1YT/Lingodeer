package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class LDCharacterDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "LDCharacter";
    private final kj.a AudioNameConverter;
    private final kj.a CharacterConverter;
    private final kj.a DirCodeConverter;
    private final kj.a GanRaoConverter;
    private final kj.a LessonsConverter;
    private final kj.a PartAnswerConverter;
    private final kj.a PartOptionsConverter;
    private final kj.a PinyinConverter;
    private final kj.a TCharacterConverter;
    private final kj.a TPartAnswerConverter;
    private final kj.a TPartOptionsConverter;
    private final kj.a TranslationConverter;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d CharId = new d(0, Long.TYPE, "CharId", true, "CharId");
        public static final d Character = new d(1, String.class, HwCharacterDao.TABLENAME, false, HwCharacterDao.TABLENAME);
        public static final d TCharacter = new d(2, String.class, "TCharacter", false, "TCharacter");
        public static final d Pinyin = new d(3, String.class, "Pinyin", false, "Pinyin");
        public static final d AudioName = new d(4, String.class, "AudioName", false, "AudioName");
        public static final d DirCode = new d(5, String.class, "DirCode", false, "DirCode");
        public static final d Translation = new d(6, String.class, gkbGsXmgaxRjJ.olBWQGF, false, "Translation");
        public static final d Lessons = new d(7, String.class, "Lessons", false, "Lessons");
        public static final d PartOptions = new d(8, String.class, "PartOptions", false, "PartOptions");
        public static final d PartAnswer = new d(9, String.class, "PartAnswer", false, "PartAnswer");
        public static final d TPartOptions = new d(10, String.class, "TPartOptions", false, "TPartOptions");
        public static final d TPartAnswer = new d(11, String.class, "TPartAnswer", false, "TPartAnswer");
        public static final d GanRao = new d(12, String.class, "GanRao", false, "GanRao");
    }

    public LDCharacterDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
        this.CharacterConverter = new kj.a();
        this.TCharacterConverter = new kj.a();
        this.PinyinConverter = new kj.a();
        this.AudioNameConverter = new kj.a();
        this.DirCodeConverter = new kj.a();
        this.TranslationConverter = new kj.a();
        this.LessonsConverter = new kj.a();
        this.PartOptionsConverter = new kj.a();
        this.PartAnswerConverter = new kj.a();
        this.TPartOptionsConverter = new kj.a();
        this.TPartAnswerConverter = new kj.a();
        this.GanRaoConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(LDCharacter lDCharacter) {
        if (lDCharacter != null) {
            return Long.valueOf(lDCharacter.getCharId());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(LDCharacter lDCharacter) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override // org.greenrobot.greendao.a
    public Long readKey(Cursor cursor, int i11) {
        return Long.valueOf(cursor.getLong(i11));
    }

    @Override // org.greenrobot.greendao.a
    public final Long updateKeyAfterInsert(LDCharacter lDCharacter, long j11) {
        lDCharacter.setCharId(j11);
        return Long.valueOf(j11);
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, LDCharacter lDCharacter) {
        dVar.f();
        dVar.g(1, lDCharacter.getCharId());
        String character = lDCharacter.getCharacter();
        if (character != null) {
            com.google.android.material.datepicker.d.A(this.CharacterConverter, character, dVar, 2);
        }
        String tCharacter = lDCharacter.getTCharacter();
        if (tCharacter != null) {
            com.google.android.material.datepicker.d.A(this.TCharacterConverter, tCharacter, dVar, 3);
        }
        String pinyin = lDCharacter.getPinyin();
        if (pinyin != null) {
            com.google.android.material.datepicker.d.A(this.PinyinConverter, pinyin, dVar, 4);
        }
        String audioName = lDCharacter.getAudioName();
        if (audioName != null) {
            com.google.android.material.datepicker.d.A(this.AudioNameConverter, audioName, dVar, 5);
        }
        String dirCode = lDCharacter.getDirCode();
        if (dirCode != null) {
            com.google.android.material.datepicker.d.A(this.DirCodeConverter, dirCode, dVar, 6);
        }
        String translation = lDCharacter.getTranslation();
        if (translation != null) {
            com.google.android.material.datepicker.d.A(this.TranslationConverter, translation, dVar, 7);
        }
        String lessons = lDCharacter.getLessons();
        if (lessons != null) {
            com.google.android.material.datepicker.d.A(this.LessonsConverter, lessons, dVar, 8);
        }
        String partOptions = lDCharacter.getPartOptions();
        if (partOptions != null) {
            com.google.android.material.datepicker.d.A(this.PartOptionsConverter, partOptions, dVar, 9);
        }
        String partAnswer = lDCharacter.getPartAnswer();
        if (partAnswer != null) {
            com.google.android.material.datepicker.d.A(this.PartAnswerConverter, partAnswer, dVar, 10);
        }
        String tPartOptions = lDCharacter.getTPartOptions();
        if (tPartOptions != null) {
            com.google.android.material.datepicker.d.A(this.TPartOptionsConverter, tPartOptions, dVar, 11);
        }
        String tPartAnswer = lDCharacter.getTPartAnswer();
        if (tPartAnswer != null) {
            com.google.android.material.datepicker.d.A(this.TPartAnswerConverter, tPartAnswer, dVar, 12);
        }
        String ganRao = lDCharacter.getGanRao();
        if (ganRao != null) {
            com.google.android.material.datepicker.d.A(this.GanRaoConverter, ganRao, dVar, 13);
        }
    }

    @Override // org.greenrobot.greendao.a
    public LDCharacter readEntity(Cursor cursor, int i11) {
        String str;
        String strJ;
        long j11 = cursor.getLong(i11);
        int i12 = i11 + 1;
        String strJ2 = cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.CharacterConverter);
        int i13 = i11 + 2;
        String strJ3 = cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.TCharacterConverter);
        int i14 = i11 + 3;
        String strJ4 = cursor.isNull(i14) ? null : com.google.android.material.datepicker.d.j(cursor, i14, this.PinyinConverter);
        int i15 = i11 + 4;
        String strJ5 = cursor.isNull(i15) ? null : com.google.android.material.datepicker.d.j(cursor, i15, this.AudioNameConverter);
        int i16 = i11 + 5;
        String strJ6 = cursor.isNull(i16) ? null : com.google.android.material.datepicker.d.j(cursor, i16, this.DirCodeConverter);
        int i17 = i11 + 6;
        String strJ7 = cursor.isNull(i17) ? null : com.google.android.material.datepicker.d.j(cursor, i17, this.TranslationConverter);
        int i18 = i11 + 7;
        String strJ8 = cursor.isNull(i18) ? null : com.google.android.material.datepicker.d.j(cursor, i18, this.LessonsConverter);
        int i19 = i11 + 8;
        String strJ9 = cursor.isNull(i19) ? null : com.google.android.material.datepicker.d.j(cursor, i19, this.PartOptionsConverter);
        int i21 = i11 + 9;
        String strJ10 = cursor.isNull(i21) ? null : com.google.android.material.datepicker.d.j(cursor, i21, this.PartAnswerConverter);
        int i22 = i11 + 10;
        String strJ11 = cursor.isNull(i22) ? null : com.google.android.material.datepicker.d.j(cursor, i22, this.TPartOptionsConverter);
        int i23 = i11 + 11;
        String strJ12 = cursor.isNull(i23) ? null : com.google.android.material.datepicker.d.j(cursor, i23, this.TPartAnswerConverter);
        int i24 = i11 + 12;
        if (cursor.isNull(i24)) {
            str = strJ9;
            strJ = null;
        } else {
            str = strJ9;
            strJ = com.google.android.material.datepicker.d.j(cursor, i24, this.GanRaoConverter);
        }
        return new LDCharacter(j11, strJ2, strJ3, strJ4, strJ5, strJ6, strJ7, strJ8, str, strJ10, strJ11, strJ12, strJ);
    }

    public LDCharacterDao(j10.a aVar) {
        super(aVar, null);
        this.CharacterConverter = new kj.a();
        this.TCharacterConverter = new kj.a();
        this.PinyinConverter = new kj.a();
        this.AudioNameConverter = new kj.a();
        this.DirCodeConverter = new kj.a();
        this.TranslationConverter = new kj.a();
        this.LessonsConverter = new kj.a();
        this.PartOptionsConverter = new kj.a();
        this.PartAnswerConverter = new kj.a();
        this.TPartOptionsConverter = new kj.a();
        this.TPartAnswerConverter = new kj.a();
        this.GanRaoConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, LDCharacter lDCharacter, int i11) {
        lDCharacter.setCharId(cursor.getLong(i11));
        int i12 = i11 + 1;
        lDCharacter.setCharacter(cursor.isNull(i12) ? null : com.google.android.material.datepicker.d.j(cursor, i12, this.CharacterConverter));
        int i13 = i11 + 2;
        lDCharacter.setTCharacter(cursor.isNull(i13) ? null : com.google.android.material.datepicker.d.j(cursor, i13, this.TCharacterConverter));
        int i14 = i11 + 3;
        lDCharacter.setPinyin(cursor.isNull(i14) ? null : com.google.android.material.datepicker.d.j(cursor, i14, this.PinyinConverter));
        int i15 = i11 + 4;
        lDCharacter.setAudioName(cursor.isNull(i15) ? null : com.google.android.material.datepicker.d.j(cursor, i15, this.AudioNameConverter));
        int i16 = i11 + 5;
        lDCharacter.setDirCode(cursor.isNull(i16) ? null : com.google.android.material.datepicker.d.j(cursor, i16, this.DirCodeConverter));
        int i17 = i11 + 6;
        lDCharacter.setTranslation(cursor.isNull(i17) ? null : com.google.android.material.datepicker.d.j(cursor, i17, this.TranslationConverter));
        int i18 = i11 + 7;
        lDCharacter.setLessons(cursor.isNull(i18) ? null : com.google.android.material.datepicker.d.j(cursor, i18, this.LessonsConverter));
        int i19 = i11 + 8;
        lDCharacter.setPartOptions(cursor.isNull(i19) ? null : com.google.android.material.datepicker.d.j(cursor, i19, this.PartOptionsConverter));
        int i21 = i11 + 9;
        lDCharacter.setPartAnswer(cursor.isNull(i21) ? null : com.google.android.material.datepicker.d.j(cursor, i21, this.PartAnswerConverter));
        int i22 = i11 + 10;
        lDCharacter.setTPartOptions(cursor.isNull(i22) ? null : com.google.android.material.datepicker.d.j(cursor, i22, this.TPartOptionsConverter));
        int i23 = i11 + 11;
        lDCharacter.setTPartAnswer(cursor.isNull(i23) ? null : com.google.android.material.datepicker.d.j(cursor, i23, this.TPartAnswerConverter));
        int i24 = i11 + 12;
        lDCharacter.setGanRao(cursor.isNull(i24) ? null : com.google.android.material.datepicker.d.j(cursor, i24, this.GanRaoConverter));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, LDCharacter lDCharacter) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, lDCharacter.getCharId());
        String character = lDCharacter.getCharacter();
        if (character != null) {
            com.google.android.material.datepicker.d.z(this.CharacterConverter, character, sQLiteStatement, 2);
        }
        String tCharacter = lDCharacter.getTCharacter();
        if (tCharacter != null) {
            com.google.android.material.datepicker.d.z(this.TCharacterConverter, tCharacter, sQLiteStatement, 3);
        }
        String pinyin = lDCharacter.getPinyin();
        if (pinyin != null) {
            com.google.android.material.datepicker.d.z(this.PinyinConverter, pinyin, sQLiteStatement, 4);
        }
        String audioName = lDCharacter.getAudioName();
        if (audioName != null) {
            com.google.android.material.datepicker.d.z(this.AudioNameConverter, audioName, sQLiteStatement, 5);
        }
        String dirCode = lDCharacter.getDirCode();
        if (dirCode != null) {
            com.google.android.material.datepicker.d.z(this.DirCodeConverter, dirCode, sQLiteStatement, 6);
        }
        String translation = lDCharacter.getTranslation();
        if (translation != null) {
            com.google.android.material.datepicker.d.z(this.TranslationConverter, translation, sQLiteStatement, 7);
        }
        String lessons = lDCharacter.getLessons();
        if (lessons != null) {
            com.google.android.material.datepicker.d.z(this.LessonsConverter, lessons, sQLiteStatement, 8);
        }
        String partOptions = lDCharacter.getPartOptions();
        if (partOptions != null) {
            com.google.android.material.datepicker.d.z(this.PartOptionsConverter, partOptions, sQLiteStatement, 9);
        }
        String partAnswer = lDCharacter.getPartAnswer();
        if (partAnswer != null) {
            com.google.android.material.datepicker.d.z(this.PartAnswerConverter, partAnswer, sQLiteStatement, 10);
        }
        String tPartOptions = lDCharacter.getTPartOptions();
        if (tPartOptions != null) {
            com.google.android.material.datepicker.d.z(this.TPartOptionsConverter, tPartOptions, sQLiteStatement, 11);
        }
        String tPartAnswer = lDCharacter.getTPartAnswer();
        if (tPartAnswer != null) {
            com.google.android.material.datepicker.d.z(this.TPartAnswerConverter, tPartAnswer, sQLiteStatement, 12);
        }
        String ganRao = lDCharacter.getGanRao();
        if (ganRao != null) {
            com.google.android.material.datepicker.d.z(this.GanRaoConverter, ganRao, sQLiteStatement, 13);
        }
    }
}
