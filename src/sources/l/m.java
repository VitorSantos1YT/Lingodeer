package l;

import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.p0;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import r.t1;
import r.y2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m extends p0 implements n, n4.y {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private androidx.appcompat.app.a mDelegate;
    private Resources mResources;

    public m() {
        getSavedStateRegistry().c(DELEGATE_TAG, new da.a(this));
        addOnContextAvailableListener(new l(this));
    }

    @Override // f.n, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        androidx.appcompat.app.b bVar = (androidx.appcompat.app.b) getDelegate();
        bVar.x();
        ((ViewGroup) bVar.f803c0.findViewById(R.id.content)).addView(view, layoutParams);
        bVar.O.a(bVar.N.getCallback());
    }

    /* JADX WARN: Code duplicated, block: B:102:0x018d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0198  */
    /* JADX WARN: Code duplicated, block: B:108:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:114:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:115:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:119:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:121:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:122:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:153:0x01de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x01f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x01da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0098  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:66:0x0107  */
    /* JADX WARN: Code duplicated, block: B:69:0x010f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0117  */
    /* JADX WARN: Code duplicated, block: B:75:0x011f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0127  */
    /* JADX WARN: Code duplicated, block: B:81:0x012f  */
    /* JADX WARN: Code duplicated, block: B:84:0x013b  */
    /* JADX WARN: Code duplicated, block: B:87:0x014a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0159  */
    /* JADX WARN: Code duplicated, block: B:93:0x0168  */
    /* JADX WARN: Code duplicated, block: B:96:0x0171  */
    /* JADX WARN: Code duplicated, block: B:99:0x017e  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Configuration configuration;
        Configuration configuration2;
        Configuration configuration3;
        p.e eVar;
        Resources.Theme theme;
        Method method;
        float f5;
        float f11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        androidx.appcompat.app.b bVar = (androidx.appcompat.app.b) getDelegate();
        int i49 = 1;
        bVar.f817q0 = true;
        int i50 = bVar.f821u0;
        if (i50 == -100) {
            i50 = androidx.appcompat.app.a.f795b;
        }
        int iD = bVar.D(context, i50);
        if (androidx.appcompat.app.a.b(context) && androidx.appcompat.app.a.b(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (androidx.appcompat.app.a.K) {
                    try {
                        v4.e eVar2 = androidx.appcompat.app.a.f796c;
                        if (eVar2 == null) {
                            if (androidx.appcompat.app.a.f797d == null) {
                                androidx.appcompat.app.a.f797d = v4.e.a(n4.e.e(context));
                            }
                            if (!androidx.appcompat.app.a.f797d.f53512a.f53513a.isEmpty()) {
                                androidx.appcompat.app.a.f796c = androidx.appcompat.app.a.f797d;
                            }
                        } else if (!eVar2.equals(androidx.appcompat.app.a.f797d)) {
                            v4.e eVar3 = androidx.appcompat.app.a.f796c;
                            androidx.appcompat.app.a.f797d = eVar3;
                            n4.e.d(context, eVar3.f53512a.f53513a.toLanguageTags());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else if (!androidx.appcompat.app.a.f799f) {
                androidx.appcompat.app.a.f794a.execute(new com.adjust.sdk.s(context, i49));
            }
        }
        v4.e eVarQ = androidx.appcompat.app.b.q(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(androidx.appcompat.app.b.u(context, iD, eVarQ, null, false));
            } catch (IllegalStateException unused) {
                if (context instanceof p.e) {
                    try {
                        ((p.e) context).a(androidx.appcompat.app.b.u(context, iD, eVarQ, null, false));
                    } catch (IllegalStateException unused2) {
                        if (androidx.appcompat.app.b.L0) {
                            Configuration configuration4 = new Configuration();
                            configuration4.uiMode = -1;
                            configuration4.fontScale = CropImageView.DEFAULT_ASPECT_RATIO;
                            configuration = context.createConfigurationContext(configuration4).getResources().getConfiguration();
                            configuration2 = context.getResources().getConfiguration();
                            configuration.uiMode = configuration2.uiMode;
                            if (configuration.equals(configuration2)) {
                                configuration3 = null;
                            } else {
                                configuration3 = new Configuration();
                                configuration3.fontScale = CropImageView.DEFAULT_ASPECT_RATIO;
                                if (configuration.diff(configuration2) != 0) {
                                    f5 = configuration.fontScale;
                                    f11 = configuration2.fontScale;
                                    if (f5 != f11) {
                                        configuration3.fontScale = f11;
                                    }
                                    i11 = configuration.mcc;
                                    i12 = configuration2.mcc;
                                    if (i11 != i12) {
                                        configuration3.mcc = i12;
                                    }
                                    i13 = configuration.mnc;
                                    i14 = configuration2.mnc;
                                    if (i13 != i14) {
                                        configuration3.mnc = i14;
                                    }
                                    i15 = Build.VERSION.SDK_INT;
                                    v.a(configuration, configuration2, configuration3);
                                    i16 = configuration.touchscreen;
                                    i17 = configuration2.touchscreen;
                                    if (i16 != i17) {
                                        configuration3.touchscreen = i17;
                                    }
                                    i18 = configuration.keyboard;
                                    i19 = configuration2.keyboard;
                                    if (i18 != i19) {
                                        configuration3.keyboard = i19;
                                    }
                                    i21 = configuration.keyboardHidden;
                                    i22 = configuration2.keyboardHidden;
                                    if (i21 != i22) {
                                        configuration3.keyboardHidden = i22;
                                    }
                                    i23 = configuration.navigation;
                                    i24 = configuration2.navigation;
                                    if (i23 != i24) {
                                        configuration3.navigation = i24;
                                    }
                                    i25 = configuration.navigationHidden;
                                    i26 = configuration2.navigationHidden;
                                    if (i25 != i26) {
                                        configuration3.navigationHidden = i26;
                                    }
                                    i27 = configuration.orientation;
                                    i28 = configuration2.orientation;
                                    if (i27 != i28) {
                                        configuration3.orientation = i28;
                                    }
                                    i29 = configuration.screenLayout & 15;
                                    i30 = configuration2.screenLayout & 15;
                                    if (i29 != i30) {
                                        configuration3.screenLayout |= i30;
                                    }
                                    i31 = configuration.screenLayout & 192;
                                    i32 = configuration2.screenLayout & 192;
                                    if (i31 != i32) {
                                        configuration3.screenLayout |= i32;
                                    }
                                    i33 = configuration.screenLayout & 48;
                                    i34 = configuration2.screenLayout & 48;
                                    if (i33 != i34) {
                                        configuration3.screenLayout |= i34;
                                    }
                                    i35 = configuration.screenLayout & 768;
                                    i36 = configuration2.screenLayout & 768;
                                    if (i35 != i36) {
                                        configuration3.screenLayout |= i36;
                                    }
                                    if (i15 >= 26) {
                                        z6.c.d(configuration, configuration2, configuration3);
                                    }
                                    i37 = configuration.uiMode & 15;
                                    i38 = configuration2.uiMode & 15;
                                    if (i37 != i38) {
                                        configuration3.uiMode |= i38;
                                    }
                                    i39 = configuration.uiMode & 48;
                                    i40 = configuration2.uiMode & 48;
                                    if (i39 != i40) {
                                        configuration3.uiMode |= i40;
                                    }
                                    i41 = configuration.screenWidthDp;
                                    i42 = configuration2.screenWidthDp;
                                    if (i41 != i42) {
                                        configuration3.screenWidthDp = i42;
                                    }
                                    i43 = configuration.screenHeightDp;
                                    i44 = configuration2.screenHeightDp;
                                    if (i43 != i44) {
                                        configuration3.screenHeightDp = i44;
                                    }
                                    i45 = configuration.smallestScreenWidthDp;
                                    i46 = configuration2.smallestScreenWidthDp;
                                    if (i45 != i46) {
                                        configuration3.smallestScreenWidthDp = i46;
                                    }
                                    i47 = configuration.densityDpi;
                                    i48 = configuration2.densityDpi;
                                    if (i47 != i48) {
                                        configuration3.densityDpi = i48;
                                    }
                                }
                            }
                            Configuration configurationU = androidx.appcompat.app.b.u(context, iD, eVarQ, configuration3, true);
                            eVar = new p.e(context, com.lingodeer.R.style.Theme_AppCompat_Empty);
                            eVar.a(configurationU);
                            try {
                                if (context.getTheme() != null) {
                                    theme = eVar.getTheme();
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        q4.i.a(theme);
                                    } else {
                                        synchronized (q4.a.f47426e) {
                                            if (!q4.a.f47428g) {
                                                try {
                                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                                    q4.a.f47427f = declaredMethod;
                                                    declaredMethod.setAccessible(true);
                                                } catch (NoSuchMethodException unused3) {
                                                }
                                                q4.a.f47428g = true;
                                            }
                                            method = q4.a.f47427f;
                                            if (method != null) {
                                                try {
                                                    method.invoke(theme, null);
                                                } catch (IllegalAccessException | InvocationTargetException unused4) {
                                                    q4.a.f47427f = null;
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (NullPointerException unused5) {
                            }
                            context = eVar;
                        }
                    }
                } else if (androidx.appcompat.app.b.L0) {
                    Configuration configuration5 = new Configuration();
                    configuration5.uiMode = -1;
                    configuration5.fontScale = CropImageView.DEFAULT_ASPECT_RATIO;
                    configuration = context.createConfigurationContext(configuration5).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (configuration.equals(configuration2)) {
                        configuration3 = new Configuration();
                        configuration3.fontScale = CropImageView.DEFAULT_ASPECT_RATIO;
                        if (configuration.diff(configuration2) != 0) {
                            f5 = configuration.fontScale;
                            f11 = configuration2.fontScale;
                            if (f5 != f11) {
                                configuration3.fontScale = f11;
                            }
                            i11 = configuration.mcc;
                            i12 = configuration2.mcc;
                            if (i11 != i12) {
                                configuration3.mcc = i12;
                            }
                            i13 = configuration.mnc;
                            i14 = configuration2.mnc;
                            if (i13 != i14) {
                                configuration3.mnc = i14;
                            }
                            i15 = Build.VERSION.SDK_INT;
                            v.a(configuration, configuration2, configuration3);
                            i16 = configuration.touchscreen;
                            i17 = configuration2.touchscreen;
                            if (i16 != i17) {
                                configuration3.touchscreen = i17;
                            }
                            i18 = configuration.keyboard;
                            i19 = configuration2.keyboard;
                            if (i18 != i19) {
                                configuration3.keyboard = i19;
                            }
                            i21 = configuration.keyboardHidden;
                            i22 = configuration2.keyboardHidden;
                            if (i21 != i22) {
                                configuration3.keyboardHidden = i22;
                            }
                            i23 = configuration.navigation;
                            i24 = configuration2.navigation;
                            if (i23 != i24) {
                                configuration3.navigation = i24;
                            }
                            i25 = configuration.navigationHidden;
                            i26 = configuration2.navigationHidden;
                            if (i25 != i26) {
                                configuration3.navigationHidden = i26;
                            }
                            i27 = configuration.orientation;
                            i28 = configuration2.orientation;
                            if (i27 != i28) {
                                configuration3.orientation = i28;
                            }
                            i29 = configuration.screenLayout & 15;
                            i30 = configuration2.screenLayout & 15;
                            if (i29 != i30) {
                                configuration3.screenLayout |= i30;
                            }
                            i31 = configuration.screenLayout & 192;
                            i32 = configuration2.screenLayout & 192;
                            if (i31 != i32) {
                                configuration3.screenLayout |= i32;
                            }
                            i33 = configuration.screenLayout & 48;
                            i34 = configuration2.screenLayout & 48;
                            if (i33 != i34) {
                                configuration3.screenLayout |= i34;
                            }
                            i35 = configuration.screenLayout & 768;
                            i36 = configuration2.screenLayout & 768;
                            if (i35 != i36) {
                                configuration3.screenLayout |= i36;
                            }
                            if (i15 >= 26) {
                                z6.c.d(configuration, configuration2, configuration3);
                            }
                            i37 = configuration.uiMode & 15;
                            i38 = configuration2.uiMode & 15;
                            if (i37 != i38) {
                                configuration3.uiMode |= i38;
                            }
                            i39 = configuration.uiMode & 48;
                            i40 = configuration2.uiMode & 48;
                            if (i39 != i40) {
                                configuration3.uiMode |= i40;
                            }
                            i41 = configuration.screenWidthDp;
                            i42 = configuration2.screenWidthDp;
                            if (i41 != i42) {
                                configuration3.screenWidthDp = i42;
                            }
                            i43 = configuration.screenHeightDp;
                            i44 = configuration2.screenHeightDp;
                            if (i43 != i44) {
                                configuration3.screenHeightDp = i44;
                            }
                            i45 = configuration.smallestScreenWidthDp;
                            i46 = configuration2.smallestScreenWidthDp;
                            if (i45 != i46) {
                                configuration3.smallestScreenWidthDp = i46;
                            }
                            i47 = configuration.densityDpi;
                            i48 = configuration2.densityDpi;
                            if (i47 != i48) {
                                configuration3.densityDpi = i48;
                            }
                        }
                    } else {
                        configuration3 = null;
                    }
                    Configuration configurationU2 = androidx.appcompat.app.b.u(context, iD, eVarQ, configuration3, true);
                    eVar = new p.e(context, com.lingodeer.R.style.Theme_AppCompat_Empty);
                    eVar.a(configurationU2);
                    if (context.getTheme() != null) {
                        theme = eVar.getTheme();
                        if (Build.VERSION.SDK_INT >= 29) {
                            q4.i.a(theme);
                        } else {
                            synchronized (q4.a.f47426e) {
                                if (!q4.a.f47428g) {
                                    Method declaredMethod2 = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    q4.a.f47427f = declaredMethod2;
                                    declaredMethod2.setAccessible(true);
                                    q4.a.f47428g = true;
                                }
                                method = q4.a.f47427f;
                                if (method != null) {
                                    method.invoke(theme, null);
                                }
                            }
                        }
                    }
                    context = eVar;
                }
            }
        } else if (context instanceof p.e) {
            ((p.e) context).a(androidx.appcompat.app.b.u(context, iD, eVarQ, null, false));
        } else if (androidx.appcompat.app.b.L0) {
            Configuration configuration6 = new Configuration();
            configuration6.uiMode = -1;
            configuration6.fontScale = CropImageView.DEFAULT_ASPECT_RATIO;
            configuration = context.createConfigurationContext(configuration6).getResources().getConfiguration();
            configuration2 = context.getResources().getConfiguration();
            configuration.uiMode = configuration2.uiMode;
            if (configuration.equals(configuration2)) {
                configuration3 = new Configuration();
                configuration3.fontScale = CropImageView.DEFAULT_ASPECT_RATIO;
                if (configuration.diff(configuration2) != 0) {
                    f5 = configuration.fontScale;
                    f11 = configuration2.fontScale;
                    if (f5 != f11) {
                        configuration3.fontScale = f11;
                    }
                    i11 = configuration.mcc;
                    i12 = configuration2.mcc;
                    if (i11 != i12) {
                        configuration3.mcc = i12;
                    }
                    i13 = configuration.mnc;
                    i14 = configuration2.mnc;
                    if (i13 != i14) {
                        configuration3.mnc = i14;
                    }
                    i15 = Build.VERSION.SDK_INT;
                    v.a(configuration, configuration2, configuration3);
                    i16 = configuration.touchscreen;
                    i17 = configuration2.touchscreen;
                    if (i16 != i17) {
                        configuration3.touchscreen = i17;
                    }
                    i18 = configuration.keyboard;
                    i19 = configuration2.keyboard;
                    if (i18 != i19) {
                        configuration3.keyboard = i19;
                    }
                    i21 = configuration.keyboardHidden;
                    i22 = configuration2.keyboardHidden;
                    if (i21 != i22) {
                        configuration3.keyboardHidden = i22;
                    }
                    i23 = configuration.navigation;
                    i24 = configuration2.navigation;
                    if (i23 != i24) {
                        configuration3.navigation = i24;
                    }
                    i25 = configuration.navigationHidden;
                    i26 = configuration2.navigationHidden;
                    if (i25 != i26) {
                        configuration3.navigationHidden = i26;
                    }
                    i27 = configuration.orientation;
                    i28 = configuration2.orientation;
                    if (i27 != i28) {
                        configuration3.orientation = i28;
                    }
                    i29 = configuration.screenLayout & 15;
                    i30 = configuration2.screenLayout & 15;
                    if (i29 != i30) {
                        configuration3.screenLayout |= i30;
                    }
                    i31 = configuration.screenLayout & 192;
                    i32 = configuration2.screenLayout & 192;
                    if (i31 != i32) {
                        configuration3.screenLayout |= i32;
                    }
                    i33 = configuration.screenLayout & 48;
                    i34 = configuration2.screenLayout & 48;
                    if (i33 != i34) {
                        configuration3.screenLayout |= i34;
                    }
                    i35 = configuration.screenLayout & 768;
                    i36 = configuration2.screenLayout & 768;
                    if (i35 != i36) {
                        configuration3.screenLayout |= i36;
                    }
                    if (i15 >= 26) {
                        z6.c.d(configuration, configuration2, configuration3);
                    }
                    i37 = configuration.uiMode & 15;
                    i38 = configuration2.uiMode & 15;
                    if (i37 != i38) {
                        configuration3.uiMode |= i38;
                    }
                    i39 = configuration.uiMode & 48;
                    i40 = configuration2.uiMode & 48;
                    if (i39 != i40) {
                        configuration3.uiMode |= i40;
                    }
                    i41 = configuration.screenWidthDp;
                    i42 = configuration2.screenWidthDp;
                    if (i41 != i42) {
                        configuration3.screenWidthDp = i42;
                    }
                    i43 = configuration.screenHeightDp;
                    i44 = configuration2.screenHeightDp;
                    if (i43 != i44) {
                        configuration3.screenHeightDp = i44;
                    }
                    i45 = configuration.smallestScreenWidthDp;
                    i46 = configuration2.smallestScreenWidthDp;
                    if (i45 != i46) {
                        configuration3.smallestScreenWidthDp = i46;
                    }
                    i47 = configuration.densityDpi;
                    i48 = configuration2.densityDpi;
                    if (i47 != i48) {
                        configuration3.densityDpi = i48;
                    }
                }
            } else {
                configuration3 = null;
            }
            Configuration configurationU3 = androidx.appcompat.app.b.u(context, iD, eVarQ, configuration3, true);
            eVar = new p.e(context, com.lingodeer.R.style.Theme_AppCompat_Empty);
            eVar.a(configurationU3);
            if (context.getTheme() != null) {
                theme = eVar.getTheme();
                if (Build.VERSION.SDK_INT >= 29) {
                    q4.i.a(theme);
                } else {
                    synchronized (q4.a.f47426e) {
                        if (!q4.a.f47428g) {
                            Method declaredMethod3 = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            q4.a.f47427f = declaredMethod3;
                            declaredMethod3.setAccessible(true);
                            q4.a.f47428g = true;
                        }
                        method = q4.a.f47427f;
                        if (method != null) {
                            method.invoke(theme, null);
                        }
                    }
                }
            }
            context = eVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // n4.h, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.j(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i11) {
        androidx.appcompat.app.b bVar = (androidx.appcompat.app.b) getDelegate();
        bVar.x();
        return (T) bVar.N.findViewById(i11);
    }

    public androidx.appcompat.app.a getDelegate() {
        if (this.mDelegate == null) {
            pb.j jVar = androidx.appcompat.app.a.f794a;
            this.mDelegate = new androidx.appcompat.app.b(this, null, this, this);
        }
        return this.mDelegate;
    }

    public b getDrawerToggleDelegate() {
        ((androidx.appcompat.app.b) getDelegate()).getClass();
        return new p20.c(16);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        androidx.appcompat.app.b bVar = (androidx.appcompat.app.b) getDelegate();
        if (bVar.R == null) {
            bVar.B();
            a aVar = bVar.Q;
            bVar.R = new p.j(aVar != null ? aVar.e() : bVar.M);
        }
        return bVar.R;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i11 = y2.f48718a;
        }
        return resources == null ? super.getResources() : resources;
    }

    public a getSupportActionBar() {
        androidx.appcompat.app.b bVar = (androidx.appcompat.app.b) getDelegate();
        bVar.B();
        return bVar.Q;
    }

    @Override // n4.y
    public Intent getSupportParentActivityIntent() {
        return n4.e.b(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().a();
    }

    @Override // f.n, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.app.b bVar = (androidx.appcompat.app.b) getDelegate();
        if (bVar.f808h0 && bVar.f802b0) {
            bVar.B();
            a aVar = bVar.Q;
            if (aVar != null) {
                aVar.g();
            }
        }
        r.s sVarA = r.s.a();
        Context context = bVar.M;
        synchronized (sVarA) {
            t1 t1Var = sVarA.f48642a;
            synchronized (t1Var) {
                y.r rVar = (y.r) t1Var.f48650b.get(context);
                if (rVar != null) {
                    rVar.a();
                }
            }
        }
        bVar.f820t0 = new Configuration(bVar.M.getResources().getConfiguration());
        bVar.o(false, false);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(n4.z zVar) {
        zVar.getClass();
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = n4.e.b(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(zVar.f43233b.getPackageManager());
            }
            zVar.b(component);
            zVar.f43232a.add(supportParentActivityIntent);
        }
    }

    @Override // androidx.fragment.app.p0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().e();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i11, keyEvent);
        }
        return true;
    }

    @Override // androidx.fragment.app.p0, f.n, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i11, MenuItem menuItem) {
        if (super.onMenuItemSelected(i11, menuItem)) {
            return true;
        }
        a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.d() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i11, Menu menu) {
        return super.onMenuOpened(i11, menu);
    }

    @Override // f.n, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i11, Menu menu) {
        super.onPanelClosed(i11, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((androidx.appcompat.app.b) getDelegate()).x();
    }

    @Override // androidx.fragment.app.p0, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        androidx.appcompat.app.b bVar = (androidx.appcompat.app.b) getDelegate();
        bVar.B();
        a aVar = bVar.Q;
        if (aVar != null) {
            aVar.r(true);
        }
    }

    @Override // androidx.fragment.app.p0, android.app.Activity
    public void onStart() {
        super.onStart();
        ((androidx.appcompat.app.b) getDelegate()).o(true, false);
    }

    @Override // androidx.fragment.app.p0, android.app.Activity
    public void onStop() {
        super.onStop();
        androidx.appcompat.app.b bVar = (androidx.appcompat.app.b) getDelegate();
        bVar.B();
        a aVar = bVar.Q;
        if (aVar != null) {
            aVar.r(false);
        }
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        n4.z zVar = new n4.z(this);
        onCreateSupportNavigateUpTaskStack(zVar);
        onPrepareSupportNavigateUpTaskStack(zVar);
        zVar.d();
        try {
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i11) {
        super.onTitleChanged(charSequence, i11);
        getDelegate().m(charSequence);
    }

    @Override // l.n
    public p.c onWindowStartingSupportActionMode(p.b bVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.k()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // f.n, android.app.Activity
    public void setContentView(int i11) {
        initializeViewTreeOwners();
        getDelegate().h(i11);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        androidx.appcompat.app.b bVar = (androidx.appcompat.app.b) getDelegate();
        if (bVar.L instanceof Activity) {
            bVar.B();
            a aVar = bVar.Q;
            if (aVar instanceof m0) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            bVar.R = null;
            if (aVar != null) {
                aVar.h();
            }
            bVar.Q = null;
            if (toolbar != null) {
                Object obj = bVar.L;
                h0 h0Var = new h0(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : bVar.S, bVar.O);
                bVar.Q = h0Var;
                bVar.O.f39066b = h0Var.f38985c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                bVar.O.f39066b = null;
            }
            bVar.a();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i11) {
        super.setTheme(i11);
        ((androidx.appcompat.app.b) getDelegate()).f822v0 = i11;
    }

    public p.c startSupportActionMode(p.b bVar) {
        return getDelegate().n(bVar);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().a();
    }

    public void supportNavigateUpTo(Intent intent) {
        navigateUpTo(intent);
    }

    public boolean supportRequestWindowFeature(int i11) {
        return getDelegate().g(i11);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    @Override // f.n, android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        getDelegate().j(view);
    }

    @Override // f.n, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().k(view, layoutParams);
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public void onLocalesChanged(v4.e eVar) {
    }

    public void onNightModeChanged(int i11) {
    }

    public void onPrepareSupportNavigateUpTaskStack(n4.z zVar) {
    }

    @Override // l.n
    public void onSupportActionModeFinished(p.c cVar) {
    }

    @Override // l.n
    public void onSupportActionModeStarted(p.c cVar) {
    }

    @Deprecated
    public void setSupportProgress(int i11) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z11) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z11) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z11) {
    }
}
