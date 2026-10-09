package r;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f48547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f48548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f48549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f48550d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f48547a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f48548b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f48549c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f48550d = true;
        } catch (NoSuchMethodException e8) {
            e8.printStackTrace();
        }
    }
}
