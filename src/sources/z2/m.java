package z2;

import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m extends kotlin.jvm.internal.j implements fz.f {
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        if (obj != null) {
            throw new ClassCastException();
        }
        AndroidComposeView androidComposeView = (AndroidComposeView) this.receiver;
        Class cls = AndroidComposeView.f1151l1;
        Resources resources = androidComposeView.getContext().getResources();
        return Boolean.valueOf(b0.f58508a.a(androidComposeView, null, new c2.c(new v3.d(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), ((f2.e) obj2).f26584a, (fz.c) obj3)));
    }
}
