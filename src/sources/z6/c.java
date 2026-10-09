package z6;

import a2.o;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.hardware.display.DisplayManager;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import android.util.SparseArray;
import android.view.Display;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.textclassifier.TextClassification;
import android.webkit.WebView;
import android.widget.TextView;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import qy.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AudioManager f58933a;

    public static void a(AudioManager audioManager, b bVar) {
        if (Build.VERSION.SDK_INT < 26) {
            audioManager.abandonAudioFocus(bVar.f58929b);
            return;
        }
        Object obj = bVar.f58932e;
        obj.getClass();
        audioManager.abandonAudioFocusRequest((AudioFocusRequest) obj);
    }

    public static Icon b(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static boolean c(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null && display.isHdr()) {
            for (int i11 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i11 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void d(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        int i11 = configuration.colorMode & 3;
        int i12 = configuration2.colorMode & 3;
        if (i11 != i12) {
            configuration3.colorMode |= i12;
        }
        int i13 = configuration.colorMode & 12;
        int i14 = configuration2.colorMode & 12;
        if (i13 != i14) {
            configuration3.colorMode |= i14;
        }
    }

    public static final int e(Bitmap bitmap) {
        int i11;
        if (bitmap.isRecycled()) {
            throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (Exception unused) {
            int height = bitmap.getHeight() * bitmap.getWidth();
            Bitmap.Config config = bitmap.getConfig();
            if (config == Bitmap.Config.ALPHA_8) {
                i11 = 1;
            } else if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
                i11 = 2;
            } else {
                i11 = (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.RGBA_F16) ? 4 : 8;
            }
            return height * i11;
        }
    }

    public static synchronized AudioManager f(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                f58933a = null;
            }
            AudioManager audioManager = f58933a;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                b7.f fVar = new b7.f();
                b7.a.q().execute(new pb.b(24, applicationContext, fVar));
                fVar.a();
                AudioManager audioManager2 = f58933a;
                audioManager2.getClass();
                return audioManager2;
            }
            AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
            f58933a = audioManager3;
            audioManager3.getClass();
            return audioManager3;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static AutofillId g(View view) {
        return view.getAutofillId();
    }

    public static PackageInfo h() {
        return WebView.getCurrentWebViewPackage();
    }

    public static float i(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float j(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static final boolean k(Bitmap.Config config) {
        return Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
    }

    public static boolean l(File file, File file2) {
        try {
            Files.move(file.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static final void m(a2.a aVar, SparseArray sparseArray) {
        if (aVar.f293b.f312a.isEmpty()) {
            return;
        }
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            int iKeyAt = sparseArray.keyAt(i11);
            AutofillValue autofillValueD = a10.b.d(sparseArray.get(iKeyAt));
            if (autofillValueD.isText()) {
                o oVar = aVar.f293b;
                autofillValueD.getTextValue().toString();
                if (oVar.f312a.get(Integer.valueOf(iKeyAt)) != null) {
                    throw new ClassCastException();
                }
            } else {
                if (autofillValueD.isDate()) {
                    throw new k("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (autofillValueD.isList()) {
                    throw new k("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (autofillValueD.isToggle()) {
                    throw new k("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    public static int n(AudioManager audioManager, b bVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            Object obj = bVar.f58932e;
            obj.getClass();
            return audioManager.requestAudioFocus((AudioFocusRequest) obj);
        }
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = bVar.f58929b;
        bVar.f58931d.getClass();
        return audioManager.requestAudioFocus(onAudioFocusChangeListener, 3, bVar.f58928a);
    }

    public static void o(Context context, TextClassification textClassification) throws PendingIntent.CanceledException {
        String text = textClassification.getText();
        PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
        if (Build.VERSION.SDK_INT >= 34) {
            a5.b.l(activity);
        } else {
            activity.send();
        }
    }

    public static void p(MenuItem menuItem, char c11, int i11) {
        menuItem.setAlphabeticShortcut(c11, i11);
    }

    public static void q(TextView textView, int i11, int i12) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(5, i11, 1, i12);
    }

    public static void r(TextView textView) {
        textView.setAutoSizeTextTypeWithDefaults(0);
    }

    public static void s(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void t(Animator animator, long j11) {
        ((AnimatorSet) animator).setCurrentPlayTime(j11);
    }

    public static void u(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void v(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void w(MenuItem menuItem, char c11, int i11) {
        menuItem.setNumericShortcut(c11, i11);
    }

    public static void x(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }
}
