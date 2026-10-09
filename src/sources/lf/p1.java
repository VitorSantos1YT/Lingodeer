package lf;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bp.i3;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.internal.WebDialog$setUpWebView$1;
import com.google.logging.type.LogSeverity;
import com.lingodeer.R;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class p1 extends Dialog {
    public static volatile int O;
    public final n1 H;
    public boolean K;
    public boolean L;
    public boolean M;
    public WindowManager.LayoutParams N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f40090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f40091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l1 f40092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WebDialog$setUpWebView$1 f40093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ProgressDialog f40094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f40095f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public FrameLayout f40096t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(androidx.fragment.app.p0 p0Var, String str, Bundle bundle, tf.h0 h0Var, l1 l1Var) {
        Uri uriA;
        super(p0Var, O);
        v0.m();
        this.f40091b = "fbconnect://success";
        bundle = bundle == null ? new Bundle() : bundle;
        String str2 = j1.v(p0Var) ? "fbconnect://chrome_os_success" : "fbconnect://success";
        this.f40091b = str2;
        bundle.putString("redirect_uri", str2);
        bundle.putString("display", "touch");
        bundle.putString("client_id", re.s.b());
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{"18.1.3"}, 1)));
        this.f40092c = l1Var;
        if (str.equals("share") && bundle.containsKey("media")) {
            this.H = new n1(this, str, bundle);
            return;
        }
        if (o1.f40089a[h0Var.ordinal()] == 1) {
            uriA = j1.a(k.e(), "oauth/authorize", bundle);
        } else {
            uriA = j1.a(k.d(), re.s.e() + "/dialog/" + str, bundle);
        }
        this.f40090a = uriA.toString();
    }

    public static int a(int i11, int i12, int i13, float f5) {
        double d5;
        int i14 = (int) (i11 / f5);
        if (i14 <= i12) {
            d5 = 1.0d;
        } else {
            d5 = i14 >= i13 ? 0.5d : ((((double) (i13 - i14)) / ((double) (i13 - i12))) * 0.5d) + 0.5d;
        }
        return (int) (((double) i11) * d5);
    }

    public static final void b(androidx.fragment.app.p0 p0Var) {
        if (p0Var == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = p0Var.getPackageManager().getApplicationInfo(p0Var.getPackageName(), 128);
            if ((applicationInfo != null ? applicationInfo.metaData : null) != null && O == 0) {
                int i11 = applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme");
                if (i11 == 0) {
                    i11 = R.style.com_facebook_activity_theme;
                }
                O = i11;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public Bundle c(String str) {
        Uri uri = Uri.parse(str);
        Bundle bundleE = j1.E(uri.getQuery());
        bundleE.putAll(j1.E(uri.getFragment()));
        return bundleE;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.f40092c == null || this.K) {
            return;
        }
        e(new FacebookOperationCanceledException());
    }

    public final void d() {
        Object systemService = getContext().getSystemService("window");
        kotlin.jvm.internal.m.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i11 = displayMetrics.widthPixels;
        int i12 = displayMetrics.heightPixels;
        int i13 = i11 < i12 ? i11 : i12;
        if (i11 < i12) {
            i11 = i12;
        }
        int iMin = Math.min(a(i13, 480, LogSeverity.EMERGENCY_VALUE, displayMetrics.density), displayMetrics.widthPixels);
        int iMin2 = Math.min(a(i11, LogSeverity.EMERGENCY_VALUE, 1280, displayMetrics.density), displayMetrics.heightPixels);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(iMin, iMin2);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ProgressDialog progressDialog;
        WebDialog$setUpWebView$1 webDialog$setUpWebView$1 = this.f40093d;
        if (webDialog$setUpWebView$1 != null) {
            webDialog$setUpWebView$1.stopLoading();
        }
        if (!this.L && (progressDialog = this.f40094e) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    public final void e(Exception exc) {
        if (this.f40092c == null || this.K) {
            return;
        }
        this.K = true;
        FacebookException facebookException = exc instanceof FacebookException ? (FacebookException) exc : new FacebookException(exc);
        l1 l1Var = this.f40092c;
        if (l1Var != null) {
            l1Var.b(null, facebookException);
        }
        dismiss();
    }

    public final void f(int i11) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        WebDialog$setUpWebView$1 webDialog$setUpWebView$1 = new WebDialog$setUpWebView$1(getContext());
        this.f40093d = webDialog$setUpWebView$1;
        webDialog$setUpWebView$1.setVerticalScrollBarEnabled(false);
        WebDialog$setUpWebView$1 webDialog$setUpWebView$2 = this.f40093d;
        if (webDialog$setUpWebView$2 != null) {
            webDialog$setUpWebView$2.setHorizontalScrollBarEnabled(false);
        }
        WebDialog$setUpWebView$1 webDialog$setUpWebView$3 = this.f40093d;
        if (webDialog$setUpWebView$3 != null) {
            webDialog$setUpWebView$3.setWebViewClient(new i3(this, 2));
        }
        WebDialog$setUpWebView$1 webDialog$setUpWebView$4 = this.f40093d;
        WebSettings settings = webDialog$setUpWebView$4 != null ? webDialog$setUpWebView$4.getSettings() : null;
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        WebDialog$setUpWebView$1 webDialog$setUpWebView$5 = this.f40093d;
        if (webDialog$setUpWebView$5 != null) {
            String str = this.f40090a;
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            webDialog$setUpWebView$5.loadUrl(str);
        }
        WebDialog$setUpWebView$1 webDialog$setUpWebView$6 = this.f40093d;
        if (webDialog$setUpWebView$6 != null) {
            webDialog$setUpWebView$6.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        WebDialog$setUpWebView$1 webDialog$setUpWebView$7 = this.f40093d;
        if (webDialog$setUpWebView$7 != null) {
            webDialog$setUpWebView$7.setVisibility(4);
        }
        WebDialog$setUpWebView$1 webDialog$setUpWebView$8 = this.f40093d;
        WebSettings settings2 = webDialog$setUpWebView$8 != null ? webDialog$setUpWebView$8.getSettings() : null;
        if (settings2 != null) {
            settings2.setSavePassword(false);
        }
        WebDialog$setUpWebView$1 webDialog$setUpWebView$9 = this.f40093d;
        WebSettings settings3 = webDialog$setUpWebView$9 != null ? webDialog$setUpWebView$9.getSettings() : null;
        if (settings3 != null) {
            settings3.setSaveFormData(false);
        }
        WebDialog$setUpWebView$1 webDialog$setUpWebView$10 = this.f40093d;
        if (webDialog$setUpWebView$10 != null) {
            webDialog$setUpWebView$10.setFocusable(true);
        }
        WebDialog$setUpWebView$1 webDialog$setUpWebView$11 = this.f40093d;
        if (webDialog$setUpWebView$11 != null) {
            webDialog$setUpWebView$11.setFocusableInTouchMode(true);
        }
        WebDialog$setUpWebView$1 webDialog$setUpWebView$12 = this.f40093d;
        if (webDialog$setUpWebView$12 != null) {
            webDialog$setUpWebView$12.setOnTouchListener(new com.google.android.material.search.f(3));
        }
        linearLayout.setPadding(i11, i11, i11, i11);
        linearLayout.addView(this.f40093d);
        linearLayout.setBackgroundColor(-872415232);
        FrameLayout frameLayout = this.f40096t;
        if (frameLayout != null) {
            frameLayout.addView(linearLayout);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        Window window;
        WindowManager.LayoutParams attributes;
        this.L = false;
        Context context = getContext();
        kotlin.jvm.internal.m.e(context, "context");
        if (j1.D(context) && (layoutParams = this.N) != null && layoutParams.token == null) {
            Activity ownerActivity = getOwnerActivity();
            layoutParams.token = (ownerActivity == null || (window = ownerActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
            WindowManager.LayoutParams layoutParams2 = this.N;
            Objects.toString(layoutParams2 != null ? layoutParams2.token : null);
            re.s sVar = re.s.f49201a;
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f40094e = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.f40094e;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(R.string.com_facebook_loading));
        }
        ProgressDialog progressDialog3 = this.f40094e;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.f40094e;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: lf.k1
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    p1 this$0 = this.f40057a;
                    kotlin.jvm.internal.m.f(this$0, "this$0");
                    this$0.cancel();
                }
            });
        }
        requestWindowFeature(1);
        this.f40096t = new FrameLayout(getContext());
        d();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        ImageView imageView = new ImageView(getContext());
        this.f40095f = imageView;
        imageView.setOnClickListener(new aj.b(this, 14));
        Drawable drawable = getContext().getResources().getDrawable(2131231273);
        ImageView imageView2 = this.f40095f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.f40095f;
        if (imageView3 != null) {
            imageView3.setVisibility(4);
        }
        if (this.f40090a != null) {
            ImageView imageView4 = this.f40095f;
            if (imageView4 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            f((imageView4.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        FrameLayout frameLayout = this.f40096t;
        if (frameLayout != null) {
            frameLayout.addView(this.f40095f, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.f40096t;
        if (frameLayout2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        setContentView(frameLayout2);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.L = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        n1 n1Var = this.H;
        if (n1Var != null) {
            if ((n1Var != null ? n1Var.getStatus() : null) == AsyncTask.Status.PENDING) {
                if (n1Var != null) {
                    n1Var.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.f40094e;
                if (progressDialog != null) {
                    progressDialog.show();
                    return;
                }
                return;
            }
        }
        d();
    }

    @Override // android.app.Dialog
    public final void onStop() {
        n1 n1Var = this.H;
        if (n1Var != null) {
            n1Var.cancel(true);
            ProgressDialog progressDialog = this.f40094e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams params) {
        kotlin.jvm.internal.m.f(params, "params");
        if (params.token == null) {
            this.N = params;
        }
        super.onWindowAttributesChanged(params);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i11, KeyEvent keyEvent) {
        kotlin.jvm.internal.m.f(keyEvent, OYAvlbfUyD.kmYOsVdDzxJaBR);
        if (i11 == 4) {
            WebDialog$setUpWebView$1 webDialog$setUpWebView$1 = this.f40093d;
            if (webDialog$setUpWebView$1 != null && webDialog$setUpWebView$1.canGoBack()) {
                WebDialog$setUpWebView$1 webDialog$setUpWebView$2 = this.f40093d;
                if (webDialog$setUpWebView$2 != null) {
                    webDialog$setUpWebView$2.goBack();
                }
                return true;
            }
            cancel();
        }
        return super.onKeyDown(i11, keyEvent);
    }
}
