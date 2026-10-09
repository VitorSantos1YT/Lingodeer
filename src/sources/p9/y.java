package p9;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.g2;
import com.lingodeer.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PreferenceGroup f46715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f46716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f46717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f46718d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final aj.i f46720f = new aj.i(this, 29);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f46719e = new Handler(Looper.getMainLooper());

    public y(PreferenceGroup preferenceGroup) {
        this.f46715a = preferenceGroup;
        preferenceGroup.f2333i0 = this;
        this.f46716b = new ArrayList();
        this.f46717c = new ArrayList();
        this.f46718d = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            setHasStableIds(((PreferenceScreen) preferenceGroup).f2359x0);
        } else {
            setHasStableIds(true);
        }
        d();
    }

    public final ArrayList a(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = preferenceGroup.f2353r0.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            Preference preferenceF = preferenceGroup.F(i13);
            if (preferenceF.Y) {
                int i14 = preferenceGroup.f2357v0;
                if (i14 == Integer.MAX_VALUE || i12 < i14) {
                    arrayList.add(preferenceF);
                } else {
                    arrayList2.add(preferenceF);
                }
                if (preferenceF instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceF;
                    if (preferenceGroup2 instanceof PreferenceScreen) {
                        continue;
                    } else {
                        if (preferenceGroup.f2357v0 != Integer.MAX_VALUE && preferenceGroup2.f2357v0 != Integer.MAX_VALUE) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        ArrayList arrayListA = a(preferenceGroup2);
                        int size2 = arrayListA.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            Object obj = arrayListA.get(i15);
                            i15++;
                            Preference preference = (Preference) obj;
                            int i16 = preferenceGroup.f2357v0;
                            if (i16 == Integer.MAX_VALUE || i12 < i16) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i12++;
                        }
                    }
                } else {
                    i12++;
                }
            }
        }
        int i17 = preferenceGroup.f2357v0;
        if (i17 == Integer.MAX_VALUE || i12 <= i17) {
            return arrayList;
        }
        Context context = preferenceGroup.f2319a;
        long j11 = preferenceGroup.f2323c;
        CharSequence string = null;
        f fVar = new f(context, null);
        fVar.f2331g0 = R.layout.expand_button;
        Context context2 = fVar.f2319a;
        Drawable drawableK = jh.h.k(context2, R.drawable.ic_arrow_down_24dp);
        if (fVar.M != drawableK) {
            fVar.M = drawableK;
            fVar.L = 0;
            fVar.j();
        }
        fVar.L = R.drawable.ic_arrow_down_24dp;
        fVar.z(context2.getString(R.string.expand_button_title));
        if (999 != fVar.f2340t) {
            fVar.f2340t = 999;
            y yVar = fVar.f2333i0;
            if (yVar != null) {
                Handler handler = yVar.f46719e;
                aj.i iVar = yVar.f46720f;
                handler.removeCallbacks(iVar);
                handler.post(iVar);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int size3 = arrayList2.size();
        while (i11 < size3) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            Preference preference2 = (Preference) obj2;
            CharSequence charSequence = preference2.H;
            boolean z11 = preference2 instanceof PreferenceGroup;
            if (z11 && !TextUtils.isEmpty(charSequence)) {
                arrayList3.add((PreferenceGroup) preference2);
            }
            if (arrayList3.contains(preference2.f2335k0)) {
                if (z11) {
                    arrayList3.add((PreferenceGroup) preference2);
                }
            } else if (!TextUtils.isEmpty(charSequence)) {
                string = string == null ? charSequence : context2.getString(R.string.summary_collapsed_preference_list, string, charSequence);
            }
        }
        if (fVar.f2338n0 != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (!TextUtils.equals(fVar.K, string)) {
            fVar.K = string;
            fVar.j();
        }
        fVar.f46659p0 = j11 + 1000000;
        fVar.f2329f = new ob.u(this, preferenceGroup, false, 26);
        arrayList.add(fVar);
        return arrayList;
    }

    public final void b(ArrayList arrayList, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.f2353r0);
        }
        int size = preferenceGroup.f2353r0.size();
        for (int i11 = 0; i11 < size; i11++) {
            Preference preferenceF = preferenceGroup.F(i11);
            arrayList.add(preferenceF);
            x xVar = new x(preferenceF);
            if (!this.f46718d.contains(xVar)) {
                this.f46718d.add(xVar);
            }
            if (preferenceF instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceF;
                if (!(preferenceGroup2 instanceof PreferenceScreen)) {
                    b(arrayList, preferenceGroup2);
                }
            }
            preferenceF.f2333i0 = this;
        }
    }

    public final Preference c(int i11) {
        if (i11 < 0 || i11 >= this.f46717c.size()) {
            return null;
        }
        return (Preference) this.f46717c.get(i11);
    }

    public final void d() {
        ArrayList arrayList = this.f46716b;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ((Preference) obj).f2333i0 = null;
        }
        ArrayList arrayList2 = new ArrayList(this.f46716b.size());
        this.f46716b = arrayList2;
        PreferenceGroup preferenceGroup = this.f46715a;
        b(arrayList2, preferenceGroup);
        this.f46717c = a(preferenceGroup);
        notifyDataSetChanged();
        ArrayList arrayList3 = this.f46716b;
        int size2 = arrayList3.size();
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            ((Preference) obj2).getClass();
        }
    }

    @Override // androidx.recyclerview.widget.b1
    public final int getItemCount() {
        return this.f46717c.size();
    }

    @Override // androidx.recyclerview.widget.b1
    public final long getItemId(int i11) {
        if (hasStableIds()) {
            return c(i11).e();
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.b1
    public final int getItemViewType(int i11) {
        x xVar = new x(c(i11));
        ArrayList arrayList = this.f46718d;
        int iIndexOf = arrayList.indexOf(xVar);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = arrayList.size();
        arrayList.add(xVar);
        return size;
    }

    @Override // androidx.recyclerview.widget.b1
    public final void onBindViewHolder(g2 g2Var, int i11) {
        g0 g0Var = (g0) g2Var;
        Preference preferenceC = c(i11);
        ColorStateList colorStateList = g0Var.f46664b;
        Drawable background = g0Var.itemView.getBackground();
        Drawable drawable = g0Var.f46663a;
        if (background != drawable) {
            View view = g0Var.itemView;
            WeakHashMap weakHashMap = s0.f58893a;
            view.setBackground(drawable);
        }
        TextView textView = (TextView) g0Var.a(android.R.id.title);
        if (textView != null && colorStateList != null && !textView.getTextColors().equals(colorStateList)) {
            textView.setTextColor(colorStateList);
        }
        preferenceC.n(g0Var);
    }

    @Override // androidx.recyclerview.widget.b1
    public final g2 onCreateViewHolder(ViewGroup viewGroup, int i11) {
        x xVar = (x) this.f46718d.get(i11);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, h0.f46670a);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = jh.h.k(viewGroup.getContext(), android.R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(xVar.f46712a, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            WeakHashMap weakHashMap = s0.f58893a;
            viewInflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(android.R.id.widget_frame);
        if (viewGroup2 != null) {
            int i12 = xVar.f46713b;
            if (i12 != 0) {
                layoutInflaterFrom.inflate(i12, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new g0(viewInflate);
    }
}
