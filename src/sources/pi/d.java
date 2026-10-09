package pi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import bq.z;
import com.lingo.lingoskill.chineseskill.ui.pinyin.PinyinIntroductionActivity;
import com.lingo.lingoskill.chineseskill.ui.pinyin.PinyinLessonIndexActivity;
import com.lingo.lingoskill.chineseskill.ui.pinyin.PinyinStudyActivity;
import com.lingo.lingoskill.chineseskill.ui.sc.ui.ScActivity;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hj.w3;
import kotlin.jvm.internal.m;
import qy.b0;
import ve.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends ji.e {
    public d() {
        super(c.f46940a, BuildConfig.VERSION_NAME);
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        String string = getString(R.string.alphabet);
        m.e(string, "getString(...)");
        l.m mVar = this.f36398d;
        m.c(mVar);
        View view = this.f36399e;
        m.c(view);
        i.H(string, mVar, view);
        ta.a aVar = this.f36400f;
        m.c(aVar);
        final int i11 = 0;
        z.b(((w3) aVar).f33519d, new fz.c(this) { // from class: pi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f46939b;

            {
                this.f46939b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i12 = i11;
                b0 b0Var = b0.f48488a;
                d dVar = this.f46939b;
                View it = (View) obj;
                switch (i12) {
                    case 0:
                        m.f(it, "it");
                        int i13 = PinyinLessonIndexActivity.P;
                        l.m mVar2 = dVar.f36398d;
                        m.c(mVar2);
                        dVar.startActivity(new Intent(mVar2, (Class<?>) PinyinLessonIndexActivity.class));
                        break;
                    case 1:
                        m.f(it, "it");
                        dVar.startActivity(new Intent(dVar.f36398d, (Class<?>) PinyinStudyActivity.class));
                        break;
                    case 2:
                        m.f(it, "it");
                        dVar.startActivity(new Intent(dVar.f36398d, (Class<?>) PinyinIntroductionActivity.class));
                        break;
                    default:
                        m.f(it, "it");
                        dVar.startActivity(new Intent(dVar.f36398d, (Class<?>) ScActivity.class));
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar2 = this.f36400f;
        m.c(aVar2);
        final int i12 = 1;
        z.b(((w3) aVar2).f33517b, new fz.c(this) { // from class: pi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f46939b;

            {
                this.f46939b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i13 = i12;
                b0 b0Var = b0.f48488a;
                d dVar = this.f46939b;
                View it = (View) obj;
                switch (i13) {
                    case 0:
                        m.f(it, "it");
                        int i14 = PinyinLessonIndexActivity.P;
                        l.m mVar2 = dVar.f36398d;
                        m.c(mVar2);
                        dVar.startActivity(new Intent(mVar2, (Class<?>) PinyinLessonIndexActivity.class));
                        break;
                    case 1:
                        m.f(it, "it");
                        dVar.startActivity(new Intent(dVar.f36398d, (Class<?>) PinyinStudyActivity.class));
                        break;
                    case 2:
                        m.f(it, "it");
                        dVar.startActivity(new Intent(dVar.f36398d, (Class<?>) PinyinIntroductionActivity.class));
                        break;
                    default:
                        m.f(it, "it");
                        dVar.startActivity(new Intent(dVar.f36398d, (Class<?>) ScActivity.class));
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar3 = this.f36400f;
        m.c(aVar3);
        final int i13 = 2;
        z.b(((w3) aVar3).f33518c, new fz.c(this) { // from class: pi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f46939b;

            {
                this.f46939b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i14 = i13;
                b0 b0Var = b0.f48488a;
                d dVar = this.f46939b;
                View it = (View) obj;
                switch (i14) {
                    case 0:
                        m.f(it, "it");
                        int i15 = PinyinLessonIndexActivity.P;
                        l.m mVar2 = dVar.f36398d;
                        m.c(mVar2);
                        dVar.startActivity(new Intent(mVar2, (Class<?>) PinyinLessonIndexActivity.class));
                        break;
                    case 1:
                        m.f(it, "it");
                        dVar.startActivity(new Intent(dVar.f36398d, (Class<?>) PinyinStudyActivity.class));
                        break;
                    case 2:
                        m.f(it, "it");
                        dVar.startActivity(new Intent(dVar.f36398d, (Class<?>) PinyinIntroductionActivity.class));
                        break;
                    default:
                        m.f(it, "it");
                        dVar.startActivity(new Intent(dVar.f36398d, (Class<?>) ScActivity.class));
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar4 = this.f36400f;
        m.c(aVar4);
        final int i14 = 3;
        z.b(((w3) aVar4).f33520e, new fz.c(this) { // from class: pi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f46939b;

            {
                this.f46939b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i15 = i14;
                b0 b0Var = b0.f48488a;
                d dVar = this.f46939b;
                View it = (View) obj;
                switch (i15) {
                    case 0:
                        m.f(it, "it");
                        int i16 = PinyinLessonIndexActivity.P;
                        l.m mVar2 = dVar.f36398d;
                        m.c(mVar2);
                        dVar.startActivity(new Intent(mVar2, (Class<?>) PinyinLessonIndexActivity.class));
                        break;
                    case 1:
                        m.f(it, "it");
                        dVar.startActivity(new Intent(dVar.f36398d, (Class<?>) PinyinStudyActivity.class));
                        break;
                    case 2:
                        m.f(it, "it");
                        dVar.startActivity(new Intent(dVar.f36398d, (Class<?>) PinyinIntroductionActivity.class));
                        break;
                    default:
                        m.f(it, "it");
                        dVar.startActivity(new Intent(dVar.f36398d, (Class<?>) ScActivity.class));
                        break;
                }
                return b0Var;
            }
        });
    }
}
