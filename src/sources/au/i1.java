package au;

import com.lingodeer.database.model.UserInfoEntity;
import fr.j3;
import g00.t1;
import java.util.List;
import rt.m5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i1 extends j3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j1 f3020c;

    public i1(j1 j1Var) {
        this.f3020c = j1Var;
    }

    @Override // fr.j3
    public final void f(ja.c statement, Object obj) {
        UserInfoEntity entity = (UserInfoEntity) obj;
        kotlin.jvm.internal.m.f(statement, "statement");
        kotlin.jvm.internal.m.f(entity, "entity");
        statement.b0(1, entity.getId());
        statement.g(2, entity.getTotalXP());
        statement.g(3, entity.getTotalTime());
        statement.g(4, entity.getTotalGems());
        statement.g(5, entity.getStreakFreezer());
        statement.g(6, entity.getStreakSaver());
        statement.g(7, entity.getLeaderboardWeekXP());
        statement.g(8, entity.getLeaderboardEmojiStatus());
        statement.g(9, entity.getLeaderboardLearnedTime());
        statement.b0(10, entity.getSkillMastery());
        statement.b0(11, entity.getAchievementTopStudent());
        statement.b0(12, entity.getAchievementXPExpert());
        statement.b0(13, entity.getAchievementStreakHero());
        statement.b0(14, entity.getAchievementLeaderboard());
        statement.b0(15, entity.getAchievementLanguages());
        m5 m5Var = this.f3020c.f3031c;
        List<String> allFollowings = entity.getAllFollowings();
        h00.s sVar = (h00.s) m5Var.f50058b;
        List<String> list = ry.r.f50854a;
        if (allFollowings == null) {
            allFollowings = list;
        }
        sVar.getClass();
        t1 t1Var = t1.f28468a;
        statement.b0(16, sVar.c(new g00.d(t1Var, 0), allFollowings));
        List<String> allFollowers = entity.getAllFollowers();
        h00.s sVar2 = (h00.s) m5Var.f50058b;
        if (allFollowers != null) {
            list = allFollowers;
        }
        sVar2.getClass();
        statement.b0(17, sVar2.c(new g00.d(t1Var, 0), list));
        statement.b0(18, entity.getAnimatedEmojis());
    }

    @Override // fr.j3
    public final String o() {
        return "INSERT OR REPLACE INTO `user_info` (`id`,`total_xp`,`total_time`,`total_gems`,`streak_freezer`,`streak_saver`,`leaderboard_week_xp`,`leaderboard_emoji_status`,`leaderboard_learned_time`,`skill_mastery`,`achievement_top_student`,`achievement_xp_expert`,`achievement_streak_hero`,`achievement_leaderboard`,`achievement_languages`,`all_followings`,`all_followers`,`animated_emojis`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }
}
