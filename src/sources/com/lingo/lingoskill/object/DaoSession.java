package com.lingo.lingoskill.object;

import com.google.android.material.datepicker.d;
import java.util.Map;
import org.greenrobot.greendao.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class DaoSession extends c {
    private final ARCharDao aRCharDao;
    private final j10.a aRCharDaoConfig;
    private final AchievementDao achievementDao;
    private final j10.a achievementDaoConfig;
    private final AckDao ackDao;
    private final j10.a ackDaoConfig;
    private final AckFavDao ackFavDao;
    private final j10.a ackFavDaoConfig;
    private final BillingStatusDao billingStatusDao;
    private final j10.a billingStatusDaoConfig;
    private final GameWordStatusDao gameWordStatusDao;
    private final j10.a gameWordStatusDaoConfig;
    private final HwCharGroupDao hwCharGroupDao;
    private final j10.a hwCharGroupDaoConfig;
    private final HwCharPartDao hwCharPartDao;
    private final j10.a hwCharPartDaoConfig;
    private final HwCharacterDao hwCharacterDao;
    private final j10.a hwCharacterDaoConfig;
    private final HwTCharPartDao hwTCharPartDao;
    private final j10.a hwTCharPartDaoConfig;
    private final JPCharDao jPCharDao;
    private final j10.a jPCharDaoConfig;
    private final JPCharPartDao jPCharPartDao;
    private final j10.a jPCharPartDaoConfig;
    private final KOCharDao kOCharDao;
    private final j10.a kOCharDaoConfig;
    private final KOCharPartDao kOCharPartDao;
    private final j10.a kOCharPartDaoConfig;
    private final KOCharZhuyinDao kOCharZhuyinDao;
    private final j10.a kOCharZhuyinDaoConfig;
    private final KanjiFavDao kanjiFavDao;
    private final j10.a kanjiFavDaoConfig;
    private final LDCharacterDao lDCharacterDao;
    private final j10.a lDCharacterDaoConfig;
    private final LanCustomInfoDao lanCustomInfoDao;
    private final j10.a lanCustomInfoDaoConfig;
    private final LanguageItemDao languageItemDao;
    private final j10.a languageItemDaoConfig;
    private final LanguageTransVersionDao languageTransVersionDao;
    private final j10.a languageTransVersionDaoConfig;
    private final LessonDao lessonDao;
    private final j10.a lessonDaoConfig;
    private final LevelDao levelDao;
    private final j10.a levelDaoConfig;
    private final LoginHistoryDao loginHistoryDao;
    private final j10.a loginHistoryDaoConfig;
    private final Model_Sentence_000Dao model_Sentence_000Dao;
    private final j10.a model_Sentence_000DaoConfig;
    private final Model_Sentence_010Dao model_Sentence_010Dao;
    private final j10.a model_Sentence_010DaoConfig;
    private final Model_Sentence_020Dao model_Sentence_020Dao;
    private final j10.a model_Sentence_020DaoConfig;
    private final Model_Sentence_030Dao model_Sentence_030Dao;
    private final j10.a model_Sentence_030DaoConfig;
    private final Model_Sentence_040Dao model_Sentence_040Dao;
    private final j10.a model_Sentence_040DaoConfig;
    private final Model_Sentence_050Dao model_Sentence_050Dao;
    private final j10.a model_Sentence_050DaoConfig;
    private final Model_Sentence_060Dao model_Sentence_060Dao;
    private final j10.a model_Sentence_060DaoConfig;
    private final Model_Sentence_070Dao model_Sentence_070Dao;
    private final j10.a model_Sentence_070DaoConfig;
    private final Model_Sentence_080Dao model_Sentence_080Dao;
    private final j10.a model_Sentence_080DaoConfig;
    private final Model_Sentence_090Dao model_Sentence_090Dao;
    private final j10.a model_Sentence_090DaoConfig;
    private final Model_Sentence_100Dao model_Sentence_100Dao;
    private final j10.a model_Sentence_100DaoConfig;
    private final Model_Sentence_QADao model_Sentence_QADao;
    private final j10.a model_Sentence_QADaoConfig;
    private final Model_Word_010Dao model_Word_010Dao;
    private final j10.a model_Word_010DaoConfig;
    private final PdLessonDao pdLessonDao;
    private final j10.a pdLessonDaoConfig;
    private final PdLessonDlVersionDao pdLessonDlVersionDao;
    private final j10.a pdLessonDlVersionDaoConfig;
    private final PdLessonFavDao pdLessonFavDao;
    private final j10.a pdLessonFavDaoConfig;
    private final PdLessonLearnIndexDao pdLessonLearnIndexDao;
    private final j10.a pdLessonLearnIndexDaoConfig;
    private final PdSentenceDao pdSentenceDao;
    private final j10.a pdSentenceDaoConfig;
    private final PdTipsDao pdTipsDao;
    private final j10.a pdTipsDaoConfig;
    private final PdTipsFavDao pdTipsFavDao;
    private final j10.a pdTipsFavDaoConfig;
    private final PdWordDao pdWordDao;
    private final j10.a pdWordDaoConfig;
    private final PdWordFavDao pdWordFavDao;
    private final j10.a pdWordFavDaoConfig;
    private final PhraseDao phraseDao;
    private final j10.a phraseDaoConfig;
    private final ReviewNewDao reviewNewDao;
    private final j10.a reviewNewDaoConfig;
    private final ReviewSpDao reviewSpDao;
    private final j10.a reviewSpDaoConfig;
    private final ScFavDao scFavDao;
    private final j10.a scFavDaoConfig;
    private final ScFavNewDao scFavNewDao;
    private final j10.a scFavNewDaoConfig;
    private final ScSubCateDao scSubCateDao;
    private final j10.a scSubCateDaoConfig;
    private final SentenceDao sentenceDao;
    private final j10.a sentenceDaoConfig;
    private final TravelCategoryDao travelCategoryDao;
    private final j10.a travelCategoryDaoConfig;
    private final TravelPhraseDao travelPhraseDao;
    private final j10.a travelPhraseDaoConfig;
    private final UnitDao unitDao;
    private final j10.a unitDaoConfig;
    private final UnitFinishStatusDao unitFinishStatusDao;
    private final j10.a unitFinishStatusDaoConfig;
    private final WordDao wordDao;
    private final j10.a wordDaoConfig;
    private final YinTuDao yinTuDao;
    private final j10.a yinTuDaoConfig;
    private final YouYinDao youYinDao;
    private final j10.a youYinDaoConfig;
    private final ZhuoYinDao zhuoYinDao;
    private final j10.a zhuoYinDaoConfig;

    public DaoSession(org.greenrobot.greendao.database.a aVar, i10.c cVar, Map<Class<? extends org.greenrobot.greendao.a>, j10.a> map) {
        super(aVar);
        j10.a aVar2 = map.get(ARCharDao.class);
        j10.a aVarG = d.g(aVar2, aVar2);
        this.aRCharDaoConfig = aVarG;
        aVarG.c(cVar);
        j10.a aVar3 = map.get(AchievementDao.class);
        j10.a aVarG2 = d.g(aVar3, aVar3);
        this.achievementDaoConfig = aVarG2;
        aVarG2.c(cVar);
        j10.a aVar4 = map.get(AckDao.class);
        j10.a aVarG3 = d.g(aVar4, aVar4);
        this.ackDaoConfig = aVarG3;
        aVarG3.c(cVar);
        j10.a aVar5 = map.get(AckFavDao.class);
        j10.a aVarG4 = d.g(aVar5, aVar5);
        this.ackFavDaoConfig = aVarG4;
        aVarG4.c(cVar);
        j10.a aVar6 = map.get(BillingStatusDao.class);
        j10.a aVarG5 = d.g(aVar6, aVar6);
        this.billingStatusDaoConfig = aVarG5;
        aVarG5.c(cVar);
        j10.a aVar7 = map.get(GameWordStatusDao.class);
        j10.a aVarG6 = d.g(aVar7, aVar7);
        this.gameWordStatusDaoConfig = aVarG6;
        aVarG6.c(cVar);
        j10.a aVar8 = map.get(HwCharGroupDao.class);
        j10.a aVarG7 = d.g(aVar8, aVar8);
        this.hwCharGroupDaoConfig = aVarG7;
        aVarG7.c(cVar);
        j10.a aVar9 = map.get(HwCharPartDao.class);
        j10.a aVarG8 = d.g(aVar9, aVar9);
        this.hwCharPartDaoConfig = aVarG8;
        aVarG8.c(cVar);
        j10.a aVar10 = map.get(HwCharacterDao.class);
        j10.a aVarG9 = d.g(aVar10, aVar10);
        this.hwCharacterDaoConfig = aVarG9;
        aVarG9.c(cVar);
        j10.a aVar11 = map.get(HwTCharPartDao.class);
        j10.a aVarG10 = d.g(aVar11, aVar11);
        this.hwTCharPartDaoConfig = aVarG10;
        aVarG10.c(cVar);
        j10.a aVar12 = map.get(JPCharDao.class);
        j10.a aVarG11 = d.g(aVar12, aVar12);
        this.jPCharDaoConfig = aVarG11;
        aVarG11.c(cVar);
        j10.a aVar13 = map.get(JPCharPartDao.class);
        j10.a aVarG12 = d.g(aVar13, aVar13);
        this.jPCharPartDaoConfig = aVarG12;
        aVarG12.c(cVar);
        j10.a aVar14 = map.get(KOCharDao.class);
        j10.a aVarG13 = d.g(aVar14, aVar14);
        this.kOCharDaoConfig = aVarG13;
        aVarG13.c(cVar);
        j10.a aVar15 = map.get(KOCharPartDao.class);
        j10.a aVarG14 = d.g(aVar15, aVar15);
        this.kOCharPartDaoConfig = aVarG14;
        aVarG14.c(cVar);
        j10.a aVar16 = map.get(KOCharZhuyinDao.class);
        j10.a aVarG15 = d.g(aVar16, aVar16);
        this.kOCharZhuyinDaoConfig = aVarG15;
        aVarG15.c(cVar);
        j10.a aVar17 = map.get(KanjiFavDao.class);
        j10.a aVarG16 = d.g(aVar17, aVar17);
        this.kanjiFavDaoConfig = aVarG16;
        aVarG16.c(cVar);
        j10.a aVar18 = map.get(LDCharacterDao.class);
        j10.a aVarG17 = d.g(aVar18, aVar18);
        this.lDCharacterDaoConfig = aVarG17;
        aVarG17.c(cVar);
        j10.a aVar19 = map.get(LanCustomInfoDao.class);
        j10.a aVarG18 = d.g(aVar19, aVar19);
        this.lanCustomInfoDaoConfig = aVarG18;
        aVarG18.c(cVar);
        j10.a aVar20 = map.get(LanguageItemDao.class);
        j10.a aVarG19 = d.g(aVar20, aVar20);
        this.languageItemDaoConfig = aVarG19;
        aVarG19.c(cVar);
        j10.a aVar21 = map.get(LanguageTransVersionDao.class);
        j10.a aVarG20 = d.g(aVar21, aVar21);
        this.languageTransVersionDaoConfig = aVarG20;
        aVarG20.c(cVar);
        j10.a aVar22 = map.get(LessonDao.class);
        j10.a aVarG21 = d.g(aVar22, aVar22);
        this.lessonDaoConfig = aVarG21;
        aVarG21.c(cVar);
        j10.a aVar23 = map.get(LevelDao.class);
        j10.a aVarG22 = d.g(aVar23, aVar23);
        this.levelDaoConfig = aVarG22;
        aVarG22.c(cVar);
        j10.a aVar24 = map.get(LoginHistoryDao.class);
        j10.a aVarG23 = d.g(aVar24, aVar24);
        this.loginHistoryDaoConfig = aVarG23;
        aVarG23.c(cVar);
        j10.a aVar25 = map.get(Model_Sentence_000Dao.class);
        j10.a aVarG24 = d.g(aVar25, aVar25);
        this.model_Sentence_000DaoConfig = aVarG24;
        aVarG24.c(cVar);
        j10.a aVar26 = map.get(Model_Sentence_010Dao.class);
        j10.a aVarG25 = d.g(aVar26, aVar26);
        this.model_Sentence_010DaoConfig = aVarG25;
        aVarG25.c(cVar);
        j10.a aVar27 = map.get(Model_Sentence_020Dao.class);
        j10.a aVarG26 = d.g(aVar27, aVar27);
        this.model_Sentence_020DaoConfig = aVarG26;
        aVarG26.c(cVar);
        j10.a aVar28 = map.get(Model_Sentence_030Dao.class);
        j10.a aVarG27 = d.g(aVar28, aVar28);
        this.model_Sentence_030DaoConfig = aVarG27;
        aVarG27.c(cVar);
        j10.a aVar29 = map.get(Model_Sentence_040Dao.class);
        j10.a aVarG28 = d.g(aVar29, aVar29);
        this.model_Sentence_040DaoConfig = aVarG28;
        aVarG28.c(cVar);
        j10.a aVar30 = map.get(Model_Sentence_050Dao.class);
        j10.a aVarG29 = d.g(aVar30, aVar30);
        this.model_Sentence_050DaoConfig = aVarG29;
        aVarG29.c(cVar);
        j10.a aVar31 = map.get(Model_Sentence_060Dao.class);
        j10.a aVarG30 = d.g(aVar31, aVar31);
        this.model_Sentence_060DaoConfig = aVarG30;
        aVarG30.c(cVar);
        j10.a aVar32 = map.get(Model_Sentence_070Dao.class);
        j10.a aVarG31 = d.g(aVar32, aVar32);
        this.model_Sentence_070DaoConfig = aVarG31;
        aVarG31.c(cVar);
        j10.a aVar33 = map.get(Model_Sentence_080Dao.class);
        j10.a aVarG32 = d.g(aVar33, aVar33);
        this.model_Sentence_080DaoConfig = aVarG32;
        aVarG32.c(cVar);
        j10.a aVar34 = map.get(Model_Sentence_090Dao.class);
        j10.a aVarG33 = d.g(aVar34, aVar34);
        this.model_Sentence_090DaoConfig = aVarG33;
        aVarG33.c(cVar);
        j10.a aVar35 = map.get(Model_Sentence_100Dao.class);
        j10.a aVarG34 = d.g(aVar35, aVar35);
        this.model_Sentence_100DaoConfig = aVarG34;
        aVarG34.c(cVar);
        j10.a aVar36 = map.get(Model_Sentence_QADao.class);
        j10.a aVarG35 = d.g(aVar36, aVar36);
        this.model_Sentence_QADaoConfig = aVarG35;
        aVarG35.c(cVar);
        j10.a aVar37 = map.get(Model_Word_010Dao.class);
        j10.a aVarG36 = d.g(aVar37, aVar37);
        this.model_Word_010DaoConfig = aVarG36;
        aVarG36.c(cVar);
        j10.a aVar38 = map.get(PdLessonDao.class);
        j10.a aVarG37 = d.g(aVar38, aVar38);
        this.pdLessonDaoConfig = aVarG37;
        aVarG37.c(cVar);
        j10.a aVar39 = map.get(PdLessonDlVersionDao.class);
        j10.a aVarG38 = d.g(aVar39, aVar39);
        this.pdLessonDlVersionDaoConfig = aVarG38;
        aVarG38.c(cVar);
        j10.a aVar40 = map.get(PdLessonFavDao.class);
        j10.a aVarG39 = d.g(aVar40, aVar40);
        this.pdLessonFavDaoConfig = aVarG39;
        aVarG39.c(cVar);
        j10.a aVar41 = map.get(PdLessonLearnIndexDao.class);
        j10.a aVarG40 = d.g(aVar41, aVar41);
        this.pdLessonLearnIndexDaoConfig = aVarG40;
        aVarG40.c(cVar);
        j10.a aVar42 = map.get(PdSentenceDao.class);
        j10.a aVarG41 = d.g(aVar42, aVar42);
        this.pdSentenceDaoConfig = aVarG41;
        aVarG41.c(cVar);
        j10.a aVar43 = map.get(PdTipsDao.class);
        j10.a aVarG42 = d.g(aVar43, aVar43);
        this.pdTipsDaoConfig = aVarG42;
        aVarG42.c(cVar);
        j10.a aVar44 = map.get(PdTipsFavDao.class);
        j10.a aVarG43 = d.g(aVar44, aVar44);
        this.pdTipsFavDaoConfig = aVarG43;
        aVarG43.c(cVar);
        j10.a aVar45 = map.get(PdWordDao.class);
        j10.a aVarG44 = d.g(aVar45, aVar45);
        this.pdWordDaoConfig = aVarG44;
        aVarG44.c(cVar);
        j10.a aVar46 = map.get(PdWordFavDao.class);
        j10.a aVarG45 = d.g(aVar46, aVar46);
        this.pdWordFavDaoConfig = aVarG45;
        aVarG45.c(cVar);
        j10.a aVar47 = map.get(PhraseDao.class);
        j10.a aVarG46 = d.g(aVar47, aVar47);
        this.phraseDaoConfig = aVarG46;
        aVarG46.c(cVar);
        j10.a aVar48 = map.get(ReviewNewDao.class);
        j10.a aVarG47 = d.g(aVar48, aVar48);
        this.reviewNewDaoConfig = aVarG47;
        aVarG47.c(cVar);
        j10.a aVar49 = map.get(ReviewSpDao.class);
        j10.a aVarG48 = d.g(aVar49, aVar49);
        this.reviewSpDaoConfig = aVarG48;
        aVarG48.c(cVar);
        j10.a aVar50 = map.get(ScFavDao.class);
        j10.a aVarG49 = d.g(aVar50, aVar50);
        this.scFavDaoConfig = aVarG49;
        aVarG49.c(cVar);
        j10.a aVar51 = map.get(ScFavNewDao.class);
        j10.a aVarG50 = d.g(aVar51, aVar51);
        this.scFavNewDaoConfig = aVarG50;
        aVarG50.c(cVar);
        j10.a aVar52 = map.get(ScSubCateDao.class);
        j10.a aVarG51 = d.g(aVar52, aVar52);
        this.scSubCateDaoConfig = aVarG51;
        aVarG51.c(cVar);
        j10.a aVar53 = map.get(SentenceDao.class);
        j10.a aVarG52 = d.g(aVar53, aVar53);
        this.sentenceDaoConfig = aVarG52;
        aVarG52.c(cVar);
        j10.a aVar54 = map.get(TravelCategoryDao.class);
        j10.a aVarG53 = d.g(aVar54, aVar54);
        this.travelCategoryDaoConfig = aVarG53;
        aVarG53.c(cVar);
        j10.a aVar55 = map.get(TravelPhraseDao.class);
        j10.a aVarG54 = d.g(aVar55, aVar55);
        this.travelPhraseDaoConfig = aVarG54;
        aVarG54.c(cVar);
        j10.a aVar56 = map.get(UnitDao.class);
        j10.a aVarG55 = d.g(aVar56, aVar56);
        this.unitDaoConfig = aVarG55;
        aVarG55.c(cVar);
        j10.a aVar57 = map.get(UnitFinishStatusDao.class);
        j10.a aVarG56 = d.g(aVar57, aVar57);
        this.unitFinishStatusDaoConfig = aVarG56;
        aVarG56.c(cVar);
        j10.a aVar58 = map.get(WordDao.class);
        j10.a aVarG57 = d.g(aVar58, aVar58);
        this.wordDaoConfig = aVarG57;
        aVarG57.c(cVar);
        j10.a aVar59 = map.get(YinTuDao.class);
        j10.a aVarG58 = d.g(aVar59, aVar59);
        this.yinTuDaoConfig = aVarG58;
        aVarG58.c(cVar);
        j10.a aVar60 = map.get(YouYinDao.class);
        j10.a aVarG59 = d.g(aVar60, aVar60);
        this.youYinDaoConfig = aVarG59;
        aVarG59.c(cVar);
        j10.a aVar61 = map.get(ZhuoYinDao.class);
        j10.a aVarG60 = d.g(aVar61, aVar61);
        this.zhuoYinDaoConfig = aVarG60;
        aVarG60.c(cVar);
        ARCharDao aRCharDao = new ARCharDao(aVarG, this);
        this.aRCharDao = aRCharDao;
        AchievementDao achievementDao = new AchievementDao(aVarG2, this);
        this.achievementDao = achievementDao;
        AckDao ackDao = new AckDao(aVarG3, this);
        this.ackDao = ackDao;
        AckFavDao ackFavDao = new AckFavDao(aVarG4, this);
        this.ackFavDao = ackFavDao;
        BillingStatusDao billingStatusDao = new BillingStatusDao(aVarG5, this);
        this.billingStatusDao = billingStatusDao;
        GameWordStatusDao gameWordStatusDao = new GameWordStatusDao(aVarG6, this);
        this.gameWordStatusDao = gameWordStatusDao;
        HwCharGroupDao hwCharGroupDao = new HwCharGroupDao(aVarG7, this);
        this.hwCharGroupDao = hwCharGroupDao;
        HwCharPartDao hwCharPartDao = new HwCharPartDao(aVarG8, this);
        this.hwCharPartDao = hwCharPartDao;
        HwCharacterDao hwCharacterDao = new HwCharacterDao(aVarG9, this);
        this.hwCharacterDao = hwCharacterDao;
        HwTCharPartDao hwTCharPartDao = new HwTCharPartDao(aVarG10, this);
        this.hwTCharPartDao = hwTCharPartDao;
        JPCharDao jPCharDao = new JPCharDao(aVarG11, this);
        this.jPCharDao = jPCharDao;
        JPCharPartDao jPCharPartDao = new JPCharPartDao(aVarG12, this);
        this.jPCharPartDao = jPCharPartDao;
        KOCharDao kOCharDao = new KOCharDao(aVarG13, this);
        this.kOCharDao = kOCharDao;
        KOCharPartDao kOCharPartDao = new KOCharPartDao(aVarG14, this);
        this.kOCharPartDao = kOCharPartDao;
        KOCharZhuyinDao kOCharZhuyinDao = new KOCharZhuyinDao(aVarG15, this);
        this.kOCharZhuyinDao = kOCharZhuyinDao;
        KanjiFavDao kanjiFavDao = new KanjiFavDao(aVarG16, this);
        this.kanjiFavDao = kanjiFavDao;
        LDCharacterDao lDCharacterDao = new LDCharacterDao(aVarG17, this);
        this.lDCharacterDao = lDCharacterDao;
        LanCustomInfoDao lanCustomInfoDao = new LanCustomInfoDao(aVarG18, this);
        this.lanCustomInfoDao = lanCustomInfoDao;
        LanguageItemDao languageItemDao = new LanguageItemDao(aVarG19, this);
        this.languageItemDao = languageItemDao;
        LanguageTransVersionDao languageTransVersionDao = new LanguageTransVersionDao(aVarG20, this);
        this.languageTransVersionDao = languageTransVersionDao;
        LessonDao lessonDao = new LessonDao(aVarG21, this);
        this.lessonDao = lessonDao;
        LevelDao levelDao = new LevelDao(aVarG22, this);
        this.levelDao = levelDao;
        LoginHistoryDao loginHistoryDao = new LoginHistoryDao(aVarG23, this);
        this.loginHistoryDao = loginHistoryDao;
        Model_Sentence_000Dao model_Sentence_000Dao = new Model_Sentence_000Dao(aVarG24, this);
        this.model_Sentence_000Dao = model_Sentence_000Dao;
        Model_Sentence_010Dao model_Sentence_010Dao = new Model_Sentence_010Dao(aVarG25, this);
        this.model_Sentence_010Dao = model_Sentence_010Dao;
        Model_Sentence_020Dao model_Sentence_020Dao = new Model_Sentence_020Dao(aVarG26, this);
        this.model_Sentence_020Dao = model_Sentence_020Dao;
        Model_Sentence_030Dao model_Sentence_030Dao = new Model_Sentence_030Dao(aVarG27, this);
        this.model_Sentence_030Dao = model_Sentence_030Dao;
        Model_Sentence_040Dao model_Sentence_040Dao = new Model_Sentence_040Dao(aVarG28, this);
        this.model_Sentence_040Dao = model_Sentence_040Dao;
        Model_Sentence_050Dao model_Sentence_050Dao = new Model_Sentence_050Dao(aVarG29, this);
        this.model_Sentence_050Dao = model_Sentence_050Dao;
        Model_Sentence_060Dao model_Sentence_060Dao = new Model_Sentence_060Dao(aVarG30, this);
        this.model_Sentence_060Dao = model_Sentence_060Dao;
        Model_Sentence_070Dao model_Sentence_070Dao = new Model_Sentence_070Dao(aVarG31, this);
        this.model_Sentence_070Dao = model_Sentence_070Dao;
        Model_Sentence_080Dao model_Sentence_080Dao = new Model_Sentence_080Dao(aVarG32, this);
        this.model_Sentence_080Dao = model_Sentence_080Dao;
        Model_Sentence_090Dao model_Sentence_090Dao = new Model_Sentence_090Dao(aVarG33, this);
        this.model_Sentence_090Dao = model_Sentence_090Dao;
        Model_Sentence_100Dao model_Sentence_100Dao = new Model_Sentence_100Dao(aVarG34, this);
        this.model_Sentence_100Dao = model_Sentence_100Dao;
        Model_Sentence_QADao model_Sentence_QADao = new Model_Sentence_QADao(aVarG35, this);
        this.model_Sentence_QADao = model_Sentence_QADao;
        Model_Word_010Dao model_Word_010Dao = new Model_Word_010Dao(aVarG36, this);
        this.model_Word_010Dao = model_Word_010Dao;
        PdLessonDao pdLessonDao = new PdLessonDao(aVarG37, this);
        this.pdLessonDao = pdLessonDao;
        PdLessonDlVersionDao pdLessonDlVersionDao = new PdLessonDlVersionDao(aVarG38, this);
        this.pdLessonDlVersionDao = pdLessonDlVersionDao;
        PdLessonFavDao pdLessonFavDao = new PdLessonFavDao(aVarG39, this);
        this.pdLessonFavDao = pdLessonFavDao;
        PdLessonLearnIndexDao pdLessonLearnIndexDao = new PdLessonLearnIndexDao(aVarG40, this);
        this.pdLessonLearnIndexDao = pdLessonLearnIndexDao;
        PdSentenceDao pdSentenceDao = new PdSentenceDao(aVarG41, this);
        this.pdSentenceDao = pdSentenceDao;
        PdTipsDao pdTipsDao = new PdTipsDao(aVarG42, this);
        this.pdTipsDao = pdTipsDao;
        PdTipsFavDao pdTipsFavDao = new PdTipsFavDao(aVarG43, this);
        this.pdTipsFavDao = pdTipsFavDao;
        PdWordDao pdWordDao = new PdWordDao(aVarG44, this);
        this.pdWordDao = pdWordDao;
        PdWordFavDao pdWordFavDao = new PdWordFavDao(aVarG45, this);
        this.pdWordFavDao = pdWordFavDao;
        PhraseDao phraseDao = new PhraseDao(aVarG46, this);
        this.phraseDao = phraseDao;
        ReviewNewDao reviewNewDao = new ReviewNewDao(aVarG47, this);
        this.reviewNewDao = reviewNewDao;
        ReviewSpDao reviewSpDao = new ReviewSpDao(aVarG48, this);
        this.reviewSpDao = reviewSpDao;
        ScFavDao scFavDao = new ScFavDao(aVarG49, this);
        this.scFavDao = scFavDao;
        ScFavNewDao scFavNewDao = new ScFavNewDao(aVarG50, this);
        this.scFavNewDao = scFavNewDao;
        ScSubCateDao scSubCateDao = new ScSubCateDao(aVarG51, this);
        this.scSubCateDao = scSubCateDao;
        SentenceDao sentenceDao = new SentenceDao(aVarG52, this);
        this.sentenceDao = sentenceDao;
        TravelCategoryDao travelCategoryDao = new TravelCategoryDao(aVarG53, this);
        this.travelCategoryDao = travelCategoryDao;
        TravelPhraseDao travelPhraseDao = new TravelPhraseDao(aVarG54, this);
        this.travelPhraseDao = travelPhraseDao;
        UnitDao unitDao = new UnitDao(aVarG55, this);
        this.unitDao = unitDao;
        UnitFinishStatusDao unitFinishStatusDao = new UnitFinishStatusDao(aVarG56, this);
        this.unitFinishStatusDao = unitFinishStatusDao;
        WordDao wordDao = new WordDao(aVarG57, this);
        this.wordDao = wordDao;
        YinTuDao yinTuDao = new YinTuDao(aVarG58, this);
        this.yinTuDao = yinTuDao;
        YouYinDao youYinDao = new YouYinDao(aVarG59, this);
        this.youYinDao = youYinDao;
        ZhuoYinDao zhuoYinDao = new ZhuoYinDao(aVarG60, this);
        this.zhuoYinDao = zhuoYinDao;
        registerDao(ARChar.class, aRCharDao);
        registerDao(Achievement.class, achievementDao);
        registerDao(Ack.class, ackDao);
        registerDao(AckFav.class, ackFavDao);
        registerDao(BillingStatus.class, billingStatusDao);
        registerDao(GameWordStatus.class, gameWordStatusDao);
        registerDao(HwCharGroup.class, hwCharGroupDao);
        registerDao(HwCharPart.class, hwCharPartDao);
        registerDao(HwCharacter.class, hwCharacterDao);
        registerDao(HwTCharPart.class, hwTCharPartDao);
        registerDao(JPChar.class, jPCharDao);
        registerDao(JPCharPart.class, jPCharPartDao);
        registerDao(KOChar.class, kOCharDao);
        registerDao(KOCharPart.class, kOCharPartDao);
        registerDao(KOCharZhuyin.class, kOCharZhuyinDao);
        registerDao(KanjiFav.class, kanjiFavDao);
        registerDao(LDCharacter.class, lDCharacterDao);
        registerDao(LanCustomInfo.class, lanCustomInfoDao);
        registerDao(LanguageItem.class, languageItemDao);
        registerDao(LanguageTransVersion.class, languageTransVersionDao);
        registerDao(Lesson.class, lessonDao);
        registerDao(Level.class, levelDao);
        registerDao(LoginHistory.class, loginHistoryDao);
        registerDao(Model_Sentence_000.class, model_Sentence_000Dao);
        registerDao(Model_Sentence_010.class, model_Sentence_010Dao);
        registerDao(Model_Sentence_020.class, model_Sentence_020Dao);
        registerDao(Model_Sentence_030.class, model_Sentence_030Dao);
        registerDao(Model_Sentence_040.class, model_Sentence_040Dao);
        registerDao(Model_Sentence_050.class, model_Sentence_050Dao);
        registerDao(Model_Sentence_060.class, model_Sentence_060Dao);
        registerDao(Model_Sentence_070.class, model_Sentence_070Dao);
        registerDao(Model_Sentence_080.class, model_Sentence_080Dao);
        registerDao(Model_Sentence_090.class, model_Sentence_090Dao);
        registerDao(Model_Sentence_100.class, model_Sentence_100Dao);
        registerDao(Model_Sentence_QA.class, model_Sentence_QADao);
        registerDao(Model_Word_010.class, model_Word_010Dao);
        registerDao(PdLesson.class, pdLessonDao);
        registerDao(PdLessonDlVersion.class, pdLessonDlVersionDao);
        registerDao(PdLessonFav.class, pdLessonFavDao);
        registerDao(PdLessonLearnIndex.class, pdLessonLearnIndexDao);
        registerDao(PdSentence.class, pdSentenceDao);
        registerDao(PdTips.class, pdTipsDao);
        registerDao(PdTipsFav.class, pdTipsFavDao);
        registerDao(PdWord.class, pdWordDao);
        registerDao(PdWordFav.class, pdWordFavDao);
        registerDao(Phrase.class, phraseDao);
        registerDao(ReviewNew.class, reviewNewDao);
        registerDao(ReviewSp.class, reviewSpDao);
        registerDao(ScFav.class, scFavDao);
        registerDao(ScFavNew.class, scFavNewDao);
        registerDao(ScSubCate.class, scSubCateDao);
        registerDao(Sentence.class, sentenceDao);
        registerDao(TravelCategory.class, travelCategoryDao);
        registerDao(TravelPhrase.class, travelPhraseDao);
        registerDao(Unit.class, unitDao);
        registerDao(UnitFinishStatus.class, unitFinishStatusDao);
        registerDao(Word.class, wordDao);
        registerDao(YinTu.class, yinTuDao);
        registerDao(YouYin.class, youYinDao);
        registerDao(ZhuoYin.class, zhuoYinDao);
    }

    public void clear() {
        this.aRCharDaoConfig.a();
        this.achievementDaoConfig.a();
        this.ackDaoConfig.a();
        this.ackFavDaoConfig.a();
        this.billingStatusDaoConfig.a();
        this.gameWordStatusDaoConfig.a();
        this.hwCharGroupDaoConfig.a();
        this.hwCharPartDaoConfig.a();
        this.hwCharacterDaoConfig.a();
        this.hwTCharPartDaoConfig.a();
        this.jPCharDaoConfig.a();
        this.jPCharPartDaoConfig.a();
        this.kOCharDaoConfig.a();
        this.kOCharPartDaoConfig.a();
        this.kOCharZhuyinDaoConfig.a();
        this.kanjiFavDaoConfig.a();
        this.lDCharacterDaoConfig.a();
        this.lanCustomInfoDaoConfig.a();
        this.languageItemDaoConfig.a();
        this.languageTransVersionDaoConfig.a();
        this.lessonDaoConfig.a();
        this.levelDaoConfig.a();
        this.loginHistoryDaoConfig.a();
        this.model_Sentence_000DaoConfig.a();
        this.model_Sentence_010DaoConfig.a();
        this.model_Sentence_020DaoConfig.a();
        this.model_Sentence_030DaoConfig.a();
        this.model_Sentence_040DaoConfig.a();
        this.model_Sentence_050DaoConfig.a();
        this.model_Sentence_060DaoConfig.a();
        this.model_Sentence_070DaoConfig.a();
        this.model_Sentence_080DaoConfig.a();
        this.model_Sentence_090DaoConfig.a();
        this.model_Sentence_100DaoConfig.a();
        this.model_Sentence_QADaoConfig.a();
        this.model_Word_010DaoConfig.a();
        this.pdLessonDaoConfig.a();
        this.pdLessonDlVersionDaoConfig.a();
        this.pdLessonFavDaoConfig.a();
        this.pdLessonLearnIndexDaoConfig.a();
        this.pdSentenceDaoConfig.a();
        this.pdTipsDaoConfig.a();
        this.pdTipsFavDaoConfig.a();
        this.pdWordDaoConfig.a();
        this.pdWordFavDaoConfig.a();
        this.phraseDaoConfig.a();
        this.reviewNewDaoConfig.a();
        this.reviewSpDaoConfig.a();
        this.scFavDaoConfig.a();
        this.scFavNewDaoConfig.a();
        this.scSubCateDaoConfig.a();
        this.sentenceDaoConfig.a();
        this.travelCategoryDaoConfig.a();
        this.travelPhraseDaoConfig.a();
        this.unitDaoConfig.a();
        this.unitFinishStatusDaoConfig.a();
        this.wordDaoConfig.a();
        this.yinTuDaoConfig.a();
        this.youYinDaoConfig.a();
        this.zhuoYinDaoConfig.a();
    }

    public ARCharDao getARCharDao() {
        return this.aRCharDao;
    }

    public AchievementDao getAchievementDao() {
        return this.achievementDao;
    }

    public AckDao getAckDao() {
        return this.ackDao;
    }

    public AckFavDao getAckFavDao() {
        return this.ackFavDao;
    }

    public BillingStatusDao getBillingStatusDao() {
        return this.billingStatusDao;
    }

    public GameWordStatusDao getGameWordStatusDao() {
        return this.gameWordStatusDao;
    }

    public HwCharGroupDao getHwCharGroupDao() {
        return this.hwCharGroupDao;
    }

    public HwCharPartDao getHwCharPartDao() {
        return this.hwCharPartDao;
    }

    public HwCharacterDao getHwCharacterDao() {
        return this.hwCharacterDao;
    }

    public HwTCharPartDao getHwTCharPartDao() {
        return this.hwTCharPartDao;
    }

    public JPCharDao getJPCharDao() {
        return this.jPCharDao;
    }

    public JPCharPartDao getJPCharPartDao() {
        return this.jPCharPartDao;
    }

    public KOCharDao getKOCharDao() {
        return this.kOCharDao;
    }

    public KOCharPartDao getKOCharPartDao() {
        return this.kOCharPartDao;
    }

    public KOCharZhuyinDao getKOCharZhuyinDao() {
        return this.kOCharZhuyinDao;
    }

    public KanjiFavDao getKanjiFavDao() {
        return this.kanjiFavDao;
    }

    public LDCharacterDao getLDCharacterDao() {
        return this.lDCharacterDao;
    }

    public LanCustomInfoDao getLanCustomInfoDao() {
        return this.lanCustomInfoDao;
    }

    public LanguageItemDao getLanguageItemDao() {
        return this.languageItemDao;
    }

    public LanguageTransVersionDao getLanguageTransVersionDao() {
        return this.languageTransVersionDao;
    }

    public LessonDao getLessonDao() {
        return this.lessonDao;
    }

    public LevelDao getLevelDao() {
        return this.levelDao;
    }

    public LoginHistoryDao getLoginHistoryDao() {
        return this.loginHistoryDao;
    }

    public Model_Sentence_000Dao getModel_Sentence_000Dao() {
        return this.model_Sentence_000Dao;
    }

    public Model_Sentence_010Dao getModel_Sentence_010Dao() {
        return this.model_Sentence_010Dao;
    }

    public Model_Sentence_020Dao getModel_Sentence_020Dao() {
        return this.model_Sentence_020Dao;
    }

    public Model_Sentence_030Dao getModel_Sentence_030Dao() {
        return this.model_Sentence_030Dao;
    }

    public Model_Sentence_040Dao getModel_Sentence_040Dao() {
        return this.model_Sentence_040Dao;
    }

    public Model_Sentence_050Dao getModel_Sentence_050Dao() {
        return this.model_Sentence_050Dao;
    }

    public Model_Sentence_060Dao getModel_Sentence_060Dao() {
        return this.model_Sentence_060Dao;
    }

    public Model_Sentence_070Dao getModel_Sentence_070Dao() {
        return this.model_Sentence_070Dao;
    }

    public Model_Sentence_080Dao getModel_Sentence_080Dao() {
        return this.model_Sentence_080Dao;
    }

    public Model_Sentence_090Dao getModel_Sentence_090Dao() {
        return this.model_Sentence_090Dao;
    }

    public Model_Sentence_100Dao getModel_Sentence_100Dao() {
        return this.model_Sentence_100Dao;
    }

    public Model_Sentence_QADao getModel_Sentence_QADao() {
        return this.model_Sentence_QADao;
    }

    public Model_Word_010Dao getModel_Word_010Dao() {
        return this.model_Word_010Dao;
    }

    public PdLessonDao getPdLessonDao() {
        return this.pdLessonDao;
    }

    public PdLessonDlVersionDao getPdLessonDlVersionDao() {
        return this.pdLessonDlVersionDao;
    }

    public PdLessonFavDao getPdLessonFavDao() {
        return this.pdLessonFavDao;
    }

    public PdLessonLearnIndexDao getPdLessonLearnIndexDao() {
        return this.pdLessonLearnIndexDao;
    }

    public PdSentenceDao getPdSentenceDao() {
        return this.pdSentenceDao;
    }

    public PdTipsDao getPdTipsDao() {
        return this.pdTipsDao;
    }

    public PdTipsFavDao getPdTipsFavDao() {
        return this.pdTipsFavDao;
    }

    public PdWordDao getPdWordDao() {
        return this.pdWordDao;
    }

    public PdWordFavDao getPdWordFavDao() {
        return this.pdWordFavDao;
    }

    public PhraseDao getPhraseDao() {
        return this.phraseDao;
    }

    public ReviewNewDao getReviewNewDao() {
        return this.reviewNewDao;
    }

    public ReviewSpDao getReviewSpDao() {
        return this.reviewSpDao;
    }

    public ScFavDao getScFavDao() {
        return this.scFavDao;
    }

    public ScFavNewDao getScFavNewDao() {
        return this.scFavNewDao;
    }

    public ScSubCateDao getScSubCateDao() {
        return this.scSubCateDao;
    }

    public SentenceDao getSentenceDao() {
        return this.sentenceDao;
    }

    public TravelCategoryDao getTravelCategoryDao() {
        return this.travelCategoryDao;
    }

    public TravelPhraseDao getTravelPhraseDao() {
        return this.travelPhraseDao;
    }

    public UnitDao getUnitDao() {
        return this.unitDao;
    }

    public UnitFinishStatusDao getUnitFinishStatusDao() {
        return this.unitFinishStatusDao;
    }

    public WordDao getWordDao() {
        return this.wordDao;
    }

    public YinTuDao getYinTuDao() {
        return this.yinTuDao;
    }

    public YouYinDao getYouYinDao() {
        return this.youYinDao;
    }

    public ZhuoYinDao getZhuoYinDao() {
        return this.zhuoYinDao;
    }
}
