package ij;

import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.AchievementDao;
import com.lingo.lingoskill.object.AckFavDao;
import com.lingo.lingoskill.object.BillingStatusDao;
import com.lingo.lingoskill.object.DaoMaster;
import com.lingo.lingoskill.object.DaoSession;
import com.lingo.lingoskill.object.GameWordStatusDao;
import com.lingo.lingoskill.object.KanjiFavDao;
import com.lingo.lingoskill.object.LanCustomInfoDao;
import com.lingo.lingoskill.object.LanguageItemDao;
import com.lingo.lingoskill.object.LanguageTransVersionDao;
import com.lingo.lingoskill.object.LoginHistoryDao;
import com.lingo.lingoskill.object.PdLessonDao;
import com.lingo.lingoskill.object.PdLessonDlVersionDao;
import com.lingo.lingoskill.object.PdLessonFavDao;
import com.lingo.lingoskill.object.PdLessonLearnIndexDao;
import com.lingo.lingoskill.object.PdSentenceDao;
import com.lingo.lingoskill.object.PdTipsDao;
import com.lingo.lingoskill.object.PdTipsFavDao;
import com.lingo.lingoskill.object.PdWordDao;
import com.lingo.lingoskill.object.PdWordFavDao;
import com.lingo.lingoskill.object.ReviewNewDao;
import com.lingo.lingoskill.object.ScFavDao;
import com.lingo.lingoskill.object.ScFavNewDao;
import com.lingo.lingoskill.object.UnitFinishStatusDao;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static n f34440v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DaoSession f34441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LanguageItemDao f34442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScFavDao f34443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AchievementDao f34444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LanguageTransVersionDao f34445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LanCustomInfoDao f34446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AckFavDao f34447g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ReviewNewDao f34448h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final KanjiFavDao f34449i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ScFavNewDao f34450j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final PdLessonDao f34451k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PdWordDao f34452l;
    public final PdSentenceDao m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final PdTipsDao f34453n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final GameWordStatusDao f34454o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PdLessonFavDao f34455p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final PdWordFavDao f34456q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final PdTipsFavDao f34457r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final PdLessonDlVersionDao f34458s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final PdLessonLearnIndexDao f34459t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final UnitFinishStatusDao f34460u;

    public n(LingoSkillApplication lingoSkillApplication) {
        DaoMaster daoMaster = new DaoMaster(new k(lingoSkillApplication, "localData.db").getWritableDatabase());
        DaoSession daoSessionNewSession = daoMaster.m210newSession();
        kotlin.jvm.internal.m.e(daoSessionNewSession, "newSession(...)");
        this.f34441a = daoSessionNewSession;
        daoSessionNewSession.clear();
        org.greenrobot.greendao.database.a database = daoMaster.getDatabase();
        kotlin.jvm.internal.m.e(database, "getDatabase(...)");
        PdTipsFavDao.createTable(database, true);
        PdSentenceDao.createTable(database, true);
        PdWordFavDao.createTable(database, true);
        LanguageItemDao.createTable(database, true);
        PdWordDao.createTable(database, true);
        LanCustomInfoDao.createTable(database, true);
        GameWordStatusDao.createTable(database, true);
        ReviewNewDao.createTable(database, true);
        BillingStatusDao.createTable(database, true);
        PdTipsDao.createTable(database, true);
        LanguageTransVersionDao.createTable(database, true);
        ScFavDao.createTable(database, true);
        PdLessonDlVersionDao.createTable(database, true);
        PdLessonLearnIndexDao.createTable(database, true);
        PdLessonFavDao.createTable(database, true);
        AckFavDao.createTable(database, true);
        PdLessonDao.createTable(database, true);
        AchievementDao.createTable(database, true);
        KanjiFavDao.createTable(database, true);
        ScFavNewDao.createTable(database, true);
        UnitFinishStatusDao.createTable(database, true);
        LoginHistoryDao.createTable(database, true);
        LanguageItemDao languageItemDao = daoSessionNewSession.getLanguageItemDao();
        kotlin.jvm.internal.m.e(languageItemDao, "getLanguageItemDao(...)");
        this.f34442b = languageItemDao;
        ScFavDao scFavDao = daoSessionNewSession.getScFavDao();
        kotlin.jvm.internal.m.e(scFavDao, "getScFavDao(...)");
        this.f34443c = scFavDao;
        AchievementDao achievementDao = daoSessionNewSession.getAchievementDao();
        kotlin.jvm.internal.m.e(achievementDao, "getAchievementDao(...)");
        this.f34444d = achievementDao;
        LanguageTransVersionDao languageTransVersionDao = daoSessionNewSession.getLanguageTransVersionDao();
        kotlin.jvm.internal.m.e(languageTransVersionDao, "getLanguageTransVersionDao(...)");
        this.f34445e = languageTransVersionDao;
        kotlin.jvm.internal.m.e(daoSessionNewSession.getBillingStatusDao(), "getBillingStatusDao(...)");
        LanCustomInfoDao lanCustomInfoDao = daoSessionNewSession.getLanCustomInfoDao();
        kotlin.jvm.internal.m.e(lanCustomInfoDao, "getLanCustomInfoDao(...)");
        this.f34446f = lanCustomInfoDao;
        AckFavDao ackFavDao = daoSessionNewSession.getAckFavDao();
        kotlin.jvm.internal.m.e(ackFavDao, "getAckFavDao(...)");
        this.f34447g = ackFavDao;
        ReviewNewDao reviewNewDao = daoSessionNewSession.getReviewNewDao();
        kotlin.jvm.internal.m.e(reviewNewDao, "getReviewNewDao(...)");
        this.f34448h = reviewNewDao;
        KanjiFavDao kanjiFavDao = daoSessionNewSession.getKanjiFavDao();
        kotlin.jvm.internal.m.e(kanjiFavDao, "getKanjiFavDao(...)");
        this.f34449i = kanjiFavDao;
        ScFavNewDao scFavNewDao = daoSessionNewSession.getScFavNewDao();
        kotlin.jvm.internal.m.e(scFavNewDao, "getScFavNewDao(...)");
        this.f34450j = scFavNewDao;
        PdLessonDao pdLessonDao = daoSessionNewSession.getPdLessonDao();
        kotlin.jvm.internal.m.e(pdLessonDao, "getPdLessonDao(...)");
        this.f34451k = pdLessonDao;
        PdWordDao pdWordDao = daoSessionNewSession.getPdWordDao();
        kotlin.jvm.internal.m.e(pdWordDao, "getPdWordDao(...)");
        this.f34452l = pdWordDao;
        PdSentenceDao pdSentenceDao = daoSessionNewSession.getPdSentenceDao();
        kotlin.jvm.internal.m.e(pdSentenceDao, "getPdSentenceDao(...)");
        this.m = pdSentenceDao;
        PdTipsDao pdTipsDao = daoSessionNewSession.getPdTipsDao();
        kotlin.jvm.internal.m.e(pdTipsDao, "getPdTipsDao(...)");
        this.f34453n = pdTipsDao;
        GameWordStatusDao gameWordStatusDao = daoSessionNewSession.getGameWordStatusDao();
        kotlin.jvm.internal.m.e(gameWordStatusDao, "getGameWordStatusDao(...)");
        this.f34454o = gameWordStatusDao;
        PdLessonFavDao pdLessonFavDao = daoSessionNewSession.getPdLessonFavDao();
        kotlin.jvm.internal.m.e(pdLessonFavDao, "getPdLessonFavDao(...)");
        this.f34455p = pdLessonFavDao;
        PdWordFavDao pdWordFavDao = daoSessionNewSession.getPdWordFavDao();
        kotlin.jvm.internal.m.e(pdWordFavDao, "getPdWordFavDao(...)");
        this.f34456q = pdWordFavDao;
        PdTipsFavDao pdTipsFavDao = daoSessionNewSession.getPdTipsFavDao();
        kotlin.jvm.internal.m.e(pdTipsFavDao, "getPdTipsFavDao(...)");
        this.f34457r = pdTipsFavDao;
        PdLessonDlVersionDao pdLessonDlVersionDao = daoSessionNewSession.getPdLessonDlVersionDao();
        kotlin.jvm.internal.m.e(pdLessonDlVersionDao, "getPdLessonDlVersionDao(...)");
        this.f34458s = pdLessonDlVersionDao;
        PdLessonLearnIndexDao pdLessonLearnIndexDao = daoSessionNewSession.getPdLessonLearnIndexDao();
        kotlin.jvm.internal.m.e(pdLessonLearnIndexDao, "getPdLessonLearnIndexDao(...)");
        this.f34459t = pdLessonLearnIndexDao;
        UnitFinishStatusDao unitFinishStatusDao = daoSessionNewSession.getUnitFinishStatusDao();
        kotlin.jvm.internal.m.e(unitFinishStatusDao, "getUnitFinishStatusDao(...)");
        this.f34460u = unitFinishStatusDao;
        kotlin.jvm.internal.m.e(daoSessionNewSession.getLoginHistoryDao(), "getLoginHistoryDao(...)");
    }
}
