package com.lingo.lingoskill.object;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import org.greenrobot.greendao.b;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.database.g;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class DaoMaster extends b {
    public static final int SCHEMA_VERSION = 31;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class DevOpenHelper extends OpenHelper {
        public DevOpenHelper(Context context, String str) {
            super(context, str);
        }

        @Override // org.greenrobot.greendao.database.c
        public void onUpgrade(org.greenrobot.greendao.database.a aVar, int i11, int i12) {
            DaoMaster.dropAllTables(aVar, true);
            onCreate(aVar);
        }

        public DevOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory) {
            super(context, str, cursorFactory);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class OpenHelper extends c {
        public OpenHelper(Context context, String str) {
            super(context, str, null);
        }

        @Override // org.greenrobot.greendao.database.c
        public void onCreate(org.greenrobot.greendao.database.a aVar) {
            DaoMaster.createAllTables(aVar, false);
        }

        public OpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory) {
            super(context, str, cursorFactory);
        }
    }

    public DaoMaster(SQLiteDatabase sQLiteDatabase) {
        this(new g(sQLiteDatabase));
    }

    public static void createAllTables(org.greenrobot.greendao.database.a aVar, boolean z11) {
        AchievementDao.createTable(aVar, z11);
        AckFavDao.createTable(aVar, z11);
        BillingStatusDao.createTable(aVar, z11);
        GameWordStatusDao.createTable(aVar, z11);
        KanjiFavDao.createTable(aVar, z11);
        LanCustomInfoDao.createTable(aVar, z11);
        LanguageItemDao.createTable(aVar, z11);
        LanguageTransVersionDao.createTable(aVar, z11);
        LoginHistoryDao.createTable(aVar, z11);
        PdLessonDao.createTable(aVar, z11);
        PdLessonDlVersionDao.createTable(aVar, z11);
        PdLessonFavDao.createTable(aVar, z11);
        PdLessonLearnIndexDao.createTable(aVar, z11);
        PdSentenceDao.createTable(aVar, z11);
        PdTipsDao.createTable(aVar, z11);
        PdTipsFavDao.createTable(aVar, z11);
        PdWordDao.createTable(aVar, z11);
        PdWordFavDao.createTable(aVar, z11);
        ReviewNewDao.createTable(aVar, z11);
        ScFavDao.createTable(aVar, z11);
        ScFavNewDao.createTable(aVar, z11);
        UnitFinishStatusDao.createTable(aVar, z11);
    }

    public static void dropAllTables(org.greenrobot.greendao.database.a aVar, boolean z11) {
        AchievementDao.dropTable(aVar, z11);
        AckFavDao.dropTable(aVar, z11);
        BillingStatusDao.dropTable(aVar, z11);
        GameWordStatusDao.dropTable(aVar, z11);
        KanjiFavDao.dropTable(aVar, z11);
        LanCustomInfoDao.dropTable(aVar, z11);
        LanguageItemDao.dropTable(aVar, z11);
        LanguageTransVersionDao.dropTable(aVar, z11);
        LoginHistoryDao.dropTable(aVar, z11);
        PdLessonDao.dropTable(aVar, z11);
        PdLessonDlVersionDao.dropTable(aVar, z11);
        PdLessonFavDao.dropTable(aVar, z11);
        PdLessonLearnIndexDao.dropTable(aVar, z11);
        PdSentenceDao.dropTable(aVar, z11);
        PdTipsDao.dropTable(aVar, z11);
        PdTipsFavDao.dropTable(aVar, z11);
        PdWordDao.dropTable(aVar, z11);
        PdWordFavDao.dropTable(aVar, z11);
        ReviewNewDao.dropTable(aVar, z11);
        ScFavDao.dropTable(aVar, z11);
        ScFavNewDao.dropTable(aVar, z11);
        UnitFinishStatusDao.dropTable(aVar, z11);
    }

    public static DaoSession newDevSession(Context context, String str) {
        return new DaoMaster(new DevOpenHelper(context, str).getWritableDb()).m210newSession();
    }

    public DaoMaster(org.greenrobot.greendao.database.a aVar) {
        super(aVar);
        registerDaoClass(ARCharDao.class);
        registerDaoClass(AchievementDao.class);
        registerDaoClass(AckDao.class);
        registerDaoClass(AckFavDao.class);
        registerDaoClass(BillingStatusDao.class);
        registerDaoClass(GameWordStatusDao.class);
        registerDaoClass(HwCharGroupDao.class);
        registerDaoClass(HwCharPartDao.class);
        registerDaoClass(HwCharacterDao.class);
        registerDaoClass(HwTCharPartDao.class);
        registerDaoClass(JPCharDao.class);
        registerDaoClass(JPCharPartDao.class);
        registerDaoClass(KOCharDao.class);
        registerDaoClass(KOCharPartDao.class);
        registerDaoClass(KOCharZhuyinDao.class);
        registerDaoClass(KanjiFavDao.class);
        registerDaoClass(LDCharacterDao.class);
        registerDaoClass(LanCustomInfoDao.class);
        registerDaoClass(LanguageItemDao.class);
        registerDaoClass(LanguageTransVersionDao.class);
        registerDaoClass(LessonDao.class);
        registerDaoClass(LevelDao.class);
        registerDaoClass(LoginHistoryDao.class);
        registerDaoClass(Model_Sentence_000Dao.class);
        registerDaoClass(Model_Sentence_010Dao.class);
        registerDaoClass(Model_Sentence_020Dao.class);
        registerDaoClass(Model_Sentence_030Dao.class);
        registerDaoClass(Model_Sentence_040Dao.class);
        registerDaoClass(Model_Sentence_050Dao.class);
        registerDaoClass(Model_Sentence_060Dao.class);
        registerDaoClass(Model_Sentence_070Dao.class);
        registerDaoClass(Model_Sentence_080Dao.class);
        registerDaoClass(Model_Sentence_090Dao.class);
        registerDaoClass(Model_Sentence_100Dao.class);
        registerDaoClass(Model_Sentence_QADao.class);
        registerDaoClass(Model_Word_010Dao.class);
        registerDaoClass(PdLessonDao.class);
        registerDaoClass(PdLessonDlVersionDao.class);
        registerDaoClass(PdLessonFavDao.class);
        registerDaoClass(PdLessonLearnIndexDao.class);
        registerDaoClass(PdSentenceDao.class);
        registerDaoClass(PdTipsDao.class);
        registerDaoClass(PdTipsFavDao.class);
        registerDaoClass(PdWordDao.class);
        registerDaoClass(PdWordFavDao.class);
        registerDaoClass(PhraseDao.class);
        registerDaoClass(ReviewNewDao.class);
        registerDaoClass(ReviewSpDao.class);
        registerDaoClass(ScFavDao.class);
        registerDaoClass(ScFavNewDao.class);
        registerDaoClass(ScSubCateDao.class);
        registerDaoClass(SentenceDao.class);
        registerDaoClass(TravelCategoryDao.class);
        registerDaoClass(TravelPhraseDao.class);
        registerDaoClass(UnitDao.class);
        registerDaoClass(UnitFinishStatusDao.class);
        registerDaoClass(WordDao.class);
        registerDaoClass(YinTuDao.class);
        registerDaoClass(YouYinDao.class);
        registerDaoClass(ZhuoYinDao.class);
    }

    /* JADX INFO: renamed from: newSession, reason: merged with bridge method [inline-methods] */
    public DaoSession m210newSession() {
        return new DaoSession(this.f45721db, i10.c.Session, this.daoConfigMap);
    }

    /* JADX INFO: renamed from: newSession, reason: merged with bridge method [inline-methods] */
    public DaoSession m211newSession(i10.c cVar) {
        return new DaoSession(this.f45721db, cVar, this.daoConfigMap);
    }
}
