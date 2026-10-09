package qp;

import android.content.Context;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.object.Word;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h2 extends zq.b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f47955u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ i2 f47956v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(FlexboxLayout flexboxLayout, i2 i2Var, Context context, List list, int i11) {
        super(context, list, flexboxLayout);
        this.f47955u = i11;
        this.f47956v = i2Var;
        switch (i11) {
            case 1:
                kotlin.jvm.internal.m.c(list);
                super(context, list, flexboxLayout);
                break;
            default:
                kotlin.jvm.internal.m.c(list);
                break;
        }
    }

    @Override // zq.b
    public final String c(Word word) {
        switch (this.f47955u) {
            case 0:
                return BuildConfig.VERSION_NAME;
            default:
                qy.q qVar = fv.b.f28186a;
                return fv.b.Y(word.getWordId(), null, null);
        }
    }

    @Override // zq.b
    public final void h(Word word, TextView textView, TextView textView2, TextView textView3) {
        switch (this.f47955u) {
            case 0:
                kotlin.jvm.internal.m.f(word, "word");
                boolean z11 = ((jp.p0) this.f47956v.f47881a).Q;
                zq.c.e(word, textView, textView2, textView3, true);
                break;
            default:
                kotlin.jvm.internal.m.f(word, "word");
                boolean z12 = ((jp.p0) this.f47956v.f47881a).Q;
                zq.c.e(word, textView, textView2, textView3, true);
                break;
        }
    }
}
