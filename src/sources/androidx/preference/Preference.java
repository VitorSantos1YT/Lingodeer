package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.lingodeer.R;
import h9.l0;
import hh.p0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.WeakHashMap;
import jh.h;
import p9.d0;
import p9.g0;
import p9.h0;
import p9.n;
import p9.o;
import p9.p;
import p9.q;
import p9.y;
import q4.a;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    public CharSequence H;
    public CharSequence K;
    public int L;
    public Drawable M;
    public final String N;
    public Intent O;
    public final String P;
    public Bundle Q;
    public final boolean R;
    public final boolean S;
    public final boolean T;
    public final String U;
    public final Object V;
    public boolean W;
    public boolean X;
    public final boolean Y;
    public final boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2319a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final boolean f2320a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d0 f2321b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final boolean f2322b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f2323c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final boolean f2324c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2325d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final boolean f2326d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n f2327e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final boolean f2328e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f2329f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final boolean f2330f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f2331g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final int f2332h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public y f2333i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public ArrayList f2334j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public PreferenceGroup f2335k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f2336l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public p f2337m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public q f2338n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final l0 f2339o0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2340t;

    public Preference(Context context, AttributeSet attributeSet, int i11) {
        this.f2340t = Integer.MAX_VALUE;
        this.R = true;
        this.S = true;
        this.T = true;
        this.W = true;
        this.X = true;
        this.Y = true;
        this.Z = true;
        this.f2320a0 = true;
        this.f2324c0 = true;
        this.f2330f0 = true;
        this.f2331g0 = R.layout.preference;
        this.f2339o0 = new l0(this, 2);
        this.f2319a = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h0.f46676g, i11, 0);
        this.L = typedArrayObtainStyledAttributes.getResourceId(23, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        String string = typedArrayObtainStyledAttributes.getString(26);
        this.N = string == null ? typedArrayObtainStyledAttributes.getString(6) : string;
        CharSequence text = typedArrayObtainStyledAttributes.getText(34);
        this.H = text == null ? typedArrayObtainStyledAttributes.getText(4) : text;
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(33);
        this.K = text2 == null ? typedArrayObtainStyledAttributes.getText(7) : text2;
        this.f2340t = typedArrayObtainStyledAttributes.getInt(28, typedArrayObtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        String string2 = typedArrayObtainStyledAttributes.getString(22);
        this.P = string2 == null ? typedArrayObtainStyledAttributes.getString(13) : string2;
        this.f2331g0 = typedArrayObtainStyledAttributes.getResourceId(27, typedArrayObtainStyledAttributes.getResourceId(3, R.layout.preference));
        this.f2332h0 = typedArrayObtainStyledAttributes.getResourceId(35, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.R = typedArrayObtainStyledAttributes.getBoolean(21, typedArrayObtainStyledAttributes.getBoolean(2, true));
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(30, typedArrayObtainStyledAttributes.getBoolean(5, true));
        this.S = z11;
        this.T = typedArrayObtainStyledAttributes.getBoolean(29, typedArrayObtainStyledAttributes.getBoolean(1, true));
        String string3 = typedArrayObtainStyledAttributes.getString(19);
        this.U = string3 == null ? typedArrayObtainStyledAttributes.getString(10) : string3;
        this.Z = typedArrayObtainStyledAttributes.getBoolean(16, typedArrayObtainStyledAttributes.getBoolean(16, z11));
        this.f2320a0 = typedArrayObtainStyledAttributes.getBoolean(17, typedArrayObtainStyledAttributes.getBoolean(17, z11));
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.V = q(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.V = q(typedArrayObtainStyledAttributes, 11);
        }
        this.f2330f0 = typedArrayObtainStyledAttributes.getBoolean(31, typedArrayObtainStyledAttributes.getBoolean(12, true));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(32);
        this.f2322b0 = zHasValue;
        if (zHasValue) {
            this.f2324c0 = typedArrayObtainStyledAttributes.getBoolean(32, typedArrayObtainStyledAttributes.getBoolean(14, true));
        }
        this.f2326d0 = typedArrayObtainStyledAttributes.getBoolean(24, typedArrayObtainStyledAttributes.getBoolean(15, false));
        this.Y = typedArrayObtainStyledAttributes.getBoolean(25, typedArrayObtainStyledAttributes.getBoolean(25, true));
        this.f2328e0 = typedArrayObtainStyledAttributes.getBoolean(20, typedArrayObtainStyledAttributes.getBoolean(20, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void w(View view, boolean z11) {
        view.setEnabled(z11);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                w(viewGroup.getChildAt(childCount), z11);
            }
        }
    }

    public boolean A() {
        return !h();
    }

    public final boolean B() {
        return (this.f2321b == null || !this.T || TextUtils.isEmpty(this.N)) ? false : true;
    }

    public final void C() {
        ArrayList arrayList;
        PreferenceScreen preferenceScreen;
        String str = this.U;
        if (str != null) {
            d0 d0Var = this.f2321b;
            Preference preferenceE = null;
            if (d0Var != null && (preferenceScreen = d0Var.f46649g) != null) {
                preferenceE = preferenceScreen.E(str);
            }
            if (preferenceE == null || (arrayList = preferenceE.f2334j0) == null) {
                return;
            }
            arrayList.remove(this);
        }
    }

    public final boolean a(Serializable serializable) {
        n nVar = this.f2327e;
        if (nVar == null) {
            return true;
        }
        nVar.c(this, serializable);
        return true;
    }

    public void b(Bundle bundle) {
        Parcelable parcelable;
        String str = this.N;
        if (TextUtils.isEmpty(str) || (parcelable = bundle.getParcelable(str)) == null) {
            return;
        }
        this.f2336l0 = false;
        r(parcelable);
        if (!this.f2336l0) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public void c(Bundle bundle) {
        String str = this.N;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f2336l0 = false;
        Parcelable parcelableS = s();
        if (!this.f2336l0) {
            throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
        }
        if (parcelableS != null) {
            bundle.putParcelable(str, parcelableS);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i11 = this.f2340t;
        int i12 = preference2.f2340t;
        if (i11 != i12) {
            return i11 - i12;
        }
        CharSequence charSequence = this.H;
        CharSequence charSequence2 = preference2.H;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference2.H.toString());
    }

    public long e() {
        return this.f2323c;
    }

    public final String f(String str) {
        return !B() ? str : this.f2321b.b().getString(this.N, str);
    }

    public CharSequence g() {
        q qVar = this.f2338n0;
        return qVar != null ? qVar.f(this) : this.K;
    }

    public boolean h() {
        return this.R && this.W && this.X;
    }

    public void j() {
        int iIndexOf;
        y yVar = this.f2333i0;
        if (yVar == null || (iIndexOf = yVar.f46717c.indexOf(this)) == -1) {
            return;
        }
        yVar.notifyItemChanged(iIndexOf, this);
    }

    public void k(boolean z11) {
        ArrayList arrayList = this.f2334j0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            Preference preference = (Preference) arrayList.get(i11);
            if (preference.W == z11) {
                preference.W = !z11;
                preference.k(preference.A());
                preference.j();
            }
        }
    }

    public void l() {
        PreferenceScreen preferenceScreen;
        String str = this.U;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        d0 d0Var = this.f2321b;
        Preference preferenceE = null;
        if (d0Var != null && (preferenceScreen = d0Var.f46649g) != null) {
            preferenceE = preferenceScreen.E(str);
        }
        if (preferenceE == null) {
            StringBuilder sbQ = p0.q("Dependency \"", str, "\" not found for preference \"");
            sbQ.append(this.N);
            sbQ.append("\" (title: \"");
            sbQ.append((Object) this.H);
            sbQ.append("\"");
            throw new IllegalStateException(sbQ.toString());
        }
        if (preferenceE.f2334j0 == null) {
            preferenceE.f2334j0 = new ArrayList();
        }
        preferenceE.f2334j0.add(this);
        boolean zA = preferenceE.A();
        if (this.W == zA) {
            this.W = !zA;
            k(A());
            j();
        }
    }

    public final void m(d0 d0Var) {
        long j11;
        this.f2321b = d0Var;
        if (!this.f2325d) {
            synchronized (d0Var) {
                j11 = d0Var.f46644b;
                d0Var.f46644b = 1 + j11;
            }
            this.f2323c = j11;
        }
        if (B()) {
            d0 d0Var2 = this.f2321b;
            if ((d0Var2 != null ? d0Var2.b() : null).contains(this.N)) {
                t(null);
                return;
            }
        }
        Object obj = this.V;
        if (obj != null) {
            t(obj);
        }
    }

    public void n(g0 g0Var) {
        Integer numValueOf;
        View view = g0Var.itemView;
        view.setOnClickListener(this.f2339o0);
        view.setId(0);
        TextView textView = (TextView) g0Var.a(android.R.id.summary);
        if (textView != null) {
            CharSequence charSequenceG = g();
            if (TextUtils.isEmpty(charSequenceG)) {
                textView.setVisibility(8);
                numValueOf = null;
            } else {
                textView.setText(charSequenceG);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) g0Var.a(android.R.id.title);
        boolean z11 = this.S;
        if (textView2 != null) {
            CharSequence charSequence = this.H;
            if (TextUtils.isEmpty(charSequence)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(charSequence);
                textView2.setVisibility(0);
                if (this.f2322b0) {
                    textView2.setSingleLine(this.f2324c0);
                }
                if (!z11 && h() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            }
        }
        ImageView imageView = (ImageView) g0Var.a(android.R.id.icon);
        boolean z12 = this.f2326d0;
        if (imageView != null) {
            int i11 = this.L;
            if (i11 != 0 || this.M != null) {
                if (this.M == null) {
                    this.M = h.k(this.f2319a, i11);
                }
                Drawable drawable = this.M;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.M != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(z12 ? 4 : 8);
            }
        }
        View viewA = g0Var.a(R.id.icon_frame);
        if (viewA == null) {
            viewA = g0Var.a(android.R.id.icon_frame);
        }
        if (viewA != null) {
            if (this.M != null) {
                viewA.setVisibility(0);
            } else {
                viewA.setVisibility(z12 ? 4 : 8);
            }
        }
        if (this.f2330f0) {
            w(view, h());
        } else {
            w(view, true);
        }
        view.setFocusable(z11);
        view.setClickable(z11);
        g0Var.f46666d = this.Z;
        g0Var.f46667e = this.f2320a0;
        boolean z13 = this.f2328e0;
        if (z13 && this.f2337m0 == null) {
            this.f2337m0 = new p(this);
        }
        view.setOnCreateContextMenuListener(z13 ? this.f2337m0 : null);
        view.setLongClickable(z13);
        if (!z13 || z11) {
            return;
        }
        WeakHashMap weakHashMap = s0.f58893a;
        view.setBackground(null);
    }

    public void p() {
        C();
    }

    public Object q(TypedArray typedArray, int i11) {
        return null;
    }

    public void r(Parcelable parcelable) {
        this.f2336l0 = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public Parcelable s() {
        this.f2336l0 = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        CharSequence charSequence = this.H;
        if (!TextUtils.isEmpty(charSequence)) {
            sb2.append(charSequence);
            sb2.append(' ');
        }
        CharSequence charSequenceG = g();
        if (!TextUtils.isEmpty(charSequenceG)) {
            sb2.append(charSequenceG);
            sb2.append(' ');
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2.toString();
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, p9.c0] */
    public void u(View view) {
        Intent intent;
        ?? r9;
        if (h() && this.S) {
            o();
            o oVar = this.f2329f;
            if (oVar == null || !oVar.i(this)) {
                d0 d0Var = this.f2321b;
                if ((d0Var == null || (r9 = d0Var.f46650h) == 0 || !r9.i(this)) && (intent = this.O) != null) {
                    this.f2319a.startActivity(intent);
                }
            }
        }
    }

    public final void v(String str) {
        if (B() && !TextUtils.equals(str, f(null))) {
            SharedPreferences.Editor editorA = this.f2321b.a();
            editorA.putString(this.N, str);
            if (this.f2321b.f46647e) {
                return;
            }
            editorA.apply();
        }
    }

    public final void z(String str) {
        if (TextUtils.equals(str, this.H)) {
            return;
        }
        this.H = str;
        j();
    }

    public void o() {
    }

    public void t(Object obj) {
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.b(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }
}
