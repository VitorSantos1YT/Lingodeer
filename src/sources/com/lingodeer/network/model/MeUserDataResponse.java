package com.lingodeer.network.model;

import am.rVFB.LwKl;
import bw.ORXQ.ADSb;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.android.material.datepicker.d;
import com.google.gson.JsonObject;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import dl.ExOZ.xItStCyvVEZ;
import ep.a;
import hh.p0;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import ry.r;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class MeUserDataResponse {
    private List<String> all_followers;
    private List<String> all_followings;
    private JsonObject all_progress_collection;
    private int billing_page_views;
    private int leaderboard_emoji_status;
    private long leaderboard_learned_time;
    private long leaderboard_week_xp;
    private String m_animated_emojis;
    private boolean m_buy_coffee;
    private boolean m_review_data_tranfered;
    private String m_user_joined;
    private int max_streak;
    private String me_achiev_languages;
    private String me_achiev_leaderboard;
    private String me_achiev_streakhero;
    private String me_achiev_topstudent;
    private String me_achiev_xpexpert;
    private String me_skills_mastery;
    private String news_feed_read_ids;
    private int ranking_index;
    private String ranking_type;
    private JsonObject recent_gems_collection;
    private JsonObject recent_streak_collection;
    private JsonObject recent_time_collection;
    private JsonObject recent_xp_collection;
    private String setting_learning_lan;
    private String setting_reminders;
    private boolean setting_show_leaderboard;
    private boolean setting_soundeffect;
    private String setting_uilan;
    private int total_gems;
    private int total_streakfreezer;
    private int total_streaksaver;
    private int total_time;
    private int total_xp;
    private String user_image;
    private String user_nickname;

    public MeUserDataResponse() {
        this(0, 0, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, 0L, 0, 0L, null, null, 0, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, -1, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MeUserDataResponse copy$default(MeUserDataResponse meUserDataResponse, int i11, int i12, int i13, int i14, int i15, int i16, int i17, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j11, int i18, long j12, String str8, String str9, int i19, String str10, String str11, String str12, String str13, boolean z11, boolean z12, String str14, boolean z13, boolean z14, JsonObject jsonObject, JsonObject jsonObject2, JsonObject jsonObject3, JsonObject jsonObject4, JsonObject jsonObject5, List list, List list2, String str15, int i21, int i22, Object obj) {
        String str16;
        List list3;
        int i23 = (i21 & 1) != 0 ? meUserDataResponse.max_streak : i11;
        int i24 = (i21 & 2) != 0 ? meUserDataResponse.total_xp : i12;
        int i25 = (i21 & 4) != 0 ? meUserDataResponse.total_time : i13;
        int i26 = (i21 & 8) != 0 ? meUserDataResponse.total_gems : i14;
        int i27 = (i21 & 16) != 0 ? meUserDataResponse.total_streaksaver : i15;
        int i28 = (i21 & 32) != 0 ? meUserDataResponse.total_streakfreezer : i16;
        int i29 = (i21 & 64) != 0 ? meUserDataResponse.ranking_index : i17;
        String str17 = (i21 & 128) != 0 ? meUserDataResponse.ranking_type : str;
        String str18 = (i21 & 256) != 0 ? meUserDataResponse.me_skills_mastery : str2;
        String str19 = (i21 & 512) != 0 ? meUserDataResponse.me_achiev_topstudent : str3;
        String str20 = (i21 & 1024) != 0 ? meUserDataResponse.me_achiev_xpexpert : str4;
        String str21 = (i21 & 2048) != 0 ? meUserDataResponse.me_achiev_streakhero : str5;
        String str22 = (i21 & 4096) != 0 ? meUserDataResponse.me_achiev_leaderboard : str6;
        String str23 = (i21 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? meUserDataResponse.me_achiev_languages : str7;
        int i30 = i23;
        long j13 = (i21 & 16384) != 0 ? meUserDataResponse.leaderboard_week_xp : j11;
        int i31 = (i21 & 32768) != 0 ? meUserDataResponse.leaderboard_emoji_status : i18;
        long j14 = (i21 & 65536) != 0 ? meUserDataResponse.leaderboard_learned_time : j12;
        String str24 = (i21 & OSSConstants.DEFAULT_STREAM_BUFFER_SIZE) != 0 ? meUserDataResponse.user_image : str8;
        String str25 = (i21 & 262144) != 0 ? meUserDataResponse.user_nickname : str9;
        String str26 = str24;
        int i32 = (i21 & 524288) != 0 ? meUserDataResponse.billing_page_views : i19;
        String str27 = (i21 & 1048576) != 0 ? meUserDataResponse.news_feed_read_ids : str10;
        String str28 = (i21 & 2097152) != 0 ? meUserDataResponse.setting_learning_lan : str11;
        String str29 = (i21 & 4194304) != 0 ? meUserDataResponse.setting_uilan : str12;
        String str30 = (i21 & 8388608) != 0 ? meUserDataResponse.setting_reminders : str13;
        boolean z15 = (i21 & 16777216) != 0 ? meUserDataResponse.setting_soundeffect : z11;
        boolean z16 = (i21 & 33554432) != 0 ? meUserDataResponse.setting_show_leaderboard : z12;
        String str31 = (i21 & 67108864) != 0 ? meUserDataResponse.m_user_joined : str14;
        boolean z17 = (i21 & 134217728) != 0 ? meUserDataResponse.m_buy_coffee : z13;
        boolean z18 = (i21 & 268435456) != 0 ? meUserDataResponse.m_review_data_tranfered : z14;
        JsonObject jsonObject6 = (i21 & 536870912) != 0 ? meUserDataResponse.recent_xp_collection : jsonObject;
        JsonObject jsonObject7 = (i21 & 1073741824) != 0 ? meUserDataResponse.recent_time_collection : jsonObject2;
        JsonObject jsonObject8 = (i21 & Integer.MIN_VALUE) != 0 ? meUserDataResponse.recent_gems_collection : jsonObject3;
        JsonObject jsonObject9 = (i22 & 1) != 0 ? meUserDataResponse.recent_streak_collection : jsonObject4;
        JsonObject jsonObject10 = (i22 & 2) != 0 ? meUserDataResponse.all_progress_collection : jsonObject5;
        List list4 = (i22 & 4) != 0 ? meUserDataResponse.all_followings : list;
        List list5 = (i22 & 8) != 0 ? meUserDataResponse.all_followers : list2;
        if ((i22 & 16) != 0) {
            list3 = list5;
            str16 = meUserDataResponse.m_animated_emojis;
        } else {
            str16 = str15;
            list3 = list5;
        }
        return meUserDataResponse.copy(i30, i24, i25, i26, i27, i28, i29, str17, str18, str19, str20, str21, str22, str23, j13, i31, j14, str26, str25, i32, str27, str28, str29, str30, z15, z16, str31, z17, z18, jsonObject6, jsonObject7, jsonObject8, jsonObject9, jsonObject10, list4, list3, str16);
    }

    public final int component1() {
        return this.max_streak;
    }

    public final String component10() {
        return this.me_achiev_topstudent;
    }

    public final String component11() {
        return this.me_achiev_xpexpert;
    }

    public final String component12() {
        return this.me_achiev_streakhero;
    }

    public final String component13() {
        return this.me_achiev_leaderboard;
    }

    public final String component14() {
        return this.me_achiev_languages;
    }

    public final long component15() {
        return this.leaderboard_week_xp;
    }

    public final int component16() {
        return this.leaderboard_emoji_status;
    }

    public final long component17() {
        return this.leaderboard_learned_time;
    }

    public final String component18() {
        return this.user_image;
    }

    public final String component19() {
        return this.user_nickname;
    }

    public final int component2() {
        return this.total_xp;
    }

    public final int component20() {
        return this.billing_page_views;
    }

    public final String component21() {
        return this.news_feed_read_ids;
    }

    public final String component22() {
        return this.setting_learning_lan;
    }

    public final String component23() {
        return this.setting_uilan;
    }

    public final String component24() {
        return this.setting_reminders;
    }

    public final boolean component25() {
        return this.setting_soundeffect;
    }

    public final boolean component26() {
        return this.setting_show_leaderboard;
    }

    public final String component27() {
        return this.m_user_joined;
    }

    public final boolean component28() {
        return this.m_buy_coffee;
    }

    public final boolean component29() {
        return this.m_review_data_tranfered;
    }

    public final int component3() {
        return this.total_time;
    }

    public final JsonObject component30() {
        return this.recent_xp_collection;
    }

    public final JsonObject component31() {
        return this.recent_time_collection;
    }

    public final JsonObject component32() {
        return this.recent_gems_collection;
    }

    public final JsonObject component33() {
        return this.recent_streak_collection;
    }

    public final JsonObject component34() {
        return this.all_progress_collection;
    }

    public final List<String> component35() {
        return this.all_followings;
    }

    public final List<String> component36() {
        return this.all_followers;
    }

    public final String component37() {
        return this.m_animated_emojis;
    }

    public final int component4() {
        return this.total_gems;
    }

    public final int component5() {
        return this.total_streaksaver;
    }

    public final int component6() {
        return this.total_streakfreezer;
    }

    public final int component7() {
        return this.ranking_index;
    }

    public final String component8() {
        return this.ranking_type;
    }

    public final String component9() {
        return this.me_skills_mastery;
    }

    public final MeUserDataResponse copy(int i11, int i12, int i13, int i14, int i15, int i16, int i17, String ranking_type, String me_skills_mastery, String me_achiev_topstudent, String me_achiev_xpexpert, String me_achiev_streakhero, String me_achiev_leaderboard, String me_achiev_languages, long j11, int i18, long j12, String user_image, String str, int i19, String news_feed_read_ids, String setting_learning_lan, String setting_uilan, String setting_reminders, boolean z11, boolean z12, String m_user_joined, boolean z13, boolean z14, JsonObject recent_xp_collection, JsonObject recent_time_collection, JsonObject recent_gems_collection, JsonObject recent_streak_collection, JsonObject all_progress_collection, List<String> all_followings, List<String> all_followers, String m_animated_emojis) {
        m.f(ranking_type, "ranking_type");
        m.f(me_skills_mastery, "me_skills_mastery");
        m.f(me_achiev_topstudent, "me_achiev_topstudent");
        m.f(me_achiev_xpexpert, "me_achiev_xpexpert");
        m.f(me_achiev_streakhero, "me_achiev_streakhero");
        m.f(me_achiev_leaderboard, "me_achiev_leaderboard");
        m.f(me_achiev_languages, "me_achiev_languages");
        m.f(user_image, "user_image");
        m.f(str, LwKl.otYiOYva);
        m.f(news_feed_read_ids, "news_feed_read_ids");
        m.f(setting_learning_lan, "setting_learning_lan");
        m.f(setting_uilan, "setting_uilan");
        m.f(setting_reminders, "setting_reminders");
        m.f(m_user_joined, "m_user_joined");
        m.f(recent_xp_collection, "recent_xp_collection");
        m.f(recent_time_collection, "recent_time_collection");
        m.f(recent_gems_collection, "recent_gems_collection");
        m.f(recent_streak_collection, "recent_streak_collection");
        m.f(all_progress_collection, "all_progress_collection");
        m.f(all_followings, "all_followings");
        m.f(all_followers, "all_followers");
        m.f(m_animated_emojis, "m_animated_emojis");
        return new MeUserDataResponse(i11, i12, i13, i14, i15, i16, i17, ranking_type, me_skills_mastery, me_achiev_topstudent, me_achiev_xpexpert, me_achiev_streakhero, me_achiev_leaderboard, me_achiev_languages, j11, i18, j12, user_image, str, i19, news_feed_read_ids, setting_learning_lan, setting_uilan, setting_reminders, z11, z12, m_user_joined, z13, z14, recent_xp_collection, recent_time_collection, recent_gems_collection, recent_streak_collection, all_progress_collection, all_followings, all_followers, m_animated_emojis);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MeUserDataResponse)) {
            return false;
        }
        MeUserDataResponse meUserDataResponse = (MeUserDataResponse) obj;
        return this.max_streak == meUserDataResponse.max_streak && this.total_xp == meUserDataResponse.total_xp && this.total_time == meUserDataResponse.total_time && this.total_gems == meUserDataResponse.total_gems && this.total_streaksaver == meUserDataResponse.total_streaksaver && this.total_streakfreezer == meUserDataResponse.total_streakfreezer && this.ranking_index == meUserDataResponse.ranking_index && m.a(this.ranking_type, meUserDataResponse.ranking_type) && m.a(this.me_skills_mastery, meUserDataResponse.me_skills_mastery) && m.a(this.me_achiev_topstudent, meUserDataResponse.me_achiev_topstudent) && m.a(this.me_achiev_xpexpert, meUserDataResponse.me_achiev_xpexpert) && m.a(this.me_achiev_streakhero, meUserDataResponse.me_achiev_streakhero) && m.a(this.me_achiev_leaderboard, meUserDataResponse.me_achiev_leaderboard) && m.a(this.me_achiev_languages, meUserDataResponse.me_achiev_languages) && this.leaderboard_week_xp == meUserDataResponse.leaderboard_week_xp && this.leaderboard_emoji_status == meUserDataResponse.leaderboard_emoji_status && this.leaderboard_learned_time == meUserDataResponse.leaderboard_learned_time && m.a(this.user_image, meUserDataResponse.user_image) && m.a(this.user_nickname, meUserDataResponse.user_nickname) && this.billing_page_views == meUserDataResponse.billing_page_views && m.a(this.news_feed_read_ids, meUserDataResponse.news_feed_read_ids) && m.a(this.setting_learning_lan, meUserDataResponse.setting_learning_lan) && m.a(this.setting_uilan, meUserDataResponse.setting_uilan) && m.a(this.setting_reminders, meUserDataResponse.setting_reminders) && this.setting_soundeffect == meUserDataResponse.setting_soundeffect && this.setting_show_leaderboard == meUserDataResponse.setting_show_leaderboard && m.a(this.m_user_joined, meUserDataResponse.m_user_joined) && this.m_buy_coffee == meUserDataResponse.m_buy_coffee && this.m_review_data_tranfered == meUserDataResponse.m_review_data_tranfered && m.a(this.recent_xp_collection, meUserDataResponse.recent_xp_collection) && m.a(this.recent_time_collection, meUserDataResponse.recent_time_collection) && m.a(this.recent_gems_collection, meUserDataResponse.recent_gems_collection) && m.a(this.recent_streak_collection, meUserDataResponse.recent_streak_collection) && m.a(this.all_progress_collection, meUserDataResponse.all_progress_collection) && m.a(this.all_followings, meUserDataResponse.all_followings) && m.a(this.all_followers, meUserDataResponse.all_followers) && m.a(this.m_animated_emojis, meUserDataResponse.m_animated_emojis);
    }

    public final List<String> getAll_followers() {
        return this.all_followers;
    }

    public final List<String> getAll_followings() {
        return this.all_followings;
    }

    public final JsonObject getAll_progress_collection() {
        return this.all_progress_collection;
    }

    public final int getBilling_page_views() {
        return this.billing_page_views;
    }

    public final int getLeaderboard_emoji_status() {
        return this.leaderboard_emoji_status;
    }

    public final long getLeaderboard_learned_time() {
        return this.leaderboard_learned_time;
    }

    public final long getLeaderboard_week_xp() {
        return this.leaderboard_week_xp;
    }

    public final String getM_animated_emojis() {
        return this.m_animated_emojis;
    }

    public final boolean getM_buy_coffee() {
        return this.m_buy_coffee;
    }

    public final boolean getM_review_data_tranfered() {
        return this.m_review_data_tranfered;
    }

    public final String getM_user_joined() {
        return this.m_user_joined;
    }

    public final int getMax_streak() {
        return this.max_streak;
    }

    public final String getMe_achiev_languages() {
        return this.me_achiev_languages;
    }

    public final String getMe_achiev_leaderboard() {
        return this.me_achiev_leaderboard;
    }

    public final String getMe_achiev_streakhero() {
        return this.me_achiev_streakhero;
    }

    public final String getMe_achiev_topstudent() {
        return this.me_achiev_topstudent;
    }

    public final String getMe_achiev_xpexpert() {
        return this.me_achiev_xpexpert;
    }

    public final String getMe_skills_mastery() {
        return this.me_skills_mastery;
    }

    public final String getNews_feed_read_ids() {
        return this.news_feed_read_ids;
    }

    public final int getRanking_index() {
        return this.ranking_index;
    }

    public final String getRanking_type() {
        return this.ranking_type;
    }

    public final JsonObject getRecent_gems_collection() {
        return this.recent_gems_collection;
    }

    public final JsonObject getRecent_streak_collection() {
        return this.recent_streak_collection;
    }

    public final JsonObject getRecent_time_collection() {
        return this.recent_time_collection;
    }

    public final JsonObject getRecent_xp_collection() {
        return this.recent_xp_collection;
    }

    public final String getSetting_learning_lan() {
        return this.setting_learning_lan;
    }

    public final String getSetting_reminders() {
        return this.setting_reminders;
    }

    public final boolean getSetting_show_leaderboard() {
        return this.setting_show_leaderboard;
    }

    public final boolean getSetting_soundeffect() {
        return this.setting_soundeffect;
    }

    public final String getSetting_uilan() {
        return this.setting_uilan;
    }

    public final int getTotal_gems() {
        return this.total_gems;
    }

    public final int getTotal_streakfreezer() {
        return this.total_streakfreezer;
    }

    public final int getTotal_streaksaver() {
        return this.total_streaksaver;
    }

    public final int getTotal_time() {
        return this.total_time;
    }

    public final int getTotal_xp() {
        return this.total_xp;
    }

    public final String getUser_image() {
        return this.user_image;
    }

    public final String getUser_nickname() {
        return this.user_nickname;
    }

    public int hashCode() {
        return this.m_animated_emojis.hashCode() + p0.b(p0.b((this.all_progress_collection.hashCode() + ((this.recent_streak_collection.hashCode() + ((this.recent_gems_collection.hashCode() + ((this.recent_time_collection.hashCode() + ((this.recent_xp_collection.hashCode() + e.e(e.e(e.d(e.e(e.e(e.d(e.d(e.d(e.d(e.b(this.billing_page_views, e.d(e.d(e.f(this.leaderboard_learned_time, e.b(this.leaderboard_emoji_status, e.f(this.leaderboard_week_xp, e.d(e.d(e.d(e.d(e.d(e.d(e.d(e.b(this.ranking_index, e.b(this.total_streakfreezer, e.b(this.total_streaksaver, e.b(this.total_gems, e.b(this.total_time, e.b(this.total_xp, Integer.hashCode(this.max_streak) * 31, 31), 31), 31), 31), 31), 31), 31, this.ranking_type), 31, this.me_skills_mastery), 31, this.me_achiev_topstudent), 31, this.me_achiev_xpexpert), 31, this.me_achiev_streakhero), 31, this.me_achiev_leaderboard), 31, this.me_achiev_languages), 31), 31), 31), 31, this.user_image), 31, this.user_nickname), 31), 31, this.news_feed_read_ids), 31, this.setting_learning_lan), 31, this.setting_uilan), 31, this.setting_reminders), 31, this.setting_soundeffect), 31, this.setting_show_leaderboard), 31, this.m_user_joined), 31, this.m_buy_coffee), 31, this.m_review_data_tranfered)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.all_followings), 31, this.all_followers);
    }

    public final void setAll_followers(List<String> list) {
        m.f(list, "<set-?>");
        this.all_followers = list;
    }

    public final void setAll_followings(List<String> list) {
        m.f(list, "<set-?>");
        this.all_followings = list;
    }

    public final void setAll_progress_collection(JsonObject jsonObject) {
        m.f(jsonObject, "<set-?>");
        this.all_progress_collection = jsonObject;
    }

    public final void setBilling_page_views(int i11) {
        this.billing_page_views = i11;
    }

    public final void setLeaderboard_emoji_status(int i11) {
        this.leaderboard_emoji_status = i11;
    }

    public final void setLeaderboard_learned_time(long j11) {
        this.leaderboard_learned_time = j11;
    }

    public final void setLeaderboard_week_xp(long j11) {
        this.leaderboard_week_xp = j11;
    }

    public final void setM_animated_emojis(String str) {
        m.f(str, "<set-?>");
        this.m_animated_emojis = str;
    }

    public final void setM_buy_coffee(boolean z11) {
        this.m_buy_coffee = z11;
    }

    public final void setM_review_data_tranfered(boolean z11) {
        this.m_review_data_tranfered = z11;
    }

    public final void setM_user_joined(String str) {
        m.f(str, "<set-?>");
        this.m_user_joined = str;
    }

    public final void setMax_streak(int i11) {
        this.max_streak = i11;
    }

    public final void setMe_achiev_languages(String str) {
        m.f(str, "<set-?>");
        this.me_achiev_languages = str;
    }

    public final void setMe_achiev_leaderboard(String str) {
        m.f(str, "<set-?>");
        this.me_achiev_leaderboard = str;
    }

    public final void setMe_achiev_streakhero(String str) {
        m.f(str, "<set-?>");
        this.me_achiev_streakhero = str;
    }

    public final void setMe_achiev_topstudent(String str) {
        m.f(str, "<set-?>");
        this.me_achiev_topstudent = str;
    }

    public final void setMe_achiev_xpexpert(String str) {
        m.f(str, "<set-?>");
        this.me_achiev_xpexpert = str;
    }

    public final void setMe_skills_mastery(String str) {
        m.f(str, "<set-?>");
        this.me_skills_mastery = str;
    }

    public final void setNews_feed_read_ids(String str) {
        m.f(str, "<set-?>");
        this.news_feed_read_ids = str;
    }

    public final void setRanking_index(int i11) {
        this.ranking_index = i11;
    }

    public final void setRanking_type(String str) {
        m.f(str, "<set-?>");
        this.ranking_type = str;
    }

    public final void setRecent_gems_collection(JsonObject jsonObject) {
        m.f(jsonObject, "<set-?>");
        this.recent_gems_collection = jsonObject;
    }

    public final void setRecent_streak_collection(JsonObject jsonObject) {
        m.f(jsonObject, "<set-?>");
        this.recent_streak_collection = jsonObject;
    }

    public final void setRecent_time_collection(JsonObject jsonObject) {
        m.f(jsonObject, "<set-?>");
        this.recent_time_collection = jsonObject;
    }

    public final void setRecent_xp_collection(JsonObject jsonObject) {
        m.f(jsonObject, "<set-?>");
        this.recent_xp_collection = jsonObject;
    }

    public final void setSetting_learning_lan(String str) {
        m.f(str, "<set-?>");
        this.setting_learning_lan = str;
    }

    public final void setSetting_reminders(String str) {
        m.f(str, "<set-?>");
        this.setting_reminders = str;
    }

    public final void setSetting_show_leaderboard(boolean z11) {
        this.setting_show_leaderboard = z11;
    }

    public final void setSetting_soundeffect(boolean z11) {
        this.setting_soundeffect = z11;
    }

    public final void setSetting_uilan(String str) {
        m.f(str, "<set-?>");
        this.setting_uilan = str;
    }

    public final void setTotal_gems(int i11) {
        this.total_gems = i11;
    }

    public final void setTotal_streakfreezer(int i11) {
        this.total_streakfreezer = i11;
    }

    public final void setTotal_streaksaver(int i11) {
        this.total_streaksaver = i11;
    }

    public final void setTotal_time(int i11) {
        this.total_time = i11;
    }

    public final void setTotal_xp(int i11) {
        this.total_xp = i11;
    }

    public final void setUser_image(String str) {
        m.f(str, "<set-?>");
        this.user_image = str;
    }

    public final void setUser_nickname(String str) {
        m.f(str, "<set-?>");
        this.user_nickname = str;
    }

    public MeUserDataResponse(int i11, int i12, int i13, int i14, int i15, int i16, int i17, String ranking_type, String me_skills_mastery, String me_achiev_topstudent, String me_achiev_xpexpert, String me_achiev_streakhero, String me_achiev_leaderboard, String me_achiev_languages, long j11, int i18, long j12, String user_image, String user_nickname, int i19, String news_feed_read_ids, String setting_learning_lan, String setting_uilan, String setting_reminders, boolean z11, boolean z12, String m_user_joined, boolean z13, boolean z14, JsonObject recent_xp_collection, JsonObject recent_time_collection, JsonObject jsonObject, JsonObject recent_streak_collection, JsonObject all_progress_collection, List<String> all_followings, List<String> all_followers, String m_animated_emojis) {
        m.f(ranking_type, "ranking_type");
        m.f(me_skills_mastery, "me_skills_mastery");
        m.f(me_achiev_topstudent, "me_achiev_topstudent");
        m.f(me_achiev_xpexpert, "me_achiev_xpexpert");
        m.f(me_achiev_streakhero, "me_achiev_streakhero");
        m.f(me_achiev_leaderboard, "me_achiev_leaderboard");
        m.f(me_achiev_languages, "me_achiev_languages");
        m.f(user_image, "user_image");
        m.f(user_nickname, "user_nickname");
        m.f(news_feed_read_ids, "news_feed_read_ids");
        m.f(setting_learning_lan, "setting_learning_lan");
        m.f(setting_uilan, "setting_uilan");
        m.f(setting_reminders, "setting_reminders");
        m.f(m_user_joined, "m_user_joined");
        m.f(recent_xp_collection, "recent_xp_collection");
        m.f(recent_time_collection, "recent_time_collection");
        m.f(jsonObject, xItStCyvVEZ.lrmZbkK);
        m.f(recent_streak_collection, "recent_streak_collection");
        m.f(all_progress_collection, "all_progress_collection");
        m.f(all_followings, "all_followings");
        m.f(all_followers, "all_followers");
        m.f(m_animated_emojis, "m_animated_emojis");
        this.max_streak = i11;
        this.total_xp = i12;
        this.total_time = i13;
        this.total_gems = i14;
        this.total_streaksaver = i15;
        this.total_streakfreezer = i16;
        this.ranking_index = i17;
        this.ranking_type = ranking_type;
        this.me_skills_mastery = me_skills_mastery;
        this.me_achiev_topstudent = me_achiev_topstudent;
        this.me_achiev_xpexpert = me_achiev_xpexpert;
        this.me_achiev_streakhero = me_achiev_streakhero;
        this.me_achiev_leaderboard = me_achiev_leaderboard;
        this.me_achiev_languages = me_achiev_languages;
        this.leaderboard_week_xp = j11;
        this.leaderboard_emoji_status = i18;
        this.leaderboard_learned_time = j12;
        this.user_image = user_image;
        this.user_nickname = user_nickname;
        this.billing_page_views = i19;
        this.news_feed_read_ids = news_feed_read_ids;
        this.setting_learning_lan = setting_learning_lan;
        this.setting_uilan = setting_uilan;
        this.setting_reminders = setting_reminders;
        this.setting_soundeffect = z11;
        this.setting_show_leaderboard = z12;
        this.m_user_joined = m_user_joined;
        this.m_buy_coffee = z13;
        this.m_review_data_tranfered = z14;
        this.recent_xp_collection = recent_xp_collection;
        this.recent_time_collection = recent_time_collection;
        this.recent_gems_collection = jsonObject;
        this.recent_streak_collection = recent_streak_collection;
        this.all_progress_collection = all_progress_collection;
        this.all_followings = all_followings;
        this.all_followers = all_followers;
        this.m_animated_emojis = m_animated_emojis;
    }

    public String toString() {
        int i11 = this.max_streak;
        int i12 = this.total_xp;
        int i13 = this.total_time;
        int i14 = this.total_gems;
        int i15 = this.total_streaksaver;
        int i16 = this.total_streakfreezer;
        int i17 = this.ranking_index;
        String str = this.ranking_type;
        String str2 = this.me_skills_mastery;
        String str3 = this.me_achiev_topstudent;
        String str4 = this.me_achiev_xpexpert;
        String str5 = this.me_achiev_streakhero;
        String str6 = this.me_achiev_leaderboard;
        String str7 = this.me_achiev_languages;
        long j11 = this.leaderboard_week_xp;
        int i18 = this.leaderboard_emoji_status;
        long j12 = this.leaderboard_learned_time;
        String str8 = this.user_image;
        String str9 = this.user_nickname;
        int i19 = this.billing_page_views;
        String str10 = this.news_feed_read_ids;
        String str11 = this.setting_learning_lan;
        String str12 = this.setting_uilan;
        String str13 = this.setting_reminders;
        boolean z11 = this.setting_soundeffect;
        boolean z12 = this.setting_show_leaderboard;
        String str14 = this.m_user_joined;
        boolean z13 = this.m_buy_coffee;
        boolean z14 = this.m_review_data_tranfered;
        JsonObject jsonObject = this.recent_xp_collection;
        JsonObject jsonObject2 = this.recent_time_collection;
        JsonObject jsonObject3 = this.recent_gems_collection;
        JsonObject jsonObject4 = this.recent_streak_collection;
        JsonObject jsonObject5 = this.all_progress_collection;
        List<String> list = this.all_followings;
        List<String> list2 = this.all_followers;
        String str15 = this.m_animated_emojis;
        StringBuilder sbK = c.k("MeUserDataResponse(max_streak=", i11, ", total_xp=", i12, ", total_time=");
        a.v(i13, i14, ", total_gems=", ", total_streaksaver=", sbK);
        a.v(i15, i16, ", total_streakfreezer=", ", ranking_index=", sbK);
        sbK.append(i17);
        sbK.append(", ranking_type=");
        sbK.append(str);
        sbK.append(", me_skills_mastery=");
        d.w(sbK, str2, ", me_achiev_topstudent=", str3, ", me_achiev_xpexpert=");
        d.w(sbK, str4, ", me_achiev_streakhero=", str5, ", me_achiev_leaderboard=");
        d.w(sbK, str6, ", me_achiev_languages=", str7, ", leaderboard_week_xp=");
        sbK.append(j11);
        sbK.append(", leaderboard_emoji_status=");
        sbK.append(i18);
        a.y(j12, ADSb.HNWdbOPyzMchKM, ", user_image=", sbK);
        d.w(sbK, str8, ", user_nickname=", str9, ", billing_page_views=");
        sbK.append(i19);
        sbK.append(", news_feed_read_ids=");
        sbK.append(str10);
        sbK.append(", setting_learning_lan=");
        d.w(sbK, str11, ", setting_uilan=", str12, ", setting_reminders=");
        sbK.append(str13);
        sbK.append(", setting_soundeffect=");
        sbK.append(z11);
        sbK.append(", setting_show_leaderboard=");
        sbK.append(z12);
        sbK.append(", m_user_joined=");
        sbK.append(str14);
        sbK.append(", m_buy_coffee=");
        a.B(", m_review_data_tranfered=", ", recent_xp_collection=", sbK, z13, z14);
        sbK.append(jsonObject);
        sbK.append(", recent_time_collection=");
        sbK.append(jsonObject2);
        sbK.append(", recent_gems_collection=");
        sbK.append(jsonObject3);
        sbK.append(", recent_streak_collection=");
        sbK.append(jsonObject4);
        sbK.append(", all_progress_collection=");
        sbK.append(jsonObject5);
        sbK.append(", all_followings=");
        sbK.append(list);
        sbK.append(", all_followers=");
        sbK.append(list2);
        sbK.append(", m_animated_emojis=");
        sbK.append(str15);
        sbK.append(")");
        return sbK.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MeUserDataResponse(int i11, int i12, int i13, int i14, int i15, int i16, int i17, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j11, int i18, long j12, String str8, String str9, int i19, String str10, String str11, String str12, String str13, boolean z11, boolean z12, String str14, boolean z13, boolean z14, JsonObject jsonObject, JsonObject jsonObject2, JsonObject jsonObject3, JsonObject jsonObject4, JsonObject jsonObject5, List list, List list2, String str15, int i21, int i22, f fVar) {
        int i23 = (i21 & 1) != 0 ? 0 : i11;
        int i24 = (i21 & 2) != 0 ? 0 : i12;
        int i25 = (i21 & 4) != 0 ? 0 : i13;
        int i26 = (i21 & 8) != 0 ? 0 : i14;
        int i27 = (i21 & 16) != 0 ? 0 : i15;
        int i28 = (i21 & 32) != 0 ? 0 : i16;
        int i29 = (i21 & 64) != 0 ? 0 : i17;
        String str16 = (i21 & 128) != 0 ? BuildConfig.VERSION_NAME : str;
        String str17 = (i21 & 256) != 0 ? BuildConfig.VERSION_NAME : str2;
        String str18 = (i21 & 512) != 0 ? BuildConfig.VERSION_NAME : str3;
        String str19 = (i21 & 1024) != 0 ? BuildConfig.VERSION_NAME : str4;
        String str20 = (i21 & 2048) != 0 ? BuildConfig.VERSION_NAME : str5;
        String str21 = (i21 & 4096) != 0 ? BuildConfig.VERSION_NAME : str6;
        String str22 = (i21 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? BuildConfig.VERSION_NAME : str7;
        int i30 = i23;
        long j13 = (i21 & 16384) != 0 ? 0L : j11;
        int i31 = (32768 & i21) != 0 ? -1 : i18;
        long j14 = (i21 & 65536) == 0 ? j12 : 0L;
        String str23 = (i21 & OSSConstants.DEFAULT_STREAM_BUFFER_SIZE) != 0 ? BuildConfig.VERSION_NAME : str8;
        String str24 = (i21 & 262144) != 0 ? BuildConfig.VERSION_NAME : str9;
        int i32 = (i21 & 524288) != 0 ? 0 : i19;
        String str25 = (i21 & 1048576) != 0 ? BuildConfig.VERSION_NAME : str10;
        String str26 = (i21 & 2097152) != 0 ? BuildConfig.VERSION_NAME : str11;
        String str27 = (i21 & 4194304) != 0 ? BuildConfig.VERSION_NAME : str12;
        String str28 = (i21 & 8388608) != 0 ? BuildConfig.VERSION_NAME : str13;
        boolean z15 = (i21 & 16777216) != 0 ? true : z11;
        boolean z16 = (i21 & 33554432) == 0 ? z12 : true;
        String str29 = (i21 & 67108864) != 0 ? BuildConfig.VERSION_NAME : str14;
        boolean z17 = (i21 & 134217728) != 0 ? false : z13;
        boolean z18 = (i21 & 268435456) != 0 ? false : z14;
        JsonObject jsonObject6 = (i21 & 536870912) != 0 ? new JsonObject() : jsonObject;
        JsonObject jsonObject7 = (i21 & 1073741824) != 0 ? new JsonObject() : jsonObject2;
        JsonObject jsonObject8 = (i21 & Integer.MIN_VALUE) != 0 ? new JsonObject() : jsonObject3;
        JsonObject jsonObject9 = (i22 & 1) != 0 ? new JsonObject() : jsonObject4;
        JsonObject jsonObject10 = (i22 & 2) != 0 ? new JsonObject() : jsonObject5;
        int i33 = i22 & 4;
        List list3 = r.f50854a;
        this(i30, i24, i25, i26, i27, i28, i29, str16, str17, str18, str19, str20, str21, str22, j13, i31, j14, str23, str24, i32, str25, str26, str27, str28, z15, z16, str29, z17, z18, jsonObject6, jsonObject7, jsonObject8, jsonObject9, jsonObject10, i33 != 0 ? list3 : list, (i22 & 8) == 0 ? list2 : list3, (i22 & 16) != 0 ? BuildConfig.VERSION_NAME : str15);
    }
}
