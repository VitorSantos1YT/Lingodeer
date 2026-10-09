package qp;

import android.view.View;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.object.Word;
import hj.b6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q3 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s3 f48141b;

    public /* synthetic */ q3(s3 s3Var, int i11) {
        this.f48140a = i11;
        this.f48141b = s3Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f48140a) {
            case 0:
                s3 s3Var = this.f48141b;
                s3Var.r();
                b6 b6Var = s3Var.f48194q;
                kotlin.jvm.internal.m.c(b6Var);
                int childCount = ((FlexboxLayout) b6Var.f32407c).getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    b6 b6Var2 = s3Var.f48194q;
                    kotlin.jvm.internal.m.c(b6Var2);
                    View childAt = ((FlexboxLayout) b6Var2.f32407c).getChildAt(i11);
                    Object tag = childAt.getTag();
                    kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                    s3Var.s(childAt, (Word) tag);
                    childAt.requestLayout();
                }
                b6 b6Var3 = s3Var.f48194q;
                kotlin.jvm.internal.m.c(b6Var3);
                ((FlexboxLayout) b6Var3.f32407c).requestLayout();
                break;
            default:
                this.f48141b.r();
                break;
        }
        return qy.b0.f48488a;
    }
}
