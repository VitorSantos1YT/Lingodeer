package sk;

import a9.i;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.lingo.lingoskill.franchskill.ui.learn.FRSyllableIntroductionActivity2;
import com.lingodeer.R;
import kotlin.jvm.internal.m;
import qy.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FRSyllableIntroductionActivity2 f51720b;

    public e(FRSyllableIntroductionActivity2 fRSyllableIntroductionActivity2, String str) {
        m.f(str, "str");
        this.f51720b = fRSyllableIntroductionActivity2;
        this.f51719a = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View v11) {
        m.f(v11, "v");
        FRSyllableIntroductionActivity2 fRSyllableIntroductionActivity2 = this.f51720b;
        i iVar = fRSyllableIntroductionActivity2.J0;
        q qVar = fv.b.f28186a;
        String strC = fRSyllableIntroductionActivity2.I0.c(this.f51719a);
        m.e(strC, "getCharName(...)");
        iVar.v(fv.b.c(strC, null, null));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds2) {
        m.f(ds2, "ds");
        ds2.setColor(this.f51720b.getResources().getColor(R.color.colorAccent));
    }
}
