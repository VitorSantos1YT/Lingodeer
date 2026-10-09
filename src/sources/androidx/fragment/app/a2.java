package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f2 f1614a = new f2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h2 f1615b;

    static {
        h2 h2Var = null;
        try {
            h2Var = (h2) qa.m.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f1615b = h2Var;
    }

    public static final void a(int i11, ArrayList views) {
        kotlin.jvm.internal.m.f(views, "views");
        int size = views.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = views.get(i12);
            i12++;
            ((View) obj).setVisibility(i11);
        }
    }
}
