package z4;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import qp.o2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends WindowInsetsAnimation$Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.l f58822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f58823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f58824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f58825d;

    public d1(androidx.datastore.preferences.protobuf.l lVar) {
        super(lVar.f1509a);
        this.f58825d = new HashMap();
        this.f58822a = lVar;
    }

    public final g1 a(WindowInsetsAnimation windowInsetsAnimation) {
        g1 g1Var = (g1) this.f58825d.get(windowInsetsAnimation);
        if (g1Var == null) {
            g1Var = new g1(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                g1Var.f58839a = new e1(windowInsetsAnimation);
            }
            this.f58825d.put(windowInsetsAnimation, g1Var);
        }
        return g1Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f58822a.d(a(windowInsetsAnimation));
        this.f58825d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f58822a.f(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f58824c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f58824c = arrayList2;
            this.f58823b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            g1 g1VarA = a(windowInsetsAnimation);
            g1VarA.f58839a.e(windowInsetsAnimation.getFraction());
            this.f58824c.add(g1VarA);
        }
        return this.f58822a.g(v1.h(null, windowInsets), this.f58823b).g();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        o2 o2VarH = this.f58822a.h(a(windowInsetsAnimation), new o2(bounds));
        o2VarH.getClass();
        b1.c();
        return b1.a(((r4.d) o2VarH.f48095b).e(), ((r4.d) o2VarH.f48096c).e());
    }
}
