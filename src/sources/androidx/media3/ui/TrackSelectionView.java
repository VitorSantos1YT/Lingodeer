package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.lingodeer.R;
import h9.k0;
import h9.l0;
import h9.m0;
import hd.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import y6.p0;
import y6.q0;
import y6.u0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {
    public boolean H;
    public boolean K;
    public k0 L;
    public CheckedTextView[][] M;
    public boolean N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LayoutInflater f2291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CheckedTextView f2292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckedTextView f2293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l0 f2294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f2295f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HashMap f2296t;

    public TrackSelectionView(Context context) {
        this(context, null);
    }

    public final void a() {
        this.f2292c.setChecked(this.N);
        boolean z11 = this.N;
        HashMap map = this.f2296t;
        this.f2293d.setChecked(!z11 && map.isEmpty());
        for (int i11 = 0; i11 < this.M.length; i11++) {
            q0 q0Var = (q0) map.get(((u0) this.f2295f.get(i11)).f57364b);
            int i12 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.M[i11];
                if (i12 < checkedTextViewArr.length) {
                    if (q0Var != null) {
                        Object tag = checkedTextViewArr[i12].getTag();
                        tag.getClass();
                        this.M[i11][i12].setChecked(q0Var.f57312b.contains(Integer.valueOf(((m0) tag).f32076b)));
                    } else {
                        checkedTextViewArr[i12].setChecked(false);
                    }
                    i12++;
                }
            }
        }
    }

    public final void b() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.f2295f;
        boolean zIsEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.f2293d;
        CheckedTextView checkedTextView2 = this.f2292c;
        if (zIsEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.M = new CheckedTextView[arrayList.size()][];
        boolean z11 = this.K && arrayList.size() > 1;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            u0 u0Var = (u0) arrayList.get(i11);
            boolean z12 = this.H && u0Var.f57365c;
            CheckedTextView[][] checkedTextViewArr = this.M;
            int i12 = u0Var.f57363a;
            checkedTextViewArr[i11] = new CheckedTextView[i12];
            m0[] m0VarArr = new m0[i12];
            for (int i13 = 0; i13 < u0Var.f57363a; i13++) {
                m0VarArr[i13] = new m0(u0Var, i13);
            }
            for (int i14 = 0; i14 < i12; i14++) {
                LayoutInflater layoutInflater = this.f2291b;
                if (i14 == 0) {
                    addView(layoutInflater.inflate(R.layout.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate((z12 || z11) ? android.R.layout.simple_list_item_multiple_choice : android.R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView3.setBackgroundResource(this.f2290a);
                k0 k0Var = this.L;
                m0 m0Var = m0VarArr[i14];
                checkedTextView3.setText(((b) k0Var).s(m0Var.f32075a.f57364b.f57307d[m0Var.f32076b]));
                checkedTextView3.setTag(m0VarArr[i14]);
                if (u0Var.a(i14)) {
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.f2294e);
                } else {
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                }
                this.M[i11][i14] = checkedTextView3;
                addView(checkedTextView3);
            }
        }
        a();
    }

    public boolean getIsDisabled() {
        return this.N;
    }

    public Map<p0, q0> getOverrides() {
        return this.f2296t;
    }

    public void setAllowAdaptiveSelections(boolean z11) {
        if (this.H != z11) {
            this.H = z11;
            b();
        }
    }

    public void setAllowMultipleOverrides(boolean z11) {
        if (this.K != z11) {
            this.K = z11;
            if (!z11) {
                HashMap map = this.f2296t;
                if (map.size() > 1) {
                    HashMap map2 = new HashMap();
                    int i11 = 0;
                    while (true) {
                        ArrayList arrayList = this.f2295f;
                        if (i11 >= arrayList.size()) {
                            break;
                        }
                        q0 q0Var = (q0) map.get(((u0) arrayList.get(i11)).f57364b);
                        if (q0Var != null && map2.isEmpty()) {
                            map2.put(q0Var.f57311a, q0Var);
                        }
                        i11++;
                    }
                    map.clear();
                    map.putAll(map2);
                }
            }
            b();
        }
    }

    public void setShowDisableOption(boolean z11) {
        this.f2292c.setVisibility(z11 ? 0 : 8);
    }

    public void setTrackNameProvider(k0 k0Var) {
        k0Var.getClass();
        this.L = k0Var;
        b();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f2290a = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f2291b = layoutInflaterFrom;
        l0 l0Var = new l0(this, 0);
        this.f2294e = l0Var;
        this.L = new b(getResources());
        this.f2295f = new ArrayList();
        this.f2296t = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(android.R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f2292c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(l0Var);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(android.R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f2293d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(l0Var);
        addView(checkedTextView2);
    }
}
