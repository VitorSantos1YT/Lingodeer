package rc;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.g2;
import com.lingodeer.R;
import fz.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.m;
import lz.g;
import ry.l;
import ry.n;
import ry.w;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f49078a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lc.d f49080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f49081d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f f49083f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f49082e = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f49084g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f49085h = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f49079b = new int[0];

    public d(lc.d dVar, List list, int i11, f fVar) {
        this.f49080c = dVar;
        this.f49081d = list;
        this.f49083f = fVar;
        this.f49078a = i11;
    }

    @Override // androidx.recyclerview.widget.b1
    public final int getItemCount() {
        return this.f49081d.size();
    }

    @Override // androidx.recyclerview.widget.b1
    public final void onBindViewHolder(g2 g2Var, int i11) {
        int iA0;
        e eVar = (e) g2Var;
        boolean z11 = !l.C(this.f49079b, i11);
        View itemView = eVar.itemView;
        m.b(itemView, "itemView");
        itemView.setEnabled(z11);
        AppCompatRadioButton appCompatRadioButton = eVar.f49086a;
        appCompatRadioButton.setEnabled(z11);
        TextView textView = eVar.f49087b;
        textView.setEnabled(z11);
        appCompatRadioButton.setChecked(this.f49078a == i11);
        textView.setText((CharSequence) this.f49081d.get(i11));
        View view = eVar.itemView;
        m.b(view, "holder.itemView");
        lc.d dVar = this.f49080c;
        Context context = dVar.getContext();
        m.b(context, "context");
        Drawable drawableD = vc.c.d(context, Integer.valueOf(R.attr.md_item_selector));
        if ((drawableD instanceof RippleDrawable) && (iA0 = ub.a.a0(dVar, Integer.valueOf(R.attr.md_ripple_color), null, 5)) != 0) {
            ((RippleDrawable) drawableD).setColor(ColorStateList.valueOf(iA0));
        }
        view.setBackground(drawableD);
        Typeface typeface = dVar.f39881d;
        if (typeface != null) {
            textView.setTypeface(typeface);
        }
    }

    @Override // androidx.recyclerview.widget.b1
    public final g2 onCreateViewHolder(ViewGroup viewGroup, int i11) {
        lc.d dVar = this.f49080c;
        Context context = dVar.O;
        Context context2 = dVar.O;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.md_listitem_singlechoice, viewGroup, false);
        if (viewInflate == null) {
            throw new TypeCastException("null cannot be cast to non-null type R");
        }
        e eVar = new e(viewInflate, this);
        vc.c.b(eVar.f49087b, context2, Integer.valueOf(R.attr.md_color_content), null);
        int[] iArr = {R.attr.md_color_widget, R.attr.md_color_widget_unchecked};
        TypedArray typedArrayObtainStyledAttributes = context2.getTheme().obtainStyledAttributes(iArr);
        try {
            g gVarV = l.V(iArr);
            ArrayList arrayList = new ArrayList(n.W(gVarV, 10));
            Iterator it = gVarV.iterator();
            while (((lz.f) it).f40537c) {
                int color = typedArrayObtainStyledAttributes.getColor(((w) it).nextInt(), 0);
                if (color == 0) {
                    color = 0;
                }
                arrayList.add(Integer.valueOf(color));
            }
            int[] iArrZ0 = ry.m.Z0(arrayList);
            typedArrayObtainStyledAttributes.recycle();
            int iC = this.f49084g;
            if (iC == -1) {
                iC = iArrZ0[0];
            }
            int iC2 = this.f49085h;
            if (iC2 == -1) {
                iC2 = iArrZ0[1];
            }
            if (iC == 0) {
                iC = vc.c.c(context2, null, Integer.valueOf(R.attr.colorControlActivated), null, 10);
            }
            int[][] iArr2 = {new int[]{-16842912, -16842908}, new int[]{android.R.attr.state_checked}, new int[]{android.R.attr.state_focused}};
            if (iC2 == 0) {
                iC2 = vc.c.c(context2, null, Integer.valueOf(R.attr.colorControlNormal), null, 10);
            }
            eVar.f49086a.setButtonTintList(new ColorStateList(iArr2, new int[]{iC2, iC, iC}));
            return eVar;
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @Override // androidx.recyclerview.widget.b1
    public final void onBindViewHolder(g2 g2Var, int i11, List list) {
        e eVar = (e) g2Var;
        AppCompatRadioButton appCompatRadioButton = eVar.f49086a;
        Object objS0 = ry.m.s0(list);
        if (m.a(objS0, a.f49075a)) {
            appCompatRadioButton.setChecked(true);
        } else if (m.a(objS0, a.f49076b)) {
            appCompatRadioButton.setChecked(false);
        } else {
            super.onBindViewHolder(eVar, i11, list);
        }
    }
}
