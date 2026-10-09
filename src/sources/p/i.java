package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import hh.p0;
import java.lang.reflect.Constructor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ j E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Menu f46197a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f46204h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f46205i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f46206j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f46207k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f46208l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public char f46209n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f46210o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public char f46211p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f46212q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f46213r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f46214s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f46215t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f46216u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f46217v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f46218w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f46219x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f46220y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public z4.c f46221z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46198b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46199c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46200d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f46201e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f46202f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f46203g = true;

    public i(j jVar, Menu menu) {
        this.E = jVar;
        this.f46197a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f46226c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        j jVar = this.E;
        Context context = jVar.f46226c;
        boolean z11 = false;
        menuItem.setChecked(this.f46214s).setVisible(this.f46215t).setEnabled(this.f46216u).setCheckable(this.f46213r >= 1).setTitleCondensed(this.f46208l).setIcon(this.m);
        int i11 = this.f46217v;
        if (i11 >= 0) {
            menuItem.setShowAsAction(i11);
        }
        if (this.f46220y != null) {
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (jVar.f46227d == null) {
                jVar.f46227d = j.a(context);
            }
            Object obj = jVar.f46227d;
            String str = this.f46220y;
            h hVar = new h();
            hVar.f46195a = obj;
            Class<?> cls = obj.getClass();
            try {
                hVar.f46196b = cls.getMethod(str, h.f46194c);
                menuItem.setOnMenuItemClickListener(hVar);
            } catch (Exception e8) {
                StringBuilder sbQ = p0.q("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbQ.append(cls.getName());
                InflateException inflateException = new InflateException(sbQ.toString());
                inflateException.initCause(e8);
                throw inflateException;
            }
        }
        if (this.f46213r >= 2) {
            if (menuItem instanceof q.n) {
                ((q.n) menuItem).f(true);
            } else if (menuItem instanceof androidx.appcompat.view.menu.a) {
                androidx.appcompat.view.menu.a aVar = (androidx.appcompat.view.menu.a) menuItem;
                t4.a aVar2 = aVar.f844c;
                try {
                    if (aVar.f845d == null) {
                        aVar.f845d = aVar2.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    aVar.f845d.invoke(aVar2, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
        String str2 = this.f46219x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, j.f46222e, jVar.f46224a));
            z11 = true;
        }
        int i12 = this.f46218w;
        if (i12 > 0 && !z11) {
            menuItem.setActionView(i12);
        }
        z4.c cVar = this.f46221z;
        if (cVar != null && (menuItem instanceof t4.a)) {
            ((t4.a) menuItem).b(cVar);
        }
        CharSequence charSequence = this.A;
        boolean z12 = menuItem instanceof t4.a;
        if (z12) {
            ((t4.a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            z6.c.s(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z12) {
            ((t4.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            z6.c.x(menuItem, charSequence2);
        }
        char c11 = this.f46209n;
        int i13 = this.f46210o;
        if (z12) {
            ((t4.a) menuItem).setAlphabeticShortcut(c11, i13);
        } else if (Build.VERSION.SDK_INT >= 26) {
            z6.c.p(menuItem, c11, i13);
        }
        char c12 = this.f46211p;
        int i14 = this.f46212q;
        if (z12) {
            ((t4.a) menuItem).setNumericShortcut(c12, i14);
        } else if (Build.VERSION.SDK_INT >= 26) {
            z6.c.w(menuItem, c12, i14);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z12) {
                ((t4.a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                z6.c.v(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z12) {
                ((t4.a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                z6.c.u(menuItem, colorStateList);
            }
        }
    }
}
