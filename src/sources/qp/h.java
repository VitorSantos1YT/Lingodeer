package qp;

import android.content.Context;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.object.Word;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends zq.b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f47944u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d f47945v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Context context, List list, FlexboxLayout flexboxLayout, d dVar, int i11) {
        super(context, null, list, flexboxLayout);
        this.f47944u = i11;
        this.f47945v = dVar;
    }

    @Override // zq.b
    public final String c(Word word) {
        switch (this.f47944u) {
            case 0:
                return BuildConfig.VERSION_NAME;
            case 1:
                qy.q qVar = fv.b.f28186a;
                return fv.b.Y(word.getWordId(), null, null);
            case 2:
                qy.q qVar2 = fv.b.f28186a;
                return fv.b.Y(word.getWordId(), null, null);
            case 3:
                qy.q qVar3 = fv.b.f28186a;
                return fv.b.Y(word.getWordId(), null, null);
            case 4:
            case 5:
                return BuildConfig.VERSION_NAME;
            case 6:
                qy.q qVar4 = fv.b.f28186a;
                return fv.b.Y(word.getWordId(), null, null);
            case 7:
                qy.q qVar5 = fv.b.f28186a;
                return fv.b.Y(word.getWordId(), null, null);
            case 8:
                qy.q qVar6 = fv.b.f28186a;
                return fv.b.Y(word.getWordId(), null, null);
            case 9:
                qy.q qVar7 = fv.b.f28186a;
                return fv.b.Y(word.getWordId(), null, null);
            case 10:
                qy.q qVar8 = fv.b.f28186a;
                return fv.b.Y(word.getWordId(), null, null);
            default:
                return BuildConfig.VERSION_NAME;
        }
    }

    @Override // zq.b
    public final void h(Word word, TextView textView, TextView textView2, TextView textView3) {
        switch (this.f47944u) {
            case 0:
                kotlin.jvm.internal.m.f(word, "word");
                boolean z11 = ((jp.p0) ((j) this.f47945v).f47881a).Q;
                zq.c.e(word, textView, textView2, textView3, true);
                break;
            case 1:
                kotlin.jvm.internal.m.f(word, "word");
                boolean z12 = ((jp.p0) ((w) this.f47945v).f47881a).Q;
                zq.c.e(word, textView, textView2, textView3, false);
                break;
            case 2:
                kotlin.jvm.internal.m.f(word, "word");
                boolean z13 = ((jp.p0) ((p0) this.f47945v).f47881a).Q;
                zq.c.e(word, textView, textView2, textView3, false);
                break;
            case 3:
                kotlin.jvm.internal.m.f(word, "word");
                boolean z14 = ((jp.p0) ((l1) this.f47945v).f47881a).Q;
                zq.c.e(word, textView, textView2, textView3, false);
                break;
            case 4:
                kotlin.jvm.internal.m.f(word, "word");
                boolean z15 = ((jp.p0) ((n1) this.f47945v).f47881a).Q;
                zq.c.e(word, textView, textView2, textView3, true);
                break;
            case 5:
                kotlin.jvm.internal.m.f(word, "word");
                boolean z16 = ((jp.p0) ((q1) this.f47945v).f47881a).Q;
                zq.c.e(word, textView, textView2, textView3, true);
                break;
            case 6:
                kotlin.jvm.internal.m.f(word, "word");
                boolean z17 = ((jp.p0) ((s1) this.f47945v).f47881a).Q;
                zq.c.e(word, textView, textView2, textView3, true);
                break;
            case 7:
                kotlin.jvm.internal.m.f(word, "word");
                boolean z18 = ((jp.p0) ((f2) this.f47945v).f47881a).Q;
                zq.c.e(word, textView, textView2, textView3, false);
                break;
            case 8:
                kotlin.jvm.internal.m.f(word, "word");
                ((s2) this.f47945v).v(word, textView, textView2, textView3);
                break;
            case 9:
                kotlin.jvm.internal.m.f(word, "word");
                boolean z19 = ((jp.p0) ((v2) this.f47945v).f47881a).Q;
                zq.c.e(word, textView, textView2, textView3, true);
                break;
            case 10:
                kotlin.jvm.internal.m.f(word, "word");
                boolean z20 = ((jp.p0) ((k3) this.f47945v).f47881a).Q;
                zq.c.e(word, textView, textView2, textView3, false);
                break;
            default:
                kotlin.jvm.internal.m.f(word, "word");
                boolean z21 = ((jp.p0) ((s3) this.f47945v).f47881a).Q;
                zq.c.e(word, textView, textView2, textView3, false);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(d dVar, Context context, List list, FlexboxLayout flexboxLayout, int i11) {
        super(context, list, flexboxLayout);
        this.f47944u = i11;
        this.f47945v = dVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, List list, FlexboxLayout flexboxLayout, k3 k3Var) {
        super(context, list, flexboxLayout);
        this.f47944u = 10;
        this.f47945v = k3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(FlexboxLayout flexboxLayout, n1 n1Var, Context context, List list) {
        super(context, list, flexboxLayout);
        this.f47944u = 4;
        this.f47945v = n1Var;
        kotlin.jvm.internal.m.c(list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, List list, FlexboxLayout flexboxLayout, l1 l1Var, String str) {
        super(context, str, list, flexboxLayout);
        this.f47944u = 3;
        this.f47945v = l1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(FlexboxLayout flexboxLayout, v2 v2Var, Context context, List list) {
        super(context, list, flexboxLayout);
        this.f47944u = 9;
        this.f47945v = v2Var;
    }
}
