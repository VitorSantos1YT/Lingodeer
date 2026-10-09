package q;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import z4.t0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class l implements Menu {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int[] f47279a0 = {1, 4, 5, 3, 2, 0};
    public boolean H;
    public final ArrayList K;
    public final ArrayList L;
    public boolean M;
    public CharSequence O;
    public Drawable P;
    public View Q;
    public n X;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f47281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f47282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f47283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f47284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f47285f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f47286t;
    public int N = 0;
    public boolean R = false;
    public boolean S = false;
    public boolean T = false;
    public boolean U = false;
    public final ArrayList V = new ArrayList();
    public final CopyOnWriteArrayList W = new CopyOnWriteArrayList();
    public boolean Y = false;

    public l(Context context) {
        boolean zG;
        boolean z11 = false;
        this.f47280a = context;
        Resources resources = context.getResources();
        this.f47281b = resources;
        this.f47285f = new ArrayList();
        this.f47286t = new ArrayList();
        this.H = true;
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = t0.f58901a;
            if (Build.VERSION.SDK_INT >= 28) {
                zG = a2.l.G(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zG = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zG) {
                z11 = true;
            }
        }
        this.f47283d = z11;
    }

    public n a(int i11, int i12, int i13, CharSequence charSequence) {
        int i14;
        int i15 = ((-65536) & i13) >> 16;
        if (i15 < 0 || i15 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i16 = (f47279a0[i15] << 16) | (65535 & i13);
        n nVar = new n(this, i11, i12, i13, i16, charSequence, this.N);
        ArrayList arrayList = this.f47285f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((n) arrayList.get(size)).f47296d <= i16) {
                i14 = size + 1;
                arrayList.add(i14, nVar);
                p(true);
                return nVar;
            }
        }
        i14 = 0;
        arrayList.add(i14, nVar);
        p(true);
        return nVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i11, int i12, int i13, ComponentName componentName, Intent[] intentArr, Intent intent, int i14, MenuItem[] menuItemArr) {
        int i15;
        PackageManager packageManager = this.f47280a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i14 & 1) == 0) {
            removeGroup(i11);
        }
        for (int i16 = 0; i16 < size; i16++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i16);
            int i17 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i17 < 0 ? intent : intentArr[i17]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            n nVarA = a(i11, i12, i13, resolveInfo.loadLabel(packageManager));
            nVarA.setIcon(resolveInfo.loadIcon(packageManager));
            nVarA.f47301t = intent2;
            if (menuItemArr != null && (i15 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i15] = nVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(v vVar, Context context) {
        this.W.add(new WeakReference(vVar));
        vVar.j(context, this);
        this.M = true;
    }

    public final void c(boolean z11) {
        if (this.U) {
            return;
        }
        this.U = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.W;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            v vVar = (v) weakReference.get();
            if (vVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                vVar.d(this, z11);
            }
        }
        this.U = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        n nVar = this.X;
        if (nVar != null) {
            d(nVar);
        }
        this.f47285f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.P = null;
        this.O = null;
        this.Q = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(n nVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.W;
        boolean zM = false;
        if (!copyOnWriteArrayList.isEmpty() && this.X == nVar) {
            y();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                v vVar = (v) weakReference.get();
                if (vVar != null) {
                    zM = vVar.m(nVar);
                    if (zM) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            x();
            if (zM) {
                this.X = null;
            }
        }
        return zM;
    }

    public boolean e(l lVar, MenuItem menuItem) {
        j jVar = this.f47284e;
        return jVar != null && jVar.c(lVar, menuItem);
    }

    public boolean f(n nVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.W;
        boolean zI = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        y();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            v vVar = (v) weakReference.get();
            if (vVar != null) {
                zI = vVar.i(nVar);
                if (zI) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        x();
        if (zI) {
            this.X = nVar;
        }
        return zI;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i11) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f47285f;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            n nVar = (n) arrayList.get(i12);
            if (nVar.f47290a == i11) {
                return nVar;
            }
            if (nVar.hasSubMenu() && (menuItemFindItem = nVar.Q.findItem(i11)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final n g(int i11, KeyEvent keyEvent) {
        ArrayList arrayList = this.V;
        arrayList.clear();
        h(arrayList, i11, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (n) arrayList.get(0);
        }
        boolean zN = n();
        for (int i12 = 0; i12 < size; i12++) {
            n nVar = (n) arrayList.get(i12);
            char c11 = zN ? nVar.L : nVar.H;
            char[] cArr = keyData.meta;
            if ((c11 == cArr[0] && (metaState & 2) == 0) || ((c11 == cArr[2] && (metaState & 2) != 0) || (zN && c11 == '\b' && i11 == 67))) {
                return nVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i11) {
        return (MenuItem) this.f47285f.get(i11);
    }

    public final void h(List list, int i11, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i11 == 67) {
            ArrayList arrayList = this.f47285f;
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                n nVar = (n) arrayList.get(i12);
                if (nVar.hasSubMenu()) {
                    nVar.Q.h(list, i11, keyEvent);
                }
                char c11 = zN ? nVar.L : nVar.H;
                if ((modifiers & 69647) == ((zN ? nVar.M : nVar.K) & 69647) && c11 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c11 == cArr[0] || c11 == cArr[2] || (zN && c11 == '\b' && i11 == 67)) && nVar.isEnabled()) {
                        list.add(nVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.Z) {
            return true;
        }
        ArrayList arrayList = this.f47285f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((n) arrayList.get(i11)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.M) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.W;
            boolean zE = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                v vVar = (v) weakReference.get();
                if (vVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zE |= vVar.e();
                }
            }
            ArrayList arrayList = this.K;
            ArrayList arrayList2 = this.L;
            if (zE) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i11 = 0; i11 < size; i11++) {
                    n nVar = (n) arrayListL.get(i11);
                    if ((nVar.Z & 32) == 32) {
                        arrayList.add(nVar);
                    } else {
                        arrayList2.add(nVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.M = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i11, KeyEvent keyEvent) {
        return g(i11, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public l k() {
        return this;
    }

    public final ArrayList l() {
        boolean z11 = this.H;
        ArrayList arrayList = this.f47286t;
        if (!z11) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f47285f;
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = (n) arrayList2.get(i11);
            if (nVar.isVisible()) {
                arrayList.add(nVar);
            }
        }
        this.H = false;
        this.M = true;
        return arrayList;
    }

    public boolean m() {
        return this.Y;
    }

    public boolean n() {
        return this.f47282c;
    }

    public boolean o() {
        return this.f47283d;
    }

    public void p(boolean z11) {
        if (this.R) {
            this.S = true;
            if (z11) {
                this.T = true;
                return;
            }
            return;
        }
        if (z11) {
            this.H = true;
            this.M = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.W;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        y();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            v vVar = (v) weakReference.get();
            if (vVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                vVar.c(z11);
            }
        }
        x();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i11, int i12) {
        return q(findItem(i11), null, i12);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i11, KeyEvent keyEvent, int i12) {
        n nVarG = g(i11, keyEvent);
        boolean zQ = nVarG != null ? q(nVarG, null, i12) : false;
        if ((i12 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0055  */
    /* JADX WARN: Code duplicated, block: B:35:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00ab A[SYNTHETIC] */
    public final boolean q(MenuItem menuItem, v vVar, int i11) {
        z4.c cVar;
        boolean zExpandActionView;
        z4.c cVar2;
        boolean z11;
        b0 b0Var;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList;
        v vVar2;
        n nVar = (n) menuItem;
        boolean zF = false;
        if (nVar == null || !nVar.isEnabled()) {
            return false;
        }
        l lVar = nVar.P;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = nVar.R;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(nVar)) && !lVar.e(lVar, nVar)) {
            Intent intent = nVar.f47301t;
            if (intent != null) {
                try {
                    lVar.f47280a.startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    cVar = nVar.f47295c0;
                    if (cVar == null) {
                    }
                    zExpandActionView = false;
                    cVar2 = nVar.f47295c0;
                    if (cVar2 == null) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    if (nVar.e()) {
                        zExpandActionView |= nVar.expandActionView();
                        if (zExpandActionView) {
                            c(true);
                        }
                    } else if (nVar.hasSubMenu()) {
                        if ((i11 & 4) == 0) {
                            c(false);
                        }
                        if (!nVar.hasSubMenu()) {
                            b0 b0Var2 = new b0(this.f47280a, this, nVar);
                            nVar.Q = b0Var2;
                            b0Var2.setHeaderTitle(nVar.f47298e);
                        }
                        b0Var = nVar.Q;
                        if (z11) {
                            ((o) cVar2).f47303c.onPrepareSubMenu(b0Var);
                        }
                        copyOnWriteArrayList = this.W;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            if (vVar != null) {
                            }
                            for (WeakReference weakReference : copyOnWriteArrayList) {
                                vVar2 = (v) weakReference.get();
                                if (vVar2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zF) {
                                    zF = vVar2.f(b0Var);
                                }
                            }
                        }
                        zExpandActionView |= zF;
                        if (!zExpandActionView) {
                            c(true);
                        }
                    } else {
                        if ((i11 & 4) == 0) {
                            c(false);
                        }
                        if (!nVar.hasSubMenu()) {
                            b0 b0Var3 = new b0(this.f47280a, this, nVar);
                            nVar.Q = b0Var3;
                            b0Var3.setHeaderTitle(nVar.f47298e);
                        }
                        b0Var = nVar.Q;
                        if (z11) {
                            ((o) cVar2).f47303c.onPrepareSubMenu(b0Var);
                        }
                        copyOnWriteArrayList = this.W;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            zF = vVar != null ? vVar.f(b0Var) : false;
                            while (r8.hasNext()) {
                                vVar2 = (v) weakReference.get();
                                if (vVar2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zF) {
                                    zF = vVar2.f(b0Var);
                                }
                            }
                        }
                        zExpandActionView |= zF;
                        if (!zExpandActionView) {
                            c(true);
                        }
                    }
                    return zExpandActionView;
                }
                zExpandActionView = true;
            } else {
                cVar = nVar.f47295c0;
                if (cVar == null && ((o) cVar).f47303c.onPerformDefaultAction()) {
                    zExpandActionView = true;
                } else {
                    zExpandActionView = false;
                }
            }
        } else {
            zExpandActionView = true;
        }
        cVar2 = nVar.f47295c0;
        if (cVar2 == null && ((o) cVar2).f47303c.hasSubMenu()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (nVar.e()) {
            zExpandActionView |= nVar.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (nVar.hasSubMenu() || z11) {
            if ((i11 & 4) == 0) {
                c(false);
            }
            if (!nVar.hasSubMenu()) {
                b0 b0Var4 = new b0(this.f47280a, this, nVar);
                nVar.Q = b0Var4;
                b0Var4.setHeaderTitle(nVar.f47298e);
            }
            b0Var = nVar.Q;
            if (z11) {
                ((o) cVar2).f47303c.onPrepareSubMenu(b0Var);
            }
            copyOnWriteArrayList = this.W;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (vVar != null) {
                }
                while (r8.hasNext()) {
                    vVar2 = (v) weakReference.get();
                    if (vVar2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zF) {
                        zF = vVar2.f(b0Var);
                    }
                }
            }
            zExpandActionView |= zF;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i11 & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    public final void r(v vVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.W;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            v vVar2 = (v) weakReference.get();
            if (vVar2 == null || vVar2 == vVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i11) {
        ArrayList arrayList = this.f47285f;
        int size = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                i13 = -1;
                break;
            } else if (((n) arrayList.get(i13)).f47292b == i11) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 >= 0) {
            int size2 = arrayList.size() - i13;
            while (true) {
                int i14 = i12 + 1;
                if (i12 >= size2 || ((n) arrayList.get(i13)).f47292b != i11) {
                    break;
                }
                if (i13 >= 0 && i13 < arrayList.size()) {
                    arrayList.remove(i13);
                }
                i12 = i14;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i11) {
        ArrayList arrayList = this.f47285f;
        int size = arrayList.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                i12 = -1;
                break;
            } else if (((n) arrayList.get(i12)).f47290a == i11) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 < 0 || i12 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i12);
        p(true);
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f47285f.size();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = getItem(i11);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((b0) item.getSubMenu()).s(bundle);
            }
        }
        int i12 = bundle.getInt("android:menu:expandedactionview");
        if (i12 <= 0 || (menuItemFindItem = findItem(i12)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i11, boolean z11, boolean z12) {
        ArrayList arrayList = this.f47285f;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            n nVar = (n) arrayList.get(i12);
            if (nVar.f47292b == i11) {
                nVar.f(z12);
                nVar.setCheckable(z11);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z11) {
        this.Y = z11;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i11, boolean z11) {
        ArrayList arrayList = this.f47285f;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            n nVar = (n) arrayList.get(i12);
            if (nVar.f47292b == i11) {
                nVar.setEnabled(z11);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i11, boolean z11) {
        ArrayList arrayList = this.f47285f;
        int size = arrayList.size();
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            n nVar = (n) arrayList.get(i12);
            if (nVar.f47292b == i11) {
                int i13 = nVar.Z;
                int i14 = (i13 & (-9)) | (z11 ? 0 : 8);
                nVar.Z = i14;
                if (i13 != i14) {
                    z12 = true;
                }
            }
        }
        if (z12) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z11) {
        this.f47282c = z11;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f47285f.size();
    }

    public final void u(Bundle bundle) {
        int size = this.f47285f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = getItem(i11);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((b0) item.getSubMenu()).u(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void v(Bundle bundle) {
        Parcelable parcelableK;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.W;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            v vVar = (v) weakReference.get();
            if (vVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id2 = vVar.getId();
                if (id2 > 0 && (parcelableK = vVar.k()) != null) {
                    sparseArray.put(id2, parcelableK);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    public final void w(int i11, CharSequence charSequence, int i12, Drawable drawable, View view) {
        if (view != null) {
            this.Q = view;
            this.O = null;
            this.P = null;
        } else {
            if (i11 > 0) {
                this.O = this.f47281b.getText(i11);
            } else if (charSequence != null) {
                this.O = charSequence;
            }
            if (i12 > 0) {
                this.P = this.f47280a.getDrawable(i12);
            } else if (drawable != null) {
                this.P = drawable;
            }
            this.Q = null;
        }
        p(false);
    }

    public final void x() {
        this.R = false;
        if (this.S) {
            this.S = false;
            p(this.T);
        }
    }

    public final void y() {
        if (this.R) {
            return;
        }
        this.R = true;
        this.S = false;
        this.T = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i11) {
        return a(0, 0, 0, this.f47281b.getString(i11));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i11) {
        return addSubMenu(0, 0, 0, this.f47281b.getString(i11));
    }

    public final void t(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(ypOOxsaJG.EEBXLmiw);
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.W;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            for (WeakReference weakReference : copyOnWriteArrayList) {
                v vVar = (v) weakReference.get();
                if (vVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int id2 = vVar.getId();
                    if (id2 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id2)) != null) {
                        vVar.g(parcelable);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(int i11, int i12, int i13, CharSequence charSequence) {
        return a(i11, i12, i13, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i11, int i12, int i13, CharSequence charSequence) {
        n nVarA = a(i11, i12, i13, charSequence);
        b0 b0Var = new b0(this.f47280a, this, nVarA);
        nVarA.Q = b0Var;
        b0Var.setHeaderTitle(nVarA.f47298e);
        return b0Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i11, int i12, int i13, int i14) {
        return a(i11, i12, i13, this.f47281b.getString(i14));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i11, int i12, int i13, int i14) {
        return addSubMenu(i11, i12, i13, this.f47281b.getString(i14));
    }
}
