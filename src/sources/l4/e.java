package l4;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f39716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f39717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f39720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f39721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f39722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f39723h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f39724i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f39725j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f39726k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f39727l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f39728n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f39729o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Rect f39730p;

    public e() {
        super(-2, -2);
        this.f39717b = false;
        this.f39718c = 0;
        this.f39719d = 0;
        this.f39720e = -1;
        this.f39721f = -1;
        this.f39722g = 0;
        this.f39723h = 0;
        this.f39730p = new Rect();
    }

    public final boolean a(int i11) {
        if (i11 == 0) {
            return this.m;
        }
        if (i11 != 1) {
            return false;
        }
        return this.f39728n;
    }

    public final void b(b bVar) {
        b bVar2 = this.f39716a;
        if (bVar2 != bVar) {
            if (bVar2 != null) {
                bVar2.l();
            }
            this.f39716a = bVar;
            this.f39717b = true;
            if (bVar != null) {
                bVar.i(this);
            }
        }
    }

    public e(Context context, AttributeSet attributeSet) {
        b bVar;
        super(context, attributeSet);
        this.f39717b = false;
        this.f39718c = 0;
        this.f39719d = 0;
        this.f39720e = -1;
        this.f39721f = -1;
        this.f39722g = 0;
        this.f39723h = 0;
        this.f39730p = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k4.a.f37908b);
        this.f39718c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f39721f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f39719d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f39720e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f39722g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f39723h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f39717b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.V;
            if (TextUtils.isEmpty(string)) {
                bVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.V;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f1377a0;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.W);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    bVar = (b) constructor.newInstance(context, attributeSet);
                } catch (Exception e8) {
                    throw new RuntimeException(ep.a.e("Could not inflate Behavior subclass ", string), e8);
                }
            }
            this.f39716a = bVar;
        }
        typedArrayObtainStyledAttributes.recycle();
        b bVar2 = this.f39716a;
        if (bVar2 != null) {
            bVar2.i(this);
        }
    }

    public e(e eVar) {
        super((ViewGroup.MarginLayoutParams) eVar);
        this.f39717b = false;
        this.f39718c = 0;
        this.f39719d = 0;
        this.f39720e = -1;
        this.f39721f = -1;
        this.f39722g = 0;
        this.f39723h = 0;
        this.f39730p = new Rect();
    }

    public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f39717b = false;
        this.f39718c = 0;
        this.f39719d = 0;
        this.f39720e = -1;
        this.f39721f = -1;
        this.f39722g = 0;
        this.f39723h = 0;
        this.f39730p = new Rect();
    }

    public e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f39717b = false;
        this.f39718c = 0;
        this.f39719d = 0;
        this.f39720e = -1;
        this.f39721f = -1;
        this.f39722g = 0;
        this.f39723h = 0;
        this.f39730p = new Rect();
    }
}
