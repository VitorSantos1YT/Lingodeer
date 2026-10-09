package p;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Configuration f46181f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources.Theme f46183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f46184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Configuration f46185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Resources f46186e;

    public e(Context context, int i11) {
        super(context);
        this.f46182a = i11;
    }

    public final void a(Configuration configuration) {
        if (this.f46186e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f46185d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f46185d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f46183b == null) {
            this.f46183b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f46183b.setTo(theme);
            }
        }
        this.f46183b.applyStyle(this.f46182a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f46186e == null) {
            Configuration configuration = this.f46185d;
            if (configuration == null) {
                this.f46186e = super.getResources();
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f46181f == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = CropImageView.DEFAULT_ASPECT_RATIO;
                        f46181f = configuration2;
                    }
                    if (configuration.equals(f46181f)) {
                        this.f46186e = super.getResources();
                    }
                }
                this.f46186e = createConfigurationContext(this.f46185d).getResources();
            }
        }
        return this.f46186e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f46184c == null) {
            this.f46184c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f46184c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f46183b;
        if (theme != null) {
            return theme;
        }
        if (this.f46182a == 0) {
            this.f46182a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f46183b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i11) {
        if (this.f46182a != i11) {
            this.f46182a = i11;
            b();
        }
    }
}
