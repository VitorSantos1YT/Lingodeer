package com.lingo.lingoskill.object;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.google.android.gms.internal.stats.RC.ualZoVVCQs;
import com.tbruyelle.rxpermissions3.BuildConfig;
import org.greenrobot.greendao.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class PdLessonDao extends org.greenrobot.greendao.a {
    public static final String TABLENAME = "PdLesson";
    private final kj.a CategoryConverter;
    private final kj.a CreateDateConverter;
    private final kj.a DifficutyConverter;
    private final kj.a PublishDateConverter;
    private final kj.a TagsConverter;
    private final kj.a TipsIdsConverter;
    private final kj.a TitleConverter;
    private final kj.a Title_CHNConverter;
    private final kj.a Title_DENConverter;
    private final kj.a Title_ENGConverter;
    private final kj.a Title_FRNConverter;
    private final kj.a Title_JPNConverter;
    private final kj.a Title_KRNConverter;
    private final kj.a Title_TCHNConverter;
    private final kj.a Title_VTNConverter;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Properties {
        public static final d Id = new d(0, String.class, "Id", true, "ID");
        public static final d Lan = new d(1, String.class, "Lan", false, "Lan");
        public static final d LessonId = new d(2, Long.class, "LessonId", false, "LessonId");
        public static final d Title = new d(3, String.class, "Title", false, "Title");
        public static final d Tags = new d(4, String.class, "Tags", false, "Tags");
        public static final d Category = new d(5, String.class, "Category", false, "Category");
        public static final d Difficuty = new d(6, String.class, "Difficuty", false, "Difficuty");
        public static final d Title_ENG = new d(7, String.class, "Title_ENG", false, "Title_ENG");
        public static final d Title_JPN = new d(8, String.class, "Title_JPN", false, "Title_JPN");
        public static final d Title_KRN = new d(9, String.class, "Title_KRN", false, "Title_KRN");
        public static final d Title_FRN = new d(10, String.class, "Title_FRN", false, "Title_FRN");
        public static final d Title_DEN = new d(11, String.class, "Title_DEN", false, "Title_DEN");
        public static final d Title_VTN = new d(12, String.class, "Title_VTN", false, ualZoVVCQs.plhRsqWI);
        public static final d Title_TCHN = new d(13, String.class, "Title_TCHN", false, "Title_TCHN");
        public static final d Title_CHN = new d(14, String.class, "Title_CHN", false, "Title_CHN");
        public static final d PublishDate = new d(15, String.class, "PublishDate", false, "PublishDate");
        public static final d CreateDate = new d(16, String.class, "CreateDate", false, "CreateDate");
        public static final d Version = new d(17, Long.class, "Version", false, "Version");
        public static final d TipsIds = new d(18, String.class, "TipsIds", false, "TipsIds");
    }

    public PdLessonDao(j10.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
        this.TitleConverter = new kj.a();
        this.TagsConverter = new kj.a();
        this.CategoryConverter = new kj.a();
        this.DifficutyConverter = new kj.a();
        this.Title_ENGConverter = new kj.a();
        this.Title_JPNConverter = new kj.a();
        this.Title_KRNConverter = new kj.a();
        this.Title_FRNConverter = new kj.a();
        this.Title_DENConverter = new kj.a();
        this.Title_VTNConverter = new kj.a();
        this.Title_TCHNConverter = new kj.a();
        this.Title_CHNConverter = new kj.a();
        this.PublishDateConverter = new kj.a();
        this.CreateDateConverter = new kj.a();
        this.TipsIdsConverter = new kj.a();
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.v("CREATE TABLE ", z11 ? "IF NOT EXISTS " : BuildConfig.VERSION_NAME, "\"PdLesson\" (\"ID\" TEXT PRIMARY KEY NOT NULL ,\"Lan\" TEXT,\"LessonId\" INTEGER,\"Title\" TEXT,\"Tags\" TEXT,\"Category\" TEXT,\"Difficuty\" TEXT,\"Title_ENG\" TEXT,\"Title_JPN\" TEXT,\"Title_KRN\" TEXT,\"Title_FRN\" TEXT,\"Title_DEN\" TEXT,\"Title_VTN\" TEXT,\"Title_TCHN\" TEXT,\"Title_CHN\" TEXT,\"PublishDate\" TEXT,\"CreateDate\" TEXT,\"Version\" INTEGER,\"TipsIds\" TEXT);", aVar);
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z11) {
        com.google.android.material.datepicker.d.x(new StringBuilder("DROP TABLE "), z11 ? "IF EXISTS " : BuildConfig.VERSION_NAME, "\"PdLesson\"", aVar);
    }

    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    @Override // org.greenrobot.greendao.a
    public String getKey(PdLesson pdLesson) {
        if (pdLesson != null) {
            return pdLesson.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(PdLesson pdLesson) {
        return pdLesson.getId() != null;
    }

    @Override // org.greenrobot.greendao.a
    public String readKey(Cursor cursor, int i11) {
        if (cursor.isNull(i11)) {
            return null;
        }
        return cursor.getString(i11);
    }

    @Override // org.greenrobot.greendao.a
    public final String updateKeyAfterInsert(PdLesson pdLesson, long j11) {
        return pdLesson.getId();
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(org.greenrobot.greendao.database.d dVar, PdLesson pdLesson) {
        dVar.f();
        String id2 = pdLesson.getId();
        if (id2 != null) {
            dVar.l(1, id2);
        }
        String lan = pdLesson.getLan();
        if (lan != null) {
            dVar.l(2, lan);
        }
        Long lessonId = pdLesson.getLessonId();
        if (lessonId != null) {
            dVar.g(3, lessonId.longValue());
        }
        String title = pdLesson.getTitle();
        if (title != null) {
            com.google.android.material.datepicker.d.A(this.TitleConverter, title, dVar, 4);
        }
        String tags = pdLesson.getTags();
        if (tags != null) {
            com.google.android.material.datepicker.d.A(this.TagsConverter, tags, dVar, 5);
        }
        String category = pdLesson.getCategory();
        if (category != null) {
            com.google.android.material.datepicker.d.A(this.CategoryConverter, category, dVar, 6);
        }
        String difficuty = pdLesson.getDifficuty();
        if (difficuty != null) {
            com.google.android.material.datepicker.d.A(this.DifficutyConverter, difficuty, dVar, 7);
        }
        String title_ENG = pdLesson.getTitle_ENG();
        if (title_ENG != null) {
            com.google.android.material.datepicker.d.A(this.Title_ENGConverter, title_ENG, dVar, 8);
        }
        String title_JPN = pdLesson.getTitle_JPN();
        if (title_JPN != null) {
            com.google.android.material.datepicker.d.A(this.Title_JPNConverter, title_JPN, dVar, 9);
        }
        String title_KRN = pdLesson.getTitle_KRN();
        if (title_KRN != null) {
            com.google.android.material.datepicker.d.A(this.Title_KRNConverter, title_KRN, dVar, 10);
        }
        String title_FRN = pdLesson.getTitle_FRN();
        if (title_FRN != null) {
            com.google.android.material.datepicker.d.A(this.Title_FRNConverter, title_FRN, dVar, 11);
        }
        String title_DEN = pdLesson.getTitle_DEN();
        if (title_DEN != null) {
            com.google.android.material.datepicker.d.A(this.Title_DENConverter, title_DEN, dVar, 12);
        }
        String title_VTN = pdLesson.getTitle_VTN();
        if (title_VTN != null) {
            com.google.android.material.datepicker.d.A(this.Title_VTNConverter, title_VTN, dVar, 13);
        }
        String title_TCHN = pdLesson.getTitle_TCHN();
        if (title_TCHN != null) {
            com.google.android.material.datepicker.d.A(this.Title_TCHNConverter, title_TCHN, dVar, 14);
        }
        String title_CHN = pdLesson.getTitle_CHN();
        if (title_CHN != null) {
            com.google.android.material.datepicker.d.A(this.Title_CHNConverter, title_CHN, dVar, 15);
        }
        String publishDate = pdLesson.getPublishDate();
        if (publishDate != null) {
            com.google.android.material.datepicker.d.A(this.PublishDateConverter, publishDate, dVar, 16);
        }
        String createDate = pdLesson.getCreateDate();
        if (createDate != null) {
            com.google.android.material.datepicker.d.A(this.CreateDateConverter, createDate, dVar, 17);
        }
        Long version = pdLesson.getVersion();
        if (version != null) {
            dVar.g(18, version.longValue());
        }
        String tipsIds = pdLesson.getTipsIds();
        if (tipsIds != null) {
            com.google.android.material.datepicker.d.A(this.TipsIdsConverter, tipsIds, dVar, 19);
        }
    }

    @Override // org.greenrobot.greendao.a
    public PdLesson readEntity(Cursor cursor, int i11) {
        Long l9;
        String strJ;
        String string = cursor.isNull(i11) ? null : cursor.getString(i11);
        int i12 = i11 + 1;
        String string2 = cursor.isNull(i12) ? null : cursor.getString(i12);
        int i13 = i11 + 2;
        Long lValueOf = cursor.isNull(i13) ? null : Long.valueOf(cursor.getLong(i13));
        int i14 = i11 + 3;
        String strJ2 = cursor.isNull(i14) ? null : com.google.android.material.datepicker.d.j(cursor, i14, this.TitleConverter);
        int i15 = i11 + 4;
        String strJ3 = cursor.isNull(i15) ? null : com.google.android.material.datepicker.d.j(cursor, i15, this.TagsConverter);
        int i16 = i11 + 5;
        String strJ4 = cursor.isNull(i16) ? null : com.google.android.material.datepicker.d.j(cursor, i16, this.CategoryConverter);
        int i17 = i11 + 6;
        String strJ5 = cursor.isNull(i17) ? null : com.google.android.material.datepicker.d.j(cursor, i17, this.DifficutyConverter);
        int i18 = i11 + 7;
        String strJ6 = cursor.isNull(i18) ? null : com.google.android.material.datepicker.d.j(cursor, i18, this.Title_ENGConverter);
        int i19 = i11 + 8;
        String strJ7 = cursor.isNull(i19) ? null : com.google.android.material.datepicker.d.j(cursor, i19, this.Title_JPNConverter);
        int i21 = i11 + 9;
        String strJ8 = cursor.isNull(i21) ? null : com.google.android.material.datepicker.d.j(cursor, i21, this.Title_KRNConverter);
        int i22 = i11 + 10;
        String strJ9 = cursor.isNull(i22) ? null : com.google.android.material.datepicker.d.j(cursor, i22, this.Title_FRNConverter);
        int i23 = i11 + 11;
        String strJ10 = cursor.isNull(i23) ? null : com.google.android.material.datepicker.d.j(cursor, i23, this.Title_DENConverter);
        int i24 = i11 + 12;
        String strJ11 = cursor.isNull(i24) ? null : com.google.android.material.datepicker.d.j(cursor, i24, this.Title_VTNConverter);
        int i25 = i11 + 13;
        String strJ12 = cursor.isNull(i25) ? null : com.google.android.material.datepicker.d.j(cursor, i25, this.Title_TCHNConverter);
        int i26 = i11 + 14;
        String strJ13 = cursor.isNull(i26) ? null : com.google.android.material.datepicker.d.j(cursor, i26, this.Title_CHNConverter);
        int i27 = i11 + 15;
        String strJ14 = cursor.isNull(i27) ? null : com.google.android.material.datepicker.d.j(cursor, i27, this.PublishDateConverter);
        int i28 = i11 + 16;
        String strJ15 = cursor.isNull(i28) ? null : com.google.android.material.datepicker.d.j(cursor, i28, this.CreateDateConverter);
        int i29 = i11 + 17;
        Long lValueOf2 = cursor.isNull(i29) ? null : Long.valueOf(cursor.getLong(i29));
        String str = strJ15;
        int i30 = i11 + 18;
        if (cursor.isNull(i30)) {
            strJ = null;
            l9 = lValueOf2;
        } else {
            l9 = lValueOf2;
            strJ = com.google.android.material.datepicker.d.j(cursor, i30, this.TipsIdsConverter);
        }
        new PdLesson(string, string2, lValueOf, strJ2, strJ3, strJ4, strJ5, strJ6, strJ7, strJ8, strJ9, strJ10, strJ11, strJ12, strJ13, strJ14, str, l9, strJ);
        return r2;
    }

    public PdLessonDao(j10.a aVar) {
        super(aVar, null);
        this.TitleConverter = new kj.a();
        this.TagsConverter = new kj.a();
        this.CategoryConverter = new kj.a();
        this.DifficutyConverter = new kj.a();
        this.Title_ENGConverter = new kj.a();
        this.Title_JPNConverter = new kj.a();
        this.Title_KRNConverter = new kj.a();
        this.Title_FRNConverter = new kj.a();
        this.Title_DENConverter = new kj.a();
        this.Title_VTNConverter = new kj.a();
        this.Title_TCHNConverter = new kj.a();
        this.Title_CHNConverter = new kj.a();
        this.PublishDateConverter = new kj.a();
        this.CreateDateConverter = new kj.a();
        this.TipsIdsConverter = new kj.a();
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, PdLesson pdLesson, int i11) {
        pdLesson.setId(cursor.isNull(i11) ? null : cursor.getString(i11));
        int i12 = i11 + 1;
        pdLesson.setLan(cursor.isNull(i12) ? null : cursor.getString(i12));
        int i13 = i11 + 2;
        pdLesson.setLessonId(cursor.isNull(i13) ? null : Long.valueOf(cursor.getLong(i13)));
        int i14 = i11 + 3;
        pdLesson.setTitle(cursor.isNull(i14) ? null : com.google.android.material.datepicker.d.j(cursor, i14, this.TitleConverter));
        int i15 = i11 + 4;
        pdLesson.setTags(cursor.isNull(i15) ? null : com.google.android.material.datepicker.d.j(cursor, i15, this.TagsConverter));
        int i16 = i11 + 5;
        pdLesson.setCategory(cursor.isNull(i16) ? null : com.google.android.material.datepicker.d.j(cursor, i16, this.CategoryConverter));
        int i17 = i11 + 6;
        pdLesson.setDifficuty(cursor.isNull(i17) ? null : com.google.android.material.datepicker.d.j(cursor, i17, this.DifficutyConverter));
        int i18 = i11 + 7;
        pdLesson.setTitle_ENG(cursor.isNull(i18) ? null : com.google.android.material.datepicker.d.j(cursor, i18, this.Title_ENGConverter));
        int i19 = i11 + 8;
        pdLesson.setTitle_JPN(cursor.isNull(i19) ? null : com.google.android.material.datepicker.d.j(cursor, i19, this.Title_JPNConverter));
        int i21 = i11 + 9;
        pdLesson.setTitle_KRN(cursor.isNull(i21) ? null : com.google.android.material.datepicker.d.j(cursor, i21, this.Title_KRNConverter));
        int i22 = i11 + 10;
        pdLesson.setTitle_FRN(cursor.isNull(i22) ? null : com.google.android.material.datepicker.d.j(cursor, i22, this.Title_FRNConverter));
        int i23 = i11 + 11;
        pdLesson.setTitle_DEN(cursor.isNull(i23) ? null : com.google.android.material.datepicker.d.j(cursor, i23, this.Title_DENConverter));
        int i24 = i11 + 12;
        pdLesson.setTitle_VTN(cursor.isNull(i24) ? null : com.google.android.material.datepicker.d.j(cursor, i24, this.Title_VTNConverter));
        int i25 = i11 + 13;
        pdLesson.setTitle_TCHN(cursor.isNull(i25) ? null : com.google.android.material.datepicker.d.j(cursor, i25, this.Title_TCHNConverter));
        int i26 = i11 + 14;
        pdLesson.setTitle_CHN(cursor.isNull(i26) ? null : com.google.android.material.datepicker.d.j(cursor, i26, this.Title_CHNConverter));
        int i27 = i11 + 15;
        pdLesson.setPublishDate(cursor.isNull(i27) ? null : com.google.android.material.datepicker.d.j(cursor, i27, this.PublishDateConverter));
        int i28 = i11 + 16;
        pdLesson.setCreateDate(cursor.isNull(i28) ? null : com.google.android.material.datepicker.d.j(cursor, i28, this.CreateDateConverter));
        int i29 = i11 + 17;
        pdLesson.setVersion(cursor.isNull(i29) ? null : Long.valueOf(cursor.getLong(i29)));
        int i30 = i11 + 18;
        pdLesson.setTipsIds(cursor.isNull(i30) ? null : com.google.android.material.datepicker.d.j(cursor, i30, this.TipsIdsConverter));
    }

    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, PdLesson pdLesson) {
        sQLiteStatement.clearBindings();
        String id2 = pdLesson.getId();
        if (id2 != null) {
            sQLiteStatement.bindString(1, id2);
        }
        String lan = pdLesson.getLan();
        if (lan != null) {
            sQLiteStatement.bindString(2, lan);
        }
        Long lessonId = pdLesson.getLessonId();
        if (lessonId != null) {
            sQLiteStatement.bindLong(3, lessonId.longValue());
        }
        String title = pdLesson.getTitle();
        if (title != null) {
            com.google.android.material.datepicker.d.z(this.TitleConverter, title, sQLiteStatement, 4);
        }
        String tags = pdLesson.getTags();
        if (tags != null) {
            com.google.android.material.datepicker.d.z(this.TagsConverter, tags, sQLiteStatement, 5);
        }
        String category = pdLesson.getCategory();
        if (category != null) {
            com.google.android.material.datepicker.d.z(this.CategoryConverter, category, sQLiteStatement, 6);
        }
        String difficuty = pdLesson.getDifficuty();
        if (difficuty != null) {
            com.google.android.material.datepicker.d.z(this.DifficutyConverter, difficuty, sQLiteStatement, 7);
        }
        String title_ENG = pdLesson.getTitle_ENG();
        if (title_ENG != null) {
            com.google.android.material.datepicker.d.z(this.Title_ENGConverter, title_ENG, sQLiteStatement, 8);
        }
        String title_JPN = pdLesson.getTitle_JPN();
        if (title_JPN != null) {
            com.google.android.material.datepicker.d.z(this.Title_JPNConverter, title_JPN, sQLiteStatement, 9);
        }
        String title_KRN = pdLesson.getTitle_KRN();
        if (title_KRN != null) {
            com.google.android.material.datepicker.d.z(this.Title_KRNConverter, title_KRN, sQLiteStatement, 10);
        }
        String title_FRN = pdLesson.getTitle_FRN();
        if (title_FRN != null) {
            com.google.android.material.datepicker.d.z(this.Title_FRNConverter, title_FRN, sQLiteStatement, 11);
        }
        String title_DEN = pdLesson.getTitle_DEN();
        if (title_DEN != null) {
            com.google.android.material.datepicker.d.z(this.Title_DENConverter, title_DEN, sQLiteStatement, 12);
        }
        String title_VTN = pdLesson.getTitle_VTN();
        if (title_VTN != null) {
            com.google.android.material.datepicker.d.z(this.Title_VTNConverter, title_VTN, sQLiteStatement, 13);
        }
        String title_TCHN = pdLesson.getTitle_TCHN();
        if (title_TCHN != null) {
            com.google.android.material.datepicker.d.z(this.Title_TCHNConverter, title_TCHN, sQLiteStatement, 14);
        }
        String title_CHN = pdLesson.getTitle_CHN();
        if (title_CHN != null) {
            com.google.android.material.datepicker.d.z(this.Title_CHNConverter, title_CHN, sQLiteStatement, 15);
        }
        String publishDate = pdLesson.getPublishDate();
        if (publishDate != null) {
            com.google.android.material.datepicker.d.z(this.PublishDateConverter, publishDate, sQLiteStatement, 16);
        }
        String createDate = pdLesson.getCreateDate();
        if (createDate != null) {
            com.google.android.material.datepicker.d.z(this.CreateDateConverter, createDate, sQLiteStatement, 17);
        }
        Long version = pdLesson.getVersion();
        if (version != null) {
            sQLiteStatement.bindLong(18, version.longValue());
        }
        String tipsIds = pdLesson.getTipsIds();
        if (tipsIds != null) {
            com.google.android.material.datepicker.d.z(this.TipsIdsConverter, tipsIds, sQLiteStatement, 19);
        }
    }
}
