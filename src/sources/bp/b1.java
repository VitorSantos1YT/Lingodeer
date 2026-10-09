package bp;

import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.api.Service;
import com.lingo.lingoskill.object.LocateLanguageItem;
import com.lingo.story.ui.StoryActivity;
import com.lingo.switchlanguage.ui.SwitchLanguageActivity;
import com.lingodeer.data.model.AchievementLeaderBoard;
import com.lingodeer.data.model.AchievementLevel;
import com.lingodeer.data.model.CourseCharacter;
import com.lingodeer.data.model.SyllableWriteLesson;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b1 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4500c;

    public /* synthetic */ b1(int i11, Object obj, Object obj2) {
        this.f4498a = i11;
        this.f4499b = obj;
        this.f4500c = obj2;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f4498a) {
            case 0:
                ((fz.c) this.f4499b).invoke((LocateLanguageItem) this.f4500c);
                return qy.b0.f48488a;
            case 1:
                r2 r2Var = (r2) this.f4499b;
                ViewModelStore viewModelStore = ((q2) this.f4500c).f4775b.getViewModelStore();
                CreationExtras defaultViewModelCreationExtras = r2Var.getDefaultViewModelCreationExtras();
                kotlin.jvm.internal.m.e(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
                return i20.b.a(kotlin.jvm.internal.z.a(wu.j.class), viewModelStore, null, defaultViewModelCreationExtras, null, ef.e.q(r2Var), null);
            case 2:
                v2 v2Var = (v2) this.f4499b;
                ViewModelStore viewModelStore2 = ((v2) ((bj.a) this.f4500c).f4455b).getViewModelStore();
                CreationExtras defaultViewModelCreationExtras2 = v2Var.getDefaultViewModelCreationExtras();
                kotlin.jvm.internal.m.e(defaultViewModelCreationExtras2, "<get-defaultViewModelCreationExtras>(...)");
                return i20.b.a(kotlin.jvm.internal.z.a(wu.j.class), viewModelStore2, null, defaultViewModelCreationExtras2, null, ef.e.q(v2Var), null);
            case 3:
                b5 b5Var = (b5) this.f4499b;
                androidx.fragment.app.p0 p0VarRequireActivity = ((z4) this.f4500c).f4937b.requireActivity();
                return i20.b.a(kotlin.jvm.internal.z.a(gp.l1.class), p0VarRequireActivity.getViewModelStore(), null, p0VarRequireActivity.getDefaultViewModelCreationExtras(), null, ef.e.q(b5Var), null);
            case 4:
                b5 b5Var2 = (b5) this.f4499b;
                androidx.fragment.app.p0 p0VarRequireActivity2 = ((z4) this.f4500c).f4937b.requireActivity();
                return i20.b.a(kotlin.jvm.internal.z.a(gp.w.class), p0VarRequireActivity2.getViewModelStore(), null, p0VarRequireActivity2.getDefaultViewModelCreationExtras(), null, ef.e.q(b5Var2), null);
            case 5:
                ((gl.a) this.f4499b).a((String) ((List) this.f4500c).get(1));
                return qy.b0.f48488a;
            case 6:
                ej.g gVar = (ej.g) this.f4499b;
                androidx.fragment.app.p0 p0VarRequireActivity3 = ((ej.f) this.f4500c).f25687b.requireActivity();
                return i20.b.a(kotlin.jvm.internal.z.a(fj.c.class), p0VarRequireActivity3.getViewModelStore(), null, p0VarRequireActivity3.getDefaultViewModelCreationExtras(), null, ef.e.q(gVar), null);
            case 7:
                ej.l lVar = (ej.l) this.f4499b;
                androidx.fragment.app.p0 p0VarRequireActivity4 = ((ej.l) ((bj.a) this.f4500c).f4455b).requireActivity();
                return i20.b.a(kotlin.jvm.internal.z.a(gp.w.class), p0VarRequireActivity4.getViewModelStore(), null, p0VarRequireActivity4.getDefaultViewModelCreationExtras(), null, ef.e.q(lVar), null);
            case 8:
                hh.c0 c0Var = (hh.c0) this.f4499b;
                androidx.fragment.app.p0 p0VarRequireActivity5 = ((hh.c0) ((bj.a) this.f4500c).f4455b).requireActivity();
                return i20.b.a(kotlin.jvm.internal.z.a(jh.o.class), p0VarRequireActivity5.getViewModelStore(), null, p0VarRequireActivity5.getDefaultViewModelCreationExtras(), null, ef.e.q(c0Var), null);
            case 9:
                hh.j0 j0Var = (hh.j0) this.f4499b;
                androidx.fragment.app.p0 p0VarRequireActivity6 = ((hh.i0) this.f4500c).f32244b.requireActivity();
                return i20.b.a(kotlin.jvm.internal.z.a(jh.o.class), p0VarRequireActivity6.getViewModelStore(), null, p0VarRequireActivity6.getDefaultViewModelCreationExtras(), null, ef.e.q(j0Var), null);
            case 10:
                hh.j0 j0Var2 = (hh.j0) this.f4499b;
                ViewModelStore viewModelStore3 = ((hh.i0) this.f4500c).f32244b.getViewModelStore();
                CreationExtras defaultViewModelCreationExtras3 = j0Var2.getDefaultViewModelCreationExtras();
                kotlin.jvm.internal.m.e(defaultViewModelCreationExtras3, "<get-defaultViewModelCreationExtras>(...)");
                return i20.b.a(kotlin.jvm.internal.z.a(sr.e.class), viewModelStore3, null, defaultViewModelCreationExtras3, null, ef.e.q(j0Var2), null);
            case 11:
                hh.o0 o0Var = (hh.o0) this.f4499b;
                androidx.fragment.app.p0 p0VarRequireActivity7 = ((hh.o0) ((bj.a) this.f4500c).f4455b).requireActivity();
                return i20.b.a(kotlin.jvm.internal.z.a(jh.o.class), p0VarRequireActivity7.getViewModelStore(), null, p0VarRequireActivity7.getDefaultViewModelCreationExtras(), null, ef.e.q(o0Var), null);
            case 12:
                hh.u0 u0Var = (hh.u0) this.f4499b;
                androidx.fragment.app.p0 p0VarRequireActivity8 = ((hh.u0) ((bj.a) this.f4500c).f4455b).requireActivity();
                return i20.b.a(kotlin.jvm.internal.z.a(jh.o.class), p0VarRequireActivity8.getViewModelStore(), null, p0VarRequireActivity8.getDefaultViewModelCreationExtras(), null, ef.e.q(u0Var), null);
            case 13:
                hh.f1 f1Var = (hh.f1) this.f4499b;
                androidx.fragment.app.p0 p0VarRequireActivity9 = ((hh.f1) ((bj.a) this.f4500c).f4455b).requireActivity();
                return i20.b.a(kotlin.jvm.internal.z.a(gp.l1.class), p0VarRequireActivity9.getViewModelStore(), null, p0VarRequireActivity9.getDefaultViewModelCreationExtras(), null, ef.e.q(f1Var), null);
            case 14:
                hp.d dVar = (hp.d) this.f4499b;
                androidx.fragment.app.p0 p0VarRequireActivity10 = ((hp.d) ((bj.a) this.f4500c).f4455b).requireActivity();
                return i20.b.a(kotlin.jvm.internal.z.a(gp.l1.class), p0VarRequireActivity10.getViewModelStore(), null, p0VarRequireActivity10.getDefaultViewModelCreationExtras(), null, ef.e.q(dVar), null);
            case 15:
                ((fz.c) this.f4499b).invoke((kv.i0) this.f4500c);
                return qy.b0.f48488a;
            case 16:
                ((ml.a) this.f4499b).a(oz.x.q0(oz.x.q0((String) this.f4500c, "[", BuildConfig.VERSION_NAME), "]", BuildConfig.VERSION_NAME));
                return qy.b0.f48488a;
            case 17:
                StoryActivity storyActivity = (StoryActivity) this.f4499b;
                jr.b bVar = (jr.b) this.f4500c;
                return i20.b.a(kotlin.jvm.internal.z.a(kr.r1.class), storyActivity.getViewModelStore(), null, storyActivity.getDefaultViewModelCreationExtras(), null, ef.e.q(storyActivity), bVar);
            case 18:
                km.c0 c0Var2 = (km.c0) this.f4499b;
                androidx.fragment.app.p0 p0VarRequireActivity11 = ((km.c0) ((bj.a) this.f4500c).f4455b).requireActivity();
                return i20.b.a(kotlin.jvm.internal.z.a(gp.l1.class), p0VarRequireActivity11.getViewModelStore(), null, p0VarRequireActivity11.getDefaultViewModelCreationExtras(), null, ef.e.q(c0Var2), null);
            case 19:
                SwitchLanguageActivity switchLanguageActivity = (SwitchLanguageActivity) this.f4499b;
                lr.b bVar2 = (lr.b) this.f4500c;
                return i20.b.a(kotlin.jvm.internal.z.a(nr.i.class), switchLanguageActivity.getViewModelStore(), null, switchLanguageActivity.getDefaultViewModelCreationExtras(), null, ef.e.q(switchLanguageActivity), bVar2);
            case 20:
                ((l1.b1) this.f4500c).setValue(new lt.i(((ps.b) this.f4499b).f47122a));
                return qy.b0.f48488a;
            case 21:
                ((l1.b1) this.f4500c).setValue(((rt.r) this.f4499b).f50318a);
                return qy.b0.f48488a;
            case 22:
                oo.y yVar = (oo.y) this.f4499b;
                ViewModelStore viewModelStore4 = ((oo.x) this.f4500c).f45709b.getViewModelStore();
                CreationExtras defaultViewModelCreationExtras4 = yVar.getDefaultViewModelCreationExtras();
                kotlin.jvm.internal.m.e(defaultViewModelCreationExtras4, "<get-defaultViewModelCreationExtras>(...)");
                return i20.b.a(kotlin.jvm.internal.z.a(sr.e.class), viewModelStore4, null, defaultViewModelCreationExtras4, null, ef.e.q(yVar), null);
            case 23:
                ((fz.c) this.f4499b).invoke((AchievementLevel) this.f4500c);
                return qy.b0.f48488a;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                ((fz.c) this.f4499b).invoke((AchievementLeaderBoard) this.f4500c);
                return qy.b0.f48488a;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ((fz.c) this.f4499b).invoke((SyllableWriteLesson) this.f4500c);
                return qy.b0.f48488a;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                ((fz.c) this.f4499b).invoke(Integer.valueOf(((tu.k) this.f4500c).f52594a));
                return qy.b0.f48488a;
            case 27:
                ui.m mVar = (ui.m) this.f4499b;
                androidx.fragment.app.p0 p0VarRequireActivity12 = ((ui.m) ((tp.h0) this.f4500c).f52467b).requireActivity();
                return i20.b.a(kotlin.jvm.internal.z.a(gp.l1.class), p0VarRequireActivity12.getViewModelStore(), null, p0VarRequireActivity12.getDefaultViewModelCreationExtras(), null, ef.e.q(mVar), null);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                ((fz.c) this.f4499b).invoke((String) this.f4500c);
                return qy.b0.f48488a;
            default:
                ((fz.c) this.f4499b).invoke((CourseCharacter) this.f4500c);
                return qy.b0.f48488a;
        }
    }
}
