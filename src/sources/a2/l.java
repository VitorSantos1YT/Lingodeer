package a2;

import android.R;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Picture;
import android.graphics.Typeface;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.PrecomputedText;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import d1.o0;
import d1.u;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static int A(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int B(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static void C(TextView textView, int i11) {
        textView.setFirstBaselineToTopHeight(i11);
    }

    public static void D(ViewStructure viewStructure, int i11) {
        viewStructure.setMaxTextLength(i11);
    }

    public static void E(View view, int i11) {
        view.setOutlineAmbientShadowColor(i11);
    }

    public static void F(View view, int i11) {
        view.setOutlineSpotShadowColor(i11);
    }

    public static boolean G(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    public static void a(RemoteAction remoteAction) throws PendingIntent.CanceledException {
        PendingIntent actionIntent = remoteAction.getActionIntent();
        if (Build.VERSION.SDK_INT >= 34) {
            a5.b.l(actionIntent);
        } else {
            actionIntent.send();
        }
    }

    public static final DisplayCutout b(Display display) throws Exception {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(null);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, objNewInstance);
            Field declaredField = objNewInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objNewInstance);
            if (obj instanceof DisplayCutout) {
                return (DisplayCutout) obj;
            }
            return null;
        } catch (Exception e8) {
            if (!(e8 instanceof ClassNotFoundException) && !(e8 instanceof NoSuchMethodException) && !(e8 instanceof NoSuchFieldException) && !(e8 instanceof IllegalAccessException) && !(e8 instanceof InvocationTargetException) && !(e8 instanceof InstantiationException)) {
                throw e8;
            }
            db.b.f23348a.getClass();
            return null;
        }
    }

    public static void c(Menu menu, int i11, Context context, TextClassification textClassification, int i12) {
        if (i12 < 0) {
            MenuItem menuItemAdd = menu.add(R.id.textAssist, R.id.textAssist, i11, textClassification.getLabel());
            menuItemAdd.setShowAsAction(2);
            menuItemAdd.setIcon(textClassification.getIcon());
            menuItemAdd.setOnMenuItemClickListener(new x0.c(1, context, textClassification));
            return;
        }
        boolean z11 = i12 == 0;
        final RemoteAction remoteAction = textClassification.getActions().get(i12);
        MenuItem menuItemAdd2 = menu.add(R.id.textAssist, z11 ? 16908353 : 0, i11, remoteAction.getTitle());
        menuItemAdd2.setShowAsAction(z11 ? 2 : 0);
        if (z11 || remoteAction.shouldShowIcon()) {
            menuItemAdd2.setIcon(remoteAction.getIcon().loadDrawable(context));
        }
        menuItemAdd2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: x0.s
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                a2.l.a(remoteAction);
                return true;
            }
        });
    }

    public static Typeface d(Typeface typeface, int i11, boolean z11) {
        return Typeface.create(typeface, i11, z11);
    }

    public static Handler e(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler f(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Bitmap g(Picture picture) {
        return Bitmap.createBitmap(picture);
    }

    public static TextClassifier h(Context context, u uVar) {
        String str;
        TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
        int i11 = o0.f22951a[uVar.ordinal()];
        if (i11 == 1) {
            str = "edittext";
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "textview";
        }
        return textClassificationManager.createTextClassificationSession(new TextClassificationContext.Builder(context.getPackageName(), str).build());
    }

    public static List i(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    public static String[] j(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static long k(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static void l(JobParameters jobParameters) {
        jobParameters.getNetwork();
    }

    public static int m(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String n(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int o(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int p(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int q(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int r(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static int s(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static PrecomputedText.Params t(AppCompatTextView appCompatTextView) {
        return appCompatTextView.getTextMetricsParams();
    }

    public static int u(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri v(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static ClassLoader w() {
        return WebView.getWebViewClassLoader();
    }

    public static void x(View view) {
        view.resetPivot();
    }

    public static int y(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int z(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }
}
