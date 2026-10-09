package fr;

import android.os.Bundle;
import com.lingodeer.data.model.UserInfo;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f27473b;

    public /* synthetic */ e(kotlin.jvm.internal.y yVar, int i11) {
        this.f27472a = i11;
        this.f27473b = yVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f27472a) {
            case 0:
                kotlin.jvm.internal.y yVar = this.f27473b;
                int totalFinishedLesson = ((UserInfo) yVar.f38361a).getTotalFinishedLesson();
                return UserInfo.copy$default((UserInfo) obj, null, 0, 0, 0, 0, 0, 0L, 0, 0L, null, ((UserInfo) yVar.f38361a).getAchievementTopStudent(), ((UserInfo) yVar.f38361a).getAchievementXPExpert(), ((UserInfo) yVar.f38361a).getAchievementStreakHero(), null, null, null, null, 0, 0, 0, ((UserInfo) yVar.f38361a).getTotalKnowledgePoints(), ((UserInfo) yVar.f38361a).getTotalDayStreak(), totalFinishedLesson, null, null, 26207231, null);
            case 1:
                h00.m it = (h00.m) obj;
                kotlin.jvm.internal.m.f(it, "it");
                this.f27473b.f38361a = it;
                return qy.b0.f48488a;
            case 2:
                String key = (String) obj;
                kotlin.jvm.internal.m.f(key, "key");
                Object obj2 = this.f27473b.f38361a;
                return Boolean.valueOf(obj2 == null || !((Bundle) obj2).containsKey(key));
            default:
                y2.g2 g2Var = (y2.g2) obj;
                kotlin.jvm.internal.m.d(g2Var, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                n0.l0 l0Var = ((n0.g1) g2Var).Q;
                kotlin.jvm.internal.y yVar2 = this.f27473b;
                List listM = (List) yVar2.f38361a;
                if (listM != null) {
                    listM.add(l0Var);
                } else {
                    listM = ns.o.M(l0Var);
                }
                yVar2.f38361a = listM;
                return y2.f2.SkipSubtreeAndContinueTraversal;
        }
    }
}
