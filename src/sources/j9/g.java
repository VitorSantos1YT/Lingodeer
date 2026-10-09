package j9;

import android.content.Context;
import com.google.api.Service;
import com.lingo.story.ui.StoryActivity;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f36198b;

    public /* synthetic */ g(v vVar, int i11) {
        this.f36197a = i11;
        this.f36198b = vVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [fz.a, kotlin.jvm.internal.j] */
    @Override // fz.a
    public final Object invoke() {
        int i11;
        int i12 = this.f36197a;
        qy.b0 b0Var = qy.b0.f48488a;
        v vVar = this.f36198b;
        switch (i12) {
            case 0:
                f.e0 e0Var = vVar.f36261f;
                boolean z11 = false;
                if (vVar.f36262g) {
                    ry.k kVar = vVar.f36257b.f41075f;
                    if (kVar == null || !kVar.isEmpty()) {
                        Iterator it = kVar.iterator();
                        i11 = 0;
                        while (it.hasNext()) {
                            if (!(((e) it.next()).f36188b instanceof s) && (i11 = i11 + 1) < 0) {
                                ns.o.U();
                                throw null;
                            }
                        }
                    } else {
                        i11 = 0;
                    }
                    if (i11 > 1) {
                        z11 = true;
                    }
                }
                e0Var.f26172a = z11;
                ?? r9 = e0Var.f26174c;
                if (r9 != 0) {
                    r9.invoke();
                }
                return b0Var;
            case 1:
                Context context = vVar.f36256a;
                d0 navigatorProvider = vVar.f36257b.f41087s;
                kotlin.jvm.internal.m.f(context, "context");
                kotlin.jvm.internal.m.f(navigatorProvider, "navigatorProvider");
                return new w();
            case 2:
                int i13 = StoryActivity.N;
                vVar.a(jr.a0.StorySpeaking.a(), new a0(17));
                return b0Var;
            case 3:
                int i14 = StoryActivity.N;
                vVar.a(jr.a0.StorySpeaking.a(), new a0(16));
                return b0Var;
            case 4:
                int i15 = StoryActivity.N;
                vVar.a(jr.a0.StorySpeakingFinish.a(), new a0(19));
                return b0Var;
            case 5:
                vVar.c();
                return b0Var;
            case 6:
                vVar.c();
                return b0Var;
            case 7:
                v.b(vVar, "explain");
                return b0Var;
            case 8:
                vVar.c();
                return b0Var;
            case 9:
                vVar.c();
                return b0Var;
            case 10:
                vVar.c();
                return b0Var;
            case 11:
                v.b(vVar, "customize_review");
                return b0Var;
            case 12:
                v.b(vVar, "explain");
                return b0Var;
            case 13:
                v.b(vVar, "scheduled_srs");
                return b0Var;
            case 14:
                vVar.a("course_test_finish", new lt.d(25));
                return b0Var;
            case 15:
                vVar.c();
                return b0Var;
            case 16:
                vVar.c();
                return b0Var;
            case 17:
                vVar.c();
                return b0Var;
            case 18:
                if (!vVar.c()) {
                    v.b(vVar, "syllable_index");
                }
                return b0Var;
            case 19:
                if (!vVar.c()) {
                    v.b(vVar, "syllable_index");
                }
                return b0Var;
            case 20:
                v.b(vVar, "syllable_finish");
                return b0Var;
            case 21:
                vVar.c();
                return b0Var;
            case 22:
                v.b(vVar, "search");
                return b0Var;
            case 23:
                v.b(vVar, "course_dialogue_finish");
                return b0Var;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                v.b(vVar, "course_dialogue_finish");
                return b0Var;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                v.b(vVar, "course_test_finish");
                return b0Var;
            default:
                vVar.a("course_test_finish", new xt.r(27));
                return b0Var;
        }
    }
}
