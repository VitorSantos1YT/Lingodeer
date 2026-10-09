package sc;

import android.view.View;
import com.afollestad.materialdialogs.internal.main.DialogScrollView;
import fz.c;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends n implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f51532a = new a(1);

    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11;
        DialogScrollView dialogScrollView = (DialogScrollView) obj;
        dialogScrollView.a();
        if (dialogScrollView.getChildCount() == 0 || dialogScrollView.getMeasuredHeight() == 0) {
            i11 = 2;
        } else {
            View childAt = dialogScrollView.getChildAt(0);
            m.b(childAt, "getChildAt(0)");
            if (childAt.getMeasuredHeight() > dialogScrollView.getHeight()) {
                i11 = 1;
            } else {
                i11 = 2;
            }
        }
        dialogScrollView.setOverScrollMode(i11);
        return b0.f48488a;
    }
}
