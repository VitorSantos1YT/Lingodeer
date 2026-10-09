package androidx.fragment.app;

import androidx.lifecycle.Lifecycle;
import fa.EQx.nuRcCS;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends z1 implements h1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k1 f1609r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1610s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1611t;

    public a(k1 k1Var) {
        k1Var.J();
        u0 u0Var = k1Var.f1731x;
        if (u0Var != null) {
            u0Var.f1841b.getClassLoader();
        }
        this.f1891a = new ArrayList();
        this.f1898h = true;
        this.f1905p = false;
        this.f1611t = -1;
        this.f1609r = k1Var;
    }

    @Override // androidx.fragment.app.h1
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (k1.L(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1897g) {
            return true;
        }
        this.f1609r.f1712d.add(this);
        return true;
    }

    @Override // androidx.fragment.app.z1
    public final void d(int i11, k0 k0Var, String str, int i12) {
        String str2 = k0Var.mPreviousWho;
        if (str2 != null) {
            a6.b.c(k0Var, str2);
        }
        Class<?> cls = k0Var.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = k0Var.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb2 = new StringBuilder("Can't change tag of fragment ");
                sb2.append(k0Var);
                sb2.append(": was ");
                throw new IllegalStateException(nv.p.u(sb2, k0Var.mTag, " now ", str));
            }
            k0Var.mTag = str;
        }
        if (i11 != 0) {
            if (i11 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + k0Var + " with tag " + str + " to container view with no id");
            }
            int i13 = k0Var.mFragmentId;
            if (i13 != 0 && i13 != i11) {
                throw new IllegalStateException("Can't change container ID of fragment " + k0Var + ": was " + k0Var.mFragmentId + " now " + i11);
            }
            k0Var.mFragmentId = i11;
            k0Var.mContainerId = i11;
        }
        c(new y1(k0Var, i12));
        k0Var.mFragmentManager = this.f1609r;
    }

    public final void f(int i11) {
        ArrayList arrayList = this.f1891a;
        if (this.f1897g) {
            if (k1.L(2)) {
                toString();
            }
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                y1 y1Var = (y1) arrayList.get(i12);
                k0 k0Var = y1Var.f1879b;
                if (k0Var != null) {
                    k0Var.mBackStackNesting += i11;
                    if (k1.L(2)) {
                        Objects.toString(y1Var.f1879b);
                        int i13 = y1Var.f1879b.mBackStackNesting;
                    }
                }
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.f1891a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            y1 y1Var = (y1) arrayList.get(size);
            if (y1Var.f1880c) {
                if (y1Var.f1878a == 8) {
                    y1Var.f1880c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i11 = y1Var.f1879b.mContainerId;
                    y1Var.f1878a = 2;
                    y1Var.f1880c = false;
                    for (int i12 = size - 1; i12 >= 0; i12--) {
                        y1 y1Var2 = (y1) arrayList.get(i12);
                        if (y1Var2.f1880c && y1Var2.f1879b.mContainerId == i11) {
                            arrayList.remove(i12);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final int h() {
        return i(false, true);
    }

    public final int i(boolean z11, boolean z12) {
        if (this.f1610s) {
            throw new IllegalStateException("commit already called");
        }
        if (k1.L(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new j2());
            k("  ", printWriter, true);
            printWriter.close();
        }
        this.f1610s = true;
        boolean z13 = this.f1897g;
        k1 k1Var = this.f1609r;
        if (z13) {
            this.f1611t = k1Var.f1719k.getAndIncrement();
        } else {
            this.f1611t = -1;
        }
        if (z12) {
            k1Var.x(this, z11);
        }
        return this.f1611t;
    }

    public final void j() {
        if (this.f1897g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f1898h = false;
        this.f1609r.A(this, false);
    }

    public final a l(k0 k0Var) {
        k1 k1Var = k0Var.mFragmentManager;
        if (k1Var == null || k1Var == this.f1609r) {
            c(new y1(k0Var, 3));
            return this;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + k0Var.toString() + " is already attached to a FragmentManager.");
    }

    public final a m(k0 k0Var, Lifecycle.State state) {
        k1 k1Var = k0Var.mFragmentManager;
        k1 k1Var2 = this.f1609r;
        if (k1Var != k1Var2) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + k1Var2);
        }
        if (state == Lifecycle.State.INITIALIZED && k0Var.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + " after the Fragment has been created");
        }
        if (state == Lifecycle.State.DESTROYED) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        y1 y1Var = new y1();
        y1Var.f1878a = 10;
        y1Var.f1879b = k0Var;
        y1Var.f1880c = false;
        y1Var.f1885h = k0Var.mMaxState;
        y1Var.f1886i = state;
        c(y1Var);
        return this;
    }

    public final a n(k0 k0Var) {
        k1 k1Var = k0Var.mFragmentManager;
        if (k1Var == null || k1Var == this.f1609r) {
            c(new y1(k0Var, 5));
            return this;
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + k0Var.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1611t >= 0) {
            sb2.append(" #");
            sb2.append(this.f1611t);
        }
        if (this.f1899i != null) {
            sb2.append(" ");
            sb2.append(this.f1899i);
        }
        sb2.append("}");
        return sb2.toString();
    }

    public final void k(String str, PrintWriter printWriter, boolean z11) {
        String str2;
        ArrayList arrayList = this.f1891a;
        if (z11) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1899i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1611t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1610s);
            if (this.f1896f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1896f));
            }
            if (this.f1892b != 0 || this.f1893c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1892b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1893c));
            }
            if (this.f1894d != 0 || this.f1895e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1894d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1895e));
            }
            if (this.f1900j != 0 || this.f1901k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1900j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1901k);
            }
            if (this.f1902l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1902l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.m);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            y1 y1Var = (y1) arrayList.get(i11);
            switch (y1Var.f1878a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + y1Var.f1878a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i11);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(y1Var.f1879b);
            if (z11) {
                if (y1Var.f1881d != 0 || y1Var.f1882e != 0) {
                    printWriter.print(str);
                    printWriter.print(nuRcCS.uviUfmQZHTyGpm);
                    printWriter.print(Integer.toHexString(y1Var.f1881d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(y1Var.f1882e));
                }
                if (y1Var.f1883f != 0 || y1Var.f1884g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(y1Var.f1883f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(y1Var.f1884g));
                }
            }
        }
    }
}
