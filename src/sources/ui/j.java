package ui;

import android.content.Intent;
import android.view.View;
import com.lingo.lingoskill.chineseskill.ui.pinyin.PinyinStudyActivity;
import com.lingodeer.R;
import ko.Zea.ealNNtLp;
import rt.m9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f52994b;

    public /* synthetic */ j(m mVar, int i11) {
        this.f52993a = i11;
        this.f52994b = mVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        View it = (View) obj;
        switch (this.f52993a) {
            case 0:
                kotlin.jvm.internal.m.f(it, "it");
                m mVar = this.f52994b;
                mVar.r().hasEnterAlphabet = true;
                mVar.r().updateEntry("hasEnterAlphabet");
                mVar.startActivity(new Intent(mVar.f36398d, (Class<?>) PinyinStudyActivity.class));
                b7.e0.A(mVar.t(), "jxz_alphabet_click_chart");
                break;
            default:
                kotlin.jvm.internal.m.f(it, ealNNtLp.UUkjUWqvtjVlwd);
                m mVar2 = this.f52994b;
                mVar2.t().c("jxz_alphabet_start_exam", new m9(24));
                mVar2.z(new xi.c(-2L, mVar2.getString(R.string.exam)));
                break;
        }
        return qy.b0.f48488a;
    }
}
