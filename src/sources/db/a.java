package db;

import a2.l;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.m;
import za.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b, d, f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f23341c = new a(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f23342d = new a(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f23343e = new a(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f23344f = new a(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f23345g = new a(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f23346h = new a(5);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23347b;

    public /* synthetic */ a(int i11) {
        this.f23347b = i11;
    }

    public static b e() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            return c.f23349b;
        }
        if (i11 >= 29) {
            return f23344f;
        }
        return i11 >= 28 ? f23343e : f23342d;
    }

    @Override // db.f
    public k a(Context context, d densityCompatHelper) {
        m.f(densityCompatHelper, "densityCompatHelper");
        Context baseContext = context;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                baseContext = context;
                break;
            }
            if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) baseContext;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            baseContext = contextWrapper.getBaseContext();
            m.e(baseContext, "getBaseContext(...)");
        }
        if (baseContext instanceof Activity) {
            return c((Activity) baseContext, densityCompatHelper);
        }
        if (!(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
            throw new IllegalArgumentException("Must provide a UiContext or Application Context");
        }
        Object systemService = context.getSystemService("window");
        m.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        m.e(defaultDisplay, "getDefaultDisplay(...)");
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new k(new Rect(0, 0, point.x, point.y), densityCompatHelper.d(context));
    }

    @Override // db.b
    public Rect b(Activity activity) throws Exception {
        DisplayCutout displayCutoutB;
        switch (this.f23347b) {
            case 1:
                Rect rect = new Rect();
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                defaultDisplay.getRectSize(rect);
                if (!activity.isInMultiWindowMode()) {
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Resources resources = activity.getResources();
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    int i11 = rect.bottom + dimensionPixelSize;
                    if (i11 == point.y) {
                        rect.bottom = i11;
                    } else {
                        int i12 = rect.right + dimensionPixelSize;
                        if (i12 == point.x) {
                            rect.right = i12;
                        }
                    }
                }
                return rect;
            case 2:
                Rect rect2 = new Rect();
                Configuration configuration = activity.getResources().getConfiguration();
                try {
                    Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(configuration);
                    if (activity.isInMultiWindowMode()) {
                        Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                        m.d(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
                        rect2.set((Rect) objInvoke);
                    } else {
                        Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                        m.d(objInvoke2, "null cannot be cast to non-null type android.graphics.Rect");
                        rect2.set((Rect) objInvoke2);
                    }
                    break;
                } catch (Exception e8) {
                    if (!(e8 instanceof NoSuchFieldException) && !(e8 instanceof NoSuchMethodException) && !(e8 instanceof IllegalAccessException) && !(e8 instanceof InvocationTargetException)) {
                        throw e8;
                    }
                    b.f23348a.getClass();
                    activity.getWindowManager().getDefaultDisplay().getRectSize(rect2);
                }
                Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
                Point point2 = new Point();
                defaultDisplay2.getRealSize(point2);
                if (!activity.isInMultiWindowMode()) {
                    Resources resources2 = activity.getResources();
                    int identifier2 = resources2.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize2 = identifier2 > 0 ? resources2.getDimensionPixelSize(identifier2) : 0;
                    int i13 = rect2.bottom + dimensionPixelSize2;
                    if (i13 == point2.y) {
                        rect2.bottom = i13;
                    } else {
                        int i14 = rect2.right + dimensionPixelSize2;
                        if (i14 == point2.x) {
                            rect2.right = i14;
                        } else if (rect2.left == dimensionPixelSize2) {
                            rect2.left = 0;
                        }
                    }
                }
                if ((rect2.width() < point2.x || rect2.height() < point2.y) && !activity.isInMultiWindowMode() && (displayCutoutB = l.b(defaultDisplay2)) != null) {
                    if (rect2.left == l.z(displayCutoutB)) {
                        rect2.left = 0;
                    }
                    if (point2.x - rect2.right == l.A(displayCutoutB)) {
                        rect2.right = l.A(displayCutoutB) + rect2.right;
                    }
                    if (rect2.top == l.B(displayCutoutB)) {
                        rect2.top = 0;
                    }
                    if (point2.y - rect2.bottom == l.y(displayCutoutB)) {
                        rect2.bottom = l.y(displayCutoutB) + rect2.bottom;
                    }
                }
                return rect2;
            default:
                Configuration configuration2 = activity.getResources().getConfiguration();
                try {
                    Field declaredField2 = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField2.setAccessible(true);
                    Object obj2 = declaredField2.get(configuration2);
                    Object objInvoke3 = obj2.getClass().getDeclaredMethod("getBounds", null).invoke(obj2, null);
                    m.d(objInvoke3, "null cannot be cast to non-null type android.graphics.Rect");
                    return new Rect((Rect) objInvoke3);
                } catch (Exception e10) {
                    if (!(e10 instanceof NoSuchFieldException) && !(e10 instanceof NoSuchMethodException) && !(e10 instanceof IllegalAccessException) && !(e10 instanceof InvocationTargetException)) {
                        throw e10;
                    }
                    b.f23348a.getClass();
                    return f23343e.b(activity);
                }
        }
    }

    @Override // db.f
    public k c(Activity activity, d densityCompatHelper) {
        m.f(densityCompatHelper, "densityCompatHelper");
        b.f23348a.getClass();
        return new k(new ya.b(e().b(activity)), densityCompatHelper.d(activity));
    }

    @Override // db.d
    public float d(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }
}
