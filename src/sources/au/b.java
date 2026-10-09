package au;

import com.google.api.Service;
import com.lingodeer.database.model.BillingStatusEntity;
import com.lingodeer.database.model.BookmarkEntity;
import com.lingodeer.database.model.BookmarkFolderEntity;
import com.lingodeer.database.model.ChineseToneLastVisitedEntity;
import com.lingodeer.database.model.DailyLearnHistoryEntity;
import com.lingodeer.database.model.DailyLearnTimeHistoryEntity;
import com.lingodeer.database.model.DailyStreakHistoryEntity;
import com.lingodeer.database.model.DauMetricsEntity;
import com.lingodeer.database.model.DbFileVersionEntity;
import com.lingodeer.database.model.KnowledgeNoteEntity;
import com.lingodeer.database.model.LanguageHistoryEntity;
import com.lingodeer.database.model.LastSyncTimeEntity;
import com.lingodeer.database.model.LearnProgressEntity;
import com.lingodeer.database.model.LessonFinishStatusEntity;
import com.lingodeer.database.model.LessonTestProgressEntity;
import com.lingodeer.database.model.LoginHistoryEntity;
import com.lingodeer.database.model.ReviewStatusEntity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2944c;

    public /* synthetic */ b(int i11, Object obj, Object obj2) {
        this.f2942a = i11;
        this.f2943b = obj;
        this.f2944c = obj2;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f2942a) {
            case 0:
                d dVar = (d) this.f2943b;
                BillingStatusEntity billingStatusEntity = (BillingStatusEntity) this.f2944c;
                ja.a _connection = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection, "_connection");
                dVar.f2967b.D(_connection, billingStatusEntity);
                return qy.b0.f48488a;
            case 1:
                i iVar = (i) this.f2943b;
                BookmarkEntity bookmarkEntity = (BookmarkEntity) this.f2944c;
                ja.a _connection2 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection2, "_connection");
                iVar.f3012b.D(_connection2, bookmarkEntity);
                return qy.b0.f48488a;
            case 2:
                i iVar2 = (i) this.f2943b;
                ArrayList arrayList = (ArrayList) this.f2944c;
                ja.a _connection3 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection3, "_connection");
                iVar2.f3012b.C(_connection3, arrayList);
                return qy.b0.f48488a;
            case 3:
                m mVar = (m) this.f2943b;
                ArrayList arrayList2 = (ArrayList) this.f2944c;
                ja.a _connection4 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection4, "_connection");
                mVar.f3045b.C(_connection4, arrayList2);
                return qy.b0.f48488a;
            case 4:
                m mVar2 = (m) this.f2943b;
                BookmarkFolderEntity bookmarkFolderEntity = (BookmarkFolderEntity) this.f2944c;
                ja.a _connection5 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection5, "_connection");
                mVar2.f3045b.D(_connection5, bookmarkFolderEntity);
                return qy.b0.f48488a;
            case 5:
                t tVar = (t) this.f2943b;
                ChineseToneLastVisitedEntity chineseToneLastVisitedEntity = (ChineseToneLastVisitedEntity) this.f2944c;
                ja.a _connection6 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection6, "_connection");
                tVar.f3071b.D(_connection6, chineseToneLastVisitedEntity);
                return qy.b0.f48488a;
            case 6:
                f0 f0Var = (f0) this.f2943b;
                List list = (List) this.f2944c;
                ja.a _connection7 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection7, "_connection");
                f0Var.f2989b.C(_connection7, list);
                return qy.b0.f48488a;
            case 7:
                f0 f0Var2 = (f0) this.f2943b;
                DailyLearnHistoryEntity dailyLearnHistoryEntity = (DailyLearnHistoryEntity) this.f2944c;
                ja.a _connection8 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection8, "_connection");
                return Long.valueOf(f0Var2.f2990c.E(_connection8, dailyLearnHistoryEntity));
            case 8:
                k0 k0Var = (k0) this.f2943b;
                ArrayList arrayList3 = (ArrayList) this.f2944c;
                ja.a _connection9 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection9, "_connection");
                k0Var.f3037b.C(_connection9, arrayList3);
                return qy.b0.f48488a;
            case 9:
                k0 k0Var2 = (k0) this.f2943b;
                DailyLearnTimeHistoryEntity dailyLearnTimeHistoryEntity = (DailyLearnTimeHistoryEntity) this.f2944c;
                ja.a _connection10 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection10, "_connection");
                return Long.valueOf(k0Var2.f3038c.E(_connection10, dailyLearnTimeHistoryEntity));
            case 10:
                l0 l0Var = (l0) this.f2943b;
                List list2 = (List) this.f2944c;
                ja.a _connection11 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection11, "_connection");
                l0Var.f3043b.C(_connection11, list2);
                return qy.b0.f48488a;
            case 11:
                l0 l0Var2 = (l0) this.f2943b;
                DailyStreakHistoryEntity dailyStreakHistoryEntity = (DailyStreakHistoryEntity) this.f2944c;
                ja.a _connection12 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection12, "_connection");
                l0Var2.f3043b.D(_connection12, dailyStreakHistoryEntity);
                return qy.b0.f48488a;
            case 12:
                m0 m0Var = (m0) this.f2943b;
                DauMetricsEntity dauMetricsEntity = (DauMetricsEntity) this.f2944c;
                ja.a _connection13 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection13, "_connection");
                m0Var.f3047b.D(_connection13, dauMetricsEntity);
                return qy.b0.f48488a;
            case 13:
                m0 m0Var2 = (m0) this.f2943b;
                ArrayList arrayList4 = (ArrayList) this.f2944c;
                ja.a _connection14 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection14, "_connection");
                m0Var2.f3047b.C(_connection14, arrayList4);
                return qy.b0.f48488a;
            case 14:
                n0 n0Var = (n0) this.f2943b;
                DbFileVersionEntity dbFileVersionEntity = (DbFileVersionEntity) this.f2944c;
                ja.a _connection15 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection15, "_connection");
                n0Var.f3052b.D(_connection15, dbFileVersionEntity);
                return qy.b0.f48488a;
            case 15:
                o0 o0Var = (o0) this.f2943b;
                ArrayList arrayList5 = (ArrayList) this.f2944c;
                ja.a _connection16 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection16, "_connection");
                o0Var.f3056b.C(_connection16, arrayList5);
                return qy.b0.f48488a;
            case 16:
                o0 o0Var2 = (o0) this.f2943b;
                KnowledgeNoteEntity knowledgeNoteEntity = (KnowledgeNoteEntity) this.f2944c;
                ja.a _connection17 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection17, "_connection");
                o0Var2.f3056b.D(_connection17, knowledgeNoteEntity);
                return qy.b0.f48488a;
            case 17:
                q0 q0Var = (q0) this.f2943b;
                LanguageHistoryEntity languageHistoryEntity = (LanguageHistoryEntity) this.f2944c;
                ja.a _connection18 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection18, "_connection");
                q0Var.f3063b.D(_connection18, languageHistoryEntity);
                return qy.b0.f48488a;
            case 18:
                r0 r0Var = (r0) this.f2943b;
                ArrayList arrayList6 = (ArrayList) this.f2944c;
                ja.a _connection19 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection19, "_connection");
                r0Var.f3066b.C(_connection19, arrayList6);
                return qy.b0.f48488a;
            case 19:
                s0 s0Var = (s0) this.f2943b;
                LastSyncTimeEntity lastSyncTimeEntity = (LastSyncTimeEntity) this.f2944c;
                ja.a _connection20 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection20, "_connection");
                s0Var.f3069b.D(_connection20, lastSyncTimeEntity);
                return qy.b0.f48488a;
            case 20:
                t0 t0Var = (t0) this.f2943b;
                LearnProgressEntity learnProgressEntity = (LearnProgressEntity) this.f2944c;
                ja.a _connection21 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection21, "_connection");
                t0Var.f3073b.D(_connection21, learnProgressEntity);
                return qy.b0.f48488a;
            case 21:
                t0 t0Var2 = (t0) this.f2943b;
                ArrayList arrayList7 = (ArrayList) this.f2944c;
                ja.a _connection22 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection22, "_connection");
                t0Var2.f3073b.C(_connection22, arrayList7);
                return qy.b0.f48488a;
            case 22:
                u0 u0Var = (u0) this.f2943b;
                LessonFinishStatusEntity lessonFinishStatusEntity = (LessonFinishStatusEntity) this.f2944c;
                ja.a _connection23 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection23, "_connection");
                u0Var.f3076b.D(_connection23, lessonFinishStatusEntity);
                return qy.b0.f48488a;
            case 23:
                u0 u0Var2 = (u0) this.f2943b;
                ArrayList arrayList8 = (ArrayList) this.f2944c;
                ja.a _connection24 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection24, "_connection");
                u0Var2.f3076b.C(_connection24, arrayList8);
                return qy.b0.f48488a;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                v0 v0Var = (v0) this.f2943b;
                LessonTestProgressEntity lessonTestProgressEntity = (LessonTestProgressEntity) this.f2944c;
                ja.a _connection25 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection25, "_connection");
                v0Var.f3079b.D(_connection25, lessonTestProgressEntity);
                return qy.b0.f48488a;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                w0 w0Var = (w0) this.f2943b;
                LoginHistoryEntity loginHistoryEntity = (LoginHistoryEntity) this.f2944c;
                ja.a _connection26 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection26, "_connection");
                w0Var.f3082b.D(_connection26, loginHistoryEntity);
                return qy.b0.f48488a;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                z0 z0Var = (z0) this.f2943b;
                ArrayList arrayList9 = (ArrayList) this.f2944c;
                ja.a _connection27 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection27, "_connection");
                z0Var.f3104b.C(_connection27, arrayList9);
                return qy.b0.f48488a;
            case 27:
                z0 z0Var2 = (z0) this.f2943b;
                ReviewStatusEntity reviewStatusEntity = (ReviewStatusEntity) this.f2944c;
                ja.a _connection28 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection28, "_connection");
                z0Var2.f3104b.D(_connection28, reviewStatusEntity);
                return qy.b0.f48488a;
            default:
                c1 c1Var = (c1) this.f2943b;
                ArrayList arrayList10 = (ArrayList) this.f2944c;
                ja.a _connection29 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection29, "_connection");
                c1Var.f2965b.C(_connection29, arrayList10);
                return qy.b0.f48488a;
        }
    }
}
